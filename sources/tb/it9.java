package tb;

import com.ali.user.mobile.login.model.LoginConstant;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetRefreshOption;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class it9 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final long DX_EVENT_CFOLLOW = 4724673374545221981L;

    /* renamed from: a  reason: collision with root package name */
    public final qpu f21565a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        static {
            t2o.a(918552745);
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
        public final /* synthetic */ JSONObject b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ DXRuntimeContext d;

        public b(JSONObject jSONObject, boolean z, DXRuntimeContext dXRuntimeContext) {
            this.b = jSONObject;
            this.c = z;
            this.d = dXRuntimeContext;
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
                it9.a(it9.this, this.b, this.c, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class c implements qff {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ JSONObject b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ DXRuntimeContext d;

        public c(JSONObject jSONObject, boolean z, DXRuntimeContext dXRuntimeContext) {
            this.b = jSONObject;
            this.c = z;
            this.d = dXRuntimeContext;
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
                it9.a(it9.this, this.b, this.c, this.d);
            }
        }
    }

    static {
        t2o.a(918552744);
    }

    public it9(qpu qpuVar) {
        ckf.g(qpuVar, "context");
        this.f21565a = qpuVar;
    }

    public static final /* synthetic */ void a(it9 it9Var, JSONObject jSONObject, boolean z, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2abc1c52", new Object[]{it9Var, jSONObject, new Boolean(z), dXRuntimeContext});
        } else {
            it9Var.b(jSONObject, z, dXRuntimeContext);
        }
    }

    public static /* synthetic */ Object ipc$super(it9 it9Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dressup/common/service/dx/FollowDXEventHandler");
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
        String str;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        ckf.g(dXEvent, "event");
        ckf.g(objArr, "args");
        ckf.g(dXRuntimeContext, "runtimeContext");
        JSONObject jSONObject = dXRuntimeContext.i().getJSONObject(LoginConstant.ACCOUNT);
        boolean b2 = mqu.Companion.b(jSONObject != null ? jSONObject.getBoolean(com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_FOLLOWED) : null, false);
        bgc bgcVar = (bgc) this.f21565a.getService(bgc.class);
        String str2 = "";
        if (jSONObject == null || (str = jSONObject.getString("cryptoId")) == null) {
            str = str2;
        }
        if (!(jSONObject == null || (string = jSONObject.getString("cryptoKeyName")) == null)) {
            str2 = string;
        }
        if (b2) {
            bgcVar.f0(str, str2, new b(jSONObject, b2, dXRuntimeContext));
        } else {
            bgcVar.v1(str, str2, new c(jSONObject, b2, dXRuntimeContext));
        }
    }

    public final void b(JSONObject jSONObject, boolean z, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54162437", new Object[]{this, jSONObject, new Boolean(z), dXRuntimeContext});
            return;
        }
        if (jSONObject != null) {
            jSONObject.put((JSONObject) com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_FOLLOWED, (String) Boolean.valueOf(!z));
        }
        DXWidgetNode W = dXRuntimeContext.W();
        ckf.f(W, "runtimeContext.widgetNode");
        W.getEngine().I0(dXRuntimeContext.W().queryRootWidgetNode(), 0, new DXWidgetRefreshOption.a().d(true).g(true).c(3).a());
    }
}
