package tb;

import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class t5m {

    /* renamed from: a  reason: collision with root package name */
    public final wsi f28501a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f28502a;
        public final Number b;
        public final Number c;
        public final int d;
        public final int e;
        public final Object f;
        public final Object g;
        public final int h;
        public final int i;
        public final float j;
        public final float k;
        public final int l;
        public final int m;
        public final int n;
        public final int o;
        public final long p;

        static {
            t2o.a(945815740);
        }

        public a(int i, Number number, Number number2, int i2, int i3, Object obj, Object obj2, int i4, int i5, float f, float f2, int i6, int i7, int i8, int i9, long j) {
            this.f28502a = i;
            this.b = number;
            this.c = number2;
            this.d = i2;
            this.e = i3;
            this.f = obj;
            this.g = obj2;
            this.h = i4;
            this.i = i5;
            this.j = f;
            this.k = f2;
            this.l = i6;
            this.m = i7;
            this.n = i8;
            this.o = i9;
            this.p = j;
        }
    }

    static {
        t2o.a(945815737);
    }

    public t5m(ehv ehvVar) {
        this.f28501a = new wsi(ehvVar, "unicorn/platform_views", drf.INSTANCE);
    }

    public void a(int i, String str, Object obj) {
        HashMap hashMap = new HashMap();
        hashMap.put("viewId", Integer.valueOf(i));
        if (obj != null) {
            hashMap.put("arguments", obj);
        }
        this.f28501a.c(str, hashMap);
    }

    public static void b() {
    }
}
