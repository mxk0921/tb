package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.data.MetaResult;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.net.NetError;
import com.taobao.android.searchbaseframe.net.ResultError;
import com.taobao.search.musie.list.horizontal.HorizontalXslComponent;
import com.taobao.search.sf.datasource.CommonSearchResult;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.util.ErrorConstant;
import tb.gy;
import tb.r5j;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class h1i extends b54 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Set<String> f;
    public dmb e;

    static {
        t2o.a(815793405);
        HashSet hashSet = new HashSet();
        f = hashSet;
        hashSet.add("FAIL_SYS_USER_VALIDATE");
        hashSet.add("FAIL_SYS_SESSION_EXPIRED");
        hashSet.add("FAIL_SYS_SM_ODD_REQUEST");
        hashSet.add(ErrorConstant.ERRCODE_API_41X_ANTI_ATTACK);
    }

    public h1i(yko ykoVar) {
        this(ykoVar, null);
    }

    public static String J(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e0eb6798", new Object[]{map});
        }
        if (TextUtils.equals(map.get("m"), r4p.VALUE_MODULE_INSHOP)) {
            return "inshop-srp";
        }
        String str = map.get("tab");
        if (TextUtils.isEmpty(str)) {
            str = "all";
        }
        if ("true".equals(map.get(r4p.KEY_GOOD_PRICE))) {
            return "goodPrice-" + str;
        }
        return "main-" + str;
    }

    public static /* synthetic */ Object ipc$super(h1i h1iVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -2059423178) {
            super.w((MetaResult) objArr[0], (JSONObject) objArr[1]);
            return null;
        } else if (hashCode == -345897347) {
            return super.d((Map) objArr[0], (gy.c) objArr[1]);
        } else {
            if (hashCode == 1720926436) {
                super.v((BaseSearchResult) objArr[0]);
                return null;
            }
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/sf/datasource/mainsearch/MainSearchResultAdapter");
        }
    }

    @Override // tb.b54, tb.psi
    public r5j.a B(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r5j.a) ipChange.ipc$dispatch("91c0f517", new Object[]{this, map});
        }
        return new r5j.a(f1p.c(map), "1.0", "wsearch");
    }

    public final String G(nsj nsjVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8b7831", new Object[]{this, nsjVar, map});
        }
        if (nsjVar.b() == null) {
            return "";
        }
        HashMap hashMap = new HashMap();
        hashMap.put(jk.KEY_RET_CODE, nsjVar.b().getMtopCode());
        hashMap.put("appId", map.get("appId"));
        hashMap.put("page", map.get("page"));
        hashMap.put("sversion", r4p.SERVER_VERSION_VALUE);
        String str = map.get(r4p.KEY_GOOD_PRICE);
        if (TextUtils.isEmpty(str)) {
            str = "false";
        }
        hashMap.put(r4p.KEY_GOOD_PRICE, str);
        hashMap.put("q", map.get("q"));
        return JSON.toJSONString(hashMap);
    }

    public JSONArray H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("7265ff99", new Object[]{this});
        }
        dmb dmbVar = this.e;
        if (dmbVar == null) {
            return null;
        }
        return ((g1i) dmbVar).c0();
    }

    public final String K(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d582e916", new Object[]{this, th});
        }
        if (th == null) {
            return "no exception";
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public final boolean L(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca9afecc", new Object[]{this, map})).booleanValue();
        }
        return TextUtils.equals(map.get("ignoreReveal"), "true");
    }

    public final boolean N(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("439ed94e", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (((HashSet) f).contains(str)) {
            return true;
        }
        String R = o4p.R();
        if (TextUtils.isEmpty(R)) {
            return false;
        }
        return R.contains(str);
    }

    public final boolean O(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b579aa6a", new Object[]{this, map})).booleanValue();
        }
        return !TextUtils.isEmpty(map.get("channelSrp"));
    }

    public final boolean P(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b65cb8b7", new Object[]{this, map})).booleanValue();
        }
        return TextUtils.isEmpty(map.get("m"));
    }

    /* renamed from: S */
    public void v(CommonSearchResult commonSearchResult) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60bafb31", new Object[]{this, commonSearchResult});
            return;
        }
        super.v(commonSearchResult);
        if (this.b != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(yj4.PARAM_SEARCH_KEYWORD_RN, commonSearchResult.getMainInfo().rn);
            a9u a9uVar = commonSearchResult.tabParseTraceDigest;
            if (a9uVar == null) {
                str = "";
            } else {
                str = a9uVar.f15618a;
            }
            hashMap.put("tabs", str);
            a9u a9uVar2 = commonSearchResult.templatesParseTraceDigest;
            if (a9uVar2 == null) {
                str2 = "";
            } else {
                str2 = a9uVar2.f15618a;
            }
            hashMap.put("templates", str2);
            a9u a9uVar3 = commonSearchResult.topBarParseTraceDigest;
            if (a9uVar3 == null) {
                str3 = "";
            } else {
                str3 = a9uVar3.f15618a;
            }
            hashMap.put("topBar", str3);
            a9u a9uVar4 = commonSearchResult.itemsArrayTraceDigest;
            if (a9uVar4 == null) {
                str4 = "";
            } else {
                str4 = a9uVar4.f15618a;
            }
            hashMap.put(HorizontalXslComponent.ATTR_ITEMS_ARRAY, str4);
            Map<String, a9u> map = commonSearchResult.layoutParseTraceDigestMap;
            if (map != null && !map.isEmpty()) {
                for (Map.Entry<String, a9u> entry : commonSearchResult.layoutParseTraceDigestMap.entrySet()) {
                    String key = entry.getKey();
                    if (!TextUtils.isEmpty(key)) {
                        a9u value = entry.getValue();
                        if (value == null) {
                            str5 = "";
                        } else {
                            str5 = value.f15618a;
                        }
                        hashMap.put(key, str5);
                    }
                }
            }
            this.b.e(hashMap);
        }
    }

    /* renamed from: T */
    public void w(CommonSearchResult commonSearchResult, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81a2649c", new Object[]{this, commonSearchResult, jSONObject});
            return;
        }
        commonSearchResult.carriedData = H();
        super.w(commonSearchResult, jSONObject);
        U(commonSearchResult, jSONObject);
    }

    public void U(CommonSearchResult commonSearchResult, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12857414", new Object[]{this, commonSearchResult, jSONObject});
            return;
        }
        commonSearchResult.isAddCartSupported = jSONObject.getBooleanValue("isJiaGou");
        try {
            commonSearchResult.poplayerUrl = jSONObject.getString("poplayerUrl");
        } catch (Exception unused) {
            b4p.b("MainSearchResultAdapter", "parse poplayer error");
        }
        try {
            commonSearchResult.floatBarBean = cn9.a(jSONObject, commonSearchResult.newSearch, commonSearchResult);
        } catch (Exception unused2) {
            b4p.b("MainSearchResultAdapter", "parse floatbar error");
        }
    }

    public void V(dmb dmbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f940098f", new Object[]{this, dmbVar});
        } else {
            this.e = dmbVar;
        }
    }

    public final void W(ResultError resultError) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f1ce5da", new Object[]{this, resultError});
        } else {
            AppMonitor.Alarm.commitFail("tbsearch", "fallback_fall_reason", K(resultError.getException()), String.valueOf(resultError.getErrorCode()), resultError.getErrorMsg());
        }
    }

    public final void X(NetError netError) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5232669", new Object[]{this, netError});
            return;
        }
        Throwable exception = netError.getException();
        if (exception != null) {
            AppMonitor.Alarm.commitFail("tbsearch", "request_fall_reason", K(exception), String.valueOf(netError.getCode()), exception.getClass().getSimpleName());
        }
    }

    public h1i(yko ykoVar, xno xnoVar) {
        super(ykoVar, xnoVar);
    }

    public final String I(ResultError resultError) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b7439ba4", new Object[]{this, resultError});
        }
        StringBuilder sb = new StringBuilder();
        String errorMsg = resultError.getErrorMsg();
        if (!TextUtils.isEmpty(errorMsg)) {
            sb.append(errorMsg);
        }
        sb.append("|");
        Throwable exception = resultError.getException();
        if (exception != null && !TextUtils.isEmpty(exception.getMessage())) {
            sb.append(exception.getMessage());
        }
        sb.append("|");
        if (exception != null && exception.getStackTrace().length > 0) {
            sb.append(exception.getStackTrace()[0].toString());
        }
        return sb.toString();
    }

    @Override // tb.hy
    public void j(nsj nsjVar, ResultError resultError, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cded5b96", new Object[]{this, nsjVar, resultError, map});
            return;
        }
        String G = G(nsjVar, map);
        String I = I(resultError);
        if (this.b != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("status", "failure");
            hashMap.put("fallbackArgs", G);
            hashMap.put("errCode", String.valueOf(resultError.getErrorCode()));
            hashMap.put("errMsg", I);
            this.b.n(hashMap);
        }
        W(resultError);
        c4p.D("[requestFallback]", "兜底失败", new Object[0]);
        AppMonitor.Alarm.commitFail("tbsearch", "request_fallback", G, String.valueOf(resultError.getErrorCode()), I);
    }

    @Override // tb.hy
    public void k(nsj nsjVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82c3218", new Object[]{this, nsjVar, map});
            return;
        }
        String G = G(nsjVar, map);
        if (this.b != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("status", "success");
            hashMap.put("fallbackArgs", G);
            this.b.n(hashMap);
        }
        c4p.D("[requestFallback]", "兜底成功", new Object[0]);
        AppMonitor.Alarm.commitSuccess("tbsearch", "request_fallback", G);
    }

    @Override // tb.q02
    /* renamed from: q */
    public r5j d(Map<String, String> map, gy.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r5j) ipChange.ipc$dispatch("eb62067d", new Object[]{this, map, cVar});
        }
        r5j q = super.d(map, cVar);
        r5j.b bVar = (r5j.b) q.c;
        if (bVar != null) {
            if (TextUtils.equals(((r5j.a) q.f16602a).f27124a, f1p.WSEARCH_TPP_API_NAME_VALUE)) {
                bVar.c = MethodEnum.POST;
            }
            if (TextUtils.equals((String) ((Map) q.b).remove(r4p.KEY_XS_FORCE_LOGIN), "true")) {
                bVar.b = true;
            }
            if (o4p.k1()) {
                String str = (String) ((Map) q.b).get("tab");
                if (!TextUtils.isEmpty(str)) {
                    "all".equals(str);
                }
            }
            bVar.e = J(map);
        }
        return q;
    }

    public final boolean M(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b2ef24a", new Object[]{this, map})).booleanValue();
        }
        if (!(TextUtils.isEmpty(map.get(r4p.KEY_AUCTION_TAG)) && TextUtils.isEmpty(map.get(r4p.KEY_FILTER_TAG)) && TextUtils.isEmpty(map.get("service")))) {
            return true;
        }
        String S = o4p.S();
        if (TextUtils.isEmpty(S)) {
            return false;
        }
        for (String str : S.split("/")) {
            if (!TextUtils.isEmpty(map.get(str))) {
                return true;
            }
        }
        return false;
    }

    public final boolean Q(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("937f5850", new Object[]{this, map})).booleanValue();
        }
        String str = map.get("tab");
        return TextUtils.isEmpty(str) || TextUtils.equals(str, "all");
    }

    /* renamed from: R */
    public boolean i(CommonSearchResult commonSearchResult, nsj nsjVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c6d1679", new Object[]{this, commonSearchResult, nsjVar, map})).booleanValue();
        }
        if (!nsjVar.h() || nsjVar.b() == null) {
            return false;
        }
        X(nsjVar.b());
        if (!o4p.K1()) {
            c4p.D("[requestFallback]", "orange开关控制不开启兜底", new Object[0]);
            return false;
        } else if (!TextUtils.equals(k1p.a(), o78.CHINA_MAINLAND)) {
            return false;
        } else {
            String mtopCode = nsjVar.b().getMtopCode();
            if (TextUtils.equals(mtopCode, "SUCCESS")) {
                return false;
            }
            if (N(mtopCode)) {
                c4p.D("[requestFallback]", "错误码:%s 不开启兜底", mtopCode);
                return false;
            } else if (!P(map)) {
                c4p.D("[requestFallback]", "非主搜不开启兜底", new Object[0]);
                return false;
            } else if (O(map)) {
                c4p.D("[requestFallback]", "频道页不开启兜底", new Object[0]);
                return false;
            } else if (!Q(map)) {
                c4p.D("[requestFallback]", "非主tab不开启兜底", new Object[0]);
                return false;
            } else if (M(map)) {
                c4p.D("[requestFallback]", "携带筛选参数不开启兜底", new Object[0]);
                return false;
            } else if (!L(map)) {
                return true;
            } else {
                c4p.D("[requestFallback]", "携带关闭参数不开启兜底", new Object[0]);
                return false;
            }
        }
    }
}
