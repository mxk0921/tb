package tb;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.data.global.NewDetailScreenConfig;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class gxq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EXP_ITEM_ARTICLE = "labVideo";
    public static final String EXP_VERTICAL = "vertical";

    static {
        t2o.a(352321941);
    }

    public static int a(Activity activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aec557cb", new Object[]{activity, new Integer(i)})).intValue();
        }
        return activity.getResources().getColor(i);
    }

    public static int b(cxj cxjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ca4dfd8f", new Object[]{cxjVar})).intValue();
        }
        Activity i = cxjVar.i();
        if (i == null) {
            return -1;
        }
        String str = cxjVar.j().R().l;
        if ("vertical".equals(cxjVar.j().R().m)) {
            return a(i, R.color.new_detail_card_seeding_bg_color);
        }
        if ("content".equals(str)) {
            return a(i, R.color.new_detail_card_content_bg_color);
        }
        return a(i, R.color.new_detail_card_default_bg_color);
    }

    public static Drawable c(cxj cxjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("7fd1a9a6", new Object[]{cxjVar});
        }
        Activity i = cxjVar.i();
        if (i == null || f(cxjVar) != NewDetailScreenConfig.ScreenType.NORMAL_PHONE) {
            return null;
        }
        String str = cxjVar.j().R().l;
        String str2 = cxjVar.j().R().m;
        if (EXP_ITEM_ARTICLE.equals(str2)) {
            return d(i, R.drawable.preload_bottom_itemarticle);
        }
        if ("vertical".equals(str2)) {
            return d(i, R.drawable.preload_bottom_vertical);
        }
        if ("content".equals(str)) {
            return d(i, R.drawable.preload_bottom_content);
        }
        return d(i, R.drawable.preload_bottom_superitem);
    }

    public static Drawable d(Activity activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("5a37a7c9", new Object[]{activity, new Integer(i)});
        }
        return activity.getResources().getDrawable(i);
    }

    public static float e(cxj cxjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("759f2724", new Object[]{cxjVar})).floatValue();
        }
        return 40.0f;
    }

    public static NewDetailScreenConfig.ScreenType f(cxj cxjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NewDetailScreenConfig.ScreenType) ipChange.ipc$dispatch("be1272bf", new Object[]{cxjVar});
        }
        return cxjVar.j().K().a();
    }
}
