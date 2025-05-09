package com.xiaomi.push;

import com.xiaomi.channel.commonutils.logger.b;
import java.util.Date;
import tb.f7l;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class gp implements gt {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ go f14911a;

    public gp(go goVar) {
        this.f14911a = goVar;
    }

    @Override // com.xiaomi.push.gt
    public void a(gq gqVar) {
        b.c("[Slim] " + this.f14911a.f1061a.format(new Date()) + " Connection started (" + this.f14911a.f1058a.hashCode() + f7l.BRACKET_END_STR);
    }

    @Override // com.xiaomi.push.gt
    public void b(gq gqVar) {
        b.c("[Slim] " + this.f14911a.f1061a.format(new Date()) + " Connection reconnected (" + this.f14911a.f1058a.hashCode() + f7l.BRACKET_END_STR);
    }

    @Override // com.xiaomi.push.gt
    public void a(gq gqVar, int i, Exception exc) {
        b.c("[Slim] " + this.f14911a.f1061a.format(new Date()) + " Connection closed (" + this.f14911a.f1058a.hashCode() + f7l.BRACKET_END_STR);
    }

    @Override // com.xiaomi.push.gt
    public void a(gq gqVar, Exception exc) {
        b.c("[Slim] " + this.f14911a.f1061a.format(new Date()) + " Reconnection failed due to an exception (" + this.f14911a.f1058a.hashCode() + f7l.BRACKET_END_STR);
        exc.printStackTrace();
    }
}
