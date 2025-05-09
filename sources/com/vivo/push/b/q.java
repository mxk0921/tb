package com.vivo.push.b;

import android.text.TextUtils;
import com.vivo.push.d;
import com.vivo.push.model.InsideNotificationItem;
import com.vivo.push.util.v;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class q extends v {

    /* renamed from: a  reason: collision with root package name */
    protected InsideNotificationItem f14569a;
    private String b;

    public q() {
        super(4);
    }

    @Override // com.vivo.push.b.v, com.vivo.push.b.s, com.vivo.push.v
    public final void c(d dVar) {
        super.c(dVar);
        String b = v.b(this.f14569a);
        this.b = b;
        dVar.a("notification_v1", b);
    }

    public final InsideNotificationItem d() {
        return this.f14569a;
    }

    public final String e() {
        if (!TextUtils.isEmpty(this.b)) {
            return this.b;
        }
        InsideNotificationItem insideNotificationItem = this.f14569a;
        if (insideNotificationItem == null) {
            return null;
        }
        return v.b(insideNotificationItem);
    }

    @Override // com.vivo.push.b.s, com.vivo.push.v
    public final String toString() {
        return "OnNotifyArrivedCommand";
    }

    @Override // com.vivo.push.b.v, com.vivo.push.b.s, com.vivo.push.v
    public final void d(d dVar) {
        super.d(dVar);
        String a2 = dVar.a("notification_v1");
        this.b = a2;
        if (!TextUtils.isEmpty(a2)) {
            InsideNotificationItem a3 = v.a(this.b);
            this.f14569a = a3;
            if (a3 != null) {
                a3.setMsgId(f());
            }
        }
    }
}
