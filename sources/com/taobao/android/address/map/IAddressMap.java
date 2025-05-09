package com.taobao.android.address.map;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface IAddressMap {
    public static final String MAP_TYPE_AMAP = "amap";
    public static final String MAP_TYPE_GOOGLE_MAP = "google_map";
    public static final String MAP_TYPE_TEXTURE_AMAP = "texture_amap";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public @interface MapType {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f6300a;
        public double b = vu3.b.GEO_NOT_SUPPORT;
        public double c = vu3.b.GEO_NOT_SUPPORT;
        public double d = 17.0d;
        public double e = vu3.b.GEO_NOT_SUPPORT;
        public double f = vu3.b.GEO_NOT_SUPPORT;
        public int g = 1000;
        public float h = 0.0f;
        public double i = 0.5d;
        public double j = 0.5d;

        public a(String str) {
            this.f6300a = str;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface b {
        void onCancel();

        void onFinish();

        void onStart();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface c {
        void a();

        void b();

        void c();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface d {
        void onMapLoaded();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface e {
        void a();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface f {
        void onTouch(MotionEvent motionEvent);
    }

    boolean a();

    void b(c cVar);

    void c(a aVar, b bVar);

    void d(String str, b bVar);

    View e(Context context);

    void f(d dVar);

    boolean g();

    void h(f fVar);

    a i();

    boolean isInit();

    a j();

    boolean k();

    View l(Context context, a aVar, e eVar);

    void onDestroy();

    void onPause();

    void onResume();

    void onStart();

    void onStop();
}
