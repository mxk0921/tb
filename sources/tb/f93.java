package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import java.util.HashMap;
import tb.rpc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class f93 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, e93> f19111a = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(815792823);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(815792822);
    }

    public final void a(String str, rpc.c cVar, TemplateBean templateBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b67afe7", new Object[]{this, str, cVar, templateBean});
            return;
        }
        ckf.g(str, q0j.BIZ_CONTEXT_KEY_CARD_TYPE);
        ckf.g(cVar, "file");
        ckf.g(templateBean, "templateBean");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "version", templateBean.version);
        jSONObject.put((JSONObject) "url", templateBean.url);
        jSONObject.put((JSONObject) "name", templateBean.templateName);
        jSONObject.put((JSONObject) "md5", templateBean.md5);
        v4p.h(str, jSONObject.toJSONString());
        this.f19111a.put(str, new e93(templateBean, cVar, false, 4, null));
    }

    public final e93 b(String str) {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e93) ipChange.ipc$dispatch("b9287903", new Object[]{this, str});
        }
        ckf.g(str, q0j.BIZ_CONTEXT_KEY_CARD_TYPE);
        e93 e93Var = this.f19111a.get(str);
        if (e93Var != null) {
            return e93Var;
        }
        String e = v4p.e(str, "");
        if (TextUtils.isEmpty(e) || (parseObject = JSON.parseObject(e)) == null) {
            return null;
        }
        TemplateBean templateBean = new TemplateBean();
        templateBean.version = parseObject.getString("version");
        templateBean.url = parseObject.getString("url");
        templateBean.templateName = parseObject.getString("name");
        templateBean.md5 = parseObject.getString("md5");
        e93 e93Var2 = new e93(templateBean, null, false, 6, null);
        this.f19111a.put(str, e93Var2);
        return e93Var2;
    }

    public final rpc.c c(e93 e93Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rpc.c) ipChange.ipc$dispatch("282d7681", new Object[]{this, e93Var});
        }
        ckf.g(e93Var, "info");
        return gxh.o().c(e93Var.c().url);
    }

    public final boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c2f98724", new Object[]{this, str})).booleanValue();
        }
        ckf.g(str, "tItemType");
        e93 e93Var = this.f19111a.get(str);
        return (e93Var != null ? e93Var.a() : null) != null;
    }
}
