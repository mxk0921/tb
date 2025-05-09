package tb;

import com.alibaba.android.ultron.vfw.viewholder.BundleLineComponent;
import com.alipay.android.phone.iifaa.did.rpc.model.CredentialRpcData;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class as6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(157286661);
    }

    public static void a(IDMComponent iDMComponent, List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcdcf6e7", new Object[]{iDMComponent, list});
        } else if (iDMComponent != null && list != null) {
            String string = iDMComponent.getFields().getString("cornerType");
            if (CredentialRpcData.ACTION_BOTH.equals(string) || "top".equals(string)) {
                list.add(new BundleLineComponent());
                list.add(iDMComponent);
                return;
            }
            list.add(iDMComponent);
        }
    }
}
