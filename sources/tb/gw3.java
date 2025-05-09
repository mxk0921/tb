package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class gw3 implements qbe {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BRIDGE_TAG = "closePopup";

    /* renamed from: a  reason: collision with root package name */
    public final kz1 f20264a;

    static {
        t2o.a(155189251);
        t2o.a(157286763);
    }

    public gw3(kz1 kz1Var) {
        this.f20264a = kz1Var;
    }

    @Override // tb.qbe
    public void a(Map<String, Object> map, cbo cboVar, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f25ac270", new Object[]{this, map, cboVar, iDMComponent});
        } else {
            this.f20264a.e().k(false);
        }
    }
}
