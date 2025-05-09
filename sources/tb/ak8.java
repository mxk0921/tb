package tb;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.trigger.BaseTriggerService;
import com.alibaba.poplayer.trigger.Event;
import com.alibaba.security.realidentity.u2;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ak8 implements Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_SAME_EVENT = 1024;

    /* renamed from: a  reason: collision with root package name */
    public final BaseTriggerService f15786a;
    public final Handler b = new Handler(Looper.getMainLooper(), this);

    static {
        t2o.a(626000010);
    }

    public ak8(BaseTriggerService baseTriggerService) {
        this.f15786a = baseTriggerService;
    }

    public void b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49694547", new Object[]{this, str, new Boolean(z)});
            return;
        }
        if (z) {
            this.b.removeCallbacksAndMessages(null);
        } else {
            this.b.removeCallbacksAndMessages(str);
        }
        wdm.d("DispatchManager.removeNotStartedEventsByType:keyCode-{%s}, allRemove-{%s}", str, Boolean.valueOf(z));
    }

    public void a(Event event, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb0be823", new Object[]{this, event, new Long(j)});
            return;
        }
        wdm.d("EventDispatchManager.dispatchEvent:event:{%s},delay:{%s}.", event, Long.valueOf(j));
        if (j < 0) {
            j = 0;
        }
        try {
            Message message = new Message();
            message.what = 2048;
            message.obj = event.attachKeyCode;
            Bundle bundle = new Bundle();
            bundle.putParcelable("event", event);
            bundle.putInt(u2.k, 0);
            message.setData(bundle);
            this.b.sendMessageDelayed(message, j);
        } catch (Throwable th) {
            wdm.h("DispatchManager.dispatchEvent.error.", th);
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        try {
            Event event = (Event) message.getData().get("event");
            wdm.d("DispatchManager.handleMessage,event {%s}.", event);
            int i = message.getData().getInt(u2.k);
            if (PopLayer.getReference().getConfigMgr().isUpdatingConfig()) {
                if (i < 3) {
                    Bundle data = message.getData();
                    data.putInt(u2.k, i + 1);
                    Message message2 = new Message();
                    message2.setData(data);
                    this.b.sendMessageDelayed(message2, 300L);
                    wdm.d("DispatchManager.handleMessage.isUpdatingConfig,event {%s} retry after 300ms.", event);
                } else {
                    wdm.d("DispatchManager.handleMessage.isUpdatingConfig,event {%s} retryTime{%s} >= LimitTime {%s} .And dropped event.", event, Integer.valueOf(i), 3);
                }
                return true;
            }
            this.f15786a.accept(event);
            return true;
        } catch (Throwable th) {
            wdm.h("DispatchManager.handleMessage.error.", th);
            return false;
        }
    }
}
