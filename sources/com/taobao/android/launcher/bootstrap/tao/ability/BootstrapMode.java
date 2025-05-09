package com.taobao.android.launcher.bootstrap.tao.ability;

import android.content.Context;
import android.content.Intent;
import android.util.SparseIntArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.android.autosize.TBDeviceUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.fxp;
import tb.ppo;
import tb.whh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class BootstrapMode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ABILITY_COLD_AD = 256;
    public static final int ABILITY_COLD_BOOT_IMAGE = 32;
    public static final int ABILITY_COLD_LAUNCHER = 262144;
    public static final int ABILITY_COLD_PRELOAD = 4096;
    public static final int ABILITY_COLD_THEMIS = 4;
    public static final int ABILITY_COLD_UCP = 64;
    public static final int ABILITY_ERASE_STATE = 128;
    public static final int ABILITY_FULLY_NEW_INSTALL = 1024;
    public static final int ABILITY_FULL_NEW_INSTALL_LINK = 65536;
    public static final int ABILITY_KEEP_ALIVE = 2;
    public static final int ABILITY_MULTI_LANGUAGE = 2048;
    public static final int ABILITY_NG_AFC_HOME = 131072;
    public static final int ABILITY_NG_FAST_ENTER = 524288;
    public static final int ABILITY_NG_NEXT_DELEGATE = 512;
    public static final int ABILITY_NG_NEXT_SCHEDULER_BOOTSTRAP = 8;
    public static final int ABILITY_PAD_OR_FOLD = 32768;
    public static final int ABILITY_PATCH = 1;
    public static final int ABILITY_PHONE = 16;
    public static final int ABILITY_QOS_SCHEDULE = 8192;
    public static final String EXTRA_KEY_ABILITIES = "abilities";
    public static final String EXTRA_KEY_BIZ_NAME = "__link_module_name__";
    public static final String EXTRA_KEY_COMPONENT = "component";
    public static final String EXTRA_KEY_FAST_ENTER_BIZ = "fastEnterBiz";
    public static final String EXTRA_KEY_FULLY_NEW_INSTALL = "fullyNewInstall";
    public static final String EXTRA_KEY_INTENT_DATA_AFC_URL = "__afcUrl__";
    public static final String EXTRA_KEY_INTENT_DATA_AFC_URL_H5 = "__afcH5Url__";
    public static final String EXTRA_KEY_LIFECYCLE_COMPACT = "lifecycleCompact";
    public static final String EXTRA_KEY_MODE = "mode";

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface AbilityFlags {
    }

    public static int b() {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a71a48cb", new Object[0])).intValue();
        }
        fxp j = fxp.j();
        if (j == null || (intent = j.b) == null) {
            return 0;
        }
        return intent.getIntExtra(EXTRA_KEY_ABILITIES, 0);
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7f6030c6", new Object[]{str});
        }
        fxp j = fxp.j();
        if (j == null) {
            return null;
        }
        return j.b.getStringExtra(str);
    }

    public static boolean d(int i) {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52724430", new Object[]{new Integer(i)})).booleanValue();
        }
        fxp j = fxp.j();
        if (j == null || (intent = j.b) == null || (intent.getIntExtra(EXTRA_KEY_ABILITIES, 0) & i) != i) {
            return false;
        }
        return true;
    }

    public static void f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d008fe0b", new Object[]{str, str2});
            return;
        }
        fxp j = fxp.j();
        if (j != null) {
            j.b.putExtra(str, str2);
        }
    }

    public static void g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7de2fc4", new Object[]{context});
        } else {
            h(context, 0);
        }
    }

    public static void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16afade", new Object[]{new Integer(i)});
            return;
        }
        fxp j = fxp.j();
        if (j != null) {
            j.b.putExtra(EXTRA_KEY_ABILITIES, i | j.b.getIntExtra(EXTRA_KEY_ABILITIES, 0));
        }
    }

    public static void k(int i, String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c796a3a9", new Object[]{new Integer(i), str, new Integer(i2)});
        } else {
            m(i, null, str, i2);
        }
    }

    public static boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c0b5fdb", new Object[0])).booleanValue();
        }
        return false;
    }

    public static boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("514e1cae", new Object[0])).booleanValue();
        }
        return d(262152);
    }

    public static boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f1b2d5", new Object[0])).booleanValue();
        }
        return d(16);
    }

    public static void j(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe2e229a", new Object[]{new Integer(i), str});
        } else {
            m(i, null, str, 0);
        }
    }

    public static void l(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaed99e4", new Object[]{new Integer(i), str, str2});
        } else {
            m(i, str, str2, 0);
        }
    }

    public static void m(int i, String str, String str2, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72c6159f", new Object[]{new Integer(i), str, str2, new Integer(i2)});
            return;
        }
        fxp j = fxp.j();
        if (j != null && j.b != null) {
            whh.a("BootstrapMode", "updateMode, mode=" + i + ", component=" + str2 + ", abilities=" + i2);
            j.b.putExtra("mode", i).putExtra("component", str2).putExtra("__link_module_name__", str).putExtra(EXTRA_KEY_ABILITIES, j.b.getIntExtra(EXTRA_KEY_ABILITIES, 0) | i2);
        }
    }

    public static boolean e(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbd6b45b", new Object[]{new Integer(i), new Integer(i2)})).booleanValue();
        }
        return (i & i2) == i2;
    }

    public static void h(Context context, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3e83bbf", new Object[]{context, new Integer(i)});
            return;
        }
        fxp b = fxp.b(ppo.b().c());
        fxp.a(b);
        if (i == 0) {
            if (!TBDeviceUtils.P(context) && !TBDeviceUtils.p(context)) {
                z = false;
            }
            whh.a("BootstrapMode", "is current device type tablet or fold ? " + z);
            i = z ? 32768 : 16;
        }
        b.b.putExtra(EXTRA_KEY_ABILITIES, i);
    }

    public static SparseIntArray a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SparseIntArray) ipChange.ipc$dispatch("9dd60e1a", new Object[]{context, str});
        }
        SparseIntArray sparseIntArray = new SparseIntArray(2);
        str.hashCode();
        if (str.equals("com.taobao.adaemon.TriggerService")) {
            sparseIntArray.put(0, UtilityImpl.isAppKeepAlive(context) ? 1 : 0);
            sparseIntArray.put(1, 2);
        } else if (!str.equals("com.taobao.update.datasource.accs.AccsIpService")) {
            sparseIntArray.put(0, 0);
            sparseIntArray.put(1, 0);
        } else {
            sparseIntArray.put(0, 1);
            sparseIntArray.put(1, 1);
        }
        return sparseIntArray;
    }
}
