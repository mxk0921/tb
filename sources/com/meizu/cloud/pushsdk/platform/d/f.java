package com.meizu.cloud.pushsdk.platform.d;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.e.b.c;
import com.meizu.cloud.pushsdk.platform.PlatformMessageSender;
import com.meizu.cloud.pushsdk.platform.c.a;
import com.meizu.cloud.pushsdk.platform.message.PushSwitchStatus;
import com.meizu.cloud.pushsdk.util.b;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import tb.vgn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class f extends c<PushSwitchStatus> {
    private String j;
    private int k;
    private boolean l;
    private final Map<String, Boolean> m;

    public f(Context context, a aVar, ScheduledExecutorService scheduledExecutorService) {
        this(context, null, null, null, aVar, scheduledExecutorService);
    }

    private c<String> a(PushSwitchStatus pushSwitchStatus) {
        boolean z;
        boolean u;
        boolean s;
        int i = this.k;
        if (i != 0) {
            if (i == 1) {
                pushSwitchStatus.setMessage("SWITCH_THROUGH_MESSAGE");
                if (u() != this.l || p()) {
                    b(true);
                    f(this.l);
                    return this.f.a(this.c, this.d, this.j, this.k, this.l);
                }
                s = s();
            } else if (i != 2) {
                if (i == 3) {
                    pushSwitchStatus.setMessage("SWITCH_ALL");
                    if (s() == this.l && u() == this.l && !p()) {
                        s = this.l;
                    } else {
                        b(true);
                        d(this.l);
                        return this.f.a(this.c, this.d, this.j, this.l);
                    }
                }
                return null;
            } else {
                pushSwitchStatus.setMessage("CHECK_PUSH");
                if (!n() || !o() || p()) {
                    b(true);
                    return this.f.a(this.c, this.d, this.j);
                }
                z = s();
                pushSwitchStatus.setSwitchNotificationMessage(z);
                u = u();
            }
            pushSwitchStatus.setSwitchNotificationMessage(s);
            u = this.l;
        } else {
            pushSwitchStatus.setMessage("SWITCH_NOTIFICATION");
            if (s() != this.l || p()) {
                b(true);
                e(this.l);
                return this.f.a(this.c, this.d, this.j, this.k, this.l);
            }
            z = this.l;
            pushSwitchStatus.setSwitchNotificationMessage(z);
            u = u();
        }
        pushSwitchStatus.setSwitchThroughMessage(u);
        return null;
    }

    private void f(boolean z) {
        String str;
        Context context = this.b;
        if (!TextUtils.isEmpty(this.e)) {
            str = this.e;
        } else {
            str = this.b.getPackageName();
        }
        b.c(context, str, z);
    }

    private boolean n() {
        String str;
        Context context = this.b;
        if (!TextUtils.isEmpty(this.e)) {
            str = this.e;
        } else {
            str = this.b.getPackageName();
        }
        return b.l(context, str);
    }

    private boolean o() {
        String str;
        Context context = this.b;
        if (!TextUtils.isEmpty(this.e)) {
            str = this.e;
        } else {
            str = this.b.getPackageName();
        }
        return b.m(context, str);
    }

    private boolean p() {
        boolean z;
        Map<String, Boolean> map = this.m;
        Boolean bool = map.get(this.e + "_" + this.k);
        if (bool == null || bool.booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        DebugLogger.e("Strategy", "isSyncPushStatus " + this.e + " switch type->" + this.k + " flag->" + z);
        return z;
    }

    private boolean s() {
        String str;
        Context context = this.b;
        if (!TextUtils.isEmpty(this.e)) {
            str = this.e;
        } else {
            str = this.b.getPackageName();
        }
        return b.f(context, str);
    }

    private void t() {
        int i = this.k;
        if (i == 0 || i == 1) {
            PlatformMessageSender.a(this.b, i, this.l, this.e);
        } else if (i == 3) {
            PlatformMessageSender.a(this.b, 0, this.l, this.e);
            PlatformMessageSender.a(this.b, 1, this.l, this.e);
        }
    }

    private boolean u() {
        String str;
        Context context = this.b;
        if (!TextUtils.isEmpty(this.e)) {
            str = this.e;
        } else {
            str = this.b.getPackageName();
        }
        return b.k(context, str);
    }

    public void b(int i) {
        this.k = i;
    }

    public void d(String str) {
        this.j = str;
    }

    @Override // com.meizu.cloud.pushsdk.platform.d.c
    public Intent h() {
        String str;
        Intent intent = new Intent();
        intent.putExtra("app_id", this.c);
        intent.putExtra(MspGlobalDefine.APP_KEY, this.d);
        intent.putExtra("strategy_package_name", this.b.getPackageName());
        intent.putExtra(PushConstants.REGISTER_STATUS_PUSH_ID, this.j);
        intent.putExtra("strategy_type", j());
        intent.putExtra("strategy_child_type", this.k);
        if (this.l) {
            str = "1";
        } else {
            str = "0";
        }
        intent.putExtra("strategy_params", str);
        return intent;
    }

    @Override // com.meizu.cloud.pushsdk.platform.d.c
    public int j() {
        return 16;
    }

    /* renamed from: m */
    public PushSwitchStatus a() {
        String str;
        PushSwitchStatus pushSwitchStatus = new PushSwitchStatus();
        pushSwitchStatus.setCode(vgn.RATE_LIST_CODE);
        if (TextUtils.isEmpty(this.c)) {
            str = "appId not empty";
        } else if (TextUtils.isEmpty(this.d)) {
            str = "appKey not empty";
        } else {
            if (TextUtils.isEmpty(this.j)) {
                str = "pushId not empty";
            }
            return pushSwitchStatus;
        }
        pushSwitchStatus.setMessage(str);
        return pushSwitchStatus;
    }

    /* renamed from: q */
    public PushSwitchStatus c() {
        int i = this.k;
        if (i == 0) {
            e(this.l);
            return null;
        } else if (i == 1) {
            f(this.l);
            return null;
        } else if (i != 2 && i != 3) {
            return null;
        } else {
            d(this.l);
            return null;
        }
    }

    /* renamed from: r */
    public PushSwitchStatus e() {
        PushSwitchStatus pushSwitchStatus = new PushSwitchStatus();
        pushSwitchStatus.setPushId(this.j);
        pushSwitchStatus.setCode("200");
        c<String> a2 = a(pushSwitchStatus);
        if (a2 != null) {
            if (a2.c()) {
                PushSwitchStatus pushSwitchStatus2 = new PushSwitchStatus(a2.b());
                DebugLogger.e("Strategy", "network pushSwitchStatus " + pushSwitchStatus2);
                if ("200".equals(pushSwitchStatus.getCode())) {
                    b(false);
                    DebugLogger.e("Strategy", "update local switch preference");
                    pushSwitchStatus.setSwitchNotificationMessage(pushSwitchStatus2.isSwitchNotificationMessage());
                    pushSwitchStatus.setSwitchThroughMessage(pushSwitchStatus2.isSwitchThroughMessage());
                    e(pushSwitchStatus2.isSwitchNotificationMessage());
                    f(pushSwitchStatus2.isSwitchThroughMessage());
                }
            } else {
                com.meizu.cloud.pushsdk.e.c.a a3 = a2.a();
                if (a3.c() != null) {
                    DebugLogger.e("Strategy", "status code=" + a3.b() + " data=" + a3.c());
                }
                pushSwitchStatus.setCode(String.valueOf(a3.b()));
                pushSwitchStatus.setMessage(a3.a());
                DebugLogger.e("Strategy", "pushSwitchStatus " + pushSwitchStatus);
            }
        }
        DebugLogger.e("Strategy", "enableRpc " + this.h + " isSupportRemoteInvoke " + this.g);
        if (this.h && !this.g) {
            t();
        }
        return pushSwitchStatus;
    }

    public f(Context context, a aVar, ScheduledExecutorService scheduledExecutorService, boolean z) {
        this(context, aVar, scheduledExecutorService);
        this.h = z;
    }

    private void d(boolean z) {
        b.b(this.b, !TextUtils.isEmpty(this.e) ? this.e : this.b.getPackageName(), z);
        b.c(this.b, !TextUtils.isEmpty(this.e) ? this.e : this.b.getPackageName(), z);
    }

    private void e(boolean z) {
        b.b(this.b, !TextUtils.isEmpty(this.e) ? this.e : this.b.getPackageName(), z);
    }

    public void c(boolean z) {
        this.l = z;
    }

    public f(Context context, String str, String str2, a aVar, ScheduledExecutorService scheduledExecutorService) {
        super(context, str, str2, aVar, scheduledExecutorService);
        this.k = 0;
        this.m = new HashMap();
    }

    public void b(PushSwitchStatus pushSwitchStatus) {
        PlatformMessageSender.a(this.b, !TextUtils.isEmpty(this.e) ? this.e : this.b.getPackageName(), pushSwitchStatus);
    }

    @Override // com.meizu.cloud.pushsdk.platform.d.c
    public boolean d() {
        return !TextUtils.isEmpty(this.c) && !TextUtils.isEmpty(this.d) && !TextUtils.isEmpty(this.j);
    }

    public f(Context context, String str, String str2, String str3, a aVar, ScheduledExecutorService scheduledExecutorService) {
        this(context, str, str2, aVar, scheduledExecutorService);
        this.j = str3;
    }

    private void b(boolean z) {
        Map<String, Boolean> map = this.m;
        map.put(this.e + "_" + this.k, Boolean.valueOf(z));
    }
}
