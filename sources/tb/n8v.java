package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class n8v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f24573a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f24574a;
        public final /* synthetic */ String b;
        public final /* synthetic */ byte[] c;
        public final /* synthetic */ c d;

        public a(Context context, String str, byte[] bArr, c cVar) {
            this.f24574a = context;
            this.b = str;
            this.c = bArr;
            this.d = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (n8v.this.l(this.f24574a, this.b, this.c)) {
                n8v.a(n8v.this, this.d, this.c);
            } else {
                n8v.b(n8v.this, this.d, "保存失败");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f24575a;
        public final /* synthetic */ String b;

        public b(Context context, String str) {
            this.f24575a = context;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f24575a.deleteFile(n8v.d(n8v.this, this.b));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface c<D> {
        void onFail(String str);

        void onSuccess(D d);
    }

    static {
        t2o.a(83886322);
    }

    public n8v(String str) {
        this.f24573a = str;
    }

    public static /* synthetic */ void a(n8v n8vVar, c cVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cf165e9", new Object[]{n8vVar, cVar, obj});
        } else {
            n8vVar.g(cVar, obj);
        }
    }

    public static /* synthetic */ void b(n8v n8vVar, c cVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f547a758", new Object[]{n8vVar, cVar, str});
        } else {
            n8vVar.f(cVar, str);
        }
    }

    public static /* synthetic */ String c(n8v n8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f30ec384", new Object[]{n8vVar});
        }
        return n8vVar.f24573a;
    }

    public static /* synthetic */ String d(n8v n8vVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eacf3ebb", new Object[]{n8vVar, str});
        }
        return n8vVar.e(str);
    }

    public final String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dba5df6", new Object[]{this, str});
        }
        return "UltronCacheFile_" + this.f24573a + "_" + str;
    }

    public final <D> void f(c<D> cVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de64bacc", new Object[]{this, cVar, str});
        } else if (cVar != null) {
            cVar.onFail(str);
        }
    }

    public final <D> void g(c<D> cVar, D d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbc91e61", new Object[]{this, cVar, d});
        } else if (cVar != null) {
            cVar.onSuccess(d);
        }
    }

    public void h(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7497404", new Object[]{this, context, str});
        } else if (context != null) {
            pav.k(new b(context, str));
        }
    }

    public boolean i(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4caeb3be", new Object[]{this, context, str})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        try {
            File fileStreamPath = context.getFileStreamPath(e(str));
            if (fileStreamPath != null) {
                if (fileStreamPath.exists()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            hav.g(this.f24573a, str, "#文件不存在", e.getMessage());
            return false;
        }
    }

    public void j(Context context, String str, byte[] bArr, c<byte[]> cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e1efb6d", new Object[]{this, context, str, bArr, cVar});
        } else if (context == null) {
            f(cVar, "context为空");
        } else {
            pav.k(new a(context, str, bArr, cVar));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0086 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public byte[] k(android.content.Context r9, java.lang.String r10) {
        /*
            r8 = this;
            r0 = 0
            java.lang.String r1 = "#获取文件失败1"
            com.android.alibaba.ip.runtime.IpChange r2 = tb.n8v.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001d
            java.lang.String r1 = "81405269"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r8
            r0 = 1
            r3[r0] = r9
            r9 = 2
            r3[r9] = r10
            java.lang.Object r9 = r2.ipc$dispatch(r1, r3)
            byte[] r9 = (byte[]) r9
            return r9
        L_0x001d:
            r2 = 0
            if (r9 != 0) goto L_0x0021
            return r2
        L_0x0021:
            java.lang.String r3 = r8.e(r10)     // Catch: all -> 0x005c, Exception -> 0x005e
            java.io.FileInputStream r9 = r9.openFileInput(r3)     // Catch: all -> 0x005c, Exception -> 0x005e
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch: all -> 0x003d, Exception -> 0x0040
            r3.<init>()     // Catch: all -> 0x003d, Exception -> 0x0040
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r5 = new byte[r4]     // Catch: all -> 0x003d, Exception -> 0x0040
        L_0x0032:
            int r6 = r9.read(r5, r0, r4)     // Catch: all -> 0x003d, Exception -> 0x0040
            r7 = -1
            if (r6 == r7) goto L_0x0042
            r3.write(r5, r0, r6)     // Catch: all -> 0x003d, Exception -> 0x0040
            goto L_0x0032
        L_0x003d:
            r0 = move-exception
            r2 = r9
            goto L_0x0084
        L_0x0040:
            r0 = move-exception
            goto L_0x0060
        L_0x0042:
            r3.flush()     // Catch: all -> 0x003d, Exception -> 0x0040
            byte[] r0 = r3.toByteArray()     // Catch: all -> 0x003d, Exception -> 0x0040
            r9.close()     // Catch: IOException -> 0x004d
            goto L_0x005b
        L_0x004d:
            r9 = move-exception
            java.lang.String r2 = r8.f24573a
            java.lang.String r9 = r9.getMessage()
            java.lang.String[] r9 = new java.lang.String[]{r10, r1, r9}
            tb.hav.g(r2, r9)
        L_0x005b:
            return r0
        L_0x005c:
            r0 = move-exception
            goto L_0x0084
        L_0x005e:
            r0 = move-exception
            r9 = r2
        L_0x0060:
            java.lang.String r3 = r8.f24573a     // Catch: all -> 0x003d
            java.lang.String r4 = "#获取文件失败"
            java.lang.String r0 = r0.getMessage()     // Catch: all -> 0x003d
            java.lang.String[] r0 = new java.lang.String[]{r10, r4, r0}     // Catch: all -> 0x003d
            tb.hav.g(r3, r0)     // Catch: all -> 0x003d
            if (r9 == 0) goto L_0x0083
            r9.close()     // Catch: IOException -> 0x0075
            goto L_0x0083
        L_0x0075:
            r9 = move-exception
            java.lang.String r0 = r8.f24573a
            java.lang.String r9 = r9.getMessage()
            java.lang.String[] r9 = new java.lang.String[]{r10, r1, r9}
            tb.hav.g(r0, r9)
        L_0x0083:
            return r2
        L_0x0084:
            if (r2 == 0) goto L_0x0098
            r2.close()     // Catch: IOException -> 0x008a
            goto L_0x0098
        L_0x008a:
            r9 = move-exception
            java.lang.String r2 = r8.f24573a
            java.lang.String r9 = r9.getMessage()
            java.lang.String[] r9 = new java.lang.String[]{r10, r1, r9}
            tb.hav.g(r2, r9)
        L_0x0098:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.n8v.k(android.content.Context, java.lang.String):byte[]");
    }

    public boolean l(Context context, String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea5a6f27", new Object[]{this, context, str, bArr})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = context.openFileOutput(e(str), 0);
            fileOutputStream.write(bArr);
            try {
                fileOutputStream.close();
            } catch (IOException unused) {
            }
            return true;
        } catch (Exception unused2) {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused3) {
                }
            }
            return false;
        } catch (Throwable th) {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }
}
