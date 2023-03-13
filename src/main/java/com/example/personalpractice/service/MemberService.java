package com.example.personalpractice.service;

import com.example.personalpractice.mapper.MemberMapper;
import com.example.personalpractice.vo.MemberVO;
import org.apache.ibatis.javassist.compiler.ast.Member;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    MemberMapper memberMapper;

    public MemberService(MemberMapper memberMapper) {
        this.memberMapper = memberMapper;
    }

    public List<MemberVO> getMemberList() {
        return memberMapper.getMemberList();
    }

    public MemberVO getMember(int id) {
        return memberMapper.getMember(id);
    }

    public int createMember(MemberVO vo) {
        return memberMapper.createMember(vo);
    }

    public int updateMember(MemberVO vo) {
        return memberMapper.updateMember(vo);
    }

    public int deleteMember(int id) {
        return memberMapper.deleteMember(id);
    }
}
