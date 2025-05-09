package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.launcher.task.ScheduleTask;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class n1i implements pzd, Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f24444a = new Handler(Looper.getMainLooper(), this);

    static {
        t2o.a(806355085);
        t2o.a(806355084);
    }

    @Override // tb.pzd
    public void a(ScheduleTask scheduleTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f94d77cc", new Object[]{this, scheduleTask});
        } else {
            this.f24444a.removeCallbacks(scheduleTask);
        }
    }

    @Override // tb.pzd
    public void b(ScheduleTask scheduleTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc1deaee", new Object[]{this, scheduleTask});
        } else if (scheduleTask.d() > 0) {
            this.f24444a.postDelayed(scheduleTask, scheduleTask.d());
        } else {
            this.f24444a.post(scheduleTask);
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        return false;
    }

    @Override // tb.pzd
    public void shutdown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b466fdd", new Object[]{this});
        }
    }
}
