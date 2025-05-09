package com.taobao.uikit.utils;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class FeatureSwitch {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ROUND_RECT_SHAPE_IMAGE_SHOW_COMPLETELY_KEY = "round_rect_show_completely";
    private static final String SWITCH_NAMESPACE = "uikit_namespace";
    private static final String UIK_SAVE_IMAGE_USE_DESIGN_TOKEN_UI_KEY = "uik_save_image_use_design_token_ui";

    public static boolean isRoundRectShowCompletelyOpen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c275b00", new Object[0])).booleanValue();
        }
        return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(SWITCH_NAMESPACE, ROUND_RECT_SHAPE_IMAGE_SHOW_COMPLETELY_KEY, "true"));
    }

    public static boolean isSaveImageUseDesignTokenUIOpen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d218651", new Object[0])).booleanValue();
        }
        return Boolean.parseBoolean(OrangeConfig.getInstance().getConfig(SWITCH_NAMESPACE, UIK_SAVE_IMAGE_USE_DESIGN_TOKEN_UI_KEY, "true"));
    }
}
