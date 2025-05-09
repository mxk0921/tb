package com.alipay.android.msp.core.context;

import android.content.Context;
import android.os.Build;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.IRemoteServiceCallback;
import com.alipay.android.app.template.JSPluginManager;
import com.alipay.android.msp.biz.substitute.SpmHelper;
import com.alipay.android.msp.biz.thirdpay.ThirdPayManager;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.core.MspNetHandler;
import com.alipay.android.msp.core.clients.MspLogicClient;
import com.alipay.android.msp.core.clients.MspUIClient;
import com.alipay.android.msp.core.clients.MspViClient;
import com.alipay.android.msp.core.clients.MspWindowClient;
import com.alipay.android.msp.core.frame.MspWindowFrame;
import com.alipay.android.msp.core.frame.MspWindowFrameStack;
import com.alipay.android.msp.core.model.MspExtInfoModel;
import com.alipay.android.msp.core.model.MspPaySession;
import com.alipay.android.msp.drivers.actions.InvokeActionPlugin;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.alipay.android.msp.drivers.stores.storecenter.ActionStoreCenter;
import com.alipay.android.msp.drivers.stores.storecenter.StoreCenter;
import com.alipay.android.msp.framework.cache.MspCacheManager;
import com.alipay.android.msp.framework.dns.storage.DnsPreference;
import com.alipay.android.msp.framework.drm.ConfigChangeMonitor;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.framework.drm.FastStartActivityHelper;
import com.alipay.android.msp.framework.drm.TemplateChangeMonitor;
import com.alipay.android.msp.framework.dynfun.DynConstants;
import com.alipay.android.msp.framework.dynfun.DynDataWrapper;
import com.alipay.android.msp.framework.ext.MspExtSceneManager;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.helper.MspExperimentHelper;
import com.alipay.android.msp.framework.lowdevice.MspLowDeviceManager;
import com.alipay.android.msp.framework.perf.ThreadController;
import com.alipay.android.msp.framework.statistics.SpmWrapper;
import com.alipay.android.msp.framework.statisticsv2.ClientEndCode;
import com.alipay.android.msp.framework.statisticsv2.StatisticInfo;
import com.alipay.android.msp.framework.statisticsv2.Vector;
import com.alipay.android.msp.framework.statisticsv2.collector.TradeCollector;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.taskscheduler.MonitorRunnable;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.framework.util.FwUtils;
import com.alipay.android.msp.network.MspNetworkClient;
import com.alipay.android.msp.pay.CashierSceneDictionary;
import com.alipay.android.msp.pay.GlobalSdkConstant;
import com.alipay.android.msp.pay.MspPayClient;
import com.alipay.android.msp.pay.TradeLogicData;
import com.alipay.android.msp.pay.callback.PayProgressCallback;
import com.alipay.android.msp.pay.results.MspPayResult;
import com.alipay.android.msp.pay.results.ResultStatus;
import com.alipay.android.msp.perf.CashierPerformanceHelper;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.utils.ApLinkTokenUtils;
import com.alipay.android.msp.utils.EventLogUtil;
import com.alipay.android.msp.utils.FlybirdUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.MspContextUtil;
import com.alipay.android.msp.utils.OrderInfoUtil;
import com.alipay.android.msp.utils.UIUtil;
import com.alipay.android.msp.utils.Utils;
import com.alipay.sdk.sys.BizContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.taobao.android.detail.ttdetail.floatview.globalbarrage.c;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import tb.slo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MspTradeContext extends MspContext {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static Boolean grayMultiContext = null;
    public static final HashSet<String> l0;
    public final String A;
    public final DynDataWrapper<String> D;
    public final MspWindowClient E;
    public final MspLogicClient F;
    public final MspPayClient G;
    public final MspNetworkClient H;
    public final MspViClient I;
    public final MspPayResult J;
    public TradeLogicData K;
    public String M;
    public final boolean N;
    public final Map<String, String> O;
    public boolean P;
    public final long Q;
    public JSONObject T;
    public boolean U;
    public final DynDataWrapper<String> V;
    public final int X;
    public MspExtSceneManager c0;
    public final DynDataWrapper<Integer> dynDataStub;
    public final SubTradeContext g0;
    public final MspPaySession j0;
    public final Map<String, String> B = new HashMap();
    public final Map<String, String> C = new HashMap();
    public String L = "0";
    public String R = "";
    public boolean S = false;
    public boolean W = true;
    public boolean Y = false;
    public boolean Z = false;
    public boolean a0 = false;
    public boolean b0 = false;
    public boolean d0 = true;
    public int f0 = -1;
    public final ConditionVariable h0 = new ConditionVariable();
    public Boolean i0 = null;
    public MspExtInfoModel k0 = null;
    public final DynDataWrapper<HashMap<String, String>> e0 = new DynDataWrapper<>(this.mBizId, DynConstants.DynDataNames.D_CLIENT_LOG_DATA, new HashMap());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public enum SubTradeContext {
        pay,
        bindcardapp,
        setting;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(SubTradeContext subTradeContext, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/core/context/MspTradeContext$SubTradeContext");
        }

        public static SubTradeContext valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SubTradeContext) ipChange.ipc$dispatch("8b187722", new Object[]{str});
            }
            return (SubTradeContext) Enum.valueOf(SubTradeContext.class, str);
        }
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        l0 = hashSet;
        hashSet.add(MspGlobalDefine.EXT_LOCAL_ONLY_THIRD_PAY);
        hashSet.add(MspGlobalDefine.EXT_LOCAL_ONLY_LOADING_STYLE);
    }

    public MspTradeContext(MspPaySession mspPaySession) {
        this.X = -2;
        loadDrm();
        this.j0 = mspPaySession;
        String orderSuffix = mspPaySession.getOrderSuffix();
        this.mContextType = MspContext.CONTEXT_TYPE_PAY;
        onStart();
        ThirdPayManager.instrumentPredefinedImpl();
        int bizId = mspPaySession.getBizId();
        this.mBizId = bizId;
        this.dynDataStub = new DynDataWrapper<>(bizId, DynConstants.DynDataNames.D_DYN_DATA_STUB, 1);
        this.mCallingPid = mspPaySession.getCallingPid();
        this.X = mspPaySession.getCallingUid();
        DynDataWrapper<String> dynDataWrapper = new DynDataWrapper<>(this.mBizId, "orderStr", orderSuffix);
        this.D = dynDataWrapper;
        DynDataWrapper<String> dynDataWrapper2 = new DynDataWrapper<>(this.mBizId, "ap_link_token", null);
        this.V = dynDataWrapper2;
        this.mChangeTokens = new DynDataWrapper<>(this.mBizId, DynConstants.DynDataNames.D_CHANGE_TOKENS, null);
        this.A = mspPaySession.getExtendParams();
        setFromWallet(mspPaySession.isFromWallet());
        setFromEntranceActivity(mspPaySession.isFromEntranceActivity());
        setFromOutScheme(mspPaySession.isFromOutScheme());
        Map<String, String> parseExternalInfoToMap = OrderInfoUtil.parseExternalInfoToMap(orderSuffix);
        this.O = parseExternalInfoToMap;
        if (parseExternalInfoToMap.get("biz_type") != null && parseExternalInfoToMap.get("biz_type").contains(BizContext.KEY_SETTING_FILTER)) {
            this.g0 = SubTradeContext.setting;
        } else if (parseExternalInfoToMap.get("biz_type") == null || !parseExternalInfoToMap.get("biz_type").contains("bindcardapp")) {
            this.g0 = SubTradeContext.pay;
        } else {
            this.g0 = SubTradeContext.bindcardapp;
        }
        c();
        MspContextManager.getInstance().addMspContext(this.mBizId, this);
        PhoneCashierMspEngine.getMspWallet().startSpiderBizType(MspGlobalDefine.SPIDER_MSP_CASHIER_BIZ_TYPE);
        PhoneCashierMspEngine.getMspWallet().startSpiderSection(MspGlobalDefine.SPIDER_MSP_CASHIER_BIZ_TYPE, "CASHIER_FIRST_LOAD");
        dynDataWrapper2.write(mspPaySession.getApLinkToken());
        initExtInfoModel();
        if (!isFromWallet()) {
            ApLinkTokenUtils.spmExpExtPay(this.mContext, mspPaySession);
        }
        ApLinkTokenUtils.spmExpPayBoot(this, TradeCollector.getBizType(getBizId()));
        this.mMspNetHandler = new MspNetHandler(this);
        this.J = new MspPayResult(this);
        this.Q = SystemClock.elapsedRealtime();
        this.mContext = MspContextUtil.getContext();
        ConfigChangeMonitor.getInstance().newContext(this.mContext);
        TemplateChangeMonitor.getInstance().newContext(this.mContext);
        TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.core.context.MspTradeContext.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                MspTradeContext mspTradeContext = MspTradeContext.this;
                MspTradeContext.access$002(mspTradeContext, MspExtSceneManager.onPadAdaptMode(mspTradeContext.mContext));
                MspTradeContext mspTradeContext2 = MspTradeContext.this;
                MspTradeContext.access$102(mspTradeContext2, DrmManager.getInstance(mspTradeContext2.mContext).isGray(DrmKey.GRAY_UNIFIED_READ_PAD_CONFIG, false, MspTradeContext.this.mContext));
                if (MspTradeContext.access$100(MspTradeContext.this)) {
                    MspTradeContext mspTradeContext3 = MspTradeContext.this;
                    MspTradeContext.access$202(mspTradeContext3, new MspExtSceneManager(mspTradeContext3.mContext));
                }
            }
        });
        this.F = new MspLogicClient(this);
        this.E = new MspWindowClient(this);
        this.G = new MspPayClient(this);
        this.H = new MspNetworkClient(this);
        this.mStoreCenter = new ActionStoreCenter(this);
        this.I = new MspViClient(this);
        CashierPerformanceHelper.setCurrentThreadPriority(-20);
        StatisticInfo statisticInfo = getStatisticInfo();
        Vector vector = Vector.Result;
        StringBuilder sb = new StringBuilder();
        sb.append(ClientEndCode.USEREXIT);
        statisticInfo.updateAttr(vector, "clientEndCode", sb.toString());
        getAlertIntelligenceId();
        String tryUseLinkTokenAsLogTrace = ApLinkTokenUtils.tryUseLinkTokenAsLogTrace(this);
        if (!TextUtils.isEmpty(tryUseLinkTokenAsLogTrace) && tryUseLinkTokenAsLogTrace.length() > 2) {
            StringBuilder sb2 = new StringBuilder();
            String str = this.mAlertIntelligenceId;
            sb2.append(str.substring(0, str.length() - 2));
            sb2.append("_");
            sb2.append(tryUseLinkTokenAsLogTrace);
            this.mAlertIntelligenceId = sb2.toString();
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!InvokeActionPlugin.isJsPluginRegisterAsync()) {
            InvokeActionPlugin.registerTradeLocalInvokeFamily(this);
        } else {
            InvokeActionPlugin.registerNecessaryTradeLocalInvokeFamily(this);
            TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.core.context.MspTradeContext.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        InvokeActionPlugin.registerAsyncTradeLocalInvokeFamily(MspTradeContext.this);
                    }
                }
            });
        }
        EventLogUtil.logPayEvent("103627", HiAnalyticsConstant.BI_KEY_COST_TIME, String.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime), "content_type", DnsPreference.KEY_TRADE);
        TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.core.context.MspTradeContext.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    InvokeActionPlugin.registerTradeBnInvokeFamily(MspTradeContext.this);
                }
            }
        });
        FlybirdUtil.saveTradeNoForDNS(dynDataWrapper.read());
        if (parseExternalInfoToMap.get("no_loading") != null) {
            try {
                if (Integer.parseInt(parseExternalInfoToMap.get("no_loading")) == 1) {
                    this.N = true;
                }
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
            }
        }
        Map<String, String> map = this.O;
        if (map != null && map.containsKey("msp_bg_opaque")) {
            setMspBgTransparent(TextUtils.equals("1", this.O.get("msp_bg_opaque")));
        }
        this.D.read().hashCode();
        if (this.j0.getSchemePayModel() != null && !TextUtils.isEmpty(this.j0.getSchemePayModel().packageName)) {
            this.mIsSchemePay = true;
        }
        d();
        TradeLogicData tradeLogicData = new TradeLogicData(this);
        try {
            tradeLogicData.setLdcHeaders(OrderInfoUtil.initLdcData(this));
        } catch (Exception e2) {
            LogUtil.printExceptionStackTrace(e2);
        }
        setTradeLogicData(tradeLogicData);
        updateCurrentWinTpName("null");
        onContextCreated();
        if (grayMultiContext == null) {
            grayMultiContext = Boolean.valueOf(FastStartActivityHelper.getBoolConfig(this.mContext, DrmKey.GRAY_ENABLE_MULTI_PAY_SERVICE));
        }
        MspExperimentHelper.reportEvent(this, FastStartActivityHelper.CONFIG_KEY);
    }

    public static /* synthetic */ boolean access$002(MspTradeContext mspTradeContext, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2110df1", new Object[]{mspTradeContext, new Boolean(z)})).booleanValue();
        }
        mspTradeContext.a0 = z;
        return z;
    }

    public static /* synthetic */ boolean access$100(MspTradeContext mspTradeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2584faec", new Object[]{mspTradeContext})).booleanValue();
        }
        return mspTradeContext.b0;
    }

    public static /* synthetic */ boolean access$102(MspTradeContext mspTradeContext, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac86ae72", new Object[]{mspTradeContext, new Boolean(z)})).booleanValue();
        }
        mspTradeContext.b0 = z;
        return z;
    }

    public static /* synthetic */ MspExtSceneManager access$202(MspTradeContext mspTradeContext, MspExtSceneManager mspExtSceneManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspExtSceneManager) ipChange.ipc$dispatch("e3444aa7", new Object[]{mspTradeContext, mspExtSceneManager});
        }
        mspTradeContext.c0 = mspExtSceneManager;
        return mspExtSceneManager;
    }

    public static /* synthetic */ void access$300(MspTradeContext mspTradeContext, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("655ee", new Object[]{mspTradeContext, new Boolean(z)});
        } else {
            mspTradeContext.b(z);
        }
    }

    public static /* synthetic */ MspLogicClient access$400(MspTradeContext mspTradeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspLogicClient) ipChange.ipc$dispatch("d1bb1d66", new Object[]{mspTradeContext});
        }
        return mspTradeContext.F;
    }

    public static /* synthetic */ DynDataWrapper access$500(MspTradeContext mspTradeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DynDataWrapper) ipChange.ipc$dispatch("d4870655", new Object[]{mspTradeContext});
        }
        return mspTradeContext.D;
    }

    public static /* synthetic */ String access$600(MspTradeContext mspTradeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fb459f3d", new Object[]{mspTradeContext});
        }
        return mspTradeContext.L;
    }

    public static /* synthetic */ Object ipc$super(MspTradeContext mspTradeContext, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1965072769:
                super.onContextCreated();
                return null;
            case -1068390226:
                super.didEnterBackground();
                return null;
            case -980350570:
                super.exit(((Number) objArr[0]).intValue(), ((Boolean) objArr[1]).booleanValue());
                return null;
            case -914087920:
                super.willEnterForeground();
                return null;
            case -716869421:
                super.setCallingPid(((Number) objArr[0]).intValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/core/context/MspTradeContext");
        }
    }

    public void blockPayCallbackLock() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb846692", new Object[]{this});
        } else {
            this.h0.block();
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
        } else if (!TextUtils.isEmpty(this.A)) {
            try {
                JSONObject parseObject = JSON.parseObject(this.A);
                for (String str : parseObject.keySet()) {
                    if (!l0.contains(str)) {
                        this.B.put(str, parseObject.getString(str));
                    }
                    this.C.put(str, parseObject.getString(str));
                }
            } catch (Throwable th) {
                getStatisticInfo().addError(c.LOCATION_INSIDE, "ParseExtendParamsEx", th);
            }
        }
    }

    @Override // com.alipay.android.msp.core.context.MspContext, com.alipay.android.msp.content.MspContextLifecycleCallbacks
    public void didEnterBackground() {
        MspWindowFrame mspWindowFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c051a8ae", new Object[]{this});
            return;
        }
        super.didEnterBackground();
        SpmHelper.spmClickResignActive(this);
        if (getWindowStack() != null) {
            mspWindowFrame = getWindowStack().getTopTplOrNativeFrame();
        } else {
            mspWindowFrame = null;
        }
        SpmWrapper.onPagePause(mspWindowFrame, this.mBizId);
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public void exit(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab88c8fe", new Object[]{this, new Integer(i)});
        } else {
            exit(i, false);
        }
    }

    public Map<String, String> getAllExtendParamsMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("66a1e24d", new Object[]{this});
        }
        return this.C;
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public String getApLinkToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dd8b99bf", new Object[]{this});
        }
        return this.V.read();
    }

    public JSONObject getBizContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e7a96fb9", new Object[]{this});
        }
        return this.T;
    }

    public int getCallingUid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b2c4c85c", new Object[]{this})).intValue();
        }
        return this.X;
    }

    public Map<String, String> getClientLogData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("94ef3049", new Object[]{this});
        }
        return this.e0.read();
    }

    public SubTradeContext getCurSubContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SubTradeContext) ipChange.ipc$dispatch("988805e9", new Object[]{this});
        }
        return this.g0;
    }

    public String getDomain() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6fba2f7f", new Object[]{this});
        }
        return this.R;
    }

    public String getEncodeOrderInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b78bf89", new Object[]{this});
        }
        try {
            return URLEncoder.encode(getOrderInfo(), "utf8");
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return "";
        }
    }

    public MspExtInfoModel getExtInfoModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspExtInfoModel) ipChange.ipc$dispatch("6f8e5f5e", new Object[]{this});
        }
        return this.k0;
    }

    public String getExtendParamByKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9a86aba4", new Object[]{this, str});
        }
        if (!((HashMap) this.B).containsKey(str)) {
            return null;
        }
        return (String) ((HashMap) this.B).get(str);
    }

    public String getExtendParamString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c78b8eb", new Object[]{this});
        }
        return this.A;
    }

    public Map<String, String> getExtendParamsMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("940e06c2", new Object[]{this});
        }
        return this.B;
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public boolean getGrayOnPadAdaptMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f3e32d5", new Object[]{this})).booleanValue();
        }
        return this.a0;
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public boolean getGrayUnifiedReadPadConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3135251", new Object[]{this})).booleanValue();
        }
        return this.b0;
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public MspBasePresenter getMspBasePresenter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspBasePresenter) ipChange.ipc$dispatch("69a95869", new Object[]{this});
        }
        return this.E.getCurrentPresenter();
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public MspExtSceneManager getMspExtSceneManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspExtSceneManager) ipChange.ipc$dispatch("fd7b3373", new Object[]{this});
        }
        return this.c0;
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public MspLogicClient getMspLogicClient() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspLogicClient) ipChange.ipc$dispatch("220bab2f", new Object[]{this});
        }
        return this.F;
    }

    public MspNetworkClient getMspNetworkClient() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspNetworkClient) ipChange.ipc$dispatch("b7abcdb1", new Object[]{this});
        }
        return this.H;
    }

    public MspPayResult getMspPayResult() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspPayResult) ipChange.ipc$dispatch("5d101552", new Object[]{this});
        }
        return this.J;
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public MspUIClient getMspUIClient() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspUIClient) ipChange.ipc$dispatch("52f9383d", new Object[]{this});
        }
        return this.E;
    }

    public MspViClient getMspViClient() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspViClient) ipChange.ipc$dispatch("20a69d", new Object[]{this});
        }
        return this.I;
    }

    public MspWindowClient getMspWindowClient() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspWindowClient) ipChange.ipc$dispatch("18c2a13d", new Object[]{this});
        }
        return this.E;
    }

    public String getOrderInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("88125053", new Object[]{this});
        }
        return this.D.read();
    }

    public Map<String, String> getOrderInfoMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c2b9612", new Object[]{this});
        }
        return this.O;
    }

    public String getOutPackageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("78beb3e0", new Object[]{this});
        }
        return this.j0.getOuterPackageName();
    }

    public MspPaySession getPaySession() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspPaySession) ipChange.ipc$dispatch("45ba709e", new Object[]{this});
        }
        return this.j0;
    }

    public IRemoteServiceCallback getRemoteCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IRemoteServiceCallback) ipChange.ipc$dispatch("4a689309", new Object[]{this});
        }
        if (getOrderInfo() != null) {
            return MspContextManager.getInstance().getRemoteCallbackById(getOrderInfo().hashCode(), this.mCallingPid);
        }
        return MspContextManager.getInstance().getRemoteCallbackById(-1, this.mCallingPid);
    }

    public String getScene() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6a7731e3", new Object[]{this});
        }
        return this.M;
    }

    public String getSchemeTraceId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("39e3fff4", new Object[]{this});
        }
        return this.j0.getSchemeTraceId();
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public StoreCenter getStoreCenter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StoreCenter) ipChange.ipc$dispatch("550b9278", new Object[]{this});
        }
        return this.mStoreCenter;
    }

    public long getTradeInitTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c89e38c6", new Object[]{this})).longValue();
        }
        return this.Q;
    }

    public TradeLogicData getTradeLogicData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TradeLogicData) ipChange.ipc$dispatch("66d7cfcb", new Object[]{this});
        }
        return this.K;
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public String getTradeNo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("59e3704a", new Object[]{this});
        }
        if (this.O.containsKey("trade_no")) {
            return this.O.get("trade_no");
        }
        return "";
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public MspWindowFrameStack getWindowStack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspWindowFrameStack) ipChange.ipc$dispatch("b53eb85b", new Object[]{this});
        }
        MspWindowClient mspWindowClient = this.E;
        if (mspWindowClient != null) {
            return mspWindowClient.getFrameStack();
        }
        return null;
    }

    public boolean isCanMulti() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5df7719e", new Object[]{this})).booleanValue();
        }
        return this.d0;
    }

    public boolean isExitCashierBeforePay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2a3fc39", new Object[]{this})).booleanValue();
        }
        return this.Z;
    }

    public boolean isHasRPC() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("155e80c0", new Object[]{this})).booleanValue();
        }
        return this.Y;
    }

    public boolean isInitialNetRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eeb97f17", new Object[]{this})).booleanValue();
        }
        return this.W;
    }

    public boolean isMqpSchemePay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad27d12c", new Object[]{this})).booleanValue();
        }
        if (CashierSceneDictionary.getInstance().getMspSchemePayContext(this.D.read()) != null) {
            return true;
        }
        return false;
    }

    public boolean isNoLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a917e63c", new Object[]{this})).booleanValue();
        }
        return this.N;
    }

    public boolean isPaying() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1ccd1a8f", new Object[]{this})).booleanValue();
        }
        return this.U;
    }

    public boolean isRenderLocal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83256ef6", new Object[]{this})).booleanValue();
        }
        return TextUtils.equals(getExtendParamByKey(MspGlobalDefine.EXT_RENDER_LOCAL), "true");
    }

    public boolean isSubmitState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("199f84da", new Object[]{this})).booleanValue();
        }
        return this.P;
    }

    public boolean isUseNewPayResultLock() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a714818", new Object[]{this})).booleanValue();
        }
        if (this.i0 == null) {
            this.i0 = Boolean.valueOf(TextUtils.equals(slo.VALUE_YES, PhoneCashierMspEngine.getMspWallet().getWalletConfig(DrmKey.GRAY_PAY_RESULT_CALLBACK_LOCK)));
        }
        return this.i0.booleanValue();
    }

    @Override // com.alipay.android.msp.core.context.MspContext, com.alipay.android.msp.content.MspContextLifecycleCallbacks
    public void onContextCreated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8adf5e7f", new Object[]{this});
        } else {
            super.onContextCreated();
        }
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public void onRendResultPage(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab2d3ba5", new Object[]{this, str});
        } else {
            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.core.context.MspTradeContext.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    PayProgressCallback payProgressCallback = MspContextManager.getInstance().getPayProgressCallback((String) MspTradeContext.access$500(MspTradeContext.this).read());
                    if (payProgressCallback != null) {
                        MspPayResult mspPayResult = MspTradeContext.this.getMspPayResult();
                        payProgressCallback.onPayProgress(MspTradeContext.this.mBizId, mspPayResult.getEndCode(), mspPayResult.getMemo(), mspPayResult.getResult());
                    }
                    MspTradeContext.this.getStatisticInfo().addEvent(new StEvent(str, "resultPageExitMode", MspTradeContext.access$600(MspTradeContext.this)));
                }
            }, 300L);
        }
    }

    public void openPayCallbackLock() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a81da9b5", new Object[]{this});
        } else {
            this.h0.open();
        }
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public void reportExtPaySuccessOnlyOnce() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe504dc", new Object[]{this});
        } else if (!this.extPaySuccessReported) {
            this.extPaySuccessReported = true;
            ApLinkTokenUtils.spmExtPaymentStartSuccess(this.mContext, this.j0);
        }
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public void setCallingPid(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d54570d3", new Object[]{this, new Integer(i)});
            return;
        }
        super.setCallingPid(i);
        MspPaySession mspPaySession = this.j0;
        if (mspPaySession != null) {
            mspPaySession.setCallingPid(i);
        }
    }

    public void setCanMulti(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fee4042", new Object[]{this, new Boolean(z)});
        } else {
            this.d0 = z;
        }
    }

    public void setExitCashierBeforePay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc579d07", new Object[]{this, new Boolean(z)});
        } else {
            this.Z = z;
        }
    }

    public void setHasRPC(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ab96760", new Object[]{this, new Boolean(z)});
        } else {
            this.Y = z;
        }
    }

    public void setInitialNetRequest(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4550b59", new Object[]{this, new Boolean(z)});
        } else {
            this.W = z;
        }
    }

    public void setPaying(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("411e0771", new Object[]{this, new Boolean(z)});
        } else {
            this.U = z;
        }
    }

    public void setSubmitState(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc3e07f6", new Object[]{this, new Boolean(z)});
        } else {
            this.P = z;
        }
    }

    public void setTradeLogicData(TradeLogicData.TradeLogicDataTransfer tradeLogicDataTransfer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97b03b70", new Object[]{this, tradeLogicDataTransfer});
        } else {
            this.K.fromTransfer(tradeLogicDataTransfer);
        }
    }

    public MspPayResult startPay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspPayResult) ipChange.ipc$dispatch("3417c8c7", new Object[]{this});
        }
        ThreadController.startWithOutScheme(ThreadController.CASHIER_START_PAY);
        return this.G.pay();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        int i = this.mBizId;
        SubTradeContext subTradeContext = this.g0;
        return "<MspTradeContext with bizId: " + i + "," + subTradeContext + ">";
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public void updateResult(String str, String str2, String str3, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6973a65", new Object[]{this, str, str2, str3, jSONObject});
            return;
        }
        LogUtil.i("MspTradeContext", "updateResult", str + " " + str2 + " " + str3);
        MspPayResult mspPayResult = getMspPayResult();
        if (mspPayResult != null) {
            if (!mspPayResult.isSuccess() || TextUtils.equals(str, String.valueOf(ResultStatus.SUCCEEDED.getStatus()))) {
                if (!TextUtils.isEmpty(str)) {
                    mspPayResult.setEndCode(str);
                }
                if (!TextUtils.isEmpty(str2)) {
                    mspPayResult.setMemo(str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    mspPayResult.setResult(str3);
                }
                if (jSONObject != null) {
                    mspPayResult.addExtendInfo(jSONObject);
                }
                try {
                    if (!TextUtils.isEmpty(str)) {
                        getStatisticInfo().updateResult(str, getCurrentWinTpName());
                    }
                } catch (Exception e) {
                    LogUtil.printExceptionStackTrace(e);
                }
            } else {
                LogUtil.i("MspTradeContext", "updateResult", "pay result is already success, don't set.");
                getStatisticInfo().addEvent(new StEvent(getCurrentWinTpName(), "PayResultAlreadySuccess", str));
            }
        }
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public void updateTradeNo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cea32cd", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.O.put("trade_no", str);
        }
    }

    @Override // com.alipay.android.msp.core.context.MspContext, com.alipay.android.msp.content.MspContextLifecycleCallbacks
    public void willEnterForeground() {
        MspWindowFrame mspWindowFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9842010", new Object[]{this});
            return;
        }
        super.willEnterForeground();
        SpmHelper.spmClickBecomeActive(this);
        if (getWindowStack() != null) {
            mspWindowFrame = getWindowStack().getTopTplOrNativeFrame();
        } else {
            mspWindowFrame = null;
        }
        SpmWrapper.onPageResume(mspWindowFrame);
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public void exit(int i, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5910996", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        super.exit(i, z);
        if (i > 0) {
            Context context = getContext();
            if (context != null && FastStartActivityHelper.getBoolConfig(context, DrmKey.GRAY_DELAY_THREAD_RUNNABLE)) {
                TaskHelper.getInstance().executeDelayed(new Runnable() { // from class: com.alipay.android.msp.core.context.MspTradeContext.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            MspTradeContext.access$300(MspTradeContext.this, z);
                        }
                    }
                }, i, TaskHelper.ThreadName.UI_CONTEXT);
            } else if (context == null || !FastStartActivityHelper.getBoolConfig(context, DrmKey.GRAY_DELAY_TIMER_RUNNABLE)) {
                TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.core.context.MspTradeContext.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            MspTradeContext.access$300(MspTradeContext.this, z);
                        }
                    }
                }, i);
            } else {
                new Timer("MspTradeCtxExitThread").schedule(new TimerTask() { // from class: com.alipay.android.msp.core.context.MspTradeContext.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass5 r2, String str, Object... objArr) {
                        str.hashCode();
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/core/context/MspTradeContext$5");
                    }

                    @Override // java.util.TimerTask, java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            MspTradeContext.access$300(MspTradeContext.this, z);
                        }
                    }
                }, i);
            }
        } else {
            b(z);
        }
    }

    public int getRemoteCallbackVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9a579af1", new Object[]{this})).intValue();
        }
        try {
            IRemoteServiceCallback remoteCallback = getRemoteCallback();
            if (remoteCallback != null) {
                if (this.f0 == -1) {
                    this.f0 = remoteCallback.getVersion();
                }
                LogUtil.record(2, "MspContext:sendDataToSdk", "v=" + this.f0);
                return this.f0;
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        return 0;
    }

    public void setClientLogData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f33c7552", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject parseObject = JSON.parseObject(str);
                if (parseObject != null) {
                    for (String str2 : parseObject.keySet()) {
                        this.e0.read().put(str2, parseObject.getString(str2));
                    }
                }
                if (this.e0.read().containsKey("bizNo")) {
                    String str3 = this.e0.read().get("bizNo");
                    LogUtil.record(2, "setClientLogData:tradeNo", TradeCollector.collectData("tradeNo", this.mBizId) + " to " + str3);
                    updateTradeNo(str3);
                    getStatisticInfo().updateAttr(Vector.Trade, "tradeNo", str3);
                }
                if (this.e0.read().containsKey("outTradeNo")) {
                    String str4 = this.e0.read().get("outTradeNo");
                    LogUtil.record(2, "setClientLogData:outTradeNo", TradeCollector.collectData("outTradeNo", this.mBizId) + " to " + str4);
                    this.O.put("out_trade_no", str4);
                    getStatisticInfo().updateAttr(Vector.Trade, "outTradeNo", str4);
                }
                if (this.e0.read().containsKey("partnerId")) {
                    String str5 = this.e0.read().get("partnerId");
                    LogUtil.record(2, "setClientLogData:partnerId", TradeCollector.collectData("partnerId", this.mBizId) + " to " + str5);
                    this.O.put("partner", str5);
                    getStatisticInfo().updateAttr(Vector.Trade, "partnerId", str5);
                }
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
    }

    public void setTradeLogicData(TradeLogicData tradeLogicData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20e4cb2d", new Object[]{this, tradeLogicData});
        } else {
            this.K = tradeLogicData;
        }
    }

    public final void d() {
        String str;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        try {
            if (!TextUtils.isEmpty(this.D.read())) {
                String[] split = this.D.read().split("&");
                int length = split.length;
                while (true) {
                    if (i >= length) {
                        str = null;
                        break;
                    }
                    str = split[i];
                    if (!TextUtils.isEmpty(str) && str.startsWith("bizcontext=")) {
                        break;
                    }
                    i++;
                }
                if (str != null) {
                    str = str.substring(11);
                    if (str.startsWith("\"") && str.endsWith("\"")) {
                        str = str.substring(1, str.length() - 1);
                    }
                }
                JSONObject parseObject = JSON.parseObject(str);
                this.T = parseObject;
                if (parseObject != null) {
                    this.L = parseObject.getString("resultPageExitMode");
                    this.M = this.T.getString("sc");
                    this.R = this.T.getString("domain");
                    this.S = this.T.getBooleanValue("isThirdDomain");
                }
            }
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public long getDelayDisposeTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c107c87a", new Object[]{this})).longValue();
        }
        long j = 0;
        try {
            MspCacheManager instance = MspCacheManager.getInstance();
            instance.setTwoLevelCache(true);
            String readCache = instance.readCache("sos", new String[]{"needDelay"}, false);
            if (!TextUtils.isEmpty(readCache) && readCache.contains("\"needDelay\":\"N\"")) {
                LogUtil.record(4, "Trade:getDelayDisposeTime", "needDelay: N");
                return 0L;
            }
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
        if (TextUtils.equals(this.L, "2") || TextUtils.equals(this.M, "tqrcode")) {
            j = 350;
        } else if (TextUtils.equals(this.L, "3")) {
            j = 480;
        }
        LogUtil.record(4, "Trade:getDelayDisposeTime", "delay:" + j + " mode:" + this.L);
        return j;
    }

    public void initExtInfoModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61404eb1", new Object[]{this});
            return;
        }
        try {
            MspPaySession paySession = getPaySession();
            Map<String, String> extInfo = paySession.getExtInfo();
            MspExtInfoModel.Context context = new MspExtInfoModel.Context();
            context.setTcVerifyToken(extInfo.get("tc_verify_token"));
            context.setTerminalCustomInfo(extInfo.get("terminal_custom_info"));
            context.setTerminalSource(extInfo.get("terminal_source"));
            context.setExpDisableConfig(PhoneCashierMspEngine.getMspWallet().getWalletConfig("MQP_exp_disable_config_10550"));
            context.setCodeExtInfo(extInfo.get("code_ext_info"));
            if (!TextUtils.isEmpty(getAllExtendParamsMap().get("bindingAlipay"))) {
                context.setBindingAlipay(getAllExtendParamsMap().get("bindingAlipay"));
            }
            MspExtInfoModel.Device device = new MspExtInfoModel.Device();
            device.setAccessibility(Boolean.parseBoolean(MspExtSceneManager.getInstance(getContext()).isAccessibilityEnabled()));
            device.setAppMode(PhoneCashierMspEngine.getMspWallet().getAppMode());
            device.setLowPerf(MspLowDeviceManager.getInstance().isLowDevice());
            device.setAgednessVersion(PhoneCashierMspEngine.getMspWallet().isUserAgednessVersion(getBizId()));
            device.setDrmVersion(DrmManager.getInstance(getContext()).getVersion());
            device.setFoldable(MspExtSceneManager.getInstance(getContext()).isFoldableDevice());
            device.setPad(MspExtSceneManager.getInstance(getContext()).isPad());
            device.setBrand(Build.BRAND);
            device.setModel(Build.MODEL);
            int[] screenSize = UIUtil.getScreenSize(getContext());
            device.setScreenWidth(String.valueOf(screenSize[0]));
            device.setScreenHeight(String.valueOf(screenSize[1]));
            device.setDensity(String.valueOf(UIUtil.getDp(getContext())));
            device.setCpuCore(String.valueOf(UIUtil.getNumberOfCPUs()));
            MspExtInfoModel.Env env = new MspExtInfoModel.Env();
            env.setInvokeFromApi(Utils.getInvokeFromApi(this));
            env.setInvokeFromSource(Utils.getInvokeFromSource(this));
            env.setInvokeFromClientAppId(paySession.getInvokeFromClientAppId());
            env.setInvokeFromReferUrl(paySession.getInvokeFromUrlRefer());
            env.setInvokeFromAppName(paySession.getInvokeFromAppName());
            env.setInvokeFromAppSign(paySession.getInvokeFromAppSign());
            env.setFromWallet(isFromWallet() && !isFromOutScheme());
            env.setSupported3rdPay(TextUtils.join("|", FwUtils.concatMultiList(ThirdPayManager.getAvailableThirdPayTypes(GlobalHelper.getInstance().getContext()), ThirdPayManager.getExternalProvidedThirdPayTypes(this), paySession.getInstalled3rdAppList(), ThirdPayManager.getListCupDirectApps())));
            env.setAlipayTopAppId(PhoneCashierMspEngine.getMspWallet().getAlipayTopAppid());
            MspExtInfoModel mspExtInfoModel = new MspExtInfoModel();
            mspExtInfoModel.setEnv(env);
            mspExtInfoModel.setDevice(device);
            mspExtInfoModel.setContext(context);
            mspExtInfoModel.setAp_link_token(getApLinkToken());
            if (!TextUtils.isEmpty(getAllExtendParamsMap().get("user_token"))) {
                mspExtInfoModel.setUserToken(getAllExtendParamsMap().get("user_token"));
            }
            if (!TextUtils.isEmpty(getAllExtendParamsMap().get("user_token_type"))) {
                mspExtInfoModel.setUserTokenType(getAllExtendParamsMap().get("user_token_type"));
            }
            if (!TextUtils.isEmpty(getAllExtendParamsMap().get(MspGlobalDefine.EXT_INSIDE_ENV))) {
                mspExtInfoModel.setInsideEnv(getAllExtendParamsMap().get(MspGlobalDefine.EXT_INSIDE_ENV));
            }
            if (GlobalSdkConstant.getSdkType()) {
                mspExtInfoModel.setUtdid(GlobalHelper.getInstance().getUtdid(getContext()));
                mspExtInfoModel.setLang(Utils.getLocaleDesByFlag(PhoneCashierMspEngine.getMspBase().getMspLocale(PhoneCashierMspEngine.getMspWallet().getAlipayLocaleDes())));
            }
            this.k0 = mspExtInfoModel;
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            getStatisticInfo().addError(ErrorType.DEFAULT, "exitInfoModelFail", th);
        }
    }

    public boolean isFromThirdDomainJsApi() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("684fd65", new Object[]{this})).booleanValue();
        }
        LogUtil.record(1, "MspTradeContext:scene" + this.M, "mIsThirdDomain:" + this.S + " mDomain:" + this.R);
        return TextUtils.equals(this.M, "jsapi") && this.S;
    }

    public synchronized void sendDataToSdk(String str, String str2, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccf201dd", new Object[]{this, str, str2, map});
        } else if (!TextUtils.equals(PhoneCashierMspEngine.getMspWallet().getWalletConfig("DegradeMspSendDataToSdk"), "Y")) {
            IRemoteServiceCallback remoteCallback = getRemoteCallback();
            if (remoteCallback != null) {
                LogUtil.record(2, "MspContext:sendDataToSdk", "v=" + this.f0);
                if (getRemoteCallbackVersion() > 1) {
                    remoteCallback.r03(str, str2, map);
                }
            }
        }
    }

    public final void b(boolean z) {
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        if (isSubmitState() && !z) {
            MspNetHandler mspNetHandler = this.mMspNetHandler;
            if (mspNetHandler != null && mspNetHandler.isGraySyncRenderSupport() && this.mMspNetHandler.isShowSyncPayResult()) {
                getStatisticInfo().addEvent(new StEvent(getCurrentWinTpName(), "doExit", "showSyncPayResult"));
            } else {
                return;
            }
        }
        if (!isExit()) {
            this.mExit = true;
            LogUtil.record(2, "MspTradeContext:doExit", this + " exit");
            MspWindowClient mspWindowClient = this.E;
            if (mspWindowClient != null) {
                if (mspWindowClient.isNoPresenterSet() || this.E.getCurrentPresenter() != null) {
                    z2 = true;
                }
                this.E.onExit();
            }
            this.mExit = true;
            if (getStoreCenter() != null) {
                getStoreCenter().doCleanBeforeWindowChange(11);
            }
            if (!z2 || isExitCashierBeforePay()) {
                if (isFromEntranceActivity()) {
                    MspPayResult mspPayResult = getMspPayResult();
                    StringBuilder sb = new StringBuilder();
                    sb.append(ResultStatus.PAY_EXCEPTION_CODE.getStatus());
                    mspPayResult.setEndCode(sb.toString());
                    if (isUseNewPayResultLock()) {
                        openPayCallbackLock();
                    } else {
                        synchronized (this) {
                            notifyAll();
                        }
                    }
                } else {
                    this.G.exitWithoutPage();
                }
            } else if (isUseNewPayResultLock()) {
                openPayCallbackLock();
            } else {
                synchronized (this) {
                    notifyAll();
                }
            }
            String str = "";
            try {
                str = URLEncoder.encode(this.J.formatResult(3), "utf8");
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
            ApLinkTokenUtils.spmPaymentEnd(this, str);
            MonitorRunnable monitorRunnable = new MonitorRunnable(new Runnable() { // from class: com.alipay.android.msp.core.context.MspTradeContext.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        MspTradeContext.access$400(MspTradeContext.this).onExit();
                    }
                }
            }, 600L);
            Context context = this.mContext;
            if (context == null || !FastStartActivityHelper.getBoolConfig(context, DrmKey.GRAY_DELAY_THREAD_RUNNABLE)) {
                TaskHelper.execute(monitorRunnable, 600L);
            } else {
                TaskHelper.getInstance().executeDelayed(monitorRunnable, 600L, TaskHelper.ThreadName.UI_CONTEXT);
            }
            JSPluginManager.getInstanse().unregisterJSPlugin((Context) null, "submit");
            JSPluginManager.getInstanse().unregisterJSPlugin((Context) null, MspEventTypes.ACTION_STRING_BNVB);
            ThreadController.endWithOutScheme(ThreadController.CASHIER_START_PAY);
        }
    }
}
