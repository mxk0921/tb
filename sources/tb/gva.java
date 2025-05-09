package tb;

import android.content.ComponentName;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.internal.AccsJobService;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.weex.common.Constants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class gva {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile gva b;

    /* renamed from: a  reason: collision with root package name */
    public final Context f20255a;

    static {
        t2o.a(343933156);
    }

    public gva(Context context) {
        this.f20255a = context;
    }

    public static gva a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gva) ipChange.ipc$dispatch("2a94e202", new Object[]{context});
        }
        if (b == null) {
            synchronized (gva.class) {
                try {
                    if (b == null) {
                        if (UtilityImpl.isAppKeepAlive()) {
                            b = new kj0(context);
                        } else if (d(context)) {
                            ALog.i("HeartbeatManager", "hb use job", new Object[0]);
                            b = new iuf(context);
                        } else {
                            ALog.i("HeartbeatManager", "hb use alarm", new Object[0]);
                            b = new kj0(context);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public static boolean d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6bbb0630", new Object[]{context})).booleanValue();
        }
        try {
            return context.getPackageManager().getServiceInfo(new ComponentName(context.getPackageName(), AccsJobService.class.getName()), 0).isEnabled();
        } catch (Throwable th) {
            ALog.e("HeartbeatManager", "isJobServiceExist", th, new Object[0]);
            return false;
        }
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("34e1135", new Object[]{this})).intValue();
        }
        return 270;
    }

    public abstract String c();

    public abstract void g(int i);

    public synchronized void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("763e3fe9", new Object[]{this});
        } else if (!m8l.z()) {
            int b2 = b();
            ALog.e("HeartbeatManager", "set sys heartbeat", Constants.Name.INTERVAL, Integer.valueOf(b2), "type", c());
            g(b2);
        }
    }

    public synchronized void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("518a303a", new Object[]{this, new Integer(i)});
            return;
        }
        ALog.e("HeartbeatManager", "set sys heartbeat", Constants.Name.INTERVAL, Integer.valueOf(i), "type", c());
        g(i);
    }
}
