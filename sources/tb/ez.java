package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class ez extends fz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Map<String, d4e> e;

    static {
        t2o.a(80740751);
    }

    public static /* synthetic */ Object ipc$super(ez ezVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/umf/node/service/render/extension/impl/AbsUMFNativeRenderComponentCreatorExtension");
    }

    @Override // tb.d4e
    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("533be778", new Object[]{this});
        }
        return dm.c;
    }

    public d4e c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d4e) ipChange.ipc$dispatch("7b21acf8", new Object[]{this, str});
        }
        Map<String, d4e> map = this.e;
        if (map == null) {
            return null;
        }
        return (d4e) ((HashMap) map).get(str);
    }

    public final void e(List<d4e> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6832a7f1", new Object[]{this, list});
            return;
        }
        if (this.e == null) {
            this.e = new HashMap();
        }
        for (d4e d4eVar : list) {
            this.e.put(d4eVar.a(), d4eVar);
        }
    }
}
