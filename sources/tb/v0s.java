package tb;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;
import java.util.Map;
import java.util.UUID;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class v0s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final StringBuilder f29717a = new StringBuilder();

    public static String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4215c18", new Object[0]);
        }
        return a(Build.SUPPORTED_ABIS);
    }

    public v0s b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v0s) ipChange.ipc$dispatch("3c4460bb", new Object[]{this, str});
        }
        n(str);
        return this;
    }

    public v0s c(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v0s) ipChange.ipc$dispatch("ceae0b86", new Object[]{this, context, new Boolean(z)});
        }
        if (z) {
            n("appliction meminfo:\n");
            n(s91.b(context) + "\n");
            h();
        }
        return this;
    }

    public v0s d(x0s x0sVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v0s) ipChange.ipc$dispatch("f5d52b2c", new Object[]{this, x0sVar, str, str2});
        }
        String f = x0sVar.f();
        n("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***\n");
        n(String.format("Basic Information: 'pid: %d/tid: %d/logver: 2/time: %s/cpu: %s/cpu hardware: %s'\n", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()), Long.valueOf(System.currentTimeMillis()), m(), Build.HARDWARE));
        n(String.format("Mobile Information: 'model: %s/version: %s/sdk: %d'\n", Build.MODEL, Build.VERSION.RELEASE, Integer.valueOf(Build.VERSION.SDK_INT)));
        n(String.format("Build fingerprint: '" + Build.FINGERPRINT + "'\n", new Object[0]));
        String d = x0sVar.d("STARTUP_TIME", "");
        long maxMemory = Runtime.getRuntime().maxMemory();
        n("Runtime Information: 'start: " + d + "/maxheap: " + maxMemory + "'\n");
        String d2 = x0sVar.d("APP_VERSION", f);
        String d3 = x0sVar.d("APP_SUBVERSION", "");
        String d4 = x0sVar.d("APP_BUILD", "");
        n("Application Information: 'version: " + d2 + "/subversion: " + d3 + "/buildseq: " + d4 + "'\n");
        n("CrashSDK Information: 'version: 3.3.0.0/nativeseq: 160509105620/javaseq: /target: beta'\n");
        StringBuilder sb = new StringBuilder("Report Name: ");
        sb.append(str);
        sb.append("\n");
        n(sb.toString());
        n("UUID: " + UUID.randomUUID().toString().toLowerCase() + "\n");
        n("Log Type: " + str2 + "\n");
        h();
        return this;
    }

    public v0s e(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v0s) ipChange.ipc$dispatch("eeb1da29", new Object[]{this, file});
        }
        n(kg9.d(file));
        return this;
    }

    public v0s h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v0s) ipChange.ipc$dispatch("c2820971", new Object[]{this});
        }
        n("--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n");
        return this;
    }

    public v0s i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v0s) ipChange.ipc$dispatch("cd8c9f93", new Object[]{this});
        }
        n(bhh.c(null, 2000));
        n(bhh.c("events", 200));
        return this;
    }

    public final void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc66d130", new Object[]{this, str});
        } else {
            this.f29717a.append(str);
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return this.f29717a.toString();
    }

    public static String a(String[] strArr) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("303f2bff", new Object[]{strArr});
        }
        if (strArr == null) {
            return "null";
        }
        int length = strArr.length - 1;
        if (length == -1) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            sb.append(strArr[i]);
            if (i == length) {
                return sb.toString();
            }
            sb.append(", ");
            i++;
        }
    }

    public v0s g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v0s) ipChange.ipc$dispatch("482d83ba", new Object[]{this});
        }
        File[] fileArr = null;
        try {
            fileArr = new File("/proc/self/fd").listFiles();
            if (fileArr != null) {
                n(String.format("opened file count: %d, write limit: %d.\n", Integer.valueOf(fileArr.length), 900));
            } else {
                n("[DEBUG] listFiles failed!\n");
            }
        } catch (Exception e) {
            ehh.b("print file descriptor.", e);
        }
        if (fileArr != null) {
            try {
                if (fileArr.length >= 900) {
                    n("opened files:\n");
                    StringBuilder sb = new StringBuilder();
                    try {
                        for (File file : fileArr) {
                            sb.append(file.getName());
                            sb.append(" -> ");
                            sb.append(file.getCanonicalPath());
                            sb.append("\n");
                        }
                    } catch (Exception e2) {
                        ehh.b("print file descriptor.", e2);
                    }
                    n(sb.toString());
                }
            } catch (Exception e3) {
                ehh.b("print file descriptor.", e3);
            }
        }
        h();
        return this;
    }

    public v0s j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v0s) ipChange.ipc$dispatch("247711b3", new Object[]{this});
        }
        try {
            n("meminfo:\n");
            n(asq.c(s91.d(), "") + "\n");
            h();
        } catch (Exception e) {
            ehh.b("write meminfo.", e);
        }
        try {
            n("status:\n");
            n(asq.c(s91.g(), "") + "\n");
            h();
        } catch (Exception e2) {
            ehh.b("write status.", e2);
        }
        try {
            n("virtual machine:\nMaxMemory: " + Runtime.getRuntime().maxMemory() + " TotalMemory: " + Runtime.getRuntime().totalMemory() + " FreeMemory: " + Runtime.getRuntime().freeMemory() + "\n");
        } catch (Exception e3) {
            ehh.b("write virtual machine info.", e3);
        }
        h();
        return this;
    }

    public v0s k(String str, Throwable th, Thread thread) {
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th2;
        Exception e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v0s) ipChange.ipc$dispatch("7d8ba4b7", new Object[]{this, str, th, thread});
        }
        n("Process Name: '" + str + "' \n");
        n("Thread Name: '" + thread.getName() + "' \n");
        n("Back traces starts.\n");
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                try {
                    th.printStackTrace(new PrintStream(byteArrayOutputStream));
                    n(byteArrayOutputStream.toString());
                } catch (Exception e2) {
                    e = e2;
                    ehh.b("print throwable", e);
                    s91.a(byteArrayOutputStream);
                    n("Back traces end.\n");
                    h();
                    return this;
                }
            } catch (Throwable th3) {
                th2 = th3;
                s91.a(byteArrayOutputStream);
                n("Back traces end.\n");
                throw th2;
            }
        } catch (Exception e3) {
            e = e3;
            byteArrayOutputStream = null;
        } catch (Throwable th4) {
            th2 = th4;
            byteArrayOutputStream = null;
            s91.a(byteArrayOutputStream);
            n("Back traces end.\n");
            throw th2;
        }
        s91.a(byteArrayOutputStream);
        n("Back traces end.\n");
        h();
        return this;
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45231709", new Object[]{this});
            return;
        }
        n(String.format("Full: %d bytes, write: %d bytes, limit: %d bytes, reject: %d bytes.\n", 0, 0, 0, 0));
        String c = s91.c(System.currentTimeMillis());
        n("log end: " + c + "\n");
    }

    public v0s f(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v0s) ipChange.ipc$dispatch("380b838c", new Object[]{this, map});
        }
        if (map != null && !map.isEmpty()) {
            try {
                n("extrainfo:\n");
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    n(String.format("%s: %s\n", entry.getKey(), entry.getValue()));
                }
            } catch (Exception e) {
                ehh.b("write extral info", e);
            }
            h();
        }
        return this;
    }
}
