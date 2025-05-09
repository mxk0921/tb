package tb;

import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface obk extends mbk {
    public static final String CONFIG_VERSION = "configVersion";
    public static final String FROM_CACHE = "fromCache";
    public static final String IS_CRITICAL = "isCritical";

    void onConfigUpdate(String str, Map<String, String> map);
}
