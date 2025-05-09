package com.taobao.android.detail.wrapper.fragment.weex;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import androidx.fragment.app.DialogFragment;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.vessel.VesselView;
import com.taobao.vessel.utils.VesselType;
import com.taobao.weex.WXSDKEngine;
import tb.ask;
import tb.d4w;
import tb.hqj;
import tb.i4w;
import tb.t2o;
import tb.tgh;
import tb.uyv;
import tb.xq0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class DetailFullScreenVesselFragment extends DialogFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG = VesselView.class.getSimpleName();
    public Object c;
    public VesselType d;
    public i4w e;
    public hqj g;
    public ask h;
    public ViewGroup i;

    /* renamed from: a  reason: collision with root package name */
    public String f7072a = null;
    public final boolean f = true;
    public VesselView j = null;

    static {
        t2o.a(443547658);
    }

    public static /* synthetic */ Object ipc$super(DetailFullScreenVesselFragment detailFullScreenVesselFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2147180915:
                super.onSaveInstanceState((Bundle) objArr[0]);
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case 462397159:
                super.onDestroyView();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1002290867:
                super.onActivityCreated((Bundle) objArr[0]);
                return null;
            case 1860817453:
                super.onViewCreated((View) objArr[0], (Bundle) objArr[1]);
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/wrapper/fragment/weex/DetailFullScreenVesselFragment");
        }
    }

    public static DetailFullScreenVesselFragment z2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DetailFullScreenVesselFragment) ipChange.ipc$dispatch("e315f1e1", new Object[0]);
        }
        return new DetailFullScreenVesselFragment();
    }

    public final void A2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8578757e", new Object[]{this});
            return;
        }
        VesselView vesselView = this.j;
        if (vesselView != null) {
            ask askVar = this.h;
            if (askVar != null) {
                vesselView.setOnLoadListener(askVar);
            }
            i4w i4wVar = this.e;
            if (i4wVar != null) {
                this.j.setVesselViewCallback(i4wVar);
            }
            this.j.setShowLoading(false);
            this.j.setDowngradeEnable(this.f);
            this.j.setDowngradeUrl(null);
        }
    }

    public final void B2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e76bf7c9", new Object[]{this});
            return;
        }
        this.h = null;
        this.e = null;
    }

    public void C2(ask askVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf745a62", new Object[]{this, askVar});
            return;
        }
        this.h = askVar;
        VesselView vesselView = this.j;
        if (vesselView != null) {
            vesselView.setOnLoadListener(askVar);
        }
    }

    public void D2(i4w i4wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42e1d2b9", new Object[]{this, i4wVar});
            return;
        }
        this.e = i4wVar;
        VesselView vesselView = this.j;
        if (vesselView != null) {
            vesselView.setVesselViewCallback(i4wVar);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bbdbeb3", new Object[]{this, bundle});
            return;
        }
        try {
            getDialog().getWindow().requestFeature(1);
        } catch (Throwable unused) {
        }
        super.onActivityCreated(bundle);
        try {
            getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getDialog().getWindow().setLayout(-1, -1);
        } catch (Throwable unused2) {
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        B2();
        d4w.c().a();
        if (WXSDKEngine.getActivityNavBarSetter() != null && (WXSDKEngine.getActivityNavBarSetter() instanceof hqj)) {
            WXSDKEngine.setActivityNavBarSetter(null);
        }
        VesselView vesselView = this.j;
        if (vesselView != null) {
            vesselView.onDestroy();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
            return;
        }
        super.onDestroyView();
        VesselView vesselView = this.j;
        if (vesselView != null) {
            vesselView.setVisibility(8);
            this.j.removeAllViews();
            this.j.onDestroy();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        VesselView vesselView = this.j;
        if (vesselView != null) {
            vesselView.onPause();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        if (this.g == null) {
            this.g = new hqj(getActivity());
        }
        WXSDKEngine.setActivityNavBarSetter(this.g);
        VesselView vesselView = this.j;
        if (vesselView != null) {
            vesselView.onResume();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80049e8d", new Object[]{this, bundle});
            return;
        }
        super.onSaveInstanceState(bundle);
        tgh.b(TAG, "onSaveInstanceState");
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        VesselView vesselView = this.j;
        if (vesselView != null) {
            vesselView.onStart();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        super.onViewCreated(view, bundle);
        v2();
        p2(this.i);
        v2();
    }

    public void p2(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99fdd1cb", new Object[]{this, view});
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(300L);
        view.startAnimation(alphaAnimation);
    }

    public void r2(VesselType vesselType, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f55ed11", new Object[]{this, vesselType, str, obj});
            return;
        }
        this.d = vesselType;
        if (vesselType == null) {
            this.d = uyv.m(str);
        }
        this.f7072a = str;
        this.c = obj;
        VesselView vesselView = this.j;
        if (vesselView != null) {
            vesselView.loadUrl(vesselType, str, obj);
        }
    }

    public void s2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89757c7a", new Object[]{this, str});
        } else {
            u2(str, null);
        }
    }

    public void u2(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b60501d6", new Object[]{this, str, obj});
        } else {
            r2(null, str, obj);
        }
    }

    public void v2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4dd14d3", new Object[]{this});
            return;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation.setDuration(300L);
        this.i.startAnimation(translateAnimation);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        VesselView vesselView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        try {
            getDialog().requestWindowFeature(1);
        } catch (Throwable unused) {
        }
        this.i = (ViewGroup) layoutInflater.inflate(R.layout.x_detail_weex_vessel_fullscreen_container, viewGroup, false);
        if (this.j == null) {
            this.j = new VesselView(getActivity());
        }
        i4w i4wVar = this.e;
        if (i4wVar != null) {
            this.j.setVesselViewCallback(i4wVar);
        }
        if (this.d == null) {
            this.d = VesselType.Weex;
        }
        A2();
        try {
            try {
                if (!TextUtils.isEmpty(this.f7072a)) {
                    this.j.loadUrl(this.d, this.f7072a, this.c);
                } else {
                    this.j.loadData(this.d, null);
                }
            } catch (Throwable unused2) {
                xq0.c().a(getContext()).c(this.f7072a);
            }
        } catch (Throwable unused3) {
            tgh.b(TAG, "选择配送区域二级跳转至纯WeexActivity容器失败！");
        }
        if (!(this.i == null || (vesselView = this.j) == null)) {
            vesselView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.i.addView(this.j);
        }
        return this.i;
    }
}
