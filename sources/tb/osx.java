package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.wireless.aliprivacyext.plugins.ApWindVanePlugin;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class osx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f25629a = "参数异常";
    public static final String b = "不支持的类型";
    public static final String c = "调用成功";
    public static final String d = "调用失败";

    public abstract boolean b(Context context, String str, String str2, pwx pwxVar);

    public void a(pwx pwxVar, String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b1b0a0f", new Object[]{this, pwxVar, str, map});
            return;
        }
        HashMap hashMap = new HashMap(2);
        if (map != null) {
            hashMap.putAll(map);
        }
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("message", str);
        }
        if (pwxVar != null) {
            ((ApWindVanePlugin.a) pwxVar).a(hashMap);
        }
    }

    public void c(pwx pwxVar, String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b31a686e", new Object[]{this, pwxVar, str, map});
            return;
        }
        HashMap hashMap = new HashMap(2);
        if (map != null) {
            hashMap.putAll(map);
        }
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("message", str);
        }
        if (pwxVar != null) {
            ((ApWindVanePlugin.a) pwxVar).b(hashMap);
        }
    }
}
