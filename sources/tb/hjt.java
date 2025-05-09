package tb;

import android.content.Context;
import android.text.TextUtils;
import anetwork.channel.Response;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.alibaba.android.ultron.engine.model.Template;
import com.alibaba.android.ultron.engine.template.TemplateInfo;
import com.alibaba.android.ultron.engine.utils.ErrorConstants;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alivfssdk.cache.AVFSCacheManager;
import com.taobao.android.task.Coordinator;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.nio.charset.Charset;
import java.util.HashMap;
import tb.a8v;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class hjt implements wzd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final HashMap<String, b> g = new HashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public boolean f20688a = false;
    public mfl b;
    public y0o c;
    public final com.alibaba.android.ultron.vfw.instance.a d;
    public final Context e;
    public final String f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends Coordinator.TaggedRunnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TemplateInfo f20689a;
        public final /* synthetic */ JSONObject b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, TemplateInfo templateInfo, JSONObject jSONObject) {
            super(str);
            this.f20689a = templateInfo;
            this.b = jSONObject;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/engine/template/TemplateManager$1");
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                np cacheForModule = AVFSCacheManager.getInstance().cacheForModule(hjt.this.f);
                cacheForModule.C().N(hjt.a(hjt.this, this.f20689a), this.b);
                cacheForModule.C().N(hjt.this.f + "_template_cache_info", JSON.toJSONString(this.f20689a));
            } catch (Throwable th) {
                f9v.q(xh8.a(hjt.this.f).c("saveFileCacheError").message(th.getMessage()));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public mfl f20690a;
        public JSONObject b;

        static {
            t2o.a(157286471);
        }

        public b() {
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    static {
        t2o.a(157286468);
        t2o.a(157286463);
    }

    public hjt(Context context, String str) {
        this.e = context;
        this.f = str;
    }

    public static /* synthetic */ String a(hjt hjtVar, TemplateInfo templateInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("daf27b3f", new Object[]{hjtVar, templateInfo});
        }
        return hjtVar.j(templateInfo);
    }

    public void b(IDMComponent iDMComponent, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3204f127", new Object[]{this, iDMComponent, jSONObject});
        } else {
            this.c.D(iDMComponent, jSONObject);
        }
    }

    public final String c(TemplateInfo templateInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e0ea10f5", new Object[]{this, templateInfo});
        }
        if (templateInfo == null || templateInfo.getUrl() == null) {
            String str = this.f;
            ErrorConstants errorConstants = ErrorConstants.TEMPLATE_URL_NULL;
            lbq.a(str, "TemplateManager.fetchOriginalTemplate", errorConstants.errorCode(), errorConstants.errorMessage());
            return "模板url为空";
        }
        JSONObject d = d(templateInfo);
        if (d == null) {
            String str2 = this.f;
            ErrorConstants errorConstants2 = ErrorConstants.TEMPLATE_FETCH_FAILED;
            lbq.a(str2, "TemplateManager.fetchOriginalTemplate", errorConstants2.errorCode(), errorConstants2.errorMessage());
            return "url获取模板失败";
        }
        String string = d.getString("templateId");
        String string2 = d.getString("version");
        if (!TextUtils.equals(string, templateInfo.getTemplateId()) || !TextUtils.equals(string2, templateInfo.getVersion())) {
            return "获取模板id,version不匹配";
        }
        r(templateInfo, d);
        q(templateInfo, d);
        return Boolean.TRUE.toString();
    }

    public final JSONObject d(TemplateInfo templateInfo) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cc5a9e2c", new Object[]{this, templateInfo});
        }
        DegradableNetwork degradableNetwork = new DegradableNetwork(this.e.getApplicationContext());
        RequestImpl requestImpl = new RequestImpl(templateInfo.getUrl());
        int h = h();
        requestImpl.setConnectTimeout(h);
        requestImpl.setReadTimeout(h);
        Response syncSend = degradableNetwork.syncSend(requestImpl, null);
        int statusCode = syncSend.getStatusCode();
        byte[] bytedata = syncSend.getBytedata();
        if (bytedata == null) {
            return null;
        }
        String str = new String(bytedata, Charset.defaultCharset());
        try {
            jSONObject = (JSONObject) JSON.parse(str);
        } catch (Exception e) {
            lbq.c(this.f, "TemplateManager.fetchTemplateByUrl", e);
            jSONObject = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        if (statusCode != 200 || isEmpty) {
            return null;
        }
        return jSONObject;
    }

    public final JSONObject e(TemplateInfo templateInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1a0ef5a0", new Object[]{this, templateInfo});
        }
        return (JSONObject) AVFSCacheManager.getInstance().cacheForModule(this.f).C().d0(j(templateInfo));
    }

    public final JSONObject f(TemplateInfo templateInfo) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3bf19b0d", new Object[]{this, templateInfo});
        }
        b bVar = g.get(j(templateInfo));
        if (bVar == null || (jSONObject = bVar.b) == null) {
            return null;
        }
        return jSONObject;
    }

    public final JSONObject g(TemplateInfo templateInfo) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("10e33141", new Object[]{this, templateInfo});
        }
        String url = templateInfo.getUrl();
        String str = "ultrontemplate_" + this.f + "/" + templateInfo.getTemplateId() + "/" + templateInfo.getVersion() + "/template.json";
        if (TextUtils.isEmpty(url)) {
            url = str;
        } else if (url.startsWith("file:///android_asset/")) {
            url = url.replace("file:///android_asset/", "");
        }
        String b2 = fg9.b(this.e, url);
        if (TextUtils.isEmpty(b2)) {
            b2 = fg9.d(this.e, url);
        }
        try {
            jSONObject = JSON.parseObject(b2);
        } catch (Exception e) {
            lbq.c(this.f, "TemplateManager.getPresetTemplate", e);
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        String string = jSONObject.getString("version");
        String string2 = jSONObject.getString("templateId");
        if (templateInfo.getTemplateId() == null || templateInfo.getVersion() == null) {
            return jSONObject;
        }
        if (TextUtils.equals(templateInfo.getTemplateId(), string2) && TextUtils.equals(templateInfo.getVersion(), string)) {
            return jSONObject;
        }
        String str2 = this.f;
        ErrorConstants errorConstants = ErrorConstants.TEMPLATE_KEY_NOT_MATCH;
        lbq.a(str2, "TemplateManager.getPresetTemplate", errorConstants.errorCode(), errorConstants.errorMessage());
        return null;
    }

    public final int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8a100ba3", new Object[]{this})).intValue();
        }
        return sh4.g();
    }

    public final String i(Template template) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("41360dd5", new Object[]{this, template});
        }
        return template.templateId + "_" + template.version;
    }

    public final String j(TemplateInfo templateInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5822a558", new Object[]{this, templateInfo});
        }
        if (templateInfo.getTemplateId() == null) {
            return null;
        }
        return templateInfo.getTemplateId() + "_" + templateInfo.getVersion();
    }

    public cit k(TemplateInfo templateInfo) {
        JSONObject g2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cit) ipChange.ipc$dispatch("55fed9fd", new Object[]{this, templateInfo});
        }
        if (templateInfo == null) {
            return null;
        }
        String j = j(templateInfo);
        if (j != null) {
            JSONObject f = f(templateInfo);
            if (f != null) {
                return l(f);
            }
            JSONObject e = e(templateInfo);
            if (e != null) {
                r(templateInfo, e);
                return l(e);
            }
            JSONObject g3 = g(templateInfo);
            if (g3 != null) {
                r(templateInfo, g3);
                q(templateInfo, g3);
                return l(g3);
            }
            String c = c(templateInfo);
            if (Boolean.TRUE.toString().equals(c)) {
                JSONObject f2 = f(templateInfo);
                if (f2 != null) {
                    return l(f2);
                }
                c = "模板拉取成功,memCache为空";
            }
            return cit.b(100004, c + ": " + j);
        } else if (templateInfo.getUrl() == null || (g2 = g(templateInfo)) == null) {
            return null;
        } else {
            return l(g2);
        }
    }

    public final boolean m(Template template) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e94d6edf", new Object[]{this, template})).booleanValue();
        }
        if (template == null || template.hierarchy == null || template.blocks == null) {
            return false;
        }
        return true;
    }

    public final void n(Template template) {
        mfl mflVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5e167b6", new Object[]{this, template});
            return;
        }
        com.alibaba.android.ultron.vfw.instance.a aVar = this.d;
        if (aVar == null || aVar.F() == null || !this.d.F().u() || (mflVar = this.b) == null || template == mflVar.b()) {
            mfl mflVar2 = new mfl(template);
            this.b = mflVar2;
            mflVar2.d();
        }
    }

    public cit o(a8v.d dVar) {
        y0o y0oVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cit) ipChange.ipc$dispatch("eb052a3f", new Object[]{this, dVar});
        }
        if (dVar == null) {
            return cit.b(cit.ERROR_TEMPLATE_INIT_FAILED, "userData is null");
        }
        if (this.b == null) {
            return cit.b(cit.ERROR_TEMPLATE_INIT_FAILED, "OriginalTemplateState is null");
        }
        try {
            if (this.d != null) {
                y0oVar = new y0o(this.e, this.b, this.c, this.f, this.d.F(), this.d.A().b());
            } else {
                y0oVar = new y0o(this.e, this.b, this.c, this.f);
            }
            y0oVar.C(null);
            cit B = y0oVar.B(dVar.f15606a);
            this.c = y0oVar;
            if (B != null) {
                if (B.f17087a) {
                    return B;
                }
            }
            if (y0oVar.t()) {
                return cit.c();
            }
            try {
                return new v1n().a(this.c);
            } catch (Exception e) {
                return cit.a(100003, e);
            }
        } catch (Exception e2) {
            return cit.a(100002, e2);
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46aada4b", new Object[]{this});
        } else {
            this.c = null;
        }
    }

    public void q(TemplateInfo templateInfo, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98923869", new Object[]{this, templateInfo, jSONObject});
        } else {
            Coordinator.postTask(new a("ultron saveFileCache", templateInfo, jSONObject));
        }
    }

    public void r(TemplateInfo templateInfo, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80e2ed8a", new Object[]{this, templateInfo, jSONObject});
            return;
        }
        HashMap<String, b> hashMap = g;
        b bVar = hashMap.get(j(templateInfo));
        if (bVar == null) {
            bVar = new b(null);
        }
        bVar.b = jSONObject;
        hashMap.put(j(templateInfo), bVar);
        com.alibaba.android.ultron.vfw.instance.a aVar = this.d;
        if (aVar != null && aVar.F() != null && this.d.F().u()) {
            try {
                n(mjt.c(jSONObject));
            } catch (Exception e) {
                lbq.c(this.f, "TemplateManager.saveMemCache", e);
            }
        }
    }

    public cit l(JSONObject jSONObject) {
        b bVar;
        mfl mflVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cit) ipChange.ipc$dispatch("425688d6", new Object[]{this, jSONObject});
        }
        if (!this.f20688a) {
            this.f20688a = true;
            Template c = mjt.c(jSONObject);
            String i = i(c);
            HashMap<String, b> hashMap = g;
            if (hashMap.containsKey(i) && (bVar = hashMap.get(i)) != null && (mflVar = bVar.f20690a) != null) {
                this.b = mflVar;
                return cit.d(null);
            } else if (!m(c)) {
                return cit.b(100000, "name: " + c.name);
            } else {
                try {
                    n(c);
                    b bVar2 = hashMap.get(i);
                    if (bVar2 == null) {
                        bVar2 = new b(null);
                        hashMap.put(i, bVar2);
                    }
                    bVar2.f20690a = this.b;
                    return cit.d(null);
                } catch (Exception e) {
                    return cit.a(100001, e);
                }
            }
        } else {
            throw new IllegalStateException("template has been initialized !");
        }
    }

    public hjt(com.alibaba.android.ultron.vfw.instance.a aVar, Context context, String str) {
        this.d = aVar;
        this.e = context;
        this.f = str;
    }
}
