package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.live.plugin.atype.flexalocal.good.ultronnew.bean.LVView;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.constans.GLRenderType;
import java.util.List;
import java.util.Map;
import tb.qll;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class feg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final qll f19238a = new qll(new a());
    public final xeg b = new xeg();
    public final zeg c = new zeg();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements qll.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a(String str, qll.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("58f31dc", new Object[]{this, str, bVar});
                return;
            }
            hha.b("LVEngine", "onConfigLoaded |  pageCode=" + str + "  configInfo=" + bVar);
            if (TextUtils.isEmpty(str) || bVar == null || TextUtils.isEmpty(bVar.f26814a)) {
                hha.b("LVEngine", "onConfigLoaded | result error.");
                return;
            }
            teg e = feg.a(feg.this).e(str, bVar.f26814a);
            feg.b(feg.this).d(e);
            feg.c(feg.this).o(str, e);
        }
    }

    static {
        t2o.a(295699212);
    }

    public static /* synthetic */ xeg a(feg fegVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xeg) ipChange.ipc$dispatch("e922b120", new Object[]{fegVar});
        }
        return fegVar.b;
    }

    public static /* synthetic */ zeg b(feg fegVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zeg) ipChange.ipc$dispatch("283de61", new Object[]{fegVar});
        }
        return fegVar.c;
    }

    public static /* synthetic */ qll c(feg fegVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qll) ipChange.ipc$dispatch("b87121ac", new Object[]{fegVar});
        }
        return fegVar.f19238a;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        hha.b("LVEngine", "destroy.");
        this.c.c();
    }

    public DinamicXEngine f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("183ff254", new Object[]{this});
        }
        return this.c.g().d();
    }

    public void g(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("212c6088", new Object[]{this, list});
        } else {
            this.f19238a.m(list);
        }
    }

    public void h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2ad0c06", new Object[]{this, context});
        } else if (context != null) {
            hha.b("LVEngine", "preloadContainers");
            StringBuilder sb = new StringBuilder();
            GLRenderType gLRenderType = GLRenderType.GOODS_LIST;
            sb.append(gLRenderType.pageCode);
            sb.append(q2s.JSON);
            String a2 = wt2.a(context, sb.toString());
            if (TextUtils.isEmpty(a2)) {
                hha.b("LVEngine", "preloadContainers | config null.");
                return;
            }
            teg e = this.b.e(gLRenderType.pageCode, a2);
            if (e != null && e.c() != null) {
                hha.b("LVEngine", "preloadContainers | preload size is " + e.c().size());
                this.c.d(e);
            }
        }
    }

    public void i(LVView lVView, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25d91209", new Object[]{this, lVView, str, jSONObject});
        } else {
            this.c.i(lVView, str, jSONObject);
        }
    }

    public void j(LVView lVView, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2e0206e", new Object[]{this, lVView, str, jSONObject});
        } else if (lVView == null || TextUtils.isEmpty(str) || jSONObject == null) {
            hha.b("LVEngine", "renderPageNode | empty, lvView=" + lVView + "  node=" + str);
        } else if (!lVView.checkParams()) {
            hha.b("LVEngine", "renderPageNode | checkParams failed, lvView=" + lVView + "  node=" + str);
        } else {
            hha.b("LVEngine", "renderPageNode | lvView=" + lVView + "  node=" + str);
            this.c.k(lVView, str, jSONObject);
        }
    }

    public LVView d(Context context, String str, Map<String, Object> map) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LVView) ipChange.ipc$dispatch("3394f6c5", new Object[]{this, context, str, map});
        }
        if (context != null && !TextUtils.isEmpty(str)) {
            teg g = this.f19238a.g(context, str, true);
            if (g == null || !g.a()) {
                hha.b("LVEngine", "createView | lvPageInfo error, pageCode=" + str);
                if (g == null) {
                    str2 = "no_config";
                } else {
                    str2 = "params_error";
                }
                ffg.d(str, "1", str2);
            } else {
                hha.b("LVEngine", "createView | pageCode=" + str);
                return this.c.b(context, g, map);
            }
        }
        return null;
    }
}
