package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.linked.LinkedSplashData;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.psg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class qsg {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public volatile tsg d;
    public volatile LinkedSplashData e;

    /* renamed from: a  reason: collision with root package name */
    public final b f26907a = new b();
    public final Map<String, psg> b = new ConcurrentHashMap();
    public final List<q5d> c = new CopyOnWriteArrayList();
    public boolean f = false;
    public boolean g = false;
    public final Map<String, psg> h = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b implements psg {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(736100452);
            t2o.a(736100448);
        }

        public b() {
        }

        @Override // tb.psg
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8d6a55f9", new Object[]{this});
            } else {
                tm1.a("LinkedSplashCooperator", "wtf!!!, EmptyCallback.onShown");
            }
        }

        @Override // tb.psg
        public String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("daf1e05e", new Object[]{this});
            }
            return "_EmptyCallback_";
        }

        @Override // tb.psg
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea470ec9", new Object[]{this});
            } else {
                tm1.a("LinkedSplashCooperator", "wtf!!!, EmptyCallback.onTerminate");
            }
        }

        @Override // tb.psg
        public void f(LinkedSplashData linkedSplashData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ae02dd", new Object[]{this, linkedSplashData});
                return;
            }
            tm1.a("LinkedSplashCooperator", "wtf!!!, EmptyCallback.onReceiveData" + linkedSplashData);
        }

        @Override // tb.psg
        public void onAnimationEnd() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c281bbd", new Object[]{this});
            } else {
                tm1.a("LinkedSplashCooperator", "wtf!!!, EmptyCallback.onAnimationEnd");
            }
        }

        @Override // tb.psg
        public void onAnimationStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("771cb104", new Object[]{this});
            } else {
                tm1.a("LinkedSplashCooperator", "wtf!!!, EmptyCallback.onAnimationStart");
            }
        }

        @Override // tb.psg
        public boolean e(psg.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("932c859d", new Object[]{this, aVar})).booleanValue();
            }
            tm1.a("LinkedSplashCooperator", "wtf!!!, EmptyCallback.shouldAnimate");
            return false;
        }

        @Override // tb.psg
        public boolean g(LinkedSplashData linkedSplashData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("54bc039b", new Object[]{this, linkedSplashData})).booleanValue();
            }
            tm1.a("LinkedSplashCooperator", "wtf!!!, EmptyCallback.onTerminate");
            return true;
        }

        @Override // tb.psg
        public boolean h(LinkedSplashData linkedSplashData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("34c8cb58", new Object[]{this, linkedSplashData})).booleanValue();
            }
            tm1.a("LinkedSplashCooperator", "wtf!!!, EmptyCallback.shouldShow" + linkedSplashData);
            return true;
        }
    }

    static {
        t2o.a(736100450);
    }

    public void a(psg psgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("319fed1a", new Object[]{this, psgVar});
        } else if (psgVar == null) {
            tm1.a("LinkedSplashCooperator", "addCallback = null");
        } else {
            ((ConcurrentHashMap) this.b).put(psgVar.c(), psgVar);
            tm1.a("LinkedSplashCooperator", "addCallback, type = " + psgVar.c() + ", callback = " + psgVar);
            if (((HashMap) this.h).get(psgVar.c()) == this.f26907a) {
                ((HashMap) this.h).remove(psgVar.c());
                psgVar.g(this.e);
            }
        }
    }

    public void b(q5d q5dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c445e3", new Object[]{this, q5dVar});
        } else {
            ((CopyOnWriteArrayList) this.c).add(q5dVar);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca2567be", new Object[]{this});
            return;
        }
        try {
            this.g = true;
            j(this.e).onAnimationEnd();
            tm1.a("LinkedSplashCooperator", "animationEnd, currentSplashData = " + this.e);
        } catch (Throwable th) {
            tm1.b("LinkedSplashCooperator", "animationEnd", th);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3af700c5", new Object[]{this});
            return;
        }
        try {
            this.f = true;
            j(this.e).onAnimationStart();
            tm1.a("LinkedSplashCooperator", "animationStart, currentSplashData = " + this.e);
            LinkedSplashData linkedSplashData = this.e;
            if (linkedSplashData != null) {
                o4v.b(linkedSplashData.getSplashJson().a());
            }
        } catch (Throwable th) {
            tm1.b("LinkedSplashCooperator", "animationStart", th);
        }
    }

    public final void e(LinkedSplashData linkedSplashData, boolean z) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa95ad03", new Object[]{this, linkedSplashData, new Boolean(z)});
        } else if (linkedSplashData != null) {
            pbq splashJson = linkedSplashData.getSplashJson();
            if (z) {
                jSONObject = splashJson.c();
            } else {
                jSONObject = splashJson.d();
            }
            o4v.a(jSONObject, z);
            o4v.b(jSONObject);
        }
    }

    public LinkedSplashData f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedSplashData) ipChange.ipc$dispatch("c9742923", new Object[]{this});
        }
        return this.e;
    }

    public tsg g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tsg) ipChange.ipc$dispatch("db57d55f", new Object[]{this});
        }
        return this.d;
    }

    public List<q5d> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8bb14dcd", new Object[]{this});
        }
        return this.c;
    }

    public void i(LinkedSplashData linkedSplashData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c9d51b3", new Object[]{this, linkedSplashData});
            return;
        }
        try {
            j(linkedSplashData).f(linkedSplashData);
            tm1.a("LinkedSplashCooperator", "notifyReceiveData, linkedDataType = " + linkedSplashData);
        } catch (Throwable th) {
            tm1.b("LinkedSplashCooperator", "notifyReceiveData", th);
        }
    }

    public final psg j(LinkedSplashData linkedSplashData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (psg) ipChange.ipc$dispatch("6bbd1cf4", new Object[]{this, linkedSplashData});
        }
        if (linkedSplashData == null) {
            tm1.a("LinkedSplashCooperator", "peekCallback, currentSplashData is null, this cooperator has been terminated");
            return this.f26907a;
        }
        String linkedDataType = linkedSplashData.getLinkedDataType();
        tm1.a("LinkedSplashCooperator", "peekCallback, linkedDataType " + linkedDataType);
        if (TextUtils.isEmpty(linkedDataType)) {
            tm1.a("LinkedSplashCooperator", "wtf!!!, peekCallback, linkedSplashType is empty");
            return this.f26907a;
        }
        psg psgVar = (psg) ((ConcurrentHashMap) this.b).get(linkedDataType);
        if (psgVar != null) {
            return psgVar;
        }
        tm1.a("LinkedSplashCooperator", "wtf!!!, peekCallback, callback not found, type = " + linkedDataType);
        return this.f26907a;
    }

    public void k(psg psgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db0771bd", new Object[]{this, psgVar});
        } else if (psgVar == null) {
            tm1.a("LinkedSplashCooperator", "removeCallback = null");
        } else {
            ((ConcurrentHashMap) this.b).remove(psgVar.c());
            tm1.a("LinkedSplashCooperator", "removeCallback, type = " + psgVar.c() + ", callback = " + psgVar);
        }
    }

    public void l(q5d q5dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e972ee06", new Object[]{this, q5dVar});
        } else {
            ((CopyOnWriteArrayList) this.c).remove(q5dVar);
        }
    }

    public void n(LinkedSplashData linkedSplashData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14e8bdd9", new Object[]{this, linkedSplashData});
        } else {
            this.e = linkedSplashData;
        }
    }

    public void o(tsg tsgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7704b5d5", new Object[]{this, tsgVar});
            return;
        }
        this.d = tsgVar;
        tm1.a("LinkedSplashCooperator", "setEnvCallback, envCallback = " + tsgVar);
    }

    public void s(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58c3bcbc", new Object[]{this, new Boolean(z)});
            return;
        }
        try {
            j(this.e).a();
            tm1.a("LinkedSplashCooperator", "shown, currentSplashData = " + this.e);
            e(this.e, z);
        } catch (Throwable th) {
            tm1.b("LinkedSplashCooperator", "shown", th);
        }
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7382a68", new Object[]{this});
            return;
        }
        try {
            LinkedSplashData linkedSplashData = this.e;
            if (linkedSplashData != null && TextUtils.equals(rr6.TYPE_BANNER, linkedSplashData.getLinkedDataType())) {
                tm1.a("LinkedSplashCooperator", "terminate, enter topview compat = " + this.e);
                if (!this.f) {
                    tm1.a("LinkedSplashCooperator", "terminate, trigger animationStart for topview");
                    d();
                }
                if (!this.g) {
                    tm1.a("LinkedSplashCooperator", "terminate, trigger animationEnd for topview");
                    c();
                }
            }
            j(this.e).d();
            tm1.a("LinkedSplashCooperator", "terminate, currentSplashData = " + this.e);
        } catch (Throwable th) {
            tm1.b("LinkedSplashCooperator", "terminate", th);
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18c7a491", new Object[]{this});
            return;
        }
        this.e = null;
        this.f = false;
        this.g = false;
        tm1.a("LinkedSplashCooperator", "resetSelected,  finish");
    }

    public boolean p(psg.a aVar) {
        LinkedSplashData linkedSplashData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("932c859d", new Object[]{this, aVar})).booleanValue();
        }
        try {
            boolean e = j(this.e).e(aVar);
            tm1.a("LinkedSplashCooperator", "shouldAnimate=" + e + ", currentSplashData = " + this.e);
            aVar.getClass();
            if (psg.a.FROM_CLOSE.equals(null) && (linkedSplashData = this.e) != null) {
                o4v.b(linkedSplashData.getSplashJson().b());
            }
            return e;
        } catch (Throwable th) {
            tm1.b("LinkedSplashCooperator", "shouldAnimate", th);
            return false;
        }
    }

    public boolean r(LinkedSplashData linkedSplashData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("164fbe3", new Object[]{this, linkedSplashData})).booleanValue();
        }
        try {
            boolean h = j(linkedSplashData).h(linkedSplashData);
            if (h) {
                this.e = linkedSplashData;
                cg0.a(linkedSplashData, false);
            } else {
                this.e = null;
            }
            tm1.a("LinkedSplashCooperator", "shouldShow, data = " + linkedSplashData + ",   shouldShow = " + h);
            return h;
        } catch (Throwable th) {
            tm1.b("LinkedSplashCooperator", "shouldShow", th);
            return false;
        }
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b98f993", new Object[]{this})).booleanValue();
        }
        try {
            if (this.e == null) {
                tm1.a("LinkedSplashCooperator", "shouldColdStartShow, data is null ");
                return false;
            }
            psg j = j(this.e);
            if (j == this.f26907a) {
                tm1.a("LinkedSplashCooperator", "shouldColdStartShow linked type= " + this.e.getLinkedDataType() + ", callback is null.");
                ((HashMap) this.h).put(this.e.getLinkedDataType(), j);
            }
            boolean g = j.g(this.e);
            if (g) {
                cg0.a(this.e, true);
            } else {
                this.e = null;
            }
            tm1.a("LinkedSplashCooperator", "shouldColdStartShow, data = " + this.e + ",   shouldShow = " + g);
            return g;
        } catch (Throwable th) {
            tm1.b("LinkedSplashCooperator", "shouldColdStartShow", th);
            return false;
        }
    }
}
