package tb;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class m3j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Set<String> f23754a = new LinkedHashSet();
    public g1a<? super List<String>, xhv> b;
    public int c;
    public final s d;
    public final n3j e;
    public final j9m f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements iwb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.iwb
        public final void onNotificationListener(k66 k66Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f1f5baf", new Object[]{this, k66Var});
            } else if (k66Var.f22428a.size() > 0) {
                ArrayList arrayList = new ArrayList();
                List<DXTemplateItem> list = k66Var.f22428a;
                if (list != null) {
                    for (DXTemplateItem dXTemplateItem : list) {
                        DXTemplateItem i = m3j.b(m3j.this).i(dXTemplateItem);
                        if (i != null) {
                            String str = i.f7343a;
                            ckf.c(str, "availableTemplateItem.name");
                            arrayList.add(str);
                            m3j.c(m3j.this).a(i);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    m3j.d(m3j.this).q(arrayList);
                    g1a<List<String>, xhv> g = m3j.this.g();
                    if (g != null) {
                        g.invoke(arrayList);
                    }
                }
                m3j.a(m3j.this, k66Var);
                uv6.j("下载成功触发notify， update=" + k66Var.c.size() + " finish=" + k66Var.f22428a.size());
            }
        }
    }

    static {
        t2o.a(745537907);
    }

    public m3j(s sVar, n3j n3jVar, j9m j9mVar) {
        ckf.h(sVar, "dxEngineRouter");
        ckf.h(n3jVar, "mtbDxTemplateManager");
        ckf.h(j9mVar, "plugins");
        this.d = sVar;
        this.e = n3jVar;
        this.f = j9mVar;
        sVar.t(new a());
    }

    public static final /* synthetic */ void a(m3j m3jVar, k66 k66Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9023e08", new Object[]{m3jVar, k66Var});
        } else {
            m3jVar.f(k66Var);
        }
    }

    public static final /* synthetic */ s b(m3j m3jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s) ipChange.ipc$dispatch("932e6e7c", new Object[]{m3jVar});
        }
        return m3jVar.d;
    }

    public static final /* synthetic */ n3j c(m3j m3jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n3j) ipChange.ipc$dispatch("69cd2c49", new Object[]{m3jVar});
        }
        return m3jVar.e;
    }

    public static final /* synthetic */ j9m d(m3j m3jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j9m) ipChange.ipc$dispatch("1489cd98", new Object[]{m3jVar});
        }
        return m3jVar.f;
    }

    public final void e(List<? extends DXTemplateItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ba12767", new Object[]{this, list});
            return;
        }
        ckf.h(list, "list");
        if (!list.isEmpty()) {
            uv6.d("considerDownloadDxTemplate");
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = new JSONArray();
            for (DXTemplateItem dXTemplateItem : list) {
                if (!this.f23754a.contains(dXTemplateItem.d())) {
                    DXTemplateItem i = this.d.i(dXTemplateItem);
                    if (i != null) {
                        this.e.a(i);
                    }
                    if (i == null || i.b != dXTemplateItem.b) {
                        arrayList.add(dXTemplateItem);
                        jSONArray.add(dXTemplateItem.f7343a);
                    }
                }
            }
            uv6.g("considerDownloadDxTemplate");
            if (!arrayList.isEmpty()) {
                this.f.g(jSONArray);
                this.d.h(arrayList);
            }
        }
    }

    public final void f(k66 k66Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f54dfe36", new Object[]{this, k66Var});
            return;
        }
        List<DXTemplateItem> list = k66Var.b;
        if (list != null) {
            if (list.isEmpty()) {
                list = null;
            }
            if (list != null) {
                int i = this.c + 1;
                this.c = i;
                if (i < 2) {
                    List<DXTemplateItem> list2 = list;
                    for (DXTemplateItem dXTemplateItem : new ArrayList(list2)) {
                        Set<String> set = this.f23754a;
                        ckf.c(dXTemplateItem, AdvanceSetting.NETWORK_TYPE);
                        set.remove(dXTemplateItem.d());
                    }
                    e(new ArrayList(list2));
                }
            }
        }
    }

    public final g1a<List<String>, xhv> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("dc9a525c", new Object[]{this});
        }
        return this.b;
    }

    public final void h(g1a<? super List<String>, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f06d53a", new Object[]{this, g1aVar});
        } else {
            this.b = g1aVar;
        }
    }
}
