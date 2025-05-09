package tb;

import android.graphics.Color;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class sgw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ALI_SANS_TYPEFACE_ASSET_PATH = "iconfonts/AlibabaSans102_v1_TaoBao-Bd.ttf";
    public static final sgw INSTANCE = new sgw();

    static {
        t2o.a(689963210);
    }

    public final int a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("170122f4", new Object[]{this, str})).intValue();
        }
        if (str == null || wsq.a0(str)) {
            return 16777215;
        }
        try {
            return Color.parseColor(str);
        } catch (Exception e) {
            vgh.d(this, "ViewUtils", "解析颜色异常", e);
            return 16777215;
        }
    }
}
