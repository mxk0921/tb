package tb;

import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "alibuy.impl.aspect.lifecycle.skeleton")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class co0 extends wt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(301989967);
    }

    public static /* synthetic */ Object ipc$super(co0 co0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/buy/extension/aspect/AliBuySkeletonLoadingExtension");
    }

    @Override // tb.wt
    public void L0() {
        alq N0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c142d9", new Object[]{this});
        } else if (!P0() && (N0 = N0()) != null) {
            N0.c();
        }
    }

    @Override // tb.wt
    public void U0() {
        alq N0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73936486", new Object[]{this});
        } else if (!P0() && (N0 = N0()) != null) {
            N0.m(null);
        }
    }
}
