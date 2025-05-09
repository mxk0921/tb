package tb;

import android.app.NotificationManager;
import android.content.Context;
import com.heytap.msp.push.callback.IDataMessageCallBackService;
import com.heytap.msp.push.mode.BaseMode;
import com.heytap.msp.push.mode.DataMessage;
import com.heytap.msp.push.statis.StatisticUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class er6 implements fzm {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DataMessage f18773a;
        final /* synthetic */ Context b;
        final /* synthetic */ IDataMessageCallBackService c;

        public a(DataMessage dataMessage, Context context, IDataMessageCallBackService iDataMessageCallBackService) {
            this.f18773a = dataMessage;
            this.b = context;
            this.c = iDataMessageCallBackService;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f18773a.getMsgCommand() == 1) {
                er6.this.c(this.b, this.f18773a);
            } else {
                this.c.processMessage(this.b, this.f18773a);
            }
        }
    }

    static {
        t2o.a(612368418);
        t2o.a(612368420);
    }

    @Override // tb.fzm
    public void a(Context context, BaseMode baseMode, IDataMessageCallBackService iDataMessageCallBackService) {
        if (baseMode != null && baseMode.getType() == 4103) {
            DataMessage dataMessage = (DataMessage) baseMode;
            if (iDataMessageCallBackService != null) {
                wrt.b(new a(dataMessage, context, iDataMessageCallBackService));
            }
        }
    }

    public final void d(Context context, DataMessage dataMessage) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.add(dataMessage);
        hashMap.put(dataMessage.getEventId(), arrayList);
        StatisticUtils.statisticEvent(context, hashMap);
    }

    public final void c(Context context, DataMessage dataMessage) {
        if (context == null) {
            dgh.a("context is null");
            return;
        }
        dgh.a("Receive revokeMessage  extra : " + dataMessage.getStatisticsExtra() + "notifyId :" + dataMessage.getNotifyID() + "messageId : " + dataMessage.getTaskID());
        ((NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION)).cancel(dataMessage.getNotifyID());
        d(context, dataMessage);
    }
}
