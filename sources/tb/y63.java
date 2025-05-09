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
public final class y63 extends d32<x63, yr3, CaptureManager> implements hjb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(730857559);
        t2o.a(481296507);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y63(Activity activity, rcc<yr3, CaptureManager> rccVar) {
        super(activity, rccVar);
        ckf.g(activity, "activity");
    }

    public static /* synthetic */ Object ipc$super(y63 y63Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/biz/CaptureQuestionView");
    }

    /* renamed from: N */
    public x63 y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x63) ipChange.ipc$dispatch("e49cd6c4", new Object[]{this});
        }
        return new x63();
    }

    public final void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce81fde", new Object[]{this});
        } else {
            m().B().t(new TipShowMsg("每次只拍一道题，效果更好哦", 0L, l53.b.SCENE_QUESTION, TipShowMsg.TipShowType.TEXT_TYPE));
        }
    }

    public void P(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("832f2585", new Object[]{this, new Boolean(z)});
        } else if (z) {
            O();
            m().s0((qlb) this.f17536a);
        }
    }

    @Override // tb.hjb
    public void i(MusOuterAlbumBean musOuterAlbumBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89dffb4e", new Object[]{this, musOuterAlbumBean});
        } else {
            ckf.g(musOuterAlbumBean, "outerAlbumBean");
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
        }
    }
}
