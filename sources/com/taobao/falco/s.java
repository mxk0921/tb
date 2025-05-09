package com.taobao.falco;

import tb.oz8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface s extends oz8 {
    public static final String MODULE = "falco_touch";
    public static final String SCENE = "touch";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final float f10478a;
        public final float b;

        public a(float f, float f2) {
            this.f10478a = f;
            this.b = f2;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface b {
        void onTouchActionSpan(s sVar);
    }

    String c();

    long g();

    String getFalcoId();

    String getPageName();

    long k();
}
