package tb;

import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.ApiContext;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.open.permission.auth.AuthUtils;
import com.taobao.themis.open.permission.check.PermissionResult;
import com.taobao.themis.open.permission.check.TMSPermissionManager;
import tb.d7h;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class czl extends g11 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public final JSONObject c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(843055310);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements d7h.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ApiContext b;
        public final /* synthetic */ Object[] c;
        public final /* synthetic */ uq d;

        public b(ApiContext apiContext, Object[] objArr, uq uqVar) {
            this.b = apiContext;
            this.c = objArr;
            this.d = uqVar;
        }

        @Override // tb.d7h.a
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
            } else {
                czl.this.b.a(this.b, this.c, this.d);
            }
        }

        @Override // tb.d7h.a
        public void onFail() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd42bfa4", new Object[]{this});
            } else {
                this.d.a(jr.e("2001", BridgeResponse.ERROR_MSG_NOT_GRANT_ERROR), false);
            }
        }
    }

    static {
        t2o.a(843055309);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czl(f11 f11Var, JSONObject jSONObject) {
        super(f11Var);
        ckf.g(f11Var, "meta");
        ckf.g(jSONObject, "originParams");
        this.c = jSONObject;
    }

    public static /* synthetic */ Object ipc$super(czl czlVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/open/permission/PermissionMiddleware");
    }

    @Override // tb.e11
    public Object a(ApiContext apiContext, Object[] objArr, uq uqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("dc3d69ec", new Object[]{this, apiContext, objArr, uqVar});
        }
        ckf.g(apiContext, "context");
        ckf.g(objArr, "args");
        ckf.g(uqVar, "callback");
        TMSLogger.a("PermissionMiddleware", "check permission for method : [" + ((Object) this.f18200a.f18931a) + ']');
        TMSPermissionManager tMSPermissionManager = TMSPermissionManager.INSTANCE;
        bbs b2 = apiContext.b();
        String str = this.f18200a.f18931a;
        ckf.f(str, "apiMeta.apiName");
        if (!tMSPermissionManager.e(b2, str, this.c) || !apiContext.f()) {
            TMSLogger.a("PermissionMiddleware", "not need to check permission");
            return this.b.a(apiContext, objArr, uqVar);
        }
        PermissionResult b3 = tMSPermissionManager.b(this.f18200a.f18931a, this.c, apiContext);
        TMSLogger.a("PermissionMiddleware", ckf.p("checkPermission result : ", b3));
        if (b3 != PermissionResult.IGNORE && b3 != PermissionResult.ALLOW) {
            uqVar.a(jr.f("4", BridgeResponse.ERROR_MSG_FORBIDDEN_ERROR, b3.getSignature()), false);
            return null;
        } else if (!AuthUtils.INSTANCE.b(apiContext.b())) {
            return this.b.a(apiContext, objArr, uqVar);
        } else {
            TMSLogger.a("PermissionMiddleware", "[" + ((Object) this.f18200a.f18931a) + "] need local auth");
            d7h d7hVar = d7h.INSTANCE;
            String str2 = this.f18200a.f18931a;
            ckf.f(str2, "apiMeta.apiName");
            d7hVar.a(str2, this.c, apiContext, new b(apiContext, objArr, uqVar));
            return null;
        }
    }
}
