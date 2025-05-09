package com.taobao.tao.util;

import android.content.Context;
import com.alibaba.evo.EVO;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TBStatusBarSwitch {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TB_STATUS_BAR_BUTTON_VISIBLE_KEY = "isNavigationIconVisible";

    public static boolean isIconVisibleFeatureOpen(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71d7b614", new Object[]{context})).booleanValue();
        }
        return EVO.isSwitchOpened(context, TB_STATUS_BAR_BUTTON_VISIBLE_KEY);
    }
}
