package tb;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class l0b implements hdc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809374);
        t2o.a(729809365);
    }

    public boolean a(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71324c17", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        String a2 = m6g.a(str, null);
        nsw nswVar = new nsw();
        nswVar.b("cacheValue", a2);
        wVCallBackContext.success(nswVar);
        uqa.b("Bridge", "getCacheValue", "homepage.HomePageWVPlugin.getCacheValue; success");
        return true;
    }

    @Override // tb.hdc
    public List<String> getActions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("39cd6eb9", new Object[]{this});
        }
        return Arrays.asList("getCache", "updateCache");
    }

    @Override // tb.hdc
    public boolean e(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (TextUtils.equals("getCache", str)) {
            return a(str2, wVCallBackContext);
        }
        if (TextUtils.equals("updateCache", str)) {
            return b(str2, wVCallBackContext);
        }
        return false;
    }

    public boolean b(String str, WVCallBackContext wVCallBackContext) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17afa60a", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        vqa e = vqa.k().i("Bridge").j("updateCacheValue").e("homepage.HomePageWVPlugin.updateCacheValue");
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject parseObject = JSON.parseObject(str);
                if (parseObject != null) {
                    String string = parseObject.getString("scene");
                    String string2 = parseObject.getString("subScene");
                    String string3 = parseObject.getString("value");
                    z = m6g.e(string, string2, string3, "JSBRIDGE");
                    e.g("scene", string).g("subScene", string2).g("value", string3);
                }
            } catch (Exception unused) {
                e.g("exception", "json parse exception");
            }
        }
        if (z) {
            wVCallBackContext.success();
            e.e("success");
        } else {
            wVCallBackContext.error("update cache fail");
            e.e("fail");
        }
        e.a();
        return true;
    }
}
