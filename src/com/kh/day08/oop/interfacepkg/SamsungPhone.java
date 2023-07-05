package com.kh.day08.oop.interfacepkg;

public class SamsungPhone implements PhoneInterface{
// interface 상속 : implements
	// 1. The type PhoneInterface cannot be the superclass of SamsungPhone; a superclass must be a class
	// =>  extends -> implements
	// 2. The type SamsungPhone must implement the inherited abstract method PhoneInterface.receiveCall()
	// =>  오버라이딩 해야 함.

		@Override
		public void receiveCall() {
			System.out.println("여보세요 나야");
		}

		@Override
		public void sendCall() {
			System.out.println("거기 잘 지내니");
		}

		@Override
		public void printLogo() {
			System.out.println("===== samsung ====");
		} 
}
