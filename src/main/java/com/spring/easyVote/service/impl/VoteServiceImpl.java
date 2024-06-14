package com.spring.easyVote.service.impl;

import com.spring.easyVote.mapper.VoteMapper;
import com.spring.easyVote.service.VoteService;
import com.spring.easyVote.vo.VoteDataVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VoteServiceImpl implements VoteService {
    private final VoteMapper voteMapper;

    @Override
    public List<VoteDataVO> getVoteList() {
        return voteMapper.getVoteList();
    }
}
