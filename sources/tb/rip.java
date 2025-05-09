package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.TBShareContent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class rip {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public TBShareContent f27409a;
    public hpd b;

    static {
        t2o.a(665845778);
    }

    public TBShareContent a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBShareContent) ipChange.ipc$dispatch("7b80d674", new Object[]{this});
        }
        return this.f27409a;
    }

    public hpd b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hpd) ipChange.ipc$dispatch("ed72c7da", new Object[]{this});
        }
        return this.b;
    }

    public void c(TBShareContent tBShareContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("425e97aa", new Object[]{this, tBShareContent});
        } else {
            this.f27409a = tBShareContent;
        }
    }

    public void d(hpd hpdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef0c4b06", new Object[]{this, hpdVar});
        } else {
            this.b = hpdVar;
        }
    }
}
