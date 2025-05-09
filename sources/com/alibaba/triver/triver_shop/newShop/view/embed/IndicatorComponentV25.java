package com.alibaba.triver.triver_shop.newShop.view.embed;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.Iterator;
import tb.brf;
import tb.ckf;
import tb.kew;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class IndicatorComponentV25 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ShopDataParser f3261a;
    public final int b = Color.parseColor("#999999");
    public final int c = Color.parseColor("#d8d8d8");
    public final int d;
    public final LinearLayout e;
    public final IndicatorTipsLayout f;
    public final ArrayList<View> g;
    public int h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class IndicatorTipsLayout extends LinearLayout {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ IndicatorComponentV25 this$0;
        public TextView tipsTextView;

        static {
            t2o.a(766510076);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IndicatorTipsLayout(IndicatorComponentV25 indicatorComponentV25) {
            super(IndicatorComponentV25.b(indicatorComponentV25).Q());
            ckf.g(indicatorComponentV25, "this$0");
            this.this$0 = indicatorComponentV25;
            TextView textView = new TextView(IndicatorComponentV25.b(indicatorComponentV25).Q());
            kew.c0(textView, kew.v(24));
            textView.setTextColor(Color.parseColor("#C8FFFFFF"));
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                textView.setGravity(16);
                textView.setLayoutParams(layoutParams);
            } else {
                ViewGroup.LayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                textView.setGravity(16);
                xhv xhvVar = xhv.INSTANCE;
                textView.setLayoutParams(marginLayoutParams);
            }
            addView(textView);
            xhv xhvVar2 = xhv.INSTANCE;
            setTipsTextView(textView);
            TUrlImageView tUrlImageView = new TUrlImageView(IndicatorComponentV25.b(indicatorComponentV25).Q());
            tUrlImageView.setImageUrl("https://img.alicdn.com/imgextra/i1/O1CN01GMfozI1iGpyltoePF_!!6000000004386-2-tps-144-144.png");
            ViewGroup.LayoutParams layoutParams2 = tUrlImageView.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.height = kew.v(54);
                marginLayoutParams2.width = kew.v(54);
                marginLayoutParams2.leftMargin = kew.v(12);
                setGravity(16);
                tUrlImageView.setLayoutParams(layoutParams2);
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-2, -2);
                marginLayoutParams3.height = kew.v(54);
                marginLayoutParams3.width = kew.v(54);
                marginLayoutParams3.leftMargin = kew.v(12);
                setGravity(16);
                tUrlImageView.setLayoutParams(marginLayoutParams3);
            }
            addView(tUrlImageView);
        }

        public static /* synthetic */ Object ipc$super(IndicatorTipsLayout indicatorTipsLayout, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/view/embed/IndicatorComponentV25$IndicatorTipsLayout");
        }

        public final TextView getTipsTextView() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TextView) ipChange.ipc$dispatch("a8ba8f3b", new Object[]{this});
            }
            TextView textView = this.tipsTextView;
            if (textView != null) {
                return textView;
            }
            ckf.y("tipsTextView");
            throw null;
        }

        public final void setTipsTextView(TextView textView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("375e48d1", new Object[]{this, textView});
                return;
            }
            ckf.g(textView, "<set-?>");
            this.tipsTextView = textView;
        }

        public final void updateTipsStyle() {
            JSONObject g;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fc1f9317", new Object[]{this});
            } else if (IndicatorComponentV25.a(this.this$0) == IndicatorComponentV25.c(this.this$0).size() - 1) {
                kew.B(this);
            } else {
                kew.g0(this);
                JSONArray J = IndicatorComponentV25.b(this.this$0).J();
                String str = null;
                if (!(J == null || (g = brf.g(J, IndicatorComponentV25.a(this.this$0) + 1)) == null)) {
                    str = g.getString("name");
                }
                getTipsTextView().setText(str);
            }
        }
    }

    static {
        t2o.a(766510075);
    }

    public static final /* synthetic */ int a(IndicatorComponentV25 indicatorComponentV25) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8302ac6", new Object[]{indicatorComponentV25})).intValue();
        }
        return indicatorComponentV25.h;
    }

    public static final /* synthetic */ ShopDataParser b(IndicatorComponentV25 indicatorComponentV25) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopDataParser) ipChange.ipc$dispatch("127970f6", new Object[]{indicatorComponentV25});
        }
        return indicatorComponentV25.f3261a;
    }

    public static final /* synthetic */ ArrayList c(IndicatorComponentV25 indicatorComponentV25) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("d4e41b9e", new Object[]{indicatorComponentV25});
        }
        return indicatorComponentV25.g;
    }

    public final LinearLayout d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("cb7d1941", new Object[]{this});
        }
        return this.e;
    }

    public final IndicatorTipsLayout e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IndicatorTipsLayout) ipChange.ipc$dispatch("529be35a", new Object[]{this});
        }
        return this.f;
    }

    public final void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ec6725a", new Object[]{this, new Integer(i)});
        } else if (i != -1) {
            g(i);
        }
    }

    public final void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a890c331", new Object[]{this, new Integer(i)});
            return;
        }
        Iterator<View> it = this.g.iterator();
        while (it.hasNext()) {
            it.next().setBackgroundColor(this.b);
        }
        if (i < this.g.size()) {
            this.g.get(i).setBackgroundColor(this.c);
            this.h = i;
            this.f.updateTipsStyle();
        }
    }

    public IndicatorComponentV25(ShopDataParser shopDataParser) {
        LinearLayout.LayoutParams layoutParams;
        ckf.g(shopDataParser, "shopData");
        this.f3261a = shopDataParser;
        JSONArray J = shopDataParser.J();
        int size = J == null ? 0 : J.size();
        this.d = size;
        LinearLayout linearLayout = new LinearLayout(shopDataParser.Q());
        linearLayout.setClickable(false);
        xhv xhvVar = xhv.INSTANCE;
        this.e = linearLayout;
        this.f = new IndicatorTipsLayout(this);
        this.g = new ArrayList<>();
        if (size > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (this.d <= 5) {
                    layoutParams = new LinearLayout.LayoutParams(kew.v(63), kew.v(Double.valueOf(3.0d)));
                } else {
                    layoutParams = new LinearLayout.LayoutParams(0, kew.v(Double.valueOf(3.0d)), 1.0f);
                }
                View view = new View(this.e.getContext());
                view.setLayoutParams(layoutParams);
                kew.X(view, kew.v(4));
                kew.b0(view, kew.v(4));
                view.setClickable(false);
                if (i == 0) {
                    view.setBackgroundColor(this.c);
                } else {
                    view.setBackgroundColor(this.b);
                }
                this.g.add(view);
                this.e.addView(view);
                if (i2 >= size) {
                    break;
                }
                i = i2;
            }
        }
        if (this.d == 1) {
            kew.B(this.e);
            kew.B(this.f);
        }
        f(0);
    }
}
