package tb;

import android.util.Log;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.embedview.IEmbedCallback;
import com.alibaba.ariver.integration.embedview.BaseEmbedView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class eui implements pkd, b0n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final BridgeCallback f18822a;
    public final BaseEmbedView b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements IEmbedCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Object f18823a;
        public boolean b;

        static {
            t2o.a(396361741);
        }

        public b() {
            this.f18823a = new Object();
            this.b = false;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51e5d579", new Object[]{this});
                return;
            }
            synchronized (this.f18823a) {
                try {
                    if (!this.b) {
                        this.f18823a.wait(1000L);
                    }
                } catch (Throwable unused) {
                }
            }
        }

        @Override // com.alibaba.ariver.engine.api.embedview.IEmbedCallback
        public void onResponse(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8435f409", new Object[]{this, jSONObject});
                return;
            }
            synchronized (this.f18823a) {
                this.b = true;
                this.f18823a.notifyAll();
            }
        }
    }

    static {
        t2o.a(396361739);
        t2o.a(396361738);
        t2o.a(396361769);
    }

    public eui(BaseEmbedView baseEmbedView, BridgeCallback bridgeCallback) {
        this.f18822a = bridgeCallback;
        this.b = baseEmbedView;
    }

    @Override // tb.b0n
    public void onProgress(int i, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("756ebb40", new Object[]{this, new Integer(i), jSONObject});
        } else if (this.b != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                if (jSONObject != null && jSONObject.containsKey("download_progress_key")) {
                    jSONObject2.put("key", (Object) jSONObject.getString("download_progress_key"));
                }
                jSONObject2.put("progress", (Object) Integer.valueOf(i));
                b bVar = new b();
                this.b.sendEvent("progress", jSONObject2, bVar);
                bVar.a();
            } catch (Throwable th) {
                Log.e("MiniAPPResultSender", "some exceptions happened, when send progress...", th);
            }
        }
    }

    @Override // tb.pkd
    public void sendResult(boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94051768", new Object[]{this, new Boolean(z), jSONObject});
            return;
        }
        BridgeCallback bridgeCallback = this.f18822a;
        if (bridgeCallback != null) {
            bridgeCallback.sendJSONResponse(jSONObject, z);
        }
    }
}
