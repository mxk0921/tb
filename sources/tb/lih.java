package tb;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.logic.DXJSLogicModuleV4;
import com.taobao.android.dinamicx.logic.DXLogicModule;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dxv4common.logic.dex.bridge.DXNativeLogicEngine;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.android.weex_framework.MUSInstanceConfig;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_framework.b;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class lih implements cwb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final jih f23358a = jih.e();
    public final AtomicLong b = new AtomicLong();
    public final AtomicLong c = new AtomicLong();
    public final Map<String, WeakReference<Object>> d = new ConcurrentHashMap();
    public String e = "";
    public String f = "";

    static {
        MUSEngine.registerModule("dxBridge", DXLogicModule.class);
        MUSEngine.registerModule("DXJSBridge", DXJSLogicModuleV4.class);
    }

    public static MUSValue[] e(int i, uw5[] uw5VarArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSValue[]) ipChange.ipc$dispatch("e8171440", new Object[]{new Integer(i), uw5VarArr});
        }
        MUSValue[] mUSValueArr = new MUSValue[i + 2];
        for (int i2 = 0; i2 < i; i2++) {
            uw5 uw5Var = uw5VarArr[i2];
            int x = uw5Var.x();
            switch (x) {
                case 1:
                case 8:
                case 9:
                    mUSValueArr[i2 + 2] = MUSValue.ofNill();
                    break;
                case 2:
                    mUSValueArr[i2 + 2] = MUSValue.ofInt(uw5Var.s());
                    break;
                case 3:
                    mUSValueArr[i2 + 2] = MUSValue.ofFloat((float) uw5Var.q());
                    break;
                case 4:
                    mUSValueArr[i2 + 2] = MUSValue.ofBool(uw5Var.o());
                    break;
                case 5:
                    mUSValueArr[i2 + 2] = MUSValue.ofString(uw5Var.w());
                    break;
                case 6:
                    mUSValueArr[i2 + 2] = MUSValue.ofJSON(uw5Var.n());
                    break;
                case 7:
                    mUSValueArr[i2 + 2] = MUSValue.ofJSON(uw5Var.v());
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + x);
            }
        }
        return mUSValueArr;
    }

    @Override // tb.cwb
    public boolean b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("894e04a1", new Object[]{this, new Integer(i)})).booleanValue();
        }
        MUSDKInstance d = this.f23358a.d(this.f, i);
        if (d == null || d.isDestroyed()) {
            return false;
        }
        return true;
    }

    @Override // tb.cwb
    public void c(int i, DXRuntimeContext dXRuntimeContext, List<Pair<String, byte[]>> list) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("701ab16d", new Object[]{this, new Integer(i), dXRuntimeContext, list});
        } else if (list != null) {
            try {
                if (!list.isEmpty() && dXRuntimeContext.h() != null) {
                    Context applicationContext = dXRuntimeContext.h().getApplicationContext();
                    DXTemplateItem p = dXRuntimeContext.p();
                    if (TextUtils.isEmpty(this.f)) {
                        this.f = dXRuntimeContext.c();
                    }
                    if (TextUtils.isEmpty(this.e)) {
                        this.e = "2147483647";
                        if (dXRuntimeContext.s() != null) {
                            DinamicXEngine f = dXRuntimeContext.s().f();
                            if (f != null) {
                                this.e = f.d().g() + "";
                            }
                            this.f23358a.a(this.f, this.e, f);
                        }
                    }
                    if (p != null) {
                        if (!TextUtils.isEmpty(p.c)) {
                            str = p.c;
                        } else {
                            str = "dx://" + p.f7343a;
                        }
                        Uri parse = Uri.parse(str);
                        MUSInstanceConfig mUSInstanceConfig = new MUSInstanceConfig();
                        Uri build = parse.buildUpon().appendQueryParameter("inspect_breakpt_key", dXRuntimeContext.p().f7343a).build();
                        mUSInstanceConfig.p(build.toString());
                        mUSInstanceConfig.r(dXRuntimeContext.p().f7343a);
                        mUSInstanceConfig.C(true);
                        MUSDKInstance mUSDKInstance = (MUSDKInstance) b.f().c(applicationContext, mUSInstanceConfig);
                        mUSDKInstance.initWithData((byte[]) list.get(list.size() - 1).second, build);
                        if (list.size() > 1) {
                            for (int i2 = 0; i2 < list.size() - 1; i2++) {
                                Pair<String, byte[]> pair = list.get(i2);
                                mUSDKInstance.executeScript((byte[]) pair.second, (String) pair.first);
                            }
                        }
                        mUSDKInstance.addInstanceEnv("engineId", this.e);
                        mUSDKInstance.execute(null);
                        this.f23358a.f(this.f, i, mUSDKInstance);
                    }
                }
            } catch (Exception e) {
                xv5.b(e);
            }
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        Iterator it = ((ConcurrentHashMap) this.d).entrySet().iterator();
        if (it != null) {
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (entry.getValue() == null || ((WeakReference) entry.getValue()).get() == null) {
                    it.remove();
                    h36.g("LogicEngineImpl", "iterator.remove()");
                }
            }
        }
    }

    @Override // tb.cwb
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.f23358a.b(this.f, this.e);
        }
    }

    @Override // tb.cwb
    public void a(int i, DXRuntimeContext dXRuntimeContext, String str, String str2, int i2, uw5[] uw5VarArr) {
        Object obj;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ee1b30a", new Object[]{this, new Integer(i), dXRuntimeContext, str, str2, new Integer(i2), uw5VarArr});
            return;
        }
        try {
            MUSDKInstance d = this.f23358a.d(this.f, i);
            if (d != null) {
                JSONObject jSONObject2 = new JSONObject();
                String str3 = "event_" + this.b.incrementAndGet();
                jSONObject2.put("_event", (Object) "event");
                jSONObject2.put("identifier", (Object) str3);
                JSONObject jSONObject3 = null;
                DXEvent dXEvent = (uw5VarArr == null || uw5VarArr.length < 1 || uw5VarArr[0].I()) ? null : (DXEvent) uw5VarArr[0].t();
                if (!(dXEvent == null || dXEvent.getArgs() == null || dXEvent.getArgs().isEmpty())) {
                    jSONObject3 = new JSONObject();
                    for (Map.Entry<String, mw5> entry : dXEvent.getArgs().entrySet()) {
                        if (!(entry.getKey() == null || entry.getValue() == null)) {
                            jSONObject3.put(entry.getKey(), entry.getValue().s());
                        }
                    }
                }
                jSONObject2.put("data", (Object) jSONObject3);
                ((ConcurrentHashMap) this.d).put(str3, new WeakReference(dXEvent));
                uw5 U = uw5.U(jSONObject2);
                JSONObject jSONObject4 = new JSONObject();
                String str4 = "ctx_" + this.c.incrementAndGet();
                jSONObject4.put("identifier", (Object) str4);
                if (dXRuntimeContext.O() == null) {
                    obj = new JSONObject();
                } else {
                    obj = dXRuntimeContext.O();
                }
                jSONObject4.put("subData", obj);
                if (dXRuntimeContext.i() == null) {
                    jSONObject = new JSONObject();
                } else {
                    jSONObject = dXRuntimeContext.i();
                }
                jSONObject4.put("data", (Object) jSONObject);
                jSONObject4.put("state_id", (Object) Long.valueOf(this.b.get()));
                ((ConcurrentHashMap) this.d).put(str4, new WeakReference(dXRuntimeContext));
                uw5 U2 = uw5.U(jSONObject4);
                ((ConcurrentHashMap) this.d).put("runtimeContext", new WeakReference(dXRuntimeContext));
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("dx_event", (Object) jSONObject2);
                jSONObject5.put(DXNativeLogicEngine.TAG_DXRUNTINECONTEXT, (Object) jSONObject4);
                MUSValue[] e = e(3, new uw5[]{U, uw5.U(jSONObject5), U2});
                e[0] = MUSValue.ofString(str);
                e[1] = MUSValue.ofString(str2);
                d.setExecuteContext(this.d);
                d.execute(e);
                d();
            }
        } catch (Exception e2) {
            xv5.b(e2);
        }
    }
}
