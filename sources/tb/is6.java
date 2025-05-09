package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.IMTOPDataObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class is6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public IMTOPDataObject f21544a;

    static {
        t2o.a(707788827);
    }

    public rt6 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rt6) ipChange.ipc$dispatch("a4be68e4", new Object[]{this});
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.base.DataRequest", "public DataTransform getDataTransform()", "20180112");
        return null;
    }

    public IMTOPDataObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMTOPDataObject) ipChange.ipc$dispatch("7d54d110", new Object[]{this});
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.base.DataRequest", "public IMTOPDataObject getMtopRequest()", "20180112");
        return this.f21544a;
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3779b33e", new Object[]{this, new Integer(i)});
        } else {
            AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.base.DataRequest", "public void setBizCode(int bizCode)", "20180112");
        }
    }

    public void d(IMTOPDataObject iMTOPDataObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f833c27c", new Object[]{this, iMTOPDataObject});
            return;
        }
        AppMonitor.Alarm.commitFail("CodeTrack-favorite", "offline", "com.taobao.favorites.favoritesdk.base.DataRequest", "public void setMtopRequest(IMTOPDataObject mtopRequest)", "20180112");
        this.f21544a = iMTOPDataObject;
    }
}
