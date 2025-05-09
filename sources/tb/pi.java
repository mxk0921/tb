package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class pi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a extends pt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -1339997787) {
                super.b((mi) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/service/event/AURAEventDispatcher$1");
        }

        @Override // tb.pt, tb.hbb
        public void b(mi miVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b02141a5", new Object[]{this, miVar});
                return;
            }
            super.b(miVar);
            rbb g = ck.g();
            g.b("AURAEventDispatcher", "dispatch", "dispatch error" + miVar.e());
        }
    }

    static {
        t2o.a(80740426);
    }

    public static void b(nbb nbbVar, String str, qi qiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6d7b151", new Object[]{nbbVar, str, qiVar});
        } else {
            c(nbbVar, str, qiVar, null);
        }
    }

    public static void c(nbb nbbVar, String str, qi qiVar, pt ptVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c869dcc3", new Object[]{nbbVar, str, qiVar, ptVar});
        } else if (nbbVar == null || TextUtils.isEmpty(str)) {
            rbb g = ck.g();
            g.b("AURAEventDispatcher", "dispatch", "dispatch error, eventType=" + str);
        } else {
            nbbVar.c("aura.workflow.event", new AURAEventIO(str, qiVar), new a());
        }
    }

    public static void a(nbb nbbVar, AURARenderComponent aURARenderComponent, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a54b24f", new Object[]{nbbVar, aURARenderComponent, jSONArray});
            return;
        }
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            qi qiVar = new qi();
            qiVar.n(jSONObject.getJSONObject("fields"));
            qiVar.t(aURARenderComponent);
            b(nbbVar, jSONObject.getString("type"), qiVar);
        }
    }
}
