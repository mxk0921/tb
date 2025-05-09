package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.unionpay.utils.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class gxx implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        x3y x3yVar;
        Context G;
        Handler handler2;
        Handler handler3;
        Handler handler4;
        Handler handler5;
        try {
            handler = fyu.s;
            handler.sendEmptyMessageDelayed(1001, 800L);
            x3yVar = fyu.r;
            G = fyu.G();
            czx czxVar = new czx(x3yVar, a.b(G));
            czxVar.a();
            String b = czxVar.b();
            handler2 = fyu.s;
            if (handler2 != null) {
                handler3 = fyu.s;
                Message obtainMessage = handler3.obtainMessage();
                obtainMessage.what = 1002;
                obtainMessage.obj = b;
                handler4 = fyu.s;
                handler4.removeMessages(1001);
                handler5 = fyu.s;
                handler5.sendMessage(obtainMessage);
            }
        } catch (Exception unused) {
        }
    }
}
