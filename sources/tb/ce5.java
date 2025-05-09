package tb;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00062\u00020\u0001:\u0001\u0007B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Ltb/ce5;", "Ltb/je5;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "a", "order-core_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class ce5 extends je5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static final long l = q86.DX_PRICE_VIEW;
    public View b;
    public final Pattern c;
    public final Pattern d;
    public final long e = q86.DX_PRICE_VIEW_DECIMAL_SCALE;
    public final long f = q86.DX_PRICE_VIEW_PRICE;
    public final long g = q86.DX_PRICE_VIEW_SYMBOL_SCALE;
    public final float h = 0.625f;
    public float i = 0.625f;
    public String j = "";
    public float k = 0.625f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(614465700);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(614465698);
    }

    public ce5(Context context) {
        super(context);
        Pattern compile = Pattern.compile("[0-9]");
        ckf.f(compile, "Pattern.compile(\"[0-9]\")");
        this.c = compile;
        Pattern compile2 = Pattern.compile("[.]");
        ckf.f(compile2, "Pattern.compile(\"[.]\")");
        this.d = compile2;
    }

    public static /* synthetic */ Object ipc$super(ce5 ce5Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1806543962:
                return new Double(super.getDefaultValueForDoubleAttr(((Number) objArr[0]).longValue()));
            case -638169079:
                super.onSetDoubleAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).doubleValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 253729832:
                return super.getDefaultValueForStringAttr(((Number) objArr[0]).longValue());
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 1233980628:
                return super.butterClone((DXRuntimeContext) objArr[0]);
            case 1568407179:
                super.measureWithButter(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/dinamicX/view/DXButterPriceWidgetNode");
        }
    }

    public static final long u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3004856b", new Object[0])).longValue();
        }
        return l;
    }

    @Override // tb.je5, tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new ce5((Context) obj);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public DXWidgetNode butterClone(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("498d0cd4", new Object[]{this, dXRuntimeContext});
        }
        if (!((dXRuntimeContext != null ? dXRuntimeContext.W() : null) instanceof ce5)) {
            DXWidgetNode butterClone = super.butterClone(dXRuntimeContext);
            ckf.f(butterClone, "super.butterClone(runtimeContext)");
            return butterClone;
        }
        DXWidgetNode W = dXRuntimeContext.W();
        if (W != null) {
            ce5 ce5Var = (ce5) W;
            this.i = ce5Var.i;
            this.j = ce5Var.j;
            this.k = ce5Var.k;
            DXWidgetNode butterClone2 = super.butterClone(dXRuntimeContext);
            ckf.f(butterClone2, "super.butterClone(runtimeContext)");
            return butterClone2;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.order.core.dinamicX.view.DXButterPriceWidgetNode");
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public double getDefaultValueForDoubleAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("945253a6", new Object[]{this, new Long(j)})).doubleValue();
        }
        if (j == this.e) {
            return this.h;
        }
        if (j == this.g) {
            return this.h;
        }
        return super.getDefaultValueForDoubleAttr(j);
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public String getDefaultValueForStringAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1f9c28", new Object[]{this, new Long(j)});
        }
        if (j == this.f) {
            return "";
        }
        String defaultValueForStringAttr = super.getDefaultValueForStringAttr(j);
        ckf.f(defaultValueForStringAttr, "super.getDefaultValueForStringAttr(key)");
        return defaultValueForStringAttr;
    }

    @Override // tb.je5, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void measureWithButter(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d7bfe8b", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        setText(t());
        View view = this.b;
        if (view != null) {
            ((TextView) view).setText(getText());
            super.measureWithButter(i, i2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    @Override // tb.je5, tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        this.b = view;
        super.onRenderView(context, view);
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d)});
        } else if (j == this.e) {
            float f = (float) d;
            this.i = f;
            if (f <= 0) {
                this.i = this.h;
            }
        } else if (j == this.g) {
            float f2 = (float) d;
            this.k = f2;
            if (f2 <= 0) {
                this.k = this.h;
            }
        } else {
            super.onSetDoubleAttribute(j, d);
        }
    }

    @Override // tb.je5, tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
            return;
        }
        ckf.g(str, "value");
        if (j == this.f) {
            this.j = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    public final SpannableString t() {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableString) ipChange.ipc$dispatch("ab029bd4", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.j)) {
            return null;
        }
        SpannableString spannableString = new SpannableString(this.j);
        Matcher matcher = this.d.matcher(this.j);
        if (matcher.find()) {
            i = matcher.end();
        } else {
            i = -1;
        }
        Matcher matcher2 = this.c.matcher(this.j);
        if (matcher2.find()) {
            i2 = matcher2.start();
        } else {
            i2 = 0;
        }
        int length = this.j.length();
        if (i2 != 0) {
            spannableString.setSpan(new RelativeSizeSpan(this.k), 0, i2, 33);
        }
        if (i >= 0 && i != length) {
            spannableString.setSpan(new RelativeSizeSpan(this.i), i, length, 33);
        }
        return spannableString;
    }
}
