package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class hcv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f20547a;
    public final List<mbv> b;
    public final List<fcv> c;
    public final List<bcv> d;
    public final List<dcv> e;
    public final List<hbv> f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f20548a;
        public List<mbv> b;
        public List<fcv> c;
        public List<bcv> d;
        public List<dcv> e;
        public List<hbv> f;

        static {
            t2o.a(157286879);
        }

        public hcv a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (hcv) ipChange.ipc$dispatch("c524746e", new Object[]{this});
            }
            return new hcv(this.f20548a, this.b, this.c, this.d, this.e, this.f);
        }

        public b b(List<hbv> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("5a8a5e75", new Object[]{this, list});
            }
            this.f = list;
            return this;
        }

        public b c(List<mbv> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("995966d3", new Object[]{this, list});
            }
            this.b = list;
            return this;
        }

        public b d(List<bcv> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("6c39624a", new Object[]{this, list});
            }
            this.d = list;
            return this;
        }

        public b e(List<dcv> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("59ac55dd", new Object[]{this, list});
            }
            this.e = list;
            return this;
        }

        public b f(List<fcv> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("f10ade1c", new Object[]{this, list});
            }
            this.c = list;
            return this;
        }

        public b g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("b7314f86", new Object[]{this, str});
            }
            this.f20548a = str;
            return this;
        }
    }

    static {
        t2o.a(157286877);
    }

    public hcv(String str, List<mbv> list, List<fcv> list2, List<bcv> list3, List<dcv> list4, List<hbv> list5) {
        this.f20547a = str;
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.e = list4;
        this.f = list5;
    }
}
