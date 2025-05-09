package com.etao.feimagesearch.capture.tool;

import android.app.Activity;
import android.graphics.Bitmap;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.tool.base.CaptureManager;
import com.etao.feimagesearch.capture.tool.bottom.CaptureToolBottomWidget;
import com.etao.feimagesearch.capture.tool.camera.CameraWidget;
import com.etao.feimagesearch.struct.ViewWidget;
import com.taobao.android.address.themis.ThemisConfig;
import tb.ah1;
import tb.ckf;
import tb.clb;
import tb.g1a;
import tb.h73;
import tb.i73;
import tb.mld;
import tb.r73;
import tb.t2o;
import tb.xfw;
import tb.xhv;
import tb.z7m;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class CaptureToolRootWidget extends ViewWidget<FrameLayout, CaptureManager, CaptureToolRootWidget> implements clb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public volatile CaptureManager l;
    public final g1a<CaptureToolRootWidget, xhv> m;
    public final SparseArray<ah1> n = new SparseArray<>();
    public volatile int o;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                CaptureToolRootWidget.this.G();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements xfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.xfw
        public ViewGroup b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("ee7ef752", new Object[]{this, view});
            }
            ckf.g(view, "widgetView");
            FrameLayout X = CaptureToolRootWidget.this.X();
            if (X != null) {
                X.removeView(view);
            }
            return CaptureToolRootWidget.this.X();
        }

        @Override // tb.xfw
        public ViewGroup a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("24c47c91", new Object[]{this, view});
            }
            ckf.g(view, "widgetView");
            SparseArray i0 = CaptureToolRootWidget.i0(CaptureToolRootWidget.this);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            xhv xhvVar = xhv.INSTANCE;
            i0.put(0, new ah1(view, layoutParams));
            CaptureToolRootWidget.h0(CaptureToolRootWidget.this);
            return CaptureToolRootWidget.this.X();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements xfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.xfw
        public ViewGroup b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("ee7ef752", new Object[]{this, view});
            }
            ckf.g(view, "widgetView");
            FrameLayout X = CaptureToolRootWidget.this.X();
            if (X != null) {
                X.removeView(view);
            }
            return CaptureToolRootWidget.this.X();
        }

        @Override // tb.xfw
        public ViewGroup a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("24c47c91", new Object[]{this, view});
            }
            ckf.g(view, "widgetView");
            CaptureToolRootWidget.i0(CaptureToolRootWidget.this).put(2, new ah1(view, new FrameLayout.LayoutParams(-1, -1)));
            CaptureToolRootWidget.h0(CaptureToolRootWidget.this);
            return CaptureToolRootWidget.this.X();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class d implements xfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.xfw
        public ViewGroup b(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("ee7ef752", new Object[]{this, view});
            }
            ckf.g(view, "widgetView");
            FrameLayout X = CaptureToolRootWidget.this.X();
            if (X != null) {
                X.removeView(view);
            }
            return CaptureToolRootWidget.this.X();
        }

        @Override // tb.xfw
        public ViewGroup a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("24c47c91", new Object[]{this, view});
            }
            ckf.g(view, "widgetView");
            CaptureToolRootWidget.i0(CaptureToolRootWidget.this).put(1, new ah1(view, new FrameLayout.LayoutParams(-1, -1)));
            CaptureToolRootWidget.h0(CaptureToolRootWidget.this);
            return CaptureToolRootWidget.this.X();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Bitmap b;
        public final /* synthetic */ String c;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f4685a;
            public final /* synthetic */ String b;
            public final /* synthetic */ CaptureToolRootWidget c;

            public a(String str, String str2, CaptureToolRootWidget captureToolRootWidget) {
                this.f4685a = str;
                this.b = str2;
                this.c = captureToolRootWidget;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                h73 h73Var = h73.INSTANCE;
                String str = this.f4685a;
                String str2 = this.b;
                ckf.f(str2, "picPath");
                h73Var.d(str, str2, 0);
                this.c.E().finish();
            }
        }

        public e(Bitmap bitmap, String str) {
            this.b = bitmap;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            String k = mld.k(CaptureToolRootWidget.this.E(), this.b, 90);
            CaptureToolRootWidget captureToolRootWidget = CaptureToolRootWidget.this;
            captureToolRootWidget.e0(new a(this.c, k, captureToolRootWidget));
        }
    }

    static {
        t2o.a(481296738);
        t2o.a(481296827);
    }

    public static final /* synthetic */ void h0(CaptureToolRootWidget captureToolRootWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1db639", new Object[]{captureToolRootWidget});
        } else {
            captureToolRootWidget.k0();
        }
    }

    public static final /* synthetic */ SparseArray i0(CaptureToolRootWidget captureToolRootWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SparseArray) ipChange.ipc$dispatch("6ecc404c", new Object[]{captureToolRootWidget});
        }
        return captureToolRootWidget.n;
    }

    public static /* synthetic */ Object ipc$super(CaptureToolRootWidget captureToolRootWidget, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1794064906:
                super.M();
                return null;
            case 153113035:
                super.c0(objArr[0]);
                return null;
            case 731174045:
                super.L();
                return null;
            case 1250151579:
                super.G();
                return null;
            case 1585798659:
                super.q((String) objArr[0], objArr[1]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/tool/CaptureToolRootWidget");
        }
    }

    public static final /* synthetic */ void j0(CaptureToolRootWidget captureToolRootWidget, byte[] bArr, int i, int i2, int i3, boolean z, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d438b32d", new Object[]{captureToolRootWidget, bArr, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z), new Integer(i4)});
        } else {
            captureToolRootWidget.m0(bArr, i, i2, i3, z, i4);
        }
    }

    @Override // com.etao.feimagesearch.struct.ViewWidget, tb.vz
    public void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a83cc9b", new Object[]{this});
            return;
        }
        super.G();
        this.l.b().b(r73.EVENT_SHOW_CODE_ANCHOR_VIEW, this);
    }

    @Override // tb.vz
    public void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b94d49d", new Object[]{this});
        } else {
            super.L();
        }
    }

    @Override // tb.vz
    public void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9510bdf6", new Object[]{this});
        } else {
            super.M();
        }
    }

    @Override // tb.clb
    public void i(Bitmap bitmap, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e24a466", new Object[]{this, bitmap, new Boolean(z), new Boolean(z2)});
            return;
        }
        ckf.g(bitmap, "photo");
        String str = this.l.a().a().get("token");
        if (str == null || str.length() == 0) {
            E().finish();
        } else {
            z7m.c(new e(bitmap, str));
        }
    }

    public final void k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5ff69a3", new Object[]{this});
            return;
        }
        while (true) {
            ah1 ah1Var = this.n.get(this.o);
            if (ah1Var != null) {
                FrameLayout X = X();
                if (X != null) {
                    X.addView(ah1Var.b(), ah1Var.a());
                }
                this.n.remove(this.o);
                this.o++;
            } else {
                return;
            }
        }
    }

    /* renamed from: l0 */
    public FrameLayout b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("6075f6f2", new Object[]{this});
        }
        FrameLayout frameLayout = new FrameLayout(E());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setClipChildren(false);
        return frameLayout;
    }

    public final void m0(byte[] bArr, int i, int i2, int i3, boolean z, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0dd482d", new Object[]{this, bArr, new Integer(i), new Integer(i2), new Integer(i3), new Boolean(z), new Integer(i4)});
        }
    }

    /* renamed from: n0 */
    public void c0(CaptureToolRootWidget captureToolRootWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("853f7ed", new Object[]{this, captureToolRootWidget});
            return;
        }
        ckf.g(captureToolRootWidget, "widget");
        super.c0(captureToolRootWidget);
        this.m.invoke(captureToolRootWidget);
    }

    @Override // com.etao.feimagesearch.struct.ViewWidget, tb.v9e
    public void q(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e855e03", new Object[]{this, str, obj});
            return;
        }
        ckf.g(str, "action");
        super.q(str, obj);
        ckf.b(str, r73.EVENT_SHOW_CODE_ANCHOR_VIEW);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CaptureToolRootWidget(Activity activity, Object obj, CaptureManager captureManager, xfw xfwVar, g1a<? super CaptureToolRootWidget, xhv> g1aVar) {
        super(activity, obj, captureManager, xfwVar, false, false, 48, null);
        ckf.g(activity, "activity");
        ckf.g(captureManager, ThemisConfig.SCENE_MANAGER);
        ckf.g(xfwVar, "viewSetter");
        ckf.g(g1aVar, "onWidgetInitEndListener");
        this.l = captureManager;
        this.m = g1aVar;
        new CameraWidget(activity, this, this.l, new b(), new CaptureToolRootWidget$cameraWidget$2(this));
        new i73(activity, this, this.l, new d(), this);
        new CaptureToolBottomWidget(activity, this, this.l, new c());
        z7m.c(new a());
    }
}
