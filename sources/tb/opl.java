package tb;

import android.content.Context;
import android.graphics.Typeface;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.panel.viewholder.PanelTitleViewHolder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class opl implements omb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int OTHER_CHANNEL_VIEW_MARGIN_BOTTOM = 5;
    public static final int OTHER_CHANNEL_VIEW_MARGIN_TOP = 14;

    static {
        t2o.a(729809581);
        t2o.a(729809573);
    }

    @Override // tb.omb
    public RecyclerView.ViewHolder a(ViewGroup viewGroup, int i, o7d o7dVar, nmb nmbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("b5e973df", new Object[]{this, viewGroup, new Integer(i), o7dVar, nmbVar});
        }
        return e(viewGroup.getContext(), nmbVar, o7dVar, i);
    }

    public final void b(LinearLayout linearLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("191dd546", new Object[]{this, linearLayout});
            return;
        }
        FrameLayout frameLayout = new FrameLayout(linearLayout.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        frameLayout.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        TextView textView = new TextView(linearLayout.getContext());
        layoutParams2.gravity = 17;
        textView.setLayoutParams(layoutParams2);
        textView.setTag(hpl.DEFAULT_TITLE_TAG);
        frameLayout.addView(textView);
        linearLayout.addView(frameLayout);
    }

    public final TextView d(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("8b528e08", new Object[]{this, context, new Boolean(z)});
        }
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(trs.a(context, 8.0f));
        layoutParams.gravity = 16;
        textView.setLayoutParams(layoutParams);
        if (z) {
            textView.setTypeface(Typeface.defaultFromStyle(1));
        }
        return textView;
    }

    public final RecyclerView.ViewHolder e(Context context, nmb nmbVar, o7d o7dVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("ceaa580", new Object[]{this, context, nmbVar, o7dVar, new Integer(i)});
        }
        LinearLayout linearLayout = new LinearLayout(context);
        StaggeredGridLayoutManager.LayoutParams layoutParams = new StaggeredGridLayoutManager.LayoutParams(-1, -2);
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = trs.a(context, 11.0f);
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = trs.a(context, 5.0f);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        if (i == 3) {
            b(linearLayout);
        } else {
            c(linearLayout);
        }
        return new PanelTitleViewHolder(linearLayout, nmbVar, o7dVar);
    }

    public final void c(LinearLayout linearLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f81b011", new Object[]{this, linearLayout});
            return;
        }
        TextView d = d(linearLayout.getContext(), true);
        d.setTag(hpl.TITLE_MAIN_TAG);
        linearLayout.addView(d);
        TextView d2 = d(linearLayout.getContext(), false);
        d2.setTag(hpl.TITLE_SUB_TAG);
        linearLayout.addView(d2);
    }
}
