package tb;

import com.alibaba.android.aura.AURAGlobalData;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ij {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public AURAGlobalData f21338a = new AURAGlobalData();

    static {
        t2o.a(79691798);
    }

    public synchronized AURAGlobalData a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAGlobalData) ipChange.ipc$dispatch("b5611c49", new Object[]{this, map});
        }
        AURAGlobalData copyOnWrite = this.f21338a.copyOnWrite(map);
        this.f21338a = copyOnWrite;
        return copyOnWrite;
    }

    public AURAGlobalData b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAGlobalData) ipChange.ipc$dispatch("f256ccf3", new Object[]{this});
        }
        return this.f21338a;
    }
}
