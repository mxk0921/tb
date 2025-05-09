package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.base.IJsBridgeService;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ldm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final IJsBridgeService f23274a;
    public List<IJsBridgeService.a> b;
    public boolean c = false;

    static {
        t2o.a(491782598);
    }

    public ldm(cfc cfcVar) {
        this.f23274a = (IJsBridgeService) cfcVar.a(IJsBridgeService.class);
    }

    public final List<IJsBridgeService.a> a(e3b e3bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("181a86e", new Object[]{this, e3bVar});
        }
        ArrayList arrayList = new ArrayList(8);
        arrayList.add(new kcm(e3bVar));
        arrayList.add(new obm(e3bVar));
        return arrayList;
    }

    public void b(e3b e3bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c59019bf", new Object[]{this, e3bVar});
        } else if (this.c) {
            fve.e("PopJsBridgeResister", "registerJsNativeFeature duplicate");
        } else if (this.f23274a == null) {
            fve.e("PopJsBridgeResister", "registerJsNativeFeature jsBridgeService is null");
        } else {
            List<IJsBridgeService.a> a2 = a(e3bVar);
            this.b = a2;
            for (IJsBridgeService.a aVar : a2) {
                try {
                    this.f23274a.registerJsNativeFeature(aVar);
                } catch (Throwable th) {
                    vfm.d("registerJsNativeFeature error", th);
                }
            }
            this.c = true;
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f4efa1", new Object[]{this});
        } else if (this.f23274a == null) {
            fve.e("PopJsBridgeResister", "unRegisterJsNativeFeature jsBridgeService is null");
        } else {
            List<IJsBridgeService.a> list = this.b;
            if (list == null || list.isEmpty()) {
                fve.e("PopJsBridgeResister", "unRegisterJsNativeFeature mNativeFeatures is null");
                return;
            }
            for (IJsBridgeService.a aVar : this.b) {
                try {
                    this.f23274a.unRegisterJsNativeFeature(aVar);
                } catch (Throwable th) {
                    vfm.d("unRegisterJsNativeFeature error", th);
                }
            }
            this.b.clear();
            this.c = false;
        }
    }
}
