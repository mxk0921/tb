package tb;

import com.alibaba.android.aura.AURATaobaoPurchasePluginCenter;
import com.alibaba.android.aura.IAURAPluginCenter;
import com.alibaba.android.aura.nodemodel.AURAPluginContainerNodeModel;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class bar extends so0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, Object> f16283a;

    static {
        t2o.a(708837459);
    }

    public bar(HashMap<String, Object> hashMap) {
        this.f16283a = hashMap;
    }

    public static /* synthetic */ Object ipc$super(bar barVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/purchase/aura/config/TBBuyWorkFlowConfig");
    }

    @Override // tb.so0
    public AURAPluginContainerNodeModel b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAPluginContainerNodeModel) ipChange.ipc$dispatch("e71b8fb8", new Object[]{this});
        }
        return h9r.e();
    }

    @Override // tb.so0
    public HashMap<String, Object> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("e0df74e7", new Object[]{this});
        }
        return this.f16283a;
    }

    @Override // tb.so0
    public IAURAPluginCenter[] d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IAURAPluginCenter[]) ipChange.ipc$dispatch("2b8bc667", new Object[]{this}) : new IAURAPluginCenter[]{new AURATaobaoPurchasePluginCenter()};
    }
}
