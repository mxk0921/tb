package tb;

import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class nh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public DXRootView f24725a;
    public AURARenderComponent b;
    public JSONObject c;
    public c d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final c b = new c();

        /* renamed from: a  reason: collision with root package name */
        public final nh f24726a = new nh();

        static {
            t2o.a(81789003);
        }

        public nh a() throws NullPointerException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (nh) ipChange.ipc$dispatch("5e320070", new Object[]{this});
            }
            if (nh.b(this.f24726a) == null) {
                throw new NullPointerException("rootView不能为空");
            } else if (nh.d(this.f24726a) == null) {
                throw new NullPointerException("component不能为空");
            } else if (nh.f(this.f24726a) != null) {
                nh.h(this.f24726a, this.b);
                return this.f24726a;
            } else {
                throw new NullPointerException("dxFields不能为空");
            }
        }

        public b b(AURARenderComponent aURARenderComponent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("d31f50f7", new Object[]{this, aURARenderComponent});
            }
            nh.e(this.f24726a, aURARenderComponent);
            return this;
        }

        public b c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("24b92f55", new Object[]{this, new Integer(i)});
            }
            this.b.b = i;
            return this;
        }

        public b d(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("b8b53ad2", new Object[]{this, new Integer(i)});
            }
            this.b.f24727a = i;
            return this;
        }

        public b e(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("878891d2", new Object[]{this, jSONObject});
            }
            nh.g(this.f24726a, jSONObject);
            return this;
        }

        public b f(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("35bfd05b", new Object[]{this, new Integer(i)});
            }
            nh.a(this.f24726a, i);
            return this;
        }

        public b g(DXRootView dXRootView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("da78be7f", new Object[]{this, dXRootView});
            }
            nh.c(this.f24726a, dXRootView);
            return this;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public int f24727a;
        public int b;

        static {
            t2o.a(81789004);
        }
    }

    static {
        t2o.a(81789001);
    }

    public static /* synthetic */ int a(nh nhVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a0ea132d", new Object[]{nhVar, new Integer(i)})).intValue();
        }
        nhVar.getClass();
        return i;
    }

    public static /* synthetic */ DXRootView b(nh nhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("f66e88ef", new Object[]{nhVar});
        }
        return nhVar.f24725a;
    }

    public static /* synthetic */ DXRootView c(nh nhVar, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("460ca68c", new Object[]{nhVar, dXRootView});
        }
        nhVar.f24725a = dXRootView;
        return dXRootView;
    }

    public static /* synthetic */ AURARenderComponent d(nh nhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponent) ipChange.ipc$dispatch("ea05be14", new Object[]{nhVar});
        }
        return nhVar.b;
    }

    public static /* synthetic */ AURARenderComponent e(nh nhVar, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponent) ipChange.ipc$dispatch("d7e3cd5b", new Object[]{nhVar, aURARenderComponent});
        }
        nhVar.b = aURARenderComponent;
        return aURARenderComponent;
    }

    public static /* synthetic */ JSONObject f(nh nhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f1f3840a", new Object[]{nhVar});
        }
        return nhVar.c;
    }

    public static /* synthetic */ JSONObject g(nh nhVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fd8cc124", new Object[]{nhVar, jSONObject});
        }
        nhVar.c = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ c h(nh nhVar, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("c198093", new Object[]{nhVar, cVar});
        }
        nhVar.d = cVar;
        return cVar;
    }

    public AURARenderComponent i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponent) ipChange.ipc$dispatch("75577e39", new Object[]{this});
        }
        return this.b;
    }

    public JSONObject j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cbba7bea", new Object[]{this});
        }
        return this.c;
    }

    public int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("276ff3e7", new Object[]{this})).intValue();
        }
        return this.d.b;
    }

    public int l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("59df9a50", new Object[]{this})).intValue();
        }
        return this.d.f24727a;
    }

    public DXRootView m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("52cdab33", new Object[]{this});
        }
        return this.f24725a;
    }

    public nh() {
        this.d = new c();
    }
}
