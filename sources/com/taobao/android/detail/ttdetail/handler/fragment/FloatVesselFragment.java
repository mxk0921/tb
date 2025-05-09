package com.taobao.android.detail.ttdetail.handler.fragment;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.widget.RoundRelativeLayout;
import com.taobao.schedule.ViewProxy;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import com.taobao.vessel.VesselView;
import com.taobao.vessel.utils.VesselType;
import com.taobao.vessel.weex.VesselWeexView;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKEngine;
import java.util.Map;
import tb.cbo;
import tb.d4w;
import tb.hqj;
import tb.i4w;
import tb.jov;
import tb.nj7;
import tb.t2o;
import tb.tgh;
import tb.tq4;
import tb.uyv;
import tb.ze7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class FloatVesselFragment extends FloatFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "FloatVesselFragment";
    public static final String VESSEL_METHOD_MAP_KEY = "method";
    public static final String VESSEL_METHOD_NAME_ADDRESS_CHANGED = "addressChanged";
    public static final String VESSEL_METHOD_NAME_CLOSE_PAGE = "close_page";
    public static final String VESSEL_METHOD_NAME_GET_NODE_BUNDLE = "get_detail_data";
    public String B;
    public String C;
    public ze7 D;
    public Object r;
    public VesselType s;
    public i4w t;
    public hqj v;
    public View w;
    public LinearLayout x;
    public FrameLayout y;
    public View z;
    public VesselView p = null;
    public String q = null;
    public final boolean u = true;
    public boolean A = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements i4w {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.i4w
        public void u2(Map<String, Object> map, cbo cboVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aef7dc0c", new Object[]{this, map, cboVar});
            } else {
                FloatVesselFragment.D2(FloatVesselFragment.this, map, cboVar);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                FloatVesselFragment.this.E2();
            }
        }
    }

    static {
        t2o.a(912261994);
    }

    public static /* synthetic */ void D2(FloatVesselFragment floatVesselFragment, Map map, cbo cboVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1adcd6f1", new Object[]{floatVesselFragment, map, cboVar});
        } else {
            floatVesselFragment.M2(map, cboVar);
        }
    }

    public static /* synthetic */ Object ipc$super(FloatVesselFragment floatVesselFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2147180915:
                super.onSaveInstanceState((Bundle) objArr[0]);
                return null;
            case -1589549411:
                super.onAttach((Context) objArr[0]);
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 462397159:
                super.onDestroyView();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 2089880052:
                super.onDismiss((DialogInterface) objArr[0]);
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/handler/fragment/FloatVesselFragment");
        }
    }

    public void E2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0c72aaa", new Object[]{this});
            return;
        }
        r2(this.h);
        A2();
    }

    public final float J2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a189b96f", new Object[]{this, str})).floatValue();
        }
        if (z2()) {
            return 1.0f;
        }
        if ("high".equals(str)) {
            return 0.8f;
        }
        if ("medium".equals(str)) {
            return 0.6f;
        }
        return "short".equals(str) ? 0.4f : 0.0f;
    }

    public void K2(VesselType vesselType, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f55ed11", new Object[]{this, vesselType, str, obj});
            return;
        }
        this.s = vesselType;
        if (vesselType == null) {
            this.s = uyv.m(str);
        }
        this.q = str;
        this.r = obj;
        VesselView vesselView = this.p;
        if (vesselView != null) {
            vesselView.loadUrl(vesselType, str, obj);
        }
        this.t = new a();
    }

    public final void M2(Map<String, Object> map, cbo cboVar) {
        ze7 ze7Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14e7e716", new Object[]{this, map, cboVar});
        } else if (map != null && map.containsKey("method")) {
            Object obj = map.get("method");
            if (obj instanceof String) {
                String str = (String) obj;
                if ("close_page".equals(str)) {
                    r2(this.h);
                    A2();
                } else if (VESSEL_METHOD_NAME_ADDRESS_CHANGED.equals(str)) {
                    Object obj2 = map.get("addressId");
                    if (obj2 != null && !obj2.equals(this.B)) {
                        this.B = obj2.toString();
                    } else {
                        return;
                    }
                }
                if (VESSEL_METHOD_NAME_GET_NODE_BUNDLE.equals(str) && cboVar != null && (ze7Var = this.D) != null) {
                    cboVar.invoke(ze7Var.e().j());
                }
            }
        }
    }

    public final void N2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8578757e", new Object[]{this});
            return;
        }
        VesselView vesselView = this.p;
        if (vesselView != null) {
            i4w i4wVar = this.t;
            if (i4wVar != null) {
                vesselView.setVesselViewCallback(i4wVar);
            }
            this.p.setShowLoading(false);
            this.p.setDowngradeEnable(this.u);
            this.p.setDowngradeUrl(null);
        }
    }

    public final void O2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e76bf7c9", new Object[]{this});
        } else {
            this.t = null;
        }
    }

    public void Q2(ze7 ze7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6da58e47", new Object[]{this, ze7Var});
        } else {
            this.D = ze7Var;
        }
    }

    public void R2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ea25738", new Object[]{this, str});
        }
    }

    public final void S2(View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37b5e7f9", new Object[]{this, view, new Float(f)});
            return;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = f;
        view.setLayoutParams(layoutParams);
    }

    public void T2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("850e5aad", new Object[]{this, str});
        } else {
            this.C = str;
        }
    }

    public final void U2(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ef1e29d", new Object[]{this, obj});
        } else if (obj != null) {
            try {
                float J2 = J2(JSON.parseObject(String.valueOf(obj)).getString("weight_level"));
                if (J2 != 0.0f) {
                    S2(this.i, J2);
                    S2(this.x, 1.0f - J2);
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a141669d", new Object[]{this, context});
        } else {
            super.onAttach(context);
        }
    }

    @Override // com.taobao.android.detail.ttdetail.handler.fragment.FloatFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        try {
            Bundle arguments = getArguments();
            if (arguments != null) {
                this.A = arguments.getBoolean("full_screen_mode", false);
            }
        } catch (Throwable th) {
            tgh.c(TAG, "onCreate#getBoolean", th);
        }
    }

    @Override // com.taobao.android.detail.ttdetail.handler.fragment.FloatFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.tt_detail_float_vessel_fragment, (ViewGroup) null);
        this.z = inflate;
        this.h = inflate.findViewById(R.id.ll_container);
        if (z2()) {
            this.h.setBackgroundColor(-1);
            this.h.setPadding(0, SystemBarDecorator.SystemBarConfig.getStatusBarHeight(tq4.c(this)), 0, 0);
        }
        this.i = (RelativeLayout) this.z.findViewById(R.id.rl_panel);
        this.y = (FrameLayout) this.z.findViewById(R.id.detail_fl_weex);
        this.x = (LinearLayout) this.z.findViewById(R.id.tm_detail_background);
        try {
            if (this.A) {
                this.h.setBackground(null);
                this.i.setBackground(null);
            }
        } catch (Throwable th) {
            tgh.c(TAG, "onCreateView setBackground", th);
        }
        if (!this.A) {
            U2(this.r);
        } else {
            this.x.setVisibility(8);
            RelativeLayout relativeLayout = this.i;
            if (relativeLayout instanceof RoundRelativeLayout) {
                ((RoundRelativeLayout) relativeLayout).setRadius(0.0f);
            }
        }
        if (this.p == null) {
            this.p = new VesselView(getActivity());
        }
        this.w = this.p;
        N2();
        if (this.s == null) {
            this.s = VesselType.Weex;
        }
        try {
            if (!TextUtils.isEmpty(this.q)) {
                this.p.loadUrl(this.s, this.q, this.r);
            } else {
                this.p.loadData(this.s, null);
            }
            if (nj7.h()) {
                View childProxyView = this.p.getChildProxyView();
                if (childProxyView instanceof VesselWeexView) {
                    ((VesselWeexView) childProxyView).setAutoResize(true);
                }
            }
        } catch (Throwable unused) {
            jov.k(tq4.c(this), this.q);
        }
        this.y.addView(this.w);
        return this.z;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        O2();
        d4w.c().a();
        if (WXSDKEngine.getActivityNavBarSetter() != null && (WXSDKEngine.getActivityNavBarSetter() instanceof hqj)) {
            WXSDKEngine.setActivityNavBarSetter(null);
        }
        VesselView vesselView = this.p;
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
        VesselView vesselView = this.p;
        if (vesselView != null) {
            vesselView.setVisibility(8);
            this.p.removeAllViews();
            this.p.onDestroy();
        }
        String str = this.B;
        if (str != null && !TextUtils.equals(str, this.C)) {
            Intent intent = new Intent();
            intent.setAction("com.taobao.sku.intent.action.updateData");
            intent.putExtra("addressId", this.B);
            ze7 ze7Var = this.D;
            if (ze7Var != null) {
                intent.putExtra("skuToken", ze7Var.i().b());
                intent.putExtra("originalItemId", (String) this.D.i().c("requestItemId"));
            }
            intent.addCategory("android.intent.category.DEFAULT");
            LocalBroadcastManager.getInstance(this.d).sendBroadcast(intent);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
        } else {
            super.onDismiss(dialogInterface);
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
        VesselView vesselView = this.p;
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
        if (this.v == null) {
            this.v = new hqj(getActivity());
        }
        WXSDKEngine.setActivityNavBarSetter(this.v);
        VesselView vesselView = this.p;
        if (vesselView != null) {
            vesselView.onResume();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80049e8d", new Object[]{this, bundle});
        } else {
            super.onSaveInstanceState(bundle);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        VesselView vesselView = this.p;
        if (vesselView != null) {
            vesselView.onStart();
        }
    }

    @Override // com.taobao.android.detail.ttdetail.handler.fragment.FloatFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        ViewProxy.setOnClickListener(this.h, new b());
        if (!this.A) {
            p2(this.h);
            B2();
        }
        if (!WXEnvironment.isCPUSupport()) {
            tgh.b(TAG, "WXEnvironment.isSupport() == false");
        }
    }
}
