package tb;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.alibaba.triver.triver_shop.extension.dianmicX.AutoScrollTextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ic6 extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final b Companion = new b(null);
    public static final long DXSHOPAUTOSCROLLTEXTVIEW_ISTEXTBOLD = -9084989998710340852L;
    public static final long DXSHOPAUTOSCROLLTEXTVIEW_SCROLLSPEED = -3216884856980908405L;
    public static final long DXSHOPAUTOSCROLLTEXTVIEW_SHOPAUTOSCROLLTEXTVIEW = -2560103441260165640L;
    public static final long DXSHOPAUTOSCROLLTEXTVIEW_TEXT = 38178040921L;
    public static final long DXSHOPAUTOSCROLLTEXTVIEW_TEXTCOLOR = 5737767606580872653L;
    public static final long DXSHOPAUTOSCROLLTEXTVIEW_TEXTSIZE = 6751005219504497256L;

    /* renamed from: a  reason: collision with root package name */
    public int f21234a;
    public String c;
    public int e;
    public double b = 10.0d;
    public int d = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(766509320);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new ic6();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b {
        static {
            t2o.a(766509321);
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }

        public b() {
        }
    }

    static {
        t2o.a(766509319);
    }

    public static /* synthetic */ Object ipc$super(ic6 ic6Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -638169079:
                super.onSetDoubleAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).doubleValue());
                return null;
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/extension/dianmicX/DXShopAutoScrollTextViewWidgetNode");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new ic6();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
            return;
        }
        ckf.g(context, "context");
        super.onBindEvent(context, view, j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode != null && (dXWidgetNode instanceof ic6)) {
            super.onClone(dXWidgetNode, z);
            ic6 ic6Var = (ic6) dXWidgetNode;
            this.f21234a = ic6Var.f21234a;
            this.b = ic6Var.b;
            this.c = ic6Var.c;
            this.d = ic6Var.d;
            this.e = ic6Var.e;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        ckf.g(context, "context");
        return new AutoScrollTextView(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        ckf.g(context, "context");
        if (view instanceof AutoScrollTextView) {
            t((AutoScrollTextView) view);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d)});
        } else if (j == -3216884856980908405L) {
            this.b = d;
        } else {
            super.onSetDoubleAttribute(j, d);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXSHOPAUTOSCROLLTEXTVIEW_ISTEXTBOLD) {
            this.f21234a = i;
        } else if (j == 6751005219504497256L) {
            this.e = i;
        } else if (j == 5737767606580872653L) {
            this.d = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
            return;
        }
        ckf.g(str, "attr");
        if (j == 38178040921L) {
            this.c = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    public final void t(AutoScrollTextView autoScrollTextView) {
        Typeface typeface;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b98d9ef", new Object[]{this, autoScrollTextView});
            return;
        }
        autoScrollTextView.getTextView().setText(this.c);
        autoScrollTextView.getTextView().setTextSize(0, this.e);
        TextView textView = autoScrollTextView.getTextView();
        if (this.f21234a == 1) {
            typeface = Typeface.DEFAULT_BOLD;
        } else {
            typeface = Typeface.DEFAULT;
        }
        textView.setTypeface(typeface);
        autoScrollTextView.getTextView().setTextColor(this.d);
        autoScrollTextView.setScrollTime((long) (this.b * 1000));
        autoScrollTextView.startScroll();
    }
}
