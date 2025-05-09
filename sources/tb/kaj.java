package tb;

import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.TScheduleInitialize;
import com.taobao.android.tschedule.task.ScheduleTask;
import com.taobao.android.tschedule.taskcontext.RenderTaskContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class kaj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KET_PROTOCOL_BIZ_CODE = "protocolBizCode";
    public static final String KET_PROTOCOL_CLASS = "protocolClass";
    public static final String KET_TARGET_PROCESS = "targetProcess";
    public static final String KET_TARGET_TASK = "targetTasks";
    public static final String KET_TARGET_TASK_CONFIG = "targetTasksConfigs";
    public static final String KET_TASK_URL = "taskUrl";
    public static final String TYPE_CHANGE_TRIVER_PROTOCOL = "changeTriverProtocol";
    public static final String TYPE_CHANGE_WEBVIEW_PROTOCOL = "changeWebViewProtocol";
    public static final String TYPE_DAI_COMPLETE = "com.tmall.android.dai.intent.action.INITIALIZE_COMPLETE";
    public static final String TYPE_SCHEDULE_TASK = "scheduleTask";
    public static final String TYPE_SCHEDULE_TASK_WITH_CONFIGS = "scheduleTaskWithConfigs";

    static {
        t2o.a(329252951);
    }

    public static /* synthetic */ void a(String str, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1a04c72", new Object[]{str, list});
        } else {
            c(str, list);
        }
    }

    public static /* synthetic */ void b(String str, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e407773", new Object[]{str, list});
        } else {
            d(str, list);
        }
    }

    public static void c(String str, List<String> list) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e656d75", new Object[]{str, list});
            return;
        }
        List<ScheduleTask> e = nms.e(str);
        if (!(e == null || e.isEmpty())) {
            for (ScheduleTask scheduleTask : e) {
                if (scheduleTask != null) {
                    try {
                        T t = scheduleTask.taskContext;
                        if (t != 0) {
                            if (t instanceof RenderTaskContext) {
                                str2 = ((RenderTaskContext) t).params.url;
                            } else {
                                str2 = str;
                            }
                            if (t.multiProcess && list.contains(t.type)) {
                                scheduleTask.execute(str2, new Object[0]);
                            }
                        }
                    } catch (Throwable th) {
                        zdh.b("TS.MultiProcessor", "excute task error", th);
                    }
                }
            }
        }
    }

    public static void d(String str, List<String> list) {
        String str2;
        ScheduleTask a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b409c91a", new Object[]{str, list});
        } else if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (String str3 : list) {
                try {
                    if (!TextUtils.isEmpty(str3) && (a2 = ans.a(str, JSON.parseObject(str3))) != null) {
                        arrayList.add(a2);
                    }
                } catch (Throwable unused) {
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ScheduleTask scheduleTask = (ScheduleTask) it.next();
                    if (scheduleTask != null) {
                        try {
                            T t = scheduleTask.taskContext;
                            if (t != 0) {
                                if (t instanceof RenderTaskContext) {
                                    str2 = ((RenderTaskContext) t).params.url;
                                } else {
                                    str2 = str;
                                }
                                if (t.multiProcess) {
                                    scheduleTask.execute(str2, new Object[0]);
                                }
                            }
                        } catch (Throwable th) {
                            zdh.b("TS.MultiProcessor", "excute task error", th);
                        }
                    }
                }
            }
        }
    }

    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("601999e2", new Object[]{str, str2});
        } else if (cns.g(TScheduleInitialize.b()) && !TextUtils.isEmpty(str2)) {
            Intent intent = new Intent(TYPE_CHANGE_TRIVER_PROTOCOL);
            intent.putExtra(KET_PROTOCOL_BIZ_CODE, str);
            intent.putExtra(KET_PROTOCOL_CLASS, str2);
            TScheduleInitialize.b().sendBroadcast(intent);
        }
    }

    public static void f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d271b1", new Object[]{str, str2});
        } else if (cns.g(TScheduleInitialize.b()) && !TextUtils.isEmpty(str2)) {
            Intent intent = new Intent(TYPE_CHANGE_WEBVIEW_PROTOCOL);
            intent.putExtra(KET_PROTOCOL_BIZ_CODE, str);
            intent.putExtra(KET_PROTOCOL_CLASS, str2);
            TScheduleInitialize.b().sendBroadcast(intent);
        }
    }

    public static void g(String str, String str2, ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61392572", new Object[]{str, str2, arrayList});
        } else if (cns.g(TScheduleInitialize.b()) && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            Intent intent = new Intent(TYPE_SCHEDULE_TASK);
            intent.putExtra(KET_TASK_URL, str);
            intent.putExtra(KET_TARGET_PROCESS, str2);
            intent.putStringArrayListExtra(KET_TARGET_TASK, arrayList);
            TScheduleInitialize.b().sendBroadcast(intent);
            zdh.a("TS.MultiProcessor", "post task to targetProcess=" + str2 + ", url=" + str);
        }
    }

    public static void h(String str, String str2, ArrayList<ScheduleTask> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("935bfdc1", new Object[]{str, str2, arrayList});
        } else if (cns.g(TScheduleInitialize.b()) && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && arrayList != null && !arrayList.isEmpty()) {
            ArrayList<String> arrayList2 = new ArrayList<>();
            Iterator<ScheduleTask> it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(it.next().originConfig.toJSONString());
            }
            Intent intent = new Intent(TYPE_SCHEDULE_TASK_WITH_CONFIGS);
            intent.putExtra(KET_TASK_URL, str);
            intent.putExtra(KET_TARGET_PROCESS, str2);
            intent.putStringArrayListExtra(KET_TARGET_TASK_CONFIG, arrayList2);
            TScheduleInitialize.b().sendBroadcast(intent);
            zdh.a("TS.MultiProcessor", "post task to targetProcess=" + str2 + ", url=" + str);
        }
    }
}
