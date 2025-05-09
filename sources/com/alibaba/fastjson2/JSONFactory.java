package com.alibaba.fastjson2;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.writer.z1;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import tb.ggk;
import tb.jdk;
import tb.k2a;
import tb.ohh;
import tb.oij;
import tb.vu3;
import tb.wh6;
import tb.xfk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class JSONFactory {
    public static Class c;
    public static k2a d;
    public static final ObjectReaderProvider defaultObjectReaderProvider;
    public static final z1 defaultObjectWriterProvider;
    public static k2a e;
    public static Class f;
    public static volatile boolean g;
    public static final CacheItem[] q;
    public static final AtomicReferenceFieldUpdater<CacheItem, char[]> r;
    public static final AtomicReferenceFieldUpdater<CacheItem, byte[]> s;
    public static final jdk<JSONArray> t;
    public static final jdk<JSONObject> u;
    public static final char[] v;
    public static final byte[] w;

    /* renamed from: a  reason: collision with root package name */
    public static final oij[] f2450a = new oij[8192];
    public static final d[] b = new d[8192];
    public static final BigDecimal h = BigDecimal.valueOf(-9007199254740991L);
    public static final BigDecimal i = BigDecimal.valueOf(9007199254740991L);
    public static final BigInteger j = BigInteger.valueOf(-9007199254740991L);
    public static final BigInteger k = BigInteger.valueOf(9007199254740991L);
    public static final char[] l = {'A', 'B', 'C', ohh.LEVEL_D, ohh.LEVEL_E, 'F', 'G', 'H', ohh.LEVEL_I, 'J', 'K', ohh.LEVEL_L, 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', ohh.LEVEL_V, ohh.LEVEL_W, 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', wh6.DIR};
    public static final int[] m = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 0, 0, 0, 0, 0, 0, 10, 11, 12, 13, 14, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 11, 12, 13, 14, 15};
    public static final float[] n = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};
    public static final double[] o = {1.0d, 10.0d, 100.0d, 1000.0d, 10000.0d, 100000.0d, 1000000.0d, 1.0E7d, 1.0E8d, 1.0E9d, 1.0E10d, 1.0E11d, 1.0E12d, 1.0E13d, 1.0E14d, 1.0E15d, 1.0E16d, 1.0E17d, 1.0E18d, 1.0E19d, 1.0E20d, 1.0E21d, 1.0E22d};
    public static final Double p = Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class CacheItem {
        volatile byte[] bytes;
        volatile char[] chars;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b implements k2a {
        public b() {
        }

        @Override // tb.k2a
        public Object apply(Object obj) {
            return ((JSONObject) obj).getInnerMap();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class c implements k2a {
        public c() {
        }

        @Override // tb.k2a
        public Object apply(Object obj) {
            return new JSONObject((Map) obj);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final String f2451a;
        public final long b;
        public final long c;

        public d(String str, long j, long j2) {
            this.f2451a = str;
            this.b = j;
            this.c = j2;
        }
    }

    static {
        int i2;
        int i3;
        CacheItem[] cacheItemArr = new CacheItem[16];
        for (int i4 = 0; i4 < 16; i4++) {
            cacheItemArr[i4] = new CacheItem();
        }
        q = cacheItemArr;
        r = AtomicReferenceFieldUpdater.newUpdater(CacheItem.class, char[].class, "chars");
        s = AtomicReferenceFieldUpdater.newUpdater(CacheItem.class, byte[].class, "bytes");
        defaultObjectWriterProvider = new z1();
        defaultObjectReaderProvider = new ObjectReaderProvider();
        t = xfk.s;
        u = ggk.INSTANCE_OBJECT;
        v = new char[256];
        w = new byte[55];
        for (int i5 = 0; i5 < 256; i5++) {
            int i6 = (i5 >> 4) & 15;
            int i7 = i5 & 15;
            char[] cArr = v;
            if (i6 < 10) {
                i2 = i6 + 48;
            } else {
                i2 = i6 + 87;
            }
            int i8 = i2 << 8;
            if (i7 < 10) {
                i3 = i7 + 48;
            } else {
                i3 = i7 + 87;
            }
            cArr[i5] = (char) (i8 + i3);
        }
        for (char c2 = '0'; c2 <= '9'; c2 = (char) (c2 + 1)) {
            int i9 = c2 - '0';
            w[i9] = (byte) i9;
        }
        for (char c3 = 'a'; c3 <= 'f'; c3 = (char) (c3 + 1)) {
            w[c3 - '0'] = (byte) (c3 - 'W');
        }
        for (char c4 = 'A'; c4 <= 'F'; c4 = (char) (c4 + 1)) {
            w[c4 - '0'] = (byte) (c4 - '7');
        }
    }

    public static Map a(Map map) {
        return new JSONObject(map);
    }

    public static JSONReader.c b() {
        return new JSONReader.c(defaultObjectReaderProvider);
    }

    public static JSONReader.c c(long j2) {
        return new JSONReader.c(defaultObjectReaderProvider, j2);
    }

    public static JSONReader.c d(ObjectReaderProvider objectReaderProvider, JSONReader.Feature... featureArr) {
        if (objectReaderProvider == null) {
            objectReaderProvider = defaultObjectReaderProvider;
        }
        JSONReader.c cVar = new JSONReader.c(objectReaderProvider);
        cVar.b(featureArr);
        return cVar;
    }

    public static JSONReader.c e(JSONReader.Feature... featureArr) {
        return new JSONReader.c(defaultObjectReaderProvider, featureArr);
    }

    public static JSONWriter.a f() {
        return new JSONWriter.a(defaultObjectWriterProvider);
    }

    public static JSONWriter.a g(JSONWriter.Feature... featureArr) {
        return new JSONWriter.a(defaultObjectWriterProvider, featureArr);
    }

    public static k2a h() {
        if (d == null && !g && j() != null) {
            d = new c();
        }
        return d;
    }

    public static Class i() {
        if (f == null && !g) {
            try {
                f = JSONArray.class;
            } catch (Throwable unused) {
                g = true;
            }
        }
        return f;
    }

    public static Class j() {
        if (c == null && !g) {
            try {
                c = JSONObject.class;
            } catch (Throwable unused) {
                g = true;
            }
        }
        return c;
    }

    public static ObjectReaderProvider k() {
        return defaultObjectReaderProvider;
    }

    public static k2a l() {
        if (e == null && !g && j() != null) {
            e = new b();
        }
        return e;
    }
}
