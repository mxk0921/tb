package tb;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class g2b extends nv1 implements u5d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782819);
        t2o.a(488636429);
    }

    public g2b(lza lzaVar) {
        super(lzaVar);
    }

    public static /* synthetic */ Object ipc$super(g2b g2bVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/framework/hostservice/callbcak/impl/HomePageCallback");
    }

    @Override // tb.u5d
    public Fragment a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("bc1dab59", new Object[]{this});
        }
        return w().j();
    }

    @Override // tb.u5d
    public Context f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("2fdd88e9", new Object[]{this});
        }
        return w().f();
    }

    @Override // tb.u5d
    public boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58c4938", new Object[]{this})).booleanValue();
        }
        return w().s();
    }
}
