package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.TScheduleInitialize;
import com.taobao.android.tschedule.task.ScheduleTask;
import com.taobao.android.tschedule.taskcontext.RenderTaskContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class nms {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String REGULAR_EXPRESSION = "@urlRegular.";

    /* renamed from: a  reason: collision with root package name */
    public static String f24832a;
    public static String b;
    public static Map<String, List<ScheduleTask>> c = new ConcurrentHashMap();
    public static Map<String, Uri> d = new ConcurrentHashMap();
    public static List<String> e = new CopyOnWriteArrayList();
    public static boolean f = false;

    static {
        t2o.a(329252868);
    }

    public static void b(String str, ScheduleTask scheduleTask, Map<String, String> map) {
        RenderTaskContext.RenderParams renderParams;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb937ead", new Object[]{str, scheduleTask, map});
        } else if (scheduleTask != null) {
            T t = scheduleTask.taskContext;
            if ((t instanceof RenderTaskContext) && (renderParams = ((RenderTaskContext) t).params) != null && (str2 = renderParams.staticData) != null) {
                map.put(str, str2);
            }
        }
    }

    public static Map<String, List<ScheduleTask>> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("226206f7", new Object[0]);
        }
        return c;
    }

    public static String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8d56bf8", new Object[]{str});
        }
        if (str != null) {
            try {
                if (str.contains("?")) {
                    Uri parse = Uri.parse(str);
                    String c2 = cns.c(str);
                    for (String str2 : d.keySet()) {
                        String c3 = cns.c(str2);
                        if (c2 == null || c3 == null || c2.equals(c3)) {
                            Uri uri = d.get(str2);
                            if (uri.getQuery() != null) {
                                for (String str3 : uri.getQueryParameterNames()) {
                                    if (!TextUtils.equals(uri.getQueryParameter(str3), parse.getQueryParameter(str3))) {
                                        break;
                                    }
                                }
                                return str2;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                zdh.b("TS.Config", "getQueryPath error", th);
            }
        }
        return null;
    }

    public static List<ScheduleTask> e(String str) {
        List<ScheduleTask> list;
        Throwable th;
        String d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("dba4a8be", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        List<ScheduleTask> list2 = (List) ((ConcurrentHashMap) c).get(cns.c(str));
        if (list2 == null && (d2 = d(str)) != null) {
            list2 = (List) ((ConcurrentHashMap) c).get(d2);
        }
        if (list2 == null && !((CopyOnWriteArrayList) e).isEmpty()) {
            Iterator it = ((CopyOnWriteArrayList) e).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                try {
                } catch (Throwable th2) {
                    list = list2;
                    th = th2;
                }
                if (cns.h(str2.substring(12), str)) {
                    list = (List) ((ConcurrentHashMap) c).get(str2);
                    try {
                        zdh.a("TS.Config", "getTasks:url正则匹配成功：url=" + str + "\n;regular=" + str2);
                    } catch (Throwable th3) {
                        th = th3;
                        zdh.a("TS.Config", "getTasks:url正则匹配异常, 请检查URL正则表达式配置，regularUrls :" + e);
                        th.printStackTrace();
                        list2 = list;
                    }
                    list2 = list;
                }
            }
        }
        return list2;
    }

    public static void f(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c44e695", new Object[]{map});
        } else if (TScheduleInitialize.e().c() && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                sms f2 = sms.f();
                String g = f2.g(key + sms.CDN_SUFFIX);
                if (value == null || !value.equals(g) || !sms.f().d(g)) {
                    zdh.a("TS.Config", "下载预渲染静态资源。bizKey = " + key + ";cdn = " + value);
                    sms.f().e(g);
                    sms f3 = sms.f();
                    f3.i(key + sms.CDN_SUFFIX, value);
                    sms.f().c(value);
                } else {
                    zdh.a("TS.Config", "预渲染bizKey对应的CDN地址没变，且本地有已有该CDN的内容，不需要重新下载。bizKey = " + key);
                }
            }
        }
    }

    public static void g(String str, ScheduleTask scheduleTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2293cfda", new Object[]{str, scheduleTask});
        } else if (!TextUtils.isEmpty(str) && scheduleTask != null) {
            List<ScheduleTask> list = c.get(str);
            if (list != null) {
                list.remove(scheduleTask);
            }
            if (list == null || list.isEmpty()) {
                c.remove(str);
            }
        }
    }

    public static void i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dd32672", new Object[]{str, str2});
        } else {
            yms.p(str, str2);
        }
    }

    public static boolean a(String str, ScheduleTask scheduleTask) {
        List<String> h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("51fc1505", new Object[]{str, scheduleTask})).booleanValue();
        }
        if (("navBefore".equals(scheduleTask.taskContext.trigger) || "navAfter".equals(scheduleTask.taskContext.trigger)) && (h = zms.h()) != null && h.contains(str)) {
            zdh.a("TS.Config", "bizKey=" + str + "的导航类型task在黑名单里，被过滤");
            return false;
        }
        if ("idle".equals(scheduleTask.taskContext.trigger)) {
            List<String> g = zms.g();
            if (g == null) {
                zdh.a("TS.Config", "闲时白名单为空，bizKey=" + str + "被过滤");
                return false;
            } else if (!g.contains(str)) {
                zdh.a("TS.Config", "bizKey=" + str + "的闲时类型task不在白名单里，被过滤");
                return false;
            }
        }
        return true;
    }

    public static synchronized void h(String str) {
        JSONArray jSONArray;
        Uri parse;
        ScheduleTask a2;
        synchronized (nms.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1ca5b5bc", new Object[]{str});
                return;
            }
            ums.c("update config");
            if (!TextUtils.equals(f24832a, str) || !TextUtils.equals(b, zms.e(wms.CONFIG_KEY_TRIGGER_NAV_BLACK_LIST, ""))) {
                yms.o();
                zdh.a("TS.Config", "updateConfig=" + str);
                if (TextUtils.isEmpty(str)) {
                    ((ConcurrentHashMap) c).clear();
                    ((ConcurrentHashMap) d).clear();
                    ((CopyOnWriteArrayList) e).clear();
                    f24832a = str;
                    b = null;
                    return;
                }
                JSONObject parseObject = JSON.parseObject(str);
                if (parseObject != null && !parseObject.isEmpty()) {
                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                    ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
                    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                    HashMap hashMap = new HashMap();
                    for (String str2 : parseObject.keySet()) {
                        JSONObject jSONObject = parseObject.getJSONObject(str2);
                        if (jSONObject != null && !jSONObject.isEmpty() && (jSONArray = jSONObject.getJSONArray("tasks")) != null && !jSONArray.isEmpty()) {
                            ArrayList arrayList = new ArrayList();
                            Iterator<Object> it = jSONArray.iterator();
                            while (it.hasNext()) {
                                Object next = it.next();
                                if ((next instanceof JSONObject) && (a2 = ans.a(str2, (JSONObject) next)) != null && a(str2, a2)) {
                                    a2.originConfig = (JSONObject) next;
                                    arrayList.add(a2);
                                    b(str2, a2, hashMap);
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                JSONArray jSONArray2 = jSONObject.getJSONArray("urlFilter");
                                Iterator<Object> it2 = jSONArray2 == null ? null : jSONArray2.iterator();
                                if (it2 == null) {
                                    concurrentHashMap.put(str2, arrayList);
                                } else {
                                    while (it2.hasNext()) {
                                        String obj = it2.next().toString();
                                        if (!TextUtils.isEmpty(obj)) {
                                            if (obj.startsWith(REGULAR_EXPRESSION)) {
                                                copyOnWriteArrayList.add(obj);
                                                concurrentHashMap.put(obj, arrayList);
                                            } else {
                                                if (obj.indexOf("?") > 0 && (parse = Uri.parse(obj)) != null) {
                                                    concurrentHashMap2.put(obj, parse);
                                                }
                                                concurrentHashMap.put(obj, arrayList);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    c = concurrentHashMap;
                    d = concurrentHashMap2;
                    f24832a = str;
                    e = copyOnWriteArrayList;
                    b = zms.e(wms.CONFIG_KEY_TRIGGER_NAV_BLACK_LIST, "");
                    f(hashMap);
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("configs", c.toString());
                    hashMap2.put("queryPath", d.toString());
                    hashMap2.put("regularUrls", e.toString());
                    dms.a("downgrade", "update_config", "1", "TSchedule", "orangeConfig", hashMap2, "update_config", "config size :" + ((ConcurrentHashMap) c).size());
                    ums.b("update config", new String[0]);
                    return;
                }
                ((ConcurrentHashMap) c).clear();
                ((ConcurrentHashMap) d).clear();
                ((CopyOnWriteArrayList) e).clear();
                f24832a = str;
                b = null;
            }
        }
    }
}
