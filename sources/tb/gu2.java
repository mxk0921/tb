package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.i0m;
import tb.uu2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class gu2 implements skb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements uu2.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f20234a;
        public final /* synthetic */ long b;
        public final /* synthetic */ long c;
        public final /* synthetic */ Context d;
        public final /* synthetic */ String e;
        public final /* synthetic */ long f;
        public final /* synthetic */ i0m.b g;

        public a(gu2 gu2Var, String str, long j, long j2, Context context, String str2, long j3, i0m.b bVar) {
            this.f20234a = str;
            this.b = j;
            this.c = j2;
            this.d = context;
            this.e = str2;
            this.f = j3;
            this.g = bVar;
        }

        @Override // tb.uu2.a
        public void onError() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("11bc4f70", new Object[]{this});
                return;
            }
            i0m.b bVar = this.g;
            if (bVar != null) {
                bVar.onDenied();
            }
        }

        @Override // tb.uu2.a
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                return;
            }
            x5t.f("CalendarAdapter", "addCalendarEvent | title=" + this.f20234a + " start=" + this.b + " end=" + this.c);
            if (!uu2.b(this.d, this.f20234a, this.b, this.c)) {
                boolean a2 = uu2.a(this.d, this.f20234a, this.e, this.b, this.c, this.f);
                x5t.f("CalendarAdapter", "addCalendarEvent | addResult=" + a2);
            } else {
                x5t.d("CalendarAdapter", "addCalendarEvent | already have.");
            }
            i0m.b bVar = this.g;
            if (bVar != null) {
                bVar.onGranted();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements uu2.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f20235a;
        public final /* synthetic */ String b;
        public final /* synthetic */ long c;
        public final /* synthetic */ long d;
        public final /* synthetic */ i0m.b e;

        public b(gu2 gu2Var, Context context, String str, long j, long j2, i0m.b bVar) {
            this.f20235a = context;
            this.b = str;
            this.c = j;
            this.d = j2;
            this.e = bVar;
        }

        @Override // tb.uu2.a
        public void onError() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("11bc4f70", new Object[]{this});
                return;
            }
            i0m.b bVar = this.e;
            if (bVar != null) {
                bVar.onDenied();
            }
        }

        @Override // tb.uu2.a
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                return;
            }
            uu2.c(this.f20235a, this.b, this.c, this.d);
            i0m.b bVar = this.e;
            if (bVar != null) {
                bVar.onGranted();
            }
        }
    }

    static {
        t2o.a(779092278);
        t2o.a(806354958);
    }

    @Override // tb.skb
    public void a(Context context, String str, long j, long j2, i0m.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("658ff865", new Object[]{this, context, str, new Long(j), new Long(j2), bVar});
        } else {
            uu2.d(context, new b(this, context, str, j, j2, bVar));
        }
    }

    @Override // tb.skb
    public void b(Context context, String str, String str2, long j, long j2, long j3, i0m.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0f3e375", new Object[]{this, context, str, str2, new Long(j), new Long(j2), new Long(j3), bVar});
        } else {
            uu2.d(context, new a(this, str, j, j2, context, str2, j3, bVar));
        }
    }
}
