package org.fastcampus.student_management.domain;

public class CourseFee {

    private int fee;

    public CourseFee(int fee) {
        this.fee = fee;
    }

    public void changeFee(int fee) {
        checkFee(fee);
        this.fee = fee;
    }

    public void checkFee(int fee) {
        if (fee < 0) {
            throw new IllegalArgumentException("fee must be positive value");
        }
    }

    public int getFee() {
        return fee;
    }
}
