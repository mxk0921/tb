package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.dynamic.bean.MusOuterAlbumBean;
import com.etao.feimagesearch.structure.capture.CaptureManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class l73 extends d32<k73, yr3, CaptureManager> implements hjb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(730857568);
        t2o.a(481296507);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l73(Activity activity, rcc<yr3, CaptureManager> rccVar) {
        super(activity, rccVar);
        ckf.g(activity, "activity");
    }

    public static /* synthetic */ Object ipc$super(l73 l73Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/biz/CaptureTranslateView");
    }

    /* renamed from: N */
    public k73 y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k73) ipChange.ipc$dispatch("19cb836", new Object[]{this});
        }
        return new k73();
    }

    public void O(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("832f2585", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            m().f0((hdd) this.f17536a);
            m().s0((qlb) this.f17536a);
        } else {
            m().F0((hdd) this.f17536a);
        }
        k73 k73Var = (k73) this.f17536a;
        if (k73Var != null) {
            k73Var.L(z);
        }
    }

    @Override // tb.hjb
    public void i(MusOuterAlbumBean musOuterAlbumBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89dffb4e", new Object[]{this, musOuterAlbumBean});
            return;
        }
        ckf.g(musOuterAlbumBean, "outerAlbumBean");
        k73 k73Var = (k73) this.f17536a;
        if (k73Var != null) {
            k73Var.G(musOuterAlbumBean);
        }
    }

    @Override // tb.hjb
    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73aeec19", new Object[]{this});
        }
    }

    @Override // tb.hjb
    public void u(pei peiVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2404a526", new Object[]{this, peiVar, new Boolean(z)});
            return;
        }
        k73 k73Var = (k73) this.f17536a;
        if (k73Var != null) {
            k73Var.E(peiVar, z);
        }
    }
}
