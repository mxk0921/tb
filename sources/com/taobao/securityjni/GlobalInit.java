package com.taobao.securityjni;

import android.content.Context;
import android.content.ContextWrapper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.wireless.security.sdk.SecurityGuardManager;
import com.taobao.wireless.security.sdk.securitybody.ISecurityBodyComponent;
import tb.t2o;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class GlobalInit {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static String sAppKey = null;
    private static Context globalContext = null;

    static {
        t2o.a(421527565);
    }

    public static synchronized String GetGlobalAppKey() {
        synchronized (GlobalInit.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9707b02", new Object[0]);
            }
            return sAppKey;
        }
    }

    public static void GlobalSecurityInitAsync(ContextWrapper contextWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("689cc2e5", new Object[]{contextWrapper});
        } else {
            GlobalSecurityInitAsync(contextWrapper, null);
        }
    }

    public static void GlobalSecurityInitAsyncSDK(ContextWrapper contextWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bf09d8d", new Object[]{contextWrapper});
            return;
        }
        globalContext = contextWrapper;
        SecurityGuardManager.getInitializer().loadLibraryAsync(contextWrapper, null);
        SecurityGuardManager.getInstance(contextWrapper);
    }

    public static void GlobalSecurityInitAsyncSo(ContextWrapper contextWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80ac6921", new Object[]{contextWrapper});
        } else {
            globalContext = contextWrapper;
        }
    }

    public static void GlobalSecurityInitSync(ContextWrapper contextWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1fa530a", new Object[]{contextWrapper});
        } else {
            GlobalSecurityInitSync(contextWrapper, null);
        }
    }

    public static void GlobalSecurityInitSyncSDK(ContextWrapper contextWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faf9df48", new Object[]{contextWrapper});
            return;
        }
        globalContext = contextWrapper;
        if (SecurityGuardManager.getInitializer().loadLibrarySync(contextWrapper, null) == 0) {
            SecurityGuardManager.getInstance(contextWrapper);
        }
    }

    public static void GlobalSecurityInitSyncSo(ContextWrapper contextWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8e68406", new Object[]{contextWrapper});
        } else {
            GlobalSecurityInitSyncSo(contextWrapper, null);
        }
    }

    public static synchronized void SetGlobalAppKey(String str) {
        synchronized (GlobalInit.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b53d59b4", new Object[]{str});
            } else {
                sAppKey = str;
            }
        }
    }

    public static Context getGlobalContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("2c803a55", new Object[0]);
        }
        return globalContext;
    }

    private static void initSecBody(ContextWrapper contextWrapper) {
        ISecurityBodyComponent securityBodyComp;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bad271df", new Object[]{contextWrapper});
            return;
        }
        SecurityGuardManager instance = SecurityGuardManager.getInstance(contextWrapper);
        if (instance != null && (securityBodyComp = instance.getSecurityBodyComp()) != null) {
            String GetGlobalAppKey = GetGlobalAppKey();
            if (GetGlobalAppKey == null) {
                GetGlobalAppKey = instance.getStaticDataStoreComp().getAppKeyByIndex(0);
            }
            securityBodyComp.initSecurityBody(GetGlobalAppKey);
        }
    }

    public static void setEnableOutPutExpInfo(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70c96a88", new Object[]{new Boolean(z)});
        }
    }

    public static void GlobalSecurityInitAsync(ContextWrapper contextWrapper, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93dedd6f", new Object[]{contextWrapper, str});
            return;
        }
        globalContext = contextWrapper;
        SecurityGuardManager.getInitializer().loadLibraryAsync(contextWrapper, str);
    }

    public static void GlobalSecurityInitAsyncSo(ContextWrapper contextWrapper, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("157fecab", new Object[]{contextWrapper, str});
            return;
        }
        globalContext = contextWrapper;
        SecurityGuardManager.getInitializer().loadLibraryAsync(contextWrapper, str);
        SecurityGuardManager.getInstance(contextWrapper);
    }

    public static void GlobalSecurityInitSync(ContextWrapper contextWrapper, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0988e54", new Object[]{contextWrapper, str});
            return;
        }
        globalContext = contextWrapper;
        SecurityGuardManager.getInitializer().loadLibrarySync(contextWrapper, str);
    }

    public static void GlobalSecurityInitSyncSo(ContextWrapper contextWrapper, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da90f850", new Object[]{contextWrapper, str});
            return;
        }
        globalContext = contextWrapper;
        if (SecurityGuardManager.getInitializer().loadLibrarySync(contextWrapper, str) == 0) {
            SecurityGuardManager.getInstance(contextWrapper);
        }
    }
}
