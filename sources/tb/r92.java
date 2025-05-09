package tb;

import android.os.Handler;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.IApmEventListener;
import com.taobao.metrickit.context.MetricContext;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class r92 extends ol8 implements IApmEventListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARAM_TIME = "time";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            chb g = c21.g();
            if (g.containsKey("isInBackground") && !g.getBoolean("isInBackground", false)) {
                r92.this.onEvent(2);
            }
        }
    }

    public r92(Handler handler) {
        super(handler);
    }

    public static /* synthetic */ Object ipc$super(r92 r92Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/metrickit/event/bgfg/BgFgEventSource");
    }

    @Override // tb.ol8
    public int[] l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("f6d4687e", new Object[]{this});
        }
        return new int[]{1, 0, 2};
    }

    @Override // com.taobao.application.common.IApmEventListener
    public void onEvent(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
        } else if (i == 1) {
            u(1);
        } else if (i == 2) {
            u(0);
        } else if (i == 50) {
            u(2);
        }
    }

    @Override // tb.ol8
    public void q(MetricContext metricContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce7c6c76", new Object[]{this, metricContext});
            return;
        }
        c21.c(this);
        Handler h = c21.h();
        if (h != null) {
            h.post(new a());
        }
    }

    public final void u(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfb21fc2", new Object[]{this, new Integer(i)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("time", Long.valueOf(SystemClock.uptimeMillis()));
        k(i, hashMap);
    }
}
