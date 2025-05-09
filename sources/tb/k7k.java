package tb;

import android.content.Context;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.deprecated.message.module.notify.NotifyImpl;
import com.taobao.android.fluid.framework.deprecated.message.module.notify.a;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class k7k implements NotifyImpl.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, NotifyImpl.CommonBroadcastReceiver> f22448a = new HashMap<>();

    static {
        t2o.a(468714347);
        t2o.a(468714344);
    }

    @Override // com.taobao.android.fluid.framework.deprecated.message.module.notify.NotifyImpl.a
    public void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8adbcef", new Object[]{this, context, str});
            return;
        }
        try {
            NotifyImpl.CommonBroadcastReceiver commonBroadcastReceiver = this.f22448a.get(str);
            if (commonBroadcastReceiver != null) {
                commonBroadcastReceiver.b();
                context.unregisterReceiver(commonBroadcastReceiver);
                LocalBroadcastManager.getInstance(context).unregisterReceiver(commonBroadcastReceiver);
                this.f22448a.remove(str);
            }
        } catch (Throwable th) {
            ir9.b("NormalNotifyImpl", "unregister failed=" + th.getMessage());
        }
    }

    @Override // com.taobao.android.fluid.framework.deprecated.message.module.notify.NotifyImpl.a
    public void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25121b7c", new Object[]{this, context});
            return;
        }
        try {
            for (NotifyImpl.CommonBroadcastReceiver commonBroadcastReceiver : this.f22448a.values()) {
                context.unregisterReceiver(commonBroadcastReceiver);
                LocalBroadcastManager.getInstance(context).unregisterReceiver(commonBroadcastReceiver);
            }
            this.f22448a.clear();
        } catch (Throwable th) {
            ir9.b("NormalNotifyImpl", "unregister failed=" + th.getMessage());
        }
    }

    @Override // com.taobao.android.fluid.framework.deprecated.message.module.notify.NotifyImpl.a
    public void c(Context context, String str, a.C0420a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d6ce8a9", new Object[]{this, context, str, aVar});
            return;
        }
        try {
            NotifyImpl.CommonBroadcastReceiver commonBroadcastReceiver = this.f22448a.get(str);
            if (commonBroadcastReceiver == null) {
                commonBroadcastReceiver = new NotifyImpl.CommonBroadcastReceiver();
                this.f22448a.put(str, commonBroadcastReceiver);
                IntentFilter intentFilter = new IntentFilter(str);
                context.registerReceiver(commonBroadcastReceiver, intentFilter);
                LocalBroadcastManager.getInstance(context).registerReceiver(commonBroadcastReceiver, intentFilter);
            }
            commonBroadcastReceiver.a(aVar);
        } catch (Throwable th) {
            ir9.b("NormalNotifyImpl", "register failed=" + th.getMessage());
        }
    }
}
