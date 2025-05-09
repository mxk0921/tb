package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class zzg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PLAY_PAGEID = "taolivehomepage";
    public static final String PLAY_SUBBUSINESS_TYPE = "LiveCard";

    static {
        t2o.a(806355326);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65f009ac", new Object[0]);
        }
        return d9m.H().getDXAppVersion();
    }
}
