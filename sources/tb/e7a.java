package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class e7a implements qbe {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BRIDGE_TAG = "getComponentData";

    static {
        t2o.a(155189252);
        t2o.a(157286763);
    }

    public e7a(kz1 kz1Var) {
    }

    @Override // tb.qbe
    public void a(Map<String, Object> map, cbo cboVar, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f25ac270", new Object[]{this, map, cboVar, iDMComponent});
        } else if (iDMComponent != null && cboVar != null) {
            cboVar.invoke(iDMComponent.getFields());
        }
    }
}
