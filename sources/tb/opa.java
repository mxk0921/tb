package tb;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import android.util.Base64;
import com.alipay.mobile.verifyidentity.module.utils.DataHelper;
import com.alipay.security.mobile.util.ConfigServiceUtil;
import com.alipay.security.mobile.windvane.SecCamJSBridge;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.android.change.app.icon.biz.ChangeAppIconBridge;
import com.taobao.android.nav.Nav;
import com.taobao.message.sp.framework.model.SimpleProfile;
import com.taobao.runtimepermission.a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class opa {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static int d;
    public static Context h;

    /* renamed from: a  reason: collision with root package name */
    public static final opa f25546a = new opa();
    public static final Object b = new Object();
    public static final long c = 400;
    public static int e = 0;
    public static int f = 100;
    public static boolean g = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements zu6 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(opa opaVar) {
        }

        public void a(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("818fc582", new Object[]{this, new Integer(i), str});
                return;
            }
            t6p.k(i);
            if (i == 400) {
                t6p.m(str);
            }
            synchronized (opa.a()) {
                opa.a().notifyAll();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ r6p f25547a;

        public b(r6p r6pVar) {
            this.f25547a = r6pVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f25547a.authResult(-4, "permission reject");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f25548a;
        public final /* synthetic */ r6p b;

        public c(String str, r6p r6pVar) {
            this.f25548a = str;
            this.b = r6pVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                opa.this.l(this.f25548a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e implements n1f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f25550a;
        public final /* synthetic */ WVCallBackContext b;

        public e(String str, WVCallBackContext wVCallBackContext) {
            this.f25550a = str;
            this.b = wVCallBackContext;
        }

        @Override // tb.n1f
        public void a(int i, byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("95e95f36", new Object[]{this, new Integer(i), bArr});
            } else if (i == 100) {
                t6p.j(Base64.encodeToString(bArr, 2));
                t6p.l(true);
                v6p.a("H5SecFace", "init code = " + i);
                opa.c(opa.this, this.f25550a, this.b);
            } else {
                r6p f = t6p.f();
                f.authResult(-3, "init failed" + i);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class f implements q4l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ nsw f25551a;
        public final /* synthetic */ WVCallBackContext b;

        public f(opa opaVar, nsw nswVar, WVCallBackContext wVCallBackContext) {
            this.f25551a = nswVar;
            this.b = wVCallBackContext;
        }

        @Override // tb.q4l
        public void a(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e82ab3b", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            if (i == 200 && !opa.d()) {
                try {
                    opa.e(true);
                    this.f25551a.a("isSuccess", Boolean.TRUE);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(ChangeAppIconBridge.KEY_DEVICEMODEL, u6p.d().c());
                    jSONObject.put("initTlv", t6p.c());
                    this.f25551a.b("initRspTlv", jSONObject.toString().replace("\\/", "/"));
                    this.b.success(this.f25551a);
                } catch (Exception unused) {
                    this.f25551a.b("isSuccess", "false");
                    this.b.success(this.f25551a);
                }
            }
            opa.f(i2);
        }
    }

    public static /* synthetic */ Object a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("7d600c9b", new Object[0]);
        }
        return b;
    }

    public static /* synthetic */ Context b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("d459f9b0", new Object[0]);
        }
        return h;
    }

    public static /* synthetic */ void c(opa opaVar, String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9673c7fb", new Object[]{opaVar, str, wVCallBackContext});
        } else {
            opaVar.m(str, wVCallBackContext);
        }
    }

    public static /* synthetic */ boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b88b93e", new Object[0])).booleanValue();
        }
        return g;
    }

    public static /* synthetic */ boolean e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18f8d21c", new Object[]{new Boolean(z)})).booleanValue();
        }
        g = z;
        return z;
    }

    public static /* synthetic */ int f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("80d9bf19", new Object[]{new Integer(i)})).intValue();
        }
        d = i;
        return i;
    }

    public static opa k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (opa) ipChange.ipc$dispatch("ded0163c", new Object[0]);
        }
        return f25546a;
    }

    public boolean g(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3848744b", new Object[]{this, wVCallBackContext})).booleanValue();
        }
        nsw nswVar = new nsw();
        if (u6p.d().a() == 0) {
            nswVar.a("isSuccess", Boolean.TRUE);
        } else {
            nswVar.a("isSuccess", Boolean.FALSE);
        }
        t6p.l(false);
        if (wVCallBackContext != null) {
            wVCallBackContext.success(nswVar);
        }
        return true;
    }

    public boolean h(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ce4ac470", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        g(null);
        nsw nswVar = new nsw();
        nswVar.a("finishH5SecCam", Boolean.TRUE);
        wVCallBackContext.success(nswVar);
        int i = -1;
        if (str != null) {
            try {
                i = new JSONObject(str).getInt("code");
            } catch (JSONException e2) {
                v6p.a("H5SecFace", e2.toString());
            }
        }
        if (i == 1000) {
            t6p.f().authResult(0, str);
        } else if (i == 1003) {
            t6p.f().authResult(-6, str);
        } else {
            t6p.f().authResult(-5, str);
        }
        return true;
    }

    public String i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7564ede0", new Object[]{this, context});
        }
        JSONObject jSONObject = new JSONObject();
        String str = Build.MANUFACTURER;
        if ((str.equalsIgnoreCase("xiaomi") || str.equalsIgnoreCase(TBDeviceUtils.REDMI_MANUFACTURE_LOWER_CASE)) && Build.VERSION.SDK_INT > 29 && !"off".equals(ConfigServiceUtil.syncConfigMode(ConfigServiceUtil.KEY_SECCAM_H5_FACE_SWITCH, ""))) {
            t6p.k(401);
            u6p.d().b(context, new a(this));
            long j = 0;
            try {
                long currentTimeMillis = System.currentTimeMillis();
                Object obj = b;
                synchronized (obj) {
                    obj.wait(c);
                    j = System.currentTimeMillis() - currentTimeMillis;
                    v6p.a("AuthenticatorManager", "diff tiem = " + j);
                }
            } catch (Exception e2) {
                v6p.a("AuthenticatorManager", " lock error = " + e2.toString());
            }
            if (t6p.d() == 400) {
                JSONObject jSONObject2 = new JSONObject(t6p.e());
                try {
                    jSONObject2.put("isSupportSecCam", "true");
                    jSONObject2.put("aidlTime", String.valueOf(j));
                    return jSONObject2.toString();
                } catch (Exception unused) {
                    jSONObject = jSONObject2;
                    v6p.a("AuthenticatorManager", " json error");
                    return jSONObject.toString();
                }
            } else {
                jSONObject.put("isSupportSecCam", "false");
                return jSONObject.toString();
            }
        } else {
            try {
                jSONObject.put("isSupportSecCam", "false");
            } catch (JSONException unused2) {
                v6p.a("H5SecFace", "env json exceptiion.");
            }
            return jSONObject.toString();
        }
    }

    public boolean n(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("92a1c667", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        if (!t6p.g()) {
            u6p.d().f(h, Base64.decode(t6p.b(), 2), new e(str, wVCallBackContext));
        } else {
            m(str, wVCallBackContext);
        }
        return true;
    }

    public void o(Context context, String str, r6p r6pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d63617a", new Object[]{this, context, str, r6pVar});
            return;
        }
        h = context;
        t6p.l(false);
        if (!x6p.g(context)) {
            a.C0649a c2 = com.taobao.runtimepermission.a.c(context, new String[]{t4p.CAMERA});
            c2.x(true);
            c2.z(new b(r6pVar));
            c2.A(new c(str, r6pVar));
            c2.m();
            return;
        }
        l(str, r6pVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements n1f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f25549a;
        public final /* synthetic */ String b;

        public d(opa opaVar, String str, String str2) {
            this.f25549a = str;
            this.b = str2;
        }

        @Override // tb.n1f
        public void a(int i, byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("95e95f36", new Object[]{this, new Integer(i), bArr});
            } else if (i == 100) {
                t6p.j(Base64.encodeToString(bArr, 2));
                t6p.l(true);
                v6p.a("H5SecFace", "init code = " + i);
                fsw.h("SecCamJSBridge", SecCamJSBridge.class);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("faceVerifyId", this.f25549a);
                    jSONObject.put("host", this.b);
                    String encodeToString = Base64.encodeToString(jSONObject.toString().getBytes(), 2);
                    Uri.Builder buildUpon = Uri.parse("https://render.alipay.com/p/yuyan/180020010001209190/index.html").buildUpon();
                    buildUpon.appendQueryParameter("clientcfg", encodeToString);
                    buildUpon.appendQueryParameter("_ali_hide_right_", "true");
                    Nav.from(opa.b()).toUri(buildUpon.toString());
                } catch (Exception e) {
                    e.toString();
                    t6p.f().authResult(-1, "");
                }
            } else {
                r6p f = t6p.f();
                f.authResult(-3, "init failed" + i);
            }
        }
    }

    public void l(String str, r6p r6pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb85654", new Object[]{this, str, r6pVar});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject(jSONObject.getString("bicViewInfo"));
            String string = jSONObject2.getString("regTlv");
            String string2 = jSONObject2.getString("authTlv");
            String string3 = jSONObject.getString("faceVerifyId");
            String string4 = jSONObject.getString("homeServer");
            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
                r6pVar.authResult(-2, "parameter is null!");
                return;
            }
            t6p.i(string);
            t6p.h(string2);
            t6p.n(r6pVar);
            u6p.d().f(h, Base64.decode(t6p.b(), 2), new d(this, string3, string4));
        } catch (JSONException unused) {
            r6pVar.authResult(-1, "exception");
        }
    }

    public final void m(String str, WVCallBackContext wVCallBackContext) {
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ac51947", new Object[]{this, str, wVCallBackContext});
            return;
        }
        nsw nswVar = new nsw();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (Integer.valueOf(jSONObject.getString("cameraID")).intValue() != 1) {
                i = 0;
            }
            e = i;
            f = jSONObject.getInt("quality");
            g = false;
            u6p.d().g(e, new f(this, nswVar, wVCallBackContext));
        } catch (Exception unused) {
            nswVar.b("isSuccess", "false");
            wVCallBackContext.success(nswVar);
        }
    }

    public boolean j(WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("febf7ea0", new Object[]{this, wVCallBackContext})).booleanValue();
        }
        nsw nswVar = new nsw();
        try {
            byte[] bArr = new byte[512000];
            System.arraycopy(Base64.decode(t6p.a(), 2), 0, bArr, 0, Base64.decode(t6p.a(), 2).length);
            s6p e2 = u6p.d().e(d, bArr);
            if (e2.c() == 300) {
                String encodeToString = Base64.encodeToString(e2.b(), 2);
                nswVar.a("isSuccess", Boolean.TRUE);
                nswVar.b("image", x6p.c(x6p.f(e2.b()), f));
                nswVar.b("yuvImage", encodeToString);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(ChangeAppIconBridge.KEY_DEVICEMODEL, u6p.d().c());
                jSONObject.put(DataHelper.FP_CHALLENGE_KEY, Base64.encodeToString(e2.a(), 2));
                jSONObject.put("sign", Base64.encodeToString(e2.d(), 2));
                nswVar.b(SimpleProfile.KEY_SIGNATURE, jSONObject.toString().replace("\\/", "/"));
            } else {
                nswVar.a("isSuccess", Boolean.FALSE);
            }
            wVCallBackContext.success(nswVar);
        } catch (Exception unused) {
            nswVar.a("isSuccess", Boolean.FALSE);
            wVCallBackContext.success(nswVar);
        }
        return true;
    }
}
