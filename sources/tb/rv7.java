package tb;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.downloader.TbDownloader;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class rv7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile rv7 f27629a;

    public rv7() {
        try {
            Method declaredMethod = TbDownloader.class.getDeclaredMethod("initDownLoad", new Class[0]);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(null, new Object[0]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (xh4.h == null) {
            xh4.h = new jxp();
        }
        if (xh4.g == null) {
            xh4.g = new oyp();
        }
        if (xh4.f == null) {
            xh4.f = new mxp();
        }
    }

    public static rv7 e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rv7) ipChange.ipc$dispatch("9a210597", new Object[0]);
        }
        if (f27629a == null) {
            synchronized (rv7.class) {
                try {
                    if (f27629a == null) {
                        f27629a = new rv7();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f27629a;
    }

    public static void g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{context});
        } else if (context == null) {
            fs7.e("Downloader", "init", "context is null");
        } else {
            xh4.f31395a = context.getApplicationContext();
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f7d4d22", new Object[]{this, new Integer(i)});
        } else {
            xh4.g.modifyTask(i, 2);
        }
    }

    public int b(zu7 zu7Var, tu7 tu7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c4105371", new Object[]{this, zu7Var, tu7Var})).intValue();
        }
        return c(zu7Var, tu7Var, null);
    }

    public int d(String str, String str2, tu7 tu7Var) {
        zu7 zu7Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a8a9714", new Object[]{this, str, str2, tu7Var})).intValue();
        }
        rx3 rx3Var = xh4.j;
        if (rx3Var == null) {
            zu7Var = new zu7(str);
        } else {
            zu7Var = ((sx3) rx3Var).b(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            zu7Var.b.f29547a = str2;
        }
        return b(zu7Var, tu7Var);
    }

    public String f(String str, onf onfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50c524a9", new Object[]{this, str, onfVar});
        }
        return mg9.c(str, onfVar);
    }

    public void h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f874cb4f", new Object[]{this, new Integer(i)});
        } else {
            xh4.g.modifyTask(i, 0);
        }
    }

    public void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8045a4a0", new Object[]{this, new Integer(i)});
        } else {
            xh4.g.modifyTask(i, 1);
        }
    }

    public int c(zu7 zu7Var, tu7 tu7Var, Handler handler) {
        xb9 xb9Var;
        fs7.c("Downloader", "download", "start download");
        if (xh4.f31395a == null) {
            try {
                xh4.f31395a = ((Application) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, new Object[0])).getApplicationContext();
            } catch (Exception unused) {
                return -100;
            }
        }
        if (!(zu7Var == null || !TextUtils.isEmpty(zu7Var.b.g) || (xb9Var = xh4.f) == null)) {
            zu7Var.b.g = ((mxp) xb9Var).a();
        }
        if (zu7Var == null || !zu7Var.a()) {
            if (tu7Var != null) {
                tu7Var.onFinish(false);
            }
            l0j.a("add", "paramerror", null, null);
            return -100;
        }
        ie2 ie2Var = xh4.e;
        if (ie2Var != null) {
            int b = ((dxm) ie2Var).b(zu7Var.b);
            if (b >= 20) {
                b = Math.max(b, ((dxm) xh4.e).a(zu7Var.f33016a));
            }
            if (xh4.o.contains(zu7Var.b.f29547a)) {
                upl uplVar = zu7Var.b;
                if (uplVar.b == 41) {
                    uplVar.b = Math.max(b, 41);
                }
            }
            zu7Var.b.b = b;
        }
        zet zetVar = new zet();
        int a2 = zge.a();
        zetVar.b = a2;
        fs7.c("Downloader", "download", "assign taskId", Integer.valueOf(a2));
        zetVar.c = zu7Var.b;
        zetVar.e = zu7Var.f33016a;
        zetVar.d = new cvg(zu7Var, tu7Var, handler);
        ArrayList arrayList = new ArrayList();
        for (onf onfVar : zu7Var.f33016a) {
            zzp zzpVar = new zzp();
            zzpVar.e = onfVar;
            upl uplVar2 = zu7Var.b;
            zzpVar.f = uplVar2;
            zzpVar.g = uplVar2.g;
            if (xh4.r) {
                zzpVar.i = xh4.q && xh4.o.contains(uplVar2.f29547a);
            } else {
                zzpVar.i = onfVar.b >= xh4.p && xh4.q && xh4.o.contains(uplVar2.f29547a);
            }
            arrayList.add(zzpVar);
        }
        xh4.g.addTask(arrayList, zetVar);
        return zetVar.b;
    }
}
