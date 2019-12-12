package com.ibm.shopping.beans;

public class PaymentDetails {
	private int paymentId, userId, cardNo, cvv;

	public PaymentDetails() {
		
	}

	public PaymentDetails(int paymentId, int userId, int cardNo, int cvv) {
		this.paymentId = paymentId;
		this.userId = userId;
		this.cardNo = cardNo;
		this.cvv = cvv;
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getCardNo() {
		return cardNo;
	}

	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	
}
