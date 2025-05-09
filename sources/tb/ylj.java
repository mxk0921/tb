package tb;

import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.AnrUncaughtListener;
import com.taobao.android.tcrash.OnFileCreatedListener;
import com.taobao.android.tcrash.UncaughtCrashHeader;
import com.uc.crashsdk.export.LogType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import tb.fbn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ylj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final UncaughtCrashHeader f32168a;
    public final List<AnrUncaughtListener> b = new ArrayList();
    public final List<OnFileCreatedListener> c = new ArrayList();
    public final List<OnFileCreatedListener> d = new ArrayList();
    public aqk e;
    public aqk f;
    public final ljj g;

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5097f36f", new Object[]{this});
        } else {
            this.g.disable();
        }
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("beab3e79", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        synchronized (this.b) {
            try {
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    Map<String, Object> onAnrUncaught = ((AnrUncaughtListener) it.next()).onAnrUncaught();
                    if (onAnrUncaught != null) {
                        hashMap.putAll(onAnrUncaught);
                        ehh.b("NativeUncaughtCatcher", onAnrUncaught.toString());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hashMap.toString();
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8660cd", new Object[]{this, str});
            return;
        }
        synchronized (this.d) {
            try {
                Iterator it = ((ArrayList) this.d).iterator();
                while (it.hasNext()) {
                    ((OnFileCreatedListener) it.next()).onFileCreated(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        aqk aqkVar = this.f;
        if (aqkVar != null) {
            aqkVar.onCompleted(str);
        }
    }

    public final void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e0158c", new Object[]{this, str});
            return;
        }
        synchronized (this.c) {
            try {
                Iterator it = ((ArrayList) this.c).iterator();
                while (it.hasNext()) {
                    ((OnFileCreatedListener) it.next()).onFileCreated(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        aqk aqkVar = this.e;
        if (aqkVar != null) {
            aqkVar.onCompleted(str);
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70c6308a", new Object[]{this});
        } else {
            this.g.enable();
        }
    }

    public UncaughtCrashHeader k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UncaughtCrashHeader) ipChange.ipc$dispatch("d410a0ab", new Object[]{this});
        }
        return this.f32168a;
    }

    public final /* synthetic */ String l() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c2d31f4a", new Object[]{this});
        }
        ehh.b("NativeUncaughtCatcher", "dispatch anr");
        return g();
    }

    public ylj n(OnFileCreatedListener onFileCreatedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ylj) ipChange.ipc$dispatch("dffc8f40", new Object[]{this, onFileCreatedListener});
        }
        if (onFileCreatedListener == null) {
            ehh.f(new IllegalArgumentException("listener is null"));
            return this;
        }
        synchronized (this.d) {
            ((ArrayList) this.d).remove(onFileCreatedListener);
        }
        return this;
    }

    public ylj o(AnrUncaughtListener anrUncaughtListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ylj) ipChange.ipc$dispatch("54619e68", new Object[]{this, anrUncaughtListener});
        }
        if (anrUncaughtListener == null) {
            ehh.f(new IllegalArgumentException("listener is null"));
            return this;
        }
        synchronized (this.b) {
            ((ArrayList) this.b).remove(anrUncaughtListener);
        }
        return this;
    }

    public ylj p(OnFileCreatedListener onFileCreatedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ylj) ipChange.ipc$dispatch("d908cfba", new Object[]{this, onFileCreatedListener});
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

    public ylj q(aqk aqkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ylj) ipChange.ipc$dispatch("f8ea535a", new Object[]{this, aqkVar});
        }
        this.f = aqkVar;
        return this;
    }

    public ylj r(aqk aqkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ylj) ipChange.ipc$dispatch("6489324", new Object[]{this, aqkVar});
        }
        this.e = aqkVar;
        return this;
    }

    public ylj(x0s x0sVar, boolean z, boolean z2) {
        ljj ljjVar;
        if (z2) {
            try {
                fbn.b b = fbn.b(x0sVar.g(), "tbreakpad");
                fbn.b b2 = fbn.b(x0sVar.g(), "tunwindstack");
                if (TextUtils.isEmpty(b.f19173a) || TextUtils.isEmpty(b2.f19173a)) {
                    ljjVar = new kjj(x0sVar, z);
                } else {
                    ehh.b("NativeUncaughtCatcher", b.f19173a);
                    ehh.b("NativeUncaughtCatcher", b2.f19173a);
                    ljjVar = new qjj(x0sVar, z);
                }
            } catch (Throwable th) {
                ehh.d(th);
                ljjVar = null;
            }
        } else {
            ljjVar = new kjj(x0sVar, z);
        }
        ljjVar = ljjVar == null ? new kjj(x0sVar, z) : ljjVar;
        this.g = ljjVar;
        this.f32168a = ljjVar.getUncaughtCrashHeader();
        ljjVar.a(new Callable() { // from class: tb.wlj
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String l;
                l = ylj.this.l();
                return l;
            }
        });
        ljjVar.b(new ValueCallback() { // from class: tb.xlj
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                ylj.this.m((Bundle) obj);
            }
        });
    }

    public ylj c(OnFileCreatedListener onFileCreatedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ylj) ipChange.ipc$dispatch("686f6943", new Object[]{this, onFileCreatedListener});
        }
        if (onFileCreatedListener == null) {
            ehh.f(new IllegalArgumentException("listener is null"));
            return this;
        }
        synchronized (this.d) {
            try {
                if (((ArrayList) this.d).contains(onFileCreatedListener)) {
                    ehh.b("NativeUncaughtCatcher", onFileCreatedListener.getClass().getSimpleName(), "already added");
                    return this;
                }
                ((ArrayList) this.d).add(onFileCreatedListener);
                return this;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ylj d(AnrUncaughtListener anrUncaughtListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ylj) ipChange.ipc$dispatch("70b94e85", new Object[]{this, anrUncaughtListener});
        }
        if (anrUncaughtListener == null) {
            ehh.f(new IllegalArgumentException("listener is null"));
            return this;
        }
        synchronized (this.b) {
            try {
                if (((ArrayList) this.b).contains(anrUncaughtListener)) {
                    ehh.b("NativeUncaughtCatcher", anrUncaughtListener.getClass().getSimpleName(), "already added");
                    return this;
                }
                ((ArrayList) this.b).add(anrUncaughtListener);
                return this;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ylj e(OnFileCreatedListener onFileCreatedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ylj) ipChange.ipc$dispatch("867112d7", new Object[]{this, onFileCreatedListener});
        }
        if (onFileCreatedListener == null) {
            ehh.f(new IllegalArgumentException("listener is null"));
            return this;
        }
        synchronized (this.c) {
            try {
                if (((ArrayList) this.c).contains(onFileCreatedListener)) {
                    ehh.b("NativeUncaughtCatcher", onFileCreatedListener.getClass().getSimpleName(), "already added");
                    return this;
                }
                ((ArrayList) this.c).add(onFileCreatedListener);
                return this;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void m(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("141e1bdd", new Object[]{this, bundle});
            return;
        }
        try {
            String string = bundle.getString("logType");
            String string2 = bundle.getString("filePathName");
            ehh.b("NativeUncaughtCatcher", "onCompleted", string2);
            if ("anr".equals(string)) {
                h(string2);
            } else if (LogType.NATIVE_TYPE.equals(string)) {
                i(string2);
            } else {
                ehh.a("NativeUncaughtCatcher", string2);
            }
        } catch (Throwable th) {
            ehh.d(th);
        }
    }
}
