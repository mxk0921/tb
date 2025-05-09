package com.taobao.tao.infoflow.multitab.viewprovider.tablayout;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import tb.ywc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface a extends ywc {
    public static final String KEY = "ITabLayoutProtocol";

    /* compiled from: Taobao */
    /* renamed from: com.taobao.tao.infoflow.multitab.viewprovider.tablayout.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface AbstractC0708a {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface b {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface c {
        void c();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface d {
        void b(int i);

        void onScrollStopped();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface e {
        void a(int i, JSONObject jSONObject, boolean z);

        void d(int i, JSONObject jSONObject);
    }

    View a(String str);

    void b(JSONObject jSONObject);

    void c(e eVar);

    boolean e();

    int[] f(String str);

    void g(String str, b bVar);

    void h(String str);

    void o();

    void p(int i, int i2);
}
