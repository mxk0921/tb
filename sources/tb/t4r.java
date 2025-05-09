package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class t4r implements y8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(786432057);
        t2o.a(336592932);
    }

    public final Map<String, String> b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("703db5dd", new Object[]{this, jSONObject});
        }
        HashMap hashMap = new HashMap();
        if (jSONObject != null) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (!TextUtils.isEmpty(key) && value != null) {
                    hashMap.put(key, String.valueOf(value));
                }
            }
        }
        return hashMap;
    }

    public final int c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19d449c0", new Object[]{this, str})).intValue();
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    @Override // tb.y8
    public c8 a(k8 k8Var, String str, String str2, JSONObject jSONObject) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("dbb55a02", new Object[]{this, k8Var, str, str2, jSONObject});
        }
        if (k8Var == null) {
            return new b8(new a8(10004, "ut异常error context为空"), false);
        }
        if ("updatePageName".equals(str)) {
            if (TextUtils.isEmpty(str2)) {
                return new b8(new a8(10004, "ut异常error updatePageName pageName为空"), false);
            }
            Context d = k8Var.d();
            if (d == null) {
                return new b8(new a8(10004, "ut异常error updatePageName activity 为空"), false);
            }
            try {
                UTAnalytics.getInstance().getDefaultTracker().updatePageName(d, str2);
                return new f8();
            } catch (Throwable unused) {
                return new b8(new a8(10004, "ut异常error updatePageName"), false);
            }
        } else if (a1v.UPDATE_NEXT_PAGE_PROPERTIES.equals(str)) {
            try {
                UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(b(jSONObject));
                return new f8();
            } catch (Throwable unused2) {
                return new b8(new a8(10004, "ut异常error updateNextPageProperties"), false);
            }
        } else if (a1v.UPDATE_PAGE_PROPERTIES.equals(str)) {
            Context d2 = k8Var.d();
            if (d2 == null) {
                return new b8(new a8(10004, "ut异常error updatePageProperties activity 为空"), false);
            }
            try {
                UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(d2, b(jSONObject));
                return new f8();
            } catch (Throwable unused3) {
                return new b8(new a8(10004, "ut异常error updatePageProperties"), false);
            }
        } else if ("updateNextPageUtparam".equals(str)) {
            try {
                UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(JSON.toJSONString(b(jSONObject)));
                return new f8();
            } catch (Throwable unused4) {
                return new b8(new a8(10004, "ut异常error updateNextPageUtparam"), false);
            }
        } else if ("updateNextPageUtparamCnt".equals(str)) {
            try {
                UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparamCnt(JSON.toJSONString(b(jSONObject)));
                return new f8();
            } catch (Throwable unused5) {
                return new b8(new a8(10004, "ut异常error updateNextPageUtparamCnt"), false);
            }
        } else if (a1v.UPDATE_PAGE_UTPARAM.equals(str)) {
            try {
                UTAnalytics.getInstance().getDefaultTracker().updatePageUtparam(k8Var.d(), JSON.toJSONString(b(jSONObject)));
                return new f8();
            } catch (Throwable unused6) {
                return new b8(new a8(10004, "ut异常error updatePageUtparamCnt"), false);
            }
        } else {
            if ("click".equals(str)) {
                i = 2101;
            } else if ("componentExposure".equals(str)) {
                i = 2201;
            } else if ("pageExposure".equals(str)) {
                i = 2001;
            } else if (TextUtils.isEmpty(str)) {
                return new b8(new a8(10004, "utAction 为空"), false);
            } else {
                i = c(str);
            }
            if (i == -1) {
                return new b8(new a8(10004, "utAction 不符合eventId规则"), false);
            }
            return ye2.f(i, str2, jSONObject);
        }
    }
}
