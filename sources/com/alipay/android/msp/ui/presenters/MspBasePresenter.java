package com.alipay.android.msp.ui.presenters;

import android.app.Activity;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.container.MspContainerClient;
import com.alipay.android.msp.core.clients.MspUIClient;
import com.alipay.android.msp.core.context.MspContainerContext;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.InvokeActionPlugin;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.alipay.android.msp.framework.statisticsv2.ClientEndCode;
import com.alipay.android.msp.language.LanguageHelper;
import com.alipay.android.msp.ui.base.OnResultReceived;
import com.alipay.android.msp.ui.contracts.MspBaseContract;
import com.alipay.android.msp.ui.contracts.MspBaseContract.IView;
import com.alipay.android.msp.ui.views.MspBaseActivity;
import com.alipay.android.msp.ui.views.MspProxyActivity;
import com.alipay.android.msp.ui.widget.MspDialogButton;
import com.alipay.android.msp.utils.ExceptionUtils;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MspBasePresenter<V extends MspBaseContract.IView> implements MspBaseContract.IPresenter<V> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public V f3730a;
    public int mBizId;

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IPresenter
    public void attachIView(MspBaseContract.IView iView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80f916e7", new Object[]{this, iView});
        } else if (iView != 0) {
            this.f3730a = iView;
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IPresenter
    public void detachIView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98beade2", new Object[]{this});
        } else if (this.f3730a != null) {
            this.f3730a = null;
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IPresenter
    public void disposeUI() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7db7f7fa", new Object[]{this});
            return;
        }
        try {
            V iView = getIView();
            if (iView != null) {
                iView.stopLoadingView();
                iView.disposeActivity();
            }
            int bizId = getBizId();
            MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(bizId);
            if (mspContextByBizId != null) {
                MspUIClient mspUIClient = mspContextByBizId.getMspUIClient();
                mspUIClient.getFrameStack().clearDataStack(false);
                mspUIClient.doDisposeWindow();
                if (mspContextByBizId.getContext() != null && (mspContextByBizId instanceof MspContainerContext)) {
                    MspContainerClient mspContainerClient = ((MspContainerContext) mspContextByBizId).getMspContainerClient();
                    if (mspContainerClient != null) {
                        mspContainerClient.exitContainer();
                    }
                    MspContextManager.getInstance().removeMspContextByBizId(bizId);
                }
            }
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IPresenter
    public void exit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81677ea5", new Object[]{this});
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IPresenter
    public Activity getActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this});
        }
        if (getIView() instanceof MspBaseActivity) {
            return (MspBaseActivity) getIView();
        }
        if (getIView() instanceof Activity) {
            return (Activity) getIView();
        }
        if (getIView() instanceof MspProxyActivity) {
            return ((MspProxyActivity) getIView()).getActivity();
        }
        throw new IllegalStateException("view who implements this interface must either be BaseActivity");
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IPresenter
    public int getBizId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("14dc0c52", new Object[]{this})).intValue();
        }
        return -1;
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IPresenter
    public V getIView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ((MspBaseContract.IView) ipChange.ipc$dispatch("d3b14cc6", new Object[]{this}));
        }
        return this.f3730a;
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IPresenter
    public boolean isViewAttached() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("200a0cbe", new Object[]{this})).booleanValue();
        }
        if (this.f3730a != null) {
            return true;
        }
        return false;
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IPresenter
    public void onException(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b100829e", new Object[]{this, th});
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IPresenter
    public void onViewLoaded(MspContext mspContext) {
        MspUIClient mspUIClient;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4307c6", new Object[]{this, mspContext});
        } else if (mspContext != null && (mspUIClient = mspContext.getMspUIClient()) != null) {
            mspUIClient.onWindowLoaded(mspContext, this);
        }
    }

    public void registerInvokePlugin(MspContext mspContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3efcc50b", new Object[]{this, mspContext});
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (mspContext instanceof MspContainerContext) {
            InvokeActionPlugin.registerRenderLocalInvokeFamily(mspContext);
            InvokeActionPlugin.registerRenderBnInvokeFamily(mspContext);
        } else if (mspContext instanceof MspTradeContext) {
            InvokeActionPlugin.registerTradeLocalInvokeFamily(mspContext);
            InvokeActionPlugin.registerTradeBnInvokeFamily(mspContext);
        }
        LogUtil.record(2, "MspBasePresenter:registerInvokePlugin", "cost time:" + (SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    public void setBizId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4ca4090", new Object[]{this, new Integer(i)});
        } else {
            this.mBizId = i;
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IPresenter
    public void setOnOutJumpResumeCallback(OnResultReceived onResultReceived) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cf445f1", new Object[]{this, onResultReceived});
            return;
        }
        try {
            if (getIView() != null && getActivity() != null) {
                ((MspBaseActivity) getActivity()).setOnOutJumpResume(onResultReceived);
            }
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
    }

    public void alertNetError(String str, JSONObject jSONObject) {
        MspUIClient mspUIClient;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a803ab8", new Object[]{this, str, jSONObject});
            return;
        }
        LogUtil.record(4, "phonecashiermsp#flybird", "MspContainerPresenter.alertNetError.new Runnable().run", "alertNetError");
        MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(getBizId());
        if (mspContextByBizId != null && (mspUIClient = mspContextByBizId.getMspUIClient()) != null) {
            mspUIClient.hidePrePageLoading();
            Activity activity = getIView() != null ? getActivity() : null;
            if (activity != null) {
                if (TextUtils.isEmpty(str)) {
                    str = LanguageHelper.localizedStringForKey("mini_net_error_weak", activity.getString(R.string.mini_net_error_weak), new Object[0]);
                }
                String localizedStringForKey = LanguageHelper.localizedStringForKey("mini_cancel", activity.getString(R.string.mini_cancel), new Object[0]);
                String localizedStringForKey2 = LanguageHelper.localizedStringForKey("mini_redo", activity.getString(R.string.mini_redo), new Object[0]);
                EventAction eventAction = new EventAction("exit");
                eventAction.setLogFieldEndCode(ClientEndCode.NETERROR_RPC);
                EventAction eventAction2 = new EventAction(MspEventTypes.ACTION_STRING_REDO);
                if (jSONObject != null) {
                    eventAction2.setActionParamsArray(new String[]{jSONObject.toString()});
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(new MspDialogButton(localizedStringForKey, eventAction));
                arrayList.add(new MspDialogButton(localizedStringForKey2, eventAction2));
                V iView = getIView();
                if (iView != null) {
                    iView.showDialogView(null, str, arrayList);
                }
            }
        }
    }

    public void alertServerError(String str) {
        MspUIClient mspUIClient;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("808d2f5a", new Object[]{this, str});
            return;
        }
        MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(getBizId());
        if (mspContextByBizId != null && (mspUIClient = mspContextByBizId.getMspUIClient()) != null) {
            mspUIClient.hidePrePageLoading();
            Activity activity = getActivity();
            if (activity != null) {
                String localizedStringForKey = LanguageHelper.localizedStringForKey("msp_btn_ok", activity.getString(R.string.msp_btn_ok), new Object[0]);
                EventAction eventAction = new EventAction("exit");
                eventAction.setLogFieldEndCode(ClientEndCode.SERVERERROR_NOENDCODE);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new MspDialogButton(localizedStringForKey, eventAction));
                V iView = getIView();
                if (iView != null) {
                    iView.showDialogView(null, str, arrayList);
                }
            }
        }
    }

    public void alertAppError(Throwable th) {
        Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc13494b", new Object[]{this, th});
            return;
        }
        LogUtil.record(4, "phonecashiermsp#flybird", "FlybirdWindowManager.alertAppError.new Runnable().run", "alertAppError");
        MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(getBizId());
        if (mspContextByBizId != null && mspContextByBizId.getMspUIClient() != null && (activity = getActivity()) != null) {
            String message = th.getMessage();
            boolean isEmpty = TextUtils.isEmpty(message);
            if (mspContextByBizId.getMspNetHandler().hasNeecCode()) {
                mspContextByBizId.getMspNetHandler().setNeedNeec(true);
                message = LanguageHelper.localizedStringForKey("mini_server_error", activity.getString(R.string.mini_server_error), new Object[0]);
            } else if (isEmpty) {
                message = ExceptionUtils.createExceptionMsg(LanguageHelper.localizedStringForKey("mini_app_error", activity.getString(R.string.mini_app_error), new Object[0]), 1);
            }
            String localizedStringForKey = LanguageHelper.localizedStringForKey("msp_btn_ok", activity.getString(R.string.msp_btn_ok), new Object[0]);
            EventAction eventAction = new EventAction("exit");
            eventAction.setLogFieldEndCode(ClientEndCode.APPERROR_COMMON);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new MspDialogButton(localizedStringForKey, eventAction));
            V iView = getIView();
            if (iView != null) {
                iView.showDialogView(null, message, arrayList);
            }
        }
    }
}
