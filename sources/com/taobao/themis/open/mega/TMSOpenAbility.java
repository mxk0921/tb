package com.taobao.themis.open.mega;

import android.app.Activity;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsOpenAbility;
import com.taobao.android.abilityidl.ability.OpenLoadSubPackageResult;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.CommonExtKt;
import com.taobao.themis.open.ability.TMSSubPackageBridge;
import com.taobao.themis.open.permission.auth.AuthUtils;
import com.taobao.themis.open.permission.auth.TMSAuthHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import tb.a5l;
import tb.arf;
import tb.b3l;
import tb.bbs;
import tb.ckf;
import tb.d4l;
import tb.d7h;
import tb.kdb;
import tb.n3d;
import tb.r3l;
import tb.r8s;
import tb.t2o;
import tb.t3d;
import tb.wsq;
import tb.x2l;
import tb.yj1;
import tb.yz3;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J'\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/taobao/themis/open/mega/TMSOpenAbility;", "Lcom/taobao/android/abilityidl/ability/AbsOpenAbility;", "<init>", "()V", "Ltb/kdb;", "context", "Ltb/d4l;", "params", "Ltb/n3d;", "callback", "Ltb/xhv;", "check", "(Ltb/kdb;Ltb/d4l;Ltb/n3d;)V", "Ltb/b3l;", "checkAuth", "(Ltb/kdb;Ltb/b3l;Ltb/n3d;)V", "clearAccessToken", "(Ltb/kdb;Ltb/n3d;)V", "getAuthTokenInfo", "Ltb/x2l;", "getAuthorize", "(Ltb/kdb;Ltb/x2l;Ltb/n3d;)V", "Ltb/r3l;", "getSetting", "(Ltb/kdb;Ltb/r3l;Ltb/n3d;)V", "Ltb/a5l;", "Ltb/t3d;", "loadSubPackage", "(Ltb/kdb;Ltb/a5l;Ltb/t3d;)V", "themis_open_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TMSOpenAbility extends AbsOpenAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements d7h.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ n3d f13638a;

        public a(n3d n3dVar) {
            this.f13638a = n3dVar;
        }

        @Override // tb.d7h.a
        public void onFail() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd42bfa4", new Object[]{this});
            } else {
                this.f13638a.O(ErrorResult.a.e("能力禁止调用"));
            }
        }

        @Override // tb.d7h.a
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                return;
            }
            n3d n3dVar = this.f13638a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "hasPermission", (String) Boolean.TRUE);
            n3dVar.onSuccess(jSONObject);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements TMSAuthHelper.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ n3d f13639a;

        public b(n3d n3dVar) {
            this.f13639a = n3dVar;
        }

        @Override // com.taobao.themis.open.permission.auth.TMSAuthHelper.a
        public void a(boolean z, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6002e1c7", new Object[]{this, new Boolean(z), jSONObject});
                return;
            }
            ckf.g(jSONObject, "result");
            this.f13639a.onSuccess(jSONObject);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c implements BridgeCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ t3d f13640a;

        public c(t3d t3dVar) {
            this.f13640a = t3dVar;
        }

        @Override // com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback
        public void sendBridgeResponse(BridgeResponse bridgeResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fa9dfe87", new Object[]{this, bridgeResponse});
            } else if (ckf.b(bridgeResponse, BridgeResponse.SUCCESS)) {
                t3d t3dVar = this.f13640a;
                OpenLoadSubPackageResult openLoadSubPackageResult = new OpenLoadSubPackageResult();
                openLoadSubPackageResult.result = Boolean.TRUE;
                t3dVar.k(openLoadSubPackageResult);
            } else {
                this.f13640a.O(ErrorResult.a.e(null));
            }
        }

        @Override // com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback
        public void sendJSONResponse(JSONObject jSONObject, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56830cbc", new Object[]{this, jSONObject, new Boolean(z)});
            }
        }

        @Override // com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback
        public void sendJSONResponse(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3456c918", new Object[]{this, jSONObject});
                return;
            }
            t3d t3dVar = this.f13640a;
            OpenLoadSubPackageResult openLoadSubPackageResult = new OpenLoadSubPackageResult();
            openLoadSubPackageResult.result = Boolean.TRUE;
            Long l = null;
            openLoadSubPackageResult.strategy = jSONObject == null ? null : jSONObject.getString("strategy");
            if (jSONObject != null) {
                l = jSONObject.getLong("fileSize");
            }
            openLoadSubPackageResult.fileSize = l;
            t3dVar.k(openLoadSubPackageResult);
        }
    }

    static {
        t2o.a(843055268);
    }

    public static /* synthetic */ Object ipc$super(TMSOpenAbility tMSOpenAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/open/mega/TMSOpenAbility");
    }

    @Override // com.taobao.android.abilityidl.ability.AbsOpenAbility
    public void check(kdb kdbVar, d4l d4lVar, n3d n3dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dbfd9a9", new Object[]{this, kdbVar, d4lVar, n3dVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(d4lVar, "params");
        ckf.g(n3dVar, "callback");
    }

    @Override // com.taobao.android.abilityidl.ability.AbsOpenAbility
    public void checkAuth(kdb kdbVar, b3l b3lVar, n3d n3dVar) {
        List list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56a96438", new Object[]{this, kdbVar, b3lVar, n3dVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(b3lVar, "params");
        ckf.g(n3dVar, "callback");
        bbs g = CommonExtKt.g(kdbVar);
        if (g == null) {
            n3dVar.O(ErrorResult.a.d("容器页面未找到"));
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        List h = arf.h(b3lVar.f16157a, String.class);
        if (h == null) {
            list = yz3.i();
        } else {
            list = h;
        }
        arrayList.addAll(list);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            d7h d7hVar = d7h.INSTANCE;
            TMSMetaInfoWrapper U = g.U();
            linkedHashMap.put(str, d7hVar.d(str, U == null ? null : U.w()));
        }
        d7h.INSTANCE.b(g, linkedHashMap, new a(n3dVar));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsOpenAbility
    public void clearAccessToken(kdb kdbVar, n3d n3dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a31c3c17", new Object[]{this, kdbVar, n3dVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(n3dVar, "callback");
        bbs g = CommonExtKt.g(kdbVar);
        if (g == null) {
            n3dVar.O(ErrorResult.a.d("容器实例未找到"));
            return;
        }
        AuthUtils.INSTANCE.d(g);
        n3dVar.onSuccess(new JSONObject());
    }

    @Override // com.taobao.android.abilityidl.ability.AbsOpenAbility
    public void getAuthTokenInfo(kdb kdbVar, n3d n3dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30bba338", new Object[]{this, kdbVar, n3dVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(n3dVar, "callback");
        bbs g = CommonExtKt.g(kdbVar);
        if (g == null) {
            n3dVar.O(ErrorResult.a.d("容器实例未找到"));
            return;
        }
        JSONObject o = AuthUtils.INSTANCE.o(g);
        if (o == null) {
            o = new JSONObject();
        }
        n3dVar.onSuccess(o);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsOpenAbility
    public void getAuthorize(kdb kdbVar, x2l x2lVar, n3d n3dVar) {
        List list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9406c0e", new Object[]{this, kdbVar, x2lVar, n3dVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(x2lVar, "params");
        ckf.g(n3dVar, "callback");
        ITMSPage h = CommonExtKt.h(kdbVar);
        if (h == null) {
            n3dVar.O(ErrorResult.a.d("容器页面未找到"));
            return;
        }
        bbs instance = h.getInstance();
        ArrayList arrayList = new ArrayList();
        List h2 = arf.h(x2lVar.f31103a, String.class);
        if (h2 == null) {
            list = yz3.i();
        } else {
            list = h2;
        }
        arrayList.addAll(list);
        yj1 yj1Var = new yj1();
        yj1Var.f(x2lVar.c);
        yj1Var.j(x2lVar.d);
        yj1Var.g("getAuthorize");
        yj1Var.i(x2lVar.b);
        JSONObject jSONObject = new JSONObject();
        Map<String, ? extends Object> map = x2lVar.e;
        if (map != null) {
            jSONObject.putAll(map);
        }
        yj1Var.h(jSONObject);
        yj1Var.k(arrayList);
        Activity I = instance.I();
        ckf.f(I, "instance.activity");
        new TMSAuthHelper(I, yj1Var, instance, h, new b(n3dVar)).k();
    }

    @Override // com.taobao.android.abilityidl.ability.AbsOpenAbility
    public void loadSubPackage(kdb kdbVar, a5l a5lVar, t3d t3dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eb95d64", new Object[]{this, kdbVar, a5lVar, t3dVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(a5lVar, "params");
        ckf.g(t3dVar, "callback");
        ITMSPage h = CommonExtKt.h(kdbVar);
        if (h == null) {
            t3dVar.O(ErrorResult.a.d("容器页面未找到"));
            return;
        }
        bbs instance = h.getInstance();
        String str = a5lVar.f15553a;
        if (str == null || wsq.a0(str)) {
            t3dVar.O(ErrorResult.a.g("subPackageID is invalid"));
            return;
        }
        String str2 = a5lVar.f15553a;
        ckf.d(str2);
        TMSSubPackageBridge.loadSubPackage(instance, str2, new c(t3dVar));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsOpenAbility
    public void getSetting(kdb kdbVar, r3l r3lVar, n3d n3dVar) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89f0639e", new Object[]{this, kdbVar, r3lVar, n3dVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(r3lVar, "params");
        ckf.g(n3dVar, "callback");
        bbs g = CommonExtKt.g(kdbVar);
        if (g == null) {
            n3dVar.O(ErrorResult.a.d("容器实例未找到"));
            return;
        }
        AuthUtils authUtils = AuthUtils.INSTANCE;
        String j = r8s.j(g);
        String L = g.L();
        ckf.f(L, "instance.appId");
        Boolean bool = r3lVar.f27087a;
        if (bool != null) {
            z = bool.booleanValue();
        }
        n3dVar.onSuccess(authUtils.j(g, j, L, z));
    }
}
