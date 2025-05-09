package com.tmall.android.dai.internal.pyschedule;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.taobao.mrt.task.MRTJob;
import com.taobao.mrt.task.MRTRuntimeException;
import com.taobao.mrt.task.desc.MRTTaskDescription;
import com.tmall.android.dai.DAI;
import com.tmall.android.dai.compute.DAIComputeService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import tb.brh;
import tb.h45;
import tb.kgh;
import tb.kzo;
import tb.oqh;
import tb.qqh;
import tb.r4p;
import tb.ru1;
import tb.t2o;
import tb.zwf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class PyScheduleManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "py_schedule_run_task";

    static {
        t2o.a(1034944655);
    }

    public static HashMap<String, Object> stringToModelInput(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("74e7ca61", new Object[]{str});
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject parseObject = JSON.parseObject(str);
                for (String str2 : parseObject.keySet()) {
                    Object obj = parseObject.get(str2);
                    if (obj instanceof JSONArray) {
                        obj = toVector((JSONArray) obj);
                    } else if (obj instanceof JSONObject) {
                        obj = toMap((JSONObject) obj);
                    }
                    hashMap.put(str2, obj);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return hashMap;
    }

    public static Map<String, Object> toMap(JSONObject jSONObject) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b0b8273d", new Object[]{jSONObject});
        }
        HashMap hashMap = new HashMap();
        for (String str : jSONObject.keySet()) {
            Object obj = jSONObject.get(str);
            if (obj instanceof JSONArray) {
                obj = toVector((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = toMap((JSONObject) obj);
            }
            hashMap.put(str, obj);
        }
        return hashMap;
    }

    public static Vector<Object> toVector(JSONArray jSONArray) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Vector) ipChange.ipc$dispatch("66640915", new Object[]{jSONArray});
        }
        Vector<Object> vector = new Vector<>();
        for (int i = 0; i < jSONArray.size(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = toVector((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = toMap((JSONObject) obj);
            }
            vector.add(obj);
        }
        return vector;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements qqh {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f14210a;

        public a(Map map) {
            this.f14210a = map;
        }

        @Override // tb.qqh
        public void a(int i, MRTRuntimeException mRTRuntimeException, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f20526d", new Object[]{this, new Integer(i), mRTRuntimeException, obj});
            } else if (mRTRuntimeException != null) {
                Map map = this.f14210a;
                map.put("msg", "task run  error:" + mRTRuntimeException.toString());
            } else {
                if (obj != null && (obj instanceof List)) {
                    List list = (List) obj;
                    if (list.size() == 2 && list.get(1) != null && (list.get(1) instanceof Map)) {
                        this.f14210a.put("state", "true");
                        this.f14210a.put("result", zwf.b((Map) list.get(1)));
                        return;
                    }
                }
                this.f14210a.put("msg", "task return format error!!! not Map");
            }
        }
    }

    public static Map runTaskSync(int i, String str, String str2) {
        h45 h45Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3fbd6ada", new Object[]{new Integer(i), str, str2});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("state", "false");
        hashMap.put("msg", "");
        hashMap.put("result", "");
        try {
            if (i == 0) {
                h45Var = DAI.getRegisteredModel(str);
            } else {
                h45Var = i == 1 ? DAI.getRegisteredModelForAlias(str) : null;
            }
            if (h45Var == null) {
                hashMap.put("msg", "model not registered");
                return hashMap;
            }
            MRTTaskDescription e = oqh.d().e(h45Var.h());
            if (e == null) {
                hashMap.put("msg", "model not registered");
                return hashMap;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(BHRTaskConfigBase.TYPE_CONFIG_UT);
            HashMap<String, Object> stringToModelInput = stringToModelInput(str2);
            HashMap hashMap2 = new HashMap();
            if (stringToModelInput != null && stringToModelInput.containsKey("walle_inner_run_id")) {
                String valueOf = String.valueOf(stringToModelInput.get("walle_inner_run_id"));
                DAIComputeService e2 = kzo.c().e();
                Map<String, String> d = e2.d(valueOf);
                if (d != null) {
                    HashMap hashMap3 = new HashMap(d);
                    String str3 = d.get(r4p.KEY_MODEL_NAME);
                    hashMap3.put("subModelName", h45Var.h());
                    hashMap3.put("parentRunId", valueOf);
                    e2.e(stringToModelInput, d.get("triId"), str3, d.get(ru1.FEATURE_NAME), hashMap3, hashMap2);
                }
                stringToModelInput.remove("walle_inner_run_id");
            }
            arrayList.add(stringToModelInput);
            MRTJob mRTJob = new MRTJob(e, new a(hashMap), "__all__", arrayList, false, null, hashMap2);
            Thread currentThread = Thread.currentThread();
            if (currentThread instanceof brh) {
                mRTJob.d(((brh) currentThread).a());
            } else {
                hashMap.put("msg", "not in mrt thread");
            }
            return hashMap;
        } catch (Exception e3) {
            kgh.d(TAG, "runTaskSyncFailed", e3);
            hashMap.put("msg", e3.toString());
            return hashMap;
        }
    }
}
