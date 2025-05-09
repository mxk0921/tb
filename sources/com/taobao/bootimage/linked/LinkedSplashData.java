package com.taobao.bootimage.linked;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.data.BootImageData;
import com.taobao.popupcenter.strategy.PopStrategy;
import java.io.Serializable;
import java.util.Arrays;
import tb.pbq;
import tb.rr6;
import tb.t2o;
import tb.tm1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class LinkedSplashData implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "LinkedSplashData";
    public static final String TYPE_FEEDS = "feeds";
    private JSONObject bizData;
    private final BootImageData data;
    private FeedsData feedsData;
    private pbq splashJson;
    private final JSONObject subSection;
    private final String traceId;

    static {
        t2o.a(736100453);
    }

    public LinkedSplashData(JSONObject jSONObject, String str, BootImageData bootImageData) {
        this.subSection = jSONObject;
        this.traceId = str;
        this.data = bootImageData;
        if (jSONObject != null) {
            try {
                this.splashJson = new pbq(jSONObject.getJSONObject(PopStrategy.IDENTIFIER_SPLASH));
                this.feedsData = new FeedsData(jSONObject.getJSONObject("feeds"));
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public JSONObject getBizData() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f2bc674e", new Object[]{this});
        }
        if (this.bizData == null) {
            try {
                JSONObject jSONObject2 = this.subSection;
                if (!(jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject(PopStrategy.IDENTIFIER_SPLASH)) == null)) {
                    this.bizData = jSONObject.getJSONObject("bizData");
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return this.bizData;
    }

    public BootImageData getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BootImageData) ipChange.ipc$dispatch("ab399fd1", new Object[]{this});
        }
        return this.data;
    }

    public FeedsData getFeedsData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FeedsData) ipChange.ipc$dispatch("2f673dbf", new Object[]{this});
        }
        return this.feedsData;
    }

    public JSONObject getLinkedData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2a0e524a", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return this.subSection.getJSONObject(str);
        } catch (Throwable th) {
            tm1.b(TAG, "getLinkedData" + str, th);
            return null;
        }
    }

    public String getLinkedDataType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("537820a6", new Object[]{this});
        }
        for (String str : Arrays.asList(rr6.TYPE_BANNER, rr6.TYPE_POPVIEW, "searchText", "feeds")) {
            if (this.subSection.getJSONObject(str) != null) {
                return str;
            }
        }
        return null;
    }

    public pbq getSplashJson() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pbq) ipChange.ipc$dispatch("1d1748cd", new Object[]{this});
        }
        return this.splashJson;
    }

    public JSONObject getSplashObj() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8cf4bd01", new Object[]{this});
        }
        return this.subSection.getJSONObject(PopStrategy.IDENTIFIER_SPLASH);
    }

    public JSONObject getSubSection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("73677aa2", new Object[]{this});
        }
        return this.subSection;
    }

    public String getTraceId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9afc202f", new Object[]{this});
        }
        return this.traceId;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "LinkedSplashData{type = " + getLinkedDataType() + ", traceId='" + this.traceId + "', data=" + this.data + ", splashJson=" + this.splashJson + ", feedsData=" + this.feedsData + '}';
    }
}
