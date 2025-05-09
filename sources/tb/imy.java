package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.Random;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class imy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Random f21440a = new Random();

    static {
        t2o.a(806356476);
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("15d23e38", new Object[0])).intValue();
        }
        return f21440a.nextInt(9000) + 1000;
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c05203", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            str = String.valueOf(a());
        }
        return System.currentTimeMillis() + "_" + str + "_" + a();
    }

    public static String c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94b39e1d", new Object[]{str, str2});
        }
        if (!qvs.W0()) {
            return str;
        }
        if (TextUtils.isEmpty(str)) {
            str = !TextUtils.isEmpty(str2) ? str2 : "unknown";
        }
        return b(str);
    }

    public static String d(VideoInfo videoInfo) {
        AccountInfo accountInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("59aa866c", new Object[]{videoInfo});
        }
        if (videoInfo == null || (accountInfo = videoInfo.broadCaster) == null) {
            return null;
        }
        return accountInfo.accountId;
    }
}
