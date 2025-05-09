package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class nn4 extends pz8 implements vy8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public nn4(s9u s9uVar, String str, String str2, long j, Map<String, Object> map, List<utn> list) {
        super(s9uVar, str, str2, j, map, list, "FrameworkContainer");
    }

    public static /* synthetic */ Object ipc$super(nn4 nn4Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/analysis/v3/ContainerSpanImpl");
    }

    @Override // tb.vy8
    public void b(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6549d06", new Object[]{this, l});
        } else {
            s1("viewRender").c(l);
        }
    }

    @Override // tb.vy8
    public void d(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf29cd", new Object[]{this, l});
            return;
        }
        T0(l);
        s1("viewRender").b(l);
    }

    @Override // tb.vy8
    public void e(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("249768ff", new Object[]{this, l});
            return;
        }
        T0(l);
        s1(p6j.MTOP_STAGE_DATAPARSE).b(l);
    }
}
