package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.TBShareContent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a22 extends ma4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(666894557);
    }

    public static /* synthetic */ Object ipc$super(a22 a22Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/sharepanel/normal/template/BaseTemplateComponent");
    }

    public void g(TBShareContent tBShareContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b9d306f", new Object[]{this, tBShareContent});
        }
    }
}
