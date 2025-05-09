package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.view.frameanim.BKAnimBgFrameLayout;
import com.taobao.android.detail2.core.framework.view.frameanim.NewDetailMaskFrameLayout;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class w0s extends ja7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private NewDetailMaskFrameLayout h;
    private BKAnimBgFrameLayout i;
    private aqz j;
    private final rpz k;
    private boolean l = false;

    static {
        t2o.a(352321976);
    }

    public w0s(aqz aqzVar, NewDetailMaskFrameLayout newDetailMaskFrameLayout, BKAnimBgFrameLayout bKAnimBgFrameLayout, rpz rpzVar) {
        this.h = newDetailMaskFrameLayout;
        this.i = bKAnimBgFrameLayout;
        this.j = aqzVar;
        this.k = rpzVar;
    }

    public static /* synthetic */ Object ipc$super(w0s w0sVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/view/frameanim/BKBackAnimInitTaskRunnable");
    }

    @Override // tb.ja7
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d0a42b93", new Object[]{this});
        }
        return "initAnimBgLayout";
    }

    @Override // tb.ja7
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9425d337", new Object[]{this});
        } else if (!this.l) {
            this.l = true;
            s2s.a(this.j, this.h, this.i, this.k);
        }
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b77e1cf1", new Object[]{this})).booleanValue();
        }
        return this.l;
    }
}
