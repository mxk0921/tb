package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.DynamicMergeUtils;
import com.taobao.android.preload.core.task.PreloadTaskEntity;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class mtm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262831);
    }

    public static int b(boolean z, String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a836e621", new Object[]{new Boolean(z), str})).intValue();
        }
        if (!z || TextUtils.isEmpty(str) || (split = str.split(":")) == null || split.length < 2 || TextUtils.equals(split[0], split[1])) {
            return 1;
        }
        return 2;
    }

    public static boolean d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0dd453b", new Object[]{jSONObject})).booleanValue();
        }
        if (e(jSONObject) || e(DynamicMergeUtils.e(jSONObject))) {
            return true;
        }
        JSONObject h = DynamicMergeUtils.h(jSONObject);
        if (h == null || !e(h.getJSONObject("meta"))) {
            return false;
        }
        return true;
    }

    public static boolean e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("326e3191", new Object[]{jSONObject})).booleanValue();
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("feature");
        if (jSONObject2 == null || !jSONObject2.getBooleanValue("headerPicFlow")) {
            return false;
        }
        return true;
    }

    public static void f(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b902bdc3", new Object[]{str, str2, str3});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("itemId", str);
        hashMap.put(PreloadTaskEntity.SOURCE_FROM, str2);
        hashMap.put(s0j.MTS_TAG_PRELOAD_TYPE, str3);
        bw7.c("preloadCache", hashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0073 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:7:0x0016, B:10:0x0023, B:13:0x002d, B:16:0x0037, B:18:0x003f, B:21:0x0047, B:23:0x004d, B:30:0x0065, B:32:0x0073, B:34:0x0085, B:37:0x00a6, B:38:0x00aa, B:40:0x00b3, B:41:0x00c2, B:43:0x00cb, B:44:0x00d9), top: B:53:0x0016 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<java.lang.String> a(com.alibaba.fastjson.JSONObject r14) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.mtm.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "fa5a2472"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r14
            java.lang.Object r14 = r2.ipc$dispatch(r3, r1)
            java.util.List r14 = (java.util.List) r14
            return r14
        L_0x0015:
            r2 = 0
            java.lang.String r3 = "data"
            com.alibaba.fastjson.JSONObject r14 = r14.getJSONObject(r3)     // Catch: all -> 0x0061
            com.alibaba.fastjson.JSONObject r3 = com.taobao.android.detail.ttdetail.utils.DynamicMergeUtils.h(r14)     // Catch: all -> 0x0061
            if (r3 != 0) goto L_0x0023
            return r2
        L_0x0023:
            java.lang.String r4 = "model"
            com.alibaba.fastjson.JSONObject r3 = r3.getJSONObject(r4)     // Catch: all -> 0x0061
            if (r3 != 0) goto L_0x002d
            return r2
        L_0x002d:
            java.lang.String r4 = "headerPic"
            com.alibaba.fastjson.JSONObject r3 = r3.getJSONObject(r4)     // Catch: all -> 0x0061
            if (r3 != 0) goto L_0x0037
            return r2
        L_0x0037:
            java.lang.String r4 = "groups"
            com.alibaba.fastjson.JSONArray r3 = r3.getJSONArray(r4)     // Catch: all -> 0x0061
            if (r3 == 0) goto L_0x00e5
            boolean r4 = r3.isEmpty()     // Catch: all -> 0x0061
            if (r4 == 0) goto L_0x0047
            goto L_0x00e5
        L_0x0047:
            boolean r14 = d(r14)     // Catch: all -> 0x0061
            if (r14 != 0) goto L_0x0064
            java.lang.Boolean r14 = java.lang.Boolean.TRUE     // Catch: all -> 0x0061
            java.util.Map<java.lang.String, java.lang.Boolean> r4 = com.taobao.android.detail.ttdetail.feature.DevFeature.mFeature     // Catch: all -> 0x0061
            java.lang.String r5 = "headerFlingMode"
            java.lang.Object r4 = r4.get(r5)     // Catch: all -> 0x0061
            boolean r14 = r14.equals(r4)     // Catch: all -> 0x0061
            if (r14 == 0) goto L_0x005f
            goto L_0x0064
        L_0x005f:
            r14 = 0
            goto L_0x0065
        L_0x0061:
            r14 = move-exception
            goto L_0x00e6
        L_0x0064:
            r14 = 1
        L_0x0065:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: all -> 0x0061
            r5 = 2
            r4.<init>(r5)     // Catch: all -> 0x0061
            int r5 = r3.size()     // Catch: all -> 0x0061
            r6 = 0
            r7 = 1
        L_0x0071:
            if (r6 >= r5) goto L_0x00e4
            com.alibaba.fastjson.JSONObject r8 = r3.getJSONObject(r6)     // Catch: all -> 0x0061
            java.lang.String r9 = "items"
            com.alibaba.fastjson.JSONArray r8 = r8.getJSONArray(r9)     // Catch: all -> 0x0061
            int r9 = r8.size()     // Catch: all -> 0x0061
            r10 = 0
        L_0x0083:
            if (r10 >= r9) goto L_0x00e2
            com.alibaba.fastjson.JSONObject r11 = r8.getJSONObject(r10)     // Catch: all -> 0x0061
            java.lang.String r12 = "dimension"
            java.lang.String r12 = r11.getString(r12)     // Catch: all -> 0x0061
            java.lang.String r13 = "content"
            com.alibaba.fastjson.JSONObject r11 = r11.getJSONObject(r13)     // Catch: all -> 0x0061
            java.lang.String r13 = "fields"
            com.alibaba.fastjson.JSONObject r11 = r11.getJSONObject(r13)     // Catch: all -> 0x0061
            java.lang.String r13 = "type"
            java.lang.String r13 = r11.getString(r13)     // Catch: all -> 0x0061
            if (r6 != 0) goto L_0x00aa
            if (r10 != 0) goto L_0x00aa
            int r7 = b(r14, r12)     // Catch: all -> 0x0061
        L_0x00aa:
            java.lang.String r12 = "image"
            boolean r12 = r12.equals(r13)     // Catch: all -> 0x0061
            if (r12 == 0) goto L_0x00c2
            java.lang.String r12 = "url"
            java.lang.String r11 = r11.getString(r12)     // Catch: all -> 0x0061
            java.lang.String r11 = tb.jov.d(r11)     // Catch: all -> 0x0061
            r4.add(r11)     // Catch: all -> 0x0061
            goto L_0x00d9
        L_0x00c2:
            java.lang.String r12 = "video"
            boolean r12 = r12.equals(r13)     // Catch: all -> 0x0061
            if (r12 == 0) goto L_0x00d9
            java.lang.String r12 = "thumbnailUrl"
            java.lang.String r11 = r11.getString(r12)     // Catch: all -> 0x0061
            java.lang.String r11 = tb.jov.d(r11)     // Catch: all -> 0x0061
            r4.add(r11)     // Catch: all -> 0x0061
        L_0x00d9:
            int r11 = r4.size()     // Catch: all -> 0x0061
            if (r11 < r7) goto L_0x00e0
            return r4
        L_0x00e0:
            int r10 = r10 + r1
            goto L_0x0083
        L_0x00e2:
            int r6 = r6 + r1
            goto L_0x0071
        L_0x00e4:
            return r4
        L_0x00e5:
            return r2
        L_0x00e6:
            java.lang.String r0 = "PreloadUtils"
            java.lang.String r1 = "getMainPicUrl error"
            tb.tgh.c(r0, r1, r14)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.mtm.a(com.alibaba.fastjson.JSONObject):java.util.List");
    }

    public static String c(JSONObject jSONObject) {
        JSONObject h;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b301f57d", new Object[]{jSONObject});
        }
        try {
            h = DynamicMergeUtils.h(jSONObject.getJSONObject("data"));
        } catch (Throwable th) {
            tgh.c("PreloadUtils", "getSmallWindowPicUrl error", th);
        }
        if (!(h == null || (jSONObject2 = h.getJSONObject("model")) == null || (jSONObject3 = jSONObject2.getJSONObject("headerPic")) == null || (jSONArray = jSONObject3.getJSONArray(wua.KEY_SMALL_WINDOW)) == null || jSONArray.isEmpty())) {
            for (int i = 0; i <= jSONArray.size(); i++) {
                JSONObject jSONObject4 = jSONArray.getJSONObject(i);
                if (jSONObject4 != null && !jSONObject4.isEmpty()) {
                    String string = jSONObject4.getString("type");
                    if (!TextUtils.isEmpty(string) && TextUtils.equals("detailVideo", string)) {
                        JSONObject jSONObject5 = jSONObject4.getJSONObject("data").getJSONObject("content").getJSONObject("fields");
                        if (jSONObject5 == null) {
                            return null;
                        }
                        return jov.d(jSONObject5.getString("thumbnailUrl"));
                    }
                }
            }
            return null;
        }
        return null;
    }
}
