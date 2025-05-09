package com.meizu.cloud.pushsdk.platform.d;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.notification.g.b;
import com.meizu.cloud.pushsdk.platform.message.BasicPushStatus;
import com.meizu.cloud.pushsdk.util.MinSdkChecker;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a extends c {
    private int[] j;
    private int k;
    private String l;

    public a(Context context, String str, String str2, com.meizu.cloud.pushsdk.platform.c.a aVar, ScheduledExecutorService scheduledExecutorService) {
        super(context, str, str2, aVar, scheduledExecutorService);
        this.g = MinSdkChecker.isSupportSetDrawableSmallIcon();
    }

    @Override // com.meizu.cloud.pushsdk.platform.d.c
    public BasicPushStatus a() {
        return null;
    }

    public void b(int i) {
        this.k = i;
    }

    @Override // com.meizu.cloud.pushsdk.platform.d.c
    public BasicPushStatus c() {
        return null;
    }

    public void d(String str) {
        this.l = str;
    }

    @Override // com.meizu.cloud.pushsdk.platform.d.c
    public BasicPushStatus e() {
        int i = this.k;
        if (i == 0) {
            if (!MinSdkChecker.isSupportSetDrawableSmallIcon()) {
                DebugLogger.e("Strategy", "android 6.0 blow so cancel all by context");
                b.a(this.b);
            }
            b.a(this.b, this.e);
            return null;
        } else if (i == 1) {
            int[] iArr = this.j;
            if (iArr == null) {
                return null;
            }
            for (int i2 : iArr) {
                DebugLogger.e("Strategy", "clear notifyId " + i2);
                b.a(this.b, this.e, i2);
            }
            return null;
        } else if (i != 2) {
            return null;
        } else {
            b.a(this.b, this.e, this.l);
            return null;
        }
    }

    @Override // com.meizu.cloud.pushsdk.platform.d.c
    public Intent h() {
        Intent intent = new Intent();
        intent.putExtra("strategy_package_name", this.b.getPackageName());
        intent.putExtra("strategy_type", j());
        intent.putExtra("strategy_child_type", this.k);
        int i = this.k;
        if (i == 2) {
            intent.putExtra("strategy_params", this.l);
            return intent;
        } else if (i == 1) {
            return null;
        } else {
            return intent;
        }
    }

    @Override // com.meizu.cloud.pushsdk.platform.d.c
    public Intent[] i() {
        int[] iArr = this.j;
        if (iArr == null) {
            return null;
        }
        Intent[] intentArr = new Intent[iArr.length];
        for (int i = 0; i < this.j.length; i++) {
            DebugLogger.i("Strategy", "send notifyId " + this.j[i] + " to PushManagerService");
            Intent intent = new Intent();
            intent.putExtra("strategy_package_name", this.b.getPackageName());
            intent.putExtra("strategy_type", j());
            intent.putExtra("strategy_child_type", this.k);
            intent.putExtra("strategy_params", "" + this.j[i]);
            intentArr[i] = intent;
        }
        return intentArr;
    }

    @Override // com.meizu.cloud.pushsdk.platform.d.c
    public int j() {
        return 64;
    }

    public a(Context context, ScheduledExecutorService scheduledExecutorService, boolean z) {
        this(context, null, null, null, scheduledExecutorService);
        this.h = z;
    }

    public void a(int... iArr) {
        this.j = iArr;
    }

    @Override // com.meizu.cloud.pushsdk.platform.d.c
    public void b(BasicPushStatus basicPushStatus) {
    }

    @Override // com.meizu.cloud.pushsdk.platform.d.c
    public boolean d() {
        int i = this.k;
        if (i == 0) {
            return true;
        }
        int[] iArr = this.j;
        if (iArr == null || iArr.length <= 0 || i != 1) {
            return i == 2 && !TextUtils.isEmpty(this.l);
        }
        return true;
    }
}
