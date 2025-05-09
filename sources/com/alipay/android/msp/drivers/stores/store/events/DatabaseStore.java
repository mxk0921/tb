package com.alipay.android.msp.drivers.stores.store.events;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.core.model.MQPBehaviorActionSeqModel;
import com.alipay.android.msp.core.model.MQPBehaviorExperienceModel;
import com.alipay.android.msp.core.model.MQPBehaviorRecordModel;
import com.alipay.android.msp.core.model.MQPBizInfoModel;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.InvokeActionPlugin;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.alipay.android.msp.framework.db.MspDbManager;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.azi;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DatabaseStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public DatabaseStore(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(DatabaseStore databaseStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/events/DatabaseStore");
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(final EventAction eventAction, EventAction.MspEvent mspEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("success", (Object) Boolean.FALSE);
            jSONObject.put("result", (Object) new JSONArray());
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
        final JSONObject actionParamsJson = mspEvent.getActionParamsJson();
        if (actionParamsJson != null) {
            try {
                new JSONArray();
                String string = actionParamsJson.getString("type");
                final String string2 = actionParamsJson.getString("action");
                final String string3 = actionParamsJson.getString("table");
                if (TextUtils.equals(string, azi.CACHE_SQL)) {
                    TaskHelper.executeForAI(new Runnable() { // from class: com.alipay.android.msp.drivers.stores.store.events.DatabaseStore.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            try {
                                String string4 = actionParamsJson.getString(azi.CACHE_SQL);
                                if (TextUtils.equals(string2, "query")) {
                                    if (TextUtils.equals(string3, MspDBHelper.ActionEntry.TABLE_NAME)) {
                                        MspDbManager.getDbManager().queryActionModel(string4, new MspDbManager.MspDBQueryActionCallback() { // from class: com.alipay.android.msp.drivers.stores.store.events.DatabaseStore.1.1
                                            public static volatile transient /* synthetic */ IpChange $ipChange;

                                            @Override // com.alipay.android.msp.framework.db.MspDbManager.MspDBQueryActionCallback
                                            public void onDataLoaded(List<MQPBehaviorActionSeqModel> list) {
                                                IpChange ipChange3 = $ipChange;
                                                if (ipChange3 instanceof IpChange) {
                                                    ipChange3.ipc$dispatch("9835406", new Object[]{this, list});
                                                    return;
                                                }
                                                try {
                                                    jSONObject.put("success", (Object) Boolean.TRUE);
                                                    jSONObject.put("result", JSON.toJSON(list));
                                                } catch (Exception e2) {
                                                    LogUtil.printExceptionStackTrace(e2);
                                                }
                                                AnonymousClass1 r5 = AnonymousClass1.this;
                                                LocalEventStore.invokeCallback(eventAction, jSONObject);
                                            }
                                        });
                                    } else if (TextUtils.equals(string3, MspDBHelper.RecordEntry.TABLE_NAME)) {
                                        MspDbManager.getDbManager().queryRecordModel(string4, new MspDbManager.MspDBQueryRecordCallback() { // from class: com.alipay.android.msp.drivers.stores.store.events.DatabaseStore.1.2
                                            public static volatile transient /* synthetic */ IpChange $ipChange;

                                            @Override // com.alipay.android.msp.framework.db.MspDbManager.MspDBQueryRecordCallback
                                            public void onDataLoaded(List<MQPBehaviorRecordModel> list) {
                                                IpChange ipChange3 = $ipChange;
                                                if (ipChange3 instanceof IpChange) {
                                                    ipChange3.ipc$dispatch("9835406", new Object[]{this, list});
                                                    return;
                                                }
                                                try {
                                                    jSONObject.put("success", (Object) Boolean.TRUE);
                                                    jSONObject.put("result", JSON.toJSON(list));
                                                } catch (Exception e2) {
                                                    LogUtil.printExceptionStackTrace(e2);
                                                }
                                                AnonymousClass1 r5 = AnonymousClass1.this;
                                                LocalEventStore.invokeCallback(eventAction, jSONObject);
                                            }
                                        });
                                    } else if (TextUtils.equals(string3, MspDBHelper.BizEntry.TABLE_NAME)) {
                                        MspDbManager.getDbManager().queryBizInfoModel(string4, new MspDbManager.MspDBQueryBizInfoCallback() { // from class: com.alipay.android.msp.drivers.stores.store.events.DatabaseStore.1.3
                                            public static volatile transient /* synthetic */ IpChange $ipChange;

                                            @Override // com.alipay.android.msp.framework.db.MspDbManager.MspDBQueryBizInfoCallback
                                            public void onDataLoaded(List<MQPBizInfoModel> list) {
                                                IpChange ipChange3 = $ipChange;
                                                if (ipChange3 instanceof IpChange) {
                                                    ipChange3.ipc$dispatch("9835406", new Object[]{this, list});
                                                    return;
                                                }
                                                try {
                                                    jSONObject.put("success", (Object) Boolean.TRUE);
                                                    jSONObject.put("result", JSON.toJSON(list));
                                                } catch (Exception e2) {
                                                    LogUtil.printExceptionStackTrace(e2);
                                                }
                                                AnonymousClass1 r5 = AnonymousClass1.this;
                                                LocalEventStore.invokeCallback(eventAction, jSONObject);
                                            }
                                        });
                                    } else if (TextUtils.equals(string3, MspDBHelper.BehaviorExperienceEntry.TABLE_NAME)) {
                                        MspDbManager.getDbManager().queryBehaviorExperienceModel(string4, new MspDbManager.MspDBQueryBehaviorExperienceCallback() { // from class: com.alipay.android.msp.drivers.stores.store.events.DatabaseStore.1.4
                                            public static volatile transient /* synthetic */ IpChange $ipChange;

                                            @Override // com.alipay.android.msp.framework.db.MspDbManager.MspDBQueryBehaviorExperienceCallback
                                            public void onDataLoaded(List<MQPBehaviorExperienceModel> list) {
                                                IpChange ipChange3 = $ipChange;
                                                if (ipChange3 instanceof IpChange) {
                                                    ipChange3.ipc$dispatch("9835406", new Object[]{this, list});
                                                    return;
                                                }
                                                try {
                                                    jSONObject.put("success", (Object) Boolean.TRUE);
                                                    jSONObject.put("result", JSON.toJSON(list));
                                                } catch (Exception e2) {
                                                    LogUtil.printExceptionStackTrace(e2);
                                                }
                                                AnonymousClass1 r5 = AnonymousClass1.this;
                                                LocalEventStore.invokeCallback(eventAction, jSONObject);
                                            }
                                        });
                                    }
                                } else if (TextUtils.equals(string2, "update")) {
                                    MspDbManager.getDbManager().save(string4, new MspDbManager.MspDBSaveCallback() { // from class: com.alipay.android.msp.drivers.stores.store.events.DatabaseStore.1.5
                                        public static volatile transient /* synthetic */ IpChange $ipChange;

                                        @Override // com.alipay.android.msp.framework.db.MspDbManager.MspDBSaveCallback
                                        public void onDataSaveError(Throwable th) {
                                            IpChange ipChange3 = $ipChange;
                                            if (ipChange3 instanceof IpChange) {
                                                ipChange3.ipc$dispatch("6236d1ac", new Object[]{this, th});
                                                return;
                                            }
                                            try {
                                                jSONObject.put("success", (Object) Boolean.FALSE);
                                                jSONObject.put("result", (Object) new JSONArray());
                                            } catch (Exception e2) {
                                                LogUtil.printExceptionStackTrace(e2);
                                            }
                                            AnonymousClass1 r5 = AnonymousClass1.this;
                                            LocalEventStore.invokeCallback(eventAction, jSONObject);
                                        }

                                        @Override // com.alipay.android.msp.framework.db.MspDbManager.MspDBSaveCallback
                                        public void onDataSaveSuccess() {
                                            IpChange ipChange3 = $ipChange;
                                            if (ipChange3 instanceof IpChange) {
                                                ipChange3.ipc$dispatch("e809a7e4", new Object[]{this});
                                                return;
                                            }
                                            try {
                                                jSONObject.put("success", (Object) Boolean.TRUE);
                                                jSONObject.put("result", (Object) new JSONArray());
                                            } catch (Exception e2) {
                                                LogUtil.printExceptionStackTrace(e2);
                                            }
                                            AnonymousClass1 r0 = AnonymousClass1.this;
                                            LocalEventStore.invokeCallback(eventAction, jSONObject);
                                        }
                                    });
                                } else if (TextUtils.equals(string2, "log")) {
                                    LogUtil.record(2, "DatabaseStoreLog", actionParamsJson.getString(azi.CACHE_SQL));
                                }
                            } catch (Throwable th) {
                                LogUtil.printExceptionStackTrace(th);
                                StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.WARNING, "", th);
                            }
                        }
                    });
                    return InvokeActionPlugin.AYSNC_CALLBACK;
                } else if (!TextUtils.equals(string, "orm")) {
                    return InvokeActionPlugin.AYSNC_CALLBACK;
                } else {
                    actionParamsJson.getString("orm");
                    return InvokeActionPlugin.AYSNC_CALLBACK;
                }
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
        return jSONObject.toString();
    }
}
