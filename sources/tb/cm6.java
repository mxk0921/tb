package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class cm6 implements zwb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444597883);
        t2o.a(444598025);
    }

    @Override // tb.zwb
    public yl6 a(DXRuntimeContext dXRuntimeContext, String str) {
        Map<String, yl6> variableNameMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yl6) ipChange.ipc$dispatch("1bb2c659", new Object[]{this, dXRuntimeContext, str});
        }
        DXWidgetNode W = dXRuntimeContext.W();
        if (W == null || (variableNameMap = W.getVariableNameMap()) == null) {
            return null;
        }
        if ("runtimeContext".equals(str)) {
            return new lb6(dXRuntimeContext);
        }
        return variableNameMap.get(str);
    }
}
