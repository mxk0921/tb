package com.taobao.android.nnrruntime;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nnrruntime.Scene;
import tb.bzn;
import tb.l6h;
import tb.t2o;
import tb.u5h;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class OpenGLUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f9045a = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements u5h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f9046a;
        public final /* synthetic */ Runnable b;

        public a(Runnable runnable, Runnable runnable2) {
            this.f9046a = runnable;
            this.b = runnable2;
        }

        @Override // tb.u5h
        public void onLoadFinished(l6h l6hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3924ed3", new Object[]{this, l6hVar});
            } else if (l6hVar.i()) {
                try {
                    OpenGLUtils.f9045a = true;
                    Runnable runnable = this.f9046a;
                    if (runnable != null) {
                        runnable.run();
                    }
                } catch (Throwable unused) {
                    OpenGLUtils.f9045a = false;
                    Runnable runnable2 = this.b;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            } else {
                Log.e("NNRRuntime", "initNNR: Can't load nnrruntime.so");
                OpenGLUtils.f9045a = false;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements Scene.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final long f9047a;

        static {
            t2o.a(609222661);
            t2o.a(609222664);
        }

        public b(int i) {
            this.f9047a = OpenGLUtils.nativeCreateContext(i);
        }

        @Override // com.taobao.android.nnrruntime.Scene.a
        public long a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d3f5c690", new Object[]{this})).longValue();
            }
            return this.f9047a;
        }

        @Override // com.taobao.android.nnrruntime.Scene.a
        public void release() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            } else {
                OpenGLUtils.nativeReleaseContext(this.f9047a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c implements Scene.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final long f9048a;

        static {
            t2o.a(609222662);
            t2o.a(609222664);
        }

        public c() {
            if (OpenGLUtils.f9045a) {
                this.f9048a = OpenGLUtils.nativeCreateTarget();
            } else {
                this.f9048a = 0L;
            }
        }

        @Override // com.taobao.android.nnrruntime.Scene.a
        public long a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d3f5c690", new Object[]{this})).longValue();
            }
            return this.f9048a;
        }

        public void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6364c29a", new Object[]{this, new Integer(i)});
            } else if (OpenGLUtils.f9045a) {
                OpenGLUtils.nativeSetClearBit(this.f9048a, i);
            }
        }

        public void c(int i, int i2, int i3, int i4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6f3900ef", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            } else if (OpenGLUtils.f9045a) {
                OpenGLUtils.nativeSetViewport(this.f9048a, i, i2, i3, i4);
            }
        }

        @Override // com.taobao.android.nnrruntime.Scene.a
        public void release() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            } else if (OpenGLUtils.f9045a) {
                OpenGLUtils.nativeReleaseTarget(this.f9048a);
            }
        }
    }

    static {
        t2o.a(609222659);
    }

    public static Scene a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Scene) ipChange.ipc$dispatch("bd2e55c5", new Object[]{new Integer(i), str});
        }
        if (!f9045a) {
            return null;
        }
        return Scene.c(str, new b(i), new c());
    }

    public static void b(Runnable runnable, Runnable runnable2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b29f1005", new Object[]{runnable, runnable2});
        } else {
            bzn.d().a("nnrruntime", new a(runnable, runnable2));
        }
    }

    public static native long nativeCreateContext(int i);

    public static native long nativeCreateTarget();

    public static native void nativeReleaseContext(long j);

    public static native void nativeReleaseTarget(long j);

    public static native void nativeSetBackgroundColor(long j, float f, float f2, float f3, float f4);

    public static native void nativeSetClearBit(long j, int i);

    public static native void nativeSetDepthValue(long j, float f);

    public static native void nativeSetViewport(long j, int i, int i2, int i3, int i4);
}
