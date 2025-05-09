package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class c0i extends s30 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809844);
    }

    public c0i(String str) {
        super(str);
    }

    public static /* synthetic */ Object ipc$super(c0i c0iVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/recommend3/newface/subcontainer/cn/MainLandSubContainerRequestParams");
    }

    @Override // tb.s30
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("802d920f", new Object[]{this})).booleanValue();
        }
        return false;
    }
}
