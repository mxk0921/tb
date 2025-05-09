package tb;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class uym {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f29678a;

    static {
        t2o.a(961544379);
    }

    public static String a() {
        String processName;
        if (Build.VERSION.SDK_INT >= 28) {
            processName = Application.getProcessName();
            return processName;
        }
        try {
            Method declaredMethod = Class.forName(ProcessUtils.ACTIVITY_THREAD).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            return (String) declaredMethod.invoke(null, new Object[0]);
        } catch (Throwable unused) {
            return b();
        }
    }

    public static String b() {
        Throwable th;
        BufferedReader bufferedReader;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a915eed5", new Object[0]);
        }
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + Process.myPid() + "/cmdline")));
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            StringBuilder sb = new StringBuilder();
            while (true) {
                int read = bufferedReader.read();
                if (read > 0) {
                    sb.append((char) read);
                } else {
                    String sb2 = sb.toString();
                    d2d.a(bufferedReader);
                    return sb2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedReader2 = bufferedReader;
            try {
                ku0.j("ProcessUtils.getProcessNameFromProc", th);
                d2d.a(bufferedReader2);
                return "";
            } catch (Throwable th4) {
                d2d.a(bufferedReader2);
                throw th4;
            }
        }
    }

    public static boolean c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("42bb9b9", new Object[]{context})).booleanValue();
        }
        if (f29678a == null) {
            String a2 = a();
            if (TextUtils.isEmpty(a2)) {
                return true;
            }
            f29678a = Boolean.valueOf(TextUtils.equals(context.getPackageName(), a2));
        }
        return f29678a.booleanValue();
    }
}
