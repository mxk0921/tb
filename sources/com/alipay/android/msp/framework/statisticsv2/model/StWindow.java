package com.alipay.android.msp.framework.statisticsv2.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class StWindow implements IModel {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NET_TYPE = "netType";
    public static final String STATUS = "status";
    public static final String UPDATE_TIME = "updateTime";
    public static final String UPDATE_TYPE = "updateType";
    public static final String WINDOW_TIME = "windowTime";
    public static final String WIN_NAME = "winName";

    /* renamed from: a  reason: collision with root package name */
    public final String f3670a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public StWindow(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f3670a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    @Override // com.alipay.android.msp.framework.statisticsv2.model.IModel
    public Map<String, String> toMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2dd9d11d", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put(WIN_NAME, this.f3670a);
        hashMap.put("netType", this.b);
        hashMap.put(UPDATE_TYPE, this.c);
        hashMap.put("status", this.d);
        hashMap.put(UPDATE_TIME, this.e);
        hashMap.put(WINDOW_TIME, this.f);
        return hashMap;
    }
}
