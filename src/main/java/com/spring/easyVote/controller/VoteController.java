package com.spring.easyVote.controller;

import com.spring.easyVote.service.VoteService;
import com.spring.easyVote.vo.VoteDataVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VoteController {

    @Autowired
    private VoteService voteService;

    @GetMapping("/voteList")
    public List<VoteDataVO> getVoteList() {
        return voteService.getVoteList();
    }
}
