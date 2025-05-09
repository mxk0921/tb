package tb;

import android.content.Context;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import java.util.HashMap;
import java.util.Map;
import tb.n8v;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class op6 implements pxb<byte[]> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final m9v b = m9v.d(c9x.CART_BIZ_NAME);
    public static final n8v c = new n8v(c9x.CART_BIZ_NAME);
    public static final Map<String, byte[]> d = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Context f25540a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f25541a;
        public final /* synthetic */ byte[] b;

        public a(String str, byte[] bArr) {
            this.f25541a = str;
            this.b = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                op6.b().o(this.f25541a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ n8v.c f25542a;

        public b(n8v.c cVar) {
            this.f25542a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f25542a.onFail("未登录");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ n8v.c f25543a;

        public c(n8v.c cVar) {
            this.f25543a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            byte[] j = op6.this.j();
            if (j == null) {
                this.f25543a.onFail("获取缓存失败");
            } else {
                this.f25543a.onSuccess(j);
            }
        }
    }

    static {
        t2o.a(479199283);
        t2o.a(479199282);
    }

    public op6(Context context) {
        this.f25540a = context;
    }

    public static /* synthetic */ m9v b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m9v) ipChange.ipc$dispatch("196c0589", new Object[0]);
        }
        return b;
    }

    public static boolean e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("53464993", new Object[]{context})).booleanValue();
        }
        String f = f();
        if (((HashMap) d).get(f) == null && !b.a(f)) {
            return c.i(context, f);
        }
        return true;
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b7e3984e", new Object[0]);
        }
        if (o78.CHINA_MAINLAND.equalsIgnoreCase(Localization.j())) {
            return "iCart_query_cache_data_byte" + Login.getUserId();
        }
        return "iCart_query_cache_data_byte" + Login.getUserId() + Localization.j();
    }

    public static void g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b93deff9", new Object[]{context});
            return;
        }
        String f = f();
        ((HashMap) d).remove(f);
        if (Login.checkSessionValid()) {
            c.h(context, f);
            b.b(f);
        }
    }

    public static void h(Context context, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0e4e679", new Object[]{context, bArr});
        } else if (Login.checkSessionValid()) {
            String f = f();
            ((HashMap) d).put(f, bArr);
            c.j(context, f, bArr, null);
            pav.k(new a(f, bArr));
        }
    }

    public void c(boolean z, n8v.c<byte[]> cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e54ded34", new Object[]{this, new Boolean(z), cVar});
        } else if (!Login.checkSessionValid()) {
            pav.m(z, new b(cVar));
        } else {
            pav.m(z, new c(cVar));
        }
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c53285d", new Object[]{this})).booleanValue();
        }
        return e(this.f25540a);
    }

    /* renamed from: i */
    public void a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfc2b99d", new Object[]{this, bArr});
        } else {
            h(this.f25540a, bArr);
        }
    }

    public byte[] j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("50243605", new Object[]{this});
        }
        if (!Login.checkSessionValid()) {
            return null;
        }
        String f = f();
        HashMap hashMap = (HashMap) d;
        byte[] bArr = (byte[]) hashMap.get(f);
        if (bArr != null) {
            return bArr;
        }
        byte[] f2 = b.f(f);
        if (f2 != null) {
            hashMap.put(f, f2);
            return f2;
        }
        byte[] k = c.k(this.f25540a, f);
        if (k != null) {
            hashMap.put(f, k);
        } else {
            hashMap.remove(f);
        }
        return k;
    }
}
