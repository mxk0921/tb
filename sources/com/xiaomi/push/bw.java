package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.ah;
import java.lang.ref.WeakReference;
import tb.q0j;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class bw extends ah.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ bu f14789a;

    public bw(bu buVar) {
        this.f14789a = buVar;
    }

    @Override // com.xiaomi.push.ah.a
    /* renamed from: a */
    public String mo607a() {
        return q0j.ERROR_CODE_RECOMMEND_SECTION_BUFFER_DUPLICATE_ID;
    }

    @Override // java.lang.Runnable
    public void run() {
        String c;
        Context context;
        Context context2;
        b.c("exec== DbSizeControlJob");
        c = this.f14789a.c();
        context = this.f14789a.f774a;
        bz bzVar = new bz(c, new WeakReference(context));
        context2 = this.f14789a.f774a;
        cg.a(context2).a(bzVar);
        this.f14789a.b("check_time");
    }
}
