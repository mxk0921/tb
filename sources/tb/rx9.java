package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class rx9 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TASK_TYPE_DEFAULT = 1000;
    public static final int TASK_TYPE_HIGH_EXPEND = 3003;
    public static final int TASK_TYPE_LOW_EXPEND = 3001;
    public static final int TASK_TYPE_MID_EXPEND = 3002;
    public static float i = 1.0f;
    public static float j = 2.0f;
    public static float k = 4.0f;

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f27663a;
    public final long b;
    public final long c;
    public long d;
    public long e;
    public final int f;
    public final String g;
    public HashMap<String, String> h;

    static {
        t2o.a(468714609);
    }

    public rx9(Runnable runnable, int i2, long j2, String str) {
        this.f27663a = runnable;
        this.f = i2;
        long nanoTime = System.nanoTime();
        this.c = nanoTime;
        this.b = nanoTime + TimeUnit.MILLISECONDS.toNanos(j2);
        this.g = str;
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e46cf0a", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (this.h == null) {
                this.h = new HashMap<>();
            }
            this.h.put(str, str2);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9425d337", new Object[]{this});
            return;
        }
        long nanoTime = System.nanoTime();
        Runnable runnable = this.f27663a;
        if (runnable != null) {
            runnable.run();
        }
        this.e = System.nanoTime() - this.c;
        this.d = System.nanoTime() - nanoTime;
    }

    public rx9(Runnable runnable, String str) {
        this(runnable, 1000, 500L, str);
    }
}
