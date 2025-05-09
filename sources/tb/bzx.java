package tb;

import android.os.Bundle;
import android.os.Handler;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class bzx implements l9b {
    public final void a(int i, Bundle bundle) {
        Handler handler;
        Handler handler2;
        Handler handler3;
        handler = fyu.s;
        if (handler == null) {
            Handler unused = fyu.s = new Handler(fyu.x);
        }
        handler2 = fyu.s;
        handler3 = fyu.s;
        handler2.sendMessage(handler3.obtainMessage(1003, Integer.valueOf(i)));
    }
}
