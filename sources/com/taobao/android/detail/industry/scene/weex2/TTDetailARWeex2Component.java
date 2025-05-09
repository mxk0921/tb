package com.taobao.android.detail.industry.scene.weex2;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.industry.ablility.views.ARMakeupNativeView;
import com.taobao.android.detail.industry.scene.weex2.ar.ARMakeupWeexView;
import com.taobao.android.detail.industry.widget.ScrollFrameLayout;
import com.taobao.android.detail.ttdetail.component.module.DataEntry;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.android.weex_framework.MUSInstanceConfig;
import com.taobao.android.weex_framework.b;
import com.taobao.taobao.R;
import tb.h9z;
import tb.kpc;
import tb.mte;
import tb.nb4;
import tb.t2o;
import tb.ze7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TTDetailARWeex2Component extends mte {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String EVENT_NAME_LIFE_CYCLE = "lifecycle";
    private static final String KEY_FIELDS_PARAMS = "params";
    private static final String KEY_FIELDS_PARAMS_BRIDGE_DATA = "bridgeData";
    private static final String KEY_FIELDS_PARAMS_BRIDGE_DATA_WEEX_URL = "weexUrl";
    private static final String KEY_FIELDS_URL = "url";
    private static final String MODULE_NAME = "detailIndustry";
    private static final String PLATFORM_VIEW_NAME = "armakeup";
    private static final String WEXX_EVENT_MODULE = "detailWeex2";
    private ARMakeupNativeView mARMakeupNativeView;
    private volatile boolean mHasRender;
    private com.taobao.android.weex_framework.a mMUSInstance;
    private View mWeexContentView;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements kpc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.kpc
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1414cfeb", new Object[]{this, view});
                return;
            }
            TTDetailARWeex2Component.access$002(TTDetailARWeex2Component.this, view);
            if (TTDetailARWeex2Component.access$100(TTDetailARWeex2Component.this) != null) {
                TTDetailARWeex2Component.access$200(TTDetailARWeex2Component.this);
            }
        }
    }

    static {
        t2o.a(440401997);
    }

    public TTDetailARWeex2Component(Context context, ze7 ze7Var, nb4 nb4Var, DataEntry... dataEntryArr) {
        super(context, ze7Var, nb4Var, dataEntryArr);
        MUSEngine.registerPlatformView("armakeup", ARMakeupWeexView.class);
        ARMakeupNativeView aRMakeupNativeView = new ARMakeupNativeView(context);
        this.mARMakeupNativeView = aRMakeupNativeView;
        aRMakeupNativeView.setId(R.id.industry_ar_weex2_tt_detail_native_make_up_view);
        this.mARMakeupNativeView.setTag(this);
        MUSInstanceConfig mUSInstanceConfig = new MUSInstanceConfig();
        mUSInstanceConfig.B(true);
        mUSInstanceConfig.t(MUSInstanceConfig.MUSRenderType.MUSRenderTypeUnicorn);
        mUSInstanceConfig.y(MUSInstanceConfig.RenderMode.texture);
        mUSInstanceConfig.v(false);
        mUSInstanceConfig.u(new a());
        this.mMUSInstance = b.f().c(this.mContext, mUSInstanceConfig);
    }

    public static /* synthetic */ View access$002(TTDetailARWeex2Component tTDetailARWeex2Component, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e90c68e1", new Object[]{tTDetailARWeex2Component, view});
        }
        tTDetailARWeex2Component.mWeexContentView = view;
        return view;
    }

    public static /* synthetic */ ScrollFrameLayout access$100(TTDetailARWeex2Component tTDetailARWeex2Component) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScrollFrameLayout) ipChange.ipc$dispatch("d11208a0", new Object[]{tTDetailARWeex2Component});
        }
        return tTDetailARWeex2Component.mContentContainer;
    }

    public static /* synthetic */ void access$200(TTDetailARWeex2Component tTDetailARWeex2Component) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ef9013", new Object[]{tTDetailARWeex2Component});
        } else {
            tTDetailARWeex2Component.addContentView();
        }
    }

    private void addContentView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6d9bd64", new Object[]{this});
        } else if (this.mContentContainer.getChildAt(0) != this.mARMakeupNativeView || this.mContentContainer.getChildAt(1) != this.mWeexContentView) {
            this.mContentContainer.removeAllViews();
            this.mContentContainer.addView(this.mARMakeupNativeView, new FrameLayout.LayoutParams(-1, -1, 17));
            this.mContentContainer.addView(this.mWeexContentView, new FrameLayout.LayoutParams(-1, -1, 17));
        }
    }

    private JSONObject getInitRenderData() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("448fed2d", new Object[]{this});
        }
        JSONObject f = this.mComponentData.f();
        if (f == null || (jSONObject = f.getJSONObject("params")) == null) {
            return null;
        }
        return jSONObject.getJSONObject("bridgeData");
    }

    private String getWeexUrl() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b9b36c81", new Object[]{this});
        }
        JSONObject f = this.mComponentData.f();
        if (f == null) {
            return null;
        }
        JSONObject jSONObject2 = f.getJSONObject("params");
        if (!(jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("bridgeData")) == null)) {
            String string = jSONObject.getString(KEY_FIELDS_PARAMS_BRIDGE_DATA_WEEX_URL);
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
        }
        return f.getString("url");
    }

    public static /* synthetic */ Object ipc$super(TTDetailARWeex2Component tTDetailARWeex2Component, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1978560141:
                super.onActivityPageResumed((Activity) objArr[0]);
                return null;
            case -1898152289:
                super.onComponentExpand();
                return null;
            case -1857981988:
                super.onDidAppear();
                return null;
            case -1634521564:
                super.onActivityPagePaused((Activity) objArr[0]);
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case 413640386:
                super.onCreate();
                return null;
            case 502306446:
                super.onComponentShrink();
                return null;
            case 1252518699:
                super.onDisAppear();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/industry/scene/weex2/TTDetailARWeex2Component");
        }
    }

    private void renderUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0ab7c00", new Object[]{this});
        } else if (!this.mHasRender) {
            this.mMUSInstance.initWithURL(Uri.parse(getWeexUrl()));
            this.mMUSInstance.render(getInitRenderData(), null);
            this.mHasRender = true;
        }
    }

    @Override // tb.mte
    public void onActivityPagePaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e932e24", new Object[]{this, activity});
            return;
        }
        super.onActivityPagePaused(activity);
        if (activity == this.mContext) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(EVENT_NAME_LIFE_CYCLE, (Object) "onPause");
            this.mMUSInstance.fireEvent(1, WEXX_EVENT_MODULE, jSONObject);
        }
    }

    @Override // tb.mte
    public void onActivityPageResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a119173", new Object[]{this, activity});
            return;
        }
        super.onActivityPageResumed(activity);
        if (activity == this.mContext) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(EVENT_NAME_LIFE_CYCLE, (Object) "onResume");
            this.mMUSInstance.fireEvent(1, WEXX_EVENT_MODULE, jSONObject);
        }
    }

    @Override // tb.mte
    public void onComponentExpand() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8edc7e9f", new Object[]{this});
            return;
        }
        super.onComponentExpand();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(EVENT_NAME_LIFE_CYCLE, (Object) "onExpend");
        this.mMUSInstance.fireEvent(1, WEXX_EVENT_MODULE, jSONObject);
    }

    @Override // tb.mte
    public void onComponentShrink() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1df0968e", new Object[]{this});
            return;
        }
        super.onComponentShrink();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(EVENT_NAME_LIFE_CYCLE, (Object) "onExpendExit");
        this.mMUSInstance.fireEvent(1, WEXX_EVENT_MODULE, jSONObject);
    }

    @Override // tb.mte, tb.oa4
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        MUSEngine.registerModule(MODULE_NAME, DIWeex2Module.class);
        MUSEngine.registerPlatformView("armakeup", ARMakeupWeexView.class);
    }

    @Override // tb.mte, tb.oa4
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.mMUSInstance.destroy();
    }

    @Override // tb.oa4
    public void onDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914171dc", new Object[]{this});
            return;
        }
        super.onDidAppear();
        renderUrl();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(EVENT_NAME_LIFE_CYCLE, (Object) h9z.EVENT_ON_APPEAR);
        this.mMUSInstance.fireEvent(1, WEXX_EVENT_MODULE, jSONObject);
    }

    @Override // tb.mte, tb.oa4
    public void onDisAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aa7eb2b", new Object[]{this});
            return;
        }
        super.onDisAppear();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(EVENT_NAME_LIFE_CYCLE, (Object) "onDisappear");
        this.mMUSInstance.fireEvent(1, WEXX_EVENT_MODULE, jSONObject);
    }

    @Override // tb.mte
    public void onViewUpdate(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22e7b33e", new Object[]{this, view});
        } else if (this.mWeexContentView != null) {
            addContentView();
        }
    }
}
