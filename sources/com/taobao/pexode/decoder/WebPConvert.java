package com.taobao.pexode.decoder;

import com.android.alibaba.ip.runtime.IpChange;
import tb.bzn;
import tb.l6h;
import tb.p0m;
import tb.t2o;
import tb.u5h;
import tb.xv8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class WebPConvert {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int MAX_RETRY_TIME = 2;
    private static boolean remoteSoValid;
    public static boolean sIsSoInstalled;
    private static int sRetryTime;

    public static /* synthetic */ int access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bcd6076a", new Object[0])).intValue();
        }
        return sRetryTime;
    }

    public static /* synthetic */ int access$008() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bd46c372", new Object[0])).intValue();
        }
        int i = sRetryTime;
        sRetryTime = i + 1;
        return i;
    }

    public static /* synthetic */ void access$100(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd2b2e82", new Object[]{str});
        } else {
            loadRemoteSo(str);
        }
    }

    public static native int nativeProcess(byte[] bArr, String str);

    public static native void nativeUseBugFix(boolean z);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements u5h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f11456a;

        public a(String str) {
            this.f11456a = str;
        }

        @Override // tb.u5h
        public void onLoadFinished(l6h l6hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3924ed3", new Object[]{this, l6hVar});
                return;
            }
            boolean z = l6hVar != null && l6hVar.i();
            WebPConvert.sIsSoInstalled = z;
            xv8.c(p0m.TAG, "load remote lib%s.so finish status=%b index=%d", this.f11456a, Boolean.valueOf(z), Integer.valueOf(WebPConvert.access$000()));
            if (!WebPConvert.sIsSoInstalled && WebPConvert.access$000() < 2) {
                WebPConvert.access$008();
                WebPConvert.access$100(this.f11456a);
            }
        }
    }

    static {
        t2o.a(618659870);
        try {
            IpChange ipChange = bzn.$ipChange;
            remoteSoValid = true;
        } catch (Throwable th) {
            xv8.c(p0m.TAG, "remote so module not import", th);
        }
        try {
            loadRemoteSo("dwebp");
        } catch (Throwable th2) {
            xv8.c(p0m.TAG, "system load lib%s.so error=%s", "WebPConvert", th2);
        }
    }

    private static void loadRemoteSo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba8840d9", new Object[]{str});
            return;
        }
        xv8.c(p0m.TAG, "start load remote lib%s.so status=%b index=%d remoteSoValid=%b", str, Boolean.valueOf(sIsSoInstalled), Integer.valueOf(sRetryTime), Boolean.valueOf(remoteSoValid));
        if (remoteSoValid) {
            bzn.d().a(str, new a(str));
            return;
        }
        System.loadLibrary("dwebp");
        sIsSoInstalled = true;
        xv8.f(p0m.TAG, "system load lib%s.so result=%b", "WebPConvert", Boolean.TRUE);
    }
}
