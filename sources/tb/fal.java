package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class fal {

    /* renamed from: a  reason: collision with root package name */
    public final a f19142a = new a(this);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f19143a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public long g;
        public long h;
        public long i;
        public long j;

        static {
            t2o.a(613417123);
        }

        public a(fal falVar) {
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "PerformanceStat{bootType='" + this.f19143a + "', downgradeType='" + this.b + "', monitorType='" + this.c + "', requestCount='" + this.d + "', persistCount='" + this.e + "', restoreCount='" + this.f + "', persistTime='" + this.g + "', restoreTime='" + this.h + "', ioTime='" + this.i + "', initCostTime='" + this.j + "'}";
        }
    }

    static {
        t2o.a(613417122);
    }
}
