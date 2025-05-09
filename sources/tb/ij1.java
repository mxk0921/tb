package tb;

import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.augecore.network.NetworkRequest;
import com.taobao.augecore.network.imp.AugeMtopNetWork;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ij1 implements vsj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final vsj f21339a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final ij1 f21340a = new ij1();
    }

    public static ij1 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ij1) ipChange.ipc$dispatch("95e9d84d", new Object[0]);
        }
        return b.f21340a;
    }

    public boolean b(guj gujVar, NetworkRequest networkRequest, Handler handler, Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89743a73", new Object[]{this, gujVar, networkRequest, handler, cls})).booleanValue();
        }
        return ((AugeMtopNetWork) this.f21339a).e(gujVar, networkRequest, handler, cls);
    }

    public ij1() {
        this.f21339a = new AugeMtopNetWork();
    }
}
