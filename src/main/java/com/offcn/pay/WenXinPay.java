package com.offcn.pay;

import java.util.HashMap;
import java.util.Map;

public class WenXinPay {

    public String pay(String out_trade_no){
        System.out.println("wei信支付");
        return "success";
    }

    public Map query(String out_trade_no){
        Map map =new HashMap();
        return map;
    }


}
