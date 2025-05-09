package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class yw4 extends pqu<ww4> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final ysg k;
    public final Handler l;
    public volatile long m;
    public final Map<String, Integer> n = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f32386a;
        public final /* synthetic */ int b;

        public a(String str, int i) {
            this.f32386a = str;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!TextUtils.isEmpty(this.f32386a)) {
                yw4.m(yw4.this).put(this.f32386a, Integer.valueOf(this.b));
            }
        }
    }

    public yw4(String str, Handler handler) {
        this.k = new ysg(str);
        this.l = handler;
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: tb.xw4
            @Override // java.lang.Runnable
            public final void run() {
                yw4.this.p();
            }
        });
    }

    public static /* synthetic */ Object ipc$super(yw4 yw4Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/metrickit/collector/cpu/CpuUsageCollector");
    }

    public static /* synthetic */ Map m(yw4 yw4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e527c80c", new Object[]{yw4Var});
        }
        return yw4Var.n;
    }

    @Override // tb.k04
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51db1d5f", new Object[]{this});
        }
    }

    public void n(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e71ea4f", new Object[]{this, str, new Integer(i)});
        } else {
            this.l.post(new a(str, i));
        }
    }

    /* renamed from: o */
    public ww4 e(oqu oquVar, int i, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ww4) ipChange.ipc$dispatch("c23a1616", new Object[]{this, oquVar, new Integer(i), map});
        }
        if (this.m <= 0) {
            return new ww4(i, map, oquVar, bx4.c(), ysg.c(), 0L, 0L, null, null, Collections.emptyMap());
        }
        long[] d = bx4.d();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : ((HashMap) this.n).entrySet()) {
            hashMap.put(entry.getKey(), this.k.f(((Integer) entry.getValue()).intValue()));
        }
        return new ww4(i, map, oquVar, bx4.c(), ysg.c(), d[0], d[1], this.k.e(), this.k.f(this.m), hashMap);
    }

    public final /* synthetic */ void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5db77a7", new Object[]{this});
        } else {
            this.m = Process.myTid();
        }
    }
}
