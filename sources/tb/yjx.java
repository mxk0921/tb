package tb;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.transfer.widget.adaptive.XAdaptiveTextViewV3;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class yjx extends gi6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_ID;
    public static final long DX_XADAPTIVETEXTVIEW_XELLIPSIS = 878022811155589830L;
    public static final long DX_XADAPTIVETEXTVIEW_XMAXLEN = 5506240536355688388L;
    public static final long DX_XADAPTIVETEXTVIEW_XSEPARATOR = -485287024816320973L;
    public static final long DX_XADAPTIVETEXTVIEW_XTEXTLIST = -8767379321379187774L;
    public static final long DX_XADAPTIVETEXTVIEW_XTEXTNAME = -8767379304235119193L;
    public static final long h;

    /* renamed from: a  reason: collision with root package name */
    public XAdaptiveTextViewV3 f32135a;
    public JSONArray b;
    public String c;
    public int d;
    public int e;
    public String f;
    public String g = "...";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(912262709);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new yjx();
        }
    }

    static {
        t2o.a(912262708);
        long a2 = k06.a("XAdaptiveTextView");
        DX_EVENT_ID = a2;
        h = a2;
    }

    public yjx() {
    }

    public static /* synthetic */ Object ipc$super(yjx yjxVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -879570230:
                super.onSetListAttribute(((Number) objArr[0]).longValue(), (JSONArray) objArr[1]);
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/transfer/widget/XAdaptiveTextViewWidgetNode");
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new yjx();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public Object getDefaultValueForAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("469dcc09", new Object[]{this, new Long(j)});
        }
        if (-485287024816320973L == j) {
            return " · ";
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
        t((XAdaptiveTextViewV3) textView);
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (dXWidgetNode instanceof yjx) {
            yjx yjxVar = (yjx) dXWidgetNode;
            this.d = yjxVar.d;
            this.e = yjxVar.e;
            this.f = yjxVar.f;
            this.g = yjxVar.g;
            this.c = yjxVar.c;
            JSONArray jSONArray = yjxVar.b;
            if (!z || jSONArray == null) {
                this.b = jSONArray;
            } else {
                this.b = (JSONArray) jSONArray.clone();
            }
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        XAdaptiveTextViewV3 xAdaptiveTextViewV3 = new XAdaptiveTextViewV3(context);
        this.f32135a = xAdaptiveTextViewV3;
        return xAdaptiveTextViewV3;
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onMeasure(i, i2);
        XAdaptiveTextViewV3 xAdaptiveTextViewV3 = this.f32135a;
        if (xAdaptiveTextViewV3 != null) {
            setMeasuredDimension(xAdaptiveTextViewV3.getMeasuredWidthAndState(), this.f32135a.getMeasuredHeightAndState());
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
        if (view != null || !(view instanceof XAdaptiveTextViewV3)) {
            t((XAdaptiveTextViewV3) view);
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d)});
        } else {
            super.onSetDoubleAttribute(j, d);
        }
    }

    @Override // tb.gi6, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
            return;
        }
        super.onSetIntAttribute(j, i);
        if (5506240536355688388L == j) {
            this.d = i;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetListAttribute(long j, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb92d2ca", new Object[]{this, new Long(j), jSONArray});
            return;
        }
        super.onSetListAttribute(j, jSONArray);
        if (-8767379321379187774L == j) {
            this.b = jSONArray;
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
        if (878022811155589830L == j) {
            this.g = str;
        }
        if (-485287024816320973L == j) {
            this.f = str;
        }
        if (-8767379304235119193L == j) {
            this.c = str;
        }
    }

    public final void t(XAdaptiveTextViewV3 xAdaptiveTextViewV3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7e06523", new Object[]{this, xAdaptiveTextViewV3});
        } else if (xAdaptiveTextViewV3 != null) {
            xAdaptiveTextViewV3.setViewAttr(String.valueOf(this.e), String.valueOf(getMaxWidth()), this.b, this.c, this.f, String.valueOf(this.d), this.g);
        }
    }

    public yjx(Context context) {
    }
}
