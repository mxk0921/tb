package tb;

import android.app.Application;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.ALog;
import org.android.agoo.honor.HonorRegister;
import org.android.agoo.huawei.HuaWeiRegister;
import org.android.agoo.mezu.MeizuRegister;
import org.android.agoo.oppo.OppoRegister;
import org.android.agoo.vivo.VivoRegister;
import org.android.agoo.xiaomi.MiPushRegistar;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class y2w {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(769654786);
    }

    public static void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3847dd28", new Object[]{application});
            return;
        }
        ALog.e("VendorPush", "VendorPush init start", new Object[0]);
        try {
            if (d()) {
                b(application);
            } else {
                c(application);
            }
        } catch (Throwable th) {
            ALog.e("VendorPush", "init push err", th, new Object[0]);
        }
    }

    public static void c(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecc2520d", new Object[]{application});
            return;
        }
        ALog.e("VendorPush", "initXiaoMi", new Object[0]);
        if (m8l.o()) {
            try {
                MiPushRegistar.register(application, "2882303761517135997", "5491713541997");
            } catch (Throwable th) {
                ALog.e("VendorPush", "MiPushRegistar err", th, new Object[0]);
            }
            try {
                OppoRegister.register(application, "X4PFm4rhiaASckCkqYSIIqA1", "6ZHzxPVPl2kLpMF8Ht2gmmfc");
            } catch (Throwable th2) {
                ALog.e("VendorPush", "OppoRegister err", th2, new Object[0]);
            }
            try {
                VivoRegister.register(application);
            } catch (Throwable th3) {
                ALog.e("VendorPush", "VivoRegister err", th3, new Object[0]);
            }
            try {
                MeizuRegister.register(application, "111373", "9c3cf30192a540eebbca03572d877ac5");
            } catch (Throwable th4) {
                ALog.e("VendorPush", "MeizuRegister err", th4, new Object[0]);
            }
        } else {
            try {
                MiPushRegistar.register(application, "2882303761517135997", "5491713541997");
                OppoRegister.register(application, "X4PFm4rhiaASckCkqYSIIqA1", "6ZHzxPVPl2kLpMF8Ht2gmmfc");
                MeizuRegister.register(application, "111373", "9c3cf30192a540eebbca03572d877ac5");
                VivoRegister.register(application);
            } catch (Throwable th5) {
                ALog.e("VendorPush", "init XiaoMiPush", th5, new Object[0]);
            }
        }
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e305a50f", new Object[0])).booleanValue();
        }
        if (!m8l.o()) {
            return HuaWeiRegister.checkDevice();
        }
        try {
            return HuaWeiRegister.checkDevice();
        } catch (Throwable th) {
            ALog.e("VendorPush", "isHMS err", th, new Object[0]);
            return false;
        }
    }

    public static boolean e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6e7a907c", new Object[]{context})).booleanValue();
        }
        if (!m8l.o()) {
            return HonorRegister.isSupport(context);
        }
        try {
            return HonorRegister.isSupport(context);
        } catch (Throwable th) {
            ALog.e("VendorPush", "isHonorAvailable err", th, new Object[0]);
            return false;
        }
    }

    public static void b(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e0050a1", new Object[]{application});
            return;
        }
        ALog.e("VendorPush", "initHuaWei", new Object[0]);
        if (e(application)) {
            ALog.e("VendorPush", "honor is available", new Object[0]);
            try {
                HonorRegister.registerBundle(application);
                return;
            } catch (Throwable th) {
                ALog.e("VendorPush", "HonorRegister err", th, new Object[0]);
            }
        }
        ALog.e("VendorPush", "register huawei start", new Object[0]);
        try {
            HuaWeiRegister.registerBundle(application, true);
        } catch (Throwable th2) {
            ALog.e("VendorPush", "HuaWeiRegister err", th2, new Object[0]);
        }
    }
}
