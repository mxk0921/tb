package com.taobao.android.turbo.core.service.windvane;

import android.content.Intent;
import android.taobao.windvane.jsbridge.IJsApiFailedCallBack;
import android.taobao.windvane.jsbridge.WVJsBridge;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import androidx.core.graphics.drawable.IconCompat;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.fluid.core.exception.FluidException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.a07;
import tb.b7d;
import tb.ckf;
import tb.esw;
import tb.ieb;
import tb.iqw;
import tb.jqw;
import tb.kee;
import tb.kpw;
import tb.kqw;
import tb.lqw;
import tb.plk;
import tb.qpu;
import tb.r4c;
import tb.rb;
import tb.spw;
import tb.t2o;
import tb.tpu;
import tb.z0d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class WindvaneService implements kee, ieb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public qpu f9753a;
    public JsEventListener c;
    public final ArrayList<esw> b = new ArrayList<>();
    public final HashMap<String, plk<z0d>> d = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public final class JsEventListener implements jqw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(919601355);
            t2o.a(989856388);
        }

        public JsEventListener() {
        }

        @Override // tb.jqw
        public kqw onEvent(int i, iqw iqwVar, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (kqw) ipChange.ipc$dispatch("75ee5a2a", new Object[]{this, new Integer(i), iqwVar, objArr});
            }
            ckf.g(iqwVar, "ctx");
            ckf.g(objArr, IconCompat.EXTRA_OBJ);
            if (i != 3005 || objArr.length == 0) {
                return null;
            }
            Object obj = objArr[0];
            if (!(obj instanceof String)) {
                return null;
            }
            try {
                if (obj != null) {
                    JSONObject parseObject = JSON.parseObject((String) obj);
                    String string = parseObject.getString("event");
                    ckf.f(string, "result.getString(\"event\")");
                    plk plkVar = (plk) WindvaneService.r(WindvaneService.this).get(string);
                    if (plkVar == null) {
                        return null;
                    }
                    JSONObject jSONObject = parseObject.getJSONObject("param");
                    ckf.f(jSONObject, "result.getJSONObject(\"param\")");
                    plkVar.d(new WindvaneService$JsEventListener$onEvent$1(string, jSONObject));
                    return null;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(919601354);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b implements IJsApiFailedCallBack {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ IJsApiFailedCallBack d;
        public final /* synthetic */ esw e;
        public final /* synthetic */ spw f;

        public b(String str, String str2, IJsApiFailedCallBack iJsApiFailedCallBack, esw eswVar, spw spwVar) {
            this.b = str;
            this.c = str2;
            this.d = iJsApiFailedCallBack;
            this.e = eswVar;
            this.f = spwVar;
        }

        @Override // android.taobao.windvane.jsbridge.IJsApiFailedCallBack
        public final void fail(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("534fc72f", new Object[]{this, str});
                return;
            }
            tpu.a aVar = tpu.Companion;
            tpu.a.b(aVar, "WindvaneService", "failed: " + this.b + ", " + this.c + ", " + str, null, 4, null);
            IJsApiFailedCallBack iJsApiFailedCallBack = this.d;
            if (iJsApiFailedCallBack != null) {
                iJsApiFailedCallBack.fail(str);
            }
            Object b = this.e.b(this.f.d);
            if (b instanceof kpw) {
                ((kpw) b).onDestroy();
            }
            WindvaneService.x(WindvaneService.this).remove(this.e);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class c implements r4c {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ r4c d;
        public final /* synthetic */ esw e;
        public final /* synthetic */ spw f;

        public c(String str, String str2, r4c r4cVar, esw eswVar, spw spwVar) {
            this.b = str;
            this.c = str2;
            this.d = r4cVar;
            this.e = eswVar;
            this.f = spwVar;
        }

        @Override // tb.r4c
        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("310f3b65", new Object[]{this, str});
                return;
            }
            ckf.g(str, rb.RESULT_KEY);
            tpu.a aVar = tpu.Companion;
            tpu.a.b(aVar, "WindvaneService", "successAndKeepAlive: " + this.b + ", " + this.c + ", " + str, null, 4, null);
            r4c r4cVar = this.d;
            if (r4cVar != null) {
                r4cVar.b(str);
            }
        }

        @Override // android.taobao.windvane.jsbridge.IJsApiSucceedCallBack
        public void succeed(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e5b77b53", new Object[]{this, str});
                return;
            }
            ckf.g(str, rb.RESULT_KEY);
            tpu.a aVar = tpu.Companion;
            tpu.a.b(aVar, "WindvaneService", "succeed: " + this.b + ", " + this.c + ", " + str, null, 4, null);
            r4c r4cVar = this.d;
            if (r4cVar != null) {
                r4cVar.succeed(str);
            }
            Object b = this.e.b(this.f.d);
            if (b instanceof kpw) {
                ((kpw) b).onDestroy();
            }
            WindvaneService.x(WindvaneService.this).remove(this.e);
        }
    }

    static {
        t2o.a(919601353);
        t2o.a(919601352);
        t2o.a(919601317);
    }

    public static final /* synthetic */ HashMap r(WindvaneService windvaneService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("f7b2af31", new Object[]{windvaneService});
        }
        return windvaneService.d;
    }

    public static final /* synthetic */ ArrayList x(WindvaneService windvaneService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("49b16daf", new Object[]{windvaneService});
        }
        return windvaneService.b;
    }

    @Override // tb.kee
    public void a0(String str, Map<String, ? extends Object> map) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72b3ea6b", new Object[]{this, str, map});
            return;
        }
        ckf.g(str, "name");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "WindvaneService", "postNotify: " + str + ", " + map, null, 4, null);
        if (map != null) {
            str2 = JSON.toJSONString(map);
        } else {
            str2 = "{}";
        }
        WVStandardEventCenter.postNotificationToJS(str, str2);
    }

    @Override // tb.kee
    public void c1(String str, z0d z0dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e4f3add", new Object[]{this, str, z0dVar});
            return;
        }
        ckf.g(str, "name");
        ckf.g(z0dVar, DataReceiveMonitor.CB_LISTENER);
        HashMap<String, plk<z0d>> hashMap = this.d;
        plk<z0d> plkVar = hashMap.get(str);
        if (plkVar == null) {
            plkVar = new plk<>();
            hashMap.put(str, plkVar);
        }
        plkVar.c(z0dVar);
    }

    @Override // tb.ieb
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        for (esw eswVar : this.b) {
            eswVar.c(i, i2, intent);
        }
    }

    @Override // tb.sod
    public void onCreateService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9b2eb95", new Object[]{this, qpuVar});
            return;
        }
        ckf.g(qpuVar, "context");
        this.f9753a = qpuVar;
        ((b7d) qpuVar.getService(b7d.class)).M(this);
    }

    @Override // tb.sod
    public void onDestroyService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673e3e35", new Object[]{this, qpuVar});
            return;
        }
        ckf.g(qpuVar, "context");
        ((b7d) qpuVar.getService(b7d.class)).r(this);
        if (this.c != null) {
            lqw.d().h(this.c);
            this.c = null;
            this.d.clear();
        }
    }

    @Override // tb.kee
    public void s0(String str, z0d z0dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c74e286d", new Object[]{this, str, z0dVar});
            return;
        }
        ckf.g(str, "name");
        ckf.g(z0dVar, DataReceiveMonitor.CB_LISTENER);
        if (this.c == null) {
            this.c = new JsEventListener();
            lqw.d().b(this.c);
        }
        HashMap<String, plk<z0d>> hashMap = this.d;
        plk<z0d> plkVar = hashMap.get(str);
        if (plkVar == null) {
            plkVar = new plk<>();
            hashMap.put(str, plkVar);
        }
        plkVar.a(z0dVar);
    }

    @Override // tb.kee
    public void Q0(String str, String str2, Map<String, ? extends Object> map, r4c r4cVar, IJsApiFailedCallBack iJsApiFailedCallBack) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("376c8631", new Object[]{this, str, str2, map, r4cVar, iJsApiFailedCallBack});
            return;
        }
        ckf.g(str, "pluginName");
        ckf.g(str2, FluidException.METHOD_NAME);
        ckf.g(map, "params");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "WindvaneService", "call: " + str + ", " + str2 + ", " + map, null, 4, null);
        spw spwVar = new spw();
        spwVar.d = str;
        spwVar.e = str2;
        qpu qpuVar = this.f9753a;
        if (qpuVar != null) {
            esw eswVar = new esw(qpuVar.getContext(), null);
            b bVar = new b(str, str2, iJsApiFailedCallBack, eswVar, spwVar);
            c cVar = new c(str, str2, r4cVar, eswVar, spwVar);
            try {
                spwVar.f = JSON.toJSONString(map);
                WVJsBridge.g().f(eswVar, spwVar, bVar, cVar);
                this.b.add(eswVar);
            } catch (Throwable th) {
                tpu.a aVar2 = tpu.Companion;
                aVar2.a("WindvaneService", "call fail: " + str + ", " + str2 + ", " + map, th);
                if (iJsApiFailedCallBack != null) {
                    iJsApiFailedCallBack.fail("FAILURE");
                }
                Object b2 = eswVar.b(spwVar.d);
                if (b2 instanceof kpw) {
                    ((kpw) b2).onDestroy();
                }
            }
        } else {
            ckf.y("context");
            throw null;
        }
    }
}
