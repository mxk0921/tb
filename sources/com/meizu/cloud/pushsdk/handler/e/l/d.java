package com.meizu.cloud.pushsdk.handler.e.l;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.handler.e.a;
import com.meizu.cloud.pushsdk.notification.c;
import com.meizu.cloud.pushsdk.platform.message.SubAliasStatus;
import com.meizu.cloud.pushsdk.util.b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class d extends a<SubAliasStatus> {
    public d(Context context, com.meizu.cloud.pushsdk.handler.a aVar) {
        super(context, aVar);
    }

    private void c(String str) {
        b.j(c(), c().getPackageName(), str);
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public int a() {
        return 4096;
    }

    /* renamed from: l */
    public SubAliasStatus f(Intent intent) {
        SubAliasStatus subAliasStatus;
        String stringExtra = intent.getStringExtra(PushConstants.MZ_MESSAGE_VALUE);
        if (!TextUtils.isEmpty(stringExtra)) {
            subAliasStatus = com.meizu.cloud.pushsdk.platform.message.a.c(stringExtra);
        } else {
            subAliasStatus = (SubAliasStatus) intent.getSerializableExtra(PushConstants.EXTRA_APP_PUSH_SUBALIAS_STATUS);
        }
        if ("200".equals(subAliasStatus.getCode())) {
            c(subAliasStatus.getAlias());
        }
        return subAliasStatus;
    }

    public void a(SubAliasStatus subAliasStatus, c cVar) {
        if (b() != null && subAliasStatus != null) {
            b().a(c(), subAliasStatus);
        }
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public boolean a(Intent intent) {
        DebugLogger.i("AbstractMessageHandler", "start SubScribeAliasStatusHandler match");
        return PushConstants.MZ_PUSH_ON_MESSAGE_ACTION.equals(intent.getAction()) && PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_SUBALIAS_STATUS.equals(e(intent));
    }
}
