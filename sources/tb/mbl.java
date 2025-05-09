package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class mbl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_CHAT_ACTIVITY_URL = "http://tb.cn/n/im/dynamic/chat.html";
    public static final String KEY_CHAT_ACTIVITY_URL = "ChatActivityURL";
    public static final String KEY_ENABLE_VIDEO_DOWNLOAD = "videodownload_enable";
    public static final String KEY_NEW_NAMESPACE = "android_share_bizconfig";

    static {
        t2o.a(793772123);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("611ec1eb", new Object[0])).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", KEY_ENABLE_VIDEO_DOWNLOAD, "true"));
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7ceb5707", new Object[0]);
        }
        return OrangeConfig.getInstance().getConfig("android_share_bizconfig", KEY_CHAT_ACTIVITY_URL, DEFAULT_CHAT_ACTIVITY_URL);
    }
}
