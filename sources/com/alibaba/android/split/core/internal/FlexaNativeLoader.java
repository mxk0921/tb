package com.alibaba.android.split.core.internal;

import android.os.Looper;
import android.util.Log;
import com.alibaba.android.split.core.splitcompat.Reflector;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.IOException;
import tb.acq;
import tb.hbi;
import tb.jcq;
import tb.n1r;
import tb.ocq;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class FlexaNativeLoader {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "FlexaNativeLoader";

    static {
        t2o.a(677380140);
    }

    private static String findLibrary(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a450832d", new Object[]{str});
        }
        try {
            return (String) Reflector.s(FlexaNativeLoader.class.getClassLoader()).l("findLibrary", String.class).b(str);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static void load(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86e3e2bd", new Object[]{str, new Boolean(z)});
            return;
        }
        try {
            System.load(str);
        } catch (Throwable th) {
            th.printStackTrace();
            Log.e(TAG, "fileName:" + str + "fileMd5:" + hbi.b(new File(str)));
            if ((th instanceof UnsatisfiedLinkError) && th.getMessage().contains("has bad ELF magic") && z) {
                new File(str).delete();
            }
        }
    }

    public static void loadFeature(ocq ocqVar, jcq jcqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4d46638", new Object[]{ocqVar, jcqVar});
            return;
        }
        try {
            if (Thread.currentThread().getId() != Looper.getMainLooper().getThread().getId() || n1r.u(jcqVar.j())) {
                String b = ocqVar.b();
                Log.e(TAG, "load feature so " + b + " ");
                if (ocqVar.b().equals("messagesdkwrapper") && jcqVar.o()) {
                    loadLibrary("sqlite3");
                    loadLibrary("FTSEngine");
                    loadLibrary("aim");
                    loadLibrary("messagesdkwrapper");
                    return;
                }
                return;
            }
            String b2 = ocqVar.b();
            Log.e(TAG, "load feature " + b2 + " in mainThead skip");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void loadLibrary(String str) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5824adc6", new Object[]{str});
            return;
        }
        try {
            System.loadLibrary(str);
        } catch (Throwable th) {
            if ((th instanceof UnsatisfiedLinkError) && th.getMessage().contains("has bad ELF magic")) {
                z = true;
            }
            th.printStackTrace();
            String findLibrary = findLibrary(System.mapLibraryName(str));
            if (findLibrary == null || !new File(findLibrary).exists()) {
                try {
                    jcq e = acq.p().e();
                    File D = e.D("messagesdkwrapper", "lib" + str + jcq.SO_EXTENSION);
                    if (D.exists()) {
                        load(D.getAbsolutePath(), z);
                    } else {
                        Log.e(TAG, "load loadLibrary:" + str + " soFile:" + D.getAbsolutePath() + " is not exit");
                    }
                } catch (IOException unused) {
                    th.printStackTrace();
                }
                Log.e(TAG, "load loadLibrary:" + str + " path not exit!" + FlexaNativeLoader.class.getClassLoader() + " path:" + findLibrary);
                return;
            }
            load(findLibrary, z);
        }
    }
}
