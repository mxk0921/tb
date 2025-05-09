package com.meizu.cloud.pushsdk.handler.e.k;

import android.content.Context;
import android.content.Intent;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.handler.MzPushMessage;
import com.meizu.cloud.pushsdk.handler.e.a;
import com.meizu.cloud.pushsdk.notification.c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class d extends a<MessageV3> {
    private Context d;

    public d(Context context, com.meizu.cloud.pushsdk.handler.a aVar) {
        super(context, aVar);
        this.d = context;
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public int a() {
        return 128;
    }

    public void d(MessageV3 messageV3) {
        com.meizu.cloud.pushsdk.util.d.d(c(), messageV3.getUploadDataPackageName(), messageV3.getDeviceId(), messageV3.getTaskId(), messageV3.getSeqId(), messageV3.getPushTimestamp());
    }

    /* renamed from: l */
    public MessageV3 f(Intent intent) {
        return (MessageV3) intent.getParcelableExtra(PushConstants.MZ_PUSH_PRIVATE_MESSAGE);
    }

    public void a(MessageV3 messageV3, c cVar) {
        if (messageV3 != null) {
            if (b() == null) {
                b().c(c(), MzPushMessage.fromMessageV3(messageV3));
            }
            b(messageV3);
            a(this.d, messageV3);
        }
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public boolean a(Intent intent) {
        DebugLogger.i("AbstractMessageHandler", "start NotificationDeleteMessageHandler match");
        return PushConstants.MZ_PUSH_ON_MESSAGE_ACTION.equals(intent.getAction()) && PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_NOTIFICATION_DELETE.equals(e(intent));
    }
}
