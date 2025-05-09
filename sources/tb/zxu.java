package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTUtdid;
import com.taobao.tinct.ITinctOperater;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class zxu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("83611144", new Object[]{str});
        }
        if (byu.a(str)) {
            return "";
        }
        return str;
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d85b5c99", new Object[0]);
        }
        return String.valueOf(System.currentTimeMillis() - 1546272000433L);
    }

    public static String c(Map<String, List<String>> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b8a8fd55", new Object[]{map, str});
        }
        List<String> list = map.get(str);
        if (list == null || list.isEmpty()) {
            return "";
        }
        String valueOf = String.valueOf(list.get(0));
        if (byu.b(valueOf)) {
            return valueOf;
        }
        return "";
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("707fddc9", new Object[0]);
        }
        return c2v.getInstance().getCurrentPageName();
    }

    public static String e() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f00d779e", new Object[0]);
        }
        Thread currentThread = Thread.currentThread();
        if (byu.a(currentThread.getName())) {
            str = "default_thread";
        } else {
            str = currentThread.getName();
        }
        long id = currentThread.getId();
        ThreadGroup threadGroup = currentThread.getThreadGroup();
        String str2 = "default_group";
        if (threadGroup != null && !byu.a(threadGroup.getName())) {
            str2 = threadGroup.getName();
        }
        return str2 + "|" + str + "|" + id;
    }

    public static String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("592dc989", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "empty";
        }
        String tinctInfo = ITinctOperater.getInstance().getTinctInfo(str);
        if (TextUtils.isEmpty(tinctInfo)) {
            return "empty";
        }
        return tinctInfo;
    }

    public static String g(MtopResponse mtopResponse) {
        Map<String, List<String>> headerFields;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a81cccb", new Object[]{mtopResponse});
        }
        if (mtopResponse == null || (headerFields = mtopResponse.getHeaderFields()) == null) {
            return "";
        }
        String c = c(headerFields, "mtop-buytraceid");
        if (byu.b(c)) {
            return c;
        }
        String c2 = c(headerFields, HttpConstant.EAGLE_EYE_ID_2);
        if (byu.b(c2)) {
            return c2;
        }
        String c3 = c(headerFields, "eagleeye-traceid");
        if (byu.b(c3)) {
            return c3;
        }
        String c4 = c(headerFields, "EagleEye-TraceId");
        return byu.b(c4) ? c4 : "";
    }

    public static String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3fdfad6f", new Object[0]);
        }
        try {
            return UTUtdid.instance(null).getValue();
        } catch (Throwable unused) {
            return String.valueOf(SystemClock.currentThreadTimeMillis());
        }
    }

    public static String i(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55c9ebd5", new Object[]{obj});
        }
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            return obj.toString();
        }
        return JSON.toJSONString(obj);
    }
}
