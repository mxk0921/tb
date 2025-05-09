package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class i18 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final DinamicXEngine f21033a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements iwb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f21034a;
        public final /* synthetic */ String b;
        public final /* synthetic */ IDxItemRenderService.b c;

        public a(List list, String str, IDxItemRenderService.b bVar) {
            this.f21034a = list;
            this.b = str;
            this.c = bVar;
        }

        @Override // tb.iwb
        public void onNotificationListener(k66 k66Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f1f5baf", new Object[]{this, k66Var});
                return;
            }
            i18.a(i18.this, this.f21034a, this.b, this.c, k66Var);
            i18.b(i18.this, this.b, k66Var);
        }
    }

    static {
        t2o.a(486539339);
    }

    public i18(DinamicXEngine dinamicXEngine) {
        this.f21033a = dinamicXEngine;
    }

    public static /* synthetic */ void a(i18 i18Var, List list, String str, IDxItemRenderService.b bVar, k66 k66Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("618f0edf", new Object[]{i18Var, list, str, bVar, k66Var});
        } else {
            i18Var.f(list, str, bVar, k66Var);
        }
    }

    public static /* synthetic */ void b(i18 i18Var, String str, k66 k66Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6af71f7d", new Object[]{i18Var, str, k66Var});
        } else {
            i18Var.e(str, k66Var);
        }
    }

    public final void c(JSONObject jSONObject) {
        f94 a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83b669c8", new Object[]{this, jSONObject});
        } else if (jSONObject != null && (a2 = uit.a(e83.i(jSONObject))) != null) {
            a2.a();
            a2.j(true);
        }
    }

    public void d(List<DXTemplateItem> list, String str, IDxItemRenderService.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f075b656", new Object[]{this, list, str, bVar});
            return;
        }
        fve.e("Dx3TemplateDownloader", "downloadDX3Template module : " + str);
        if (list.isEmpty()) {
            fve.e("Dx3TemplateDownloader", "downloadDX3Template 下载模板为空，module : " + str);
            return;
        }
        this.f21033a.p(list);
        this.f21033a.a1(new a(list, str, bVar));
    }

    public final void e(String str, k66 k66Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b880e727", new Object[]{this, str, k66Var});
            return;
        }
        List<zh6> list = k66Var.c;
        if (!(list == null || list.isEmpty())) {
            fve.e("Dx3TemplateDownloader", "模板下载失败回调。 module : " + str);
            for (zh6 zh6Var : k66Var.c) {
                if (zh6Var.c == 1000) {
                    fve.e("Dx3TemplateDownloader", "渲染失败触发降级 ： " + ((JSONObject) zh6Var.b.clone()).toJSONString());
                    c(zh6Var.b);
                }
            }
        }
    }

    public final void f(List<DXTemplateItem> list, String str, IDxItemRenderService.b bVar, k66 k66Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd8c2c38", new Object[]{this, list, str, bVar, k66Var});
            return;
        }
        List<DXTemplateItem> list2 = k66Var.f22428a;
        if (list2 == null || list2.isEmpty()) {
            fve.e("Dx3TemplateDownloader", "downloadDX3Template 3.0模板下载失败， list " + JSON.toJSONString(list));
        } else if (bVar != null) {
            fve.e("Dx3TemplateDownloader", "模板下载成功回调。 module : " + str);
            bVar.onSuccess();
        }
    }
}
