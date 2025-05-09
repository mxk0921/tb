package tb;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class q4b implements hdc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809380);
        t2o.a(729809365);
    }

    @Override // tb.hdc
    public List<String> getActions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("39cd6eb9", new Object[]{this});
        }
        return Arrays.asList("addTrackProperties", "removeTrackProperties", "getTrackProperties");
    }

    public final boolean a(String str, WVCallBackContext wVCallBackContext) {
        imn d;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59686d0f", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        try {
            d = zza.d(null);
        } catch (Exception unused) {
            wVCallBackContext.error();
            uqa.b("Bridge", "addTrackProperties", "exception:params parse exception");
        }
        if (d == null) {
            wVCallBackContext.error();
            uqa.b("Bridge", "addTrackProperties", "error:dataSource=null");
            return true;
        }
        JSONObject parseObject = JSON.parseObject(str);
        if (parseObject != null && !parseObject.isEmpty() && (jSONObject = parseObject.getJSONObject("props")) != null && !jSONObject.isEmpty()) {
            for (String str2 : jSONObject.keySet()) {
                d.i(str2, jSONObject.getString(str2));
            }
        }
        wVCallBackContext.success();
        uqa.b("Bridge", "addTrackProperties", "success");
        return true;
    }

    public final boolean b(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("998803fa", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        vqa e = vqa.k().i("Bridge").j("getTrackProperties").e("homepage.HomePageWVPlugin.getTrackProperties");
        imn d = zza.d(null);
        if (d == null) {
            wVCallBackContext.error("当前dataSource为null");
            e.g(c4o.KEY_DATA_SOURCE, "null").a();
            return true;
        }
        JSONObject s = d.s();
        if (s == null) {
            wVCallBackContext.error("当前无参数");
            e.g("埋点信息", "null").a();
            return true;
        }
        nsw nswVar = new nsw();
        nswVar.a("props", s);
        wVCallBackContext.success(nswVar);
        e.e("success").a();
        return true;
    }

    @Override // tb.hdc
    public boolean e(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (TextUtils.equals(str, "addTrackProperties")) {
            return a(str2, wVCallBackContext);
        }
        if (TextUtils.equals(str, "removeTrackProperties")) {
            return c(str2, wVCallBackContext);
        }
        if (TextUtils.equals(str, "getTrackProperties")) {
            return b(str2, wVCallBackContext);
        }
        return false;
    }

    public final boolean c(String str, WVCallBackContext wVCallBackContext) {
        imn c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24861a8c", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        try {
            c = zza.c();
        } catch (Exception unused) {
            wVCallBackContext.error();
            uqa.b("Bridge", "removeTrackProperties", "exception:params parse exception;");
        }
        if (c == null) {
            wVCallBackContext.error();
            uqa.b("Bridge", "removeTrackProperties", "homepage.HomePageWVPlugin.removeTrackProperties;error: dataSource=null;");
            return true;
        } else if (TextUtils.isEmpty(str)) {
            c.W();
            wVCallBackContext.success();
            return true;
        } else {
            JSONObject parseObject = JSON.parseObject(str);
            if (parseObject != null) {
                if (parseObject.isEmpty()) {
                    c.W();
                    wVCallBackContext.success();
                    return true;
                }
                JSONArray jSONArray = parseObject.getJSONArray("props");
                if (jSONArray != null && !jSONArray.isEmpty()) {
                    int size = jSONArray.size();
                    for (int i = 0; i < size; i++) {
                        c.X(jSONArray.getString(i));
                    }
                }
            }
            wVCallBackContext.success();
            uqa.b("Bridge", "removeTrackProperties", "success");
            return true;
        }
    }
}
