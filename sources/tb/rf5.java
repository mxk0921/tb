package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.style.ClickableSpan;
import android.text.style.DynamicDrawableSpan;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXImageWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import java.util.LinkedList;
import java.util.List;
import tb.leo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class rf5 extends DXImageWidgetNode implements leo.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXCARTIMAGESPAN_CARTIMAGESPAN = 2909787473734622988L;
    public static final long DXCARTIMAGESPAN_IMAGEURL = 3520785955321526846L;
    public static final long DXCARTTEXTSPAN_EVENT_TAP = 18903999933159L;

    /* renamed from: a  reason: collision with root package name */
    public String f27332a;
    public boolean b;
    public List<Object> c;
    public final ClickableSpan d = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements leo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.leo
        public List<Object> a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("44fdd928", new Object[]{this, new Boolean(z)});
            }
            if (rf5.t(rf5.this) == null || z) {
                rf5.u(rf5.this, new LinkedList());
                rf5 rf5Var = rf5.this;
                c cVar = new c(rf5Var.getLayoutWidth(), rf5.this.getLayoutHeight(), rf5.this.getMarginLeft(), rf5.this.getMarginRight());
                rf5.t(rf5.this).add(cVar);
                cVar.c(rf5.v(rf5.this));
                if (rf5.w(rf5.this)) {
                    rf5.x(rf5.this);
                }
            }
            return rf5.t(rf5.this);
        }

        @Override // tb.leo
        public String getText() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("97297536", new Object[]{this});
            }
            return "[image]";
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b extends ClickableSpan {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/widget/richtext/DXCartImageSpanWidgetNode$2");
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                rf5.this.postEvent(new DXEvent(18903999933159L));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c extends DynamicDrawableSpan {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f27335a;
        public int b;
        public Drawable c;
        public Drawable d;
        public final int e;
        public final int f;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements s8d<FailPhenixEvent> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a(c cVar) {
            }

            /* renamed from: a */
            public boolean onHappen(FailPhenixEvent failPhenixEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
                }
                return false;
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class b implements s8d<SuccPhenixEvent> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b() {
            }

            /* renamed from: a */
            public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
                }
                BitmapDrawable drawable = succPhenixEvent.getDrawable();
                if (drawable != null) {
                    c.this.b(drawable.getBitmap(), drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                    DXWidgetNode parentWidget = rf5.this.getParentWidget();
                    if (parentWidget != null) {
                        parentWidget.requestLayout();
                    }
                }
                return true;
            }
        }

        static {
            t2o.a(478151114);
        }

        public c(int i, int i2, int i3, int i4) {
            this.f27335a = i;
            this.b = i2;
            this.e = i3;
            this.f = i4;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/widget/richtext/DXCartImageSpanWidgetNode$CenterAlignImageSpan");
        }

        public final Drawable a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Drawable) ipChange.ipc$dispatch("c69fe3ea", new Object[]{this});
            }
            if (this.c == null) {
                this.c = new ShapeDrawable();
            }
            return this.c;
        }

        public void b(Bitmap bitmap, float f, float f2) {
            boolean z;
            boolean z2 = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("227a5e0e", new Object[]{this, bitmap, new Float(f), new Float(f2)});
                return;
            }
            if (this.f27335a == -2) {
                this.f27335a = (int) f;
                z = true;
            } else {
                z = false;
            }
            if (this.b == -2) {
                this.b = (int) f2;
            } else {
                z2 = false;
            }
            if (z) {
                this.f27335a = (int) ((f / f2) * this.b);
            }
            if (z2) {
                this.b = (int) ((f2 / f) * this.f27335a);
            }
            if (z && z2) {
                this.f27335a = (int) f;
                this.b = (int) f2;
            }
            BitmapDrawable bitmapDrawable = new BitmapDrawable(Bitmap.createScaledBitmap(bitmap, this.f27335a, this.b, false));
            this.d = bitmapDrawable;
            bitmapDrawable.setBounds(0, 0, this.f27335a, this.b);
        }

        public void c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c46c661b", new Object[]{this, str});
            } else {
                s0m.B().N0(rf5.this.getDXRuntimeContext().h()).T(str).succListener(new b()).failListener(new a(this)).fetch();
            }
        }

        @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
        public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e5acc076", new Object[]{this, canvas, charSequence, new Integer(i), new Integer(i2), new Float(f), new Integer(i3), new Integer(i4), new Integer(i5), paint});
                return;
            }
            try {
                Drawable drawable = getDrawable();
                canvas.save();
                canvas.translate(f + this.e, (((i5 - i3) - drawable.getBounds().bottom) / 2) + i3);
                drawable.draw(canvas);
                canvas.restore();
            } catch (Exception unused) {
            }
        }

        @Override // android.text.style.DynamicDrawableSpan
        public Drawable getDrawable() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Drawable) ipChange.ipc$dispatch("bbe7333f", new Object[]{this});
            }
            Drawable drawable = this.d;
            if (drawable == null) {
                return a();
            }
            this.c = null;
            return drawable;
        }

        @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
        public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("46263898", new Object[]{this, paint, charSequence, new Integer(i), new Integer(i2), fontMetricsInt})).intValue();
            }
            return this.f27335a + this.e + this.f;
        }
    }

    static {
        t2o.a(478151110);
        t2o.a(478151125);
    }

    public static /* synthetic */ Object ipc$super(rf5 rf5Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1814733277:
                return super.onCreateView((Context) objArr[0]);
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
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
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/widget/richtext/DXCartImageSpanWidgetNode");
        }
    }

    public static /* synthetic */ List t(rf5 rf5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3cb81324", new Object[]{rf5Var});
        }
        return rf5Var.c;
    }

    public static /* synthetic */ List u(rf5 rf5Var, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("80a57dd1", new Object[]{rf5Var, list});
        }
        rf5Var.c = list;
        return list;
    }

    public static /* synthetic */ String v(rf5 rf5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("106019c", new Object[]{rf5Var});
        }
        return rf5Var.f27332a;
    }

    public static /* synthetic */ boolean w(rf5 rf5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b8e1649", new Object[]{rf5Var})).booleanValue();
        }
        return rf5Var.b;
    }

    public static /* synthetic */ void x(rf5 rf5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf3c4106", new Object[]{rf5Var});
        } else {
            rf5Var.y();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new rf5();
    }

    @Override // tb.leo.a
    public leo l(neo neoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (leo) ipChange.ipc$dispatch("8e2e5be", new Object[]{this, neoVar});
        }
        return new a();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
            return;
        }
        super.onBindEvent(context, view, j);
        if (j == 18903999933159L) {
            this.b = true;
            y();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode != null && (dXWidgetNode instanceof rf5)) {
            super.onClone(dXWidgetNode, z);
            this.f27332a = ((rf5) dXWidgetNode).f27332a;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return super.onCreateView(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        } else {
            super.onRenderView(context, view);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == 3520785955321526846L) {
            this.f27332a = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    public final void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("790d6d58", new Object[]{this});
            return;
        }
        List<Object> list = this.c;
        if (list != null && !list.contains(this.d)) {
            this.c.add(this.d);
        }
    }
}
