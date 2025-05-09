package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class wu9 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SP_COEFFICIENT_KEY = "coefficient";
    public static final String SP_NAME = "fontSetting";
    public static final float[] fontSizeFactors = {0.8f, 1.0f, 1.12f, 1.31f, 1.52f};

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
}
