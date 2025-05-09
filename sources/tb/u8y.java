package tb;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.unionpay.utils.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class u8y implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f29235a;
    final /* synthetic */ d8y b;

    public u8y(d8y d8yVar, String str) {
        this.b = d8yVar;
        this.f29235a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        Handler handler2;
        Handler handler3;
        Handler handler4;
        String str;
        Context h;
        String str2;
        Handler handler5;
        Handler handler6;
        Handler handler7;
        Handler handler8;
        Handler handler9;
        Handler handler10;
        Handler handler11;
        Handler handler12;
        Handler handler13;
        Handler handler14;
        try {
            handler4 = this.b.f17656a;
            if (handler4 != null) {
                handler14 = this.b.f17656a;
                handler14.sendEmptyMessageDelayed(1008, 5000L);
            }
            String str3 = this.f29235a;
            str = this.b.e;
            String format = String.format(str3, a.m(str));
            "merUrl: ".concat(format);
            x3y x3yVar = new x3y(format);
            h = this.b.h();
            String b = a.b(h);
            czx czxVar = new czx(x3yVar, b);
            str2 = this.b.e;
            int a2 = TextUtils.isEmpty(str2) ? 22 : czxVar.a();
            if (a2 == 0) {
                String b2 = czxVar.b();
                handler12 = this.b.f17656a;
                if (handler12 != null) {
                    handler13 = this.b.f17656a;
                    handler13.removeMessages(1008);
                }
                d8y.g(this.b, b2);
            } else if (a2 == 22) {
                String format2 = String.format(this.f29235a, "conf_mode_02");
                x3yVar.d(format2);
                "baseUrl: ".concat(format2);
                czx czxVar2 = new czx(x3yVar, b);
                int a3 = czxVar2.a();
                handler8 = this.b.f17656a;
                if (handler8 != null) {
                    handler11 = this.b.f17656a;
                    handler11.removeMessages(1008);
                }
                if (a3 == 0) {
                    d8y.g(this.b, czxVar2.b());
                    return;
                }
                handler9 = this.b.f17656a;
                if (handler9 != null) {
                    handler10 = this.b.f17656a;
                    handler10.sendEmptyMessage(1009);
                }
            } else {
                handler5 = this.b.f17656a;
                if (handler5 != null) {
                    handler6 = this.b.f17656a;
                    handler6.removeMessages(1008);
                    handler7 = this.b.f17656a;
                    handler7.sendEmptyMessage(1009);
                }
            }
        } catch (Exception unused) {
            handler = this.b.f17656a;
            if (handler != null) {
                handler2 = this.b.f17656a;
                handler2.removeMessages(1008);
                handler3 = this.b.f17656a;
                handler3.sendEmptyMessage(1010);
            }
        }
    }
}
