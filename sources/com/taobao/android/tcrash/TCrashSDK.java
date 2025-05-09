package com.taobao.android.tcrash;

import com.android.alibaba.ip.runtime.IpChange;
import tb.gd8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TCrashSDK {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private UncaughtCrashManager mManager;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final TCrashSDK f9635a = new TCrashSDK();

        public static /* synthetic */ TCrashSDK a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TCrashSDK) ipChange.ipc$dispatch("8b1e6fea", new Object[0]);
            }
            return f9635a;
        }
    }

    public static TCrashSDK instance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TCrashSDK) ipChange.ipc$dispatch("cccc408f", new Object[0]);
        }
        return b.a();
    }

    public TCrashSDK addAnrUncaughtListener(AnrUncaughtListener anrUncaughtListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TCrashSDK) ipChange.ipc$dispatch("52b982bb", new Object[]{this, anrUncaughtListener});
        }
        if (anrUncaughtListener == null) {
            return this;
        }
        this.mManager.addAnrUncaughtListener(anrUncaughtListener);
        return this;
    }

    public TCrashSDK addJvmUncaughtCrashListener(JvmUncaughtCrashListener jvmUncaughtCrashListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TCrashSDK) ipChange.ipc$dispatch("f408f461", new Object[]{this, jvmUncaughtCrashListener});
        }
        if (jvmUncaughtCrashListener == null) {
            return this;
        }
        this.mManager.addJvmUncaughtCrashListener(jvmUncaughtCrashListener);
        return this;
    }

    public TCrashSDK addOnFileCreatedListener(UncaughtCrashType uncaughtCrashType, OnFileCreatedListener onFileCreatedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TCrashSDK) ipChange.ipc$dispatch("24594c65", new Object[]{this, uncaughtCrashType, onFileCreatedListener});
        }
        if (onFileCreatedListener == null) {
            return this;
        }
        this.mManager.addOnFileCreatedListener(uncaughtCrashType, onFileCreatedListener);
        return this;
    }

    public UncaughtCrashHeader getCrashCaughtHeader() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UncaughtCrashHeader) ipChange.ipc$dispatch("b77f8adc", new Object[]{this});
        }
        return this.mManager.getUncaughtCrashHeader();
    }

    public UncaughtCrashHeader getCrashCaughtHeaderByType(UncaughtCrashType uncaughtCrashType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UncaughtCrashHeader) ipChange.ipc$dispatch("4e4d0667", new Object[]{this, uncaughtCrashType});
        }
        return this.mManager.getUncaughtCrashHeaderByType(uncaughtCrashType);
    }

    public UncaughtCrashManager getManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UncaughtCrashManager) ipChange.ipc$dispatch("313bd483", new Object[]{this});
        }
        return this.mManager;
    }

    public TCrashSDK removeAnrUncaughtListener(AnrUncaughtListener anrUncaughtListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TCrashSDK) ipChange.ipc$dispatch("1646dede", new Object[]{this, anrUncaughtListener});
        }
        if (anrUncaughtListener == null) {
            return this;
        }
        this.mManager.removeAnrUncaughtListener(anrUncaughtListener);
        return this;
    }

    public TCrashSDK removeJvmUncaughtCrashListener(JvmUncaughtCrashListener jvmUncaughtCrashListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TCrashSDK) ipChange.ipc$dispatch("f6d7c0c4", new Object[]{this, jvmUncaughtCrashListener});
        }
        if (jvmUncaughtCrashListener == null) {
            return this;
        }
        this.mManager.removeJvmUncaughtCrashListener(jvmUncaughtCrashListener);
        return this;
    }

    public TCrashSDK removeOnFileCreatedListener(UncaughtCrashType uncaughtCrashType, OnFileCreatedListener onFileCreatedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TCrashSDK) ipChange.ipc$dispatch("425126a2", new Object[]{this, uncaughtCrashType, onFileCreatedListener});
        }
        if (onFileCreatedListener == null) {
            return this;
        }
        this.mManager.removeOnFileCreatedListener(uncaughtCrashType, onFileCreatedListener);
        return this;
    }

    public TCrashSDK setUncaughtCrashManager(UncaughtCrashManager uncaughtCrashManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TCrashSDK) ipChange.ipc$dispatch("de335de2", new Object[]{this, uncaughtCrashManager});
        }
        if (uncaughtCrashManager == null) {
            return this;
        }
        this.mManager = uncaughtCrashManager;
        return this;
    }

    private TCrashSDK() {
        this.mManager = new gd8();
    }
}
