package tb;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy;
import com.taobao.android.live.plugin.proxy.smartlayer.ISmartLayerServiceProxy;
import com.taobao.taolive.room.openarchitecture.entity.ATaoliveOpenLiveRoomEntity;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class cv1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean B;

    /* renamed from: a  reason: collision with root package name */
    public n7e f17338a;
    public RecyclerView c;
    public hnb e;
    public String f;
    public long g;
    public JSONObject i;
    public Deque<JSONObject> j;
    public JSONObject k;
    public boolean m;
    public String q;
    public String r;
    public ISmartLandingProxy.b u;
    public ISmartLayerServiceProxy.a v;
    public nkr w;
    public int x;
    public boolean y;
    public ATaoliveOpenLiveRoomEntity z;
    public final r96 b = new r96();
    public final Map<String, Object> h = new ConcurrentHashMap();
    public long l = 0;
    public boolean n = false;
    public final boolean o = true;
    public boolean p = false;
    public final RecyclerView.RecycledViewPool s = new RecyclerView.RecycledViewPool();
    public final RecyclerView.RecycledViewPool t = new RecyclerView.RecycledViewPool();
    public final ArrayList<a> A = new ArrayList<>();
    public final w9c d = new x9c();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
        void m(boolean z);
    }

    static {
        t2o.a(806356054);
    }

    public void A(hnb hnbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44261e36", new Object[]{this, hnbVar});
        } else {
            this.e = hnbVar;
        }
    }

    public void B(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1d29fb3", new Object[]{this, new Boolean(z)});
        }
    }

    public void C(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("205b416b", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public void D(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9368f2b", new Object[]{this, str});
        } else {
            this.r = str;
        }
    }

    public void E(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddd07cc1", new Object[]{this, jSONObject});
        } else {
            this.k = jSONObject;
        }
    }

    public void F(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc7b948f", new Object[]{this, str});
        } else {
            this.q = str;
        }
    }

    public void G(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df0a3988", new Object[]{this, jSONObject});
        } else {
            this.i = jSONObject;
        }
    }

    public void H(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d968d554", new Object[]{this, new Long(j)});
        } else if (j > 0) {
            this.g = j;
        }
    }

    public void I(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abac1340", new Object[]{this, str, obj});
            return;
        }
        Map<String, Object> map = this.h;
        if (map == null) {
            Log.e("globalContext", "mMap or key or value is null,key=" + str);
        } else if (obj == null) {
            ((ConcurrentHashMap) map).remove(str);
        } else {
            ((ConcurrentHashMap) map).put(str, obj);
        }
    }

    public void J(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("745cde40", new Object[]{this, recyclerView});
        } else {
            this.c = recyclerView;
        }
    }

    public void K(n7e n7eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a3ef07b", new Object[]{this, n7eVar});
        } else {
            this.f17338a = n7eVar;
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0dec707", new Object[]{this, aVar});
        } else if (!this.A.contains(aVar)) {
            this.A.add(aVar);
        }
    }

    public long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("75abe1e", new Object[]{this})).longValue();
        }
        return this.l;
    }

    public Deque<JSONObject> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Deque) ipChange.ipc$dispatch("b30995a7", new Object[]{this});
        }
        return this.j;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78de4986", new Object[]{this})).booleanValue();
        }
        return this.p;
    }

    public RecyclerView.RecycledViewPool e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.RecycledViewPool) ipChange.ipc$dispatch("62fc9a96", new Object[]{this});
        }
        return this.s;
    }

    public hnb f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hnb) ipChange.ipc$dispatch("842fc962", new Object[]{this});
        }
        return this.e;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("11fe0d3", new Object[]{this});
        }
        return this.f;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c14f3aab", new Object[]{this});
        }
        return this.r;
    }

    public JSONObject i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("60b755bb", new Object[]{this});
        }
        return this.k;
    }

    public r96 j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r96) ipChange.ipc$dispatch("58493bb2", new Object[]{this});
        }
        return this.b;
    }

    public w9c k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w9c) ipChange.ipc$dispatch("6f473f39", new Object[]{this});
        }
        return this.d;
    }

    public String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a061f8c7", new Object[]{this});
        }
        return this.q;
    }

    public JSONObject m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c917147c", new Object[]{this});
        }
        return this.i;
    }

    public long n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e8f2f5f0", new Object[]{this})).longValue();
        }
        return this.g;
    }

    public <T> T o(String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("2a44f3e0", new Object[]{this, str, cls});
        }
        Map<String, Object> map = this.h;
        if (map == null) {
            return null;
        }
        try {
            return (T) ((ConcurrentHashMap) map).get(str);
        } catch (Throwable th) {
            Log.e("globalContext", "msg:" + th.getMessage());
            return null;
        }
    }

    public RecyclerView p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("3acf1e32", new Object[]{this});
        }
        return this.c;
    }

    public RecyclerView.RecycledViewPool q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.RecycledViewPool) ipChange.ipc$dispatch("58042afe", new Object[]{this});
        }
        return this.t;
    }

    public ATaoliveOpenLiveRoomEntity r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ATaoliveOpenLiveRoomEntity) ipChange.ipc$dispatch("ac42f3a", new Object[]{this});
        }
        return this.z;
    }

    public n7e s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n7e) ipChange.ipc$dispatch("6abdc769", new Object[]{this});
        }
        return this.f17338a;
    }

    public boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78a4fd62", new Object[]{this})).booleanValue();
        }
        return this.m;
    }

    public boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1756311b", new Object[]{this})).booleanValue();
        }
        if (!this.o || !bte.d()) {
            return false;
        }
        return true;
    }

    public void v(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f4acfea", new Object[]{this, aVar});
        } else {
            this.A.remove(aVar);
        }
    }

    public void w(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("164119e6", new Object[]{this, new Long(j)});
        } else {
            this.l = j;
        }
    }

    public void x(Deque<JSONObject> deque) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aec57897", new Object[]{this, deque});
        } else {
            this.j = deque;
        }
    }

    public void y(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8068cb06", new Object[]{this, new Boolean(z)});
        } else {
            this.p = z;
        }
    }

    public void z(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e6de4fe", new Object[]{this, new Boolean(z)});
        } else {
            this.m = z;
        }
    }
}
