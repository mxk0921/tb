package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleInfoManager;
import tb.ck;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class v48 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements edq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public void onStateUpdate(bdq bdqVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93485c61", new Object[]{this, bdqVar});
            } else if (bdqVar != null) {
                int i = bdqVar.i();
                if (i == 5) {
                    ck.g().d("下载成功");
                }
                rbb g = ck.g();
                g.e("ultron-dynamic-uikit 请求结果：" + i, ck.b.b().i("AURA/nativeRender").a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements rqk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.rqk
        public void onFailure(Exception exc) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebfde814", new Object[]{this, exc});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c implements gvk<Integer> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public void onSuccess(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("af0b58ec", new Object[]{this, num});
            }
        }
    }

    static {
        t2o.a(708837605);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4acbb8f4", new Object[0])).booleanValue();
        }
        ucq h = com.taobao.appbundle.a.Companion.a().h();
        return h == null || th.c() || BundleInfoManager.instance().getDynamicFeatures() == null || (BundleInfoManager.instance().getDynamicFeatureInfo("trade_dynamic_uikit") != null && h.f().contains("trade_dynamic_uikit"));
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa7b7088", new Object[0]);
            return;
        }
        ucq h = com.taobao.appbundle.a.Companion.a().h();
        if (h != null) {
            ck.g().e("发起 ultron-dynamic-uikit 安装请求", ck.b.b().i("AURA/nativeRender").a());
            xcq n = xcq.c().l("trade_dynamic_uikit").n();
            h.g(new a());
            h.c(n).c(new c()).b(new b());
        }
    }
}
