package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.login.AbsRemoteLogin;
import mtopsdk.common.util.MtopUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.intf.Mtop;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class p27 extends AbsRemoteLogin {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile p27 o = null;

    static {
        t2o.a(589299773);
    }

    public p27(Context context, Mtop mtop) throws ClassNotFoundException, NoSuchMethodException {
        super(context, mtop);
    }

    public static p27 g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p27) ipChange.ipc$dispatch("8511f7ab", new Object[]{context});
        }
        if (o == null) {
            synchronized (p27.class) {
                try {
                    if (o == null) {
                        if (context == null) {
                            try {
                                context = MtopUtils.getContext();
                                if (context == null) {
                                    TBSdkLog.e("mtopsdk.DefaultLoginImpl", "[getDefaultLoginImpl]context can't be null.reflect context is still null.");
                                    Mtop instance = Mtop.instance(Mtop.Id.INNER, (Context) null);
                                    if (instance.getMtopConfig().context == null) {
                                        TBSdkLog.e("mtopsdk.DefaultLoginImpl", "[getDefaultLoginImpl]context can't be null.wait INNER mtopInstance init.");
                                        instance.checkMtopSDKInit();
                                    }
                                    context = instance.getMtopConfig().context;
                                    if (context == null) {
                                        TBSdkLog.e("mtopsdk.DefaultLoginImpl", "[getDefaultLoginImpl]context can't be null.wait INNER mtopInstance init finish,context is still null");
                                        return o;
                                    }
                                    TBSdkLog.e("mtopsdk.DefaultLoginImpl", "[getDefaultLoginImpl]context can't be null.wait INNER mtopInstance init finish.context=" + context);
                                }
                            } catch (Exception e) {
                                TBSdkLog.e("mtopsdk.DefaultLoginImpl", "[getDefaultLoginImpl]get DefaultLoginImpl instance error", e);
                            }
                        }
                        o = new p27(context, null);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return o;
    }

    public static /* synthetic */ Object ipc$super(p27 p27Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/remotebusiness/login/DefaultLoginImpl");
    }
}
