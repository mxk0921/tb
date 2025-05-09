package com.ali.user.mobile.utils;

import android.app.Activity;
import android.content.res.Configuration;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.PositionInfo;
import com.taobao.login4android.log.LoginTLogAdapter;
import java.util.Locale;
import tb.o78;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class LanguageUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(68157641);
    }

    public static String getCountry() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("73367799", new Object[0]);
        }
        Locale currentLanguage = DataProviderFactory.getDataProvider().getCurrentLanguage();
        if (currentLanguage == null) {
            return o78.CHINA_MAINLAND;
        }
        return currentLanguage.getCountry();
    }

    public static String getLanguage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c65c8aeb", new Object[0]);
        }
        Locale currentLanguage = DataProviderFactory.getDataProvider().getCurrentLanguage();
        if (currentLanguage == null) {
            return "zh";
        }
        return currentLanguage.getLanguage();
    }

    public static boolean isChineseLanguage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a92e3e6", new Object[0])).booleanValue();
        }
        Locale currentLanguage = DataProviderFactory.getDataProvider().getCurrentLanguage();
        if (currentLanguage == null) {
            return true;
        }
        return "zh".equals(currentLanguage.getLanguage());
    }

    public static boolean isHK() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dddb59b8", new Object[0])).booleanValue();
        }
        try {
            PositionInfo i = o78.i(DataProviderFactory.getApplicationContext());
            if (i == null) {
                return false;
            }
            return "HK".equals(i.countryCode);
        } catch (Throwable th) {
            LoginTLogAdapter.e("login.LoginStatus", "isHKFailed," + th.getMessage());
            return false;
        }
    }

    public static boolean isRuLanguage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca5b4990", new Object[0])).booleanValue();
        }
        Locale currentLanguage = DataProviderFactory.getDataProvider().getCurrentLanguage();
        if (currentLanguage == null) {
            return false;
        }
        return "ru".equals(currentLanguage.getLanguage());
    }

    public static void onLanguageSwitchNotify(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17f7ff2d", new Object[]{activity});
        } else if (activity != null && !activity.isFinishing()) {
            try {
                Configuration configuration = activity.getResources().getConfiguration();
                Locale currentLanguage = DataProviderFactory.getDataProvider().getCurrentLanguage();
                configuration.locale = currentLanguage;
                if (currentLanguage != null) {
                    activity.getResources().updateConfiguration(configuration, activity.getResources().getDisplayMetrics());
                    DataProviderFactory.getApplicationContext().getResources().updateConfiguration(configuration, DataProviderFactory.getApplicationContext().getResources().getDisplayMetrics());
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
