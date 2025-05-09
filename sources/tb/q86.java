package tb;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class q86 extends gi6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PRICE_VIEW = -1774401487317544297L;
    public static final long DX_PRICE_VIEW_DECIMAL_SCALE = 1173920119500817859L;
    public static final long DX_PRICE_VIEW_PRICE = 19050247891224L;
    public static final long DX_PRICE_VIEW_SYMBOL_SCALE = 3292072420574688137L;
    public static final Pattern d = Pattern.compile("[0-9]");
    public static final Pattern e = Pattern.compile("[.]");

    /* renamed from: a  reason: collision with root package name */
    public float f26574a = 0.625f;
    public String b = "";
    public float c = 0.625f;

    static {
        t2o.a(614465707);
    }

    public static /* synthetic */ Object ipc$super(q86 q86Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1806543962:
                return new Double(super.getDefaultValueForDoubleAttr(((Number) objArr[0]).longValue()));
            case -638169079:
                super.onSetDoubleAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).doubleValue());
                return null;
            case 253729832:
                return super.getDefaultValueForStringAttr(((Number) objArr[0]).longValue());
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/dinamicX/view/DXPriceViewWidgetNode");
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new q86();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public double getDefaultValueForDoubleAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("945253a6", new Object[]{this, new Long(j)})).doubleValue();
        }
        if (j == DX_PRICE_VIEW_DECIMAL_SCALE || j == DX_PRICE_VIEW_SYMBOL_SCALE) {
            return 0.625d;
        }
        return super.getDefaultValueForDoubleAttr(j);
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public String getDefaultValueForStringAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1f9c28", new Object[]{this, new Long(j)});
        }
        if (j == DX_PRICE_VIEW_PRICE) {
            return "";
        }
        return super.getDefaultValueForStringAttr(j);
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        kor.a("DXPriceViewWidgetNode", "onClone", "----");
        if (dXWidgetNode != null && (dXWidgetNode instanceof q86)) {
            super.onClone(dXWidgetNode, z);
            q86 q86Var = (q86) dXWidgetNode;
            this.f26574a = q86Var.f26574a;
            this.b = q86Var.b;
            this.c = q86Var.c;
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        setText(t());
        super.onMeasure(i, i2);
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d2)});
        } else if (j == DX_PRICE_VIEW_DECIMAL_SCALE) {
            float f = (float) d2;
            this.f26574a = f;
            if (f <= 0.0f) {
                this.f26574a = 0.625f;
            }
        } else if (j == DX_PRICE_VIEW_SYMBOL_SCALE) {
            float f2 = (float) d2;
            this.c = f2;
            if (f2 <= 0.0f) {
                this.c = 0.625f;
            }
        } else {
            super.onSetDoubleAttribute(j, d2);
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == DX_PRICE_VIEW_PRICE) {
            this.b = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    public final CharSequence t() {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("f5b094f6", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.b)) {
            return null;
        }
        SpannableString spannableString = new SpannableString(this.b);
        Matcher matcher = e.matcher(this.b);
        if (matcher.find()) {
            i = matcher.end();
        } else {
            i = -1;
        }
        Matcher matcher2 = d.matcher(this.b);
        if (matcher2.find()) {
            i2 = matcher2.start();
        } else {
            i2 = 0;
        }
        int length = this.b.length();
        if (i2 != 0) {
            spannableString.setSpan(new RelativeSizeSpan(this.c), 0, i2, 33);
        }
        if (i >= 0 && i != length) {
            spannableString.setSpan(new RelativeSizeSpan(this.f26574a), i, length, 33);
        }
        return spannableString;
    }
}
