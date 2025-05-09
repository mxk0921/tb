package com.alipay.android.msp.core.clients;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import androidx.core.util.Pair;
import com.ali.user.mobile.app.constant.UTConstant;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.IRemoteServiceCallback;
import com.alipay.android.app.birdnest.api.OnFrameTplEventListener;
import com.alipay.android.app.cctemplate.model.Template;
import com.alipay.android.app.render.api.result.MspPrepareResult;
import com.alipay.android.app.render.api.result.PreparedResult;
import com.alipay.android.app.template.FBContext;
import com.alipay.android.app.template.ITemplateClickCallback;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.core.callback.IRenderCallback;
import com.alipay.android.msp.core.context.MspContainerContext;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.core.frame.MspWindowFrame;
import com.alipay.android.msp.core.model.H5PopUpWindowItem;
import com.alipay.android.msp.drivers.actions.ActionsCreator;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.InvokeActionPlugin;
import com.alipay.android.msp.drivers.actions.MspEventCreator;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.framework.drm.FastStartActivityHelper;
import com.alipay.android.msp.framework.drm.TemplateChangeMonitor;
import com.alipay.android.msp.framework.dynfun.NativeTplRuntimeManager;
import com.alipay.android.msp.framework.dynfun.TplIdentity;
import com.alipay.android.msp.framework.exception.AppErrorException;
import com.alipay.android.msp.framework.helper.FlybirdRenderIntercepter;
import com.alipay.android.msp.framework.perf.ThreadController;
import com.alipay.android.msp.framework.statistics.SpmWrapper;
import com.alipay.android.msp.framework.statistics.userfeedback.UserFeedBackUtil;
import com.alipay.android.msp.framework.statisticsv2.ClientEndCode;
import com.alipay.android.msp.framework.statisticsv2.StatisticInfo;
import com.alipay.android.msp.framework.statisticsv2.Vector;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.framework.statisticsv2.model.StEventForRenderFinish;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.taskscheduler.MonitorRunnable;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.language.LanguageHelper;
import com.alipay.android.msp.pay.GlobalSdkConstant;
import com.alipay.android.msp.pay.callback.IAlipayCallback;
import com.alipay.android.msp.pay.results.ResultStatus;
import com.alipay.android.msp.plugin.ITemplateLoadedCallback;
import com.alipay.android.msp.plugin.RenderConfig;
import com.alipay.android.msp.plugin.RenderTime;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.plugin.manager.PluginManager;
import com.alipay.android.msp.ui.base.PreRendManager;
import com.alipay.android.msp.ui.base.keyboard.KeyboardManager;
import com.alipay.android.msp.ui.birdnest.render.api.MspRender;
import com.alipay.android.msp.ui.contracts.MspBaseContract;
import com.alipay.android.msp.ui.contracts.MspMainContract;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.ui.presenters.MspContainerPresenter;
import com.alipay.android.msp.ui.views.MspBaseActivity;
import com.alipay.android.msp.ui.views.MspContainerActivity;
import com.alipay.android.msp.ui.widget.MspDialogButton;
import com.alipay.android.msp.ui.widget.dialog.FlybirdDialogEventDesc;
import com.alipay.android.msp.ui.widget.dialog.FlybirdDialogImpl;
import com.alipay.android.msp.utils.BroadcastUtil;
import com.alipay.android.msp.utils.EventLogUtil;
import com.alipay.android.msp.utils.ExceptionUtils;
import com.alipay.android.msp.utils.FlybirdUtil;
import com.alipay.android.msp.utils.LogAgent;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.UIUtil;
import com.alipay.android.msp.utils.Utils;
import com.alipay.birdnest.api.BirdNestEngine;
import com.alipay.sdk.sys.BizContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBDocument;
import com.flybird.deploy.model.FBTemplateContent;
import com.flybird.session.standalone.model.PrepareResult;
import com.huawei.hms.android.SystemUtils;
import com.meizu.cloud.pushsdk.notification.model.ActVideoSetting;
import com.taobao.android.dinamicx.f;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import tb.pl4;
import tb.slo;
import tb.z1x;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MspWindowClient extends MspUIClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public volatile long A;
    public final String e;
    public Context f;
    public boolean g;
    public MspContainerPresenter h;
    public MspWindowFrame i;
    public MspWindowFrame j;
    public Activity k;
    public Activity l;
    public boolean n;
    public boolean o;
    public boolean p;
    public final FlybirdRenderIntercepter t;
    public OnFrameTplEventListener w;
    public int m = 0;
    public boolean q = false;
    public boolean r = false;
    public final Object s = new Object();
    public volatile boolean u = true;
    public boolean v = false;
    public boolean x = true;
    public boolean y = true;
    public final StEvent z = new StEvent();

    public MspWindowClient(MspContext mspContext) {
        super(mspContext);
        Context context = mspContext.getContext();
        this.f = context;
        if (context != null) {
            this.e = context.getPackageName();
        }
        this.t = new FlybirdRenderIntercepter();
    }

    public static /* synthetic */ void access$000(MspWindowClient mspWindowClient, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9e00e64", new Object[]{mspWindowClient, new Long(j)});
        } else {
            mspWindowClient.c(j);
        }
    }

    public static /* synthetic */ void access$100(MspWindowClient mspWindowClient, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("874e545a", new Object[]{mspWindowClient, str, new Integer(i)});
        } else {
            mspWindowClient.l(str, i);
        }
    }

    public static /* synthetic */ void access$1000(MspWindowClient mspWindowClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40b06691", new Object[]{mspWindowClient});
        } else {
            mspWindowClient.o();
        }
    }

    public static /* synthetic */ void access$1200(MspContext mspContext, PreparedResult preparedResult, RenderTime renderTime, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("163bca2c", new Object[]{mspContext, preparedResult, renderTime, new Boolean(z), new Boolean(z2)});
        } else {
            e(mspContext, preparedResult, renderTime, z, z2);
        }
    }

    public static /* synthetic */ boolean access$1500(MspWindowClient mspWindowClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ec35f70", new Object[]{mspWindowClient})).booleanValue();
        }
        return mspWindowClient.v;
    }

    public static /* synthetic */ boolean access$1602(MspWindowClient mspWindowClient, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("558a7aef", new Object[]{mspWindowClient, new Boolean(z)})).booleanValue();
        }
        mspWindowClient.u = z;
        return z;
    }

    public static /* synthetic */ long access$1700(MspWindowClient mspWindowClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6acaf61e", new Object[]{mspWindowClient})).longValue();
        }
        return mspWindowClient.A;
    }

    public static /* synthetic */ MspWindowFrame access$200(MspWindowClient mspWindowClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspWindowFrame) ipChange.ipc$dispatch("a977d1fe", new Object[]{mspWindowClient});
        }
        return mspWindowClient.i;
    }

    public static /* synthetic */ MspWindowFrame access$202(MspWindowClient mspWindowClient, MspWindowFrame mspWindowFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspWindowFrame) ipChange.ipc$dispatch("851e5bba", new Object[]{mspWindowClient, mspWindowFrame});
        }
        mspWindowClient.i = mspWindowFrame;
        return mspWindowFrame;
    }

    public static /* synthetic */ void access$300(MspWindowClient mspWindowClient, MspWindowFrame mspWindowFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a2b24c3", new Object[]{mspWindowClient, mspWindowFrame});
        } else {
            mspWindowClient.m(mspWindowFrame);
        }
    }

    public static /* synthetic */ OnFrameTplEventListener access$400(MspWindowClient mspWindowClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnFrameTplEventListener) ipChange.ipc$dispatch("cdb71c2f", new Object[]{mspWindowClient});
        }
        return mspWindowClient.w;
    }

    public static /* synthetic */ boolean access$602(MspWindowClient mspWindowClient, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a0da700", new Object[]{mspWindowClient, new Boolean(z)})).booleanValue();
        }
        mspWindowClient.x = z;
        return z;
    }

    public static /* synthetic */ MspContainerPresenter access$700(MspWindowClient mspWindowClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspContainerPresenter) ipChange.ipc$dispatch("96dd2180", new Object[]{mspWindowClient});
        }
        return mspWindowClient.h;
    }

    public static /* synthetic */ Context access$800(MspWindowClient mspWindowClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("27872650", new Object[]{mspWindowClient});
        }
        return mspWindowClient.f;
    }

    public static /* synthetic */ void access$900(String str, MspContext mspContext, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77cb0dca", new Object[]{str, mspContext, str2});
        } else {
            i(str, mspContext, str2);
        }
    }

    public static /* synthetic */ Object ipc$super(MspWindowClient mspWindowClient, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/core/clients/MspWindowClient");
    }

    @Override // com.alipay.android.msp.core.clients.MspUIClient
    public void disposeUI() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7db7f7fa", new Object[]{this});
            return;
        }
        try {
            MspContainerPresenter mspContainerPresenter = this.h;
            if (mspContainerPresenter != null) {
                mspContainerPresenter.exit();
                this.h = null;
                this.r = false;
            }
        } catch (Exception unused) {
        }
        try {
            if (this.mCurrentPresenter != null) {
                this.v = true;
                this.mCurrentPresenter = null;
            }
        } catch (Exception unused2) {
        }
    }

    @Override // com.alipay.android.msp.core.clients.MspUIClient
    public void doDisposeWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35f68aab", new Object[]{this});
            return;
        }
        this.l = null;
        this.k = null;
        this.g = false;
    }

    public void finishCashierActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f96dee6", new Object[]{this});
            return;
        }
        MspContainerPresenter mspContainerPresenter = this.h;
        if (mspContainerPresenter != null) {
            MspMainContract.View iView = mspContainerPresenter.getIView();
            if (iView != null) {
                iView.dismissDefaultLoading();
                iView.disposeActivity();
            }
            this.h = null;
            this.r = false;
        }
    }

    public final void g(MspWindowFrame mspWindowFrame, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71e31c24", new Object[]{this, mspWindowFrame, view});
            return;
        }
        this.i = mspWindowFrame;
        mspWindowFrame.setContentView(view);
        if (this.mMspContext instanceof MspTradeContext) {
            m(mspWindowFrame);
        }
        MspContext mspContext = this.mMspContext;
        if (mspContext != null) {
            mspContext.onRendFrameSuccess();
        }
    }

    public MspContainerPresenter getContainerPresenter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspContainerPresenter) ipChange.ipc$dispatch("272d4775", new Object[]{this});
        }
        return this.h;
    }

    public MspWindowFrame getCurrentWindowFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspWindowFrame) ipChange.ipc$dispatch("69fb0ddb", new Object[]{this});
        }
        return this.j;
    }

    public StEvent getStartActivityEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StEvent) ipChange.ipc$dispatch("e95405e7", new Object[]{this});
        }
        return this.z;
    }

    public long getStartActivityTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ca9b57c3", new Object[]{this})).longValue();
        }
        return this.A;
    }

    public Activity getVidActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("bf5d5ab7", new Object[]{this});
        }
        return this.l;
    }

    public final void h(MspWindowFrame mspWindowFrame, String str, IRenderCallback iRenderCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc3105b9", new Object[]{this, mspWindowFrame, str, iRenderCallback});
        } else {
            TaskHelper.execute(new AnonymousClass11(mspWindowFrame, str, iRenderCallback));
        }
    }

    public boolean isCurrentPageResultPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b39d295", new Object[]{this})).booleanValue();
        }
        if (TextUtils.equals(this.j.getTplId(), MspFlybirdDefine.FLYBIRD_PAYEND_TPL) || TextUtils.equals(this.j.getTplId(), MspFlybirdDefine.FLYBIRD_RESULT_TPL) || TextUtils.equals(this.j.getTplId(), MspFlybirdDefine.FLYBIRD_UNIFY_RESULT_TPL)) {
            return true;
        }
        return false;
    }

    public boolean isNoPresenterSet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("550b0ad0", new Object[]{this})).booleanValue();
        }
        return this.u;
    }

    public boolean isPreSubmitPageLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abc296e7", new Object[]{this})).booleanValue();
        }
        return this.q;
    }

    public boolean isStartCashierActivityAT_VERSION_O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1062f281", new Object[]{this})).booleanValue();
        }
        LogUtil.record(4, "phonecashiermsp#flybird", "MspWindowClient.isStartCashierActivityAT_VERSION_O", "mStartCashierActivityAt_VERSION_O:" + this.p);
        return this.p;
    }

    public boolean isStartCashierActivityFromOutAppFailed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6297ff", new Object[]{this})).booleanValue();
        }
        LogUtil.record(4, "phonecashiermsp#flybird", "MspWindowClient.isStartCashierActivityFromOutAppFailed", "mStartCashierActivityFromOutAppFailed:" + this.n);
        return this.n;
    }

    public boolean isStartSettingsActivityFromOutAppFailed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88f95b4f", new Object[]{this})).booleanValue();
        }
        return this.o;
    }

    public boolean isVidExitMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("871d5013", new Object[]{this})).booleanValue();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.m);
        return TextUtils.equals(sb.toString(), "1");
    }

    public final void l(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d253bf0", new Object[]{this, str, new Integer(i)});
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(this.e, str);
        intent.putExtra(MspBaseActivity.KEY_ID, i);
        Activity currentTopActivity = PhoneCashierMspEngine.getMspWallet().getCurrentTopActivity();
        if (currentTopActivity == null || currentTopActivity.isFinishing()) {
            if (!(this.f instanceof Activity)) {
                intent.setFlags(268435456);
                LogUtil.record(4, "MspWindowClient:defaultStartPage", "add flag newTask");
            }
            this.f.startActivity(intent);
            return;
        }
        currentTopActivity.startActivity(intent);
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        try {
            MspBasePresenter mspBasePresenter = this.mCurrentPresenter;
            if (mspBasePresenter != null && mspBasePresenter.getIView() != null) {
                KeyboardManager.getInstance().hideKeyboard(this.mCurrentPresenter.getActivity());
                View currentView = this.mCurrentPresenter.getIView().getCurrentView();
                if (currentView != null) {
                    UIUtil.hideKeyboard(currentView.getWindowToken(), this.mCurrentPresenter.getActivity());
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.alipay.android.msp.core.clients.MspUIClient
    public void onWindowLoaded(MspContext mspContext, MspBasePresenter mspBasePresenter) {
        MspBasePresenter mspBasePresenter2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e226791e", new Object[]{this, mspContext, mspBasePresenter});
        } else if (mspContext != null && mspContext.getBizId() == this.mBizId) {
            MspBasePresenter mspBasePresenter3 = this.mCurrentPresenter;
            if (!(mspBasePresenter3 == null || mspBasePresenter3.getIView() == null)) {
                this.mCurrentPresenter.getIView().removeMaskView();
            }
            if (mspBasePresenter instanceof MspContainerPresenter) {
                this.h = (MspContainerPresenter) mspBasePresenter;
                this.mCurrentPresenter = mspBasePresenter;
            }
            if (mspContext.isBizAppCollectMoneyPage) {
                PhoneCashierMspEngine.getMspWallet().endSpiderSection("BIZ_SCAN_JUMP_MSP", "SET_PRESENTER");
            }
            try {
                MspBasePresenter mspBasePresenter4 = this.mCurrentPresenter;
                if (mspBasePresenter4 != null) {
                    this.mMspContext.setContext(mspBasePresenter4.getActivity());
                    Activity activity = this.mCurrentPresenter.getActivity();
                    this.f = activity;
                    InvokeActionPlugin.addInvokeAPIFactory(activity);
                    this.mCurrentPresenter.registerInvokePlugin(this.mMspContext);
                    try {
                        MspWindowFrame mspWindowFrame = this.j;
                        if (!(mspWindowFrame == null || !(this.mCurrentPresenter instanceof MspContainerPresenter) || mspWindowFrame.getWindowType() == 11)) {
                            MspContext mspContext2 = this.mMspContext;
                            if (mspContext2 instanceof MspTradeContext) {
                                if (mspContext2 == null || !mspContext2.isUpgradePreRendTpl()) {
                                    PreRendManager.getInstance().preRendTpl(this.mCurrentPresenter.getActivity(), this.mBizId, "", null, "network");
                                } else if (this.mMspTradeContext.getContext() != null) {
                                    MspRender.triggerPreRenderQUICKPAY(MspFlybirdDefine.FLYBIRD_HOME_TPL, this.mMspTradeContext.getContext().getApplicationContext());
                                }
                            }
                        }
                    } catch (Exception e) {
                        LogUtil.printExceptionStackTrace(e);
                    }
                    MspWindowFrame mspWindowFrame2 = this.j;
                    if (mspWindowFrame2 != null && mspWindowFrame2.getWindowType() == 11 && (mspBasePresenter2 = this.mCurrentPresenter) != null && !this.g && mspBasePresenter2.getIView() != null && (this.mMspContext instanceof MspTradeContext)) {
                        n();
                    }
                    f(this.j);
                }
            } catch (Exception e2) {
                LogUtil.printExceptionStackTrace(e2);
            }
        }
    }

    public void setFirstVidActivity(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6bb240b", new Object[]{this, activity});
            return;
        }
        LogUtil.record(4, "phonecashiermsp#flybird", "MspWindowClient.setmFirstVidActivity", "");
        this.k = activity;
    }

    public void setOnFrameTplEventListener(OnFrameTplEventListener onFrameTplEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("838e98f2", new Object[]{this, onFrameTplEventListener});
        } else {
            this.w = onFrameTplEventListener;
        }
    }

    public void setPreSubmitPageLoading(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("170c5819", new Object[]{this, new Boolean(z)});
        } else {
            this.q = z;
        }
    }

    public void setPresenter(MspContext mspContext, MspContainerPresenter mspContainerPresenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddf24ea6", new Object[]{this, mspContext, mspContainerPresenter});
        } else if (mspContext != null && mspContext.getBizId() == this.mBizId) {
            this.h = mspContainerPresenter;
            this.mCurrentPresenter = mspContainerPresenter;
            this.mMspContext.setContext(mspContainerPresenter.getActivity());
            this.f = this.mCurrentPresenter.getActivity();
        }
    }

    public void setVidActivity(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d4a4397", new Object[]{this, activity});
            return;
        }
        LogUtil.record(4, "phonecashiermsp#flybird", "MspWindowClient.setVidActivity", "activity=".concat(String.valueOf(activity)));
        this.l = activity;
    }

    public void setVidExitFlag(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dadd3e3", new Object[]{this, new Integer(i)});
            return;
        }
        LogUtil.record(4, "MspWindowClient:setmVidExitFlag", "vidExitFlag:" + i + " ,ctx=" + this.mMspContext);
        this.m = i;
    }

    public boolean startContainerPage() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f6632f9", new Object[]{this})).booleanValue();
        }
        String canonicalName = MspContainerActivity.class.getCanonicalName();
        MspContext mspContext = this.mMspContext;
        if (mspContext instanceof MspContainerContext) {
            if (!mspContext.isMspBgTransparent() || this.mMspContext.isBizAppCollectMoneyPage) {
                canonicalName = "com.alipay.android.msp.ui.views.MspUniRenderActivity";
            } else {
                canonicalName = MspContainerActivity.class.getCanonicalName();
            }
            if (this.mMspContext.isBizAppCollectMoneyPage) {
                PhoneCashierMspEngine.getMspWallet().startSpiderSection("BIZ_SCAN_JUMP_MSP", "ACTIVITY_START");
            }
        } else if (mspContext instanceof MspTradeContext) {
            canonicalName = MspContainerActivity.class.getCanonicalName();
        }
        synchronized (this.s) {
            try {
                if (this.r) {
                    return false;
                }
                if (!(this.mCurrentPresenter instanceof MspContainerPresenter)) {
                    z = j(canonicalName, 0);
                }
                this.r = true;
                return z;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void access$1300(MspContext mspContext, MspPrepareResult mspPrepareResult, RenderTime renderTime) {
        String str;
        String str2;
        String str3;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f206b7ab", new Object[]{mspContext, mspPrepareResult, renderTime});
        } else if (mspPrepareResult != null) {
            if (!(mspContext == null || mspPrepareResult.getPrepareResult() == null || mspPrepareResult.getPrepareResult().getTemplate() == null)) {
                PrepareResult prepareResult = mspPrepareResult.getPrepareResult();
                try {
                    FBTemplateContent template = prepareResult.getTemplate();
                    String tplId = template.getTplId();
                    StEventForRenderFinish stEventForRenderFinish = new StEventForRenderFinish(tplId, "finshRender", template.getTplVersion() + "|" + template.getTime());
                    stEventForRenderFinish.setTemplateDownLoadTime(renderTime.getDownloadTime());
                    stEventForRenderFinish.setParseTime(renderTime.getParseTime());
                    stEventForRenderFinish.setRenderTime(renderTime.getRenderTime());
                    stEventForRenderFinish.setShowTime(renderTime.getShowTime());
                    mspContext.getStatisticInfo().addEvent(stEventForRenderFinish);
                    JSONObject drmValueFromKey = DrmManager.getInstance(mspContext.getContext()).getDrmValueFromKey(DrmKey.BYPASS_TPL_ASSETS_BLACK_LIST);
                    if (drmValueFromKey == null || !drmValueFromKey.containsKey("tplList") || !drmValueFromKey.getJSONArray("tplList").contains(template.getTplId())) {
                        String tplId2 = template.getTplId();
                        if (prepareResult.isReusedFromPrerender()) {
                            str = z1x.PRE_RENDER;
                        } else {
                            str = "normal";
                        }
                        if (mspContext.isUpgradePreRendTpl()) {
                            str2 = slo.VALUE_YES;
                        } else {
                            str2 = "NO";
                        }
                        EventLogUtil.logPayEvent("1010546", pl4.KEY_PAGE_ID, tplId2, UTConstant.Args.UT_PROPERTY_SUCCESS, slo.VALUE_YES, "renderMode", str, "upgradePreRendTpl", str2);
                    } else {
                        String tplId3 = template.getTplId();
                        if (prepareResult.isReusedFromPrerender()) {
                            str3 = z1x.PRE_RENDER;
                        } else {
                            str3 = "normal";
                        }
                        if (mspContext.isUpgradePreRendTpl()) {
                            str4 = slo.VALUE_YES;
                        } else {
                            str4 = "NO";
                        }
                        EventLogUtil.logPayEvent("1010546", pl4.KEY_PAGE_ID, tplId3, UTConstant.Args.UT_PROPERTY_SUCCESS, slo.VALUE_YES, "context", "res_delete", "renderMode", str3, "upgradePreRendTpl", str4);
                    }
                } catch (Throwable th) {
                    mspContext.getStatisticInfo().addError(ErrorType.DEFAULT, "cantLogRender", th);
                }
            }
            PrepareResult prepareResult2 = mspPrepareResult.getPrepareResult();
            if (prepareResult2 != null && prepareResult2.getTemplate() != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("tplVersion", (Object) prepareResult2.getTemplate().getTplVersion());
                jSONObject.put("time", (Object) prepareResult2.getTemplate().getTime());
                TemplateChangeMonitor.getInstance().hitKey(prepareResult2.getTemplate().getTplId(), jSONObject.toString(), true);
            }
        }
    }

    public static void i(String str, MspContext mspContext, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("723bb972", new Object[]{str, mspContext, str2});
        } else if (mspContext != null && !TextUtils.isEmpty(str2)) {
            if (str2.contains("@")) {
                str = str + "_" + str2.split("@")[0];
            }
            if (str.contains("OPENBOX")) {
                mspContext.getStatisticInfo().addError("np", str, str2);
            } else {
                mspContext.getStatisticInfo().addError(ErrorType.DEFAULT, str, str2);
            }
        }
    }

    public final void d(JSONObject jSONObject, MspWindowFrame mspWindowFrame, int i, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f1d4a3f", new Object[]{this, jSONObject, mspWindowFrame, new Integer(i), str});
            return;
        }
        if (jSONObject != null) {
            str2 = jSONObject.getString("name");
        } else {
            str2 = "";
        }
        StEvent statisticEvent = mspWindowFrame.getStatisticEvent();
        if (statisticEvent != null) {
            statisticEvent.onStatistic(StEvent.PARSE_TIME, "");
            statisticEvent.onStatistic(StEvent.FILL_DATE_TIME, "");
            statisticEvent.onStatistic(StEvent.SHOW_TIME, "");
            if (TextUtils.isEmpty(str)) {
                statisticEvent.onStatistic(StEvent.SHOW_WIN, "tst|" + Utils.truncateString(str2, 30));
            } else {
                statisticEvent.onStatistic(StEvent.SHOW_WIN, "tst|" + Utils.truncateString(str2, 30) + "|" + Utils.truncateString(str, 30));
            }
        }
        if (jSONObject == null || jSONObject.toString().length() <= 2) {
            LogUtil.e("MspWindowClient", "onToast", "action = null");
            return;
        }
        EventAction createMspEvent = MspEventCreator.get().createMspEvent("MspWindowClient.handleTstAction", jSONObject);
        if (createMspEvent != null) {
            createMspEvent.setAjax(mspWindowFrame.isAjax());
            createMspEvent.setDelayTime(i);
            ActionsCreator.get(this.mMspContext).createEventAction(createMspEvent);
            return;
        }
        LogUtil.e("MspWindowClient", "onToast", "toastEventAction = null");
    }

    public final void m(MspWindowFrame mspWindowFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7daf470", new Object[]{this, mspWindowFrame});
        } else if (isVidActivityVisible()) {
            LogUtil.record(1, "MspWindowClient:finishVidActivity", "sendExitVidBroadcast");
            BroadcastUtil.sendExitVidBroadcast(this.f);
        } else if (mspWindowFrame.getTplId() != null) {
            Activity activity = this.k;
            if (activity == null || activity.isFinishing()) {
                LogUtil.record(4, "phonecashiermsp#flybird", "MspWindowClient.isFirstVidActivityVisible", "false");
                return;
            }
            LogUtil.record(4, "phonecashiermsp#flybird", "MspWindowClient.isFirstVidActivityVisible", "true");
            LogUtil.record(1, "MspWindowClient:finishVidActivity", "finishFirstVidActivity");
            Activity activity2 = this.k;
            if (activity2 != null && !activity2.isFinishing()) {
                this.k.finish();
                LogUtil.record(4, "phonecashiermsp#flybird", "MspWindowClient.finishFirstVidActivity", "true");
            }
        }
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        MspBasePresenter mspBasePresenter = this.mCurrentPresenter;
        if (mspBasePresenter != null && mspBasePresenter.getIView() != null) {
            MspContext mspContext = this.mMspContext;
            String str = mspContext instanceof MspTradeContext ? ((MspTradeContext) mspContext).getAllExtendParamsMap().get(MspGlobalDefine.EXT_LOCAL_ONLY_LOADING_STYLE) : null;
            LogUtil.i("MspWindowClient", "showStartLoading", "startLoading ".concat(String.valueOf(str)));
            if (InvokeActionPlugin.SHOW_LOADING_STYLE_PLAIN.equals(str)) {
                this.mCurrentPresenter.getIView().showCusLoadingView("");
            } else {
                this.mCurrentPresenter.getIView().showLoadingView(new String[0]);
            }
        }
    }

    @Override // com.alipay.android.msp.core.clients.MspUIClient
    public void onExit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2681a1a4", new Object[]{this});
            return;
        }
        SpmWrapper.onPageEnd(this.i, this.mBizId);
        getFrameStack().clearDataStack(false);
        disposeUI();
        MspContext mspContext = this.mMspContext;
        if (mspContext != null && !mspContext.isFromWallet()) {
            LogUtil.record(4, "MspWindowClient.resetVidStartActivity", "setStartActivityContext:NULL");
            PhoneCashierMspEngine.getMspViSec().setStartActivityContext(null);
        }
        Map<String, H5PopUpWindowItem> map = this.mH5PageItemMap;
        if (map != null) {
            map.clear();
        }
    }

    public static /* synthetic */ void access$1400(MspWindowClient mspWindowClient, View view, MspWindowFrame mspWindowFrame, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37a9e0f5", new Object[]{mspWindowClient, view, mspWindowFrame, str});
            return;
        }
        MspContainerPresenter mspContainerPresenter = mspWindowClient.h;
        if (view == null || mspWindowFrame == null || mspContainerPresenter == null || mspContainerPresenter.getIView() == null) {
            LogUtil.w("MspWindowClient", "showContentView", "contentView=" + view + " , windowFrame=" + mspWindowFrame + " , containerPresenter=" + mspContainerPresenter);
            i("renderShowFail", mspWindowClient.mMspContext, str);
            return;
        }
        LogAgent.onFinishRender();
        SpmWrapper.onPageStart(mspWindowFrame, mspWindowClient.mBizId);
        mspContainerPresenter.getIView().showContentView(view, !mspWindowFrame.getBackAnim(), mspWindowFrame);
        mspWindowFrame.setBackAnim(false);
        mspWindowFrame.setIsPreLoadView(false);
        if (mspWindowClient.mMspWindowLoadListener != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("mspBizId", mspWindowClient.mBizId);
            mspWindowClient.mMspWindowLoadListener.onWindowLoadSuccess(view, bundle);
        }
        mspWindowClient.g(mspWindowFrame, view);
        BroadcastUtil.sendRendPageResultToSource(mspWindowClient.mSuccNotifyName, mspWindowClient.f, mspWindowClient.mBizId);
    }

    public final void c(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        LogUtil.record(2, "MspWindowClient:checkActivityStarted", "this=" + this + " , ctx=" + this.mMspContext);
        getStartActivityEvent().onStatistic(StEvent.CONVERT_TIME, String.valueOf(SystemClock.elapsedRealtime() - j));
        this.u = false;
        try {
            if (this.mMspContext instanceof MspTradeContext) {
                PhoneCashierMspEngine.getMspWallet().startSpiderSection(MspGlobalDefine.SPIDER_MSP_CASHIER_BIZ_TYPE, "ACTIVITY_START");
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        Runnable runnable = new Runnable() { // from class: com.alipay.android.msp.core.clients.MspWindowClient.12
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (!MspWindowClient.this.hasActivityCreated) {
                    MspWindowClient mspWindowClient = MspWindowClient.this;
                    if (mspWindowClient.mMspContext != null && !MspWindowClient.access$1500(mspWindowClient)) {
                        MspWindowClient.access$1602(MspWindowClient.this, true);
                        MspWindowClient.this.getStartActivityEvent().onStatistic(StEvent.PARSE_TIME, String.valueOf(SystemClock.elapsedRealtime() - MspWindowClient.access$1700(MspWindowClient.this)));
                        MspWindowClient.this.mMspContext.getStatisticInfo().addEvent(MspWindowClient.this.getStartActivityEvent());
                        LogUtil.record(8, "MspWindowClient:checkActivityStarted", "mCurrentPresenter==null");
                        if (MspWindowClient.this.mMspTradeContext != null) {
                            PhoneCashierMspEngine.getMspWallet().endSpiderSection(MspGlobalDefine.SPIDER_MSP_CASHIER_BIZ_TYPE, "ACTIVITY_START");
                            FlybirdUtil.justEndSpider(MspGlobalDefine.SPIDER_MSP_CASHIER_BIZ_TYPE);
                            FlybirdUtil.dumpSpiderwebSpiderForCashier();
                            MspWindowClient.this.mMspTradeContext.sendDataToSdk(ErrorType.DEFAULT, ErrorCode.DEFAULT_ACTIVITY_NOT_START, null);
                        }
                        MspContext mspContext = MspWindowClient.this.mMspContext;
                        if (mspContext instanceof MspTradeContext) {
                            MspTradeContext mspTradeContext = (MspTradeContext) mspContext;
                            if (mspTradeContext.getRemoteCallbackVersion() >= 4 && mspTradeContext.getMspPayResult() != null && !mspTradeContext.isFromEntranceActivity()) {
                                mspTradeContext.getMspPayResult().setEndCode(String.valueOf(ResultStatus.ACTIVITY_NOT_START_EXIT.getStatus()));
                                MspWindowClient.this.mMspContext.exit(0, true);
                            }
                        }
                        MspWindowClient.this.mMspContext.getStatisticInfo().addError(ErrorType.DEFAULT, ErrorCode.DEFAULT_ACTIVITY_NOT_START, "");
                        MspWindowClient.this.mMspContext.exit(0, true);
                    }
                }
            }
        };
        int i = 10000;
        try {
            String walletConfig = PhoneCashierMspEngine.getMspWallet().getWalletConfig(DrmKey.START_ACTIVITY_DELAY_TIME);
            int parseInt = (walletConfig == null || walletConfig.length() <= 0) ? 10000 : Integer.parseInt(walletConfig);
            if (!this.mMspContext.isFromWallet() && !GlobalSdkConstant.getSdkType() && Build.VERSION.SDK_INT >= 29) {
                String str = Build.BRAND;
                if (str.contains(SystemUtils.PRODUCT_HUAWEI) || str.contains(SystemUtils.PRODUCT_HONOR)) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    LogUtil.record(2, "MspWindowClient:checkActivityStarted", "app_lock_list start");
                    String string = Settings.Secure.getString(this.f.getContentResolver(), "app_lock_list");
                    if (string != null) {
                        if ((";" + string + ";").contains(";com.eg.android.AlipayGphone;")) {
                            parseInt = f.DX_ERROR_BIZ_CODE;
                        }
                    }
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    LogUtil.record(2, "MspWindowClient:checkActivityStarted", "app_lock_list end");
                    long j2 = elapsedRealtime2 - elapsedRealtime;
                    if (j2 > 10) {
                        StatisticInfo statisticInfo = this.mMspContext.getStatisticInfo();
                        StringBuilder sb = new StringBuilder();
                        sb.append(j2);
                        statisticInfo.addError(ErrorType.WARNING, "AppLock", sb.toString());
                    }
                }
            }
            MspTradeContext mspTradeContext = this.mMspTradeContext;
            int i2 = 6000;
            if (mspTradeContext != null && mspTradeContext.getRemoteCallbackVersion() >= 4 && !this.mMspContext.isFromEntranceActivity()) {
                parseInt = 6000;
            }
            if (parseInt > 0) {
                i2 = parseInt;
            }
            LogUtil.record(2, "MspWindowClient:checkActivityStarted", "checkTimeInt=".concat(String.valueOf(i2)));
            i = i2;
        } catch (Throwable th2) {
            LogUtil.printExceptionStackTrace(th2);
        }
        long j3 = i;
        MonitorRunnable monitorRunnable = new MonitorRunnable(runnable, j3);
        Context context = this.f;
        if (context == null || !FastStartActivityHelper.getBoolConfig(context, DrmKey.GRAY_DELAY_THREAD_RUNNABLE)) {
            TaskHelper.execute(monitorRunnable, j3);
        } else {
            TaskHelper.getInstance().executeDelayed(monitorRunnable, j3, TaskHelper.ThreadName.UI_CONTEXT);
        }
        this.A = SystemClock.elapsedRealtime();
    }

    public boolean isVidActivityVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d6cb67", new Object[]{this})).booleanValue();
        }
        Activity activity = this.l;
        if (activity == null || activity.isFinishing()) {
            LogUtil.record(4, "phonecashiermsp#flybird", "MspWindowClient.isVidActivityVisible", "false");
            return false;
        }
        LogUtil.record(4, "phonecashiermsp#flybird", "MspWindowClient.isVidActivityVisible", "true");
        return true;
    }

    public final boolean j(final String str, int i) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ad15", new Object[]{this, str, new Integer(i)})).booleanValue();
        }
        LogUtil.i("MspWindowClient", RVStartParams.START_SCENE_START_PAGE, str + " " + i);
        if (this.mMspContext == null) {
            return false;
        }
        StEvent startActivityEvent = getStartActivityEvent();
        if (i == 1) {
            str2 = BizContext.KEY_SETTING_FILTER;
        } else {
            str2 = "cashier";
        }
        startActivityEvent.onStatistic(StEvent.CURRENT_VIEW, str2);
        getStartActivityEvent().onStatistic("actionType", "native");
        getStartActivityEvent().onStatistic("action", "startActivity");
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        IAlipayCallback alipayCallback = this.mMspContext.getAlipayCallback();
        MspContext mspContext = this.mMspContext;
        IRemoteServiceCallback remoteCallback = mspContext instanceof MspTradeContext ? ((MspTradeContext) mspContext).getRemoteCallback() : null;
        if (remoteCallback != null) {
            try {
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
                if (e instanceof NullPointerException) {
                    MspContext mspContext2 = this.mMspContext;
                    if (mspContext2 != null) {
                        mspContext2.getStatisticInfo().addError(ErrorType.WARNING, "startActivityNPE", e);
                    }
                    return false;
                }
                MspContext mspContext3 = this.mMspContext;
                if (mspContext3 != null) {
                    mspContext3.getStatisticInfo().addError(ErrorType.WARNING, "startActivityEx", e);
                }
                if (remoteCallback != null) {
                    if (i == 0) {
                        this.n = true;
                    } else if (i == 1) {
                        this.o = true;
                    }
                }
                if (TextUtils.equals("Y", PhoneCashierMspEngine.getMspWallet().getWalletConfig(DrmKey.GRAY_START_ACTIVITY_ON_UI_THREAD))) {
                    TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.core.clients.MspWindowClient.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            MspWindowClient mspWindowClient = MspWindowClient.this;
                            MspWindowClient.access$100(mspWindowClient, str, mspWindowClient.mBizId);
                        }
                    }, true);
                    LogUtil.record(4, "msp", "MspWindowClient:startPage", "ex runOnUI defaultStart bizId=" + this.mBizId);
                } else {
                    l(str, this.mBizId);
                    LogUtil.record(4, "msp", "MspWindowClient:startPage", "ex  defaultStart bizId=" + this.mBizId);
                }
            }
            if (!this.mMspContext.isFromEntranceActivity()) {
                LogUtil.i("MspWindowClient", RVStartParams.START_SCENE_START_PAGE, "remoteCallback!=null bizId=" + this.mBizId);
                c(elapsedRealtime);
                int i2 = Build.VERSION.SDK_INT;
                if ((i2 == 26 || i2 == 27) && TextUtils.equals(str, MspContainerActivity.class.getCanonicalName())) {
                    this.p = true;
                    remoteCallback.startActivity(this.e, "com.alipay.android.msp.ui.views.FullScreenBgActivity", this.mBizId, null);
                } else {
                    remoteCallback.startActivity(this.e, str, this.mBizId, null);
                }
                return true;
            }
        }
        if (alipayCallback != null) {
            LogUtil.i("MspWindowClient", RVStartParams.START_SCENE_START_PAGE, "alipayCallback!=null, bizId=" + this.mBizId);
            c(elapsedRealtime);
            alipayCallback.startActivity(this.e, str, this.mBizId, null);
        } else if (TextUtils.equals("Y", PhoneCashierMspEngine.getMspWallet().getWalletConfig(DrmKey.GRAY_START_ACTIVITY_ON_UI_THREAD))) {
            LogUtil.i("MspWindowClient", RVStartParams.START_SCENE_START_PAGE, "runOnUI defaultStart bizId=" + this.mBizId);
            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.core.clients.MspWindowClient.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    MspWindowClient.access$000(MspWindowClient.this, elapsedRealtime);
                    MspWindowClient mspWindowClient = MspWindowClient.this;
                    MspWindowClient.access$100(mspWindowClient, str, mspWindowClient.mBizId);
                }
            }, true);
        } else {
            LogUtil.i("MspWindowClient", RVStartParams.START_SCENE_START_PAGE, "defaultStart bizId=" + this.mBizId);
            c(elapsedRealtime);
            l(str, this.mBizId);
        }
        return true;
    }

    public final void k(MspWindowFrame mspWindowFrame) {
        MspBaseContract.IView iView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de869f2f", new Object[]{this, mspWindowFrame});
            return;
        }
        hidePrePageLoading();
        JSONObject windowData = mspWindowFrame.getWindowData();
        if (windowData != null) {
            String string = windowData.getString("msg");
            JSONArray jSONArray = windowData.getJSONArray("btns");
            if (jSONArray != null && jSONArray.size() > 0) {
                StEvent statisticEvent = mspWindowFrame.getStatisticEvent();
                if (statisticEvent != null) {
                    statisticEvent.onStatistic(StEvent.PARSE_TIME, "");
                    statisticEvent.onStatistic(StEvent.FILL_DATE_TIME, "");
                    statisticEvent.onStatistic(StEvent.SHOW_TIME, "");
                    statisticEvent.onStatistic(StEvent.SHOW_WIN, "dlg|" + Utils.truncateString(string, 30));
                }
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.size(); i++) {
                    MspDialogButton mspDialogButton = new MspDialogButton();
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    mspDialogButton.mText = jSONObject.getString("txt");
                    mspDialogButton.mEventAction = MspEventCreator.get().createMspEvent("MspWindowClient.onReceiveDialog", jSONObject.getJSONObject("act"));
                    arrayList.add(mspDialogButton);
                }
                MspBasePresenter mspBasePresenter = this.mCurrentPresenter;
                if (!(mspBasePresenter == null || (iView = mspBasePresenter.getIView()) == null)) {
                    iView.showDialogView("", string, arrayList);
                }
            }
        }
    }

    @Override // com.alipay.android.msp.core.clients.MspUIClient
    public boolean onWindowChanged(MspWindowFrame mspWindowFrame) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b8e9b96", new Object[]{this, mspWindowFrame})).booleanValue();
        }
        LogUtil.i("MspWindowClient", "onWindowChanged", mspWindowFrame.toString());
        UserFeedBackUtil.getInstance().setUserFeedBackTagByWindowFrame(mspWindowFrame);
        mspWindowFrame.setExecuted(false);
        this.j = mspWindowFrame;
        MspContext mspContext = this.mMspContext;
        if (mspContext != null && mspContext.isBizAppCollectMoneyPage) {
            PhoneCashierMspEngine.getMspWallet().endSpiderSection("BIZ_SCAN_JUMP_MSP", "FRAME_PUSH");
        }
        try {
            int windowType = mspWindowFrame.getWindowType();
            if (windowType != 10) {
                if (windowType == 11) {
                    MspContainerPresenter mspContainerPresenter = this.h;
                    if (mspContainerPresenter != null) {
                        this.mCurrentPresenter = mspContainerPresenter;
                    } else {
                        startContainerPage();
                    }
                }
                z = true;
            } else {
                z = startContainerPage();
            }
            if (this.mCurrentPresenter != null) {
                f(mspWindowFrame);
                return true;
            }
            LogUtil.i("MspWindowClient", "onWindowChanged", "mCurrentPresenter=null");
            return z;
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.alipay.android.msp.core.clients.MspWindowClient$11  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class AnonymousClass11 implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private RenderTime f3545a = new RenderTime();
        public final /* synthetic */ IRenderCallback val$callback;
        public final /* synthetic */ String val$contentData;
        public final /* synthetic */ MspWindowFrame val$windowFrame;

        public AnonymousClass11(MspWindowFrame mspWindowFrame, String str, IRenderCallback iRenderCallback) {
            this.val$windowFrame = mspWindowFrame;
            this.val$contentData = str;
            this.val$callback = iRenderCallback;
        }

        public static /* synthetic */ RenderTime access$1100(AnonymousClass11 r4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RenderTime) ipChange.ipc$dispatch("f21e9c26", new Object[]{r4});
            }
            return r4.f3545a;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            String str2;
            Throwable th;
            final Object obj;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            final String tplId = this.val$windowFrame.getTplId();
            MspContext mspContext = MspWindowClient.this.mMspContext;
            if (mspContext != null && mspContext.isBizAppCollectMoneyPage) {
                PhoneCashierMspEngine.getMspWallet().startSpiderSection("BIZ_SCAN_JUMP_MSP", "PAGE_DATA_REND");
            }
            final MspContainerPresenter access$700 = MspWindowClient.access$700(MspWindowClient.this);
            if (access$700 != null) {
                try {
                    MspBasePresenter mspBasePresenter = MspWindowClient.this.mCurrentPresenter;
                    if (mspBasePresenter == null || mspBasePresenter.getIView() == null) {
                        MspContext mspContext2 = MspWindowClient.this.mMspContext;
                        if (mspContext2 == null || !mspContext2.isExit()) {
                            str2 = "mspBizId";
                            str = "onWindowLoadFail";
                            try {
                                throw new AppErrorException("curP is null");
                            } catch (Throwable th2) {
                                th = th2;
                                LogUtil.printExceptionStackTrace(th);
                                MspContext mspContext3 = MspWindowClient.this.mMspContext;
                                if (mspContext3 != null) {
                                    MspWindowClient.access$900("renderExFail", mspContext3, tplId);
                                    StatisticInfo statisticInfo = MspWindowClient.this.mMspContext.getStatisticInfo();
                                    Vector vector = Vector.Result;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(ClientEndCode.APPERROR_FLYBIRD);
                                    statisticInfo.updateAttr(vector, "clientEndCode", sb.toString());
                                }
                                if (MspWindowClient.this.mMspWindowLoadListener != null) {
                                    LogUtil.record(4, str, "BIRD_NEST_CREATE_ERROR，loadListener" + MspWindowClient.this.mMspWindowLoadListener);
                                    Bundle bundle = new Bundle();
                                    bundle.putInt(str2, MspWindowClient.this.mBizId);
                                    MspWindowClient.this.mMspWindowLoadListener.onWindowLoadFail(1, bundle);
                                } else if (access$700.getIView() != null) {
                                    ExceptionUtils.sendUiMsgWhenException(MspWindowClient.this.mBizId, new AppErrorException(ExceptionUtils.createExceptionMsg(LanguageHelper.localizedStringForKey("mini_app_error", access$700.getActivity().getString(R.string.mini_app_error), new Object[0]), 6)));
                                }
                                MspWindowClient mspWindowClient = MspWindowClient.this;
                                BroadcastUtil.sendRendPageResultToSource(mspWindowClient.mFailNotifyName, MspWindowClient.access$800(mspWindowClient), MspWindowClient.this.mBizId);
                                EventLogUtil.logPayEvent("1010546", pl4.KEY_PAGE_ID, this.val$windowFrame.getTplId(), UTConstant.Args.UT_PROPERTY_SUCCESS, "NO", "context", "res_delete");
                                return;
                            }
                        } else {
                            obj = null;
                        }
                    } else {
                        RenderConfig templateLoadedCallback = new RenderConfig(false).setTemplateLoadedCallback(new ITemplateLoadedCallback() { // from class: com.alipay.android.msp.core.clients.MspWindowClient.11.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.alipay.android.msp.plugin.ITemplateLoadedCallback
                            public void onTemplateLoaded() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("e7f9b265", new Object[]{this});
                                    return;
                                }
                                try {
                                    MspWindowClient.this.hidePrePageLoading();
                                    MspWindowClient.access$700(MspWindowClient.this).getIView().stopDefaultLoadingCountDown();
                                } catch (Exception e) {
                                    LogUtil.printExceptionStackTrace(e);
                                }
                            }

                            @Override // com.alipay.android.msp.plugin.ITemplateLoadedCallback
                            public boolean onNewBnDeployAskingUserShouldContinue() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    return ((Boolean) ipChange2.ipc$dispatch("761ff92d", new Object[]{this})).booleanValue();
                                }
                                final MspContext mspContext4 = MspWindowClient.this.mMspContext;
                                if (mspContext4 == null) {
                                    return false;
                                }
                                final boolean[] zArr = {false};
                                final ConditionVariable conditionVariable = new ConditionVariable();
                                final ArrayList arrayList = new ArrayList(2);
                                arrayList.add(new FlybirdDialogEventDesc(LanguageHelper.localizedStringForKey("mini_cancel", MspWindowClient.access$800(MspWindowClient.this).getString(R.string.mini_cancel), new Object[0]), new DialogInterface.OnClickListener() { // from class: com.alipay.android.msp.core.clients.MspWindowClient.11.1.1
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // android.content.DialogInterface.OnClickListener
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                                            return;
                                        }
                                        ActionsCreator.get(mspContext4).createEventAction(new EventAction("exit"));
                                        zArr[0] = false;
                                        conditionVariable.open();
                                    }
                                }));
                                arrayList.add(new FlybirdDialogEventDesc(LanguageHelper.localizedStringForKey("mini_redo", MspWindowClient.access$800(MspWindowClient.this).getString(R.string.mini_redo), new Object[0]), new DialogInterface.OnClickListener() { // from class: com.alipay.android.msp.core.clients.MspWindowClient.11.1.2
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // android.content.DialogInterface.OnClickListener
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                                            return;
                                        }
                                        zArr[0] = true;
                                        conditionVariable.open();
                                    }
                                }));
                                TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.core.clients.MspWindowClient.11.1.3
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // java.lang.Runnable
                                    public void run() {
                                        String str3;
                                        String str4;
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                            return;
                                        }
                                        MspContext mspContext5 = mspContext4;
                                        if (mspContext5 instanceof MspTradeContext) {
                                            str3 = ((MspTradeContext) mspContext5).getMspPayResult().getEndCode();
                                        } else {
                                            str3 = "";
                                        }
                                        if ("6001".equals(str3) || "6002".equals(str3) || TextUtils.isEmpty(str3)) {
                                            str4 = LanguageHelper.localizedStringForKey("mini_net_error_weak", MspWindowClient.access$800(MspWindowClient.this).getString(R.string.mini_net_error_weak), new Object[0]);
                                        } else {
                                            str4 = LanguageHelper.localizedStringForKey("mini_net_error", MspWindowClient.access$800(MspWindowClient.this).getString(R.string.mini_net_error), new Object[0]);
                                        }
                                        FlybirdDialogImpl.showDialog(MspWindowClient.access$800(MspWindowClient.this), null, str4, arrayList);
                                    }
                                });
                                conditionVariable.block();
                                return zArr[0];
                            }
                        });
                        templateLoadedCallback.setRenderTime(this.f3545a);
                        if (MspWindowClient.this.mMspContext.isUpgradePreRendTpl()) {
                            obj = PluginManager.getRender().preloadViewNew(access$700.getActivity(), MspWindowClient.this.mBizId, this.val$windowFrame.getTplId(), this.val$windowFrame.getTplString(), this.val$contentData, this.val$windowFrame.getStartupParams(), this.val$windowFrame.getSceneParams(), this.val$callback, templateLoadedCallback);
                        } else {
                            obj = PluginManager.getRender().preloadView(access$700.getActivity(), MspWindowClient.this.mBizId, this.val$windowFrame.getTplId(), this.val$windowFrame.getTplString(), this.val$contentData, this.val$windowFrame.getStartupParams(), this.val$windowFrame.getSceneParams(), this.val$callback, templateLoadedCallback);
                        }
                    }
                    MspContext mspContext4 = MspWindowClient.this.mMspContext;
                    if (mspContext4 != null && mspContext4.isBizAppCollectMoneyPage) {
                        PhoneCashierMspEngine.getMspWallet().endSpiderSection("BIZ_SCAN_JUMP_MSP", "PAGE_DATA_REND");
                    }
                    LogUtil.record(1, "MspWindowClient:nonPreRendTpl", "buildFBDocumentTime=" + (SystemClock.elapsedRealtime() - elapsedRealtime) + ", threadMillis: " + (SystemClock.currentThreadTimeMillis() - currentThreadTimeMillis));
                    final StEvent statisticEvent = this.val$windowFrame.getStatisticEvent();
                    if (statisticEvent != null) {
                        statisticEvent.onStatistic(StEvent.PARSE_TIME, "");
                    }
                    MspContext mspContext5 = MspWindowClient.this.mMspContext;
                    if (mspContext5 != null && mspContext5.isBizAppCollectMoneyPage) {
                        PhoneCashierMspEngine.getMspWallet().startSpiderSection("BIZ_SCAN_JUMP_MSP", "GENERATE_VIEW_START");
                    }
                    if (obj != null) {
                        TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.core.clients.MspWindowClient.11.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                View view;
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                try {
                                    MspContext mspContext6 = MspWindowClient.this.mMspContext;
                                    if (mspContext6 != null && mspContext6.isBizAppCollectMoneyPage) {
                                        PhoneCashierMspEngine.getMspWallet().endSpiderSection("BIZ_SCAN_JUMP_MSP", "GENERATE_VIEW_START");
                                        PhoneCashierMspEngine.getMspWallet().startSpiderSection("BIZ_SCAN_JUMP_MSP", "GENERATE_VIEW_DO");
                                    }
                                    MspWindowClient.access$1000(MspWindowClient.this);
                                } catch (Throwable th3) {
                                    LogUtil.printExceptionStackTrace(th3);
                                    MspWindowClient.access$900("renderGenFail", MspWindowClient.this.mMspContext, tplId);
                                    MspWindowClient mspWindowClient2 = MspWindowClient.this;
                                    if (mspWindowClient2.mMspWindowLoadListener != null) {
                                        LogUtil.record(4, "onWindowLoadFail", "BIRD_NEST_GENERATE_ERROR，loadListener" + MspWindowClient.this.mMspWindowLoadListener);
                                        Bundle bundle2 = new Bundle();
                                        bundle2.putInt("mspBizId", MspWindowClient.this.mBizId);
                                        MspWindowClient.this.mMspWindowLoadListener.onWindowLoadFail(2, bundle2);
                                    } else {
                                        ExceptionUtils.sendUiMsgWhenException(mspWindowClient2.mBizId, th3);
                                    }
                                    MspWindowClient mspWindowClient3 = MspWindowClient.this;
                                    BroadcastUtil.sendRendPageResultToSource(mspWindowClient3.mFailNotifyName, MspWindowClient.access$800(mspWindowClient3), MspWindowClient.this.mBizId);
                                }
                                if (access$700.getIView() != null) {
                                    if (MspWindowClient.this.mMspContext.isUpgradePreRendTpl()) {
                                        view = PluginManager.getRender().generateViewWithPrepareResult(access$700.getActivity(), MspWindowClient.this.mBizId, obj);
                                    } else {
                                        view = PluginManager.getRender().generateView(access$700.getActivity(), MspWindowClient.this.mBizId, obj);
                                    }
                                    if (view != null) {
                                        AnonymousClass11.access$1100(AnonymousClass11.this).setShowTime(SystemClock.elapsedRealtime() - elapsedRealtime);
                                        Object obj2 = obj;
                                        if (obj2 instanceof PreparedResult) {
                                            AnonymousClass11 r5 = AnonymousClass11.this;
                                            MspWindowClient.access$1200(MspWindowClient.this.mMspContext, (PreparedResult) obj2, AnonymousClass11.access$1100(r5), AnonymousClass11.this.val$windowFrame.isFirstTplFrame(), false);
                                        } else if (obj2 instanceof MspPrepareResult) {
                                            if (((MspPrepareResult) obj2).getPrepareResult() != null) {
                                                MspRender.appendPreloadStat(tplId, MspWindowClient.this.mMspContext, ((MspPrepareResult) obj).getPrepareResult().isReusedFromPrerender());
                                            }
                                            AnonymousClass11 r4 = AnonymousClass11.this;
                                            MspWindowClient.access$1300(MspWindowClient.this.mMspContext, (MspPrepareResult) obj, AnonymousClass11.access$1100(r4));
                                        }
                                        MspContext mspContext7 = MspWindowClient.this.mMspContext;
                                        if (mspContext7 != null && mspContext7.isBizAppCollectMoneyPage) {
                                            PhoneCashierMspEngine.getMspWallet().endSpiderSection("BIZ_SCAN_JUMP_MSP", "GENERATE_VIEW_DO");
                                        }
                                        StEvent stEvent = statisticEvent;
                                        if (stEvent != null) {
                                            stEvent.onStatistic(StEvent.FILL_DATE_TIME, "");
                                        }
                                        AnonymousClass11 r2 = AnonymousClass11.this;
                                        MspWindowClient.access$1400(MspWindowClient.this, view, r2.val$windowFrame, tplId);
                                        AnonymousClass11.this.val$windowFrame.setIsPreLoadView(false);
                                        if (FlybirdUtil.isShowResultPage(AnonymousClass11.this.val$windowFrame.getTplId())) {
                                            AnonymousClass11 r0 = AnonymousClass11.this;
                                            MspWindowClient.this.mMspContext.onRendResultPage(r0.val$windowFrame.getTplId());
                                            return;
                                        }
                                        return;
                                    }
                                    throw new Exception("contentView is null");
                                }
                            }
                        }, DrmManager.getInstance(MspWindowClient.access$800(MspWindowClient.this)).isGray(DrmKey.GRAY_POST_AT_FRONT, false, MspWindowClient.access$800(MspWindowClient.this)));
                    } else {
                        MspContext mspContext6 = MspWindowClient.this.mMspContext;
                        if (mspContext6 != null) {
                            StatisticInfo statisticInfo2 = mspContext6.getStatisticInfo();
                            statisticInfo2.addError("ui", "preloadResultNull", "template_error:" + this.val$windowFrame.getTplId());
                            StatisticInfo statisticInfo3 = MspWindowClient.this.mMspContext.getStatisticInfo();
                            Vector vector2 = Vector.Result;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(ClientEndCode.APPERROR_FLYBIRD);
                            statisticInfo3.updateAttr(vector2, "clientEndCode", sb2.toString());
                        }
                        if (MspWindowClient.this.mMspWindowLoadListener != null) {
                            LogUtil.record(4, "onWindowLoadFail", "BIRD_NEST_DOCUMENT_NULL，loadListener" + MspWindowClient.this.mMspWindowLoadListener);
                            Bundle bundle2 = new Bundle();
                            bundle2.putInt("mspBizId", MspWindowClient.this.mBizId);
                            MspWindowClient.this.mMspWindowLoadListener.onWindowLoadFail(3, bundle2);
                        } else if (access$700.getIView() != null) {
                            ExceptionUtils.sendUiMsgWhenException(MspWindowClient.this.mBizId, new AppErrorException(ExceptionUtils.createExceptionMsg(LanguageHelper.localizedStringForKey("flybird_system_error", access$700.getActivity().getString(R.string.flybird_system_error), new Object[0]), 6)));
                        }
                        MspWindowClient mspWindowClient2 = MspWindowClient.this;
                        BroadcastUtil.sendRendPageResultToSource(mspWindowClient2.mFailNotifyName, MspWindowClient.access$800(mspWindowClient2), MspWindowClient.this.mBizId);
                    }
                    MspWindowClient.access$602(MspWindowClient.this, false);
                } catch (Throwable th3) {
                    th = th3;
                    str2 = "mspBizId";
                    str = "onWindowLoadFail";
                }
            }
        }
    }

    public final void f(final MspWindowFrame mspWindowFrame) {
        final String json;
        MspBasePresenter mspBasePresenter;
        MspBasePresenter mspBasePresenter2;
        boolean z;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b53249ee", new Object[]{this, mspWindowFrame});
            return;
        }
        MspContext mspContext = this.mMspContext;
        if (mspContext != null && mspContext.isBizAppCollectMoneyPage) {
            PhoneCashierMspEngine.getMspWallet().endSpiderSection("BIZ_SCAN_JUMP_MSP", "PAGE_DATA_START");
            PhoneCashierMspEngine.getMspWallet().startSpiderSection("BIZ_SCAN_JUMP_MSP", "FRAME_CHANGED");
        }
        if (mspWindowFrame != null) {
            if (mspWindowFrame.getWindowType() != 11 || this.h != null) {
                synchronized (this) {
                    try {
                        if (mspWindowFrame.isExecuted()) {
                            LogUtil.w("MspWindowClient", "onFrameDataChanged", "mspWindowFrame isExecuted: ".concat(String.valueOf(mspWindowFrame)));
                            return;
                        }
                        mspWindowFrame.setExecuted(true);
                        LogUtil.i("MspWindowClient", "onFrameDataChanged", mspWindowFrame.toString());
                        MspContext mspContext2 = this.mMspContext;
                        if (mspContext2 != null) {
                            mspContext2.updateCurrentWinTpName(mspWindowFrame.getTplId());
                        }
                        StEvent statisticEvent = mspWindowFrame.getStatisticEvent();
                        if (statisticEvent != null) {
                            statisticEvent.onStatistic(StEvent.CONVERT_TIME, "");
                        }
                        int windowType = mspWindowFrame.getWindowType();
                        if (windowType == 10) {
                            MspBasePresenter mspBasePresenter3 = this.mCurrentPresenter;
                            if (mspBasePresenter3 == null) {
                                this.mMspContext.exit(0);
                            } else if (!this.g && mspBasePresenter3.getIView() != null) {
                                n();
                            }
                        } else {
                            MspContext mspContext3 = this.mMspContext;
                            if (mspContext3 != null) {
                                if (mspContext3.getStoreCenter() != null) {
                                    this.mMspContext.getStoreCenter().doCleanBeforeWindowChange(windowType);
                                }
                                this.g = true;
                                if (this.mMspContext.isBizAppCollectMoneyPage) {
                                    PhoneCashierMspEngine.getMspWallet().endSpiderSection("BIZ_SCAN_JUMP_MSP", "FRAME_CHANGED");
                                }
                                try {
                                    if (this.mMspContext != null && this.x) {
                                        PhoneCashierMspEngine.getMspWallet().endSpiderSection(MspGlobalDefine.SPIDER_MSP_CASHIER_BIZ_TYPE, "CASHIER_FIRST_LOAD");
                                    }
                                } catch (Exception e) {
                                    LogUtil.printExceptionStackTrace(e);
                                }
                                switch (windowType) {
                                    case 11:
                                        try {
                                            MspContext mspContext4 = this.mMspContext;
                                            if (mspContext4 != null && !mspContext4.isFromWallet() && mspWindowFrame.isFirstTplFrame()) {
                                                PhoneCashierMspEngine.getMspWallet().startSpiderSection(MspGlobalDefine.SPIDER_MSP_CASHIER_BIZ_TYPE, "CASHIER_SECOND_LOAD");
                                            }
                                        } catch (Exception e2) {
                                            LogUtil.printExceptionStackTrace(e2);
                                        }
                                        try {
                                            if (this.h == null) {
                                                return;
                                            }
                                        } catch (Exception e3) {
                                            LogUtil.printExceptionStackTrace(e3);
                                        }
                                        MspContext mspContext5 = this.mMspContext;
                                        if (mspContext5 != null && mspContext5.isBizAppCollectMoneyPage) {
                                            PhoneCashierMspEngine.getMspWallet().startSpiderSection("BIZ_SCAN_JUMP_MSP", "RECEIVE_TPL");
                                        }
                                        mspWindowFrame.setFirstTplFrame(this.y);
                                        this.y = false;
                                        BroadcastUtil.sendFrameChangeBroadcast(this.f);
                                        if (mspWindowFrame.getContentView() != null) {
                                            StEvent statisticEvent2 = mspWindowFrame.getStatisticEvent();
                                            if (statisticEvent2 != null) {
                                                statisticEvent2.onStatistic(StEvent.PARSE_TIME, "");
                                                statisticEvent2.onStatistic(StEvent.FILL_DATE_TIME, "");
                                            }
                                            LogUtil.record(2, "MspWindowClient:handleBackFrame", "mspContext=" + this.mMspContext + " , mCurrentPresenter=" + this.mCurrentPresenter);
                                            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.core.clients.MspWindowClient.6
                                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                                @Override // java.lang.Runnable
                                                public void run() {
                                                    IpChange ipChange2 = $ipChange;
                                                    if (ipChange2 instanceof IpChange) {
                                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                                        return;
                                                    }
                                                    try {
                                                        PluginManager.getRender().callOnreload(mspWindowFrame.getContentView());
                                                        LogUtil.record(2, "MspWindowClient:handleBackFrame", "mCurrentPresenter=" + MspWindowClient.this.mCurrentPresenter);
                                                        MspBasePresenter mspBasePresenter4 = MspWindowClient.this.mCurrentPresenter;
                                                        if (mspBasePresenter4 != null && mspBasePresenter4.getIView() != null) {
                                                            KeyboardManager.getInstance().hideKeyboard(MspWindowClient.this.mCurrentPresenter.getActivity());
                                                            SpmWrapper.onPageEnd(MspWindowClient.access$200(MspWindowClient.this), MspWindowClient.this.mBizId);
                                                            SpmWrapper.onPageStart(mspWindowFrame, MspWindowClient.this.mBizId);
                                                            MspBasePresenter mspBasePresenter5 = MspWindowClient.this.mCurrentPresenter;
                                                            if (mspBasePresenter5 != null) {
                                                                MspBaseContract.IView iView = mspBasePresenter5.getIView();
                                                                if (iView != null) {
                                                                    iView.showContentView(mspWindowFrame.getContentView(), 0, mspWindowFrame);
                                                                }
                                                                MspWindowClient.access$202(MspWindowClient.this, mspWindowFrame);
                                                            }
                                                        }
                                                    } catch (Exception e4) {
                                                        LogUtil.printExceptionStackTrace(e4);
                                                        ExceptionUtils.sendUiMsgWhenException(MspWindowClient.this.mBizId, e4);
                                                    }
                                                }
                                            });
                                            return;
                                        }
                                        final JSONObject templateContentData = mspWindowFrame.getTemplateContentData();
                                        if (templateContentData == null) {
                                            json = "{}";
                                        } else {
                                            json = templateContentData.toString();
                                        }
                                        if (templateContentData != null && templateContentData.getBooleanValue(MspFlybirdDefine.FLYBIRD_FINGERPAY)) {
                                            this.mMspContext.setFingerPay(true);
                                        }
                                        if (FlybirdUtil.isShowResultPage(mspWindowFrame.getTplId())) {
                                            this.mMspContext.setFingerPay(false);
                                            this.mMspContext.setHasShowResultPage(true);
                                        }
                                        if (!mspWindowFrame.isNoBack()) {
                                            hidePrePageLoading();
                                        }
                                        final String tplId = mspWindowFrame.getTplId();
                                        if (mspWindowFrame.isFirstTplFrame()) {
                                            PhoneCashierMspEngine.getMspWallet().startSpiderSection(MspGlobalDefine.SPIDER_MSP_CASHIER_BIZ_TYPE, "FIRST_REQUEST_REND");
                                        }
                                        this.j.setTplId(tplId);
                                        if (this.t.intercept(this.f, mspWindowFrame, json, new FlybirdRenderIntercepter.IntercepterCallback() { // from class: com.alipay.android.msp.core.clients.MspWindowClient.7
                                            public static volatile transient /* synthetic */ IpChange $ipChange;

                                            @Override // com.alipay.android.msp.framework.helper.FlybirdRenderIntercepter.IntercepterCallback
                                            public void dismissLoading() {
                                                IpChange ipChange2 = $ipChange;
                                                if (ipChange2 instanceof IpChange) {
                                                    ipChange2.ipc$dispatch("8c142d9", new Object[]{this});
                                                    return;
                                                }
                                                MspContext mspContext6 = MspWindowClient.this.mMspContext;
                                                if (mspContext6 instanceof MspTradeContext) {
                                                    ((MspTradeContext) mspContext6).setSubmitState(false);
                                                }
                                                try {
                                                    MspWindowClient.this.getCurrentPresenter().getIView().stopLoadingView();
                                                    MspWindowClient.this.getCurrentPresenter().getIView().removeMaskView();
                                                } catch (Exception e4) {
                                                    LogUtil.printExceptionStackTrace(e4);
                                                }
                                            }

                                            @Override // com.alipay.android.msp.framework.helper.FlybirdRenderIntercepter.IntercepterCallback
                                            public void onEvent(String str2) {
                                                IpChange ipChange2 = $ipChange;
                                                if (ipChange2 instanceof IpChange) {
                                                    ipChange2.ipc$dispatch("9589844c", new Object[]{this, str2});
                                                } else {
                                                    ActionsCreator.get(MspWindowClient.this.mMspContext).createDialogEventAction(str2);
                                                }
                                            }
                                        })) {
                                            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.core.clients.MspWindowClient.8
                                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                                @Override // java.lang.Runnable
                                                public void run() {
                                                    IpChange ipChange2 = $ipChange;
                                                    if (ipChange2 instanceof IpChange) {
                                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                                        return;
                                                    }
                                                    try {
                                                        MspWindowClient.access$300(MspWindowClient.this, mspWindowFrame);
                                                    } catch (Throwable th) {
                                                        LogUtil.printExceptionStackTrace(th);
                                                    }
                                                }
                                            });
                                            hidePrePageLoading();
                                            getFrameStack().popTopFrame(FlybirdRenderIntercepter.ERROR_TPL);
                                            return;
                                        }
                                        MspContext mspContext6 = this.mMspContext;
                                        Pair<PreparedResult, View> preloadedTpl = (mspContext6 == null || !mspContext6.isUpgradePreRendTpl()) ? PreRendManager.getInstance().getPreloadedTpl(this.mMspContext, tplId, mspWindowFrame.getTplString()) : null;
                                        final PreparedResult preparedResult = preloadedTpl != null ? preloadedTpl.first : null;
                                        final View view = preloadedTpl != null ? preloadedTpl.second : null;
                                        final IRenderCallback iRenderCallback = new IRenderCallback() { // from class: com.alipay.android.msp.core.clients.MspWindowClient.9
                                            public static volatile transient /* synthetic */ IpChange $ipChange;

                                            @Override // com.alipay.android.msp.core.callback.IRenderCallback
                                            public void onAsyncEvent(ITemplateClickCallback iTemplateClickCallback, Object obj, String str2) {
                                                IpChange ipChange2 = $ipChange;
                                                if (ipChange2 instanceof IpChange) {
                                                    ipChange2.ipc$dispatch("ea659cdf", new Object[]{this, iTemplateClickCallback, obj, str2});
                                                    return;
                                                }
                                                EventAction createMspEventWithJsonString = MspEventCreator.get().createMspEventWithJsonString("renderCallback.onAsyncEvent", str2);
                                                if (createMspEventWithJsonString != null) {
                                                    createMspEventWithJsonString.setSender(obj);
                                                    createMspEventWithJsonString.setEventFrom("submit");
                                                    createMspEventWithJsonString.setTemplateClickCallback(iTemplateClickCallback);
                                                    ActionsCreator.get(MspWindowClient.this.mMspContext).createEventAction(createMspEventWithJsonString);
                                                }
                                            }

                                            @Override // com.alipay.android.msp.core.callback.IRenderCallback
                                            public void onEvent(Object obj, String str2) {
                                                IpChange ipChange2 = $ipChange;
                                                if (ipChange2 instanceof IpChange) {
                                                    ipChange2.ipc$dispatch("9d9ed8a8", new Object[]{this, obj, str2});
                                                    return;
                                                }
                                                EventAction createMspEventWithJsonString = MspEventCreator.get().createMspEventWithJsonString("renderCallback.onEvent", str2);
                                                if (createMspEventWithJsonString != null) {
                                                    createMspEventWithJsonString.setSender(obj);
                                                    createMspEventWithJsonString.setEventFrom("submit");
                                                }
                                                if (createMspEventWithJsonString == null || createMspEventWithJsonString.getMspEvents().length <= 0) {
                                                    LogUtil.e("MspWindowClient", MspFlybirdDefine.FLYBIRD_FRAME_EVENT_TYPE.ON_EVENT, "eventAction null or events null");
                                                } else {
                                                    EventAction.MspEvent mspEvent = createMspEventWithJsonString.getMspEvents()[0];
                                                    if (MspWindowClient.access$400(MspWindowClient.this) != null) {
                                                        boolean onInterceptTplEvent = MspWindowClient.access$400(MspWindowClient.this).onInterceptTplEvent(obj, str2, mspEvent);
                                                        LogUtil.i("MspWindowClient", MspFlybirdDefine.FLYBIRD_FRAME_EVENT_TYPE.ON_EVENT, "mOnFrameTplEventListener: " + MspWindowClient.access$400(MspWindowClient.this).toString() + " intercept: " + onInterceptTplEvent);
                                                        if (onInterceptTplEvent) {
                                                            return;
                                                        }
                                                    }
                                                }
                                                ActionsCreator.get(MspWindowClient.this.mMspContext).createEventAction(createMspEventWithJsonString);
                                            }
                                        };
                                        SpmWrapper.onPageEnd(this.i, this.mBizId);
                                        try {
                                            MspContext mspContext7 = this.mMspContext;
                                            if (!(mspContext7 == null || !mspContext7.isBizAppCollectMoneyPage || (mspBasePresenter = this.mCurrentPresenter) == null || mspBasePresenter.getIView() == null || tplId == null || !tplId.startsWith("QUICKPAY@"))) {
                                                FlybirdUtil.logStubFullLinkId(this.mCurrentPresenter.getActivity(), "flt_msp_load_".concat(String.valueOf(tplId.substring(9).replaceAll("-", ""))), "00000317");
                                            }
                                        } catch (Exception e4) {
                                            LogUtil.printExceptionStackTrace(e4);
                                        }
                                        MspContext mspContext8 = this.mMspContext;
                                        if (mspContext8 != null && mspContext8.isBizAppCollectMoneyPage) {
                                            PhoneCashierMspEngine.getMspWallet().endSpiderSection("BIZ_SCAN_JUMP_MSP", "RECEIVE_TPL");
                                        }
                                        if (view != null) {
                                            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.core.clients.MspWindowClient.10
                                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                                @Override // java.lang.Runnable
                                                public void run() {
                                                    IpChange ipChange2 = $ipChange;
                                                    if (ipChange2 instanceof IpChange) {
                                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                                        return;
                                                    }
                                                    MspWindowClient.access$500(MspWindowClient.this, mspWindowFrame, tplId, view, preparedResult, templateContentData, json, iRenderCallback);
                                                    MspWindowClient.access$602(MspWindowClient.this, false);
                                                }
                                            });
                                            return;
                                        }
                                        LogUtil.record(1, "MspWindowClient:onFrameDataChanged", "preload null:".concat(String.valueOf(tplId)));
                                        MspContext mspContext9 = this.mMspContext;
                                        if (mspContext9 == null || !mspContext9.isUpgradePreRendTpl()) {
                                            PreRendManager.getInstance().appendPreloadStat(tplId, this.mBizId, false, this.f);
                                        }
                                        h(mspWindowFrame, json, iRenderCallback);
                                        return;
                                    case 12:
                                        JSONObject windowData = mspWindowFrame.getWindowData();
                                        if (!(windowData == null || (mspBasePresenter2 = this.mCurrentPresenter) == null || mspBasePresenter2.getIView() == null)) {
                                            final MspBaseContract.IView iView = this.mCurrentPresenter.getIView();
                                            if (!mspWindowFrame.isAjax()) {
                                                hidePrePageLoading();
                                            }
                                            int intValue = windowData.containsKey("time") ? windowData.getIntValue("time") : 2000;
                                            String string = windowData.getString("msg");
                                            String string2 = windowData.getString("img");
                                            if ("wnd".equals(mspWindowFrame.getDataChannelValue())) {
                                                if (getFrameStack().isMspWindowFrameHasCallback(getFrameStack().getTopTplFrame())) {
                                                    EventAction eventAction = new EventAction(MspEventTypes.ACTION_STRING_SENDCHANNELDATA);
                                                    JSONObject jSONObject = new JSONObject();
                                                    jSONObject.put("type", (Object) "wnd");
                                                    jSONObject.put("data", (Object) windowData);
                                                    JSONObject jSONObject2 = new JSONObject();
                                                    jSONObject2.put("targetData", (Object) jSONObject);
                                                    eventAction.setActionParamsJson(jSONObject2);
                                                    ActionsCreator.get(this.mMspContext).createEventAction(eventAction);
                                                    z = false;
                                                } else {
                                                    z = true;
                                                }
                                                MspContext mspContext10 = this.mMspContext;
                                                if ((mspContext10 instanceof MspTradeContext) && ((MspTradeContext) mspContext10).getMspPayResult().isSuccess() && getFrameStack().getTopTplFrame() != null) {
                                                    String tplId2 = getFrameStack().getTopTplFrame().getTplId();
                                                    if (z) {
                                                        str = "toast";
                                                    } else {
                                                        str = "tpl";
                                                    }
                                                    EventLogUtil.logPayEvent("1010887", pl4.KEY_PAGE_ID, tplId2, "action", str);
                                                }
                                            } else {
                                                z = true;
                                            }
                                            if (z && !TextUtils.isEmpty(string)) {
                                                iView.showToastView(string, string2, intValue);
                                            }
                                            if (!mspWindowFrame.isAjax()) {
                                                iView.stopLoadingView();
                                            }
                                            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.core.clients.MspWindowClient.5
                                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                                @Override // java.lang.Runnable
                                                public void run() {
                                                    IpChange ipChange2 = $ipChange;
                                                    if (ipChange2 instanceof IpChange) {
                                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                                    } else if (!mspWindowFrame.isAjax()) {
                                                        iView.removeMaskView();
                                                    }
                                                }
                                            }, intValue);
                                            LogUtil.record(2, "MspWindowClient:onReceiveToast ", "msg=" + string + " ,delayTime=" + intValue);
                                            if (windowData.containsKey("act")) {
                                                d(windowData.getJSONObject("act"), mspWindowFrame, intValue, string);
                                            } else if (windowData.containsKey(ActVideoSetting.ACT_VIDEO_SETTING)) {
                                                JSONArray jSONArray = windowData.getJSONArray(ActVideoSetting.ACT_VIDEO_SETTING);
                                                for (int i = 0; i < jSONArray.size(); i++) {
                                                    d(jSONArray.getJSONObject(i), mspWindowFrame, intValue, string);
                                                }
                                            }
                                        }
                                        try {
                                            MspContext mspContext11 = this.mMspContext;
                                            if (mspContext11 != null && !mspContext11.isFromWallet() && this.x) {
                                                FlybirdUtil.endSpider(MspGlobalDefine.SPIDER_MSP_CASHIER_BIZ_TYPE);
                                            }
                                            if (this.x) {
                                                ThreadController.end(ThreadController.CASHIER_SIGN, ThreadController.CASHIER_TRANS_ACTIVITY, ThreadController.CASHIER_SERVICE_PAY, ThreadController.CASHIER_SCHEME_PAY);
                                            }
                                        } catch (Exception e5) {
                                            LogUtil.printExceptionStackTrace(e5);
                                        }
                                        this.x = false;
                                        return;
                                    case 13:
                                        k(mspWindowFrame);
                                        try {
                                            MspContext mspContext12 = this.mMspContext;
                                            if (mspContext12 != null && !mspContext12.isFromWallet() && this.x) {
                                                FlybirdUtil.endSpider(MspGlobalDefine.SPIDER_MSP_CASHIER_BIZ_TYPE);
                                            }
                                            if (this.x) {
                                                ThreadController.end(ThreadController.CASHIER_SIGN, ThreadController.CASHIER_TRANS_ACTIVITY, ThreadController.CASHIER_SERVICE_PAY, ThreadController.CASHIER_SCHEME_PAY);
                                            }
                                        } catch (Exception e6) {
                                            LogUtil.printExceptionStackTrace(e6);
                                        }
                                        this.x = false;
                                        return;
                                    case 14:
                                        TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.core.clients.MspWindowClient.4
                                            public static volatile transient /* synthetic */ IpChange $ipChange;

                                            @Override // java.lang.Runnable
                                            public void run() {
                                                IpChange ipChange2 = $ipChange;
                                                if (ipChange2 instanceof IpChange) {
                                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                                    return;
                                                }
                                                try {
                                                    MspBasePresenter mspBasePresenter4 = MspWindowClient.this.mCurrentPresenter;
                                                    if (mspBasePresenter4 != null && mspBasePresenter4.getIView() != null) {
                                                        MspWindowClient.this.mCurrentPresenter.getIView().showContentView(null, 0, mspWindowFrame);
                                                    }
                                                } catch (Exception e7) {
                                                    LogUtil.printExceptionStackTrace(e7);
                                                }
                                            }
                                        });
                                        if (this.x) {
                                            ThreadController.end(ThreadController.CASHIER_SIGN, ThreadController.CASHIER_TRANS_ACTIVITY, ThreadController.CASHIER_SERVICE_PAY, ThreadController.CASHIER_SCHEME_PAY);
                                        }
                                        this.x = false;
                                        return;
                                    default:
                                        return;
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    @Deprecated
    public static void e(MspContext mspContext, PreparedResult preparedResult, RenderTime renderTime, boolean z, boolean z2) {
        String str;
        String str2;
        String str3;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfa410ec", new Object[]{mspContext, preparedResult, renderTime, new Boolean(z), new Boolean(z2)});
            return;
        }
        if (!(mspContext == null || preparedResult == null)) {
            try {
                Template template = preparedResult.mRenderedTpl;
                String str5 = template.tplId;
                StEventForRenderFinish stEventForRenderFinish = new StEventForRenderFinish(str5, "finshRender", template.tplVersion + "|" + template.time);
                stEventForRenderFinish.setTemplateDownLoadTime(renderTime.getDownloadTime());
                stEventForRenderFinish.setParseTime(renderTime.getParseTime());
                stEventForRenderFinish.setRenderTime(renderTime.getRenderTime());
                stEventForRenderFinish.setShowTime(renderTime.getShowTime());
                mspContext.getStatisticInfo().addEvent(stEventForRenderFinish);
                String str6 = z1x.PRE_RENDER;
                if (z) {
                    String str7 = template.tplId;
                    String str8 = z2 ? str6 : "normal";
                    StringBuilder sb = new StringBuilder();
                    str = "tplList";
                    sb.append(renderTime.getShowTime());
                    String sb2 = sb.toString();
                    if (mspContext.isUpgradePreRendTpl()) {
                        str4 = slo.VALUE_YES;
                    } else {
                        str4 = "NO";
                    }
                    EventLogUtil.logPayEvent("10101464", pl4.KEY_PAGE_ID, str7, "renderMode", str8, "costTime", sb2, "upgradePreRendTpl", str4);
                } else {
                    str = "tplList";
                }
                JSONObject drmValueFromKey = DrmManager.getInstance(mspContext.getContext()).getDrmValueFromKey(DrmKey.BYPASS_TPL_ASSETS_BLACK_LIST);
                if (drmValueFromKey == null || !drmValueFromKey.containsKey(str) || !drmValueFromKey.getJSONArray(str).contains(template.tplId)) {
                    String str9 = template.tplId;
                    if (!z2) {
                        str6 = "normal";
                    }
                    if (mspContext.isUpgradePreRendTpl()) {
                        str2 = slo.VALUE_YES;
                    } else {
                        str2 = "NO";
                    }
                    EventLogUtil.logPayEvent("1010546", pl4.KEY_PAGE_ID, str9, UTConstant.Args.UT_PROPERTY_SUCCESS, slo.VALUE_YES, "renderMode", str6, "upgradePreRendTpl", str2);
                } else {
                    String str10 = template.tplId;
                    String str11 = z2 ? str6 : "normal";
                    if (mspContext.isUpgradePreRendTpl()) {
                        str3 = slo.VALUE_YES;
                    } else {
                        str3 = "NO";
                    }
                    EventLogUtil.logPayEvent("1010546", pl4.KEY_PAGE_ID, str10, UTConstant.Args.UT_PROPERTY_SUCCESS, slo.VALUE_YES, "context", "res_delete", "renderMode", str11, "upgradePreRendTpl", str3);
                }
            } catch (Throwable th) {
                mspContext.getStatisticInfo().addError(ErrorType.DEFAULT, "cantLogRender", th);
            }
        }
        if (preparedResult.mRenderedTpl != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tplVersion", (Object) preparedResult.mRenderedTpl.tplVersion);
            jSONObject.put("time", (Object) preparedResult.mRenderedTpl.time);
            TemplateChangeMonitor.getInstance().hitKey(preparedResult.mRenderedTpl.tplId, jSONObject.toString(), true);
        }
    }

    public static /* synthetic */ void access$500(MspWindowClient mspWindowClient, MspWindowFrame mspWindowFrame, String str, View view, PreparedResult preparedResult, JSONObject jSONObject, String str2, IRenderCallback iRenderCallback) {
        String str3;
        IRenderCallback iRenderCallback2;
        Throwable th;
        String str4;
        MspContext mspContext;
        TplIdentity tplIdentity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("887697c4", new Object[]{mspWindowClient, mspWindowFrame, str, view, preparedResult, jSONObject, str2, iRenderCallback});
            return;
        }
        MspContainerPresenter mspContainerPresenter = mspWindowClient.h;
        if (mspContainerPresenter != null && mspContainerPresenter.getIView() != null) {
            LogUtil.record(1, "MspWindowClient:onPreRendTpl", "preload not null:".concat(String.valueOf(str)));
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                StEvent statisticEvent = mspWindowFrame.getStatisticEvent();
                mspWindowClient.o();
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                if (jSONObject == null) {
                    str4 = "{}";
                } else {
                    str4 = jSONObject.toString();
                }
                FBContext fbContextFromView = PluginManager.getRender().getFbContextFromView(view);
                try {
                    Pair<String, TplIdentity> buildRpcData = MspRender.buildRpcData(mspWindowFrame.getStartupParams(), mspWindowFrame.getSceneParams(), str4, mspWindowClient.mBizId, str, mspWindowFrame.getTplString(), mspWindowClient.f);
                    String str5 = buildRpcData.first;
                    if (fbContextFromView == null || TextUtils.isEmpty(str5)) {
                        iRenderCallback2 = iRenderCallback;
                        str3 = "MspWindowClient:onPreRendTpl";
                        try {
                            mspWindowClient.h(mspWindowFrame, str4, iRenderCallback2);
                        } catch (Throwable th2) {
                            th = th2;
                            LogUtil.record(1, str3, "preRendEx" + th.getMessage());
                            PreRendManager.getInstance().appendPreloadStat(str, mspWindowClient.mBizId, false, mspWindowClient.f);
                            if (mspWindowClient.h != null) {
                                MspContext mspContext2 = mspWindowClient.mMspContext;
                                if (mspContext2 != null) {
                                    StatisticInfo statisticInfo = mspContext2.getStatisticInfo();
                                    statisticInfo.addError(ErrorType.DEFAULT, "preRendFail", str + th);
                                }
                                mspWindowClient.h(mspWindowFrame, str2, iRenderCallback2);
                            }
                        }
                    } else {
                        if (fbContextFromView instanceof FBDocument) {
                            FBDocument fBDocument = (FBDocument) fbContextFromView;
                            if (fBDocument.getContext() != mspWindowClient.mCurrentPresenter.getActivity()) {
                                fBDocument.setContext(mspWindowClient.mCurrentPresenter.getActivity());
                            }
                            if (NativeTplRuntimeManager.drmEnabled() && (tplIdentity = buildRpcData.second) != null) {
                                NativeTplRuntimeManager.registerTpl(tplIdentity, new WeakReference(fBDocument));
                            }
                        }
                        BirdNestEngine.Params params = ((FBDocument) fbContextFromView).param;
                        if (params != null) {
                            params.businessId = String.valueOf(mspWindowClient.mBizId);
                        }
                        fbContextFromView.reloadData(str5);
                        RenderTime renderTime = new RenderTime();
                        renderTime.getInnerStatistic().setRenderTime(SystemClock.elapsedRealtime() - elapsedRealtime);
                        renderTime.setShowTime(SystemClock.elapsedRealtime() - elapsedRealtime);
                        e(mspWindowClient.mMspContext, preparedResult, renderTime, mspWindowFrame.isFirstTplFrame(), true);
                        long elapsedRealtime3 = SystemClock.elapsedRealtime();
                        LogUtil.record(1, "MspWindowClient:onPreRendTpl", "onReloadData : " + (elapsedRealtime3 - elapsedRealtime2));
                        if (statisticEvent != null) {
                            statisticEvent.onStatistic(StEvent.PARSE_TIME, "");
                        }
                        LogUtil.record(1, "MspWindowClient:onPreRendTpl", "getView: ".concat(String.valueOf(str)));
                        if (statisticEvent != null) {
                            statisticEvent.onStatistic(StEvent.FILL_DATE_TIME, "");
                        }
                        SpmWrapper.onPageStart(mspWindowFrame, mspWindowClient.mBizId);
                        MspContainerPresenter mspContainerPresenter2 = mspWindowClient.h;
                        if (mspContainerPresenter2 != null && mspContainerPresenter2.getIView() != null) {
                            long elapsedRealtime4 = SystemClock.elapsedRealtime();
                            mspWindowClient.h.getIView().showContentView(view, 1, mspWindowFrame);
                            long elapsedRealtime5 = SystemClock.elapsedRealtime();
                            LogUtil.d("MspWindowClient", "onPreRendTpl", "ptime=" + (elapsedRealtime5 - elapsedRealtime) + " showContentViewTime=" + (elapsedRealtime5 - elapsedRealtime4));
                            mspWindowClient.g(mspWindowFrame, view);
                            PreRendManager.getInstance().appendPreloadStat(str, mspWindowClient.mBizId, true, mspWindowClient.f);
                            if (FlybirdUtil.isShowResultPage(mspWindowFrame.getTplId()) && (mspContext = mspWindowClient.mMspContext) != null) {
                                mspContext.onRendResultPage(mspWindowFrame.getTplId());
                            }
                            mspWindowFrame.setIsPreLoadView(true);
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    iRenderCallback2 = iRenderCallback;
                    str3 = "MspWindowClient:onPreRendTpl";
                }
            } catch (Throwable th4) {
                th = th4;
                str3 = "MspWindowClient:onPreRendTpl";
                iRenderCallback2 = iRenderCallback;
            }
        }
    }
}
