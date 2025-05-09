package com.meizu.cloud.pushsdk.handler.e;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.handler.a;
import com.meizu.cloud.pushsdk.notification.c;
import com.meizu.cloud.pushsdk.util.b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class e extends a<String> {
    public e(Context context, a aVar) {
        super(context, aVar);
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public int a() {
        return 16;
    }

    /* renamed from: l */
    public String f(Intent intent) {
        String stringExtra = intent.getStringExtra("registration_id");
        b.g(c(), stringExtra, c().getPackageName());
        b.a(c(), 0, c().getPackageName());
        return stringExtra;
    }

    public void a(String str, c cVar) {
        if (b() != null) {
            b().b(c(), str);
        }
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public boolean a(Intent intent) {
        DebugLogger.i("AbstractMessageHandler", "start RegisterMessageHandler match");
        return PushConstants.MZ_PUSH_ON_REGISTER_ACTION.equals(intent.getAction()) || (PushConstants.REGISTRATION_CALLBACK_INTENT.equals(intent.getAction()) && !TextUtils.isEmpty(intent.getStringExtra("registration_id")));
    }
}
