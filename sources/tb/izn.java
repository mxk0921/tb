package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleInfoManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class izn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static int f21666a = Integer.MIN_VALUE;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements edq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ jyn f21667a;
        public final /* synthetic */ ucq b;

        public a(jyn jynVar, ucq ucqVar) {
            this.f21667a = jynVar;
            this.b = ucqVar;
        }

        /* renamed from: a */
        public void onStateUpdate(bdq bdqVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93485c61", new Object[]{this, bdqVar});
            } else if (bdqVar.h() == izn.a()) {
                Log.e("caoxi", "install Remote status: " + bdqVar.i());
                if (bdqVar.i() == 5) {
                    jyn jynVar = this.f21667a;
                    if (jynVar != null) {
                        jynVar.a();
                    }
                    ucq ucqVar = this.b;
                    if (ucqVar != null) {
                        ucqVar.e(this);
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements gvk<Integer> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: b */
        public void onSuccess(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("af0b58ec", new Object[]{this, num});
            } else {
                izn.b(num.intValue());
            }
        }
    }

    static {
        t2o.a(976224281);
    }

    public static /* synthetic */ int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bcd6076a", new Object[0])).intValue();
        }
        return f21666a;
    }

    public static /* synthetic */ int b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e1550b9d", new Object[]{new Integer(i)})).intValue();
        }
        f21666a = i;
        return i;
    }

    public static void c(jyn jynVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f4089dc", new Object[]{jynVar});
            return;
        }
        ucq h = com.taobao.appbundle.a.Companion.a().h();
        if (h != null) {
            h.g(new a(jynVar, h));
            h.c(xcq.c().l("voice_assistant").n()).c(new b());
        }
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b53c5fb", new Object[0])).booleanValue();
        }
        ucq h = com.taobao.appbundle.a.Companion.a().h();
        return (h == null || BundleInfoManager.instance().getDynamicFeatureInfo("voice_assistant") == null || !h.f().contains("voice_assistant")) ? false : true;
    }
}
