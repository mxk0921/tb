package tb;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.AnrUncaughtListener;
import com.taobao.android.tcrash.JvmUncaughtCrashListener;
import com.taobao.android.tcrash.OnFileCreatedListener;
import com.taobao.android.tcrash.UncaughtCrashHeader;
import com.taobao.android.tcrash.UncaughtCrashManager;
import com.taobao.android.tcrash.UncaughtCrashType;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class k1s implements UncaughtCrashManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final x0s f22355a;
    public final hyf b;
    public final ylj c;

    public k1s(x0s x0sVar, boolean z) {
        ylj yljVar;
        this.f22355a = x0sVar;
        this.b = new hyf(x0sVar);
        if (Build.VERSION.SDK_INT > 23) {
            yljVar = new ylj(x0sVar, true, z);
        } else {
            yljVar = new lmj(x0sVar, z);
        }
        this.c = yljVar;
    }

    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("539dc3c3", new Object[]{this, str, obj});
        } else {
            this.f22355a.a(str, obj);
        }
    }

    @Override // com.taobao.android.tcrash.UncaughtCrashManager
    public void addAnrUncaughtListener(AnrUncaughtListener anrUncaughtListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("755eaec8", new Object[]{this, anrUncaughtListener});
        } else {
            this.c.d(anrUncaughtListener);
        }
    }

    @Override // com.taobao.android.tcrash.UncaughtCrashManager
    public void addJvmUncaughtCrashListener(JvmUncaughtCrashListener jvmUncaughtCrashListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7610fb6e", new Object[]{this, jvmUncaughtCrashListener});
        } else {
            this.b.i(jvmUncaughtCrashListener);
        }
    }

    @Override // com.taobao.android.tcrash.UncaughtCrashManager
    public void addOnFileCreatedListener(UncaughtCrashType uncaughtCrashType, OnFileCreatedListener onFileCreatedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e87f0572", new Object[]{this, uncaughtCrashType, onFileCreatedListener});
        } else if (uncaughtCrashType == UncaughtCrashType.JAVA_ONLY) {
            this.b.g(onFileCreatedListener);
        } else if (uncaughtCrashType == UncaughtCrashType.NATIVE_ONLY) {
            this.c.e(onFileCreatedListener);
        } else if (uncaughtCrashType == UncaughtCrashType.ANR_ONLY) {
            this.c.c(onFileCreatedListener);
        } else {
            this.b.g(onFileCreatedListener);
            this.c.e(onFileCreatedListener);
            this.c.c(onFileCreatedListener);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70c6308a", new Object[]{this});
            return;
        }
        this.b.j();
        this.c.j();
    }

    public hyf c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hyf) ipChange.ipc$dispatch("a76b1571", new Object[]{this});
        }
        return this.b;
    }

    public ylj d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ylj) ipChange.ipc$dispatch("a10e0f1f", new Object[]{this});
        }
        return this.c;
    }

    @Override // com.taobao.android.tcrash.UncaughtCrashManager
    public UncaughtCrashHeader getUncaughtCrashHeader() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UncaughtCrashHeader) ipChange.ipc$dispatch("d410a0ab", new Object[]{this});
        }
        return new ula(this.b.k(), this.c.k());
    }

    @Override // com.taobao.android.tcrash.UncaughtCrashManager
    public UncaughtCrashHeader getUncaughtCrashHeaderByType(UncaughtCrashType uncaughtCrashType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UncaughtCrashHeader) ipChange.ipc$dispatch("f8eaa438", new Object[]{this, uncaughtCrashType});
        }
        if (uncaughtCrashType == UncaughtCrashType.JAVA_ONLY) {
            return this.b.k();
        }
        if (uncaughtCrashType == UncaughtCrashType.NATIVE_ONLY) {
            return this.c.k();
        }
        if (uncaughtCrashType == UncaughtCrashType.ANR_ONLY) {
            return this.c.k();
        }
        return getUncaughtCrashHeader();
    }

    @Override // com.taobao.android.tcrash.UncaughtCrashManager
    public void removeAnrUncaughtListener(AnrUncaughtListener anrUncaughtListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7894e06b", new Object[]{this, anrUncaughtListener});
        } else {
            this.c.o(anrUncaughtListener);
        }
    }

    @Override // com.taobao.android.tcrash.UncaughtCrashManager
    public void removeJvmUncaughtCrashListener(JvmUncaughtCrashListener jvmUncaughtCrashListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19bbd51", new Object[]{this, jvmUncaughtCrashListener});
        } else {
            this.b.n(jvmUncaughtCrashListener);
        }
    }

    @Override // com.taobao.android.tcrash.UncaughtCrashManager
    public void removeOnFileCreatedListener(UncaughtCrashType uncaughtCrashType, OnFileCreatedListener onFileCreatedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7d9ba2f", new Object[]{this, uncaughtCrashType, onFileCreatedListener});
        } else if (uncaughtCrashType == UncaughtCrashType.JAVA_ONLY) {
            this.b.m(onFileCreatedListener);
        } else if (uncaughtCrashType == UncaughtCrashType.NATIVE_ONLY) {
            this.c.p(onFileCreatedListener);
        } else if (uncaughtCrashType == UncaughtCrashType.ANR_ONLY) {
            this.c.n(onFileCreatedListener);
        } else {
            this.b.m(onFileCreatedListener);
            this.c.p(onFileCreatedListener);
            this.c.n(onFileCreatedListener);
        }
    }
}
