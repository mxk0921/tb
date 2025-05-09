package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class p28 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<a> f25826a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a {
        void a(JSONObject jSONObject);
    }

    static {
        t2o.a(729809753);
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27f37f00", new Object[]{this, aVar});
            return;
        }
        if (this.f25826a == null) {
            this.f25826a = new CopyOnWriteArrayList();
        }
        this.f25826a.add(aVar);
    }

    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75fe32c1", new Object[]{this, jSONObject});
            return;
        }
        List<a> list = this.f25826a;
        if (list != null && !((CopyOnWriteArrayList) list).isEmpty()) {
            Iterator it = ((CopyOnWriteArrayList) this.f25826a).iterator();
            while (it.hasNext()) {
                ((a) it.next()).a(jSONObject);
            }
        }
    }

    public void c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30efd8fd", new Object[]{this, aVar});
            return;
        }
        List<a> list = this.f25826a;
        if (list != null) {
            ((CopyOnWriteArrayList) list).remove(aVar);
        }
    }
}
