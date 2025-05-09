package com.taobao.android.tschedule;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.testutils.log.LogUtils;
import com.taobao.android.tschedule.a;
import com.taobao.android.tschedule.parser.ExprParserParams;
import com.taobao.android.tschedule.task.HttpScheduleTask;
import com.taobao.android.tschedule.task.ScheduleTask;
import com.taobao.android.tschedule.taskcontext.RenderTaskContext;
import com.taobao.android.tschedule.taskcontext.baseparams.TimeContent;
import com.taobao.android.tscheduleprotocol.MultiProcessScheduleProtocol;
import com.taobao.android.tscheduleprotocol.ScheduleCacheCallBack;
import com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.ans;
import tb.bns;
import tb.cns;
import tb.dms;
import tb.kaj;
import tb.nms;
import tb.t2o;
import tb.ums;
import tb.vms;
import tb.wms;
import tb.wp8;
import tb.yms;
import tb.zdh;
import tb.zms;
import tb.zto;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TScheduleMgr implements a.AbstractC0502a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            zdh.a("TS.TMgr", "version change, clearAllRenderCache. thread = " + Thread.currentThread());
            vms.c().a();
            zdh.a("TS.TMgr", "version change, startPredictNextPage. thread = " + Thread.currentThread());
            TScheduleInitialize.e().h();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {
        public static final TScheduleMgr instance = new TScheduleMgr(null);

        static {
            t2o.a(329252878);
        }
    }

    static {
        t2o.a(329252875);
        t2o.a(329252870);
    }

    public /* synthetic */ TScheduleMgr(a aVar) {
        this();
    }

    public static TScheduleMgr c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TScheduleMgr) ipChange.ipc$dispatch("ef18b59f", new Object[0]);
        }
        return b.instance;
    }

    public void a(final String str, final TScheduleHttpCallback tScheduleHttpCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("275656b", new Object[]{this, str, tScheduleHttpCallback});
            return;
        }
        try {
            final long uptimeMillis = SystemClock.uptimeMillis();
            if (!f(str)) {
                zdh.a("TS.TMgr", "fetch http Data, not preload url, url=" + str + ", costTime=" + (SystemClock.uptimeMillis() - uptimeMillis));
                tScheduleHttpCallback.onError();
                return;
            }
            HttpScheduleTask.fetchData(str, new ScheduleCacheCallBack() { // from class: com.taobao.android.tschedule.TScheduleMgr.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.tscheduleprotocol.ScheduleCacheCallBack
                public void onFinish(ScheduleCacheCallBack.ScheduleCacheCallBackType scheduleCacheCallBackType, Object obj, Object... objArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("daae7f44", new Object[]{this, scheduleCacheCallBackType, obj, objArr});
                        return;
                    }
                    zdh.a("TS.TMgr", "fetch http Data, type=" + scheduleCacheCallBackType + ", url=" + str + ", costTime=" + (SystemClock.uptimeMillis() - uptimeMillis));
                    TScheduleHttpCallback tScheduleHttpCallback2 = tScheduleHttpCallback;
                    if (tScheduleHttpCallback2 != null) {
                        if (scheduleCacheCallBackType == ScheduleCacheCallBack.ScheduleCacheCallBackType.SUCCESS) {
                            tScheduleHttpCallback2.onSuccess(obj);
                        } else {
                            tScheduleHttpCallback2.onError();
                        }
                    }
                }
            });
        } catch (Throwable th) {
            zdh.b("TS.TMgr", "callback http error", th);
        }
    }

    public final List<ScheduleTask> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b0f7cc02", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return nms.e(str);
    }

    @Override // com.taobao.android.tschedule.a.AbstractC0502a
    public void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fd4cd96", new Object[]{this, str, str2});
        } else {
            bns.a().f(new a());
        }
    }

    public final String e(ScheduleTask scheduleTask, String str) {
        MultiProcessScheduleProtocol d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f62c7567", new Object[]{this, scheduleTask, str});
        }
        String str2 = scheduleTask.taskContext.targetProcess;
        if (!TextUtils.isEmpty(str2) || (d = vms.c().d(scheduleTask.taskContext.bizCode)) == null) {
            return str2;
        }
        return d.getTargetProcessNameByUrl(TScheduleInitialize.b(), str);
    }

    public final boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("722aaf39", new Object[]{this, str})).booleanValue();
        }
        List<ScheduleTask> b2 = b(str);
        if (b2 == null || b2.isEmpty()) {
            return false;
        }
        return true;
    }

    public TScheduleMgr() {
        com.taobao.android.tschedule.a.a(this);
    }

    public boolean g(String str, String str2, Object... objArr) {
        List<ScheduleTask> list;
        T t;
        String str3;
        Intent intent;
        Object m;
        char c = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a65e1d91", new Object[]{this, str, str2, objArr})).booleanValue();
        }
        str.hashCode();
        ums.c("getTasks");
        zto.a a2 = zto.b().a(str2);
        if (a2 != null) {
            list = a2.a();
            TLog.loge("TS.TMgr", "hit task cache");
        } else {
            list = b(str2);
            zto.b().c(str2, list);
        }
        StringBuilder sb = new StringBuilder("taskSize=");
        sb.append(list == null ? 0 : list.size());
        ums.b("getTasks", sb.toString());
        if (list == null || list.isEmpty()) {
            zdh.a("TS.TMgr", "task not found。currentTrigger = " + str + "; url = " + str2);
            return false;
        }
        HashMap hashMap = new HashMap();
        for (ScheduleTask scheduleTask : list) {
            if (scheduleTask != null) {
                try {
                    t = scheduleTask.taskContext;
                } catch (Throwable th) {
                    zdh.b("TS.TMgr", "excute task error", th);
                }
                if (t != 0) {
                    if (!TextUtils.equals(str, t.trigger)) {
                        zdh.a("TS.TMgr", "miss match trigger, taskTrigger=" + scheduleTask.taskContext.trigger + ", currentTrigger=" + str);
                    } else {
                        if (!TextUtils.isEmpty(scheduleTask.taskContext.taskEnable)) {
                            if (objArr != null && objArr.length > 0) {
                                Object obj = objArr[c];
                                if (obj instanceof Intent) {
                                    intent = (Intent) obj;
                                    m = new wp8(new ExprParserParams(str2, null, intent), TScheduleInitialize.d()).m(scheduleTask.taskContext.taskEnable);
                                    if (m == null && Boolean.parseBoolean(m.toString())) {
                                    }
                                }
                            }
                            intent = null;
                            m = new wp8(new ExprParserParams(str2, null, intent), TScheduleInitialize.d()).m(scheduleTask.taskContext.taskEnable);
                            if (m == null) {
                            }
                        }
                        T t2 = scheduleTask.taskContext;
                        if (t2 instanceof RenderTaskContext) {
                            RenderTaskContext renderTaskContext = (RenderTaskContext) t2;
                            RenderTaskContext.RenderParams renderParams = renderTaskContext.params;
                            TimeContent i = cns.i(renderParams.url, renderParams.timeContent);
                            String str4 = i.content;
                            zdh.a("TS.TMgr", "解析renderUrl。解析前：" + renderTaskContext.params.url + ";解析后：" + i.content);
                            if (!TextUtils.isEmpty(i.spmVerifyValue)) {
                                zdh.a("TS.TMgr", "start execute, common spm=" + renderTaskContext.params.spmVerifyValue + ", time content spm=" + i.spmVerifyValue);
                                renderTaskContext.params.spmVerifyValue = i.spmVerifyValue;
                            }
                            str3 = str4;
                        } else {
                            str3 = str2;
                        }
                        zdh.a("TS.TMgr", "start execute, targetUrl=" + str3 + ", currentTrigger=" + str);
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("url", cns.c(str3));
                        hashMap2.put("fullUrl", str3);
                        dms.b("downgrade", str, scheduleTask.taskContext.version, "TSchedule", scheduleTask.taskContext.type + "_" + LogUtils.BEHAVIR_TASK_EXECUTE, hashMap2);
                        if (scheduleTask.taskContext.multiProcess) {
                            String e = e(scheduleTask, str3);
                            zdh.a("TS.TMgr", "execute in targetProcess=" + e);
                            if (TextUtils.isEmpty(e)) {
                                zdh.a("TS.TMgr", "no targetProcess, discard");
                            } else if (TextUtils.equals(cns.d(), e)) {
                                scheduleTask.execute(str3, objArr);
                            } else {
                                ArrayList arrayList = (ArrayList) hashMap.get(e);
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                    hashMap.put(e, arrayList);
                                }
                                arrayList.add(scheduleTask.taskContext.type);
                            }
                        } else {
                            scheduleTask.execute(str3, objArr);
                        }
                    }
                }
            }
            c = 0;
        }
        if (!hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                kaj.g(str2, (String) entry.getKey(), (ArrayList) entry.getValue());
            }
        }
        return true;
    }

    public boolean h(String str, String str2, List<JSONObject> list, Object... objArr) {
        String str3;
        String str4 = str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4124d67", new Object[]{this, str4, str2, list, objArr})).booleanValue();
        }
        if (!zms.b(wms.SWITCH_KEY_ENABLE_CONFIG_TRIGGER, false)) {
            zdh.a("TS.TMgr", "preloadWithConfigs failed, switch shutdown!");
            return false;
        } else if (list == null || list.isEmpty()) {
            return false;
        } else {
            List<String> f = zms.f();
            ums.c("getTasks");
            ScheduleProtocolCallback scheduleProtocolCallback = (objArr == null || objArr.length == 0) ? null : objArr[0];
            ArrayList arrayList = new ArrayList();
            for (JSONObject jSONObject : list) {
                ScheduleTask b2 = ans.b(str2, jSONObject, scheduleProtocolCallback);
                if (b2 != null) {
                    if (f == null || !f.contains(b2.taskKey)) {
                        f = f;
                        zdh.a("TS.TMgr", "taskKey:" + b2.taskKey + " is not in whiteList");
                    } else {
                        Context b3 = TScheduleInitialize.b();
                        f = f;
                        if (!ABGlobal.b(b3, "tb_global", "tschedule", "tsche_" + b2.taskKey)) {
                            zdh.a("TS.TMgr", "taskKey:" + b2.taskKey + " ab switch is not opened");
                        } else {
                            b2.originConfig = jSONObject;
                            arrayList.add(b2);
                        }
                    }
                }
            }
            ums.b("getTasks", "taskSize=" + arrayList.size());
            if (arrayList.isEmpty()) {
                return false;
            }
            HashMap hashMap = new HashMap();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ScheduleTask scheduleTask = (ScheduleTask) it.next();
                if (scheduleTask != null) {
                    try {
                        T t = scheduleTask.taskContext;
                        if (t != 0) {
                            if (!TextUtils.equals(str4, t.trigger)) {
                                zdh.a("TS.TMgr", "miss match trigger, taskTrigger=" + scheduleTask.taskContext.trigger + ", currentTrigger=" + str4);
                            } else {
                                T t2 = scheduleTask.taskContext;
                                if (t2 instanceof RenderTaskContext) {
                                    RenderTaskContext.RenderParams renderParams = ((RenderTaskContext) t2).params;
                                    str3 = cns.i(renderParams.url, renderParams.timeContent).content;
                                    zdh.a("TS.TMgr", "解析renderUrl。解析前：" + ((RenderTaskContext) scheduleTask.taskContext).params.url + ";解析后：" + str3);
                                    if (TextUtils.isEmpty(str3)) {
                                        String str5 = ((RenderTaskContext) scheduleTask.taskContext).params.url;
                                        HashMap hashMap2 = new HashMap();
                                        hashMap2.put("pageUrls", yms.g());
                                        hashMap2.put("urlExpr", str5);
                                        String str6 = scheduleTask.taskContext.version;
                                        dms.a("downgrade", str5, str6, "TSchedule", scheduleTask.taskContext.type + "_execute", hashMap2, "TS_RENDER_EMPTY_URL", "");
                                        str4 = null;
                                        return false;
                                    }
                                } else {
                                    str3 = str2;
                                }
                                if (TextUtils.isEmpty(str3)) {
                                    return false;
                                }
                                zdh.a("TS.TMgr", "start execute, targetUrl=" + str3 + ", currentTrigger=" + str4);
                                if (scheduleTask.taskContext.multiProcess) {
                                    String e = e(scheduleTask, str3);
                                    if (!TextUtils.isEmpty(e)) {
                                        if (TextUtils.equals(cns.d(), e)) {
                                            scheduleTask.execute(str3, objArr);
                                        } else {
                                            ArrayList arrayList2 = (ArrayList) hashMap.get(e);
                                            if (arrayList2 == null) {
                                                arrayList2 = new ArrayList();
                                                hashMap.put(e, arrayList2);
                                            }
                                            arrayList2.add(scheduleTask);
                                        }
                                    }
                                } else {
                                    scheduleTask.execute(str3, objArr);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        zdh.b("TS.TMgr", "excute task error", th);
                    }
                }
            }
            if (!hashMap.isEmpty()) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    kaj.h(str2, (String) entry.getKey(), (ArrayList) entry.getValue());
                }
            }
            return true;
        }
    }
}
