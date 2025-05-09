package tb;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.transfer.widget.xrich.XRichTextViewV3;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.ArrayList;
import tb.lx7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class vmx extends gi6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final long DX_EVENT_ID;
    public static final long c;
    public static final long d = 4951885508200836195L;
    public static final long e = -1442719518478951523L;
    public static final long f = 9189277493022864799L;

    /* renamed from: a  reason: collision with root package name */
    public String f30114a = null;
    public String b = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements lx7.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ XRichTextViewV3 f30115a;

        public a(vmx vmxVar, XRichTextViewV3 xRichTextViewV3) {
            this.f30115a = xRichTextViewV3;
        }

        @Override // tb.lx7.b
        public void a(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("766e21b6", new Object[]{this, drawable});
            } else {
                this.f30115a.setIcon(drawable);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(912262718);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new vmx();
        }
    }

    static {
        t2o.a(912262716);
        long a2 = k06.a("XRichText");
        DX_EVENT_ID = a2;
        c = a2;
    }

    public vmx() {
        mr7.a(3.0f);
        mr7.a(1.0f);
    }

    public static /* synthetic */ Object ipc$super(vmx vmxVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
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
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 1184746505:
                return super.getDefaultValueForAttr(((Number) objArr[0]).longValue());
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/transfer/widget/XRichTextWidgetNode");
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new vmx();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public Object getDefaultValueForAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("469dcc09", new Object[]{this, new Long(j)});
        }
        return super.getDefaultValueForAttr(j);
    }

    @Override // tb.gi6
    public void onBeforeMeasure(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d451fa5d", new Object[]{this, textView});
            return;
        }
        super.onBeforeMeasure(textView);
        w(textView);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
        } else {
            super.onBindEvent(context, view, j);
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
        if (dXWidgetNode != null && (dXWidgetNode instanceof vmx)) {
            vmx vmxVar = (vmx) dXWidgetNode;
            this.f30114a = vmxVar.f30114a;
            this.b = vmxVar.b;
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return new XRichTextViewV3(context);
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
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
        if (view != null || !(view instanceof XRichTextViewV3)) {
            w((XRichTextViewV3) view);
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d2)});
        } else {
            super.onSetDoubleAttribute(j, d2);
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else {
            super.onSetIntAttribute(j, i);
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
        if (f == j) {
            this.b = str;
        }
        if (d == j) {
            this.f30114a = str;
        }
        if (e == j) {
            mr7.a(Integer.parseInt(str));
        }
    }

    public final int t(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("24b6e060", new Object[]{this, str, new Integer(i), str2})).intValue();
        }
        int indexOf = str.indexOf(str2, i + 1);
        if (-1 != indexOf) {
            return indexOf;
        }
        return -1;
    }

    public final SpannableStringBuilder u(SpannableStringBuilder spannableStringBuilder, String str, String str2, int i) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableStringBuilder) ipChange.ipc$dispatch("5443bdd0", new Object[]{this, spannableStringBuilder, str, str2, new Integer(i)});
        }
        new ArrayList();
        do {
            indexOf = spannableStringBuilder.toString().indexOf(str, 0);
            if (indexOf != -1) {
                int t = t(spannableStringBuilder.toString(), indexOf, str2);
                if (-1 == t) {
                    break;
                }
                spannableStringBuilder = v(spannableStringBuilder, indexOf, t, i).delete(t, t + 1).delete(indexOf, indexOf + 1);
                continue;
            }
        } while (indexOf != -1);
        return spannableStringBuilder;
    }

    public final SpannableStringBuilder v(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableStringBuilder) ipChange.ipc$dispatch("34b0020c", new Object[]{this, spannableStringBuilder, new Integer(i), new Integer(i2), new Integer(i3)});
        }
        if (spannableStringBuilder != null) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i, i2, 33);
        }
        return spannableStringBuilder;
    }

    public final void w(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6db4d9c4", new Object[]{this, textView});
        } else if (textView instanceof XRichTextViewV3) {
            XRichTextViewV3 xRichTextViewV3 = (XRichTextViewV3) textView;
            y(xRichTextViewV3, this.b);
            z(xRichTextViewV3, getText().toString());
            x(xRichTextViewV3, this.f30114a);
        }
    }

    public void x(XRichTextViewV3 xRichTextViewV3, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdf6b828", new Object[]{this, xRichTextViewV3, str});
        } else if (xRichTextViewV3 != null) {
            xRichTextViewV3.setIcon(null);
            if (!TextUtils.isEmpty(str)) {
                lx7.c(str, tq4.d(xRichTextViewV3), new a(this, xRichTextViewV3), null);
            }
        }
    }

    public void y(TextView textView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5309b648", new Object[]{this, textView, str});
        } else if (textView != null && (textView instanceof XRichTextViewV3) && !TextUtils.isEmpty(str)) {
            ((XRichTextViewV3) textView).setSpanColor(str);
            z(textView, textView.getText().toString());
        }
    }

    public void z(TextView textView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9914798", new Object[]{this, textView, str});
        } else if (textView == null || !(textView instanceof XRichTextViewV3) || TextUtils.isEmpty(str)) {
            textView.setText(str);
        } else {
            XRichTextViewV3 xRichTextViewV3 = (XRichTextViewV3) textView;
            xRichTextViewV3.setSpannableStringBuilder(u(new SpannableStringBuilder(str), "#", "@", xRichTextViewV3.getSpanColorInt()));
        }
    }

    public vmx(Context context) {
        mr7.b(context, 3.0f);
        mr7.b(context, 1.0f);
    }
}
