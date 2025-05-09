package tb;

import android.app.Activity;
import android.content.Context;
import com.alibaba.security.realidentity.g4;
import com.alibaba.wireless.aliprivacy.AliPrivacyCore;
import com.alibaba.wireless.aliprivacy.AuthStatus;
import com.alibaba.wireless.aliprivacy.PrivacyAuthGetParam;
import com.alibaba.wireless.aliprivacy.PrivacyAuthResult;
import com.alibaba.wireless.aliprivacy.PrivacyAuthSetParam;
import com.alibaba.wireless.aliprivacy.PrivacyCode;
import com.alibaba.wireless.aliprivacyext.recommendation.c;
import com.alibaba.wireless.aliprivacyext.recommendation.e;
import com.alibaba.wireless.aliprivacyext.track.model.TrackLog;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class br0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f16559a = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final br0 f16560a = new br0();
    }

    public static String b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e6b6cf78", new Object[]{context});
        }
        return AliPrivacyCore.e(context);
    }

    public static br0 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (br0) ipChange.ipc$dispatch("66c7cdb1", new Object[0]);
        }
        return b.f16560a;
    }

    public static String d(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4e294c", new Object[]{context, str});
        }
        return hwx.a(context, str);
    }

    public static void e(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("624f99b", new Object[]{context, str});
        } else if (f16559a.compareAndSet(false, true)) {
            ssx.a(context);
            ssx.c(new myx(context));
            c.R().f(context, str);
            f(context);
            qsx.a();
        }
    }

    public static synchronized void f(Context context) {
        synchronized (br0.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d126a2b2", new Object[]{context});
            } else {
                AliPrivacyCore.i(context, new zrx(), null);
            }
        }
    }

    public static List<PrivacyAuthResult> h(Context context, PrivacyAuthGetParam privacyAuthGetParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b7f5cbb7", new Object[]{context, privacyAuthGetParam});
        }
        return AliPrivacyCore.q(context, privacyAuthGetParam, g4.a.f2721a);
    }

    public static boolean i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("103b3c48", new Object[]{context})).booleanValue();
        }
        return AliPrivacyCore.n(context);
    }

    public static PrivacyCode k(Context context, PrivacyAuthSetParam privacyAuthSetParam) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PrivacyCode) ipChange.ipc$dispatch("fde33a4", new Object[]{context, privacyAuthSetParam});
        }
        return AliPrivacyCore.v(context, privacyAuthSetParam, g4.a.f2721a);
    }

    public static boolean l(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("33888416", new Object[]{context, str, str2})).booleanValue();
        }
        return hwx.d(context, str, str2);
    }

    public AuthStatus a(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AuthStatus) ipChange.ipc$dispatch("3943b423", new Object[]{this, activity, str});
        }
        return AliPrivacyCore.c(activity, new String[]{str});
    }

    public void g(Context context, osk oskVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("508c6464", new Object[]{this, context, oskVar});
        } else {
            AliPrivacyCore.m(context, oskVar);
        }
    }

    public boolean j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f37d3550", new Object[]{this, str})).booleanValue();
        }
        e b2 = c.R().b(str);
        TrackLog.trackQueryRecommendStatusLog(null, b2.getStatus(), "Native", str, null, 0L);
        return b2.getRecommendSwitchBooleanStatus();
    }

    public br0() {
    }
}
