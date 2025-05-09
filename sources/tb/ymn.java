package tb;

import android.os.Handler;
import android.os.Looper;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.exception.GatewayException;
import com.taobao.tao.recommend3.gateway.msgcenter.RecmdContainerMsg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ymn implements s4a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final imn f32202a;
    public final Handler b = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f32203a;

        public a(JSONObject jSONObject) {
            this.f32203a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ymn.b(ymn.this, this.f32203a);
            }
        }
    }

    static {
        t2o.a(729809679);
        t2o.a(475004944);
    }

    public ymn(imn imnVar) throws GatewayException {
        if (imnVar != null) {
            this.f32202a = imnVar;
            return;
        }
        throw new GatewayException("RecmdDataSource should not be null");
    }

    public static /* synthetic */ void b(ymn ymnVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47945bb2", new Object[]{ymnVar, jSONObject});
        } else {
            ymnVar.c(jSONObject);
        }
    }

    @Override // tb.s4a
    public void a(JSONObject jSONObject, d90 d90Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b68a946", new Object[]{this, jSONObject, d90Var});
        } else if (jSONObject != null) {
            hrg.e(fdv.F_COMPONENT_RENDER_TAG, "gateway2.uiRefresh", "start action");
            if (kmn.l()) {
                c(jSONObject);
            } else {
                this.b.post(new a(jSONObject));
            }
        }
    }

    public final void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5519d62", new Object[]{this, jSONObject});
            return;
        }
        jSONObject.put("_msgType", "uiRefresh");
        zza.b(this.f32202a.D()).c(RecmdContainerMsg.getMessage(jSONObject));
        bqa.d("gateway2.uiRefresh", "end action");
    }
}
