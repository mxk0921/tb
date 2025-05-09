package tb;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class k0b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final List<hdc> f22319a;
    public static final Map<String, hdc> b = new ConcurrentHashMap();

    static {
        t2o.a(729809363);
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        f22319a = copyOnWriteArrayList;
        copyOnWriteArrayList.add(new gza());
        copyOnWriteArrayList.add(new sza());
        copyOnWriteArrayList.add(new wza());
        copyOnWriteArrayList.add(new xza());
        copyOnWriteArrayList.add(new b0b());
        copyOnWriteArrayList.add(new c0b());
        copyOnWriteArrayList.add(new l0b());
        copyOnWriteArrayList.add(new s3b());
        copyOnWriteArrayList.add(new t3b());
        copyOnWriteArrayList.add(new q4b());
        copyOnWriteArrayList.add(new s4b());
        copyOnWriteArrayList.add(new y4b());
        copyOnWriteArrayList.add(new y2b());
        copyOnWriteArrayList.add(new a5b());
        copyOnWriteArrayList.add(new zsl());
        copyOnWriteArrayList.add(new n4b());
        copyOnWriteArrayList.add(new b6z());
    }

    public static String[] a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("d577d2d4", new Object[]{str, str2});
        }
        if (!TextUtils.equals(str, xpc.RECORD_EXECUTE)) {
            return new String[]{str, str2};
        }
        try {
            JSONObject parseObject = JSON.parseObject(str2);
            if (parseObject != null) {
                str = parseObject.getString("action");
                str2 = parseObject.getString("param");
            }
        } catch (Exception e) {
            bqa.d("HomePageJsFeatureDispatcher", "compatibleAction parse error" + e);
        }
        return new String[]{str, str2};
    }

    public static boolean b(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eabad819", new Object[]{str, str2, wVCallBackContext})).booleanValue();
        }
        bqa.d("HomePageJsFeatureDispatcher", "dispatcherAction " + str + ",params:" + str2);
        String[] a2 = a(str, str2);
        bqa.d("HomePageJsFeatureDispatcher", "dispatcherAction jsParams action:" + a2[0] + ",params:" + a2[1]);
        hdc hdcVar = (hdc) ((ConcurrentHashMap) b).get(a2[0]);
        if (hdcVar != null) {
            return hdcVar.e(a2[0], a2[1], wVCallBackContext);
        }
        bqa.d("HomePageJsFeatureDispatcher", "dispatcherAction " + str + " feature not found");
        return false;
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beb952c0", new Object[0]);
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) f22319a).iterator();
        while (it.hasNext()) {
            d((hdc) it.next());
        }
    }

    public static void d(hdc hdcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1051a50", new Object[]{hdcVar});
            return;
        }
        List<String> actions = hdcVar.getActions();
        if (actions == null || actions.isEmpty()) {
            bqa.d("HomePageJsFeatureDispatcher", "registerAction actions null ,feature: " + hdcVar);
            return;
        }
        for (String str : actions) {
            ((ConcurrentHashMap) b).put(str, hdcVar);
        }
    }

    public static void e(hdc hdcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b75c437", new Object[]{hdcVar});
            return;
        }
        List<String> actions = hdcVar.getActions();
        if (actions == null || actions.isEmpty()) {
            bqa.d("HomePageJsFeatureDispatcher", "unRegisterAction actions null ,feature: " + hdcVar);
            return;
        }
        for (String str : actions) {
            ((ConcurrentHashMap) b).remove(str);
        }
        bqa.d("HomePageJsFeatureDispatcher", "unRegisterAction actions, feature: " + hdcVar);
    }
}
