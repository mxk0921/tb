package com.taobao.themis.open.permission.auth;

import android.text.TextUtils;
import com.ali.user.open.core.util.ParamsConstants;
import com.alibaba.ariver.resource.api.models.PermissionModel;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.TriggerChannelService;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.network.IMtopInnerAdapter;
import com.taobao.themis.kernel.utils.TMSInstanceExtKt;
import com.taobao.themis.open.permission.auth.model.DomainItemEntity;
import com.taobao.themis.open.permission.auth.model.ResourceItemEntity;
import com.taobao.themis.open.permission.auth.model.ScopeEntity;
import com.taobao.themis.open.permission.auth.model.ScopeSettingEntity;
import com.taobao.weex.common.Constants;
import com.vivo.push.BuildConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.b;
import tb.arf;
import tb.bbs;
import tb.ck1;
import tb.ckf;
import tb.d7h;
import tb.i04;
import tb.jpu;
import tb.p8s;
import tb.q9s;
import tb.r8s;
import tb.rb;
import tb.t2o;
import tb.wsq;
import tb.xhv;
import tb.yj1;
import tb.yz3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class AuthUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final AuthUtils INSTANCE = new AuthUtils();

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<String, String> f13652a = kotlin.collections.a.i(jpu.a("scope.getStepsStatus", MspDBHelper.BizEntry.COLUMN_NAME_DEVICE), jpu.a(d7h.CONST_SCOPE_CAMERA, MspDBHelper.BizEntry.COLUMN_NAME_DEVICE), jpu.a("scope.skinCamera", MspDBHelper.BizEntry.COLUMN_NAME_DEVICE), jpu.a("scope.clipboard", MspDBHelper.BizEntry.COLUMN_NAME_DEVICE), jpu.a(d7h.CONST_SCOPE_RECORD, MspDBHelper.BizEntry.COLUMN_NAME_DEVICE), jpu.a(d7h.CONST_SCOPE_WRITE_PHOTOS_ALBUM, MspDBHelper.BizEntry.COLUMN_NAME_DEVICE), jpu.a("scope.addCalenderPlan", MspDBHelper.BizEntry.COLUMN_NAME_DEVICE), jpu.a(d7h.CONST_SCOPE_USERLOCATION, MspDBHelper.BizEntry.COLUMN_NAME_DEVICE));

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/taobao/themis/open/permission/auth/AuthUtils$InvokeType;", "", "name", "", "(Ljava/lang/String;ILjava/lang/String;)V", "TYPE_ORIGIN", "TYPE_CLIENT", "themis_open_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class InvokeType extends Enum<InvokeType> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final InvokeType TYPE_ORIGIN = new InvokeType("TYPE_ORIGIN", 0, "miniapp-vision");
        public static final InvokeType TYPE_CLIENT = new InvokeType("TYPE_CLIENT", 1, "client-vision");
        private static final /* synthetic */ InvokeType[] $VALUES = $values();

        private static final /* synthetic */ InvokeType[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (InvokeType[]) ipChange.ipc$dispatch("a8e7092", new Object[0]) : new InvokeType[]{TYPE_ORIGIN, TYPE_CLIENT};
        }

        private InvokeType(String str, int i, String str2) {
        }

        public static /* synthetic */ Object ipc$super(InvokeType invokeType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/open/permission/auth/AuthUtils$InvokeType");
        }

        public static InvokeType valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("bed26407", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(InvokeType.class, str);
            }
            return (InvokeType) valueOf;
        }

        public static InvokeType[] values() {
            Object clone;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                clone = ipChange.ipc$dispatch("b80d0136", new Object[0]);
            } else {
                clone = $VALUES.clone();
            }
            return (InvokeType[]) clone;
        }
    }

    public static final /* synthetic */ Map a(AuthUtils authUtils, bbs bbsVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4dd5900c", new Object[]{authUtils, bbsVar, str, str2});
        }
        return authUtils.h(bbsVar, str, str2);
    }

    public final boolean b(bbs bbsVar) {
        TMSMetaInfoWrapper U;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f019d2ff", new Object[]{this, bbsVar})).booleanValue();
        }
        if (bbsVar == null || (U = bbsVar.U()) == null) {
            return false;
        }
        return U.t();
    }

    public final void c(bbs bbsVar, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c523888f", new Object[]{this, bbsVar, str, jSONObject});
            return;
        }
        ckf.g(bbsVar, "instance");
        if (!ckf.b("FAIL_SYS_TOPAUTH_ACCESSTOKENEXPIRED_ERROR", str)) {
            if (!ckf.b(jSONObject == null ? null : jSONObject.getString(rb.RESULT_KEY), "[\"FAIL_SYS_AUTH_CHECK_FAILED::TOPAUTH_ACCESSTOKEN_EXPIRED\"]")) {
                return;
            }
        }
        ck1.INSTANCE.o(r8s.j(bbsVar));
        e(bbsVar);
    }

    public final void d(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b5f4dcb", new Object[]{this, bbsVar});
            return;
        }
        ckf.g(bbsVar, "instance");
        ck1.INSTANCE.o(r8s.j(bbsVar));
    }

    public final void e(bbs bbsVar) {
        PermissionModel w;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("877fe616", new Object[]{this, bbsVar});
            return;
        }
        ckf.g(bbsVar, "instance");
        TMSMetaInfoWrapper U = bbsVar.U();
        JSONObject jSONObject = null;
        if (!(U == null || (w = U.w()) == null)) {
            jSONObject = w.getNativeApiScopeConfig();
        }
        if (jSONObject != null) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                Object value = entry.getValue();
                if (value == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                } else if (ckf.b(((JSONObject) value).getString("authRange"), "taobaoAccount")) {
                    ck1 ck1Var = ck1.INSTANCE;
                    String j = r8s.j(bbsVar);
                    String key = entry.getKey();
                    ckf.f(key, "it.key");
                    ck1Var.n(j, key);
                }
            }
        }
    }

    public final Map<String, Object> g(bbs bbsVar, yj1 yj1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("452aafd", new Object[]{this, bbsVar, yj1Var});
        }
        ckf.g(bbsVar, "instance");
        ckf.g(yj1Var, "requestModel");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("mainAppId", r8s.s(bbsVar));
        linkedHashMap.put("invokerAppId", r8s.p(bbsVar, yj1Var.c()));
        String l = TMSInstanceExtKt.l(bbsVar);
        if (l != null) {
            linkedHashMap.put("sceneId", l);
        }
        return linkedHashMap;
    }

    public final List<ScopeSettingEntity> i(bbs bbsVar, InvokeType invokeType, String str, String str2) {
        Set<String> set;
        Set<String> set2;
        TMSMetaInfoWrapper U;
        PermissionModel w;
        JSONObject nativeApiScopeConfig;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ff293368", new Object[]{this, bbsVar, invokeType, str, str2});
        }
        ckf.g(invokeType, "invokeType");
        ckf.g(str, "appKey");
        ckf.g(str2, "appId");
        if (invokeType == InvokeType.TYPE_ORIGIN) {
            set = null;
            if (bbsVar == null || (U = bbsVar.U()) == null || (w = U.w()) == null || (nativeApiScopeConfig = w.getNativeApiScopeConfig()) == null) {
                set2 = null;
            } else {
                set2 = nativeApiScopeConfig.keySet();
            }
            if (set2 != null && !set2.isEmpty()) {
                set = set2;
            }
            if (set == null) {
                set = t(str2, str);
            }
        } else {
            set = t(str2, str);
        }
        return s(bbsVar, l(str, str2, set), invokeType, str, str2);
    }

    public final Map<String, String> k() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fcf5194f", new Object[]{this});
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String Z2 = q9s.Z2();
        xhv xhvVar = null;
        if (Z2.length() > 0) {
            str = Z2;
        } else {
            str = null;
        }
        if (str != null) {
            try {
                for (String str2 : wsq.z0(str, new String[]{","}, false, 0, 6, null)) {
                    linkedHashMap.put(str2, MspDBHelper.BizEntry.COLUMN_NAME_DEVICE);
                }
                xhvVar = xhv.INSTANCE;
            } catch (Throwable th) {
                Result.m1108constructorimpl(b.a(th));
            }
        }
        Result.m1108constructorimpl(xhvVar);
        if (linkedHashMap.isEmpty()) {
            return f13652a;
        }
        return linkedHashMap;
    }

    public final Map<String, Boolean> l(String str, String str2, Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("34fe1aa8", new Object[]{this, str, str2, set});
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str3 : set) {
            ck1 ck1Var = ck1.INSTANCE;
            Boolean c = ck1Var.c(str, str3);
            if (c == null) {
                Boolean i = ck1Var.i(str, str3);
                if (i != null) {
                    linkedHashMap.put(str3, i);
                } else if (ck1Var.e(str2).contains(str3) && !linkedHashMap.containsKey(str3)) {
                    linkedHashMap.put(str3, Boolean.FALSE);
                }
            } else {
                linkedHashMap.put(str3, c);
            }
        }
        return linkedHashMap;
    }

    public final Map<String, String> m(bbs bbsVar, List<String> list) {
        PermissionModel w;
        JSONObject nativeApiScopeConfig;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c31940cd", new Object[]{this, bbsVar, list});
        }
        ckf.g(bbsVar, "instance");
        ckf.g(list, "requestScopeNicks");
        HashMap hashMap = new HashMap();
        TMSMetaInfoWrapper U = bbsVar.U();
        if (!(U == null || (w = U.w()) == null || (nativeApiScopeConfig = w.getNativeApiScopeConfig()) == null)) {
            for (String str : list) {
                if (nativeApiScopeConfig.get(str) != null) {
                    String string = nativeApiScopeConfig.getJSONObject(str).getString("authRange");
                    ckf.f(string, "nativeApiScopeConfig.get…k).getString(\"authRange\")");
                    hashMap.put(str, string);
                }
            }
        }
        return hashMap.isEmpty() ? k() : hashMap;
    }

    public final String n(bbs bbsVar) {
        String str;
        Long l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c07f2f6e", new Object[]{this, bbsVar});
        }
        ckf.g(bbsVar, "instance");
        JSONObject i = arf.i(ck1.INSTANCE.f(r8s.j(bbsVar)));
        if (i == null) {
            str = null;
        } else {
            str = i.getString("accessToken");
        }
        long j = -1;
        if (!(i == null || (l = i.getLong("expirationTime")) == null)) {
            j = l.longValue();
        }
        if (!TextUtils.isEmpty(str) && j > System.currentTimeMillis()) {
            return str;
        }
        e(bbsVar);
        return null;
    }

    public final JSONObject o(bbs bbsVar) {
        String str;
        Long l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cdd65a60", new Object[]{this, bbsVar});
        }
        ckf.g(bbsVar, "instance");
        JSONObject i = arf.i(ck1.INSTANCE.f(r8s.j(bbsVar)));
        if (i == null) {
            str = null;
        } else {
            str = i.getString("accessToken");
        }
        long j = -1;
        if (!(i == null || (l = i.getLong("expirationTime")) == null)) {
            j = l.longValue();
        }
        if (!TextUtils.isEmpty(str) && j > System.currentTimeMillis()) {
            return i;
        }
        e(bbsVar);
        return null;
    }

    public final boolean p(bbs bbsVar, String str) {
        PermissionModel w;
        Set<String> ignorePermissionCheckMtopApi;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98fa8edc", new Object[]{this, bbsVar, str})).booleanValue();
        }
        TMSMetaInfoWrapper U = bbsVar.U();
        if (U == null || (w = U.w()) == null || (ignorePermissionCheckMtopApi = w.getIgnorePermissionCheckMtopApi()) == null || !ignorePermissionCheckMtopApi.contains(str)) {
            return false;
        }
        return true;
    }

    public final boolean r(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d6c3744", new Object[]{this, str, map})).booleanValue();
        }
        ckf.g(str, Constants.Name.SCOPE);
        return ckf.b(MspDBHelper.BizEntry.COLUMN_NAME_DEVICE, map == null ? null : map.get(str));
    }

    public final void u(bbs bbsVar, InvokeType invokeType, String str, String str2, List<ScopeSettingEntity> list) {
        Executor executor;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac26d25d", new Object[]{this, bbsVar, invokeType, str, str2, list});
            return;
        }
        ckf.g(invokeType, "invokeType");
        ckf.g(str, "appId");
        ckf.g(str2, "appKey");
        ckf.g(list, "scopeList");
        IExecutorService iExecutorService = (IExecutorService) p8s.b(IExecutorService.class);
        if (iExecutorService != null && (executor = iExecutorService.getExecutor(ExecutorType.NETWORK)) != null) {
            executor.execute(new a(list, bbsVar, str2, str, invokeType));
        }
    }

    public final boolean f(bbs bbsVar) {
        JSONObject v;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f737711a", new Object[]{this, bbsVar})).booleanValue();
        }
        TMSMetaInfoWrapper U = bbsVar.U();
        if (U == null || (v = U.v()) == null || (jSONObject = v.getJSONObject("moreControl")) == null) {
            return false;
        }
        return ckf.b(jSONObject.getBoolean("mtopApiListCheck"), Boolean.TRUE);
    }

    public final boolean q(bbs bbsVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("505ad25d", new Object[]{this, bbsVar, str, str2})).booleanValue();
        }
        ckf.g(bbsVar, "instance");
        ckf.g(str2, "api");
        TMSMetaInfoWrapper U = bbsVar.U();
        String str3 = null;
        PermissionModel permissionModel = null;
        String m = U == null ? null : U.m();
        if (m == null) {
            TMSMetaInfoWrapper U2 = bbsVar.U();
            if (U2 != null) {
                permissionModel = U2.w();
            }
            return permissionModel != null;
        }
        TMSMetaInfoWrapper U3 = bbsVar.U();
        if (U3 != null) {
            str3 = U3.n();
        }
        if (ckf.b(m, "thirdParty")) {
            return !p(bbsVar, str2);
        }
        if (f(bbsVar) && !p(bbsVar, str2)) {
            return true;
        }
        if (str == null || str.length() == 0 || str3 == null || str3.length() == 0) {
            return false;
        }
        return !ckf.b(str, str3);
    }

    static {
        t2o.a(843055313);
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List<ScopeSettingEntity> f13653a;
        public final /* synthetic */ bbs b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ InvokeType e;

        public a(List<ScopeSettingEntity> list, bbs bbsVar, String str, String str2, InvokeType invokeType) {
            this.f13653a = list;
            this.b = bbsVar;
            this.c = str;
            this.d = str2;
            this.e = invokeType;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object obj;
            Object obj2;
            IMtopInnerAdapter.Response response;
            List<ScopeEntity> scopes;
            List<ScopeEntity> scopes2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            HashMap hashMap = new HashMap();
            ArrayList arrayList = new ArrayList();
            List<ScopeSettingEntity> list = this.f13653a;
            String str = this.c;
            boolean z = false;
            boolean z2 = false;
            for (ScopeSettingEntity scopeSettingEntity : i04.B0(this.f13653a)) {
                String type = scopeSettingEntity.getType();
                if (type != null) {
                    int hashCode = type.hashCode();
                    if (hashCode != -341064690) {
                        if (hashCode != 115029) {
                            if (hashCode == 1874684019 && type.equals("platform")) {
                                String sceneCode = scopeSettingEntity.getSceneCode();
                                if (!(sceneCode == null || sceneCode.length() == 0)) {
                                    ck1 ck1Var = ck1.INSTANCE;
                                    String sceneCode2 = scopeSettingEntity.getSceneCode();
                                    ckf.d(sceneCode2);
                                    ck1Var.b(sceneCode2);
                                }
                                if (!z && (scopes = scopeSettingEntity.getScopes()) != null) {
                                    for (ScopeEntity scopeEntity : scopes) {
                                        if (scopeEntity.isChanged()) {
                                            z = true;
                                        }
                                    }
                                    xhv xhvVar = xhv.INSTANCE;
                                }
                            }
                        } else if (type.equals("top") && (scopes2 = scopeSettingEntity.getScopes()) != null) {
                            for (ScopeEntity scopeEntity2 : scopes2) {
                                if (scopeEntity2.getScope() != null) {
                                    if (ckf.b(scopeEntity2.getAuthRange(), MspDBHelper.BizEntry.COLUMN_NAME_DEVICE)) {
                                        ck1 ck1Var2 = ck1.INSTANCE;
                                        String scope = scopeEntity2.getScope();
                                        ckf.d(scope);
                                        ck1Var2.t(str, scope, scopeEntity2.getStatus());
                                    }
                                    if (ckf.b(scopeEntity2.getAuthRange(), "taobaoAccount")) {
                                        if (scopeEntity2.isChanged()) {
                                            z = true;
                                        }
                                        String scope2 = scopeEntity2.getScope();
                                        ckf.d(scope2);
                                        hashMap.put(scope2, Boolean.valueOf(scopeEntity2.getStatus()));
                                    }
                                }
                            }
                            xhv xhvVar2 = xhv.INSTANCE;
                        }
                    } else if (type.equals("resource") && scopeSettingEntity.getDomainItems() != null) {
                        List<DomainItemEntity> domainItems = scopeSettingEntity.getDomainItems();
                        ckf.d(domainItems);
                        arrayList.addAll(domainItems);
                        list.remove(scopeSettingEntity);
                        if (!z2) {
                            List<DomainItemEntity> domainItems2 = scopeSettingEntity.getDomainItems();
                            ckf.d(domainItems2);
                            for (DomainItemEntity domainItemEntity : domainItems2) {
                                if (domainItemEntity.isChanged()) {
                                    z2 = true;
                                } else {
                                    List<ResourceItemEntity> resourceItems = domainItemEntity.getResourceItems();
                                    if (resourceItems != null) {
                                        for (ResourceItemEntity resourceItemEntity : resourceItems) {
                                            if (resourceItemEntity.isChanged()) {
                                                z2 = true;
                                            }
                                        }
                                        xhv xhvVar3 = xhv.INSTANCE;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (z) {
                Map a2 = AuthUtils.a(AuthUtils.INSTANCE, this.b, this.c, this.d);
                a2.put("scopeParam", JSON.toJSONString(this.f13653a));
                a2.put(TriggerChannelService.EXTRA_ORIGIN, this.e.name());
                IMtopInnerAdapter iMtopInnerAdapter = (IMtopInnerAdapter) p8s.b(IMtopInnerAdapter.class);
                JSONObject jSONObject = null;
                if (iMtopInnerAdapter == null) {
                    response = null;
                } else {
                    bbs bbsVar = this.b;
                    response = IMtopInnerAdapter.a.b(iMtopInnerAdapter, "mtop.taobao.openlink.miniapp.auth.scope.update.status", "1.0", a2, null, true, bbsVar == null ? null : r8s.a(bbsVar), null, null, null, 456, null);
                }
                if (response != null && response.getSuccess()) {
                    JSONObject data = response.getData();
                    if (data != null) {
                        jSONObject = data.getJSONObject("data");
                    }
                    if (jSONObject != null) {
                        JSONObject data2 = response.getData();
                        ckf.d(data2);
                        JSONObject jSONObject2 = data2.getJSONObject("data");
                        String str2 = this.c;
                        for (Map.Entry entry : hashMap.entrySet()) {
                            ck1.INSTANCE.q(str2, (String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
                        }
                        Boolean bool = jSONObject2.getBoolean("invalidToken");
                        if (bool == null ? false : bool.booleanValue()) {
                            ck1.INSTANCE.o(this.c);
                            bbs bbsVar2 = this.b;
                            if (bbsVar2 != null) {
                                AuthUtils.INSTANCE.e(bbsVar2);
                                xhv xhvVar4 = xhv.INSTANCE;
                            }
                        } else {
                            String string = jSONObject2.getString("expirationTime");
                            String string2 = jSONObject2.getString("accessToken");
                            if (!(string2 == null || string == null)) {
                                ck1.INSTANCE.s(this.c, string2, string);
                            }
                        }
                        JSONArray jSONArray = jSONObject2.getJSONArray("platformScopes");
                        if (jSONArray != null) {
                            for (Object obj3 : jSONArray) {
                                if (obj3 != null) {
                                    JSONObject jSONObject3 = (JSONObject) obj3;
                                    String string3 = jSONObject3.getString(ParamsConstants.Key.PARAM_SCENE_CODE);
                                    JSONObject jSONObject4 = jSONObject3.getJSONObject("dataKeyDiffs");
                                    ArrayList arrayList2 = new ArrayList();
                                    ckf.f(jSONObject4, "dataKeyDiffs");
                                    for (Map.Entry<String, Object> entry2 : jSONObject4.entrySet()) {
                                        ScopeEntity scopeEntity3 = new ScopeEntity();
                                        scopeEntity3.setScope(entry2.getKey());
                                        scopeEntity3.setStatus(ckf.b(entry2.getValue(), Boolean.TRUE));
                                        arrayList2.add(scopeEntity3);
                                    }
                                    ck1 ck1Var3 = ck1.INSTANCE;
                                    ckf.f(string3, ParamsConstants.Key.PARAM_SCENE_CODE);
                                    ck1Var3.u(string3, arrayList2);
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                                }
                            }
                            xhv xhvVar5 = xhv.INSTANCE;
                        }
                    }
                }
            }
            if (z2 && this.e == InvokeType.TYPE_ORIGIN) {
                JSONArray jSONArray2 = new JSONArray();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    DomainItemEntity domainItemEntity2 = (DomainItemEntity) it.next();
                    Pair a3 = jpu.a("domainKey", domainItemEntity2.getDomainKey());
                    if (domainItemEntity2.isAuthed()) {
                        obj = "accept";
                    } else {
                        obj = "reject";
                    }
                    JSONObject b = arf.b(a3, jpu.a("status", obj));
                    List<ResourceItemEntity> resourceItems2 = domainItemEntity2.getResourceItems();
                    if (resourceItems2 != null) {
                        JSONArray jSONArray3 = new JSONArray();
                        for (ResourceItemEntity resourceItemEntity2 : resourceItems2) {
                            Pair a4 = jpu.a("resourceKey", resourceItemEntity2.getResourceKey());
                            if (resourceItemEntity2.isAuthed()) {
                                obj2 = "accept";
                            } else {
                                obj2 = "reject";
                            }
                            jSONArray3.add(arf.b(a4, jpu.a("status", obj2)));
                        }
                        b.put((JSONObject) "resourceItems", (String) jSONArray3);
                        xhv xhvVar6 = xhv.INSTANCE;
                    }
                    jSONArray2.add(b);
                }
                Map a5 = AuthUtils.a(AuthUtils.INSTANCE, this.b, this.c, this.d);
                a5.put("domainItems", jSONArray2.toJSONString());
                IMtopInnerAdapter iMtopInnerAdapter2 = (IMtopInnerAdapter) p8s.b(IMtopInnerAdapter.class);
                if (iMtopInnerAdapter2 != null) {
                    IMtopInnerAdapter.a.b(iMtopInnerAdapter2, "mtop.taobao.openlink.miniapp.resource.authChange", "1.0", a5, null, true, null, null, null, null, BuildConfig.VERSION_CODE, null);
                }
            }
        }
    }

    public final Map<String, Object> h(bbs bbsVar, String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("45b27f70", new Object[]{this, bbsVar, str, str2});
        }
        String str4 = null;
        if (bbsVar == null || (str3 = r8s.q(bbsVar, null, 1, null)) == null) {
            str3 = str2;
        }
        String x = bbsVar == null ? null : r8s.x(bbsVar);
        if (!(x == null || x.length() == 0)) {
            str4 = x;
        }
        if (str4 == null) {
            str4 = str;
        }
        return kotlin.collections.a.k(jpu.a("mainAppId", str2), jpu.a("mainAppKey", str), jpu.a("invokerAppId", str3), jpu.a("invokeAppKey", str4));
    }

    public final Set<String> t(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("181999cd", new Object[]{this, str, str2});
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Map k = kotlin.collections.a.k(jpu.a("mainAppId", str), jpu.a("mainAppKey", str2), jpu.a("invokerAppId", str), jpu.a("invokerAppKey", str2));
        IMtopInnerAdapter iMtopInnerAdapter = (IMtopInnerAdapter) p8s.b(IMtopInnerAdapter.class);
        JSONObject jSONObject = null;
        IMtopInnerAdapter.Response b = iMtopInnerAdapter == null ? null : IMtopInnerAdapter.a.b(iMtopInnerAdapter, "mtop.com.taobao.miniapp.scope.config.get", "1.0", k, null, false, null, null, null, null, BuildConfig.VERSION_CODE, null);
        if (b != null && b.getSuccess()) {
            JSONObject data = b.getData();
            if (data != null) {
                jSONObject = data.getJSONObject("data");
            }
            if (jSONObject != null) {
                JSONObject data2 = b.getData();
                ckf.d(data2);
                Set<String> keySet = data2.getJSONObject("data").keySet();
                ckf.f(keySet, "response.data!!.getJSONObject(\"data\").keys");
                linkedHashSet.addAll(keySet);
            }
        }
        return linkedHashSet;
    }

    public final List<ScopeSettingEntity> s(bbs bbsVar, Map<String, Boolean> map, InvokeType invokeType, String str, String str2) {
        IMtopInnerAdapter.Response response;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("44c145a9", new Object[]{this, bbsVar, map, invokeType, str, str2});
        }
        Map<String, Object> h = h(bbsVar, str, str2);
        h.put("withSubscriptions", "true");
        h.put("topScopes", JSON.toJSONString(map));
        h.put(TriggerChannelService.EXTRA_ORIGIN, invokeType.name());
        IMtopInnerAdapter iMtopInnerAdapter = (IMtopInnerAdapter) p8s.b(IMtopInnerAdapter.class);
        JSONObject jSONObject = null;
        if (iMtopInnerAdapter == null) {
            response = null;
        } else {
            response = IMtopInnerAdapter.a.b(iMtopInnerAdapter, "mtop.taobao.openlink.miniapp.auth.scope.check.status", "1.0", h, null, true, bbsVar == null ? null : r8s.a(bbsVar), null, null, null, 456, null);
        }
        if (response != null && response.getSuccess()) {
            JSONObject data = response.getData();
            if (data != null) {
                jSONObject = data.getJSONObject("data");
            }
            if (jSONObject != null) {
                JSONObject data2 = response.getData();
                ckf.d(data2);
                List<ScopeSettingEntity> h2 = arf.h(data2.getJSONObject("data").getString("result"), ScopeSettingEntity.class);
                return h2 == null ? yz3.i() : h2;
            }
        }
        return yz3.i();
    }

    public final JSONObject j(bbs bbsVar, String str, String str2, boolean z) {
        JSONObject jSONObject;
        PermissionModel w;
        JSONObject nativeApiScopeConfig;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("327ef221", new Object[]{this, bbsVar, str, str2, new Boolean(z)});
        }
        ckf.g(bbsVar, "instance");
        ckf.g(str, "appKey");
        ckf.g(str2, "appId");
        TMSMetaInfoWrapper U = bbsVar.U();
        JSONArray jSONArray = null;
        JSONObject jSONObject2 = null;
        Set<String> keySet = (U == null || (w = U.w()) == null || (nativeApiScopeConfig = w.getNativeApiScopeConfig()) == null) ? null : nativeApiScopeConfig.keySet();
        if (keySet == null || keySet.isEmpty()) {
            keySet = null;
        }
        if (keySet == null) {
            keySet = t(str2, str);
        }
        Map<String, Boolean> l = l(str, str2, keySet);
        JSONObject b = arf.b(jpu.a("withSubscriptions", String.valueOf(z)));
        String n = n(bbsVar);
        if (n != null) {
            b.put((JSONObject) "accessToken", n);
        }
        IMtopInnerAdapter iMtopInnerAdapter = (IMtopInnerAdapter) p8s.b(IMtopInnerAdapter.class);
        IMtopInnerAdapter.Response b2 = iMtopInnerAdapter == null ? null : IMtopInnerAdapter.a.b(iMtopInnerAdapter, "mtop.taobao.miniapp.auth.check", "1.0", b, null, true, r8s.a(bbsVar), null, null, null, 456, null);
        if (b2 != null && b2.getSuccess()) {
            JSONObject data = b2.getData();
            if ((data == null ? null : data.getJSONObject("data")) != null) {
                JSONObject data2 = b2.getData();
                if (data2 != null) {
                    jSONObject2 = data2.getJSONObject("data");
                }
                ckf.d(jSONObject2);
                JSONObject jSONObject3 = jSONObject2.getJSONObject("authStatus");
                if (jSONObject3 != null) {
                    for (Map.Entry<String, Object> entry : jSONObject3.entrySet()) {
                        String key = entry.getKey();
                        ckf.f(key, "it.key");
                        l.put(key, Boolean.valueOf(ckf.b(entry.getValue(), "true")));
                    }
                }
                JSONObject data3 = b2.getData();
                ckf.d(data3);
                jSONArray = data3.getJSONArray("domainItems");
                jSONObject = new JSONObject();
                jSONObject.put((JSONObject) "authSetting", (String) l);
                if (jSONArray != null && !jSONArray.isEmpty()) {
                    jSONObject.put((JSONObject) "subscriptionsSetting", (String) jSONArray);
                }
                return jSONObject;
            }
        }
        c(bbsVar, b2 == null ? null : b2.getErrorCode(), b2 == null ? null : b2.getData());
        jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "authSetting", (String) l);
        if (jSONArray != null) {
            jSONObject.put((JSONObject) "subscriptionsSetting", (String) jSONArray);
        }
        return jSONObject;
    }
}
