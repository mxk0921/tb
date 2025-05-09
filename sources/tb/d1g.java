package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class d1g {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String APPMONITOR_MODULE = "module_tb_rate_list";
    public static final String APPMONITOR_POINT = "monitor_tb_rate_list";
    public static final String GIF_MODE = "gif";
    public static final d1g INSTANCE = new d1g();
    public static final String MUTE_MODE = "mute";
    public static final String NORMAL_MODE = "normal";

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c53d82c1", new Object[]{this});
        }
        return op5.TAG;
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8b93511", new Object[]{this})).intValue();
        }
        return nd2.EVALUATION;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d5e2983", new Object[]{this});
        }
        return "SwiftyRateKit";
    }
}
