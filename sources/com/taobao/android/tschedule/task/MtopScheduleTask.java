package com.taobao.android.tschedule.task;

import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.task.ScheduleTask;
import com.taobao.android.tschedule.taskcontext.MtopTaskContext;
import com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import java.util.ArrayList;
import java.util.HashMap;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.JsonTypeEnum;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.MtopPrefetch;
import tb.cns;
import tb.dms;
import tb.q12;
import tb.t2o;
import tb.wms;
import tb.zms;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class MtopScheduleTask extends ScheduleTask<MtopTaskContext> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long COMMIT_FAILURE_TIME_OUT = 3000;
    private static final String TAG = "TS.mtop";
    private long lastFailureCommit = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class TScheduleMtopListener implements IRemoteBaseListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public long mtopFinishTime = -1;
        public String requestId;
        public String targetUrl;

        static {
            t2o.a(329252981);
            t2o.a(589299719);
        }

        public TScheduleMtopListener(String str, String str2) {
            this.targetUrl = str;
            this.requestId = str2;
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            this.mtopFinishTime = SystemClock.uptimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("url", cns.c(this.targetUrl));
            hashMap.put("fullUrl", this.targetUrl);
            hashMap.put("requestId", this.requestId);
            dms.a("downgrade", mtopResponse.getApi(), mtopResponse.getV(), "TSchedule", "mtop_response", hashMap, "onError", null);
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                return;
            }
            this.mtopFinishTime = SystemClock.uptimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("url", cns.c(this.targetUrl));
            hashMap.put("fullUrl", this.targetUrl);
            hashMap.put("requestId", this.requestId);
            dms.b("downgrade", mtopResponse.getApi(), mtopResponse.getV(), "TSchedule", "mtop_response", hashMap);
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            this.mtopFinishTime = SystemClock.uptimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("url", cns.c(this.targetUrl));
            hashMap.put("fullUrl", this.targetUrl);
            hashMap.put("requestId", this.requestId);
            dms.a("downgrade", mtopResponse.getApi(), mtopResponse.getV(), "TSchedule", "mtop_response", hashMap, "onSystemError", null);
        }
    }

    static {
        t2o.a(329252979);
    }

    public MtopScheduleTask(String str, MtopTaskContext mtopTaskContext) {
        super(str, mtopTaskContext);
        init();
    }

    public static /* synthetic */ long access$000(MtopScheduleTask mtopScheduleTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("306946e3", new Object[]{mtopScheduleTask})).longValue();
        }
        return mtopScheduleTask.lastFailureCommit;
    }

    public static /* synthetic */ long access$002(MtopScheduleTask mtopScheduleTask, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f69a3be7", new Object[]{mtopScheduleTask, new Long(j)})).longValue();
        }
        mtopScheduleTask.lastFailureCommit = j;
        return j;
    }

    public static /* synthetic */ String access$100(MtopScheduleTask mtopScheduleTask, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("108f2666", new Object[]{mtopScheduleTask, str});
        }
        return mtopScheduleTask.getUCode(str);
    }

    public static /* synthetic */ ScheduleProtocolCallback.ScheduleProtocolCallbackType access$200(MtopScheduleTask mtopScheduleTask, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduleProtocolCallback.ScheduleProtocolCallbackType) ipChange.ipc$dispatch("2198322b", new Object[]{mtopScheduleTask, str});
        }
        return mtopScheduleTask.getCallbackType(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
        if (r6.equals("TYPE_MISS") == false) goto L_0x0023;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback.ScheduleProtocolCallbackType getCallbackType(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.tschedule.task.MtopScheduleTask.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0018
            java.lang.String r4 = "fb0616e0"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r5
            r2[r0] = r6
            java.lang.Object r6 = r3.ipc$dispatch(r4, r2)
            com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback$ScheduleProtocolCallbackType r6 = (com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback.ScheduleProtocolCallbackType) r6
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
            com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback$ScheduleProtocolCallbackType r6 = com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback.ScheduleProtocolCallbackType.TYPE_MISS
            return r6
        L_0x005f:
            com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback$ScheduleProtocolCallbackType r6 = com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback.ScheduleProtocolCallbackType.TYPE_EXPIRE
            return r6
        L_0x0062:
            com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback$ScheduleProtocolCallbackType r6 = com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback.ScheduleProtocolCallbackType.TYPE_CLEAR
            return r6
        L_0x0065:
            com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback$ScheduleProtocolCallbackType r6 = com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback.ScheduleProtocolCallbackType.TYPE_HIT
            return r6
        L_0x0068:
            com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback$ScheduleProtocolCallbackType r6 = com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback.ScheduleProtocolCallbackType.TYPE_MISS
            return r6
        L_0x006b:
            com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback$ScheduleProtocolCallbackType r6 = com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback.ScheduleProtocolCallbackType.TYPE_FULL
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.tschedule.task.MtopScheduleTask.getCallbackType(java.lang.String):com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback$ScheduleProtocolCallbackType");
    }

    private JsonTypeEnum getJsonType(String str) {
        JsonTypeEnum[] values;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JsonTypeEnum) ipChange.ipc$dispatch("a20c6738", new Object[]{this, str});
        }
        for (JsonTypeEnum jsonTypeEnum : JsonTypeEnum.values()) {
            if (TextUtils.equals(str, jsonTypeEnum.getJsonType())) {
                return jsonTypeEnum;
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
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
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.tschedule.task.MtopScheduleTask.$ipChange
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
                case -959856524: goto L_0x005a;
                case -959659295: goto L_0x0051;
                case 107585774: goto L_0x0046;
                case 306173160: goto L_0x003b;
                case 315212499: goto L_0x0030;
                case 970109380: goto L_0x0025;
                default: goto L_0x0023;
            }
        L_0x0023:
            r0 = -1
            goto L_0x0064
        L_0x0025:
            java.lang.String r0 = "TYPE_EXPIRE"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x002e
            goto L_0x0023
        L_0x002e:
            r0 = 5
            goto L_0x0064
        L_0x0030:
            java.lang.String r0 = "TYPE_MERGE"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0039
            goto L_0x0023
        L_0x0039:
            r0 = 4
            goto L_0x0064
        L_0x003b:
            java.lang.String r0 = "TYPE_CLEAR"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0044
            goto L_0x0023
        L_0x0044:
            r0 = 3
            goto L_0x0064
        L_0x0046:
            java.lang.String r0 = "TYPE_HIT"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x004f
            goto L_0x0023
        L_0x004f:
            r0 = 2
            goto L_0x0064
        L_0x0051:
            java.lang.String r1 = "TYPE_MISS"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x0064
            goto L_0x0023
        L_0x005a:
            java.lang.String r0 = "TYPE_FULL"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0063
            goto L_0x0023
        L_0x0063:
            r0 = 0
        L_0x0064:
            switch(r0) {
                case 0: goto L_0x0079;
                case 1: goto L_0x0076;
                case 2: goto L_0x0073;
                case 3: goto L_0x0070;
                case 4: goto L_0x006d;
                case 5: goto L_0x006a;
                default: goto L_0x0067;
            }
        L_0x0067:
            java.lang.String r6 = "TS_MTOP_OTHER"
            return r6
        L_0x006a:
            java.lang.String r6 = "TS_MTOP_EXPIRE"
            return r6
        L_0x006d:
            java.lang.String r6 = "TS_MTOP_MERGE"
            return r6
        L_0x0070:
            java.lang.String r6 = "TS_MTOP_CLEAR"
            return r6
        L_0x0073:
            java.lang.String r6 = "TS_MTOP_HIT"
            return r6
        L_0x0076:
            java.lang.String r6 = "TS_MTOP_MISS"
            return r6
        L_0x0079:
            java.lang.String r6 = "TS_MTOP_FULL"
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.tschedule.task.MtopScheduleTask.getUCode(java.lang.String):java.lang.String");
    }

    public static /* synthetic */ Object ipc$super(MtopScheduleTask mtopScheduleTask, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tschedule/task/MtopScheduleTask");
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
    public ScheduleTask.THREAD_TYPE workThread() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScheduleTask.THREAD_TYPE) ipChange.ipc$dispatch("4b063569", new Object[]{this});
        }
        return ScheduleTask.THREAD_TYPE.getType(((MtopTaskContext) this.taskContext).params.workThread);
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        T t = this.taskContext;
        if (t != 0 && ((MtopTaskContext) t).params != null) {
            MtopTaskContext.MtopTaskParams mtopTaskParams = ((MtopTaskContext) t).params;
            if (mtopTaskParams.apiParams != null) {
                prepareTaskParams(((MtopTaskContext) t).params.apiParams);
            }
            if (mtopTaskParams.mtopIgnore == null) {
                mtopTaskParams.mtopIgnore = new ArrayList(1);
            }
            mtopTaskParams.mtopIgnore.add("prefetch");
        }
    }

    @Override // com.taobao.android.tschedule.task.ScheduleTask
    public boolean validate(String str, Object... objArr) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("152894ae", new Object[]{this, str, objArr})).booleanValue();
        }
        T t = this.taskContext;
        if (t == 0 || ((MtopTaskContext) t).params == null || !zms.b(wms.SWITCH_KEY_ENABLE_TASK_MTOP, false) || TextUtils.isEmpty(((MtopTaskContext) this.taskContext).params.api) || TextUtils.isEmpty(((MtopTaskContext) this.taskContext).params.version) || TextUtils.isEmpty(str) || str.contains("hybrid=true")) {
            z = false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("url", cns.c(str));
        hashMap.put("fullUrl", str);
        if (z) {
            T t2 = this.taskContext;
            dms.b("downgrade", ((MtopTaskContext) t2).params.api, ((MtopTaskContext) t2).params.version, "TSchedule", "mtop_validate", hashMap);
        } else {
            T t3 = this.taskContext;
            if (t3 == 0 || ((MtopTaskContext) t3).params == null) {
                dms.a("downgrade", "", "", "TSchedule", "mtop_validate", hashMap, "TS_MTOP_INVALIDATE", null);
            } else {
                dms.a("downgrade", ((MtopTaskContext) t3).params.api, ((MtopTaskContext) t3).params.version, "TSchedule", "mtop_validate", hashMap, "TS_MTOP_INVALIDATE", null);
            }
        }
        return z;
    }

    public MtopScheduleTask(String str, MtopTaskContext mtopTaskContext, ScheduleProtocolCallback scheduleProtocolCallback) {
        super(str, mtopTaskContext, scheduleProtocolCallback);
        init();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006f A[Catch: all -> 0x0065, TryCatch #0 {all -> 0x0065, blocks: (B:7:0x0029, B:10:0x004f, B:13:0x0057, B:15:0x005a, B:17:0x0060, B:21:0x006b, B:23:0x006f, B:24:0x008a, B:26:0x00a0, B:28:0x00b5, B:30:0x00cf, B:32:0x00da, B:33:0x00dd, B:34:0x00df, B:35:0x00e2, B:37:0x00ea, B:38:0x00ef, B:40:0x00f7, B:42:0x00ff, B:43:0x0102, B:45:0x0106, B:48:0x010e, B:50:0x0111, B:52:0x0118, B:53:0x011c, B:56:0x0124, B:57:0x0130, B:58:0x013b, B:60:0x0143, B:61:0x0148, B:63:0x0150, B:64:0x0155, B:66:0x015d, B:67:0x0162, B:69:0x016a, B:70:0x0170, B:72:0x0178, B:73:0x0184, B:75:0x018c, B:76:0x0191, B:78:0x0197, B:79:0x019e, B:81:0x01a2, B:83:0x01ad, B:84:0x01b3), top: B:98:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008a A[Catch: all -> 0x0065, TryCatch #0 {all -> 0x0065, blocks: (B:7:0x0029, B:10:0x004f, B:13:0x0057, B:15:0x005a, B:17:0x0060, B:21:0x006b, B:23:0x006f, B:24:0x008a, B:26:0x00a0, B:28:0x00b5, B:30:0x00cf, B:32:0x00da, B:33:0x00dd, B:34:0x00df, B:35:0x00e2, B:37:0x00ea, B:38:0x00ef, B:40:0x00f7, B:42:0x00ff, B:43:0x0102, B:45:0x0106, B:48:0x010e, B:50:0x0111, B:52:0x0118, B:53:0x011c, B:56:0x0124, B:57:0x0130, B:58:0x013b, B:60:0x0143, B:61:0x0148, B:63:0x0150, B:64:0x0155, B:66:0x015d, B:67:0x0162, B:69:0x016a, B:70:0x0170, B:72:0x0178, B:73:0x0184, B:75:0x018c, B:76:0x0191, B:78:0x0197, B:79:0x019e, B:81:0x01a2, B:83:0x01ad, B:84:0x01b3), top: B:98:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0 A[Catch: all -> 0x0065, TryCatch #0 {all -> 0x0065, blocks: (B:7:0x0029, B:10:0x004f, B:13:0x0057, B:15:0x005a, B:17:0x0060, B:21:0x006b, B:23:0x006f, B:24:0x008a, B:26:0x00a0, B:28:0x00b5, B:30:0x00cf, B:32:0x00da, B:33:0x00dd, B:34:0x00df, B:35:0x00e2, B:37:0x00ea, B:38:0x00ef, B:40:0x00f7, B:42:0x00ff, B:43:0x0102, B:45:0x0106, B:48:0x010e, B:50:0x0111, B:52:0x0118, B:53:0x011c, B:56:0x0124, B:57:0x0130, B:58:0x013b, B:60:0x0143, B:61:0x0148, B:63:0x0150, B:64:0x0155, B:66:0x015d, B:67:0x0162, B:69:0x016a, B:70:0x0170, B:72:0x0178, B:73:0x0184, B:75:0x018c, B:76:0x0191, B:78:0x0197, B:79:0x019e, B:81:0x01a2, B:83:0x01ad, B:84:0x01b3), top: B:98:0x0029 }] */
    @Override // com.taobao.android.tschedule.task.ScheduleTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void realExecute(java.lang.String r20, java.lang.Object... r21) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.tschedule.task.MtopScheduleTask.realExecute(java.lang.String, java.lang.Object[]):void");
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements MtopPrefetch.IPrefetchCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TScheduleMtopListener f9715a;
        public final /* synthetic */ q12 b;
        public final /* synthetic */ long c;
        public final /* synthetic */ MtopTaskContext.MtopTaskParams d;
        public final /* synthetic */ String e;

        public a(TScheduleMtopListener tScheduleMtopListener, q12 q12Var, long j, MtopTaskContext.MtopTaskParams mtopTaskParams, String str) {
            this.f9715a = tScheduleMtopListener;
            this.b = q12Var;
            this.c = j;
            this.d = mtopTaskParams;
            this.e = str;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x010f, code lost:
            if (r21.equals("TYPE_MISS") != false) goto L_0x011d;
         */
        @Override // mtopsdk.mtop.intf.MtopPrefetch.IPrefetchCallback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onPrefetch(java.lang.String r21, java.util.HashMap<java.lang.String, java.lang.String> r22) {
            /*
                Method dump skipped, instructions count: 514
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.tschedule.task.MtopScheduleTask.a.onPrefetch(java.lang.String, java.util.HashMap):void");
        }
    }
}
