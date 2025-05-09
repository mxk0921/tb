package com.taobao.orange;

import android.content.Context;
import anetwork.channel.degrade.DegradableNetwork;
import com.taobao.orange.OConstant;
import com.taobao.orange.util.OLog;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import tb.h9b;
import tb.t2o;
import tb.tqr;
import tb.tzc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class a {
    public static volatile boolean A = false;
    public static volatile boolean B = false;
    public static OConstant.ENV C = null;
    public static String D = null;
    public static final Set<String> E;
    public static String F = null;
    public static final Set<String> G;
    public static final AtomicInteger H;
    public static volatile long I = 0;
    public static volatile long J = 0;
    public static volatile String K = null;
    public static volatile String L = null;
    public static int M = 0;
    public static final String TAG = "GlobalOrange";

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f11393a = false;
    public static volatile boolean b = true;
    public static volatile boolean c = false;
    public static volatile boolean d = false;
    public static volatile boolean e = false;
    public static final Class<? extends tzc> f;
    public static Context g;
    public static String h;
    public static String i;
    public static String j;
    public static String k;
    public static String l;
    public static String m;
    public static volatile String n;
    public static volatile String o;
    public static volatile String p;
    public static volatile int q;
    public static volatile Set<String> r;
    public static volatile OConstant.UPDMODE s;
    public static volatile int t;
    public static volatile boolean u;
    public static volatile int v;
    public static volatile String w;
    public static volatile String x;
    public static volatile boolean y;
    public static volatile boolean z;

    static {
        t2o.a(613416988);
        try {
            int i2 = DegradableNetwork.f1838a;
            f = tqr.class;
        } catch (ClassNotFoundException unused) {
            f = h9b.class;
            OLog.w(TAG, "init not found networksdk", new Object[0]);
        }
        h = "";
        i = "";
        j = "";
        k = "";
        l = "";
        m = "";
        p = "https";
        q = 3;
        r = Collections.synchronizedSet(new HashSet());
        s = OConstant.UPDMODE.O_XMD;
        t = 0;
        u = false;
        v = 0;
        w = "";
        x = "1200#3600#5";
        y = false;
        z = false;
        A = false;
        B = false;
        C = OConstant.ENV.ONLINE;
        E = Collections.synchronizedSet(new HashSet());
        G = Collections.synchronizedSet(new HashSet());
        H = new AtomicInteger(0);
        I = 0L;
        J = 0L;
        K = "";
        L = "";
        M = 1;
    }
}
