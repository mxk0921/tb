package com.alipay.android.msp.drivers.stores.store.events;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.template.FBContext;
import com.alipay.android.msp.core.clients.MspUIClient;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.frame.MspWindowFrame;
import com.alipay.android.msp.core.frame.MspWindowFrameStack;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.plugin.manager.PluginManager;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.Utils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class SendChannelDataStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final FBContext.JsExecOptions f3576a = FBContext.JsExecOptions.create().setAsyncMode(1).setCallbackMode(0).setBlockTimeoutMs(10000);

    public SendChannelDataStore(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(SendChannelDataStore sendChannelDataStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/events/SendChannelDataStore");
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        MspUIClient mspUIClient;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        if (this.mMspContext == null || (mspUIClient = this.mMspUIClient) == null || mspUIClient.getCurrentPresenter() == null) {
            return null;
        }
        MspWindowFrameStack frameStack = this.mMspUIClient.getFrameStack();
        JSONObject actionParamsJson = mspEvent.getActionParamsJson();
        if (actionParamsJson == null) {
            return null;
        }
        final JSONObject jSONObject = actionParamsJson.getJSONObject("targetData");
        final MspWindowFrame mspWindowFrameViaHash = frameStack.getMspWindowFrameViaHash(actionParamsJson.getString("target"));
        if (mspWindowFrameViaHash == null) {
            mspWindowFrameViaHash = frameStack.getTopTplFrame();
        }
        if (mspWindowFrameViaHash == null) {
            return null;
        }
        MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(mspWindowFrameViaHash.getBizId());
        if (mspContextByBizId == null || !mspContextByBizId.isUseSafeJsExecute()) {
            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.drivers.stores.store.events.SendChannelDataStore.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        FBContext fbContextFromView = PluginManager.getRender().getFbContextFromView(mspWindowFrameViaHash.getContentView());
                        if (fbContextFromView != null) {
                            String str = "document.onChannelData&&document.onChannelData('" + Utils.toJsJsonString(jSONObject.toJSONString()) + "')";
                            LogUtil.record(2, "SendDataChannelStore", "string=" + str + ", result = " + fbContextFromView.executeJs(str));
                            return;
                        }
                        LogUtil.record(8, "SendDataChannelStore", "fbContext is null");
                    } catch (Throwable th) {
                        LogUtil.printExceptionStackTrace(th);
                    }
                }
            });
            return "";
        }
        try {
            FBContext fbContextFromView = PluginManager.getRender().getFbContextFromView(mspWindowFrameViaHash.getContentView());
            if (fbContextFromView != null) {
                fbContextFromView.safeExecuteJs("document.onChannelData&&document.onChannelData('" + Utils.toJsJsonString(jSONObject.toJSONString()) + "')", f3576a, null);
            } else {
                LogUtil.record(8, "SendDataChannelStore", "fbContext is null");
            }
            return "";
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return "";
        }
    }
}
