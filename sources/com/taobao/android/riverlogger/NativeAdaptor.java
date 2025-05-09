package com.taobao.android.riverlogger;

import com.android.alibaba.ip.runtime.IpChange;
import tb.g8q;
import tb.kcn;
import tb.lcn;
import tb.mcn;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class NativeAdaptor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements RVLRemoteConnectCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f9297a;

        public a(long j) {
            this.f9297a = j;
        }

        @Override // com.taobao.android.riverlogger.RVLRemoteConnectCallback
        public void finish(boolean z, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("db6055c4", new Object[]{this, new Boolean(z), str});
            } else {
                NativeAdaptor.access$000(this.f9297a, z, str);
            }
        }
    }

    static {
        t2o.a(649068546);
    }

    public static /* synthetic */ void access$000(long j, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c34e051", new Object[]{new Long(j), new Boolean(z), str});
        } else {
            onPlatformAPICallbackNative(j, z, str);
        }
    }

    public static void closeRemote() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c138de5", new Object[0]);
        } else {
            mcn.a();
        }
    }

    public static void log(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("508f0fac", new Object[]{new Integer(i), str, str2});
        } else {
            lcn.f(RVLLevel.valueOf(i, RVLLevel.Verbose), str, str2);
        }
    }

    public static void logInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, long j, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67b68b08", new Object[]{new Integer(i), str, str2, str3, str4, str5, str6, new Long(j), str7});
            return;
        }
        kcn kcnVar = new kcn(RVLLevel.valueOf(i, RVLLevel.Verbose), str, j);
        kcnVar.j = true;
        kcnVar.d(str2);
        kcnVar.c(str3);
        kcnVar.b(str4);
        if (kcnVar.e(str5)) {
            kcnVar.g = str6;
        }
        kcnVar.i = str7;
        lcn.h(kcnVar);
    }

    private static native void onPlatformAPICallbackNative(long j, boolean z, String str);

    public static void openPageRelatedRemote(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d908f231", new Object[]{str, str2, new Long(j)});
        } else {
            mcn.c(str, str2, wrapCallback(j));
        }
    }

    public static void openRemote(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f1b22d9", new Object[]{str, str2, new Long(j)});
        } else {
            mcn.d(str, str2, wrapCallback(j));
        }
    }

    public static void setLogLevel(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("addbd37a", new Object[]{new Integer(i)});
            return;
        }
        g8q.a();
        setLogLevelNative(i);
    }

    private static native void setLogLevelNative(int i);

    private static RVLRemoteConnectCallback wrapCallback(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RVLRemoteConnectCallback) ipChange.ipc$dispatch("f19d8cf8", new Object[]{new Long(j)});
        }
        if (j == 0) {
            return null;
        }
        return new a(j);
    }
}
