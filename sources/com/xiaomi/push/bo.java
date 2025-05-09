package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.clientreport.manager.a;
import com.xiaomi.push.ah;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class bo extends ah.a {

    /* renamed from: a  reason: collision with root package name */
    private Context f14784a;

    public bo(Context context) {
        this.f14784a = context;
    }

    @Override // com.xiaomi.push.ah.a
    /* renamed from: a */
    public String mo607a() {
        return "100887";
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (a()) {
                a.a(this.f14784a).c();
                b.c(this.f14784a.getPackageName() + " perf begin upload");
            }
        } catch (Exception e) {
            b.d("fail to send perf data. " + e);
        }
    }

    private boolean a() {
        return a.a(this.f14784a).m417a().isPerfUploadSwitchOpen();
    }
}
