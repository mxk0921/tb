package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class d19 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ultron.exprParser";

    static {
        t2o.a(912262344);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    public static Object a(JSONObject jSONObject, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("38cebb6b", new Object[]{jSONObject, list});
        }
        if (jSONObject == null || list == null || list.isEmpty()) {
            return null;
        }
        for (String str : list) {
            if (jSONObject instanceof JSONObject) {
                jSONObject = jSONObject.get(str);
            } else if (!(jSONObject instanceof JSONArray)) {
                return null;
            } else {
                try {
                    int intValue = Integer.valueOf(str).intValue();
                    if (intValue >= ((JSONArray) jSONObject).size()) {
                        return null;
                    }
                    jSONObject = ((JSONArray) jSONObject).get(intValue);
                } catch (Throwable unused) {
                    return null;
                }
            }
        }
        return jSONObject;
    }

    public static boolean b(Stack<h68> stack, Stack stack2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("45e3f2fa", new Object[]{stack, stack2})).booleanValue();
        }
        while (true) {
            if (stack.size() <= 0) {
                break;
            }
            h68 pop = stack.pop();
            if (pop != null) {
                if (!pop.f(stack2)) {
                    stack.push(pop);
                    break;
                }
                stack2 = pop.c(stack2);
                if (stack2 == null) {
                    stack.clear();
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2312d58", new Object[0])).booleanValue();
        }
        return false;
    }

    public static boolean d(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("945fbca4", new Object[]{str, new Integer(i)})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        int length = str.length();
        if (i >= length - 1) {
            return true;
        }
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt != '(' && charAt != ')') {
                return false;
            }
            i++;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x015d, code lost:
        if (r8 != '}') goto L_0x01d7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object e(com.alibaba.fastjson.JSONObject r22, com.alibaba.fastjson.JSONObject r23, java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 587
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.d19.e(com.alibaba.fastjson.JSONObject, com.alibaba.fastjson.JSONObject, java.lang.String):java.lang.Object");
    }

    public static void f(StringBuffer stringBuffer, ArrayList arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3adbffdd", new Object[]{stringBuffer, arrayList});
        } else if (stringBuffer.length() > 0) {
            arrayList.add(stringBuffer.toString());
            stringBuffer.delete(0, stringBuffer.length());
        }
    }
}
