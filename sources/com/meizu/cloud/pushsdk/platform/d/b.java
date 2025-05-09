package com.meizu.cloud.pushsdk.platform.d;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.d.c;
import com.meizu.cloud.pushsdk.platform.PlatformMessageSender;
import com.meizu.cloud.pushsdk.platform.c.a;
import com.meizu.cloud.pushsdk.platform.message.RegisterStatus;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;
import java.util.concurrent.ScheduledExecutorService;
import tb.vgn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class b extends c<RegisterStatus> {
    public b(Context context, a aVar, ScheduledExecutorService scheduledExecutorService) {
        this(context, null, null, aVar, scheduledExecutorService);
    }

    @Override // com.meizu.cloud.pushsdk.platform.d.c
    public boolean d() {
        DebugLogger.e("Strategy", "isBrandMeizu " + MzSystemUtils.isBrandMeizu(this.b));
        if (TextUtils.isEmpty(this.c) || TextUtils.isEmpty(this.d)) {
            return false;
        }
        return true;
    }

    @Override // com.meizu.cloud.pushsdk.platform.d.c
    public Intent h() {
        Intent intent = new Intent();
        intent.putExtra("app_id", this.c);
        intent.putExtra(MspGlobalDefine.APP_KEY, this.d);
        intent.putExtra("strategy_package_name", this.b.getPackageName());
        intent.putExtra("strategy_type", j());
        return intent;
    }

    @Override // com.meizu.cloud.pushsdk.platform.d.c
    public int j() {
        return 2;
    }

    /* renamed from: m */
    public RegisterStatus a() {
        String str;
        RegisterStatus registerStatus = new RegisterStatus();
        registerStatus.setCode(vgn.RATE_LIST_CODE);
        if (TextUtils.isEmpty(this.c)) {
            str = "appId not empty";
        } else {
            if (TextUtils.isEmpty(this.d)) {
                str = "appKey not empty";
            }
            return registerStatus;
        }
        registerStatus.setMessage(str);
        return registerStatus;
    }

    /* renamed from: n */
    public RegisterStatus c() {
        return null;
    }

    /* renamed from: o */
    public RegisterStatus e() {
        RegisterStatus registerStatus = new RegisterStatus();
        String h = com.meizu.cloud.pushsdk.util.b.h(this.b, this.e);
        int i = com.meizu.cloud.pushsdk.util.b.i(this.b, this.e);
        if (!a(h, i)) {
            registerStatus.setCode("200");
            registerStatus.setMessage("already register PushId,don't register frequently");
            registerStatus.setPushId(h);
            registerStatus.setExpireTime((int) (i - (System.currentTimeMillis() / 1000)));
            return registerStatus;
        }
        com.meizu.cloud.pushsdk.util.b.g(this.b, "", this.e);
        String b = c.b(this.b);
        String a2 = c.a(this.b);
        if (!TextUtils.isEmpty(b) || !TextUtils.isEmpty(a2)) {
            com.meizu.cloud.pushsdk.e.b.c a3 = this.f.a(this.c, this.d, a2, b);
            if (!a3.c()) {
                com.meizu.cloud.pushsdk.e.c.a a4 = a3.a();
                if (a4.c() != null) {
                    DebugLogger.e("Strategy", "status code=" + a4.b() + " data=" + a4.c());
                }
                registerStatus.setCode(String.valueOf(a4.b()));
                registerStatus.setMessage(a4.a());
                DebugLogger.e("Strategy", "registerStatus " + registerStatus);
                return registerStatus;
            }
            RegisterStatus registerStatus2 = new RegisterStatus((String) a3.b());
            DebugLogger.e("Strategy", "registerStatus " + registerStatus2);
            if (!TextUtils.isEmpty(registerStatus2.getPushId())) {
                com.meizu.cloud.pushsdk.util.b.g(this.b, registerStatus2.getPushId(), this.e);
                com.meizu.cloud.pushsdk.util.b.a(this.b, (int) ((System.currentTimeMillis() / 1000) + registerStatus2.getExpireTime()), this.e);
            }
            return registerStatus2;
        }
        registerStatus.setCode("20000");
        registerStatus.setMessage("deviceId is empty");
        return registerStatus;
    }

    public b(Context context, a aVar, ScheduledExecutorService scheduledExecutorService, boolean z) {
        this(context, aVar, scheduledExecutorService);
        this.h = z;
    }

    /* renamed from: a */
    public void b(RegisterStatus registerStatus) {
        PlatformMessageSender.a(this.b, !TextUtils.isEmpty(this.e) ? this.e : this.b.getPackageName(), registerStatus);
    }

    public b(Context context, String str, String str2, a aVar, ScheduledExecutorService scheduledExecutorService) {
        super(context, str, str2, aVar, scheduledExecutorService);
    }

    public boolean a(String str, int i) {
        String a2 = c.a(this.b);
        boolean a3 = a(a2, str, i);
        return a3 ? a(a2, com.meizu.cloud.pushsdk.platform.a.a(str), i) : a3;
    }

    private boolean a(String str, String str2, int i) {
        return TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !str2.startsWith(str) || System.currentTimeMillis() / 1000 > ((long) i);
    }
}
