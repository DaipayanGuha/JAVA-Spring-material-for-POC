package com.cg.onlinebookstore.beans;

public class CustomResponse {
		private String errorMessage;
		private int statusCode;
		public CustomResponse() {
			super();
		}
		public CustomResponse(String errorMessage, int statusCode) {
			super();
			this.errorMessage = errorMessage;
			this.statusCode = statusCode;
		}
		public String getErrorMessage() {
			return errorMessage;
		}
		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}
		public int getStatusCode() {
			return statusCode;
		}
		public void setStatusCode(int statusCode) {
			this.statusCode = statusCode;
		}
		@Override
		public String toString() {
			return "CustomResponse [errorMessage=" + errorMessage + ", statusCode=" + statusCode + "]";
		}
}
