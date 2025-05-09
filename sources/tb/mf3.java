package tb;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.android.material.badge.BadgeDrawable;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.viewholder.PanelItemViewHolder;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class mf3 implements omb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809571);
        t2o.a(729809573);
    }

    @Override // tb.omb
    public RecyclerView.ViewHolder a(ViewGroup viewGroup, int i, o7d o7dVar, nmb nmbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("b5e973df", new Object[]{this, viewGroup, new Integer(i), o7dVar, nmbVar});
        }
        return new PanelItemViewHolder(d(viewGroup.getContext(), i), nmbVar, o7dVar);
    }

    public final View b(Context context, int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ef6044af", new Object[]{this, context, new Integer(i)});
        }
        TUrlImageView tUrlImageView = new TUrlImageView(context);
        tUrlImageView.setTag(hpl.ITEM_IV_TAG);
        if (i == 2) {
            i2 = 8;
        }
        tUrlImageView.setVisibility(i2);
        int a2 = trs.a(context, 18.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a2, a2);
        layoutParams.gravity = BadgeDrawable.TOP_END;
        tUrlImageView.setLayoutParams(layoutParams);
        return tUrlImageView;
    }

    public final View c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("4297d72f", new Object[]{this, context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, trs.a(context, 40.0f));
        layoutParams.gravity = 17;
        layoutParams.leftMargin = trs.a(context, 4.0f);
        layoutParams.rightMargin = trs.a(context, 4.0f);
        GradientDrawable gradientDrawable = (GradientDrawable) frameLayout.getBackground();
        if (gradientDrawable == null) {
            gradientDrawable = new GradientDrawable();
        }
        gradientDrawable.setCornerRadius(trs.a(context, 6.0f));
        frameLayout.setTag(hpl.ITEM_PARENT_TAG);
        frameLayout.setBackground(gradientDrawable);
        frameLayout.setLayoutParams(layoutParams);
        TextView textView = new TextView(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        textView.setTag(hpl.ITEM_TV_TAG);
        textView.setTextSize(14.0f);
        textView.setLayoutParams(layoutParams2);
        frameLayout.addView(textView);
        return frameLayout;
    }

    public final View d(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("74a3fe91", new Object[]{this, context, new Integer(i)});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        StaggeredGridLayoutManager.LayoutParams layoutParams = new StaggeredGridLayoutManager.LayoutParams(-1, trs.a(context, 48.0f));
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = trs.a(context, 2.0f);
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.addView(c(context));
        frameLayout.addView(b(context, i));
        return frameLayout;
    }
}
