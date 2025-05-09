package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.datasource.CommonSearchResult;
import java.util.HashMap;
import java.util.Map;
import tb.h1p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class evn {
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815792887);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }

        public final Map<String, String> a(jrh jrhVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("5e4e1720", new Object[]{this, jrhVar});
            }
            ckf.g(jrhVar, "scopeDatasource");
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            CommonSearchResult commonSearchResult = (CommonSearchResult) jrhVar.getTotalSearchResult();
            String str = null;
            frh combo = commonSearchResult != null ? commonSearchResult.getCombo(0) : null;
            if (!(combo instanceof frh)) {
                combo = null;
            }
            if (combo != null) {
                Map<String, String> map = combo.T().pageTraceArgs;
                if (map != null) {
                    String str2 = map.get("spm-cnt");
                    if (!TextUtils.isEmpty(str2)) {
                        hashMap2.put("spm-cnt", str2);
                    }
                }
                hashMap2.put(h1p.a.PARAM_KEY_FIRST_RN, combo.T().rn);
                RESULT totalSearchResult = jrhVar.getTotalSearchResult();
                ckf.e(totalSearchResult, "null cannot be cast to non-null type com.taobao.search.sf.datasource.CommonSearchResult");
                JSONObject jSONObject = ((CommonSearchResult) totalSearchResult).pageInfo;
                if (jSONObject != null) {
                    str = jSONObject.getString("for_bts");
                }
                hashMap2.put("for_bts", str);
                hashMap2.put(h1p.LIST_PARAM_KEY, jrhVar.getKeyword() + '_' + combo.T().abtest + '_' + combo.T().rn);
            }
            hashMap.put("utLogMap", g6p.d(JSON.toJSONString(hashMap2)));
            return hashMap;
        }
    }

    static {
        t2o.a(815792886);
    }
}
