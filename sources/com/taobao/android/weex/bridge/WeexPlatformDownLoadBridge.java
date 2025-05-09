package com.taobao.android.weex.bridge;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.biz.ChangeAppIconBridge;
import java.io.Serializable;
import tb.dwh;
import tb.gxh;
import tb.lu7;
import tb.mbj;
import tb.oqx;
import tb.rpc;
import tb.t2o;
import tb.t7x;
import tb.vvh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WeexPlatformDownLoadBridge implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements lu7 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f9914a;
        public final /* synthetic */ long b;
        public final /* synthetic */ long c;

        public a(long j, long j2, long j3) {
            this.f9914a = j;
            this.b = j2;
            this.c = j3;
        }

        @Override // tb.lu7
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb8b0117", new Object[]{this, str, str2});
            } else {
                WeexPlatformDownLoadBridge.DownloadFail(this.c, str, str2, this.b);
            }
        }

        @Override // tb.lu7
        public void b(rpc.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c8af2ef", new Object[]{this, cVar});
            } else {
                WeexPlatformDownLoadBridge.DownloadSuccess(this.f9914a, cVar.d(), cVar.h(), cVar.g(), this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements rpc.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f9915a;
        public final /* synthetic */ long b;
        public final /* synthetic */ long c;

        public b(long j, long j2, long j3) {
            this.f9915a = j;
            this.b = j2;
            this.c = j3;
        }

        @Override // tb.rpc.a
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb8b0117", new Object[]{this, str, str2});
            } else {
                WeexPlatformDownLoadBridge.DownloadFail(this.c, str, str2, this.b);
            }
        }

        @Override // tb.rpc.a
        public void b(rpc.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c8af2ef", new Object[]{this, cVar});
            } else {
                WeexPlatformDownLoadBridge.DownloadSuccess(this.f9915a, cVar.d(), cVar.h(), cVar.e(), this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f9916a;
        public final /* synthetic */ String[] b;

        public c(String str, String[] strArr) {
            this.f9916a = str;
            this.b = strArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            mbj.a(this.f9916a, this.b, vvh.h().get(ChangeAppIconBridge.KEY_DEVICEMODEL) + "," + vvh.h().get("ttid") + "&device=" + vvh.h().get(ChangeAppIconBridge.KEY_DEVICEMODEL) + "&platform=Android&sysversion=" + Build.VERSION.RELEASE);
        }
    }

    static {
        t2o.a(982515833);
    }

    public static void DownloadFail(long j, String str, String str2, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1de7a399", new Object[]{new Long(j), str, str2, new Long(j2)});
            return;
        }
        try {
            nativeDownloadFail(j, str, str2, j2);
        } catch (UnsatisfiedLinkError e) {
            dwh.i(e);
        }
    }

    public static void DownloadScript(String str, long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6406de0", new Object[]{str, new Long(j), new Long(j2), new Long(j3)});
        } else {
            downloadInternal(str, j, j2, j3);
        }
    }

    public static void DownloadSuccess(long j, byte[] bArr, boolean z, String str, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28fa5a6f", new Object[]{new Long(j), bArr, new Boolean(z), str, new Long(j2)});
            return;
        }
        try {
            nativeDownloadSuccess(j, bArr, z, str, j2);
        } catch (UnsatisfiedLinkError e) {
            dwh.i(e);
        }
    }

    public static boolean TryPreDownload(String str, long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac813867", new Object[]{str, new Long(j), new Long(j2), new Long(j3)})).booleanValue();
        }
        return t7x.f(str, new a(j2, j, j3));
    }

    private static void downloadInternal(String str, long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17955e4e", new Object[]{str, new Long(j), new Long(j2), new Long(j3)});
        } else {
            gxh.o().g(str, null, null, true, new com.taobao.android.weex_framework.c(str, str), new b(j2, j, j3));
        }
    }

    private static native void nativeDownloadFail(long j, String str, String str2, long j2);

    private static native void nativeDownloadSuccess(long j, byte[] bArr, boolean z, String str, long j2);

    public static void uploadFile(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc2db038", new Object[]{str, str2});
        }
    }

    public static void zipFile(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("337a4958", new Object[]{str, str2});
        } else {
            oqx.a(str, str2);
        }
    }
}
