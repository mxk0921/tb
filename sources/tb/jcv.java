package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class jcv {

    /* renamed from: a  reason: collision with root package name */
    public final String f21924a;
    public final long b;
    public final String c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f21925a = "";
        public long b = m.CONFIG_REQUEST_EXPERIMENT_DATA_INTERVAL_TIME_DEFAULT;
        public String c = "none";

        static {
            t2o.a(157286882);
        }

        public jcv a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jcv) ipChange.ipc$dispatch("36d2cb1d", new Object[]{this});
            }
            return new jcv(this.f21925a, this.b, this.c);
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("df4c2640", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public a c(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c6615813", new Object[]{this, new Long(j)});
            }
            this.b = j;
            return this;
        }

        public a d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f4bcb64", new Object[]{this, str});
            }
            this.f21925a = str;
            return this;
        }
    }

    static {
        t2o.a(157286881);
    }

    public jcv(String str, long j, String str2) {
        this.f21924a = str;
        this.b = j;
        this.c = str2;
    }
}
