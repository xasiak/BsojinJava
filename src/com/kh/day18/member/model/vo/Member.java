package com.kh.day18.member.model.vo;

public class Member {
	private String memberId;
	private String memberPW;
	private String memberName;
	private String memberEmail;
	private String memberPhone;
	
	public Member() {}

	public Member(String memberId, String memberPW) {
		super();
		this.memberId = memberId;
		this.memberPW = memberPW;
	}

	public Member(String memberId, String memberPW, String memberName, String memberEmail, String memberPhone) {
		super();
		this.memberId = memberId;
		this.memberPW = memberPW;
		this.memberName = memberName;
		this.memberEmail = memberEmail;
		this.memberPhone = memberPhone;
	}

	public Member(String memberPW, String memberEmail, String memberPhone) {
		super();
		this.memberPW = memberPW;
		this.memberEmail = memberEmail;
		this.memberPhone = memberPhone;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPW() {
		return memberPW;
	}

	public void setMemberPW(String memberPW) {
		this.memberPW = memberPW;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public String getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	@Override
	public String toString() {
		return "회원 [아이디=" + memberId + ", 비밀번호=" + memberPW + ", 이름=" + memberName
				+ ", 이메일=" + memberEmail + ", 전화번호=" + memberPhone + "]";
	}
	
	
}
