package com.taobao.tao.util;

import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.staticdatastore.IStaticDataStoreComponent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;
import com.taobao.tao.Globals;
import java.util.Properties;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class GetAppKeyFromSecurity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "GetAppKeyFromSecurity";

    static {
        t2o.a(775946416);
    }

    public static String getAppKey(int i) {
        IStaticDataStoreComponent staticDataStoreComp;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("19695938", new Object[]{new Integer(i)});
        }
        String str = "21646297";
        if (i == 0) {
            return str;
        }
        try {
            SecurityGuardManager instance = SecurityGuardManager.getInstance(Globals.getApplication());
            if (instance == null || (staticDataStoreComp = instance.getStaticDataStoreComp()) == null) {
                return str;
            }
            str = staticDataStoreComp.getAppKeyByIndex(i, "");
            new StringBuilder("Get app key : ").append(str);
            return str;
        } catch (SecException e) {
            Properties properties = new Properties();
            properties.put("appkey", str);
            properties.put("error", Integer.valueOf(e.getErrorCode()));
            properties.put("appkeyIndex", Integer.valueOf(i));
            TBS.Ext.commitEvent("SecurityGuard_GetAppkey", properties);
            new StringBuilder("Cannot get appkey, error code is ").append(e.getErrorCode());
            return str;
        }
    }
}
