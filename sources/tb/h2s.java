package tb;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class h2s extends gi6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String WIDGET_NAME = "tdTradePriceView";
    public CharSequence c;
    public CharSequence d;
    public static final long WIDGET_ID = k06.a("tdTradePriceView");
    public static final long f = k06.a("symbolScale");
    public static final long g = k06.a("decimalScale");
    public static final long h = k06.a("price");
    public static final long i = k06.a("richText");

    /* renamed from: a  reason: collision with root package name */
    public float f20379a = 0.625f;
    public float b = 0.625f;
    public boolean e = xk.a("useEnhancedEditionDealPrice", true);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(301989936);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new h2s();
        }
    }

    public static /* synthetic */ Object ipc$super(h2s h2sVar, String str, Object... objArr) {
        switch (str.hashCode()) {
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/buy/dinamicX/widget/TDTradePriceWidgetNode");
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new h2s();
    }

    @Override // tb.gi6
    public void onBeforeMeasure(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d451fa5d", new Object[]{this, textView});
            return;
        }
        super.onBeforeMeasure(textView);
        if (!TextUtils.isEmpty(this.c)) {
            textView.setText(this.c);
        } else if (!TextUtils.isEmpty(this.d)) {
            CharSequence t = t(this.d);
            this.d = t;
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
        if (dXWidgetNode instanceof h2s) {
            h2s h2sVar = (h2s) dXWidgetNode;
            this.c = h2sVar.c;
            this.d = h2sVar.d;
            this.f20379a = h2sVar.f20379a;
            this.b = h2sVar.b;
            this.e = h2sVar.e;
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            if (!TextUtils.isEmpty(this.c)) {
                textView.setText(this.c);
            } else if (!TextUtils.isEmpty(this.d)) {
                CharSequence t = t(this.d);
                this.d = t;
                textView.setText(t);
            }
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d)});
            return;
        }
        super.onSetDoubleAttribute(j, d);
        if (f == j) {
            this.f20379a = (float) d;
        } else if (g == j) {
            this.b = (float) d;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetObjAttribute(long j, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65007bb1", new Object[]{this, new Long(j), obj});
            return;
        }
        super.onSetObjAttribute(j, obj);
        if (i != j) {
            return;
        }
        if (obj instanceof CharSequence) {
            this.c = (CharSequence) obj;
        } else {
            this.c = "";
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
            return;
        }
        super.onSetStringAttribute(j, str);
        if (h == j) {
            this.d = str;
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
        if (this.e) {
            i2 = charSequence2.lastIndexOf(46);
        } else {
            i2 = charSequence2.indexOf(46);
        }
        SpannableString spannableString = new SpannableString(charSequence2);
        int u = u(charSequence2);
        try {
            spannableString.setSpan(new RelativeSizeSpan(this.f20379a), 0, u, 33);
            int length = charSequence2.length();
            if (i2 >= 0 && (!this.e || i2 >= u)) {
                spannableString.setSpan(new RelativeSizeSpan(1.0f), u, i2, 33);
                spannableString.setSpan(new RelativeSizeSpan(this.b), i2, length, 33);
                return spannableString;
            }
            spannableString.setSpan(new RelativeSizeSpan(1.0f), u, length, 33);
            return spannableString;
        } catch (Throwable unused) {
            return charSequence2;
        }
    }

    public final int u(String str) {
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

    static {
        t2o.a(301989935);
    }
}
