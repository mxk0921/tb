package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class yt6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f32342a = Pattern.compile("(^.+)\\[([0-9]+)\\]");

    static {
        t2o.a(157286491);
    }

    public static String[] a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("9b6e786c", new Object[]{str});
        }
        Matcher matcher = f32342a.matcher(str);
        if (matcher.find()) {
            return new String[]{matcher.group(1), matcher.group(2)};
        }
        return null;
    }

    public static void c(JSONObject jSONObject, JSONObject jSONObject2, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ced989ea", new Object[]{jSONObject, jSONObject2, jSONArray});
        } else if (jSONObject != null && jSONObject2 != null && jSONArray != null) {
            if (jSONObject2.containsKey("componentsVO")) {
                jSONObject2 = jSONObject2.getJSONObject("componentsVO");
            }
            try {
                Iterator<Object> it = jSONArray.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof JSONObject) {
                        String string = ((JSONObject) next).getString("sourceConstantData");
                        String string2 = ((JSONObject) next).getString("sourcePath");
                        String string3 = ((JSONObject) next).getString("targetPath");
                        if (string3 != null) {
                            if (string3.startsWith("componentsVO.")) {
                                string3 = string3.replace("componentsVO.", "");
                            }
                            b(jSONObject, string, string2, jSONObject2, string3);
                        }
                    }
                }
            } catch (Exception e) {
                UnifyLog.e("DataUtils", "mergeVOData exception: " + sgq.a(e));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.StringBuilder] */
    public static void b(JSONObject jSONObject, String str, String str2, JSONObject jSONObject2, String str3) {
        JSONObject jSONObject3;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7444d08", new Object[]{jSONObject, str, str2, jSONObject2, str3});
            return;
        }
        if (str != null) {
            jSONObject = str;
        } else {
            String[] split = str2.split("\\.");
            if (split != null) {
                int i2 = 0;
                jSONObject = jSONObject;
                while (i2 < split.length && (jSONObject instanceof JSONObject)) {
                    String str4 = split[i2];
                    String[] a2 = a(str4);
                    if (a2 != null) {
                        JSONArray jSONArray = ((JSONObject) jSONObject).getJSONArray(a2[0]);
                        if (jSONArray == null) {
                            break;
                        }
                        try {
                            jSONObject = jSONArray.get(Integer.parseInt(a2[1]));
                        } catch (Exception e) {
                            UnifyLog.e("DataUtils", "get jsonArray exception: " + e.getMessage());
                        }
                    } else if (!TextUtils.isEmpty(str4)) {
                        jSONObject = ((JSONObject) jSONObject).get(str4);
                    }
                    i2++;
                    jSONObject = jSONObject;
                }
            } else if (!TextUtils.isEmpty(str2)) {
                jSONObject = jSONObject.get(str2);
            }
        }
        String[] split2 = str3.split("\\.");
        int i3 = 0;
        JSONObject jSONObject4 = jSONObject2;
        while (i3 < split2.length - 1) {
            String str5 = split2[i3];
            String[] a3 = a(str5);
            if (a3 != null) {
                JSONArray jSONArray2 = jSONObject4.getJSONArray(a3[0]);
                JSONArray jSONArray3 = jSONArray2;
                if (jSONArray2 == null) {
                    JSONArray jSONArray4 = new JSONArray();
                    jSONObject4.put(a3[0], (Object) jSONArray4);
                    jSONArray3 = jSONArray4;
                }
                try {
                    i = Integer.parseInt(a3[1]);
                } catch (Exception e2) {
                    UnifyLog.e("DataUtils", "get jsonArray exception: " + e2.getMessage());
                    i = 0;
                }
                if (i <= jSONArray3.size() - 1) {
                    JSONObject jSONObject5 = (JSONObject) jSONArray3.get(i);
                    jSONObject3 = jSONObject5;
                    if (jSONObject5 == null) {
                        JSONObject jSONObject6 = new JSONObject();
                        jSONArray3.add(i, jSONObject6);
                        jSONObject3 = jSONObject6;
                    }
                } else if (i == jSONArray3.size() - 1) {
                    jSONObject3 = new JSONObject();
                    jSONArray3.add(jSONObject3);
                } else {
                    UnifyLog.e("DataUtils", "插入输入index超过本身size");
                    return;
                }
            } else {
                JSONObject jSONObject7 = jSONObject4.getJSONObject(str5);
                jSONObject3 = jSONObject7;
                if (jSONObject7 == null) {
                    JSONObject jSONObject8 = new JSONObject();
                    jSONObject4.put(split2[i3], (Object) jSONObject8);
                    jSONObject3 = jSONObject8;
                }
            }
            i3++;
            jSONObject4 = jSONObject3;
        }
        if (split2.length > 0) {
            jSONObject4.put(split2[split2.length - 1], (Object) jSONObject);
            UnifyLog.g("DataUtils", "merge data: " + split2[split2.length - 1] + "->" + jSONObject);
        } else if (!TextUtils.isEmpty(str3)) {
            jSONObject4.put(str3, (Object) jSONObject);
            UnifyLog.g("DataUtils", "merge data: " + str3 + "->" + jSONObject);
        } else if (jSONObject instanceof Map) {
            jSONObject4.putAll((Map) jSONObject);
            UnifyLog.g("DataUtils", "merge all data: " + jSONObject);
        }
    }
}
