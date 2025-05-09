package com.alibaba.ariver.app.api.ui.darkmode;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.model.AppConfigModel;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ThemeUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COLOR_SCHEME_DARK = "dark";
    public static final String COLOR_SCHEME_LIGHT = "light";
    public static final String KEY_COLOR_SCHEME = "colorSchemes";

    /* renamed from: a  reason: collision with root package name */
    public static String f2426a = "";

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public @interface ColorScheme {
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c54528b4", new Object[0])).booleanValue();
        }
        return TextUtils.equals(f2426a, COLOR_SCHEME_DARK);
    }

    public static String getColorScheme(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f759db69", new Object[]{configuration});
        }
        if (isDarkMode(configuration)) {
            return COLOR_SCHEME_DARK;
        }
        return "light";
    }

    public static boolean isDarkMode(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79643682", new Object[]{context})).booleanValue();
        }
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        return (uiModeManager != null ? uiModeManager.getNightMode() : 1) == 2 || isDarkMode(context.getResources().getConfiguration()) || a();
    }

    public static void setAppConfigColorScheme(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28a66cf8", new Object[]{str});
        } else {
            f2426a = str;
        }
    }

    public static boolean isSupportDarkTheme(App app) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22a080cd", new Object[]{app})).booleanValue();
        }
        AppConfigModel appConfigModel = (AppConfigModel) app.getData(AppConfigModel.class);
        if (appConfigModel == null || (jSONArray = JSONUtils.getJSONArray(appConfigModel.getAppLaunchParams(), RVStartParams.KEY_SUPPORT_COLOR_SCHEME, null)) == null) {
            return false;
        }
        return jSONArray.contains(COLOR_SCHEME_DARK);
    }

    public static boolean isDarkMode(Configuration configuration) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a45192a", new Object[]{configuration})).booleanValue() : (configuration.uiMode & 48) == 32;
    }
}
