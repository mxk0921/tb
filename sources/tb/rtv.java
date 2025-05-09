package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.internal.dataservice.DataServiceImpl;
import com.tmall.android.dai.internal.usertrack.UserTrackDO;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class rtv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "UserTrackDOCacheService";

    /* renamed from: a  reason: collision with root package name */
    public static rtv f27608a;

    static {
        t2o.a(1034944668);
    }

    public static synchronized rtv b() {
        synchronized (rtv.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (rtv) ipChange.ipc$dispatch("5255f7fe", new Object[0]);
            }
            if (f27608a == null) {
                f27608a = new rtv();
            }
            return f27608a;
        }
    }

    public void a(UserTrackDO userTrackDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91d745f5", new Object[]{this, userTrackDO});
            return;
        }
        kzo.c().t(userTrackDO);
        c(userTrackDO);
    }

    public final void c(UserTrackDO userTrackDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("352db5b", new Object[]{this, userTrackDO});
            return;
        }
        try {
            Set<Integer> i = kzo.c().i();
            new ArrayList();
            if (!i.contains(Integer.valueOf(userTrackDO.getEventId()))) {
                if (userTrackDO.getEventId() != 2201 || kzo.c().z(userTrackDO.getArg1())) {
                    DataServiceImpl.getInstance().saveData("dai_native_walle_ut_behavior", "test", "usertrack", userTrackDO.toHashMapValues());
                }
            }
        } catch (Exception unused) {
        }
    }
}
