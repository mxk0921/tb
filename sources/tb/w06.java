package tb;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXScrollEvent;
import com.taobao.android.dinamicx.widget.DXSliderLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.bindingx.ScrollIconsVariableHighMsg;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.HIconScrollerIndicator;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.biz.IIconService;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class w06 extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXICONSCROLLERINDICATOR_ICONSCROLLERCHILDVIEWWIDTH = 3400716862757543816L;
    public static final long DXICONSCROLLERINDICATOR_ICONSCROLLERINDICATOR = -6001544878300519551L;
    public static final long DXICONSCROLLERINDICATOR_INDICATORCOLOR = -5151416374116397110L;

    /* renamed from: a  reason: collision with root package name */
    public int f30380a = 16739626;
    public int[] b = new int[2];
    public final ScrollIconsVariableHighMsg c = new ScrollIconsVariableHighMsg();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(486539468);
            t2o.a(444597451);
        }

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new w06();
        }
    }

    static {
        t2o.a(486539467);
    }

    public static /* synthetic */ Object ipc$super(w06 w06Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -879570230:
                super.onSetListAttribute(((Number) objArr[0]).longValue(), (JSONArray) objArr[1]);
                return null;
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1327675976:
                return new Boolean(super.onEvent((DXEvent) objArr[0]));
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/widgetnode/DXIconScrollerIndicatorWidgetNode");
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new w06();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == -2819959685970048978L) {
            return yb6.DEFAULT_INDICATOR_BG_COLOR;
        }
        return super.getDefaultValueForIntAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode instanceof w06) {
            super.onClone(dXWidgetNode, z);
            w06 w06Var = (w06) dXWidgetNode;
            this.b = w06Var.b;
            this.f30380a = w06Var.f30380a;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        return new HIconScrollerIndicator(context);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean onEvent(DXEvent dXEvent) {
        HIconScrollerIndicator hIconScrollerIndicator;
        DXScrollEvent dXScrollEvent;
        RecyclerView recyclerView;
        double d;
        cfc c;
        IIconService iIconService;
        DXWidgetNode queryWidgetNodeByUserId;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f22ba48", new Object[]{this, dXEvent})).booleanValue();
        }
        if (super.onEvent(dXEvent)) {
            return true;
        }
        if (dXEvent.getEventId() != 5288751146867425108L || (hIconScrollerIndicator = (HIconScrollerIndicator) getDXRuntimeContext().D()) == null || (recyclerView = (dXScrollEvent = (DXScrollEvent) dXEvent).getRecyclerView()) == null || ((LinearLayoutManager) recyclerView.getLayoutManager()).getOrientation() == 1) {
            return false;
        }
        int i2 = dXScrollEvent.getContentSize().f29533a - dXScrollEvent.getScrollerSize().f29533a;
        int offsetX = dXScrollEvent.getOffsetX();
        int c2 = pb6.c(recyclerView.getContext(), this.b[0]);
        int c3 = pb6.c(recyclerView.getContext(), this.b[1]);
        if (t()) {
            offsetX = Math.max(offsetX - (c3 - c2), 0);
        }
        if (i2 > 0) {
            d = offsetX / i2;
        } else {
            d = 0.0d;
        }
        int i3 = (d > vu3.b.GEO_NOT_SUPPORT ? 1 : (d == vu3.b.GEO_NOT_SUPPORT ? 0 : -1));
        if (!((i3 != 0 && d != 1.0d) || (c = j18.c(getDXRuntimeContext())) == null || (iIconService = (IIconService) c.a(IIconService.class)) == null || (queryWidgetNodeByUserId = getDXRuntimeContext().W().queryWidgetNodeByUserId("icon_slider")) == null || !(queryWidgetNodeByUserId instanceof DXSliderLayout))) {
            if (i3 != 0) {
                i = 1;
            }
            iIconService.setCurrentPageIndex(i);
        }
        hIconScrollerIndicator.refreshScrollIndicator(d);
        return true;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        int i;
        IIconService iIconService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        w06 w06Var = (w06) getDXRuntimeContext().W();
        HIconScrollerIndicator hIconScrollerIndicator = (HIconScrollerIndicator) view;
        hIconScrollerIndicator.setScrollBarThumbColor(tryFetchDarkModeColor(maj.INDICATOR_COLOR, 2, w06Var.f30380a));
        hIconScrollerIndicator.setRadius((float) (getMeasuredHeight() * 0.5d));
        hIconScrollerIndicator.initIndicatorView(w06Var.getMeasuredWidth(), w06Var.getMeasuredHeight());
        cfc c = j18.c(getDXRuntimeContext());
        if (c == null || (iIconService = (IIconService) c.a(IIconService.class)) == null) {
            i = 0;
        } else {
            BaseSectionModel<?> e = j18.e(getDXRuntimeContext());
            if (e != null) {
                iIconService.setSectionBizCode(e.getSectionBizCode());
            }
            i = iIconService.getInitPageIndex();
        }
        if (i == 1) {
            hIconScrollerIndicator.refreshScrollIndicator(1.0d);
            this.c.postMessage(getEngine(), getDXRuntimeContext().L(), pb6.c(getDXRuntimeContext().h(), this.b[0]), ((View) getDXRuntimeContext().L().getParent()).getLayoutParams().height);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == -5151416374116397110L) {
            this.f30380a = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetListAttribute(long j, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb92d2ca", new Object[]{this, new Long(j), jSONArray});
        } else if (j == 3400716862757543816L) {
            u(jSONArray);
        } else {
            super.onSetListAttribute(j, jSONArray);
        }
    }

    public final boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f6b8d19", new Object[]{this})).booleanValue();
        }
        int[] iArr = this.b;
        if (iArr[0] != iArr[1]) {
            return true;
        }
        return false;
    }

    public final void u(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8b3e6aa", new Object[]{this, jSONArray});
        } else if (jSONArray != null && !jSONArray.isEmpty()) {
            for (int i = 0; i < jSONArray.size(); i++) {
                try {
                    this.b[i] = Integer.parseInt(String.valueOf(jSONArray.get(i)));
                } catch (Exception e) {
                    fve.e("DXIconScrollerIndicatorWidgetNode", "解析子视图宽度信息出现异常：" + e);
                    return;
                }
            }
        }
    }
}
