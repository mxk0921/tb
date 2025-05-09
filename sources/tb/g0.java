package tb;

import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class g0 implements u9b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public u9b f19654a;
    public v9b b;

    static {
        t2o.a(779093391);
        t2o.a(806355882);
    }

    @Override // tb.u9b
    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2691e843", new Object[]{this, str, obj});
            return;
        }
        u9b u9bVar = this.f19654a;
        if (u9bVar != null) {
            u9bVar.a(str, obj);
        }
    }

    @Override // tb.u9b
    public String b(String str, String str2, String str3, String str4) {
        v9b v9bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8970ebe", new Object[]{this, str, str2, str3, str4});
        }
        u9b u9bVar = this.f19654a;
        if (u9bVar == null) {
            return null;
        }
        String b = u9bVar.b(str, str2, str3, str4);
        if (wd0.a() && (v9bVar = this.b) != null) {
            ((m3h) v9bVar).f(str, str2, str3, str4, b);
        }
        VariationSet activate = UTABTest.activate(str, str2, null, null);
        if (activate != null) {
            qau.v("tblive", activate.getExperimentId(), activate.getExperimentReleaseId(), activate.getExperimentBucketId());
        }
        return b;
    }

    @Override // tb.u9b
    public String c(String str, String str2, String str3, String str4) {
        v9b v9bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f7f6c6", new Object[]{this, str, str2, str3, str4});
        }
        u9b u9bVar = this.f19654a;
        if (u9bVar == null) {
            return null;
        }
        String c = u9bVar.c(str, str2, str3, str4);
        if (wd0.a() && (v9bVar = this.b) != null) {
            ((m3h) v9bVar).f(str, str2, str3, str4, c);
        }
        VariationSet activate = UTABTest.activate(str, str2, null, null);
        if (activate != null) {
            qau.v("tblive", activate.getExperimentId(), activate.getExperimentReleaseId(), activate.getExperimentBucketId());
        }
        return c;
    }

    public void d(u9b u9bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b15aa589", new Object[]{this, u9bVar});
        } else {
            this.f19654a = u9bVar;
        }
    }

    public void e(v9b v9bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcfc346d", new Object[]{this, v9bVar});
        } else {
            this.b = v9bVar;
        }
    }
}
