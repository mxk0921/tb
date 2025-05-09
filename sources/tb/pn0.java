package tb;

import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCEndpoint;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.ck;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "alibuy.impl.nextrpc.protocol.cache")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class pn0 extends et {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Map<String, String> f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ kk f26191a;

        /* compiled from: Taobao */
        /* renamed from: tb.pn0$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class RunnableC1030a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC1030a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                ck.g().e("开始缓存奥创协议", ck.b.b().i("AURA/performance").a());
                JSONObject jSONObject = a.this.f26191a.b().getJSONObject("data");
                if (jSONObject != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("data", (Object) jSONObject.getJSONObject("data"));
                    jSONObject2.put("container", (Object) jSONObject.getJSONObject("container"));
                    on0.a(pn0.J0(pn0.this).d(), JSON.toJSONString(pn0.K0(pn0.this)), jSONObject2.toJSONString());
                }
            }
        }

        public a(kk kkVar) {
            this.f26191a = kkVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                dn.h(new RunnableC1030a());
            }
        }
    }

    static {
        t2o.a(301989946);
    }

    public static /* synthetic */ lo J0(pn0 pn0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lo) ipChange.ipc$dispatch("ac80e7ae", new Object[]{pn0Var});
        }
        return pn0Var.L();
    }

    public static /* synthetic */ Map K0(pn0 pn0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3b662975", new Object[]{pn0Var});
        }
        return pn0Var.f;
    }

    public static /* synthetic */ Object ipc$super(pn0 pn0Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1162528052) {
            super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (hbb) objArr[2]);
            return null;
        } else if (hashCode == -25033014) {
            super.onCreate((lo) objArr[0], (yi) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/buy/extension/AliBuyProtocolCacheExtension");
        }
    }

    public final boolean L0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46997198", new Object[]{this})).booleanValue();
        }
        return true ^ "1".equals(L().g("itemCount", String.class));
    }

    @Override // tb.et, tb.vbb
    public void Q(AURANextRPCEndpoint aURANextRPCEndpoint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb0f0ad2", new Object[]{this, aURANextRPCEndpoint});
        } else {
            this.f = aURANextRPCEndpoint.getDataParams();
        }
    }

    @Override // tb.et, tb.vbb
    public void S(kk kkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de231dc7", new Object[]{this, kkVar});
        } else if (!L0()) {
            dn.e(new a(kkVar));
        }
    }

    @Override // tb.et
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47552595", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.et, tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
        } else {
            super.onCreate(loVar, yiVar);
        }
    }

    @Override // tb.et, tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
        } else {
            super.onDataChanged(aURAFlowData, aURAGlobalData, hbbVar);
        }
    }
}
