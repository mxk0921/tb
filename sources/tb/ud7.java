package tb;

import android.os.Handler;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ud7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile ud7 f29304a;

    public static ud7 d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ud7) ipChange.ipc$dispatch("a1f370d0", new Object[0]);
        }
        if (f29304a == null) {
            synchronized (ud7.class) {
                try {
                    if (f29304a == null) {
                        f29304a = new ud7();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f29304a;
    }

    public final List<String> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ca7cc307", new Object[]{this, str});
        }
        if (!o8l.b() || !TextUtils.equals(str, "widget")) {
            return null;
        }
        try {
            return JSON.parseArray(o8l.c("dynamic_widget_id_list", "[\"131\",\"130\",\"132\",\"92\",\"43\"]"), String.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void e(String str, List<String> list, Object obj, yyb yybVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("153a274f", new Object[]{this, str, list, obj, yybVar});
        } else {
            f(str, list, obj, yybVar, null, null);
        }
    }

    public void f(String str, List<String> list, Object obj, yyb yybVar, Handler handler, x3o x3oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("131eb918", new Object[]{this, str, list, obj, yybVar, handler, x3oVar});
        } else if (a(str) || yybVar == null) {
            if (x3oVar != null) {
                x3oVar.f(c(str));
                if (x3oVar.d()) {
                    x3oVar.e(b(str));
                }
            }
            wd7.b(str, list, obj, false, yybVar, handler, x3oVar);
        } else {
            yybVar.a("orange config disable");
        }
    }

    public void g(String str, List<String> list, Object obj, yyb yybVar, x3o x3oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7487bcc8", new Object[]{this, str, list, obj, yybVar, x3oVar});
        } else {
            f(str, list, obj, yybVar, null, x3oVar);
        }
    }

    public void h(String str, List<String> list, Object obj, yyb yybVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62ce2db9", new Object[]{this, str, list, obj, yybVar});
        } else if (a(str) || yybVar == null) {
            wd7.b(str, list, obj, true, yybVar, null, null);
        } else {
            yybVar.a("orange config disable");
        }
    }

    public final List<String> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c6367b85", new Object[]{this, str});
        }
        if (!o8l.a("enable_anim_widget", false) || !TextUtils.equals(str, "widget")) {
            return null;
        }
        try {
            return JSON.parseArray(o8l.c("dynamic_anim_id_list", ""), String.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b4b68cd", new Object[]{this, str})).booleanValue();
        }
        if (!o8l.a("enable", true)) {
            return false;
        }
        if (!"widget".equals(str) || o8l.a("channel_enable_widget", true)) {
            return !"shortcuts".equals(str) || o8l.a("channel_enable_shortcuts", true);
        }
        return false;
    }
}
