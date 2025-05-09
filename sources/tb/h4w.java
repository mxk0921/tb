package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class h4w {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public i4w f20412a;

    static {
        t2o.a(967835668);
    }

    public boolean a(Map<String, Object> map, hjj hjjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61fe2fd3", new Object[]{this, map, hjjVar})).booleanValue();
        }
        i4w i4wVar = this.f20412a;
        if (i4wVar != null) {
            i4wVar.u2(map, new cbo(hjjVar));
        }
        return true;
    }
}
