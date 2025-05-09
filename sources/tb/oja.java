package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class oja extends loq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public oja(g1r g1rVar) {
        super(g1rVar);
    }

    public static /* synthetic */ Object ipc$super(oja ojaVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/remote/remote/proxy/strategy/GrayScaleExperimentStrategy");
    }

    @Override // tb.loq
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e3eb83b", new Object[]{this})).booleanValue();
        }
        return this.f23472a.a(AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE, true);
    }
}
