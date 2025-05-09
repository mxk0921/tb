package tb;

import android.text.TextUtils;
import com.alibaba.ut.abtest.track.TrackId;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTTracker;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class buv extends n3v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(961544248);
    }

    public static /* synthetic */ Object ipc$super(buv buvVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/evo/internal/usertrack/UserTrackPageLifeCycleListener");
    }

    @Override // tb.n3v
    public String trackerListenerName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1d8246a2", new Object[]{this});
        }
        return "Yixiu";
    }

    @Override // tb.n3v
    public void updatePageName(UTTracker uTTracker, Object obj, String str) {
        TrackId i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20fa4c9a", new Object[]{this, uTTracker, obj, str});
            return;
        }
        try {
            if (n.j().a().C()) {
                ogh.e("UserTrackPageLifeCycleListener", "updatePageName. pageName=" + str + ", pageObject=" + obj);
                if (obj != null && !TextUtils.isEmpty(str) && (i = n.j().n().i(str, 2001, null, null, null, null, null)) != null) {
                    String a2 = n.j().n().a(i, 2001, UTAnalytics.getInstance().getDefaultTracker().getPageProperties(obj));
                    if (!TextUtils.isEmpty(a2)) {
                        UTAnalytics.getInstance().getDefaultTracker().updatePageUtparam(obj, a2);
                        zap.b().i = obj.getClass().getSimpleName();
                        zap.b().j = a2;
                        ogh.e("UserTrackPageLifeCycleListener", "track, pageName=" + bsq.g(str) + ", uttrack=" + a2);
                        ku0.b(ku0.TRACK_PAGE_COUNTER, "updatePageName");
                    }
                }
            }
        } catch (Throwable th) {
            ku0.j("UserTrackPageLifeCycleListener.updatePageName", th);
        }
    }
}
