package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class m39 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f23751a;

    static {
        t2o.a(463470637);
    }

    public m39() {
        this.f23751a = "";
    }

    public void a(int i, String str, String str2, String str3, String str4, String str5, int i2, Object obj, jzo jzoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c46863bf", new Object[]{this, new Integer(i), str, str2, str3, str4, str5, new Integer(i2), obj, jzoVar});
            return;
        }
        xy3 xy3Var = new xy3();
        xy3Var.e(str);
        xy3Var.g(str3);
        xy3Var.f(str4);
        xy3Var.c(str2);
        xy3Var.d(str5);
        xy3Var.b(i);
        j39.i().q(obj).b(i2, xy3Var, this.f23751a, jzoVar);
    }

    public void b(String str, int i, Object obj, jzo jzoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22b9f0b0", new Object[]{this, str, new Integer(i), obj, jzoVar});
        } else {
            c(str, i, null, obj, jzoVar);
        }
    }

    public void c(String str, int i, Map map, Object obj, jzo jzoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af512cd", new Object[]{this, str, new Integer(i), map, obj, jzoVar});
            return;
        }
        re0 re0Var = new re0();
        re0Var.d(str);
        if (map != null) {
            try {
                re0Var.c(JSON.toJSONString(map));
            } catch (Throwable unused) {
            }
        }
        j39.i().q(obj).b(i, re0Var, this.f23751a, jzoVar);
    }

    public void d(int i, String str, int i2, Object obj, jzo jzoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("107021d", new Object[]{this, new Integer(i), str, new Integer(i2), obj, jzoVar});
            return;
        }
        bb7 bb7Var = new bb7();
        bb7Var.c(str);
        bb7Var.b(i);
        j39.i().q(obj).b(i2, bb7Var, this.f23751a, jzoVar);
    }

    public void e(String str, int i, Object obj, jzo jzoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbcee6e6", new Object[]{this, str, new Integer(i), obj, jzoVar});
            return;
        }
        za7 za7Var = new za7();
        za7Var.b(str);
        j39.i().q(obj).b(i, za7Var, this.f23751a, jzoVar);
    }

    public void f(String str, jzo jzoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e43e7d7d", new Object[]{this, str, jzoVar});
        } else {
            e(str, 0, null, jzoVar);
        }
    }

    public void g(String[] strArr, int i, Object obj, jzo jzoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de797e12", new Object[]{this, strArr, new Integer(i), obj, jzoVar});
            return;
        }
        ya7 ya7Var = new ya7();
        ya7Var.b(strArr);
        j39.i().q(obj).b(i, ya7Var, this.f23751a, jzoVar);
    }

    public final tzo h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tzo) ipChange.ipc$dispatch("a904c8d0", new Object[]{this});
        }
        tzo tzoVar = new tzo();
        AppMonitor.Counter.commit("Favorite_SDK", "FavoriteStateProvider", "loginOffDirectReturn_content", 1.0d);
        tzoVar.c = false;
        tzoVar.f29047a = "favorite_sdk_login_invalid";
        return tzoVar;
    }

    public void i(int i, String str, jzo jzoVar) {
        Boolean bool;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("475c1665", new Object[]{this, new Integer(i), str, jzoVar});
            return;
        }
        ond c = k39.c();
        if (c == null || !c.isSessionValid()) {
            StringBuilder sb = new StringBuilder("FavoriteService.isFavoriteContent login_invalid error, mSdkLoginIsNull?");
            if (c != null) {
                z = false;
            }
            sb.append(z);
            sb.append(",isSessionValid=");
            if (c == null) {
                bool = null;
            } else {
                bool = Boolean.valueOf(c.isSessionValid());
            }
            sb.append(bool);
            TLog.loge(v29.TLOG_TAG, sb.toString());
            tzo h = h();
            jzoVar.onError(0, h.f29047a, h.b, null);
            return;
        }
        cq3 cq3Var = new cq3();
        cq3Var.c(str);
        cq3Var.b(i);
        j39.i().b(0, cq3Var, this.f23751a, jzoVar);
    }

    public void j(String str, int i, Object obj, jzo jzoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15031247", new Object[]{this, str, new Integer(i), obj, jzoVar});
            return;
        }
        bq3 bq3Var = new bq3();
        bq3Var.c(str);
        j39.i().q(obj).b(i, bq3Var, this.f23751a, jzoVar);
    }

    public void k(String str, jzo jzoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("523253bc", new Object[]{this, str, jzoVar});
        } else {
            j(str, 0, null, jzoVar);
        }
    }

    public void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29306ef", new Object[]{this, str});
        } else {
            this.f23751a = str;
        }
    }

    public void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb508f3b", new Object[]{this, str});
        } else if (uzo.c()) {
            zp3.k(str, this.f23751a);
        }
    }

    public m39(String str) {
        this.f23751a = str;
    }
}
