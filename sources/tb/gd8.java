package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.AnrUncaughtListener;
import com.taobao.android.tcrash.JvmUncaughtCrashListener;
import com.taobao.android.tcrash.OnFileCreatedListener;
import com.taobao.android.tcrash.UncaughtCrashHeader;
import com.taobao.android.tcrash.UncaughtCrashManager;
import com.taobao.android.tcrash.UncaughtCrashType;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class gd8 implements UncaughtCrashManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5decbeed", new Object[]{str, str2});
        }
    }

    public static /* synthetic */ void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cda9207f", new Object[]{str, str2});
        }
    }

    @Override // com.taobao.android.tcrash.UncaughtCrashManager
    public void addAnrUncaughtListener(AnrUncaughtListener anrUncaughtListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("755eaec8", new Object[]{this, anrUncaughtListener});
        }
    }

    @Override // com.taobao.android.tcrash.UncaughtCrashManager
    public void addJvmUncaughtCrashListener(JvmUncaughtCrashListener jvmUncaughtCrashListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7610fb6e", new Object[]{this, jvmUncaughtCrashListener});
        }
    }

    @Override // com.taobao.android.tcrash.UncaughtCrashManager
    public void addOnFileCreatedListener(UncaughtCrashType uncaughtCrashType, OnFileCreatedListener onFileCreatedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e87f0572", new Object[]{this, uncaughtCrashType, onFileCreatedListener});
        }
    }

    @Override // com.taobao.android.tcrash.UncaughtCrashManager
    public UncaughtCrashHeader getUncaughtCrashHeader() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UncaughtCrashHeader) ipChange.ipc$dispatch("d410a0ab", new Object[]{this});
        }
        return new UncaughtCrashHeader() { // from class: tb.ed8
            @Override // com.taobao.android.tcrash.UncaughtCrashHeader
            public final void addHeaderInfo(String str, String str2) {
                gd8.c(str, str2);
            }
        };
    }

    @Override // com.taobao.android.tcrash.UncaughtCrashManager
    public UncaughtCrashHeader getUncaughtCrashHeaderByType(UncaughtCrashType uncaughtCrashType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UncaughtCrashHeader) ipChange.ipc$dispatch("f8eaa438", new Object[]{this, uncaughtCrashType});
        }
        return new UncaughtCrashHeader() { // from class: tb.fd8
            @Override // com.taobao.android.tcrash.UncaughtCrashHeader
            public final void addHeaderInfo(String str, String str2) {
                gd8.d(str, str2);
            }
        };
    }

    @Override // com.taobao.android.tcrash.UncaughtCrashManager
    public void removeAnrUncaughtListener(AnrUncaughtListener anrUncaughtListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7894e06b", new Object[]{this, anrUncaughtListener});
        }
    }

    @Override // com.taobao.android.tcrash.UncaughtCrashManager
    public void removeJvmUncaughtCrashListener(JvmUncaughtCrashListener jvmUncaughtCrashListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19bbd51", new Object[]{this, jvmUncaughtCrashListener});
        }
    }

    @Override // com.taobao.android.tcrash.UncaughtCrashManager
    public void removeOnFileCreatedListener(UncaughtCrashType uncaughtCrashType, OnFileCreatedListener onFileCreatedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7d9ba2f", new Object[]{this, uncaughtCrashType, onFileCreatedListener});
        }
    }
}
