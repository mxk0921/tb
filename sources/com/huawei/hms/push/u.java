package com.huawei.hms.push;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import com.alipay.android.msp.framework.statisticsv2.value.CountValue;
import com.huawei.hms.support.log.HMSLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class u {
    private static final String[] c = {"url", "app", "cosa", CountValue.T_RP};

    /* renamed from: a  reason: collision with root package name */
    private Context f5459a;
    private o b;

    public u(Context context, o oVar) {
        this.f5459a = context;
        this.b = oVar;
    }

    public static boolean a(String str) {
        for (String str2 : c) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    private void b() {
        HMSLog.i("PushSelfShowLog", "run into launchCosaApp");
        try {
            HMSLog.i("PushSelfShowLog", "enter launchExistApp cosa, appPackageName =" + this.b.c() + ",and msg.intentUri is " + this.b.m());
            Intent b = e.b(this.f5459a, this.b.c());
            boolean z = false;
            if (this.b.m() != null) {
                try {
                    Intent parseUri = Intent.parseUri(this.b.m(), 0);
                    parseUri.setSelector(null);
                    if (parseUri.getClipData() == null) {
                        parseUri.setClipData(ClipData.newPlainText("avoid intent add read permission flags", "avoid"));
                    }
                    HMSLog.i("PushSelfShowLog", "Intent.parseUri(msg.intentUri, 0), action:" + parseUri.getAction());
                    z = e.a(this.f5459a, this.b.c(), parseUri).booleanValue();
                    if (z) {
                        b = parseUri;
                    }
                } catch (Exception e) {
                    HMSLog.w("PushSelfShowLog", "intentUri error." + e.toString());
                }
            } else if (this.b.a() != null) {
                Intent intent = new Intent(this.b.a());
                if (e.a(this.f5459a, this.b.c(), intent).booleanValue()) {
                    b = intent;
                }
            }
            if (b == null) {
                HMSLog.i("PushSelfShowLog", "launchCosaApp,intent == null");
                return;
            }
            b.setPackage(this.b.c());
            if (z) {
                b.addFlags(268435456);
            } else {
                b.setFlags(805437440);
            }
            this.f5459a.startActivity(b);
        } catch (Exception e2) {
            HMSLog.e("PushSelfShowLog", "launch Cosa App exception." + e2.toString());
        }
    }

    public void c() {
        o oVar;
        HMSLog.d("PushSelfShowLog", "enter launchNotify()");
        if (this.f5459a == null || (oVar = this.b) == null) {
            HMSLog.d("PushSelfShowLog", "launchNotify  context or msg is null");
        } else if ("app".equals(oVar.h())) {
            a();
        } else if ("cosa".equals(this.b.h())) {
            b();
        } else if (CountValue.T_RP.equals(this.b.h())) {
            HMSLog.w("PushSelfShowLog", this.b.h() + " not support rich message.");
        } else if ("url".equals(this.b.h())) {
            HMSLog.w("PushSelfShowLog", this.b.h() + " not support URL.");
        } else {
            HMSLog.d("PushSelfShowLog", this.b.h() + " is not exist in hShowType");
        }
    }

    private void a() {
        try {
            HMSLog.i("PushSelfShowLog", "enter launchApp, appPackageName =" + this.b.c());
            if (e.c(this.f5459a, this.b.c())) {
                b();
            }
        } catch (Exception e) {
            HMSLog.e("PushSelfShowLog", "launchApp error:" + e.toString());
        }
    }
}
