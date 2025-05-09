package tb;

import android.app.Application;
import android.app.Instrumentation;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class pg8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static AtomicBoolean f26077a;

    public static boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2639150c", new Object[]{context, str})).booleanValue();
        }
        String[] split = str.split("/");
        Pattern compile = Pattern.compile("(([a-zA-Z0-9]{2,})\\.)+.*");
        for (String str2 : split) {
            if (!TextUtils.isEmpty(str2)) {
                if (compile.matcher(str2).matches() && !str2.contains(context.getPackageName())) {
                    ehh.b("EnvUtils", str);
                    return false;
                } else if (str2.contains(context.getPackageName())) {
                    return true;
                }
            }
        }
        return true;
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acf8133b", new Object[]{str})).booleanValue();
        }
        String a2 = vym.a();
        if (TextUtils.isEmpty(a2) || str.contains(a2)) {
            return true;
        }
        ehh.b("EnvUtils", a2);
        return false;
    }

    public static boolean d(x0s x0sVar) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("549c035a", new Object[]{x0sVar})).booleanValue();
        }
        if (f26077a == null) {
            try {
                Application g = x0sVar.g();
                if (!o1r.a(g).b("addMoreBlackInfo", false) || Build.VERSION.SDK_INT > 30) {
                    if (a(g, g.getCacheDir().getAbsolutePath()) && c(x0sVar.h())) {
                        z = true;
                    }
                    f26077a = new AtomicBoolean(z);
                } else {
                    if (a(g, g.getCacheDir().getAbsolutePath()) && c(x0sVar.h()) && b(g)) {
                        z = true;
                    }
                    f26077a = new AtomicBoolean(z);
                }
            } catch (Throwable th) {
                ehh.d(th);
            }
        }
        AtomicBoolean atomicBoolean = f26077a;
        if (atomicBoolean == null) {
            return true;
        }
        return atomicBoolean.get();
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c284526b", new Object[]{context})).booleanValue();
        }
        try {
            ClassLoader classLoader = ((Instrumentation) yck.h(Class.forName(ProcessUtils.ACTIVITY_THREAD)).b("sCurrentActivityThread").b("mInstrumentation").g()).getClass().getClassLoader();
            if (classLoader instanceof PathClassLoader) {
                List list = (List) yck.h(classLoader).b("pathList").b("nativeLibraryDirectories").g();
                if (!list.isEmpty()) {
                    return a(context, ((File) list.get(0)).getAbsolutePath());
                }
            }
        } catch (Throwable th) {
            ehh.d(th);
        }
        return true;
    }
}
