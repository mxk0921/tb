package com.taobao.android.weex.instance;

import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alipay.sdk.sys.BizContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.bridge.WeexPlatformInstanceBridge;
import com.taobao.android.weex.config.WeexApmCustomData;
import com.taobao.android.weex_framework.performance.WMInstanceApm;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import tb.dwh;
import tb.f9x;
import tb.g6x;
import tb.ice;
import tb.q6x;
import tb.r6x;
import tb.t2o;
import tb.tvh;
import tb.u8x;
import tb.x8x;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WeexDOMInstance extends WeexInstanceImpl implements r6x {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String KEY_WEEX_PERFORMANCE_BIZ_DATA_SPAN = "key_weex_performance_biz_data_span";
    private static final String KEY_WEEX_PERFORMANCE_STANDARD_DATA_SPAN = "key_weex_performance_standard_data_span";
    private r6x.a mCreateWidgetComponentListener;
    private boolean mDisableAPMCallback;
    private boolean mIsRegisterAPMTrack;
    private View.OnAttachStateChangeListener mOnAttachStateChangeListener;
    private final x8x mUnicornExtend;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements View.OnAttachStateChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d337638", new Object[]{this, view});
                return;
            }
            u8x.a("WeexFirstAttachRootView");
            WeexDOMInstance.access$000(WeexDOMInstance.this);
            WeexDOMInstance.access$100(WeexDOMInstance.this);
            WeexDOMInstance.access$200(WeexDOMInstance.this).T();
            u8x.b("WeexFirstAttachRootView");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f64d55b", new Object[]{this, view});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements ice {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public HashMap<String, String> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HashMap) ipChange.ipc$dispatch("a86eae7d", new Object[]{this});
            }
            if (WeexDOMInstance.access$300(WeexDOMInstance.this)) {
                dwh.e("WeexFirstScreenInfoAsync disabled, no first-screen");
                return new HashMap<>();
            }
            dwh.e("WeexFirstScreenInfoAsync start");
            try {
                JSONObject jSONObject = WeexDOMInstance.access$200(WeexDOMInstance.this).I().get(5L, TimeUnit.SECONDS).getJSONObject("first-screen");
                if (jSONObject != null) {
                    HashMap<String, String> hashMap = new HashMap<>();
                    for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                        hashMap.put(entry.getKey(), jSONObject.getString(entry.getKey()));
                    }
                    return hashMap;
                }
                dwh.v("WeexFirstScreenInfoAsync fail, no first-screen");
                return new HashMap<>();
            } catch (Throwable unused) {
                dwh.v("WeexFirstScreenInfoAsync fail, return empty map");
                return new HashMap<>();
            }
        }
    }

    static {
        t2o.a(982515917);
        t2o.a(982515885);
    }

    public WeexDOMInstance(g6x g6xVar) {
        super(g6xVar);
        Boolean bool;
        this.mDisableAPMCallback = false;
        this.mUnicornExtend = new x8x(this, g6xVar.k, g6xVar.l, g6xVar.i);
        try {
            JSONObject jSONObject = g6xVar.h;
            if (jSONObject != null && jSONObject.containsKey(BizContext.KEY_SETTING_FILTER) && (bool = g6xVar.h.getJSONObject(BizContext.KEY_SETTING_FILTER).getBoolean("enable-no-rum-finish-in-disappear")) != null && bool.booleanValue()) {
                this.mDisableAPMCallback = true;
            }
        } catch (Exception e) {
            dwh.i(e);
        }
    }

    public static /* synthetic */ void access$000(WeexDOMInstance weexDOMInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d8f7b4f", new Object[]{weexDOMInstance});
        } else {
            weexDOMInstance.registerCrashTrack();
        }
    }

    public static /* synthetic */ void access$100(WeexDOMInstance weexDOMInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63238450", new Object[]{weexDOMInstance});
        } else {
            weexDOMInstance.onWindowAttached();
        }
    }

    public static /* synthetic */ x8x access$200(WeexDOMInstance weexDOMInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x8x) ipChange.ipc$dispatch("ea2043a", new Object[]{weexDOMInstance});
        }
        return weexDOMInstance.mUnicornExtend;
    }

    public static /* synthetic */ boolean access$300(WeexDOMInstance weexDOMInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae4b9656", new Object[]{weexDOMInstance})).booleanValue();
        }
        return weexDOMInstance.mDisableAPMCallback;
    }

    public static WeexDOMInstance create(g6x g6xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexDOMInstance) ipChange.ipc$dispatch("9c167d5d", new Object[]{g6xVar});
        }
        WeexDOMInstance weexDOMInstance = new WeexDOMInstance(g6xVar);
        WeexInstanceImpl.postInstanceCreate(weexDOMInstance, g6xVar.n);
        return weexDOMInstance;
    }

    public static WeexDOMInstance createEmbed(g6x g6xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexDOMInstance) ipChange.ipc$dispatch("7bf1a2fc", new Object[]{g6xVar});
        }
        WeexDOMInstance weexDOMInstance = new WeexDOMInstance(g6xVar);
        WeexInstanceImpl.postInstanceCreate(weexDOMInstance, new tvh(g6xVar.c, null));
        return weexDOMInstance;
    }

    private long generateUptimeFromCurrentTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("93a91012", new Object[]{this, new Long(j)})).longValue();
        }
        if (j > 0) {
            return (SystemClock.uptimeMillis() - System.currentTimeMillis()) + j;
        }
        return 0L;
    }

    public static /* synthetic */ Object ipc$super(WeexDOMInstance weexDOMInstance, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2088493082:
                super.onViewDisappear();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1265876613:
                super.onActivityStart();
                return null;
            case -507069837:
                super.onInitCalled();
                return null;
            case -475248713:
                super.onActivityStop();
                return null;
            case 51270883:
                super.updateScreenSize(((Number) objArr[0]).floatValue(), ((Number) objArr[1]).floatValue(), ((Number) objArr[2]).floatValue());
                return null;
            case 397619558:
                return super.getRootView();
            case 474982114:
                super.onActivityResume();
                return null;
            case 743373420:
                return super.getExtend((Class) objArr[0]);
            case 939513102:
                super.onDestroyStart();
                return null;
            case 1073542112:
                super.onViewAppear();
                return null;
            case 1400366827:
                super.reportUnicornScreenInfo((JSONObject) objArr[0]);
                return null;
            case 1692842255:
                super.onActivityPause();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex/instance/WeexDOMInstance");
        }
    }

    private void loadRecordView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7344daa3", new Object[]{this});
        }
    }

    private void onWindowAttached() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c95087a", new Object[]{this});
        } else if (!this.mIsRegisterAPMTrack && this.mApmExtend != null) {
            JSONObject jSONObject = new JSONObject();
            Object h = getInstanceConfig().h();
            if (h == null) {
                h = "";
            }
            jSONObject.put("embedMode", h);
            jSONObject.put("bundleUrl", (Object) getBundleUrl());
            this.mApmExtend.d(getInstanceId(), getRootView(), jSONObject, getInstanceConfig().c(), new b());
            this.mIsRegisterAPMTrack = true;
            loadRecordView();
        }
    }

    public static void preloadClass() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13781df6", new Object[0]);
        }
    }

    private void registerCrashTrack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4acee1ee", new Object[]{this});
        } else {
            this.mUnicornExtend.j0();
        }
    }

    @Override // tb.r6x
    public void createWidgetComponent(int i, HashMap<String, String> hashMap) {
        r6x.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("900c0454", new Object[]{this, new Integer(i), hashMap});
        } else if (!isDestroyed() && (aVar = this.mCreateWidgetComponentListener) != null) {
            aVar.createWidgetComponent(i, hashMap);
        }
    }

    @Override // tb.r6x
    public void destroyWidgetComponent(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c7beafd", new Object[]{this, new Integer(i)});
            return;
        }
        r6x.a aVar = this.mCreateWidgetComponentListener;
        if (aVar != null) {
            aVar.destroyWidgetComponent(i);
        }
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl, com.taobao.android.weex.WeexInstance
    public <T> T getExtend(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("2c4efa6c", new Object[]{this, cls});
        }
        if (cls == q6x.class) {
            return (T) this.mUnicornExtend;
        }
        if (cls == r6x.class) {
            return this;
        }
        return (T) super.getExtend(cls);
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl, com.taobao.android.weex.WeexInstance
    public View getRootView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("17b33166", new Object[]{this});
        }
        View rootView = super.getRootView();
        if (this.mOnAttachStateChangeListener == null) {
            u8x.a("WeexFirstGetRootView");
            if (rootView.isAttachedToWindow()) {
                u8x.a("WeexFirstAttachRootView");
                registerCrashTrack();
                onWindowAttached();
                u8x.b("WeexFirstAttachRootView");
            }
            a aVar = new a();
            this.mOnAttachStateChangeListener = aVar;
            rootView.addOnAttachStateChangeListener(aVar);
            u8x.b("WeexFirstGetRootView");
        }
        return rootView;
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl, com.taobao.android.weex.WeexInstance
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
            return;
        }
        super.onActivityPause();
        this.mUnicornExtend.O();
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl, com.taobao.android.weex.WeexInstance
    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
            return;
        }
        super.onActivityResume();
        this.mUnicornExtend.P();
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl, com.taobao.android.weex.WeexInstance
    public void onActivityStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b48c417b", new Object[]{this});
            return;
        }
        super.onActivityStart();
        this.mUnicornExtend.Q();
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl, com.taobao.android.weex.WeexInstance
    public void onActivityStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ac47b7", new Object[]{this});
            return;
        }
        super.onActivityStop();
        this.mUnicornExtend.R();
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.mUnicornExtend.S();
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl
    public void onDestroyStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37ffd50e", new Object[]{this});
        } else {
            super.onDestroyStart();
        }
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl
    public void onInitCalled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1c6ba73", new Object[]{this});
            return;
        }
        super.onInitCalled();
        if (getRootViewWithoutCreate() != null && getRootViewWithoutCreate().isAttachedToWindow()) {
            this.mUnicornExtend.j0();
        }
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl, com.taobao.android.weex.WeexInstance
    public void onViewAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ffcf3e0", new Object[]{this});
            return;
        }
        super.onViewAppear();
        this.mUnicornExtend.U();
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl, com.taobao.android.weex.WeexInstance
    public void onViewDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83841fe6", new Object[]{this});
            return;
        }
        super.onViewDisappear();
        this.mUnicornExtend.V();
    }

    public void registerCSSRuleInJSThread(String str, WeexValue weexValue) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8085767", new Object[]{this, str, weexValue});
        } else if (!isDestroyed()) {
            if (Looper.myLooper() != getJSThreadHandler().getLooper()) {
                z = false;
            }
            f9x.a(z);
            WeexPlatformInstanceBridge.registerCSSRuleInJSThread(this.mNativePtr, str, weexValue);
        }
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl
    public void reportUnicornScreenInfo(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5377e6eb", new Object[]{this, jSONObject});
            return;
        }
        super.reportUnicornScreenInfo(jSONObject);
        if (jSONObject != null) {
            HashMap<String, String> hashMap = new HashMap<>();
            for (String str : jSONObject.keySet()) {
                hashMap.put(str, jSONObject.getString(str));
            }
            this.mUnicornExtend.d0(this.mApmExtend, hashMap, getBundleUrl());
        }
    }

    @Override // tb.r6x
    public void setCreateWidgetComponentListener(r6x.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3ab077", new Object[]{this, aVar});
        } else {
            this.mCreateWidgetComponentListener = aVar;
        }
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl, com.taobao.android.weex.WeexInstance
    public void setWeexApmCustomData(WeexApmCustomData weexApmCustomData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4043a86", new Object[]{this, weexApmCustomData});
        } else if (this.mApmExtend != null && weexApmCustomData != null) {
            if (weexApmCustomData.getWxCustomStartTimeStamp() > 0) {
                this.mApmExtend.a(WMInstanceApm.KEY_PAGE_STAGES_CUSTOM_START_TIME, weexApmCustomData.getWxCustomStartTimeStamp());
                this.mApmExtend.e(getInstanceId(), WMInstanceApm.KEY_PAGE_STAGES_CUSTOM_START_TIME, generateUptimeFromCurrentTime(weexApmCustomData.getWxCustomStartTimeStamp()));
            }
            if (weexApmCustomData.getWxCustomContainerStartTimeStamp() > 0) {
                this.mApmExtend.a(WMInstanceApm.KEY_PAGE_STAGES_STANDARD_CONTAINER_START, weexApmCustomData.getWxCustomContainerStartTimeStamp());
            }
            if (!TextUtils.isEmpty(weexApmCustomData.getWxRumPageType())) {
                this.mApmExtend.b(WMInstanceApm.KEY_PAGE_PROPERTIES_RUM_PAGE_TYPE, weexApmCustomData.getWxRumPageType());
            }
        }
    }

    @Override // com.taobao.android.weex.WeexInstanceImpl
    public void updateScreenSize(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30e54e3", new Object[]{this, new Float(f), new Float(f2), new Float(f3)});
            return;
        }
        super.updateScreenSize(f, f2, f3);
        this.mUnicornExtend.k0(f, f2);
    }
}
