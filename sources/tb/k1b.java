package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class k1b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, String> f22338a;

    static {
        t2o.a(729809607);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4c92053", new Object[]{this});
            return;
        }
        z6d c = h2b.a().c();
        if (c == null) {
            sfh.d("HomeMainLandInfoFlowUtProcess", "pageProvider == null");
            return;
        }
        qul.d(c.k1());
        sfh.c("HomeMainLandInfoFlowUtProcess", "clearUt");
        Map<String, String> map = this.f22338a;
        if (map == null || map.isEmpty()) {
            sfh.d("HomeMainLandInfoFlowUtProcess", "lastPageProperties == null || lastPageProperties.isEmpty()");
            return;
        }
        for (Map.Entry<String, String> entry : this.f22338a.entrySet()) {
            entry.setValue(null);
        }
        r5a.t(c.k1(), this.f22338a);
        this.f22338a = null;
    }

    public void b(IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95d1279c", new Object[]{this, iHomeSubTabController});
            return;
        }
        Map<String, String> updateNextPageProperties = iHomeSubTabController.getUpdateNextPageProperties();
        if (updateNextPageProperties != null && !updateNextPageProperties.isEmpty()) {
            r5a.r(updateNextPageProperties);
        }
    }

    public void c(IHomeSubTabController iHomeSubTabController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f59d7a7a", new Object[]{this, iHomeSubTabController});
            return;
        }
        z6d c = h2b.a().c();
        if (c == null) {
            sfh.d("HomeMainLandInfoFlowUtProcess", "pageProvider == null");
            return;
        }
        sfh.c("HomeMainLandInfoFlowUtProcess", "utWrite");
        qul.c(c.k1());
        String updatePageName = iHomeSubTabController.getUpdatePageName();
        if (!TextUtils.isEmpty(updatePageName)) {
            sfh.c("HomeMainLandInfoFlowUtProcess", "utWrite pageName : " + updatePageName);
            qul.n(c.k1(), updatePageName);
        } else {
            sfh.c("HomeMainLandInfoFlowUtProcess", "utWrite default pageName : " + updatePageName);
            qul.m(c.k1());
        }
        String c2 = b3b.c();
        String updatePageUtParam = iHomeSubTabController.getUpdatePageUtParam();
        if (updatePageUtParam != null) {
            r5a.u(c.k1(), updatePageUtParam);
        } else {
            r5a.u(c.k1(), t2b.b().a(c2).b());
        }
        Map<String, String> updatePageProperties = iHomeSubTabController.getUpdatePageProperties();
        this.f22338a = updatePageProperties;
        if (updatePageProperties != null) {
            this.f22338a = new HashMap(this.f22338a);
            r5a.t(c.k1(), this.f22338a);
            return;
        }
        r5a.t(c.k1(), t2b.b().a(c2).a());
    }
}
