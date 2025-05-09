package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class yza extends nv1 implements n7c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782815);
        t2o.a(488636424);
    }

    public yza(lza lzaVar) {
        super(lzaVar);
    }

    public static /* synthetic */ Object ipc$super(yza yzaVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/framework/hostservice/callbcak/impl/HomeFoldPadDeviceCallback");
    }

    @Override // tb.n7c
    public boolean isAdaptHudScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11522a16", new Object[]{this})).booleanValue();
        }
        return w().r();
    }

    @Override // tb.n7c
    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b9831f6", new Object[]{this})).booleanValue();
        }
        return w().b();
    }
}
