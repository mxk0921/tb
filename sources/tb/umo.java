package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sns4android.SNSPlatform;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class umo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile umo b;

    /* renamed from: a  reason: collision with root package name */
    public final Map<SNSPlatform, vmo> f29500a = new HashMap();

    static {
        t2o.a(69206251);
    }

    public static umo a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (umo) ipChange.ipc$dispatch("4766f1f3", new Object[0]);
        }
        if (b == null) {
            synchronized (umo.class) {
                try {
                    if (b == null) {
                        b = new umo();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public vmo b(SNSPlatform sNSPlatform) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vmo) ipChange.ipc$dispatch("d6b4625d", new Object[]{this, sNSPlatform});
        }
        return (vmo) ((HashMap) this.f29500a).get(sNSPlatform);
    }

    public void c(SNSPlatform sNSPlatform, vmo vmoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e042e8", new Object[]{this, sNSPlatform, vmoVar});
        } else {
            ((HashMap) this.f29500a).put(sNSPlatform, vmoVar);
        }
    }
}
