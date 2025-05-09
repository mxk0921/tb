package tb;

import android.app.Application;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders$UTCustomHitBuilder;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class yr2 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CLEAN_ERROR_MULTI = -2;
    public static final String MODULE = "CacheCleaner";
    public static volatile yr2 c = null;

    /* renamed from: a  reason: collision with root package name */
    public Context f32297a;
    public final AtomicBoolean b = new AtomicBoolean(false);

    static {
        t2o.a(737148947);
    }

    public static yr2 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yr2) ipChange.ipc$dispatch("68efc4f7", new Object[0]);
        }
        if (c == null) {
            synchronized (yr2.class) {
                try {
                    if (c == null) {
                        c = new yr2();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8aded330", new Object[]{this})).longValue();
        }
        Context context = this.f32297a;
        if (context == null) {
            return 0L;
        }
        long f = sz9.f(context);
        d("new", f >> 10);
        return f;
    }

    public void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("700b439d", new Object[]{this, context});
            return;
        }
        if (context instanceof Application) {
            this.f32297a = context;
        } else {
            this.f32297a = context.getApplicationContext();
        }
        if (!this.b.get()) {
            this.b.set(true);
        }
    }

    public final void d(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("822f6744", new Object[]{this, str, new Long(j)});
            return;
        }
        UTHitBuilders$UTCustomHitBuilder uTHitBuilders$UTCustomHitBuilder = new UTHitBuilders$UTCustomHitBuilder("user_cache_clean_" + str);
        uTHitBuilders$UTCustomHitBuilder.setEventPage("cache_manager");
        uTHitBuilders$UTCustomHitBuilder.setProperty("size", j + "");
        UTAnalytics.getInstance().getDefaultTracker().send(uTHitBuilders$UTCustomHitBuilder.build());
    }
}
