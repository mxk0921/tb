package tb;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.ServiceConnection;
import com.alipay.android.phone.mobilesdk.socketcraft.monitor.MonitorItemConstants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class d05 extends ContextWrapper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f17484a;

    static {
        t2o.a(786432120);
    }

    public d05(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(d05 d05Var, String str, Object... objArr) {
        if (str.hashCode() == -280716353) {
            return new Boolean(super.bindService((Intent) objArr[0], (ServiceConnection) objArr[1], ((Number) objArr[2]).intValue()));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbabilitykit/pop/CustomContext");
    }

    public final void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a50f9a4", new Object[]{this, context});
        } else {
            this.f17484a = context;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public boolean bindService(Intent intent, ServiceConnection serviceConnection, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef449bbf", new Object[]{this, intent, serviceConnection, new Integer(i)})).booleanValue();
        }
        ckf.g(serviceConnection, MonitorItemConstants.WS_MONITOR_TITLE_CONN);
        Context context = this.f17484a;
        if (context != null) {
            return context.bindService(intent, serviceConnection, i);
        }
        return super.bindService(intent, serviceConnection, i);
    }
}
