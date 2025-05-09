package tb;

import com.alibaba.android.umf.datamodel.protocol.ultron.base.Event;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class bl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<Event> f16457a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Map<String, Integer> f16458a = new HashMap();

        static {
            t2o.a(81789249);
        }
    }

    static {
        t2o.a(81789248);
    }

    public List<Event> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e1a66bfe", new Object[]{this});
        }
        return this.f16457a;
    }

    public void b(List<Event> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9024288e", new Object[]{this, list});
        } else {
            this.f16457a = list;
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed97e72", new Object[]{this, str});
        }
    }
}
