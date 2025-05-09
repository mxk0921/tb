package com.vivo.push.f;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.vivo.push.b.p;
import com.vivo.push.b.x;
import com.vivo.push.m;
import com.vivo.push.model.InsideNotificationItem;
import com.vivo.push.model.UPSNotificationMessage;
import com.vivo.push.restructure.a;
import com.vivo.push.util.NotifyAdapterUtil;
import com.vivo.push.util.u;
import com.vivo.push.v;
import java.util.HashMap;
import tb.h1p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class d extends aa {
    public d(v vVar) {
        super(vVar);
    }

    @Override // com.vivo.push.s
    public final void a(v vVar) {
        Intent intent;
        p pVar = (p) vVar;
        if (pVar == null) {
            u.d("NotifyInnerClientTask", "current onNotifyArrivedCommand is null");
            return;
        }
        InsideNotificationItem f = pVar.f();
        if (f == null) {
            u.d("NotifyInnerClientTask", "current notification item is null");
            return;
        }
        UPSNotificationMessage a2 = com.vivo.push.util.v.a(f);
        boolean equals = this.f14645a.getPackageName().equals(pVar.d());
        if (equals) {
            NotifyAdapterUtil.cancelNotify(this.f14645a);
        }
        if (equals) {
            x xVar = new x(1030L);
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("type", "2");
            hashMap.put("messageID", String.valueOf(pVar.e()));
            hashMap.put("platform", this.f14645a.getPackageName());
            String a3 = a.a().e().a();
            if (!TextUtils.isEmpty(a3)) {
                hashMap.put("remoteAppId", a3);
            }
            xVar.a(hashMap);
            m.a().a(xVar);
            u.d("NotifyInnerClientTask", "notification is clicked by skip type[" + a2.getSkipType() + "]");
            u.d("NotifyInnerClientTask", "notification is clicked by skip content[" + a2.getSkipContent() + "]");
            try {
                if (a2.getSkipType() == 2) {
                    String skipContent = a2.getSkipContent();
                    if (!TextUtils.isEmpty(skipContent)) {
                        String lowerCase = skipContent.toLowerCase();
                        if (!lowerCase.startsWith(h1p.HTTP_PREFIX) && !lowerCase.startsWith(h1p.HTTPS_PREFIX)) {
                            return;
                        }
                        intent = new Intent("android.intent.action.VIEW", Uri.parse(skipContent));
                        intent.setFlags(268435456);
                    } else {
                        return;
                    }
                } else {
                    intent = new Intent(pVar.g());
                    if (!TextUtils.isEmpty(pVar.h()) && !TextUtils.isEmpty(pVar.i())) {
                        intent.setComponent(new ComponentName(pVar.h(), pVar.i()));
                    }
                    String packageName = intent.getComponent() == null ? null : intent.getComponent().getPackageName();
                    if (TextUtils.isEmpty(packageName) || this.f14645a.getPackageName().equals(packageName)) {
                        if (pVar.j() != null) {
                            intent.setData(pVar.j());
                        }
                        intent.setSelector(null);
                        intent.setPackage(this.f14645a.getPackageName());
                        intent.addFlags(335544320);
                        ActivityInfo resolveActivityInfo = intent.resolveActivityInfo(this.f14645a.getPackageManager(), 65536);
                        if (resolveActivityInfo != null && !resolveActivityInfo.exported) {
                            u.d("NotifyInnerClientTask", "activity is not exported : " + resolveActivityInfo.toString());
                        }
                    } else {
                        u.a("NotifyInnerClientTask", "inner activity component error : local pkgName is " + this.f14645a.getPackageName() + "; but remote pkgName is " + packageName);
                        return;
                    }
                }
                intent.putExtras(pVar.k());
                this.f14645a.startActivity(intent);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            u.a("NotifyInnerClientTask", "notify is " + a2 + " ; isMatch is " + equals);
        }
    }
}
