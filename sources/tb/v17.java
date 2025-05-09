package tb;

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
public class v17 implements h1s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final x0s f29731a;

    public v17(x0s x0sVar) {
        this.f29731a = x0sVar;
    }

    public static /* synthetic */ x0s b(v17 v17Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x0s) ipChange.ipc$dispatch("a0e2f900", new Object[]{v17Var});
        }
        return v17Var.f29731a;
    }

    @Override // tb.h1s
    public File a(Thread thread, Throwable th, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("9852cef7", new Object[]{this, thread, th, map});
        }
        return d(thread, th, map);
    }

    public final String c(String str, Thread thread, Throwable th, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b7c9738e", new Object[]{this, str, thread, th, map});
        }
        b bVar = new b();
        bVar.a(str, "java").e(th, thread).b(thread).c(map).f();
        return bVar.toString();
    }

    public final File d(Thread thread, Throwable th, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("83c5f7f5", new Object[]{this, thread, th, map});
        }
        String str = "crash_" + this.f29731a.f() + "_" + System.currentTimeMillis() + "_java.log";
        File file = new File(new t5v(this.f29731a.g(), this.f29731a.h()).c(), str);
        kg9.g(file, c(str, thread, th, map));
        return file;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final StringBuilder f29732a;

        public b() {
            this.f29732a = new StringBuilder();
        }

        public b a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("65c29e91", new Object[]{this, str, str2});
            }
            g("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***\n");
            g(String.format("Basic Information: 'pid: %d/tid: %d/logver: 2/time: %s/cpu: %s/cpu hardware: %s'\n", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()), Long.valueOf(System.currentTimeMillis()), Build.CPU_ABI, Build.HARDWARE));
            g(String.format("Mobile Information: 'model: %s/version: %s/sdk: %d'\n", Build.MODEL, Build.VERSION.RELEASE, Integer.valueOf(Build.VERSION.SDK_INT)));
            g(String.format("Build fingerprint: '" + Build.FINGERPRINT + "'\n", new Object[0]));
            g("Report Name: " + str + "\n");
            g("UUID: " + UUID.randomUUID().toString().toLowerCase() + "\n");
            g("Log Type: " + str2 + "\n");
            d();
            return this;
        }

        public b b(Thread thread) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("2e61f8a0", new Object[]{this, thread});
            }
            try {
                String name = thread.getName();
                g("Thread Name: '" + name + "'\n");
                g(String.format("\"%s\" prio=%d tid=%d %s\n", thread.getName(), Integer.valueOf(thread.getPriority()), Long.valueOf(thread.getId()), thread.getState()));
            } catch (Exception e) {
                ehh.b("dumpThread", e);
            }
            d();
            return this;
        }

        public b d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("20655e45", new Object[]{this});
            }
            g("--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---\n");
            return this;
        }

        public final void g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fc66d130", new Object[]{this, str});
            } else {
                this.f29732a.append(str);
            }
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return this.f29732a.toString();
        }

        public b e(Throwable th, Thread thread) {
            String str = "Back traces end.\n";
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("6f923e09", new Object[]{this, th, thread});
            }
            String h = v17.b(v17.this).h();
            g("Process Name: '" + h + "' \n");
            String name = thread.getName();
            g("Thread Name: '" + name + "' \n");
            g("Back traces starts.\n");
            try {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        th.printStackTrace(new PrintStream(byteArrayOutputStream));
                        str = byteArrayOutputStream.toString();
                        byteArrayOutputStream.close();
                    } finally {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                        }
                    }
                } finally {
                    g(str);
                }
            } catch (Exception e) {
                ehh.b("print throwable", e);
            }
            d();
            return this;
        }

        public void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("45231709", new Object[]{this});
                return;
            }
            g(String.format("Full: %d bytes, write: %d bytes, limit: %d bytes, reject: %d bytes.\n", 0, 0, 0, 0));
            g(String.format("log end: %d\n", Long.valueOf(System.currentTimeMillis())));
        }

        public b c(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("9586d30a", new Object[]{this, map});
            }
            if (map != null && !map.isEmpty()) {
                try {
                    g("extrainfo:\n");
                    for (Map.Entry<String, Object> entry : map.entrySet()) {
                        g(String.format("%s: %s\n", entry.getKey(), entry.getValue()));
                    }
                } catch (Exception e) {
                    ehh.b("write extral info", e);
                }
                d();
            }
            return this;
        }
    }
}
