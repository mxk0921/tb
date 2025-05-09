package tb;

import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.icart.core.QueryParamsManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.recommend.impl.CartMainRecommend;
import com.taobao.android.icart.widget.CartRecyclerView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class ed3 extends lu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final lu f18493a;

    static {
        t2o.a(478150848);
    }

    public ed3(CartRecyclerView cartRecyclerView, kmb kmbVar, String str) {
        str.hashCode();
        if (str.equals("search")) {
            this.f18493a = new kd3(cartRecyclerView, kmbVar);
        } else if (str.equals("main")) {
            this.f18493a = new CartMainRecommend(cartRecyclerView, kmbVar);
        } else if (QueryParamsManager.CartFeedFlowType.search.equals(kmbVar.W().k())) {
            this.f18493a = new kd3(cartRecyclerView, kmbVar);
        } else {
            this.f18493a = new CartMainRecommend(cartRecyclerView, kmbVar);
        }
    }

    public static /* synthetic */ Object ipc$super(ed3 ed3Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 1173126557) {
            super.m(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode == 1831134374) {
            super.l((khd) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/icart/recommend/CartRecommendWrapper");
        }
    }

    public static JSONObject n(kmb kmbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c66b57c3", new Object[]{kmbVar});
        }
        JSONObject f = sca.f(kmbVar.d());
        if (f == null) {
            return null;
        }
        return f.getJSONObject("customParams");
    }

    public static boolean o(kmb kmbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d88aa500", new Object[]{kmbVar})).booleanValue();
        }
        if (kmbVar == null) {
            return false;
        }
        if (kmbVar.d().J() || kmbVar.d().K() || n(kmbVar) != null) {
            return true;
        }
        return false;
    }

    @Override // tb.lu
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("168a128e", new Object[]{this})).booleanValue();
        }
        return this.f18493a.a();
    }

    @Override // tb.lu
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4abcc3bd", new Object[]{this});
        } else {
            this.f18493a.b();
        }
    }

    @Override // tb.lu
    public void c(ly<RecyclerView> lyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1f97fa1", new Object[]{this, lyVar});
        } else {
            this.f18493a.c(lyVar);
        }
    }

    @Override // tb.lu
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de57be5c", new Object[]{this});
        } else {
            this.f18493a.d();
        }
    }

    @Override // tb.lu
    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6031f01", new Object[]{this})).booleanValue();
        }
        return this.f18493a.e();
    }

    @Override // tb.lu
    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3aa8873", new Object[]{this})).booleanValue();
        }
        return this.f18493a.f();
    }

    @Override // tb.lu
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f98e118", new Object[]{this})).booleanValue();
        }
        return this.f18493a.g();
    }

    @Override // tb.lu
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else {
            this.f18493a.h();
        }
    }

    @Override // tb.lu
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            this.f18493a.i();
        }
    }

    @Override // tb.lu
    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a4f18aa", new Object[]{this, str});
        } else {
            this.f18493a.j(str);
        }
    }

    @Override // tb.lu
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e3f1a38", new Object[]{this});
        } else {
            this.f18493a.k();
        }
    }

    @Override // tb.lu
    public void m(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45ec7d9d", new Object[]{this, new Integer(i)});
            return;
        }
        super.m(i);
        this.f18493a.m(i);
    }
}
