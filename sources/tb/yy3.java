package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetRefreshOption;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class yy3 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final long DX_EVENT_CCOLLECT = 1705841522006820657L;

    /* renamed from: a  reason: collision with root package name */
    public final qpu f32412a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        static {
            t2o.a(918552714);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class b implements qff {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ bgc c;
        public final /* synthetic */ JSONObject d;
        public final /* synthetic */ DXRuntimeContext e;

        public b(boolean z, bgc bgcVar, JSONObject jSONObject, DXRuntimeContext dXRuntimeContext) {
            this.b = z;
            this.c = bgcVar;
            this.d = jSONObject;
            this.e = dXRuntimeContext;
        }

        @Override // tb.qff
        public void onFail(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("239cc86e", new Object[]{this, str});
            } else {
                ckf.g(str, "errorCode");
            }
        }

        @Override // tb.qff
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
            } else {
                yy3.a(yy3.this, this.d, this.b, this.e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class c implements qff {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ bgc c;
        public final /* synthetic */ JSONObject d;
        public final /* synthetic */ DXRuntimeContext e;

        public c(boolean z, bgc bgcVar, JSONObject jSONObject, DXRuntimeContext dXRuntimeContext) {
            this.b = z;
            this.c = bgcVar;
            this.d = jSONObject;
            this.e = dXRuntimeContext;
        }

        @Override // tb.qff
        public void onFail(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("239cc86e", new Object[]{this, str});
            } else {
                ckf.g(str, "errorCode");
            }
        }

        @Override // tb.qff
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
            } else {
                yy3.a(yy3.this, this.d, this.b, this.e);
            }
        }
    }

    static {
        t2o.a(918552713);
    }

    public yy3(qpu qpuVar) {
        ckf.g(qpuVar, "context");
        this.f32412a = qpuVar;
    }

    public static final /* synthetic */ void a(yy3 yy3Var, JSONObject jSONObject, boolean z, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e4a80a5", new Object[]{yy3Var, jSONObject, new Boolean(z), dXRuntimeContext});
        } else {
            yy3Var.b(jSONObject, z, dXRuntimeContext);
        }
    }

    public static /* synthetic */ Object ipc$super(yy3 yy3Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dressup/common/service/dx/CollectDXEventHandler");
    }

    @Override // tb.ob5, tb.mvb
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
            return;
        }
        ckf.g(objArr, "args");
        ckf.g(dXRuntimeContext, "runtimeContext");
        super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        ckf.g(dXEvent, "event");
        ckf.g(objArr, "args");
        ckf.g(dXRuntimeContext, "runtimeContext");
        JSONObject jSONObject = dXRuntimeContext.i().getJSONObject("interact");
        String str = null;
        boolean b2 = mqu.Companion.b(jSONObject != null ? jSONObject.getBoolean("wishStatus") : null, false);
        JSONObject jSONObject2 = dXRuntimeContext.i().getJSONObject("content");
        if (jSONObject2 != null) {
            str = jSONObject2.getString("id");
        }
        bgc bgcVar = (bgc) this.f32412a.getService(bgc.class);
        if (str == null) {
            return;
        }
        if (b2) {
            bgcVar.j1(str, new b(b2, bgcVar, jSONObject, dXRuntimeContext));
        } else {
            bgcVar.K0(str, new c(b2, bgcVar, jSONObject, dXRuntimeContext));
        }
    }

    public final void b(JSONObject jSONObject, boolean z, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54162437", new Object[]{this, jSONObject, new Boolean(z), dXRuntimeContext});
            return;
        }
        if (jSONObject != null) {
            jSONObject.put((JSONObject) "wishStatus", (String) Boolean.valueOf(!z));
        }
        DXWidgetNode W = dXRuntimeContext.W();
        ckf.f(W, "runtimeContext.widgetNode");
        W.getEngine().I0(dXRuntimeContext.W().queryRootWidgetNode(), 0, new DXWidgetRefreshOption.a().d(true).g(true).c(3).a());
    }
}
