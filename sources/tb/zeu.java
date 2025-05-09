package tb;

import android.content.Context;
import android.graphics.Color;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class zeu extends zr1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final int k;
    public TextView l;
    public int[] m;
    public Context n;
    public int q;
    public String o = "";
    public float p = 13.0f;
    public int r = 1;

    static {
        t2o.a(481297580);
    }

    public zeu() {
        super("nt_translate_result");
        int a2 = p1p.a(32.0f);
        this.k = a2;
        this.q = a2;
    }

    public static /* synthetic */ Object ipc$super(zeu zeuVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/ui/coordinatorcard/instance/TranslateResultCard");
    }

    public final void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        Context context = this.n;
        if (context != null) {
            TextView textView = new TextView(context);
            textView.setTextSize(0, this.p);
            textView.setTextColor(Color.parseColor("#FFFFFF"));
            textView.setGravity(17);
            int a2 = p1p.a(0.5f);
            textView.setPadding(a2, a2, a2, a2);
            this.l = textView;
            return;
        }
        ckf.y("context");
        throw null;
    }

    public final void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3be2ab04", new Object[]{this});
            return;
        }
        String i = h19.i(c(), "result", "");
        ckf.f(i, "parseString(data, \"result\", \"\")");
        this.o = i;
    }

    public final void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("979ad0a7", new Object[]{this});
            return;
        }
        E();
        TextView textView = this.l;
        if (textView != null) {
            textView.setText(this.o);
        } else {
            ckf.y("rootView");
            throw null;
        }
    }

    public void F(Context context, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2acea8b", new Object[]{this, context, jSONObject, jSONObject2});
            return;
        }
        ckf.g(context, "context");
        this.n = context;
        x(jSONObject);
        s(jSONObject2);
        C();
        B();
        A();
        D();
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
        int[] iArr = this.m;
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
        TextView textView = this.l;
        if (textView != null) {
            return textView;
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

    public final void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f07e8c", new Object[]{this});
            return;
        }
        this.p = h19.f(c(), "textSize", 13.0f);
        this.q = h19.g(c(), "maxWidth", this.k);
        this.r = h19.g(c(), "lineCount", 1);
    }

    public final void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2eab8b19", new Object[]{this});
            return;
        }
        this.m = G();
        TextView textView = this.l;
        if (textView != null) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams == null) {
                int[] iArr = this.m;
                if (iArr != null) {
                    layoutParams = new ViewGroup.MarginLayoutParams(iArr[0], iArr[1]);
                } else {
                    ckf.y("measureMetrics");
                    throw null;
                }
            }
            int[] iArr2 = this.m;
            if (iArr2 != null) {
                layoutParams.width = iArr2[0];
                layoutParams.height = iArr2[1];
                TextView textView2 = this.l;
                if (textView2 != null) {
                    textView2.setLayoutParams(layoutParams);
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

    public final int[] G() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("4f38b2d1", new Object[]{this});
        }
        if (this.o.length() == 0) {
            int i2 = this.k;
            float f = (-i2) / 2.0f;
            t(f);
            u(f);
            return new int[]{i2, i2};
        }
        int[] iArr = new int[2];
        TextPaint textPaint = new TextPaint();
        TextView textView = this.l;
        if (textView != null) {
            textPaint.setTextSize(textView.getTextSize());
            float abs = (Math.abs(textPaint.getFontMetrics().top) + Math.abs(textPaint.getFontMetrics().bottom) + textPaint.getFontMetrics().leading) * this.r;
            int a2 = p1p.a(1.0f);
            int i3 = this.q;
            if (i3 <= 0) {
                i3 = this.k;
            }
            int i4 = i3 + a2;
            iArr[0] = i4;
            t((-i4) / 2.0f);
            if (abs <= 0.0f) {
                i = this.k;
            } else {
                i = (int) Math.ceil(abs);
            }
            int i5 = i + a2;
            iArr[1] = i5;
            u((-i5) / 2.0f);
            return iArr;
        }
        ckf.y("rootView");
        throw null;
    }
}
