package tb;

import android.content.Context;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class bvl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final bvl INSTANCE = new bvl();

    static {
        t2o.a(106954773);
    }

    public final String a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("32140699", new Object[]{this, context, str});
        }
        ckf.g(context, "context");
        ckf.g(str, "businessId");
        return wqo.a(str);
    }

    public final String b(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("416e43a4", new Object[]{this, context, str, str2});
        }
        ckf.g(context, "context");
        ckf.g(str, "businessId");
        ckf.g(str2, "virtualPath");
        return wqo.d(str, str2);
    }

    public final ErrorResult c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ErrorResult) ipChange.ipc$dispatch("66c738d6", new Object[]{this, str});
        }
        ckf.g(str, "virtualPath");
        if (str.length() == 0) {
            return lc9.INSTANCE.B("file path is empty");
        }
        if (!gh9.INSTANCE.e(str)) {
            return lc9.INSTANCE.B("file path is invalid");
        }
        return null;
    }
}
