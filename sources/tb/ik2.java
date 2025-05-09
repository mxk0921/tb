package tb;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.data.ShopDataParser;
import com.alibaba.triver.triver_shop.shop2023.template.Shop2023HeaderTagListTemplate;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ik2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static final int i;
    public static final int j;

    /* renamed from: a  reason: collision with root package name */
    public final ShopDataParser f21360a;
    public View b;
    public ViewGroup c;
    public ViewGroup d;
    public View e;
    public boolean f;
    public JSONObject g;
    public d1a<Boolean> h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(766510321);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("28b76e4f", new Object[]{this})).intValue();
            }
            return ik2.a();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Shop2023HeaderTagListTemplate.AutoScrollAndScrollableTagView f21361a;

        public b(Shop2023HeaderTagListTemplate.AutoScrollAndScrollableTagView autoScrollAndScrollableTagView) {
            this.f21361a = autoScrollAndScrollableTagView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f21361a.startScroll();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f21362a;
        public final /* synthetic */ ik2 b;
        public final /* synthetic */ LinearLayout c;

        public c(Object obj, ik2 ik2Var, LinearLayout linearLayout) {
            this.f21362a = obj;
            this.b = ik2Var;
            this.c = linearLayout;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Boolean invoke;
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            String string = ((JSONObject) this.f21362a).getString(rg0.JUMP_URL);
            npp.Companion.f(ckf.p("BrandHonorNativeComponent click ", string));
            d1a<Boolean> d = this.b.d();
            if (!(d == null || (invoke = d.invoke()) == null)) {
                z = invoke.booleanValue();
            }
            if (!z) {
                Context context = this.c.getContext();
                ckf.f(context, "context");
                khu.h(context, string);
            }
            a1v.p(this.b.f(), "Page_Shop_BrandBFrameTag_Exp", v3i.f(jpu.a("type", ((JSONObject) this.f21362a).getString("type"))));
        }
    }

    static {
        t2o.a(766510320);
        int v = kew.v(12);
        i = v;
        j = kew.v(50) + v;
    }

    public ik2(ShopDataParser shopDataParser) {
        ckf.g(shopDataParser, "shopData");
        this.f21360a = shopDataParser;
    }

    public static final /* synthetic */ int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4d0a4256", new Object[0])).intValue();
        }
        return j;
    }

    public final void b(ViewGroup viewGroup, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("567813ca", new Object[]{this, viewGroup, jSONObject, new Boolean(z)});
            return;
        }
        ckf.g(viewGroup, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
        if (jSONObject != null) {
            this.g = jSONObject;
            a1v.s(this.f21360a, "Page_Shop_Tag", null, 2, null);
            this.f = z;
            ViewParent parent = viewGroup.getParent();
            if (parent != null) {
                ((ViewGroup) parent).setClipChildren(false);
                ViewParent parent2 = viewGroup.getParent();
                if (parent2 != null) {
                    ((ViewGroup) parent2).setClipToPadding(false);
                    FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
                    m(frameLayout);
                    ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                    int i2 = 30;
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.width = -1;
                        marginLayoutParams.height = j;
                        marginLayoutParams.leftMargin = kew.v(30);
                        marginLayoutParams.rightMargin = kew.v(30);
                        frameLayout.setLayoutParams(layoutParams);
                    } else {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-2, -2);
                        marginLayoutParams2.width = -1;
                        marginLayoutParams2.height = j;
                        marginLayoutParams2.leftMargin = kew.v(30);
                        marginLayoutParams2.rightMargin = kew.v(30);
                        xhv xhvVar = xhv.INSTANCE;
                        frameLayout.setLayoutParams(marginLayoutParams2);
                    }
                    Context context = frameLayout.getContext();
                    ckf.f(context, "context");
                    Shop2023HeaderTagListTemplate.AutoScrollAndScrollableTagView autoScrollAndScrollableTagView = new Shop2023HeaderTagListTemplate.AutoScrollAndScrollableTagView(context);
                    ViewGroup.LayoutParams layoutParams2 = autoScrollAndScrollableTagView.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        autoScrollAndScrollableTagView.setLayoutParams(layoutParams2);
                    } else {
                        ViewGroup.LayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-2, -2);
                        xhv xhvVar2 = xhv.INSTANCE;
                        autoScrollAndScrollableTagView.setLayoutParams(marginLayoutParams3);
                    }
                    l(autoScrollAndScrollableTagView);
                    ViewGroup.LayoutParams layoutParams3 = autoScrollAndScrollableTagView.getLayoutParams();
                    FrameLayout.LayoutParams layoutParams4 = layoutParams3 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams3 : null;
                    int i3 = 17;
                    if (layoutParams4 == null) {
                        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
                        layoutParams5.gravity = 17;
                        layoutParams5.width = -1;
                        layoutParams5.height = j;
                        xhv xhvVar3 = xhv.INSTANCE;
                        autoScrollAndScrollableTagView.setLayoutParams(layoutParams5);
                    } else {
                        layoutParams4.gravity = 17;
                        layoutParams4.width = -1;
                        layoutParams4.height = j;
                    }
                    autoScrollAndScrollableTagView.post(new b(autoScrollAndScrollableTagView));
                    LinearLayout linearLayout = new LinearLayout(autoScrollAndScrollableTagView.getContext());
                    ViewGroup.LayoutParams layoutParams6 = linearLayout.getLayoutParams();
                    if (layoutParams6 instanceof ViewGroup.MarginLayoutParams) {
                        linearLayout.setLayoutParams(layoutParams6);
                    } else {
                        ViewGroup.LayoutParams marginLayoutParams4 = new ViewGroup.MarginLayoutParams(-2, -2);
                        xhv xhvVar4 = xhv.INSTANCE;
                        linearLayout.setLayoutParams(marginLayoutParams4);
                    }
                    j(linearLayout);
                    autoScrollAndScrollableTagView.setContentView(linearLayout);
                    linearLayout.setGravity(16);
                    if (z) {
                        linearLayout.setPadding(kew.v(20), 0, kew.v(20), 0);
                    } else {
                        linearLayout.setPadding(0, i, 0, 0);
                    }
                    ViewGroup.LayoutParams layoutParams7 = linearLayout.getLayoutParams();
                    if (layoutParams7 instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams7;
                        marginLayoutParams5.width = -1;
                        marginLayoutParams5.height = -1;
                        linearLayout.setLayoutParams(layoutParams7);
                    } else {
                        ViewGroup.MarginLayoutParams marginLayoutParams6 = new ViewGroup.MarginLayoutParams(-2, -2);
                        marginLayoutParams6.width = -1;
                        marginLayoutParams6.height = -1;
                        xhv xhvVar5 = xhv.INSTANCE;
                        linearLayout.setLayoutParams(marginLayoutParams6);
                    }
                    JSONArray jSONArray = jSONObject.getJSONArray("tagList");
                    ckf.f(jSONArray, "data.getJSONArray(\"tagList\")");
                    for (Object obj : jSONArray) {
                        if (obj instanceof JSONObject) {
                            JSONObject jSONObject2 = (JSONObject) obj;
                            a1v.r(f(), "Page_Shop_BrandBFrameTag_Exp", v3i.f(jpu.a("type", jSONObject2.getString("type"))));
                            LinearLayout linearLayout2 = new LinearLayout(linearLayout.getContext());
                            ViewGroup.LayoutParams layoutParams8 = linearLayout2.getLayoutParams();
                            if (layoutParams8 instanceof ViewGroup.MarginLayoutParams) {
                                linearLayout2.setLayoutParams(layoutParams8);
                            } else {
                                ViewGroup.MarginLayoutParams marginLayoutParams7 = new ViewGroup.MarginLayoutParams(-2, -2);
                                xhv xhvVar6 = xhv.INSTANCE;
                                linearLayout2.setLayoutParams(marginLayoutParams7);
                            }
                            linearLayout2.setGravity(i3);
                            ViewGroup.LayoutParams layoutParams9 = linearLayout2.getLayoutParams();
                            if (layoutParams9 instanceof ViewGroup.MarginLayoutParams) {
                                ViewGroup.MarginLayoutParams marginLayoutParams8 = (ViewGroup.MarginLayoutParams) layoutParams9;
                                if (z) {
                                    marginLayoutParams8.rightMargin = kew.v(Integer.valueOf(i2));
                                } else {
                                    marginLayoutParams8.rightMargin = kew.v(12);
                                }
                                linearLayout2.setLayoutParams(layoutParams9);
                            } else {
                                ViewGroup.MarginLayoutParams marginLayoutParams9 = new ViewGroup.MarginLayoutParams(-2, -2);
                                if (z) {
                                    marginLayoutParams9.rightMargin = kew.v(Integer.valueOf(i2));
                                } else {
                                    marginLayoutParams9.rightMargin = kew.v(12);
                                }
                                xhv xhvVar7 = xhv.INSTANCE;
                                linearLayout2.setLayoutParams(marginLayoutParams9);
                            }
                            linearLayout2.setOnClickListener(new c(obj, this, linearLayout2));
                            if (!h()) {
                                linearLayout2.setPadding(kew.v(18), kew.v(8), kew.v(18), kew.v(8));
                                linearLayout2.setBackground(kew.u(-1, null, null, kew.v(6), 0, 0, 0, 0, 0, 0, 1014, null));
                            }
                            TUrlImageView tUrlImageView = new TUrlImageView(linearLayout2.getContext());
                            ViewGroup.LayoutParams layoutParams10 = tUrlImageView.getLayoutParams();
                            if (layoutParams10 instanceof ViewGroup.MarginLayoutParams) {
                                tUrlImageView.setLayoutParams(layoutParams10);
                            } else {
                                ViewGroup.MarginLayoutParams marginLayoutParams10 = new ViewGroup.MarginLayoutParams(-2, -2);
                                xhv xhvVar8 = xhv.INSTANCE;
                                tUrlImageView.setLayoutParams(marginLayoutParams10);
                            }
                            ViewGroup.LayoutParams layoutParams11 = tUrlImageView.getLayoutParams();
                            if (layoutParams11 instanceof ViewGroup.MarginLayoutParams) {
                                ViewGroup.MarginLayoutParams marginLayoutParams11 = (ViewGroup.MarginLayoutParams) layoutParams11;
                                marginLayoutParams11.width = kew.v(22);
                                marginLayoutParams11.height = kew.v(22);
                                tUrlImageView.setLayoutParams(layoutParams11);
                            } else {
                                ViewGroup.MarginLayoutParams marginLayoutParams12 = new ViewGroup.MarginLayoutParams(-2, -2);
                                marginLayoutParams12.width = kew.v(22);
                                marginLayoutParams12.height = kew.v(22);
                                xhv xhvVar9 = xhv.INSTANCE;
                                tUrlImageView.setLayoutParams(marginLayoutParams12);
                            }
                            tUrlImageView.setImageUrl(jSONObject2.getString("icon"));
                            linearLayout2.addView(tUrlImageView);
                            xhv xhvVar10 = xhv.INSTANCE;
                            TextView textView = new TextView(linearLayout2.getContext());
                            ViewGroup.LayoutParams layoutParams12 = textView.getLayoutParams();
                            if (layoutParams12 instanceof ViewGroup.MarginLayoutParams) {
                                textView.setLayoutParams(layoutParams12);
                            } else {
                                textView.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
                            }
                            ViewGroup.LayoutParams layoutParams13 = textView.getLayoutParams();
                            if (layoutParams13 instanceof ViewGroup.MarginLayoutParams) {
                                ((ViewGroup.MarginLayoutParams) layoutParams13).leftMargin = kew.v(6);
                                textView.setLayoutParams(layoutParams13);
                            } else {
                                ViewGroup.MarginLayoutParams marginLayoutParams13 = new ViewGroup.MarginLayoutParams(-2, -2);
                                marginLayoutParams13.leftMargin = kew.v(6);
                                textView.setLayoutParams(marginLayoutParams13);
                            }
                            kew.c0(textView, kew.v(22));
                            textView.setText(jSONObject2.getString("text"));
                            if (h()) {
                                textView.getPaint().setShader(e(textView));
                            } else {
                                textView.setTextColor(-10066330);
                            }
                            linearLayout2.addView(textView);
                            linearLayout.addView(linearLayout2);
                        }
                        i2 = 30;
                        i3 = 17;
                    }
                    autoScrollAndScrollableTagView.addView(linearLayout);
                    xhv xhvVar11 = xhv.INSTANCE;
                    frameLayout.addView(autoScrollAndScrollableTagView);
                    View view = new View(frameLayout.getContext());
                    ViewGroup.LayoutParams layoutParams14 = view.getLayoutParams();
                    if (layoutParams14 instanceof ViewGroup.MarginLayoutParams) {
                        view.setLayoutParams(layoutParams14);
                    } else {
                        view.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
                    }
                    i(view);
                    ViewGroup.LayoutParams layoutParams15 = view.getLayoutParams();
                    FrameLayout.LayoutParams layoutParams16 = layoutParams15 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams15 : null;
                    if (layoutParams16 == null) {
                        FrameLayout.LayoutParams layoutParams17 = new FrameLayout.LayoutParams(-2, -2);
                        layoutParams17.height = kew.v(50);
                        layoutParams17.gravity = 17;
                        view.setLayoutParams(layoutParams17);
                    } else {
                        layoutParams16.height = kew.v(50);
                        layoutParams16.gravity = 17;
                    }
                    if (h()) {
                        view.setBackground(kew.u(kew.c(0, 0.2f), null, null, kew.v(10), 0, 0, 0, 0, 1, 654311423, 246, null));
                    }
                    frameLayout.addView(view);
                    viewGroup.addView(frameLayout);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
    }

    public final d1a<Boolean> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d1a) ipChange.ipc$dispatch("a1ad3249", new Object[]{this});
        }
        return this.h;
    }

    public final Shader e(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Shader) ipChange.ipc$dispatch("80b2078a", new Object[]{this, textView});
        }
        return new LinearGradient(0.0f, textView.getLineHeight(), textView.getPaint().measureText(textView.getText().toString()) / 2, 0.0f, -2048359, -857891, Shader.TileMode.MIRROR);
    }

    public final ShopDataParser f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopDataParser) ipChange.ipc$dispatch("16b01ba5", new Object[]{this});
        }
        return this.f21360a;
    }

    public final View g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.b;
    }

    public final boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e241eddc", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public final void i(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cfa0ef1", new Object[]{this, view});
        } else {
            this.e = view;
        }
    }

    public final void j(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("409d8b32", new Object[]{this, viewGroup});
        } else {
            this.c = viewGroup;
        }
    }

    public final void k(d1a<Boolean> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d56104f", new Object[]{this, d1aVar});
        } else {
            this.h = d1aVar;
        }
    }

    public final void l(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c23492da", new Object[]{this, viewGroup});
        } else {
            this.d = viewGroup;
        }
    }

    public final void m(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("205edae4", new Object[]{this, view});
        } else {
            this.b = view;
        }
    }

    public final void c(boolean z) {
        int childCount;
        JSONArray jSONArray;
        JSONObject jSONObject;
        JSONArray jSONArray2;
        JSONObject jSONObject2;
        JSONArray jSONArray3;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20ec9bec", new Object[]{this, new Boolean(z)});
            return;
        }
        this.f = z;
        if (z) {
            View view = this.b;
            if (view != null) {
                kew.e(view, kew.v(100));
            }
            ViewGroup viewGroup = this.d;
            if (viewGroup != null) {
                kew.e(viewGroup, kew.v(100));
            }
            ViewGroup viewGroup2 = this.c;
            if (viewGroup2 != null) {
                viewGroup2.setPadding(kew.v(20), 0, kew.v(20), 0);
            }
            View view2 = this.e;
            if (view2 != null) {
                view2.setBackground(kew.u(kew.c(0, 0.2f), null, null, kew.v(10), 0, 0, 0, 0, 1, 654311423, 246, null));
            }
        } else {
            View view3 = this.b;
            if (view3 != null) {
                kew.e(view3, j);
            }
            ViewGroup viewGroup3 = this.d;
            if (viewGroup3 != null) {
                kew.e(viewGroup3, j);
            }
            ViewGroup viewGroup4 = this.c;
            if (viewGroup4 != null) {
                viewGroup4.setPadding(0, i, 0, 0);
            }
            View view4 = this.e;
            if (view4 != null) {
                view4.setBackground(null);
            }
        }
        ViewGroup viewGroup5 = this.c;
        if (viewGroup5 != null && (childCount = viewGroup5.getChildCount()) > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                View childAt = viewGroup5.getChildAt(i2);
                if (childAt != null) {
                    ViewGroup viewGroup6 = (ViewGroup) childAt;
                    View childAt2 = viewGroup6.getChildAt(0);
                    if (childAt2 != null) {
                        TUrlImageView tUrlImageView = (TUrlImageView) childAt2;
                        View childAt3 = viewGroup6.getChildAt(1);
                        if (childAt3 != null) {
                            TextView textView = (TextView) childAt3;
                            if (h()) {
                                textView.getPaint().setShader(e(textView));
                                textView.setTextColor(-1717588);
                                JSONObject jSONObject4 = this.g;
                                tUrlImageView.setImageUrl((jSONObject4 == null || (jSONArray3 = jSONObject4.getJSONArray("tagList")) == null || (jSONObject3 = jSONArray3.getJSONObject(i2)) == null) ? null : jSONObject3.getString("icon"));
                                ViewGroup.LayoutParams layoutParams = viewGroup6.getLayoutParams();
                                if (layoutParams != null) {
                                    ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = kew.v(30);
                                    viewGroup6.setPadding(0, 0, 0, 0);
                                    viewGroup6.setBackground(null);
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                }
                            } else {
                                textView.getPaint().setShader(null);
                                textView.setTextColor(-10066330);
                                JSONObject jSONObject5 = this.g;
                                String string = (jSONObject5 == null || (jSONArray2 = jSONObject5.getJSONArray("tagList")) == null || (jSONObject2 = jSONArray2.getJSONObject(i2)) == null) ? null : jSONObject2.getString("icon2");
                                if (string == null || wsq.a0(string)) {
                                    JSONObject jSONObject6 = this.g;
                                    tUrlImageView.setImageUrl((jSONObject6 == null || (jSONArray = jSONObject6.getJSONArray("tagList")) == null || (jSONObject = jSONArray.getJSONObject(i2)) == null) ? null : jSONObject.getString("icon"));
                                } else {
                                    tUrlImageView.setImageUrl(string);
                                }
                                ViewGroup.LayoutParams layoutParams2 = viewGroup6.getLayoutParams();
                                if (layoutParams2 != null) {
                                    ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = kew.v(12);
                                    viewGroup6.setPadding(kew.v(18), kew.v(8), kew.v(18), kew.v(8));
                                    viewGroup6.setBackground(kew.u(-1, null, null, kew.v(6), 0, 0, 0, 0, 0, 0, 1014, null));
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                }
                            }
                            if (i3 < childCount) {
                                i2 = i3;
                            } else {
                                return;
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.taobao.uikit.extend.feature.view.TUrlImageView");
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                }
            }
        }
    }
}
