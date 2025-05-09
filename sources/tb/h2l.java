package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class h2l extends b2l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1004536672);
    }

    public h2l() {
        super(null, 1, null);
    }

    public static /* synthetic */ Object ipc$super(h2l h2lVar, String str, Object... objArr) {
        if (str.hashCode() == -1012032831) {
            return super.i((r2g) objArr[0]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/nexus/arch/openArch/state/single/OpenArchStateSingleComponentSwiperAnimationEnd");
    }

    @Override // tb.b2l, tb.mic
    public e2g<kzk> i(r2g r2gVar) {
        oyk oykVar;
        gyk gykVar;
        iyk g;
        String obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e2g) ipChange.ipc$dispatch("c3ad9ac1", new Object[]{this, r2gVar});
        }
        ckf.g(r2gVar, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        String a2 = a();
        Integer num = null;
        if (a2 != null) {
            oykVar = a2l.INSTANCE.g(a2);
        } else {
            oykVar = null;
        }
        Object obj2 = r2gVar.b().get("index");
        if (!(obj2 == null || (obj = obj2.toString()) == null)) {
            ssq.m(obj);
        }
        if (oykVar != null) {
            h2g g2 = oykVar.g();
            if (g2 != null) {
                i2g l = g2.l();
                if (!(l instanceof gyk)) {
                    l = null;
                }
                gykVar = (gyk) l;
            } else {
                gykVar = null;
            }
            if (!(gykVar == null || (g = gykVar.g()) == null)) {
                num = Integer.valueOf(g.a());
            }
        }
        a2l.INSTANCE.o(this, a() + '(' + num + ")组件滑动停止：【Single】 Component Swiper Animation End");
        return super.i(r2gVar);
    }
}
