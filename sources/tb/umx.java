package tb;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.transfer.widget.coupon.XRichTextViewByCouponV3;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import tb.lx7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class umx extends gi6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final long DX_EVENT_ID;
    public static final long i;
    public static final long j = -6563447616862746523L;
    public static final long k = 6129867569828159030L;
    public static final long l = -552088275168974636L;
    public static final long m = -552088275168515870L;
    public static final long n = -485287024816320973L;
    public static final long o = 1114549396929390636L;
    public static final long p = -196800204739237802L;
    public static final long q = -8863296171374004228L;

    /* renamed from: a  reason: collision with root package name */
    public int f29503a = 0;
    public int b = 0;
    public int c = 0;
    public String d = "";
    public String e = "";
    public String f = "";
    public boolean g = false;
    public String h = pg1.ATOM_EXT_yellow;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements lx7.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ XRichTextViewByCouponV3 f29504a;

        public a(umx umxVar, XRichTextViewByCouponV3 xRichTextViewByCouponV3) {
            this.f29504a = xRichTextViewByCouponV3;
        }

        @Override // tb.lx7.b
        public void a(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("766e21b6", new Object[]{this, drawable});
            } else {
                this.f29504a.setTextBackground(drawable);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements lx7.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ XRichTextViewByCouponV3 f29505a;

        public b(umx umxVar, XRichTextViewByCouponV3 xRichTextViewByCouponV3) {
            this.f29505a = xRichTextViewByCouponV3;
        }

        @Override // tb.lx7.b
        public void a(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("766e21b6", new Object[]{this, drawable});
            } else {
                this.f29505a.setIcon(drawable);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(912262715);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new umx();
        }
    }

    static {
        t2o.a(912262712);
        long a2 = k06.a("XRichTextByCoupon");
        DX_EVENT_ID = a2;
        i = a2;
    }

    public umx() {
    }

    public static /* synthetic */ Object ipc$super(umx umxVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -732824995:
                super.onBeforeMeasure((TextView) objArr[0]);
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/transfer/widget/XRichTextViewByCouponWidgetNode");
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new umx();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public Object getDefaultValueForAttr(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("469dcc09", new Object[]{this, new Long(j2)});
        }
        if (q == j2) {
            return pg1.ATOM_EXT_yellow;
        }
        return super.getDefaultValueForAttr(j2);
    }

    @Override // tb.gi6
    public void onBeforeMeasure(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d451fa5d", new Object[]{this, textView});
            return;
        }
        super.onBeforeMeasure(textView);
        u(textView);
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (dXWidgetNode instanceof umx) {
            umx umxVar = (umx) dXWidgetNode;
            this.f29503a = umxVar.f29503a;
            this.b = umxVar.b;
            this.c = umxVar.c;
            this.e = umxVar.e;
            this.d = umxVar.d;
            this.f = umxVar.f;
            this.g = umxVar.g;
            this.h = umxVar.h;
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return new XRichTextViewByCouponV3(context);
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i2), new Integer(i3)});
        } else {
            super.onMeasure(i2, i3);
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
        if (view instanceof XRichTextViewByCouponV3) {
            u((XRichTextViewByCouponV3) view);
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j2, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j2), new Integer(i2)});
            return;
        }
        super.onSetIntAttribute(j2, i2);
        if (j == j2) {
            this.f29503a = i2;
        }
        if (l == j2) {
            this.b = i2;
        }
        if (m == j2) {
            this.c = i2;
        }
        if (p != j2) {
            return;
        }
        if (i2 == 1) {
            this.g = true;
        } else {
            this.g = false;
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
        if (k == j2) {
            this.d = str;
        }
        if (n == j2) {
            this.e = str;
        }
        if (o == j2) {
            this.f = str;
        }
        if (q == j2) {
            this.h = str;
        }
    }

    public void t(XRichTextViewByCouponV3 xRichTextViewByCouponV3, String str, String str2, String str3, int i2, int i3, int i4, boolean z, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9cca16f", new Object[]{this, xRichTextViewByCouponV3, str, str2, str3, new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z), str4});
        } else if (xRichTextViewByCouponV3 != null) {
            if (!TextUtils.isEmpty(str)) {
                xRichTextViewByCouponV3.setSeparator(str);
            }
            xRichTextViewByCouponV3.setXIconHeight(i2);
            xRichTextViewByCouponV3.setTextBgPaddingH(i3);
            xRichTextViewByCouponV3.setTextBgPaddingV(i4);
            xRichTextViewByCouponV3.setIcon(null);
            if (!TextUtils.isEmpty(str2)) {
                lx7.c(str2, tq4.d(xRichTextViewByCouponV3), new a(this, xRichTextViewByCouponV3), null);
            }
            if (!TextUtils.isEmpty(str3)) {
                lx7.c(str3, tq4.d(xRichTextViewByCouponV3), new b(this, xRichTextViewByCouponV3), null);
            }
        }
    }

    public final void u(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6db4d9c4", new Object[]{this, textView});
        } else if (textView instanceof XRichTextViewByCouponV3) {
            t((XRichTextViewByCouponV3) textView, this.e, this.f, this.d, this.f29503a, this.b, this.c, this.g, this.h);
        }
    }

    public umx(Context context) {
    }
}
