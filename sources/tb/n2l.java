package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class n2l extends b2l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1004536678);
    }

    public n2l() {
        super(null, 1, null);
    }

    public static /* synthetic */ Object ipc$super(n2l n2lVar, String str, Object... objArr) {
        if (str.hashCode() == -1012032831) {
            return super.i((r2g) objArr[0]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/state/watch/OpenArchStateWatchComponentDestroy");
    }

    @Override // tb.b2l, tb.mic
    public e2g<kzk> i(r2g r2gVar) {
        oyk oykVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e2g) ipChange.ipc$dispatch("c3ad9ac1", new Object[]{this, r2gVar});
        }
        ckf.g(r2gVar, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        b(r2gVar);
        String a2 = a();
        if (a2 != null) {
            oykVar = a2l.INSTANCE.g(a2);
        } else {
            oykVar = null;
        }
        if (oykVar != null) {
            a2l.INSTANCE.q(oykVar);
        }
        return super.i(r2gVar);
    }

    @Override // tb.b2l, tb.mic
    public void r(r2g r2gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de7bcfe5", new Object[]{this, r2gVar});
        } else {
            ckf.g(r2gVar, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        }
    }
}
