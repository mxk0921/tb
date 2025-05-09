package tb;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.i;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class yd5 extends i {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean r = false;
    public boolean s = false;

    static {
        t2o.a(486539447);
    }

    public static /* synthetic */ Object ipc$super(yd5 yd5Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 139561113) {
            super.setListData((JSONArray) objArr[0]);
            return null;
        } else if (hashCode == 1327675976) {
            return new Boolean(super.onEvent((DXEvent) objArr[0]));
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/widgetnode/DXButterGridLayoutWidgetNode");
        }
    }

    public final JSONArray B(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("437e926b", new Object[]{this, jSONArray});
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.add(jSONArray.get(0));
        return jSONArray2;
    }

    @Override // com.taobao.android.dinamicx.widget.i, com.taobao.android.dinamicx.widget.h, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new yd5();
    }

    @Override // com.taobao.android.dinamicx.widget.i, com.taobao.android.dinamicx.widget.j
    public boolean checkLayoutFlat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da2cf7f6", new Object[]{this})).booleanValue();
        }
        return true ^ C();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean onEvent(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f22ba48", new Object[]{this, dXEvent})).booleanValue();
        }
        if (dXEvent.getEventId() != ae5.ICON_SCROLL_EVENT_ID) {
            return super.onEvent(dXEvent);
        }
        if (this.r) {
            this.r = false;
            this.s = true;
            setNeedLayout(true);
        }
        return false;
    }

    @Override // com.taobao.android.dinamicx.widget.j
    public void setListData(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8518899", new Object[]{this, jSONArray});
        } else if (!C() || jSONArray.size() <= 5 || getDXRuntimeContext().P() <= 0 || this.s) {
            super.setListData(jSONArray);
        } else {
            this.r = true;
            super.setListData(B(jSONArray));
        }
    }

    public final boolean C() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("299ae468", new Object[]{this})).booleanValue();
        }
        DXTemplateItem p = getDXRuntimeContext().p();
        return (p == null || (str = p.f7343a) == null || !str.contains("m_h_v5_slider_icons_tag_bindingx_d3")) ? false : true;
    }
}
