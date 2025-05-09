package com.alipay.android.msp.drivers.stores.storecenter;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.framework.drm.FastStartActivityHelper;
import com.alipay.android.msp.framework.statistics.userfeedback.UserFeedBackUtil;
import com.alipay.android.msp.framework.statisticsv2.StatisticInfo;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.utils.JsonUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.Utils;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBDocument;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class StoreCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public JSONObject deprecatedAPIConfig;
    public int mBizId;
    public MspContext mMspContext;
    public HashMap<String, LocalEventStore> mPluginsMap = new HashMap<>();

    public StoreCenter(MspContext mspContext) {
        this.mBizId = mspContext.getBizId();
        this.mMspContext = mspContext;
        this.deprecatedAPIConfig = FastStartActivityHelper.getJsonConfig(mspContext.getContext(), DrmKey.DEPRECATED_API);
    }

    public void cleanJsPlugin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5be5a94c", new Object[]{this});
            return;
        }
        HashMap<String, LocalEventStore> hashMap = this.mPluginsMap;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void doCleanBeforeWindowChange(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a08f7f", new Object[]{this, new Integer(i)});
        }
    }

    public LocalEventStore getJsPlugin(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocalEventStore) ipChange.ipc$dispatch("af8751cd", new Object[]{this, str});
        }
        return this.mPluginsMap.get(str);
    }

    public abstract String handleAction(EventAction eventAction);

    public void registerJSPlugin(String str, LocalEventStore localEventStore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("564e61ea", new Object[]{this, str, localEventStore});
        } else if (!TextUtils.isEmpty(str)) {
            if (localEventStore == null && !TextUtils.equals(str, "showLoading") && !TextUtils.equals(str, "hideLoading")) {
                return;
            }
            if (localEventStore == null || !a(str, localEventStore.getContext())) {
                this.mPluginsMap.put(str, localEventStore);
            }
        }
    }

    public final boolean a(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6e7fbda", new Object[]{this, str, context})).booleanValue();
        }
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = this.deprecatedAPIConfig;
                if (jSONObject != null) {
                    String string = jSONObject.getString(str);
                    if (!TextUtils.isEmpty(string)) {
                        boolean procGraySwitchWithRate = DrmManager.getInstance(context).procGraySwitchWithRate(context, Integer.parseInt(string));
                        LogUtil.record(2, "isDeprecatedApi", "apiName=" + str + " isDeprecatedApi=" + procGraySwitchWithRate);
                        return procGraySwitchWithRate;
                    }
                }
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
            }
        }
        return false;
    }

    public void interceptForStatistics(EventAction eventAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("398e3742", new Object[]{this, eventAction});
            return;
        }
        if (this.mMspContext == null) {
            this.mMspContext = MspContextManager.getInstance().getMspContextByBizId(this.mBizId);
        }
        if (eventAction != null && this.mMspContext != null) {
            try {
                EventAction.MspEvent[] mspEvents = eventAction.getMspEvents();
                if (mspEvents != null && mspEvents.length > 0) {
                    for (EventAction.MspEvent mspEvent : mspEvents) {
                        if (!TextUtils.equals(mspEvent.getActionName(), MspEventTypes.ACTION_STRING_BNCB) && !TextUtils.equals(mspEvent.getActionName(), "continue") && !TextUtils.equals(mspEvent.getActionName(), "log") && !TextUtils.equals(mspEvent.getActionName(), MspEventTypes.ACTION_INVOKE_QR_GEN)) {
                            UserFeedBackUtil.getInstance().setUserFeedBackTag(null);
                        }
                    }
                }
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
            }
        }
    }

    @Deprecated
    public boolean isWholeEventGoDyApi(EventAction eventAction, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ca46824", new Object[]{this, eventAction, context})).booleanValue();
        }
        MspContext mspContext = this.mMspContext;
        boolean z = mspContext != null && mspContext.isGrayNative2Dyapi();
        EventAction.MspEvent[] mspEvents = eventAction.getMspEvents();
        if (mspEvents != null && context != null && z && !TextUtils.equals(eventAction.getEventFrom(), "invoke") && !TextUtils.equals(eventAction.getEventFrom(), "submit") && mspEvents.length > 1) {
            String actionData = eventAction.getActionData();
            if (!TextUtils.isEmpty(actionData) && actionData.contains(";loc")) {
                return true;
            }
        }
        return false;
    }

    public boolean isActionNameSupported(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d38bc98", new Object[]{this, str})).booleanValue();
        }
        LogUtil.record(2, "StoreCenter:isActionNameSupported", "pluginName-".concat(String.valueOf(str)));
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith("loc:")) {
            str = str.substring(4);
        }
        if (str.startsWith("alias-")) {
            str = str.substring(6);
        }
        if (this.mPluginsMap.containsKey(str)) {
            return true;
        }
        if (JsonUtil.isJsonObjectString(str)) {
            for (String str2 : this.mPluginsMap.keySet()) {
                if (str.contains(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Deprecated
    public boolean isSingleEventGoDyApi(EventAction eventAction, EventAction.MspEvent mspEvent, Context context) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa7f74e", new Object[]{this, eventAction, mspEvent, context})).booleanValue();
        }
        MspContext mspContext = this.mMspContext;
        if (mspContext == null || !mspContext.isGrayNative2Dyapi()) {
            z = false;
        }
        if (eventAction.getMspEvents() != null && context != null && z && !TextUtils.equals(eventAction.getEventFrom(), "invoke") && !TextUtils.equals(eventAction.getEventFrom(), "submit")) {
            String actionName = mspEvent.getActionName();
            if (TextUtils.isEmpty(actionName)) {
                return false;
            }
            try {
                JSONObject drmValueFromKey = DrmManager.getInstance(context).getDrmValueFromKey("gray_dynamic_api");
                if (drmValueFromKey != null) {
                    String string = drmValueFromKey.getString(actionName);
                    if (!TextUtils.isEmpty(string)) {
                        boolean procGraySwitchWithRate = DrmManager.getInstance(context).procGraySwitchWithRate(context, Integer.parseInt(string));
                        LogUtil.record(2, "StoreCenter:needCastActionToDoc", "name=" + actionName + " needCastActionToDoc=" + procGraySwitchWithRate);
                        return procGraySwitchWithRate;
                    }
                }
            } catch (JSONException e) {
                LogUtil.printExceptionStackTrace(e);
            }
        }
        return false;
    }

    public boolean handleDyApi(final EventAction eventAction, EventAction.MspEvent mspEvent) {
        final StEvent stEvent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3f197ba", new Object[]{this, eventAction, mspEvent})).booleanValue();
        }
        if (this.mMspContext.getWorkerServiceDoc() != null) {
            try {
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                final JSONObject jSONObject = new JSONObject();
                if (mspEvent == null) {
                    StEvent stEvent2 = new StEvent("", "workService", "exeEvent_actionData");
                    JSONObject parseObject = JSON.parseObject(eventAction.getActionData());
                    if (parseObject != null && !parseObject.containsKey("action")) {
                        jSONObject.put("action", (Object) parseObject);
                    } else if (parseObject != null && parseObject.containsKey("action")) {
                        jSONObject = parseObject;
                    }
                    stEvent = stEvent2;
                } else {
                    stEvent = new StEvent("", "workService", "exeEvent_" + mspEvent.getActionName());
                    JSONObject jSONObject2 = new JSONObject();
                    String str = "loc:" + mspEvent.getActionName();
                    if (mspEvent.getActionParamsArray() != null) {
                        String[] actionParamsArray = mspEvent.getActionParamsArray();
                        StringBuilder sb = new StringBuilder("loc:");
                        sb.append(mspEvent.getActionName());
                        sb.append(f7l.BRACKET_START_STR);
                        for (int i = 0; i < actionParamsArray.length; i++) {
                            if (i != actionParamsArray.length - 1) {
                                sb.append("'");
                                sb.append(actionParamsArray[i]);
                                sb.append("',");
                            } else {
                                sb.append("'");
                                sb.append(actionParamsArray[i]);
                                sb.append("')");
                            }
                        }
                        str = sb.toString();
                    }
                    if (mspEvent.getActionParamsJson() != null) {
                        jSONObject2.put("params", (Object) mspEvent.getActionParamsJson());
                    }
                    jSONObject2.put("name", (Object) str);
                    jSONObject.put("action", (Object) jSONObject2);
                }
                this.mMspContext.getStatisticInfo().addEvent(stEvent);
                LogUtil.record(2, "getWorkerServiceDoc", "getActionData=" + eventAction.getActionData() + ",  action=" + jSONObject.toJSONString());
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                final AtomicReference atomicReference = new AtomicReference();
                TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.drivers.stores.storecenter.StoreCenter.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        boolean z = false;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        try {
                            FBDocument workerServiceDoc = StoreCenter.this.mMspContext.getWorkerServiceDoc();
                            if (workerServiceDoc != null) {
                                int executeJs = workerServiceDoc.executeJs("document.submit&&document.submit(" + jSONObject.toJSONString() + ");");
                                stEvent.onStatistic(StEvent.CONVERT_TIME, String.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                                if (executeJs != 0) {
                                    StatisticInfo statisticInfo = StoreCenter.this.mMspContext.getStatisticInfo();
                                    if (!StoreCenter.this.mMspContext.isExit()) {
                                        statisticInfo.addError(ErrorType.DEFAULT, "event_dyapi_error", String.valueOf(executeJs) + "action=" + jSONObject.toJSONString());
                                    }
                                } else {
                                    z = true;
                                }
                                LogUtil.record(2, "getWorkerServiceDoc", "res=".concat(String.valueOf(executeJs)));
                            } else if (!StoreCenter.this.mMspContext.isExit()) {
                                StoreCenter.this.mMspContext.getStatisticInfo().addError("np", "event_no_main_service", Utils.truncateString(eventAction.getActionData(), 30));
                            }
                        } catch (Exception e) {
                            LogUtil.printExceptionStackTrace(e);
                            StoreCenter.this.mMspContext.getStatisticInfo().addError(ErrorType.DEFAULT, "event_dyapi_error", e);
                        }
                        try {
                            atomicReference.set(Boolean.valueOf(z));
                        } finally {
                            countDownLatch.countDown();
                        }
                    }
                });
                if (countDownLatch.await(6L, TimeUnit.SECONDS)) {
                    return ((Boolean) atomicReference.get()).booleanValue();
                }
                this.mMspContext.getStatisticInfo().addError(ErrorType.DEFAULT, "event_dyapi_timeout", Utils.truncateString(eventAction.getActionData(), 30));
                return false;
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
                this.mMspContext.getStatisticInfo().addError(ErrorType.DEFAULT, "event_dyapi_error", e);
                return false;
            }
        } else {
            LogUtil.record(2, "getWorkerServiceDoc", "getActionData=" + eventAction.getActionData());
            if (this.mMspContext.isExit()) {
                return false;
            }
            this.mMspContext.getStatisticInfo().addError("np", "event_no_main_service", Utils.truncateString(eventAction.getActionData(), 30));
            return false;
        }
    }
}
