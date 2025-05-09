package android.taobao.windvane.extra.uc;

import android.os.Handler;
import android.os.HandlerThread;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WVThread extends HandlerThread {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Handler mHandler;

    static {
        t2o.a(989856098);
    }

    public WVThread(String str) {
        super(str);
        start();
        this.mHandler = new Handler(getLooper());
    }

    public static /* synthetic */ Object ipc$super(WVThread wVThread, String str, Object... objArr) {
        if (str.hashCode() == -1052580006) {
            return new Boolean(super.quit());
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/extra/uc/WVThread");
    }

    public Handler getHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("e690ed4b", new Object[]{this});
        }
        return this.mHandler;
    }

    @Override // android.os.HandlerThread
    public boolean quit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c142e75a", new Object[]{this})).booleanValue();
        }
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        return super.quit();
    }

    public WVThread(String str, int i) {
        super(str, i);
        start();
        this.mHandler = new Handler(getLooper());
    }

    public WVThread(String str, Handler.Callback callback) {
        super(str);
        start();
        this.mHandler = new Handler(getLooper(), callback);
    }

    public WVThread(String str, int i, Handler.Callback callback) {
        super(str, i);
        start();
        this.mHandler = new Handler(getLooper(), callback);
    }
}
