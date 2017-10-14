/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oct14_passFail;

/**
 *
 * @author J2EE-33
 */
public class PassFail {

    private int writtenNumber;
    private int evidenceNumber;
    private String pass = "Pass";
    private String fail = "fail";
    public Grade grade;

    public PassFail(int writtenNumber, int evidenceNumber) {
        this.writtenNumber = writtenNumber;
        this.evidenceNumber = evidenceNumber;
    }

    public int getWrittenNumber() {
        return writtenNumber;
    }

    public int getEvidenceNumber() {
        return evidenceNumber;
    }

    public String getPass() {
        return pass;
    }

    public String getFail() {
        return fail;
    }

    public String result() {
        String result;
        if (writtenNumber >= 70 && writtenNumber <= 100) {
            if (evidenceNumber >= 30 && evidenceNumber <= 50) {
                result = getPass();
            } else if (evidenceNumber > 50) {
                result = "Out of range, should be within 50";
            } else {
                result = getFail();
            }
        } else if (writtenNumber > 100) {
            result = "Out of range, should be within 100";
        } else {
            result = getFail();
        }
        return result;
    }

    public String resultGrade() {
        int total = getWrittenNumber() + getEvidenceNumber();
        String result;
        if (total >= 100 && total < 120) {
            result = "D";
        } else if (total >= 120 && total < 130) {
            result = "C";
        } else if (total >= 130 && total < 140) {
            result = "B";
        } else if (total >= 140 && total <= 150) {
            result = "A";
        } else {
            result = "F";
        }
        return result;
    }

}
