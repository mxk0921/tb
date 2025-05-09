package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class tz implements wbe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f29039a = 0;
    public int b = 0;
    public long c;
    public long d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f29040a;

        public a(View view) {
            this.f29040a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                tz tzVar = tz.this;
                tz.d(tzVar, tzVar.f(this.f29040a));
                if (tz.c(tz.this) == 100) {
                    tz.e(tz.this, out.a());
                }
            } catch (Exception e) {
                khh.b(e);
                tz.d(tz.this, 0);
            }
        }
    }

    public static /* synthetic */ int c(tz tzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae0a94b8", new Object[]{tzVar})).intValue();
        }
        return tzVar.f29039a;
    }

    public static /* synthetic */ int d(tz tzVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe3cc353", new Object[]{tzVar, new Integer(i)})).intValue();
        }
        tzVar.f29039a = i;
        return i;
    }

    public static /* synthetic */ long e(tz tzVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fdc66116", new Object[]{tzVar, new Long(j)})).longValue();
        }
        tzVar.d = j;
        return j;
    }

    @Override // tb.wbe
    public int a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a53c60b8", new Object[]{this, view})).intValue();
        }
        if (view.hashCode() != this.b) {
            this.b = view.hashCode();
            this.f29039a = 0;
            this.c = out.a();
            this.d = 0L;
            return this.f29039a;
        }
        if (this.f29039a != 100) {
            w9a.g().i().post(new a(view));
        }
        long a2 = out.a();
        long j = this.d;
        if (j != 0) {
            long j2 = this.d;
            if (((float) (a2 - j2)) > ((((float) (10 - Math.min(10L, j - this.c))) * 1.5f) / 10.0f) * ((float) (j2 - this.c))) {
                return this.f29039a;
            }
        }
        return this.f29039a - 1;
    }

    public abstract int f(View view);
}
