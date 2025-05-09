package tb;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXMsgCenterEvent;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class dq4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(629145620);
    }

    public static JSONObject b(JSONArray jSONArray, JSONObject jSONObject, String str, String str2, String str3, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a43ab47a", new Object[]{jSONArray, jSONObject, str, str2, str3, jSONObject2});
        }
        JSONObject jSONObject3 = new JSONObject();
        if (jSONArray != null) {
            jSONObject3.put(bia.UNDER_TAKE_GOODS_LIST, (Object) jSONArray);
        }
        if (jSONObject != null) {
            jSONObject3.put("filter", (Object) jSONObject);
        }
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("code", (Object) str);
        jSONObject4.put("errorMsg", (Object) str2);
        jSONObject3.put("state", (Object) jSONObject4);
        jSONObject3.put("rootHeight", (Object) str3);
        if (jSONObject2 != null) {
            jSONObject3.put("utParams", (Object) jSONObject2);
        }
        return jSONObject3;
    }

    public static int c(String str, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d31ec656", new Object[]{str, jSONArray})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        for (int i = 0; i < jSONArray.size(); i++) {
            String string = jSONArray.getJSONObject(i).getString("id");
            if (!TextUtils.isEmpty(str) && str.equals(string)) {
                return i;
            }
        }
        return -1;
    }

    public static boolean d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf13c565", new Object[]{context})).booleanValue();
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.isFinishing() || activity.isDestroyed()) {
                return true;
            }
        }
        return false;
    }

    public static void e(MtopResponse mtopResponse, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5200ae2e", new Object[]{mtopResponse, str});
            return;
        }
        HashMap hashMap = new HashMap();
        if (mtopResponse != null) {
            hashMap.put("errorCode", mtopResponse.getRetCode());
            hashMap.put("errorMsg", mtopResponse.getRetMsg());
        }
    }

    public static long f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb1bcc10", new Object[]{str})).longValue();
        }
        try {
            return Long.parseLong(str);
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static void g(String str, JSONObject jSONObject, DXRecyclerLayout dXRecyclerLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91e16793", new Object[]{str, jSONObject, dXRecyclerLayout});
        } else if (dXRecyclerLayout != null) {
            DXMsgCenterEvent dXMsgCenterEvent = new DXMsgCenterEvent(0L);
            dXMsgCenterEvent.setType("General");
            dXMsgCenterEvent.setMethod(str);
            dXMsgCenterEvent.setParams(jSONObject);
            dXRecyclerLayout.postEvent(dXMsgCenterEvent);
        }
    }

    public static void h(Handler handler, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65b7c8f3", new Object[]{handler, runnable});
        } else if (Looper.myLooper() != Looper.getMainLooper()) {
            handler.post(runnable);
        } else {
            runnable.run();
        }
    }

    public static JSONArray a(JSONArray jSONArray, String str, String str2, Map<String, JSONArray> map, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("85036e80", new Object[]{jSONArray, str, str2, map, jSONObject});
        }
        int c = c(str, map.get("all"));
        JSONArray jSONArray2 = map.get("all");
        JSONObject jSONObject2 = (c == -1 || jSONArray2 == null) ? null : jSONArray2.getJSONObject(c);
        if (jSONArray == null) {
            return new JSONArray();
        }
        JSONArray parseArray = JSON.parseArray(jSONArray.toJSONString());
        int c2 = c(str, parseArray);
        if (jSONObject2 != null) {
            JSONObject parseObject = JSON.parseObject(jSONObject2.toJSONString());
            parseObject.put(eme.IMAGE_TYPE_HEAD, (Object) "true");
            if (c2 == 0) {
                parseArray.set(0, parseObject);
            } else {
                if (c2 != -1) {
                    parseArray.remove(c2);
                }
                parseArray.add(0, parseObject);
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("type", (Object) eme.IMAGE_TYPE_HEAD);
            jSONObject3.put("title", (Object) str2);
            if (parseArray.size() < 3 || !eme.IMAGE_TYPE_HEAD.equals(parseArray.getJSONObject(1).getString("type"))) {
                parseArray.add(1, jSONObject3);
            } else {
                parseArray.set(1, jSONObject3);
            }
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("filter", (Object) jSONObject);
            if (parseArray.size() < 3 || parseArray.getJSONObject(2).getJSONObject("filter") == null) {
                parseArray.add(2, jSONObject4);
            } else {
                parseArray.set(2, jSONObject4);
            }
        } else {
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("filter", (Object) jSONObject);
            parseArray.add(0, jSONObject5);
        }
        return parseArray;
    }
}
