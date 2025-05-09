package com.taobao.mytaobao.newsetting;

import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mytaobao.ut.UserTrackConstants;
import com.taobao.orange.OrangeConfig;
import com.taobao.statistic.TBS;
import com.taobao.tao.Globals;
import com.taobao.utils.Global;
import tb.px5;
import tb.s32;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FontSetting {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_FONT_CHANGE = "taobao.action.ACTION_FONT_CHANGE";
    public static final String SP_COEFFICIENT_KEY = "coefficient";
    public static final String SP_NAME = "fontSetting";
    public static final float[] fontSizeFactors = {0.8f, 1.0f, 1.12f, 1.31f, 1.52f};

    static {
        t2o.a(745537769);
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4c4fa33b", new Object[]{context})).intValue();
        }
        if (context == null) {
            context = Globals.getApplication();
        }
        return context.getSharedPreferences("fontSetting", 0).getInt("coefficient", 1);
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("20dfd238", new Object[0])).intValue();
        }
        if ("true".equals(OrangeConfig.getInstance().getConfig("fontSizeSetting", "open", "true"))) {
            return Global.getApplication().getSharedPreferences("fontSetting", 0).getInt("coefficient", 1);
        }
        return 1;
    }

    public static double c(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("34c6553e", new Object[]{new Double(d)})).doubleValue();
        }
        s32.c().i("FontSetting.sizeByFactor");
        return d * fontSizeFactors[b()];
    }

    public static void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21a7d8ad", new Object[]{context});
            return;
        }
        Intent intent = new Intent();
        intent.setAction(ACTION_FONT_CHANGE);
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
    }

    public static void setFontCofficient(Context context, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da908925", new Object[]{context, new Integer(i), str});
            return;
        }
        s32.c().i("FontSetting.setFontCofficient");
        int a2 = a(context);
        px5.b().j(i);
        if (a2 != i) {
            context.getSharedPreferences("fontSetting", 0).edit().putInt("coefficient", i).commit();
            d(context);
        }
        Pair<String, String> pair = UserTrackConstants.FONT_SETTING_TRACKS.get(i);
        TBS.Ext.commitEvent(str, Integer.parseInt("2101"), pair.first, null, null, "spm=" + pair.second);
    }
}
