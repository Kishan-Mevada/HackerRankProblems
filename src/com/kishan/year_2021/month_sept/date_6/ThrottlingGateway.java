package com.kishan.year_2021.month_sept.date_6;

/**
 * Throttling Gateway
 *
 * Non-critical requests for a transaction system are routed through a throttling gateway to ensure that the network is not choked by non-essential requests.
 *
 * The gateway has the following limits:
 *
 * * The number of transactions in any given second cannot exceed 3
 * * The number of transactions in any given 10-second period cannot exceed 20.
 * * The number of transactions in any given minute cannot exceed 60.
 */
public class ThrottlingGateway {
	static int droppedRequest(int[] requestsTime){
		int droppedRequest = 0;
		for(int i = 0; i < requestsTime.length; i++) {
			if( i > 2 && requestsTime[i] == requestsTime[i-3]){
				droppedRequest++;
			}
			else if(i > 19 && (requestsTime[i] - requestsTime[i-20]) < 10){
				droppedRequest++;
			}else if(i > 59 && (requestsTime[i] - requestsTime[i-60]) < 60){
				droppedRequest++;
			}
		}
		return droppedRequest;
	}
	public static void main(String[] args) {
		int[] requests = {1,1,1,1,2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,7,11,11,11,11};
		System.out.println("Dropped Request -> " + droppedRequest(requests));
	}
}
