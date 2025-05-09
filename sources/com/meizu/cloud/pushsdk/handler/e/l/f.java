package com.meizu.cloud.pushsdk.handler.e.l;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.handler.e.a;
import com.meizu.cloud.pushsdk.notification.c;
import com.meizu.cloud.pushsdk.platform.message.UnRegisterStatus;
import com.meizu.cloud.pushsdk.util.b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class f extends a<UnRegisterStatus> {
    public f(Context context, com.meizu.cloud.pushsdk.handler.a aVar) {
        super(context, aVar);
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public int a() {
        return 1024;
    }

    /* renamed from: l */
    public UnRegisterStatus f(Intent intent) {
        UnRegisterStatus unRegisterStatus;
        String stringExtra = intent.getStringExtra(PushConstants.MZ_MESSAGE_VALUE);
        if (!TextUtils.isEmpty(stringExtra)) {
            unRegisterStatus = com.meizu.cloud.pushsdk.platform.message.a.e(stringExtra);
        } else {
            unRegisterStatus = (UnRegisterStatus) intent.getSerializableExtra(PushConstants.EXTRA_APP_PUSH_UNREGISTER_STATUS);
        }
        if (unRegisterStatus.isUnRegisterSuccess()) {
            b.g(c(), "", c().getPackageName());
        }
        return unRegisterStatus;
    }

    public void a(UnRegisterStatus unRegisterStatus, c cVar) {
        if (b() != null && unRegisterStatus != null) {
            b().a(c(), unRegisterStatus);
        }
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public boolean a(Intent intent) {
        DebugLogger.i("AbstractMessageHandler", "start UnRegisterStatusHandler match");
        return PushConstants.MZ_PUSH_ON_MESSAGE_ACTION.equals(intent.getAction()) && PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_UNREGISTER_STATUS.equals(e(intent));
    }
}
