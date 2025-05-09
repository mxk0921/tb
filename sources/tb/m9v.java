package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.protodb.LSDB;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class m9v {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ConcurrentHashMap<String, m9v> c = new ConcurrentHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public final String f23869a;
    public final LSDB b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends wz<Boolean, LSDB> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f23870a;
        public final /* synthetic */ Boolean b;

        public a(m9v m9vVar, String str, Boolean bool) {
            this.f23870a = str;
            this.b = bool;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultron/utils/UltronMMKV$10");
        }

        /* renamed from: b */
        public Boolean a(LSDB lsdb) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Boolean) ipChange.ipc$dispatch("7ebb702b", new Object[]{this, lsdb});
            }
            String string = lsdb.getString(new k3g(this.f23870a));
            if (string == null) {
                return this.b;
            }
            return Boolean.valueOf("true".equalsIgnoreCase(string));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b extends wz<Boolean, LSDB> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f23871a;
        public final /* synthetic */ byte[] b;

        public b(m9v m9vVar, String str, byte[] bArr) {
            this.f23871a = str;
            this.b = bArr;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultron/utils/UltronMMKV$1");
        }

        /* renamed from: b */
        public Boolean a(LSDB lsdb) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Boolean) ipChange.ipc$dispatch("7ebb702b", new Object[]{this, lsdb});
            }
            return Boolean.valueOf(lsdb.insertBinary(new k3g(this.f23871a), this.b));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c extends wz<byte[], LSDB> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f23872a;

        public c(m9v m9vVar, String str) {
            this.f23872a = str;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultron/utils/UltronMMKV$2");
        }

        /* renamed from: b */
        public byte[] a(LSDB lsdb) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("aacd786f", new Object[]{this, lsdb});
            }
            return lsdb.getBinary(new k3g(this.f23872a));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d extends wz<Boolean, LSDB> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f23873a;
        public final /* synthetic */ String b;

        public d(m9v m9vVar, String str, String str2) {
            this.f23873a = str;
            this.b = str2;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultron/utils/UltronMMKV$3");
        }

        /* renamed from: b */
        public Boolean a(LSDB lsdb) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Boolean) ipChange.ipc$dispatch("7ebb702b", new Object[]{this, lsdb});
            }
            return Boolean.valueOf(lsdb.insertString(new k3g(this.f23873a), this.b));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e extends wz<String, LSDB> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f23874a;

        public e(m9v m9vVar, String str) {
            this.f23874a = str;
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultron/utils/UltronMMKV$4");
        }

        /* renamed from: b */
        public String a(LSDB lsdb) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b11a0832", new Object[]{this, lsdb});
            }
            return lsdb.getString(new k3g(this.f23874a));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class f extends wz<Boolean, LSDB> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f23875a;
        public final /* synthetic */ int b;

        public f(m9v m9vVar, String str, int i) {
            this.f23875a = str;
            this.b = i;
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultron/utils/UltronMMKV$5");
        }

        /* renamed from: b */
        public Boolean a(LSDB lsdb) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Boolean) ipChange.ipc$dispatch("7ebb702b", new Object[]{this, lsdb});
            }
            return Boolean.valueOf(lsdb.insertInt(new k3g(this.f23875a), this.b));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class g extends wz<Integer, LSDB> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f23876a;

        public g(m9v m9vVar, String str) {
            this.f23876a = str;
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultron/utils/UltronMMKV$6");
        }

        /* renamed from: b */
        public Integer a(LSDB lsdb) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Integer) ipChange.ipc$dispatch("2923fdd5", new Object[]{this, lsdb});
            }
            return Integer.valueOf(lsdb.getInt(new k3g(this.f23876a)));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class h extends wz<Boolean, LSDB> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f23877a;
        public final /* synthetic */ long b;

        public h(m9v m9vVar, String str, long j) {
            this.f23877a = str;
            this.b = j;
        }

        public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultron/utils/UltronMMKV$7");
        }

        /* renamed from: b */
        public Boolean a(LSDB lsdb) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Boolean) ipChange.ipc$dispatch("7ebb702b", new Object[]{this, lsdb});
            }
            return Boolean.valueOf(lsdb.insertLong(new k3g(this.f23877a), this.b));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class i extends wz<Long, LSDB> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f23878a;

        public i(m9v m9vVar, String str) {
            this.f23878a = str;
        }

        public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultron/utils/UltronMMKV$8");
        }

        /* renamed from: b */
        public Long a(LSDB lsdb) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Long) ipChange.ipc$dispatch("2559c927", new Object[]{this, lsdb});
            }
            return Long.valueOf(lsdb.getLong(new k3g(this.f23878a)));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class j extends wz<Boolean, LSDB> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f23879a;
        public final /* synthetic */ boolean b;

        public j(m9v m9vVar, String str, boolean z) {
            this.f23879a = str;
            this.b = z;
        }

        public static /* synthetic */ Object ipc$super(j jVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultron/utils/UltronMMKV$9");
        }

        /* renamed from: b */
        public Boolean a(LSDB lsdb) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Boolean) ipChange.ipc$dispatch("7ebb702b", new Object[]{this, lsdb});
            }
            return Boolean.valueOf(lsdb.insertString(new k3g(this.f23879a), Boolean.toString(this.b)));
        }
    }

    static {
        t2o.a(83886331);
    }

    public m9v(String str, LSDB lsdb) {
        this.f23869a = str;
        this.b = lsdb;
    }

    public static m9v d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m9v) ipChange.ipc$dispatch("7467b199", new Object[]{str});
        }
        return e(str, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static tb.m9v e(java.lang.String r4, com.taobao.android.protodb.Config r5) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.m9v.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = "ecb20ca4"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r4 = 1
            r2[r4] = r5
            java.lang.Object r4 = r0.ipc$dispatch(r1, r2)
            tb.m9v r4 = (tb.m9v) r4
            return r4
        L_0x0018:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, tb.m9v> r0 = tb.m9v.c
            java.lang.Object r1 = r0.get(r4)
            tb.m9v r1 = (tb.m9v) r1
            if (r1 == 0) goto L_0x0023
            return r1
        L_0x0023:
            tb.m9v r2 = new tb.m9v     // Catch: Exception -> 0x0033
            com.taobao.android.protodb.LSDB r5 = com.taobao.android.protodb.LSDB.open(r4, r5)     // Catch: Exception -> 0x0033
            r2.<init>(r4, r5)     // Catch: Exception -> 0x0033
            r0.put(r4, r2)     // Catch: Exception -> 0x0030
            goto L_0x004a
        L_0x0030:
            r5 = move-exception
            r1 = r2
            goto L_0x0034
        L_0x0033:
            r5 = move-exception
        L_0x0034:
            tb.xh8 r0 = tb.xh8.a(r4)
            java.lang.String r2 = "UltronMMKV#LSDBInitException"
            tb.xh8 r0 = r0.c(r2)
            java.lang.String r5 = r5.getMessage()
            tb.xh8 r5 = r0.message(r5)
            tb.f9v.q(r5)
            r2 = r1
        L_0x004a:
            if (r2 != 0) goto L_0x0052
            tb.m9v r2 = new tb.m9v
            r5 = 0
            r2.<init>(r4, r5)
        L_0x0052:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.m9v.e(java.lang.String, com.taobao.android.protodb.Config):tb.m9v");
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fdedbf74", new Object[]{this, str})).booleanValue();
        }
        if (m()) {
            return false;
        }
        return this.b.contains(new k3g(str));
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea815e00", new Object[]{this, str})).booleanValue();
        }
        if (m()) {
            return false;
        }
        return this.b.delete(new k3g(str));
    }

    public final <T> T c(String str, wz<T, LSDB> wzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("4fbf001a", new Object[]{this, str, wzVar});
        }
        if (m()) {
            return null;
        }
        try {
            return wzVar.a(this.b);
        } catch (Exception e2) {
            xh8 a2 = xh8.a(this.f23869a);
            f9v.q(a2.c("UltronMMKV#" + str).message(e2.getMessage()));
            return null;
        }
    }

    public byte[] f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("18cc0395", new Object[]{this, str});
        }
        return (byte[]) c("getBinary", new c(this, str));
    }

    public boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cdc615f5", new Object[]{this, str})).booleanValue();
        }
        return h(str, false);
    }

    public boolean h(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eafd5b07", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        Boolean i2 = i(str, Boolean.valueOf(z));
        if (i2 == null) {
            return z;
        }
        return i2.booleanValue();
    }

    public Boolean i(String str, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("123057c2", new Object[]{this, str, bool});
        }
        Boolean bool2 = (Boolean) c("getBool", new a(this, str, bool));
        if (bool2 == null) {
            return bool;
        }
        return bool2;
    }

    public int j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c755427d", new Object[]{this, str})).intValue();
        }
        Integer num = (Integer) c("getInt", new g(this, str));
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public long k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7149c7f7", new Object[]{this, str})).longValue();
        }
        Long l = (Long) c("getLong", new i(this, str));
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    public String l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba42c148", new Object[]{this, str});
        }
        return (String) c("getString", new e(this, str));
    }

    public final boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73123f78", new Object[]{this})).booleanValue();
        }
        if (this.b == null) {
            return true;
        }
        return false;
    }

    public final boolean n(String str, wz<Boolean, LSDB> wzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb06d643", new Object[]{this, str, wzVar})).booleanValue();
        }
        if (m()) {
            return false;
        }
        try {
            return wzVar.a(this.b).booleanValue();
        } catch (Exception e2) {
            xh8 a2 = xh8.a(this.f23869a);
            f9v.q(a2.c("UltronMMKV#" + str).message(e2.getMessage()));
            return false;
        }
    }

    public boolean o(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5491fcfa", new Object[]{this, str, bArr})).booleanValue();
        }
        return n("saveBinary", new b(this, str, bArr));
    }

    public boolean p(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed920880", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        return n("saveBool", new j(this, str, z));
    }

    public boolean q(String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b26c124", new Object[]{this, str, new Integer(i2)})).booleanValue();
        }
        return n("saveInt", new f(this, str, i2));
    }

    public boolean r(String str, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba845c9e", new Object[]{this, str, new Long(j2)})).booleanValue();
        }
        return n("saveLong", new h(this, str, j2));
    }

    public boolean s(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b91e780d", new Object[]{this, str, str2})).booleanValue();
        }
        return n("saveString", new d(this, str, str2));
    }
}
