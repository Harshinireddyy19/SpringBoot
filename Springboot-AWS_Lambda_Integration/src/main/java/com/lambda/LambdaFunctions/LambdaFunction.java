package com.lambda.LambdaFunctions;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaFunction implements RequestHandler<Object, Object> {

	public Object handleRequest(Object input, Context context) {
		
		System.out.println("This is Namratha's Lambda Function");
		return null;
	}

}
