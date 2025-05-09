package com.taobao.weex;

import android.util.Log;
import android.view.Choreographer;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.WXErrorCode;
import com.taobao.weex.utils.WXLogUtils;
import java.lang.ref.WeakReference;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<c> f14136a;
    public final Choreographer b = Choreographer.getInstance();
    public final Choreographer.FrameCallback c = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Choreographer.FrameCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            c cVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f46aacbb", new Object[]{this, new Long(j)});
            } else if (e.a(e.this) != null && (cVar = (c) e.a(e.this).get()) != null) {
                try {
                    cVar.OnVSync();
                    e.c(e.this).postFrameCallback(e.b(e.this));
                } catch (UnsatisfiedLinkError e) {
                    if (cVar instanceof WXSDKInstance) {
                        ((WXSDKInstance) cVar).B0(WXErrorCode.WX_DEGRAD_ERR_INSTANCE_CREATE_FAILED.getErrorCode(), Log.getStackTraceString(e));
                    }
                } catch (Throwable th) {
                    WXLogUtils.e("weex1", th);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (e.a(e.this) != null && (cVar = (c) e.a(e.this).get()) != null) {
                try {
                    cVar.OnVSync();
                    WXSDKManager.getInstance().getWXRenderManager().postOnUiThread(e.d(e.this), 16L);
                } catch (UnsatisfiedLinkError e) {
                    if (cVar instanceof WXSDKInstance) {
                        ((WXSDKInstance) cVar).B0(WXErrorCode.WX_DEGRAD_ERR_INSTANCE_CREATE_FAILED.getErrorCode(), Log.getStackTraceString(e));
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface c {
        void OnVSync();
    }

    static {
        t2o.a(985661492);
    }

    public e(c cVar) {
        this.f14136a = new WeakReference<>(cVar);
    }

    public static /* synthetic */ WeakReference a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("7cfb8488", new Object[]{eVar});
        }
        return eVar.f14136a;
    }

    public static /* synthetic */ Choreographer.FrameCallback b(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Choreographer.FrameCallback) ipChange.ipc$dispatch("44f85add", new Object[]{eVar});
        }
        return eVar.c;
    }

    public static /* synthetic */ Choreographer c(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Choreographer) ipChange.ipc$dispatch("c9274d0a", new Object[]{eVar});
        }
        return eVar.b;
    }

    public static /* synthetic */ Runnable d(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("23c72037", new Object[]{eVar});
        }
        eVar.getClass();
        return null;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        Choreographer choreographer = this.b;
        if (choreographer != null) {
            choreographer.postFrameCallback(this.c);
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        Choreographer choreographer = this.b;
        if (choreographer != null) {
            choreographer.removeFrameCallback(this.c);
        }
    }
}
