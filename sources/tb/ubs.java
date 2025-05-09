package tb;

import android.net.Uri;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.mix.utils.MixPageInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ubs {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ubs INSTANCE = new ubs();

    static {
        t2o.a(840957969);
    }

    @JvmStatic
    public static final String a(String str, Map<String, String> map) {
        Uri.Builder builder;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2bcaa148", new Object[]{str, map});
        }
        if (str == null || str.length() == 0 || map == null) {
            return null;
        }
        Uri parse = Uri.parse(str);
        if (parse == null) {
            builder = null;
        } else {
            builder = parse.buildUpon();
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!(key == null || key.length() == 0 || value == null || value.length() == 0 || builder == null)) {
                builder.appendQueryParameter(key, value);
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.toString();
    }

    @JvmStatic
    public static final String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6d136a6a", new Object[]{str, str2});
        }
        if (q9s.g0()) {
            String b = ges.b(str2, ies.g(str).getEncodedQuery(), null, yz3.l("utparamcnt", "_afc_link", "isNeedHome"));
            return b == null ? "" : b;
        }
        try {
            Uri g = ies.g(str2);
            if (g == null) {
                return "";
            }
            Uri.Builder buildUpon = g.buildUpon();
            Map<String, String> e = ies.e(str);
            JSONArray parseArray = JSON.parseArray("['utparamcnt', '_afc_link', 'isNeedHome']");
            ckf.f(e, "allUrlParam");
            for (Map.Entry<String, String> entry : e.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!(buildUpon == null || key == null || parseArray.contains(key.toString()))) {
                    buildUpon = buildUpon.appendQueryParameter(key.toString(), value.toString());
                }
            }
            if (buildUpon == null) {
                return "";
            }
            String uri = buildUpon.build().toString();
            ckf.f(uri, "realUriBuilder.build().toString()");
            return uri;
        } catch (Exception e2) {
            TMSLogger.c("TMSMixPageInfoUtils", ckf.p("appendUrlParams occurs error: ", e2.getMessage()), e2);
            return "";
        }
    }

    @JvmStatic
    public static final JSONObject c(TMSMetaInfoWrapper tMSMetaInfoWrapper) {
        JSONObject e;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9c6c69e2", new Object[]{tMSMetaInfoWrapper});
        }
        if (tMSMetaInfoWrapper == null || (e = tMSMetaInfoWrapper.e()) == null || (jSONObject = e.getJSONObject("extConfigs")) == null) {
            return null;
        }
        return jSONObject.getJSONObject("appConfig");
    }

    @JvmStatic
    public static final JSONObject f(TMSMetaInfoWrapper tMSMetaInfoWrapper) {
        JSONObject e;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b5672ee6", new Object[]{tMSMetaInfoWrapper});
        }
        if (tMSMetaInfoWrapper == null || (e = tMSMetaInfoWrapper.e()) == null || (jSONObject = e.getJSONObject("extConfigs")) == null) {
            return null;
        }
        return jSONObject.getJSONObject("phaManifest");
    }

    @JvmStatic
    public static final MixPageInfo g(List<MixPageInfo> list, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MixPageInfo) ipChange.ipc$dispatch("bafd31e1", new Object[]{list, str});
        }
        Object obj = null;
        if (str == null || str.length() == 0 || list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            MixPageInfo mixPageInfo = (MixPageInfo) next;
            if (mixPageInfo == null) {
                str2 = null;
            } else {
                str2 = mixPageInfo.getPagePath();
            }
            if (str2 != null) {
                String pagePath = mixPageInfo.getPagePath();
                ckf.d(pagePath);
                if (tsq.I(str, pagePath, false, 2, null)) {
                    obj = next;
                    break;
                }
            }
        }
        return (MixPageInfo) obj;
    }

    @JvmStatic
    public static final MixPageInfo d(String str, List<MixPageInfo> list) {
        MixPageInfo mixPageInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MixPageInfo) ipChange.ipc$dispatch("f9380725", new Object[]{str, list});
        }
        ckf.g(str, TBImageFlowMonitor.ERROR_ORIGIN_URL);
        ckf.g(list, "pageInfoList");
        Uri g = ies.g(str);
        String str2 = null;
        String queryParameter = g == null ? null : g.getQueryParameter("page");
        Map<String, String> f = ies.f(queryParameter, true);
        if ((queryParameter == null || queryParameter.length() == 0) && !list.isEmpty()) {
            mixPageInfo = list.get(0);
        } else {
            String queryParameter2 = ies.g(str).getQueryParameter("page");
            if (queryParameter2 != null) {
                str2 = queryParameter2;
            }
            mixPageInfo = g(list, str2);
        }
        if (mixPageInfo != null) {
            mixPageInfo.setPageUrl(b(str, mixPageInfo.getPageUrl()));
            String a2 = a(mixPageInfo.getPageUrl(), f);
            if (a2 != null) {
                mixPageInfo.setPageUrl(a2);
            }
        }
        return mixPageInfo;
    }

    @JvmStatic
    public static final List<MixPageInfo> e(TMSMetaInfoWrapper tMSMetaInfoWrapper) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("38dbd876", new Object[]{tMSMetaInfoWrapper});
        }
        ArrayList arrayList = new ArrayList();
        JSONObject c = c(tMSMetaInfoWrapper);
        if (c != null) {
            JSONArray jSONArray = c.getJSONArray("pages");
            try {
                int size = jSONArray.size();
                while (i < size) {
                    i++;
                    MixPageInfo mixPageInfo = (MixPageInfo) JSON.parseObject(jSONArray.getJSONObject(i).toString(), MixPageInfo.class);
                    ckf.f(mixPageInfo, "pageItem");
                    arrayList.add(mixPageInfo);
                }
            } catch (Exception e) {
                TMSLogger.c("TMSMixPageInfoUtils", ckf.p("getMixPageInfoList occurs error ", e.getMessage()), e);
            }
        }
        return arrayList;
    }
}
