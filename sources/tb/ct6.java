package tb;

import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class ct6 {

    /* renamed from: a  reason: collision with root package name */
    public final String f17298a;
    public final String b;
    public final Map<String, String> c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f17299a;
        public String b;
        public final StringBuilder c = new StringBuilder();
        public final HashMap<String, String> d = new HashMap<>();

        static {
            t2o.a(774897841);
        }

        public a(String str) {
            this.b = str;
            this.f17299a = str;
        }

        public a a(long j, long j2, long j3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("751a7f09", new Object[]{this, new Long(j), new Long(j2), new Long(j3)});
            }
            if (this.c.length() > 0) {
                this.c.append('.');
            }
            StringBuilder sb = this.c;
            sb.append(j2);
            sb.append('_');
            sb.append(j3);
            return this;
        }

        public a b(VariationSet variationSet) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("fd0ab422", new Object[]{this, variationSet});
            }
            return a(variationSet.getExperimentId(), variationSet.getExperimentReleaseId(), variationSet.getExperimentBucketId());
        }

        public ct6 c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ct6) ipChange.ipc$dispatch("1e6e9b56", new Object[]{this});
            }
            return new ct6(this);
        }

        public a d(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a4dc4053", new Object[]{this, str, str2});
            }
            this.d.put(str, str2);
            return this;
        }
    }

    static {
        t2o.a(774897840);
    }

    public ct6(a aVar) {
        String str = aVar.f17299a;
        this.f17298a = aVar.b;
        this.b = aVar.c.toString();
        this.c = (Map) aVar.d.clone();
    }
}
