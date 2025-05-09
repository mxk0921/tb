package com.taobao.android.tbreakpad;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbreakpad.TBreakpadConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import tb.bqk;
import tb.dhh;
import tb.ipk;
import tb.ojj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TBreakpadNativeBridge {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TBreakpadNativeBridge";
    private static boolean sInited;
    private static bqk sOnAnrCompletedListener;
    private static final Lock sLock = new ReentrantLock();
    private static final List<ipk> sOnAnrListener = new ArrayList();

    public static void addHeaderInfo(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc462277", new Object[]{str, str2});
        } else if (sInited && str != null) {
            try {
                nativeAddHeaderInfo(str, str2);
            } catch (Throwable th) {
                dhh.c(th);
            }
        }
    }

    public static void addOnAnrListener(ipk ipkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9df5878f", new Object[]{ipkVar});
            return;
        }
        Lock lock = sLock;
        if (lock.tryLock()) {
            if (ipkVar != null) {
                try {
                    List<ipk> list = sOnAnrListener;
                    if (!list.contains(ipkVar)) {
                        list.add(ipkVar);
                    }
                } catch (Throwable th) {
                    try {
                        dhh.c(th);
                        return;
                    } finally {
                        sLock.unlock();
                    }
                }
            }
            lock.unlock();
        }
    }

    public static void addOnCrashListener(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5328502", new Object[]{new Long(j)});
        } else if (sInited) {
            try {
                nativeAddOnCrashListener(j);
            } catch (Throwable th) {
                dhh.c(th);
            }
        }
    }

    public static void doLazyAction(TBreakpadConfig.NativeSwitch[] nativeSwitchArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2d0e6e9", new Object[]{nativeSwitchArr});
        } else if (sInited) {
            try {
                nativeDoLazyAction(nativeSwitchArr);
            } catch (Throwable th) {
                dhh.c(th);
            }
        }
    }

    public static void initAnrLooper() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12d42eed", new Object[0]);
        } else if (sInited) {
            try {
                nativeInitHandler();
            } catch (Throwable th) {
                dhh.c(th);
            }
        }
    }

    public static void initBreakpad(TBreakpadConfig tBreakpadConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90914aea", new Object[]{tBreakpadConfig});
        } else if (tBreakpadConfig != null && ensureSoLoaded(tBreakpadConfig) && !sInited) {
            try {
                nativeInit(tBreakpadConfig, Build.VERSION.SDK_INT);
                sInited = true;
            } catch (Throwable th) {
                dhh.c(th);
            }
        }
    }

    private static native void nativeAddHeaderInfo(String str, String str2);

    private static native void nativeAddOnCrashListener(long j);

    private static native void nativeDoLazyAction(Object[] objArr);

    private static native void nativeInit(TBreakpadConfig tBreakpadConfig, int i);

    private static native void nativeInitHandler();

    private static native void nativeRemoveOnCrashListener(long j);

    private static String onAnr() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16898b33", new Object[0]);
        }
        if (!sLock.tryLock()) {
            return "";
        }
        try {
            StringBuilder sb = new StringBuilder();
            for (ipk ipkVar : sOnAnrListener) {
                sb.append(ipkVar.a());
                sb.append("\n");
            }
            return sb.toString();
        } catch (Throwable th) {
            try {
                dhh.c(th);
                return "";
            } finally {
                sLock.unlock();
            }
        }
    }

    private static void onAnrCompleted(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99ba6a36", new Object[]{str});
            return;
        }
        bqk bqkVar = sOnAnrCompletedListener;
        if (bqkVar != null && str != null) {
            File file = new File(str);
            if (file.exists()) {
                dhh.a(TAG, "anr completed", str);
                ((ojj) bqkVar).a(file);
            }
        }
    }

    public static void removeOnAnrListener(ipk ipkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1709628c", new Object[]{ipkVar});
            return;
        }
        Lock lock = sLock;
        if (lock.tryLock()) {
            if (ipkVar != null) {
                try {
                    sOnAnrListener.remove(ipkVar);
                } catch (Throwable th) {
                    try {
                        dhh.c(th);
                        return;
                    } finally {
                        sLock.unlock();
                    }
                }
            }
            lock.unlock();
        }
    }

    public static void removeOnCrashListener(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c683565", new Object[]{new Long(j)});
        } else if (sInited) {
            try {
                nativeRemoveOnCrashListener(j);
            } catch (Throwable th) {
                dhh.c(th);
            }
        }
    }

    public static void setOnAnrCompletedListener(bqk bqkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("402886eb", new Object[]{bqkVar});
        } else {
            sOnAnrCompletedListener = bqkVar;
        }
    }

    public static boolean ensureSoLoaded(TBreakpadConfig tBreakpadConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5685b1a9", new Object[]{tBreakpadConfig})).booleanValue();
        }
        String str = tBreakpadConfig.mBreakpadSoPath;
        try {
            if (new File(str).exists()) {
                System.load(str);
            } else {
                System.loadLibrary("tbreakpad");
            }
            dhh.a(TAG, true);
            return true;
        } catch (Throwable th) {
            try {
                dhh.c(th);
                dhh.a(TAG, Boolean.FALSE);
                return false;
            } catch (Throwable th2) {
                dhh.a(TAG, Boolean.FALSE);
                throw th2;
            }
        }
    }
}
