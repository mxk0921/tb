package com.alibaba.android.umbrella.link;

import com.alibaba.android.umbrella.link.export.UMDimKey;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliLogInterface;
import com.taobao.tao.messagekit.base.network.AccsConnection;
import java.io.Serializable;
import java.util.Map;
import java.util.Random;
import tb.jq0;
import tb.krg;
import tb.zxu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class TLogger {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Random f2391a = new Random();
    public static volatile AliLogInterface b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class LinkLogTLogDO implements Serializable {
        public String umb1;
        public String umb10;
        public String umb11;
        public String umb12;
        public String umb13;
        public String umb14;
        public String umb15;
        public String umb16;
        public String umb17;
        public String umb18;
        public String umb19;
        public String umb2;
        public Object umb20;
        public String umb21;
        public String umb22;
        public String umb23;
        public String umb24;
        public String umb25;
        public String umb26;
        public String umb27;
        public String umb28;
        public String umb29;
        public String umb3;
        public String umb30;
        public String umb31;
        public String umb32;
        public String umb33;
        public String umb34;
        public String umb35;
        public String umb4;
        public String umb5;
        public String umb6;
        public String umb7;
        public String umb8;
        public String umb9;
    }

    public static LinkLogTLogDO a(krg krgVar) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkLogTLogDO) ipChange.ipc$dispatch("923cf4c8", new Object[]{krgVar});
        }
        LinkLogTLogDO linkLogTLogDO = new LinkLogTLogDO();
        linkLogTLogDO.umb1 = krgVar.k();
        linkLogTLogDO.umb2 = krgVar.a();
        linkLogTLogDO.umb3 = krgVar.g();
        linkLogTLogDO.umb4 = krgVar.h();
        linkLogTLogDO.umb5 = krgVar.l();
        linkLogTLogDO.umb6 = krgVar.n();
        linkLogTLogDO.umb7 = krgVar.f();
        linkLogTLogDO.umb8 = krgVar.c();
        linkLogTLogDO.umb9 = krgVar.d();
        linkLogTLogDO.umb10 = String.valueOf(krgVar.i());
        linkLogTLogDO.umb11 = String.valueOf(krgVar.j());
        linkLogTLogDO.umb12 = krgVar.o();
        linkLogTLogDO.umb13 = krgVar.p();
        if (krgVar.e() == null) {
            obj = "";
        } else {
            obj = krgVar.e().b();
        }
        linkLogTLogDO.umb20 = obj;
        Map<UMDimKey, Object> b2 = krgVar.b();
        if (b2 == null) {
            return linkLogTLogDO;
        }
        linkLogTLogDO.umb21 = zxu.i(b2.get(UMDimKey.DIM_1));
        linkLogTLogDO.umb22 = zxu.i(b2.get(UMDimKey.DIM_2));
        linkLogTLogDO.umb23 = zxu.i(b2.get(UMDimKey.DIM_3));
        linkLogTLogDO.umb24 = zxu.i(b2.get(UMDimKey.DIM_4));
        linkLogTLogDO.umb25 = zxu.i(b2.get(UMDimKey.DIM_5));
        linkLogTLogDO.umb26 = zxu.i(b2.get(UMDimKey.DIM_6));
        linkLogTLogDO.umb27 = zxu.i(b2.get(UMDimKey.DIM_7));
        linkLogTLogDO.umb28 = zxu.i(b2.get(UMDimKey.DIM_8));
        linkLogTLogDO.umb29 = zxu.i(b2.get(UMDimKey.DIM_9));
        linkLogTLogDO.umb30 = zxu.i(b2.get(UMDimKey.DIM_10));
        linkLogTLogDO.umb31 = zxu.i(b2.get(UMDimKey.TAG_1));
        linkLogTLogDO.umb32 = zxu.i(b2.get(UMDimKey.TAG_2));
        linkLogTLogDO.umb33 = zxu.i(b2.get(UMDimKey.TAG_3));
        linkLogTLogDO.umb34 = zxu.i(b2.get(UMDimKey.TAG_4));
        linkLogTLogDO.umb35 = zxu.i(b2.get(UMDimKey.TAG_5));
        return linkLogTLogDO;
    }

    public static AliLogInterface b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliLogInterface) ipChange.ipc$dispatch("446cfec8", new Object[0]);
        }
        if (b == null) {
            synchronized (TLogger.class) {
                try {
                    if (b == null) {
                        b = jq0.c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public static void c(krg krgVar) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f42c4384", new Object[]{krgVar});
            return;
        }
        AliLogInterface b2 = b();
        if (b2 != null) {
            String i2 = zxu.i(a(krgVar));
            int nextInt = f2391a.nextInt(Integer.MAX_VALUE);
            int length = i2.length();
            if (length < 10240) {
                d(b2, krgVar, i2, nextInt, "-1");
                return;
            }
            int i3 = 0;
            while (i < length) {
                int i4 = i + AccsConnection.DATA_PACKAGE_MAX;
                d(b2, krgVar, i2.substring(i, Math.min(i4, length)), nextInt, String.valueOf(i3));
                i3++;
                i = i4;
            }
        }
    }

    public static void d(AliLogInterface aliLogInterface, krg krgVar, String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("511b6b98", new Object[]{aliLogInterface, krgVar, str, new Integer(i), str2});
            return;
        }
        aliLogInterface.a("umbrella", "umbrella", krgVar.k() + "↕︎" + krgVar.a() + "↕︎" + krgVar.f() + "↕︎" + i + "↕︎" + str2 + "↕︎" + str);
    }
}
