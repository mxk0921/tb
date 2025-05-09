package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.ace.model.JsonRpcRequest;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class owf implements dti<JsonRpcRequest> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, mho<JsonRpcRequest>> f25709a = new HashMap();

    static {
        t2o.a(993001621);
        t2o.a(993001622);
    }

    @Override // tb.dti
    public mho<JsonRpcRequest> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mho) ipChange.ipc$dispatch("13f6f64b", new Object[]{this, str});
        }
        return (mho) ((HashMap) this.f25709a).get(str);
    }

    public void b(String str, mho<JsonRpcRequest> mhoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59415e92", new Object[]{this, str, mhoVar});
        } else {
            ((HashMap) this.f25709a).put(str, mhoVar);
        }
    }
}
