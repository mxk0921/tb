package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class zp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f32916a;
    public String b;
    public byte[] c;
    public long d;
    public long e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends ByteArrayOutputStream {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(374341665);
        }

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -578249333) {
                super.flush();
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/alivfssdk/cache/AVFSSQLiteCacheItem$ByteArrayOutputStream");
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd889d8b", new Object[]{this});
                return;
            }
            super.flush();
            zp.this.c = toByteArray();
            zp.this.d = size();
        }
    }

    static {
        t2o.a(374341664);
    }

    public zp(String str, ps2 ps2Var) {
        this.f32916a = str;
        if (ps2Var instanceof cpl) {
            cpl cplVar = (cpl) ps2Var;
            if (!TextUtils.isEmpty(cplVar.b)) {
                this.b = cplVar.b;
                return;
            }
        }
        String str2 = this.b;
        this.b = str2 == null ? "" : str2;
    }

    public static void a(up upVar) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("689f5773", new Object[]{upVar});
            return;
        }
        try {
            upVar.d("CREATE TABLE IF NOT EXISTS AVFS_KV_TABLE(key TEXT, key2 TEXT, value BLOB, size INTEGER, time INTEGER, PRIMARY KEY(key, key2));");
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

    public static boolean c(up upVar) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a2b7533", new Object[]{upVar})).booleanValue();
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            boolean d = upVar.d("DELETE FROM AVFS_KV_TABLE");
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            StringBuilder sb = new StringBuilder("delete: ");
            sb.append(currentTimeMillis2);
            sb.append("ms");
            return d;
        } catch (Exception e) {
            pp.d("AVFSSQLiteCacheItem", e, "Error encountered on deleteAll the TABLE=AVFS_KV_TABLE");
            throw new IOException(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<java.lang.String> d(tb.up r6, java.lang.String r7) throws java.io.IOException {
        /*
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.zp.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0018
            java.lang.String r3 = "c2112ddb"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r6
            r4[r0] = r7
            java.lang.Object r6 = r2.ipc$dispatch(r3, r4)
            java.util.List r6 = (java.util.List) r6
            return r6
        L_0x0018:
            java.lang.System.currentTimeMillis()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
            java.lang.String r4 = "SELECT key2 FROM AVFS_KV_TABLE WHERE key = ?"
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch: all -> 0x0044, Exception -> 0x0046
            r5[r1] = r7     // Catch: all -> 0x0044, Exception -> 0x0046
            tb.sp r3 = r6.c(r4, r5)     // Catch: all -> 0x0044, Exception -> 0x0046
            java.lang.System.currentTimeMillis()     // Catch: all -> 0x0044, Exception -> 0x0046
            if (r3 == 0) goto L_0x004e
            boolean r6 = r3.e()     // Catch: all -> 0x0044, Exception -> 0x0046
            if (r6 == 0) goto L_0x004e
        L_0x0036:
            java.lang.String r6 = r3.d(r1)     // Catch: all -> 0x0044, Exception -> 0x0046
            boolean r4 = android.text.TextUtils.isEmpty(r6)     // Catch: all -> 0x0044, Exception -> 0x0046
            if (r4 != 0) goto L_0x0048
            r2.add(r6)     // Catch: all -> 0x0044, Exception -> 0x0046
            goto L_0x0048
        L_0x0044:
            r6 = move-exception
            goto L_0x0074
        L_0x0046:
            r6 = move-exception
            goto L_0x0054
        L_0x0048:
            boolean r6 = r3.e()     // Catch: all -> 0x0044, Exception -> 0x0046
            if (r6 != 0) goto L_0x0036
        L_0x004e:
            if (r3 == 0) goto L_0x0053
            r3.a()
        L_0x0053:
            return r2
        L_0x0054:
            java.lang.String r2 = "AVFSSQLiteCacheItem"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: all -> 0x0044
            r4.<init>()     // Catch: all -> 0x0044
            java.lang.String r5 = "Error encountered on extendsKeysForKey the key="
            r4.append(r5)     // Catch: all -> 0x0044
            r4.append(r7)     // Catch: all -> 0x0044
            java.lang.String r7 = r4.toString()     // Catch: all -> 0x0044
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: all -> 0x0044
            r0[r1] = r7     // Catch: all -> 0x0044
            tb.pp.d(r2, r6, r0)     // Catch: all -> 0x0044
            java.io.IOException r7 = new java.io.IOException     // Catch: all -> 0x0044
            r7.<init>(r6)     // Catch: all -> 0x0044
            throw r7     // Catch: all -> 0x0044
        L_0x0074:
            if (r3 == 0) goto L_0x0079
            r3.a()
        L_0x0079:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.zp.d(tb.up, java.lang.String):java.util.List");
    }

    public static zp e(up upVar, String str, String str2) throws IOException {
        Throwable th;
        Exception e;
        sp c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zp) ipChange.ipc$dispatch("d404f075", new Object[]{upVar, str, str2});
        }
        sp spVar = null;
        try {
            try {
                System.currentTimeMillis();
                try {
                    try {
                        c = upVar.c("SELECT  * FROM AVFS_KV_TABLE WHERE key = ? AND key2 = ? LIMIT 1", new Object[]{str, str2});
                    } catch (Exception e2) {
                        e = e2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e3) {
                e = e3;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            System.currentTimeMillis();
            if (c == null || !c.e()) {
                pp.f("AVFSSQLiteCacheItem", "No item found to select.");
                if (c != null) {
                    c.a();
                }
                return null;
            }
            zp i = i(c);
            c.a();
            return i;
        } catch (Exception e4) {
            e = e4;
            spVar = c;
            pp.d("AVFSSQLiteCacheItem", e, "Error encountered on selecting the key=" + str);
            throw new IOException(e);
        } catch (Throwable th4) {
            th = th4;
            spVar = c;
            if (spVar != null) {
                spVar.a();
            }
            throw th;
        }
    }

    public static zp f(up upVar, String str, ps2 ps2Var) throws IOException {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zp) ipChange.ipc$dispatch("34312f08", new Object[]{upVar, str, ps2Var});
        }
        if (ps2Var instanceof cpl) {
            cpl cplVar = (cpl) ps2Var;
            if (!TextUtils.isEmpty(cplVar.b)) {
                str2 = cplVar.b;
                return e(upVar, str, str2);
            }
        }
        str2 = "";
        return e(upVar, str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static tb.zp[] g(tb.up r4) throws java.io.IOException {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.zp.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "3fc2adc2"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            java.lang.Object r4 = r0.ipc$dispatch(r1, r2)
            tb.zp[] r4 = (tb.zp[]) r4
            return r4
        L_0x0015:
            java.lang.System.currentTimeMillis()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            java.lang.String r2 = "SELECT * FROM AVFS_KV_TABLE"
            tb.sp r1 = r4.b(r2)     // Catch: all -> 0x003a, Exception -> 0x003c
            if (r1 == 0) goto L_0x003e
            boolean r4 = r1.e()     // Catch: all -> 0x003a, Exception -> 0x003c
            if (r4 == 0) goto L_0x003e
        L_0x002c:
            tb.zp r4 = i(r1)     // Catch: all -> 0x003a, Exception -> 0x003c
            r0.add(r4)     // Catch: all -> 0x003a, Exception -> 0x003c
            boolean r4 = r1.e()     // Catch: all -> 0x003a, Exception -> 0x003c
            if (r4 != 0) goto L_0x002c
            goto L_0x003e
        L_0x003a:
            r4 = move-exception
            goto L_0x0056
        L_0x003c:
            r4 = move-exception
            goto L_0x0050
        L_0x003e:
            if (r1 == 0) goto L_0x0043
            r1.a()
        L_0x0043:
            int r4 = r0.size()
            tb.zp[] r4 = new tb.zp[r4]
            r0.toArray(r4)
            java.lang.System.currentTimeMillis()
            return r4
        L_0x0050:
            java.io.IOException r0 = new java.io.IOException     // Catch: all -> 0x003a
            r0.<init>(r4)     // Catch: all -> 0x003a
            throw r0     // Catch: all -> 0x003a
        L_0x0056:
            if (r1 == 0) goto L_0x005b
            r1.a()
        L_0x005b:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.zp.g(tb.up):tb.zp[]");
    }

    public static zp i(sp spVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zp) ipChange.ipc$dispatch("832af1d2", new Object[]{spVar});
        }
        zp zpVar = new zp();
        zpVar.f32916a = spVar.d(0);
        zpVar.b = spVar.d(1);
        zpVar.c = spVar.b(2);
        zpVar.d = spVar.c(3);
        zpVar.e = spVar.c(4);
        return zpVar;
    }

    public boolean b(up upVar) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2167685e", new Object[]{this, upVar})).booleanValue();
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            boolean e = upVar.e("DELETE FROM AVFS_KV_TABLE WHERE key = ? AND key2 = ?", new Object[]{this.f32916a, this.b});
            StringBuilder sb = new StringBuilder("delete: ");
            sb.append(System.currentTimeMillis() - currentTimeMillis);
            sb.append("ms");
            return e;
        } catch (Exception e2) {
            pp.d("AVFSSQLiteCacheItem", e2, "Error encountered on selecting the key=" + this.f32916a);
            throw new IOException(e2);
        }
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || zp.class != obj.getClass()) {
            return false;
        }
        zp zpVar = (zp) obj;
        if (this.d != zpVar.d || this.e != zpVar.e) {
            return false;
        }
        String str = this.f32916a;
        if (str == null ? zpVar.f32916a == null : str.equals(zpVar.f32916a)) {
            return Arrays.equals(this.c, zpVar.c);
        }
        return false;
    }

    public final Object[] h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Object[]) ipChange.ipc$dispatch("1b06ed86", new Object[]{this});
        }
        return new Object[]{this.f32916a, this.b, this.c, Long.valueOf(this.d), Long.valueOf(this.e)};
    }

    public int hashCode() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        String str = this.f32916a;
        if (str != null) {
            i = str.hashCode();
        }
        long j = this.d;
        long j2 = this.e;
        return (((((i * 31) + Arrays.hashCode(this.c)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public void j(up upVar) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86fbd48", new Object[]{this, upVar});
        } else if (this.f32916a == null) {
            throw new IllegalArgumentException("key cannot be null");
        } else if (this.c != null) {
            try {
                System.currentTimeMillis();
                upVar.e("REPLACE INTO AVFS_KV_TABLE VALUES(?,?,?,?,?)", h());
                System.currentTimeMillis();
            } catch (Exception e) {
                throw new IOException(e);
            }
        } else {
            throw new IllegalArgumentException("value cannot be null");
        }
    }

    public boolean k(up upVar, long j) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6cd1dfef", new Object[]{this, upVar, new Long(j)})).booleanValue();
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            boolean e = upVar.e("UPDATE AVFS_KV_TABLE SET time = ? WHERE key = ? AND key2 = ?", new Object[]{Long.valueOf(j), this.f32916a, this.b});
            if (e) {
                this.e = j;
            }
            StringBuilder sb = new StringBuilder("updateReadTime:");
            sb.append(System.currentTimeMillis() - currentTimeMillis);
            sb.append(" ms ");
            return e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public zp() {
    }
}
