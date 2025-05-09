package tb;

import android.app.Application;
import android.taobao.windvane.config.EnvEnum;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.yru;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class yaa {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_TTID = "hybrid@windvane_android_8.5.0";
    public static final String DEFAULT_UA = " WindVane/8.5.0";
    public static final String VERSION = "8.5.0";
    public static EnvEnum j = EnvEnum.ONLINE;
    public static boolean k = false;
    public static int l = 0;
    public static boolean m = true;
    public static Application n;
    public static yaa o;

    /* renamed from: a  reason: collision with root package name */
    public String f31935a;
    public String b;
    public String c;
    public String d;
    public String e = null;
    public String[] f = null;
    public boolean g = false;
    public yru h = new yru();
    public final yru.a i = new yru.a();

    static {
        t2o.a(989855774);
    }

    public static String e() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a3eea8ce", new Object[0]);
        }
        if (EnvEnum.ONLINE.equals(j)) {
            str = "https://h5.";
        } else {
            str = "http://h5.";
        }
        return str + j.getValue() + ".taobao.com";
    }

    public static synchronized yaa f() {
        synchronized (yaa.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (yaa) ipChange.ipc$dispatch("9d4592b5", new Object[0]);
            }
            if (o == null) {
                o = new yaa();
            }
            return o;
        }
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("86e811aa", new Object[]{this});
        }
        return this.c;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65f009ac", new Object[]{this});
        }
        return this.d;
    }

    public yru.a c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yru.a) ipChange.ipc$dispatch("a24e7470", new Object[]{this});
        }
        return this.i;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79a7d1d2", new Object[]{this});
        }
        return this.b;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("99fd2f88", new Object[]{this});
        }
        return this.f31935a;
    }

    public yru h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yru) ipChange.ipc$dispatch("991286a5", new Object[]{this});
        }
        return this.h;
    }

    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9026d50d", new Object[]{this});
        }
        return this.e;
    }

    public String[] j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("286b9f33", new Object[]{this});
        }
        return this.f;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("464cceda", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a9879", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4abd8b6c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f48f37c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c5c6e95c", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    public void q(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d77430af", new Object[]{this, strArr});
        } else if (strArr != null) {
            this.f = strArr;
        }
    }

    public boolean k(lpw lpwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("920cfa31", new Object[]{this, lpwVar})).booleanValue();
        }
        if (lpwVar == null) {
            return false;
        }
        if (!TextUtils.isEmpty(lpwVar.c)) {
            if (TextUtils.isEmpty(lpwVar.f23505a)) {
                this.f31935a = DEFAULT_TTID;
            } else {
                this.f31935a = lpwVar.f23505a;
            }
            this.b = lpwVar.b;
            this.c = lpwVar.d;
            this.d = lpwVar.e;
            q(lpwVar.f);
            if (!TextUtils.isEmpty(lpwVar.h)) {
                this.e = lpwVar.h;
            }
            this.g = lpwVar.i;
            yru yruVar = lpwVar.g;
            if (yruVar != null) {
                this.h = yruVar;
            }
            return true;
        }
        throw new NullPointerException("initParams error, appKey is empty");
    }
}
