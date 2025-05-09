package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.UTMini;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.common.util.SymbolExpUtil;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class b92 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BX_INVOKE_ID = "home.request.PageBack.zeroIpvRefresh";
    public static final String IPV_SIGNAL_NAME = "tb_bc_session_item_click_vstr";

    /* renamed from: a  reason: collision with root package name */
    public boolean f16259a = false;
    public String b = "";
    public final int c = mve.c("behaviorXDataLimitedSize", 1024);

    static {
        t2o.a(491782655);
    }

    public final String b(String str) {
        JSONObject parseObject;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dc9393a1", new Object[]{this, str});
        }
        if (str.contains("tb_bc_search_query_vstr") || (jSONArray = (parseObject = JSON.parseObject(str)).getJSONArray("data")) == null) {
            return str;
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.add("tb_bc_search_query_vstr");
        jSONArray2.add("");
        jSONArray.add(jSONArray2);
        return parseObject.toString();
    }

    public Map<String, String> e(long j, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String[] strArr, boolean z6, boolean z7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f78d001c", new Object[]{this, new Long(j), str, new Boolean(z), new Boolean(z2), new Boolean(z3), new Boolean(z4), new Boolean(z5), strArr, new Boolean(z6), new Boolean(z7)});
        }
        HashMap hashMap = new HashMap(5);
        String a2 = to2.a(0L, "home.request.PageBack.outlinkLockPosition", "BehaviorBizParamsCreator");
        if (!z7 && z5 && !d(a2)) {
            c(hashMap, a2, strArr);
        }
        String a3 = to2.a(j, BX_INVOKE_ID, "BehaviorBizParamsCreator");
        String a4 = to2.a(j, "home.request.PageBack.paySuccess", "BehaviorBizParamsCreator");
        fve.b("BehaviorBizParamsCreator", "paysuccessFeature: " + a4);
        if (d(a3) && d(a4)) {
            fve.e("BehaviorBizParamsCreator", "behaviorFeature Invalid");
            tve.b("back_refresh", "backRefreshFailed", "", "Page_Home_BackRefresh", "", null, "createBehaviorBizParamsError", a3);
            return null;
        } else if (z6 && a4.contains("tb_bc_pay_success_vstr")) {
            hashMap.put("zeroRefreshBXFeature", b(a4));
            hashMap.put("zeroRefreshBeginCode", str);
            hashMap.put("backRefresh", "true");
            return hashMap;
        } else if ((z4 || z) && a3.contains("tb_bc_search_query_vstr")) {
            if (!z2) {
                hashMap.put("zeroRefreshBXFeature", a3);
                hashMap.put("zeroRefreshBeginCode", str);
                hashMap.put("backRefresh", "true");
                return hashMap;
            } else if (a3.contains(IPV_SIGNAL_NAME)) {
                hashMap.put("zeroRefreshBXFeature", a3);
                hashMap.put("zeroRefreshBeginCode", str);
                hashMap.put("backRefresh", "true");
                return hashMap;
            } else {
                fve.e("BehaviorBizParamsCreator", "未发生实际点击");
                return hashMap;
            }
        } else if ((z4 || z3) && (a3.contains("tb_bc_item_click_vstr") || a3.contains(IPV_SIGNAL_NAME))) {
            hashMap.put("zeroRefreshBXFeature", b(a3));
            hashMap.put("zeroRefreshBeginCode", str);
            hashMap.put("backRefresh", "true");
            return hashMap;
        } else {
            if (this.f16259a && hashMap.size() <= 2) {
                this.f16259a = false;
                hashMap.put("zeroRefreshBXFeature", b(a3));
                hashMap.put("zeroRefreshBeginCode", str);
                hashMap.put("backRefresh", "true");
            }
            fve.e("BehaviorBizParamsCreator", "不包含搜索或IPV特征或功能开关未打开：enableOutLinkBackRefresh:" + z4 + " enableSearchBackRefresh:" + z + " enableSearchClickCheck:" + z2 + " enableIpvBackRefresh:" + z3);
            return hashMap;
        }
    }

    public Map<String, String> f(long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e4386acc", new Object[]{this, new Long(j), new Boolean(z)});
        }
        String a2 = to2.a(j, BX_INVOKE_ID, "BehaviorBizParamsCreator");
        if (d(a2)) {
            fve.e("BehaviorBizParamsCreator", "behaviorFeature Invalid");
            tve.b("back_refresh", "backRefreshFailed", "", "Page_Home_BackRefresh", "", null, "createBehaviorBizParamsError", a2);
            return null;
        }
        HashMap hashMap = new HashMap(4);
        if (z) {
            hashMap.put("isBackToFront", "true");
        }
        return hashMap;
    }

    public final String j(String str) throws UnsupportedEncodingException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f89854a1", new Object[]{this, str});
        }
        int indexOf = str.indexOf("h5Url=");
        if (indexOf != -1) {
            return str.substring(indexOf + 6);
        }
        return str;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69978a", new Object[]{this})).booleanValue();
        }
        String a2 = to2.a(0L, "home.request.PageBack.outlinkLockPosition", "BehaviorBizParamsCreator");
        if (a2 == null) {
            return false;
        }
        return a2.contains("tb_bc_external_link_etc_vstr");
    }

    public final void a(Map<String, String> map, Uri uri, String str, String str2, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67b4d3a5", new Object[]{this, map, uri, str, str2, strArr});
            return;
        }
        if (strArr == null) {
            try {
                strArr = new String[]{"id"};
            } catch (UnsupportedOperationException unused) {
                fve.e("BehaviorBizParamsCreator", "非法URL，不进行定坑");
                return;
            }
        }
        for (String str3 : strArr) {
            String queryParameter = uri.getQueryParameter(str3);
            if (!TextUtils.isEmpty(queryParameter)) {
                if (!TextUtils.equals(queryParameter, this.b)) {
                    if (str.contains("livesource")) {
                        map.put("fixPosLiveId", queryParameter);
                    } else {
                        map.put("fixPosItemId", queryParameter);
                    }
                    map.put("fixPosSource", str2);
                    this.b = queryParameter;
                    this.f16259a = true;
                    return;
                } else {
                    return;
                }
            }
        }
    }

    public final boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2031d4", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            fve.e("BehaviorBizParamsCreator", "data is empty");
            return true;
        }
        int length = str.toCharArray().length;
        if (length <= this.c) {
            return false;
        }
        fve.e("BehaviorBizParamsCreator", "数据长度超过最大长度, 数据长度为 : " + length);
        return true;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e259a71", new Object[]{this})).booleanValue();
        }
        String a2 = to2.a(0L, BX_INVOKE_ID, "BehaviorBizParamsCreator");
        if (a2 == null) {
            return false;
        }
        return a2.contains("tb_bc_item_click_vstr") || a2.contains(IPV_SIGNAL_NAME);
    }

    public final void c(Map<String, String> map, String str, String[] strArr) {
        String query;
        Uri parse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a771ae8b", new Object[]{this, map, str, strArr});
            return;
        }
        String[] g = g(map, str);
        if (g != null && g.length >= 2) {
            String str2 = g[0];
            StringBuilder sb = new StringBuilder(g[1]);
            if (TextUtils.isEmpty(sb.toString())) {
                fve.e("BehaviorBizParamsCreator", "Share H5url is empty");
                return;
            }
            Uri parse2 = Uri.parse(sb.toString());
            if (parse2 != null) {
                if (TextUtils.equals(str2, "share") || TextUtils.equals(str2, UTMini.PAGE_AGOO)) {
                    a(map, parse2, sb.toString(), str2, strArr);
                } else if (TextUtils.equals(str2, ah0.PAGE_FLOWCUSTOMS) && (query = parse2.getQuery()) != null) {
                    try {
                        String j = j(query);
                        if (!TextUtils.isEmpty(j) && (parse = Uri.parse(j)) != null) {
                            a(map, parse, j, str2, strArr);
                        }
                    } catch (Exception unused) {
                        fve.e("BehaviorBizParamsCreator", "Unsupported encoding in OutLinkLockPosition");
                    }
                }
            }
        }
    }

    public final String[] g(Map<String, String> map, String str) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("2ed2706c", new Object[]{this, map, str});
        }
        if (str == null || map == null) {
            fve.e("BehaviorBizParamsCreator", "originBxFeature is Empty");
            return null;
        } else if (!str.contains("tb_bc_external_link_etc_vstr") || (jSONArray = JSON.parseObject(str).getJSONArray("data")) == null || jSONArray.size() == 0 || (jSONArray2 = jSONArray.getJSONArray(0)) == null || jSONArray2.size() < 3) {
            return null;
        } else {
            return jSONArray2.getString(2).split(SymbolExpUtil.SYMBOL_VERTICALBAR);
        }
    }
}
