package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class sqj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BUTTON_DESC = "，按钮";
    public static final String CARD_PIC_BUTTON = "图片，按钮。双击可进入详情页。";
    public static final String CARD_VIDEO_BUTTON = "视频，按钮。双击可暂停或播放视频。";
    public static final String CART_BUTTON = "购物车，按钮";
    public static final String COLLECT_BUTTON = "收藏，按钮";
    public static final String DEFAULT_BUTTON = "按钮";
    public static final String EMPTY_STRING = "";
    public static final String MORE_BUTTON = "更多";
    public static final String SHARE_BUTTON = "分享，按钮";

    static {
        t2o.a(352321701);
    }

    public static void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47a5ab5e", new Object[]{view});
        } else if (view != null) {
            view.setImportantForAccessibility(2);
        }
    }

    public static void b(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9418ce0d", new Object[]{view, str});
        } else if (view != null) {
            view.setContentDescription(str);
        }
    }
}
