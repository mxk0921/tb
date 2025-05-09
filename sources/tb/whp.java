package tb;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.qrcode.ShareQRCodeTask;
import com.taobao.share.ui.engine.render.b;
import com.taobao.tao.handler.worker.CapturePicWorker;
import com.taobao.tao.handler.worker.CapturePicWorkerWeex2;
import com.taobao.tao.util.AnalyticsUtil;
import com.ut.share.business.ShareTargetType;
import java.util.ArrayList;
import tb.nwo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class whp implements hpd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public b b;

    /* renamed from: a  reason: collision with root package name */
    public nsa f30701a = new a();
    public final hsa c = ((a) this.f30701a).a(this);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements nsa {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(666894414);
            t2o.a(666894438);
        }

        public hsa a(whp whpVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (hsa) ipChange.ipc$dispatch("80725bd7", new Object[]{this, whpVar});
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new r2m(whpVar));
            arrayList.add(new q97(whpVar));
            arrayList.add(new wjx(whpVar));
            arrayList.add(new vlk(whpVar));
            arrayList.add(new opt(whpVar));
            arrayList.add(new sk4(whpVar));
            return new hsa(arrayList);
        }
    }

    static {
        t2o.a(666894413);
        t2o.a(665845810);
    }

    public whp() {
        ShareBizAdapter.getInstance().getShareEngine().initHandlerMappings(this);
    }

    @Override // tb.hpd
    public void a(mjp mjpVar, Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14f5b1fe", new Object[]{this, mjpVar, context, new Integer(i)});
            return;
        }
        ma4 a2 = mjpVar.a();
        g(a2);
        d(a2);
        this.c.a(this.b, mjpVar, context, i);
    }

    public void b(String str, String str2, boolean z, ShareQRCodeTask.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeda8a5f", new Object[]{this, str, str2, new Boolean(z), aVar});
        } else {
            new xx4(this).e(str, str2, z, aVar);
        }
    }

    public void c(Context context, ma4 ma4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f1495de", new Object[]{this, context, ma4Var});
        } else {
            new wx4(this).i(context, ma4Var);
        }
    }

    public final void d(ma4 ma4Var) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42c4e87", new Object[]{this, ma4Var});
        } else if (ma4Var != null) {
            if (!(ma4Var instanceof mi3) || (jSONObject = ((mi3) ma4Var).d) == null || !TextUtils.equals("program", jSONObject.getString("triggerBy"))) {
                akp.e(ShareTargetType.getEnum(ma4Var.b()));
                AnalyticsUtil.traceChannelSelect(ma4Var);
            }
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("490b2fcc", new Object[]{this});
        } else {
            new CapturePicWorker(this).j();
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58250c13", new Object[]{this});
        } else {
            new CapturePicWorkerWeex2(this).l();
        }
    }

    public void h(String str, boolean z, nwo.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6743b75", new Object[]{this, str, new Boolean(z), eVar});
        } else {
            new nwo(this).h(str, z, eVar);
        }
    }

    public void i(Context context, ma4 ma4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aad01886", new Object[]{this, context, ma4Var});
        } else {
            j(context, ma4Var, false, null);
        }
    }

    public void j(Context context, ma4 ma4Var, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9d56d58", new Object[]{this, context, ma4Var, new Boolean(z), str});
            return;
        }
        bro broVar = new bro(this, z, str);
        if (a0m.c()) {
            broVar.l(context, ma4Var);
        } else {
            broVar.k(context, ma4Var);
        }
    }

    public void k(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6126ff94", new Object[]{this, bVar});
        } else {
            this.b = bVar;
        }
    }

    public void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfc002cf", new Object[]{this, str});
        } else {
            new ljp(this).d(str);
        }
    }

    public final void g(ma4 ma4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e52b2f", new Object[]{this, ma4Var});
        } else if (ma4Var instanceof mi3) {
            mi3 mi3Var = (mi3) ma4Var;
            if (!((mi3Var.g() != null && "2".equals(mi3Var.g().a())) || ma4Var.a() == null || ma4Var.a().a() == null || ma4Var.a().a().extraParams == null || !TextUtils.equals("true", ma4Var.a().a().openMultiTargetUrl))) {
                try {
                    String str = ma4Var.a().a().url;
                    String str2 = ma4Var.a().a()._initShareUrl;
                    if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                        Uri parse = Uri.parse(str);
                        Uri parse2 = Uri.parse(str2);
                        if (!TextUtils.equals(parse.getHost(), parse2.getHost())) {
                            return;
                        }
                        if (!TextUtils.equals(parse.getPath(), parse2.getPath())) {
                            return;
                        }
                    }
                } catch (Throwable unused) {
                }
                JSONArray parseArray = JSON.parseArray(ma4Var.a().a().extraParams.get("defineToolParams"));
                if (parseArray != null) {
                    for (int i = 0; i < parseArray.size(); i++) {
                        JSONObject jSONObject = parseArray.getJSONObject(i);
                        if (jSONObject != null && TextUtils.equals(ma4Var.b(), jSONObject.getString("type")) && !TextUtils.isEmpty(jSONObject.getString("shareUrl"))) {
                            ma4Var.a().a().url = jSONObject.getString("shareUrl");
                        }
                    }
                }
            }
        }
    }
}
