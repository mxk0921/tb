package com.taobao.android.tbabilitykit.pop;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.taobao.R;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTPageStatus;
import java.util.ArrayList;
import java.util.List;
import tb.acq;
import tb.ckf;
import tb.e9;
import tb.evo;
import tb.fc0;
import tb.gc0;
import tb.h9;
import tb.hab;
import tb.pg1;
import tb.qlq;
import tb.t2o;
import tb.za0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class StdPopContainerActivity extends FragmentActivity implements fc0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<gc0> f9541a = new ArrayList();
    public qlq b;
    public evo c;

    static {
        t2o.a(786432128);
        t2o.a(786432114);
    }

    public static /* synthetic */ Object ipc$super(StdPopContainerActivity stdPopContainerActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1150324634:
                super.finish();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbabilitykit/pop/StdPopContainerActivity");
        }
    }

    @Override // tb.fc0
    public void M(gc0 gc0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84fdd98b", new Object[]{this, gc0Var});
            return;
        }
        ckf.g(gc0Var, DataReceiveMonitor.CB_LISTENER);
        fc0.a.a(this, gc0Var);
    }

    @Override // tb.fc0
    public void M1(gc0 gc0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("936e2e6e", new Object[]{this, gc0Var});
            return;
        }
        ckf.g(gc0Var, DataReceiveMonitor.CB_LISTENER);
        fc0.a.b(this, gc0Var);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        this.b = za0.a();
        super.attachBaseContext(context);
        acq.B(context);
    }

    @Override // tb.fc0
    public List<gc0> b1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c97164b7", new Object[]{this});
        }
        return this.f9541a;
    }

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.finish();
        overridePendingTransition(0, 0);
    }

    public final qlq l3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qlq) ipChange.ipc$dispatch("3eddd4df", new Object[]{this});
        }
        return this.b;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        for (gc0 gc0Var : b1()) {
            gc0Var.onActivityResult(i, i2, intent);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        hab<?, ?> b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        qlq qlqVar = this.b;
        if (!(qlqVar == null || (b = qlqVar.b()) == null)) {
            b.a(null, false);
        }
        evo evoVar = this.c;
        if (evoVar != null) {
            TBAutoSizeConfig.x().h0(evoVar);
            this.c = null;
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        try {
            super.onPause();
        } catch (IllegalArgumentException e) {
            AppMonitor.Counter.commit("AbilityKit", "stdPopPauseError", "stdPopPauseError-" + e, 1.0d);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        String str;
        qlq qlqVar;
        h9 c;
        e9 e9Var;
        h9 c2;
        e9 e9Var2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        qlq qlqVar2 = this.b;
        if (qlqVar2 == null || (c2 = qlqVar2.c()) == null || (e9Var2 = c2.f20479a) == null) {
            str = null;
        } else {
            str = e9Var2.D();
        }
        if (!ckf.b(h9.DEFAULT_LANDSCAPE_DRAWER, str) || (qlqVar = this.b) == null || (c = qlqVar.c()) == null || (e9Var = c.f20479a) == null || !e9Var.E()) {
            overridePendingTransition(0, 0);
        } else {
            overridePendingTransition(R.anim.mega_slide_in_right, 0);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        qlq qlqVar = this.b;
        if (qlqVar != null) {
            if (Build.VERSION.SDK_INT == 26) {
                setTheme(R.style.Theme_Ability_NotTranslucent_NoTitleBar);
            }
            if (qlqVar.c().f20479a.h0()) {
                UTAnalytics instance = UTAnalytics.getInstance();
                ckf.f(instance, "UTAnalytics.getInstance()");
                instance.getDefaultTracker().skipPage(this);
            }
            if (qlqVar.c().f20479a.b0()) {
                UTAnalytics instance2 = UTAnalytics.getInstance();
                ckf.f(instance2, "UTAnalytics.getInstance()");
                instance2.getDefaultTracker().updatePageStatus(this, UTPageStatus.UT_H5_IN_WebView);
            }
            if (qlqVar.c().f20479a.G()) {
                getWindow().addFlags(Integer.MIN_VALUE);
                getWindow().addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
                Window window = getWindow();
                ckf.f(window, pg1.ATOM_EXT_window);
                window.setStatusBarColor(0);
            }
            if (qlqVar.c().f20479a.v()) {
                getWindow().setSoftInputMode(32);
            } else {
                getWindow().setSoftInputMode(48);
            }
            super.onCreate(bundle);
            qlqVar.a(this);
            evo evoVar = new evo(qlqVar.c(), this, qlqVar.b());
            this.c = evoVar;
            TBAutoSizeConfig.x().d0(evoVar);
            return;
        }
        super.onCreate(bundle);
        finish();
    }
}
