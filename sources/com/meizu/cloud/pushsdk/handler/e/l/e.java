package com.meizu.cloud.pushsdk.handler.e.l;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.handler.e.a;
import com.meizu.cloud.pushsdk.notification.c;
import com.meizu.cloud.pushsdk.platform.message.SubTagsStatus;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class e extends a<SubTagsStatus> {
    public e(Context context, com.meizu.cloud.pushsdk.handler.a aVar) {
        super(context, aVar);
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public int a() {
        return 2048;
    }

    /* renamed from: l */
    public SubTagsStatus f(Intent intent) {
        String stringExtra = intent.getStringExtra(PushConstants.MZ_MESSAGE_VALUE);
        if (!TextUtils.isEmpty(stringExtra)) {
            return com.meizu.cloud.pushsdk.platform.message.a.d(stringExtra);
        }
        return (SubTagsStatus) intent.getSerializableExtra(PushConstants.EXTRA_APP_PUSH_SUBTAGS_STATUS);
    }

    public void a(SubTagsStatus subTagsStatus, c cVar) {
        if (b() != null && subTagsStatus != null) {
            b().a(c(), subTagsStatus);
        }
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public boolean a(Intent intent) {
        DebugLogger.i("AbstractMessageHandler", "start SubScribeTagsStatusHandler match");
        return PushConstants.MZ_PUSH_ON_MESSAGE_ACTION.equals(intent.getAction()) && PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_SUBTAGS_STATUS.equals(e(intent));
    }
}
