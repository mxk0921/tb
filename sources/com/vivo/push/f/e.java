package com.vivo.push.f;

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
import com.vivo.push.t;
import com.vivo.push.util.NotifyAdapterUtil;
import com.vivo.push.util.u;
import com.vivo.push.v;
import java.util.HashMap;
import java.util.Map;
import tb.h1p;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class e extends aa {
    public e(v vVar) {
        super(vVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Intent b(Intent intent, Map<String, String> map) {
        if (!(map == null || map.entrySet() == null)) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (!(entry == null || entry.getKey() == null)) {
                    intent.putExtra(entry.getKey(), entry.getValue());
                }
            }
        }
        return intent;
    }

    @Override // com.vivo.push.s
    public final void a(v vVar) {
        Intent parseUri;
        String str;
        p pVar = (p) vVar;
        InsideNotificationItem f = pVar.f();
        if (f == null) {
            u.d("NotifyOpenClientTask", "current notification item is null");
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
            u.d("NotifyOpenClientTask", "notification is clicked by skip type[" + a2.getSkipType() + "]");
            int skipType = a2.getSkipType();
            if (skipType == 1) {
                new Thread(new f(this, this.f14645a, a2.getParams())).start();
                a(a2);
            } else if (skipType == 2) {
                String skipContent = a2.getSkipContent();
                if (skipContent.startsWith(h1p.HTTP_PREFIX) || skipContent.startsWith(h1p.HTTPS_PREFIX)) {
                    Uri parse = Uri.parse(skipContent);
                    Intent intent = new Intent("android.intent.action.VIEW", parse);
                    intent.setFlags(268435456);
                    b(intent, a2.getParams());
                    try {
                        this.f14645a.startActivity(intent);
                    } catch (Exception unused) {
                        u.a("NotifyOpenClientTask", "startActivity error : ".concat(String.valueOf(parse)));
                    }
                } else {
                    u.a("NotifyOpenClientTask", "url not legal");
                }
                a(a2);
            } else if (skipType == 3) {
                a(a2);
            } else if (skipType != 4) {
                u.a("NotifyOpenClientTask", "illegitmacy skip type error : " + a2.getSkipType());
            } else {
                String skipContent2 = a2.getSkipContent();
                try {
                    parseUri = Intent.parseUri(skipContent2, 1);
                    str = parseUri.getPackage();
                } catch (Exception e) {
                    u.a("NotifyOpenClientTask", "open activity error : ".concat(String.valueOf(skipContent2)), e);
                }
                if (TextUtils.isEmpty(str) || this.f14645a.getPackageName().equals(str)) {
                    String packageName = parseUri.getComponent() == null ? null : parseUri.getComponent().getPackageName();
                    if (TextUtils.isEmpty(packageName) || this.f14645a.getPackageName().equals(packageName)) {
                        parseUri.setSelector(null);
                        parseUri.setPackage(this.f14645a.getPackageName());
                        parseUri.addFlags(335544320);
                        b(parseUri, a2.getParams());
                        ActivityInfo resolveActivityInfo = parseUri.resolveActivityInfo(this.f14645a.getPackageManager(), 65536);
                        if (resolveActivityInfo == null || resolveActivityInfo.exported) {
                            this.f14645a.startActivity(parseUri);
                            a(a2);
                            return;
                        }
                        u.a("NotifyOpenClientTask", "activity is not exported : " + resolveActivityInfo.toString());
                        return;
                    }
                    u.a("NotifyOpenClientTask", "open activity component error : local pkgName is " + this.f14645a.getPackageName() + "; but remote pkgName is " + parseUri.getPackage());
                    return;
                }
                u.a("NotifyOpenClientTask", "open activity error : local pkgName is " + this.f14645a.getPackageName() + "; but remote pkgName is " + parseUri.getPackage());
            }
        } else {
            u.a("NotifyOpenClientTask", "notify is " + a2 + " ; isMatch is " + equals);
        }
    }

    private void a(UPSNotificationMessage uPSNotificationMessage) {
        t.c(new g(this, uPSNotificationMessage));
    }
}
