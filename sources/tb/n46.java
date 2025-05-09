package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class n46 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
        /* renamed from: tb.n46$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public static final class RunnableC1003a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ JSONObject f24500a;

            public RunnableC1003a(JSONObject jSONObject) {
                this.f24500a = jSONObject;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    a.a(n46.Companion, this.f24500a);
                }
            }
        }

        static {
            t2o.a(745537950);
        }

        public a() {
        }

        public static final /* synthetic */ void a(a aVar, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("193a2dfe", new Object[]{aVar, jSONObject});
            } else {
                aVar.d(jSONObject);
            }
        }

        public final void b(JSONObject jSONObject, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("23e8fa41", new Object[]{this, jSONObject, new Boolean(z)});
            } else if (z) {
                p3j.g(new RunnableC1003a(jSONObject));
            } else {
                d(jSONObject);
            }
        }

        public final void d(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4a12c18", new Object[]{this, jSONObject});
                return;
            }
            String string = jSONObject.getString("page");
            if (string == null) {
                string = u3j.b;
            }
            Integer integer = jSONObject.getInteger("eventId");
            r4v.a(string, integer != null ? integer.intValue() : 2101, jSONObject.getString("arg1"), null, null, jSONObject.getJSONObject("args"));
            JSONObject jSONObject2 = jSONObject.getJSONObject("nextPage");
            if (!(jSONObject2 == null || jSONObject2.isEmpty())) {
                HashMap hashMap = new HashMap(jSONObject2.keySet().size());
                Set<String> keySet = jSONObject2.keySet();
                ckf.c(keySet, "nextPage.keys");
                for (String str : keySet) {
                    hashMap.put(str, jSONObject2.getString(str));
                }
                UTAnalytics instance = UTAnalytics.getInstance();
                ckf.c(instance, "UTAnalytics.getInstance()");
                instance.getDefaultTracker().updateNextPageProperties(hashMap);
            }
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final void c(String str, Object[] objArr, o3j o3jVar, boolean z) {
            JSONObject jSONObject;
            JSONObject jSONObject2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b6bd009", new Object[]{this, str, objArr, o3jVar, new Boolean(z)});
                return;
            }
            ckf.h(str, "key");
            ckf.h(o3jVar, "userContext");
            JSONObject g = o3jVar.g().g();
            JSONObject jSONObject3 = (g == null || (jSONObject = g.getJSONObject("events")) == null || (jSONObject2 = jSONObject.getJSONObject("clickUt")) == null) ? null : jSONObject2.getJSONObject(str);
            Object L = objArr != null ? ic1.L(objArr, 1) : null;
            if (!(L instanceof JSONObject)) {
                L = null;
            }
            JSONObject jSONObject4 = (JSONObject) L;
            if (jSONObject3 != null || jSONObject4 != null) {
                if (jSONObject3 != null && jSONObject4 == null) {
                    b(jSONObject3, z);
                } else if (jSONObject3 == null && jSONObject4 != null) {
                    b(jSONObject4, z);
                } else if (jSONObject4 != null) {
                    JSONObject jSONObject5 = jSONObject4.getJSONObject("args");
                    if (jSONObject5 == null) {
                        jSONObject5 = new JSONObject();
                    }
                    if (jSONObject3 != null) {
                        JSONObject jSONObject6 = jSONObject3.getJSONObject("args");
                        if (jSONObject6 == null) {
                            jSONObject6 = new JSONObject();
                        }
                        JSONObject jSONObject7 = jSONObject4.getJSONObject("nextPage");
                        if (jSONObject7 == null) {
                            jSONObject7 = new JSONObject();
                        }
                        JSONObject jSONObject8 = jSONObject3.getJSONObject("nextPage");
                        if (jSONObject8 == null) {
                            jSONObject8 = new JSONObject();
                        }
                        JSONObject jSONObject9 = new JSONObject();
                        jSONObject9.putAll(jSONObject4);
                        jSONObject9.putAll(jSONObject3);
                        JSONObject jSONObject10 = new JSONObject();
                        jSONObject10.putAll(jSONObject5);
                        jSONObject10.putAll(jSONObject6);
                        JSONObject jSONObject11 = new JSONObject();
                        jSONObject11.putAll(jSONObject7);
                        jSONObject11.putAll(jSONObject8);
                        jSONObject9.put("args", (Object) jSONObject10);
                        jSONObject9.put("nextPage", (Object) jSONObject11);
                        b(jSONObject9, z);
                        return;
                    }
                    ckf.s();
                    throw null;
                } else {
                    ckf.s();
                    throw null;
                }
            }
        }
    }

    static {
        t2o.a(745537949);
    }

    public static /* synthetic */ Object ipc$super(n46 n46Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/pagev2/eventhandler/DXMtbClickUTEventHandler");
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        fl6 fl6Var;
        JSONObject f;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        Object obj2 = null;
        if (dXRuntimeContext != null) {
            fl6Var = dXRuntimeContext.S();
        } else {
            fl6Var = null;
        }
        if (!(fl6Var instanceof o3j)) {
            fl6Var = null;
        }
        o3j o3jVar = (o3j) fl6Var;
        if (o3jVar != null && (f = o3jVar.f()) != null && f.getBooleanValue("disableUtForDXTabEvent")) {
            if (objArr != null) {
                obj = ic1.L(objArr, 0);
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                obj2 = obj;
            }
            String str = (String) obj2;
            if (str != null) {
                Companion.c(str, objArr, o3jVar, true);
            }
        }
    }
}
