package tb;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXScrollEvent;
import com.taobao.android.dinamicx.view.DXNativeScrollerIndicator;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class yb6 extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_INDICATOR_BG_COLOR = -2171170;
    public static final int DEFAULT_INDICATOR_COLOR = -35072;
    public static final double DEFAULT_INDICATOR_RATIO = 0.5d;
    public static final long DX_SCROLLER_INDICATOR = 4185989886676328692L;
    public static final long DX_SCROLLER_INDICATOR_COLOR = -5151416374116397110L;
    public static final long DX_SCROLLER_INDICATOR_INDICATOR_RATIO = -5150348073123091510L;

    /* renamed from: a  reason: collision with root package name */
    public int f31959a = -35072;
    public double b = 0.5d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(444597366);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new yb6();
        }
    }

    static {
        t2o.a(444597365);
    }

    public yb6() {
        setBackGroundColor(DEFAULT_INDICATOR_BG_COLOR);
    }

    public static /* synthetic */ Object ipc$super(yb6 yb6Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1806543962:
                return new Double(super.getDefaultValueForDoubleAttr(((Number) objArr[0]).longValue()));
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -638169079:
                super.onSetDoubleAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).doubleValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 1327675976:
                return new Boolean(super.onEvent((DXEvent) objArr[0]));
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/DXScrollerIndicator");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new yb6();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public double getDefaultValueForDoubleAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("945253a6", new Object[]{this, new Long(j)})).doubleValue();
        }
        if (j == -5150348073123091510L) {
            return 0.5d;
        }
        return super.getDefaultValueForDoubleAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == -5151416374116397110L) {
            return -35072;
        }
        if (j == -2819959685970048978L) {
            return DEFAULT_INDICATOR_BG_COLOR;
        }
        return super.getDefaultValueForIntAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (dXWidgetNode instanceof yb6) {
            yb6 yb6Var = (yb6) dXWidgetNode;
            this.f31959a = yb6Var.f31959a;
            this.b = yb6Var.b;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return new DXNativeScrollerIndicator(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean onEvent(DXEvent dXEvent) {
        DXNativeScrollerIndicator dXNativeScrollerIndicator;
        DXScrollEvent dXScrollEvent;
        RecyclerView recyclerView;
        double d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f22ba48", new Object[]{this, dXEvent})).booleanValue();
        }
        if (super.onEvent(dXEvent)) {
            return true;
        }
        if (dXEvent.getEventId() != 5288751146867425108L || (dXNativeScrollerIndicator = (DXNativeScrollerIndicator) getDXRuntimeContext().D()) == null || (recyclerView = (dXScrollEvent = (DXScrollEvent) dXEvent).getRecyclerView()) == null) {
            return false;
        }
        if (((LinearLayoutManager) recyclerView.getLayoutManager()).getOrientation() == 1) {
            dXNativeScrollerIndicator.setHorizontal(false);
            return true;
        }
        int i = dXScrollEvent.getContentSize().f29533a - dXScrollEvent.getScrollerSize().f29533a;
        int offsetX = dXScrollEvent.getOffsetX();
        if (i > 0) {
            d = offsetX / i;
        } else {
            d = 0.0d;
        }
        dXNativeScrollerIndicator.refreshScrollIndicator(d, this.b, getMeasuredWidth(), getMeasuredHeight());
        return true;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        yb6 yb6Var = (yb6) getDXRuntimeContext().W();
        DXNativeScrollerIndicator dXNativeScrollerIndicator = (DXNativeScrollerIndicator) view;
        dXNativeScrollerIndicator.setScrollBarThumbColor(tryFetchDarkModeColor(maj.INDICATOR_COLOR, 2, yb6Var.f31959a));
        dXNativeScrollerIndicator.refreshScrollIndicator(vu3.b.GEO_NOT_SUPPORT, yb6Var.b, yb6Var.getMeasuredWidth(), yb6Var.getMeasuredHeight());
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d) {
        double d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d)});
        } else if (j == -5150348073123091510L) {
            if (d > vu3.b.GEO_NOT_SUPPORT) {
                d2 = Math.min(1.0d, d);
            } else {
                d2 = 0.5d;
            }
            this.b = d2;
        } else {
            super.onSetDoubleAttribute(j, d);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == -5151416374116397110L) {
            this.f31959a = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void setBackground(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce1cfbb", new Object[]{this, view});
            return;
        }
        DXNativeScrollerIndicator dXNativeScrollerIndicator = (DXNativeScrollerIndicator) view;
        dXNativeScrollerIndicator.setRadii((float) (getMeasuredHeight() * 0.5d));
        dXNativeScrollerIndicator.setScrollBarTrackColor(getBackGroundColor());
    }
}
