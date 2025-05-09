package tb;

import android.content.Context;
import android.os.Looper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class f19 extends ud9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Context b;
    public File c;

    static {
        t2o.a(475005012);
        Looper.getMainLooper().getThread();
    }

    public f19(Context context) {
        this.b = context;
    }

    public static /* synthetic */ Object ipc$super(f19 f19Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/gateway/files/FastFileStore");
    }

    @Override // tb.ud9
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f56e13e", new Object[]{this});
        }
        c();
        return this.c.getAbsolutePath();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0078, code lost:
        if (r0.canWrite() == false) goto L_0x007c;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.f19.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0012
            java.lang.String r1 = "b359038a"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r0.ipc$dispatch(r1, r2)
            return
        L_0x0012:
            java.io.File r0 = r4.c
            r1 = 0
            if (r0 == 0) goto L_0x001f
            boolean r0 = r0.canWrite()
            if (r0 != 0) goto L_0x001f
            r4.c = r1
        L_0x001f:
            java.io.File r0 = r4.c
            if (r0 != 0) goto L_0x0088
            android.content.Context r0 = r4.b
            java.io.File r0 = r0.getFilesDir()
            if (r0 == 0) goto L_0x0032
            boolean r2 = r0.canWrite()
            if (r2 != 0) goto L_0x0032
            r0 = r1
        L_0x0032:
            if (r0 != 0) goto L_0x0043
            android.content.Context r0 = r4.b
            java.io.File r0 = r0.getCacheDir()
            if (r0 == 0) goto L_0x0043
            boolean r2 = r0.canWrite()
            if (r2 != 0) goto L_0x0043
            r0 = r1
        L_0x0043:
            if (r0 != 0) goto L_0x007b
            android.content.Context r0 = r4.b     // Catch: Exception -> 0x004c
            java.io.File r0 = r0.getExternalFilesDir(r1)     // Catch: Exception -> 0x004c
            goto L_0x0061
        L_0x004c:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto L_0x0055
            java.lang.String r0 = ""
        L_0x0055:
            java.lang.String r2 = "FileStore"
            java.lang.String r3 = "AndroidFileSystemInitDirError"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r0}
            tb.s3a.d(r0)
            r0 = r1
        L_0x0061:
            if (r0 == 0) goto L_0x006a
            boolean r2 = r0.canWrite()
            if (r2 != 0) goto L_0x006a
            r0 = r1
        L_0x006a:
            if (r0 != 0) goto L_0x007b
            android.content.Context r0 = r4.b
            java.io.File r0 = r0.getExternalCacheDir()
            if (r0 == 0) goto L_0x007b
            boolean r2 = r0.canWrite()
            if (r2 != 0) goto L_0x007b
            goto L_0x007c
        L_0x007b:
            r1 = r0
        L_0x007c:
            if (r1 != 0) goto L_0x007f
            return
        L_0x007f:
            java.io.File r0 = new java.io.File
            java.lang.String r2 = "fast_store"
            r0.<init>(r1, r2)
            r4.c = r0
        L_0x0088:
            java.io.File r0 = r4.c
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x009d
            java.io.File r0 = r4.c
            boolean r0 = r0.mkdirs()
            if (r0 != 0) goto L_0x009d
            java.io.File r0 = r4.c
            r0.mkdirs()
        L_0x009d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.f19.c():void");
    }
}
