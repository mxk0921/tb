package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.j;
import com.taobao.android.icart.widget.richtext.RichTextView;
import java.util.List;
import tb.leo;
import tb.neo;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class wf5 extends j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXCARTRICHVIEW_CARTRICHVIEW = -7054684613552058953L;
    public static final long DXCARTRICHVIEW_LINESPACING = -2369181291898902408L;

    /* renamed from: a  reason: collision with root package name */
    public neo f30665a;
    public double b = vu3.b.GEO_NOT_SUPPORT;

    static {
        t2o.a(478151117);
    }

    public static /* synthetic */ Object ipc$super(wf5 wf5Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1806543962:
                return new Double(super.getDefaultValueForDoubleAttr(((Number) objArr[0]).longValue()));
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -638169079:
                super.onSetDoubleAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).doubleValue());
                return null;
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/widget/richtext/DXCartRichViewWidgetNode");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new wf5();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public double getDefaultValueForDoubleAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("945253a6", new Object[]{this, new Long(j)})).doubleValue();
        }
        if (j == -2369181291898902408L) {
            return vu3.b.GEO_NOT_SUPPORT;
        }
        return super.getDefaultValueForDoubleAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.j
    public boolean isDisableFlatten() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e18ffb51", new Object[]{this})).booleanValue();
        }
        return true;
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

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode != null && (dXWidgetNode instanceof wf5)) {
            super.onClone(dXWidgetNode, z);
            this.b = ((wf5) dXWidgetNode).b;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return new RichTextView(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            super.onLayout(z, i, i2, i3, i4);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        if (this.f30665a == null) {
            neo neoVar = new neo(getDXRuntimeContext().h());
            this.f30665a = neoVar;
            neoVar.l(pb6.f(getDXRuntimeContext().h(), (float) this.b));
            t();
        }
        neo.a j = this.f30665a.j(i, i2);
        setMeasuredDimension(j.b(), j.a());
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        } else if (view instanceof RichTextView) {
            ((RichTextView) view).setRichTextRender(this.f30665a);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d)});
        } else if (j == -2369181291898902408L) {
            this.b = d;
        } else {
            super.onSetDoubleAttribute(j, d);
        }
    }

    public final void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf4a3b93", new Object[]{this});
            return;
        }
        List<DXWidgetNode> children = getChildren();
        for (int i = 0; i < children.size(); i++) {
            DXWidgetNode dXWidgetNode = children.get(i);
            if (dXWidgetNode.getVisibility() != 2 && (dXWidgetNode instanceof leo.a)) {
                leo l = ((leo.a) dXWidgetNode).l(this.f30665a);
                this.f30665a.k(Math.max(0, dXWidgetNode.getBorderWidth()));
                this.f30665a.a(l);
            }
        }
    }
}
