package com.alipay.android.msp.drivers.stores.store.events;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.clients.MspUIClient;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.drivers.actions.ActionsCreator;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.InvokeActionPlugin;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.ui.contracts.MspBaseContract;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.ui.views.MspWebActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class RedoStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public RedoStore(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(RedoStore redoStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/events/RedoStore");
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        MspContext mspContext = this.mMspContext;
        if (mspContext == null) {
            return null;
        }
        MspBasePresenter mspBasePresenter = mspContext.getMspBasePresenter();
        if (this.mMspContext.getMspNetHandler().isGraySyncRenderSupport() || !this.mMspContext.getMspNetHandler().hasSyncPayResult()) {
            String[] actionParamsArray = mspEvent.getActionParamsArray();
            MspBaseContract.IView iView = mspBasePresenter != null ? mspBasePresenter.getIView() : null;
            if (actionParamsArray != null && actionParamsArray.length > 0) {
                JSONObject parseObject = JSON.parseObject(actionParamsArray[0]);
                String string = parseObject.getString("loadstyle");
                if (parseObject.containsKey(MspWebActivity.LOADTXT)) {
                    String string2 = parseObject.getString(MspWebActivity.LOADTXT);
                    if (!TextUtils.isEmpty(string2) && iView != null) {
                        if (TextUtils.equals(string, InvokeActionPlugin.SHOW_LOADING_STYLE_PLAIN)) {
                            iView.showCusLoadingView(string2);
                        } else {
                            iView.showLoadingView(string2);
                        }
                    }
                } else if (iView != null) {
                    if (TextUtils.equals(string, InvokeActionPlugin.SHOW_LOADING_STYLE_PLAIN)) {
                        iView.showCusLoadingView("");
                    } else {
                        iView.showLoadingView(new String[0]);
                    }
                }
            } else if (iView != null) {
                mspBasePresenter.getIView().showLoadingView(new String[0]);
            }
            if (iView != null) {
                iView.addMaskView();
            }
            ActionsCreator.get(this.mMspContext).createNetRetryRequestAction();
            MspUIClient mspUIClient = this.mMspUIClient;
            if (mspUIClient != null) {
                mspUIClient.showPrePageLoading();
            }
        } else if (!this.mMspContext.getMspNetHandler().isShowSyncPayResult()) {
            this.mMspContext.getMspNetHandler().showSyncPayResultView(false);
        }
        return null;
    }
}
