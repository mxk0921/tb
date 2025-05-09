package com.alibaba.ability.impl.rocketbundle;

import com.alibaba.ability.MegaUtils;
import com.alibaba.ability.hub.AbilityHubAdapter;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleInfoManager;
import com.android.tools.bundleInfo.DynamicFeatureInfo;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tb.a07;
import tb.bdq;
import tb.ckf;
import tb.cu;
import tb.edq;
import tb.jpu;
import tb.kdb;
import tb.t2o;
import tb.ucq;
import tb.vq;
import tb.xcq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class RocketBundleAbility extends cu {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_DOWNLOAD = "download";
    public static final String API_ENABLE_ROCKET = "enableRocket";
    public static final String API_GET_CURRENT_INFO = "getCurrentInfo";
    public static final String CAN_NOT_OPEN_ROCKET_DES = "当前容器无法打开 Rocket 功能";
    public static final String CAN_NOT_OPEN_ROCKET_ERROR_CODE = "1001";
    public static final a Companion = new a(null);
    public static final String DOWNLOAD_FAIL_DES = "当前 Rocket 下载失败";
    public static final String DOWNLOAD_FAIL_ERROR_CODE = "1002";
    public static final String PARAMS_DROID_NAME = "droidName";
    public static final String PARAMS_NAME = "name";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        static {
            t2o.a(128974851);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(128974850);
    }

    public static final /* synthetic */ JSONObject access$getBundleInfo(RocketBundleAbility rocketBundleAbility, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bc74dc5a", new Object[]{rocketBundleAbility, str});
        }
        return rocketBundleAbility.a(str);
    }

    public static /* synthetic */ Object ipc$super(RocketBundleAbility rocketBundleAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/rocketbundle/RocketBundleAbility");
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b implements edq {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ ucq c;
        public final /* synthetic */ vq d;

        public b(String str, ucq ucqVar, vq vqVar) {
            this.b = str;
            this.c = ucqVar;
            this.d = vqVar;
        }

        /* renamed from: a */
        public void onStateUpdate(bdq bdqVar) {
            List<String> f;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93485c61", new Object[]{this, bdqVar});
            } else if (bdqVar != null && (f = bdqVar.f()) != null && f.contains(this.b)) {
                int i = bdqVar.i();
                if (i == 5) {
                    ucq ucqVar = this.c;
                    if (ucqVar != null) {
                        ucqVar.e(this);
                    }
                    this.d.a(new FinishResult(RocketBundleAbility.access$getBundleInfo(RocketBundleAbility.this, this.b), null, 2, null));
                } else if (i == 6) {
                    ucq ucqVar2 = this.c;
                    if (ucqVar2 != null) {
                        ucqVar2.e(this);
                    }
                    this.d.b(new ErrorResult("1002", RocketBundleAbility.DOWNLOAD_FAIL_DES, (Map) null, 4, (a07) null));
                }
            }
        }
    }

    public final JSONObject a(String str) {
        Set<String> f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a1616177", new Object[]{this, str});
        }
        JSONObject jSONObject = new JSONObject();
        DynamicFeatureInfo dynamicFeatureInfo = BundleInfoManager.instance().getDynamicFeatureInfo(str);
        if (dynamicFeatureInfo != null) {
            ucq h = com.taobao.appbundle.a.Companion.a().h();
            if (!(h == null || (f = h.f()) == null || !f.contains(str))) {
                Object json = JSON.toJSON(dynamicFeatureInfo);
                if (json != null) {
                    jSONObject.put((JSONObject) "bundleInfo", (String) ((JSONObject) json));
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.alibaba.fastjson.JSONObject");
                }
            }
            jSONObject.put((JSONObject) "appVersion", dynamicFeatureInfo.appVersion);
        } else {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put((JSONObject) "version", "999.999.999");
            jSONObject.put((JSONObject) "bundleInfo", (String) jSONObject2);
            jSONObject.put((JSONObject) "appVersion", "999.999.999");
        }
        return jSONObject;
    }

    @Override // tb.hdb
    public ExecuteResult execute(String str, kdb kdbVar, Map<String, ? extends Object> map, vq vqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("b2cd7d0b", new Object[]{this, str, kdbVar, map, vqVar});
        }
        ckf.g(str, "api");
        ckf.g(kdbVar, "context");
        ckf.g(map, "params");
        ckf.g(vqVar, "callback");
        int hashCode = str.hashCode();
        if (hashCode != -1720849865) {
            if (hashCode != -39356271) {
                if (hashCode == 1427818632 && str.equals("download")) {
                    String w = MegaUtils.w(map, PARAMS_DROID_NAME, null);
                    if (w == null) {
                        w = MegaUtils.w(map, "name", null);
                    }
                    if (w == null) {
                        vqVar.a(ErrorResult.a.Companion.g("参数异常，请检查"));
                        return null;
                    }
                    JSONObject a2 = a(w);
                    if (a2.get("bundleInfo") != null) {
                        vqVar.a(new FinishResult(a2, null, 2, null));
                        return null;
                    }
                    ucq h = com.taobao.appbundle.a.Companion.a().h();
                    xcq n = xcq.c().l(w).n();
                    if (h != null) {
                        h.c(n);
                    }
                    b bVar = new b(w, h, vqVar);
                    if (h != null) {
                        h.g(bVar);
                    }
                    return null;
                }
            } else if (str.equals(API_GET_CURRENT_INFO)) {
                String w2 = MegaUtils.w(map, PARAMS_DROID_NAME, null);
                if (w2 == null) {
                    w2 = MegaUtils.w(map, "name", null);
                }
                if (w2 != null) {
                    return new FinishResult(a(w2), null, 2, null);
                }
                return ErrorResult.a.Companion.g("参数异常，请检查");
            }
        } else if (str.equals(API_ENABLE_ROCKET)) {
            AbilityHubAdapter adapter = kdbVar.l().getAdapter();
            if (adapter == null) {
                return new ErrorResult("1001", CAN_NOT_OPEN_ROCKET_DES, (Map) null, 4, (a07) null);
            }
            adapter.x(true);
            return new FinishResult(new JSONObject(kotlin.collections.a.k(jpu.a("result", Boolean.TRUE))), null, 2, null);
        }
        ErrorResult.a.C0055a aVar = ErrorResult.a.Companion;
        return aVar.a("api " + str + " not found");
    }
}
