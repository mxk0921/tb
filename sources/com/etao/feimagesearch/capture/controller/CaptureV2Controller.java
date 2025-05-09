package com.etao.feimagesearch.capture.controller;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.dynamic.bean.DynCaptureImgGotConfig;
import com.etao.feimagesearch.capture.dynamic.bean.MusOuterAlbumBean;
import com.etao.feimagesearch.capture.perf.CapturePerfRecord;
import com.etao.feimagesearch.nn.MNNManager;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.taobao.R;
import tb.a07;
import tb.agh;
import tb.caa;
import tb.ckf;
import tb.i54;
import tb.kbo;
import tb.l53;
import tb.l63;
import tb.lg4;
import tb.lp9;
import tb.mno;
import tb.mp9;
import tb.mxo;
import tb.p3e;
import tb.pvh;
import tb.r7m;
import tb.t2o;
import tb.t73;
import tb.u63;
import tb.u7m;
import tb.vpt;
import tb.xr1;
import tb.zio;
import tb.zso;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class CaptureV2Controller extends xr1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String TAG = "CaptureV2Controller";

    /* renamed from: a  reason: collision with root package name */
    public final boolean f4627a;
    public t73 b;
    public Dialog c;
    public boolean d;
    public mp9 e;
    public View h;
    public boolean f = true;
    public int g = 1;
    public boolean i = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        static {
            t2o.a(730857507);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class a extends zio {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ CaptureV2Controller c;

            public a(CaptureV2Controller captureV2Controller) {
                this.c = captureV2Controller;
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/controller/CaptureV2Controller$onCreate$captureThread$1$1");
            }

            @Override // tb.zio
            public void c() {
                t73 b;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                    return;
                }
                agh.h(CaptureV2Controller.TAG, ckf.p("lifecycleState=", Integer.valueOf(CaptureV2Controller.c(this.c))));
                int c = CaptureV2Controller.c(this.c);
                if (c == 2) {
                    t73 b2 = CaptureV2Controller.b(this.c);
                    if (b2 != null) {
                        b2.F();
                    }
                } else if (c == 3) {
                    t73 b3 = CaptureV2Controller.b(this.c);
                    if (b3 != null) {
                        b3.D();
                    }
                } else if (c == 4) {
                    t73 b4 = CaptureV2Controller.b(this.c);
                    if (b4 != null) {
                        b4.H();
                    }
                } else if (c == 5 && (b = CaptureV2Controller.b(this.c)) != null) {
                    b.A();
                }
            }
        }

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            CaptureV2Controller.e(CaptureV2Controller.this, new t73(CaptureV2Controller.this.getActivity()));
            vpt.g("execute_capture_view", new a(CaptureV2Controller.this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements DialogInterface.OnDismissListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
            } else {
                CaptureV2Controller.this.onFinish();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f4630a;
        public final /* synthetic */ CaptureV2Controller b;

        public d(boolean z, CaptureV2Controller captureV2Controller) {
            this.f4630a = z;
            this.b = captureV2Controller;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (this.f4630a && !lg4.e4()) {
                MNNManager.Companion.a().h();
            }
            CaptureV2Controller.g(this.b);
        }
    }

    static {
        t2o.a(730857506);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptureV2Controller(Activity activity, boolean z) {
        super(activity);
        ckf.g(activity, "activity");
        this.f4627a = z;
    }

    public static final /* synthetic */ void a(CaptureV2Controller captureV2Controller) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("240ebe39", new Object[]{captureV2Controller});
        } else {
            captureV2Controller.autoOpenScreenshotSearchFloatBar();
        }
    }

    public static final /* synthetic */ t73 b(CaptureV2Controller captureV2Controller) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t73) ipChange.ipc$dispatch("6dbeef70", new Object[]{captureV2Controller});
        }
        return captureV2Controller.b;
    }

    public static final /* synthetic */ int c(CaptureV2Controller captureV2Controller) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d6fb81a1", new Object[]{captureV2Controller})).intValue();
        }
        return captureV2Controller.g;
    }

    public static final /* synthetic */ boolean d(CaptureV2Controller captureV2Controller) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b49746b8", new Object[]{captureV2Controller})).booleanValue();
        }
        return captureV2Controller.f;
    }

    public static final /* synthetic */ void e(CaptureV2Controller captureV2Controller, t73 t73Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27cfd792", new Object[]{captureV2Controller, t73Var});
        } else {
            captureV2Controller.b = t73Var;
        }
    }

    public static final /* synthetic */ void f(CaptureV2Controller captureV2Controller, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd0f6ae8", new Object[]{captureV2Controller, new Boolean(z)});
        } else {
            captureV2Controller.f = z;
        }
    }

    public static final /* synthetic */ void g(CaptureV2Controller captureV2Controller) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b8d6197", new Object[]{captureV2Controller});
        } else {
            captureV2Controller.updateFloatBar();
        }
    }

    public static /* synthetic */ Object ipc$super(CaptureV2Controller captureV2Controller, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/controller/CaptureV2Controller");
    }

    public final void autoOpenScreenshotSearchFloatBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2003425", new Object[]{this});
        } else if (u7m.f()) {
            lp9.INSTANCE.e();
            mno.h(caa.c(), l53.IS_PLT_SCREENSHOT_FLOAT_BAR_OPEN_DEFAULT, "true");
        }
    }

    @Override // tb.xr1
    public void cameraSwitch(boolean z, boolean z2, l63 l63Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03ff770", new Object[]{this, new Boolean(z), new Boolean(z2), l63Var});
            return;
        }
        ckf.g(l63Var, "callback");
        t73 t73Var = this.b;
        if (t73Var != null) {
            t73Var.h0(z, z2, l63Var);
        }
    }

    @Override // tb.xr1
    public void clickAlbum() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("554a46ce", new Object[]{this});
            return;
        }
        t73 t73Var = this.b;
        if (t73Var != null) {
            t73Var.j0();
        }
    }

    @Override // tb.xr1
    public void clickHistory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42f9c73", new Object[]{this});
            return;
        }
        t73 t73Var = this.b;
        if (t73Var != null) {
            t73Var.k0();
        }
    }

    @Override // tb.xr1
    public void continueCameraScene() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e6e55c7", new Object[]{this});
            return;
        }
        t73 t73Var = this.b;
        if (t73Var != null) {
            t73Var.l0();
        }
    }

    @Override // tb.xr1
    public void dismissPop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab2e7c6e", new Object[]{this});
        }
    }

    @Override // tb.xr1
    public void flipCamera() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8612579", new Object[]{this});
            return;
        }
        t73 t73Var = this.b;
        if (t73Var != null) {
            t73Var.p0();
        }
    }

    @Override // tb.xr1
    public int getCurrentTab() {
        CaptureManager q0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3327aecc", new Object[]{this})).intValue();
        }
        t73 t73Var = this.b;
        if (t73Var == null || (q0 = t73Var.m()) == null) {
            return 1;
        }
        return q0.t();
    }

    @Override // tb.xr1
    public void getPreviewData(DynCaptureImgGotConfig dynCaptureImgGotConfig, i54 i54Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f87ba568", new Object[]{this, dynCaptureImgGotConfig, i54Var});
            return;
        }
        ckf.g(dynCaptureImgGotConfig, "imgGotConfig");
        ckf.g(i54Var, "callback");
        t73 t73Var = this.b;
        if (t73Var != null) {
            t73Var.s0(dynCaptureImgGotConfig, i54Var);
        }
    }

    @Override // tb.xr1
    public boolean isScanMode() {
        CaptureManager q0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fff08495", new Object[]{this})).booleanValue();
        }
        t73 t73Var = this.b;
        String str = null;
        if (!(t73Var == null || (q0 = t73Var.m()) == null)) {
            str = q0.s();
        }
        return ckf.b(str, "scan");
    }

    @Override // tb.xr1
    public void jumpToIrp(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3920e1ab", new Object[]{this, jSONObject});
        } else {
            ckf.g(jSONObject, "params");
        }
    }

    @Override // tb.xr1
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        t73 t73Var = this.b;
        if (t73Var != null) {
            t73Var.v0(i, i2, intent);
        }
    }

    @Override // tb.xr1
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        TLogTracker.o();
        this.g = 5;
        lp9.INSTANCE.h(this.e);
        t73 t73Var = this.b;
        if (t73Var != null) {
            t73Var.A();
        }
    }

    @Override // tb.xr1
    public void onFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("badeed9", new Object[]{this});
            return;
        }
        t73 t73Var = this.b;
        if (t73Var != null) {
            if (!t73Var.p().isOtherChannelPhotoSearch() || !kbo.c(getActivity())) {
                t73Var.B();
                return;
            }
            kbo kboVar = new kbo(getActivity());
            this.c = kboVar;
            kboVar.setOnDismissListener(new c());
            Dialog dialog = this.c;
            if (dialog != null) {
                dialog.show();
            }
        }
    }

    @Override // tb.xr1
    public boolean onKeyDown(KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2bc6ae57", new Object[]{this, keyEvent})).booleanValue();
        }
        return false;
    }

    @Override // tb.xr1
    public void onNewIntent(Intent intent) {
        t73 t73Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
        } else if (intent != null && lg4.O0() && (t73Var = this.b) != null) {
            t73Var.C(intent);
        }
    }

    @Override // tb.xr1
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        TLogTracker.q();
        this.g = 3;
        t73 t73Var = this.b;
        if (t73Var != null) {
            t73Var.D();
        }
    }

    @Override // tb.xr1
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        t73 t73Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e85742", new Object[]{this, new Integer(i), strArr, iArr});
        } else if (strArr != null && iArr != null && (t73Var = this.b) != null) {
            t73Var.E(i, strArr, iArr);
        }
    }

    @Override // tb.xr1
    public void onResume() {
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        TLogTracker.p();
        this.g = 2;
        t73 t73Var = this.b;
        if (t73Var != null) {
            t73Var.F();
        }
        boolean z = this.i;
        View view = this.h;
        if (view == null) {
            bool = null;
        } else {
            bool = Boolean.valueOf(view.post(new d(z, this)));
        }
        if (bool == null) {
            updateFloatBar();
        }
        this.i = false;
    }

    @Override // tb.xr1
    public void onSaveInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80049e8d", new Object[]{this, bundle});
        }
    }

    @Override // tb.xr1
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        }
    }

    @Override // tb.xr1
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        this.g = 4;
        t73 t73Var = this.b;
        if (t73Var != null) {
            t73Var.H();
        }
    }

    @Override // tb.xr1
    public void onWindowFocusChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097302", new Object[]{this, new Boolean(z)});
            return;
        }
        t73 t73Var = this.b;
        if (t73Var != null) {
            t73Var.w0(z);
        }
    }

    @Override // tb.xr1
    public void operateLight(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3ba187b", new Object[]{this, new Boolean(z)});
            return;
        }
        t73 t73Var = this.b;
        if (t73Var != null) {
            t73Var.x0(z);
        }
    }

    @Override // tb.xr1
    public void optionScreenShotSearchFloatingBtn(boolean z, pvh pvhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("438d5be3", new Object[]{this, new Boolean(z), pvhVar});
            return;
        }
        if (z) {
            lp9.INSTANCE.e();
        } else {
            lp9.INSTANCE.c();
        }
        mno.h(caa.c(), l53.IS_PLT_SCREENSHOT_FLOAT_BAR_OPEN_DEFAULT, String.valueOf(z));
    }

    @Override // tb.xr1
    public void outerAlbumClick(MusOuterAlbumBean musOuterAlbumBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89dffb4e", new Object[]{this, musOuterAlbumBean});
            return;
        }
        ckf.g(musOuterAlbumBean, "albumBean");
        t73 t73Var = this.b;
        if (t73Var != null) {
            t73Var.i(musOuterAlbumBean);
        }
    }

    @Override // tb.xr1
    public void selectPhotoFromAlbum(DynCaptureImgGotConfig dynCaptureImgGotConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ccbebf6", new Object[]{this, dynCaptureImgGotConfig});
            return;
        }
        ckf.g(dynCaptureImgGotConfig, "imgGotConfig");
        t73 t73Var = this.b;
        if (t73Var != null) {
            t73Var.z0(dynCaptureImgGotConfig);
        }
    }

    @Override // tb.xr1
    public void stopCameraScene() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b91f90c", new Object[]{this});
            return;
        }
        t73 t73Var = this.b;
        if (t73Var != null) {
            t73Var.A0();
        }
    }

    @Override // tb.xr1
    public void switchMetaSightState(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c58b620", new Object[]{this, new Boolean(z)});
            return;
        }
        t73 t73Var = this.b;
        if (t73Var != null) {
            t73Var.B0(z);
        }
    }

    @Override // tb.xr1
    public void takePhoto() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df136cf2", new Object[]{this});
            return;
        }
        t73 t73Var = this.b;
        if (t73Var != null) {
            t73Var.C0();
        }
    }

    @Override // tb.xr1
    public boolean updateAllowanceState(r7m r7mVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cbb6f15d", new Object[]{this, r7mVar, new Boolean(z)})).booleanValue();
        }
        t73 t73Var = this.b;
        if (t73Var == null) {
            return false;
        }
        return t73Var.E0(r7mVar, z);
    }

    public final void updateFloatBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2266bc87", new Object[]{this});
        } else if (this.d) {
            this.d = false;
            autoOpenScreenshotSearchFloatBar();
        } else {
            updateScreenshotSearchFloatBarState();
        }
    }

    public final void updateScreenshotSearchFloatBarState() {
        p3e p3eVar;
        CaptureManager q0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27adb16a", new Object[]{this});
            return;
        }
        t73 t73Var = this.b;
        if (t73Var == null || (q0 = t73Var.m()) == null) {
            p3eVar = null;
        } else {
            p3eVar = q0.B();
        }
        if (this.e == null && p3eVar != null) {
            mp9 mp9Var = new mp9(false, new CaptureV2Controller$updateScreenshotSearchFloatBarState$1(p3eVar, this));
            this.e = mp9Var;
            lp9.INSTANCE.g(mp9Var);
        }
        if (lg4.l1()) {
            if (u7m.f()) {
                lp9.INSTANCE.f();
            } else if (p3eVar != null) {
                p3eVar.t(new mxo(false, 1, null));
            }
        }
    }

    @Override // tb.xr1
    public void changeScene(zso zsoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc48567b", new Object[]{this, zsoVar});
            return;
        }
        ckf.g(zsoVar, "sceneConfig");
        t73 t73Var = this.b;
        if (t73Var != null) {
            t73Var.i0(zsoVar, false);
        }
    }

    @Override // tb.xr1
    public View getRootView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6a4f8579", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        ckf.g(layoutInflater, "inflater");
        View view = this.h;
        if (view == null) {
            view = layoutInflater.inflate(R.layout.feis_activity_capture_v2, viewGroup, false);
            ckf.f(view, "inflater.inflate(R.layou…ure_v2, container, false)");
        }
        this.h = view;
        return view;
    }

    @Override // tb.xr1
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        CapturePerfRecord.updateCaptureState(false);
        boolean b0 = lg4.b0();
        CaptureManager.b0 = this.f4627a;
        if (b0) {
            Thread thread = new Thread(new b(), ckf.p(u63.MODULE, Integer.valueOf(hashCode())));
            thread.setPriority(10);
            thread.start();
            return;
        }
        this.b = new t73(getActivity());
    }

    @Override // tb.xr1
    public void requestFloatingWindowPermission() {
        boolean canDrawOverlays;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7087763b", new Object[]{this});
        } else if (Build.VERSION.SDK_INT >= 23) {
            canDrawOverlays = Settings.canDrawOverlays(caa.c());
            if (!canDrawOverlays) {
                getActivity().startActivity(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse(ckf.p("package:", getActivity().getPackageName()))));
                this.d = true;
            }
        }
    }
}
