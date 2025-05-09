package com.alipay.android.msp.drivers.actions;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.core.callback.NetActionCallback;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.NetAction;
import com.alipay.android.msp.drivers.actions.UIAction;
import com.alipay.android.msp.drivers.dipatchers.Call;
import com.alipay.android.msp.drivers.dipatchers.Callback;
import com.alipay.android.msp.drivers.dipatchers.MspResponse;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.FastStartActivityHelper;
import com.alipay.android.msp.framework.statisticsv2.StatisticInfo;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.network.model.CustomCallback;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ActionsCreator {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final MspContext f3560a;
    public final Timer b;
    public final Timer c;
    public final boolean d;
    public final boolean e;

    public ActionsCreator(MspContext mspContext) {
        this.f3560a = mspContext;
        Context context = mspContext.getContext();
        boolean z = false;
        boolean z2 = context != null && FastStartActivityHelper.getBoolConfig(context, DrmKey.GRAY_DELAY_TIMER_RUNNABLE);
        this.d = z2;
        if (context != null && FastStartActivityHelper.getBoolConfig(context, DrmKey.GRAY_DELAY_THREAD_RUNNABLE)) {
            z = true;
        }
        this.e = z;
        if (z2) {
            this.b = new Timer("ActionsCreatorTimer:".concat(String.valueOf(mspContext)));
        }
        this.c = new Timer("ActionsCreatorCheckTimer:".concat(String.valueOf(mspContext)));
    }

    public static /* synthetic */ boolean access$000(ActionsCreator actionsCreator, Action action, Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0da7832", new Object[]{actionsCreator, action, callback})).booleanValue();
        }
        return actionsCreator.a(action, callback);
    }

    public static /* synthetic */ MspContext access$100(ActionsCreator actionsCreator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspContext) ipChange.ipc$dispatch("d4ee2124", new Object[]{actionsCreator});
        }
        return actionsCreator.f3560a;
    }

    public static synchronized ActionsCreator get(MspContext mspContext) {
        synchronized (ActionsCreator.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ActionsCreator) ipChange.ipc$dispatch("16f85c23", new Object[]{mspContext});
            }
            if (mspContext.getActionsCreator() == null) {
                mspContext.setActionsCreator(new ActionsCreator(mspContext));
            }
            return mspContext.getActionsCreator();
        }
    }

    public final boolean a(Action action, Callback callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66ab9b3", new Object[]{this, action, callback})).booleanValue();
        }
        if (callback == null) {
            try {
                callback = new Callback() { // from class: com.alipay.android.msp.drivers.actions.ActionsCreator.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alipay.android.msp.drivers.dipatchers.Callback
                    public void onFailure(Call call, Exception exc) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("cf48ae4f", new Object[]{this, call, exc});
                        } else {
                            LogUtil.printExceptionStackTrace("ActionsCreator", "enqueue action callback", exc);
                        }
                    }

                    @Override // com.alipay.android.msp.drivers.dipatchers.Callback
                    public void onResponse(Call call, MspResponse mspResponse) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("46e8ab36", new Object[]{this, call, mspResponse});
                        }
                    }
                };
            } catch (NullPointerException e) {
                LogUtil.printExceptionStackTrace("ActionsCreator", "dispatchActionAsync null", e);
                return false;
            } catch (RejectedExecutionException e2) {
                LogUtil.printExceptionStackTrace("ActionsCreator", "dispatchActionAsync reject", e2);
                return false;
            } catch (Exception e3) {
                LogUtil.printExceptionStackTrace("ActionsCreator", "dispatchActionAsync Exception", e3);
                MspContext mspContext = this.f3560a;
                if (mspContext != null) {
                    StatisticInfo statisticInfo = mspContext.getStatisticInfo();
                    statisticInfo.addError(ErrorType.DEFAULT, "dispatchErr", action.getData().toString() + e3);
                }
                return false;
            }
        }
        this.f3560a.getMspLogicClient().newCall(action).enqueue(callback);
        return true;
    }

    public String createEventActionThisThread(EventAction eventAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2e9f8acc", new Object[]{this, eventAction});
        }
        if (eventAction != null) {
            try {
                eventAction.setStartDispatchTime(SystemClock.elapsedRealtime());
                JSONObject responseBody = this.f3560a.getMspLogicClient().newCall(eventAction).execute().getResponseBody();
                if (responseBody == null || !responseBody.containsKey("result")) {
                    return "";
                }
                return responseBody.getString("result");
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
            }
        } else {
            LogUtil.e("ActionsCreator", "createEventActionThisThread", "eventAction=null");
            this.f3560a.getStatisticInfo().addError(ErrorType.DEFAULT, "eventActionNull", "");
        }
        return "";
    }

    public MspResponse createExceptionAction(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspResponse) ipChange.ipc$dispatch("e7399bb7", new Object[]{this, th});
        }
        DataBundle dataBundle = new DataBundle();
        dataBundle.put(UIAction.DataKeys.exception, th);
        return this.f3560a.getMspLogicClient().newCall(new UIAction(ActionTypes.EXCEPTION, dataBundle)).execute();
    }

    public void createNetRequestAction(String str, String str2, EventAction eventAction, StEvent stEvent, CustomCallback customCallback) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36712a27", new Object[]{this, str, str2, eventAction, stEvent, customCallback});
            return;
        }
        if (!(eventAction.getSubmitType() == EventAction.SubmitType.FirstRequest || eventAction.getSubmitType() == EventAction.SubmitType.FirstRequestAfterPage)) {
            z = false;
        }
        NetAction put = new NetAction(ActionTypes.NET_REQUEST).put(NetAction.DataKeys.contentData, str).put(NetAction.DataKeys.actionJson, str2).put(NetAction.DataKeys.isFirstRequest, Boolean.valueOf(z)).put(NetAction.DataKeys.statistic, stEvent).put(NetAction.DataKeys.callback, customCallback);
        if (eventAction.getSubmitType() != EventAction.SubmitType.FirstRequestAfterPage || TaskHelper.isMainThread()) {
            a(put, new NetActionCallback(this.f3560a));
        } else {
            this.f3560a.getMspLogicClient().newCall(put).execute();
        }
    }

    public boolean createNetRetryRequestAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1baf0649", new Object[]{this})).booleanValue();
        }
        return a(new NetAction(ActionTypes.NET_RETRY), new NetActionCallback(this.f3560a));
    }

    public void createSubmitEventAction(String str, String str2, EventAction.SubmitType submitType, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b02bc71", new Object[]{this, str, str2, submitType, new Integer(i)});
            return;
        }
        EventAction eventAction = new EventAction("submit");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", (Object) str);
        if (submitType == EventAction.SubmitType.FirstRequest || submitType == EventAction.SubmitType.FirstRequestAfterPage) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(MspGlobalDefine.EXTERNAL_INFO, (Object) str2);
            jSONObject.put("params", (Object) jSONObject2);
        } else {
            jSONObject.put("params", (Object) str2);
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("action", (Object) jSONObject.toJSONString());
        eventAction.setActionData(jSONObject3.toJSONString());
        eventAction.setDelayTime(i);
        eventAction.setSubmitType(submitType);
        if (i > 0) {
            get(this.f3560a).createEventAction(eventAction);
        } else {
            createEventActionThisThread(eventAction);
        }
    }

    public MspResponse createUIExitAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspResponse) ipChange.ipc$dispatch("6b732c3d", new Object[]{this});
        }
        return this.f3560a.getMspLogicClient().newCall(new UIAction(ActionTypes.EXIT, new DataBundle())).execute();
    }

    public MspResponse createUIFirstAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspResponse) ipChange.ipc$dispatch("224ba6f", new Object[]{this});
        }
        DataBundle dataBundle = new DataBundle();
        dataBundle.put(UIAction.DataKeys.isFirstEnter, Boolean.TRUE);
        return this.f3560a.getMspLogicClient().newCall(new UIAction(ActionTypes.UI_START, dataBundle)).execute();
    }

    public MspResponse createUIRecoverAction(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspResponse) ipChange.ipc$dispatch("eb322ab7", new Object[]{this, str, str2});
        }
        DataBundle dataBundle = new DataBundle();
        dataBundle.put(UIAction.DataKeys.isFirstEnter, Boolean.FALSE);
        dataBundle.put(UIAction.DataKeys.data, str);
        dataBundle.put(UIAction.DataKeys.action, str2);
        return this.f3560a.getMspLogicClient().newCall(new UIAction(ActionTypes.UI_START, dataBundle)).execute();
    }

    public MspResponse createUIShowAction(JSONObject jSONObject, boolean z, StEvent stEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspResponse) ipChange.ipc$dispatch("3cbecf95", new Object[]{this, jSONObject, new Boolean(z), stEvent});
        }
        if (jSONObject != null) {
            DataBundle dataBundle = new DataBundle();
            dataBundle.put(UIAction.DataKeys.renderData, jSONObject);
            dataBundle.put(UIAction.DataKeys.fromSync, Boolean.valueOf(z));
            dataBundle.put(UIAction.DataKeys.statistic, stEvent);
            return this.f3560a.getMspLogicClient().newCall(new UIAction(ActionTypes.UI_SHOW, dataBundle)).execute();
        }
        throw new IllegalArgumentException("rendData must not be empty");
    }

    public void createDialogEventAction(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b5666fd", new Object[]{this, str});
            return;
        }
        try {
            EventAction createMspEventWithJsonString = MspEventCreator.get().createMspEventWithJsonString("createDialogEventAction", str);
            if (createMspEventWithJsonString != null) {
                createMspEventWithJsonString.setStartDispatchTime(SystemClock.elapsedRealtime());
                createMspEventWithJsonString.setEventFrom("submit");
                EventAction.MspEvent[] mspEvents = createMspEventWithJsonString.getMspEvents();
                if (mspEvents != null) {
                    int length = mspEvents.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        } else if (TextUtils.equals(mspEvents[i].getActionName(), "back")) {
                            EventAction.MspEvent[] mspEventArr = new EventAction.MspEvent[mspEvents.length - 1];
                            boolean z = true;
                            int i2 = 0;
                            for (EventAction.MspEvent mspEvent : mspEvents) {
                                if (!z || !TextUtils.equals(mspEvent.getActionName(), "back")) {
                                    i2++;
                                    mspEventArr[i2] = mspEvent;
                                } else {
                                    z = false;
                                }
                            }
                            createMspEventWithJsonString.setMspEvents(mspEventArr);
                        } else {
                            i++;
                        }
                    }
                }
                if (createMspEventWithJsonString.isDelayEventType()) {
                    createMspEventWithJsonString.setDelayTime(400);
                }
                createEventAction(createMspEventWithJsonString);
            }
        } catch (Exception e) {
            MspContext mspContext = this.f3560a;
            if (mspContext != null) {
                mspContext.getStatisticInfo().addError(ErrorType.DEFAULT, e.getClass().getName(), e);
            }
            LogUtil.printExceptionStackTrace(e);
        }
    }

    public void createEventAction(final EventAction eventAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33b1b6ec", new Object[]{this, eventAction});
        } else if (eventAction != null) {
            int delayTime = eventAction.getDelayTime();
            if (delayTime > 0) {
                LogUtil.i("ActionsCreator", "createEventAction", eventAction.hashCode() + " mDelayTime=" + delayTime);
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                if (this.e) {
                    TaskHelper.getInstance().executeDelayed(new Runnable() { // from class: com.alipay.android.msp.drivers.actions.ActionsCreator.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            LogUtil.i("ActionsCreator", "createEventAction", "threadHandler Runnable=" + eventAction);
                            atomicBoolean.set(true);
                            eventAction.setStartDispatchTime(SystemClock.elapsedRealtime());
                            ActionsCreator.access$000(ActionsCreator.this, eventAction, null);
                        }
                    }, delayTime, TaskHelper.ThreadName.EventAction);
                } else if (this.d) {
                    this.b.schedule(new TimerTask() { // from class: com.alipay.android.msp.drivers.actions.ActionsCreator.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
                            str.hashCode();
                            int hashCode = str.hashCode();
                            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/actions/ActionsCreator$3");
                        }

                        @Override // java.util.TimerTask, java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            LogUtil.i("ActionsCreator", "createEventAction", "timer Runnable=" + eventAction);
                            atomicBoolean.set(true);
                            eventAction.setStartDispatchTime(SystemClock.elapsedRealtime());
                            ActionsCreator.access$000(ActionsCreator.this, eventAction, null);
                        }
                    }, delayTime);
                } else {
                    TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.drivers.actions.ActionsCreator.4
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            LogUtil.i("ActionsCreator", "createEventAction", "schedule Runnable=" + eventAction);
                            atomicBoolean.set(true);
                            eventAction.setStartDispatchTime(SystemClock.elapsedRealtime());
                            ActionsCreator.access$000(ActionsCreator.this, eventAction, null);
                        }
                    }, delayTime);
                }
                this.c.schedule(new TimerTask() { // from class: com.alipay.android.msp.drivers.actions.ActionsCreator.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass5 r2, String str, Object... objArr) {
                        str.hashCode();
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/actions/ActionsCreator$5");
                    }

                    @Override // java.util.TimerTask, java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (!atomicBoolean.get()) {
                            LogUtil.i("ActionsCreator", "createEventAction", "delay check result false");
                            StatisticInfo statisticInfo = ActionsCreator.access$100(ActionsCreator.this).getStatisticInfo();
                            statisticInfo.addError(ErrorType.DEFAULT, "DelayTask", "excDelayTooLong" + eventAction);
                        }
                    }
                }, delayTime * 5);
            } else if (eventAction.getMspEvents() == null || eventAction.getMspEvents().length != 1 || !TextUtils.equals(eventAction.getMspEvents()[0].getActionName(), "submit")) {
                a(eventAction, null);
            } else {
                createEventActionThisThread(eventAction);
            }
        } else {
            LogUtil.e("ActionsCreator", "createEventAction", "eventAction=null");
        }
    }
}
