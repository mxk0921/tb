package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.compute.DAIComputeService;
import com.tmall.android.dai.internal.usertrack.UserTrackDO;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class u6n extends d0q<UserTrackDO> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String b;

    static {
        t2o.a(1034944740);
    }

    public u6n(String str, String str2) {
        super(str);
        this.b = str2;
    }

    public static /* synthetic */ Object ipc$super(u6n u6nVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/tmall/android/dai/trigger/sink/PythonUtTaskSink");
    }

    public final Map<String, Object> b(UserTrackDO userTrackDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("da1d2568", new Object[]{this, userTrackDO});
        }
        if (userTrackDO.getEventId() == -19999) {
            return hq6.a(userTrackDO);
        }
        return hq6.c(userTrackDO);
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cdf55e25", new Object[]{this});
        }
        return this.b;
    }

    /* renamed from: d */
    public void a(UserTrackDO userTrackDO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1016f5f", new Object[]{this, userTrackDO});
        } else {
            kzo.c().e().h(this.b, b(userTrackDO), DAIComputeService.TaskPriority.NORMAL, null, this.f17490a);
        }
    }
}
