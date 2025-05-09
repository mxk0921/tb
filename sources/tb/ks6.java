package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.IMTOPDataObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ks6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(707788828);
    }

    public static is6 a(IMTOPDataObject iMTOPDataObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (is6) ipChange.ipc$dispatch("ec79fa1f", new Object[]{iMTOPDataObject, new Integer(i)});
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.base.DataRequestCreater", "public static DataRequest getDataRequest(IMTOPDataObject request, int bizCode)", "20180112");
        is6 is6Var = new is6();
        is6Var.d(iMTOPDataObject);
        is6Var.c(i);
        return is6Var;
    }
}
