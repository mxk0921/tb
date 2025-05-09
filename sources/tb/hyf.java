package tb;

import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.JvmUncaughtCrashListener;
import com.taobao.android.tcrash.OnFileCreatedListener;
import com.taobao.android.tcrash.UncaughtCrashHeader;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class hyf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final x0s f20964a;
    public aqk e;
    public final iyf f;
    public h1s h;
    public final List<JvmUncaughtCrashListener> b = new ArrayList();
    public final List<OnFileCreatedListener> c = new ArrayList();
    public final List<igv> d = new ArrayList();
    public final b g = new b(new c());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements Thread.UncaughtExceptionHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Thread.UncaughtExceptionHandler f20965a = Thread.getDefaultUncaughtExceptionHandler();
        public final a b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public interface a {
        }

        public b(a aVar) {
            this.b = aVar;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("70c6308a", new Object[]{this});
            } else {
                Thread.setDefaultUncaughtExceptionHandler(this);
            }
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ca89fd43", new Object[]{this, thread, th});
            } else if (!((c) this.b).c(thread, th) && (uncaughtExceptionHandler = this.f20965a) != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements b.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public final File a(Thread thread, Throwable th, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (File) ipChange.ipc$dispatch("ab9ca090", new Object[]{this, thread, th, map});
            }
            h1s c = hyf.c(hyf.this);
            if (c == null) {
                c = new v17(hyf.d(hyf.this));
            }
            return c.a(thread, th, map);
        }

        public final void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("208c0a03", new Object[]{this, str});
                return;
            }
            synchronized (hyf.e(hyf.this)) {
                try {
                    for (OnFileCreatedListener onFileCreatedListener : hyf.e(hyf.this)) {
                        onFileCreatedListener.onFileCreated(str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public boolean c(Thread thread, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1f72faff", new Object[]{this, thread, th})).booleanValue();
            }
            boolean d = d(thread, th);
            Map<String, Object> e = e(thread, th);
            if (d) {
                e.put("REPORT_IGNORE", "true");
            }
            String absolutePath = a(thread, th, e).getAbsolutePath();
            b(absolutePath);
            aqk f = hyf.f(hyf.this);
            if (f != null) {
                try {
                    f.onCompleted(absolutePath);
                } catch (Throwable th2) {
                    ehh.d(th2);
                }
            }
            return d;
        }

        public final boolean d(Thread thread, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b3cb27e5", new Object[]{this, thread, th})).booleanValue();
            }
            if (Looper.getMainLooper().getThread() == thread) {
                return false;
            }
            synchronized (hyf.a(hyf.this)) {
                try {
                    for (igv igvVar : hyf.a(hyf.this)) {
                        if (igvVar.a(thread, th)) {
                            return true;
                        }
                    }
                    return false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final Map<String, Object> e(Thread thread, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("d68e243e", new Object[]{this, thread, th});
            }
            HashMap hashMap = new HashMap();
            synchronized (hyf.b(hyf.this)) {
                try {
                    for (JvmUncaughtCrashListener jvmUncaughtCrashListener : hyf.b(hyf.this)) {
                        Map<String, Object> onJvmUncaughtCrash = jvmUncaughtCrashListener.onJvmUncaughtCrash(thread, th);
                        if (onJvmUncaughtCrash != null) {
                            hashMap.putAll(onJvmUncaughtCrash);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return hashMap;
        }
    }

    public hyf(x0s x0sVar) {
        this.f20964a = x0sVar;
        iyf iyfVar = new iyf();
        this.f = iyfVar;
        i(iyfVar);
    }

    public static /* synthetic */ List a(hyf hyfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d6d43bd0", new Object[]{hyfVar});
        }
        return hyfVar.d;
    }

    public static /* synthetic */ List b(hyf hyfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("efd58d6f", new Object[]{hyfVar});
        }
        return hyfVar.b;
    }

    public static /* synthetic */ h1s c(hyf hyfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h1s) ipChange.ipc$dispatch("d8b77232", new Object[]{hyfVar});
        }
        return hyfVar.h;
    }

    public static /* synthetic */ x0s d(hyf hyfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x0s) ipChange.ipc$dispatch("60648255", new Object[]{hyfVar});
        }
        return hyfVar.f20964a;
    }

    public static /* synthetic */ List e(hyf hyfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3ad9824c", new Object[]{hyfVar});
        }
        return hyfVar.c;
    }

    public static /* synthetic */ aqk f(hyf hyfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aqk) ipChange.ipc$dispatch("9284a830", new Object[]{hyfVar});
        }
        return hyfVar.e;
    }

    public hyf h(igv igvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hyf) ipChange.ipc$dispatch("f94478a3", new Object[]{this, igvVar});
        }
        if (igvVar == null) {
            ehh.f(new IllegalArgumentException("ignore is null"));
            return this;
        }
        synchronized (this.d) {
            try {
                if (((ArrayList) this.d).contains(igvVar)) {
                    ehh.b("JavaUncaughtCatcher", igvVar.getClass().getSimpleName(), "already added");
                    return this;
                }
                ((ArrayList) this.d).add(igvVar);
                return this;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70c6308a", new Object[]{this});
        } else {
            this.g.a();
        }
    }

    public UncaughtCrashHeader k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UncaughtCrashHeader) ipChange.ipc$dispatch("d410a0ab", new Object[]{this});
        }
        return this.f;
    }

    public hyf l(h1s h1sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hyf) ipChange.ipc$dispatch("9d0f660d", new Object[]{this, h1sVar});
        }
        this.h = h1sVar;
        return this;
    }

    public hyf m(OnFileCreatedListener onFileCreatedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hyf) ipChange.ipc$dispatch("1b3ba3ef", new Object[]{this, onFileCreatedListener});
        }
        if (onFileCreatedListener == null) {
            ehh.f(new IllegalArgumentException("listener is null"));
            return this;
        }
        synchronized (this.c) {
            ((ArrayList) this.c).remove(onFileCreatedListener);
        }
        return this;
    }

    public hyf n(JvmUncaughtCrashListener jvmUncaughtCrashListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hyf) ipChange.ipc$dispatch("529a4044", new Object[]{this, jvmUncaughtCrashListener});
        }
        if (jvmUncaughtCrashListener == null) {
            ehh.f(new IllegalArgumentException("listener is null"));
            return this;
        }
        synchronized (this.b) {
            ((ArrayList) this.b).remove(jvmUncaughtCrashListener);
        }
        return this;
    }

    public hyf o(aqk aqkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hyf) ipChange.ipc$dispatch("5eafb99a", new Object[]{this, aqkVar});
        }
        this.e = aqkVar;
        return this;
    }

    public hyf g(OnFileCreatedListener onFileCreatedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hyf) ipChange.ipc$dispatch("c14efc32", new Object[]{this, onFileCreatedListener});
        }
        if (onFileCreatedListener == null) {
            ehh.f(new IllegalArgumentException("listener is null"));
            return this;
        }
        synchronized (this.c) {
            try {
                if (((ArrayList) this.c).contains(onFileCreatedListener)) {
                    ehh.b("JavaUncaughtCatcher", onFileCreatedListener.getClass().getSimpleName(), "already added");
                    return this;
                }
                ((ArrayList) this.c).add(onFileCreatedListener);
                return this;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public hyf i(JvmUncaughtCrashListener jvmUncaughtCrashListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hyf) ipChange.ipc$dispatch("89bea587", new Object[]{this, jvmUncaughtCrashListener});
        }
        if (jvmUncaughtCrashListener == null) {
            ehh.f(new IllegalArgumentException("listener is null"));
            return this;
        }
        synchronized (this.b) {
            try {
                if (this.b.contains(jvmUncaughtCrashListener)) {
                    ehh.b("JavaUncaughtCatcher", jvmUncaughtCrashListener.getClass().getSimpleName(), "already added");
                    return this;
                }
                this.b.add(jvmUncaughtCrashListener);
                return this;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
