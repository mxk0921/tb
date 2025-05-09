package com.taobao.mytaobao.dataservice.datasource;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.taobao.android.preload.core.task.PreloadTaskEntity;
import com.taobao.tao.log.TLog;
import com.taobao.tao.stream.IMtopStreamListener;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.util.ErrorConstant;
import tb.ckf;
import tb.cr6;
import tb.dbo;
import tb.iln;
import tb.k7j;
import tb.l7j;
import tb.m0i;
import tb.m7j;
import tb.mh8;
import tb.n0i;
import tb.p3j;
import tb.pl7;
import tb.t2o;
import tb.u1a;
import tb.u3j;
import tb.uj3;
import tb.uv6;
import tb.w1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class MainPageServerDataSource {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final pl7 f11210a = new pl7();
    public boolean b = true;
    public final mh8 c = new mh8();
    public n0i d;
    public MainApiRequestTask e;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ cr6 b;

        public a(cr6 cr6Var) {
            this.b = cr6Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            n0i m = MainPageServerDataSource.this.m();
            if (m != null) {
                m.d(this.b);
            }
        }
    }

    static {
        t2o.a(745537683);
    }

    public static final /* synthetic */ void a(MainPageServerDataSource mainPageServerDataSource, iln ilnVar, JSONObject jSONObject, cr6 cr6Var, m0i m0iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6415e73f", new Object[]{mainPageServerDataSource, ilnVar, jSONObject, cr6Var, m0iVar});
        } else {
            mainPageServerDataSource.g(ilnVar, jSONObject, cr6Var, m0iVar);
        }
    }

    public static final /* synthetic */ void b(MainPageServerDataSource mainPageServerDataSource, iln ilnVar, JSONObject jSONObject, m0i m0iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec4013ad", new Object[]{mainPageServerDataSource, ilnVar, jSONObject, m0iVar});
        } else {
            mainPageServerDataSource.h(ilnVar, jSONObject, m0iVar);
        }
    }

    public static final /* synthetic */ void c(MainPageServerDataSource mainPageServerDataSource, iln ilnVar, JSONObject jSONObject, m0i m0iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4bec7c6", new Object[]{mainPageServerDataSource, ilnVar, jSONObject, m0iVar});
        } else {
            mainPageServerDataSource.i(ilnVar, jSONObject, m0iVar);
        }
    }

    public static final /* synthetic */ void d(MainPageServerDataSource mainPageServerDataSource, cr6 cr6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51420789", new Object[]{mainPageServerDataSource, cr6Var});
        } else {
            mainPageServerDataSource.l(cr6Var);
        }
    }

    public static final /* synthetic */ boolean e(MainPageServerDataSource mainPageServerDataSource, m7j m7jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ec8ebce", new Object[]{mainPageServerDataSource, m7jVar})).booleanValue();
        }
        return mainPageServerDataSource.n(m7jVar);
    }

    public static final /* synthetic */ void f(MainPageServerDataSource mainPageServerDataSource, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1559de8", new Object[]{mainPageServerDataSource, new Boolean(z)});
        } else {
            mainPageServerDataSource.b = z;
        }
    }

    public final void g(iln ilnVar, JSONObject jSONObject, cr6 cr6Var, m0i m0iVar) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79053ada", new Object[]{this, ilnVar, jSONObject, cr6Var, m0iVar});
            return;
        }
        uv6.j("considerDispatchDataChange 001");
        if (m0iVar != null && (jSONObject2 = jSONObject.getJSONObject("hierarchyData")) != null) {
            uv6.j("considerDispatchDataChange 002");
            cr6 x = m0iVar.x();
            j(jSONObject2, x, m0iVar);
            this.f11210a.a(jSONObject2, cr6Var, x);
            if (!jSONObject2.isEmpty()) {
                uv6.j("considerDispatchDataChange 003");
                w1a<iln, JSONObject, JSONObject, xhv> t = m0iVar.t();
                if (t != null) {
                    JSONObject g = cr6Var.g();
                    if (g != null) {
                        t.invoke(ilnVar, jSONObject2, g);
                    } else {
                        ckf.s();
                        throw null;
                    }
                }
            }
        }
    }

    public final void h(iln ilnVar, JSONObject jSONObject, m0i m0iVar) {
        JSONObject jSONObject2;
        u1a<iln, JSONObject, xhv> v;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27447d5a", new Object[]{this, ilnVar, jSONObject, m0iVar});
        } else if (m0iVar != null && (jSONObject2 = jSONObject.getJSONObject("global")) != null && (v = m0iVar.v()) != null) {
            v.invoke(ilnVar, jSONObject2);
        }
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0033ad5", new Object[]{this});
            return;
        }
        MainApiRequestTask mainApiRequestTask = this.e;
        if (mainApiRequestTask != null) {
            mainApiRequestTask.g();
        }
    }

    public final void l(cr6 cr6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbed1bf2", new Object[]{this, cr6Var});
        } else {
            p3j.a(new a(cr6Var), 1000L);
        }
    }

    public final n0i m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n0i) ipChange.ipc$dispatch("84efc6a0", new Object[]{this});
        }
        return this.d;
    }

    public final boolean n(m7j m7jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95c6e575", new Object[]{this, m7jVar})).booleanValue();
        }
        if (m7jVar == null || !ErrorConstant.isSuccess(m7jVar.f23820a) || m7jVar.e == null) {
            return false;
        }
        return true;
    }

    public final void p(n0i n0iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d321de0", new Object[]{this, n0iVar});
        } else {
            this.d = n0iVar;
        }
    }

    public final void i(iln ilnVar, JSONObject jSONObject, m0i m0iVar) {
        JSONArray jSONArray;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68ef95a1", new Object[]{this, ilnVar, jSONObject, m0iVar});
        } else if (m0iVar != null && (jSONArray = jSONObject.getJSONArray("hierarchy")) != null) {
            JSONArray jSONArray2 = new JSONArray();
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                jSONArray2.addAll(jSONArray.getJSONArray(i));
            }
            ArrayList arrayList = new ArrayList();
            int size2 = jSONArray2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
                if (!(jSONObject2 == null || (string = jSONObject2.getString(AliFestivalWVPlugin.PARAMS_MODULE_NAME)) == null)) {
                    arrayList.add(string);
                }
            }
            if (!arrayList.isEmpty()) {
                u1a<iln, List<String>, xhv> w = m0iVar.w();
                if (w != null) {
                    w.invoke(ilnVar, arrayList);
                }
                u1a<iln, JSONArray, xhv> y = m0iVar.y();
                if (y != null) {
                    y.invoke(ilnVar, jSONArray2);
                }
            }
        }
    }

    public final void j(JSONObject jSONObject, cr6 cr6Var, m0i m0iVar) {
        JSONObject jSONObject2;
        JSONObject f;
        JSONObject f2;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8d05736", new Object[]{this, jSONObject, cr6Var, m0iVar});
            return;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("benefitModule2024V2");
        if (jSONObject3 == null) {
            jSONObject3 = jSONObject.getJSONObject("headerModule");
        }
        if (jSONObject3 != null) {
            if (cr6Var == null || (f2 = cr6Var.f()) == null || (jSONObject2 = f2.getJSONObject("benefitModule2024V2")) == null) {
                jSONObject2 = (cr6Var == null || (f = cr6Var.f()) == null) ? null : f.getJSONObject("headerModule");
            }
            if (jSONObject2 != null) {
                mh8 mh8Var = this.c;
                boolean z2 = this.b;
                if (m0iVar.m().getIntValue(PreloadTaskEntity.SOURCE_FROM) != 1) {
                    z = false;
                }
                mh8Var.q(jSONObject3, jSONObject2, z2, z);
            }
        }
    }

    public final void o(final int i, final m0i m0iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0fccd71", new Object[]{this, new Integer(i), m0iVar});
        } else if (m0iVar == null || !m0iVar.z()) {
            if (m0iVar != null) {
                m0iVar.E(true);
            }
            if (m0iVar != null) {
                m0iVar.F(System.currentTimeMillis());
            }
            MainApiRequestTask mainApiRequestTask = new MainApiRequestTask(m0iVar);
            final iln ilnVar = new iln(3);
            ilnVar.a().put("requestType", Integer.valueOf(i));
            final cr6 cr6Var = new cr6(null, 1, null);
            mainApiRequestTask.i(cr6Var, ilnVar, new IMtopStreamListener() { // from class: com.taobao.mytaobao.dataservice.datasource.MainPageServerDataSource$request$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.stream.IMtopStreamListener
                public void onReceiveData(m7j m7jVar, BaseOutDo baseOutDo, int i2, Object obj) {
                    JSONObject jSONObject;
                    byte[] bArr;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("99d309f1", new Object[]{this, m7jVar, baseOutDo, new Integer(i2), obj});
                        return;
                    }
                    String str = null;
                    String str2 = (m7jVar == null || (bArr = m7jVar.e) == null) ? null : new String(bArr, uj3.UTF_8);
                    TLog.loge("mtbMainLink", "我淘主接口流式: " + str2);
                    if (!MainPageServerDataSource.e(MainPageServerDataSource.this, m7jVar)) {
                        cr6Var.r();
                        StringBuilder sb = new StringBuilder("retCode=");
                        sb.append(m7jVar != null ? m7jVar.f23820a : null);
                        sb.append(" retMsg=");
                        if (m7jVar != null) {
                            str = m7jVar.b;
                        }
                        sb.append(str);
                        String sb2 = sb.toString();
                        m0i m0iVar2 = m0iVar;
                        if (m0iVar2 != null) {
                            m0iVar2.C(sb2);
                        }
                    } else if (str2 != null) {
                        JSONObject parseObject = JSON.parseObject(str2);
                        if (parseObject != null && (jSONObject = parseObject.getJSONObject("data")) != null) {
                            cr6Var.t(jSONObject);
                            MainPageServerDataSource.b(MainPageServerDataSource.this, ilnVar, jSONObject, m0iVar);
                            MainPageServerDataSource.c(MainPageServerDataSource.this, ilnVar, jSONObject, m0iVar);
                            MainPageServerDataSource.a(MainPageServerDataSource.this, ilnVar, jSONObject, cr6Var, m0iVar);
                        }
                    } else {
                        ckf.s();
                        throw null;
                    }
                }

                @Override // com.taobao.tao.stream.IMtopStreamListener
                public void onError(k7j k7jVar, int i2, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c9471629", new Object[]{this, k7jVar, new Integer(i2), obj});
                        return;
                    }
                    m0i m0iVar2 = m0iVar;
                    if (m0iVar2 != null) {
                        m0iVar2.E(false);
                    }
                    cr6Var.r();
                    StringBuilder sb = new StringBuilder("retCode=");
                    String str = null;
                    sb.append(k7jVar != null ? k7jVar.b : null);
                    sb.append(" retMsg=");
                    if (k7jVar != null) {
                        str = k7jVar.c;
                    }
                    sb.append(str);
                    String sb2 = sb.toString();
                    TLog.loge("mtbMainLink", "我淘主接口流式 onError " + sb2);
                    m0i m0iVar3 = m0iVar;
                    if (m0iVar3 != null) {
                        m0iVar3.C(sb2);
                    }
                }

                @Override // com.taobao.tao.stream.IMtopStreamListener
                public void onFinish(l7j l7jVar, int i2, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ad3ac67", new Object[]{this, l7jVar, new Integer(i2), obj});
                        return;
                    }
                    m0i m0iVar2 = m0iVar;
                    if (m0iVar2 != null) {
                        m0iVar2.E(false);
                    }
                    MainPageServerDataSource.f(MainPageServerDataSource.this, false);
                    dbo q = cr6Var.q();
                    u3j.Companion.a(q);
                    cr6Var.s();
                    int i3 = i;
                    if (i3 == 2 || (i3 == 3 && cr6Var.l())) {
                        ilnVar.a().put("refreshBasement", Boolean.TRUE);
                    }
                    m0i m0iVar3 = m0iVar;
                    if (m0iVar3 != null) {
                        m0iVar3.D(ilnVar, cr6Var);
                    }
                    StringBuilder sb = new StringBuilder("我淘主接口流式 onFinish: ");
                    sb.append(l7jVar != null ? l7jVar.toString() : null);
                    TLog.loge("mtbMainLink", sb.toString());
                    if (q.c()) {
                        MainPageServerDataSource.d(MainPageServerDataSource.this, cr6Var);
                    }
                }
            });
            if (this.b) {
                this.e = mainApiRequestTask;
            }
        }
    }
}
