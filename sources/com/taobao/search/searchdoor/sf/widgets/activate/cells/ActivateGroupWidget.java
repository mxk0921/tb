package com.taobao.search.searchdoor.sf.widgets.activate.cells;

import android.app.Activity;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.collection.ArrayMap;
import androidx.core.view.ViewCompat;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.search.mmd.recommendtip.FlowLayout;
import com.taobao.search.searchdoor.activate.data.ActivateBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateCellBean;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TIconFontTextView;
import java.util.List;
import tb.c2p;
import tb.o1p;
import tb.rg3;
import tb.sen;
import tb.srl;
import tb.t2o;
import tb.ude;
import tb.v4p;
import tb.z90;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ActivateGroupWidget extends BaseActivateCellViewHolder<ActivateCellBean, c2p> implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public TextView m;
    public TIconFontTextView n;
    public FlowLayout o;
    public TextView p;
    public static final int q = o1p.b(10);
    public static final int r = o1p.b(10);
    public static final int s = o1p.b(12);
    public static final int t = o1p.b(5);
    public static final rg3.b CREATOR = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements rg3.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: b */
        public ActivateGroupWidget a(rg3.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ActivateGroupWidget) ipChange.ipc$dispatch("a00660ca", new Object[]{this, cVar});
            }
            return new ActivateGroupWidget(R.layout.tbsearch_sf_activate_group_discovery, cVar.f27354a, cVar.b, cVar.c, (c2p) cVar.f);
        }
    }

    static {
        t2o.a(815793173);
        o1p.b(16);
        o1p.b(5);
    }

    public ActivateGroupWidget(int i, Activity activity, ude udeVar, ViewGroup viewGroup, c2p c2pVar) {
        super(LayoutInflater.from(activity).inflate(i, viewGroup, false), activity, udeVar, c2pVar);
        J0();
    }

    public static String K0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a8f36013", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "activate_closed_";
        }
        return "activate_closed_" + str;
    }

    public static /* synthetic */ Object ipc$super(ActivateGroupWidget activateGroupWidget, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/activate/cells/ActivateGroupWidget");
    }

    public View I0(ActivateBean activateBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ec0538fd", new Object[]{this, activateBean});
        }
        LinearLayout linearLayout = new LinearLayout(this.f9341a);
        linearLayout.setGravity(17);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        linearLayout.setLayoutParams(marginLayoutParams);
        marginLayoutParams.setMargins(0, q, r, 0);
        linearLayout.setTag(activateBean);
        int i = s;
        linearLayout.setPadding(i, 0, i, 0);
        linearLayout.setBackgroundDrawable(this.f9341a.getResources().getDrawable(R.drawable.tbsearch_activate_tag_background));
        TextView textView = new TextView(this.f9341a);
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.rightMargin = t;
        textView.setLayoutParams(layoutParams);
        textView.setTextColor(this.f9341a.getResources().getColor(R.color.black_33));
        textView.setText(activateBean.keyword);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(17);
        linearLayout.addView(textView);
        if (!TextUtils.isEmpty(activateBean.tagText)) {
            TextView textView2 = new TextView(this.f9341a);
            textView2.setTextSize(1, 10.0f);
            textView2.setTextColor(srl.c(activateBean.tagColor, -1));
            textView2.setText(activateBean.tagText);
            int b = o1p.b(3);
            textView2.setPadding(b, 0, b, 0);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setStroke(o1p.a(0.5f), srl.c(activateBean.tagBorderColor, -1));
            gradientDrawable.setColor(srl.c(activateBean.tagBgColor, -1));
            gradientDrawable.setCornerRadius(o1p.b(3));
            ViewCompat.setBackground(textView2, gradientDrawable);
            linearLayout.addView(textView2);
        }
        return linearLayout;
    }

    public void J0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d31fad", new Object[]{this});
            return;
        }
        this.m = (TextView) this.itemView.findViewById(R.id.group_title);
        TIconFontTextView tIconFontTextView = (TIconFontTextView) this.itemView.findViewById(R.id.close_btn);
        this.n = tIconFontTextView;
        tIconFontTextView.setOnClickListener(this);
        this.o = (FlowLayout) this.itemView.findViewById(R.id.activate_item_container);
        TextView textView = (TextView) this.itemView.findViewById(R.id.close_hint);
        this.p = textView;
        textView.setVisibility(8);
    }

    public final void L0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68b7c40e", new Object[]{this});
        } else if (this.itemView.getLayoutParams() != null) {
            this.itemView.getLayoutParams().height = 0;
            this.itemView.requestLayout();
        } else {
            this.itemView.setVisibility(8);
        }
    }

    public final void M0(ActivateCellBean activateCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff823a3a", new Object[]{this, activateCellBean});
        } else if (activateCellBean == null) {
            Log.e("ActivateGroupWidget", "activate group is null");
        } else if (TextUtils.isEmpty(activateCellBean.type)) {
            Log.e("ActivateGroupWidget", "activate group type is empty");
        } else {
            String K0 = K0(activateCellBean.type);
            boolean a2 = v4p.a(K0, false);
            boolean z = true ^ a2;
            if (!a2) {
                R0(activateCellBean.name);
            } else {
                O0(activateCellBean.activateItems, String.valueOf(activateCellBean.rownnum));
                S0(activateCellBean.name);
            }
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put("isHide", String.valueOf(z));
            sen.f("HideActivate", arrayMap);
            v4p.f(K0, z);
        }
    }

    /* renamed from: N0 */
    public void H0(int i, ActivateCellBean activateCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b21e4bd7", new Object[]{this, new Integer(i), activateCellBean});
        } else if (activateCellBean == null) {
            L0();
        } else {
            List<ActivateBean> list = activateCellBean.activateItems;
            if (list == null || list.size() == 0) {
                L0();
                return;
            }
            this.n.setVisibility(0);
            this.m.setText(activateCellBean.name);
            this.n.setTag(activateCellBean);
            if (v4p.a(K0(activateCellBean.type), false)) {
                Q0(activateCellBean.name);
            } else {
                O0(activateCellBean.activateItems, String.valueOf(activateCellBean.rownnum));
                P0(activateCellBean.name);
            }
            if (!TextUtils.isEmpty(activateCellBean.name)) {
                this.m.setText(activateCellBean.name);
            }
            this.itemView.setVisibility(0);
            this.itemView.getLayoutParams().height = -2;
        }
    }

    public final void O0(List<ActivateBean> list, String str) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6b47b05", new Object[]{this, list, str});
            return;
        }
        this.o.removeAllViews();
        if (list != null) {
            if (TextUtils.isEmpty(str)) {
                i = Integer.MAX_VALUE;
            } else {
                i = Integer.parseInt(str);
            }
            this.o.setMaxLines(i);
            for (ActivateBean activateBean : list) {
                if (activateBean != null) {
                    View I0 = I0(activateBean);
                    ViewProxy.setOnClickListener(I0, this);
                    this.o.addView(I0);
                }
            }
        }
    }

    public final void R0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("972721d5", new Object[]{this, str});
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(500L);
        this.p.startAnimation(alphaAnimation);
        Q0(str);
    }

    public final void S0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc51124", new Object[]{this, str});
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(500L);
        this.o.startAnimation(alphaAnimation);
        P0(str);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view.getId() == this.n.getId()) {
            Object tag = view.getTag();
            if (tag instanceof ActivateCellBean) {
                M0((ActivateCellBean) tag);
            }
        } else {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                i = viewGroup.indexOfChild(view);
            }
            Object tag2 = view.getTag();
            if (tag2 instanceof ActivateBean) {
                A0(z90.a((ActivateBean) tag2, i, ((ActivateCellBean) this.l).suggestRn));
            }
        }
    }

    public final void P0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e504d", new Object[]{this, str});
            return;
        }
        this.o.setVisibility(0);
        this.n.setText(R.string.uik_icon_attention);
        if (TextUtils.isEmpty(str)) {
            this.n.setContentDescription("隐藏当前内容");
        } else {
            TIconFontTextView tIconFontTextView = this.n;
            tIconFontTextView.setContentDescription(Localization.q(R.string.taobao_app_1005_1_16647) + str);
        }
        this.p.setVisibility(8);
    }

    public final void Q0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a590a1fe", new Object[]{this, str});
            return;
        }
        this.o.setVisibility(8);
        this.n.setText(R.string.uik_icon_attention_forbid);
        if (!TextUtils.isEmpty(str)) {
            TextView textView = this.p;
            textView.setText("当前" + str + "已隐藏");
            TIconFontTextView tIconFontTextView = this.n;
            tIconFontTextView.setContentDescription(Localization.q(R.string.taobao_app_1005_1_16694) + str);
        } else {
            this.p.setText("当前内容已隐藏");
            this.n.setContentDescription(Localization.q(R.string.taobao_app_1005_1_16658));
        }
        this.p.setVisibility(0);
    }
}
