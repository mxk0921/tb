package tb;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.adapter.task.RoomTask;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class tiw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f28742a = false;

    static {
        t2o.a(970981415);
    }

    public static yiw a(Context context, j1r j1rVar, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yiw) ipChange.ipc$dispatch("e642c04c", new Object[]{context, j1rVar, hashMap});
        }
        if (hashMap == null) {
            hashMap = new HashMap();
        }
        j1r j1rVar2 = new j1r(hashMap);
        if (!qg8.c() || d(context)) {
            return new pja(j1rVar);
        }
        String b = j1rVar2.b("appVersion", "1.0.0");
        ghh.a("VirtualThreadLauncher", b);
        if (b.split("\\.").length > 3) {
            return new pja(j1rVar);
        }
        return new yiw(j1rVar);
    }

    public static void c(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccf153b7", new Object[]{application, hashMap});
            return;
        }
        j1r j1rVar = new j1r(e(application));
        if (qg8.e(j1rVar)) {
            yiw a2 = a(application, j1rVar, hashMap);
            ghh.a("VirtualThreadLauncher", a2.getClass().getSimpleName());
            new mla().a(new qiw(j1rVar, a2)).a(new ye1(j1rVar, a2)).a(new mtn(j1rVar, hashMap)).a(new ako(j1rVar, a2)).a(new itq(j1rVar, a2)).a(new iok(j1rVar, a2)).a(new RoomTask(j1rVar, a2)).a(new pqt(j1rVar, a2)).a(new m1w(j1rVar, a2)).a(new k7l(j1rVar, a2)).execute();
        }
    }

    public static Map<String, String> e(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("97e93ba5", new Object[]{application});
        }
        try {
            Map<String, String> b = nb9.a().b(new File(ey1.SWITCH_FILE_DIR, "virtual_thread_config.txt"));
            return b.size() > 0 ? b : nb9.a().b(new File(application.getFilesDir(), "virtual_thread_config.txt"));
        } catch (Throwable th) {
            ghh.c(th);
            return new HashMap();
        }
    }

    public static boolean d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae75a015", new Object[]{context})).booleanValue();
        }
        SharedPreferences a2 = m7l.a(context, "Virtual_Thread", 0);
        boolean contains = a2.contains("isFirstOpen");
        boolean z = true ^ contains;
        if (contains) {
            a2.edit().putString("isFirstOpen", "false").apply();
        }
        return z;
    }

    public static void b(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
        } else if (!f28742a) {
            f28742a = true;
            c(application, hashMap);
            ghh.a("VirtualThreadLauncher", "init", "succ");
        }
    }
}
