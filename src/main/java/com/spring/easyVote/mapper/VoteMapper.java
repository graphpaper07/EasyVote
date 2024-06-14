package com.spring.easyVote.mapper;

import com.spring.easyVote.vo.VoteDataVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface VoteMapper {
    List<VoteDataVO> getVoteList();
}
