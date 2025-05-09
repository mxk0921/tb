package com.ali.user.mobile.utils;

import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Locale;
import tb.t2o;
import tb.zk4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ResourceUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(68157649);
    }

    public static int getDrawableId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("442f9793", new Object[]{str})).intValue();
        }
        return getIdentifierByName(str, zk4.CONTACTS_INFO_NOT_EMPTY_STATUS);
    }

    private static int getIdentifierByName(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("de49820f", new Object[]{str, str2})).intValue();
        }
        int identifier = DataProviderFactory.getApplicationContext().getResources().getIdentifier(str, str2, DataProviderFactory.getApplicationContext().getPackageName());
        if (identifier != 0) {
            return identifier;
        }
        return DataProviderFactory.getApplicationContext().getResources().getIdentifier(str, str2, DataProviderFactory.getDataProvider().getAppName());
    }

    public static String getInvalidParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ec5c0b2d", new Object[0]);
        }
        return getStringById("aliuser_debug_param_invalid");
    }

    public static String getLocaleStr() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ac554ed8", new Object[0]);
        }
        String locale = Locale.SIMPLIFIED_CHINESE.toString();
        if (DataProviderFactory.getDataProvider().getCurrentLanguage() != null) {
            return DataProviderFactory.getDataProvider().getCurrentLanguage().toString();
        }
        return locale;
    }

    public static String getNetworkError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("63979e09", new Object[0]);
        }
        return getStringById("aliuser_network_error");
    }

    public static String getStringById(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a5a49096", new Object[]{str});
        }
        try {
            try {
                return Localization.r(str);
            } catch (Exception unused) {
                return "";
            }
        } catch (Throwable unused2) {
            int stringId = getStringId(str);
            if (stringId > 0) {
                return DataProviderFactory.getApplicationContext().getResources().getString(stringId);
            }
            return "";
        }
    }

    public static int getStringId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2f527386", new Object[]{str})).intValue();
        }
        return getIdentifierByName(str, "string");
    }
}
