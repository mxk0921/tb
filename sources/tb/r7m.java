package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class r7m {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public TemplateBean f27167a;
    public JSONObject b;
    public JSONObject c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(481296675);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        @JvmStatic
        public final r7m a(JSONObject jSONObject) {
            JSONObject d;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (r7m) ipChange.ipc$dispatch("33ba1d6a", new Object[]{this, jSONObject});
            }
            if (jSONObject == null || (d = h19.d(jSONObject, "template")) == null) {
                return null;
            }
            TemplateBean templateBean = new TemplateBean();
            templateBean.url = h19.i(d, "url", "");
            templateBean.md5 = h19.i(d, "md5", "");
            templateBean.version = h19.i(d, "version", "");
            templateBean.templateName = h19.i(d, yh6.CONFIG_KEY_TEMPLATE_NAME, "");
            if (TextUtils.isEmpty(templateBean.url)) {
                return null;
            }
            r7m r7mVar = new r7m();
            r7mVar.f(templateBean);
            r7mVar.d(h19.d(jSONObject, "data"));
            return r7mVar;
        }

        public a() {
        }
    }

    static {
        t2o.a(481296674);
    }

    public final JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b8351bc7", new Object[]{this});
        }
        return this.b;
    }

    public final JSONObject b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("81f3f28f", new Object[]{this});
        }
        return this.c;
    }

    public final TemplateBean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateBean) ipChange.ipc$dispatch("aebe3cb9", new Object[]{this});
        }
        return this.f27167a;
    }

    public final void d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d09acf9d", new Object[]{this, jSONObject});
        } else {
            this.b = jSONObject;
        }
    }

    public final void e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd3c84d5", new Object[]{this, jSONObject});
        } else {
            this.c = jSONObject;
        }
    }

    public final void f(TemplateBean templateBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("880dd33d", new Object[]{this, templateBean});
        } else {
            this.f27167a = templateBean;
        }
    }
}
