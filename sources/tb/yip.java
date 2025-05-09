package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.base.IJsBridgeService;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class yip {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final IJsBridgeService f32117a;
    public ArrayList<k30> b;

    static {
        t2o.a(491782665);
    }

    public yip(cfc cfcVar) {
        this.f32117a = (IJsBridgeService) cfcVar.a(IJsBridgeService.class);
    }

    public final ArrayList<k30> a(ajp ajpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("5b418eee", new Object[]{this, ajpVar});
        }
        ArrayList<k30> arrayList = new ArrayList<>(5);
        arrayList.add(new alp(ajpVar));
        arrayList.add(new wip(ajpVar));
        arrayList.add(new xip(ajpVar));
        arrayList.add(new qui(ajpVar));
        arrayList.add(new rui(ajpVar));
        return arrayList;
    }

    public void b(ajp ajpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a03fbce", new Object[]{this, ajpVar});
        } else if (this.f32117a == null) {
            fve.e("ShareDataJsNativeFeatureRegister", "registerJsNativeFeature jsBridgeService is null");
        } else {
            ArrayList<k30> a2 = a(ajpVar);
            this.b = a2;
            Iterator<k30> it = a2.iterator();
            while (it.hasNext()) {
                this.f32117a.registerJsNativeFeature(it.next());
            }
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f4efa1", new Object[]{this});
        } else if (this.f32117a == null) {
            fve.e("ShareDataJsNativeFeatureRegister", "unRegisterJsNativeFeature jsBridgeService is null");
        } else {
            ArrayList<k30> arrayList = this.b;
            if (arrayList == null || arrayList.isEmpty()) {
                fve.e("ShareDataJsNativeFeatureRegister", "unRegisterJsNativeFeature mNativeFeatures is null");
                return;
            }
            Iterator<k30> it = this.b.iterator();
            while (it.hasNext()) {
                k30 next = it.next();
                this.f32117a.unRegisterJsNativeFeature(next);
                next.c();
            }
            this.b.clear();
        }
    }
}
