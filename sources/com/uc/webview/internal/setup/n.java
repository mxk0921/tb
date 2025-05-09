package com.uc.webview.internal.setup;

import android.content.Context;
import android.text.TextUtils;
import com.uc.webview.base.EnvInfo;
import com.uc.webview.base.ErrorCode;
import com.uc.webview.base.Log;
import com.uc.webview.base.io.PathUtils;
import com.uc.webview.base.io.d;
import com.uc.webview.internal.setup.b;
import com.uc.webview.internal.setup.download.IDownloadHandle;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public boolean f14485a;
    public int b;
    public Context c = null;
    public String[] d = null;
    public File e = null;
    public File f = null;
    public File g = null;
    public String h = null;
    public IDownloadHandle i = null;
    int j = 0;
    private b.a l = null;
    public String k = "";

    private n(boolean z, int i) {
        this.f14485a = z;
        this.b = i;
    }

    public static n a() {
        return new n(EnvInfo.c(), 1);
    }

    public final void b() {
        toString();
        Log.b();
        if (this.c == null) {
            ErrorCode.CONTEXT_IS_NULL.report();
        }
        c();
    }

    public final void c() {
        if (this.j == 0) {
            File file = this.e;
            if (file != null) {
                if (!file.exists()) {
                    if (EnvInfo.b(this.c)) {
                        ErrorCode.INVALID_COMPRESSED_LIB.report();
                    } else {
                        ErrorCode.UNSUPPORT_FOR_NOT_EXTRACT_NATIVE_LIBS.report();
                    }
                }
                this.j = 2;
                return;
            }
            File file2 = this.g;
            if (file2 != null) {
                if (!d.a(file2, this.f14485a)) {
                    ErrorCode.INVALID_DECOMPRESSED_DIR.report();
                }
                this.j = 3;
            } else if (!TextUtils.isEmpty(this.h)) {
                IDownloadHandle create = IDownloadHandle.Instance.create();
                this.i = create;
                if (create == null) {
                    ErrorCode.UPDATE_FEATURE_DISABLED.report();
                }
                this.j = 4;
            } else {
                if (EnvInfo.b(this.c)) {
                    String d = EnvInfo.d();
                    if (!this.f14485a || !PathUtils.getFileCoreLib(new File(d)).exists()) {
                        Log.e("SetupCfg", "invalid configs {\n" + toString() + "\n}");
                        ErrorCode.NEED_AT_LEAST_ONE_LIB_CONFIG.report();
                    }
                }
                this.j = 1;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v26, types: [com.uc.webview.internal.setup.download.IDownloadHandle] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "{ thick:"
            r0.<init>(r1)
            boolean r1 = r3.f14485a
            r0.append(r1)
            java.lang.String r1 = ", cpb:"
            r0.append(r1)
            int r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = ", ctx:"
            r0.append(r1)
            android.content.Context r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = ", extractNativeLibs:"
            r0.append(r1)
            android.content.Context r1 = r3.c
            boolean r1 = com.uc.webview.base.EnvInfo.b(r1)
            r0.append(r1)
            java.lang.String r1 = ", auth:"
            r0.append(r1)
            java.lang.String[] r1 = r3.d
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.String r1 = ", lib:"
            r0.append(r1)
            java.io.File r1 = r3.e
            java.lang.String r1 = a(r1)
            r0.append(r1)
            java.lang.String r1 = ", sdir:"
            r0.append(r1)
            java.io.File r1 = r3.f
            java.lang.String r1 = a(r1)
            r0.append(r1)
            java.lang.String r1 = ", ddir:"
            r0.append(r1)
            java.io.File r1 = r3.g
            java.lang.String r1 = a(r1)
            r0.append(r1)
            java.lang.String r1 = ", url:"
            r0.append(r1)
            java.lang.String r1 = r3.h
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r2 = ""
            if (r1 != 0) goto L_0x0079
            java.lang.String r1 = r3.h
            goto L_0x007a
        L_0x0079:
            r1 = r2
        L_0x007a:
            r0.append(r1)
            java.lang.String r1 = ", dlh:"
            r0.append(r1)
            com.uc.webview.internal.setup.download.IDownloadHandle r1 = r3.i
            if (r1 == 0) goto L_0x0087
            r2 = r1
        L_0x0087:
            r0.append(r2)
            java.lang.String r1 = r3.k
            r0.append(r1)
            java.lang.String r1 = " }"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uc.webview.internal.setup.n.toString():java.lang.String");
    }

    public static n a(Context context, File file) {
        n a2 = a();
        a2.c = context.getApplicationContext();
        a2.e = file;
        a2.b();
        return a2;
    }

    public static n a(boolean z, File file, int i) {
        n nVar = new n(z, i);
        nVar.c = EnvInfo.getContext();
        nVar.g = file;
        nVar.b();
        return nVar;
    }

    private static String a(File file) {
        return file != null ? file.getAbsolutePath() : "";
    }
}
