package com.ryf.model;

public class Grade {
    private Byte low;

    private Byte upp;

    private String rank;

    public Byte getLow() {
        return low;
    }

    public void setLow(Byte low) {
        this.low = low;
    }

    public Byte getUpp() {
        return upp;
    }

    public void setUpp(Byte upp) {
        this.upp = upp;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank == null ? null : rank.trim();
    }
}