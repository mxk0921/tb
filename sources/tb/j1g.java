package tb;

import android.content.Context;
import com.alibaba.ability.impl.kvstorage.KVStorageImpl;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.KVStorageCurrentInfo;
import com.taobao.android.abilityidl.ability.KVStorageCurrentInfoAndKeys;
import java.util.List;
import java.util.Map;
import java.util.zip.Adler32;
import kotlin.Pair;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class j1g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public KVStorageImpl f21700a;
    public final Adler32 b = new Adler32();
    public String c;
    public String d;
    public final boolean e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        static {
            t2o.a(111149060);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(111149059);
    }

    public j1g(boolean z) {
        this.e = z;
    }

    public static final /* synthetic */ boolean a(j1g j1gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c039b993", new Object[]{j1gVar})).booleanValue();
        }
        return j1gVar.e;
    }

    public static final /* synthetic */ String b(j1g j1gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa8ee924", new Object[]{j1gVar});
        }
        return j1gVar.i();
    }

    public final tao<Object, ErrorResult> c(kdb kdbVar, String str) {
        ErrorResult errorResult;
        koc g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("978f679", new Object[]{this, kdbVar, str});
        }
        ckf.g(kdbVar, "context");
        ckf.g(str, "bizId");
        if (!a(this) || (((g = cjf.INSTANCE.g()) == null || g.isLogin()) && b(this) != null)) {
            errorResult = null;
        } else {
            errorResult = new ErrorResult("NOT_LOGIN", (String) null, (Map) null, 6, (a07) null);
        }
        if (errorResult != null) {
            return new tao<>(null, errorResult);
        }
        Context context = kdbVar.l().getContext();
        if (context == null) {
            return new tao<>(null, ErrorResult.a.Companion.g("NoAppContext"));
        }
        g(context, str, i()).b();
        this.f21700a = null;
        return new tao<>(null, null);
    }

    public final tao<List<String>, ErrorResult> d(kdb kdbVar, String str) {
        ErrorResult errorResult;
        koc g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("cc13fc07", new Object[]{this, kdbVar, str});
        }
        ckf.g(kdbVar, "context");
        ckf.g(str, "bizID");
        if (!a(this) || (((g = cjf.INSTANCE.g()) == null || g.isLogin()) && b(this) != null)) {
            errorResult = null;
        } else {
            errorResult = new ErrorResult("NOT_LOGIN", (String) null, (Map) null, 6, (a07) null);
        }
        if (errorResult != null) {
            return new tao<>(null, errorResult);
        }
        Context context = kdbVar.l().getContext();
        if (context != null) {
            return new tao<>(g(context, str, i()).h(), null);
        }
        return new tao<>(null, ErrorResult.a.Companion.g("NoAppContext"));
    }

    public final tao<KVStorageCurrentInfo, ErrorResult> e(kdb kdbVar, String str) {
        ErrorResult errorResult;
        koc g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("1dd7acb5", new Object[]{this, kdbVar, str});
        }
        ckf.g(kdbVar, "context");
        ckf.g(str, "bizID");
        if (!a(this) || (((g = cjf.INSTANCE.g()) == null || g.isLogin()) && b(this) != null)) {
            errorResult = null;
        } else {
            errorResult = new ErrorResult("NOT_LOGIN", (String) null, (Map) null, 6, (a07) null);
        }
        if (errorResult != null) {
            return new tao<>(null, errorResult);
        }
        Context context = kdbVar.l().getContext();
        if (context == null) {
            return new tao<>(null, ErrorResult.a.Companion.g("NoAppContext"));
        }
        KVStorageImpl g2 = g(context, str, i());
        KVStorageCurrentInfo kVStorageCurrentInfo = new KVStorageCurrentInfo();
        long f = g2.f();
        kVStorageCurrentInfo.freeSize = (int) hfn.d(f - g2.g(), 0L);
        kVStorageCurrentInfo.totalSize = (int) f;
        xhv xhvVar = xhv.INSTANCE;
        return new tao<>(kVStorageCurrentInfo, null);
    }

    public final tao<KVStorageCurrentInfoAndKeys, ErrorResult> f(kdb kdbVar, String str) {
        ErrorResult errorResult;
        koc g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("60332fcc", new Object[]{this, kdbVar, str});
        }
        ckf.g(kdbVar, "context");
        ckf.g(str, "bizID");
        if (!a(this) || (((g = cjf.INSTANCE.g()) == null || g.isLogin()) && b(this) != null)) {
            errorResult = null;
        } else {
            errorResult = new ErrorResult("NOT_LOGIN", (String) null, (Map) null, 6, (a07) null);
        }
        if (errorResult != null) {
            return new tao<>(null, errorResult);
        }
        Context context = kdbVar.l().getContext();
        if (context == null) {
            return new tao<>(null, ErrorResult.a.Companion.g("NoAppContext"));
        }
        KVStorageImpl g2 = g(context, str, i());
        KVStorageCurrentInfoAndKeys kVStorageCurrentInfoAndKeys = new KVStorageCurrentInfoAndKeys();
        long f = g2.f();
        kVStorageCurrentInfoAndKeys.freeSize = (int) hfn.d(f - g2.g(), 0L);
        kVStorageCurrentInfoAndKeys.totalSize = (int) f;
        kVStorageCurrentInfoAndKeys.keys = g2.h();
        xhv xhvVar = xhv.INSTANCE;
        return new tao<>(kVStorageCurrentInfoAndKeys, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
        if (r0 != null) goto L_0x004b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.alibaba.ability.impl.kvstorage.KVStorageImpl g(android.content.Context r8, java.lang.String r9, java.lang.String r10) {
        /*
            r7 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.j1g.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x001e
            java.lang.String r1 = "616de03c"
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r7
            r3 = 1
            r2[r3] = r8
            r8 = 2
            r2[r8] = r9
            r8 = 3
            r2[r8] = r10
            java.lang.Object r8 = r0.ipc$dispatch(r1, r2)
            com.alibaba.ability.impl.kvstorage.KVStorageImpl r8 = (com.alibaba.ability.impl.kvstorage.KVStorageImpl) r8
            return r8
        L_0x001e:
            com.alibaba.ability.impl.kvstorage.KVStorageImpl r0 = r7.f21700a
            if (r0 == 0) goto L_0x0031
            java.lang.String r1 = r0.e()
            boolean r1 = tb.ckf.b(r9, r1)
            if (r1 == 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            r0 = 0
        L_0x002e:
            if (r0 == 0) goto L_0x0031
            goto L_0x004b
        L_0x0031:
            com.alibaba.ability.impl.kvstorage.KVStorageImpl$a r1 = com.alibaba.ability.impl.kvstorage.KVStorageImpl.Companion
            long r2 = tb.hbl.e(r9)
            r4 = 1024(0x400, double:5.06E-321)
            long r5 = r2 * r4
            r2 = r8
            r3 = r9
            r4 = r10
            com.alibaba.ability.impl.kvstorage.KVStorageImpl r0 = r1.c(r2, r3, r4, r5)
            com.alibaba.ability.impl.kvstorage.KVStorageImpl r8 = r7.f21700a
            if (r8 == 0) goto L_0x0049
            r8.c()
        L_0x0049:
            r7.f21700a = r0
        L_0x004b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.j1g.g(android.content.Context, java.lang.String, java.lang.String):com.alibaba.ability.impl.kvstorage.KVStorageImpl");
    }

    public final tao<String, ErrorResult> h(kdb kdbVar, String str, String str2) {
        ErrorResult errorResult;
        String str3;
        koc g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("bc7a94c7", new Object[]{this, kdbVar, str, str2});
        }
        ckf.g(kdbVar, "context");
        ckf.g(str, "bizID");
        ckf.g(str2, "key");
        if (!a(this) || (((g = cjf.INSTANCE.g()) == null || g.isLogin()) && b(this) != null)) {
            errorResult = null;
        } else {
            errorResult = new ErrorResult("NOT_LOGIN", (String) null, (Map) null, 6, (a07) null);
        }
        if (errorResult != null) {
            return new tao<>(null, errorResult);
        }
        Context context = kdbVar.l().getContext();
        if (context == null) {
            return new tao<>(null, ErrorResult.a.Companion.g("NoAppContext"));
        }
        Object d = g(context, str, i()).d(str2);
        if (d != null) {
            str3 = d.toString();
        } else {
            str3 = null;
        }
        return new tao<>(str3, null);
    }

    public final String i() {
        koc g;
        String a2;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this});
        }
        if (!this.e || (g = cjf.INSTANCE.g()) == null || (a2 = g.a()) == null) {
            return null;
        }
        if (ckf.b(a2, this.c) && (str = this.d) != null) {
            return str;
        }
        Adler32 adler32 = this.b;
        byte[] bytes = a2.getBytes(uj3.UTF_8);
        ckf.f(bytes, "(this as java.lang.String).getBytes(charset)");
        adler32.update(bytes);
        this.c = a2;
        this.d = String.valueOf(this.b.getValue());
        this.b.reset();
        return this.d;
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        KVStorageImpl kVStorageImpl = this.f21700a;
        if (kVStorageImpl != null) {
            kVStorageImpl.c();
        }
        this.f21700a = null;
    }

    public final tao<Object, ErrorResult> k(kdb kdbVar, String str, String str2) {
        ErrorResult errorResult;
        koc g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("64f05fd9", new Object[]{this, kdbVar, str, str2});
        }
        ckf.g(kdbVar, "context");
        ckf.g(str, "bizID");
        ckf.g(str2, "key");
        if (!a(this) || (((g = cjf.INSTANCE.g()) == null || g.isLogin()) && b(this) != null)) {
            errorResult = null;
        } else {
            errorResult = new ErrorResult("NOT_LOGIN", (String) null, (Map) null, 6, (a07) null);
        }
        if (errorResult != null) {
            return new tao<>(null, errorResult);
        }
        Context context = kdbVar.l().getContext();
        if (context == null) {
            return new tao<>(null, ErrorResult.a.Companion.g("NoAppContext"));
        }
        g(context, str, i()).i(str2);
        return new tao<>(null, null);
    }

    public final tao<Object, ErrorResult> l(kdb kdbVar, String str, String str2, String str3) {
        koc g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tao) ipChange.ipc$dispatch("92d33ac5", new Object[]{this, kdbVar, str, str2, str3});
        }
        ckf.g(kdbVar, "context");
        ckf.g(str, "bizID");
        ckf.g(str2, "key");
        ckf.g(str3, "value");
        ErrorResult errorResult = (!a(this) || (((g = cjf.INSTANCE.g()) == null || g.isLogin()) && b(this) != null)) ? null : new ErrorResult("NOT_LOGIN", (String) null, (Map) null, 6, (a07) null);
        if (errorResult != null) {
            return new tao<>(null, errorResult);
        }
        Context context = kdbVar.l().getContext();
        if (context == null) {
            return new tao<>(null, ErrorResult.a.Companion.g("NoAppContext"));
        }
        Pair<String, String> j = g(context, str, i()).j(str2, str3);
        return new tao<>(null, j == null ? null : new ErrorResult(j.getFirst(), j.getSecond(), (Map) null, 4, (a07) null));
    }
}
