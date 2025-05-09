package com.taobao.taolive.room;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.taobao.windvane.embed.BaseEmbedView;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.taobao.windvane.webview.IWVWebView;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.taolive.sdk.adapter.nav.INavInterceptor;
import com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy;
import com.uc.webview.export.extension.EmbedViewConfig;
import com.uc.webview.export.extension.IEmbedViewContainer;
import com.ut.mini.UTAnalytics;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.cwd;
import tb.eau;
import tb.fkx;
import tb.gq0;
import tb.hw0;
import tb.iba;
import tb.jyd;
import tb.pvs;
import tb.rbu;
import tb.sbt;
import tb.t2o;
import tb.u0v;
import tb.u90;
import tb.utk;
import tb.v2s;
import tb.vx9;
import tb.wvs;
import tb.y3s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class H5EmbedView extends BaseEmbedView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int H5EmbedVersion = 1;
    private static final String PARAM_KEY_ACTIVITY = "activity";
    private static final String PARAM_KEY_CUSTOMPLAYCTRLPARAMS = "customPlayCtrlParams";
    private static final String PARAM_KEY_DRAWDELAYED = "drawDelayed";
    private static final String PARAM_KEY_ENABLEHORIZONTALSCROLL = "enableHorizontalScroll";
    private static final String PARAM_KEY_ENABLEVERTICALSCROLL = "enableVerticalScroll";
    private static final String PARAM_KEY_H5UTPAGENAME = "h5UTPageForLive";
    private static final String PARAM_KEY_H5UTPARAMS = "h5UTParamsForLive";
    private static final String PARAM_KEY_HIDECLOSE = "isHideClose";
    private static final String PARAM_KEY_HIDEFULLSCREENBTN = "isHideFullScreenBtn";
    private static final String PARAM_KEY_ISSHOWPRELIVESHAREBTN = "isShowPreLiveShareBtn";
    private static final String PARAM_KEY_LIVEID = "liveId";
    private static final String PARAM_KEY_LIVESOURCE = "livesource";
    private static final String PARAM_KEY_LIVEURL = "liveUrlAndroid";
    private static final String PARAM_KEY_RECOMMENDSOURCE = "recommendSource";
    private static final String PARAM_KEY_SPM = "spmForLive";
    private static final String PARAM_KEY_TOPOFFSET = "topOffSet";
    private static final String TAG = H5EmbedView.class.getSimpleName();
    public static final String VIEW_TYPE = "taoliveroom";
    private static int lastActivityHashCode;
    private String customPlayCtrlParams;
    private int drawDelayed;
    private boolean enableH5EmbedViewH5UT;
    private boolean enableH5EmbedViewUT;
    private boolean isHideClose;
    private boolean isHideFullScreenBtn;
    private boolean isHidePreLiveShareBtn;
    private Activity mActivity;
    private String mBackActivityUrl;
    private boolean mDisableHorizontalScroll;
    private boolean mDisableVerticalScroll;
    private String mH5PageUrl;
    private String mH5UTParams;
    private String mLiveId;
    private String mLiveUrl;
    private String mLivesource;
    private String mRecommendSource;
    private ViewGroup mRootView;
    private String mSpm;
    private jyd mTaoLiveController;
    private int topOffSet;
    private List<WeakReference<Activity>> mActivities = new ArrayList();
    private Application.ActivityLifecycleCallbacks mLifecycleCallbacks = new a();
    private INavInterceptor mInterceptor = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements utk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.utk
        public void onFinish() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("badeed9", new Object[]{this});
            } else {
                WVStandardEventCenter.postNotificationToJS(H5EmbedView.this.webView, "onLiveRoomError", "");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d implements ISmallWindowStrategy {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy
        public void onSmallWindowClick(View view, String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("265e0e99", new Object[]{this, view, str, str2, str3});
                return;
            }
            for (WeakReference weakReference : H5EmbedView.access$200(H5EmbedView.this)) {
                if (!(weakReference == null || weakReference.get() == null || ((Activity) weakReference.get()).isFinishing())) {
                    ((Activity) weakReference.get()).finish();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class e implements u0v {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // tb.u0v
        public void a(Map map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7d459e54", new Object[]{this, map});
            } else if (!H5EmbedView.access$900(H5EmbedView.this)) {
            } else {
                if (H5EmbedView.access$1000(H5EmbedView.this)) {
                    WVStandardEventCenter.postNotificationToJS(H5EmbedView.this.webView, "onUpdateUTProperties", JSON.toJSONString(map));
                    return;
                }
                rbu.l0(null, H5EmbedView.access$000(H5EmbedView.this), "Page_TaobaoLiveWatch");
                rbu.n0(H5EmbedView.access$000(H5EmbedView.this), map);
            }
        }
    }

    static {
        t2o.a(779092736);
    }

    public static /* synthetic */ Activity access$000(H5EmbedView h5EmbedView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("c1332ccf", new Object[]{h5EmbedView});
        }
        return h5EmbedView.mActivity;
    }

    public static /* synthetic */ void access$100(H5EmbedView h5EmbedView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fcad0a2", new Object[]{h5EmbedView, str});
        } else {
            h5EmbedView.logd(str);
        }
    }

    public static /* synthetic */ boolean access$1000(H5EmbedView h5EmbedView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79fb7ae", new Object[]{h5EmbedView})).booleanValue();
        }
        return h5EmbedView.enableH5EmbedViewH5UT;
    }

    public static /* synthetic */ List access$200(H5EmbedView h5EmbedView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2dbb2730", new Object[]{h5EmbedView});
        }
        return h5EmbedView.mActivities;
    }

    public static /* synthetic */ jyd access$300(H5EmbedView h5EmbedView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jyd) ipChange.ipc$dispatch("e42d7595", new Object[]{h5EmbedView});
        }
        return h5EmbedView.mTaoLiveController;
    }

    public static /* synthetic */ ViewGroup access$400(H5EmbedView h5EmbedView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("e8e26d80", new Object[]{h5EmbedView});
        }
        return h5EmbedView.mRootView;
    }

    public static /* synthetic */ void access$500(H5EmbedView h5EmbedView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29a7d254", new Object[]{h5EmbedView});
        } else {
            h5EmbedView.initController();
        }
    }

    public static /* synthetic */ void access$600(H5EmbedView h5EmbedView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec943bb3", new Object[]{h5EmbedView});
        } else {
            h5EmbedView.trackResume();
        }
    }

    public static /* synthetic */ INavInterceptor access$700(H5EmbedView h5EmbedView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (INavInterceptor) ipChange.ipc$dispatch("e8b98f5d", new Object[]{h5EmbedView});
        }
        return h5EmbedView.mInterceptor;
    }

    public static /* synthetic */ void access$800(H5EmbedView h5EmbedView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("726d0e71", new Object[]{h5EmbedView});
        } else {
            h5EmbedView.trackPause();
        }
    }

    public static /* synthetic */ boolean access$900(H5EmbedView h5EmbedView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("355977d4", new Object[]{h5EmbedView})).booleanValue();
        }
        return h5EmbedView.enableH5EmbedViewUT;
    }

    public static /* synthetic */ Object ipc$super(H5EmbedView h5EmbedView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1164236040:
                return new Boolean(super.init((String) objArr[0], (String) objArr[1], (IWVWebView) objArr[2], (EmbedViewConfig) objArr[3]));
            case -348346713:
                return new Boolean(super.init((String) objArr[0], (String) objArr[1], (IWVWebView) objArr[2], (EmbedViewConfig) objArr[3], (IEmbedViewContainer) objArr[4]));
            case -239223102:
                super.onAttachedToWebView();
                return null;
            case 259963749:
                super.onDetachedFromWebView();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1004220751:
                super.onScrollChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1980158489:
                super.onVisibilityChanged(((Number) objArr[0]).intValue());
                return null;
            case 2111529549:
                super.onParamChanged((String[]) objArr[0], (String[]) objArr[1]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/H5EmbedView");
        }
    }

    private void logd(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f7c0831", new Object[]{this, str});
            return;
        }
        cwd A = v2s.o().A();
        if (A != null) {
            A.b(TAG, str);
        }
    }

    private void trackAttachedToWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146c76d6", new Object[]{this});
        } else if (this.enableH5EmbedViewUT && !this.enableH5EmbedViewH5UT && !TextUtils.isEmpty(this.mH5PageUrl)) {
            eau.e();
            UTAnalytics.getInstance().getDefaultTracker().updatePageStatus(this.mActivity, null);
            rbu.F(this.mActivity);
            if (lastActivityHashCode != this.mActivity.hashCode()) {
                lastActivityHashCode = this.mActivity.hashCode();
            } else {
                rbu.D(null, this.mActivity);
            }
            rbu.B(null, this.mActivity);
            rbu.l0(null, this.mActivity, "Page_TaobaoLiveWatch");
        }
    }

    private void trackControllerInit(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b2fec12", new Object[]{this, str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        hashMap.put("TLiveRoomConfig", str2);
        rbu.Q(19999, "LiveRoomController-Init", hashMap);
    }

    private void trackDetachedFromWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("415fbe79", new Object[]{this});
        } else if (this.enableH5EmbedViewUT && !this.enableH5EmbedViewH5UT && !TextUtils.isEmpty(this.mH5PageUrl)) {
            rbu.D(null, this.mActivity);
            rbu.B(null, this.mActivity);
            Map map = !TextUtils.isEmpty(this.mH5UTParams) ? (Map) fkx.f(this.mH5UTParams, Map.class) : null;
            if (map == null) {
                map = new HashMap();
            }
            map.put("spm-url", "a2141.8001249");
            rbu.l0(null, this.mActivity, this.mH5PageUrl);
            rbu.n0(this.mActivity, map);
            eau.d(this.mActivity, this.mH5PageUrl, this.mH5UTParams);
        }
    }

    private void trackEmbedViewInit(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c3cf6de", new Object[]{this, str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("viewId", str);
        hashMap.put("param", str2);
        rbu.Q(19999, "EmbedView-Init", hashMap);
    }

    private void trackPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d11b3272", new Object[]{this});
        } else if (this.enableH5EmbedViewUT && !this.enableH5EmbedViewH5UT && !TextUtils.isEmpty(this.mH5PageUrl)) {
            rbu.D(null, this.mActivity);
        }
    }

    private void trackResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36aa59df", new Object[]{this});
        } else if (this.enableH5EmbedViewUT && !this.enableH5EmbedViewH5UT && !TextUtils.isEmpty(this.mH5PageUrl)) {
            rbu.B(null, this.mActivity);
            this.mTaoLiveController.H();
        }
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView
    public View generateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7334ca29", new Object[]{this, context});
        }
        logd("generateView " + System.currentTimeMillis());
        jyd jydVar = this.mTaoLiveController;
        if (jydVar == null) {
            TextView textView = new TextView(context);
            textView.setBackgroundColor(-1);
            textView.setText("");
            textView.setTextColor(-65536);
            textView.setTextSize(30.0f);
            textView.setGravity(17);
            WVStandardEventCenter.postNotificationToJS(this.webView, "onLiveRoomError", "");
            return textView;
        }
        if (jydVar.getView() instanceof ViewGroup) {
            this.mRootView = this.mTaoLiveController.getView();
        }
        return this.mTaoLiveController.getView();
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView
    public String getViewType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("35692924", new Object[]{this});
        }
        logd("getViewType " + System.currentTimeMillis());
        return VIEW_TYPE;
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView
    public boolean init(String str, String str2, IWVWebView iWVWebView, EmbedViewConfig embedViewConfig) {
        String str3;
        int i = 0;
        String str4 = "";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba9b2af8", new Object[]{this, str, str2, iWVWebView, embedViewConfig})).booleanValue();
        }
        if (vx9.d() != null) {
            iba.l0(null, vx9.f(vx9.d()));
        }
        if (!sbt.i()) {
            return super.init(str, str2, iWVWebView, embedViewConfig);
        }
        try {
            str3 = JSON.toJSONString(embedViewConfig.mObjectParam);
        } catch (Exception unused) {
            str3 = str4;
        }
        trackEmbedViewInit(String.valueOf(embedViewConfig.mEmbedViewID), str3);
        this.enableH5EmbedViewUT = pvs.a0();
        this.enableH5EmbedViewH5UT = pvs.Z();
        this.mActivity = (Activity) iWVWebView.getContext();
        this.mLiveUrl = embedViewConfig.mObjectParam.containsKey(PARAM_KEY_LIVEURL) ? String.valueOf(embedViewConfig.mObjectParam.get(PARAM_KEY_LIVEURL)) : str4;
        this.mLiveId = embedViewConfig.mObjectParam.containsKey("liveId") ? String.valueOf(embedViewConfig.mObjectParam.get("liveId")) : str4;
        this.mLivesource = embedViewConfig.mObjectParam.containsKey("livesource") ? String.valueOf(embedViewConfig.mObjectParam.get("livesource")) : str4;
        this.mBackActivityUrl = embedViewConfig.mObjectParam.containsKey("activity") ? String.valueOf(embedViewConfig.mObjectParam.get("activity")) : str4;
        this.mDisableHorizontalScroll = true;
        this.mDisableVerticalScroll = !"true".equals(embedViewConfig.mObjectParam.get(PARAM_KEY_ENABLEVERTICALSCROLL));
        this.topOffSet = embedViewConfig.mObjectParam.containsKey(PARAM_KEY_TOPOFFSET) ? (int) Float.parseFloat(String.valueOf(embedViewConfig.mObjectParam.get(PARAM_KEY_TOPOFFSET))) : 0;
        if (embedViewConfig.mObjectParam.containsKey(PARAM_KEY_DRAWDELAYED)) {
            i = (int) Float.parseFloat(String.valueOf(embedViewConfig.mObjectParam.get(PARAM_KEY_DRAWDELAYED)));
        }
        this.drawDelayed = i;
        this.mRecommendSource = embedViewConfig.mObjectParam.containsKey("recommendSource") ? String.valueOf(embedViewConfig.mObjectParam.get("recommendSource")) : str4;
        this.customPlayCtrlParams = embedViewConfig.mObjectParam.containsKey("customPlayCtrlParams") ? String.valueOf(embedViewConfig.mObjectParam.get("customPlayCtrlParams")) : str4;
        this.isHideClose = !"true".equals(embedViewConfig.mObjectParam.get(PARAM_KEY_HIDECLOSE));
        this.isHideFullScreenBtn = !"true".equals(embedViewConfig.mObjectParam.get(PARAM_KEY_HIDEFULLSCREENBTN));
        this.isHidePreLiveShareBtn = true ^ "true".equals(embedViewConfig.mObjectParam.get(PARAM_KEY_ISSHOWPRELIVESHAREBTN));
        this.mH5PageUrl = embedViewConfig.mObjectParam.containsKey(PARAM_KEY_H5UTPAGENAME) ? String.valueOf(embedViewConfig.mObjectParam.get(PARAM_KEY_H5UTPAGENAME)) : str4;
        this.mH5UTParams = embedViewConfig.mObjectParam.containsKey(PARAM_KEY_H5UTPARAMS) ? String.valueOf(embedViewConfig.mObjectParam.get(PARAM_KEY_H5UTPARAMS)) : str4;
        if (embedViewConfig.mObjectParam.containsKey(PARAM_KEY_SPM)) {
            str4 = String.valueOf(embedViewConfig.mObjectParam.get(PARAM_KEY_SPM));
        }
        this.mSpm = str4;
        this.topOffSet = hw0.x(this.topOffSet);
        gq0.g().getApplication().registerActivityLifecycleCallbacks(this.mLifecycleCallbacks);
        v2s.o().v().d(this.mInterceptor);
        initController();
        return super.init(str, str2, iWVWebView, embedViewConfig);
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onAttachedToWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1bdbec2", new Object[]{this});
            return;
        }
        super.onAttachedToWebView();
        logd("onAttachedToWebView " + System.currentTimeMillis());
        if (this.mTaoLiveController != null) {
            trackAttachedToWebView();
            this.mTaoLiveController.onResume();
        }
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView, tb.kpw, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        logd("onDestroy " + System.currentTimeMillis());
        jyd jydVar = this.mTaoLiveController;
        if (jydVar != null) {
            jydVar.onDestroy();
            this.mTaoLiveController = null;
        }
        gq0.g().getApplication().unregisterActivityLifecycleCallbacks(this.mLifecycleCallbacks);
        v2s.o().v().a(this.mInterceptor);
        this.mActivities.clear();
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDetachedFromWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7ebb65", new Object[]{this});
            return;
        }
        super.onDetachedFromWebView();
        logd("onDetachedFromWebView " + System.currentTimeMillis());
        jyd jydVar = this.mTaoLiveController;
        if (jydVar != null) {
            jydVar.onPause();
            this.mTaoLiveController.onStop();
            trackDetachedFromWebView();
        }
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView, com.uc.webview.export.extension.IEmbedViewContainer.OnParamChangedListener
    public void onParamChanged(String[] strArr, String[] strArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ddb624d", new Object[]{this, strArr, strArr2});
            return;
        }
        super.onParamChanged(strArr, strArr2);
        logd("onParamChanged " + Arrays.toString(strArr) + " " + Arrays.toString(strArr2));
    }

    @Override // tb.kpw
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        logd("onPause " + System.currentTimeMillis());
    }

    @Override // tb.kpw
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        logd("onResume " + System.currentTimeMillis());
    }

    @Override // tb.kpw
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bdb314f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            super.onScrollChanged(i, i2, i3, i4);
        }
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView, com.uc.webview.export.extension.IEmbedViewContainer.OnVisibilityChangedListener
    public void onVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7606d219", new Object[]{this, new Integer(i)});
            return;
        }
        super.onVisibilityChanged(i);
        logd("onVisibilityChanged " + i);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
                return;
            }
            H5EmbedView h5EmbedView = H5EmbedView.this;
            H5EmbedView.access$100(h5EmbedView, "onActivityCreated " + activity + " " + H5EmbedView.access$000(H5EmbedView.this));
            H5EmbedView.access$200(H5EmbedView.this).add(new WeakReference(activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
                return;
            }
            H5EmbedView h5EmbedView = H5EmbedView.this;
            H5EmbedView.access$100(h5EmbedView, "onActivityPaused " + activity + " " + H5EmbedView.access$000(H5EmbedView.this));
            if (H5EmbedView.access$000(H5EmbedView.this) != null && H5EmbedView.access$000(H5EmbedView.this).equals(activity)) {
                if (H5EmbedView.access$300(H5EmbedView.this) != null) {
                    H5EmbedView.access$300(H5EmbedView.this).onPause();
                    H5EmbedView.access$800(H5EmbedView.this);
                }
                v2s.o().v().a(H5EmbedView.access$700(H5EmbedView.this));
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
                return;
            }
            H5EmbedView h5EmbedView = H5EmbedView.this;
            H5EmbedView.access$100(h5EmbedView, "onActivityResumed " + activity + " " + H5EmbedView.access$000(H5EmbedView.this));
            if (H5EmbedView.access$000(H5EmbedView.this) != null && H5EmbedView.access$000(H5EmbedView.this).equals(activity)) {
                if (H5EmbedView.access$300(H5EmbedView.this) != null) {
                    H5EmbedView.access$300(H5EmbedView.this).onResume();
                    H5EmbedView.access$600(H5EmbedView.this);
                }
                v2s.o().v().d(H5EmbedView.access$700(H5EmbedView.this));
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
                return;
            }
            H5EmbedView h5EmbedView = H5EmbedView.this;
            H5EmbedView.access$100(h5EmbedView, "onActivityStarted " + activity + " " + H5EmbedView.access$000(H5EmbedView.this));
            if (H5EmbedView.access$000(H5EmbedView.this) != null && H5EmbedView.access$000(H5EmbedView.this).equals(activity) && H5EmbedView.access$300(H5EmbedView.this) != null && H5EmbedView.access$300(H5EmbedView.this).isDestroyed() && H5EmbedView.access$400(H5EmbedView.this) != null) {
                H5EmbedView.access$400(H5EmbedView.this).removeAllViews();
                H5EmbedView.access$500(H5EmbedView.this);
                H5EmbedView.access$400(H5EmbedView.this).addView(H5EmbedView.access$300(H5EmbedView.this).getView());
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
                return;
            }
            H5EmbedView h5EmbedView = H5EmbedView.this;
            H5EmbedView.access$100(h5EmbedView, "onActivityStopped " + activity + " " + H5EmbedView.access$000(H5EmbedView.this));
            if (H5EmbedView.access$000(H5EmbedView.this) != null && H5EmbedView.access$000(H5EmbedView.this).equals(activity) && H5EmbedView.access$300(H5EmbedView.this) != null) {
                H5EmbedView.access$300(H5EmbedView.this).onStop();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
                return;
            }
            H5EmbedView h5EmbedView = H5EmbedView.this;
            H5EmbedView.access$100(h5EmbedView, "onActivityDestroyed " + activity + " " + H5EmbedView.access$000(H5EmbedView.this));
            for (int i = 0; i < H5EmbedView.access$200(H5EmbedView.this).size(); i++) {
                WeakReference weakReference = (WeakReference) H5EmbedView.access$200(H5EmbedView.this).get(i);
                if (!(weakReference == null || weakReference.get() == null || weakReference.get() != activity)) {
                    H5EmbedView.access$200(H5EmbedView.this).remove(weakReference);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements INavInterceptor {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.taolive.sdk.adapter.nav.INavInterceptor
        public boolean onNavIntercept(Context context, String str, Bundle bundle, int i, int i2) {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d49213cb", new Object[]{this, context, str, bundle, new Integer(i), new Integer(i2)})).booleanValue();
            }
            if (!TextUtils.isEmpty(str)) {
                if (!pvs.e3() || ((!str.contains("market.m.taobao.com/app/mtb/app-live-h5-room/home/index.html") && !str.contains("h5.m.taobao.com/taolive/video.html") && !str.contains("huodong.m.taobao.com/act/talent/live.html")) || H5EmbedView.access$300(H5EmbedView.this) == null)) {
                    Intent intentForUri = Nav.from(context).intentForUri(str);
                    if (!(intentForUri == null || intentForUri.getComponent() == null)) {
                        Log.e("H5EmbedView", "onNavIntercept  className = " + intentForUri.getComponent().getClassName());
                        if (!(H5EmbedView.access$000(H5EmbedView.this) == null || H5EmbedView.access$000(H5EmbedView.this).getComponentName() == null || H5EmbedView.access$000(H5EmbedView.this).getComponentName().getClassName() == null || !H5EmbedView.access$000(H5EmbedView.this).getComponentName().getClassName().equals(intentForUri.getComponent().getClassName()))) {
                            Intent intent = new Intent();
                            intent.setClass(context, TaoLiveRouterActivity.class);
                            intent.putExtra("targetUrl", str);
                            context.startActivity(intent);
                            return true;
                        }
                    }
                } else {
                    Uri parse = Uri.parse(str);
                    if (parse != null) {
                        z = parse.getBooleanQueryParameter("forceRefresh", false);
                    }
                    H5EmbedView.access$300(H5EmbedView.this).t(parse, z, true);
                    return true;
                }
            }
            return false;
        }
    }

    private void initController() {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc1acf53", new Object[]{this});
            return;
        }
        if (TextUtils.isEmpty(this.mLiveUrl)) {
            str = u90.e(this.mLiveId);
        } else {
            str = u90.g(this.mLiveUrl, "id", this.mLiveId);
        }
        if (!TextUtils.isEmpty(this.mLivesource)) {
            str = u90.h(str, this.mLivesource);
        }
        if (!TextUtils.isEmpty(this.mRecommendSource)) {
            str = u90.g(str, "recommendSource", this.mRecommendSource);
        }
        if (!TextUtils.isEmpty(this.customPlayCtrlParams)) {
            str = u90.g(str, "customPlayCtrlParams", Uri.encode(this.customPlayCtrlParams));
        }
        if (!TextUtils.isEmpty(this.mSpm)) {
            str = u90.g(str, "spm", this.mSpm);
        }
        y3s v = new y3s.a().w(this.topOffSet).z(this.mDisableHorizontalScroll).x(this.mDisableHorizontalScroll).y(this.mDisableHorizontalScroll).B(this.mDisableVerticalScroll).E(this.isHideClose).F(this.isHideFullScreenBtn).C(this.drawDelayed).G(this.isHidePreLiveShareBtn).D(this.mH5PageUrl).H(this.enableH5EmbedViewUT).A(true).v();
        wvs wvsVar = new wvs(this.mActivity, str, v);
        this.mTaoLiveController = wvsVar;
        wvsVar.i(new c());
        this.mTaoLiveController.setSmallWindowClickListener(new d());
        this.mTaoLiveController.o(new e());
        try {
            str2 = JSON.toJSONString(v);
        } catch (Exception unused) {
            str2 = "";
        }
        trackControllerInit(str, str2);
    }

    @Override // tb.kpw
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        logd("onActivityResult " + i + " " + i2);
        jyd jydVar = this.mTaoLiveController;
        if (jydVar == null) {
            return;
        }
        if (i == 20000) {
            jydVar.J();
        } else if (i == 20001) {
            jydVar.u();
        } else if (i != 10000) {
        } else {
            if (i2 == 8) {
                jydVar.j(false);
            } else if (i2 == 1) {
                jydVar.j(true);
            }
        }
    }

    @Override // android.taobao.windvane.embed.BaseEmbedView
    public boolean init(String str, String str2, IWVWebView iWVWebView, EmbedViewConfig embedViewConfig, IEmbedViewContainer iEmbedViewContainer) {
        String str3;
        int i = 0;
        String str4 = "";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eb3ca6a7", new Object[]{this, str, str2, iWVWebView, embedViewConfig, iEmbedViewContainer})).booleanValue();
        }
        if (vx9.d() != null) {
            iba.l0(null, vx9.f(vx9.d()));
        }
        if (!sbt.i()) {
            return super.init(str, str2, iWVWebView, embedViewConfig, iEmbedViewContainer);
        }
        try {
            str3 = JSON.toJSONString(embedViewConfig.mObjectParam);
        } catch (Exception unused) {
            str3 = str4;
        }
        trackEmbedViewInit(String.valueOf(embedViewConfig.mEmbedViewID), str3);
        this.enableH5EmbedViewUT = pvs.a0();
        this.enableH5EmbedViewH5UT = pvs.Z();
        this.mActivity = (Activity) iWVWebView.getContext();
        this.mLiveUrl = embedViewConfig.mObjectParam.containsKey(PARAM_KEY_LIVEURL) ? String.valueOf(embedViewConfig.mObjectParam.get(PARAM_KEY_LIVEURL)) : str4;
        this.mLiveId = embedViewConfig.mObjectParam.containsKey("liveId") ? String.valueOf(embedViewConfig.mObjectParam.get("liveId")) : str4;
        this.mLivesource = embedViewConfig.mObjectParam.containsKey("livesource") ? String.valueOf(embedViewConfig.mObjectParam.get("livesource")) : str4;
        this.mBackActivityUrl = embedViewConfig.mObjectParam.containsKey("activity") ? String.valueOf(embedViewConfig.mObjectParam.get("activity")) : str4;
        this.mDisableHorizontalScroll = true;
        this.mDisableVerticalScroll = !"true".equals(embedViewConfig.mObjectParam.get(PARAM_KEY_ENABLEVERTICALSCROLL));
        this.topOffSet = embedViewConfig.mObjectParam.containsKey(PARAM_KEY_TOPOFFSET) ? (int) Float.parseFloat(String.valueOf(embedViewConfig.mObjectParam.get(PARAM_KEY_TOPOFFSET))) : 0;
        if (embedViewConfig.mObjectParam.containsKey(PARAM_KEY_DRAWDELAYED)) {
            i = (int) Float.parseFloat(String.valueOf(embedViewConfig.mObjectParam.get(PARAM_KEY_DRAWDELAYED)));
        }
        this.drawDelayed = i;
        this.mRecommendSource = embedViewConfig.mObjectParam.containsKey("recommendSource") ? String.valueOf(embedViewConfig.mObjectParam.get("recommendSource")) : str4;
        this.customPlayCtrlParams = embedViewConfig.mObjectParam.containsKey("customPlayCtrlParams") ? String.valueOf(embedViewConfig.mObjectParam.get("customPlayCtrlParams")) : str4;
        this.isHideClose = !"true".equals(embedViewConfig.mObjectParam.get(PARAM_KEY_HIDECLOSE));
        this.isHideFullScreenBtn = !"true".equals(embedViewConfig.mObjectParam.get(PARAM_KEY_HIDEFULLSCREENBTN));
        this.isHidePreLiveShareBtn = true ^ "true".equals(embedViewConfig.mObjectParam.get(PARAM_KEY_ISSHOWPRELIVESHAREBTN));
        this.mH5PageUrl = embedViewConfig.mObjectParam.containsKey(PARAM_KEY_H5UTPAGENAME) ? String.valueOf(embedViewConfig.mObjectParam.get(PARAM_KEY_H5UTPAGENAME)) : str4;
        this.mH5UTParams = embedViewConfig.mObjectParam.containsKey(PARAM_KEY_H5UTPARAMS) ? String.valueOf(embedViewConfig.mObjectParam.get(PARAM_KEY_H5UTPARAMS)) : str4;
        if (embedViewConfig.mObjectParam.containsKey(PARAM_KEY_SPM)) {
            str4 = String.valueOf(embedViewConfig.mObjectParam.get(PARAM_KEY_SPM));
        }
        this.mSpm = str4;
        this.topOffSet = hw0.x(this.topOffSet);
        gq0.g().getApplication().registerActivityLifecycleCallbacks(this.mLifecycleCallbacks);
        v2s.o().v().d(this.mInterceptor);
        initController();
        return super.init(str, str2, iWVWebView, embedViewConfig, iEmbedViewContainer);
    }
}
