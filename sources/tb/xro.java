package tb;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.ui.RippleLayout;
import com.taobao.taobao.R;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class xro extends zr1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final int k = p1p.a(44.0f);
    public int[] l;
    public FrameLayout m;
    public RippleLayout n;
    public Map<String, String> o;
    public String p;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f31557a;
        public final /* synthetic */ xro b;

        public a(Context context, xro xroVar) {
            this.f31557a = context;
            this.b = xroVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            ptk a2 = hvn.INSTANCE.a(this.f31557a);
            if (a2 != null) {
                JSONObject jSONObject = new JSONObject();
                xro xroVar = this.b;
                jSONObject.put((JSONObject) "isScanRegion", (String) Boolean.TRUE);
                jSONObject.put((JSONObject) "region", xro.A(xroVar));
                a2.r(jSONObject);
            }
            mzu.h("Page_PhotoSearchResult", "codeDotClick", xro.C(this.b));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            RippleLayout B = xro.B(xro.this);
            if (B != null) {
                B.startRippleAnim();
            } else {
                ckf.y("rippleAnimLayout");
                throw null;
            }
        }
    }

    static {
        t2o.a(481297577);
    }

    public xro() {
        super("nt_scan_code_hint");
    }

    public static final /* synthetic */ String A(xro xroVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("40ae895c", new Object[]{xroVar});
        }
        return xroVar.p;
    }

    public static final /* synthetic */ RippleLayout B(xro xroVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RippleLayout) ipChange.ipc$dispatch("bb5f6512", new Object[]{xroVar});
        }
        return xroVar.n;
    }

    public static final /* synthetic */ Map C(xro xroVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6a82af88", new Object[]{xroVar});
        }
        return xroVar.o;
    }

    public static /* synthetic */ Object ipc$super(xro xroVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/ui/coordinatorcard/instance/ScanCodeHintCard");
    }

    @Override // tb.zr1
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a84ec6", new Object[]{this});
            return;
        }
        RippleLayout rippleLayout = this.n;
        if (rippleLayout != null) {
            rippleLayout.stopRippleAnim();
            n();
            return;
        }
        ckf.y("rippleAnimLayout");
        throw null;
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
    public void o(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8d8d410", new Object[]{this, jSONObject});
        }
    }

    public void D(Context context, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2acea8b", new Object[]{this, context, jSONObject, jSONObject2});
            return;
        }
        ckf.g(context, "context");
        x(jSONObject);
        s(jSONObject2);
        this.m = new FrameLayout(context);
        int a2 = p1p.a(29.0f);
        this.n = new RippleLayout(context, a2, 0, null, 12, null);
        int i = this.k;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        FrameLayout frameLayout = this.m;
        if (frameLayout != null) {
            RippleLayout rippleLayout = this.n;
            if (rippleLayout != null) {
                frameLayout.addView(rippleLayout, layoutParams);
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(R.drawable.feis_ic_black_arrow);
                imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                int a3 = p1p.a(8.0f);
                imageView.setPadding(a3, a3, a3, a3);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(Color.parseColor("#FFFFFF"));
                gradientDrawable.setShape(1);
                imageView.setBackground(gradientDrawable);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(a2, a2);
                layoutParams2.gravity = 17;
                FrameLayout frameLayout2 = this.m;
                if (frameLayout2 != null) {
                    frameLayout2.addView(imageView, layoutParams2);
                    FrameLayout frameLayout3 = this.m;
                    if (frameLayout3 != null) {
                        frameLayout3.setOnClickListener(new a(context, this));
                        int i2 = this.k;
                        this.l = new int[]{i2, i2};
                        FrameLayout frameLayout4 = this.m;
                        if (frameLayout4 != null) {
                            ViewGroup.LayoutParams layoutParams3 = frameLayout4.getLayoutParams();
                            if (layoutParams3 == null) {
                                int i3 = this.k;
                                layoutParams3 = new ViewGroup.MarginLayoutParams(i3, i3);
                            }
                            FrameLayout frameLayout5 = this.m;
                            if (frameLayout5 != null) {
                                frameLayout5.setLayoutParams(layoutParams3);
                                t((-this.k) / 2.0f);
                                u((-this.k) / 2.0f);
                                this.p = h19.i(jSONObject2, "region", "");
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                String i4 = h19.i(jSONObject2, "tfskey", "");
                                ckf.f(i4, "parseString(data, \"tfskey\", \"\")");
                                linkedHashMap.put("tfskey", i4);
                                String i5 = h19.i(jSONObject2, "imgSize", "unknown_unknown");
                                ckf.f(i5, "parseString(data, \"imgSize\", \"unknown_unknown\")");
                                linkedHashMap.put("imgSize", i5);
                                String str = this.p;
                                if (str == null) {
                                    str = "";
                                }
                                linkedHashMap.put("region", str);
                                String i6 = h19.i(jSONObject2, "type", "");
                                ckf.f(i6, "parseString(data, \"type\", \"\")");
                                linkedHashMap.put("type", i6);
                                String i7 = h19.i(jSONObject2, "content", "");
                                ckf.f(i7, "parseString(data, \"content\", \"\")");
                                linkedHashMap.put("content", i7);
                                mzu.p("Page_PhotoSearchResult", "codeDotExpose", linkedHashMap);
                                this.o = linkedHashMap;
                                FrameLayout frameLayout6 = this.m;
                                if (frameLayout6 != null) {
                                    frameLayout6.post(new b());
                                } else {
                                    ckf.y("rootView");
                                    throw null;
                                }
                            } else {
                                ckf.y("rootView");
                                throw null;
                            }
                        } else {
                            ckf.y("rootView");
                            throw null;
                        }
                    } else {
                        ckf.y("rootView");
                        throw null;
                    }
                } else {
                    ckf.y("rootView");
                    throw null;
                }
            } else {
                ckf.y("rippleAnimLayout");
                throw null;
            }
        } else {
            ckf.y("rootView");
            throw null;
        }
    }
}
