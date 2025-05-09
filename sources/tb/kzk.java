package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class kzk implements gic {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final r2g f23026a;

    static {
        t2o.a(1004536530);
        t2o.a(1002438660);
    }

    public kzk(r2g r2gVar, String str, String str2) {
        ckf.g(r2gVar, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        this.f23026a = r2gVar;
    }

    public final r2g a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r2g) ipChange.ipc$dispatch("a3eec5b5", new Object[]{this});
        }
        return this.f23026a;
    }

    public /* synthetic */ kzk(r2g r2gVar, String str, String str2, int i, a07 a07Var) {
        this(r2gVar, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
