package tb;

import com.alibaba.fastjson.JSONObject;
import com.taobao.android.weex.WeexErrorType;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface gce {
    public static final String KEY_CRASH_INFO_JS_VERSION = "js_version";
    public static final String KEY_CRASH_INFO_URL = "page_url";

    void a(Map<String, String> map);

    void b(String str, String str2, String str3, String str4, String str5, String str6, JSONObject jSONObject, String str7);

    void c(WeexErrorType weexErrorType, String str, String str2, String str3);
}
