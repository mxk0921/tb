package com.etao.feimagesearch.capture;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.controller.CaptureV2Controller;
import com.etao.feimagesearch.capture.dynamic.hybrid.TBAlbumImg;
import com.etao.feimagesearch.capture.dynamic.templates.PltTemplatesManager;
import com.etao.feimagesearch.cip.capture.CaptureModule;
import com.etao.feimagesearch.irp.NewIrpMuiseModule;
import com.etao.feimagesearch.result.IrpJsBridge;
import com.etao.feimagesearch.result.IrpMuiseModule;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.search.jarvis.rcmd.SearchXslSdk;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.tao.Globals;
import com.taobao.tao.TBBaseFragment;
import tb.agh;
import tb.b8m;
import tb.caa;
import tb.ckf;
import tb.fsw;
import tb.k8j;
import tb.lg4;
import tb.n73;
import tb.oen;
import tb.rlb;
import tb.s7m;
import tb.t2o;
import tb.xr1;
import tb.y70;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class CaptureFragment extends TBBaseFragment implements rlb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public xr1 f4626a;
    public boolean c;
    public boolean d;

    static {
        t2o.a(730857504);
        t2o.a(481296614);
    }

    public static /* synthetic */ Object ipc$super(CaptureFragment captureFragment, String str, Object... objArr) {
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
            case 188604040:
                super.onStop();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1002290867:
                super.onActivityCreated((Bundle) objArr[0]);
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/CaptureFragment");
        }
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bbdbeb3", new Object[]{this, bundle});
            return;
        }
        super.onActivityCreated(bundle);
        if (!this.d) {
            this.d = true;
            xr1 xr1Var = this.f4626a;
            if (xr1Var != null) {
                xr1Var.onCreate();
            } else {
                ckf.y("captureController");
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        xr1 xr1Var = this.f4626a;
        if (xr1Var != null) {
            xr1Var.onActivityResult(i, i2, intent);
        } else {
            ckf.y("captureController");
            throw null;
        }
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        ckf.g(layoutInflater, "inflater");
        xr1 xr1Var = this.f4626a;
        if (xr1Var != null) {
            return xr1Var.getRootView(layoutInflater, viewGroup, bundle);
        }
        ckf.y("captureController");
        throw null;
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        xr1 xr1Var = this.f4626a;
        if (xr1Var != null) {
            xr1Var.onDestroy();
            if (lg4.U()) {
                PltTemplatesManager.h();
                return;
            }
            return;
        }
        ckf.y("captureController");
        throw null;
    }

    @Override // com.taobao.tao.TBBaseFragment
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        xr1 xr1Var = this.f4626a;
        if (xr1Var != null) {
            xr1Var.onNewIntent(intent);
        } else {
            ckf.y("captureController");
            throw null;
        }
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        xr1 xr1Var = this.f4626a;
        if (xr1Var != null) {
            xr1Var.onPause();
        } else {
            ckf.y("captureController");
            throw null;
        }
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        TLogTracker.s("PltCamera");
        super.onResume();
        xr1 xr1Var = this.f4626a;
        if (xr1Var != null) {
            xr1Var.onResume();
            r2();
            return;
        }
        ckf.y("captureController");
        throw null;
    }

    @Override // com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        xr1 xr1Var = this.f4626a;
        if (xr1Var != null) {
            xr1Var.onStop();
        } else {
            ckf.y("captureController");
            throw null;
        }
    }

    public final void r2() {
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

    @Override // tb.rlb
    public xr1 w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xr1) ipChange.ipc$dispatch("c17046be", new Object[]{this});
        }
        xr1 xr1Var = this.f4626a;
        if (xr1Var != null) {
            return xr1Var;
        }
        ckf.y("captureController");
        throw null;
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        p2();
        n73.o(getActivity());
        FragmentActivity activity = getActivity();
        if (activity != null) {
            this.f4626a = new CaptureV2Controller(activity, false);
            if (caa.q()) {
                y70.f(getActivity());
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
    }

    public final void p2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5481fbd9", new Object[]{this});
            return;
        }
        b8m.INSTANCE.b();
        try {
            k8j.a(Globals.getApplication());
            SearchXslSdk.install();
            MUSEngine.registerModule(IrpMuiseModule.NAME, NewIrpMuiseModule.class);
            MUSEngine.registerModule(CaptureModule.NAME, CaptureModule.class);
            s7m.a();
            MUSEngine.registerUINode(TBAlbumImg.NODE_NAME, TBAlbumImg.class);
            fsw.i(IrpJsBridge.NAME, CaptureJSBridge.class, true);
        } catch (Exception e) {
            agh.d("CaptureFragments", "onCreate", e);
        }
        oen.z();
    }
}
