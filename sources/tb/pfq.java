package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.login.AbsRemoteLogin;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.intf.Mtop;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class pfq extends AbsRemoteLogin {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile pfq o;

    public pfq(Context context, String str) throws NoSuchMethodException, ClassNotFoundException {
        super(context, Mtop.getInstance(str));
    }

    public static pfq g(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pfq) ipChange.ipc$dispatch("15136e4f", new Object[]{context, str});
        }
        if (o == null) {
            synchronized (pfq.class) {
                if (o == null) {
                    try {
                        o = new pfq(context, str);
                    } catch (Exception e) {
                        TBSdkLog.e("ssr.SsrLoginImpl", "[getDefaultLoginImpl]get DefaultLoginImpl instance error", e);
                    }
                }
            }
        }
        return o;
    }

    public static /* synthetic */ Object ipc$super(pfq pfqVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in mtopsdk/ssrcore/login/SsrLoginImpl");
    }
}
