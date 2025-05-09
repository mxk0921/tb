package tb;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.Layout;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ReplacementSpan;
import android.text.style.StyleSpan;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.LinkedList;
import java.util.List;
import tb.leo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class yf5 extends DXWidgetNode implements leo.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXCARTTEXTSPAN_CARTTEXTSPAN = 2262739378954091981L;
    public static final long DXCARTTEXTSPAN_EVENT_TAP = 18903999933159L;
    public static final long DXCARTTEXTSPAN_ISBOLD = 9423384817756195L;
    public static final long DXCARTTEXTSPAN_TEXT = 38178040921L;
    public static final long DXCARTTEXTSPAN_TEXTCOLOR = 5737767606580872653L;
    public static final long DXCARTTEXTSPAN_TEXTSIZE = 6751005219504497256L;

    /* renamed from: a  reason: collision with root package name */
    public boolean f32038a;
    public boolean e;
    public List<Object> f;
    public neo g;
    public String b = "";
    public int c = 16732160;
    public int d = 13;
    public final ClickableSpan h = new b();

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
            if (yf5.u(yf5.this) == null || z) {
                yf5.v(yf5.this, new LinkedList());
                if (yf5.w(yf5.this) > 0) {
                    yf5.u(yf5.this).add(new AbsoluteSizeSpan(yf5.w(yf5.this), true));
                }
                if (yf5.x(yf5.this) != 0) {
                    yf5.u(yf5.this).add(new ForegroundColorSpan(yf5.x(yf5.this)));
                }
                if (yf5.this.getBorderWidth() > 0) {
                    yf5 yf5Var = yf5.this;
                    c cVar = new c(yf5.x(yf5Var), yf5.this.getBorderColor(), yf5.w(yf5.this), yf5.this.getBorderWidth(), yf5.this.getCornerRadius());
                    cVar.a(yf5.this.getPaddingLeft());
                    cVar.b(yf5.this.getPaddingRight());
                    yf5.u(yf5.this).add(cVar);
                }
                if (yf5.y(yf5.this)) {
                    yf5.u(yf5.this).add(new StyleSpan(1));
                }
                if (yf5.z(yf5.this)) {
                    yf5.A(yf5.this);
                }
            }
            return yf5.u(yf5.this);
        }

        @Override // tb.leo
        public String getText() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("97297536", new Object[]{this});
            }
            return yf5.t(yf5.this);
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
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/widget/richtext/DXCartTextSpanWidgetNode$2");
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                yf5.this.postEvent(new DXEvent(18903999933159L));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c extends ReplacementSpan {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f32041a;
        public final int b;
        public final float c;
        public final ShapeDrawable d;
        public final int e;
        public int f;
        public int g;

        static {
            t2o.a(478151123);
        }

        public c(int i, int i2, float f, int i3, int i4) {
            this.e = i3;
            this.b = i;
            this.c = f;
            float f2 = i4;
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f2, f2, f2, f2, f2, f2, f2, f2}, null, null));
            this.d = shapeDrawable;
            shapeDrawable.getPaint().setColor(i2);
            shapeDrawable.getPaint().setStyle(Paint.Style.STROKE);
            shapeDrawable.getPaint().setStrokeWidth(i3);
            shapeDrawable.getPaint().setAntiAlias(true);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/widget/richtext/DXCartTextSpanWidgetNode$FrameSpan");
        }

        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b5b9af26", new Object[]{this, new Integer(i)});
            } else {
                this.f = i;
            }
        }

        public void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7116396f", new Object[]{this, new Integer(i)});
            } else {
                this.g = i;
            }
        }

        @Override // android.text.style.ReplacementSpan
        public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
            int i6 = i5;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e5acc076", new Object[]{this, canvas, charSequence, new Integer(i), new Integer(i2), new Float(f), new Integer(i3), new Integer(i4), new Integer(i6), paint});
                return;
            }
            int color = paint.getColor();
            float textSize = paint.getTextSize();
            paint.setTextSize(this.c);
            paint.setColor(this.b);
            canvas.save();
            Layout c = yf5.B(yf5.this).c();
            if (c != null) {
                if (c.getLineForVertical(i3) + 1 < c.getLineCount()) {
                    i6 = (int) (i6 - yf5.B(yf5.this).d());
                }
                int i7 = (int) f;
                int i8 = this.e;
                this.d.setBounds(new Rect(i7 + i8, i3 + i8, i7 + this.f32041a, i6 - i8));
                this.d.draw(canvas);
            }
            int i9 = this.f;
            if (i9 != 0) {
                canvas.translate(i9, 0.0f);
            }
            canvas.drawText(charSequence, i, i2, f, i4, paint);
            canvas.restore();
            paint.setColor(color);
            paint.setTextSize(textSize);
        }

        @Override // android.text.style.ReplacementSpan
        public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("46263898", new Object[]{this, paint, charSequence, new Integer(i), new Integer(i2), fontMetricsInt})).intValue();
            }
            int measureText = ((int) paint.measureText(charSequence, i, i2)) + this.f + this.g;
            this.f32041a = measureText;
            return measureText;
        }
    }

    static {
        t2o.a(478151119);
        t2o.a(478151125);
    }

    public static /* synthetic */ void A(yf5 yf5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51b9125f", new Object[]{yf5Var});
        } else {
            yf5Var.C();
        }
    }

    public static /* synthetic */ neo B(yf5 yf5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (neo) ipChange.ipc$dispatch("11d509bc", new Object[]{yf5Var});
        }
        return yf5Var.g;
    }

    public static /* synthetic */ Object ipc$super(yf5 yf5Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1814733277:
                return super.onCreateView((Context) objArr[0]);
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/widget/richtext/DXCartTextSpanWidgetNode");
        }
    }

    public static /* synthetic */ String t(yf5 yf5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("faad79b", new Object[]{yf5Var});
        }
        return yf5Var.b;
    }

    public static /* synthetic */ List u(yf5 yf5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8f40fd03", new Object[]{yf5Var});
        }
        return yf5Var.f;
    }

    public static /* synthetic */ List v(yf5 yf5Var, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d632b674", new Object[]{yf5Var, list});
        }
        yf5Var.f = list;
        return list;
    }

    public static /* synthetic */ int w(yf5 yf5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e7f52dd6", new Object[]{yf5Var})).intValue();
        }
        return yf5Var.d;
    }

    public static /* synthetic */ int x(yf5 yf5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26626f5", new Object[]{yf5Var})).intValue();
        }
        return yf5Var.c;
    }

    public static /* synthetic */ boolean y(yf5 yf5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1cd72025", new Object[]{yf5Var})).booleanValue();
        }
        return yf5Var.f32038a;
    }

    public static /* synthetic */ boolean z(yf5 yf5Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37481944", new Object[]{yf5Var})).booleanValue();
        }
        return yf5Var.e;
    }

    public final void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("790d6d58", new Object[]{this});
            return;
        }
        List<Object> list = this.f;
        if (list != null && !list.contains(this.h)) {
            this.f.add(this.h);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new yf5();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == 5737767606580872653L) {
            return 16732160;
        }
        if (j == 6751005219504497256L) {
            return 13;
        }
        return super.getDefaultValueForIntAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public String getDefaultValueForStringAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1f9c28", new Object[]{this, new Long(j)});
        }
        if (j == 38178040921L) {
            return "";
        }
        return super.getDefaultValueForStringAttr(j);
    }

    @Override // tb.leo.a
    public leo l(neo neoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (leo) ipChange.ipc$dispatch("8e2e5be", new Object[]{this, neoVar});
        }
        this.g = neoVar;
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
            this.e = true;
            C();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode != null && (dXWidgetNode instanceof yf5)) {
            super.onClone(dXWidgetNode, z);
            yf5 yf5Var = (yf5) dXWidgetNode;
            this.f32038a = yf5Var.f32038a;
            this.b = yf5Var.b;
            this.c = yf5Var.c;
            this.d = yf5Var.d;
            this.e = yf5Var.e;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return super.onCreateView(context);
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
        } else {
            super.onRenderView(context, view);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == 9423384817756195L) {
            if (i == 0) {
                z = false;
            }
            this.f32038a = z;
        } else if (j == 5737767606580872653L) {
            this.c = i;
        } else if (j == 6751005219504497256L) {
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
        } else if (j == 38178040921L) {
            this.b = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }
}
