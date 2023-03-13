package com.example.personalpractice.mapper;

import com.example.personalpractice.vo.MemberVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.javassist.compiler.ast.Member;

import java.util.List;

@Mapper
public interface MemberMapper {

    MemberVO getMember(int id);

    List<MemberVO> getMemberList();

    int createMember(MemberVO vo);

    int updateMember(MemberVO vo);

    int deleteMember(int id);
}
