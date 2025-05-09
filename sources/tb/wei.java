package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class wei extends sx1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static wei f;
    public static int g;

    static {
        t2o.a(774897925);
    }

    public wei() {
        int i;
        int i2 = 4;
        try {
            i = ew0.u(OrangeConfig.getInstance().getConfig("DWInteractive", "maxPlayerNums", "4"));
        } catch (Throwable unused) {
            i = 4;
        }
        if (i <= 4 && i >= 0) {
            i2 = i;
        }
        g = i2;
    }

    public static /* synthetic */ Object ipc$super(wei weiVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobaoavsdk/recycle/MediaLivePlayerManager");
    }

    public static synchronized wei n() {
        synchronized (wei.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (wei) ipChange.ipc$dispatch("aa573c00", new Object[0]);
            }
            if (f == null) {
                wei weiVar = new wei();
                f = weiVar;
                weiVar.h();
            }
            return f;
        }
    }

    @Override // tb.sx1
    public int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3e19417e", new Object[]{this})).intValue();
        }
        return g;
    }

    @Override // tb.sx1
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af1249c", new Object[]{this});
        } else if (this.f28332a == null) {
            this.f28332a = new vei(g);
        }
    }
}
