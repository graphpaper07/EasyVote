package com.spring.easyVote.service;

import com.spring.easyVote.vo.VoteDataVO;

import java.util.List;

public interface VoteService {
    List<VoteDataVO> getVoteList();
}
