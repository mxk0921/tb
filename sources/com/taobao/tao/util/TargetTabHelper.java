package com.taobao.tao.util;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.navigationextern.NavigationExternSwitch;
import com.taobao.tao.log.TLog;
import com.taobao.tao.tbmaincontroller.ATBMainController;
import com.taobao.taobao.R;
import tb.a68;
import tb.t2o;
import tb.xe2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TargetTabHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TARGET_TAB_FLAG_NOT_FOUND = -1;
    public static final int TARGET_TAB_FLAG_REDIRECT = 302;
    private static boolean useNewTargetTab = true;

    static {
        t2o.a(775946448);
    }

    public static int getTargetTabIndex(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6798886d", new Object[]{context, intent})).intValue();
        }
        if (useNewTargetTab) {
            return getTargetTabIndexNew(context, intent);
        }
        return getTargetTabIndexOld(context, intent);
    }

    public static void setUseNewTargetTab(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f78be4", new Object[]{new Boolean(z)});
            return;
        }
        useNewTargetTab = z;
        TLog.loge("TargetTabHelper", "setUseNewTargetTab: " + z);
    }

    public static int getTargetTabIndexNew(Context context, Intent intent) {
        int i;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("af230435", new Object[]{context, intent})).intValue();
        }
        Bundle extras = intent.getExtras();
        if (extras == null || (i = extras.getInt("INTENT_FILTER_LABEL", -1)) == -1) {
            return -1;
        }
        if (i == R.string.tb_tab_home_title) {
            str = "homePage";
        } else if (i == R.string.tb_tab_weitao_title) {
            return 0;
        } else {
            if (i == R.string.tb_tab_chat_title) {
                str = "message";
            } else if (i == R.string.tb_tab_cart_title) {
                str = "cart";
            } else if (i == R.string.tb_tab_mytaobao_title) {
                str = "mytaobao";
            } else if (i == R.string.tb_tab_category_title) {
                str = "tmgcategory";
            } else if (i == R.string.tb_tab_discovery_title) {
                str = "discovery";
            } else if (i == R.string.tb_tab_guangguang_title) {
                str = "tab2";
            } else if (i != R.string.tb_tab_edlp_title) {
                return -1;
            } else {
                str = a68.TAG;
            }
        }
        int a2 = xe2.a(str);
        if (a2 != -1) {
            return a2;
        }
        TLog.loge("TargetTabHelper", "getTargetTabIndexNew: " + i + " bizCode: " + str);
        return 302;
    }

    public static int getTargetTabIndexOld(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e19d460e", new Object[]{context, intent})).intValue();
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            int i = extras.getInt(ATBMainController.EXTRA_FRAGMENT_TAB_INDEX, -1);
            if (i != -1) {
                return i;
            }
            int i2 = extras.getInt("INTENT_FILTER_LABEL", -1);
            if (i2 != -1) {
                if (!(i2 == R.string.tb_tab_home_title || i2 == R.string.tb_tab_weitao_title)) {
                    if (i2 == R.string.tb_tab_guangguang_title) {
                        if (NavigationExternSwitch.n()) {
                            return 1;
                        }
                    } else if (i2 != R.string.tb_tab_discovery_title) {
                        if (i2 == R.string.tb_tab_chat_title) {
                            if (NavigationExternSwitch.o()) {
                                return 302;
                            }
                        } else if (i2 == R.string.tb_tab_cart_title) {
                            return 3;
                        } else {
                            if (i2 == R.string.tb_tab_mytaobao_title) {
                                return 4;
                            }
                            if (i2 == R.string.tb_tab_category_title) {
                                if (Localization.o() || NavigationExternSwitch.B()) {
                                    return 1;
                                }
                            } else if (i2 != R.string.tb_tab_edlp_title || !NavigationExternSwitch.o()) {
                            }
                        }
                        return 2;
                    } else if (NavigationExternSwitch.z(context)) {
                        return 1;
                    }
                }
                return 0;
            }
        }
        return -1;
    }
}
