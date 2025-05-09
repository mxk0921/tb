package tb;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class fhe extends zr1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean D;
    public Context k;
    public int[] l;
    public FrameLayout m;
    public View n;
    public FrameLayout o;
    public View p;
    public TextView q;
    public boolean r;
    public String s = "";
    public String t = "";
    public String u = "";
    public String v = "";
    public String w = "";
    public String x = "";
    public final int y = p1p.a(19.0f);
    public final int z = p1p.a(9.5f);
    public final int A = p1p.a(6.5f);
    public final int B = p1p.a(8.5f);
    public final int C = p1p.a(28.5f);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            fhe fheVar = fhe.this;
            FrameLayout F = fhe.F(fheVar);
            if (F != null) {
                fhe.J(fheVar, F);
                fhe.G(fhe.this);
                fhe fheVar2 = fhe.this;
                fhe.I(fheVar2, fhe.H(fheVar2));
                return;
            }
            ckf.y("rootView");
            throw null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ FrameLayout b;

        public b(FrameLayout frameLayout) {
            this.b = frameLayout;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            String D = fhe.D(fhe.this);
            if (D != null && D.length() != 0 && !fhe.H(fhe.this)) {
                ptk a2 = hvn.INSTANCE.a(this.b.getContext());
                if (a2 != null) {
                    JSONObject jSONObject = new JSONObject();
                    fhe fheVar = fhe.this;
                    jSONObject.put((JSONObject) "cardData", (String) fheVar.c());
                    jSONObject.put((JSONObject) "regionKey", fhe.D(fheVar));
                    a2.r(jSONObject);
                }
                fhe.K(fhe.this, true);
                fhe.this.z("isSelected", "true");
                fhe fheVar2 = fhe.this;
                fhe.I(fheVar2, fhe.H(fheVar2));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                fhe fheVar3 = fhe.this;
                linkedHashMap.put("pssource", fhe.B(fheVar3));
                linkedHashMap.put(wxi.KEY_PHOTO_FROM, fhe.A(fheVar3));
                linkedHashMap.put("tag_text", fhe.C(fheVar3));
                linkedHashMap.put("tag_type", fhe.E(fheVar3));
                xhv xhvVar = xhv.INSTANCE;
                mzu.h("Page_PhotoSearchElim_WAI", "regionTag", linkedHashMap);
            }
        }
    }

    static {
        t2o.a(481297572);
    }

    public fhe() {
        super("nt_identify_region_card");
    }

    public static final /* synthetic */ String A(fhe fheVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("80d2e2c7", new Object[]{fheVar});
        }
        return fheVar.x;
    }

    public static final /* synthetic */ String B(fhe fheVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("98b2fef5", new Object[]{fheVar});
        }
        return fheVar.w;
    }

    public static final /* synthetic */ String C(fhe fheVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fc6cce10", new Object[]{fheVar});
        }
        return fheVar.u;
    }

    public static final /* synthetic */ String D(fhe fheVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ae95c76", new Object[]{fheVar});
        }
        return fheVar.s;
    }

    public static final /* synthetic */ String E(fhe fheVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ccdfede5", new Object[]{fheVar});
        }
        return fheVar.v;
    }

    public static final /* synthetic */ FrameLayout F(fhe fheVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("f23b2eb7", new Object[]{fheVar});
        }
        return fheVar.m;
    }

    public static final /* synthetic */ void G(fhe fheVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8748561", new Object[]{fheVar});
        } else {
            fheVar.N();
        }
    }

    public static final /* synthetic */ boolean H(fhe fheVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a25fd9e", new Object[]{fheVar})).booleanValue();
        }
        return fheVar.r;
    }

    public static final /* synthetic */ void I(fhe fheVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d5aeae6", new Object[]{fheVar, new Boolean(z)});
        } else {
            fheVar.O(z);
        }
    }

    public static final /* synthetic */ void J(fhe fheVar, FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3fc94c3", new Object[]{fheVar, frameLayout});
        } else {
            fheVar.R(frameLayout);
        }
    }

    public static final /* synthetic */ void K(fhe fheVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6f31732", new Object[]{fheVar, new Boolean(z)});
        } else {
            fheVar.r = z;
        }
    }

    public static /* synthetic */ Object ipc$super(fhe fheVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/ui/coordinatorcard/instance/IdentifyRegionCard");
    }

    public final FrameLayout L() {
        GradientDrawable.Orientation orientation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("b393c4e6", new Object[]{this});
        }
        Context context = this.k;
        if (context != null) {
            FrameLayout frameLayout = new FrameLayout(context);
            View view = new View(frameLayout.getContext());
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setColor(Color.parseColor("#CC0E1119"));
            gradientDrawable.setCornerRadius(p1p.b(6.0f));
            view.setBackground(gradientDrawable);
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            View view2 = new View(frameLayout.getContext());
            view2.setVisibility(8);
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(0);
            if (m()) {
                orientation = GradientDrawable.Orientation.RIGHT_LEFT;
            } else {
                orientation = GradientDrawable.Orientation.LEFT_RIGHT;
            }
            gradientDrawable2.setOrientation(orientation);
            gradientDrawable2.setColors(new int[]{Color.parseColor("#00FF6200"), Color.parseColor("#99FF6200")});
            gradientDrawable2.setCornerRadius(p1p.b(6.0f));
            view2.setBackground(gradientDrawable2);
            this.p = view2;
            frameLayout.addView(view2, new FrameLayout.LayoutParams(-1, -1));
            TextView textView = new TextView(frameLayout.getContext());
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setTextSize(1, 13.0f);
            textView.setTextColor(Color.parseColor("#E5FFFFFF"));
            this.q = textView;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            int i = this.B;
            layoutParams.setMargins(i, 0, i, 0);
            xhv xhvVar = xhv.INSTANCE;
            frameLayout.addView(textView, layoutParams);
            return frameLayout;
        }
        ckf.y("context");
        throw null;
    }

    public final View M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b9dd4847", new Object[]{this});
        }
        Context context = this.k;
        if (context != null) {
            FrameLayout frameLayout = new FrameLayout(context);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(Color.parseColor("#CC0E1119"));
            frameLayout.setBackground(gradientDrawable);
            View view = new View(frameLayout.getContext());
            this.n = view;
            int i = this.z;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
            layoutParams.gravity = 17;
            xhv xhvVar = xhv.INSTANCE;
            frameLayout.addView(view, layoutParams);
            return frameLayout;
        }
        ckf.y("context");
        throw null;
    }

    public final void R(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a358d15", new Object[]{this, frameLayout});
            return;
        }
        frameLayout.removeAllViews();
        frameLayout.setOnClickListener(new b(frameLayout));
        View M = M();
        this.o = L();
        if (m()) {
            FrameLayout frameLayout2 = this.o;
            if (frameLayout2 != null) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, this.C);
                layoutParams.gravity = 8388627;
                layoutParams.setMargins(0, 0, this.A + this.y, 0);
                xhv xhvVar = xhv.INSTANCE;
                frameLayout.addView(frameLayout2, layoutParams);
                int i = this.y;
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i, i);
                layoutParams2.gravity = 8388629;
                frameLayout.addView(M, layoutParams2);
                return;
            }
            ckf.y("contentView");
            throw null;
        }
        int i2 = this.y;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(i2, i2);
        layoutParams3.gravity = 8388627;
        xhv xhvVar2 = xhv.INSTANCE;
        frameLayout.addView(M, layoutParams3);
        FrameLayout frameLayout3 = this.o;
        if (frameLayout3 != null) {
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, this.C);
            layoutParams4.gravity = 8388629;
            layoutParams4.setMargins(this.A + this.y, 0, 0, 0);
            frameLayout.addView(frameLayout3, layoutParams4);
            return;
        }
        ckf.y("contentView");
        throw null;
    }

    public final int[] S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("4f38b2d1", new Object[]{this});
        }
        if (this.t.length() == 0) {
            int i = this.y;
            float f = (-i) / 2.0f;
            t(f);
            u(f);
            return new int[]{i, i};
        }
        int[] iArr = new int[2];
        iArr[1] = this.C;
        float f2 = this.y + this.A + (this.B * 2);
        TextPaint textPaint = new TextPaint();
        TextView textView = this.q;
        if (textView != null) {
            textPaint.setTextSize(textView.getTextSize());
            iArr[0] = (int) Math.ceil(f2 + textPaint.measureText(this.t));
            t((-this.y) / 2.0f);
            u((-this.y) / 2.0f);
            return iArr;
        }
        ckf.y("contentTv");
        throw null;
    }

    @Override // tb.zr1
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a84ec6", new Object[]{this});
        } else {
            n();
        }
    }

    @Override // tb.zr1
    public int[] d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("e1252345", new Object[]{this});
        }
        int[] iArr = this.l;
        if (iArr != null) {
            return iArr;
        }
        ckf.y("measureMetrics");
        throw null;
    }

    @Override // tb.zr1
    public View g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("17b33166", new Object[]{this});
        }
        FrameLayout frameLayout = this.m;
        if (frameLayout != null) {
            return frameLayout;
        }
        ckf.y("rootView");
        throw null;
    }

    @Override // tb.zr1
    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff933d6b", new Object[]{this})).booleanValue();
        }
        return this.D;
    }

    @Override // tb.zr1
    public void v(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98b01985", new Object[]{this, new Boolean(z)});
            return;
        }
        this.D = z;
        FrameLayout frameLayout = this.m;
        if (frameLayout != null) {
            frameLayout.post(new a());
        } else {
            ckf.y("rootView");
            throw null;
        }
    }

    public final void N() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6872ff91", new Object[]{this});
            return;
        }
        String i = h19.i(c(), "regionKey", "");
        ckf.f(i, "parseString(data, \"regionKey\", \"\")");
        this.s = i;
        String i2 = h19.i(c(), "text", "");
        ckf.f(i2, "parseString(data, \"text\", \"\")");
        this.u = i2;
        String i3 = h19.i(c(), "pssource", "");
        ckf.f(i3, "parseString(data, \"pssource\", \"\")");
        this.w = i3;
        String i4 = h19.i(c(), wxi.KEY_PHOTO_FROM, "");
        ckf.f(i4, "parseString(data, \"photofrom\", \"\")");
        this.x = i4;
        String i5 = h19.i(c(), "boxType", "");
        ckf.f(i5, "parseString(data, \"boxType\", \"\")");
        this.v = i5;
        if (this.u.length() > 10) {
            String substring = this.u.substring(0, 10);
            ckf.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            str = ckf.p(substring, "...");
        } else {
            str = this.u;
        }
        this.t = str;
        if (str == null || str.length() == 0) {
            FrameLayout frameLayout = this.o;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            } else {
                ckf.y("contentView");
                throw null;
            }
        } else {
            FrameLayout frameLayout2 = this.o;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(0);
                TextView textView = this.q;
                if (textView != null) {
                    textView.setText(this.t);
                } else {
                    ckf.y("contentTv");
                    throw null;
                }
            } else {
                ckf.y("contentView");
                throw null;
            }
        }
    }

    public void Q(Context context, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2acea8b", new Object[]{this, context, jSONObject, jSONObject2});
            return;
        }
        ckf.g(context, "context");
        this.k = context;
        x(jSONObject);
        s(jSONObject2);
        this.r = qrl.a(h19.i(jSONObject, "isSelected", ""), false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.m = frameLayout;
        R(frameLayout);
        N();
        O(this.r);
        P();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("pssource", this.w);
        linkedHashMap.put(wxi.KEY_PHOTO_FROM, this.x);
        linkedHashMap.put("tag_text", this.u);
        linkedHashMap.put("tag_type", this.v);
        xhv xhvVar = xhv.INSTANCE;
        mzu.p("Page_PhotoSearchElim_WAI", "regionTag", linkedHashMap);
    }

    @Override // tb.zr1
    public void o(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8d8d410", new Object[]{this, jSONObject});
            return;
        }
        boolean a2 = qrl.a(h19.i(jSONObject, "isSelected", ""), false);
        this.r = a2;
        O(a2);
    }

    public final void O(boolean z) {
        Typeface typeface;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa096cf0", new Object[]{this, new Boolean(z)});
            return;
        }
        View view = this.n;
        if (view != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            if (z) {
                gradientDrawable.setColor(Color.parseColor("#FF6200"));
            } else {
                gradientDrawable.setColor(Color.parseColor("#E5FFFFFF"));
            }
            view.setBackground(gradientDrawable);
            FrameLayout frameLayout = this.o;
            if (frameLayout == null) {
                ckf.y("contentView");
                throw null;
            } else if (frameLayout.getVisibility() == 0) {
                TextView textView = this.q;
                if (textView != null) {
                    if (z) {
                        typeface = Typeface.DEFAULT_BOLD;
                    } else {
                        typeface = Typeface.DEFAULT;
                    }
                    textView.setTypeface(typeface);
                    View view2 = this.p;
                    if (view2 != null) {
                        if (!z) {
                            i = 8;
                        }
                        view2.setVisibility(i);
                        return;
                    }
                    ckf.y("contentSelectHintView");
                    throw null;
                }
                ckf.y("contentTv");
                throw null;
            }
        } else {
            ckf.y("hintInnerView");
            throw null;
        }
    }

    public final void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eab8b19", new Object[]{this});
            return;
        }
        this.l = S();
        FrameLayout frameLayout = this.m;
        if (frameLayout != null) {
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (layoutParams == null) {
                int[] iArr = this.l;
                if (iArr != null) {
                    layoutParams = new ViewGroup.MarginLayoutParams(iArr[0], iArr[1]);
                } else {
                    ckf.y("measureMetrics");
                    throw null;
                }
            }
            int[] iArr2 = this.l;
            if (iArr2 != null) {
                layoutParams.width = iArr2[0];
                layoutParams.height = iArr2[1];
                FrameLayout frameLayout2 = this.m;
                if (frameLayout2 != null) {
                    frameLayout2.setLayoutParams(layoutParams);
                } else {
                    ckf.y("rootView");
                    throw null;
                }
            } else {
                ckf.y("measureMetrics");
                throw null;
            }
        } else {
            ckf.y("rootView");
            throw null;
        }
    }
}
