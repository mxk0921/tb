package com.alipay.android.msp.drivers.stores.store;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.template.ITemplateClickCallback;
import com.alipay.android.app.template.JSPlugin;
import com.alipay.android.msp.core.clients.MspUIClient;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.core.frame.MspWindowFrame;
import com.alipay.android.msp.core.frame.MspWindowFrameStack;
import com.alipay.android.msp.core.section.MqpBehavior;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.alipay.android.msp.framework.statistics.userfeedback.UserFeedBackUtil;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.ui.birdnest.render.api.MspRender;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBDocument;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int mBizId;
    public Context mContext;
    public MspContext mMspContext;
    public MspTradeContext mMspTradeContext;
    public MspUIClient mMspUIClient;
    public StEvent mStEvent = new StEvent();

    public LocalEventStore(int i) {
        this.mBizId = i;
        initWithContext();
    }

    public static void invokeCallback(final EventAction eventAction, final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8578879b", new Object[]{eventAction, jSONObject});
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (eventAction == null) {
            LogUtil.record(8, "LocalEventStore:sendToDocument", "eventAction is null");
            return;
        }
        MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(eventAction.getBizId());
        if (mspContextByBizId == null || !mspContextByBizId.isUseSafeJsExecute()) {
            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.drivers.stores.store.LocalEventStore.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    ITemplateClickCallback templateClickCallback = EventAction.this.getTemplateClickCallback();
                    try {
                        if (templateClickCallback != null) {
                            templateClickCallback.onClickCallback(jSONObject.toJSONString());
                            return;
                        }
                        FBDocument invokeDoc = EventAction.this.getInvokeDoc();
                        long invokeFunKey = EventAction.this.getInvokeFunKey();
                        if (invokeFunKey != 0) {
                            JSPlugin.sendNativeResult(invokeDoc, invokeFunKey, jSONObject.toString());
                        }
                    } catch (Throwable th) {
                        LogUtil.printExceptionStackTrace(th);
                    }
                }
            });
            return;
        }
        final ITemplateClickCallback templateClickCallback = eventAction.getTemplateClickCallback();
        if (templateClickCallback != null) {
            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.drivers.stores.store.LocalEventStore.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        ITemplateClickCallback.this.onClickCallback(jSONObject.toJSONString());
                    } catch (Throwable th) {
                        LogUtil.printExceptionStackTrace(th);
                    }
                }
            });
            return;
        }
        try {
            FBDocument invokeDoc = eventAction.getInvokeDoc();
            long invokeFunKey = eventAction.getInvokeFunKey();
            if (invokeFunKey != 0) {
                MspRender.safeSendNativeResult(invokeDoc, invokeFunKey, jSONObject.toString());
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.mContext;
    }

    public void initWithContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db9ebae0", new Object[]{this});
            return;
        }
        MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(this.mBizId);
        this.mMspContext = mspContextByBizId;
        if (mspContextByBizId != null) {
            this.mMspUIClient = mspContextByBizId.getMspUIClient();
            this.mContext = this.mMspContext.getContext();
            MspContext mspContext = this.mMspContext;
            if (mspContext instanceof MspTradeContext) {
                this.mMspTradeContext = (MspTradeContext) mspContext;
            }
        }
    }

    public abstract String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent);

    public final String onstMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        MspWindowFrame mspWindowFrame;
        JSONObject windowData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("92cd172d", new Object[]{this, eventAction, mspEvent});
        }
        if (!(eventAction == null || mspEvent == null || this.mMspContext == null)) {
            try {
                this.mStEvent = new StEvent();
                MspWindowFrameStack windowStack = this.mMspContext.getWindowStack();
                String str = "";
                if (windowStack != null) {
                    mspWindowFrame = windowStack.getTopTplOrNativeFrame();
                    if (mspWindowFrame != null) {
                        int windowType = mspWindowFrame.getWindowType();
                        if (windowType == 11) {
                            str = mspWindowFrame.getTplId();
                        } else if (windowType == 14 && (windowData = mspWindowFrame.getWindowData()) != null) {
                            str = windowData.getString("name");
                        }
                    }
                } else {
                    mspWindowFrame = null;
                }
                String actionName = mspEvent.getActionName();
                if (eventAction.getStartDispatchTime() != 0 && !TextUtils.equals(actionName, "submit")) {
                    this.mStEvent.onStatistic(StEvent.CONVERT_TIME, String.valueOf(SystemClock.elapsedRealtime() - eventAction.getStartDispatchTime()));
                }
                eventAction.setStartExecuteTime(SystemClock.elapsedRealtime());
                this.mStEvent.onStatistic(StEvent.CURRENT_VIEW, str);
                this.mStEvent.onStatistic("actionType", eventAction.getEventFrom());
                this.mStEvent.onStatistic("action", actionName);
                MqpBehavior.getInstance().onCashierCmd(this.mMspContext, mspWindowFrame, mspEvent, eventAction);
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
            }
        }
        String simpleName = getClass().getSimpleName();
        if (!"LogStore".equals(simpleName) && !"FeedbackStore".equals(simpleName)) {
            LogUtil.i(simpleName, "onMspAction", eventAction.hashCode() + " " + eventAction.getType() + " " + JSON.toJSONString(mspEvent));
        }
        String onMspAction = onMspAction(eventAction, mspEvent);
        if (!(mspEvent == null || this.mMspContext == null)) {
            try {
                String actionName2 = mspEvent.getActionName();
                if (eventAction.getStartExecuteTime() != 0 && !TextUtils.equals(actionName2, "submit")) {
                    this.mStEvent.onStatistic(StEvent.PARSE_TIME, String.valueOf(SystemClock.elapsedRealtime() - eventAction.getStartExecuteTime()));
                }
                if (!TextUtils.equals(actionName2, "continue") && !TextUtils.equals(actionName2, "log") && !TextUtils.equals(actionName2, "feedback") && !TextUtils.equals(actionName2, MspEventTypes.ACTION_INVOKE_QR_GEN) && !TextUtils.equals(actionName2, MspEventTypes.ACTION_STRING_DATABASE) && !TextUtils.equals(actionName2, MspEventTypes.ACTION_META_MSP_LOG_ERROR) && !TextUtils.equals(actionName2, MspEventTypes.ACTION_META_MSP_LOG_PERF) && !TextUtils.equals(actionName2, MspEventTypes.ACTION_META_MSP_LOG_COUNT) && !TextUtils.equals(actionName2, MspEventTypes.ACTION_META_MSP_LOG_EVENT) && !TextUtils.equals(actionName2, MspEventTypes.ACTION_TPL_MSG) && !skipActionLog(actionName2, mspEvent)) {
                    this.mMspContext.getStatisticInfo().addEvent(this.mStEvent);
                }
                if (!TextUtils.equals(actionName2, MspEventTypes.ACTION_STRING_BNCB) && !TextUtils.equals(actionName2, "continue") && !TextUtils.equals(actionName2, "log") && !TextUtils.equals(actionName2, MspEventTypes.ACTION_INVOKE_QR_GEN) && !TextUtils.equals(actionName2, MspEventTypes.ACTION_STRING_DATABASE) && !TextUtils.equals(actionName2, MspEventTypes.ACTION_TPL_MSG)) {
                    UserFeedBackUtil.getInstance().setUserFeedBackTag(null);
                }
            } catch (Exception e2) {
                LogUtil.printExceptionStackTrace(e2);
            }
        }
        return onMspAction;
    }

    public boolean skipActionLog(String str, EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3bc008ef", new Object[]{this, str, mspEvent})).booleanValue();
        }
        return false;
    }
}
