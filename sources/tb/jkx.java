package tb;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class jkx extends gi6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_MORDERNUMTEXTVIEW = 5695423697747060426L;
    public static final long DX_MORDERNUMTEXTVIEW_MFONTSIZE = -72610990342354008L;
    public static final long DX_MORDERNUMTEXTVIEW_MTEXT = 18601549934583L;

    /* renamed from: a  reason: collision with root package name */
    public double f22047a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(745538117);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            s32.c().i("XMOrderNumTextViewWidgetNode.build");
            return new jkx();
        }
    }

    static {
        t2o.a(745538116);
    }

    public static /* synthetic */ Object ipc$super(jkx jkxVar, String str, Object... objArr) {
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
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/ultron/dinamicX/widget/XMOrderNumTextViewWidgetNode");
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        s32.c().i("XMOrderNumTextViewWidgetNode.build1");
        return new jkx();
    }

    @Override // tb.gi6
    public void onBeforeMeasure(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d451fa5d", new Object[]{this, textView});
            return;
        }
        super.onBeforeMeasure(textView);
        textView.setTextSize(0, (float) this.f22047a);
        textView.setText(getText());
        textView.setMinWidth(pb6.o(textView.getContext(), "18ap", 18));
        textView.setGravity(17);
        textView.setBackgroundDrawable(t(textView, getDXRuntimeContext().h()));
        textView.setPadding(pb6.o(textView.getContext(), "5ap", 5), 0, owo.e(textView.getContext(), "5ap", 5), 0);
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (dXWidgetNode instanceof jkx) {
            this.f22047a = ((jkx) dXWidgetNode).f22047a;
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
        if (view != null && (view instanceof TextView)) {
            TextView textView = (TextView) view;
            textView.setText(getText());
            textView.setTextSize(0, (float) this.f22047a);
            textView.setTextColor(context.getResources().getColor(R.color.mytaobao_orange_color));
            textView.setMinWidth(pb6.o(textView.getContext(), "18ap", 18));
            textView.setPadding(pb6.o(textView.getContext(), "5ap", 5), 0, pb6.o(textView.getContext(), "5ap", 5), 0);
            textView.setGravity(17);
            if (getVisibility() == 0) {
                textView.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
            textView.setTextAlignment(4);
            textView.setBackgroundDrawable(t(textView, getDXRuntimeContext().h()));
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DX_MORDERNUMTEXTVIEW_MFONTSIZE) {
            this.f22047a = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == DX_MORDERNUMTEXTVIEW_MTEXT) {
            if (TextUtils.isEmpty(str) || tak.a(str) <= 0) {
                setVisibility(2);
                return;
            }
            setText(u(str));
            setVisibility(0);
        } else if (j != 38178040921L) {
            super.onSetStringAttribute(j, str);
        }
    }

    public final GradientDrawable t(TextView textView, Context context) {
        GradientDrawable gradientDrawable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GradientDrawable) ipChange.ipc$dispatch("3548b471", new Object[]{this, textView, context});
        }
        Drawable background = textView.getBackground();
        if (background == null || !(background instanceof GradientDrawable)) {
            gradientDrawable = new GradientDrawable();
        } else {
            gradientDrawable = (GradientDrawable) background;
        }
        gradientDrawable.setCornerRadius(owo.e(context, String.valueOf(8.0d) + "ap", 8));
        gradientDrawable.setStroke(owo.b(context, 1.5f), context.getResources().getColor(R.color.mytaobao_orange_color));
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(context.getResources().getColor(R.color.white));
        return gradientDrawable;
    }

    public final String u(String str) {
        int b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1ee523a1", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || (b = tak.b(str, 0)) <= 0) {
            return "";
        }
        if (b > 99) {
            return "99+";
        }
        return b + "";
    }
}
