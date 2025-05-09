package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.clientreport.processor.IEventProcessor;
import com.xiaomi.clientreport.processor.IPerfProcessor;
import com.xiaomi.clientreport.processor.c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class bp implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private Context f14785a;

    /* renamed from: a  reason: collision with other field name */
    private c f772a;

    public void a(Context context) {
        this.f14785a = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        bt a2;
        String str;
        long currentTimeMillis;
        try {
            c cVar = this.f772a;
            if (cVar != null) {
                cVar.a();
            }
            b.c("begin read and send perf / event");
            c cVar2 = this.f772a;
            if (cVar2 instanceof IEventProcessor) {
                a2 = bt.a(this.f14785a);
                str = "event_last_upload_time";
                currentTimeMillis = System.currentTimeMillis();
            } else if (cVar2 instanceof IPerfProcessor) {
                a2 = bt.a(this.f14785a);
                str = "perf_last_upload_time";
                currentTimeMillis = System.currentTimeMillis();
            } else {
                return;
            }
            a2.m524a("sp_client_report_status", str, currentTimeMillis);
        } catch (Exception e) {
            b.a(e);
        }
    }

    public void a(c cVar) {
        this.f772a = cVar;
    }
}
