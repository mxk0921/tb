package tb;

import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.container.dx.DxContainerActivity;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class bd0 extends JSONObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public JSONObject f16329a;
        public String b;

        static {
            t2o.a(283115525);
        }

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("10b57d77", new Object[]{aVar});
            }
            return aVar.b;
        }

        public static /* synthetic */ String b(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f3e130b8", new Object[]{aVar});
            }
            aVar.getClass();
            return null;
        }

        public static /* synthetic */ JSONObject c(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("e1ab96f5", new Object[]{aVar});
            }
            aVar.getClass();
            return null;
        }

        public static /* synthetic */ JSONObject d(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("fc1c9014", new Object[]{aVar});
            }
            return aVar.f16329a;
        }

        public bd0 e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (bd0) ipChange.ipc$dispatch("cb95343c", new Object[]{this});
            }
            return new bd0(this);
        }

        public a f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("30f368ec", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public a g(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("13472bcb", new Object[]{this, jSONObject});
            }
            this.f16329a = jSONObject;
            return this;
        }
    }

    static {
        t2o.a(283115523);
    }

    public bd0(a aVar) {
        try {
            put(MspDBHelper.BizEntry.COLUMN_NAME_PID, a.a(aVar));
            put(DxContainerActivity.PARAMS_NAMESPACE, a.b(aVar));
            put("macroArgs", a.c(aVar));
            put("utArgs", a.d(aVar));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static /* synthetic */ Object ipc$super(bd0 bd0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/tanx/exposer/AdMonitorExtraParams");
    }

    public JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ea26af08", new Object[]{this});
        }
        return optJSONObject("macroArgs");
    }

    public bd0(String str) throws JSONException {
        super(str);
    }
}
