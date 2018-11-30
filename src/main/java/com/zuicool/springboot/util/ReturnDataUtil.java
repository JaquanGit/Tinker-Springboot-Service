package com.zuicool.springboot.util;

import com.zuicool.springboot.bean.result.Result;
import com.zuicool.springboot.bean.result.ReturnData;
import com.zuicool.springboot.bean.result.State;

public class ReturnDataUtil {

    public static ReturnData getReturnData(Object data) {
        ReturnData returnData = new ReturnData();

        Result result = new Result();
        result.setData(data);
        result.setState(new State());

        returnData.setResult(result);

        return returnData;
    }
}
