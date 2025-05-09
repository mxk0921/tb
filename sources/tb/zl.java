package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class zl extends ot<zg> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(80740602);
    }

    public static /* synthetic */ Object ipc$super(zl zlVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/service/render/layout/renderhelper/umf/impl/AURARenderCardLayoutHelper");
    }

    @Override // tb.qcb
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c9e3aff5", new Object[]{this});
        }
        return "card";
    }

    @Override // tb.h4e
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bdfad53", new Object[]{this})).booleanValue();
        }
        return false;
    }

    /* renamed from: e */
    public zg b(int i, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zg) ipChange.ipc$dispatch("ddc2aea8", new Object[]{this, new Integer(i), map});
        }
        zg zgVar = new zg(i);
        if (map != null) {
            Object obj = map.get("style");
            if (obj instanceof Map) {
                try {
                    zgVar.h0((Map) obj);
                } catch (Throwable unused) {
                }
            } else {
                zgVar.h0(map);
            }
        }
        return zgVar;
    }
}
