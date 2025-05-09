package com.taobao.uikit.actionbar.util;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.orange.OrangeConfig;
import tb.cw6;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class MenuSwitch {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String KEY_LAYOUT_ALL_IN_ONE = "layout_all_in_one";
    private static final String KEY_SHOW_FULLSCREEN = "show_fullscreen";
    private static final String KEY_USE_NEW_CLICK_LISTENER = "use_new_click_listener";
    private static final String NAMESPACE = "uikit_menu";

    static {
        t2o.a(927989843);
    }

    public static boolean isAbTestOn(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c88ce679", new Object[]{activity})).booleanValue();
        }
        if (cw6.b() || ABGlobal.isFeatureOpened(activity, "globalMenuNewStyle")) {
            return true;
        }
        return false;
    }

    public static boolean isLayoutAllInOne() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a5557f", new Object[0])).booleanValue();
        }
        return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(NAMESPACE, KEY_LAYOUT_ALL_IN_ONE, "true"));
    }

    public static boolean isShowFullscreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("337865ed", new Object[0])).booleanValue();
        }
        return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(NAMESPACE, KEY_SHOW_FULLSCREEN, "true"));
    }

    public static boolean isUseNewClickListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("674872c4", new Object[0])).booleanValue();
        }
        return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(NAMESPACE, KEY_USE_NEW_CLICK_LISTENER, "true"));
    }
}
