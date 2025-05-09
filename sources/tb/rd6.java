package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.megadesign.dx.view.DXTBScrollerLayoutPlus;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class rd6 extends DXTBScrollerLayoutPlus {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(614465714);
    }

    public static /* synthetic */ Object ipc$super(rd6 rd6Var, String str, Object... objArr) {
        if (str.hashCode() == 2119721610) {
            super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/core/dinamicX/view/DXTBDynamicScrollerLayout");
    }

    @Override // com.taobao.android.megadesign.dx.view.DXTBScrollerLayoutPlus, com.taobao.android.dinamicx.widget.DXScrollerLayout, com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new rd6();
    }

    @Override // com.taobao.android.megadesign.dx.view.DXTBScrollerLayoutPlus, com.taobao.android.dinamicx.widget.DXScrollerLayout, com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.k, com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        try {
            v();
        } catch (Throwable unused) {
        }
    }

    public final void v() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7ca736d", new Object[]{this});
        } else if (getDXRuntimeContext() != null && getDXRuntimeContext().i() != null && (getDXRuntimeContext().i().get("fields") instanceof JSONObject)) {
            JSONObject jSONObject = (JSONObject) getDXRuntimeContext().i().get("fields");
            if (getOrientation() == 0 && (jSONObject.get("scrolledX") instanceof Integer)) {
                Integer num = (Integer) jSONObject.get("scrolledX");
                if (num != null) {
                    i = num.intValue();
                }
                this.contentOffset = i;
            }
        }
    }
}
