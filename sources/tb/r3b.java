package tb;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.view.HImageView;
import com.taobao.tao.util.DensityUtil;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class r3b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809358);
    }

    public FrameLayout a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("ce3ab9cd", new Object[]{this, context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        HImageView hImageView = new HImageView(context);
        hImageView.setId(R.id.iv_btn_background);
        hImageView.setLayoutParams(new FrameLayout.LayoutParams(b(52, context), b(52, context), 17));
        hImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        hImageView.setImageResource(R.drawable.homepage_tab_tao_background);
        frameLayout.addView(hImageView);
        FrameLayout frameLayout2 = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(b(40, context), b(40, context), 48);
        layoutParams.topMargin = b(8, context);
        layoutParams.leftMargin = b(6, context);
        frameLayout2.setLayoutParams(layoutParams);
        HImageView hImageView2 = new HImageView(context);
        hImageView2.setId(R.id.iv_image);
        hImageView2.setContentDescription(Localization.q(R.string.taobao_app_1000_1_16132));
        hImageView2.setLayoutParams(new FrameLayout.LayoutParams(b(40, context), b(80, context)));
        hImageView2.setImageResource(R.drawable.homepage_tab_tao_button);
        frameLayout2.addView(hImageView2);
        frameLayout.addView(frameLayout2);
        return frameLayout;
    }

    public final int b(int i, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f178682e", new Object[]{this, new Integer(i), context})).intValue();
        }
        return DensityUtil.dip2px(context, i);
    }
}
