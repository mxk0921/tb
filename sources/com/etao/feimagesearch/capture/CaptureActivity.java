package com.etao.feimagesearch.capture;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.FEISBaseActivity;
import com.etao.feimagesearch.capture.controller.CaptureV2Controller;
import com.etao.feimagesearch.capture.dynamic.templates.PltTemplatesManager;
import com.etao.feimagesearch.capture.perf.CapturePerfRecord;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import tb.acq;
import tb.agh;
import tb.caa;
import tb.e0;
import tb.l53;
import tb.lg4;
import tb.m09;
import tb.mzu;
import tb.n73;
import tb.p73;
import tb.rad;
import tb.rlb;
import tb.t2o;
import tb.vpt;
import tb.wyn;
import tb.xr1;
import tb.y70;
import tb.zio;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class CaptureActivity extends FEISBaseActivity implements rad, rlb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public xr1 b;
    public boolean c = false;
    public boolean d = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/CaptureActivity$1");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else {
                CaptureActivity.this.n3();
            }
        }
    }

    static {
        t2o.a(730857502);
        t2o.a(481296903);
        t2o.a(481296614);
    }

    public static /* synthetic */ Object ipc$super(CaptureActivity captureActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2012646654:
                super.onWindowFocusChanged(((Boolean) objArr[0]).booleanValue());
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -962742886:
                super.onTrimMemory(((Number) objArr[0]).intValue());
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 143326307:
                super.onBackPressed();
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 602429250:
                super.onRequestPermissionsResult(((Number) objArr[0]).intValue(), (String[]) objArr[1], (int[]) objArr[2]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1150324634:
                super.finish();
                return null;
            case 1246973220:
                return new Boolean(super.dispatchKeyEvent((KeyEvent) objArr[0]));
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/CaptureActivity");
        }
    }

    @Override // tb.rad
    public void A2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab2e7c6e", new Object[]{this});
        } else {
            this.b.dismissPop();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a534d24", new Object[]{this, keyEvent})).booleanValue();
        }
        if (this.b.onKeyDown(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        this.b.onFinish();
        super.finish();
    }

    @Override // com.taobao.tao.BaseActivity
    public boolean isFitsWindowsOnRoot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86dc3ce3", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.tao.BaseActivity
    public boolean isTranslucent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab05a0da", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public int l3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3327aecc", new Object[]{this})).intValue();
        }
        return this.b.getCurrentTab();
    }

    public final boolean m3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca44d1c7", new Object[]{this})).booleanValue();
        }
        if (!lg4.J0()) {
            this.b = new CaptureV2Controller(this, true);
            return true;
        }
        xr1 e = wyn.e(this);
        this.b = e;
        if (e == null) {
            this.b = new CaptureV2Controller(this, true);
            return true;
        }
        l53.q(true);
        return false;
    }

    public void n3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32764bf", new Object[]{this});
        } else if (!this.c && lg4.y0()) {
            String v2 = lg4.v2();
            if (!TextUtils.isEmpty(v2)) {
                this.c = true;
                PltTemplatesManager.g(v2, null, true);
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        this.b.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        super.onBackPressed();
        mzu.n("PhotoSearchTake", "otherBackBtn", 2101, "rainbow", e0.b());
    }

    @Override // com.etao.feimagesearch.FEISBaseActivity, com.etao.feimagesearch.ISBaseActivity, com.taobao.baseactivity.CustomBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.b.onDestroy();
        if (lg4.U()) {
            PltTemplatesManager.h();
        }
        l53.p(null);
        n73.l();
        l53.a.a(hashCode());
    }

    @Override // com.taobao.tao.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        this.b.onNewIntent(intent);
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        this.b.onPause();
        CapturePerfRecord.report(true);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23e85742", new Object[]{this, new Integer(i), strArr, iArr});
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
        this.b.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        this.b.onStart();
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        this.b.onStop();
        n73.t();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c69db59a", new Object[]{this, new Integer(i)});
            return;
        }
        super.onTrimMemory(i);
        agh.r("AutoDetect", "onTrimMemory", i + "");
        String str = p73.f25916a;
        mzu.n(str, "onTrimMemory", 19999, m09.TASK_TYPE_LEVEL, i + "");
    }

    @Override // com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097302", new Object[]{this, new Boolean(z)});
            return;
        }
        super.onWindowFocusChanged(z);
        this.b.onWindowFocusChanged(z);
    }

    @Override // tb.rlb
    public xr1 w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xr1) ipChange.ipc$dispatch("c17046be", new Object[]{this});
        }
        return this.b;
    }

    @Override // com.etao.feimagesearch.FEISBaseActivity, com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        TLogTracker.s("PltCamera");
        super.onResume();
        if (this.d) {
            this.d = false;
        } else {
            l53.o(l53.n());
        }
        this.b.onResume();
        vpt.h("preloadIrpTemplate", new a(), 2000L);
        Log.e("CaptureV3", "CaptureActivity onResume end");
    }

    @Override // com.etao.feimagesearch.FEISBaseActivity, com.etao.feimagesearch.ISBaseActivity, com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        CapturePerfRecord.markCaptureInitStart();
        Log.e("CaptureV3", "CaptureActivity onCreate");
        TLogTracker.s("PltCamera");
        String dataString = getIntent().getDataString();
        UTAnalytics.getInstance().getDefaultTracker().skipPage(this);
        if (bundle != null) {
            bundle.clear();
        }
        l53.Companion.g(true);
        l53.o(l53.n());
        l53.a.b(hashCode());
        super.onCreate(bundle);
        HashMap hashMap = new HashMap();
        hashMap.put("url", Uri.decode(dataString));
        TLogTracker.l("Default", hashMap);
        if (lg4.N()) {
            ScreenType.b(this);
        }
        l53.a.c(this);
        if (m3()) {
            setContentView(this.b.getRootView(LayoutInflater.from(this), null, bundle));
        }
        n73.o(this);
        this.b.onCreate();
        if (caa.q()) {
            y70.f(this);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            getWindow().setNavigationBarContrastEnforced(false);
            getWindow().setNavigationBarColor(0);
        }
        wyn.d();
        CapturePerfRecord.markCaptureInitEnd();
    }
}
