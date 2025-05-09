package tb;

import android.os.AsyncTask;
import android.os.Looper;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class jnr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final WVCallBackContext f22099a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (jnr.a(jnr.this) != null) {
                jnr.a(jnr.this).success();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ nsw f22101a;

        public b(nsw nswVar) {
            this.f22101a = nswVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (jnr.a(jnr.this) != null) {
                jnr.a(jnr.this).success(this.f22101a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ byte[] f22102a;

        public c(byte[] bArr) {
            this.f22102a = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (jnr.a(jnr.this) != null) {
                nsw nswVar = new nsw();
                try {
                    nswVar.h(new JSONObject(new String(this.f22102a)));
                    jnr.a(jnr.this).success(nswVar);
                } catch (Throwable th) {
                    TLog.loge("tblive", "JSBProxy", th.toString());
                    jnr.a(jnr.this).error();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.alibaba.fastjson.JSONObject f22103a;

        public d(com.alibaba.fastjson.JSONObject jSONObject) {
            this.f22103a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (jnr.a(jnr.this) != null) {
                nsw nswVar = new nsw();
                nswVar.h(new JSONObject(this.f22103a));
                jnr.a(jnr.this).success(nswVar);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f22104a;

        public e(String str) {
            this.f22104a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (jnr.a(jnr.this) == null) {
            } else {
                if (!TextUtils.isEmpty(this.f22104a)) {
                    nsw nswVar = new nsw();
                    try {
                        nswVar.h(new JSONObject(this.f22104a));
                        jnr.a(jnr.this).success(nswVar);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else {
                    jnr.a(jnr.this).success();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (jnr.a(jnr.this) != null) {
                jnr.a(jnr.this).error();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ nsw f22106a;

        public g(nsw nswVar) {
            this.f22106a = nswVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (jnr.a(jnr.this) != null) {
                jnr.a(jnr.this).error(this.f22106a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f22107a;

        public h(String str) {
            this.f22107a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (jnr.a(jnr.this) == null) {
            } else {
                if (!TextUtils.isEmpty(this.f22107a)) {
                    nsw nswVar = new nsw();
                    try {
                        nswVar.h(new JSONObject(this.f22107a));
                        jnr.a(jnr.this).error(nswVar);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                } else {
                    jnr.a(jnr.this).error();
                }
            }
        }
    }

    static {
        t2o.a(806356562);
    }

    public jnr(String str, String str2, WVCallBackContext wVCallBackContext) {
        System.nanoTime();
        this.f22099a = wVCallBackContext;
    }

    public static /* synthetic */ WVCallBackContext a(jnr jnrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVCallBackContext) ipChange.ipc$dispatch("cb1e12a0", new Object[]{jnrVar});
        }
        return jnrVar.f22099a;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1392128f", new Object[]{this});
        } else {
            e(new f());
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72e35699", new Object[]{this, str});
        } else {
            e(new h(str));
        }
    }

    public void d(nsw nswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5660aa7d", new Object[]{this, nswVar});
        } else {
            e(new g(nswVar));
        }
    }

    public final void e(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ce66a90", new Object[]{this, runnable});
        } else if (runnable != null && v2s.o().f() != null && v2s.o().f().getApplication() != null) {
            if (!phf.a(v2s.o().f().getApplication())) {
                runnable.run();
            } else if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                AsyncTask.execute(runnable);
            } else {
                runnable.run();
            }
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4550b0a", new Object[]{this});
        } else {
            e(new a());
        }
    }

    public void g(com.alibaba.fastjson.JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19a43926", new Object[]{this, jSONObject});
        } else {
            e(new d(jSONObject));
        }
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b54654", new Object[]{this, str});
        } else {
            e(new e(str));
        }
    }

    public void i(nsw nswVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e095322", new Object[]{this, nswVar});
        } else {
            e(new b(nswVar));
        }
    }

    public void j(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f354e551", new Object[]{this, bArr});
        } else {
            e(new c(bArr));
        }
    }
}
