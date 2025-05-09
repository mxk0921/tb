package tb;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.RenderTrackUtils;
import com.taobao.metrickit.event.lifecycle.LifecycleEventSource;
import com.taobao.tao.log.TLog;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class pqu<CollectResult> extends k04<CollectResult> {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f26245a = true;
    public boolean b = false;
    public boolean c = false;
    public long d = 0;
    public long e = 0;
    public String f = "unknown";
    public String g = null;
    public Uri h = null;
    public boolean i = false;
    public long j = SystemClock.uptimeMillis();

    public static /* synthetic */ Object ipc$super(pqu pquVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/metrickit/collector/opt/TypedOperationCollector");
    }

    @Override // tb.k04
    public CollectResult a(int i, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CollectResult) ipChange.ipc$dispatch("3c7192ea", new Object[]{this, new Integer(i), map});
        }
        if (this.e > 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            this.d += uptimeMillis - this.e;
            this.e = uptimeMillis;
        }
        long j = this.d;
        this.d = 0L;
        String i2 = i(i, map);
        this.c = false;
        if (this.i) {
            this.i = false;
            this.b = false;
        }
        this.j = 0L;
        return e(new oqu(i2, k(f()), j), i, map);
    }

    @Override // tb.k04
    public int[] b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("b4c7c910", new Object[]{this});
        }
        return new int[]{11, 12, 1, 0, 4};
    }

    public abstract CollectResult e(oqu oquVar, int i, Map<String, ?> map);

    public final String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c73d80f", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.f)) {
            return "unknown";
        }
        Uri uri = this.h;
        if (uri == null || uri.isOpaque()) {
            return h();
        }
        if ("TabFrameActivity".equals(this.f) || "BrowserActivity".equals(this.f) || "BrowserUpperActivity".equals(this.f)) {
            return h() + ":" + this.h.getHost() + this.h.getPath();
        }
        String queryParameter = this.h.getQueryParameter("_ariver_appid");
        if (!TextUtils.isEmpty(queryParameter)) {
            return h() + ":_ariver_appid->" + queryParameter;
        }
        String queryParameter2 = this.h.getQueryParameter("shopId");
        if (TextUtils.isEmpty(queryParameter2)) {
            return h();
        }
        return h() + ":shopId->" + queryParameter2;
    }

    public final Uri g(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("b068c8c1", new Object[]{this, activity});
        }
        try {
            Intent intent = activity.getIntent();
            if (intent != null) {
                return intent.getData();
            }
            return null;
        } catch (Exception e) {
            TLog.loge("MetricKit.TypedOperationCollector", "getActivityNavUrl error: ", e);
            return null;
        }
    }

    public final String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4c0a3ce3", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.g)) {
            return this.f;
        }
        return this.f + "_" + this.g;
    }

    public final String k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c7c33712", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return "unknown";
        }
        return str.replace("^", "%5E").replace("=", "%equal");
    }

    public final String i(int i, Map<String, ?> map) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("812f1967", new Object[]{this, new Integer(i), map});
        }
        long f = rrl.f(map.get("time"), SystemClock.uptimeMillis());
        if (this.f26245a) {
            str = "background";
        } else {
            str = "foreground";
        }
        if (this.b) {
            str2 = "Slide";
        } else {
            str2 = "Stand";
        }
        if (this.c) {
            if (i == 4 && f == this.j) {
                return str.concat(str2);
            }
            return RenderTrackUtils.pageCreate;
        } else if (i == 1 && f == this.j) {
            return "foreground".concat(str2);
        } else {
            if (i == 0 && f == this.j) {
                return "background".concat(str2);
            }
            return str.concat(str2);
        }
    }

    @Override // tb.k04
    public void d(int i, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa642358", new Object[]{this, new Integer(i), map});
        } else if (i == 0) {
            this.j = rrl.f(map.get("time"), SystemClock.uptimeMillis());
            this.f26245a = false;
        } else if (i == 1) {
            this.j = rrl.f(map.get("time"), SystemClock.uptimeMillis());
            this.f26245a = true;
        } else if (i == 4) {
            j(map);
        } else if (i == 11) {
            this.b = true;
            this.e = SystemClock.uptimeMillis();
        } else if (i == 12) {
            this.i = true;
            if (this.e > 0) {
                this.d += SystemClock.uptimeMillis() - this.e;
            }
            this.e = -1L;
        }
    }

    public final void j(Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb265b14", new Object[]{this, map});
            return;
        }
        int d = rrl.d(map.get(LifecycleEventSource.PARAM_LIFECYCLE), 0);
        if (map.containsKey("page")) {
            Object obj = map.get("page");
            if (d == 103) {
                this.j = rrl.f(map.get("time"), SystemClock.uptimeMillis());
                this.f = obj.getClass().getSimpleName();
                this.h = g((Activity) obj);
                this.c = true;
            }
            if (d == 208) {
                this.j = rrl.f(map.get("time"), SystemClock.uptimeMillis());
                this.g = obj.getClass().getSimpleName();
                this.c = true;
            }
            if (d == 209) {
                this.g = null;
            }
        }
    }
}
