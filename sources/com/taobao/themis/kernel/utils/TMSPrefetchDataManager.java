package com.taobao.themis.kernel.utils;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.ability.impl.mtop.MtopAbility;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.message_open_api.ICallService;
import com.taobao.themis.kernel.adapter.IConfigAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.metaInfo.manifest.DataPrefetch;
import com.taobao.themis.open.ability.calendar.TMSCalendarBridge;
import java.util.Map;
import kotlin.text.Regex;
import tb.a07;
import tb.ckf;
import tb.ds6;
import tb.hbs;
import tb.ies;
import tb.jr;
import tb.k8s;
import tb.p8s;
import tb.t2o;
import tb.uq;
import tb.wsq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSPrefetchDataManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String TAG = "TMSPrefetchDataUtils";

    /* renamed from: a  reason: collision with root package name */
    public final Regex f13600a = new Regex("\\$\\{([^}]+)\\}");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(839909973);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements uq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.uq
        public void a(jr jrVar, boolean z) {
            JSONObject jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3310cd60", new Object[]{this, jrVar, new Boolean(z)});
                return;
            }
            if (jrVar == null) {
                jSONObject = null;
            } else {
                jSONObject = jrVar.a();
            }
            TMSLogger.f(TMSPrefetchDataManager.TAG, ckf.p("callMegaAsyncV2 call ", jSONObject));
        }
    }

    static {
        t2o.a(839909972);
    }

    public static final /* synthetic */ String a(TMSPrefetchDataManager tMSPrefetchDataManager, String str, ds6 ds6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("70afc307", new Object[]{tMSPrefetchDataManager, str, ds6Var});
        }
        return tMSPrefetchDataManager.f(str, ds6Var);
    }

    public final void d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("348adfb2", new Object[]{this, jSONObject});
            return;
        }
        TMSLogger.f(TAG, "prefetch Data");
        k8s.j().e(TMSCalendarBridge.namespace, null, "mtop", MtopAbility.API_PREFETCH_DATA, jSONObject, new b());
    }

    public final void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f63ab612", new Object[]{this, str});
            return;
        }
        ckf.g(str, "url");
        try {
            IConfigAdapter iConfigAdapter = (IConfigAdapter) p8s.b(IConfigAdapter.class);
            String customConfigByLocal = iConfigAdapter == null ? null : iConfigAdapter.getCustomConfigByLocal("themis_prefetch_white_list", "{}");
            if (!TextUtils.isEmpty(customConfigByLocal)) {
                JSONObject parseObject = JSON.parseObject(customConfigByLocal);
                ckf.f(parseObject, "parseObject(config)");
                for (Map.Entry<String, Object> entry : parseObject.entrySet()) {
                    Uri g = ies.g(entry.getKey());
                    Uri g2 = ies.g(str);
                    if (TextUtils.equals(g2.getHost(), g.getHost()) && TextUtils.equals(g2.getScheme(), g.getScheme()) && TextUtils.equals(g2.getPath(), g.getPath())) {
                        DataPrefetch dataPrefetch = (DataPrefetch) JSON.parseObject(entry.getValue().toString(), DataPrefetch.class);
                        ckf.f(dataPrefetch, "dataPrefetch");
                        JSONObject b2 = b(dataPrefetch, str);
                        if (b2 != null) {
                            d(b2);
                        }
                    }
                }
            }
        } catch (Exception e) {
            TMSLogger.b(TAG, ckf.p("perfetchData data error ", e.getMessage()));
        }
    }

    public final String f(String str, ds6 ds6Var) throws UnsupportedOperationException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9a385d0a", new Object[]{this, str, ds6Var});
        }
        if (!wsq.O(str, "${", false, 2, null)) {
            return str;
        }
        return this.f13600a.replace(str, new TMSPrefetchDataManager$translateTemplateParam$1(ds6Var, str));
    }

    public final JSONObject b(DataPrefetch dataPrefetch, String str) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("43efafe3", new Object[]{this, dataPrefetch, str});
        }
        ds6 ds6Var = new ds6(str);
        if (c(dataPrefetch)) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put((JSONObject) "api", dataPrefetch.getApi());
                jSONObject.put((JSONObject) "v", dataPrefetch.getV());
                jSONObject.put((JSONObject) ICallService.KEY_NEED_LOGIN, (String) Boolean.valueOf(ckf.b(dataPrefetch.getNeedLogin(), "true")));
                JSONObject data = dataPrefetch.getData();
                jSONObject.put((JSONObject) "data", (String) (data == null ? null : hbs.d(data, new TMSPrefetchDataManager$generateRequestParams$1$1(this, ds6Var))));
                JSONObject extHeaders = dataPrefetch.getExtHeaders();
                if (extHeaders != null && extHeaders.containsKey("prefetchTimeout")) {
                    i = extHeaders.get("prefetchTimeout");
                } else {
                    i = 10000;
                }
                jSONObject.put((JSONObject) "prefetchTimeout", (String) i);
                JSONObject extHeaders2 = dataPrefetch.getExtHeaders();
                jSONObject.put((JSONObject) "extHeaders", (String) (extHeaders2 == null ? null : hbs.d(extHeaders2, new TMSPrefetchDataManager$generateRequestParams$1$3(this, ds6Var))));
                return jSONObject;
            } catch (Throwable th) {
                TMSLogger.c(TAG, th.getMessage(), th);
            }
        }
        return null;
    }

    public final boolean c(DataPrefetch dataPrefetch) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af9e31f7", new Object[]{this, dataPrefetch})).booleanValue();
        }
        if (!ckf.b(dataPrefetch.getType(), "mtop")) {
            TMSLogger.b(TAG, "type is not mtop");
            return false;
        } else if (dataPrefetch.getV() == null) {
            TMSLogger.b(TAG, "v is null");
            return false;
        } else if (dataPrefetch.getApi() != null) {
            return true;
        } else {
            TMSLogger.b(TAG, "api is null");
            return false;
        }
    }
}
