package tb;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.widget.TextView;
import com.alibaba.android.ultron.trade.dinamicx3.constructor.TradePriceTextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class g2s extends gi6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "tdTradePriceView";

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f19705a;
    public CharSequence b;
    public boolean c = false;
    public float d = 0.625f;
    public float e = 1.0f;
    public float f = 0.625f;
    public final boolean g = vav.a("ultron", "useEnhancedEditionDealPrice", true);
    public static final long DX_WIDGET_ID = k06.a("tdTradePriceView");
    public static final long h = k06.a("richText");
    public static final long i = k06.a("price");
    public static final long j = k06.a("symbolScale");
    public static final long k = k06.a("decimalScale");
    public static final long l = k06.a("integerScale");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(155189292);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new g2s();
        }
    }

    public static /* synthetic */ Object ipc$super(g2s g2sVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -732824995:
                super.onBeforeMeasure((TextView) objArr[0]);
                return null;
            case -638169079:
                super.onSetDoubleAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).doubleValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 1694530481:
                super.onSetObjAttribute(((Number) objArr[0]).longValue(), objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/trade/dinamicx3/constructor/TDTradePriceWidgetNode");
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new g2s();
    }

    @Override // tb.gi6
    public void onBeforeMeasure(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d451fa5d", new Object[]{this, textView});
            return;
        }
        super.onBeforeMeasure(textView);
        if (!TextUtils.isEmpty(this.f19705a)) {
            textView.setText(this.f19705a);
        } else if (!TextUtils.isEmpty(this.b)) {
            CharSequence t = t(this.b);
            this.b = t;
            textView.setText(t);
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (dXWidgetNode instanceof g2s) {
            g2s g2sVar = (g2s) dXWidgetNode;
            this.f19705a = g2sVar.f19705a;
            this.b = g2sVar.b;
            this.d = g2sVar.d;
            this.f = g2sVar.f;
            this.c = g2sVar.c;
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return new TradePriceTextView(context);
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (view instanceof TradePriceTextView) {
            TradePriceTextView tradePriceTextView = (TradePriceTextView) view;
            if (!TextUtils.isEmpty(this.f19705a)) {
                tradePriceTextView.setText(this.f19705a);
            } else if (!TextUtils.isEmpty(this.b)) {
                CharSequence t = t(this.b);
                this.b = t;
                tradePriceTextView.setText(t);
            }
            tradePriceTextView.setHasDeleteLine(this.c);
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j2, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j2), new Double(d)});
            return;
        }
        super.onSetDoubleAttribute(j2, d);
        if (j == j2) {
            this.d = (float) d;
        } else if (k == j2) {
            this.f = (float) d;
        } else if (l == j2) {
            this.e = (float) d;
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j2, int i2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j2), new Integer(i2)});
        } else if (5559321398011072804L == j2) {
            if (i2 == 0) {
                z = false;
            }
            this.c = z;
        } else {
            super.onSetIntAttribute(j2, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetObjAttribute(long j2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65007bb1", new Object[]{this, new Long(j2), obj});
            return;
        }
        super.onSetObjAttribute(j2, obj);
        if (h != j2) {
            return;
        }
        if (obj instanceof CharSequence) {
            this.f19705a = (CharSequence) obj;
        } else {
            this.f19705a = "";
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j2), str});
            return;
        }
        super.onSetStringAttribute(j2, str);
        if (i == j2) {
            this.b = str;
        }
    }

    public final CharSequence t(CharSequence charSequence) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("fb22c3d2", new Object[]{this, charSequence});
        }
        if (charSequence instanceof SpannableString) {
            return charSequence;
        }
        if (charSequence == null) {
            return "";
        }
        String charSequence2 = charSequence.toString();
        if (this.g) {
            i2 = charSequence2.lastIndexOf(46);
        } else {
            i2 = charSequence2.indexOf(46);
        }
        SpannableString spannableString = new SpannableString(charSequence2);
        int v = v(charSequence2);
        try {
            spannableString.setSpan(new RelativeSizeSpan(this.d), 0, v, 33);
            int length = charSequence2.length();
            if (i2 >= 0 && (!this.g || i2 >= v)) {
                spannableString.setSpan(new RelativeSizeSpan(this.e), v, i2, 33);
                spannableString.setSpan(new RelativeSizeSpan(this.f), i2, length, 33);
                return spannableString;
            }
            spannableString.setSpan(new RelativeSizeSpan(this.e), v, length, 33);
            return spannableString;
        } catch (Throwable unused) {
            return charSequence2;
        }
    }

    public float u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2c9e77e6", new Object[]{this})).floatValue();
        }
        return this.f;
    }

    public final int v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e7fcd673", new Object[]{this, str})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        char[] charArray = str.toCharArray();
        for (int i2 = 0; i2 < charArray.length; i2++) {
            if (Character.isDigit(charArray[i2])) {
                return i2;
            }
        }
        return 0;
    }

    public float w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("29281fd3", new Object[]{this})).floatValue();
        }
        return this.d;
    }

    public void x(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42c6fafe", new Object[]{this, new Float(f)});
        } else {
            this.f = f;
        }
    }

    public void y(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fd8d949", new Object[]{this, new Float(f)});
        } else {
            this.d = f;
        }
    }

    static {
        t2o.a(155189291);
    }
}
