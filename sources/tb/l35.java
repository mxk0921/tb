package tb;

import android.content.Context;
import android.os.Build;
import anet.channel.request.ByteArrayEntry;
import anetwork.channel.Request;
import anetwork.channel.Response;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import tb.q8t;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class l35 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final List<c> f23079a = new ArrayList();
    public static boolean b = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f23080a;
        public final /* synthetic */ q35 b;
        public final /* synthetic */ fn8 c;

        public a(Context context, q35 q35Var, fn8 fn8Var) {
            this.f23080a = context;
            this.b = q35Var;
            this.c = fn8Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            l35.a(this.f23080a, this.b, this.c);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public String f23082a;
        public fn8 b;
        public String c;

        public c() {
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }

    public static /* synthetic */ void a(Context context, q35 q35Var, fn8 fn8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3daf6793", new Object[]{context, q35Var, fn8Var});
        } else {
            g(context, q35Var, fn8Var);
        }
    }

    public static /* synthetic */ void b(Context context, String str, fn8 fn8Var, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("629d8804", new Object[]{context, str, fn8Var, str2});
        } else {
            e(context, str, fn8Var, str2);
        }
    }

    public static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4730a67", new Object[]{context});
        } else {
            pjg.EXECUTOR.submit(new b(context));
        }
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9930aaf7", new Object[0])).booleanValue();
        }
        return q8t.c();
    }

    public static void f(Context context, q35<String, Void> q35Var, fn8 fn8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef11418b", new Object[]{context, q35Var, fn8Var});
        } else {
            pjg.EXECUTOR.submit(new a(context, q35Var, fn8Var));
        }
    }

    public static void g(Context context, q35<String, Void> q35Var, fn8 fn8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c12b4a8", new Object[]{context, q35Var, fn8Var});
            return;
        }
        StringBuilder sb = new StringBuilder();
        hiq.a(q35Var.g(), fn8Var, q35Var.h(sb));
        c cVar = new c(null);
        cVar.f23082a = q35Var.g();
        cVar.b = fn8Var;
        cVar.c = sb.toString();
        ArrayList arrayList = (ArrayList) f23079a;
        if (arrayList.size() >= 4) {
            arrayList.add(cVar);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c cVar2 = (c) it.next();
                e(context, cVar2.f23082a, cVar2.b, cVar2.c);
            }
            ((ArrayList) f23079a).clear();
            b = true;
        } else if (!b) {
            arrayList.add(cVar);
        } else {
            e(context, cVar.f23082a, cVar.b, cVar.c);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f23081a;

        public b(Context context) {
            this.f23081a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Map<String, Set<q8t.c>> map = q8t.f26585a;
            if (map != null) {
                Iterator it = ((LinkedHashMap) map).keySet().iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    Set set = (Set) ((LinkedHashMap) q8t.f26585a).get(str);
                    StringBuilder sb = new StringBuilder();
                    int size = set.size();
                    Iterator it2 = set.iterator();
                    long j = 0;
                    long j2 = 0;
                    while (it2.hasNext()) {
                        q8t.c cVar = (q8t.c) it2.next();
                        if (cVar.a()) {
                            Locale locale = Locale.ENGLISH;
                            String str2 = cVar.b;
                            long j3 = cVar.c;
                            long j4 = cVar.d;
                            sb.append(str2 + "#ExecutionSummary{startTime=" + j3 + ", endTime=" + j4 + ", duration=" + (j4 - j3) + ", total=1, executed=1, isMainThread=0}[]");
                            sb.append("|");
                            long j5 = cVar.c;
                            if (j > j5 || j == 0) {
                                j = j5;
                            }
                            long j6 = cVar.d;
                            if (j2 < j6) {
                                j2 = j6;
                            }
                            it = it;
                            str = str;
                            it2 = it2;
                        }
                    }
                    l35.b(this.f23081a, str, fn8.a(size, size, j, j2), sb.toString());
                    it = it;
                }
                ((LinkedHashMap) q8t.f26585a).clear();
            }
        }
    }

    public static void e(Context context, String str, fn8 fn8Var, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10e29b07", new Object[]{context, str, fn8Var, str2});
            return;
        }
        DegradableNetwork degradableNetwork = new DegradableNetwork(context);
        Request requestImpl = new RequestImpl("https://tmq-service.taobao.org/task_exec/reportPerformance");
        requestImpl.setMethod("POST");
        requestImpl.setCharset("UTF-8");
        requestImpl.setFollowRedirects(true);
        requestImpl.setRetryTime(3);
        requestImpl.addHeader("Content-Type", "application/json");
        HashMap hashMap = new HashMap(4);
        HashMap hashMap2 = new HashMap(20);
        hashMap2.put("stage_name", str);
        hashMap2.put("stage_execution_start", Long.valueOf(fn8Var.f19417a));
        hashMap2.put("stage_execution_end", Long.valueOf(fn8Var.b));
        hashMap2.put("stage_execution_node_count_total", Integer.valueOf(fn8Var.c));
        hashMap2.put("stage_execution_node_count_executed", Integer.valueOf(fn8Var.d));
        hashMap2.put("scene", "DAGRuntime");
        hashMap2.put("stage_summary", str2);
        hashMap2.put("app_process", LauncherRuntime.c);
        hashMap2.put("app_version", LauncherRuntime.e);
        hashMap2.put("app_device_model", Build.MODEL);
        hashMap2.put("app_device_brand", Build.BRAND);
        hashMap2.put("app_device_core_size", Integer.valueOf(jrt.a(vu3.b.GEO_NOT_SUPPORT)));
        chb g = c21.g();
        hashMap2.put("app_device_score", Integer.valueOf(g.getInt(ai7.KEY_OLD_SCORE, 60)));
        hashMap2.put("app_status_is_full_new_install", Boolean.valueOf(g.getBoolean("isFullNewInstall", false)));
        hashMap2.put("app_status_is_first_launch", Boolean.valueOf(g.getBoolean("isFirstLaunch", false)));
        hashMap2.put("app_device_manufacturer", Build.MANUFACTURER);
        hashMap2.put("app_device_os", "android");
        hashMap2.put("app_package_debug", Boolean.valueOf(LauncherRuntime.l));
        hashMap2.put("app_package_tag", LauncherRuntime.f);
        hashMap.put("data_type", "launch_stage_summary");
        hashMap.put(MspGlobalDefine.APP_KEY, hhg.a("constantAppkey", ""));
        hashMap.put("data", hashMap2);
        hashMap.put("exec_id", Long.valueOf(LauncherRuntime.f8166a));
        int i = LauncherRuntime.k;
        if (i == 1) {
            str3 = "link";
        } else if (i == 2) {
            str3 = "link-h5";
        } else {
            str3 = "normal";
        }
        hashMap.put("launch_type", str3);
        ByteArrayEntry byteArrayEntry = new ByteArrayEntry(JSON.toJSONBytes(hashMap, new SerializerFeature[0]));
        byteArrayEntry.setContentType("application/json");
        requestImpl.setBodyEntry(byteArrayEntry);
        jdh.a("DAGRuntime", "[stage:%s][getResponse] exec_id=%d", str, Long.valueOf(LauncherRuntime.f8166a));
        try {
            Response syncSend = degradableNetwork.syncSend(requestImpl, null);
            if (syncSend.getStatusCode() == 200) {
                jdh.a("DAGRuntime", "[stage:%s][getResponse] id=%d", str, Long.valueOf(((JSONObject) JSON.parse(syncSend.getBytedata(), new Feature[0])).getJSONObject("resultData").getLongValue("id")));
            }
        } catch (Throwable th) {
            jdh.a("DAGRuntime", "[stage:%s][getResponse] failed:", str, th);
        }
    }
}
