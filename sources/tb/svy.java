package tb;

import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Pair;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class svy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ShopDataParser f28307a;
    public LinearLayout b;
    public g1a<? super Integer, xhv> c;
    public int d = 1;
    public JSONArray e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;

        public a(int i) {
            this.b = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            JSONObject g;
            JSONObject jSONObject;
            String string;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            svy.this.f(this.b);
            g1a<Integer, xhv> d = svy.this.d();
            if (d != null) {
                d.invoke(Integer.valueOf(this.b));
            }
            JSONArray g2 = svy.g(svy.this);
            if (g2 != null && (g = brf.g(g2, this.b)) != null && (jSONObject = g.getJSONObject("userTrackInfo")) != null && (string = jSONObject.getString("clkUtArg1")) != null) {
                a1v.c(svy.this.i(), string, null, null, 8, null);
            }
        }
    }

    static {
        t2o.a(766510021);
    }

    public svy(ShopDataParser shopDataParser) {
        ckf.g(shopDataParser, "shopDataParser");
        this.f28307a = shopDataParser;
    }

    public static final /* synthetic */ JSONArray g(svy svyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("44ac52c", new Object[]{svyVar});
        }
        return svyVar.e;
    }

    public final int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a5f3dff8", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public final g1a<Integer, xhv> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("d3c82b15", new Object[]{this});
        }
        return this.c;
    }

    public final void e(g1a<? super Integer, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae9aa1a1", new Object[]{this, g1aVar});
        } else {
            this.c = g1aVar;
        }
    }

    public final void h() {
        JSONObject jSONObject;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ac9ee6c", new Object[]{this});
            return;
        }
        JSONArray jSONArray = this.e;
        if (jSONArray != null) {
            for (Object obj : jSONArray) {
                if (!(!(obj instanceof JSONObject) || (jSONObject = ((JSONObject) obj).getJSONObject("userTrackInfo")) == null || (string = jSONObject.getString("expUtArg1")) == null)) {
                    a1v.d(i(), string, null);
                }
            }
        }
    }

    public final ShopDataParser i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopDataParser) ipChange.ipc$dispatch("cba13806", new Object[]{this});
        }
        return this.f28307a;
    }

    public final void a(int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36a42768", new Object[]{this, new Integer(i), jSONObject});
            return;
        }
        LinearLayout linearLayout = this.b;
        FrameLayout.LayoutParams layoutParams = null;
        if (linearLayout != null) {
            FrameLayout frameLayout = new FrameLayout(linearLayout.getContext());
            ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
            LinearLayout.LayoutParams layoutParams3 = layoutParams2 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams2 : null;
            if (layoutParams3 == null) {
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
                ((ViewGroup.LayoutParams) layoutParams4).height = -1;
                layoutParams4.weight = 1.0f;
                xhv xhvVar = xhv.INSTANCE;
                frameLayout.setLayoutParams(layoutParams4);
            } else {
                ((ViewGroup.LayoutParams) layoutParams3).height = -1;
                layoutParams3.weight = 1.0f;
            }
            TextView textView = new TextView(frameLayout.getContext());
            ViewGroup.LayoutParams layoutParams5 = textView.getLayoutParams();
            if (layoutParams5 instanceof ViewGroup.MarginLayoutParams) {
                textView.setLayoutParams(layoutParams5);
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                xhv xhvVar2 = xhv.INSTANCE;
                textView.setLayoutParams(marginLayoutParams);
            }
            textView.setTextColor(-15656659);
            ViewGroup.LayoutParams layoutParams6 = textView.getLayoutParams();
            FrameLayout.LayoutParams layoutParams7 = layoutParams6 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams6 : null;
            if (layoutParams7 == null) {
                FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams8.gravity = 17;
                xhv xhvVar3 = xhv.INSTANCE;
                textView.setLayoutParams(layoutParams8);
            } else {
                layoutParams7.gravity = 17;
            }
            textView.setText(jSONObject.getString("title"));
            kew.c0(textView, kew.v(30));
            frameLayout.addView(textView);
            View view = new View(frameLayout.getContext());
            ViewGroup.LayoutParams layoutParams9 = view.getLayoutParams();
            if (layoutParams9 instanceof ViewGroup.MarginLayoutParams) {
                view.setLayoutParams(layoutParams9);
            } else {
                ViewGroup.LayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-2, -2);
                xhv xhvVar4 = xhv.INSTANCE;
                view.setLayoutParams(marginLayoutParams2);
            }
            view.setBackgroundColor(-15656659);
            view.setVisibility(4);
            ViewGroup.LayoutParams layoutParams10 = view.getLayoutParams();
            if (layoutParams10 instanceof FrameLayout.LayoutParams) {
                layoutParams = (FrameLayout.LayoutParams) layoutParams10;
            }
            if (layoutParams == null) {
                FrameLayout.LayoutParams layoutParams11 = new FrameLayout.LayoutParams(-2, -2);
                ((ViewGroup.LayoutParams) layoutParams11).width = -1;
                layoutParams11.height = kew.v(3);
                layoutParams11.gravity = 81;
                xhv xhvVar5 = xhv.INSTANCE;
                view.setLayoutParams(layoutParams11);
            } else {
                ((ViewGroup.LayoutParams) layoutParams).width = -1;
                layoutParams.height = kew.v(3);
                layoutParams.gravity = 81;
            }
            frameLayout.addView(view);
            linearLayout.addView(frameLayout);
            frameLayout.setOnClickListener(new a(i));
            return;
        }
        ckf.y("itemContainer");
        throw null;
    }

    public final void b(ViewGroup viewGroup) {
        JSONArray f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45a79766", new Object[]{this, viewGroup});
            return;
        }
        ckf.g(viewGroup, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setBackgroundColor(-1);
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ((ViewGroup.LayoutParams) marginLayoutParams).width = -1;
            ((ViewGroup.LayoutParams) marginLayoutParams).height = -1;
            marginLayoutParams.bottomMargin = kew.v(4);
            frameLayout.setLayoutParams(layoutParams);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-2, -2);
            ((ViewGroup.LayoutParams) marginLayoutParams2).width = -1;
            ((ViewGroup.LayoutParams) marginLayoutParams2).height = -1;
            marginLayoutParams2.bottomMargin = kew.v(4);
            xhv xhvVar = xhv.INSTANCE;
            frameLayout.setLayoutParams(marginLayoutParams2);
        }
        frameLayout.setPadding(kew.v(32), 0, kew.v(32), 0);
        View view = new View(frameLayout.getContext());
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            view.setLayoutParams(layoutParams2);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-2, -2);
            xhv xhvVar2 = xhv.INSTANCE;
            view.setLayoutParams(marginLayoutParams3);
        }
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        FrameLayout.LayoutParams layoutParams4 = layoutParams3 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams3 : null;
        if (layoutParams4 == null) {
            FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
            ((ViewGroup.LayoutParams) layoutParams5).width = -1;
            layoutParams5.height = kew.v(3);
            layoutParams5.gravity = 81;
            xhv xhvVar3 = xhv.INSTANCE;
            view.setLayoutParams(layoutParams5);
        } else {
            ((ViewGroup.LayoutParams) layoutParams4).width = -1;
            layoutParams4.height = kew.v(3);
            layoutParams4.gravity = 81;
        }
        view.setBackgroundColor(-788744);
        frameLayout.addView(view);
        xhv xhvVar4 = xhv.INSTANCE;
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        ViewGroup.LayoutParams layoutParams6 = linearLayout.getLayoutParams();
        if (layoutParams6 instanceof ViewGroup.MarginLayoutParams) {
            linearLayout.setLayoutParams(layoutParams6);
        } else {
            linearLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        }
        this.b = linearLayout;
        ViewGroup.LayoutParams layoutParams7 = linearLayout.getLayoutParams();
        if (layoutParams7 instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams7;
            ((ViewGroup.LayoutParams) marginLayoutParams4).width = -1;
            ((ViewGroup.LayoutParams) marginLayoutParams4).height = -1;
            linearLayout.setLayoutParams(layoutParams7);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams5 = new ViewGroup.MarginLayoutParams(-2, -2);
            ((ViewGroup.LayoutParams) marginLayoutParams5).width = -1;
            ((ViewGroup.LayoutParams) marginLayoutParams5).height = -1;
            linearLayout.setLayoutParams(marginLayoutParams5);
        }
        frameLayout.addView(linearLayout);
        viewGroup.addView(frameLayout);
        Pair<Integer, Integer> Q = ShopExtKt.Q("allitems", this.f28307a.u1());
        if (ckf.b(this.f28307a.S(Q.getFirst().intValue(), Q.getSecond().intValue()), "allitems") && (f = brf.f(this.f28307a.u1(), Q.getFirst().intValue())) != null) {
            this.d = f.size();
            this.e = f;
            int i = 0;
            for (Object obj : f) {
                i++;
                if (i < 0) {
                    yz3.p();
                    throw null;
                } else if (obj instanceof JSONObject) {
                    a(i, (JSONObject) obj);
                }
            }
            xhv xhvVar5 = xhv.INSTANCE;
        }
        f(0);
    }

    public final void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7430dc3b", new Object[]{this, new Integer(i)});
            return;
        }
        LinearLayout linearLayout = this.b;
        if (linearLayout == null) {
            ckf.y("itemContainer");
            throw null;
        } else if (i <= linearLayout.getChildCount() - 1) {
            if (this.f28307a.C() == 1) {
                h();
            }
            LinearLayout linearLayout2 = this.b;
            if (linearLayout2 == null) {
                ckf.y("itemContainer");
                throw null;
            } else if (linearLayout2.getChildCount() != 0) {
                LinearLayout linearLayout3 = this.b;
                if (linearLayout3 != null) {
                    int childCount = linearLayout3.getChildCount();
                    if (childCount > 0) {
                        int i2 = 0;
                        while (true) {
                            int i3 = i2 + 1;
                            LinearLayout linearLayout4 = this.b;
                            if (linearLayout4 != null) {
                                View childAt = linearLayout4.getChildAt(i2);
                                if (childAt != null) {
                                    ViewGroup viewGroup = (ViewGroup) childAt;
                                    View childAt2 = viewGroup.getChildAt(0);
                                    if (childAt2 != null) {
                                        View childAt3 = viewGroup.getChildAt(1);
                                        ((TextView) childAt2).setTypeface(Typeface.DEFAULT);
                                        childAt3.setVisibility(4);
                                        if (i3 >= childCount) {
                                            break;
                                        }
                                        i2 = i3;
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                                    }
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                                }
                            } else {
                                ckf.y("itemContainer");
                                throw null;
                            }
                        }
                    }
                    LinearLayout linearLayout5 = this.b;
                    if (linearLayout5 != null) {
                        View childAt4 = linearLayout5.getChildAt(i);
                        if (childAt4 != null) {
                            ViewGroup viewGroup2 = (ViewGroup) childAt4;
                            View childAt5 = viewGroup2.getChildAt(0);
                            if (childAt5 != null) {
                                View childAt6 = viewGroup2.getChildAt(1);
                                ((TextView) childAt5).setTypeface(Typeface.DEFAULT_BOLD);
                                childAt6.setVisibility(0);
                                return;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                    }
                    ckf.y("itemContainer");
                    throw null;
                }
                ckf.y("itemContainer");
                throw null;
            }
        }
    }
}
