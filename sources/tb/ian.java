package tb;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.RRichTextView;
import tb.jx7;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ian extends gi6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_DETAIL_RICHTEXT_ICON_URL = 4951885508200836195L;
    public static final long DX_DETAIL_RICHTEXT_LINE_SPACE = -1442719518478951523L;
    public static final long DX_DETAIL_RRICHTEXT_ASPECTRATIO = 7594222789952419722L;
    public static final long VIEW_IDENTITY = 4851157142455218566L;

    /* renamed from: a  reason: collision with root package name */
    public int f21193a = 9;
    public String b = null;
    public double c = -1.0d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements jx7.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f21194a;
        public final /* synthetic */ RRichTextView b;

        public a(String str, RRichTextView rRichTextView) {
            this.f21194a = str;
            this.b = rRichTextView;
        }

        @Override // tb.jx7.b
        public void a(Drawable drawable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("766e21b6", new Object[]{this, drawable});
            } else if (TextUtils.equals(this.f21194a, ian.this.getText())) {
                this.b.setIconToText(drawable);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(486539491);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new ian();
        }
    }

    static {
        t2o.a(486539489);
    }

    public static /* synthetic */ Object ipc$super(ian ianVar, String str, Object... objArr) {
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
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/widgetnode/RRichTextWidgetNode");
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new ian();
    }

    @Override // tb.gi6
    public void onBeforeMeasure(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d451fa5d", new Object[]{this, textView});
            return;
        }
        super.onBeforeMeasure(textView);
        t(textView);
        textView.setLineSpacing(this.f21193a, 1.0f);
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (dXWidgetNode instanceof ian) {
            ian ianVar = (ian) dXWidgetNode;
            this.b = ianVar.b;
            this.f21193a = ianVar.f21193a;
            this.c = ianVar.c;
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return new RRichTextView(context);
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        u(view);
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d)});
        } else if (j == 7594222789952419722L) {
            this.c = d;
        } else {
            super.onSetDoubleAttribute(j, d);
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
        if (4951885508200836195L == j) {
            this.b = str;
        }
        if (-1442719518478951523L == j) {
            try {
                this.f21193a = Integer.parseInt(str);
            } catch (Exception unused) {
            }
        }
    }

    public final void t(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34c55ae6", new Object[]{this, textView});
        } else if (this.c > vu3.b.GEO_NOT_SUPPORT && !TextUtils.isEmpty(this.b)) {
            float max = Math.max(textView.getPaint().getTextSize(), 1.0f);
            ShapeDrawable shapeDrawable = new ShapeDrawable();
            shapeDrawable.setBounds(0, 0, (int) (max * this.c), (int) max);
            textView.setText(RRichTextView.insertDrawableToSsb(shapeDrawable, new SpannableStringBuilder(textView.getText())));
        }
    }

    public final void u(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d271cc52", new Object[]{this, view});
        } else if (view instanceof RRichTextView) {
            RRichTextView rRichTextView = (RRichTextView) view;
            boolean a2 = mve.a("disableNewRichTextAutomaticLine", false);
            boolean z = true ^ a2;
            if (!a2) {
                rRichTextView.resetAutoLayoutFlag();
            }
            v(rRichTextView, this.b, getText().toString(), z);
            w(rRichTextView, this.f21193a);
        }
    }

    public void v(RRichTextView rRichTextView, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a437ecf", new Object[]{this, rRichTextView, str, str2, new Boolean(z)});
        } else if (rRichTextView != null) {
            rRichTextView.setText(str2);
            if (!TextUtils.isEmpty(str)) {
                jx7.b(str, rRichTextView.getContext(), new a(str2, rRichTextView), null);
            } else if (z) {
                rRichTextView.setIconToText(null);
            }
        }
    }

    public void w(TextView textView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d23d636", new Object[]{this, textView, new Integer(i)});
        } else if (textView instanceof RRichTextView) {
            ((RRichTextView) textView).setLineSpace(i);
        }
    }
}
