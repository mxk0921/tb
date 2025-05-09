package com.taobao.bootimage.data;

import com.alibaba.fastjson.JSONObject;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class GatwaySplashRequest implements IMTOPDataObject {
    public String commonBizParams;
    public String containerParams;
    public int deviceScore;
    public double latitude;
    public double longitude;
    public String nick;
    public String oaid;
    public String screenHeight;
    public String screenWidth;
    public String sid;
    public String userId;
    public String utdid;
    public String API_NAME = "mtop.taobao.wireless.home.splash.awesome.get";
    public String VERSION = "1.0";
    public boolean NEED_ECODE = false;
    public boolean NEED_SESSION = true;
    public String extension = null;

    static {
        t2o.a(736100442);
        t2o.a(589299906);
    }

    public void setCommonBizParams(String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("deviceInfo", (Object) str);
        this.commonBizParams = jSONObject.toJSONString();
    }

    public void setContainerParams(String str, String str2, String str3, String str4, String str5) {
        this.containerParams = String.format("{\"splash_home_base\":{\"bizParams\":{\"oaid\":\"%s\",\"screenWidth\":\"%s\",\"screenHeight\":\"%s\",\"editionCode\":\"%s\",\"deviceLevel\":\"%s\"},\"requestType\":\"coldStart\"}}".replace("\\", ""), str, str2, str3, str4, str5);
    }
}
