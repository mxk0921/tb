package com.meizu.cloud.pushsdk.platform.d;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.platform.PlatformMessageSender;
import com.meizu.cloud.pushsdk.platform.c.a;
import com.meizu.cloud.pushsdk.platform.message.SubAliasStatus;
import com.meizu.cloud.pushsdk.util.b;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import tb.vgn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class d extends c<SubAliasStatus> {
    private String j;
    private int k;
    private String l;
    private final Map<String, Boolean> m;

    public d(Context context, a aVar, ScheduledExecutorService scheduledExecutorService) {
        this(context, null, null, null, aVar, scheduledExecutorService);
    }

    private void f(String str) {
        String str2;
        Context context = this.b;
        if (!TextUtils.isEmpty(this.e)) {
            str2 = this.e;
        } else {
            str2 = this.b.getPackageName();
        }
        b.j(context, str2, str);
    }

    private boolean n() {
        if (this.g || !PushConstants.PUSH_PACKAGE_NAME.equals(this.e)) {
            return false;
        }
        return true;
    }

    private boolean o() {
        Map<String, Boolean> map = this.m;
        Boolean bool = map.get(this.e + "_" + this.k);
        if (bool == null || bool.booleanValue()) {
            return true;
        }
        return false;
    }

    private String p() {
        String str;
        Context context = this.b;
        if (!TextUtils.isEmpty(this.e)) {
            str = this.e;
        } else {
            str = this.b.getPackageName();
        }
        return b.a(context, str);
    }

    public void b(int i) {
        this.k = i;
    }

    public void d(String str) {
        this.l = str;
    }

    @Override // com.meizu.cloud.pushsdk.platform.d.c
    public Intent h() {
        if (this.k == 2) {
            return null;
        }
        Intent intent = new Intent();
        intent.putExtra("app_id", this.c);
        intent.putExtra(MspGlobalDefine.APP_KEY, this.d);
        intent.putExtra("strategy_package_name", this.b.getPackageName());
        intent.putExtra(PushConstants.REGISTER_STATUS_PUSH_ID, this.j);
        intent.putExtra("strategy_type", j());
        intent.putExtra("strategy_child_type", this.k);
        intent.putExtra("strategy_params", this.l);
        return intent;
    }

    @Override // com.meizu.cloud.pushsdk.platform.d.c
    public int j() {
        return 8;
    }

    /* renamed from: m */
    public SubAliasStatus a() {
        String str;
        SubAliasStatus subAliasStatus = new SubAliasStatus();
        subAliasStatus.setCode(vgn.RATE_LIST_CODE);
        if (TextUtils.isEmpty(this.c)) {
            str = "appId not empty";
        } else if (TextUtils.isEmpty(this.d)) {
            str = "appKey not empty";
        } else {
            if (TextUtils.isEmpty(this.j)) {
                str = "pushId not empty";
            }
            return subAliasStatus;
        }
        subAliasStatus.setMessage(str);
        return subAliasStatus;
    }

    /* renamed from: q */
    public SubAliasStatus c() {
        if (this.k != 2) {
            return null;
        }
        SubAliasStatus subAliasStatus = new SubAliasStatus();
        subAliasStatus.setCode("200");
        subAliasStatus.setPushId(this.j);
        subAliasStatus.setAlias(p());
        subAliasStatus.setMessage("check alias success");
        return subAliasStatus;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.meizu.cloud.pushsdk.platform.message.SubAliasStatus e() {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.platform.d.d.e():com.meizu.cloud.pushsdk.platform.message.SubAliasStatus");
    }

    public d(Context context, a aVar, ScheduledExecutorService scheduledExecutorService, boolean z) {
        this(context, aVar, scheduledExecutorService);
        this.h = z;
    }

    /* renamed from: a */
    public void b(SubAliasStatus subAliasStatus) {
        PlatformMessageSender.a(this.b, !TextUtils.isEmpty(this.e) ? this.e : this.b.getPackageName(), subAliasStatus);
    }

    @Override // com.meizu.cloud.pushsdk.platform.d.c
    public boolean d() {
        return !TextUtils.isEmpty(this.c) && !TextUtils.isEmpty(this.d) && !TextUtils.isEmpty(this.j);
    }

    public void e(String str) {
        this.j = str;
    }

    public d(Context context, String str, String str2, a aVar, ScheduledExecutorService scheduledExecutorService) {
        super(context, str, str2, aVar, scheduledExecutorService);
        this.m = new HashMap();
    }

    private void b(boolean z) {
        Map<String, Boolean> map = this.m;
        map.put(this.e + "_" + this.k, Boolean.valueOf(z));
    }

    public d(Context context, String str, String str2, String str3, a aVar, ScheduledExecutorService scheduledExecutorService) {
        this(context, str, str2, aVar, scheduledExecutorService);
        this.j = str3;
    }
}
