package tb;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mmad.data.BaseMmAdModel;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class hg0 implements hdb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final nwi f20618a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements msc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(hg0 hg0Var) {
        }

        @Override // tb.jdb
        public void O(ErrorResult errorResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14182866", new Object[]{this, errorResult});
                return;
            }
            jgh.a("AdvertisementAbility", "updateData: onError: " + errorResult);
        }
    }

    static {
        t2o.a(573571186);
        t2o.a(144703491);
    }

    public hg0(nwi nwiVar) {
        this.f20618a = nwiVar;
    }

    public final ExecuteResult a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("e660f087", new Object[]{this, map});
        }
        String str = map.get("bizCode");
        if (TextUtils.isEmpty(str)) {
            jgh.a("AdvertisementAbility", "getCommonUTParams: bizCode is empty");
            return null;
        }
        BaseMmAdModel a2 = this.f20618a.d().a();
        if (a2 == null) {
            jgh.a("AdvertisementAbility", "getCommonUTParams: adModel is null");
            return null;
        }
        if (TextUtils.isEmpty(dcj.e(a2.getTargetUrl()))) {
            jgh.a("AdvertisementAbility", "getCommonUTParams: alitrackid is empty");
        }
        Map<String, String> a3 = i4v.a(this.f20618a);
        a3.put("biz", str);
        return new FinishResult(a3);
    }

    public final void b(Map<String, String> map) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b0d9df7", new Object[]{this, map});
            return;
        }
        String str = map.get("bizCode");
        String str2 = map.get("key");
        String str3 = map.get("value");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            jgh.a("AdvertisementAbility", "saveData: param is empty. bizCode: " + str + ", key: " + str2 + ", value: " + str3);
            return;
        }
        String str4 = null;
        try {
            jSONObject = JSON.parseObject(str3);
        } catch (Exception e) {
            jgh.a("AdvertisementAbility", "Parse value error: " + Log.getStackTraceString(e));
            jSONObject = null;
        }
        if (jSONObject == null) {
            jgh.a("AdvertisementAbility", "Parse value error: value is null");
            return;
        }
        if ("topshow".equals(str)) {
            str4 = "topshowData";
        } else if ("texiu".equals(str)) {
            str4 = "texiuData";
        }
        if (str4 == null) {
            jgh.a("AdvertisementAbility", "saveData: saveDataKey is null");
        } else {
            c(str4, str2, jSONObject);
        }
    }

    public final void c(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d305582", new Object[]{this, str, str2, jSONObject});
            return;
        }
        xii a2 = xii.a();
        tao<String, ErrorResult> b = a2.b(str);
        JSONObject jSONObject2 = new JSONObject();
        if (b.c() != null) {
            try {
                jSONObject2 = JSON.parseObject(b.c());
            } catch (Exception e) {
                jgh.a("AdvertisementAbility", "Parse existing data error: " + Log.getStackTraceString(e));
            }
        }
        try {
            jSONObject2.put(str2, (Object) jSONObject);
            toh a3 = toh.a(str, jSONObject2.toString());
            a3.f28843a = xg4.DEFAULT_SMALL_MAX_AGE;
            a3.d = false;
            a2.d(a3, new a(this));
        } catch (Exception e2) {
            jgh.a("AdvertisementAbility", "Merge new data error: " + Log.getStackTraceString(e2));
        }
    }

    @Override // tb.hdb
    public ExecuteResult execute(String str, kdb kdbVar, Map<String, ?> map, vq vqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("b2cd7d0b", new Object[]{this, str, kdbVar, map, vqVar});
        }
        jgh.a("AdvertisementAbility", "execute apiName: " + str);
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
        }
        if ("mmadInteract".equals(str)) {
            i4v.e(this.f20618a, hashMap);
            return null;
        } else if ("mmadExpose".equals(str)) {
            i4v.d(this.f20618a, hashMap);
            return null;
        } else if ("mmadSaveData".equals(str)) {
            b(hashMap);
            return null;
        } else if ("mmadGetCommonUTParams".equals(str)) {
            return a(hashMap);
        } else {
            return null;
        }
    }
}
