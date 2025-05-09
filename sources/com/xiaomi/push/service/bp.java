package com.xiaomi.push.service;

import com.alipay.security.mobile.module.http.constant.RpcConfigureConstant;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.gb;
import com.xiaomi.push.service.XMPushService;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class bp {
    private static int d = 300000;

    /* renamed from: a  reason: collision with other field name */
    private XMPushService f1601a;
    private int b = 0;
    private int c = 0;

    /* renamed from: a  reason: collision with root package name */
    private int f15079a = 500;

    /* renamed from: a  reason: collision with other field name */
    private long f1600a = 0;

    public bp(XMPushService xMPushService) {
        this.f1601a = xMPushService;
    }

    private int a() {
        double d2;
        if (this.b > 8) {
            return RpcConfigureConstant.STATIC_DATA_UPDATE_TIMEOUT;
        }
        double random = (Math.random() * 2.0d) + 1.0d;
        int i = this.b;
        if (i > 4) {
            d2 = 60000.0d;
        } else if (i > 1) {
            d2 = 10000.0d;
        } else if (this.f1600a == 0) {
            return 0;
        } else {
            if (System.currentTimeMillis() - this.f1600a < 310000) {
                int i2 = this.f15079a;
                int i3 = d;
                if (i2 >= i3) {
                    return i2;
                }
                int i4 = this.c + 1;
                this.c = i4;
                if (i4 >= 4) {
                    return i3;
                }
                this.f15079a = (int) (i2 * 1.5d);
                return i2;
            }
            this.f15079a = 1000;
            this.c = 0;
            return 0;
        }
        return (int) (random * d2);
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m1058a() {
        this.f1600a = System.currentTimeMillis();
        this.f1601a.a(1);
        this.b = 0;
    }

    public void a(boolean z) {
        if (!this.f1601a.m983a()) {
            b.c("should not reconnect as no client or network.");
        } else if (z) {
            if (!this.f1601a.m984a(1)) {
                this.b++;
            }
            this.f1601a.a(1);
            b.m411a("ReconnectionManager", "-->tryReconnect(): exec ConnectJob");
            XMPushService xMPushService = this.f1601a;
            Objects.requireNonNull(xMPushService);
            xMPushService.a(new XMPushService.e());
        } else if (!this.f1601a.m984a(1)) {
            int a2 = a();
            this.b++;
            b.m410a("schedule reconnect in " + a2 + "ms");
            XMPushService xMPushService2 = this.f1601a;
            Objects.requireNonNull(xMPushService2);
            xMPushService2.a(new XMPushService.e(), (long) a2);
            if (this.b == 2 && gb.m710a().m715a()) {
                ao.b();
            }
            if (this.b == 3) {
                ao.a();
            }
        }
    }
}
