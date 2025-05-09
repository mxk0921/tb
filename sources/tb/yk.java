package tb;

import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAInputData;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class yk<DATA extends Serializable> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final DATA f32137a;
    public final AURAFlowData b;

    static {
        t2o.a(79691852);
    }

    public yk(DATA data, AURAInputData aURAInputData) {
        this.f32137a = data;
        if (aURAInputData != null) {
            this.b = aURAInputData.getFlowData();
            aURAInputData.getGlobalData();
        }
    }

    public static <DATA extends Serializable> yk<DATA> a(DATA data, AURAInputData aURAInputData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yk) ipChange.ipc$dispatch("cce6955", new Object[]{data, aURAInputData});
        }
        return new yk<>(data, aURAInputData);
    }

    public DATA b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DATA) ((Serializable) ipChange.ipc$dispatch("9c7e95a3", new Object[]{this}));
        }
        return this.f32137a;
    }

    public Map<String, Object> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d4f5cf46", new Object[]{this});
        }
        return null;
    }

    public Map<String, Object> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("837d1ff1", new Object[]{this});
        }
        return null;
    }

    public AURAFlowData e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAFlowData) ipChange.ipc$dispatch("aa7fb203", new Object[]{this});
        }
        return this.b;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("becba450", new Object[]{this})).booleanValue();
        }
        return false;
    }
}
