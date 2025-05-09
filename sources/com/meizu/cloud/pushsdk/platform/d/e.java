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
import com.meizu.cloud.pushsdk.platform.message.SubTagsStatus;
import java.util.concurrent.ScheduledExecutorService;
import tb.vgn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class e extends c<SubTagsStatus> {
    private String j;
    private int k;
    private String l;

    public e(Context context, a aVar, ScheduledExecutorService scheduledExecutorService) {
        this(context, null, null, null, aVar, scheduledExecutorService);
    }

    public void b(int i) {
        this.k = i;
    }

    public void d(String str) {
        this.j = str;
    }

    @Override // com.meizu.cloud.pushsdk.platform.d.c
    public Intent h() {
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
        return 4;
    }

    /* renamed from: m */
    public SubTagsStatus a() {
        String str;
        SubTagsStatus subTagsStatus = new SubTagsStatus();
        subTagsStatus.setCode(vgn.RATE_LIST_CODE);
        if (TextUtils.isEmpty(this.c)) {
            str = "appId not empty";
        } else if (TextUtils.isEmpty(this.d)) {
            str = "appKey not empty";
        } else {
            if (TextUtils.isEmpty(this.j)) {
                str = "pushId not empty";
            }
            return subTagsStatus;
        }
        subTagsStatus.setMessage(str);
        return subTagsStatus;
    }

    /* renamed from: n */
    public SubTagsStatus c() {
        return null;
    }

    /* renamed from: o */
    public SubTagsStatus e() {
        c cVar;
        StringBuilder sb;
        SubTagsStatus subTagsStatus = new SubTagsStatus();
        int i = this.k;
        if (i == 0) {
            cVar = this.f.c(this.c, this.d, this.j, this.l);
        } else if (i == 1) {
            cVar = this.f.f(this.c, this.d, this.j, this.l);
        } else if (i != 2) {
            cVar = i != 3 ? null : this.f.b(this.c, this.d, this.j);
        } else {
            cVar = this.f.c(this.c, this.d, this.j);
        }
        if (cVar == null) {
            DebugLogger.e("Strategy", "network anResponse is null");
            return null;
        }
        if (cVar.c()) {
            subTagsStatus = new SubTagsStatus((String) cVar.b());
            sb = new StringBuilder("network subTagsStatus ");
        } else {
            com.meizu.cloud.pushsdk.e.c.a a2 = cVar.a();
            if (a2.c() != null) {
                DebugLogger.e("Strategy", "status code=" + a2.b() + " data=" + a2.c());
            }
            subTagsStatus.setCode(String.valueOf(a2.b()));
            subTagsStatus.setMessage(a2.a());
            sb = new StringBuilder("subTagsStatus ");
        }
        sb.append(subTagsStatus);
        DebugLogger.e("Strategy", sb.toString());
        return subTagsStatus;
    }

    public e(Context context, a aVar, ScheduledExecutorService scheduledExecutorService, boolean z) {
        this(context, aVar, scheduledExecutorService);
        this.h = z;
    }

    /* renamed from: a */
    public void b(SubTagsStatus subTagsStatus) {
        PlatformMessageSender.a(this.b, !TextUtils.isEmpty(this.e) ? this.e : this.b.getPackageName(), subTagsStatus);
    }

    @Override // com.meizu.cloud.pushsdk.platform.d.c
    public boolean d() {
        return !TextUtils.isEmpty(this.c) && !TextUtils.isEmpty(this.d) && !TextUtils.isEmpty(this.j);
    }

    public void e(String str) {
        this.l = str;
    }

    public e(Context context, String str, String str2, a aVar, ScheduledExecutorService scheduledExecutorService) {
        super(context, str, str2, aVar, scheduledExecutorService);
        this.k = 3;
    }

    public e(Context context, String str, String str2, String str3, a aVar, ScheduledExecutorService scheduledExecutorService) {
        this(context, str, str2, aVar, scheduledExecutorService);
        this.j = str3;
    }
}
