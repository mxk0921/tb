package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.searchdoor.shop.widget.bar.InShopSearchHintBean;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class tse extends g5p<ArrayList<InShopSearchHintBean>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793309);
    }

    public static /* synthetic */ Object ipc$super(tse tseVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/shop/widget/bar/InShopSearchHintConverter");
    }

    /* renamed from: e */
    public ArrayList<InShopSearchHintBean> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("1a99da3c", new Object[]{this});
        }
        return new ArrayList<>();
    }

    /* renamed from: d */
    public ArrayList<InShopSearchHintBean> b(JSONObject jSONObject, v5p v5pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("222421fb", new Object[]{this, jSONObject, v5pVar});
        }
        ArrayList<InShopSearchHintBean> arrayList = new ArrayList<>();
        if (jSONObject == null) {
            v5p.Companion.a(v5pVar, "DataConvert", "-1", "JSON is empty");
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        String optString = jSONObject.optString(yj4.PARAM_PVID);
        String optString2 = jSONObject.optString("tpp_trace");
        hashMap.put("pvId", optString);
        hashMap.put("tppTrace", optString2);
        JSONArray optJSONArray = jSONObject.optJSONArray("result");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            hashMap.put("errCode", "-1");
            hashMap.put("errMsg", "result array is empty");
            v5p.Companion.b(v5pVar, "DataConvert", hashMap);
            return arrayList;
        }
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                try {
                    arrayList.add((InShopSearchHintBean) JSON.parseObject(optJSONObject.toString(), InShopSearchHintBean.class));
                } catch (Exception unused) {
                }
            }
        }
        if (arrayList.size() > 0) {
            InShopSearchHintBean inShopSearchHintBean = arrayList.get(0);
            ckf.f(inShopSearchHintBean, "get(...)");
            InShopSearchHintBean inShopSearchHintBean2 = inShopSearchHintBean;
            hashMap.put("displayText", inShopSearchHintBean2.getDisplayText());
            hashMap.put("searchText", inShopSearchHintBean2.getSearchText());
        }
        v5p.Companion.c(v5pVar, "DataConvert", hashMap);
        return arrayList;
    }
}
