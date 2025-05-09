package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class n8l {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACCS_TARGET_WITH_TOPIC_SWITCH = "accs_target_with_topic";
    public static final String MTOP_API_SWITCH = "mtop_api_namespace";
    public static final String NORMAL_SWITCH = "pm_normal_switch";
    public static final String STREAM_MESSAGE_CACHE_SIZE = "stm_msg_cache_size";

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f24571a = null;
    public static final Map<String, List<Integer>> b = new ConcurrentHashMap();
    public static Boolean c = null;

    static {
        t2o.a(628097073);
    }

    public static boolean a(int i, String str, String str2) {
        boolean contains;
        ConcurrentHashMap concurrentHashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c3da4e3", new Object[]{new Integer(i), str, str2})).booleanValue();
        }
        Map<String, List<Integer>> map = b;
        synchronized (map) {
            List list = (List) ((ConcurrentHashMap) map).get(str);
            ArrayList arrayList = list;
            if (list == null) {
                ArrayList arrayList2 = new ArrayList();
                try {
                    String c2 = jg4.c(str, str2);
                    MsgLog.e("OrangeAdapter", "getAvailableByNamespace: " + c2);
                    if (!TextUtils.isEmpty(c2)) {
                        for (String str3 : c2.split(",")) {
                            arrayList2.add(Integer.valueOf(Integer.parseInt(str3)));
                        }
                    }
                    concurrentHashMap = (ConcurrentHashMap) b;
                } catch (Exception e) {
                    MsgLog.f("OrangeAdapter", e, "getAvailableByNamespace err");
                    concurrentHashMap = (ConcurrentHashMap) b;
                }
                concurrentHashMap.put(str, arrayList2);
                arrayList = arrayList2;
            }
            contains = arrayList.contains(Integer.valueOf(i));
        }
        return contains;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44d71b3", new Object[0])).booleanValue();
        }
        boolean parseBoolean = Boolean.parseBoolean(jg4.c(ACCS_TARGET_WITH_TOPIC_SWITCH, "false"));
        MsgLog.e("OrangeAdapter", "isRmTargetTopicEnabled: " + parseBoolean);
        return parseBoolean;
    }

    public static boolean d(Context context) {
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            bool = (Boolean) ipChange.ipc$dispatch("7729ed2d", new Object[]{context});
        } else {
            if (f24571a == null) {
                try {
                    f24571a = Boolean.valueOf("com.taobao.taobao".equals(context.getPackageName()));
                } catch (Exception e) {
                    MsgLog.f("OrangeAdapter", e, "isTaobao err");
                    return true;
                }
            }
            bool = f24571a;
        }
        return bool.booleanValue();
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9fe67a32", new Object[0])).intValue();
        }
        int i = 1000;
        try {
            i = Integer.parseInt(jg4.c(STREAM_MESSAGE_CACHE_SIZE, String.valueOf(1000)));
            MsgLog.e("OrangeAdapter", "getStreamMsgCacheSize: " + i);
            return i;
        } catch (Throwable th) {
            th.printStackTrace();
            return i;
        }
    }

    public static boolean e() {
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            bool = (Boolean) ipChange.ipc$dispatch("9eb31d0", new Object[0]);
        } else {
            if (c == null) {
                c = Boolean.valueOf(Boolean.parseBoolean(jg4.c(NORMAL_SWITCH, "true")));
                MsgLog.e("OrangeAdapter", "normalChangesEnabled: " + c);
            }
            bool = c;
        }
        return bool.booleanValue();
    }
}
