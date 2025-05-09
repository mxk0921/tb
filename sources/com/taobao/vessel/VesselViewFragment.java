package com.taobao.vessel;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.vessel.utils.VesselType;
import com.taobao.vessel.weex.VesselWeexView;
import com.taobao.weex.WXSDKEngine;
import tb.d4w;
import tb.heb;
import tb.hqj;
import tb.t2o;
import tb.uyv;
import tb.zal;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class VesselViewFragment extends Fragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG = VesselView.class.getSimpleName();
    public Object d;
    public VesselType e;
    public heb g;
    public View h;

    /* renamed from: a  reason: collision with root package name */
    public VesselView f14093a = null;
    public String c = null;
    public final boolean f = true;

    static {
        t2o.a(967835656);
    }

    public static /* synthetic */ Object ipc$super(VesselViewFragment vesselViewFragment, String str, Object... objArr) {
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
            case -1010986463:
                super.setUserVisibleHint(((Boolean) objArr[0]).booleanValue());
                return null;
            case 462397159:
                super.onDestroyView();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/vessel/VesselViewFragment");
        }
    }

    public static VesselViewFragment r2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VesselViewFragment) ipChange.ipc$dispatch("2db75a18", new Object[0]);
        }
        return new VesselViewFragment();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        TLog.logd(TAG, "onCreateView");
        if (this.f14093a == null) {
            this.f14093a = new VesselView(getActivity());
        }
        this.h = this.f14093a;
        s2();
        if (this.e == null) {
            this.e = VesselType.Weex;
        }
        if (!TextUtils.isEmpty(this.c)) {
            this.f14093a.loadUrl(this.e, this.c, this.d);
        } else if (!TextUtils.isEmpty(null)) {
            this.f14093a.loadData(this.e, null);
        }
        return this.h;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        u2();
        if (WXSDKEngine.getActivityNavBarSetter() != null && (WXSDKEngine.getActivityNavBarSetter() instanceof hqj)) {
            WXSDKEngine.setActivityNavBarSetter(null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
            return;
        }
        super.onDestroyView();
        VesselView vesselView = this.f14093a;
        if (vesselView != null) {
            vesselView.setVisibility(8);
            this.f14093a.removeAllViews();
            this.f14093a.onDestroy();
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
        VesselView vesselView = this.f14093a;
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
        if (d4w.c().b() != null) {
            this.g = d4w.c().b();
        } else {
            this.g = new hqj(getActivity());
        }
        WXSDKEngine.setActivityNavBarSetter(this.g);
        VesselView vesselView = this.f14093a;
        if (vesselView != null) {
            vesselView.onResume();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80049e8d", new Object[]{this, bundle});
            return;
        }
        super.onSaveInstanceState(bundle);
        TLog.logd(TAG, "onSaveInstanceState");
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        VesselView vesselView = this.f14093a;
        if (vesselView != null) {
            vesselView.onStart();
        }
    }

    public void p2(VesselType vesselType, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f55ed11", new Object[]{this, vesselType, str, obj});
            return;
        }
        this.e = vesselType;
        if (vesselType == null) {
            this.e = uyv.m(str);
        }
        this.c = str;
        this.d = obj;
        VesselView vesselView = this.f14093a;
        if (vesselView != null) {
            vesselView.loadUrl(vesselType, str, obj);
        }
    }

    public final void s2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8578757e", new Object[]{this});
            return;
        }
        VesselView vesselView = this.f14093a;
        if (vesselView != null) {
            vesselView.setShowLoading(false);
            this.f14093a.setDowngradeEnable(this.f);
            this.f14093a.setDowngradeUrl(null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        VesselWeexView vesselWeexView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3bd9221", new Object[]{this, new Boolean(z)});
            return;
        }
        super.setUserVisibleHint(z);
        if (!zal.d()) {
            VesselView vesselView = this.f14093a;
            if (vesselView == null || vesselView.getChildProxyView() == null || !(this.f14093a.getChildProxyView() instanceof VesselWeexView)) {
                vesselWeexView = null;
            } else {
                vesselWeexView = (VesselWeexView) this.f14093a.getChildProxyView();
            }
            if (z && vesselWeexView != null) {
                vesselWeexView.onAppear();
            } else if (!z && vesselWeexView != null) {
                vesselWeexView.onDisappear();
            }
        }
    }

    public final void u2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e76bf7c9", new Object[]{this});
        }
    }
}
