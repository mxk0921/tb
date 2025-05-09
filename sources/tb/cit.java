package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.PrintWriter;
import java.io.StringWriter;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class cit {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ERROR_NO_TEMPLATE_MATCH = 100004;
    public static final int ERROR_PRE_REDNER_FAILED = 100001;
    public static final int ERROR_PROTOCOL_REDNER_FAILED = 100003;
    public static final int ERROR_REDNER_USER_DATA_FAILED = 100002;
    public static final int ERROR_TEMPLATE_INIT_FAILED = 100005;
    public static final int ERROR_TEMPLATE_VALID = 100000;

    /* renamed from: a  reason: collision with root package name */
    public boolean f17087a;
    public a b;
    public JSONObject c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f17088a;
        public final String b;
        public String c;

        static {
            t2o.a(157286465);
        }

        public a(int i, String str) {
            this.f17088a = i;
            this.b = str;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "TemplateRenderError{errorCode=" + this.f17088a + ", errorMsg='" + this.b + "'}";
        }
    }

    static {
        t2o.a(157286464);
    }

    public static cit a(int i, Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cit) ipChange.ipc$dispatch("c43d161b", new Object[]{new Integer(i), exc});
        }
        cit citVar = new cit();
        citVar.f17087a = true;
        citVar.b = new a(i, "exception: " + exc.getMessage());
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        citVar.b.c = stringWriter.toString();
        return citVar;
    }

    public static cit b(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cit) ipChange.ipc$dispatch("cca88663", new Object[]{new Integer(i), str});
        }
        cit citVar = new cit();
        citVar.f17087a = true;
        citVar.b = new a(i, str);
        return citVar;
    }

    public static cit c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cit) ipChange.ipc$dispatch("10a56d4a", new Object[0]);
        }
        cit citVar = new cit();
        JSONObject jSONObject = new JSONObject();
        citVar.c = jSONObject;
        jSONObject.put("noNeedRefresh", (Object) "true");
        return citVar;
    }

    public static cit d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cit) ipChange.ipc$dispatch("f6527c35", new Object[]{jSONObject});
        }
        cit citVar = new cit();
        citVar.c = jSONObject;
        return citVar;
    }
}
