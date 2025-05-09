package com.vivo.push.f;

import android.content.Context;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.vivo.push.b.q;
import com.vivo.push.model.InsideNotificationItem;
import com.vivo.push.model.NotifyArriveCallbackByUser;
import com.vivo.push.restructure.a;
import com.vivo.push.s;
import com.vivo.push.sdk.PushMessageCallback;
import com.vivo.push.util.ag;
import com.vivo.push.util.f;
import com.vivo.push.util.p;
import com.vivo.push.util.u;
import com.vivo.push.util.x;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class v implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ InsideNotificationItem f14604a;
    final /* synthetic */ q b;
    final /* synthetic */ u c;

    public v(u uVar, InsideNotificationItem insideNotificationItem, q qVar) {
        this.c = uVar;
        this.f14604a = insideNotificationItem;
        this.b = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        Context context2;
        Context context3;
        Context context4;
        Context context5;
        Context context6;
        int type;
        Context context7;
        Context context8;
        Context context9;
        Context context10;
        u uVar = this.c;
        PushMessageCallback pushMessageCallback = ((aa) uVar).b;
        context = ((s) uVar).f14645a;
        NotifyArriveCallbackByUser onNotificationMessageArrived = pushMessageCallback.onNotificationMessageArrived(context, com.vivo.push.util.v.a(this.f14604a));
        int a2 = this.c.a(onNotificationMessageArrived);
        if (a2 > 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("messageID", String.valueOf(this.b.f()));
            String a3 = a.a().e().a();
            if (!TextUtils.isEmpty(a3)) {
                hashMap.put("remoteAppId", a3);
            }
            context9 = ((s) this.c).f14645a;
            context10 = ((s) this.c).f14645a;
            hashMap.put("clientsdkver", String.valueOf(ag.c(context9, context10.getPackageName())));
            f.a(a2, hashMap);
            return;
        }
        int b = this.c.b();
        if (b > 0) {
            StringBuilder sb = new StringBuilder("pkg name : ");
            context7 = ((s) this.c).f14645a;
            sb.append(context7.getPackageName());
            sb.append(" notify channel switch is ");
            sb.append(b);
            u.b("OnNotificationArrivedTask", sb.toString());
            context8 = ((s) this.c).f14645a;
            u.b(context8, "允许通知开关或者推送通知渠道开关关闭，导致通知无法展示，请到设置页打开应用通知开关 ".concat(String.valueOf(b)));
            HashMap hashMap2 = new HashMap();
            hashMap2.put("messageID", String.valueOf(this.b.f()));
            String a4 = a.a().e().a();
            if (!TextUtils.isEmpty(a4)) {
                hashMap2.put("remoteAppId", a4);
            }
            f.a(b, hashMap2);
            return;
        }
        context2 = ((s) this.c).f14645a;
        InsideNotificationItem insideNotificationItem = this.f14604a;
        long f = this.b.f();
        u uVar2 = this.c;
        PushMessageCallback pushMessageCallback2 = ((aa) uVar2).b;
        context3 = ((s) uVar2).f14645a;
        p pVar = new p(context2, insideNotificationItem, f, pushMessageCallback2.isAllowNet(context3), new w(this), onNotificationMessageArrived);
        boolean isShowBigPicOnMobileNet = this.f14604a.isShowBigPicOnMobileNet();
        String purePicUrl = this.f14604a.getPurePicUrl();
        if (TextUtils.isEmpty(purePicUrl)) {
            purePicUrl = this.f14604a.getCoverUrl();
        }
        if (!TextUtils.isEmpty(purePicUrl)) {
            u.c("OnNotificationArrivedTask", "showCode=".concat(String.valueOf(isShowBigPicOnMobileNet)));
            if (!isShowBigPicOnMobileNet) {
                context5 = ((s) this.c).f14645a;
                u.a(context5, "mobile net unshow");
                context6 = ((s) this.c).f14645a;
                NetworkInfo a5 = x.a(context6);
                if (a5 != null && a5.getState() == NetworkInfo.State.CONNECTED && (type = a5.getType()) != 1 && type == 0) {
                    this.f14604a.clearCoverUrl();
                    this.f14604a.clearPurePicUrl();
                    purePicUrl = null;
                }
            } else {
                context4 = ((s) this.c).f14645a;
                u.a(context4, "mobile net show");
            }
        }
        pVar.execute(this.f14604a.getIconUrl(), purePicUrl);
    }
}
