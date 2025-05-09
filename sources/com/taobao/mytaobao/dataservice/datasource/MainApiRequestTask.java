package com.taobao.mytaobao.dataservice.datasource;

import android.os.Handler;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import com.taobao.android.tbelder.TBElder;
import com.taobao.login4android.api.Login;
import com.taobao.mytaobao.base.MtbGlobalEnv;
import com.taobao.tao.Globals;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.stream.IMtopStreamListener;
import com.taobao.tao.util.TaoHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Ref$BooleanRef;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.intf.Mtop;
import tb.ckf;
import tb.cr6;
import tb.ej9;
import tb.iln;
import tb.k7j;
import tb.l7j;
import tb.m0i;
import tb.m7j;
import tb.p3j;
import tb.sb7;
import tb.sln;
import tb.t2o;
import tb.u3j;
import tb.uv6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class MainApiRequestTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ej9 f11209a;
    public final List<sln> b = new ArrayList();
    public boolean c = true;
    public IMtopStreamListener d;
    public final m0i e;

    static {
        t2o.a(745537680);
    }

    public MainApiRequestTask(m0i m0iVar) {
        this.e = m0iVar;
    }

    public static final /* synthetic */ boolean a(MainApiRequestTask mainApiRequestTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c99af5b", new Object[]{mainApiRequestTask})).booleanValue();
        }
        return mainApiRequestTask.f();
    }

    public static final /* synthetic */ String b(MainApiRequestTask mainApiRequestTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("af552c6d", new Object[]{mainApiRequestTask});
        }
        mainApiRequestTask.getClass();
        return "mtop.taobao.reborn.mclaren.stream";
    }

    public static final /* synthetic */ List c(MainApiRequestTask mainApiRequestTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("13476e87", new Object[]{mainApiRequestTask});
        }
        return mainApiRequestTask.b;
    }

    public static final /* synthetic */ void d(MainApiRequestTask mainApiRequestTask, ej9 ej9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c408a9c", new Object[]{mainApiRequestTask, ej9Var});
        } else {
            mainApiRequestTask.f11209a = ej9Var;
        }
    }

    public final MtopRequest e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("cd63970", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("new2021UIEnable", (Object) Boolean.valueOf(TBRevisionSwitchManager.c().d("new2021UIEnable")));
        String jSONString = JSON.toJSONString(sb7.b(Login.getUserId()).c());
        if (!TextUtils.isEmpty(jSONString)) {
            jSONObject2.put("orderFatigue", (Object) jSONString);
        }
        if (TBElder.b()) {
            jSONObject2.put("elderFont", (Object) "true");
        }
        jSONObject.put(PushConstants.PARAMS, (Object) JSON.toJSONString(jSONObject2));
        jSONObject.put("deviceLevel", (Object) String.valueOf(MtbGlobalEnv.f()));
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.taobao.reborn.mclaren.stream");
        mtopRequest.setVersion("1.0");
        mtopRequest.setData(JSON.toJSONString(jSONObject));
        return mtopRequest;
    }

    public final boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dc0468f7", new Object[]{this})).booleanValue();
        }
        m0i m0iVar = this.e;
        if (m0iVar == null || (m0iVar.v() != null && this.e.w() != null && this.e.y() != null && this.e.t() != null)) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be2e469", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public final void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a5dd1b", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public final void g() {
        ej9 ej9Var;
        IMtopStreamListener iMtopStreamListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0033ad5", new Object[]{this});
        } else if (!this.c && f() && (ej9Var = this.f11209a) != null && (iMtopStreamListener = this.d) != null && !((ArrayList) this.b).isEmpty()) {
            this.c = true;
            uv6.j("发射补偿事件");
            Iterator it = ((ArrayList) this.b).iterator();
            while (it.hasNext()) {
                sln slnVar = (sln) it.next();
                iMtopStreamListener.onReceiveData(slnVar.d(), slnVar.a(), slnVar.b(), slnVar.c());
            }
            iMtopStreamListener.onFinish(ej9Var.c(), ej9Var.a(), ej9Var.b());
            uv6.j("发射补偿事件完成");
        }
    }

    public final void i(cr6 cr6Var, iln ilnVar, final IMtopStreamListener iMtopStreamListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fba68f", new Object[]{this, cr6Var, ilnVar, iMtopStreamListener});
            return;
        }
        ckf.h(cr6Var, "dataMerger");
        ckf.h(ilnVar, "reason");
        ckf.h(iMtopStreamListener, "mtopStreamListener");
        this.d = iMtopStreamListener;
        final long currentTimeMillis = System.currentTimeMillis();
        MtopBusiness build = MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, Globals.getApplication()), e(), TaoHelper.getTTID());
        build.setUnitStrategy("UNIT_TRADE");
        build.reqMethod(MethodEnum.POST);
        build.handler(new Handler(p3j.c()));
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.element = true;
        build.streamMode(true);
        build.registerListener(new IMtopStreamListener() { // from class: com.taobao.mytaobao.dataservice.datasource.MainApiRequestTask$request$1
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
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                if (MainApiRequestTask.this.h()) {
                    iMtopStreamListener.onError(k7jVar, i, obj);
                }
                u3j.Companion.b(MainApiRequestTask.b(MainApiRequestTask.this), currentTimeMillis2, (k7jVar == null || (str2 = k7jVar.b) == null) ? "null" : str2, (k7jVar == null || (str = k7jVar.c) == null) ? "null" : str);
            }

            @Override // com.taobao.tao.stream.IMtopStreamListener
            public void onFinish(l7j l7jVar, int i, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ad3ac67", new Object[]{this, l7jVar, new Integer(i), obj});
                    return;
                }
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                if (MainApiRequestTask.this.h()) {
                    iMtopStreamListener.onFinish(l7jVar, i, obj);
                } else {
                    MainApiRequestTask.d(MainApiRequestTask.this, new ej9(l7jVar, i, obj));
                    MainApiRequestTask.this.g();
                }
                u3j.Companion.c(MainApiRequestTask.b(MainApiRequestTask.this), currentTimeMillis2);
            }

            @Override // com.taobao.tao.stream.IMtopStreamListener
            public void onReceiveData(m7j m7jVar, BaseOutDo baseOutDo, int i, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("99d309f1", new Object[]{this, m7jVar, baseOutDo, new Integer(i), obj});
                    return;
                }
                Ref$BooleanRef ref$BooleanRef2 = ref$BooleanRef;
                if (ref$BooleanRef2.element) {
                    ref$BooleanRef2.element = false;
                    MainApiRequestTask mainApiRequestTask = MainApiRequestTask.this;
                    mainApiRequestTask.j(MainApiRequestTask.a(mainApiRequestTask));
                }
                if (MainApiRequestTask.this.h()) {
                    iMtopStreamListener.onReceiveData(m7jVar, baseOutDo, i, obj);
                } else {
                    MainApiRequestTask.c(MainApiRequestTask.this).add(new sln(m7jVar, baseOutDo, i, obj));
                }
            }
        });
        build.startRequest();
    }
}
