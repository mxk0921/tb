package tb;

import com.alibaba.analytics.core.selfmonitor.exception.ExceptionEventBuilder;
import com.alibaba.appmonitor.event.EventType;
import com.alibaba.mtl.appmonitor.Transaction;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class tdu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(962593028);
    }

    public static void a(Transaction transaction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2202473f", new Object[]{transaction});
        } else if (transaction != null && transaction.dimensionValues != null) {
            fl8.s().i(transaction.transactionId, transaction.eventId, transaction.module, transaction.monitorPoint, DimensionValueSet.create().addValues(transaction.dimensionValues));
        }
    }

    public static void b(Transaction transaction, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3b388f6", new Object[]{transaction, str});
            return;
        }
        try {
            if (j71.c && transaction != null) {
                nhh.f("TransactionDelegate", "statEvent begin. module: ", transaction.module, " monitorPoint: ", transaction.monitorPoint, " measureName: ", str);
                EventType eventType = EventType.STAT;
                if (eventType.isOpen()) {
                    if (!j71.e() && !sa.h().f(eventType, transaction.module, transaction.monitorPoint)) {
                        return;
                    }
                    fl8.s().f(transaction.transactionId, transaction.eventId, transaction.module, transaction.monitorPoint, str);
                    a(transaction);
                }
            }
        } catch (Throwable th) {
            ExceptionEventBuilder.c(ExceptionEventBuilder.ExceptionType.AP, th);
        }
    }

    public static void c(Transaction transaction, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ac6da8", new Object[]{transaction, str});
            return;
        }
        try {
            if (j71.c && transaction != null) {
                nhh.f("TransactionDelegate", "statEvent end. module: ", transaction.module, " monitorPoint: ", transaction.monitorPoint, " measureName: ", str);
                EventType eventType = EventType.STAT;
                if (eventType.isOpen()) {
                    if (!j71.e() && !sa.h().f(eventType, transaction.module, transaction.monitorPoint)) {
                        return;
                    }
                    a(transaction);
                    fl8.s().o(transaction.transactionId, str, false);
                }
            }
        } catch (Throwable th) {
            ExceptionEventBuilder.c(ExceptionEventBuilder.ExceptionType.AP, th);
        }
    }
}
