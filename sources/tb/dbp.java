package tb;

import android.content.Context;
import android.util.Log;
import com.alibaba.ha.bizerrorreporter.BizErrorSampling;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class dbp implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f17711a;
    public ud2 b;

    public dbp(Context context, ud2 ud2Var) {
        this.f17711a = context;
        this.b = ud2Var;
    }

    private Boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("1d2d13bc", new Object[]{this});
        }
        vd2.a().getClass();
        int b = b(0, 10000);
        if (BizErrorSampling.OneTenth == null) {
            if (b >= 0 && b < 1000) {
                return Boolean.TRUE;
            }
        } else if (BizErrorSampling.OnePercent == null) {
            if (b >= 0 && b < 100) {
                return Boolean.TRUE;
            }
        } else if (BizErrorSampling.OneThousandth == null) {
            if (b >= 0 && b < 10) {
                return Boolean.TRUE;
            }
        } else if (BizErrorSampling.OneTenThousandth == null) {
            if (b >= 0 && b < 1) {
                return Boolean.TRUE;
            }
        } else if (BizErrorSampling.Zero == null) {
            return Boolean.FALSE;
        } else {
            if (BizErrorSampling.All == null) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    private int b(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b556edfc", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        try {
            return i + ((int) (Math.random() * ((i2 - i) + 1)));
        } catch (Exception e) {
            Log.e(td2.LOGTAG, "get random number err", e);
            return 0;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            if (this.b.f29301a != null) {
                vd2.a().getClass();
                rap a2 = new sd2().a(this.f17711a, this.b);
                if (a2 != null) {
                    Integer num = a2.d;
                    zap.b().d(null, System.currentTimeMillis(), a2.b, num.intValue(), a2.e, a2.f27236a, a2.c, null);
                }
            }
        } catch (Exception e) {
            Log.e(td2.LOGTAG, "send business err happen ", e);
        }
    }
}
