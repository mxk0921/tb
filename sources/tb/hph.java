package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.task.MRTRuntimeException;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class hph implements pqh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f20802a = false;

    static {
        t2o.a(1034944683);
        t2o.a(577765425);
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7233be4", new Object[]{this})).booleanValue();
        }
        return this.f20802a;
    }

    @Override // tb.pqh
    public MRTRuntimeException a(String str, Object obj) {
        boolean z;
        boolean z2 = true;
        z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MRTRuntimeException) ipChange.ipc$dispatch("7bd2282", new Object[]{this, str, obj});
        }
        if (obj == null || !(obj instanceof List)) {
            return new MRTRuntimeException(302, "result type check failed");
        }
        List list = (List) obj;
        if (list.size() != 2) {
            return new MRTRuntimeException(302, "result size check failed");
        }
        Object obj2 = list.get(0);
        if (obj2 == null || (!((z = obj2 instanceof Boolean)) && !(obj2 instanceof Integer))) {
            return new MRTRuntimeException(302, "ret type check failed");
        }
        if (z) {
            z2 = ((Boolean) obj2).booleanValue();
        } else if (obj2 instanceof Integer) {
            if (((Integer) obj2).intValue() <= 0) {
                z2 = false;
            }
        }
        this.f20802a = z2;
        if (!z2) {
            return new MRTRuntimeException(302, "ret check failed");
        }
        return null;
    }
}
