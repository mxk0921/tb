package tb;

import android.content.Context;
import android.text.TextUtils;
import com.unionpay.utils.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
final class w3y implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f30440a;
    final /* synthetic */ String b;
    final /* synthetic */ Context c;
    final /* synthetic */ String d;

    public w3y(String str, String str2, Context context, String str3) {
        this.f30440a = str;
        this.b = str2;
        this.c = context;
        this.d = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            String format = String.format(this.f30440a, a.m(this.b));
            "merUrl: ".concat(format);
            x3y x3yVar = new x3y(format);
            String b = a.b(this.c);
            czx czxVar = new czx(x3yVar, b);
            int a2 = TextUtils.isEmpty(this.b) ? 22 : czxVar.a();
            if (a2 == 0) {
                fyu.h(this.c, czxVar.b(), this.d);
            } else if (a2 == 22) {
                String format2 = String.format(this.f30440a, "conf_mode_02");
                "baseUrl: ".concat(format2);
                x3yVar.d(format2);
                czx czxVar2 = new czx(x3yVar, b);
                if (czxVar2.a() == 0) {
                    fyu.h(this.c, czxVar2.b(), this.d);
                }
            }
        } catch (Exception unused) {
        }
    }
}
