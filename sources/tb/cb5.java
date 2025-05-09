package tb;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class cb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static hub f16956a;
    public static final Map<String, List<String>> b = new ConcurrentHashMap(5);
    public static boolean c;

    static {
        t2o.a(444596468);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
            return;
        }
        try {
            String c2 = eb5.c();
            if (!TextUtils.isEmpty(c2)) {
                JSONObject parseObject = JSON.parseObject(c2);
                for (String str : parseObject.keySet()) {
                    JSONArray jSONArray = parseObject.getJSONArray(str);
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < jSONArray.size(); i++) {
                        arrayList.add(jSONArray.getString(i));
                    }
                    ((ConcurrentHashMap) b).put(str, arrayList);
                }
                c = true;
                Log.e(h36.TAG, "本地开关上传成功" + c2);
            }
        } catch (Throwable th) {
            h36.g(h36.TAG, "ab 获取获取异常" + xv5.a(th));
        }
    }

    public static boolean b(String str) {
        hub hubVar;
        Map<String, Object> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f02d4682", new Object[]{str})).booleanValue();
        }
        if (c) {
            return ((ConcurrentHashMap) b).containsKey(str);
        }
        if (!nb6.i() || TextUtils.isEmpty(str) || (hubVar = f16956a) == null || (a2 = hubVar.a("DXPerform", str)) == null) {
            return false;
        }
        Object obj = a2.get(str + "TemplateWhiteList");
        if (obj == null) {
            return false;
        }
        if (!TextUtils.isEmpty(obj.toString())) {
            ((ConcurrentHashMap) b).put(str, new ArrayList(Arrays.asList(obj.toString().trim().split(","))));
        }
        return true;
    }

    public static boolean c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97433a66", new Object[]{str, str2})).booleanValue();
        }
        List<String> list = (List) ((ConcurrentHashMap) b).get(str);
        if (list == null) {
            return false;
        }
        if (!(j18.HOMEPAGE_DX_MODULE.equals(str) || "guess".equals(str))) {
            return list.contains(str2);
        }
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : list) {
            if (str2.endsWith(str3)) {
                return true;
            }
        }
        return false;
    }

    public static void d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c966c33", new Object[]{str, str2});
        } else if (!c) {
            ((ConcurrentHashMap) b).put(str, new ArrayList(Arrays.asList(str2.trim().split(","))));
        }
    }

    public static void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a23cef8", new Object[]{str, str2});
            return;
        }
        List<String> list = (List) ((ConcurrentHashMap) b).get(str);
        if (list != null) {
            if (j18.HOMEPAGE_DX_MODULE.equals(str) || "guess".equals(str)) {
                for (String str3 : list) {
                    if (str2.endsWith(str3)) {
                        list.remove(str3);
                        return;
                    }
                }
                return;
            }
            list.remove(str2);
        }
    }
}
