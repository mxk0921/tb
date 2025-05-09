package com.taobao.android.behavix.bhxbridge;

import com.alibaba.android.umbrella.trace.UmbrellaTracker;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.utils.Debuggable;
import java.io.File;
import java.util.Map;
import tb.bkt;
import tb.bzn;
import tb.eqv;
import tb.f82;
import tb.gwv;
import tb.lzo;
import tb.o1v;
import tb.oeh;
import tb.t2o;
import tb.tno;
import tb.zau;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class BHXCXXBaseBridge extends eqv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile boolean isNativeLibraryLoaded = false;
    public static boolean isSOInited = false;
    public static String mDBPath = "";
    public static tno _db = null;
    private static String WALLE_FIRST_INIT_TABLE_STATUS = "walle_first_init_table_status";
    private static String CHANGED_TO_BX_DB_STATUS = "1";
    private static String WALLE_INITED_TABLE_STATUS = "1";

    public static boolean LoadCXXLib() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95744e13", new Object[0])).booleanValue();
        }
        if (f82.j()) {
            return a.a();
        }
        return false;
    }

    public static boolean checkCXXLib() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da165f95", new Object[0])).booleanValue();
        }
        return isNativeLibraryLoaded;
    }

    public static /* synthetic */ Object ipc$super(BHXCXXBaseBridge bHXCXXBaseBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavix/bhxbridge/BHXCXXBaseBridge");
    }

    private static native void nativeSetupBHXCXX(String str, boolean z, String str2, String str3, boolean z2, boolean z3);

    private static native void nativeSetupEnv(String str, boolean z, boolean z2, boolean z3, int i, boolean z4);

    private static native void nativeSetupUCP();

    public static void setupBHXCpp() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36e4e5b5", new Object[0]);
        } else if (LoadCXXLib() && !isSOInited) {
            isSOInited = true;
            zau.a("setupBHXCpp-1");
            String file = lzo.b().a().getFilesDir().toString();
            StringBuilder sb = new StringBuilder();
            String str2 = File.separator;
            sb.append(str2);
            sb.append("DAI");
            sb.append(str2);
            sb.append("Database/edge_compute.db");
            String sb2 = sb.toString();
            mDBPath = file + sb2;
            Map<String, String> b = o1v.b(f82.d());
            if (b != null) {
                str = b.get(oeh.UTDID);
            } else {
                str = "";
            }
            nativeSetupEnv(file, true, bkt.c().e(), gwv.x(), gwv.m(), Debuggable.isDebug());
            zau.a("setupBHXCpp-2");
            nativeSetupUCP();
            zau.a("setupBHXCpp-3");
            zau.a("setupBHXCpp-4");
            BHXCXXInnerBridge.initOrangeByCacheValue();
            zau.a("setupBHXCpp-5");
            nativeSetupBHXCXX(mDBPath, Debuggable.isDebug(), str, file, true, bkt.c().e());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final boolean f6452a;

        public static /* synthetic */ boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
            }
            return b();
        }

        public static boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
            }
            return f6452a;
        }

        static {
            boolean isDebug;
            t2o.a(404750508);
            f6452a = false;
            try {
                zau.a("LoadCXXLibCls-1");
                if (gwv.x()) {
                    if (!gwv.v()) {
                        bzn.d().c("MNN");
                        zau.a("LoadCXXLibCls-mnn");
                    }
                    if (bzn.d().c("bhx_cxx").i()) {
                        BHXCXXBaseBridge.isNativeLibraryLoaded = true;
                        f6452a = true;
                    } else {
                        UmbrellaTracker.commitFailureStability("eventProcess", "user_action_track_error", "1.0", "BehaviX", "JNI", null, "System.loadLibrary error", "RemoteSo load error");
                    }
                } else {
                    System.loadLibrary("bhx_cxx");
                    BHXCXXBaseBridge.isNativeLibraryLoaded = true;
                    f6452a = true;
                }
                zau.a("LoadCXXLibCls-2");
            } finally {
                if (!isDebug) {
                }
            }
        }
    }

    static {
        t2o.a(404750507);
    }
}
