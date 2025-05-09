package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class wu5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final lvb f30925a;
    public final Map<Float, Float> b = new ConcurrentHashMap(512);

    static {
        t2o.a(444596482);
    }

    public wu5(lvb lvbVar) {
        this.f30925a = lvbVar;
    }

    public Float a(DXRuntimeContext dXRuntimeContext, Float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float) ipChange.ipc$dispatch("ce0a8e29", new Object[]{this, dXRuntimeContext, f});
        }
        if (dXRuntimeContext != null) {
            lvb lvbVar = this.f30925a;
            if (lvbVar instanceof kvb) {
                return Float.valueOf(((kvb) lvbVar).b(dXRuntimeContext, f.floatValue()));
            }
        }
        return b(f);
    }

    public Float b(Float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float) ipChange.ipc$dispatch("a518157a", new Object[]{this, f});
        }
        if (((ConcurrentHashMap) this.b).containsKey(f)) {
            return (Float) ((ConcurrentHashMap) this.b).get(f);
        }
        lvb lvbVar = this.f30925a;
        if (lvbVar == null) {
            return f;
        }
        float a2 = lvbVar.a(f.floatValue());
        ((ConcurrentHashMap) this.b).put(f, Float.valueOf(a2));
        return Float.valueOf(a2);
    }
}
