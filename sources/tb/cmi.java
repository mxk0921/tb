package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.lpm_android.LpmProxy;
import com.taobao.taolive.sdk.model.message.TLiveMsg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class cmi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806355616);
    }

    public final void a(String str, TLiveMsg tLiveMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6721093f", new Object[]{this, str, tLiveMsg});
            return;
        }
        ckf.h(str, "bizID");
        try {
            qmh f = qmh.f();
            ckf.c(f, "Lpm.instance()");
            if (f.h()) {
                LpmProxy.getInstance().onDispatch(str, tLiveMsg);
            }
        } catch (Exception unused) {
        }
    }

    public final void b(String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b48dbca5", new Object[]{this, str, new Integer(i), obj});
            return;
        }
        ckf.h(str, "bizID");
        try {
            qmh f = qmh.f();
            ckf.c(f, "Lpm.instance()");
            if (f.h()) {
                LpmProxy.getInstance().onMessageError(str, i, obj);
            }
        } catch (Exception unused) {
        }
    }

    public final void c(String str, int i, int i2, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29c5baf0", new Object[]{this, str, new Integer(i), new Integer(i2), str2, str3});
            return;
        }
        ckf.h(str, "bizID");
        try {
            qmh f = qmh.f();
            ckf.c(f, "Lpm.instance()");
            if (f.h()) {
                LpmProxy.getInstance().onSubscribe(str, i, i2, str2, str3);
            }
        } catch (Exception unused) {
        }
    }

    public final void d(String str, int i, int i2, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61986797", new Object[]{this, str, new Integer(i), new Integer(i2), str2, str3});
            return;
        }
        ckf.h(str, "bizID");
        try {
            qmh f = qmh.f();
            ckf.c(f, "Lpm.instance()");
            if (f.h()) {
                LpmProxy.getInstance().onUnSubscribe(str, i, i2, str2, str3);
            }
        } catch (Exception unused) {
        }
    }
}
