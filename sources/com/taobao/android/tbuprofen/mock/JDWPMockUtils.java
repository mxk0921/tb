package com.taobao.android.tbuprofen.mock;

import com.android.alibaba.ip.runtime.IpChange;
import tb.asr;
import tb.osd;
import tb.t2o;
import tb.urr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class JDWPMockUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f9626a = false;
    public static boolean b = false;

    static {
        t2o.a(822083605);
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fede18a", new Object[0])).intValue();
        }
        try {
            if (f9626a) {
                return 0;
            }
            urr.a("JDWPMockUtils", "init...", new Object[0]);
            int initNative = initNative();
            if (initNative != 0) {
                urr.b("JDWPMockUtils", "Failed to init JDWP native", new Object[0]);
                return initNative;
            }
            f9626a = true;
            return initNative;
        } catch (Exception e) {
            urr.b("JDWPMockUtils", "Exception to init JDWP native", new Object[0]);
            e.printStackTrace();
            return -1;
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4500e523", new Object[0])).booleanValue();
        }
        try {
            if (f9626a) {
                return isJdwpAllowed();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("13986019", new Object[0])).booleanValue();
        }
        if (!b) {
            return true;
        }
        urr.a("JDWPMockUtils", "restore....", new Object[0]);
        return e(false);
    }

    public static boolean e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("478f6b61", new Object[]{new Boolean(z)})).booleanValue();
        }
        try {
            if (f9626a) {
                return setJdwpAllowed(z);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    private static native int initNative();

    private static native boolean isJdwpAllowed();

    private static native boolean setJdwpAllowed(boolean z);

    public static boolean c(osd osdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("393cf8f4", new Object[]{osdVar})).booleanValue();
        }
        urr.a("JDWPMockUtils", "mock....", new Object[0]);
        try {
            int a2 = a();
            if (a2 != 0) {
                osdVar.b(osd.ERR_JDWP_MOCK_INIT, String.valueOf(a2));
                urr.b("JDWPMockUtils", "Failed to init JDWPMockUtils!", new Object[0]);
                return false;
            }
            if (!b()) {
                if (!e(true)) {
                    osdVar.b(osd.ERR_JDWP_MOCK_MODIFY, "");
                    urr.b("JDWPMockUtils", "Failed to set JDWP debuggable!", new Object[0]);
                    return false;
                }
                b = !b;
                urr.d("JDWPMockUtils", "Mock jdwp debuggable successfully!!!", new Object[0]);
            }
            return true;
        } catch (Exception e) {
            osdVar.b(osd.ERR_JDWP_MOCK_EXCEPTION, asr.c(e));
            e.printStackTrace();
            urr.c("JDWPMockUtils", e, "Failed to mockNoneDebuggable!!", new Object[0]);
            return false;
        }
    }
}
