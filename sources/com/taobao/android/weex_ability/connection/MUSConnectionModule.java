package com.taobao.android.weex_ability.connection;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import tb.dwh;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class MUSConnectionModule extends MUSModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "connection";

    static {
        t2o.a(980418620);
    }

    public MUSConnectionModule(String str, MUSDKInstance mUSDKInstance) {
        super(str, mUSDKInstance);
    }

    public static /* synthetic */ Object ipc$super(MUSConnectionModule mUSConnectionModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_ability/connection/MUSConnectionModule");
    }

    @MUSMethod(uiThread = false)
    public String getNetworkType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("385238e7", new Object[]{this});
        }
        return getNetworkTypeInternal();
    }

    private String getNetworkTypeInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("794e9c2a", new Object[]{this});
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) getInstance().getUIContext().getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.isAvailable()) {
                int type = activeNetworkInfo.getType();
                if (!ConnectivityManager.isNetworkTypeValid(type)) {
                    return "unknown";
                }
                if (type == 1) {
                    return "wifi";
                }
                switch (activeNetworkInfo.getSubtype()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                        return "2g";
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                        return "3g";
                    case 13:
                        return "4g";
                    default:
                        return "other";
                }
            }
            return "none";
        } catch (Exception e) {
            dwh.h("MUSConnectionModule", e);
            return "unknown";
        }
    }
}
