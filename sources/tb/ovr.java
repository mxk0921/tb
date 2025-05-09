package tb;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.IMTOPDataObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ovr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(668991611);
    }

    public static void a(IMTOPDataObject iMTOPDataObject, Class<? extends IMTOPDataObject> cls, MtopListener mtopListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9063f44", new Object[]{iMTOPDataObject, cls, mtopListener});
            return;
        }
        kyr kyrVar = new kyr(3000);
        kyrVar.a(mtopListener);
        kyrVar.b(null, 0, iMTOPDataObject, cls);
    }
}
