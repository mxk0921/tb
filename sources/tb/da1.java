package tb;

import android.app.ActivityManager;
import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class da1 extends k04<ca1> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f17673a;
    public final int b;

    public da1(Context context, int i) {
        this.f17673a = context;
        this.b = i;
    }

    public static /* synthetic */ Object ipc$super(da1 da1Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/metrickit/collector/time/ApplicationExitCollector");
    }

    @Override // tb.k04
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51db1d5f", new Object[]{this});
        }
    }

    /* renamed from: e */
    public ca1 a(int i, Map<String, ?> map) {
        List historicalProcessExitReasons;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ca1) ipChange.ipc$dispatch("28264300", new Object[]{this, new Integer(i), map});
        }
        ActivityManager activityManager = (ActivityManager) this.f17673a.getSystemService("activity");
        if (activityManager == null || this.b == 0) {
            return ca1.k;
        }
        try {
            historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(this.f17673a.getPackageName(), this.b, 1);
            Iterator it = historicalProcessExitReasons.iterator();
            if (it.hasNext()) {
                return new ca1(p01.a(it.next()));
            }
            return ca1.k;
        } catch (RuntimeException unused) {
            return ca1.k;
        }
    }
}
