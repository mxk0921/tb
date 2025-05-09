package com.taobao.android.tbuprofen.mock;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.android.SystemUtils;
import com.taobao.android.tbuprofen.log.TBPLogLevel;
import tb.asr;
import tb.osd;
import tb.t2o;
import tb.urr;
import tb.v67;
import tb.zrr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class RuntimeMockUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f9627a = false;
    public static boolean b = false;
    public static osd c = new v67();
    public static boolean d = true;
    public static boolean e = false;

    static {
        t2o.a(822083606);
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("609fd204", new Object[]{context})).intValue();
        }
        return b(context, TBPLogLevel.DEBUG, null);
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f6f02e5", new Object[0])).booleanValue();
        }
        if (!f9627a) {
            urr.g("RuntimeMockUtils", "Trying to call setJavaDebuggable() without init", new Object[0]);
            return false;
        }
        try {
            return isJavaDebuggableNative();
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62a42c00", new Object[0])).booleanValue();
        }
        urr.a("RuntimeMockUtils", "mockRuntimeDebugFlag....", new Object[0]);
        try {
            if (findRuntimeDebugFlag() != 0) {
                c.b(osd.ERR_RUNTIME_MOCK_FIND, "");
                urr.b("RuntimeMockUtils", "Failed to set java debuggable!", new Object[0]);
                return false;
            }
            if (!c()) {
                if (!g(true)) {
                    c.b(osd.ERR_RUNTIME_MOCK_MODIFY, "");
                    urr.b("RuntimeMockUtils", "Failed to set java debuggable!", new Object[0]);
                    return false;
                }
                b = true;
                urr.d("RuntimeMockUtils", "Mock java debuggable successfully!!!", new Object[0]);
            }
            return true;
        } catch (Exception e2) {
            c.b(osd.ERR_RUNTIME_MOCK_EXCEPTION, asr.c(e2));
            e2.printStackTrace();
            urr.c("RuntimeMockUtils", e2, "Failed to mockNoneDebuggable!!", new Object[0]);
            return false;
        }
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27c4597c", new Object[0])).booleanValue();
        }
        if (!b) {
            return true;
        }
        urr.a("RuntimeMockUtils", "restore....", new Object[0]);
        return g(false);
    }

    private static native int findHeapFootprint();

    private static native int findRuntimeDebugFlag();

    public static boolean g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1c2e1df", new Object[]{new Boolean(z)})).booleanValue();
        }
        if (!f9627a) {
            urr.g("RuntimeMockUtils", "Trying to call setJavaDebuggable() without init", new Object[0]);
            return false;
        }
        try {
            return setJavaDebuggableNative(z);
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    private static native boolean isJavaDebuggableNative();

    private static native int nativeInit(int i, int i2, long j);

    private static native void restoreFootprintNative();

    private static native long setIdealFootprintDirectNative(long j);

    private static native long setIdealFootprintNative(long j);

    private static native boolean setJavaDebuggableNative(boolean z);

    private static native void setMockLogLevel(int i);

    public static int b(Context context, TBPLogLevel tBPLogLevel, osd osdVar) {
        int i;
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("95779bf2", new Object[]{context, tBPLogLevel, osdVar})).intValue();
        }
        if (f9627a) {
            return 0;
        }
        try {
            if (!TextUtils.isEmpty(zrr.c().loadLibrary("tbuprofen-util"))) {
                return -100;
            }
            if (osdVar != null) {
                c = osdVar;
            }
            setMockLogLevel(tBPLogLevel.ordinal());
            int i2 = context.getApplicationInfo().targetSdkVersion;
            int i3 = Build.VERSION.SDK_INT;
            long maxMemory = Runtime.getRuntime().maxMemory();
            urr.d("RuntimeMockUtils", "Init Mock tools on SDK: %s, Target version: %d. Heap max size: %dM", Integer.valueOf(i3), Integer.valueOf(i2), Long.valueOf(maxMemory >> 20));
            try {
                i = nativeInit(i2, i3, maxMemory);
                try {
                } catch (Throwable th2) {
                    th = th2;
                    urr.c("RuntimeMockUtils", th, "Exception to init RuntimeMock native.", new Object[0]);
                    f9627a = false;
                    return i;
                }
            } catch (Throwable th3) {
                th = th3;
                i = -1;
            }
            if (i != 0) {
                urr.b("RuntimeMockUtils", "Failed to init RuntimeMock native", new Object[0]);
                f9627a = false;
                return i;
            }
            f9627a = true;
            return i;
        } catch (Exception unused) {
            return -100;
        }
    }

    public static int f(long j) {
        long j2 = j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("febb9f64", new Object[]{new Long(j2)})).intValue();
        }
        if (!f9627a) {
            urr.g("RuntimeMockUtils", "Trying to call setIdealFootprint() without init", new Object[0]);
            return -1;
        }
        long maxMemory = Runtime.getRuntime().maxMemory();
        if (j2 > maxMemory) {
            j2 = maxMemory;
        }
        c.g(osd.MOCK_TYPE_HEAP_FOOTPRINT);
        long j3 = Runtime.getRuntime().totalMemory();
        int i = Build.VERSION.SDK_INT;
        if ((i < 29 || !d) && j3 >= j2) {
            urr.d("RuntimeMockUtils", "No need to set footprint from %d to %d.", Long.valueOf(j3), Long.valueOf(j2));
            return 1;
        } else if (SystemUtils.PRODUCT_HONOR.equals(Build.BOARD) && i == 31) {
            setIdealFootprintDirectNative(j2);
            return 2;
        } else if (e) {
            setIdealFootprintDirectNative(j2);
            return 4;
        } else {
            int findHeapFootprint = findHeapFootprint();
            if (findHeapFootprint != 0) {
                urr.g("RuntimeMockUtils", "Can't find the heap footprint. err: %d", Integer.valueOf(findHeapFootprint));
                c.h(osd.MOCK_TYPE_HEAP_FOOTPRINT, String.valueOf(findHeapFootprint), "Find Error");
                return findHeapFootprint;
            }
            try {
                ARTUtil.a();
                long idealFootprintNative = setIdealFootprintNative(j2);
                long j4 = Runtime.getRuntime().totalMemory();
                if (j4 != idealFootprintNative) {
                    e = true;
                    restoreFootprintNative();
                    if (idealFootprintNative < 0) {
                        urr.b("RuntimeMockUtils", "setIdealFootprintNative failed %d", Long.valueOf(idealFootprintNative));
                    } else {
                        urr.b("RuntimeMockUtils", "setIdealFootprintNative value %d different with totalMemory %d", Long.valueOf(j2), Long.valueOf(j4));
                        idealFootprintNative = idealFootprintNative > j4 ? -2L : -3L;
                    }
                    long idealFootprintDirectNative = setIdealFootprintDirectNative(j2);
                    if (idealFootprintDirectNative == 0) {
                        long j5 = Runtime.getRuntime().totalMemory();
                        if (j5 == j2) {
                            idealFootprintNative = 3;
                        } else {
                            urr.b("RuntimeMockUtils", "setIdealFootprintDirectNative value %d different with totalMemory %d", Long.valueOf(j2), Long.valueOf(j5));
                            idealFootprintNative = -4;
                        }
                    } else {
                        urr.b("RuntimeMockUtils", "setIdealFootprintDirectNative failed %d", Long.valueOf(idealFootprintDirectNative));
                    }
                    c.h(osd.MOCK_TYPE_HEAP_FOOTPRINT, String.valueOf(idealFootprintNative), "Set Error");
                    int i2 = (int) idealFootprintNative;
                    ARTUtil.b();
                    d = false;
                    return i2;
                }
                urr.b("RuntimeMockUtils", "totalMemory %d, ret %d", Long.valueOf(j4), Long.valueOf(idealFootprintNative));
                c.i(osd.MOCK_TYPE_HEAP_FOOTPRINT);
                ARTUtil.b();
                d = false;
                return 0;
            } catch (Throwable th) {
                ARTUtil.b();
                d = false;
                throw th;
            }
        }
    }
}
