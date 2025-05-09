package tb;

import android.os.Message;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.alibaba.poplayer.trigger.BaseTriggerService;
import com.alibaba.poplayer.trigger.Event;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class lgu extends ak8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(626000025);
    }

    public lgu(BaseTriggerService baseTriggerService) {
        super(baseTriggerService);
    }

    public static /* synthetic */ Object ipc$super(lgu lguVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 673877021) {
            return new Boolean(lguVar.handleMessage((Message) objArr[0]));
        }
        if (hashCode == 1231635783) {
            lguVar.b((String) objArr[0], ((Boolean) objArr[1]).booleanValue());
            return null;
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/poplayer/trigger/TriggerTimerMgr");
    }

    public void c(Event event, List<BaseConfigItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b595fe4", new Object[]{this, event, list});
        } else if (list != null && !list.isEmpty()) {
            b(event.attachKeyCode, true);
            long currentTimeStamp = PopLayer.getReference().getCurrentTimeStamp();
            long j = Long.MAX_VALUE;
            BaseConfigItem baseConfigItem = null;
            for (int i = 0; i < list.size(); i++) {
                long startTimeStamp = list.get(i).getStartTimeStamp() - currentTimeStamp;
                if (startTimeStamp > 0 && startTimeStamp < j) {
                    baseConfigItem = list.get(i);
                    j = startTimeStamp;
                }
            }
            if (baseConfigItem != null) {
                wdm.d("TriggerTimerMgr.checkTimeAndRescheduleIfNeed.UUID{%s}.timeNotStart.leftTime{%sms}.startLater", baseConfigItem.uuid, Long.valueOf(j));
                a(event, j);
            }
        }
    }
}
