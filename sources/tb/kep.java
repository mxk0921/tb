package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.data.datamodel.a;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class kep {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, a> f22619a = new HashMap<>();

    static {
        t2o.a(468713949);
    }

    public a.d a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a.d) ipChange.ipc$dispatch("167417d0", new Object[]{this, str});
        }
        a aVar = this.f22619a.get(str);
        if (aVar != null) {
            return aVar.e();
        }
        return null;
    }

    public a b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("585bada2", new Object[]{this, str});
        }
        return this.f22619a.get(str);
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("388264fe", new Object[]{this, str});
        } else {
            this.f22619a.remove(str);
        }
    }

    public void d(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("294c40bf", new Object[]{this, str, aVar});
        } else {
            this.f22619a.put(str, aVar);
        }
    }
}
