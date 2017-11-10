package jp.rough_diamond.e_yamane.study.aws;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Lambda implements RequestHandler<AdderType, Answer> {
	@Override
	public Answer handleRequest(AdderType input, Context context) {
		LambdaLogger logger = context.getLogger();
		long answer = input.getX() + input.getY();
		logger.log("input:" + input);
		Answer ret = new Answer(answer);
		logger.log("output:" + ret);
		return ret;
	}
}
