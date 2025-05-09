package com.taobao.android.external;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class UCPReachViewState implements Serializable {
    @JSONField(name = "bizTrackInfo")
    public JSONObject bizInfo;
    @JSONField(name = "errorCode")
    public int code;
    public JSONObject debugInfo;
    public String group;
    public String key;
    @JSONField(name = "errorMessage")
    public String msg;
    public JSONObject trackInfo;

    static {
        t2o.a(404750686);
    }
}
