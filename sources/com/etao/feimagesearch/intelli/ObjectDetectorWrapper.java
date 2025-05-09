package com.etao.feimagesearch.intelli;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.intelli.realtime.a;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import tb.a07;
import tb.agh;
import tb.caa;
import tb.ckf;
import tb.fg0;
import tb.fzb;
import tb.lg4;
import tb.m09;
import tb.m2d;
import tb.mzu;
import tb.p73;
import tb.py1;
import tb.qu3;
import tb.t2o;
import tb.z4q;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ObjectDetectorWrapper extends py1 implements CaptureManager.c, ComponentCallbacks2 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "realtime_ObjectDetectorWrapper";
    public final CaptureManager e;
    public boolean f;
    public final b g;
    public Companion.ImageProcessStatus h = Companion.ImageProcessStatus.Idle;
    public final py1 i;
    public final com.etao.feimagesearch.intelli.realtime.a j;
    public m2d k;
    public final FrameLayout l;
    public fzb m;
    public static final Companion Companion = new Companion(null);
    public static final boolean n = lg4.B0();
    public static final int o = lg4.N2();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class Companion {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class ImageProcessStatus extends Enum<ImageProcessStatus> {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public static final ImageProcessStatus RealtimeSearch = new ImageProcessStatus("RealtimeSearch", 0);
            public static final ImageProcessStatus AutoDetect = new ImageProcessStatus("AutoDetect", 1);
            public static final ImageProcessStatus Idle = new ImageProcessStatus("Idle", 2);
            private static final /* synthetic */ ImageProcessStatus[] $VALUES = $values();

            private static final /* synthetic */ ImageProcessStatus[] $values() {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? (ImageProcessStatus[]) ipChange.ipc$dispatch("f9bee5d6", new Object[0]) : new ImageProcessStatus[]{RealtimeSearch, AutoDetect, Idle};
            }

            private ImageProcessStatus(String str, int i) {
            }

            public static /* synthetic */ Object ipc$super(ImageProcessStatus imageProcessStatus, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/intelli/ObjectDetectorWrapper$Companion$ImageProcessStatus");
            }

            public static ImageProcessStatus valueOf(String str) {
                Object valueOf;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    valueOf = ipChange.ipc$dispatch("c6e5a38b", new Object[]{str});
                } else {
                    valueOf = Enum.valueOf(ImageProcessStatus.class, str);
                }
                return (ImageProcessStatus) valueOf;
            }

            public static ImageProcessStatus[] values() {
                Object clone;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    clone = ipChange.ipc$dispatch("c2b7a37a", new Object[0]);
                } else {
                    clone = $VALUES.clone();
                }
                return (ImageProcessStatus[]) clone;
            }
        }

        static {
            t2o.a(730857634);
        }

        public /* synthetic */ Companion(a07 a07Var) {
            this();
        }

        public Companion() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            t2o.a(730857636);
            int[] iArr = new int[Companion.ImageProcessStatus.values().length];
            iArr[Companion.ImageProcessStatus.Idle.ordinal()] = 1;
            iArr[Companion.ImageProcessStatus.AutoDetect.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements a.f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.etao.feimagesearch.intelli.realtime.a.f
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1fb7f373", new Object[]{this});
                return;
            }
            agh.h(ObjectDetectorWrapper.TAG, "onBuildFailed");
            if (!ObjectDetectorWrapper.j(ObjectDetectorWrapper.this)) {
                ObjectDetectorWrapper.i(ObjectDetectorWrapper.this).Z(CaptureManager.RealtimeModelLoadListener.LoadState.BUILD_FAILED);
            }
        }

        @Override // com.etao.feimagesearch.intelli.realtime.a.f
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7982efbb", new Object[]{this});
                return;
            }
            agh.h(ObjectDetectorWrapper.TAG, "onBuildSuccess");
            if (!ObjectDetectorWrapper.j(ObjectDetectorWrapper.this)) {
                ObjectDetectorWrapper.i(ObjectDetectorWrapper.this).Z(CaptureManager.RealtimeModelLoadListener.LoadState.BUILD_SUCCESS);
            }
        }

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c156abbc", new Object[]{this});
            } else {
                ObjectDetectorWrapper.i(ObjectDetectorWrapper.this).Z(CaptureManager.RealtimeModelLoadListener.LoadState.DESTROYED);
            }
        }
    }

    static {
        t2o.a(730857633);
        t2o.a(481297497);
    }

    public ObjectDetectorWrapper(Context context, CaptureManager captureManager) {
        py1 py1Var;
        ckf.g(context, "context");
        ckf.g(captureManager, "captureManager");
        this.e = captureManager;
        b bVar = new b();
        this.g = bVar;
        if (captureManager.i()) {
            py1Var = new z4q(context, captureManager);
        } else {
            py1Var = new fg0(context, captureManager);
        }
        this.i = py1Var;
        this.j = new com.etao.feimagesearch.intelli.realtime.a(context, bVar, captureManager);
        this.k = py1Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.l = frameLayout;
        caa.c().registerComponentCallbacks(this);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.addView(py1Var.getRootView());
        captureManager.i0(this);
        e(captureManager.t(), captureManager.Q());
    }

    public static final /* synthetic */ CaptureManager i(ObjectDetectorWrapper objectDetectorWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CaptureManager) ipChange.ipc$dispatch("93569492", new Object[]{objectDetectorWrapper});
        }
        return objectDetectorWrapper.e;
    }

    public static /* synthetic */ Object ipc$super(ObjectDetectorWrapper objectDetectorWrapper, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -558272972) {
            super.resume();
            return null;
        } else if (hashCode == 1713617801) {
            super.stop();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/etao/feimagesearch/intelli/ObjectDetectorWrapper");
        }
    }

    public static final /* synthetic */ boolean j(ObjectDetectorWrapper objectDetectorWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b37cd47", new Object[]{objectDetectorWrapper})).booleanValue();
        }
        return objectDetectorWrapper.f;
    }

    @Override // tb.py1, tb.m2d
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dda5ecb", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.i.a(i, i2);
        this.j.a(i, i2);
    }

    @Override // tb.py1, tb.m2d
    public void b(byte[] bArr, boolean z, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b0130b9", new Object[]{this, bArr, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (!this.d && this.h != Companion.ImageProcessStatus.Idle) {
            this.k.b(bArr, z, i, i2, i3);
        }
    }

    @Override // tb.py1, tb.m2d
    public void c(fzb fzbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e62b543", new Object[]{this, fzbVar});
            return;
        }
        ckf.g(fzbVar, "flow");
        this.m = fzbVar;
        this.i.c(fzbVar);
        this.j.c(fzbVar);
    }

    @Override // tb.py1, tb.m2d
    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9175398", new Object[]{this, new Boolean(z)});
            return;
        }
        this.i.d(z);
        this.j.d(z);
    }

    @Override // tb.py1, tb.m2d
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        caa.c().unregisterComponentCallbacks(this);
        this.h = Companion.ImageProcessStatus.Idle;
        this.e.G0();
        this.i.destroy();
        if (!this.f) {
            this.j.destroy();
        }
    }

    @Override // tb.py1, tb.m2d
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7059d467", new Object[]{this});
        } else if (this.h == Companion.ImageProcessStatus.AutoDetect) {
            this.i.f();
        }
    }

    @Override // tb.py1, tb.m2d
    public qu3 g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qu3) ipChange.ipc$dispatch("3941f463", new Object[]{this});
        }
        return this.i.g();
    }

    @Override // tb.py1, tb.m2d
    public FrameLayout getRootView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("f5b37835", new Object[]{this});
        }
        return this.l;
    }

    public final void k(Companion.ImageProcessStatus imageProcessStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5ab6606", new Object[]{this, imageProcessStatus});
            return;
        }
        this.h = imageProcessStatus;
        int i = a.$EnumSwitchMapping$0[imageProcessStatus.ordinal()];
        if (i == 1) {
            return;
        }
        if (i != 2) {
            if (!ckf.b(this.k, this.j)) {
                this.l.removeAllViews();
                this.l.addView(this.j.getRootView());
                this.k = this.j;
            }
        } else if (!ckf.b(this.k, this.i)) {
            this.l.removeAllViews();
            this.l.addView(this.i.getRootView());
            this.k = this.i;
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
        } else {
            ckf.g(configuration, "newConfig");
        }
    }

    @Override // tb.py1, tb.m2d
    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        agh.h(TAG, "resume() called");
        super.resume();
        this.i.resume();
        this.j.resume();
    }

    @Override // tb.py1, tb.m2d
    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        agh.h(TAG, "stop() called");
        super.stop();
        this.i.stop();
        this.j.stop();
    }

    @Override // com.etao.feimagesearch.structure.capture.CaptureManager.c
    public void e(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a162d35", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        agh.h(TAG, "onTabChange nextTab: " + i + ", open: " + z);
        if (i == 0) {
            k(Companion.ImageProcessStatus.AutoDetect);
        } else if (i == 2) {
            k(Companion.ImageProcessStatus.Idle);
        } else if (z) {
            k(Companion.ImageProcessStatus.RealtimeSearch);
        } else {
            k(Companion.ImageProcessStatus.AutoDetect);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
            return;
        }
        mzu.n(p73.f25916a, "objectDetectorWrapperOnLowMemory", 19999, new String[0]);
        agh.r("AutoDetect", TAG, "objectDetectorWrapperOnLowMemory");
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c69db59a", new Object[]{this, new Integer(i)});
        } else if (n && i < o && !this.f && this.h != Companion.ImageProcessStatus.RealtimeSearch) {
            mzu.n(p73.f25916a, "killRealtimeSearch", 19999, m09.TASK_TYPE_LEVEL, String.valueOf(i));
            agh.r("AutoDetect", "killRealtimeSearch", String.valueOf(i));
            this.j.destroy();
            this.f = true;
            this.g.c();
        }
    }
}
