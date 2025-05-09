package com.alipay.android.msp.core.context;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.util.Pair;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.content.MspContextLifecycleCallbacks;
import com.alipay.android.msp.core.MspNetHandler;
import com.alipay.android.msp.core.clients.MspLogicClient;
import com.alipay.android.msp.core.clients.MspUIClient;
import com.alipay.android.msp.core.frame.MspWindowFrameStack;
import com.alipay.android.msp.core.section.MqpBehavior;
import com.alipay.android.msp.drivers.actions.ActionsCreator;
import com.alipay.android.msp.drivers.stores.storecenter.StoreCenter;
import com.alipay.android.msp.framework.db.MspDbManager;
import com.alipay.android.msp.framework.drm.ConfigChangeMonitor;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.framework.drm.FastStartActivityHelper;
import com.alipay.android.msp.framework.drm.TemplateChangeMonitor;
import com.alipay.android.msp.framework.dynfun.DynConstants;
import com.alipay.android.msp.framework.dynfun.DynDataWrapper;
import com.alipay.android.msp.framework.dynfun.NativeDynFunManager;
import com.alipay.android.msp.framework.dynfun.NativeTplRuntimeManager;
import com.alipay.android.msp.framework.ext.MspExtSceneManager;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.helper.MspExperimentHelper;
import com.alipay.android.msp.framework.statisticsv2.ClientEndCode;
import com.alipay.android.msp.framework.statisticsv2.Grammar;
import com.alipay.android.msp.framework.statisticsv2.StatisticInfo;
import com.alipay.android.msp.framework.statisticsv2.Vector;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.taskscheduler.MonitorRunnable;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.pay.callback.IAlipayCallback;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.ui.widget.MspDialogHelper;
import com.alipay.android.msp.utils.BroadcastUtil;
import com.alipay.android.msp.utils.EventBusUtil;
import com.alipay.android.msp.utils.EventLogUtil;
import com.alipay.android.msp.utils.JsonUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBDocument;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class MspContext implements MspContextLifecycleCallbacks {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static String CONTEXT_TYPE_BNFRAME = "bnFrame";
    public static String CONTEXT_TYPE_PAY = "pay";
    public static String CONTEXT_TYPE_RENDER = "render";
    public static final int FRAME_BUILD_NULL = 101;
    public static final String MQP_EXP_JS_PLUGIN_REGISTER_ASYNC_10556 = "MQP_exp_js_plugin_register_async_10556";
    public static boolean x;
    public static boolean y;
    public static boolean z;

    /* renamed from: a  reason: collision with root package name */
    public String f3548a;
    public boolean b;
    public boolean c;
    public String d;
    public String e;
    public String f;
    public boolean g;
    public boolean isFromAidl;
    public StatisticInfo j;
    @Deprecated
    public FBDocument l;
    public String mAlertIntelligenceId;
    public String mAlertIntelligenceToken;
    public int mBizId;
    public int mCallingPid;
    public DynDataWrapper<JSONArray> mChangeTokens;
    public Context mContext;
    public String mContextType;
    public volatile boolean mExit;
    public boolean mIsSchemePay;
    public MspNetHandler mMspNetHandler;
    public StoreCenter mStoreCenter;
    public int mTaskId;
    public String n;
    public boolean o;
    public boolean p;
    public boolean q;
    public MspDialogHelper s;
    public Throwable t;
    public ActionsCreator u;
    public boolean h = false;
    public String i = "";
    public JSONObject k = new JSONObject();
    @Deprecated
    public boolean m = false;
    public boolean isBizAppCollectMoneyPage = false;
    public boolean r = true;
    public boolean extPaySuccessReported = false;
    public String v = Grammar.ATTR_DEFAULT_VALUE;
    public boolean w = false;

    public static /* synthetic */ void access$000(MspContext mspContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b62e6ed", new Object[]{mspContext});
        } else {
            mspContext.a();
        }
    }

    public static boolean isJsPluginRegisterAsync() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5120dd1e", new Object[0])).booleanValue();
        }
        return z;
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        FBDocument fBDocument = this.l;
        if (fBDocument != null) {
            try {
                fBDocument.destroy(null);
                LogUtil.record(4, "MspContext:exit", "mFbDocumentCount destroy, mspContext=".concat(String.valueOf(this)));
                this.l = null;
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
            }
        }
    }

    public void clearWorkerFbDoc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("749e8578", new Object[]{this});
        } else if (MspDbManager.getDbManager().isEnableBehaviorManager()) {
            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.core.context.MspContext.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        MspContext.access$000(MspContext.this);
                    }
                }
            }, 10000L);
        } else {
            a();
        }
    }

    @Override // com.alipay.android.msp.content.MspContextLifecycleCallbacks
    public void didEnterBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c051a8ae", new Object[]{this});
            return;
        }
        LogUtil.record(2, "MspContext:didEnterBackground", "this=".concat(String.valueOf(this)));
        StatisticInfo statisticInfo = getStatisticInfo();
        Vector vector = Vector.Result;
        this.v = statisticInfo.getAttr(vector, "clientEndCode");
        String currentWinTpName = getCurrentWinTpName();
        getStatisticInfo().addEvent(new StEvent(currentWinTpName, "native", "resign_active"));
        StatisticInfo statisticInfo2 = getStatisticInfo();
        StringBuilder sb = new StringBuilder();
        sb.append(ClientEndCode.USEREXITAPP);
        statisticInfo2.updateAttr(vector, "clientEndCode", sb.toString());
        getStatisticInfo().updateAttr(vector, "lastPage", currentWinTpName);
        getStatisticInfo().persistSave();
        MqpBehavior.getInstance().didEnterBackground(this);
    }

    public abstract void exit(int i);

    public void exit(int i, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5910996", new Object[]{this, new Integer(i), new Boolean(z2)});
            return;
        }
        LogUtil.i("MspContext", "exit", "delay=" + i + " forceExit=" + z2);
        if (!TaskHelper.isMainThread()) {
            NativeDynFunManager.processWithFallbackSync(this.mBizId, DynConstants.DynFunNames.F_CTX_WILL_EXIT, new Object[0], NativeDynFunManager.FallbackFunction.noop, 1000L);
        } else {
            LogUtil.printExceptionStackTrace("MspContext", "exit in main thread", new RuntimeException("for log only"));
            NativeDynFunManager.processWithFallbackAsync(this.mBizId, DynConstants.DynFunNames.F_CTX_WILL_EXIT, new Object[0], NativeDynFunManager.FallbackFunction.noop, NativeDynFunManager.ResultCallbackFunction.noop);
        }
        MqpBehavior.getInstance().onServiceOut(this);
        BroadcastUtil.resetNotifications(this, this.mContext);
        EventBusUtil.resetNotifications(this, this.mContext);
        this.s = null;
        if (NativeTplRuntimeManager.drmEnabled()) {
            MonitorRunnable monitorRunnable = new MonitorRunnable(new Runnable() { // from class: com.alipay.android.msp.core.context.MspContext.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    NativeTplRuntimeManager.garbageRemoval(MspContext.this.mBizId);
                    NativeDynFunManager.garbageRemoval(MspContext.this.mBizId);
                }
            }, 8000L);
            Context context = this.mContext;
            if (context == null || !DrmManager.getInstance(context).isGray(DrmKey.GRAY_DELAY_THREAD_RUNNABLE, false, this.mContext)) {
                TaskHelper.execute(monitorRunnable, 8000L);
            } else {
                TaskHelper.getInstance().executeDelayed(monitorRunnable, 8000L, TaskHelper.ThreadName.UI_CONTEXT);
            }
        }
    }

    public ActionsCreator getActionsCreator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActionsCreator) ipChange.ipc$dispatch("c819fa7c", new Object[]{this});
        }
        return this.u;
    }

    public String getAlertIntelligenceId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("47512979", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.mAlertIntelligenceId)) {
            this.mAlertIntelligenceId = getServerFoundUserId() + System.currentTimeMillis();
            this.mAlertIntelligenceId += "_-";
        }
        return this.mAlertIntelligenceId;
    }

    public String getAlertIntelligenceToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91d6405", new Object[]{this});
        }
        return this.mAlertIntelligenceToken;
    }

    public IAlipayCallback getAlipayCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IAlipayCallback) ipChange.ipc$dispatch("2848e44c", new Object[]{this});
        }
        if (this instanceof MspTradeContext) {
            MspTradeContext mspTradeContext = (MspTradeContext) this;
            if (!(mspTradeContext.getOrderInfo() == null || mspTradeContext.getOrderInfo() == null)) {
                return MspContextManager.getInstance().getAlipayCallbackByCallingPid(mspTradeContext.getOrderInfo().hashCode(), this.mCallingPid);
            }
        }
        return MspContextManager.getInstance().getAlipayCallbackByCallingPid(-1, this.mCallingPid);
    }

    public abstract String getApLinkToken();

    public String getApLinkTokenOrLogTraceId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4f770260", new Object[]{this});
        }
        String apLinkToken = getApLinkToken();
        if (TextUtils.isEmpty(apLinkToken)) {
            apLinkToken = getStatisticInfo().getAttr(Vector.Time, "traceId");
        }
        return (TextUtils.isEmpty(apLinkToken) || TextUtils.equals(apLinkToken, "-")) ? "" : apLinkToken;
    }

    public String getBizCodeForKeySpm() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b797aa49", new Object[]{this});
        }
        if (x) {
            return "payimp";
        }
        return "pay";
    }

    public int getBizId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("14dc0c52", new Object[]{this})).intValue();
        }
        return this.mBizId;
    }

    public String getCallbackUrlForOpenWeb() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a83205a4", new Object[]{this});
        }
        return this.n;
    }

    public int getCallingPid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aa45a017", new Object[]{this})).intValue();
        }
        return this.mCallingPid;
    }

    public JSONArray getChangeTokens() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("a2dda4f7", new Object[]{this});
        }
        DynDataWrapper<JSONArray> dynDataWrapper = this.mChangeTokens;
        if (dynDataWrapper != null) {
            return dynDataWrapper.read();
        }
        return null;
    }

    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        if (this.mContext == null) {
            this.mContext = GlobalHelper.getInstance().getContext();
        }
        return this.mContext;
    }

    public String getContextType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("afbba086", new Object[]{this});
        }
        return this.mContextType;
    }

    public String getCurrentWinTpName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cb185ed9", new Object[]{this});
        }
        return this.f3548a;
    }

    public long getDelayDisposeTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c107c87a", new Object[]{this})).longValue();
        }
        return 0L;
    }

    public String getGlobalSession() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1ba5115c", new Object[]{this});
        }
        return this.i;
    }

    public boolean getGrayJsPluginBnRegisterAsync() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e89c0a3", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean getGrayJsPluginRegisterBeforeViewLoad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70e34d0d", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean getGrayJsPluginRegisterRenderInvoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1feb64f1", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean getGrayJsPluginRepeatRegister() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0f2e79e", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public abstract boolean getGrayOnPadAdaptMode();

    public abstract boolean getGrayUnifiedReadPadConfig();

    public JSONObject getMetaSessionDataByKeys(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("450317c8", new Object[]{this, list});
        }
        JSONObject jSONObject = new JSONObject();
        if (list != null && list.size() > 0) {
            for (String str : list) {
                if (!TextUtils.isEmpty(str) && this.k.containsKey(str)) {
                    jSONObject.put(str, (Object) this.k.getString(str));
                }
            }
        }
        return jSONObject;
    }

    public abstract MspBasePresenter getMspBasePresenter();

    public MspDialogHelper getMspDialogHelper() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspDialogHelper) ipChange.ipc$dispatch("543a1500", new Object[]{this});
        }
        return this.s;
    }

    public abstract MspExtSceneManager getMspExtSceneManager();

    public abstract MspLogicClient getMspLogicClient();

    public MspNetHandler getMspNetHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspNetHandler) ipChange.ipc$dispatch("75207156", new Object[]{this});
        }
        return this.mMspNetHandler;
    }

    public abstract MspUIClient getMspUIClient();

    public String getServerFoundUserId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c157a9ea", new Object[]{this});
        }
        return this.f;
    }

    public String getSpmDpToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b401d3e6", new Object[]{this});
        }
        return this.e;
    }

    public String getSpmSessionId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8dc1a662", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.d)) {
            this.d = this.mBizId + GlobalHelper.getInstance().getUtdid(this.mContext);
        }
        if (TextUtils.isEmpty(this.e)) {
            this.e = "null";
        }
        return "dpCheck_" + this.d + "_" + this.e;
    }

    public String getSpmUniqueId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e2630d53", new Object[]{this});
        }
        return this.d;
    }

    public StatisticInfo getStatisticInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StatisticInfo) ipChange.ipc$dispatch("a01255e5", new Object[]{this});
        }
        if (this.j == null) {
            this.j = new StatisticInfo(this.mBizId);
        }
        return this.j;
    }

    public abstract StoreCenter getStoreCenter();

    public int getTaskId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("16006df0", new Object[]{this})).intValue();
        }
        return this.mTaskId;
    }

    public Throwable getThrowableWhenNoPresenter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Throwable) ipChange.ipc$dispatch("4899314f", new Object[]{this});
        }
        return this.t;
    }

    public abstract String getTradeNo();

    public abstract MspWindowFrameStack getWindowStack();

    public FBDocument getWorkerServiceDoc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FBDocument) ipChange.ipc$dispatch("ef9dfa5f", new Object[]{this});
        }
        return this.l;
    }

    public boolean isExit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("521f25f3", new Object[]{this})).booleanValue();
        }
        return this.mExit;
    }

    public boolean isFingerPay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea9f1480", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    public boolean isFromAidl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1807f4f", new Object[]{this})).booleanValue();
        }
        return this.isFromAidl;
    }

    public boolean isFromEntranceActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84db7c04", new Object[]{this})).booleanValue();
        }
        return this.p;
    }

    public boolean isFromOutScheme() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ddfea0a", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public boolean isFromWallet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a09ea318", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public boolean isGrayNative2Dyapi() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83fd3b82", new Object[]{this})).booleanValue();
        }
        return this.m;
    }

    public boolean isHasShowResultPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be78c64", new Object[]{this})).booleanValue();
        }
        return this.h;
    }

    public boolean isMspBgTransparent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e747b8", new Object[]{this})).booleanValue();
        }
        return this.r;
    }

    public boolean isObscuredTouch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3f9f121", new Object[]{this})).booleanValue();
        }
        return this.o;
    }

    public boolean isSchemePay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cee1a6c4", new Object[]{this})).booleanValue();
        }
        return this.mIsSchemePay;
    }

    public boolean isTranslucentBg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25bb16ff", new Object[]{this})).booleanValue();
        }
        return this.q;
    }

    public boolean isUpgradePreRendTpl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c76a221", new Object[]{this})).booleanValue();
        }
        return this.w;
    }

    public boolean isUseSafeJsExecute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e74b9b6d", new Object[]{this})).booleanValue();
        }
        return y;
    }

    public void onCompensating(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3f8e789", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.alipay.android.msp.content.MspContextLifecycleCallbacks
    public void onContextCreated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8adf5e7f", new Object[]{this});
            return;
        }
        MqpBehavior.getInstance().onServiceIn(this);
        MspExperimentHelper.reportEvent(this, "MQP_upgrade_prerender_exp");
    }

    public void onRendFrameSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20e9d25", new Object[]{this});
        }
    }

    public void onRendResultPage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab2d3ba5", new Object[]{this, str});
        }
    }

    @Override // com.alipay.android.msp.content.MspContextLifecycleCallbacks
    public void onRestart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c630bb7", new Object[]{this});
        }
    }

    @Override // com.alipay.android.msp.content.MspContextLifecycleCallbacks
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        }
    }

    @Override // com.alipay.android.msp.content.MspContextLifecycleCallbacks
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        }
    }

    public abstract void reportExtPaySuccessOnlyOnce();

    public void setActionsCreator(ActionsCreator actionsCreator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f93fb28", new Object[]{this, actionsCreator});
        } else {
            this.u = actionsCreator;
        }
    }

    public void setAlertIntelligenceToken(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41097211", new Object[]{this, str});
        } else {
            this.mAlertIntelligenceToken = str;
        }
    }

    public void setCallbackUrlForOpenWeb(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b469dcba", new Object[]{this, str});
        } else {
            this.n = str;
        }
    }

    public void setCallingPid(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d54570d3", new Object[]{this, new Integer(i)});
        } else {
            this.mCallingPid = i;
        }
    }

    public void setContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{this, context});
        } else {
            this.mContext = context;
        }
    }

    public void setFingerPay(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7926db10", new Object[]{this, new Boolean(z2)});
        } else {
            this.g = z2;
        }
    }

    public void setFromOutScheme(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55f75ac6", new Object[]{this, new Boolean(z2)});
        } else {
            this.c = z2;
        }
    }

    public void setFromWallet(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa96c08", new Object[]{this, new Boolean(z2)});
        } else {
            this.b = z2;
        }
    }

    public void setGlobalSession(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d9cfc02", new Object[]{this, str});
        } else {
            this.i = str;
        }
    }

    public void setGrayNative2Dyapi(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e1d6ade", new Object[]{this, new Boolean(z2)});
        } else {
            this.m = z2;
        }
    }

    public void setHasShowResultPage(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ce8a7ac", new Object[]{this, new Boolean(z2)});
        } else {
            this.h = z2;
        }
    }

    public void setMetaSessionData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78bcd390", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            JSONObject jSONObject2 = this.k;
            if (jSONObject2 == null || jSONObject2.isEmpty()) {
                this.k = jSONObject;
            } else {
                this.k = JsonUtil.merge(this.k, jSONObject);
            }
        }
    }

    public void setMspBgTransparent(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a74e568", new Object[]{this, new Boolean(z2)});
        } else {
            this.r = z2;
        }
    }

    public void setMspDialogHelper(MspDialogHelper mspDialogHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e295420", new Object[]{this, mspDialogHelper});
        } else {
            this.s = mspDialogHelper;
        }
    }

    public void setObscuredTouch(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931e368f", new Object[]{this, new Boolean(z2)});
            return;
        }
        if (this.o != z2) {
            StatisticInfo statisticInfo = getStatisticInfo();
            statisticInfo.addError(ErrorType.WARNING, "ObscuredTouch", z2 + "|" + this.o);
        }
        this.o = z2;
    }

    public void setServerFoundUserId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("671c9b34", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public void setSpmUniqueId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81b5cbeb", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public void setTaskId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4073381a", new Object[]{this, new Integer(i)});
        } else {
            this.mTaskId = i;
        }
    }

    public void setThrowableWhenNoPresenter(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("244fe13f", new Object[]{this, th});
        } else {
            this.t = th;
        }
    }

    public void setTranslucentBg(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6981cc71", new Object[]{this, new Boolean(z2)});
        } else {
            this.q = z2;
        }
    }

    public void setWorkerServiceDoc(FBDocument fBDocument) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6a9df11", new Object[]{this, fBDocument});
        } else {
            this.l = fBDocument;
        }
    }

    public void updateCurrentWinTpName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8adb01e4", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            if (str.equals("null")) {
                this.f3548a = "";
            } else {
                this.f3548a = str;
            }
        }
    }

    public void updateResult(String str, String str2, String str3, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6973a65", new Object[]{this, str, str2, str3, jSONObject});
        }
    }

    public abstract void updateTradeNo(String str);

    public JSONObject uploadChanges(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c4af45b3", new Object[]{this, str});
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray changeTokens = getChangeTokens();
            if (changeTokens == null) {
                changeTokens = new JSONArray();
            }
            jSONObject.put(DynConstants.DynDataNames.D_CHANGE_TOKENS, (Object) changeTokens);
            Pair exit = ConfigChangeMonitor.getInstance().exit();
            Pair exit2 = TemplateChangeMonitor.getInstance().exit();
            Boolean bool = Boolean.FALSE;
            jSONObject.put("changed", (Object) bool);
            jSONObject.put("configChanged", (Object) bool);
            jSONObject.put("templateChanged", (Object) bool);
            LogUtil.i("MspContext", "configChange", ((JSONArray) exit.second).toString());
            jSONObject.put("recentlyChange", (Object) ((JSONArray) exit.second).toString());
            jSONObject.put("recentlyConfigChange", exit.second);
            jSONObject.put("configChanged", exit.first);
            if (((Boolean) exit.first).booleanValue()) {
                jSONObject.put("changed", (Object) Boolean.TRUE);
            }
            LogUtil.i("MspContext", "templateChange", ((JSONArray) exit2.second).toString());
            jSONObject.put("recentlyTemplateChange", exit2.second);
            jSONObject.put("templateChanged", exit2.first);
            if (((Boolean) exit2.first).booleanValue()) {
                jSONObject.put("changed", (Object) Boolean.TRUE);
            }
            jSONObject.put("ap_link_token", (Object) getAlertIntelligenceId());
            jSONObject.put("biz_type", (Object) str);
            HashMap hashMap = new HashMap();
            for (Map.Entry<String, Object> entry : jSONObject.getInnerMap().entrySet()) {
                hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
            EventLogUtil.logPayEvent("1010971", hashMap);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        return jSONObject;
    }

    @Override // com.alipay.android.msp.content.MspContextLifecycleCallbacks
    public void willEnterForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9842010", new Object[]{this});
            return;
        }
        LogUtil.record(2, "MspContext:willEnterForeground", "this=".concat(String.valueOf(this)));
        String currentWinTpName = getCurrentWinTpName();
        StatisticInfo statisticInfo = getStatisticInfo();
        Vector vector = Vector.Result;
        statisticInfo.updateAttr(vector, "clientEndCode", this.v);
        getStatisticInfo().updateAttr(vector, "lastPage", Grammar.ATTR_DEFAULT_VALUE);
        getStatisticInfo().addEvent(new StEvent(currentWinTpName, "native", "become_active"));
        getStatisticInfo().persistDelete();
        MqpBehavior.getInstance().willEnterForeground(this);
        PhoneCashierMspEngine.getMspWallet().getWalletConfig("willEnterForeground");
    }

    public void loadDrm() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53fcc6e0", new Object[]{this});
            return;
        }
        Context context = getContext();
        if (context != null) {
            x = FastStartActivityHelper.getBoolConfig(context, DrmKey.GRAY_SPM_REPORT_USE_PAYIMP);
            y = !FastStartActivityHelper.getBoolConfig(context, DrmKey.DEGRADE_USE_SAFE_JS_EXECUTE_10560);
            this.w = MspExperimentHelper.isGray("MQP_upgrade_prerender_exp");
            z = true ^ FastStartActivityHelper.getBoolConfig(context, DrmKey.DEGRADE_JS_PLUGIN_REGISTER_ASYNC_10560);
            try {
                PhoneCashierMspEngine.getMspWallet().initConfigManger(context);
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
    }

    public void setFromEntranceActivity(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6110169c", new Object[]{this, new Boolean(z2)});
            return;
        }
        this.p = z2;
        LogUtil.record(2, "MspContext:setFromEntranceActivity", "v=" + this.p);
    }

    public void uploadLogForPayImp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe679d71", new Object[]{this});
            return;
        }
        LoggerFactory.getLogContext().flush("payimp", false);
        LoggerFactory.getLogContext().uploadAfterSync("payimp");
    }

    public void setSpmDpToken(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43223050", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            for (String str2 : str.split(";")) {
                String[] split = str2.split("=");
                if (split.length == 2) {
                    String str3 = split[0];
                    String str4 = split[1];
                    if (TextUtils.equals(str3, "ndpt")) {
                        this.e = str4;
                    }
                }
            }
        }
    }
}
