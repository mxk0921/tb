package com.alipay.android.msp.core.context;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.birdnest.api.MspWindowLoadListener;
import com.alipay.android.app.birdnest.api.MspWindowLoadPoint;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.container.MspContainerClient;
import com.alipay.android.msp.container.MspContainerResult;
import com.alipay.android.msp.core.MspNetHandler;
import com.alipay.android.msp.core.callback.MspContextFinishCallback;
import com.alipay.android.msp.core.clients.MspLogicClient;
import com.alipay.android.msp.core.clients.MspUIClient;
import com.alipay.android.msp.core.clients.MspWindowClient;
import com.alipay.android.msp.core.component.JsExceptionReceiver;
import com.alipay.android.msp.core.frame.MspWindowFrame;
import com.alipay.android.msp.core.frame.MspWindowFrameStack;
import com.alipay.android.msp.drivers.actions.ActionsCreator;
import com.alipay.android.msp.drivers.actions.InvokeActionPlugin;
import com.alipay.android.msp.drivers.stores.storecenter.ActionStoreCenter;
import com.alipay.android.msp.drivers.stores.storecenter.StoreCenter;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.framework.encrypt.EncryptUtil;
import com.alipay.android.msp.framework.ext.MspExtSceneManager;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.offline.OfflineRenderLogic;
import com.alipay.android.msp.framework.statisticsv2.Vector;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.storage.PrefUtils;
import com.alipay.android.msp.framework.taskscheduler.MonitorRunnable;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.ui.presenters.MspContainerPresenter;
import com.alipay.android.msp.utils.BroadcastUtil;
import com.alipay.android.msp.utils.EventLogUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MspContainerContext extends MspContext {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BIRD_NEST_CREATE_ERROR = 1;
    public static final int BIRD_NEST_DOCUMENT_NULL = 3;
    public static final int BIRD_NEST_GENERATE_ERROR = 2;
    public static final int FORCE_IN_ANIM_BOTTOM = 2;
    public static final int FORCE_IN_ANIM_FADE = 1;
    public static final int FORCE_IN_ANIM_NOT_SPECIFIED = 0;
    public static final int FORCE_IN_ANIM_RIGHT = 3;
    public static final int PAGE_DATA_EMPTY = 0;
    public static final Set<MspContainerContext> W = Collections.synchronizedSet(new HashSet());
    public JSONObject A;
    public final String B;
    public final String C;
    public final MspWindowClient D;
    public final MspLogicClient E;
    public final String F;
    public final String G;
    public final org.json.JSONObject H;
    public final org.json.JSONObject I;
    public final String J;
    public final String K;
    public final String L;
    public final boolean M;
    public MspContainerClient N;
    public final boolean O;
    public boolean P;
    public boolean Q;
    public MspExtSceneManager R;
    public final MspContextFinishCallback S;
    public String T;
    public final boolean U;
    public final int V;

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b6 A[Catch: all -> 0x0067, TRY_LEAVE, TryCatch #0 {all -> 0x0067, blocks: (B:4:0x0042, B:6:0x0051, B:8:0x0064, B:10:0x0069, B:17:0x0086, B:20:0x0091, B:23:0x009b, B:30:0x00ac, B:31:0x00af, B:32:0x00b2, B:33:0x00b6), top: B:46:0x0042 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MspContainerContext(int r4, com.alibaba.fastjson.JSONObject r5, java.lang.String r6, java.lang.String r7, android.content.Context r8, boolean r9, android.os.Bundle r10, android.os.Bundle r11, java.lang.String r12, boolean r13, com.alipay.android.msp.core.callback.MspContextFinishCallback r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.core.context.MspContainerContext.<init>(int, com.alibaba.fastjson.JSONObject, java.lang.String, java.lang.String, android.content.Context, boolean, android.os.Bundle, android.os.Bundle, java.lang.String, boolean, com.alipay.android.msp.core.callback.MspContextFinishCallback, java.lang.String):void");
    }

    public static /* synthetic */ boolean access$002(MspContainerContext mspContainerContext, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("168e43b4", new Object[]{mspContainerContext, new Boolean(z)})).booleanValue();
        }
        mspContainerContext.P = z;
        return z;
    }

    public static /* synthetic */ boolean access$100(MspContainerContext mspContainerContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9330849", new Object[]{mspContainerContext})).booleanValue();
        }
        return mspContainerContext.Q;
    }

    public static /* synthetic */ boolean access$102(MspContainerContext mspContainerContext, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("644dbbb5", new Object[]{mspContainerContext, new Boolean(z)})).booleanValue();
        }
        mspContainerContext.Q = z;
        return z;
    }

    public static /* synthetic */ MspExtSceneManager access$202(MspContainerContext mspContainerContext, MspExtSceneManager mspExtSceneManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspExtSceneManager) ipChange.ipc$dispatch("d795e56a", new Object[]{mspContainerContext, mspExtSceneManager});
        }
        mspContainerContext.R = mspExtSceneManager;
        return mspExtSceneManager;
    }

    public static /* synthetic */ void access$300(MspContainerContext mspContainerContext, MspContainerPresenter mspContainerPresenter, MspWindowLoadListener mspWindowLoadListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91e86c75", new Object[]{mspContainerContext, mspContainerPresenter, mspWindowLoadListener});
        } else {
            mspContainerContext.c(mspContainerPresenter, mspWindowLoadListener);
        }
    }

    public static /* synthetic */ JSONObject access$500(MspContainerContext mspContainerContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("407e7ee1", new Object[]{mspContainerContext});
        }
        return mspContainerContext.A;
    }

    public static /* synthetic */ String access$700(MspContainerContext mspContainerContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("99a1e301", new Object[]{mspContainerContext});
        }
        return mspContainerContext.C;
    }

    public static /* synthetic */ void access$800(MspContainerContext mspContainerContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dda235e", new Object[]{mspContainerContext});
        } else {
            mspContainerContext.d();
        }
    }

    public static /* synthetic */ MspLogicClient access$900(MspContainerContext mspContainerContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspLogicClient) ipChange.ipc$dispatch("6201d82e", new Object[]{mspContainerContext});
        }
        return mspContainerContext.E;
    }

    public static org.json.JSONObject b(Bundle bundle) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (org.json.JSONObject) ipChange.ipc$dispatch("a01125a", new Object[]{bundle});
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (bundle == null) {
            return jSONObject;
        }
        Set<String> hashSet = new HashSet<>();
        try {
            hashSet = bundle.keySet();
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        if (hashSet != null && hashSet.size() > 0) {
            for (String str2 : hashSet) {
                if (str2 instanceof String) {
                    try {
                        String str3 = str2;
                        Object obj = bundle.get(str3);
                        if (obj == null) {
                            str = "";
                        } else {
                            str = String.valueOf(obj);
                        }
                        jSONObject.put(str3, str);
                    } catch (Throwable th2) {
                        LogUtil.printExceptionStackTrace(th2);
                    }
                }
            }
        }
        return jSONObject;
    }

    public static void fillSceneParams(MspWindowFrame mspWindowFrame, MspContainerContext mspContainerContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57da0cc1", new Object[]{mspWindowFrame, mspContainerContext});
        } else if (mspWindowFrame != null && mspContainerContext != null) {
            mspWindowFrame.setSceneParams(mspContainerContext.I);
        }
    }

    public static void fillStartupParams(MspWindowFrame mspWindowFrame, MspContainerContext mspContainerContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("492e52b0", new Object[]{mspWindowFrame, mspContainerContext});
        } else if (mspWindowFrame != null && mspContainerContext != null) {
            mspWindowFrame.setStartupParams(mspContainerContext.H);
        }
    }

    public static /* synthetic */ Object ipc$super(MspContainerContext mspContainerContext, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1275533431) {
            super.onCompensating(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode == -980350570) {
            super.exit(((Number) objArr[0]).intValue(), ((Boolean) objArr[1]).booleanValue());
            return null;
        } else if (hashCode == 34512165) {
            super.onRendFrameSuccess();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alipay/android/msp/core/context/MspContainerContext");
        }
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

    public int forceInAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dd924f9b", new Object[]{this})).intValue();
        }
        return this.V;
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public String getApLinkToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dd8b99bf", new Object[]{this});
        }
        return this.J;
    }

    public String getBizData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c78d2232", new Object[]{this});
        }
        return this.G;
    }

    public String getBizType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c07dca2", new Object[]{this});
        }
        return this.F;
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public boolean getGrayOnPadAdaptMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f3e32d5", new Object[]{this})).booleanValue();
        }
        return this.P;
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public boolean getGrayUnifiedReadPadConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3135251", new Object[]{this})).booleanValue();
        }
        return this.Q;
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public MspBasePresenter getMspBasePresenter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspBasePresenter) ipChange.ipc$dispatch("69a95869", new Object[]{this});
        }
        return this.D.getCurrentPresenter();
    }

    public MspContainerClient getMspContainerClient() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspContainerClient) ipChange.ipc$dispatch("5d8c89a4", new Object[]{this});
        }
        return this.N;
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public MspExtSceneManager getMspExtSceneManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspExtSceneManager) ipChange.ipc$dispatch("fd7b3373", new Object[]{this});
        }
        return this.R;
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public MspLogicClient getMspLogicClient() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspLogicClient) ipChange.ipc$dispatch("220bab2f", new Object[]{this});
        }
        return this.E;
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public MspUIClient getMspUIClient() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspUIClient) ipChange.ipc$dispatch("52f9383d", new Object[]{this});
        }
        return this.D;
    }

    public String getStatsBizType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8d886db5", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.L)) {
            return "render";
        }
        return this.L;
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public StoreCenter getStoreCenter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StoreCenter) ipChange.ipc$dispatch("550b9278", new Object[]{this});
        }
        return this.mStoreCenter;
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public String getTradeNo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("59e3704a", new Object[]{this});
        }
        return this.T;
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public MspWindowFrameStack getWindowStack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspWindowFrameStack) ipChange.ipc$dispatch("b53eb85b", new Object[]{this});
        }
        return this.D.getFrameStack();
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public void onCompensating(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3f8e789", new Object[]{this, new Integer(i)});
            return;
        }
        super.onCompensating(i);
        if (i == 101 && this.O) {
            PrefUtils.putInt(PrefUtils.BIZ_OP_TYPE, PrefUtils.BIZ_ERROR_TIMES_KEY, Integer.valueOf(PrefUtils.getInt(PrefUtils.BIZ_OP_TYPE, PrefUtils.BIZ_ERROR_TIMES_KEY, 0).intValue() + 1));
        }
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public void onRendFrameSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20e9d25", new Object[]{this});
            return;
        }
        super.onRendFrameSuccess();
        MspContainerClient mspContainerClient = this.N;
        if (mspContainerClient != null && mspContainerClient.getMspContainerResult() != null) {
            this.N.getMspContainerResult().setErrorCode("0");
        }
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public void reportExtPaySuccessOnlyOnce() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe504dc", new Object[]{this});
        }
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public void setContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{this, context});
        } else if (context != null) {
            this.mContext = context;
        }
    }

    public void setMspWindowLoadListener(MspWindowLoadListener mspWindowLoadListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc57f0a2", new Object[]{this, mspWindowLoadListener});
        } else {
            this.D.setMspWindowLoadListener(mspWindowLoadListener);
        }
    }

    public boolean showRenderLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d75832d4", new Object[]{this})).booleanValue();
        }
        return this.U;
    }

    public MspContainerResult startContainer(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspContainerResult) ipChange.ipc$dispatch("cce16b3d", new Object[]{this, jSONObject});
        }
        if (this.N == null) {
            this.N = new MspContainerClient(this);
        }
        return this.N.startContainer(jSONObject);
    }

    public void startGenerateView(final MspContainerPresenter mspContainerPresenter, final MspWindowLoadListener mspWindowLoadListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8af7e6b5", new Object[]{this, mspContainerPresenter, mspWindowLoadListener});
        } else if (TaskHelper.isMainThread()) {
            TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.core.context.MspContainerContext.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        MspContainerContext.access$300(MspContainerContext.this, mspContainerPresenter, mspWindowLoadListener);
                    }
                }
            });
        } else {
            c(mspContainerPresenter, mspWindowLoadListener);
        }
    }

    public void startRend() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9fac9b2", new Object[]{this});
            return;
        }
        if (this.isBizAppCollectMoneyPage) {
            PhoneCashierMspEngine.getMspWallet().startSpiderSection("BIZ_SCAN_JUMP_MSP", "PAGE_DATA_PRE");
        }
        JSONObject analysisResultPageInfo = new OfflineRenderLogic().analysisResultPageInfo(getContext(), new HashMap(), this.A);
        this.A = analysisResultPageInfo;
        if (analysisResultPageInfo == null) {
            BroadcastUtil.sendRendPageResultToSource(this.C, getContext(), this.mBizId);
            return;
        }
        final String string = analysisResultPageInfo.getString(MspFlybirdDefine.FLYBIRD_TEMPLATE_ID);
        if (TextUtils.equals(string, MspFlybirdDefine.FLYBIRD_RESULT_TPL) || TextUtils.equals(string, MspFlybirdDefine.DEFAULT_RESULT_TPL_ID) || TextUtils.equals(string, MspFlybirdDefine.FLYBIRD_UNIFY_RESULT_TPL)) {
            TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.core.context.MspContainerContext.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    MspContainerContext.access$400(MspContainerContext.this, string);
                    MspContainerContext mspContainerContext = MspContainerContext.this;
                    if (!MspContainerContext.access$600(mspContainerContext, MspContainerContext.access$500(mspContainerContext), MspContainerContext.this.getContext())) {
                        BroadcastUtil.sendRendPageResultToSource(MspContainerContext.access$700(MspContainerContext.this), MspContainerContext.this.getContext(), MspContainerContext.this.mBizId);
                        MspContainerContext.this.exit(0);
                        return;
                    }
                    MspContainerContext.access$800(MspContainerContext.this);
                }
            });
            return;
        }
        LogUtil.record(4, "EncryptUtil:verifyTplData", "return true : degrade or not result  tplId = ".concat(String.valueOf(string)));
        d();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        int i = this.mBizId;
        return "<MspContainerContext with bizId: " + i + ">";
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public void updateTradeNo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cea32cd", new Object[]{this, str});
        } else {
            this.T = str;
        }
    }

    public static /* synthetic */ void access$400(MspContainerContext mspContainerContext, String str) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b346c92c", new Object[]{mspContainerContext, str});
        } else if (mspContainerContext.A == null) {
        } else {
            if ((TextUtils.equals(str, MspFlybirdDefine.FLYBIRD_RESULT_TPL) || TextUtils.equals(str, MspFlybirdDefine.FLYBIRD_UNIFY_RESULT_TPL)) && (jSONObject = mspContainerContext.A.getJSONObject("data")) != null) {
                String string = jSONObject.getString("tradeNo");
                if (!TextUtils.isEmpty(string)) {
                    mspContainerContext.updateTradeNo(string);
                    mspContainerContext.getStatisticInfo().updateAttr(Vector.Trade, "tradeNo", string);
                }
                LogUtil.record(2, "MspContainerContext.startRend", "is result page, tplId=" + str + ", tradeNo=" + string);
            }
        }
    }

    public final void c(MspContainerPresenter mspContainerPresenter, MspWindowLoadListener mspWindowLoadListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea5aea70", new Object[]{this, mspContainerPresenter, mspWindowLoadListener});
            return;
        }
        try {
            if (this.A == null) {
                LogUtil.record(4, "onWindowLoadFail", "PAGE_DATA_EMPTY，loadListener".concat(String.valueOf(mspWindowLoadListener)));
                Bundle bundle = new Bundle();
                bundle.putInt("mspBizId", this.mBizId);
                mspWindowLoadListener.onWindowLoadFail(0, bundle);
                return;
            }
            setMspWindowLoadListener(mspWindowLoadListener);
            this.D.setPresenter(this, mspContainerPresenter);
            JsExceptionReceiver.registerReceiver();
            mspContainerPresenter.registerInvokePlugin(this);
            if (mspWindowLoadListener instanceof MspWindowLoadPoint) {
                ((MspWindowLoadPoint) mspWindowLoadListener).beforeCreateView(this.mBizId);
            }
            StEvent stEvent = new StEvent("initial", "container", "render");
            ActionsCreator.get(this).createUIShowAction(this.A, false, stEvent);
            getStatisticInfo().addEvent(stEvent);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        try {
            if (this.M) {
                HashSet hashSet = new HashSet();
                for (MspContainerContext mspContainerContext : W) {
                    if (mspContainerContext != null && TextUtils.equals(this.K, mspContainerContext.K) && mspContainerContext.M) {
                        hashSet.add(mspContainerContext);
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    MspContainerContext mspContainerContext2 = (MspContainerContext) it.next();
                    if (mspContainerContext2 != null) {
                        mspContainerContext2.exit(0);
                    }
                }
                W.add(this);
            }
            this.D.setSuccNotifyName(this.B);
            this.D.setFailNotifyName(this.C);
            this.D.startContainerPage();
            StEvent stEvent = new StEvent("initial", "container", "render");
            ActionsCreator.get(this).createUIShowAction(this.A, false, stEvent);
            getStatisticInfo().addEvent(stEvent);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    @Override // com.alipay.android.msp.core.context.MspContext
    public void exit(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5910996", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        super.exit(i, z);
        synchronized (this) {
            try {
                if (!isExit()) {
                    this.mExit = true;
                    getStatisticInfo().updateAttr(Vector.Trade, "bizType", TextUtils.isEmpty(this.L) ? "render" : this.L);
                    LogUtil.record(2, "MspContainerContext:exit", "this=".concat(String.valueOf(this)));
                    MspWindowClient mspWindowClient = this.D;
                    if (mspWindowClient != null) {
                        mspWindowClient.onExit();
                    }
                    MspContextFinishCallback mspContextFinishCallback = this.S;
                    if (mspContextFinishCallback != null) {
                        mspContextFinishCallback.onMspContextFinish();
                    }
                    if (this.N == null) {
                        getStatisticInfo().updateResult("6001", getCurrentWinTpName());
                    }
                    MonitorRunnable monitorRunnable = new MonitorRunnable(new Runnable() { // from class: com.alipay.android.msp.core.context.MspContainerContext.4
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            if (MspContainerContext.access$900(MspContainerContext.this) != null) {
                                MspContainerContext.access$900(MspContainerContext.this).onExit();
                            }
                            MspContainerContext.this.getStatisticInfo().onStatisticEnd();
                        }
                    }, 600L);
                    Context context = this.mContext;
                    if (context == null || !DrmManager.getInstance(context).isGray(DrmKey.GRAY_DELAY_THREAD_RUNNABLE, false, this.mContext)) {
                        TaskHelper.execute(monitorRunnable, 600L);
                    } else {
                        TaskHelper.getInstance().executeDelayed(monitorRunnable, 600L, TaskHelper.ThreadName.UI_CONTEXT);
                    }
                    if (this.M) {
                        W.remove(this);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ boolean access$600(MspContainerContext mspContainerContext, JSONObject jSONObject, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fda3d27c", new Object[]{mspContainerContext, jSONObject, context})).booleanValue();
        }
        boolean verifyTplData = EncryptUtil.verifyTplData(jSONObject, context, mspContainerContext.mBizId);
        LogUtil.record(1, "MspContainerContext:needGoOnRend", "isVerified : ".concat(String.valueOf(verifyTplData)));
        if (verifyTplData) {
            return true;
        }
        mspContainerContext.getStatisticInfo().addError(ErrorType.DEFAULT, "verifyFail:wontRend", "");
        return false;
    }

    public MspContainerContext(int i, String str, String str2, boolean z, Context context, MspContextFinishCallback mspContextFinishCallback) {
        this.J = null;
        this.P = false;
        this.Q = false;
        this.U = true;
        this.V = 0;
        loadDrm();
        this.mBizId = i;
        setFromWallet(z);
        this.G = str;
        this.F = str2;
        this.L = str2;
        this.mContext = context;
        this.mContextType = MspContext.CONTEXT_TYPE_RENDER;
        this.S = mspContextFinishCallback;
        this.O = true;
        this.mMspNetHandler = new MspNetHandler(this);
        this.E = new MspLogicClient(this);
        this.D = new MspWindowClient(this);
        this.mStoreCenter = new ActionStoreCenter(this);
        MspContextManager.getInstance().addMspContext(i, this);
        GlobalHelper.getInstance().init(context);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        InvokeActionPlugin.registerRenderLocalInvokeFamily(this);
        InvokeActionPlugin.registerRenderBnInvokeFamily(this);
        EventLogUtil.logPayEvent("103627", HiAnalyticsConstant.BI_KEY_COST_TIME, String.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime), "content_type", "render");
        onContextCreated();
    }

    public MspContainerContext(int i, JSONObject jSONObject, String str, boolean z, Context context, MspContextFinishCallback mspContextFinishCallback) {
        this(i, jSONObject, null, null, context, z, null, null, str, true, mspContextFinishCallback, MspContext.CONTEXT_TYPE_RENDER);
        this.F = str;
    }
}
