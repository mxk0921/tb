package com.taobao.mytaobao.dataservice.datasource;

import android.os.Handler;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.taobao.android.preload.core.task.PreloadTaskEntity;
import com.taobao.mytaobao.base.MtbGlobalEnv;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.stream.IMtopStreamListener;
import com.taobao.tao.util.TaoHelper;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.util.ErrorConstant;
import tb.ckf;
import tb.cr6;
import tb.iln;
import tb.k7j;
import tb.l7j;
import tb.m0i;
import tb.m7j;
import tb.mh8;
import tb.p3j;
import tb.pl7;
import tb.t2o;
import tb.u3j;
import tb.uj3;
import tb.uv6;
import tb.w1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class PageBackServerDataSource {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final pl7 f11212a = new pl7();
    public final mh8 b = new mh8();
    public final m0i c;

    static {
        t2o.a(745537687);
    }

    public PageBackServerDataSource(m0i m0iVar) {
        ckf.h(m0iVar, "mainPageDataService");
        this.c = m0iVar;
    }

    public static final /* synthetic */ void a(PageBackServerDataSource pageBackServerDataSource, JSONObject jSONObject, cr6 cr6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2bd4e07", new Object[]{pageBackServerDataSource, jSONObject, cr6Var});
        } else {
            pageBackServerDataSource.g(jSONObject, cr6Var);
        }
    }

    public static final /* synthetic */ String b(PageBackServerDataSource pageBackServerDataSource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a94d6358", new Object[]{pageBackServerDataSource});
        }
        pageBackServerDataSource.getClass();
        return "mtop.taobao.reborn.mclaren.pageback.stream";
    }

    public static final /* synthetic */ pl7 c(PageBackServerDataSource pageBackServerDataSource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pl7) ipChange.ipc$dispatch("6f9ccafd", new Object[]{pageBackServerDataSource});
        }
        return pageBackServerDataSource.f11212a;
    }

    public static final /* synthetic */ m0i d(PageBackServerDataSource pageBackServerDataSource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m0i) ipChange.ipc$dispatch("50372c4d", new Object[]{pageBackServerDataSource});
        }
        return pageBackServerDataSource.c;
    }

    public static final /* synthetic */ boolean e(PageBackServerDataSource pageBackServerDataSource, m7j m7jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a4ed660", new Object[]{pageBackServerDataSource, m7jVar})).booleanValue();
        }
        return pageBackServerDataSource.h(m7jVar);
    }

    public final MtopBusiness f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBusiness) ipChange.ipc$dispatch("e52217c9", new Object[]{this, jSONObject});
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.taobao.reborn.mclaren.pageback.stream");
        mtopRequest.setVersion("1.0");
        JSONObject jSONObject2 = new JSONObject();
        String str = MtbGlobalEnv.i;
        if (str == null) {
            str = "";
        }
        jSONObject2.put((JSONObject) "pageLeaveUrl", str);
        if (jSONObject != null) {
            jSONObject2.putAll(jSONObject);
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(PushConstants.PARAMS, (Object) JSON.toJSONString(jSONObject2));
        MtbGlobalEnv.i = null;
        mtopRequest.setData(JSON.toJSONString(jSONObject3));
        MtopBusiness build = MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, Globals.getApplication()), mtopRequest, TaoHelper.getTTID());
        build.setUnitStrategy("UNIT_TRADE");
        build.reqMethod(MethodEnum.POST);
        return build;
    }

    public final boolean h(m7j m7jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95c6e575", new Object[]{this, m7jVar})).booleanValue();
        }
        if (m7jVar == null || !ErrorConstant.isSuccess(m7jVar.f23820a) || m7jVar.e == null) {
            return false;
        }
        return true;
    }

    public final void i(JSONObject jSONObject) {
        final cr6 a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aebf6e1a", new Object[]{this, jSONObject});
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        cr6 x = this.c.x();
        if (x != null && (a2 = x.a()) != null) {
            final long currentTimeMillis2 = System.currentTimeMillis();
            MtopBusiness f = f(jSONObject);
            final iln ilnVar = new iln(3);
            f.handler(new Handler(p3j.c()));
            f.supportStreamJson(true);
            f.streamMode(true);
            f.registerListener(new IMtopStreamListener() { // from class: com.taobao.mytaobao.dataservice.datasource.PageBackServerDataSource$request$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.stream.IMtopStreamListener
                public void onError(k7j k7jVar, int i, Object obj) {
                    String str;
                    String str2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c9471629", new Object[]{this, k7jVar, new Integer(i), obj});
                        return;
                    }
                    long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis2;
                    StringBuilder sb = new StringBuilder("retCode=");
                    String str3 = null;
                    sb.append(k7jVar != null ? k7jVar.b : null);
                    sb.append(" retMsg=");
                    if (k7jVar != null) {
                        str3 = k7jVar.c;
                    }
                    sb.append(str3);
                    String sb2 = sb.toString();
                    TLog.loge("mtbMainLink", "我淘pageback流式 onError " + sb2);
                    u3j.Companion.b(PageBackServerDataSource.b(PageBackServerDataSource.this), currentTimeMillis3, (k7jVar == null || (str2 = k7jVar.b) == null) ? "null" : str2, (k7jVar == null || (str = k7jVar.c) == null) ? "null" : str);
                }

                @Override // com.taobao.tao.stream.IMtopStreamListener
                public void onFinish(l7j l7jVar, int i, Object obj) {
                    boolean z = true;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ad3ac67", new Object[]{this, l7jVar, new Integer(i), obj});
                        return;
                    }
                    long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis2;
                    if (System.currentTimeMillis() < PageBackServerDataSource.d(PageBackServerDataSource.this).u() || PageBackServerDataSource.d(PageBackServerDataSource.this).u() < currentTimeMillis) {
                        z = false;
                    }
                    TLog.loge("mtbMainLink", "我淘pageback流式 onFinish needReturn=" + z);
                    if (!z) {
                        PageBackServerDataSource.d(PageBackServerDataSource.this).D(ilnVar, a2);
                        u3j.Companion.c(PageBackServerDataSource.b(PageBackServerDataSource.this), currentTimeMillis3);
                    }
                }

                @Override // com.taobao.tao.stream.IMtopStreamListener
                public void onReceiveData(m7j m7jVar, BaseOutDo baseOutDo, int i, Object obj) {
                    JSONObject jSONObject2;
                    w1a<iln, JSONObject, JSONObject, xhv> t;
                    byte[] bArr;
                    boolean z = true;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("99d309f1", new Object[]{this, m7jVar, baseOutDo, new Integer(i), obj});
                        return;
                    }
                    String str = null;
                    String str2 = (m7jVar == null || (bArr = m7jVar.e) == null) ? null : new String(bArr, uj3.UTF_8);
                    if (System.currentTimeMillis() < PageBackServerDataSource.d(PageBackServerDataSource.this).u() || PageBackServerDataSource.d(PageBackServerDataSource.this).u() < currentTimeMillis) {
                        z = false;
                    }
                    TLog.loge("mtbMainLink", "我淘pageback流式: needReturn=" + z + " data=" + str2);
                    if (!z) {
                        if (!PageBackServerDataSource.e(PageBackServerDataSource.this, m7jVar)) {
                            StringBuilder sb = new StringBuilder("pageBack failed, retCode=");
                            sb.append(m7jVar != null ? m7jVar.f23820a : null);
                            sb.append(" retMsg=");
                            if (m7jVar != null) {
                                str = m7jVar.b;
                            }
                            sb.append(str);
                            uv6.j(sb.toString());
                        } else if (str2 != null) {
                            JSONObject parseObject = JSON.parseObject(str2);
                            if (parseObject != null && (jSONObject2 = parseObject.getJSONObject("data")) != null) {
                                cr6 x2 = PageBackServerDataSource.d(PageBackServerDataSource.this).x();
                                if (x2 != null) {
                                    a2.t(jSONObject2);
                                    cr6 cr6Var = a2;
                                    JSONObject g = x2.g();
                                    if (g != null) {
                                        cr6Var.w(g);
                                        JSONObject jSONObject3 = jSONObject2.getJSONObject("hierarchyData");
                                        if (jSONObject3 != null) {
                                            PageBackServerDataSource.a(PageBackServerDataSource.this, jSONObject3, x2);
                                            PageBackServerDataSource.c(PageBackServerDataSource.this).a(jSONObject3, a2, x2);
                                            if (!jSONObject3.isEmpty() && (t = PageBackServerDataSource.d(PageBackServerDataSource.this).t()) != null) {
                                                iln ilnVar2 = ilnVar;
                                                JSONObject g2 = a2.g();
                                                if (g2 != null) {
                                                    t.invoke(ilnVar2, jSONObject3, g2);
                                                } else {
                                                    ckf.s();
                                                    throw null;
                                                }
                                            }
                                        }
                                    } else {
                                        ckf.s();
                                        throw null;
                                    }
                                } else {
                                    ckf.s();
                                    throw null;
                                }
                            }
                        } else {
                            ckf.s();
                            throw null;
                        }
                    }
                }
            });
            f.startRequest();
        }
    }

    public final void g(JSONObject jSONObject, cr6 cr6Var) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45748a48", new Object[]{this, jSONObject, cr6Var});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("benefitModule2024V2");
        if (jSONObject2 == null) {
            jSONObject2 = jSONObject.getJSONObject("headerModule");
        }
        if (jSONObject2 != null) {
            JSONObject jSONObject3 = cr6Var.f().getJSONObject("benefitModule2024V2");
            if (jSONObject3 == null) {
                jSONObject3 = cr6Var.f().getJSONObject("headerModule");
            }
            if (jSONObject3 != null) {
                mh8 mh8Var = this.b;
                if (this.c.m().getIntValue(PreloadTaskEntity.SOURCE_FROM) != 1) {
                    z = false;
                }
                mh8Var.q(jSONObject2, jSONObject3, false, z);
            }
        }
    }
}
