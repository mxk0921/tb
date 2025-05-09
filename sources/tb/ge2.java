package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ge2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, JSONObject> f19920a = new HashMap(4);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f19921a;
        public final /* synthetic */ JSONObject b;

        public a(String str, JSONObject jSONObject) {
            this.f19921a = str;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                slp.e(this.f19921a, this.b.toString());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f19922a;
        public final /* synthetic */ JSONObject b;

        public b(String str, JSONObject jSONObject) {
            this.f19922a = str;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            slp.e(this.f19922a, this.b.toString());
            uqa.b("TopTabBar", "saveTabParams", "BizParamsPersistenceUtils.saveBizParams; saveKey:" + this.f19922a + ";params:" + this.b.toString());
        }
    }

    static {
        t2o.a(729809130);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("889d25c", new Object[]{str});
        } else {
            d(yyj.e().k(), str, " ");
        }
    }

    public static JSONObject b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("32ef0b34", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Map<String, JSONObject> map = f19920a;
            JSONObject jSONObject = (JSONObject) ((HashMap) map).get(str);
            if (jSONObject != null) {
                return jSONObject;
            }
            String c = slp.c("bizParams_" + str, null);
            if (c == null) {
                return null;
            }
            JSONObject parseObject = JSON.parseObject(c);
            ((HashMap) map).put(str, parseObject);
            return parseObject;
        } catch (Throwable th) {
            sfh.d("BizParamsPersistenceUtils", "getBizParams error : " + th.getMessage());
            return null;
        }
    }

    public static void c(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27d95783", new Object[]{str, jSONObject});
        } else if (!TextUtils.isEmpty(str)) {
            String str2 = "bizParams_" + str;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            ((HashMap) f19920a).put(str, jSONObject);
            m5a.a().e(new b(str2, jSONObject));
        }
    }

    public static void d(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90556ba1", new Object[]{str, str2, str3});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            Map<String, JSONObject> map = f19920a;
            JSONObject jSONObject = (JSONObject) ((HashMap) map).get(str);
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            jSONObject.put(str2, (Object) str3);
            ((HashMap) map).put(str, jSONObject);
            m5a.a().e(new a("bizParams_" + str, jSONObject));
        }
    }
}
