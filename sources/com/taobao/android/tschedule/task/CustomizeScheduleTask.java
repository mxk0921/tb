package com.taobao.android.tschedule.task;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.taobao.android.tschedule.TScheduleInitialize;
import com.taobao.android.tschedule.task.ScheduleTask;
import com.taobao.android.tschedule.taskcontext.CustomTaskContext;
import com.taobao.android.tscheduleprotocol.CustomScheduleProtocol;
import com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import tb.dms;
import tb.t2o;
import tb.wms;
import tb.zms;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class CustomizeScheduleTask extends ScheduleTask<CustomTaskContext> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TS.CustomizeTask";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$android$tscheduleprotocol$ScheduleProtocolCallback$ScheduleProtocolCallbackType;

        static {
            int[] iArr = new int[ScheduleProtocolCallback.ScheduleProtocolCallbackType.values().length];
            $SwitchMap$com$taobao$android$tscheduleprotocol$ScheduleProtocolCallback$ScheduleProtocolCallbackType = iArr;
            try {
                iArr[ScheduleProtocolCallback.ScheduleProtocolCallbackType.TYPE_HIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$android$tscheduleprotocol$ScheduleProtocolCallback$ScheduleProtocolCallbackType[ScheduleProtocolCallback.ScheduleProtocolCallbackType.TYPE_MISS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$android$tscheduleprotocol$ScheduleProtocolCallback$ScheduleProtocolCallbackType[ScheduleProtocolCallback.ScheduleProtocolCallbackType.TYPE_EXPIRE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$android$tscheduleprotocol$ScheduleProtocolCallback$ScheduleProtocolCallbackType[ScheduleProtocolCallback.ScheduleProtocolCallbackType.TYPE_FULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$taobao$android$tscheduleprotocol$ScheduleProtocolCallback$ScheduleProtocolCallbackType[ScheduleProtocolCallback.ScheduleProtocolCallbackType.TYPE_CLEAR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$taobao$android$tscheduleprotocol$ScheduleProtocolCallback$ScheduleProtocolCallbackType[ScheduleProtocolCallback.ScheduleProtocolCallbackType.TYPE_OUT_OF_SERVICE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    static {
        t2o.a(329252974);
    }

    public CustomizeScheduleTask(String str, CustomTaskContext customTaskContext) {
        super(str, customTaskContext);
        init();
    }

    public static /* synthetic */ String access$000(CustomizeScheduleTask customizeScheduleTask, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4041fbf8", new Object[]{customizeScheduleTask, str});
        }
        return customizeScheduleTask.getUCode(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
        if (r6.equals("TYPE_MISS") == false) goto L_0x0023;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String getUCode(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.tschedule.task.CustomizeScheduleTask.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0018
            java.lang.String r4 = "c3a54a63"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r5
            r2[r0] = r6
            java.lang.Object r6 = r3.ipc$dispatch(r4, r2)
            java.lang.String r6 = (java.lang.String) r6
            return r6
        L_0x0018:
            r6.hashCode()
            r3 = -1
            int r4 = r6.hashCode()
            switch(r4) {
                case -959856524: goto L_0x004f;
                case -959659295: goto L_0x0046;
                case 107585774: goto L_0x003b;
                case 306173160: goto L_0x0030;
                case 970109380: goto L_0x0025;
                default: goto L_0x0023;
            }
        L_0x0023:
            r0 = -1
            goto L_0x0059
        L_0x0025:
            java.lang.String r0 = "TYPE_EXPIRE"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x002e
            goto L_0x0023
        L_0x002e:
            r0 = 4
            goto L_0x0059
        L_0x0030:
            java.lang.String r0 = "TYPE_CLEAR"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0039
            goto L_0x0023
        L_0x0039:
            r0 = 3
            goto L_0x0059
        L_0x003b:
            java.lang.String r0 = "TYPE_HIT"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0044
            goto L_0x0023
        L_0x0044:
            r0 = 2
            goto L_0x0059
        L_0x0046:
            java.lang.String r1 = "TYPE_MISS"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x0059
            goto L_0x0023
        L_0x004f:
            java.lang.String r0 = "TYPE_FULL"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0058
            goto L_0x0023
        L_0x0058:
            r0 = 0
        L_0x0059:
            switch(r0) {
                case 0: goto L_0x006b;
                case 1: goto L_0x0068;
                case 2: goto L_0x0065;
                case 3: goto L_0x0062;
                case 4: goto L_0x005f;
                default: goto L_0x005c;
            }
        L_0x005c:
            java.lang.String r6 = "TS_CUSTOMIZE_OTHER"
            return r6
        L_0x005f:
            java.lang.String r6 = "TS_CUSTOMIZE_EXPIRE"
            return r6
        L_0x0062:
            java.lang.String r6 = "TS_CUSTOMIZE_CLEAR"
            return r6
        L_0x0065:
            java.lang.String r6 = "TS_CUSTOMIZE_HIT"
            return r6
        L_0x0068:
            java.lang.String r6 = "TS_CUSTOMIZE_MISS"
            return r6
        L_0x006b:
            java.lang.String r6 = "TS_CUSTOMIZE_FULL"
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.tschedule.task.CustomizeScheduleTask.getUCode(java.lang.String):java.lang.String");
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        T t = this.taskContext;
        if (t != 0 && ((CustomTaskContext) t).params != null && ((CustomTaskContext) t).params.customParams != null) {
            prepareTaskParams(((CustomTaskContext) t).params.customParams);
        }
    }

    public static /* synthetic */ Object ipc$super(CustomizeScheduleTask customizeScheduleTask, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tschedule/task/CustomizeScheduleTask");
    }

    @Override // com.taobao.android.tschedule.task.ScheduleTask
    public boolean cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("707fe605", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.tschedule.task.ScheduleTask
    public boolean isFinished() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9673ae47", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.tschedule.task.ScheduleTask
    public boolean validate(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("152894ae", new Object[]{this, str, objArr})).booleanValue();
        }
        T t = this.taskContext;
        if (!(t == 0 || ((CustomTaskContext) t).params == null || !zms.b(wms.SWITCH_KEY_ENABLE_TASK_CUSTOM, false))) {
            T t2 = this.taskContext;
            if (((CustomTaskContext) t2).params.classpath != null && ((CustomTaskContext) t2).params.classpath != "") {
                return true;
            }
        }
        return false;
    }

    @Override // com.taobao.android.tschedule.task.ScheduleTask
    public ScheduleTask.THREAD_TYPE workThread() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduleTask.THREAD_TYPE) ipChange.ipc$dispatch("4b063569", new Object[]{this});
        }
        return ScheduleTask.THREAD_TYPE.getType(((CustomTaskContext) this.taskContext).params.workThread);
    }

    public CustomizeScheduleTask(String str, CustomTaskContext customTaskContext, ScheduleProtocolCallback scheduleProtocolCallback) {
        super(str, customTaskContext, scheduleProtocolCallback);
        init();
    }

    @Override // com.taobao.android.tschedule.task.ScheduleTask
    public void realExecute(String str, Object... objArr) {
        final String str2 = ((CustomTaskContext) this.taskContext).params.classpath;
        final long uptimeMillis = SystemClock.uptimeMillis();
        try {
            Class<?> cls = Class.forName(str2);
            Object newInstance = cls.newInstance();
            ScheduleProtocolCallback scheduleProtocolCallback = new ScheduleProtocolCallback() { // from class: com.taobao.android.tschedule.task.CustomizeScheduleTask.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback
                public void onPreload(ScheduleProtocolCallback.ScheduleProtocolCallbackType scheduleProtocolCallbackType, HashMap<String, String> hashMap) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("df1a7672", new Object[]{this, scheduleProtocolCallbackType, hashMap});
                        return;
                    }
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("hit_type", scheduleProtocolCallbackType.name());
                    hashMap2.put("taskType", ((CustomTaskContext) CustomizeScheduleTask.this.taskContext).type);
                    String valueOf = String.valueOf(SystemClock.uptimeMillis() - uptimeMillis);
                    hashMap2.put(HiAnalyticsConstant.BI_KEY_COST_TIME, valueOf);
                    String str3 = (hashMap == null || hashMap.isEmpty()) ? null : hashMap.get(ScheduleProtocolCallback.MERGE_TIME);
                    if (!TextUtils.isEmpty(str3)) {
                        try {
                            long longValue = Long.valueOf(str3).longValue();
                            long j = uptimeMillis;
                            if (longValue >= j) {
                                valueOf = String.valueOf(longValue - j);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    hashMap2.put("save_time", valueOf);
                    String str4 = "";
                    hashMap2.put("params", hashMap == null ? str4 : hashMap.toString());
                    switch (a.$SwitchMap$com$taobao$android$tscheduleprotocol$ScheduleProtocolCallback$ScheduleProtocolCallbackType[scheduleProtocolCallbackType.ordinal()]) {
                        case 1:
                            String str5 = str2;
                            T t = CustomizeScheduleTask.this.taskContext;
                            dms.b("downgrade", str5, ((CustomTaskContext) t).version, "TSchedule", ((CustomTaskContext) t).type, hashMap2);
                            break;
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            String str6 = str2;
                            CustomizeScheduleTask customizeScheduleTask = CustomizeScheduleTask.this;
                            T t2 = customizeScheduleTask.taskContext;
                            String str7 = ((CustomTaskContext) t2).version;
                            String str8 = ((CustomTaskContext) t2).type;
                            String access$000 = CustomizeScheduleTask.access$000(customizeScheduleTask, scheduleProtocolCallbackType.name());
                            if (hashMap != null) {
                                str4 = hashMap.toString();
                            }
                            dms.a("downgrade", str6, str7, "TSchedule", str8, hashMap2, access$000, str4);
                            break;
                    }
                    ScheduleProtocolCallback scheduleProtocolCallback2 = CustomizeScheduleTask.this.taskCallback;
                    if (scheduleProtocolCallback2 != null) {
                        scheduleProtocolCallback2.onPreload(scheduleProtocolCallbackType, hashMap);
                    }
                }

                @Override // com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback
                public boolean resolveParameter(String str3, Map<String, String> map) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return ((Boolean) ipChange.ipc$dispatch("1ba0efdb", new Object[]{this, str3, map})).booleanValue();
                    }
                    return true;
                }

                @Override // com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback
                public boolean resolveType(ScheduleProtocolCallback.ScheduleProtocolCallbackType scheduleProtocolCallbackType) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return ((Boolean) ipChange.ipc$dispatch("8945bdc1", new Object[]{this, scheduleProtocolCallbackType})).booleanValue();
                    }
                    return false;
                }
            };
            CustomTaskContext.CustomParams customParams = ((CustomTaskContext) this.taskContext).params;
            JSONObject jSONObject = customParams.customParams;
            JSONObject jSONObject2 = null;
            r14 = null;
            r14 = null;
            Intent intent = null;
            jSONObject2 = null;
            if (jSONObject != null && !jSONObject.isEmpty()) {
                if (objArr != null && objArr.length > 0) {
                    Object obj = objArr[0];
                    if (obj instanceof Intent) {
                        intent = (Intent) obj;
                    }
                }
                jSONObject2 = parseTaskParams(str, customParams.customParams, customParams.blackList, intent);
            }
            if (newInstance instanceof CustomScheduleProtocol) {
                ((CustomScheduleProtocol) newInstance).preload(TScheduleInitialize.b(), str, scheduleProtocolCallback, jSONObject2, new Object[0]);
                return;
            }
            Method method = cls.getMethod("preload", Context.class, String.class, ScheduleProtocolCallback.class, JSONObject.class, Object[].class);
            if (method != null) {
                method.invoke(newInstance, TScheduleInitialize.b(), str, scheduleProtocolCallback, jSONObject2);
            }
        } catch (Throwable th) {
            T t = this.taskContext;
            dms.a("downgrade", str2, ((CustomTaskContext) t).version, "TSchedule", ((CustomTaskContext) t).type, null, "TS_CUSTOMIZE_EXCEPTION", th.getMessage());
        }
    }
}
