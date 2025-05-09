package com.taobao.android.tbsku;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliConfigInterface;
import com.taobao.android.purchase.preload.TBBuyPreloadScene;
import com.taobao.android.sku.AliXSkuCore;
import com.taobao.android.sku.data.AliXSkuAsyncTask;
import com.taobao.android.sku.utils.SkuLogUtils;
import com.taobao.android.tbsku.bizevent.ContractOpenHandler;
import com.taobao.android.tbsku.channel.DetailWvPlugin;
import com.taobao.android.tbsku.channel.SkuBizBroadcastReceiver;
import com.taobao.android.tbsku.channel.SkuBizWvPlugin;
import com.taobao.android.tbsku.dialog.SkuLightoffProxy;
import com.taobao.android.tbsku.dialog.XSkuSingleScalePopWindow;
import com.taobao.android.tbsku.network.cross.RelatedAuctionsParams;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.a58;
import tb.ag0;
import tb.b8v;
import tb.c3q;
import tb.cjz;
import tb.e3q;
import tb.f3q;
import tb.fq6;
import tb.fsw;
import tb.gyh;
import tb.h0c;
import tb.k3q;
import tb.l3q;
import tb.nr0;
import tb.o2m;
import tb.t2o;
import tb.txl;
import tb.uwl;
import tb.vkb;
import tb.yo0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TBXSkuCore {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONTAINER_TYPE_NEWBUY = "newBuy";

    /* renamed from: a  reason: collision with root package name */
    public final AliXSkuCore f9556a;
    public final Context b;
    public final SkuBizBroadcastReceiver c;
    public h0c d;
    public boolean e;
    public final Map<String, JSONObject> f;
    public final Map<String, List<String>> g;
    public final Map<String, List<String>> h;
    public final Map<String, String> i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public volatile q n;
    public long o;
    public SkuSizeChartUpdateReceiver p;
    public SkuLightoffProxy q;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class SkuSizeChartUpdateReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(785383465);
        }

        public SkuSizeChartUpdateReceiver() {
        }

        public static /* synthetic */ Object ipc$super(SkuSizeChartUpdateReceiver skuSizeChartUpdateReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbsku/TBXSkuCore$SkuSizeChartUpdateReceiver");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            String p = TBXSkuCore.this.p();
            if (!TextUtils.isEmpty(p) && TBXSkuCore.c(TBXSkuCore.this).L().equals(intent.getStringExtra("skuToken")) && p.equals(intent.getStringExtra("originalItemId"))) {
                intent.getStringExtra("targetItemId");
                intent.getStringExtra("needCallback");
                TBXSkuCore.c(TBXSkuCore.this).Z(new JSONObject() { // from class: com.taobao.android.tbsku.TBXSkuCore.SkuSizeChartUpdateReceiver.1
                    {
                        put("action", "size_chart_update_detail");
                        put("params", (Object) new JSONObject() { // from class: com.taobao.android.tbsku.TBXSkuCore.SkuSizeChartUpdateReceiver.1.1
                            {
                                put("changed", "true");
                            }
                        });
                    }
                });
            }
        }

        public /* synthetic */ SkuSizeChartUpdateReceiver(TBXSkuCore tBXSkuCore, g gVar) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements o {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.android.tbsku.TBXSkuCore.o
        public void a(q qVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("497d40b9", new Object[]{this, qVar});
            } else {
                TBXSkuCore.c(TBXSkuCore.this).o();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements o {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f9559a;
        public final /* synthetic */ String b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ String d;

        public b(long j, String str, boolean z, String str2) {
            this.f9559a = j;
            this.b = str;
            this.c = z;
            this.d = str2;
        }

        @Override // com.taobao.android.tbsku.TBXSkuCore.o
        public void a(q qVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("497d40b9", new Object[]{this, qVar});
                return;
            }
            txl.h().d("threadSwitchInShowSku", "beforeWeexInitInShow", this.f9559a, System.currentTimeMillis(), null);
            if (cjz.b()) {
                TBXSkuCore tBXSkuCore = TBXSkuCore.this;
                TBXSkuCore.i(tBXSkuCore, TBXSkuCore.c(tBXSkuCore).E());
            }
            TBXSkuCore.c(TBXSkuCore.this).C0(this.b, this.c, this.d);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements o {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f9560a;

        public c(String str) {
            this.f9560a = str;
        }

        @Override // com.taobao.android.tbsku.TBXSkuCore.o
        public void a(q qVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("497d40b9", new Object[]{this, qVar});
            } else {
                TBXSkuCore.c(TBXSkuCore.this).G0(this.f9560a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements o {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f9561a;
        public final /* synthetic */ String b;

        public d(String str, String str2) {
            this.f9561a = str;
            this.b = str2;
        }

        @Override // com.taobao.android.tbsku.TBXSkuCore.o
        public void a(q qVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("497d40b9", new Object[]{this, qVar});
            } else {
                TBXSkuCore.c(TBXSkuCore.this).F0(this.f9561a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e implements o {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f9562a;
        public final /* synthetic */ String b;
        public final /* synthetic */ boolean c;

        public e(String str, String str2, boolean z) {
            this.f9562a = str;
            this.b = str2;
            this.c = z;
        }

        @Override // com.taobao.android.tbsku.TBXSkuCore.o
        public void a(q qVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("497d40b9", new Object[]{this, qVar});
                return;
            }
            JSONObject f = a58.f(this.f9562a);
            TBXSkuCore.c(TBXSkuCore.this).E0(this.b, f, this.c);
            if (cjz.b()) {
                TBXSkuCore.i(TBXSkuCore.this, f);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class f implements o {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f9563a;
        public final /* synthetic */ String b;
        public final /* synthetic */ JSONObject c;
        public final /* synthetic */ boolean d;

        public f(long j, String str, JSONObject jSONObject, boolean z) {
            this.f9563a = j;
            this.b = str;
            this.c = jSONObject;
            this.d = z;
        }

        @Override // com.taobao.android.tbsku.TBXSkuCore.o
        public void a(q qVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("497d40b9", new Object[]{this, qVar});
                return;
            }
            txl.h().d("threadSwitchInUpdateSku", "beforeWeexInitInUpdate", this.f9563a, System.currentTimeMillis(), null);
            TBXSkuCore.c(TBXSkuCore.this).E0(this.b, this.c, this.d);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class g implements AliXSkuCore.k {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bae8cdd1", new Object[]{this, jSONObject});
            } else if (jSONObject != null) {
                String string = jSONObject.getString("action");
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.putAll(jSONObject.getJSONObject("params"));
                } catch (Throwable unused) {
                }
                if ("next_page_dark_curtain".equals(string)) {
                    TBXSkuCore.a(TBXSkuCore.this, jSONObject2);
                } else if ("dark_curtain_on_action_callback".equals(string) && TBXSkuCore.b(TBXSkuCore.this) != null) {
                    TBXSkuCore.b(TBXSkuCore.this).I(jSONObject2);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class h implements o {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // com.taobao.android.tbsku.TBXSkuCore.o
        public void a(q qVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("497d40b9", new Object[]{this, qVar});
            } else if (!cjz.a()) {
                AliXSkuCore c = TBXSkuCore.c(TBXSkuCore.this);
                fq6.a aVar = qVar.f9572a;
                String str = aVar.f19464a;
                String str2 = aVar.b;
                fq6.a aVar2 = qVar.b;
                c.N(str, str2, aVar2.f19464a, aVar2.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class i implements o {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
        }

        @Override // com.taobao.android.tbsku.TBXSkuCore.o
        public void a(q qVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("497d40b9", new Object[]{this, qVar});
            } else if (!cjz.a()) {
                AliXSkuCore c = TBXSkuCore.c(TBXSkuCore.this);
                fq6.a aVar = qVar.f9572a;
                String str = aVar.f19464a;
                String str2 = aVar.b;
                fq6.a aVar2 = qVar.b;
                c.N(str, str2, aVar2.f19464a, aVar2.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class j implements o {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f9567a;

        public j(String str) {
            this.f9567a = str;
        }

        @Override // com.taobao.android.tbsku.TBXSkuCore.o
        public void a(q qVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("497d40b9", new Object[]{this, qVar});
            } else {
                TBXSkuCore.c(TBXSkuCore.this).n(this.f9567a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class k implements o {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f9568a;

        public k(String str) {
            this.f9568a = str;
        }

        @Override // com.taobao.android.tbsku.TBXSkuCore.o
        public void a(q qVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("497d40b9", new Object[]{this, qVar});
            } else {
                TBXSkuCore.c(TBXSkuCore.this).m(this.f9568a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class l implements AliXSkuCore.i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public l() {
        }

        @Override // com.taobao.android.sku.AliXSkuCore.i
        public void onError(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac367d3a", new Object[]{this, str});
                return;
            }
            TBXSkuCore.d(TBXSkuCore.this, true);
            try {
                if (TBXSkuCore.e(TBXSkuCore.this) != null) {
                    TBXSkuCore.e(TBXSkuCore.this).a(str);
                }
            } catch (Throwable unused) {
            }
            TBXSkuCore.this.m();
            SkuLogUtils.l("TBXSkuCore", str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class m extends AliXSkuAsyncTask<p, Void, q> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ o i;

        public m(o oVar) {
            this.i = oVar;
        }

        public static /* synthetic */ Object ipc$super(m mVar, String str, Object... objArr) {
            if (str.hashCode() == -1325021319) {
                super.o(objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbsku/TBXSkuCore$8");
        }

        /* renamed from: t */
        public q f(p... pVarArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (q) ipChange.ipc$dispatch("2f0fb1d7", new Object[]{this, pVarArr});
            }
            if (cjz.a()) {
                return null;
            }
            if (TBXSkuCore.f(TBXSkuCore.this) != null) {
                return TBXSkuCore.f(TBXSkuCore.this);
            }
            Context h = TBXSkuCore.h(TBXSkuCore.this);
            p pVar = pVarArr[0];
            fq6.a b = fq6.b(h, pVar.f9571a, pVar.b, pVar.c, pVar.d);
            Context h2 = TBXSkuCore.h(TBXSkuCore.this);
            p pVar2 = pVarArr[0];
            TBXSkuCore.g(TBXSkuCore.this, new q(b, fq6.a(h2, pVar2.e, pVar2.f, pVar2.g)));
            return TBXSkuCore.f(TBXSkuCore.this);
        }

        /* renamed from: u */
        public void o(q qVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94e03c88", new Object[]{this, qVar});
                return;
            }
            super.o(qVar);
            o oVar = this.i;
            if (oVar != null) {
                oVar.a(qVar);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class n implements o {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public n() {
        }

        @Override // com.taobao.android.tbsku.TBXSkuCore.o
        public void a(q qVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("497d40b9", new Object[]{this, qVar});
            } else {
                TBXSkuCore.c(TBXSkuCore.this).d0();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface o {
        void a(q qVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class p {

        /* renamed from: a  reason: collision with root package name */
        public final String f9571a;
        public final String b;
        public final Map<String, List<String>> c;
        public final Map<String, List<String>> d;
        public final String e;
        public final String f;
        public final Map<String, String> g;

        static {
            t2o.a(785383463);
        }

        public p(String str, String str2, Map<String, List<String>> map, Map<String, List<String>> map2, String str3, String str4, Map<String, String> map3) {
            if (cjz.a()) {
                SkuLogUtils.x("SkuAsyncTaskInput_init");
            }
            this.f9571a = str;
            this.b = str2;
            this.c = map;
            this.d = map2;
            this.e = str3;
            this.f = str4;
            this.g = map3;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class q {

        /* renamed from: a  reason: collision with root package name */
        public final fq6.a f9572a;
        public final fq6.a b;

        static {
            t2o.a(785383464);
        }

        public q(fq6.a aVar, fq6.a aVar2) {
            if (cjz.a()) {
                SkuLogUtils.x("SkuAsyncTaskOutput_init");
            }
            this.f9572a = aVar;
            this.b = aVar2;
        }
    }

    static {
        t2o.a(785383442);
    }

    public TBXSkuCore(Context context) {
        this(context, null);
        this.b = context;
    }

    public static void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1aad5ed7", new Object[0]);
        } else {
            fsw.h(DetailWvPlugin.NAME, DetailWvPlugin.class);
        }
    }

    public static /* synthetic */ void a(TBXSkuCore tBXSkuCore, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("118aa1cb", new Object[]{tBXSkuCore, jSONObject});
        } else {
            tBXSkuCore.A(jSONObject);
        }
    }

    public static /* synthetic */ SkuLightoffProxy b(TBXSkuCore tBXSkuCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SkuLightoffProxy) ipChange.ipc$dispatch("15b4f4b5", new Object[]{tBXSkuCore});
        }
        return tBXSkuCore.q;
    }

    public static /* synthetic */ AliXSkuCore c(TBXSkuCore tBXSkuCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliXSkuCore) ipChange.ipc$dispatch("b00e3385", new Object[]{tBXSkuCore});
        }
        return tBXSkuCore.f9556a;
    }

    public static /* synthetic */ boolean d(TBXSkuCore tBXSkuCore, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("647c6ab8", new Object[]{tBXSkuCore, new Boolean(z)})).booleanValue();
        }
        tBXSkuCore.e = z;
        return z;
    }

    public static /* synthetic */ h0c e(TBXSkuCore tBXSkuCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h0c) ipChange.ipc$dispatch("eaa7cf19", new Object[]{tBXSkuCore});
        }
        return tBXSkuCore.d;
    }

    public static /* synthetic */ q f(TBXSkuCore tBXSkuCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q) ipChange.ipc$dispatch("eb60e6e1", new Object[]{tBXSkuCore});
        }
        return tBXSkuCore.n;
    }

    public static /* synthetic */ q g(TBXSkuCore tBXSkuCore, q qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q) ipChange.ipc$dispatch("8c40d9d8", new Object[]{tBXSkuCore, qVar});
        }
        tBXSkuCore.n = qVar;
        return qVar;
    }

    public static /* synthetic */ Context h(TBXSkuCore tBXSkuCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("409aaff7", new Object[]{tBXSkuCore});
        }
        return tBXSkuCore.b;
    }

    public static /* synthetic */ void i(TBXSkuCore tBXSkuCore, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17301752", new Object[]{tBXSkuCore, jSONObject});
        } else {
            tBXSkuCore.G(jSONObject);
        }
    }

    public static /* synthetic */ Map j(TBXSkuCore tBXSkuCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5c7cf432", new Object[]{tBXSkuCore});
        }
        return tBXSkuCore.f;
    }

    public static /* synthetic */ void k(TBXSkuCore tBXSkuCore, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f96334e6", new Object[]{tBXSkuCore, str});
        } else {
            tBXSkuCore.U(str);
        }
    }

    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8d42c4", new Object[]{this});
        } else {
            this.f9556a.c0();
        }
    }

    public void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2666408", new Object[]{this});
        } else {
            z(new n());
        }
    }

    public final void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("165741c2", new Object[]{this});
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.taobao.sku.intent.action.sizeChartUpdate");
        intentFilter.addCategory("android.intent.category.DEFAULT");
        SkuSizeChartUpdateReceiver skuSizeChartUpdateReceiver = new SkuSizeChartUpdateReceiver(this, null);
        this.p = skuSizeChartUpdateReceiver;
        this.b.registerReceiver(skuSizeChartUpdateReceiver, intentFilter);
    }

    public void F(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cfe67f5", new Object[]{this, str, jSONObject});
        } else {
            this.f9556a.k0(str, jSONObject);
        }
    }

    public final void G(JSONObject jSONObject) {
        JSONArray jSONArray;
        JSONObject e2;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ea7b3ec", new Object[]{this, jSONObject});
            return;
        }
        final String p2 = p();
        if (!TextUtils.isEmpty(p2)) {
            nr0 z = this.f9556a.z();
            if (z == null || (e2 = z.e()) == null || (jSONObject2 = e2.getJSONObject("id_biz_relatedAuctions")) == null || !jSONObject2.getBooleanValue("gone")) {
                try {
                    if (jSONObject.getJSONObject("resource").getJSONObject("relatedAuctions").getBooleanValue("useLocalPrice")) {
                        return;
                    }
                } catch (Throwable unused) {
                }
                JSONObject jSONObject3 = (JSONObject) ((ConcurrentHashMap) this.f).get(p2);
                if (jSONObject3 == null || jSONObject3.isEmpty()) {
                    try {
                        jSONArray = jSONObject.getJSONObject("resource").getJSONObject("relatedAuctions").getJSONArray("items");
                    } catch (Throwable unused2) {
                        jSONArray = null;
                    }
                    if (jSONArray != null && !jSONArray.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        Iterator<Object> it = jSONArray.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            if (next instanceof JSONObject) {
                                String string = ((JSONObject) next).getString("itemId");
                                if (!TextUtils.isEmpty(string)) {
                                    arrayList.add(string);
                                }
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            if (cjz.a()) {
                                SkuLogUtils.x("TBXSkuCore.sendRelatedAuctionsData" + JSON.toJSONString(arrayList));
                            }
                            k3q k3qVar = new k3q(this.b, new RelatedAuctionsParams(arrayList));
                            k3qVar.b(new IRemoteBaseListener() { // from class: com.taobao.android.tbsku.TBXSkuCore.18
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                                public void onError(int i2, MtopResponse mtopResponse, Object obj) {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i2), mtopResponse, obj});
                                    }
                                }

                                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                                public void onSuccess(int i2, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                                    JSONObject parseObject;
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i2), mtopResponse, baseOutDo, obj});
                                    } else if (mtopResponse != null) {
                                        String str = new String(mtopResponse.getBytedata());
                                        if (!TextUtils.isEmpty(str) && (parseObject = JSON.parseObject(str)) != null && parseObject.getJSONObject("data") != null) {
                                            TBXSkuCore.j(TBXSkuCore.this).put(p2, parseObject.getJSONObject("data"));
                                            TBXSkuCore.k(TBXSkuCore.this, p2);
                                        }
                                    }
                                }

                                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                                public void onSystemError(int i2, MtopResponse mtopResponse, Object obj) {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i2), mtopResponse, obj});
                                    }
                                }
                            });
                            k3qVar.a();
                        }
                    }
                }
            }
        }
    }

    public void H(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebb992ba", new Object[]{this, str});
        } else {
            this.f9556a.l0(str);
        }
    }

    public void I(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8853690d", new Object[]{this, str});
        } else {
            this.f9556a.m0(str);
        }
    }

    public void J(h0c h0cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae82b5ae", new Object[]{this, h0cVar});
        } else {
            this.d = h0cVar;
        }
    }

    public void K(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21928974", new Object[]{this, jSONObject});
        } else {
            this.f9556a.r0(jSONObject);
        }
    }

    public void L(vkb vkbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2e48b11", new Object[]{this, vkbVar});
        } else {
            this.f9556a.n0(vkbVar);
        }
    }

    public void M(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37798f30", new Object[]{this, jSONObject});
        } else {
            this.f9556a.x0(jSONObject);
        }
    }

    public void N(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e0aad8", new Object[]{this, str});
        } else {
            this.f9556a.z0(str);
        }
    }

    public void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97ac4167", new Object[]{this});
        } else {
            P(UUID.randomUUID().toString());
        }
    }

    public void P(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d07f71", new Object[]{this, str});
        } else {
            Q(str, true);
        }
    }

    public void Q(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30402183", new Object[]{this, str, new Boolean(z)});
        } else {
            R(str, z, null);
        }
    }

    public final void R(String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57cf108d", new Object[]{this, str, new Boolean(z), str2});
            return;
        }
        d0();
        z(new b(System.currentTimeMillis(), str, z, str2));
    }

    public void S(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd010921", new Object[]{this, str});
        } else {
            R(UUID.randomUUID().toString(), false, str);
        }
    }

    public final void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4570959b", new Object[]{this});
            return;
        }
        try {
            SkuSizeChartUpdateReceiver skuSizeChartUpdateReceiver = this.p;
            if (skuSizeChartUpdateReceiver != null) {
                this.b.unregisterReceiver(skuSizeChartUpdateReceiver);
            }
        } catch (Throwable unused) {
        }
    }

    public final void U(String str) {
        JSONObject jSONObject;
        JSONObject e2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd4f4e3", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str) && (jSONObject = (JSONObject) ((ConcurrentHashMap) this.f).get(str)) != null && !jSONObject.isEmpty()) {
            nr0 z = this.f9556a.z();
            JSONObject jSONObject2 = (z == null || (e2 = z.e()) == null) ? null : e2.getJSONObject("id_biz_relatedAuctions");
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            jSONObject2.put("relatedAuction", (Object) jSONObject);
            this.f9556a.x0(new JSONObject(jSONObject2) { // from class: com.taobao.android.tbsku.TBXSkuCore.16
                public final /* synthetic */ JSONObject val$extRelatedAuctions;

                {
                    this.val$extRelatedAuctions = jSONObject2;
                    put("id_biz_relatedAuctions", (Object) jSONObject2);
                }
            });
            if (!cjz.a()) {
                b8v e3 = this.f9556a.K().getEventHandler().e();
                e3.t(ag0.EVENT_TYPE);
                e3.r(new DMEvent(ag0.EVENT_TYPE, new JSONObject() { // from class: com.taobao.android.tbsku.TBXSkuCore.17
                    {
                        put("subType", "relatedAuctionUpdated");
                        put("payload", (Object) new JSONObject() { // from class: com.taobao.android.tbsku.TBXSkuCore.17.1
                        });
                    }
                }, null));
                this.f9556a.K().getEventHandler().k(e3);
            }
        }
    }

    public void V(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2021a435", new Object[]{this, jSONObject});
        } else {
            X(UUID.randomUUID().toString(), jSONObject, false);
        }
    }

    public void W(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e413953f", new Object[]{this, jSONObject, new Boolean(z)});
        } else {
            X(UUID.randomUUID().toString(), jSONObject, z);
        }
    }

    public void X(String str, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a194cbc9", new Object[]{this, str, jSONObject, new Boolean(z)});
        } else {
            z(new f(System.currentTimeMillis(), str, jSONObject, z));
        }
    }

    public void Y(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47675f05", new Object[]{this, str, str2, new Boolean(z)});
        } else {
            z(new e(str2, str, z));
        }
    }

    public void Z(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1539984f", new Object[]{this, str, new Boolean(z)});
        } else {
            Y(UUID.randomUUID().toString(), str, z);
        }
    }

    public void a0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58745bbf", new Object[]{this, str});
        } else {
            b0(UUID.randomUUID().toString(), str);
        }
    }

    public void b0(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2917b3c9", new Object[]{this, str, str2});
        } else {
            z(new d(str, str2));
        }
    }

    public void c0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6968549", new Object[]{this, str});
        } else {
            z(new c(str));
        }
    }

    public final void d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee279834", new Object[]{this});
            return;
        }
        try {
            long c2 = uwl.c(this.f9556a.z().e().getJSONObject("skuTimeStamp"));
            if (c2 > 0) {
                long j2 = this.o;
                txl.h().d("btnClick", TBBuyPreloadScene.NAV, c2, j2 == 0 ? c2 : j2, null);
                this.o = 0L;
            }
        } catch (Throwable unused) {
        }
    }

    public void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("827b6981", new Object[]{this, str});
            return;
        }
        if (cjz.a()) {
            SkuLogUtils.x("TBXSkuCore.checkSkuId");
        }
        z(new k(str));
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            n(UUID.randomUUID().toString());
        }
    }

    public void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c60d430b", new Object[]{this, str});
            return;
        }
        z(new j(str));
        try {
            this.b.unregisterReceiver(this.c);
        } catch (Exception unused) {
        }
        T();
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c142d9", new Object[]{this});
        } else {
            z(new a());
        }
    }

    public String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("beb1faf5", new Object[]{this});
        }
        return this.f9556a.B();
    }

    public AliXSkuCore q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliXSkuCore) ipChange.ipc$dispatch("af5ec41b", new Object[]{this});
        }
        return this.f9556a;
    }

    public void s(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f242af", new Object[]{this, jSONObject});
            return;
        }
        txl.h().p("beforeMtop", null);
        txl.h().q("afterMtop", "container");
        txl.h().q("initData", "afterMtop");
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject g2 = a58.g(jSONObject);
        txl.h().d("parseJsonInInitSku", "initData", currentTimeMillis, System.currentTimeMillis(), null);
        this.f9556a.O(g2);
        this.f9556a.S();
        u();
        if (cjz.b()) {
            w(this.f9556a);
        }
        txl.h().p("initData", null);
        z(new i());
    }

    public void t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e007beb", new Object[]{this, str});
            return;
        }
        txl.h().p("beforeMtop", null);
        txl.h().q("afterMtop", "container");
        txl.h().q("initData", "afterMtop");
        this.f9556a.O(a58.f(str));
        this.f9556a.S();
        u();
        if (cjz.b()) {
            w(this.f9556a);
        }
        txl.h().p("initData", null);
        z(new h());
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3e40120", new Object[]{this});
        } else {
            this.f9556a.q0(new l());
        }
    }

    public final void v(AliXSkuCore aliXSkuCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a30ad69", new Object[]{this, aliXSkuCore});
        } else {
            aliXSkuCore.t0(new g());
        }
    }

    public final void w(AliXSkuCore aliXSkuCore) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("893b5088", new Object[]{this, aliXSkuCore});
            return;
        }
        aliXSkuCore.A().d(o2m.EVENT_TYPE, new o2m());
        aliXSkuCore.A().d(gyh.EVENT_TYPE, new gyh());
        aliXSkuCore.A().d(ContractOpenHandler.EVENT_TYPE, new ContractOpenHandler());
        aliXSkuCore.A().d(l3q.EVENT_TYPE, new l3q());
        aliXSkuCore.A().d(f3q.EVENT_TYPE, new f3q());
        aliXSkuCore.A().d(e3q.EVENT_TYPE, new e3q());
        aliXSkuCore.A().b().q(c3q.EVENT_TYPE, new c3q());
    }

    public boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e55c06aa", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public final void z(o oVar) {
        p pVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("807fdd26", new Object[]{this, oVar});
            return;
        }
        m mVar = new m(oVar);
        if (cjz.a()) {
            pVar = null;
        } else {
            pVar = new p(this.l, this.m, this.g, this.h, this.j, this.k, this.i);
        }
        mVar.g(pVar);
    }

    public final boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("10ba714e", new Object[]{this})).booleanValue();
        }
        JSONObject n2 = this.f9556a.z().n();
        if (n2 == null || n2.getJSONObject("feature") == null) {
            return false;
        }
        AliConfigInterface b2 = yo0.b();
        if (b2 == null || Boolean.parseBoolean(b2.getConfig("android_sku", "XLightOffEnable", "true"))) {
            return "true".equalsIgnoreCase(n2.getJSONObject("feature").getString("skuLightOff"));
        }
        SkuLogUtils.j("[XLightOff]TBXSkuCore", "orange android_sku XLightOffEnable:false");
        return false;
    }

    public TBXSkuCore(Context context, String str) {
        this.f = new ConcurrentHashMap();
        this.g = new LinkedHashMap();
        this.h = new LinkedHashMap();
        this.i = new LinkedHashMap();
        this.j = "file:///android_asset/script/skuCore_uglify.js";
        this.k = "f6f887a75821f279ad1b03fb1243a3e1";
        this.l = "file:///android_asset/ultron/originalUltronData_uglify.json";
        this.m = "83b9ce346f98acab1f171b816b9a0b69";
        if (context != null) {
            this.o = System.currentTimeMillis();
            txl.h().q("beforeMtop", "container");
            this.b = context;
            AliXSkuCore aliXSkuCore = new AliXSkuCore(context, SkuLogUtils.DEFAULT_BIZ_NAME, str);
            this.f9556a = aliXSkuCore;
            v(aliXSkuCore);
            fsw.h(SkuBizWvPlugin.NAME, SkuBizWvPlugin.class);
            E();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.taobao.sku.intent.action.transferData");
            intentFilter.addCategory("android.intent.category.DEFAULT");
            SkuBizBroadcastReceiver skuBizBroadcastReceiver = new SkuBizBroadcastReceiver(this, str);
            this.c = skuBizBroadcastReceiver;
            context.registerReceiver(skuBizBroadcastReceiver, intentFilter);
            D();
            return;
        }
        throw new IllegalArgumentException("params context can not be null");
    }

    public final void A(JSONObject jSONObject) {
        boolean z = true;
        z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae25eca8", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            JSONArray jSONArray = jSONObject.getJSONArray("imageInfoList");
            JSONObject jSONObject2 = jSONObject.getJSONObject("currentImage");
            JSONArray jSONArray2 = jSONObject.getJSONArray("clickImgRect");
            String string = jSONObject.getString("from");
            String string2 = jSONObject.getString("skuBaseNotDisplayed");
            String string3 = jSONObject.getString("bottomMode");
            String string4 = jSONObject.getString("skuLightoffDowngrade");
            String string5 = jSONObject.getString("containerType");
            JSONArray jSONArray3 = jSONObject.getJSONArray("propImagesForSelect");
            boolean r = r();
            boolean equals = CONTAINER_TYPE_NEWBUY.equals(string5);
            if (!r || "true".equals(string4)) {
                z = false;
            }
            if (!equals || !y()) {
            }
            if (z) {
                SkuLightoffProxy skuLightoffProxy = new SkuLightoffProxy(this.b, string, jSONObject2, jSONArray, jSONArray3, jSONArray2, string2, string3, this.f9556a.A().a(), equals);
                this.q = skuLightoffProxy;
                skuLightoffProxy.O();
                return;
            }
            new XSkuSingleScalePopWindow(this.b, jSONObject2, jSONArray, this.f9556a.A().a()).j();
        }
    }

    public final boolean y() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c04c976f", new Object[]{this})).booleanValue();
        }
        JSONObject n2 = this.f9556a.z().n();
        return n2 == null || (jSONObject = n2.getJSONObject("newbuyLightOff")) == null || jSONObject.isEmpty();
    }
}
