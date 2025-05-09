package com.meizu.cloud.pushsdk.handler.e.l;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.platform.message.RegisterStatus;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;
import com.meizu.cloud.pushsdk.util.b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class c extends com.meizu.cloud.pushsdk.handler.e.a<RegisterStatus> {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.f();
        }
    }

    public c(Context context, com.meizu.cloud.pushsdk.handler.a aVar) {
        super(context, aVar);
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public int a() {
        return 512;
    }

    /* renamed from: l */
    public RegisterStatus f(Intent intent) {
        RegisterStatus registerStatus;
        String stringExtra = intent.getStringExtra(PushConstants.MZ_MESSAGE_VALUE);
        if (!TextUtils.isEmpty(stringExtra)) {
            registerStatus = com.meizu.cloud.pushsdk.platform.message.a.b(stringExtra);
        } else {
            registerStatus = (RegisterStatus) intent.getSerializableExtra(PushConstants.EXTRA_APP_PUSH_REGISTER_STATUS);
        }
        if (!TextUtils.isEmpty(registerStatus.getPushId())) {
            b.g(c(), registerStatus.getPushId(), c().getPackageName());
            b.a(c(), (int) ((System.currentTimeMillis() / 1000) + registerStatus.getExpireTime()), c().getPackageName());
        }
        return registerStatus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        String mzPushServicePackageName = MzSystemUtils.getMzPushServicePackageName(c());
        if (b.d(c(), mzPushServicePackageName)) {
            b.a(c(), mzPushServicePackageName, false);
            if (TextUtils.isEmpty(b.g(c(), mzPushServicePackageName))) {
                String e = e();
                if (!TextUtils.isEmpty(e)) {
                    b.f(c(), mzPushServicePackageName, e);
                }
            }
        }
    }

    /* renamed from: a */
    public void c(RegisterStatus registerStatus) {
        com.meizu.cloud.pushsdk.d.m.a.a().execute(new a());
    }

    public void a(RegisterStatus registerStatus, com.meizu.cloud.pushsdk.notification.c cVar) {
        if (b() != null && registerStatus != null) {
            b().a(c(), registerStatus);
        }
    }

    @Override // com.meizu.cloud.pushsdk.handler.c
    public boolean a(Intent intent) {
        DebugLogger.i("AbstractMessageHandler", "start RegisterStatusHandler match");
        return PushConstants.MZ_PUSH_ON_MESSAGE_ACTION.equals(intent.getAction()) && PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_REGISTER_STATUS.equals(e(intent));
    }
}
