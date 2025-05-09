package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ky0 extends xr9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final xvg f22997a;

    static {
        t2o.a(806355062);
    }

    public ky0(xvg xvgVar) {
        this.f22997a = xvgVar;
    }

    public static /* synthetic */ Object ipc$super(ky0 ky0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/launcher/animation/AnimationFluidStartTask");
    }

    @Override // tb.fzd
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9425d337", new Object[]{this});
        } else {
            this.f22997a.start();
        }
    }

    @Override // tb.xr9
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f8f3f435", new Object[]{this});
        }
        return this.f22997a.getAnimationGroup();
    }

    @Override // tb.fzd
    public String getTaskName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d0a42b93", new Object[]{this});
        }
        return this.f22997a.getAnimationName();
    }

    public xvg h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xvg) ipChange.ipc$dispatch("e709ce30", new Object[]{this});
        }
        return this.f22997a;
    }
}
