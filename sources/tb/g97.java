package tb;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteStatement;
import android.os.AsyncTask;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import tb.qpc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class g97 implements qpc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final exh f19797a = new exh(f5x.a());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ j f19798a;
        public final /* synthetic */ String b;
        public final /* synthetic */ CountDownLatch c;

        public a(j jVar, String str, CountDownLatch countDownLatch) {
            this.f19798a = jVar;
            this.b = str;
            this.c = countDownLatch;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            this.f19798a.f19807a = g97.i(g97.this, this.b);
            this.c.countDown();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f19799a;
        public final /* synthetic */ String b;
        public final /* synthetic */ qpc.a c;

        public b(String str, String str2, qpc.a aVar) {
            this.f19799a = str;
            this.b = str2;
            this.c = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Map<String, Object> g = eoq.g(g97.j(g97.this, this.f19799a, this.b, false, true));
            qpc.a aVar = this.c;
            if (aVar != null) {
                aVar.a(g);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f19800a;
        public final /* synthetic */ qpc.a b;

        public c(String str, qpc.a aVar) {
            this.f19800a = str;
            this.b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Map<String, Object> b = eoq.b(g97.i(g97.this, this.f19800a));
            qpc.a aVar = this.b;
            if (aVar != null) {
                aVar.a(b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ qpc.a f19801a;
        public final /* synthetic */ String b;

        public d(qpc.a aVar, String str) {
            this.f19801a = aVar;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            qpc.a aVar = this.f19801a;
            if (aVar != null) {
                aVar.a(g97.k(g97.this, this.b));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f19802a;
        public final /* synthetic */ qpc.a b;

        public e(String str, qpc.a aVar) {
            this.f19802a = str;
            this.b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Map<String, Object> f = eoq.f(g97.l(g97.this, this.f19802a));
            qpc.a aVar = this.b;
            if (aVar != null) {
                aVar.a(f);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ qpc.a f19803a;

        public f(qpc.a aVar) {
            this.f19803a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Map<String, Object> c = eoq.c(g97.m(g97.this));
            qpc.a aVar = this.f19803a;
            if (aVar != null) {
                aVar.a(c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ qpc.a f19804a;

        public g(qpc.a aVar) {
            this.f19804a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Map<String, Object> a2 = eoq.a(g97.n(g97.this));
            qpc.a aVar = this.f19804a;
            if (aVar != null) {
                aVar.a(a2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f19805a;
        public final /* synthetic */ String b;
        public final /* synthetic */ qpc.a c;

        public h(String str, String str2, qpc.a aVar) {
            this.f19805a = str;
            this.b = str2;
            this.c = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Map<String, Object> g = eoq.g(g97.j(g97.this, this.f19805a, this.b, true, true));
            qpc.a aVar = this.c;
            if (aVar != null) {
                aVar.a(g);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class i implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                g97.o(g97.this).e();
            } catch (Exception e) {
                dwh.f(exh.TAG_STORAGE, e.getMessage());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class j {

        /* renamed from: a  reason: collision with root package name */
        public String f19807a;

        static {
            t2o.a(982516173);
        }

        public j(g97 g97Var) {
        }
    }

    static {
        t2o.a(982516163);
        t2o.a(982516174);
    }

    public g97(Context context) {
    }

    public static /* synthetic */ String i(g97 g97Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("195bfe0c", new Object[]{g97Var, str});
        }
        return g97Var.r(str);
    }

    public static /* synthetic */ boolean j(g97 g97Var, String str, String str2, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee8e83c1", new Object[]{g97Var, str, str2, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        return g97Var.v(str, str2, z, z2);
    }

    public static /* synthetic */ Map k(g97 g97Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("22e0bc87", new Object[]{g97Var, str});
        }
        return g97Var.s(str);
    }

    public static /* synthetic */ boolean l(g97 g97Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56040235", new Object[]{g97Var, str})).booleanValue();
        }
        return g97Var.u(str);
    }

    public static /* synthetic */ long m(g97 g97Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3505e3a", new Object[]{g97Var})).longValue();
        }
        return g97Var.t();
    }

    public static /* synthetic */ List n(g97 g97Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b0479342", new Object[]{g97Var});
        }
        return g97Var.q();
    }

    public static /* synthetic */ exh o(g97 g97Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (exh) ipChange.ipc$dispatch("6e710459", new Object[]{g97Var});
        }
        return g97Var.f19797a;
    }

    @Override // tb.qpc
    public void a(String str, qpc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce49ba31", new Object[]{this, str, aVar});
        } else {
            p(new c(str, aVar));
        }
    }

    @Override // tb.qpc
    public void b(qpc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("defca3dd", new Object[]{this, aVar});
        } else {
            p(new g(aVar));
        }
    }

    @Override // tb.qpc
    public void c(String str, qpc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4226bd32", new Object[]{this, str, aVar});
        } else {
            p(new d(aVar, str));
        }
    }

    @Override // tb.qpc
    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else {
            p(new i());
        }
    }

    @Override // tb.qpc
    public String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("47b6b286", new Object[]{this, str});
        }
        j jVar = new j(this);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        p(new a(jVar, str, countDownLatch));
        try {
            countDownLatch.await(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
        return jVar.f19807a;
    }

    @Override // tb.qpc
    public void e(String str, String str2, qpc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("544a943e", new Object[]{this, str, str2, aVar});
        } else {
            p(new h(str, str2, aVar));
        }
    }

    @Override // tb.qpc
    public void f(String str, String str2, qpc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f14ac07", new Object[]{this, str, str2, aVar});
        } else {
            p(new b(str, str2, aVar));
        }
    }

    @Override // tb.qpc
    public void g(String str, qpc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4352435f", new Object[]{this, str, aVar});
        } else {
            p(new e(str, aVar));
        }
    }

    @Override // tb.qpc
    public void h(qpc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e24cb704", new Object[]{this, aVar});
        } else {
            p(new f(aVar));
        }
    }

    public final void p(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
        } else {
            AsyncTask.SERIAL_EXECUTOR.execute(runnable);
        }
    }

    public final List<String> q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("de60e9a0", new Object[]{this});
        }
        SQLiteDatabase C = this.f19797a.C();
        if (C == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Cursor query = C.query(exh.TABLE_STORAGE, new String[]{"key"}, null, null, null, null, null);
        while (query.moveToNext()) {
            try {
                arrayList.add(query.getString(query.getColumnIndex("key")));
            } catch (Exception e2) {
                dwh.f(exh.TAG_STORAGE, "DefaultWXStorage occurred an exception when execute getAllKeys:" + e2.getMessage());
                return arrayList;
            } finally {
                query.close();
            }
        }
        return arrayList;
    }

    public final Map<String, Object> s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6289ba11", new Object[]{this, str});
        }
        SQLiteDatabase C = this.f19797a.C();
        if (C == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Cursor query = C.query(exh.TABLE_STORAGE, new String[]{"key", "value"}, "key like ?", new String[]{str + f7l.MOD}, null, null, null);
        while (query.moveToNext()) {
            try {
                hashMap.put(query.getString(query.getColumnIndex("key")), query.getString(query.getColumnIndex("value")));
            } catch (Exception e2) {
                dwh.f(exh.TAG_STORAGE, "DefaultWXStorage occurred an exception when execute getAllKeys:" + e2.getMessage());
                return hashMap;
            } finally {
                query.close();
            }
        }
        return hashMap;
    }

    public final long t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("880ea276", new Object[]{this})).longValue();
        }
        SQLiteDatabase C = this.f19797a.C();
        if (C == null) {
            return 0L;
        }
        SQLiteStatement sQLiteStatement = null;
        try {
            try {
                sQLiteStatement = C.compileStatement("SELECT count(key) FROM default_wx_storage");
                long simpleQueryForLong = sQLiteStatement.simpleQueryForLong();
                sQLiteStatement.close();
                return simpleQueryForLong;
            } catch (Exception e2) {
                dwh.f(exh.TAG_STORAGE, "DefaultWXStorage occurred an exception when execute getLength:" + e2.getMessage());
                if (sQLiteStatement != null) {
                    sQLiteStatement.close();
                }
                return 0L;
            }
        } catch (Throwable th) {
            if (sQLiteStatement != null) {
                sQLiteStatement.close();
            }
            throw th;
        }
    }

    public final String r(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e45b2447", new Object[]{this, str});
        }
        SQLiteDatabase C = this.f19797a.C();
        if (C == null) {
            return null;
        }
        Cursor query = C.query(exh.TABLE_STORAGE, new String[]{"value"}, "key=?", new String[]{str}, null, null, null);
        try {
            try {
                if (query.moveToNext()) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("timestamp", exh.d.format(new Date()));
                    int update = this.f19797a.C().update(exh.TABLE_STORAGE, contentValues, "key= ?", new String[]{str});
                    StringBuilder sb = new StringBuilder("update timestamp ");
                    if (update == 1) {
                        str2 = "success";
                    } else {
                        str2 = "failed";
                    }
                    sb.append(str2);
                    sb.append(" for operation [getItem(key = ");
                    sb.append(str);
                    sb.append(")]");
                    dwh.b(exh.TAG_STORAGE, sb.toString());
                    String string = query.getString(query.getColumnIndex("value"));
                    query.close();
                    return string;
                }
                query.close();
                return null;
            } catch (Exception e2) {
                dwh.f(exh.TAG_STORAGE, "DefaultWXStorage occurred an exception when execute getItem:" + e2.getMessage());
                query.close();
                return null;
            }
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }

    public g97() {
    }

    public final boolean u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c428348d", new Object[]{this, str})).booleanValue();
        }
        SQLiteDatabase C = this.f19797a.C();
        if (C == null) {
            return false;
        }
        try {
            return C.delete(exh.TABLE_STORAGE, "key=?", new String[]{str}) == 1;
        } catch (Exception e2) {
            dwh.f(exh.TAG_STORAGE, "DefaultWXStorage occurred an exception when execute removeItem:" + e2.getMessage());
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean w() {
        /*
            r14 = this;
            r0 = 0
            r1 = 1
            java.lang.String r2 = "mus_storage"
            com.android.alibaba.ip.runtime.IpChange r3 = tb.g97.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001c
            java.lang.String r2 = "c41e5169"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r14
            java.lang.Object r0 = r3.ipc$dispatch(r2, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x001c:
            tb.exh r3 = r14.f19797a
            android.database.sqlite.SQLiteDatabase r4 = r3.C()
            if (r4 != 0) goto L_0x0025
            return r0
        L_0x0025:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.String r12 = "key"
            java.lang.String r13 = "persistent"
            java.lang.String[] r6 = new java.lang.String[]{r12, r13}
            r10 = 0
            java.lang.String r11 = "timestamp ASC"
            java.lang.String r5 = "default_wx_storage"
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r4 = r4.query(r5, r6, r7, r8, r9, r10, r11)
            int r5 = r4.getCount()     // Catch: all -> 0x006a, Exception -> 0x0072
            int r5 = r5 / 10
            r6 = 0
        L_0x0048:
            boolean r7 = r4.moveToNext()     // Catch: all -> 0x006a, Exception -> 0x006c
            if (r7 == 0) goto L_0x006e
            int r7 = r4.getColumnIndex(r12)     // Catch: all -> 0x006a, Exception -> 0x006c
            java.lang.String r7 = r4.getString(r7)     // Catch: all -> 0x006a, Exception -> 0x006c
            int r8 = r4.getColumnIndex(r13)     // Catch: all -> 0x006a, Exception -> 0x006c
            int r8 = r4.getInt(r8)     // Catch: all -> 0x006a, Exception -> 0x006c
            if (r8 != r1) goto L_0x0061
            goto L_0x0048
        L_0x0061:
            if (r7 == 0) goto L_0x0048
            int r6 = r6 + r1
            r3.add(r7)     // Catch: all -> 0x006a, Exception -> 0x006c
            if (r6 != r5) goto L_0x0048
            goto L_0x006e
        L_0x006a:
            r0 = move-exception
            goto L_0x00bc
        L_0x006c:
            r5 = move-exception
            goto L_0x0074
        L_0x006e:
            r4.close()
            goto L_0x008d
        L_0x0072:
            r5 = move-exception
            r6 = 0
        L_0x0074:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: all -> 0x006a
            r7.<init>()     // Catch: all -> 0x006a
            java.lang.String r8 = "DefaultWXStorage occurred an exception when execute trimToSize:"
            r7.append(r8)     // Catch: all -> 0x006a
            java.lang.String r5 = r5.getMessage()     // Catch: all -> 0x006a
            r7.append(r5)     // Catch: all -> 0x006a
            java.lang.String r5 = r7.toString()     // Catch: all -> 0x006a
            tb.dwh.f(r2, r5)     // Catch: all -> 0x006a
            goto L_0x006e
        L_0x008d:
            if (r6 > 0) goto L_0x0090
            return r0
        L_0x0090:
            java.util.Iterator r0 = r3.iterator()
        L_0x0094:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x00a4
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            r14.u(r3)
            goto L_0x0094
        L_0x00a4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "remove "
            r0.<init>(r3)
            r0.append(r6)
            java.lang.String r3 = " items by lru"
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            tb.dwh.f(r2, r0)
            return r1
        L_0x00bc:
            r4.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.g97.w():boolean");
    }

    public final boolean v(String str, String str2, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b93ccd3", new Object[]{this, str, str2, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        SQLiteDatabase C = this.f19797a.C();
        if (C == null) {
            return false;
        }
        dwh.b(exh.TAG_STORAGE, "set k-v to storage(key:" + str + ",value:" + str2 + ",isPersistent:" + z + ",allowRetry:" + z2 + f7l.BRACKET_END_STR);
        String format = exh.d.format(new Date());
        SQLiteStatement sQLiteStatement = null;
        try {
            try {
                sQLiteStatement = C.compileStatement("INSERT OR REPLACE INTO default_wx_storage VALUES (?,?,?,?);");
                sQLiteStatement.clearBindings();
                sQLiteStatement.bindString(1, str);
                sQLiteStatement.bindString(2, str2);
                sQLiteStatement.bindString(3, format);
                sQLiteStatement.bindLong(4, z ? 1L : 0L);
                sQLiteStatement.execute();
                sQLiteStatement.close();
                return true;
            } catch (Exception e2) {
                dwh.f(exh.TAG_STORAGE, "DefaultWXStorage occurred an exception when execute setItem :" + e2.getMessage());
                if ((e2 instanceof SQLiteFullException) && z2 && w()) {
                    dwh.b(exh.TAG_STORAGE, "retry set k-v to storage(key:" + str + ",value:" + str2 + f7l.BRACKET_END_STR);
                    boolean v = v(str, str2, z, false);
                    if (sQLiteStatement != null) {
                        sQLiteStatement.close();
                    }
                    return v;
                } else if (sQLiteStatement == null) {
                    return false;
                } else {
                    sQLiteStatement.close();
                    return false;
                }
            }
        } catch (Throwable th) {
            if (sQLiteStatement != null) {
                sQLiteStatement.close();
            }
            throw th;
        }
    }
}
