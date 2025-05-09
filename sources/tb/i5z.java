package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.resource_loader.download.SingleDownloadTask;
import com.taobao.android.nanocompose.resource_loader.template.TemplateItem;
import com.taobao.homepage.pop.utils.PopConst;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class i5z {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final i5z INSTANCE = new i5z();

    /* renamed from: a  reason: collision with root package name */
    public static final Set<String> f21112a = new LinkedHashSet();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TemplateItem f21113a;
        public final /* synthetic */ String b;
        public final /* synthetic */ eoz c;

        public a(TemplateItem templateItem, String str, eoz eozVar) {
            this.f21113a = templateItem;
            this.b = str;
            this.c = eozVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            this.f21113a.i(w6z.Companion.a().d(this.b, this.f21113a.c(), this.f21113a.e()));
            long nanoTime = System.nanoTime();
            m5z.INSTANCE.b(new SingleDownloadTask(this.b, nanoTime, new k5z(this.f21113a), new b(this.b, this.c, nanoTime), false, 16, null));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b implements eoz {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f21114a;
        public final /* synthetic */ eoz b;
        public final /* synthetic */ long c;

        public b(String str, eoz eozVar, long j) {
            this.f21114a = str;
            this.b = eozVar;
            this.c = j;
        }

        @Override // tb.eoz
        public final void a(TemplateItem templateItem, boolean z, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a2aad936", new Object[]{this, templateItem, new Boolean(z), str});
                return;
            }
            ckf.g(templateItem, "resultTemplateItem");
            if (z) {
                nrz.INSTANCE.a(this.f21114a, i5z.INSTANCE.b(templateItem));
            }
            i5z.a().remove(templateItem.b());
            eoz eozVar = this.b;
            if (eozVar != null) {
                eozVar.a(templateItem, z, str);
            }
            m5z.INSTANCE.c(this.c);
        }
    }

    static {
        t2o.a(598737193);
    }

    public static final /* synthetic */ Set a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("5212f37d", new Object[0]);
        }
        return f21112a;
    }

    public final TemplateItem b(TemplateItem templateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateItem) ipChange.ipc$dispatch("ba535a82", new Object[]{this, templateItem});
        }
        ckf.g(templateItem, "<this>");
        TemplateItem templateItem2 = new TemplateItem(templateItem.c(), templateItem.e(), templateItem.d());
        templateItem2.i(templateItem.a());
        templateItem2.h(templateItem.f());
        return templateItem2;
    }

    public final void c(String str, TemplateItem templateItem, eoz eozVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f69bfd1", new Object[]{this, str, templateItem, eozVar});
            return;
        }
        ckf.g(str, PopConst.BRIDGE_KEY_BUSINESS_ID);
        ckf.g(templateItem, "templateItem");
        if (iiz.c()) {
            iiz.Companion.j(ckf.p(" 开始下载模版 ", templateItem.b()));
        }
        if (templateItem.g()) {
            TemplateItem a2 = nrz.c(nrz.INSTANCE, str, templateItem, hrz.b((byte) 2), false, 8, null).a();
            if (a2 == null) {
                Set<String> set = f21112a;
                if (!set.contains(templateItem.b())) {
                    set.add(templateItem.b());
                    eji.j(vhz.INSTANCE.a(), new a(templateItem, str, eozVar), 0L, null, 6, null);
                } else if (eozVar != null) {
                    eozVar.a(templateItem, false, "template is downloading");
                }
            } else if (eozVar != null) {
                eozVar.a(a2, false, "template is existed");
            }
        } else if (eozVar != null) {
            eozVar.a(templateItem, false, "template is invalid");
        }
    }
}
