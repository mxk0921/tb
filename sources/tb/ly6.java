package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.zcache.IZCacheClientListener;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ly6 implements yee {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements u11 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IZCacheClientListener f23637a;

        public a(ly6 ly6Var, IZCacheClientListener iZCacheClientListener) {
            this.f23637a = iZCacheClientListener;
        }

        @Override // tb.u11, com.taobao.application.common.IApmEventListener
        public void onEvent(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
                return;
            }
            if (i != 1) {
                if (i == 2) {
                    this.f23637a.clientActived();
                    return;
                } else if (i != 50) {
                    return;
                }
            }
            this.f23637a.clientDeactived();
        }
    }

    static {
        t2o.a(996147247);
        t2o.a(996147205);
    }

    public void a(IZCacheClientListener iZCacheClientListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede1ddc", new Object[]{this, iZCacheClientListener});
            return;
        }
        try {
            c21.c(new a(this, iZCacheClientListener));
        } catch (NoClassDefFoundError unused) {
        }
    }
}
