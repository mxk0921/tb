package io.unicorn.plugin.platform;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexValue;
import io.unicorn.embedding.android.AndroidTouchProcessor;
import io.unicorn.embedding.android.UnicornImageReaderView;
import io.unicorn.embedding.android.UnicornView;
import io.unicorn.embedding.android.a;
import io.unicorn.embedding.engine.FlutterOverlaySurface;
import io.unicorn.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.unicorn.embedding.engine.mutatorsstack.UnicornMutatorView;
import io.unicorn.view.AccessibilityBridge;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import tb.dwh;
import tb.ehv;
import tb.exp;
import tb.f7l;
import tb.hs9;
import tb.ivu;
import tb.l5m;
import tb.lnt;
import tb.m5m;
import tb.n40;
import tb.o5m;
import tb.p5m;
import tb.s5m;
import tb.t2o;
import tb.t5m;
import tb.w4x;
import tb.ysi;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class PlatformViewsController implements s5m {
    public AndroidTouchProcessor b;
    public Context c;
    public UnicornView d;
    public lnt e;
    public t5m f;
    public int o = 0;
    public boolean p = false;
    public boolean u = false;

    /* renamed from: a  reason: collision with root package name */
    public final p5m f15211a = new p5m();
    public final n40 g = new n40();
    public final SparseArray<UnicornImageReaderView> m = new SparseArray<>();
    public final HashSet<Integer> q = new HashSet<>();
    public final HashSet<Integer> r = new HashSet<>();
    public final SparseArray<PlatformViewWrapper> n = new SparseArray<>();
    public final SparseArray<l5m> h = new SparseArray<>();
    public final HashMap<Class<? extends l5m>, exp> i = new HashMap<>();
    public final SparseArray<UnicornMutatorView> l = new SparseArray<>();
    public final SparseArray<l5m> j = new SparseArray<>();
    public final SparseArray<Boolean> k = new SparseArray<>();
    public final io.unicorn.embedding.android.a s = io.unicorn.embedding.android.a.a();
    public final ysi t = new ysi(this);
    public final boolean v = w4x.s("unicorn_fix_multiple_action", true, true);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public enum PlatformViewsMode {
        TextureDisplay,
        HybridComposting,
        PunchingDisplay,
        OverlayDisplay
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public enum UpdateType {
        UPDATE_TYPE_STYLES,
        UPDATE_TYPE_ATTRS,
        UPDATE_TYPE_EVENT
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PlatformViewsController.this.y(false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15213a;

        static {
            int[] iArr = new int[PlatformViewsMode.values().length];
            f15213a = iArr;
            try {
                iArr[PlatformViewsMode.TextureDisplay.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15213a[PlatformViewsMode.HybridComposting.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15213a[PlatformViewsMode.PunchingDisplay.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15213a[PlatformViewsMode.OverlayDisplay.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        t2o.a(945815814);
        t2o.a(945815813);
    }

    public static List<MotionEvent.PointerCoords> X(Object obj, float f, int i) {
        double[] dArr = (double[]) obj;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            int i3 = i2 * 9;
            pointerCoords.orientation = (float) dArr[i3];
            pointerCoords.pressure = (float) dArr[i3 + 1];
            pointerCoords.size = (float) dArr[i3 + 2];
            pointerCoords.toolMajor = ((float) dArr[i3 + 3]) * f;
            pointerCoords.toolMinor = ((float) dArr[i3 + 4]) * f;
            pointerCoords.touchMajor = ((float) dArr[i3 + 5]) * f;
            pointerCoords.touchMinor = ((float) dArr[i3 + 6]) * f;
            pointerCoords.x = ((float) dArr[i3 + 7]) * f;
            pointerCoords.y = ((float) dArr[i3 + 8]) * f;
            arrayList.add(pointerCoords);
        }
        return arrayList;
    }

    public static List<MotionEvent.PointerProperties> Y(Object obj, int i) {
        int[] iArr = (int[]) obj;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            int i3 = i2 * 2;
            pointerProperties.id = iArr[i3];
            pointerProperties.toolType = iArr[i3 + 1];
            arrayList.add(pointerProperties);
        }
        return arrayList;
    }

    public static boolean l0(int i) {
        if (i == 0 || i == 1) {
            return true;
        }
        return false;
    }

    public final float A() {
        return this.c.getResources().getDisplayMetrics().density;
    }

    public l5m B(int i) {
        l5m l5mVar = this.h.get(i);
        if (l5mVar == null) {
            return this.j.get(i);
        }
        return l5mVar;
    }

    public View C(int i) {
        l5m l5mVar = this.h.get(i);
        if (l5mVar == null) {
            l5mVar = this.j.get(i);
        }
        if (l5mVar == null) {
            return null;
        }
        return l5mVar.getView();
    }

    public o5m D() {
        return this.f15211a;
    }

    public void E(int i) {
        l5m l5mVar = this.h.get(i);
        if (l5mVar != null) {
            SparseArray<UnicornMutatorView> sparseArray = this.l;
            if (sparseArray.get(i) == null) {
                if (l5mVar.getView() == null) {
                    throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
                } else if (l5mVar.getView().getParent() == null) {
                    Context context = this.c;
                    UnicornMutatorView unicornMutatorView = new UnicornMutatorView(context, context.getResources().getDisplayMetrics().density, this.b);
                    sparseArray.put(i, unicornMutatorView);
                    unicornMutatorView.addView(l5mVar.getView());
                    this.d.addView(unicornMutatorView);
                } else {
                    throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
                }
            }
        } else {
            throw new IllegalStateException("Platform view hasn't been initialized from the platform view channel.");
        }
    }

    public void F(int i) {
        l5m l5mVar = this.j.get(i);
        if (l5mVar != null) {
            SparseArray<UnicornMutatorView> sparseArray = this.l;
            if (sparseArray.get(i) == null) {
                if (l5mVar.getView() == null) {
                    throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
                } else if (l5mVar.getView().getParent() == null) {
                    Context context = this.c;
                    UnicornMutatorView unicornMutatorView = new UnicornMutatorView(context, context.getResources().getDisplayMetrics().density, this.b);
                    sparseArray.put(i, unicornMutatorView);
                    unicornMutatorView.addView(l5mVar.getView());
                    if (this.k.get(i).booleanValue()) {
                        int childCount = this.d.getChildCount();
                        int i2 = 0;
                        for (int i3 = 0; i3 < childCount; i3++) {
                            if (this.d.getChildAt(i3) instanceof UnicornMutatorView) {
                                i2++;
                            }
                        }
                        this.d.addView(unicornMutatorView, i2);
                        return;
                    }
                    this.d.addView(unicornMutatorView);
                } else {
                    throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
                }
            }
        } else {
            throw new IllegalStateException("Platform view hasn't been initialized from the platform view channel.");
        }
    }

    public final void G() {
        if (!this.p) {
            this.d.convertToImageView();
            this.p = true;
        }
    }

    public void H() {
        int i = 0;
        while (true) {
            SparseArray<PlatformViewWrapper> sparseArray = this.n;
            if (i < sparseArray.size()) {
                sparseArray.valueAt(i).invalidateSurface();
                i++;
            } else {
                return;
            }
        }
    }

    public void I(int i, double d, double d2) {
        PlatformViewWrapper platformViewWrapper = this.n.get(i);
        if (platformViewWrapper == null) {
            Log.e("PlatformViewsController", "Setting offset for unknown platform view with id: " + i);
            return;
        }
        int j0 = j0(d);
        int j02 = j0(d2);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) platformViewWrapper.getLayoutParams();
        layoutParams.topMargin = j0;
        layoutParams.leftMargin = j02;
        platformViewWrapper.setLayoutParams(layoutParams);
    }

    public void J() {
        K(5);
    }

    public final void K(int i) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            SparseArray<l5m> sparseArray = this.h;
            if (i3 < sparseArray.size()) {
                Z(sparseArray.valueAt(i3), i);
                i3++;
            }
        }
        while (true) {
            SparseArray<l5m> sparseArray2 = this.j;
            if (i2 < sparseArray2.size()) {
                Z(sparseArray2.valueAt(i2), i);
                i2++;
            } else {
                return;
            }
        }
    }

    public void L() {
        this.u = false;
        K(3);
    }

    public void M() {
        this.u = true;
        K(2);
    }

    public void N() {
        K(1);
        int i = 0;
        while (true) {
            SparseArray<PlatformViewWrapper> sparseArray = this.n;
            if (i < sparseArray.size()) {
                sparseArray.valueAt(i).viewInvalidate();
                i++;
            } else {
                return;
            }
        }
    }

    public void O() {
        K(4);
    }

    public void Q() {
        this.q.clear();
        this.r.clear();
    }

    public void R() {
        z();
    }

    public void S(int i, int i2, int i3, int i4, int i5) {
        SparseArray<UnicornImageReaderView> sparseArray = this.m;
        if (sparseArray.get(i) != null) {
            G();
            UnicornImageReaderView unicornImageReaderView = sparseArray.get(i);
            if (unicornImageReaderView.getParent() == null) {
                this.d.addView(unicornImageReaderView);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, i5);
            layoutParams.leftMargin = i2;
            layoutParams.topMargin = i3;
            unicornImageReaderView.setLayoutParams(layoutParams);
            unicornImageReaderView.setVisibility(0);
            unicornImageReaderView.bringToFront();
            this.q.add(Integer.valueOf(i));
            return;
        }
        throw new IllegalStateException("The overlay surface (id:" + i + ") doesn't exist");
    }

    public void T(int i, int i2, int i3, int i4, int i5, int i6, int i7, FlutterMutatorsStack flutterMutatorsStack, int i8) {
        SparseArray<l5m> sparseArray = this.h;
        l5m l5mVar = sparseArray.get(i);
        HashSet<Integer> hashSet = this.r;
        SparseArray<UnicornMutatorView> sparseArray2 = this.l;
        if (l5mVar == null) {
            l5m l5mVar2 = this.j.get(i);
            if (l5mVar2 != null) {
                UnicornView unicornView = this.d;
                if (unicornView != null) {
                    unicornView.setRenderSurfaceOpaque(false);
                }
                F(i);
                UnicornMutatorView unicornMutatorView = sparseArray2.get(i);
                unicornMutatorView.readyToDisplay(flutterMutatorsStack, i2, i3, i4, i5);
                unicornMutatorView.setVisibility(0);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i6, i7);
                View view = l5mVar2.getView();
                if (view != null) {
                    view.setLayoutParams(layoutParams);
                    view.bringToFront();
                }
                if (i8 > 0) {
                    hashSet.add(Integer.valueOf(i));
                    return;
                }
                return;
            }
            return;
        }
        PlatformViewWrapper platformViewWrapper = this.n.get(i);
        if (platformViewWrapper != null) {
            platformViewWrapper.tryToFinishToTexture(i8);
            platformViewWrapper.readyToDisplay(flutterMutatorsStack, i2, i3, i4, i5);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i6, i7);
            View view2 = l5mVar.getView();
            if (view2 != null) {
                view2.setLayoutParams(layoutParams2);
                view2.bringToFront();
                return;
            }
            return;
        }
        G();
        E(i);
        UnicornMutatorView unicornMutatorView2 = sparseArray2.get(i);
        unicornMutatorView2.readyToDisplay(flutterMutatorsStack, i2, i3, i4, i5);
        unicornMutatorView2.setVisibility(0);
        unicornMutatorView2.bringToFront();
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(i6, i7);
        View view3 = sparseArray.get(i).getView();
        if (view3 != null) {
            view3.setLayoutParams(layoutParams3);
            view3.bringToFront();
        }
        hashSet.add(Integer.valueOf(i));
    }

    public void U() {
        boolean z = false;
        if (!this.p || !this.r.isEmpty()) {
            if (this.p && this.d.acquireLatestImageViewFrame()) {
                z = true;
            }
            y(z);
            return;
        }
        this.p = false;
        this.d.revertImageView(new a());
    }

    public void V() {
        z();
    }

    public void W(t5m.a aVar) {
        try {
            int i = aVar.f28502a;
            float f = this.c.getResources().getDisplayMetrics().density;
            x(20);
            SparseArray<l5m> sparseArray = this.h;
            l5m l5mVar = sparseArray.get(i);
            int i2 = aVar.f28502a;
            if (l5mVar != null) {
                MotionEvent i0 = i0(f, aVar, false);
                if (i0 == null) {
                    Log.e("PlatformView", "MotionEvent is null");
                    return;
                }
                View view = sparseArray.get(i2).getView();
                if (view != null) {
                    view.dispatchTouchEvent(i0);
                    return;
                }
                return;
            }
            SparseArray<l5m> sparseArray2 = this.j;
            if (sparseArray2.get(i) != null) {
                MotionEvent i02 = i0(f, aVar, false);
                View view2 = sparseArray2.get(i2).getView();
                if (view2 != null) {
                    view2.dispatchTouchEvent(i02);
                    return;
                }
                return;
            }
            Log.e("PlatformView", "Sending touch to an unknown view with id:" + i);
        } catch (Exception e) {
            dwh.h("PlatformView", e);
        }
    }

    public final void Z(l5m l5mVar, int i) {
        if (i == 1) {
            l5mVar.onActivityStart();
        } else if (i == 2) {
            l5mVar.onActivityResume();
        } else if (i == 3) {
            l5mVar.onActivityPause();
        } else if (i == 4) {
            l5mVar.onActivityStop();
        } else if (i == 5) {
            l5mVar.onActivityDestroy();
        }
    }

    public WeexValue a(int i, String str, WeexValue[] weexValueArr) {
        l5m l5mVar = this.h.get(i);
        if (l5mVar == null) {
            l5mVar = this.j.get(i);
        }
        WeexValue weexValue = null;
        if (l5mVar == null) {
            return null;
        }
        try {
            weexValue = ((WeexPlatformView) l5mVar).CallUINodeMethod(str, weexValueArr);
        } catch (Exception e) {
            dwh.h("PlatformViewsController", e);
        }
        if ("scroll".equals(str)) {
            f0(i);
        }
        return weexValue;
    }

    public final void b0() {
        if (this.d == null) {
            Log.e("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
            return;
        }
        int i = 0;
        while (true) {
            SparseArray<UnicornImageReaderView> sparseArray = this.m;
            if (i < sparseArray.size()) {
                this.d.removeView(sparseArray.valueAt(i));
                i++;
            } else {
                sparseArray.clear();
                return;
            }
        }
    }

    public void c(Context context, lnt lntVar, ehv ehvVar) {
        if (this.c == null) {
            this.c = context;
            this.e = lntVar;
            t5m t5mVar = new t5m(ehvVar);
            this.f = t5mVar;
            this.t.n(t5mVar);
            return;
        }
        throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
    }

    public int c0(int i, double d, double d2) {
        l5m l5mVar = this.h.get(i);
        PlatformViewWrapper platformViewWrapper = this.n.get(i);
        if (platformViewWrapper == null || l5mVar == null) {
            Log.e("PlatformViewsController", "Resizing unknown platform view with id: " + i);
            return 0;
        }
        int j0 = j0(d);
        int j02 = j0(d2);
        if (j0 > platformViewWrapper.getBufferWidth() || j02 > platformViewWrapper.getBufferHeight()) {
            platformViewWrapper.setBufferSize(j0, j02);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) platformViewWrapper.getLayoutParams();
        layoutParams.width = j0;
        layoutParams.height = j02;
        platformViewWrapper.setLayoutParams(layoutParams);
        View view = l5mVar.getView();
        if (view != null) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            layoutParams2.width = j0;
            layoutParams2.height = j02;
            view.setLayoutParams(layoutParams2);
        }
        return ((h0(platformViewWrapper.getBufferWidth()) & 65535) << 16) | (h0(platformViewWrapper.getBufferHeight()) & 65535);
    }

    public void d(AccessibilityBridge accessibilityBridge) {
        this.g.b(accessibilityBridge);
    }

    public int d0(int i, int i2, double d, double d2) {
        if (PlatformViewsMode.values()[i2] == PlatformViewsMode.TextureDisplay) {
            return c0(i, d, d2);
        }
        return 0;
    }

    public void e(hs9 hs9Var) {
        this.b = new AndroidTouchProcessor(hs9Var, true);
    }

    public void e0(WeexInstance weexInstance) {
        this.t.o(weexInstance);
    }

    public void f(UnicornView unicornView) {
        this.d = unicornView;
        int i = 0;
        while (true) {
            SparseArray<l5m> sparseArray = this.h;
            if (i < sparseArray.size()) {
                sparseArray.valueAt(i).onFlutterViewAttached(this.d);
                i++;
            } else {
                return;
            }
        }
    }

    public void f0(int i) {
        PlatformViewWrapper platformViewWrapper = this.n.get(i);
        if (platformViewWrapper != null && platformViewWrapper.isCanAutoSwitch()) {
            platformViewWrapper.switchToPunching();
        }
    }

    public final void g(l5m l5mVar) {
        if (this.u) {
            Z(l5mVar, 1);
            Z(l5mVar, 2);
        }
    }

    public void g0(int i) {
        PlatformViewWrapper platformViewWrapper = this.n.get(i);
        if (platformViewWrapper != null && platformViewWrapper.isCanAutoSwitch()) {
            platformViewWrapper.switchToTexture();
        }
    }

    public long h(String str, int i, int i2, HashMap<String, String> hashMap, HashMap<String, String> hashMap2, HashSet<String> hashSet) {
        x(19);
        if (l0(i2)) {
            l5m m = m(str, i, hashMap, hashMap2, hashSet);
            m.getView().setLayoutDirection(i2);
            this.h.put(i, m);
            g(m);
            return -1L;
        }
        throw new IllegalStateException("Trying to create a view with unknown direction value: " + i2 + "(view id: " + i + f7l.BRACKET_END_STR);
    }

    public final int h0(double d) {
        return (int) Math.round(d / A());
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long i(java.lang.String r23, int r24, int r25, java.util.HashMap<java.lang.String, java.lang.String> r26, java.util.HashMap<java.lang.String, java.lang.String> r27, java.util.HashSet<java.lang.String> r28) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.unicorn.plugin.platform.PlatformViewsController.i(java.lang.String, int, int, java.util.HashMap, java.util.HashMap, java.util.HashSet):long");
    }

    public MotionEvent i0(float f, t5m.a aVar, boolean z) {
        int action;
        MotionEvent b2 = this.s.b(a.C0856a.c(aVar.p));
        Object obj = aVar.f;
        int i = aVar.e;
        MotionEvent.PointerProperties[] pointerPropertiesArr = (MotionEvent.PointerProperties[]) ((ArrayList) Y(obj, i)).toArray(new MotionEvent.PointerProperties[i]);
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) ((ArrayList) X(aVar.g, f, i)).toArray(new MotionEvent.PointerCoords[i]);
        if (z || b2 == null) {
            return MotionEvent.obtain(aVar.b.longValue(), aVar.c.longValue(), aVar.d, aVar.e, pointerPropertiesArr, pointerCoordsArr, aVar.h, aVar.i, aVar.j, aVar.k, aVar.l, aVar.m, aVar.n, aVar.o);
        }
        long downTime = b2.getDownTime();
        long eventTime = b2.getEventTime();
        if (this.v) {
            action = aVar.d;
        } else {
            action = b2.getAction();
        }
        return MotionEvent.obtain(downTime, eventTime, action, aVar.e, pointerPropertiesArr, pointerCoordsArr, b2.getMetaState(), b2.getButtonState(), b2.getXPrecision(), b2.getYPrecision(), b2.getDeviceId(), b2.getEdgeFlags(), b2.getSource(), b2.getFlags());
    }

    public FlutterOverlaySurface j() {
        return k(new UnicornImageReaderView(this.d.getContext(), this.d.getWidth(), this.d.getHeight(), UnicornImageReaderView.SurfaceKind.overlay));
    }

    public final int j0(double d) {
        return (int) Math.round(d * A());
    }

    public FlutterOverlaySurface k(UnicornImageReaderView unicornImageReaderView) {
        int i = this.o;
        this.o = i + 1;
        this.m.put(i, unicornImageReaderView);
        return new FlutterOverlaySurface(i, unicornImageReaderView.getSurface());
    }

    public void k0(int i, HashMap<String, String> hashMap, int i2) {
        UpdateType updateType = UpdateType.values()[i2];
        l5m l5mVar = this.h.get(i);
        if (l5mVar == null) {
            l5mVar = this.j.get(i);
        }
        if (l5mVar != null) {
            try {
                if (l5mVar instanceof WeexPlatformView) {
                    WeexPlatformView weexPlatformView = (WeexPlatformView) l5mVar;
                    if (updateType == UpdateType.UPDATE_TYPE_ATTRS) {
                        weexPlatformView.onUpdateAttrs(hashMap);
                    } else if (updateType == UpdateType.UPDATE_TYPE_STYLES) {
                        weexPlatformView.onUpdateStyles(hashMap);
                    } else if (updateType == UpdateType.UPDATE_TYPE_EVENT) {
                        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                            if ("0".equals(entry.getValue())) {
                                weexPlatformView.onRemoveEvent(entry.getKey());
                            } else {
                                weexPlatformView.onAddEvent(entry.getKey());
                            }
                        }
                    }
                } else if (updateType != UpdateType.UPDATE_TYPE_EVENT) {
                    l5mVar.onUpdateAttrs(hashMap);
                }
            } catch (Exception e) {
                dwh.h("PlatformViewsController", e);
            }
        }
    }

    public long l(String str, int i, int i2, HashMap<String, String> hashMap, HashMap<String, String> hashMap2, HashSet<String> hashSet) {
        int i3 = b.f15213a[PlatformViewsMode.values()[i2].ordinal()];
        if (i3 == 1) {
            return i(str, i, 0, hashMap, hashMap2, hashSet);
        }
        if (i3 == 2) {
            h(str, i, 0, hashMap, hashMap2, hashSet);
            return -1L;
        } else if (i3 == 3) {
            o(str, i, hashMap, hashMap2, hashSet);
            return -1L;
        } else if (i3 != 4) {
            return -1L;
        } else {
            n(str, i, hashMap, hashMap2, hashSet);
            return -1L;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final l5m m(String str, int i, HashMap<String, String> hashMap, HashMap<String, String> hashMap2, HashSet<String> hashSet) {
        l5m l5mVar;
        m5m a2 = this.f15211a.a(str);
        exp expVar = null;
        if (a2 != null) {
            l5mVar = a2.a(this.c, i);
            if (l5mVar == null) {
                HashMap<String, Object> hashMap3 = new HashMap<>();
                for (Map.Entry<String, String> entry : hashMap2.entrySet()) {
                    hashMap3.put(entry.getKey(), entry.getValue());
                }
                l5mVar = a2.b(this.c, i, str, hashMap, hashMap3, hashSet);
            }
        } else {
            l5mVar = null;
        }
        if (l5mVar == null) {
            expVar = ivu.c(str);
            if (expVar != null) {
                Object a3 = expVar.a(this.c, i);
                if (a3 != null && (a3 instanceof l5m)) {
                    l5mVar = (l5m) a3;
                }
            } else {
                throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str);
            }
        }
        if (l5mVar != null) {
            if (l5mVar instanceof WeexPlatformView) {
                WeexPlatformView weexPlatformView = (WeexPlatformView) l5mVar;
                if (expVar == null) {
                    HashMap<Class<? extends l5m>, exp> hashMap4 = this.i;
                    if (hashMap4.containsKey(weexPlatformView.getClass())) {
                        expVar = (exp) hashMap4.get(weexPlatformView.getClass());
                    } else {
                        expVar = new exp(weexPlatformView.getClass());
                        hashMap4.put(weexPlatformView.getClass(), expVar);
                    }
                }
                weexPlatformView.attach(expVar, this.t);
                weexPlatformView.bindData(hashMap, hashMap2, hashSet);
            }
            l5mVar.onFlutterViewAttached(this.d);
            return l5mVar;
        }
        throw new IllegalStateException("Failed to create platform view: " + str);
    }

    public long n(String str, int i, HashMap<String, String> hashMap, HashMap<String, String> hashMap2, HashSet<String> hashSet) {
        l5m m = m(str, i, hashMap, hashMap2, hashSet);
        m.onFlutterViewAttached(this.d);
        this.j.put(i, m);
        this.k.put(i, Boolean.FALSE);
        g(m);
        return -1L;
    }

    public long o(String str, int i, HashMap<String, String> hashMap, HashMap<String, String> hashMap2, HashSet<String> hashSet) {
        l5m m = m(str, i, hashMap, hashMap2, hashSet);
        m.onFlutterViewAttached(this.d);
        this.j.put(i, m);
        this.k.put(i, Boolean.TRUE);
        g(m);
        this.d.setBackgroundColor(-1);
        return -1L;
    }

    public void p() {
        int i = 0;
        while (true) {
            SparseArray<UnicornImageReaderView> sparseArray = this.m;
            if (i < sparseArray.size()) {
                UnicornImageReaderView valueAt = sparseArray.valueAt(i);
                valueAt.detachFromRenderer();
                valueAt.closeImageReader();
                i++;
            } else {
                return;
            }
        }
    }

    public void q() {
        this.t.n(null);
        if (this.f != null) {
            this.f = null;
        }
        p();
        this.c = null;
        this.e = null;
    }

    public void r() {
        this.g.b(null);
    }

    public void s() {
        int i = 0;
        while (true) {
            SparseArray<l5m> sparseArray = this.h;
            if (i >= sparseArray.size()) {
                break;
            }
            sparseArray.get(sparseArray.keyAt(i)).onFlutterViewDetached();
            i++;
        }
        int i2 = 0;
        while (true) {
            SparseArray<l5m> sparseArray2 = this.j;
            if (i2 < sparseArray2.size()) {
                sparseArray2.get(sparseArray2.keyAt(i2)).onFlutterViewDetached();
                i2++;
            } else {
                p();
                b0();
                z();
                this.d = null;
                this.p = false;
                return;
            }
        }
    }

    public void t(int i) {
        View view;
        l5m l5mVar = this.j.get(i);
        if (l5mVar != null && (view = l5mVar.getView()) != null && view.getParent() != null) {
            ((View) view.getParent()).setVisibility(8);
        }
    }

    public void u(int i) {
        SparseArray<l5m> sparseArray = this.h;
        l5m l5mVar = sparseArray.get(i);
        if (l5mVar != null) {
            if (l5mVar instanceof WeexPlatformView) {
                this.i.remove(l5mVar.getClass());
            }
            ViewGroup viewGroup = (ViewGroup) l5mVar.getView().getParent();
            if (viewGroup != null) {
                viewGroup.removeView(l5mVar.getView());
            }
            sparseArray.remove(i);
            l5mVar.dispose();
        }
        SparseArray<PlatformViewWrapper> sparseArray2 = this.n;
        PlatformViewWrapper platformViewWrapper = sparseArray2.get(i);
        if (platformViewWrapper != null) {
            platformViewWrapper.release();
            platformViewWrapper.unsetOnDescendantFocusChangeListener();
            ViewGroup viewGroup2 = (ViewGroup) platformViewWrapper.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(platformViewWrapper);
            }
            sparseArray2.remove(i);
            return;
        }
        SparseArray<UnicornMutatorView> sparseArray3 = this.l;
        UnicornMutatorView unicornMutatorView = sparseArray3.get(i);
        if (unicornMutatorView != null) {
            unicornMutatorView.unsetOnDescendantFocusChangeListener();
            ViewGroup viewGroup3 = (ViewGroup) unicornMutatorView.getParent();
            if (viewGroup3 != null) {
                viewGroup3.removeView(unicornMutatorView);
            }
            sparseArray3.remove(i);
        }
    }

    public void v(int i, int i2) {
        PlatformViewsMode platformViewsMode = PlatformViewsMode.values()[i2];
        if (platformViewsMode == PlatformViewsMode.HybridComposting || platformViewsMode == PlatformViewsMode.TextureDisplay) {
            u(i);
        } else if (platformViewsMode == PlatformViewsMode.PunchingDisplay || platformViewsMode == PlatformViewsMode.OverlayDisplay) {
            w(i);
        }
    }

    public void w(int i) {
        SparseArray<l5m> sparseArray = this.j;
        l5m l5mVar = sparseArray.get(i);
        if (l5mVar != null) {
            if (l5mVar instanceof WeexPlatformView) {
                this.i.remove(l5mVar.getClass());
            }
            ViewGroup viewGroup = (ViewGroup) l5mVar.getView().getParent();
            if (viewGroup != null) {
                viewGroup.removeView(l5mVar.getView());
            }
            sparseArray.remove(i);
            this.k.remove(i);
            l5mVar.dispose();
        }
        SparseArray<UnicornMutatorView> sparseArray2 = this.l;
        UnicornMutatorView unicornMutatorView = sparseArray2.get(i);
        if (unicornMutatorView != null) {
            ViewGroup viewGroup2 = (ViewGroup) unicornMutatorView.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(unicornMutatorView);
            }
            sparseArray2.remove(i);
        }
        if (this.d != null && sparseArray.size() == 0) {
            this.d.setRenderSurfaceOpaque(true);
        }
    }

    public final void x(int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < i) {
            throw new IllegalStateException("Trying to use platform views with API " + i2 + ", required API level is: " + i);
        }
    }

    public final void y(boolean z) {
        boolean z2;
        int i = 0;
        while (true) {
            SparseArray<UnicornImageReaderView> sparseArray = this.m;
            if (i >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i);
            UnicornImageReaderView valueAt = sparseArray.valueAt(i);
            if (this.q.contains(Integer.valueOf(keyAt))) {
                this.d.attachOverlaySurfaceToRender(valueAt);
                z &= valueAt.acquireLatestImage();
            } else {
                if (!this.p) {
                    valueAt.detachFromRenderer();
                }
                valueAt.setVisibility(8);
            }
            i++;
        }
        int i2 = 0;
        while (true) {
            SparseArray<UnicornMutatorView> sparseArray2 = this.l;
            if (i2 < sparseArray2.size()) {
                int keyAt2 = sparseArray2.keyAt(i2);
                UnicornMutatorView unicornMutatorView = sparseArray2.get(keyAt2);
                if (this.j.get(keyAt2) == null || !this.k.get(keyAt2, Boolean.FALSE).booleanValue()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if ((z || z2) && this.r.contains(Integer.valueOf(keyAt2))) {
                    unicornMutatorView.setVisibility(0);
                } else {
                    unicornMutatorView.setVisibility(8);
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public final void z() {
        while (true) {
            SparseArray<l5m> sparseArray = this.h;
            if (sparseArray.size() > 0) {
                u(sparseArray.keyAt(0));
            }
        }
        while (true) {
            SparseArray<l5m> sparseArray2 = this.j;
            if (sparseArray2.size() > 0) {
                w(sparseArray2.keyAt(0));
            } else {
                return;
            }
        }
    }

    public static void a0() {
    }

    public void P() {
    }
}
