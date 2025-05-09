package com.taobao.android.live.plugin.atype.flexalocal.good.performance;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.iw0;
import tb.kkr;
import tb.o3s;
import tb.t2o;
import tb.wda;
import tb.xj7;
import tb.yga;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class GoodListShowPerformanceMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public long d;
    public long e;
    public long f;
    public long g;

    /* renamed from: a  reason: collision with root package name */
    public int f8508a = -1;
    public int b = -1;
    public ShowState c = ShowState.IDLE;
    public final HashMap<String, String> h = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public enum ShowState {
        IDLE,
        SHOW_START,
        INIT_END,
        REQUEST_END,
        RENDER_END,
        REPORT_END;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ShowState showState, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/performance/GoodListShowPerformanceMonitor$ShowState");
        }

        public static ShowState valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ShowState) ipChange.ipc$dispatch("58f822f3", new Object[]{str});
            }
            return (ShowState) Enum.valueOf(ShowState.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$android$live$plugin$atype$flexalocal$good$performance$GoodListShowPerformanceMonitor$ShowState;

        static {
            int[] iArr = new int[ShowState.values().length];
            $SwitchMap$com$taobao$android$live$plugin$atype$flexalocal$good$performance$GoodListShowPerformanceMonitor$ShowState = iArr;
            try {
                iArr[ShowState.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$android$live$plugin$atype$flexalocal$good$performance$GoodListShowPerformanceMonitor$ShowState[ShowState.SHOW_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$android$live$plugin$atype$flexalocal$good$performance$GoodListShowPerformanceMonitor$ShowState[ShowState.INIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$android$live$plugin$atype$flexalocal$good$performance$GoodListShowPerformanceMonitor$ShowState[ShowState.REQUEST_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$taobao$android$live$plugin$atype$flexalocal$good$performance$GoodListShowPerformanceMonitor$ShowState[ShowState.RENDER_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        t2o.a(295699040);
    }

    public final void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acf18182", new Object[]{this, context});
        } else if (kkr.i().o() == null) {
            o3s.b("GoodListShowPerformanceMonitor", "trackAdapter is null");
        } else if (!iw0.j(context) && i(ShowState.REPORT_END) && c()) {
            this.h.put("init_duration", String.valueOf(this.e - this.d));
            this.h.put("request_duration", String.valueOf(this.f - this.e));
            this.h.put("render_duration", String.valueOf(this.g - this.f));
            kkr.i().o().c("gl_show_perf", this.h);
            o3s.b("GoodListShowPerformanceMonitor", " endMonitor | is_pre_request=" + this.h.get("is_pre_request") + ", pre_request_delay=" + this.h.get("pre_request_delay") + ", is_first_show=" + this.h.get("is_first_show") + ", init_duration=" + (this.e - this.d) + ", request_duration=" + (this.f - this.e) + ", render_duration=" + (this.g - this.f));
            g();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
        if (r6 == com.taobao.android.live.plugin.atype.flexalocal.good.performance.GoodListShowPerformanceMonitor.ShowState.REPORT_END) goto L_0x003a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
        if (r6 == com.taobao.android.live.plugin.atype.flexalocal.good.performance.GoodListShowPerformanceMonitor.ShowState.RENDER_END) goto L_0x003a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
        if (r6 == com.taobao.android.live.plugin.atype.flexalocal.good.performance.GoodListShowPerformanceMonitor.ShowState.REQUEST_END) goto L_0x003a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
        if (r6 == com.taobao.android.live.plugin.atype.flexalocal.good.performance.GoodListShowPerformanceMonitor.ShowState.INIT_END) goto L_0x003a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004d, code lost:
        if (r6 == com.taobao.android.live.plugin.atype.flexalocal.good.performance.GoodListShowPerformanceMonitor.ShowState.SHOW_START) goto L_0x003a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(com.taobao.android.live.plugin.atype.flexalocal.good.performance.GoodListShowPerformanceMonitor.ShowState r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.live.plugin.atype.flexalocal.good.performance.GoodListShowPerformanceMonitor.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001c
            java.lang.String r4 = "66b9e655"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r5
            r2[r0] = r6
            java.lang.Object r6 = r3.ipc$dispatch(r4, r2)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L_0x001c:
            int[] r3 = com.taobao.android.live.plugin.atype.flexalocal.good.performance.GoodListShowPerformanceMonitor.a.$SwitchMap$com$taobao$android$live$plugin$atype$flexalocal$good$performance$GoodListShowPerformanceMonitor$ShowState
            com.taobao.android.live.plugin.atype.flexalocal.good.performance.GoodListShowPerformanceMonitor$ShowState r4 = r5.c
            int r4 = r4.ordinal()
            r3 = r3[r4]
            if (r3 == r0) goto L_0x004b
            if (r3 == r2) goto L_0x0046
            r2 = 3
            if (r3 == r2) goto L_0x0041
            r2 = 4
            if (r3 == r2) goto L_0x003c
            r2 = 5
            if (r3 == r2) goto L_0x0034
            goto L_0x0050
        L_0x0034:
            com.taobao.android.live.plugin.atype.flexalocal.good.performance.GoodListShowPerformanceMonitor$ShowState r2 = com.taobao.android.live.plugin.atype.flexalocal.good.performance.GoodListShowPerformanceMonitor.ShowState.REPORT_END
            if (r6 != r2) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            r0 = 0
        L_0x003a:
            r1 = r0
            goto L_0x0050
        L_0x003c:
            com.taobao.android.live.plugin.atype.flexalocal.good.performance.GoodListShowPerformanceMonitor$ShowState r2 = com.taobao.android.live.plugin.atype.flexalocal.good.performance.GoodListShowPerformanceMonitor.ShowState.RENDER_END
            if (r6 != r2) goto L_0x0039
            goto L_0x003a
        L_0x0041:
            com.taobao.android.live.plugin.atype.flexalocal.good.performance.GoodListShowPerformanceMonitor$ShowState r2 = com.taobao.android.live.plugin.atype.flexalocal.good.performance.GoodListShowPerformanceMonitor.ShowState.REQUEST_END
            if (r6 != r2) goto L_0x0039
            goto L_0x003a
        L_0x0046:
            com.taobao.android.live.plugin.atype.flexalocal.good.performance.GoodListShowPerformanceMonitor$ShowState r2 = com.taobao.android.live.plugin.atype.flexalocal.good.performance.GoodListShowPerformanceMonitor.ShowState.INIT_END
            if (r6 != r2) goto L_0x0039
            goto L_0x003a
        L_0x004b:
            com.taobao.android.live.plugin.atype.flexalocal.good.performance.GoodListShowPerformanceMonitor$ShowState r2 = com.taobao.android.live.plugin.atype.flexalocal.good.performance.GoodListShowPerformanceMonitor.ShowState.SHOW_START
            if (r6 != r2) goto L_0x0039
            goto L_0x003a
        L_0x0050:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.live.plugin.atype.flexalocal.good.performance.GoodListShowPerformanceMonitor.b(com.taobao.android.live.plugin.atype.flexalocal.good.performance.GoodListShowPerformanceMonitor$ShowState):boolean");
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("682718db", new Object[]{this})).booleanValue();
        }
        long j = this.d;
        if (j <= 0) {
            o3s.b("GoodListShowPerformanceMonitor", " start exception | show_start_ts=" + this.d);
            return false;
        }
        long j2 = this.e;
        if (j2 <= j || j2 - j > 500) {
            o3s.b("GoodListShowPerformanceMonitor", " init exception | show_start_ts=" + this.d + ", init_end_ts=" + this.e);
            return false;
        }
        long j3 = this.f;
        if (j3 <= j2 || j3 - j2 > 1000) {
            o3s.b("GoodListShowPerformanceMonitor", " request exception | init_end_ts=" + this.e + ", request_end_ts=" + this.f);
            return false;
        }
        long j4 = this.g;
        if (j4 <= j3 || j4 - j3 > 500) {
            o3s.b("GoodListShowPerformanceMonitor", " render exception | request_end_ts=" + this.f + ", render_end_ts=" + this.g);
            return false;
        } else if (j4 <= System.currentTimeMillis()) {
            return true;
        } else {
            o3s.b("GoodListShowPerformanceMonitor", " end exception | render_end_ts=" + this.g);
            return false;
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5e1153", new Object[]{this});
        } else if (yga.k() && i(ShowState.INIT_END)) {
            long currentTimeMillis = System.currentTimeMillis();
            this.e = currentTimeMillis;
            this.h.put("init_end_ts", String.valueOf(currentTimeMillis));
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.b = -1;
        this.f8508a = -1;
        this.d = 0L;
        this.e = 0L;
        this.f = 0L;
        this.g = 0L;
        this.c = ShowState.IDLE;
        this.h.clear();
    }

    public void h(boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7bc2e1f", new Object[]{this, new Boolean(z), str});
        } else if (yga.k()) {
            g();
            long currentTimeMillis = System.currentTimeMillis();
            this.d = currentTimeMillis;
            this.h.put("show_start_ts", String.valueOf(currentTimeMillis));
            String str2 = "0";
            this.h.put("is_first_show", z ? "1" : str2);
            this.h.put("device_level", String.valueOf(xj7.a()));
            this.h.put("room_status", str);
            HashMap<String, String> hashMap = this.h;
            if (wda.e()) {
                str2 = "1";
            }
            hashMap.put("is_lv", str2);
            this.h.put("pre_request_delay", String.valueOf(yga.e0()));
            i(ShowState.SHOW_START);
        }
    }

    public final boolean i(ShowState showState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("803c8c77", new Object[]{this, showState})).booleanValue();
        }
        if (b(showState)) {
            o3s.d("GoodListShowPerformanceMonitor", " state transition | " + this.c + " -> " + showState);
            this.c = showState;
            return true;
        }
        o3s.d("GoodListShowPerformanceMonitor", " state transition invalid | " + this.c + " -> " + showState);
        return false;
    }

    public void e(Context context) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aaac2e9b", new Object[]{this, context});
        } else if (yga.k() && (i = this.b) >= 0 && (i2 = this.f8508a) >= 0) {
            int i3 = i2 + 1;
            this.f8508a = i3;
            if (i3 == i && i(ShowState.RENDER_END)) {
                long currentTimeMillis = System.currentTimeMillis();
                this.g = currentTimeMillis;
                this.h.put("render_end_ts", String.valueOf(currentTimeMillis));
                a(context);
            }
        }
    }

    public void f(Context context, boolean z, boolean z2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f373ecd", new Object[]{this, context, new Boolean(z), new Boolean(z2), new Integer(i)});
        } else if (yga.k() && i(ShowState.REQUEST_END)) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f = currentTimeMillis;
            this.h.put("request_end_ts", String.valueOf(currentTimeMillis));
            String str = "0";
            this.h.put("is_pre_request", z ? "1" : str);
            HashMap<String, String> hashMap = this.h;
            if (z2) {
                str = "1";
            }
            hashMap.put("is_cdn", str);
            this.b = 4;
            this.f8508a = 0;
            if (i < 4) {
                this.b = i;
            }
            if (this.b == 0 && i(ShowState.RENDER_END)) {
                long currentTimeMillis2 = System.currentTimeMillis();
                this.g = currentTimeMillis2;
                this.h.put("render_end_ts", String.valueOf(currentTimeMillis2));
                a(context);
            }
        }
    }
}
