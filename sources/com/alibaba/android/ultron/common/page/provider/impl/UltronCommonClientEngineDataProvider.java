package com.alibaba.android.ultron.common.page.provider.impl;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.android.ultron.engine.template.TemplateInfo;
import com.alibaba.android.ultron.vfw.dataloader.a;
import com.alibaba.android.ultron.vfw.instance.UltronError;
import com.alibaba.android.ultron.vfw.instance.a;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.d07;
import tb.et6;
import tb.g5e;
import tb.iz;
import tb.kn6;
import tb.r6v;
import tb.rjc;
import tb.rn2;
import tb.t2o;
import tb.u55;
import tb.v6v;
import tb.w55;
import tb.w6v;
import tb.wt5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UltronCommonClientEngineDataProvider extends iz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public TemplateInfo e;
    public w55 f;
    public Map<String, Integer> g;
    public v6v h;
    public g5e.a i;
    public rn2 j;
    public String k;
    public String l;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements a.i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.alibaba.android.ultron.vfw.instance.a.i
        public void b(com.alibaba.android.ultron.vfw.dataloader.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8b672491", new Object[]{this, aVar});
            } else if (UltronCommonClientEngineDataProvider.k(UltronCommonClientEngineDataProvider.this) != null) {
                UltronCommonClientEngineDataProvider.k(UltronCommonClientEngineDataProvider.this).b(new r6v());
            }
        }

        @Override // com.alibaba.android.ultron.vfw.instance.a.i
        public void d(UltronError ultronError) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f5f75dec", new Object[]{this, ultronError});
            } else if (UltronCommonClientEngineDataProvider.k(UltronCommonClientEngineDataProvider.this) != null) {
                w6v w6vVar = new w6v();
                w6vVar.g(ultronError.code);
                w6vVar.h(ultronError.getMessage());
                UltronCommonClientEngineDataProvider.k(UltronCommonClientEngineDataProvider.this).a(ultronError.code, ultronError.getMessage(), w6vVar);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements a.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public d07 f2254a;

        public b(UltronCommonClientEngineDataProvider ultronCommonClientEngineDataProvider) {
        }

        @Override // com.alibaba.android.ultron.vfw.instance.a.h
        public void a(List<IDMComponent> list, et6 et6Var, u55 u55Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fe35e52", new Object[]{this, list, et6Var, u55Var});
                return;
            }
            if (this.f2254a == null) {
                this.f2254a = new d07(u55Var);
            }
            this.f2254a.a(list, et6Var, u55Var);
        }
    }

    static {
        t2o.a(153092132);
    }

    public static /* synthetic */ Object ipc$super(UltronCommonClientEngineDataProvider ultronCommonClientEngineDataProvider, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == 655433914) {
            super.f((Context) objArr[0], (String) objArr[1], (String) objArr[2], (JSONObject) objArr[3], (Map) objArr[4]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/ultron/common/page/provider/impl/UltronCommonClientEngineDataProvider");
        }
    }

    public static /* synthetic */ g5e.a k(UltronCommonClientEngineDataProvider ultronCommonClientEngineDataProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g5e.a) ipChange.ipc$dispatch("7c7fd55e", new Object[]{ultronCommonClientEngineDataProvider});
        }
        return ultronCommonClientEngineDataProvider.i;
    }

    public static /* synthetic */ boolean l(UltronCommonClientEngineDataProvider ultronCommonClientEngineDataProvider, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e412a79", new Object[]{ultronCommonClientEngineDataProvider, jSONObject})).booleanValue();
        }
        return ultronCommonClientEngineDataProvider.q(jSONObject);
    }

    public static /* synthetic */ void m(UltronCommonClientEngineDataProvider ultronCommonClientEngineDataProvider, g5e.a aVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab9555b8", new Object[]{ultronCommonClientEngineDataProvider, aVar, jSONObject});
        } else {
            ultronCommonClientEngineDataProvider.s(aVar, jSONObject);
        }
    }

    public static /* synthetic */ String n(UltronCommonClientEngineDataProvider ultronCommonClientEngineDataProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("25d7b9a7", new Object[]{ultronCommonClientEngineDataProvider});
        }
        return ultronCommonClientEngineDataProvider.l;
    }

    public static /* synthetic */ String o(UltronCommonClientEngineDataProvider ultronCommonClientEngineDataProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("df544f68", new Object[]{ultronCommonClientEngineDataProvider});
        }
        return ultronCommonClientEngineDataProvider.k;
    }

    @Override // tb.g5e
    public void b(Context context, JSONObject jSONObject, JSONObject jSONObject2, final g5e.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80f6af9", new Object[]{this, context, jSONObject, jSONObject2, aVar});
        } else if (this.e == null) {
            aVar.a("-1", "template info is invalid, please check your dataSource config", new w6v(-1, "-1", "-1", "template info is invalid, please check your dataSource config"));
        } else {
            w55 w55Var = this.f;
            if (w55Var == null) {
                aVar.a("-1", "mRequestBuilder is null, please init first", new w6v(-1, "-1", "-1", "mRequestBuilder is null, please init first"));
                return;
            }
            v6v v6vVar = this.h;
            if (v6vVar == null) {
                aVar.a("-1", "mCommonPageRequester is null, please init first", new w6v(-1, "-1", "-1", "mCommonPageRequester is null, please init first"));
                return;
            }
            this.i = aVar;
            v6vVar.b(w55Var, new IRemoteBaseListener() { // from class: com.alibaba.android.ultron.common.page.provider.impl.UltronCommonClientEngineDataProvider.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                private void errorCallback(MtopResponse mtopResponse, boolean z) {
                    String o;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e36d66bb", new Object[]{this, mtopResponse, new Boolean(z)});
                        return;
                    }
                    w6v w6vVar = new w6v(mtopResponse.getResponseCode(), mtopResponse.getMappingCode(), mtopResponse.getRetCode(), mtopResponse.getRetMsg());
                    w6vVar.f(z);
                    aVar.a(String.valueOf(mtopResponse.getResponseCode()), mtopResponse.getRetMsg(), w6vVar);
                    HashMap hashMap = new HashMap();
                    hashMap.put("errorCode", mtopResponse.getRetCode());
                    hashMap.put("errorMsg", mtopResponse.getRetMsg());
                    hashMap.put("pageName", UltronCommonClientEngineDataProvider.this.c);
                    hashMap.put("spm-url", UltronCommonClientEngineDataProvider.n(UltronCommonClientEngineDataProvider.this));
                    if (UltronCommonClientEngineDataProvider.o(UltronCommonClientEngineDataProvider.this) == null) {
                        o = "UltronCommonPage";
                    } else {
                        o = UltronCommonClientEngineDataProvider.o(UltronCommonClientEngineDataProvider.this);
                    }
                    UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(o, 2201, "", "", "", hashMap).build());
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else {
                        errorCallback(mtopResponse, true);
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    JSONObject jSONObject3;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    org.json.JSONObject dataJsonObject = mtopResponse.getDataJsonObject();
                    if (dataJsonObject != null) {
                        jSONObject3 = JSON.parseObject(dataJsonObject.toString());
                    } else {
                        jSONObject3 = null;
                    }
                    if (UltronCommonClientEngineDataProvider.l(UltronCommonClientEngineDataProvider.this, jSONObject3)) {
                        UltronCommonClientEngineDataProvider.m(UltronCommonClientEngineDataProvider.this, aVar, jSONObject3);
                        return;
                    }
                    if (jSONObject3 != null) {
                        String string = jSONObject3.getString("errorCode");
                        String string2 = jSONObject3.getString("errorMsg");
                        mtopResponse.setRetCode(string);
                        mtopResponse.setRetMsg(string2);
                    }
                    errorCallback(mtopResponse, false);
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else {
                        errorCallback(mtopResponse, true);
                    }
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    @Override // tb.iz, tb.g5e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f(android.content.Context r6, java.lang.String r7, java.lang.String r8, com.alibaba.fastjson.JSONObject r9, java.util.Map<java.lang.String, java.lang.String> r10) {
        /*
            r5 = this;
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = com.alibaba.android.ultron.common.page.provider.impl.UltronCommonClientEngineDataProvider.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0021
            java.lang.String r2 = "271120ba"
            r3 = 6
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r5
            r0 = 1
            r3[r0] = r6
            r6 = 2
            r3[r6] = r7
            r6 = 3
            r3[r6] = r8
            r6 = 4
            r3[r6] = r9
            r6 = 5
            r3[r6] = r10
            r1.ipc$dispatch(r2, r3)
            return
        L_0x0021:
            super.f(r6, r7, r8, r9, r10)
            r5.p()
            java.util.concurrent.ConcurrentHashMap r6 = new java.util.concurrent.ConcurrentHashMap
            r6.<init>()
            r5.g = r6
            r6 = 0
            java.lang.String r7 = tb.gj4.r     // Catch: Exception -> 0x0071
            com.alibaba.fastjson.JSONObject r7 = r9.getJSONObject(r7)     // Catch: Exception -> 0x0071
            java.lang.String r8 = tb.gj4.s     // Catch: Exception -> 0x0071
            java.lang.String r8 = r7.getString(r8)     // Catch: Exception -> 0x0071
            java.lang.String r1 = tb.gj4.t     // Catch: Exception -> 0x006b
            java.lang.String r1 = r7.getString(r1)     // Catch: Exception -> 0x006b
            java.lang.String r2 = tb.gj4.u     // Catch: Exception -> 0x0065
            java.lang.String r6 = r7.getString(r2)     // Catch: Exception -> 0x0065
            java.lang.String r2 = tb.gj4.e     // Catch: Exception -> 0x0065
            r7.getString(r2)     // Catch: Exception -> 0x0065
            java.lang.String r2 = tb.gj4.o     // Catch: Exception -> 0x0065
            com.alibaba.fastjson.JSONObject r7 = r7.getJSONObject(r2)     // Catch: Exception -> 0x0065
            if (r7 == 0) goto L_0x0079
            java.lang.String r2 = tb.gj4.p     // Catch: Exception -> 0x0065
            java.lang.String r2 = r7.getString(r2)     // Catch: Exception -> 0x0065
            r5.k = r2     // Catch: Exception -> 0x0065
            java.lang.String r2 = tb.gj4.q     // Catch: Exception -> 0x0065
            java.lang.String r7 = r7.getString(r2)     // Catch: Exception -> 0x0065
            r5.l = r7     // Catch: Exception -> 0x0065
            goto L_0x0079
        L_0x0065:
            r7 = move-exception
            r4 = r7
            r7 = r6
            r6 = r8
            r8 = r4
            goto L_0x0074
        L_0x006b:
            r7 = move-exception
            r1 = r6
            r6 = r8
        L_0x006e:
            r8 = r7
            r7 = r1
            goto L_0x0074
        L_0x0071:
            r7 = move-exception
            r1 = r6
            goto L_0x006e
        L_0x0074:
            r8.printStackTrace()
            r8 = r6
            r6 = r7
        L_0x0079:
            boolean r7 = android.text.TextUtils.isEmpty(r8)
            if (r7 != 0) goto L_0x00a6
            com.alibaba.android.ultron.engine.template.TemplateInfo r7 = new com.alibaba.android.ultron.engine.template.TemplateInfo
            r7.<init>()
            r5.e = r7
            r7.setUrl(r8)
            tb.tq6 r7 = new tb.tq6
            r7.<init>()
            java.lang.String r8 = "dataLoaderTypeClient"
            r7.h(r8)
            com.alibaba.android.ultron.engine.template.TemplateInfo r8 = r5.e
            r7.l(r8)
            r7.k(r1)
            r7.j(r6)
            r7.i(r0)
            com.alibaba.android.ultron.vfw.instance.a r6 = r5.f21656a
            r6.q0(r7)
        L_0x00a6:
            com.alibaba.android.ultron.vfw.instance.a r6 = r5.f21656a
            android.content.Context r6 = r6.getContext()
            java.lang.String r7 = tb.gj4.r
            com.alibaba.fastjson.JSONObject r7 = r9.getJSONObject(r7)
            java.lang.String r8 = tb.gj4.j
            com.alibaba.fastjson.JSONObject r7 = r7.getJSONObject(r8)
            tb.w55 r6 = tb.e6o.a(r6, r7, r10)
            r5.f = r6
            tb.v6v r6 = new tb.v6v
            r6.<init>()
            r5.h = r6
            r5.r()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.ultron.common.page.provider.impl.UltronCommonClientEngineDataProvider.f(android.content.Context, java.lang.String, java.lang.String, com.alibaba.fastjson.JSONObject, java.util.Map):void");
    }

    @Override // tb.iz
    public rjc j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rjc) ipChange.ipc$dispatch("642ca3d3", new Object[]{this});
        }
        return null;
    }

    @Override // tb.iz, tb.g5e
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        v6v v6vVar = this.h;
        if (v6vVar != null) {
            v6vVar.a();
        }
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("984829e0", new Object[]{this});
            return;
        }
        this.f21656a.v0(new a());
        if (this.j == null) {
            this.j = new rn2(new b(this));
        }
    }

    public final boolean q(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ee2e455", new Object[]{this, jSONObject})).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        return TextUtils.isEmpty(jSONObject.getString("errorCode"));
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b31a0233", new Object[]{this});
            return;
        }
        this.f21656a.B0(wt5.DX_PARSER_WALLETGETSCROLLED, new wt5(this.g));
        this.f21656a.A0(kn6.DX_EVENT_WALLETSCROLLED, new kn6(this.g));
    }

    public final void s(g5e.a aVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("550786d4", new Object[]{this, aVar, jSONObject});
            return;
        }
        try {
            a.C0075a aVar2 = new a.C0075a();
            JSONObject jSONObject2 = new JSONObject();
            if (jSONObject != null) {
                jSONObject2.put("initialState", (Object) jSONObject);
            }
            aVar2.c = jSONObject2;
            aVar2.f2326a = jSONObject;
            com.alibaba.android.ultron.vfw.dataloader.a b2 = com.alibaba.android.ultron.vfw.dataloader.a.b("initial", aVar2);
            b2.i(this.j);
            this.f21656a.h0(b2, null);
        } catch (Exception e) {
            aVar.a("-1", e.getMessage(), null);
        }
    }
}
