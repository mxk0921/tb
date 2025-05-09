package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class loq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final g1r f23472a;

    public loq(g1r g1rVar) {
        this.f23472a = g1rVar;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e3eb83b", new Object[]{this})).booleanValue();
        }
        return this.f23472a.a(AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE, false);
    }
}
