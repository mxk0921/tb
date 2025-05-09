package com.alibaba.android.patronus;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import com.alibaba.android.patronus.Patrons;
import com.alibaba.android.patronus._Patrons;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.tcrash.UncaughtCrashHeader;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class _Patrons {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int ANDROID_VERSION_NOT_SUPPORT = 2001;
    private static final int ERROR_READ_VSS_FAILED = 1001;
    private static final long GB = 1073741824;
    private static final int HEAP_SIZE_IS_NOT_BIG_ENOUGH = 2002;
    private static final long KB = 1024;
    private static final int LOWER_LIMIT_IS_TOO_SMALL = 2003;
    private static final long MB = 1048576;
    private static boolean NATIVE_LIB_LOADED = false;
    public static final String TAG = "Patrons";
    private static final int VERSION_CODES_R = 30;
    private static final float VSS_MAX_IN_V7A = 4.2949673E9f;
    private static long currentRegionSpaces = 0;
    private static ScheduledExecutorService service;
    private static volatile boolean shrinkTTF;
    private static volatile boolean useApkMap;
    private static final String numRegEx = "[^0-9]";
    private static final Pattern numPattern = Pattern.compile(numRegEx);
    private static Patrons.a config = new Patrons.a();
    private static final AtomicInteger strictCount = new AtomicInteger(0);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a extends TimerTask {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/patronus/_Patrons$AutoCheckerTask");
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            UncaughtCrashHeader crashCaughtHeader = TCrashSDK.instance().getCrashCaughtHeader();
            long readVssSize = _Patrons.readVssSize();
            float f = ((float) readVssSize) / _Patrons.VSS_MAX_IN_V7A;
            Log.e(_Patrons.TAG, "current space = " + _Patrons.access$000());
            if (_Patrons.access$000() - _Patrons.access$100().c < _Patrons.access$100().e) {
                Log.e(_Patrons.TAG, "vss has no space to resize, stop watching. current space = " + _Patrons.access$000());
                _Patrons.access$200();
            } else if (f > _Patrons.access$100().b) {
                Log.e(_Patrons.TAG, "vss has over the period, current vss = " + (readVssSize / 1048576) + "mb, period = " + f);
                if (!_Patrons.shrinkRegionSpace((int) _Patrons.access$002(_Patrons.access$000() - _Patrons.access$100().c))) {
                    Log.e(_Patrons.TAG, "vss resize failed, stop watching.");
                    _Patrons.access$200();
                    return;
                }
                long readVssSize2 = _Patrons.readVssSize();
                crashCaughtHeader.addHeaderInfo("patrons resizeResult", String.valueOf(readVssSize2));
                Log.e(_Patrons.TAG, "resize success, step = " + _Patrons.access$100().c + "mb, current vss = " + (readVssSize2 / 1048576) + "mb");
                Log.e(_Patrons.TAG, "enter strict mode after resize");
                _Patrons.access$300(_Patrons.access$100().d / 2);
            } else {
                Log.e(_Patrons.TAG, "[" + _Patrons.access$400().get() + "] every thing is OK, vss = " + (readVssSize / 1048576) + " mb, current period = " + f + ", heap = " + (_Patrons.getCurrentRegionSpaceSize() / 1048576) + " mb");
                _Patrons.access$300(_Patrons.access$100().d);
            }
        }
    }

    static {
        NATIVE_LIB_LOADED = false;
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0, new ThreadFactory() { // from class: tb.irx
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread lambda$static$0;
                lambda$static$0 = _Patrons.lambda$static$0(runnable);
                return lambda$static$0;
            }
        });
        service = newScheduledThreadPool;
        if (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) newScheduledThreadPool).setKeepAliveTime(3L, TimeUnit.SECONDS);
            ((ScheduledThreadPoolExecutor) service).allowCoreThreadTimeOut(true);
        }
        shrinkTTF = false;
        useApkMap = false;
        if (Build.VERSION.SDK_INT <= 34) {
            try {
                System.loadLibrary("patrons");
                NATIVE_LIB_LOADED = true;
            } catch (Throwable th) {
                Log.e(TAG, "e", th);
            }
        }
    }

    private _Patrons() {
    }

    public static synchronized int __init() {
        synchronized (_Patrons.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("bc940d6a", new Object[0])).intValue();
            } else if (!isSupport()) {
                return 2001;
            } else {
                config.getClass();
                config.getClass();
                int __init = __init(true, false, false);
                if (__init != 0) {
                    Log.e(TAG, "Patrons native init failed !");
                    return __init;
                }
                long currentRegionSpaceSize = getCurrentRegionSpaceSize() / 1048576;
                currentRegionSpaces = currentRegionSpaceSize;
                if (currentRegionSpaceSize > 0 && currentRegionSpaceSize <= 1024) {
                    Patrons.a aVar = config;
                    if (currentRegionSpaceSize < aVar.e) {
                        return 2003;
                    }
                    if (aVar.f2233a) {
                        if (readVssSize() < 0) {
                            Log.e(TAG, "Patrons read vss failed !");
                            return 1001;
                        }
                        toForeground();
                    }
                    StringBuilder sb = new StringBuilder("Patrons init finish, vss = ");
                    sb.append(readVssSize() / 1048576);
                    sb.append(" mb, heap = ");
                    sb.append(currentRegionSpaces);
                    sb.append(" mb");
                    return 0;
                }
                return 2002;
            }
        }
    }

    private static native int __init(boolean z, boolean z2, boolean z3);

    private static void _start(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0447dd9", new Object[]{new Integer(i)});
        } else if (config.f2233a) {
            Log.e(TAG, "_start");
            service.schedule(new a(), i, TimeUnit.SECONDS);
        }
    }

    public static /* synthetic */ long access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bcd6076b", new Object[0])).longValue();
        }
        return currentRegionSpaces;
    }

    public static /* synthetic */ long access$002(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e1550f5f", new Object[]{new Long(j)})).longValue();
        }
        currentRegionSpaces = j;
        return j;
    }

    public static /* synthetic */ Patrons.a access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Patrons.a) ipChange.ipc$dispatch("41ad4727", new Object[0]);
        }
        return config;
    }

    public static /* synthetic */ void access$200() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26a27df9", new Object[0]);
        } else {
            stop();
        }
    }

    public static /* synthetic */ void access$300(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("158ee109", new Object[]{new Integer(i)});
        } else {
            _start(i);
        }
    }

    public static /* synthetic */ AtomicInteger access$400() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("638e2da5", new Object[0]);
        }
        return strictCount;
    }

    public static native int deleteWebViewReservation();

    public static native String dumpLogs();

    public static String dumpNativeLogs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ce223bf", new Object[0]);
        }
        if (NATIVE_LIB_LOADED) {
            return dumpLogs();
        }
        return "can not dump logs without native libs";
    }

    public static native long getCurrentRegionSpaceSize();

    public static void inBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a66073a", new Object[0]);
        } else {
            Log.e(TAG, "stop");
        }
    }

    public static synchronized int init(Context context, Patrons.a aVar) {
        synchronized (_Patrons.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("500a5a8d", new Object[]{context, aVar})).intValue();
            }
            if (aVar != null) {
                config = aVar;
            }
            new StringBuilder("Patrons start init, config = ").append(config.toString());
            return __init();
        }
    }

    private static boolean isSupport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d8a2150", new Object[0])).booleanValue();
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 23 || i > 30) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread lambda$static$0(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Thread) ipChange.ipc$dispatch("b5ab8d0b", new Object[]{runnable});
        }
        return new Thread(runnable, TAG);
    }

    public static long readVssSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("141387fc", new Object[0])).longValue();
        }
        long j = -1;
        try {
            FileInputStream fileInputStream = new FileInputStream("/proc/" + Process.myPid() + "/status");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String lowerCase = readLine.toLowerCase();
                if (lowerCase.contains("vmsize")) {
                    j = Integer.parseInt(numPattern.matcher(lowerCase).replaceAll("").trim()) * 1024;
                    break;
                }
            }
            fileInputStream.close();
            bufferedReader.close();
        } catch (Exception unused) {
            Log.e(TAG, "read current status failed.");
        }
        return j;
    }

    public static native boolean resetThreadSize(int i);

    public static boolean resetVMThreadSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fcf507ef", new Object[]{new Integer(i)})).booleanValue();
        }
        if (i < 1024 || i > 1048576) {
            return false;
        }
        return resetThreadSize(i);
    }

    private static native int reuseApkMap();

    public static int reuseDupApkMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d57d3765", new Object[0])).intValue();
        }
        if (!NATIVE_LIB_LOADED || useApkMap) {
            return 0;
        }
        useApkMap = true;
        return reuseApkMap();
    }

    public static native boolean shrinkRegionSpace(int i);

    private static native int shrinkTTF(int i, int[] iArr);

    public static int shrinkTTF(int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("16ffdb25", new Object[]{iArr})).intValue();
        }
        if (!NATIVE_LIB_LOADED || shrinkTTF) {
            return 0;
        }
        shrinkTTF = true;
        return shrinkTTF(Build.VERSION.SDK_INT, iArr);
    }

    private static void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[0]);
            return;
        }
        inBackground();
        config.f2233a = false;
    }

    public static void toForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce33fba5", new Object[0]);
            return;
        }
        Log.e(TAG, "toForeground");
        strictCount.set(0);
        _start(config.d);
    }
}
