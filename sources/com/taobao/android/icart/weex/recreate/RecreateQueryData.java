package com.taobao.android.icart.weex.recreate;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.weex.prefetch.NextRPCPrefetch;
import com.taobao.tao.Globals;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import tb.a3o;
import tb.ckf;
import tb.dh1;
import tb.fj9;
import tb.ne3;
import tb.q3o;
import tb.r5o;
import tb.szh;
import tb.t2o;
import tb.z0i;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class RecreateQueryData {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final RecreateQueryData INSTANCE = new RecreateQueryData();

    /* renamed from: a  reason: collision with root package name */
    public static volatile JSONObject f8077a;
    public static boolean b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a implements r5o {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ q3o f8078a;

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        /* renamed from: com.taobao.android.icart.weex.recreate.RecreateQueryData$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public static final class RunnableC0428a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0428a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    a.this.f8078a.h();
                }
            }
        }

        public a(q3o q3oVar) {
            this.f8078a = q3oVar;
        }

        @Override // tb.r5o
        public void a(z0i z0iVar, List<dh1> list, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("89132812", new Object[]{this, z0iVar, list, new Boolean(z)});
                return;
            }
            ckf.g(z0iVar, "mainResponse");
            ckf.g(list, "attachedResponses");
            RecreateQueryData recreateQueryData = RecreateQueryData.INSTANCE;
            if (RecreateQueryData.b(recreateQueryData) != null) {
                RecreateQueryData.c(recreateQueryData, z0iVar.i());
            }
        }

        @Override // tb.r5o
        public void b(fj9 fj9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f9ebfbe3", new Object[]{this, fj9Var});
                return;
            }
            ckf.g(fj9Var, "finishResult");
            new Handler(Looper.getMainLooper()).post(new RunnableC0428a());
        }

        @Override // tb.r5o
        public void c(szh szhVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("40186e18", new Object[]{this, szhVar});
                return;
            }
            ckf.g(szhVar, "errorResponse");
            ne3.c cVar = ne3.Companion;
            ne3.c.e(cVar, "RecreateTabQueryError", "网络请求失败 code=" + szhVar.c() + ",msg=" + szhVar.d(), 0.0f, 4, null);
        }

        @Override // tb.r5o
        public void d(a3o a3oVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f01fd9d0", new Object[]{this, a3oVar});
            } else {
                ckf.g(a3oVar, "request");
            }
        }

        @Override // tb.r5o
        public void e(List<dh1> list, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba18dfd3", new Object[]{this, list, new Boolean(z)});
            } else {
                ckf.g(list, "attachedResponses");
            }
        }
    }

    static {
        t2o.a(478151044);
    }

    public static final /* synthetic */ void a(RecreateQueryData recreateQueryData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57dacc3d", new Object[]{recreateQueryData});
        } else {
            recreateQueryData.d();
        }
    }

    public static final /* synthetic */ JSONObject b(RecreateQueryData recreateQueryData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2b20b04d", new Object[]{recreateQueryData});
        }
        return f8077a;
    }

    public static final /* synthetic */ void c(RecreateQueryData recreateQueryData, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6dab924", new Object[]{recreateQueryData, str});
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1d3df86", new Object[]{this});
            return;
        }
        b = true;
        f8077a = null;
    }

    public final JSONObject e(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cb5ff748", new Object[]{this, jSONObject, str});
        }
        if (jSONObject == null) {
            return new JSONObject();
        }
        JSONObject jSONObject2 = new JSONObject();
        NextRPCPrefetch.INSTANCE.a(jSONObject2, str);
        Object obj = jSONObject.get("filterItem");
        if (obj == null) {
            obj = "";
        }
        jSONObject2.put((JSONObject) "filterItem", (String) obj);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put((JSONObject) "elevatorCartId", (String) jSONObject.get("lastListCartId"));
        jSONObject2.put((JSONObject) RequestConfig.CUSTOM_EXPARAMS, (String) jSONObject3);
        return jSONObject2;
    }

    public final void g(Bundle bundle, boolean z, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81e60ab2", new Object[]{this, bundle, new Boolean(z), bool});
        } else if (bundle != null) {
            ne3.a aVar = new ne3.a("RecreateWeexPage");
            aVar.tag("重新创建Weex购物车").message("重新创建Weex购物车").dimension("d1", String.valueOf(ckf.b(bool, Boolean.TRUE))).dimension("d2", String.valueOf(b)).dimension("d3", String.valueOf(z));
            ne3.Companion.c(aVar);
        }
    }

    public final void h(boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a60e84fb", new Object[]{this, new Boolean(z), jSONObject});
            return;
        }
        ckf.g(jSONObject, "extraData");
        if (z) {
            f8077a = jSONObject;
        }
    }

    public final void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2f3e582", new Object[]{this, str});
            return;
        }
        ckf.g(str, "instanceId");
        if (f8077a != null) {
            b = false;
            Pair<q3o, a3o> d = NextRPCPrefetch.INSTANCE.d(e(f8077a, str), "queryBagOnlyTabDestroy");
            q3o component1 = d.component1();
            component1.d(d.component2(), new a(component1));
            LocalBroadcastManager.getInstance(Globals.getApplication()).registerReceiver(new BroadcastReceiver() { // from class: com.taobao.android.icart.weex.recreate.RecreateQueryData$queryBagOnlyTabDestroy$receiver$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(RecreateQueryData$queryBagOnlyTabDestroy$receiver$1 recreateQueryData$queryBagOnlyTabDestroy$receiver$1, String str2, Object... objArr) {
                    str2.hashCode();
                    int hashCode = str2.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/taobao/android/icart/weex/recreate/RecreateQueryData$queryBagOnlyTabDestroy$receiver$1");
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                        return;
                    }
                    RecreateQueryData.a(RecreateQueryData.INSTANCE);
                    LocalBroadcastManager.getInstance(Globals.getApplication()).unregisterReceiver(this);
                }
            }, new IntentFilter("openCartUpdate"));
        }
    }
}
