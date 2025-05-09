package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.view.DXNativeTextView;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class je5 extends gi6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public DXNativeTextView f21952a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(444597274);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new je5((Context) obj);
        }
    }

    static {
        t2o.a(444597273);
    }

    public je5(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(je5 je5Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -740240234) {
            super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode == 1115049375) {
            super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
            return null;
        } else if (hashCode == 2119721610) {
            super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/dinamicx/widget/DXButterTextWidgetNode");
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new je5((Context) obj);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void layoutWithButter(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("296ce2f7", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            this.f21952a.layout(i, i2, i3, i4);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void measureWithButter(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d7bfe8b", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        if (!TextUtils.isEmpty(getText()) || getLayoutHeight() != -2) {
            this.f21952a.measure(i, i2);
        } else {
            this.f21952a.measure(i, View.MeasureSpec.makeMeasureSpec(0, 1073741824));
        }
        setMeasuredDimension(this.f21952a.getMeasuredWidthAndState(), this.f21952a.getMeasuredHeightAndState());
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else {
            super.onClone(dXWidgetNode, z);
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        DXNativeTextView dXNativeTextView = new DXNativeTextView(context);
        dXNativeTextView.setTextColor(getTextColor());
        dXNativeTextView.setTextSize(0, getTextSize());
        setNativeTextStyle(dXNativeTextView, getTextStyle());
        setNativeMaxLines(dXNativeTextView, getMaxLines());
        setNativeTextGravity(dXNativeTextView, getTextGravity());
        setNativeTextIncludeFontPadding(dXNativeTextView, true);
        this.f21952a = dXNativeTextView;
        return dXNativeTextView;
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        DXRuntimeContext dXRuntimeContext;
        DXEngineConfig c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        if (!TextUtils.isEmpty(getFont())) {
            setNativeTextFont(this.f21952a, getFont(), getTextStyle());
        } else if (getTextStyle() != -1) {
            setNativeTextStyle(this.f21952a, getTextStyle());
        }
        setNativeTextFlags(this.f21952a, getTextFlags());
        if (isEnableTextSizeStrategy() && (dXRuntimeContext = getDXRuntimeContext()) != null && (c = dXRuntimeContext.s().c()) != null && c.E()) {
            setTextSize(vu5.b(dXRuntimeContext, getTextSize()));
        }
        this.f21952a.setTextSize(0, getTextSize());
        setAutoSizeTextTypeUniformWithConfiguration(this.f21952a, isAutoSizeMinTextSize(), isAutoSizeMaxTextSize());
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (38178040921L == j) {
            setText(str);
            setNativeText(this.f21952a, getText());
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (5737767606580872653L == j) {
            setTextColor(i);
            this.f21952a.setTextColor(tryFetchDarkModeColor("textColor", 0, i));
        } else if (-1564827143683948874L == j) {
            setTextGravity(i);
            setNativeTextGravity(this.f21952a, i);
        } else if (4685059187929305417L == j) {
            setMaxLines(i);
            this.f21952a.setMaxLines(getMaxLines());
        } else if (eb6.DXRICHTEXT_MAXWIDTH == j) {
            setMaxWidth(i);
            this.f21952a.setMaxWidth(getMaxWidth());
        } else if (1650157837879951391L == j) {
            setLineBreakMode(i);
            setNativeEllipsize(this.f21952a, getLineBreakMode());
        } else if (j == 1046654090308105836L) {
            if (i == 0) {
                z = false;
            }
            setIncludeFontPadding_Android(z);
            setNativeTextIncludeFontPadding(this.f21952a, isIncludeFontPadding_Android());
        } else {
            super.onSetIntAttribute(j, i);
        }
    }
}
