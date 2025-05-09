package com.alibaba.ability.impl.kvstorage;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.protodb.Config;
import com.taobao.android.protodb.LSDB;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.jvm.JvmStatic;
import tb.a07;
import tb.ckf;
import tb.eji;
import tb.jpf;
import tb.k3g;
import tb.njg;
import tb.ph9;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class KVStorageImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static final njg f = kotlin.a.b(KVStorageImpl$Companion$deleteRunner$2.INSTANCE);

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f1960a;
    public final LSDB b;
    public final String c;
    public final String d;
    public final long e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(111149062);
        }

        public a() {
        }

        public static final /* synthetic */ eji a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (eji) ipChange.ipc$dispatch("c27f21d0", new Object[]{aVar});
            }
            return aVar.b();
        }

        public final eji b() {
            Object value;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                value = ipChange.ipc$dispatch("bcd612bb", new Object[]{this});
            } else {
                value = KVStorageImpl.a().getValue();
            }
            return (eji) value;
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        @JvmStatic
        public final KVStorageImpl c(Context context, String str, String str2, long j) {
            String str3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (KVStorageImpl) ipChange.ipc$dispatch("6c034d84", new Object[]{this, context, str, str2, new Long(j)});
            }
            ckf.g(context, "context");
            ckf.g(str, "fileName");
            if (str2 == null) {
                str3 = str;
            } else {
                Context applicationContext = context.getApplicationContext();
                ckf.f(applicationContext, "context.applicationContext");
                File file = new File(applicationContext.getFilesDir(), "lsdb-kv_storage_session");
                File file2 = new File(file, str2);
                if (!file2.exists()) {
                    Context applicationContext2 = context.getApplicationContext();
                    ckf.f(applicationContext2, "context.applicationContext");
                    File file3 = new File(applicationContext2.getFilesDir(), "mega_kv_session_to_delete");
                    file3.mkdirs();
                    if (!file3.exists()) {
                        ph9.f(file);
                    } else {
                        file.renameTo(new File(file3, String.valueOf(System.currentTimeMillis())));
                        eji.j(a(this), new com.alibaba.ability.impl.kvstorage.a(file3), 0L, null, 6, null);
                    }
                    file2.mkdirs();
                }
                StringBuilder sb = new StringBuilder("kv_storage_session");
                String str4 = File.separator;
                sb.append(str4);
                sb.append(str2);
                sb.append(str4);
                sb.append(str);
                str3 = sb.toString();
            }
            Config config = new Config();
            config.walSize = 524288;
            xhv xhvVar = xhv.INSTANCE;
            LSDB open = LSDB.open(str3, config);
            ckf.f(open, "LSDB.open(lsdbModule, Co… * 512\n                })");
            Context applicationContext3 = context.getApplicationContext();
            ckf.f(applicationContext3, "context.applicationContext");
            File filesDir = applicationContext3.getFilesDir();
            String absolutePath = new File(filesDir, "lsdb-" + str3).getAbsolutePath();
            ckf.f(absolutePath, "File(context.application…lsdbModule\").absolutePath");
            return new KVStorageImpl(open, str, absolutePath, j, null);
        }
    }

    static {
        t2o.a(111149061);
    }

    public KVStorageImpl(LSDB lsdb, String str, String str2, long j) {
        this.b = lsdb;
        this.c = str;
        this.d = str2;
        this.e = j;
        AtomicInteger atomicInteger = new AtomicInteger(0);
        this.f1960a = atomicInteger;
        atomicInteger.addAndGet((int) lsdb.getLong(new k3g("__current_file_values_size__")));
    }

    public static final /* synthetic */ njg a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njg) ipChange.ipc$dispatch("50415f96", new Object[0]);
        }
        return f;
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        this.b.close();
        ph9.f(new File(this.d));
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else {
            this.b.close();
        }
    }

    public final Object d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("352acab", new Object[]{this, str});
        }
        ckf.g(str, "key");
        return this.b.getString(new k3g(str));
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("787e7f7c", new Object[]{this});
        }
        return this.c;
    }

    public final long f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a6be383d", new Object[]{this})).longValue();
        }
        return this.e;
    }

    public final long g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9d7e578e", new Object[]{this})).longValue();
        }
        return this.f1960a.longValue();
    }

    public final List<String> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e373c746", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        jpf<k3g> keyIterator = this.b.keyIterator();
        for (k3g next = keyIterator.next(); next != null; next = keyIterator.next()) {
            String a2 = next.a();
            if (a2 == null) {
                a2 = "";
            }
            if (!ckf.b("__current_file_values_size__", a2) && this.b.contains(next)) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    public final void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39af3815", new Object[]{this, str});
            return;
        }
        ckf.g(str, "key");
        k3g k3gVar = new k3g(str);
        this.f1960a.addAndGet(-this.b.getDataSize(k3gVar));
        this.b.delete(k3gVar);
        this.b.insertLong(new k3g("__current_file_values_size__"), this.f1960a.get());
    }

    public final Pair<String, String> j(String str, Object obj) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("2a18fcf8", new Object[]{this, str, obj});
        }
        ckf.g(str, "key");
        if (this.f1960a.get() >= this.e) {
            return new Pair<>("QUOTA_EXHAUSTED", "当前业务已无存储空间，请清理后再试, 配额=" + this.e);
        }
        k3g k3gVar = new k3g(str);
        this.f1960a.addAndGet(-this.b.getDataSize(k3gVar));
        LSDB lsdb = this.b;
        if (obj == null || (str2 = obj.toString()) == null) {
            str2 = "";
        }
        lsdb.insertString(k3gVar, str2);
        this.f1960a.addAndGet(this.b.getDataSize(k3gVar));
        this.b.insertLong(new k3g("__current_file_values_size__"), this.f1960a.get());
        return null;
    }

    public /* synthetic */ KVStorageImpl(LSDB lsdb, String str, String str2, long j, a07 a07Var) {
        this(lsdb, str, str2, j);
    }
}
