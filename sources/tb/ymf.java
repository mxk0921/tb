package tb;

import android.animation.ValueAnimator;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ymf extends zio {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ ValueAnimator c;
    public final /* synthetic */ umf d;

    public ymf(ValueAnimator valueAnimator, umf umfVar) {
        this.c = valueAnimator;
        this.d = umfVar;
    }

    public static /* synthetic */ Object ipc$super(ymf ymfVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/newresult/widget/IrpScanLoadingWidget$stopScanAnimation$1$1");
    }

    @Override // tb.zio
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            return;
        }
        this.c.cancel();
        this.c.removeAllListeners();
        this.c.removeAllUpdateListeners();
        TUrlImageView k0 = umf.k0(this.d);
        if (k0 != null) {
            k0.setVisibility(8);
        } else {
            ckf.y("mScanLine");
            throw null;
        }
    }
}
