package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class vyp {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int UPLOAD_DELAY = 500;
    public static final vyp r = new vyp();
    public String m;
    public long p;

    /* renamed from: a  reason: collision with root package name */
    public boolean f30351a = false;
    public boolean b = false;
    public Context c = null;
    public String d = null;
    public String e = null;
    public String f = null;
    public String g = null;
    public String h = null;
    public String i = null;
    public String j = null;
    public String k = null;
    public String l = null;
    public String n = "";
    public c55 o = null;
    public boolean q = false;

    static {
        t2o.a(962592812);
    }

    public static /* synthetic */ Context a(vyp vypVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("c1a25d1f", new Object[]{vypVar});
        }
        return vypVar.c;
    }

    public static /* synthetic */ String b(vyp vypVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cb5c80b8", new Object[]{vypVar});
        }
        return vypVar.n;
    }

    public static /* synthetic */ String c(vyp vypVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8477caec", new Object[]{vypVar, str});
        }
        vypVar.n = str;
        return str;
    }

    public static vyp i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vyp) ipChange.ipc$dispatch("599b4874", new Object[0]);
        }
        return r;
    }

    public void A(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{this, context});
        } else if (this.c == null && context != null) {
            this.c = context;
        }
    }

    public final void B(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b3b6338", new Object[]{this, str});
        } else {
            this.m = str;
        }
    }

    public final void C(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b9e5bc5", new Object[]{this, str});
            return;
        }
        this.k = str;
        if (!hsq.f(str)) {
            this.l = str;
        }
    }

    public final void D(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcd5f5b9", new Object[]{this, str});
            return;
        }
        this.i = str;
        if (!hsq.f(str)) {
            this.j = str;
        }
    }

    public final void E(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e993ac1", new Object[]{this, str});
            return;
        }
        this.g = str;
        if (!hsq.f(str)) {
            this.h = str;
        }
    }

    public final void F(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82431f57", new Object[]{this, str});
            return;
        }
        Context context = this.c;
        if (context != null) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("UTCommon", 0).edit();
                if (TextUtils.isEmpty(str)) {
                    edit.putString("_openid", null);
                } else {
                    edit.putString("_openid", new String(tp1.d(str.getBytes("UTF-8"), 2)));
                }
                edit.commit();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void G(String str) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ddb1d8", new Object[]{this, str});
        } else if (!hsq.f(str) && (context = this.c) != null) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("UTCommon", 0).edit();
                edit.putString("_luid", new String(tp1.d(str.getBytes("UTF-8"), 2)));
                edit.commit();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
    }

    public final void H(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cad1f004", new Object[]{this, str});
            return;
        }
        Context context = this.c;
        if (context != null) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("UTCommon", 0).edit();
                if (TextUtils.isEmpty(str)) {
                    edit.putString("_usersite", null);
                } else {
                    edit.putString("_usersite", new String(tp1.d(str.getBytes("UTF-8"), 2)));
                }
                edit.commit();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void I(String str) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdcccf00", new Object[]{this, str});
        } else if (!hsq.f(str) && (context = this.c) != null) {
            try {
                SharedPreferences.Editor edit = context.getSharedPreferences("UTCommon", 0).edit();
                edit.putString("_lun", new String(tp1.d(str.getBytes("UTF-8"), 2)));
                edit.commit();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
    }

    public void J(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2a9d963", new Object[]{this, new Long(j)});
            return;
        }
        this.p = j;
        String.valueOf(j);
    }

    @Deprecated
    public void K(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c37d5d3e", new Object[]{this, str, str2, str3});
            return;
        }
        E(str);
        M(str2, str3);
        I(str);
    }

    public void L(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5c8f388", new Object[]{this, str, str2, str3, str4});
            return;
        }
        E(str);
        C(str4);
        M(str2, str3);
        I(str);
        H(str4);
    }

    public final void M(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f8f328", new Object[]{this, str, str2});
        } else if (TextUtils.isEmpty(str)) {
            D(null);
            B(null);
        } else if (!TextUtils.isEmpty(str2) || !str.equals(this.i)) {
            D(str);
            B(str2);
            G(str);
            F(str2);
        }
    }

    public String d() {
        Map<String, String> b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65f009ac", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.f) && (b = o1v.b(g())) != null) {
            this.f = b.get(oeh.APPVERSION);
        }
        return this.f;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c9396be5", new Object[]{this});
        }
        return this.d;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3babe84c", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.e)) {
            String a2 = iaq.a(g(), "channel");
            if (!TextUtils.isEmpty(a2)) {
                return a2;
            }
        }
        return this.e;
    }

    public Context g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.c;
    }

    public c55 h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c55) ipChange.ipc$dispatch("56dc57cd", new Object[]{this});
        }
        return this.o;
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7234470a", new Object[]{this});
        } else if (!this.q) {
            SharedPreferences sharedPreferences = this.c.getSharedPreferences("UTCommon", 0);
            String string = sharedPreferences.getString("_lun", "");
            if (!hsq.f(string)) {
                try {
                    this.h = new String(tp1.a(string.getBytes(), 2), "UTF-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
            String string2 = sharedPreferences.getString("_luid", "");
            if (!hsq.f(string2)) {
                try {
                    this.j = new String(tp1.a(string2.getBytes(), 2), "UTF-8");
                } catch (UnsupportedEncodingException e2) {
                    e2.printStackTrace();
                }
            }
            String string3 = sharedPreferences.getString("_openid", "");
            if (!hsq.f(string3)) {
                try {
                    this.m = new String(tp1.a(string3.getBytes(), 2), "UTF-8");
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            String string4 = sharedPreferences.getString("_usersite", "");
            if (!hsq.f(string4)) {
                try {
                    this.l = new String(tp1.a(string4.getBytes(), 2), "UTF-8");
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
            this.q = true;
        }
    }

    public String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("465d35b4", new Object[]{this});
        }
        return this.h;
    }

    public String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a1778450", new Object[]{this});
        }
        return this.l;
    }

    public String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("85e714a6", new Object[]{this});
        }
        return this.j;
    }

    public String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50ee13f6", new Object[]{this});
        }
        return this.n;
    }

    public String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5167c9fe", new Object[]{this});
        }
        return this.m;
    }

    public long p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("331f6b48", new Object[]{this})).longValue();
        }
        return this.p;
    }

    public String q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4f8218d1", new Object[]{this});
        }
        return this.k;
    }

    public String r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9ee0635d", new Object[]{this});
        }
        return this.i;
    }

    public String s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7a716a55", new Object[]{this});
        }
        return this.g;
    }

    public void t(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37dcbd2f", new Object[]{this, context, str, str2, str3});
            return;
        }
        if (!this.f30351a) {
            long currentTimeMillis = System.currentTimeMillis();
            this.p = currentTimeMillis;
            String.valueOf(currentTimeMillis);
            A(context);
            x(str);
            y(str2);
            z(str3);
        }
        this.f30351a = true;
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6d101b2", new Object[]{this});
        } else if (this.o == null) {
            new sno(this.c, "ut.db").e();
            this.o = new c55(this.c, "ut.db");
        }
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac808b6", new Object[]{this});
            return;
        }
        if (!this.b) {
            v();
        }
        this.b = true;
    }

    public void x(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77945e11", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public void y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cefab34a", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public void z(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40d4aa12", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends Thread {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f30352a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2) {
            super(str);
            this.f30352a = str2;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/analytics/core/SimpleVariables$1");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                long currentTimeMillis = System.currentTimeMillis();
                String a2 = k3l.a(vyp.a(vyp.this));
                nhh.r("SimpleVariables", "oaidDevice", a2);
                if (!TextUtils.isEmpty(a2)) {
                    vyp.c(vyp.this, a2);
                    if (!a2.equalsIgnoreCase(this.f30352a)) {
                        iaq.b(vyp.i().g(), "_od", a2);
                    }
                }
                nhh.r("Variables", "oaid cost", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                nhh.r("SimpleVariables", "initOaid", vyp.b(vyp.this));
            } catch (Throwable unused) {
            }
        }
    }

    public final void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55c02da4", new Object[]{this});
            return;
        }
        nhh.r("SimpleVariables", "initOaid", this.n);
        String a2 = iaq.a(i().g(), "_od");
        if (TextUtils.isEmpty(this.n)) {
            this.n = a2;
        }
        nhh.r("SimpleVariables", "oaidSp", a2);
        new a("UtOaid", a2).start();
    }
}
