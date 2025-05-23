package com.meizu.cloud.pushsdk.handler.e.k;

import android.content.Context;
import android.content.Intent;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.handler.e.a;
import com.meizu.cloud.pushsdk.handler.e.j.c;
import com.meizu.cloud.pushsdk.notification.g.b;
import com.meizu.cloud.pushsdk.util.d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class e extends a<c> {
    public e(Context context, com.meizu.cloud.pushsdk.handler.a aVar) {
        super(context, aVar);
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public int a() {
        return 32768;
    }

    /* renamed from: l */
    public c f(Intent intent) {
        String stringExtra = intent.getStringExtra(PushConstants.NOTIFICATION_EXTRA_SHOW_PACKAGE_NAME);
        String stringExtra2 = intent.getStringExtra(PushConstants.NOTIFICATION_EXTRA_TASK_ID);
        String stringExtra3 = intent.getStringExtra(PushConstants.NOTIFICATION_EXTRA_SEQ_ID);
        String stringExtra4 = intent.getStringExtra(PushConstants.NOTIFICATION_EXTRA_DEVICE_ID);
        String stringExtra5 = intent.getStringExtra(PushConstants.NOTIFICATION_EXTRA_PUSH_TIMESTAMP);
        String stringExtra6 = intent.getStringExtra(PushConstants.MZ_PUSH_NOTIFICATION_STATE_MESSAGE);
        boolean booleanExtra = intent.getBooleanExtra(PushConstants.MZ_PUSH_WHITE_LIST, false);
        long longExtra = intent.getLongExtra(PushConstants.MZ_PUSH_DELAYED_REPORT_MILLIS, 0L);
        DebugLogger.i("AbstractMessageHandler", "current taskId " + stringExtra2 + " seqId " + stringExtra3 + " deviceId " + stringExtra4 + " packageName " + stringExtra);
        c cVar = new c(MessageV3.parse(c().getPackageName(), stringExtra, stringExtra5, stringExtra4, stringExtra2, stringExtra3, stringExtra6, booleanExtra, longExtra));
        String stringExtra7 = intent.getStringExtra("flyme:notification_pkg");
        int intExtra = intent.getIntExtra("flyme:notification_id", 0);
        int intExtra2 = intent.getIntExtra("flyme:notification_state", 0);
        cVar.a(intExtra);
        cVar.a(stringExtra7);
        cVar.b(intExtra2);
        return cVar;
    }

    /* renamed from: a */
    public void d(c cVar) {
        int c = cVar.c();
        if (c == -2) {
            DebugLogger.e("AbstractMessageHandler", "notification STATE_NOTIFICATION_SHOW_ACCESS_DENY");
            d.b(c(), cVar.a().getUploadDataPackageName(), cVar.a().getDeviceId(), cVar.a().getTaskId(), cVar.a().getSeqId(), cVar.a().getPushTimestamp(), cVar.a().getDelayedReportMillis());
        } else if (c == -1) {
            DebugLogger.e("AbstractMessageHandler", "notification STATE_NOTIFICATION_SHOW_INBOX");
            d.e(c(), cVar.a().getUploadDataPackageName(), cVar.a().getDeviceId(), cVar.a().getTaskId(), cVar.a().getSeqId(), cVar.a().getPushTimestamp(), cVar.a().getDelayedReportMillis());
        } else if (c == 0) {
            DebugLogger.e("AbstractMessageHandler", "notification STATE_NOTIFICATION_SHOW_NORMAL");
            d.c(c(), cVar.a().getUploadDataPackageName(), cVar.a().getDeviceId(), cVar.a().getTaskId(), cVar.a().getSeqId(), cVar.a().getPushTimestamp(), cVar.a().getDelayedReportMillis());
        } else if (c == 1) {
            DebugLogger.e("AbstractMessageHandler", "notification STATE_NOTIFICATION_SHOW_FLOAT");
            d.a(c(), cVar.a().getUploadDataPackageName(), cVar.a().getDeviceId(), cVar.a().getTaskId(), cVar.a().getSeqId(), cVar.a().getPushTimestamp(), cVar.a().getDelayedReportMillis());
        }
    }

    public void a(c cVar, com.meizu.cloud.pushsdk.notification.c cVar2) {
        DebugLogger.e("AbstractMessageHandler", "store notification id " + cVar.b());
        b.c(c(), cVar.a().getUploadDataPackageName(), cVar.b());
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public boolean a(Intent intent) {
        DebugLogger.i("AbstractMessageHandler", "start NotificationStateMessageHandler match");
        return PushConstants.MZ_PUSH_ON_MESSAGE_ACTION.equals(intent.getAction()) && "notification_state".equals(e(intent));
    }
}
