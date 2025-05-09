package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ik8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements jj8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ nwi f21363a;

        public a(nwi nwiVar) {
            this.f21363a = nwiVar;
        }

        @Override // tb.jj8
        public void onFail(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2f5f2b8", new Object[]{this, str, str2});
                return;
            }
            ecj.b(this.f21363a, false);
            this.f21363a.g().b().l("disableAnimation", Boolean.TRUE);
        }

        @Override // tb.jj8
        public void onSuccess(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("980108a5", new Object[]{this, jSONObject});
                return;
            }
            ecj.b(this.f21363a, true);
            this.f21363a.g().b().l("disableAnimation", Boolean.TRUE);
        }
    }

    static {
        t2o.a(573571082);
    }

    public static void a(nwi nwiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75cc9ad1", new Object[]{nwiVar});
        } else {
            nwiVar.f().b("commonActionEvent", nj8.a(nwiVar.d().a().actionResponse, c(nwiVar)));
        }
    }

    public static void b(DXEvent dXEvent, String str, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cda9060", new Object[]{dXEvent, str, dXRuntimeContext});
        } else {
            new mv5().handleEvent(dXEvent, new String[]{str}, dXRuntimeContext);
        }
    }

    public static jj8 c(nwi nwiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jj8) ipChange.ipc$dispatch("62b2f367", new Object[]{nwiVar});
        }
        return new a(nwiVar);
    }
}
