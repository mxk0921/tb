package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.vessel.base.VesselBaseView;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class e4w {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final e4w b = new e4w();

    /* renamed from: a  reason: collision with root package name */
    public final Map<Object, VesselBaseView> f18280a = new HashMap();

    static {
        t2o.a(967835660);
        new AtomicInteger(0);
    }

    public e4w() {
        new HashMap();
    }

    public static e4w b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e4w) ipChange.ipc$dispatch("8eb22619", new Object[0]);
        }
        return b;
    }

    public void a(Object obj, VesselBaseView vesselBaseView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62c6c400", new Object[]{this, obj, vesselBaseView});
        } else {
            ((HashMap) this.f18280a).put(obj, vesselBaseView);
        }
    }

    public void c(Object obj, Map<String, Object> map, cbo cboVar) {
        i4w i4wVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93ef3bf3", new Object[]{this, obj, map, cboVar});
            return;
        }
        VesselBaseView vesselBaseView = (VesselBaseView) ((HashMap) this.f18280a).get(obj);
        if (vesselBaseView != null && (i4wVar = vesselBaseView.mVesselViewCallback) != null) {
            i4wVar.u2(map, cboVar);
        }
    }

    public void d(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec2dfe27", new Object[]{this, obj});
        } else if (((HashMap) this.f18280a).get(obj) != null) {
            ((HashMap) this.f18280a).remove(obj);
        }
    }
}
