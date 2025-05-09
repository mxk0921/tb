package com.meizu.cloud.pushsdk.platform.d;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.d.c;
import com.meizu.cloud.pushsdk.platform.PlatformMessageSender;
import com.meizu.cloud.pushsdk.platform.c.a;
import com.meizu.cloud.pushsdk.platform.message.UnRegisterStatus;
import com.meizu.cloud.pushsdk.util.b;
import java.util.concurrent.ScheduledExecutorService;
import tb.vgn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class g extends c<UnRegisterStatus> {
    public g(Context context, a aVar, ScheduledExecutorService scheduledExecutorService) {
        this(context, null, null, aVar, scheduledExecutorService);
    }

    @Override // com.meizu.cloud.pushsdk.platform.d.c
    public boolean d() {
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
        return 32;
    }

    /* renamed from: m */
    public UnRegisterStatus a() {
        String str;
        UnRegisterStatus unRegisterStatus = new UnRegisterStatus();
        unRegisterStatus.setCode(vgn.RATE_LIST_CODE);
        if (TextUtils.isEmpty(this.c)) {
            str = "appId not empty";
        } else {
            if (TextUtils.isEmpty(this.d)) {
                str = "appKey not empty";
            }
            return unRegisterStatus;
        }
        unRegisterStatus.setMessage(str);
        return unRegisterStatus;
    }

    /* renamed from: n */
    public UnRegisterStatus c() {
        return null;
    }

    /* renamed from: o */
    public UnRegisterStatus e() {
        UnRegisterStatus unRegisterStatus = new UnRegisterStatus();
        if (TextUtils.isEmpty(b.h(this.b, this.e))) {
            unRegisterStatus.setCode("200");
            unRegisterStatus.setMessage("already unRegister PushId,don't unRegister frequently");
            unRegisterStatus.setIsUnRegisterSuccess(true);
            return unRegisterStatus;
        }
        String b = c.b(this.b);
        String a2 = c.a(this.b);
        if (!TextUtils.isEmpty(b) || !TextUtils.isEmpty(a2)) {
            com.meizu.cloud.pushsdk.e.b.c d = this.f.d(this.c, this.d, a2, b);
            if (!d.c()) {
                com.meizu.cloud.pushsdk.e.c.a a3 = d.a();
                if (a3.c() != null) {
                    DebugLogger.e("Strategy", "status code=" + a3.b() + " data=" + a3.c());
                }
                unRegisterStatus.setCode(String.valueOf(a3.b()));
                unRegisterStatus.setMessage(a3.a());
                DebugLogger.e("Strategy", "unRegisterStatus " + unRegisterStatus);
                return unRegisterStatus;
            }
            UnRegisterStatus unRegisterStatus2 = new UnRegisterStatus((String) d.b());
            DebugLogger.e("Strategy", "network unRegisterStatus " + unRegisterStatus2);
            if ("200".equals(unRegisterStatus2.getCode())) {
                b.g(this.b, "", this.e);
            }
            return unRegisterStatus2;
        }
        unRegisterStatus.setCode("20000");
        unRegisterStatus.setMessage("deviceId is empty");
        return unRegisterStatus;
    }

    public g(Context context, a aVar, ScheduledExecutorService scheduledExecutorService, boolean z) {
        this(context, aVar, scheduledExecutorService);
        this.h = z;
    }

    /* renamed from: a */
    public void b(UnRegisterStatus unRegisterStatus) {
        PlatformMessageSender.a(this.b, !TextUtils.isEmpty(this.e) ? this.e : this.b.getPackageName(), unRegisterStatus);
    }

    public g(Context context, String str, String str2, a aVar, ScheduledExecutorService scheduledExecutorService) {
        super(context, str, str2, aVar, scheduledExecutorService);
    }
}
