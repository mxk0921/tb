package tb;

import android.app.Application;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.HashMap;
import tb.ea1;
import tb.wd9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class x41 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String c(ea1.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8d9c55c4", new Object[]{dVar});
        }
        if (dVar == null) {
            return "";
        }
        String str = dVar.b;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        return "";
    }

    public static void d(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{application, hashMap});
            return;
        }
        x0s x0sVar = new x0s(application);
        koq b = poq.b(x0sVar, hashMap);
        if (tn8.a(application, b.defaultValue())) {
            nzi.a().b();
            ea1.d a2 = new ea1(application, njo.j(application)).a();
            if (a2 != null) {
                l1s.c().a("LastCrash", a2.f18401a, a2.b);
            }
            String c = c(a2);
            if (e(c)) {
                h(x0sVar, c, b);
            } else {
                i(x0sVar);
            }
        }
    }

    public static boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2942649d", new Object[]{str})).booleanValue();
        }
        return str.contains("reason=6 (ANR)");
    }

    public static /* synthetic */ void f(String str, r2o r2oVar, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57d6bf55", new Object[]{str, r2oVar, file});
            return;
        }
        db.a(file, str);
        n1s a2 = o1s.a(file);
        if (a2 != null) {
            l1s.c().a("STAGE_ANR_HAPPENED_LAUNCH_SEND", "TCrash", a2.b());
            r2oVar.a(a2);
        }
    }

    public static /* synthetic */ void g(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2072ad3", new Object[]{file});
            return;
        }
        l1s.c().a("STAGE_ANR_LAUNCH_DEL", "TCrash", "anr");
        kg9.f(file);
    }

    public static void h(x0s x0sVar, final String str, koq koqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("420a5949", new Object[]{x0sVar, str, koqVar});
            return;
        }
        final p1s p1sVar = new p1s(x0sVar, koqVar);
        wd9.b(new o5v(x0sVar).b(), new wd9.a() { // from class: tb.v41
            @Override // tb.wd9.a
            public final void accept(File file) {
                x41.f(str, p1sVar, file);
            }
        }).a();
    }

    public static void i(x0s x0sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2622176b", new Object[]{x0sVar});
        } else {
            wd9.b(new o5v(x0sVar).b(), new wd9.a() { // from class: tb.w41
                @Override // tb.wd9.a
                public final void accept(File file) {
                    x41.g(file);
                }
            }).a();
        }
    }
}
