package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.regex.Pattern;
import kotlin.Result;
import kotlin.b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class gh9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final gh9 INSTANCE = new gh9();

    static {
        t2o.a(106954770);
    }

    public final boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("602541f1", new Object[]{this, str})).booleanValue();
        }
        ckf.g(str, "absPath");
        if (str.length() == 0) {
            return false;
        }
        File file = new File(str);
        if (!tsq.w(str, "/", false, 2, null) || !file.isFile()) {
            return new File(str).exists();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
        if (r2.isFile() != false) goto L_0x0034;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.gh9.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001c
            java.lang.String r3 = "45fe62d7"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r5
            r4[r0] = r6
            java.lang.Object r6 = r2.ipc$dispatch(r3, r4)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L_0x001c:
            java.lang.String r2 = "absPath"
            tb.ckf.g(r6, r2)
            java.io.File r2 = new java.io.File     // Catch: SecurityException -> 0x0035
            r2.<init>(r6)     // Catch: SecurityException -> 0x0035
            boolean r6 = r2.exists()     // Catch: SecurityException -> 0x0035
            if (r6 == 0) goto L_0x0033
            boolean r6 = r2.isFile()     // Catch: SecurityException -> 0x0035
            if (r6 == 0) goto L_0x0033
            goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            r1 = r0
        L_0x0035:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.gh9.d(java.lang.String):boolean");
    }

    public final boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78667b6b", new Object[]{this, str})).booleanValue();
        }
        ckf.g(str, "path");
        return Pattern.compile("^file://((?!\\.+)([^\\f\\n\\r\\t\\v/])+/?(?!//+))+$").matcher(str).matches();
    }

    public final boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a47e76f", new Object[]{this, str})).booleanValue();
        }
        ckf.g(str, "path");
        return !TextUtils.isEmpty(str) && (tsq.I(str, "../", false, 2, null) || tsq.w(str, "/..", false, 2, null) || wsq.O(str, "/../", false, 2, null));
    }

    public final boolean b(String str, String str2) {
        Object obj;
        File file;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282f3b0", new Object[]{this, str, str2})).booleanValue();
        }
        ckf.g(str, "srcPath");
        ckf.g(str2, "dstPath");
        try {
            file = new File(str);
            if (!file.exists()) {
                file = null;
            }
        } catch (Throwable th) {
            obj = Result.m1108constructorimpl(b.a(th));
        }
        if (file != null) {
            FileInputStream fileInputStream = new FileInputStream(file);
            File file2 = new File(str2);
            File parentFile = file2.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            hp2.b(fileInputStream, fileOutputStream, 0, 2, null);
            lw3.a(fileOutputStream, null);
            lw3.a(fileInputStream, null);
            return true;
        }
        obj = Result.m1108constructorimpl(null);
        Result.m1111exceptionOrNullimpl(obj);
        return false;
    }

    public final String f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("285f57ae", new Object[]{this, str, str2});
        }
        ckf.g(str, "path");
        ckf.g(str2, "referPath");
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (tsq.w(str, "/", false, 2, null)) {
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            if (TextUtils.isEmpty(str2)) {
                return str + file.getName();
            }
            String substring = str2.substring(wsq.e0(str2, "/", 0, false, 6, null) + 1);
            ckf.f(substring, "(this as java.lang.String).substring(startIndex)");
            if (!TextUtils.isEmpty(substring)) {
                return str.concat(substring);
            }
            return str + file.getName();
        }
        File parentFile = new File(str).getParentFile();
        if (parentFile.exists()) {
            return str;
        }
        parentFile.mkdirs();
        return str;
    }
}
