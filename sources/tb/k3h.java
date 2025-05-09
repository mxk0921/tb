package tb;

import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.taolive.adapterimpl.LiveRoomInit;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class k3h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f22381a = "LiveRoomInitManager";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final k3h f22382a = new k3h();

        static {
            t2o.a(806355876);
        }

        public static /* synthetic */ k3h a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (k3h) ipChange.ipc$dispatch("f96f6a81", new Object[0]);
            }
            return f22382a;
        }
    }

    static {
        t2o.a(806355874);
    }

    public static k3h a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k3h) ipChange.ipc$dispatch("a71af106", new Object[0]);
        }
        return b.a();
    }

    public void b() {
        String str = f22381a;
        try {
            IpChange ipChange = LiveRoomInit.$ipChange;
            LiveRoomInit.class.getMethod("init", new Class[0]).invoke(null, new Object[0]);
            TLog.logi("TaoLive", str, "initialCompensationTLiveAdapter, success");
        } catch (Exception e) {
            TLog.loge("TaoLive", str, "initialCompensationTLiveAdapter, fail", e);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("340f3f45", new Object[]{this});
        } else if (!qvs.D()) {
        } else {
            if (giv.c() == null || !giv.c().b()) {
                String str = f22381a;
                TLog.logi("TaoLive", str, "initialCompensation Thread=" + Thread.currentThread().getName());
                if (d()) {
                    b();
                    e("TLiveAdapter");
                    return;
                }
                e("unExpectCompensation");
            }
        }
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83ffd3f8", new Object[]{this})).booleanValue();
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }

    public final void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bafb60c4", new Object[]{this, str});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("initialCompensationScene", str);
            HashMap hashMap2 = new HashMap();
            g2e q = qau.q("tblive");
            q.f(new String[]{"tblive"});
            for (Map.Entry<String, String> entry : q.e().entrySet()) {
                hashMap2.put(entry.getKey(), entry.getValue());
            }
            hashMap2.put("tintType", "initialCompensation");
            hashMap2.put("tintPage", yj4.STAIN_TRACK_PAGE);
            hashMap2.putAll(hashMap);
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(yj4.STAIN_TRACK_PAGE, 2101, yj4.STAIN_TRACK_ARG1, null, null, hashMap2).build());
        } catch (Exception e) {
            TLog.loge("TaoLive", f22381a, "trackInitialCompensation fail", e);
        }
    }

    public k3h() {
    }
}
