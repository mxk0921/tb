package com.meizu.cloud.pushsdk.handler.e.l;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.c;
import com.meizu.cloud.pushsdk.platform.message.PushSwitchStatus;
import com.meizu.cloud.pushsdk.util.b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a extends com.meizu.cloud.pushsdk.handler.e.a<PushSwitchStatus> {
    public a(Context context, com.meizu.cloud.pushsdk.handler.a aVar) {
        super(context, aVar);
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public int a() {
        return 256;
    }

    /* renamed from: l */
    public PushSwitchStatus f(Intent intent) {
        PushSwitchStatus pushSwitchStatus;
        String stringExtra = intent.getStringExtra(PushConstants.MZ_MESSAGE_VALUE);
        if (!TextUtils.isEmpty(stringExtra)) {
            pushSwitchStatus = com.meizu.cloud.pushsdk.platform.message.a.a(stringExtra);
        } else {
            pushSwitchStatus = (PushSwitchStatus) intent.getSerializableExtra(PushConstants.EXTRA_APP_PUSH_SWITCH_STATUS);
        }
        if ("200".equals(pushSwitchStatus.getCode())) {
            String g = g(intent);
            DebugLogger.e("AbstractMessageHandler", "PushSwitchStatusHandler update local " + g + " switch status " + pushSwitchStatus);
            b.b(c(), g, pushSwitchStatus.isSwitchNotificationMessage());
            b.c(c(), g, pushSwitchStatus.isSwitchThroughMessage());
        }
        return pushSwitchStatus;
    }

    public void a(PushSwitchStatus pushSwitchStatus, c cVar) {
        if (b() != null && pushSwitchStatus != null) {
            b().a(c(), pushSwitchStatus);
        }
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public boolean a(Intent intent) {
        DebugLogger.i("AbstractMessageHandler", "start PushSwitchStatusHandler match");
        return PushConstants.MZ_PUSH_ON_MESSAGE_ACTION.equals(intent.getAction()) && PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_PUSH_STATUS.equals(e(intent));
    }
}
