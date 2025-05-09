package com.uc.webview.base;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class SdkGlobalSettings {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface Interface {
        String get(int i);

        Map<Integer, String> getModified();

        boolean isAccessible(int i, String str);

        boolean set(int i, String str);
    }

    public static String[] getSdkSettingKeys() {
        return KeyIdMap.f14251a;
    }

    public static String getUniqueId() {
        return "2271ebe46f364e3b27c9fb0f81b8eef6d48645fd";
    }

    public static boolean isAccessible(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return isAccessibleExactMatch(str, str2);
    }

    private static boolean isAccessibleExactMatch(String str, String str2) {
        for (String str3 : str2.split("\\^\\^")) {
            if (str.equals(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    public static Interface switchToCore(Interface r0) {
        return d.switchToCore(r0);
    }
}
