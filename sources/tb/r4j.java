package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.message_open_api.ICallService;
import java.util.HashMap;
import java.util.List;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.intf.MtopBuilder;
import mtopsdk.mtop.intf.MtopPrefetch;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class r4j implements MtopPrefetch.IPrefetchComparator {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        static {
            t2o.a(119537686);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(119537685);
        t2o.a(589299957);
    }

    @Override // mtopsdk.mtop.intf.MtopPrefetch.IPrefetchComparator
    public MtopPrefetch.CompareResult compare(MtopBuilder mtopBuilder, MtopBuilder mtopBuilder2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopPrefetch.CompareResult) ipChange.ipc$dispatch("cca63c2e", new Object[]{this, mtopBuilder, mtopBuilder2});
        }
        ckf.g(mtopBuilder, "biz");
        ckf.g(mtopBuilder2, "prefetch");
        MtopRequest mtopRequest = mtopBuilder.getMtopContext().b;
        ckf.f(mtopRequest, "biz.mtopContext.mtopRequest");
        MtopRequest mtopRequest2 = mtopBuilder2.getMtopContext().b;
        ckf.f(mtopRequest2, "prefetch.mtopContext.mtopRequest");
        List<String> list = mtopBuilder2.getMtopPrefetch().whiteListParams;
        ckf.f(list, "prefetch.mtopPrefetch.whiteListParams");
        return b(mtopRequest, mtopRequest2, list);
    }

    public final MtopPrefetch.CompareResult b(MtopRequest mtopRequest, MtopRequest mtopRequest2, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopPrefetch.CompareResult) ipChange.ipc$dispatch("924228e3", new Object[]{this, mtopRequest, mtopRequest2, list});
        }
        MtopPrefetch.CompareResult compareResult = new MtopPrefetch.CompareResult();
        if (TextUtils.isEmpty(mtopRequest.getKey()) || !ckf.b(mtopRequest.getKey(), mtopRequest2.getKey())) {
            HashMap<String, String> data = compareResult.getData();
            ckf.f(data, "result.data");
            data.put("missKey", "apiKey");
            HashMap<String, String> data2 = compareResult.getData();
            ckf.f(data2, "result.data");
            data2.put("missMsg", "missApi");
            HashMap<String, String> data3 = compareResult.getData();
            ckf.f(data3, "result.data");
            data3.put("prefetchValue", mtopRequest2.getKey());
            HashMap<String, String> data4 = compareResult.getData();
            ckf.f(data4, "result.data");
            data4.put("realValue", mtopRequest.getKey());
        } else if (mtopRequest.isNeedEcode() != mtopRequest2.isNeedEcode()) {
            HashMap<String, String> data5 = compareResult.getData();
            ckf.f(data5, "result.data");
            data5.put("missKey", ICallService.KEY_NEED_ECODE);
            HashMap<String, String> data6 = compareResult.getData();
            ckf.f(data6, "result.data");
            data6.put("missMsg", "missEcode");
            HashMap<String, String> data7 = compareResult.getData();
            ckf.f(data7, "result.data");
            data7.put("prefetchValue", String.valueOf(mtopRequest2.isNeedEcode()));
            HashMap<String, String> data8 = compareResult.getData();
            ckf.f(data8, "result.data");
            data8.put("realValue", String.valueOf(mtopRequest.isNeedEcode()));
        } else {
            String data9 = mtopRequest2.getData();
            ckf.f(data9, "last.data");
            String data10 = mtopRequest.getData();
            ckf.f(data10, "current.data");
            if (a("baseKey", data9, data10, list, compareResult)) {
                compareResult.setSame(true);
            }
        }
        return compareResult;
    }

    public final boolean a(String str, String str2, String str3, List<String> list, MtopPrefetch.CompareResult compareResult) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe86db62", new Object[]{this, str, str2, str3, list, compareResult})).booleanValue();
        }
        if (TextUtils.equals(str2, str3)) {
            return true;
        }
        String str5 = "result.data";
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            HashMap<String, String> data = compareResult.getData();
            ckf.f(data, str5);
            data.put("missKey", str);
            HashMap<String, String> data2 = compareResult.getData();
            ckf.f(data2, str5);
            data2.put("missMsg", "emptyValue");
            HashMap<String, String> data3 = compareResult.getData();
            ckf.f(data3, str5);
            data3.put("prefetchValue", str2);
            HashMap<String, String> data4 = compareResult.getData();
            ckf.f(data4, str5);
            data4.put("realValue", str3);
            return false;
        }
        try {
            JSONObject parseObject = JSON.parseObject(str2);
            JSONObject parseObject2 = JSON.parseObject(str3);
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            for (String str6 : parseObject.keySet()) {
                if (!TextUtils.isEmpty(str6) && (list == null || !list.contains(str6))) {
                    ckf.f(str6, "key");
                    hashMap.put(str6, parseObject.get(str6));
                }
            }
            for (String str7 : parseObject2.keySet()) {
                if (!TextUtils.isEmpty(str7) && (list == null || !list.contains(str7))) {
                    ckf.f(str7, "key");
                    hashMap2.put(str7, parseObject2.get(str7));
                }
            }
            if (hashMap.size() != hashMap2.size()) {
                HashMap<String, String> data5 = compareResult.getData();
                ckf.f(data5, str5);
                data5.put("missKey", str);
                HashMap<String, String> data6 = compareResult.getData();
                ckf.f(data6, str5);
                data6.put("missMsg", "diffSize");
                HashMap<String, String> data7 = compareResult.getData();
                ckf.f(data7, str5);
                data7.put("prefetchValue", JSON.toJSONString(hashMap));
                HashMap<String, String> data8 = compareResult.getData();
                ckf.f(data8, str5);
                data8.put("realValue", JSON.toJSONString(hashMap2));
                return false;
            }
            for (String str8 : hashMap.keySet()) {
                Object obj = hashMap.get(str8);
                Object obj2 = hashMap2.get(str8);
                if (obj == null || obj2 == null || ckf.b(obj.getClass(), obj2.getClass())) {
                    str4 = str5;
                    try {
                        if (!a(str8, String.valueOf(hashMap.get(str8)), String.valueOf(hashMap2.get(str8)), list, compareResult)) {
                            return false;
                        }
                        str5 = str4;
                        hashMap2 = hashMap2;
                        hashMap = hashMap;
                    } catch (Throwable unused) {
                        HashMap<String, String> data9 = compareResult.getData();
                        ckf.f(data9, str4);
                        data9.put("missKey", str);
                        HashMap<String, String> data10 = compareResult.getData();
                        ckf.f(data10, str4);
                        data10.put("missMsg", "parseError");
                        HashMap<String, String> data11 = compareResult.getData();
                        ckf.f(data11, str4);
                        data11.put("prefetchValue", str2);
                        HashMap<String, String> data12 = compareResult.getData();
                        ckf.f(data12, str4);
                        data12.put("realValue", str3);
                        return false;
                    }
                } else {
                    HashMap<String, String> data13 = compareResult.getData();
                    ckf.f(data13, str5);
                    data13.put("missKey", str8);
                    HashMap<String, String> data14 = compareResult.getData();
                    ckf.f(data14, str5);
                    data14.put("missMsg", "diffType");
                    HashMap<String, String> data15 = compareResult.getData();
                    ckf.f(data15, str5);
                    data15.put("prefetchValue", obj.getClass().toString());
                    HashMap<String, String> data16 = compareResult.getData();
                    ckf.f(data16, str5);
                    data16.put("realValue", obj2.getClass().toString());
                    return false;
                }
            }
            return true;
        } catch (Throwable unused2) {
            str4 = str5;
        }
    }
}
