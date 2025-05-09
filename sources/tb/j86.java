package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class j86 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final hvb f21828a = new j7b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ pu5 f21829a;
        public final /* synthetic */ String b;
        public final /* synthetic */ long c;

        public a(pu5 pu5Var, String str, long j) {
            this.f21829a = pu5Var;
            this.b = str;
            this.c = j;
        }

        public void a(DXResult<DXTemplateItem> dXResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a43be78e", new Object[]{this, dXResult});
                return;
            }
            pu5 pu5Var = this.f21829a;
            pu5Var.b = false;
            DXTemplateItem dXTemplateItem = dXResult.f7291a;
            pu5Var.f26307a = dXTemplateItem;
            if (dXTemplateItem != null && !TextUtils.isEmpty(dXTemplateItem.c)) {
                f fVar = new f(this.b);
                fVar.c = new ArrayList();
                f.a aVar = new f.a("PreDownloader", "PreDownloader_download_count", 60005);
                fVar.b = dXResult.f7291a;
                fVar.c.add(aVar);
                j86.b(fVar);
            }
            j86.b(dXResult.a());
            if (this.f21829a.f26307a != null) {
                la6.b("模板预下载失败" + this.f21829a.f26307a.toString());
                return;
            }
            la6.b("模板预下载失败 result.item ==null");
        }

        public void b(DXTemplateItem dXTemplateItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ff4a0521", new Object[]{this, dXTemplateItem});
                return;
            }
            pu5 pu5Var = this.f21829a;
            pu5Var.b = true;
            pu5Var.f26307a = dXTemplateItem;
            la6.b("模板预下载完成" + dXTemplateItem.toString());
            j86.a("PreDownloader_download_count", this.b, dXTemplateItem, System.nanoTime() - this.c);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface b {
    }

    static {
        t2o.a(444596995);
    }

    public static /* synthetic */ void a(String str, String str2, DXTemplateItem dXTemplateItem, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f19e9d0", new Object[]{str, str2, dXTemplateItem, new Long(j)});
        } else {
            e(str, str2, dXTemplateItem, j);
        }
    }

    public static /* synthetic */ void b(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e7c6548", new Object[]{fVar});
        } else {
            f(fVar);
        }
    }

    public static void c(String str, DXTemplateItem dXTemplateItem, vwb vwbVar, b bVar) {
        byte[] bArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d663c53d", new Object[]{str, dXTemplateItem, vwbVar, bVar});
            return;
        }
        DXResult<DXTemplateItem> dXResult = new DXResult<>();
        f fVar = new f(str);
        String g = g(dXTemplateItem.c);
        if (!TextUtils.isEmpty(g)) {
            hvb hvbVar = f21828a;
            if (hvbVar instanceof j7b) {
                bArr = ((j7b) hvbVar).b(g, str, dXTemplateItem);
            } else {
                bArr = ((j7b) hvbVar).a(g);
            }
        } else {
            String d = dXTemplateItem.d();
            la6.b(str + "传入的url是空 " + d);
            bArr = null;
        }
        if (bArr == null) {
            f.a aVar = new f.a("PreDownloader", "Predownload_download", TextUtils.isEmpty(g) ? f.DX_DB_OPEN_ERROR_38 : 60006);
            dXResult.f7291a = dXTemplateItem;
            fVar.b = dXTemplateItem;
            ((ArrayList) fVar.c).add(aVar);
            dXResult.e(fVar);
            ((a) bVar).a(dXResult);
            return;
        }
        if (u06.j(dXTemplateItem, bArr, dx5.d().c() + wh6.DIR + str + wh6.DIR + dXTemplateItem.f7343a + wh6.DIR + dXTemplateItem.b + wh6.DIR, vwbVar, fVar)) {
            ((a) bVar).b(dXTemplateItem);
            return;
        }
        dXResult.f7291a = dXTemplateItem;
        dXResult.e(fVar);
        ((a) bVar).a(dXResult);
    }

    public static void e(String str, String str2, DXTemplateItem dXTemplateItem, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8be283f", new Object[]{str, str2, dXTemplateItem, new Long(j)});
        } else {
            ic5.u(2, str2, "PreDownloader", str, dXTemplateItem, null, j, true);
        }
    }

    public static void f(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2914c129", new Object[]{fVar});
        } else {
            ic5.p(fVar);
        }
    }

    public static String g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ddfcf001", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (str.indexOf("._dxv4") < 0) {
            return str;
        }
        String str2 = str.split("._dxv4")[0];
        if (ao6.a().d()) {
            return str2 + "_js.zip";
        }
        return str2 + "_android.zip";
    }

    public static void d(String str, List<DXTemplateItem> list, vwb vwbVar, boolean z) {
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3b708a7", new Object[]{str, list, vwbVar, new Boolean(z)});
        } else if (list != null) {
            for (DXTemplateItem dXTemplateItem : list) {
                if (!uh6.h().q(str, dXTemplateItem)) {
                    if (!z2) {
                        e("Predownload_download", str, null, 0L);
                        z2 = true;
                    }
                    long nanoTime = System.nanoTime();
                    pu5 pu5Var = new pu5();
                    la6.b("开始预下载模板" + dXTemplateItem.toString());
                    dXTemplateItem.j = true;
                    c(str, dXTemplateItem, vwbVar, new a(pu5Var, str, nanoTime));
                }
            }
        }
    }
}
