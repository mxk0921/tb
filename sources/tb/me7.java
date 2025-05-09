package tb;

import com.alipay.android.phone.iifaa.did.rpc.model.CredentialRpcData;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.ultron.view.DetailBundleLineComponent;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class me7 implements gkb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(713031901);
        t2o.a(614465629);
    }

    @Override // tb.gkb
    public void a(IDMComponent iDMComponent, List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7717bc36", new Object[]{this, iDMComponent, list});
        } else if (iDMComponent != null && list != null) {
            String string = iDMComponent.getFields().getString("cornerType");
            if (CredentialRpcData.ACTION_BOTH.equals(string) || "top".equals(string)) {
                list.add(new DetailBundleLineComponent());
                list.add(iDMComponent);
                return;
            }
            list.add(iDMComponent);
        }
    }
}
