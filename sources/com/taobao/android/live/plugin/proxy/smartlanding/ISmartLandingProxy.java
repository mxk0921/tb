package com.taobao.android.live.plugin.proxy.smartlanding;

import android.content.Context;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.live.plugin.proxy.IProxy;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import java.util.HashMap;
import tb.wzc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface ISmartLandingProxy extends IProxy {
    public static final String KEY = "ISmartLandingProxy";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface a {
        void onSuccess();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface b {
        JSONObject a();

        void b(boolean z, String str, String str2, String str3, String str4, String str5, JSONObject jSONObject);

        void c(String str, String str2, boolean z, JSONObject jSONObject);

        void destroy();

        void e(TBLiveDataModel tBLiveDataModel, HashMap<String, String> hashMap);

        void f(String str, String str2);

        boolean g(String str, a aVar);

        boolean h();

        void i(String str, String str2, String str3, String str4, HashMap<String, String> hashMap);

        void j(boolean z, String str, d dVar);

        String k();

        void m(String str);

        void onExit();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface c {
        void destroy();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface d {
        boolean onTaskActionListener(String str, String str2, JSONObject jSONObject, JSONArray jSONArray, JSONObject jSONObject2);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface e {
        boolean a(Context context, String str, String str2, String str3, JSONObject jSONObject);

        void destroy();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface f {
        void d();

        void l();
    }

    b createSmartLanding(Context context, c cVar, e eVar);

    b createSmartLanding(Context context, String str, String str2, String str3, e eVar);

    b createSmartLanding(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, JSONObject jSONObject, e eVar);

    c createSmlDataManager(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, JSONObject jSONObject, wzc wzcVar);
}
