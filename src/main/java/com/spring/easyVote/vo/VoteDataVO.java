package com.spring.easyVote.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VoteDataVO {
    private String rgSeq;
    private String vtCtg;
    private String vtNm;
    private String vtCn;
    private String eno;
    private String pn;
    private String sttDtti;
    private String endDtti;
    private String wrtDtti;
    private String anonYn;
    private String dupYn;
    private String addOptYn;
    private String liveRsYn;
    private String vtPrgDc;
    private int totCnt;
}
