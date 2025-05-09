package com.taobao.android.fcanvas.integration;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fcanvas.integration.FCanvasNativeInterface;
import com.taobao.android.fcanvas.integration.adapter.OnCanvasErrorListener;
import com.taobao.android.fcanvas.integration.b;
import com.taobao.android.fcanvas.integration.bridge.FCanvasJNIBridge;
import tb.now;
import tb.spk;
import tb.t2o;
import tb.u33;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class FCanvasInstance implements b.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FCanvasJNIBridge f7646a;
    public com.taobao.android.fcanvas.integration.b b;
    public RenderMode c;
    public final now d;
    public final FrameLayout e;
    public final FCanvasNativeInterface f;
    public final String g;
    public final FCanvas h;
    public final c i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public enum ContainerType {
        Unknown,
        Widget_1_0_Legacy,
        Widget_2_0_Legacy,
        Widget_3_0_Or_Weex,
        Widget_2_0,
        MiniApp,
        MiniGame;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ContainerType containerType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fcanvas/integration/FCanvasInstance$ContainerType");
        }

        public static ContainerType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ContainerType) ipChange.ipc$dispatch("ad199401", new Object[]{str});
            }
            return (ContainerType) Enum.valueOf(ContainerType.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public enum RenderMode {
        surface,
        texture;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(RenderMode renderMode, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fcanvas/integration/FCanvasInstance$RenderMode");
        }

        public static RenderMode valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RenderMode) ipChange.ipc$dispatch("f76e86e1", new Object[]{str});
            }
            return (RenderMode) Enum.valueOf(RenderMode.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public enum RenderType {
        canvas2D,
        webGL;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(RenderType renderType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fcanvas/integration/FCanvasInstance$RenderType");
        }

        public static RenderType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RenderType) ipChange.ipc$dispatch("f7d5e42a", new Object[]{str});
            }
            return (RenderType) Enum.valueOf(RenderType.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements spk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ spk f7647a;

        public a(spk spkVar) {
            this.f7647a = spkVar;
        }

        @Override // tb.spk
        public void a() {
            View canvasView;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("adb8aece", new Object[]{this});
                return;
            }
            if (!(FCanvasInstance.c(FCanvasInstance.this) == null || FCanvasInstance.e(FCanvasInstance.this) != RenderMode.surface || (canvasView = FCanvasInstance.c(FCanvasInstance.this).getCanvasView()) == null)) {
                canvasView.setAlpha(1.0f);
            }
            spk spkVar = this.f7647a;
            if (spkVar != null) {
                spkVar.a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final RenderMode f7649a;
        public final OnCanvasErrorListener b;
        public final spk c;
        public final int d;
        public final int e;
        public final float f;
        public final boolean g;
        public final boolean h;
        public final boolean i;
        public final ContainerType j;
        public final boolean k;
        public final boolean l;

        static {
            t2o.a(945815561);
        }

        public /* synthetic */ c(d dVar, a aVar) {
            this(dVar);
        }

        public static /* synthetic */ boolean a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6af16d04", new Object[]{cVar})).booleanValue();
            }
            return cVar.l;
        }

        public static /* synthetic */ ContainerType b(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ContainerType) ipChange.ipc$dispatch("b856f539", new Object[]{cVar});
            }
            return cVar.j;
        }

        public static /* synthetic */ boolean c(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7165610c", new Object[]{cVar})).booleanValue();
            }
            return cVar.k;
        }

        public int d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("89b7150f", new Object[]{this})).intValue();
            }
            return this.e;
        }

        public int e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("dd675e92", new Object[]{this})).intValue();
            }
            return this.d;
        }

        public float f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ad3722a7", new Object[]{this})).floatValue();
            }
            return this.f;
        }

        public spk g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (spk) ipChange.ipc$dispatch("f7eba5af", new Object[]{this});
            }
            return this.c;
        }

        public RenderMode h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RenderMode) ipChange.ipc$dispatch("8c70ed3e", new Object[]{this});
            }
            return this.f7649a;
        }

        public boolean i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3d0a1cbe", new Object[]{this})).booleanValue();
            }
            return this.g;
        }

        public boolean j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("add550bc", new Object[]{this})).booleanValue();
            }
            return this.h;
        }

        public boolean k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5d31d84", new Object[]{this})).booleanValue();
            }
            return this.i;
        }

        public c(d dVar) {
            this.l = false;
            this.f7649a = d.n(dVar) != null ? d.n(dVar) : RenderMode.texture;
            this.b = d.b(dVar);
            this.c = d.c(dVar);
            d.d(dVar);
            this.d = d.e(dVar);
            this.e = d.f(dVar);
            this.g = d.g(dVar);
            this.h = d.h(dVar);
            this.f = d.i(dVar);
            this.i = d.j(dVar);
            this.j = d.k(dVar);
            this.k = d.l(dVar);
            this.l = d.m(dVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public RenderMode f7650a;
        public boolean b;
        public OnCanvasErrorListener c;
        public spk d;
        public final int e;
        public final int f;
        public final float g;
        public boolean i;
        public boolean j;
        public ContainerType h = ContainerType.Unknown;
        public final boolean k = true;
        public boolean l = true;
        public boolean m = false;

        static {
            t2o.a(945815562);
        }

        public d(int i, int i2, float f) {
            this.e = Math.max(i, 0);
            this.f = Math.max(i2, 0);
            this.g = f;
        }

        public static /* synthetic */ OnCanvasErrorListener b(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (OnCanvasErrorListener) ipChange.ipc$dispatch("265636f9", new Object[]{dVar});
            }
            return dVar.c;
        }

        public static /* synthetic */ spk c(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (spk) ipChange.ipc$dispatch("7f55165c", new Object[]{dVar});
            }
            return dVar.d;
        }

        public static /* synthetic */ boolean d(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b4d5d828", new Object[]{dVar})).booleanValue();
            }
            return dVar.b;
        }

        public static /* synthetic */ int e(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("fcd53676", new Object[]{dVar})).intValue();
            }
            return dVar.e;
        }

        public static /* synthetic */ int f(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("44d494d5", new Object[]{dVar})).intValue();
            }
            return dVar.f;
        }

        public static /* synthetic */ boolean g(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8cd3f345", new Object[]{dVar})).booleanValue();
            }
            return dVar.i;
        }

        public static /* synthetic */ boolean h(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4d351a4", new Object[]{dVar})).booleanValue();
            }
            return dVar.j;
        }

        public static /* synthetic */ float i(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("1cd2afef", new Object[]{dVar})).floatValue();
            }
            return dVar.g;
        }

        public static /* synthetic */ boolean j(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("64d20e62", new Object[]{dVar})).booleanValue();
            }
            return dVar.k;
        }

        public static /* synthetic */ ContainerType k(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ContainerType) ipChange.ipc$dispatch("e72cb97d", new Object[]{dVar});
            }
            return dVar.h;
        }

        public static /* synthetic */ boolean l(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("dcc388eb", new Object[]{dVar})).booleanValue();
            }
            return dVar.l;
        }

        public static /* synthetic */ boolean m(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("24c2e74a", new Object[]{dVar})).booleanValue();
            }
            return dVar.m;
        }

        public static /* synthetic */ RenderMode n(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RenderMode) ipChange.ipc$dispatch("cc8293f4", new Object[]{dVar});
            }
            return dVar.f7650a;
        }

        public d a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("a92dd27a", new Object[]{this, new Boolean(z)});
            }
            this.j = z;
            return this;
        }

        public c o() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("16f4ab0a", new Object[]{this});
            }
            return new c(this, null);
        }

        public d p(ContainerType containerType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("57d40822", new Object[]{this, containerType});
            }
            this.h = containerType;
            return this;
        }

        public d q(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("6d471f8c", new Object[]{this, new Boolean(z)});
            }
            this.i = z;
            return this;
        }

        public d r(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("6dce5ccd", new Object[]{this, new Boolean(z)});
            }
            this.b = z;
            return this;
        }

        public d s(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("29e7e6c7", new Object[]{this, new Boolean(z)});
            }
            this.l = z;
            return this;
        }

        public d t(OnCanvasErrorListener onCanvasErrorListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("617ba711", new Object[]{this, onCanvasErrorListener});
            }
            this.c = onCanvasErrorListener;
            return this;
        }

        public d u(spk spkVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("61d686c1", new Object[]{this, spkVar});
            }
            this.d = spkVar;
            return this;
        }

        public d v(RenderMode renderMode) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("dd129414", new Object[]{this, renderMode});
            }
            this.f7650a = renderMode;
            return this;
        }

        public d w(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("96aa0cac", new Object[]{this, new Boolean(z)});
            }
            this.m = z;
            return this;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public boolean f7651a;
        public boolean b;

        static {
            t2o.a(945815564);
        }
    }

    static {
        t2o.a(945815558);
        t2o.a(945815575);
    }

    public FCanvasInstance(Context context, String str, String str2, c cVar, FCanvas fCanvas) {
        this.i = cVar;
        this.h = fCanvas;
        this.g = str;
        v(cVar.i(), cVar.f(), str2);
        FCanvasJNIBridge fCanvasJNIBridge = new FCanvasJNIBridge();
        this.f7646a = fCanvasJNIBridge;
        fCanvasJNIBridge.attachToNative(str);
        now b2 = now.b(fCanvasJNIBridge, c.a(cVar));
        this.d = b2;
        fCanvasJNIBridge.bindVsyncScheduler(b2);
        this.e = new FrameLayout(context);
        this.f = new FCanvasNativeInterface(fCanvasJNIBridge);
        if (cVar.j()) {
            j(c.b(cVar), cVar.e(), cVar.d());
        } else {
            k(c.b(cVar), cVar.e(), cVar.d());
        }
        w(context, cVar.h(), str, cVar.k());
        com.taobao.android.fcanvas.integration.b bVar = this.b;
        if (bVar != null) {
            View canvasView = bVar.getCanvasView();
            if (canvasView instanceof TextureView) {
                u33.a().c(str, (TextureView) canvasView);
            }
        } else {
            fCanvas.printLog(3, "create render surface failed", null);
        }
        FCanvasJNIBridge.setOnCanvasFirstFrameListener(str, new a(cVar.g()));
    }

    public static /* synthetic */ com.taobao.android.fcanvas.integration.b c(FCanvasInstance fCanvasInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.fcanvas.integration.b) ipChange.ipc$dispatch("ee702ef9", new Object[]{fCanvasInstance});
        }
        return fCanvasInstance.b;
    }

    public static /* synthetic */ com.taobao.android.fcanvas.integration.b d(FCanvasInstance fCanvasInstance, com.taobao.android.fcanvas.integration.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.fcanvas.integration.b) ipChange.ipc$dispatch("9accd2c0", new Object[]{fCanvasInstance, bVar});
        }
        fCanvasInstance.b = bVar;
        return bVar;
    }

    public static /* synthetic */ RenderMode e(FCanvasInstance fCanvasInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RenderMode) ipChange.ipc$dispatch("c94d7dd", new Object[]{fCanvasInstance});
        }
        return fCanvasInstance.c;
    }

    public static /* synthetic */ FrameLayout f(FCanvasInstance fCanvasInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("91fc8b23", new Object[]{fCanvasInstance});
        }
        return fCanvasInstance.e;
    }

    public static /* synthetic */ FCanvas g(FCanvasInstance fCanvasInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FCanvas) ipChange.ipc$dispatch("6790394f", new Object[]{fCanvasInstance});
        }
        return fCanvasInstance.h;
    }

    public static /* synthetic */ com.taobao.android.fcanvas.integration.b h(FCanvasInstance fCanvasInstance, Context context, RenderMode renderMode, RenderType renderType, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.fcanvas.integration.b) ipChange.ipc$dispatch("8ac2d32", new Object[]{fCanvasInstance, context, renderMode, renderType, new Boolean(z)});
        }
        return fCanvasInstance.x(context, renderMode, renderType, z);
    }

    public static /* synthetic */ String i(FCanvasInstance fCanvasInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ddf1d07", new Object[]{fCanvasInstance});
        }
        return fCanvasInstance.g;
    }

    @Deprecated
    public static void r(String str, Bitmap bitmap, FCanvasNativeInterface.ImageLoadCallback imageLoadCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("541209b1", new Object[]{str, bitmap, imageLoadCallback});
        }
    }

    @Override // com.taobao.android.fcanvas.integration.b.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c7b4c82", new Object[]{this});
            return;
        }
        now nowVar = this.d;
        if (nowVar != null) {
            nowVar.a();
        }
    }

    @Override // com.taobao.android.fcanvas.integration.b.a
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c99c6a73", new Object[]{this});
            return;
        }
        now nowVar = this.d;
        if (nowVar != null) {
            nowVar.c();
        }
    }

    public final void j(ContainerType containerType, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81d7f002", new Object[]{this, containerType, new Integer(i), new Integer(i2)});
        } else {
            this.f.createOffScreenCanvas(this.g, p(containerType), i, i2);
        }
    }

    public final void k(ContainerType containerType, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61c2f12a", new Object[]{this, containerType, new Integer(i), new Integer(i2)});
            return;
        }
        this.f.createOnScreenCanvas(this.g, p(containerType), i, i2);
        FCanvas fCanvas = this.h;
        fCanvas.printLog(0, "[FCanvasInstance] createOnScreenCanvas(" + i + "," + i2 + ") success. canvasId:" + this.g, null);
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        com.taobao.android.fcanvas.integration.b bVar = this.b;
        if (bVar != null) {
            bVar.detachFromRenderer();
        }
        now nowVar = this.d;
        if (nowVar != null) {
            nowVar.c();
        }
        this.b = null;
        this.f7646a.detachFromNativeAndReleaseResources(this.g);
        this.f7646a.clearCallbacks(this.g);
    }

    public View m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("260878dc", new Object[]{this});
        }
        return this.e;
    }

    public Bitmap n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("8d66d137", new Object[]{this});
        }
        if (this.f7646a == null || TextUtils.isEmpty(this.g)) {
            return null;
        }
        return this.f7646a.makeSnapshot(this.g);
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8fbfb16", new Object[]{this});
            return;
        }
        FCanvasJNIBridge fCanvasJNIBridge = this.f7646a;
        if (fCanvasJNIBridge != null) {
            fCanvasJNIBridge.notifyMemoryPressure(this.g);
        }
    }

    public final int p(ContainerType containerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d2d46ae6", new Object[]{this, containerType})).intValue();
        }
        if (containerType == null) {
            return 0;
        }
        if (containerType == ContainerType.Widget_1_0_Legacy) {
            return 1;
        }
        if (containerType == ContainerType.Widget_2_0_Legacy) {
            return 2;
        }
        if (containerType == ContainerType.Widget_2_0) {
            return 3;
        }
        if (containerType == ContainerType.MiniApp) {
            return 4;
        }
        if (containerType == ContainerType.Widget_3_0_Or_Weex) {
            return 5;
        }
        if (containerType == ContainerType.MiniGame) {
            return 6;
        }
        return 0;
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        now nowVar = this.d;
        if (nowVar != null) {
            nowVar.c();
        }
        this.f.pause();
    }

    public void s(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6bdccf3", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else if (!TextUtils.isEmpty(this.g)) {
            this.f.resizeCanvas(this.g, i, i2, i3, i4);
        }
    }

    public void setFixedFrameRate(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b3c7432", new Object[]{this, new Boolean(z)});
            return;
        }
        now nowVar = this.d;
        if (nowVar != null) {
            nowVar.d(z);
        }
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        now nowVar = this.d;
        if (nowVar != null) {
            nowVar.a();
        }
        this.f.resume();
    }

    public void u(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f105f1b", new Object[]{this, eVar});
            return;
        }
        FCanvasJNIBridge fCanvasJNIBridge = this.f7646a;
        if (fCanvasJNIBridge != null && eVar != null) {
            fCanvasJNIBridge.setProfileEnabled(this.g, eVar.f7651a, eVar.b);
        }
    }

    public final void v(boolean z, float f, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7096020", new Object[]{this, new Boolean(z), new Float(f), str});
            return;
        }
        int i = Build.VERSION.SDK_INT;
        if (str == null) {
            str = "";
        }
        FCanvasJNIBridge.nativeInitializeCanvasRuntime(f, z, i, str);
    }

    public final void w(Context context, RenderMode renderMode, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12a6ba79", new Object[]{this, context, renderMode, str, new Boolean(z)});
            return;
        }
        this.c = renderMode;
        com.taobao.android.fcanvas.integration.a aVar = new com.taobao.android.fcanvas.integration.a(this.f7646a, this.g);
        com.taobao.android.fcanvas.integration.b x = x(context, renderMode, RenderType.canvas2D, z);
        x.attachToRenderer(aVar);
        this.b = x;
        this.e.addView(x.getCanvasView());
        FCanvasJNIBridge.setOnCanvasTypeChangedListener(str, new b(str, context, renderMode, z, aVar));
    }

    public final com.taobao.android.fcanvas.integration.b x(Context context, RenderMode renderMode, RenderType renderType, boolean z) {
        com.taobao.android.fcanvas.integration.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.fcanvas.integration.b) ipChange.ipc$dispatch("3454bb09", new Object[]{this, context, renderMode, renderType, new Boolean(z)});
        }
        FCanvas fCanvas = this.h;
        if (renderMode == RenderMode.surface) {
            bVar = new FCanvasSurfaceView(context, fCanvas, false, c.c(this.i), renderType);
        } else {
            bVar = new FCanvasTextureView(context, fCanvas, renderType);
        }
        bVar.setLifecycleListener(this);
        if (bVar.getCanvasView() instanceof TextureView) {
            ((TextureView) bVar.getCanvasView()).setOpaque(z);
        }
        return bVar;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements FCanvasJNIBridge.OnCanvasTypeChangedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f7648a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ RenderMode c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ com.taobao.android.fcanvas.integration.a e;

        public b(String str, Context context, RenderMode renderMode, boolean z, com.taobao.android.fcanvas.integration.a aVar) {
            this.f7648a = str;
            this.b = context;
            this.c = renderMode;
            this.d = z;
            this.e = aVar;
        }

        @Override // com.taobao.android.fcanvas.integration.bridge.FCanvasJNIBridge.OnCanvasTypeChangedListener
        public void onCanvasTypeChanged(String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("46c2d980", new Object[]{this, str, new Boolean(z)});
            } else if (Looper.myLooper() == Looper.getMainLooper() && this.f7648a.equals(str) && z) {
                try {
                    if (FCanvasInstance.f(FCanvasInstance.this).getChildCount() > 0) {
                        FCanvasInstance.c(FCanvasInstance.this).detachFromRenderer();
                        FCanvasInstance.g(FCanvasInstance.this).printLog(1, "make new textureView and switch to webGL context", null);
                        FCanvasInstance fCanvasInstance = FCanvasInstance.this;
                        FCanvasInstance.d(fCanvasInstance, FCanvasInstance.h(fCanvasInstance, this.b, this.c, RenderType.webGL, this.d));
                        FCanvasInstance.c(FCanvasInstance.this).attachToRenderer(this.e);
                        FCanvasInstance.f(FCanvasInstance.this).removeAllViews();
                        FCanvasInstance.f(FCanvasInstance.this).addView(FCanvasInstance.c(FCanvasInstance.this).getCanvasView());
                        View canvasView = FCanvasInstance.c(FCanvasInstance.this).getCanvasView();
                        if (canvasView instanceof TextureView) {
                            u33.a().c(FCanvasInstance.i(FCanvasInstance.this), (TextureView) canvasView);
                        }
                    }
                } catch (Throwable th) {
                    FCanvasInstance.g(FCanvasInstance.this).printLog(3, "unable change to webGL mode", th);
                }
            }
        }
    }
}
