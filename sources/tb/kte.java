package tb;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class kte {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ShopDataParser f22907a;
    public final int b = kew.p(Double.valueOf(1.5d));
    public final int c = Color.parseColor("#999999");
    public final int d = Color.parseColor("#d8d8d8");
    public final boolean e;
    public final int f;
    public final LinearLayout g;
    public final View h;
    public final TextView i;
    public final ArrayList<View> j;
    public int k;

    static {
        t2o.a(766510074);
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d998e2fb", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public final LinearLayout b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("cb7d1941", new Object[]{this});
        }
        return this.g;
    }

    public final View c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("4872fb84", new Object[]{this});
        }
        return this.h;
    }

    public final void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ec6725a", new Object[]{this, new Integer(i)});
            return;
        }
        boolean z = this.e;
        if (i == -1) {
            if (z) {
                i = 0;
            } else {
                return;
            }
        }
        e(i);
    }

    public final void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a890c331", new Object[]{this, new Integer(i)});
            return;
        }
        Iterator<View> it = this.j.iterator();
        while (it.hasNext()) {
            it.next().setBackgroundColor(this.c);
        }
        if (i < this.j.size()) {
            this.j.get(i).setBackgroundColor(this.d);
            this.k = i;
            f();
        }
    }

    public kte(ShopDataParser shopDataParser) {
        TUrlImageView tUrlImageView;
        ckf.g(shopDataParser, "shopData");
        this.f22907a = shopDataParser;
        this.e = shopDataParser.J1();
        JSONArray J = shopDataParser.J();
        int size = J == null ? 0 : J.size();
        this.f = size;
        LinearLayout linearLayout = new LinearLayout(shopDataParser.Q());
        linearLayout.setClickable(false);
        xhv xhvVar = xhv.INSTANCE;
        this.g = linearLayout;
        Context Q = shopDataParser.Q();
        TextView textView = null;
        View K = Q == null ? null : kew.K(Q, R.layout.view_indicator_tips);
        this.h = K;
        this.i = K != null ? (TextView) K.findViewById(R.id.view_indicator_tips_text) : textView;
        if (!(K == null || (tUrlImageView = (TUrlImageView) K.findViewById(R.id.view_indicator_right_arrow)) == null)) {
            tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i4/O1CN010yWKey1fzlxyAe11c_!!6000000004078-2-tps-22-16.png");
        }
        this.j = new ArrayList<>();
        if (size > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, this.b, 1.0f);
                View view = new View(this.g.getContext());
                view.setLayoutParams(layoutParams);
                kew.X(view, this.b);
                kew.b0(view, this.b);
                view.setClickable(false);
                if (i == 0) {
                    view.setBackgroundColor(this.d);
                } else {
                    view.setBackgroundColor(this.c);
                }
                this.j.add(view);
                this.g.addView(view);
                if (i2 >= size) {
                    break;
                }
                i = i2;
            }
        }
        if (this.f == 1) {
            kew.B(this.g);
        }
        d(0);
    }

    public final void f() {
        JSONObject g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc1f9317", new Object[]{this});
        } else if (this.k == this.j.size() - 1) {
            View view = this.h;
            if (view != null) {
                kew.B(view);
            }
        } else {
            View view2 = this.h;
            if (view2 != null) {
                kew.g0(view2);
            }
            JSONArray J = this.f22907a.J();
            String str = null;
            if (!(J == null || (g = brf.g(J, this.k + 1)) == null)) {
                str = g.getString("name");
            }
            TextView textView = this.i;
            if (textView != null) {
                textView.setText(str);
            }
        }
    }
}
