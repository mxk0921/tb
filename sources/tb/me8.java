package tb;

import android.content.Context;
import android.os.Handler;
import com.alibaba.ability.hub.AbilityHubAdapter;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.factory.view.base.PopLayerBaseView;
import com.alibaba.poplayer.track.module.OnePopModule;
import com.alibaba.poplayer.trigger.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.nativerender.dsl.DSLModel;
import com.taobao.tbpoplayer.nativerender.dsl.PopCloseBtnModel;
import com.taobao.tbpoplayer.nativerender.dsl.PreFetchModel;
import com.taobao.tbpoplayer.nativerender.dsl.StateBaseModel;
import com.taobao.tbpoplayer.nativerender.dsl.StateModel;
import com.taobao.tbpoplayer.nativerender.dsl.StateVersionModel;
import com.taobao.tbpoplayer.nativerender.info.PreFetchContext;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class me8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ENGINE_FIELD_POP = 0;
    public static final int ENGINE_FIELD_WIDGET = 1;
    public static final String WIDGET_SWITCH_ENABLE_CORNER_RADIUS = "enableCornerRadius";
    public static final String WIDGET_SWITCH_ENABLE_NEW_CORNER_RADIUS = "enableNewCornerRadius";
    public Map<String, String> A;
    public AbilityHubAdapter B;
    public nlj C;

    /* renamed from: a  reason: collision with root package name */
    public final int f23988a;
    public final Context b;
    public final Handler c;
    public String d;
    public OnePopModule e;
    public a f;
    public String g;
    public DSLModel h;
    public String j;
    public List<String> k;
    public StateModel s;
    public StateVersionModel t;
    public StateBaseModel u;
    public PopCloseBtnModel v;
    public int w;
    public int x;
    public final JSONObject i = new JSONObject();
    public boolean l = false;
    public boolean m = false;
    public boolean n = false;
    public long o = 0;
    public boolean p = true;
    public int q = 0;
    public boolean r = false;
    public final AtomicInteger y = new AtomicInteger(0);
    public final AtomicInteger z = new AtomicInteger(0);

    static {
        t2o.a(790626379);
    }

    public me8(Context context, Handler handler, int i) {
        this.f23988a = 0;
        this.b = context;
        this.c = handler;
        this.f23988a = i;
    }

    public boolean A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("331b7fe2", new Object[]{this})).booleanValue();
        }
        return this.l;
    }

    public boolean B() {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("15cf923", new Object[]{this})).booleanValue();
        }
        if (this.f23988a != 0 || (aVar = this.f) == null || aVar.i() == null || !(this.f.i() instanceof PopLayerBaseView)) {
            return this.n;
        }
        return ((PopLayerBaseView) this.f.i()).isClosed();
    }

    public boolean C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("734d3349", new Object[]{this})).booleanValue();
        }
        return this.m;
    }

    public boolean D() {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("972c5b54", new Object[]{this})).booleanValue();
        }
        if (this.f23988a != 0 || (aVar = this.f) == null || aVar.i() == null || !(this.f.i() instanceof PopLayerBaseView)) {
            return false;
        }
        return ((PopLayerBaseView) this.f.i()).isHiding();
    }

    public boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d921d9b", new Object[]{this})).booleanValue();
        }
        return this.p;
    }

    public void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55bf3e87", new Object[]{this});
        } else {
            this.r = true;
        }
    }

    public void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58f777ac", new Object[]{this});
        } else {
            this.z.decrementAndGet();
        }
    }

    public void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1f3dffc", new Object[]{this});
            return;
        }
        this.q++;
        this.p = false;
        this.r = false;
    }

    public void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24202be5", new Object[]{this});
            return;
        }
        this.q++;
        this.p = false;
        this.r = false;
    }

    public void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb754d0", new Object[]{this});
            return;
        }
        this.q = 0;
        this.p = false;
        this.r = false;
    }

    public void K(AbilityHubAdapter abilityHubAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d6fb4", new Object[]{this, abilityHubAdapter});
        } else {
            this.B = abilityHubAdapter;
        }
    }

    public void L(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b371ad70", new Object[]{this, str});
        } else {
            this.j = str;
        }
    }

    public void M(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7405b455", new Object[]{this, list});
        } else {
            this.k = list;
        }
    }

    public void N(StateBaseModel stateBaseModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("197df2e6", new Object[]{this, stateBaseModel});
        } else {
            this.u = stateBaseModel;
        }
    }

    public void O(PopCloseBtnModel popCloseBtnModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9084c8d9", new Object[]{this, popCloseBtnModel});
        } else {
            this.v = popCloseBtnModel;
        }
    }

    public void P(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9feb7fe2", new Object[]{this, new Integer(i)});
        } else {
            this.x = i;
        }
    }

    public void Q(StateModel stateModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d47fd9c6", new Object[]{this, stateModel});
        } else {
            this.s = stateModel;
        }
    }

    public void R(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32a381c1", new Object[]{this, new Long(j)});
        } else {
            this.o = j;
        }
    }

    public void S(StateVersionModel stateVersionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be24161e", new Object[]{this, stateVersionModel});
        } else {
            this.t = stateVersionModel;
        }
    }

    public void T(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29ee2e69", new Object[]{this, new Integer(i)});
        } else {
            this.w = i;
        }
    }

    public void U(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4037dbee", new Object[]{this, new Boolean(z)});
        } else {
            this.l = z;
        }
    }

    public void V(DSLModel dSLModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("598ad3ba", new Object[]{this, dSLModel});
        } else {
            this.h = dSLModel;
        }
    }

    public void W(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5de855d", new Object[]{this, new Boolean(z)});
        } else {
            this.n = z;
        }
    }

    public void X(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88cc6bf7", new Object[]{this, new Boolean(z)});
        } else {
            this.m = z;
        }
    }

    public void Y(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4868cffd", new Object[]{this, map});
        } else {
            this.A = map;
        }
    }

    public void Z(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("838b8f44", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public void a(PreFetchModel preFetchModel, PreFetchContext preFetchContext) {
        Map<String, PreFetchContext> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c21bdeb5", new Object[]{this, preFetchModel, preFetchContext});
            return;
        }
        nlj nljVar = this.C;
        if (nljVar != null && (map = nljVar.f24809a) != null) {
            ((HashMap) map).put(preFetchModel.dataId, preFetchContext);
        }
    }

    public AbilityHubAdapter b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbilityHubAdapter) ipChange.ipc$dispatch("5c734b22", new Object[]{this});
        }
        return this.B;
    }

    public void b0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e369b948", new Object[]{this, str});
        }
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1cdd7a2e", new Object[]{this});
        }
        return this.j;
    }

    public void c0(nlj nljVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed97cfa1", new Object[]{this, nljVar});
        } else {
            this.C = nljVar;
        }
    }

    public List<String> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b9ee9757", new Object[]{this});
        }
        return this.k;
    }

    public void d0(OnePopModule onePopModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6056a3e7", new Object[]{this, onePopModule});
        } else {
            this.e = onePopModule;
        }
    }

    public Context e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.b;
    }

    public void e0(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("698f4ae6", new Object[]{this, aVar});
        } else {
            this.f = aVar;
        }
    }

    public StateBaseModel f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StateBaseModel) ipChange.ipc$dispatch("3e33cdfe", new Object[]{this});
        }
        return this.u;
    }

    public void f0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb8b6e8f", new Object[]{this, str});
        }
    }

    public PopCloseBtnModel g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopCloseBtnModel) ipChange.ipc$dispatch("35abf5d9", new Object[]{this});
        }
        return this.v;
    }

    public void g0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e51c922", new Object[]{this, str});
        }
    }

    public int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4cf4d928", new Object[]{this})).intValue();
        }
        return this.x;
    }

    public void h0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66da2bd", new Object[]{this, str});
            return;
        }
        OnePopModule onePopModule = this.e;
        if (onePopModule != null) {
            onePopModule.e = str;
        }
    }

    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f332517", new Object[]{this});
        }
        StateModel stateModel = this.s;
        if (stateModel != null) {
            return stateModel.id;
        }
        return "";
    }

    public void i0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("440033f4", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f8b4c865", new Object[]{this})).intValue();
        }
        return this.q;
    }

    public StateModel k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StateModel) ipChange.ipc$dispatch("d67b235c", new Object[]{this});
        }
        return this.s;
    }

    public long l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad6e6ee3", new Object[]{this})).longValue();
        }
        return this.o;
    }

    public String m() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6b31daa2", new Object[]{this});
        }
        StateBaseModel stateBaseModel = this.u;
        if (stateBaseModel instanceof StateVersionModel) {
            str = ((StateVersionModel) stateBaseModel).verId;
        } else {
            str = "";
        }
        return String.valueOf(str);
    }

    public StateVersionModel n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StateVersionModel) ipChange.ipc$dispatch("4b1615ca", new Object[]{this});
        }
        return this.t;
    }

    public int o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("25c43359", new Object[]{this})).intValue();
        }
        return this.w;
    }

    public DSLModel p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DSLModel) ipChange.ipc$dispatch("2d8f06e8", new Object[]{this});
        }
        return this.h;
    }

    public int q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a1db7a1c", new Object[]{this})).intValue();
        }
        return this.f23988a;
    }

    public Map<String, String> r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4d16a349", new Object[]{this});
        }
        return this.A;
    }

    public String s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1cca94da", new Object[]{this});
        }
        return this.d;
    }

    public int t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f1a32a0", new Object[]{this})).intValue();
        }
        return this.y.get();
    }

    public int u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8201a6d9", new Object[]{this})).intValue();
        }
        return this.z.get();
    }

    public Handler v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("e690ed4b", new Object[]{this});
        }
        return this.c;
    }

    public OnePopModule w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnePopModule) ipChange.ipc$dispatch("c7454189", new Object[]{this});
        }
        return this.e;
    }

    public JSONObject x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("775de6cf", new Object[]{this});
        }
        return this.i;
    }

    public String y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a697002a", new Object[]{this});
        }
        return this.g;
    }

    public boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bfd5be19", new Object[]{this})).booleanValue();
        }
        return this.r;
    }

    public void a0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5c7b6a", new Object[]{this, new Integer(i)});
            return;
        }
        this.y.set(i);
        this.z.set(i);
        wdm.d("setFirstStateResCount.done.count=%s", Integer.valueOf(i));
    }
}
