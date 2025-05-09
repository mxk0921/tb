package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class tfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093241);
    }

    public static AccountInfo a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccountInfo) ipChange.ipc$dispatch("af612cea", new Object[0]);
        }
        VideoInfo c0 = up6.c0(vx9.d());
        if (c0 != null) {
            return c0.broadCaster;
        }
        return null;
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2a1d120", new Object[0]);
        }
        VideoInfo c0 = up6.c0(vx9.d());
        if (c0 != null) {
            return c0.topic;
        }
        return "";
    }
}
