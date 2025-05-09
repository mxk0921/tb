package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class av6 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final boolean DEBUG_ENABLE = true;
    public static final String DINAMIC_PLUGIN_TAG = "DinamicPlugin";
    public static final String IMAGE_PROCESS_TAG = "ImageProcess";
    public static final String INDEX_DISORDER_TAG = "IndexDisorder";
    public static final String LOG_PREFIX = "REC";
    public static final String USER_TRACK_TAG = "UserTrack";

    static {
        t2o.a(729809628);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("690ef354", new Object[0])).booleanValue();
        }
        return cw6.b();
    }
}
