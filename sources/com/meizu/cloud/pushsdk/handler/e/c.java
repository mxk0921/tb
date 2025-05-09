package com.meizu.cloud.pushsdk.handler.e;

import android.content.Context;
import android.content.Intent;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.handler.MzPushMessage;
import com.meizu.cloud.pushsdk.handler.a;
import com.meizu.cloud.pushsdk.notification.MPushMessage;
import com.meizu.cloud.pushsdk.util.d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class c extends d {
    public c(Context context, a aVar) {
        super(context, aVar);
    }

    @Override // com.meizu.cloud.pushsdk.handler.e.d, com.meizu.cloud.pushsdk.handler.c
    public int a() {
        return 2;
    }

    @Override // com.meizu.cloud.pushsdk.handler.e.d
    /* renamed from: g */
    public void c(MessageV3 messageV3) {
        d.f(c(), messageV3.getUploadDataPackageName(), messageV3.getDeviceId(), messageV3.getTaskId(), messageV3.getSeqId(), messageV3.getPushTimestamp(), messageV3.getDelayedReportMillis());
    }

    @Override // com.meizu.cloud.pushsdk.handler.e.d
    /* renamed from: h */
    public void d(MessageV3 messageV3) {
        d.d(c(), messageV3.getUploadDataPackageName(), messageV3.getDeviceId(), messageV3.getTaskId(), messageV3.getSeqId(), messageV3.getPushTimestamp(), messageV3.getDelayedReportMillis());
    }

    @Override // com.meizu.cloud.pushsdk.handler.e.d
    /* renamed from: l */
    public MessageV3 f(Intent intent) {
        MPushMessage mPushMessage = (MPushMessage) intent.getSerializableExtra(PushConstants.MZ_PUSH_PRIVATE_MESSAGE);
        return MessageV3.parse(g(intent), d(intent), mPushMessage.getTaskId(), mPushMessage);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.meizu.cloud.pushsdk.handler.e.d
    public void a(MessageV3 messageV3, com.meizu.cloud.pushsdk.notification.c cVar) {
        if (cVar != null) {
            cVar.a(messageV3);
            b().b(c(), MzPushMessage.fromMessageV3(messageV3));
        }
    }

    @Override // com.meizu.cloud.pushsdk.handler.e.d, com.meizu.cloud.pushsdk.handler.c
    public boolean a(Intent intent) {
        DebugLogger.i("AbstractMessageHandler", "start MessageV2Handler match");
        return a(0, g(intent)) && PushConstants.MZ_PUSH_ON_MESSAGE_ACTION.equals(intent.getAction()) && PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_NOTIFICATION_SHOW.equals(e(intent));
    }
}
