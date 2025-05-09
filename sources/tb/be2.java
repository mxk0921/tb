package tb;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.cameralink.manager.interfaces.ICLLifeListener;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class be2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ICLLifeListener f16342a;

    static {
        t2o.a(394264583);
    }

    public be2 a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (be2) ipChange.ipc$dispatch("696131f8", new Object[]{this, context});
        }
        boolean z = context instanceof Activity;
        return this;
    }

    public be2 b(ICLLifeListener iCLLifeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (be2) ipChange.ipc$dispatch("f2e483b0", new Object[]{this, iCLLifeListener});
        }
        this.f16342a = iCLLifeListener;
        return this;
    }

    public be2 c(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (be2) ipChange.ipc$dispatch("6aeefba8", new Object[]{this, frameLayout});
        }
        return this;
    }
}
