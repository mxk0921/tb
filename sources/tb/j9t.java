package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class j9t {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static j9t e;

    /* renamed from: a  reason: collision with root package name */
    public String f21854a;
    public final Context b;
    public dhb c;
    public ehb d;

    public j9t(Context context, String str) {
        this.b = context;
        this.f21854a = str;
    }

    public static j9t d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j9t) ipChange.ipc$dispatch("afb65143", new Object[]{context});
        }
        return e(context, "default");
    }

    public static j9t e(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j9t) ipChange.ipc$dispatch("4fdd83b9", new Object[]{context, str});
        }
        if (context == null) {
            context = Globals.getApplication();
        }
        if (str == null) {
            str = "default";
        }
        if (e == null) {
            synchronized (j9t.class) {
                try {
                    if (e == null) {
                        e = new j9t(context.getApplicationContext(), str);
                    }
                } finally {
                }
            }
        } else {
            synchronized (j9t.class) {
                try {
                    if (!str.equals(e.f21854a)) {
                        e.getClass();
                        j9t j9tVar = e;
                        j9tVar.c = null;
                        j9tVar.d = null;
                    }
                } finally {
                }
            }
        }
        j9t j9tVar2 = e;
        j9tVar2.f21854a = str;
        return j9tVar2;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("298f0ed8", new Object[]{this});
            return;
        }
        h7h.g().c("Global_User_Profile" + Login.getUserId());
    }

    public dhb b() {
        dhb dhbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dhb) ipChange.ipc$dispatch("25d59f1a", new Object[]{this});
        }
        synchronized (j9t.class) {
            try {
                if (this.c == null) {
                    this.c = new n81(this.f21854a, this.b);
                }
                dhbVar = this.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dhbVar;
    }

    public ehb c() {
        ehb ehbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ehb) ipChange.ipc$dispatch("8eda9490", new Object[]{this});
        }
        synchronized (j9t.class) {
            try {
                if (this.d == null) {
                    this.d = new p81(this.b, this.f21854a);
                }
                ehbVar = this.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ehbVar;
    }
}
