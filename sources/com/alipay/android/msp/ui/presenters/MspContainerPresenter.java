package com.alipay.android.msp.ui.presenters;

import android.text.TextUtils;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.constants.MspNetConstants;
import com.alipay.android.msp.core.MspNetHandler;
import com.alipay.android.msp.core.clients.MspWindowClient;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.framework.exception.MspServerErrorException;
import com.alipay.android.msp.framework.exception.NetErrorException;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.language.LanguageHelper;
import com.alipay.android.msp.pay.results.ResultStatus;
import com.alipay.android.msp.ui.contracts.MspMainContract;
import com.alipay.android.msp.utils.ExceptionUtils;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MspContainerPresenter extends MspBasePresenter<MspMainContract.View> implements MspMainContract.Presenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(MspContainerPresenter mspContainerPresenter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/ui/presenters/MspContainerPresenter");
    }

    @Override // com.alipay.android.msp.ui.presenters.MspBasePresenter, com.alipay.android.msp.ui.contracts.MspBaseContract.IPresenter
    public int getBizId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("14dc0c52", new Object[]{this})).intValue();
        }
        MspMainContract.View iView = getIView();
        if (iView != null) {
            return iView.getBizId();
        }
        return 0;
    }

    @Override // com.alipay.android.msp.ui.presenters.MspBasePresenter, com.alipay.android.msp.ui.contracts.MspBaseContract.IPresenter
    public void exit() {
        MspWindowClient mspWindowClient;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81677ea5", new Object[]{this});
            return;
        }
        LogUtil.i("MspContainerPresenter", "exit", "bizId=" + this.mBizId);
        MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(getBizId());
        if (mspContextByBizId != null && (mspWindowClient = (MspWindowClient) mspContextByBizId.getMspUIClient()) != null) {
            if (mspWindowClient.isStartCashierActivityFromOutAppFailed()) {
                try {
                    LogUtil.w("MspContainerPresenter", "exit", "moveTaskToBack");
                    if (getActivity() != null) {
                        getActivity().moveTaskToBack(true);
                    }
                } catch (Throwable th) {
                    LogUtil.printExceptionStackTrace(th);
                }
            }
            if (getIView() != null) {
                String curTplId = getIView().getCurTplId();
                MspContext mspContextByBizId2 = MspContextManager.getInstance().getMspContextByBizId(getBizId());
                long delayDisposeTime = ((TextUtils.equals(curTplId, MspFlybirdDefine.FLYBIRD_RESULT_TPL) || TextUtils.equals(curTplId, MspFlybirdDefine.FLYBIRD_PAYEND_TPL) || TextUtils.equals(curTplId, MspFlybirdDefine.FLYBIRD_UNIFY_RESULT_TPL)) && mspContextByBizId2 != null) ? mspContextByBizId2.getDelayDisposeTime() : 0L;
                if (delayDisposeTime > 0) {
                    TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.ui.presenters.MspContainerPresenter.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            try {
                                MspContainerPresenter.this.disposeUI();
                            } catch (Throwable th2) {
                                LogUtil.printExceptionStackTrace(th2);
                            }
                        }
                    }, delayDisposeTime);
                } else {
                    TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.ui.presenters.MspContainerPresenter.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                MspContainerPresenter.this.disposeUI();
                            }
                        }
                    });
                }
            }
        }
    }

    @Override // com.alipay.android.msp.ui.presenters.MspBasePresenter, com.alipay.android.msp.ui.contracts.MspBaseContract.IPresenter
    public void onException(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b100829e", new Object[]{this, th});
            return;
        }
        MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(getBizId());
        if (mspContextByBizId != null) {
            if (th == null || getIView() == null) {
                MspWindowClient mspWindowClient = (MspWindowClient) mspContextByBizId.getMspUIClient();
                if (mspWindowClient != null) {
                    mspWindowClient.startContainerPage();
                } else {
                    return;
                }
            }
            LogUtil.printExceptionStackTrace("MspContainerPresenter", "onException", th);
            try {
                if (th instanceof NetErrorException) {
                    mspContextByBizId.getMspNetHandler().setNetError(true);
                    String message = th.getMessage();
                    if (!TextUtils.isEmpty(message)) {
                        if (TextUtils.equals(message, MspNetConstants.NET_SHUTDOWN_TIP)) {
                        }
                        alertNetError(ExceptionUtils.createExceptionMsg(message, ((NetErrorException) th).getStatErrorCode()), mspContextByBizId.getMspNetHandler().getLastSubmitAction());
                    }
                    if (TextUtils.equals(mspContextByBizId.getMspNetHandler().getErrorCode(), String.valueOf(ResultStatus.PAY_NETWORK_ERROR.getStatus()))) {
                        message = LanguageHelper.localizedStringForKey("mini_net_error", getActivity().getString(R.string.mini_net_error), new Object[0]);
                    } else {
                        if (((NetErrorException) th).isClientError()) {
                            message = LanguageHelper.localizedStringForKey("mini_net_error_weak", getActivity().getString(R.string.mini_net_error_weak), new Object[0]);
                        } else {
                            message = LanguageHelper.localizedStringForKey("mini_app_error", getActivity().getString(R.string.mini_app_error), new Object[0]);
                        }
                        MspNetHandler mspNetHandler = mspContextByBizId.getMspNetHandler();
                        StringBuilder sb = new StringBuilder();
                        sb.append(ResultStatus.NETWORK_ERROR.getStatus());
                        mspNetHandler.setNetErrorCode(sb.toString());
                    }
                    alertNetError(ExceptionUtils.createExceptionMsg(message, ((NetErrorException) th).getStatErrorCode()), mspContextByBizId.getMspNetHandler().getLastSubmitAction());
                } else if (th instanceof MspServerErrorException) {
                    mspContextByBizId.getMspNetHandler().setNeedNeec(true);
                    alertServerError(LanguageHelper.localizedStringForKey("mini_server_error", getActivity().getString(R.string.mini_server_error), new Object[0]));
                } else {
                    alertAppError(th);
                }
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
            }
        }
    }
}
