package com.taobao.accs.client;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.AccsException;
import com.taobao.accs.IProcessName;
import com.taobao.accs.utl.ALog;
import tb.rd0;
import tb.t2o;
import tb.xaa;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AccsConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "AccsConfig";
    public static AccsClientConfig.Builder mBuilder = null;
    private static boolean mInitConfig = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum SECURITY_TYPE {
        SECURITY_TAOBAO,
        SECURITY_OPEN,
        SECURITY_OFF;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(SECURITY_TYPE security_type, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/accs/client/AccsConfig$SECURITY_TYPE");
        }

        public static SECURITY_TYPE valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SECURITY_TYPE) ipChange.ipc$dispatch("391d7f87", new Object[]{str});
            }
            return (SECURITY_TYPE) Enum.valueOf(SECURITY_TYPE.class, str);
        }
    }

    static {
        t2o.a(343933029);
    }

    public static void build() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac6c63f5", new Object[0]);
            return;
        }
        try {
            AccsClientConfig configByTag = AccsClientConfig.getConfigByTag(ACCSManager.getDefaultConfig(null));
            if (AccsClientConfig.loadedStaticConfig && configByTag != null) {
                ALog.w(TAG, "default config already exists", new Object[0]);
            }
            getBuilder().build();
        } catch (AccsException e) {
            ALog.e(TAG, "build config error", e, new Object[0]);
        }
    }

    public static void disableInappKeepAlive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd08145b", new Object[0]);
        } else {
            getBuilder().setKeepAlive(false);
        }
    }

    private static AccsClientConfig.Builder getBuilder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccsClientConfig.Builder) ipChange.ipc$dispatch("9b0f56f9", new Object[0]);
        }
        if (!TextUtils.isEmpty(ACCSManager.mDefaultAppkey)) {
            if (mBuilder == null) {
                mBuilder = new AccsClientConfig.Builder().setAppKey(ACCSManager.mDefaultAppkey).setTag(ACCSManager.getDefaultConfig(null)).setAutoUnit(true);
            }
            return mBuilder;
        }
        throw new RuntimeException("old interface!!, please AccsManager.setAppkey() first!");
    }

    public static void setAccsCenterIps(String[] strArr, String[] strArr2, String[] strArr3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce6c4d55", new Object[]{strArr, strArr2, strArr3});
        }
    }

    public static void setAuthCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b493188", new Object[]{str});
            return;
        }
        getBuilder().setAutoCode(str);
        rd0.c = str;
    }

    public static void setChannelProcessName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dacee6a", new Object[]{str});
        } else {
            xaa.a(str);
        }
    }

    public static void setControlFrameMaxRetry(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("499133c6", new Object[]{new Integer(i)});
        } else {
            xaa.b(i);
        }
    }

    public static void setCurrProcessNameImpl(IProcessName iProcessName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ad69741", new Object[]{iProcessName});
        } else {
            xaa.c(iProcessName);
        }
    }

    public static void setMainProcessName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("874d06b0", new Object[]{str});
        } else {
            xaa.d(str);
        }
    }

    public static void setSecurityGuardOff(SECURITY_TYPE security_type) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7438d8b", new Object[]{security_type});
        } else {
            rd0.f27290a = security_type.ordinal();
        }
    }

    public static void setTnetPubkey(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c5353b4", new Object[]{new Integer(i), new Integer(i2)});
            return;
        }
        ALog.i(TAG, "setTnetPubkey", "pubKey", Integer.valueOf(i));
        getBuilder().setInappPubKey(i);
    }

    public static void setAccsCenterHosts(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c47690e7", new Object[]{str, str2, str3});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            ALog.e(TAG, "setAccsCenterHost null", new Object[0]);
        } else {
            ALog.i(TAG, "setAccsCenterHost", "env", Integer.valueOf(ACCSManager.mEnv), "releaseHost", str, "prepareHost", str2, "dailyHost", str3);
            int i = ACCSManager.mEnv;
            if (i == 1) {
                getBuilder().setInappHost(str2);
            } else if (i != 2) {
                getBuilder().setInappHost(str);
            } else {
                getBuilder().setInappHost(str3);
            }
        }
    }
}
