package com.taobao.android.detail.wrapper.newsku.maccolor;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.vessel.VesselView;
import com.taobao.vessel.utils.VesselType;
import com.taobao.weex.WXEnvironment;
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
public class SkuScreenVesselFragment extends DialogFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG = VesselView.class.getSimpleName();
    public Object c;
    public VesselType d;
    public i4w e;
    public hqj g;
    public ask h;
    public ViewGroup i;

    /* renamed from: a  reason: collision with root package name */
    public String f7073a = null;
    public final boolean f = true;
    public VesselView j = null;

    static {
        t2o.a(443547667);
    }

    public static /* synthetic */ Object ipc$super(SkuScreenVesselFragment skuScreenVesselFragment, String str, Object... objArr) {
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/wrapper/newsku/maccolor/SkuScreenVesselFragment");
        }
    }

    public static SkuScreenVesselFragment u2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SkuScreenVesselFragment) ipChange.ipc$dispatch("2caff90e", new Object[0]);
        }
        return new SkuScreenVesselFragment();
    }

    public void A2(ask askVar) {
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

    public void B2(i4w i4wVar) {
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
        getDialog().getWindow().requestFeature(1);
        super.onActivityCreated(bundle);
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getDialog().getWindow().setLayout(-1, -1);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        VesselView vesselView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        getDialog().requestWindowFeature(1);
        this.i = (ViewGroup) layoutInflater.inflate(R.layout.taosku_detail_weex_vessel_fullscreen_container, (ViewGroup) null);
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
        v2();
        try {
            if (!TextUtils.isEmpty(this.f7073a)) {
                this.j.loadUrl(this.d, this.f7073a, this.c);
            } else {
                this.j.loadData(this.d, null);
            }
        } catch (Throwable unused) {
            xq0.c().a(getContext()).c(this.f7073a);
        }
        ViewGroup viewGroup2 = this.i;
        if (!(viewGroup2 == null || (vesselView = this.j) == null)) {
            viewGroup2.addView(vesselView);
        }
        return this.i;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        z2();
        d4w.c().a();
        if (WXSDKEngine.getActivityNavBarSetter() != null && (WXSDKEngine.getActivityNavBarSetter() instanceof hqj)) {
            WXSDKEngine.setActivityNavBarSetter(null);
        }
        getActivity().finish();
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
        if (!WXEnvironment.isSupport()) {
            tgh.b(TAG, "WXEnvironment.isSupport() == false");
            getActivity().finish();
        }
    }

    public void p2(VesselType vesselType, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f55ed11", new Object[]{this, vesselType, str, obj});
            return;
        }
        this.d = vesselType;
        if (vesselType == null) {
            this.d = uyv.m(str);
        }
        this.f7073a = str;
        this.c = obj;
        VesselView vesselView = this.j;
        if (vesselView != null) {
            vesselView.loadUrl(vesselType, str, obj);
        }
    }

    public void r2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89757c7a", new Object[]{this, str});
        } else {
            s2(str, null);
        }
    }

    public void s2(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b60501d6", new Object[]{this, str, obj});
        } else {
            p2(null, str, obj);
        }
    }

    public final void v2() {
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

    public final void z2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e76bf7c9", new Object[]{this});
            return;
        }
        this.h = null;
        this.e = null;
    }
}
