package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class vd7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile vd7 b;

    /* renamed from: a  reason: collision with root package name */
    public final Context f29936a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f29937a;

        public a(String str) {
            this.f29937a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Class<?> cls = getClass();
            ggh.c(cls, "saveLoginUid: " + this.f29937a);
            if (TextUtils.isEmpty(this.f29937a)) {
                vd7.e(vd7.a(vd7.this)).l("");
                vd7.e(vd7.a(vd7.this)).j("");
                return;
            }
            vd7.e(vd7.a(vd7.this)).l(this.f29937a);
            vd7.e(vd7.a(vd7.this)).j(vd7.b(vd7.this, this.f29937a));
        }
    }

    public vd7(Context context) {
        if (context.getApplicationContext() != null) {
            this.f29936a = context.getApplicationContext();
        } else {
            this.f29936a = context;
        }
    }

    public static /* synthetic */ Context a(vd7 vd7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("bd0f2353", new Object[]{vd7Var});
        }
        return vd7Var.f29936a;
    }

    public static /* synthetic */ String b(vd7 vd7Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("76f0a1dc", new Object[]{vd7Var, str});
        }
        return vd7Var.c(str);
    }

    public static vd7 e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vd7) ipChange.ipc$dispatch("23fb2418", new Object[]{context});
        }
        if (b == null) {
            synchronized (vd7.class) {
                try {
                    if (b == null) {
                        b = new vd7(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public final String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1c7ed024", new Object[]{this, str});
        }
        try {
            String staticSafeEncrypt = SecurityGuardManager.getInstance(this.f29936a).getStaticDataEncryptComp().staticSafeEncrypt(16, "tbcp", str, "");
            ggh.a(vd7.class, "encryptUid: " + staticSafeEncrypt);
            return staticSafeEncrypt;
        } catch (SecException e) {
            ggh.a(vd7.class, "encryptUid error" + e.getErrorCode() + e.toString());
            return "";
        }
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("56f85f78", new Object[]{this});
        }
        String valueOf = String.valueOf(gno.b(this.f29936a).a("login_encrypt_uid", ""));
        ggh.a(vd7.class, "getEUid: ".concat(valueOf));
        return valueOf;
    }

    public JSONObject f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1ca1f6d4", new Object[]{this});
        }
        try {
            String g = g();
            if (TextUtils.isEmpty(g)) {
                return null;
            }
            JSONObject parseObject = JSON.parseObject(g);
            boolean booleanValue = parseObject.getBoolean("enable").booleanValue();
            long longValue = parseObject.getLong("timestamp").longValue();
            JSONObject jSONObject = parseObject.getJSONObject("mockData");
            ggh.b("enable: " + booleanValue + "timestamp: " + longValue + " mockData: " + jSONObject);
            if (!booleanValue) {
                return null;
            }
            if (System.currentTimeMillis() / 1000 < longValue) {
                return jSONObject;
            }
            return null;
        } catch (Exception e) {
            ggh.d("getServerMockData error: " + e.getMessage());
            return null;
        }
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("317ce14f", new Object[]{this});
        }
        return (String) gno.b(this.f29936a).a("mockSet", "");
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ea2ce1f", new Object[]{this});
        }
        String str = (String) gno.b(this.f29936a).a("login_uid", "");
        ggh.a(vd7.class, "getUid: " + str);
        return str;
    }

    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ba2a055", new Object[]{this, str});
        } else {
            mn8.c().execute(new a(str));
        }
    }

    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c92cffe", new Object[]{this, str});
        } else {
            gno.b(this.f29936a).e("login_encrypt_uid", str);
        }
    }

    public void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a61d707", new Object[]{this, str});
        } else {
            gno.b(this.f29936a).e("mockSet", str);
        }
    }

    public void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b443d89f", new Object[]{this, str});
        } else {
            gno.b(this.f29936a).e("login_uid", str);
        }
    }
}
