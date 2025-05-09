package com.taobao.tao.homepage.launcher;

import android.content.Context;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.a0b;
import tb.cw6;
import tb.g4b;
import tb.h0b;
import tb.hhg;
import tb.j3b;
import tb.k3b;
import tb.m0b;
import tb.m3b;
import tb.q0b;
import tb.qza;
import tb.rza;
import tb.t2o;
import tb.uqa;
import tb.vqa;
import tb.vxl;
import tb.yya;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class LauncherInitCheckList {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<Class, String> f12424a = new ConcurrentHashMap<Class, String>() { // from class: com.taobao.tao.homepage.launcher.LauncherInitCheckList.1
        {
            put(g4b.class, "HomeSwitchLauncher");
            put(qza.class, "HomeDinamicX2Launcher");
            put(rza.class, "HomeDinamicX3Launcher");
            put(j3b.class, "HomePreCreateViewLauncher");
            put(yya.class, "HomeAdvLauncher");
            put(a0b.class, "HomeGatewayLauncher");
            put(k3b.class, "HomePreRequestLauncher");
            put(m0b.class, "HomeLauncher");
        }
    };
    public static final Map<Class, String> b = new ConcurrentHashMap<Class, String>() { // from class: com.taobao.tao.homepage.launcher.LauncherInitCheckList.2
        {
            put(m3b.class, "HomePrepareParamsLauncher");
            put(q0b.class, "HomeLoadCacheLauncher");
        }
    };
    public static final Map<Class, String> c = new ConcurrentHashMap<Class, String>() { // from class: com.taobao.tao.homepage.launcher.LauncherInitCheckList.3
        {
            put(h0b.class, "HomeIdleLauncher");
        }
    };
    public static final List<Class> d = new CopyOnWriteArrayList();

    static {
        t2o.a(729809344);
    }

    public static HashMap<String, Object> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("d0b198b4", new Object[]{str});
        }
        HashMap<String, Object> c2 = hhg.c(str);
        c2.put("launcherName", str);
        c2.put("launcherType", "triggerLauncher");
        return c2;
    }

    public static void c(Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b4c6279", new Object[]{cls});
        } else if (!cw6.b() || ((ConcurrentHashMap) f12424a).containsKey(cls) || ((ConcurrentHashMap) b).containsKey(cls) || ((ConcurrentHashMap) c).containsKey(cls)) {
            ((ConcurrentHashMap) f12424a).remove(cls);
            ((ConcurrentHashMap) b).remove(cls);
            ((ConcurrentHashMap) c).remove(cls);
        } else {
            ((CopyOnWriteArrayList) d).add(cls);
        }
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a300a0c", new Object[0]);
            return;
        }
        vqa.k().i("LauncherTask").j("retryTrigger").e("LauncherInitCheckList.reTrigger").a();
        Map<Class, String> map = f12424a;
        if (((ConcurrentHashMap) map).containsValue("HomeSwitchLauncher")) {
            new g4b().a(LauncherRuntime.h, b("HomeSwitchLauncher"));
        }
        if (((ConcurrentHashMap) map).containsValue("HomeDinamicX2Launcher")) {
            new qza().a(LauncherRuntime.h, b("HomeDinamicX2Launcher"));
        }
        if (((ConcurrentHashMap) map).containsValue("HomeDinamicX3Launcher")) {
            new rza().a(LauncherRuntime.h, b("HomeDinamicX3Launcher"));
        }
        if (((ConcurrentHashMap) map).containsValue("HomePreCreateViewLauncher")) {
            new j3b().a(LauncherRuntime.h, b("HomePreCreateViewLauncher"));
        }
        if (((ConcurrentHashMap) map).containsValue("HomeAdvLauncher")) {
            new yya().a(LauncherRuntime.h, b("HomeAdvLauncher"));
        }
        if (((ConcurrentHashMap) map).containsValue("HomeGatewayLauncher")) {
            new a0b().a(LauncherRuntime.h, b("HomeGatewayLauncher"));
        }
        if (((ConcurrentHashMap) map).containsValue("HomePreRequestLauncher") && !vxl.b().n()) {
            new k3b().a(LauncherRuntime.h, b("HomePreRequestLauncher"));
        }
        if (((ConcurrentHashMap) map).containsValue("HomeLauncher")) {
            new m0b().a(LauncherRuntime.h, b("HomeLauncher"));
        }
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a697e213", new Object[]{context});
            return;
        }
        if (cw6.b() && ((CopyOnWriteArrayList) d).size() > 0) {
            Toast.makeText(context, "【状态出错】首页有新增启动任务，请及时更新首页代码<LauncherInitCheckList>", 1).show();
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f12424a;
        if (concurrentHashMap.size() > 0 || ((ConcurrentHashMap) b).size() > 0) {
            StringBuilder sb = new StringBuilder("【状态出错】首页还有以下任务没有执行，请联系面孔排查问题。：");
            if (concurrentHashMap.size() > 0) {
                for (String str : concurrentHashMap.values()) {
                    sb.append(str);
                    sb.append(" ");
                }
                uqa.b("LauncherTask", "LauncherInitCheck", "LauncherInitCheckList.checkBeforeHomeRun; necessaryLauncher:" + ((Object) sb));
                d();
            }
            ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) b;
            if (concurrentHashMap2.size() > 0) {
                for (String str2 : concurrentHashMap2.values()) {
                    sb.append(str2);
                    sb.append(" ");
                }
                uqa.b("LauncherTask", "LauncherInitCheck", "LauncherInitCheckList.checkBeforeHomeRun; speedLauncher:" + ((Object) sb));
            }
            if (cw6.b()) {
                Toast.makeText(context, sb.toString(), 1).show();
            }
        }
    }
}
