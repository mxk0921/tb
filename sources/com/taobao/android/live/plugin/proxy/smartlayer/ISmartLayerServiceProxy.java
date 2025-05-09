package com.taobao.android.live.plugin.proxy.smartlayer;

import android.app.Activity;
import android.view.ViewGroup;
import com.taobao.android.live.plugin.proxy.IProxy;
import java.util.HashMap;
import tb.ub5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface ISmartLayerServiceProxy extends IProxy {
    public static final String KEY = "ISmartLayerServiceProxy";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface a {
        void a(ub5 ub5Var);

        void b(String str, HashMap<String, String> hashMap, HashMap<String, Object> hashMap2, Activity activity, Object obj, ViewGroup viewGroup, b bVar);

        void c(String str, HashMap<String, String> hashMap, HashMap<String, Object> hashMap2, Activity activity, ViewGroup viewGroup, b bVar);

        void i(HashMap<String, Object> hashMap, Activity activity, Object obj);

        void start();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface b {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface c {
        void e(Activity activity);

        void f(Activity activity);

        void l(Activity activity);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface d {
        void d(Object obj);

        void g(Object obj);

        void h(Object obj);

        void j(Object obj);

        void k(Object obj);
    }

    a getSmartLayerService();
}
