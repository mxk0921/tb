package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.dynamic.bean.MusOuterAlbumBean;
import com.etao.feimagesearch.capture.dynamic.msg.TipShowMsg;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import tb.l53;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class g63 extends d32<f63, yr3, CaptureManager> implements hjb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(730857549);
        t2o.a(481296507);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g63(Activity activity, rcc<yr3, CaptureManager> rccVar) {
        super(activity, rccVar);
        ckf.g(activity, "activity");
    }

    public static /* synthetic */ Object ipc$super(g63 g63Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/biz/CaptureIdentifyView");
    }

    /* renamed from: N */
    public f63 y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f63) ipChange.ipc$dispatch("c411d26a", new Object[]{this});
        }
        return new f63();
    }

    public final void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce81fde", new Object[]{this});
        } else {
            m().B().t(new TipShowMsg("请保持稳定对准识别的物体", 0L, l53.b.SCENE_IDENTIFY_ALL, TipShowMsg.TipShowType.TEXT_TYPE));
        }
    }

    public void P(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("832f2585", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            O();
            m().s0((qlb) this.f17536a);
        }
        f1v.a(this, z);
    }

    @Override // tb.hjb
    public void i(MusOuterAlbumBean musOuterAlbumBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89dffb4e", new Object[]{this, musOuterAlbumBean});
            return;
        }
        ckf.g(musOuterAlbumBean, "outerAlbumBean");
        f63 f63Var = (f63) this.f17536a;
        if (f63Var != null) {
            f63Var.H(musOuterAlbumBean);
        }
    }

    @Override // tb.hjb
    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73aeec19", new Object[]{this});
        } else {
            O();
        }
    }

    @Override // tb.hjb
    public void u(pei peiVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2404a526", new Object[]{this, peiVar, new Boolean(z)});
            return;
        }
        f63 f63Var = (f63) this.f17536a;
        if (f63Var != null) {
            f63Var.F(peiVar);
        }
    }
}
