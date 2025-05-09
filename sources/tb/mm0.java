package tb;

import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.List;
import tb.ck;
import tb.vm0;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "alibuy.impl.aspect.lifecycle.dxDownload.monitor")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class mm0 extends ss {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f24130a;

        public a(List list) {
            this.f24130a = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                mm0.J0(mm0.this, this.f24130a);
            } catch (Throwable th) {
                ck.g().e("DownloadMonitor", th.getMessage());
            }
        }
    }

    static {
        t2o.a(301989985);
    }

    public static /* synthetic */ void J0(mm0 mm0Var, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2430a85", new Object[]{mm0Var, list});
        } else {
            mm0Var.K0(list);
        }
    }

    public static /* synthetic */ Object ipc$super(mm0 mm0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/buy/extension/monitor/AliBuyDownloadMonitorExtension");
    }

    public final void K0(List<DXTemplateItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b18ba2a", new Object[]{this, list});
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (DXTemplateItem dXTemplateItem : list) {
            String str = dXTemplateItem.f7343a + "#" + dXTemplateItem.b;
            sb.append(str);
            sb.append(",");
            vm0.d(vm0.a.a("downloadTemplate").tag(str).sampling(0.1f));
        }
        ck.g().e("刷新模版：" + ((Object) sb), ck.b.b().i("AURA/performance").a());
    }

    @Override // tb.ss
    public void L(List<DXTemplateItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("738948f9", new Object[]{this, list});
        } else {
            dn.h(new a(list));
        }
    }

    @Override // tb.ss
    public void m0(List<DXTemplateItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43684df6", new Object[]{this, list});
        }
    }
}
