package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.Stack;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class i19 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<Stack<Object>> f21035a = new ThreadLocal<>();
    public static final ThreadLocal<Stack<Object>> b = new ThreadLocal<>();

    public static final JSONArray a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("2806293e", new Object[]{jSONArray});
        }
        JSONArray jSONArray2 = new JSONArray();
        c(jSONArray2, jSONArray);
        return jSONArray2;
    }

    public static final JSONObject b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("eb2c8938", new Object[]{jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        c(jSONObject2, jSONObject);
        return jSONObject2;
    }

    public static final void c(JSON json, JSON json2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18f0ea1f", new Object[]{json, json2});
        } else if (json != null && json2 != null) {
            ThreadLocal<Stack<Object>> threadLocal = f21035a;
            Stack<Object> stack = threadLocal.get();
            if (stack == null) {
                stack = new Stack<>();
                threadLocal.set(stack);
            }
            ThreadLocal<Stack<Object>> threadLocal2 = b;
            Stack<Object> stack2 = threadLocal2.get();
            if (stack2 == null) {
                stack2 = new Stack<>();
                threadLocal2.set(stack2);
            }
            stack.push(json);
            stack2.push(json2);
            while (!stack2.empty()) {
                Object pop = stack.pop();
                Object pop2 = stack2.pop();
                if ((pop instanceof JSONObject) && (pop2 instanceof JSONObject)) {
                    for (Map.Entry entry : ((Map) pop2).entrySet()) {
                        Object value = entry.getValue();
                        if (value instanceof JSONObject) {
                            JSONObject jSONObject = (JSONObject) pop;
                            if (jSONObject.get(entry.getKey()) instanceof JSONObject) {
                                stack.push(jSONObject.get(entry.getKey()));
                                stack2.push(entry.getValue());
                            } else {
                                JSONObject jSONObject2 = new JSONObject();
                                ((Map) pop).put(entry.getKey(), jSONObject2);
                                stack.push(jSONObject2);
                                stack2.push(entry.getValue());
                            }
                        } else if (value instanceof JSONArray) {
                            JSONArray jSONArray = new JSONArray();
                            ((Map) pop).put(entry.getKey(), jSONArray);
                            stack.push(jSONArray);
                            stack2.push(entry.getValue());
                        } else {
                            ((Map) pop).put(entry.getKey(), entry.getValue());
                        }
                    }
                } else if ((pop instanceof JSONArray) && (pop2 instanceof JSONArray)) {
                    for (Object obj : (Iterable) pop2) {
                        if (obj instanceof JSONObject) {
                            JSONObject jSONObject3 = new JSONObject();
                            ((JSONArray) pop).add(jSONObject3);
                            stack.push(jSONObject3);
                            stack2.push(obj);
                        } else if (obj instanceof JSONArray) {
                            JSONArray jSONArray2 = new JSONArray();
                            ((JSONArray) pop).add(jSONArray2);
                            stack.push(jSONArray2);
                            stack2.push(obj);
                        } else {
                            ((JSONArray) pop).add(obj);
                        }
                    }
                }
            }
            stack.clear();
            stack2.clear();
        }
    }
}
