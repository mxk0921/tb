package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.alibaba.ability.localization.Localization;
import com.alibaba.ability.localization.constants.Location;
import com.alipay.mobile.common.logging.util.LoggingSPCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class dno {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final dno INSTANCE = new dno();

    static {
        t2o.a(82837521);
    }

    public final String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8e88f5ed", new Object[]{this, context});
        }
        if (context != null) {
            try {
                SharedPreferences sharedPreferences = context.getSharedPreferences("i18n_localization", 0);
                if (sharedPreferences != null) {
                    return sharedPreferences.getString("language_tag", null);
                }
            } catch (Exception e) {
                TLog.loge(Localization.LOG_MODULE, "Localization_SPUtil", String.valueOf(e.getMessage()));
            }
        }
        return null;
    }

    public final String b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b470e78a", new Object[]{this, context});
        }
        if (context != null) {
            try {
                SharedPreferences sharedPreferences = context.getSharedPreferences("i18n_localization", 0);
                if (sharedPreferences != null) {
                    return sharedPreferences.getString("location_code", null);
                }
            } catch (Exception e) {
                TLog.loge(Localization.LOG_MODULE, "Localization_SPUtil", String.valueOf(e.getMessage()));
            }
        }
        return null;
    }

    public final String c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b305c99b", new Object[]{this, context});
        }
        if (context != null) {
            try {
                SharedPreferences sharedPreferences = context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
                if (sharedPreferences != null) {
                    String str = null;
                    String string = sharedPreferences.getString("PREF_KEY_SELECTED_EDITION_CODE", null);
                    if (string != null) {
                        if (string.length() <= 0) {
                            string = null;
                        }
                        if (string != null) {
                            return string;
                        }
                    }
                    String string2 = sharedPreferences.getString("PREF_KEY_CHECKED_COUNTRY_CODE", null);
                    if (string2 != null) {
                        if (string2.length() > 0) {
                            str = string2;
                        }
                        if (str != null) {
                            return str;
                        }
                    }
                }
            } catch (Exception e) {
                TLog.loge(Localization.LOG_MODULE, "Localization_SPUtil", String.valueOf(e.getMessage()));
            }
        }
        return Location.CN.getCode();
    }

    public final void d(Context context, String str) {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor edit;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34ecb244", new Object[]{this, context, str});
            return;
        }
        ckf.g(str, LoggingSPCache.STORAGE_LANGUAGE);
        if (context != null && (sharedPreferences = context.getSharedPreferences("i18n_localization", 0)) != null && (edit = sharedPreferences.edit()) != null) {
            edit.putString("language_tag", str);
            edit.apply();
        }
    }

    public final void e(Context context, String str) {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor edit;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc02f447", new Object[]{this, context, str});
            return;
        }
        ckf.g(str, "location");
        if (context != null && (sharedPreferences = context.getSharedPreferences("i18n_localization", 0)) != null && (edit = sharedPreferences.edit()) != null) {
            edit.putString("location_code", str);
            edit.apply();
        }
    }
}
