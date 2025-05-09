package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.widget.ObserverFrameLayout;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Ref$ObjectRef;
import tb.n2m;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ev0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public LinearLayout f18832a;
    public TextView b;
    public LinearLayout c;
    public LinearLayout d;
    public ObserverFrameLayout e;
    public TextView f;
    public TUrlImageView g;
    public TUrlImageView h;
    public final Context i;
    public final String j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef f18833a;
        public final /* synthetic */ Ref$ObjectRef b;
        public final /* synthetic */ Ref$ObjectRef c;
        public final /* synthetic */ ev0 d;

        public a(Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Ref$ObjectRef ref$ObjectRef3, ev0 ev0Var) {
            this.f18833a = ref$ObjectRef;
            this.b = ref$ObjectRef2;
            this.c = ref$ObjectRef3;
            this.d = ev0Var;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "eventId", "2101");
            jSONObject.put((JSONObject) "arg1", "Page_Detail_Button-MatchTag");
            JSONObject jSONObject2 = new JSONObject();
            String str = (String) this.f18833a.element;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            jSONObject2.put("tagText", (Object) str);
            String str3 = (String) this.b.element;
            if (str3 != null) {
                str2 = str3;
            }
            jSONObject2.put("matching_item_id", (Object) str2);
            jSONObject2.put("imgUrl", (Object) ev0.b(this.d));
            jSONObject.put((JSONObject) "args", (String) jSONObject2);
            q84.f(ev0.a(this.d), new rc7("userTrack", jSONObject, new RuntimeAbilityParam[0]));
            if (!TextUtils.isEmpty((String) this.c.element)) {
                Context a2 = ev0.a(this.d);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("url", (Object) ((String) this.c.element));
                q84.f(a2, new rc7("openUrl", jSONObject3, new RuntimeAbilityParam[0]));
            }
        }
    }

    static {
        t2o.a(912262352);
    }

    public ev0(Context context, String str) {
        ckf.h(context, "context");
        ckf.h(str, "imgUrl");
        this.i = context;
        this.j = str;
    }

    public static final /* synthetic */ Context a(ev0 ev0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("aef5b1e2", new Object[]{ev0Var});
        }
        return ev0Var.i;
    }

    public static final /* synthetic */ String b(ev0 ev0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("19c862df", new Object[]{ev0Var});
        }
        return ev0Var.j;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, java.lang.String] */
    public final void c(n2m.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9102126", new Object[]{this, aVar});
        } else if (aVar != null) {
            if (ckf.b(aVar.e, "left")) {
                LinearLayout linearLayout = this.d;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
            } else {
                LinearLayout linearLayout2 = this.c;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(0);
                }
            }
            TextView textView = this.b;
            if (textView != null) {
                textView.setText(aVar.b);
            }
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.element = aVar.f24468a;
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            ref$ObjectRef2.element = aVar.b;
            Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
            ref$ObjectRef3.element = aVar.f;
            if (TextUtils.isEmpty((String) ref$ObjectRef.element)) {
                TextView textView2 = this.f;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
            } else {
                TextView textView3 = this.f;
                if (textView3 != null) {
                    textView3.setVisibility(0);
                }
            }
            LinearLayout linearLayout3 = this.f18832a;
            if (linearLayout3 != null) {
                linearLayout3.setOnClickListener(new a(ref$ObjectRef2, ref$ObjectRef3, ref$ObjectRef, this));
            }
        }
    }

    public final void e() {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        TextView textView;
        TUrlImageView tUrlImageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("960c80ba", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView2 = null;
        View inflate = LayoutInflater.from(this.i).inflate(R.layout.tt_detail_desc_anchor_point, (ViewGroup) null);
        if (inflate != null) {
            LinearLayout linearLayout3 = (LinearLayout) inflate;
            this.f18832a = linearLayout3;
            this.b = (TextView) linearLayout3.findViewById(R.id.anchor_point_text);
            LinearLayout linearLayout4 = this.f18832a;
            if (linearLayout4 != null) {
                linearLayout = (LinearLayout) linearLayout4.findViewById(R.id.anchor_point_left);
            } else {
                linearLayout = null;
            }
            this.c = linearLayout;
            LinearLayout linearLayout5 = this.f18832a;
            if (linearLayout5 != null) {
                linearLayout2 = (LinearLayout) linearLayout5.findViewById(R.id.anchor_point_right);
            } else {
                linearLayout2 = null;
            }
            this.d = linearLayout2;
            LinearLayout linearLayout6 = this.f18832a;
            if (linearLayout6 != null) {
                textView = (TextView) linearLayout6.findViewById(R.id.anchor_point_icon);
            } else {
                textView = null;
            }
            this.f = textView;
            LinearLayout linearLayout7 = this.f18832a;
            if (linearLayout7 != null) {
                tUrlImageView = (TUrlImageView) linearLayout7.findViewById(R.id.anchor_point_left_img);
            } else {
                tUrlImageView = null;
            }
            this.g = tUrlImageView;
            LinearLayout linearLayout8 = this.f18832a;
            if (linearLayout8 != null) {
                tUrlImageView2 = (TUrlImageView) linearLayout8.findViewById(R.id.anchor_point_right_img);
            }
            this.h = tUrlImageView2;
            TUrlImageView tUrlImageView3 = this.g;
            if (tUrlImageView3 != null) {
                tUrlImageView3.setImageUrl("https://img.alicdn.com/imgextra/i2/O1CN016xmJue1cGUBD9NaU6_!!6000000003573-2-tps-134-40.png");
            }
            TUrlImageView tUrlImageView4 = this.h;
            if (tUrlImageView4 != null) {
                tUrlImageView4.setImageUrl("https://img.alicdn.com/imgextra/i3/O1CN01wWKyqB1x05w6g2N0v_!!6000000006380-2-tps-134-40.png");
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout");
    }

    public final void f() {
        ObserverFrameLayout observerFrameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = this.f18832a;
        if (linearLayout != null && (observerFrameLayout = this.e) != null) {
            observerFrameLayout.removeView(linearLayout);
        }
    }

    public final void d(n2m.a aVar, ObserverFrameLayout observerFrameLayout, int i, int i2) {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb79b608", new Object[]{this, aVar, observerFrameLayout, new Integer(i), new Integer(i2)});
            return;
        }
        ckf.h(observerFrameLayout, "rootView");
        this.e = observerFrameLayout;
        if (aVar != null) {
            LinearLayout linearLayout = this.f18832a;
            if (linearLayout != null) {
                linearLayout.measure(-2, -2);
            }
            LinearLayout linearLayout2 = this.f18832a;
            int measuredWidth = linearLayout2 != null ? linearLayout2.getMeasuredWidth() : 0;
            if (ckf.b(aVar.e, "right")) {
                i3 = (int) (i * aVar.c);
            } else {
                i3 = ((int) (i * aVar.c)) - measuredWidth;
            }
            int i4 = (int) (i2 * aVar.d);
            LinearLayout linearLayout3 = this.f18832a;
            if (linearLayout3 != null) {
                ViewGroup.LayoutParams layoutParams = linearLayout3.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new FrameLayout.LayoutParams(-2, -2);
                }
                TextView textView = this.f;
                if (textView != null) {
                    textView.measure(0, 0);
                }
                TextView textView2 = this.f;
                int measuredWidth2 = textView2 != null ? textView2.getMeasuredWidth() : 0;
                int a2 = mr7.a(16.0f);
                TextView textView3 = this.b;
                ViewGroup.LayoutParams layoutParams2 = textView3 != null ? textView3.getLayoutParams() : null;
                if (layoutParams2 != null) {
                    LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
                    if (i3 < a2) {
                        LinearLayout linearLayout4 = this.d;
                        if (linearLayout4 != null) {
                            linearLayout4.measure(0, 0);
                        }
                        LinearLayout linearLayout5 = this.d;
                        layoutParams3.width = ((((int) (i * aVar.c)) - a2) - (linearLayout5 != null ? linearLayout5.getMeasuredWidth() : 0)) - measuredWidth2;
                        i3 = a2;
                    } else if (i3 > (i - measuredWidth) - a2) {
                        LinearLayout linearLayout6 = this.c;
                        if (linearLayout6 != null) {
                            linearLayout6.measure(0, 0);
                        }
                        LinearLayout linearLayout7 = this.c;
                        layoutParams3.width = (((i - ((int) (i * aVar.c))) - a2) - (linearLayout7 != null ? linearLayout7.getMeasuredWidth() : 0)) - measuredWidth2;
                    }
                    String str = aVar.f24468a;
                    ckf.c(str, "it.url");
                    if (str.length() > 0) {
                        TextView textView4 = this.b;
                        if (textView4 != null) {
                            textView4.setPadding(mr7.a(6.0f), mr7.a(2.0f), mr7.a(3.0f), mr7.a(3.0f));
                        }
                    } else {
                        TextView textView5 = this.b;
                        if (textView5 != null) {
                            textView5.setPadding(mr7.a(6.0f), mr7.a(2.0f), mr7.a(6.0f), mr7.a(3.0f));
                        }
                    }
                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams;
                    layoutParams4.leftMargin = i3;
                    layoutParams4.topMargin = i4;
                    linearLayout3.setLayoutParams(layoutParams);
                    observerFrameLayout.addView(linearLayout3);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put((JSONObject) "page", "Page_Detail");
                    jSONObject.put((JSONObject) "eventId", "2201");
                    jSONObject.put((JSONObject) "arg1", "Page_Detail_Show-MatchTag_TagCount");
                    JSONObject jSONObject2 = new JSONObject();
                    String str2 = aVar.b;
                    String str3 = "";
                    if (str2 == null) {
                        str2 = str3;
                    }
                    jSONObject2.put("tagText", (Object) str2);
                    String str4 = aVar.f;
                    if (str4 != null) {
                        str3 = str4;
                    }
                    jSONObject2.put("matching_item_id", (Object) str3);
                    jSONObject2.put("imgUrl", (Object) this.j);
                    jSONObject.put((JSONObject) "args", (String) jSONObject2);
                    q84.f(this.i, new rc7("userTrack", jSONObject, new RuntimeAbilityParam[0]));
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
        }
    }
}
