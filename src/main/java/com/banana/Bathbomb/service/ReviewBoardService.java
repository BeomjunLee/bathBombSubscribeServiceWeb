package com.banana.Bathbomb.service;

import com.banana.Bathbomb.domain.ReviewBoard;
import com.banana.Bathbomb.repository.ReviewBoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewBoardService {
    private final ReviewBoardRepository reviewBoardRepository;

    /**
     * 리뷰게시판 글 쓰기 insert
     */
    public int insertBoard(ReviewBoard reviewBoard){
        return reviewBoardRepository.insert(reviewBoard);
    }

    /**
     * 리뷰게시판 글 리스트 찾기 select
     */
    public List<ReviewBoard> findBoardList(int startIndex, int pageSize){
        return reviewBoardRepository.selectAll(startIndex, pageSize);
    }

    /**
     * 리뷰게시판 글 리스트 (베스밤), (천연비누)
     */
    public List<ReviewBoard> findCategoryBoardList(String name, int startIndex, int pageSize){
        return reviewBoardRepository.selectItem(name, startIndex, pageSize);
    }

    /**
     * 리뷰게시판 글 읽기 select by uid
     */
    public ReviewBoard readBoard(int rvBoardUid){
        return reviewBoardRepository.selectByUid(rvBoardUid);
    }

    /**
     * 내가 쓴 리뷰 글 리스트
     */
    public List<ReviewBoard> myBoardList(int memberUid, int startIndex, int pageSize){
        return reviewBoardRepository.selectByMemberUid(memberUid, startIndex, pageSize);
    }

    /**
     * 홈베너 리뷰 3개
     */
    public List<ReviewBoard> homeBoardList(){
        return reviewBoardRepository.selectThreeReview();
    }

    /**
     * 리뷰 글 수정 update
     */
    public int updateBoard(ReviewBoard reviewBoard){
        return reviewBoardRepository.update(reviewBoard);
    }

    /**
     * 리뷰 글 삭제
     */
    public int deleteBoard(int rvBoardUid){
        return reviewBoardRepository.delete(rvBoardUid);
    }


    /**
     * 조회수 증가
     */
    public int updateViewCount(int rvBoardUId){
        return reviewBoardRepository.updateViewCount(rvBoardUId);
    }

    /**
     * 리뷰 게시판 총 글수
     */
    public int totalListCount(){
        return reviewBoardRepository.totalListCount();
    }

    /**
     * 특정카테고리 총 글수
     */
    public int totalListCount(String item){
        return reviewBoardRepository.totalListCount(item);
    }

    /**
     * 내그 쓴 리뷰 총 글수
     */
    public int totalMyListCount(int memberUid){
        return reviewBoardRepository.totalMyListCount(memberUid);
    }
}
