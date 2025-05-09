package com.taobao.tbpoplayer.nativerender;

import android.text.TextUtils;
import android.widget.Toast;
import anetwork.channel.NetworkCallBack;
import anetwork.channel.NetworkEvent;
import anetwork.channel.Request;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import anetwork.channel.entity.StringParam;
import com.alibaba.ability.hub.AbilityHubAdapter;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.layermanager.PopRequest;
import com.alibaba.poplayer.track.UserResultTrack;
import com.alibaba.poplayer.track.module.ActionLineModule;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.address.wrapper.weex.WXAddressModule2;
import com.taobao.message.message_open_api.ICallService;
import com.taobao.tao.TaoPackageInfo;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tbpoplayer.nativerender.PopAction;
import com.taobao.tbpoplayer.nativerender.dsl.ActionModel;
import com.taobao.tbpoplayer.nativerender.dsl.ActionsItemModel;
import com.taobao.tbpoplayer.nativerender.dsl.ComponentBaseModel;
import com.taobao.tbpoplayer.nativerender.dsl.ConditionModel;
import com.taobao.tbpoplayer.view.jsbridge.PopLayerJsBridgeAction;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import tb.a1n;
import tb.af4;
import tb.c4o;
import tb.ell;
import tb.g0u;
import tb.hji;
import tb.jlj;
import tb.kmj;
import tb.me8;
import tb.msc;
import tb.oe8;
import tb.pg1;
import tb.plj;
import tb.qtv;
import tb.rg0;
import tb.s2d;
import tb.t2o;
import tb.wdm;
import tb.xq;
import tb.zq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class PopAction {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_USER_RESULT_CANCEL = "cancel";
    public static final String ACTION_USER_RESULT_CLICK = "click";

    /* compiled from: Taobao */
    /* renamed from: com.taobao.tbpoplayer.nativerender.PopAction$8  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class AnonymousClass8 implements IRemoteBaseListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ JSONObject val$actionContent;
        public final /* synthetic */ m val$actionContext;
        public final /* synthetic */ BaseConfigItem val$configFromRequest;
        public final /* synthetic */ String val$dataId;
        public final /* synthetic */ oe8 val$engineCore;
        public final /* synthetic */ boolean val$needCallBack;
        public final /* synthetic */ boolean val$needHandleResponse;
        public final /* synthetic */ boolean val$needLogin;
        public final /* synthetic */ boolean val$originEmbed;

        public AnonymousClass8(boolean z, BaseConfigItem baseConfigItem, boolean z2, oe8 oe8Var, m mVar, JSONObject jSONObject, boolean z3, boolean z4, String str) {
            this.val$needLogin = z;
            this.val$configFromRequest = baseConfigItem;
            this.val$originEmbed = z2;
            this.val$engineCore = oe8Var;
            this.val$actionContext = mVar;
            this.val$actionContent = jSONObject;
            this.val$needHandleResponse = z3;
            this.val$needCallBack = z4;
            this.val$dataId = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onError$56(m mVar, JSONObject jSONObject, MtopResponse mtopResponse, boolean z, boolean z2) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c2f81ee", new Object[]{mVar, jSONObject, mtopResponse, new Boolean(z), new Boolean(z2)});
                return;
            }
            StringBuilder sb = new StringBuilder("MtopOnError.retCode=%s");
            if (mtopResponse != null) {
                str = mtopResponse.getRetCode();
            } else {
                str = "";
            }
            sb.append(str);
            PopAction.m(mVar, jSONObject, false, sb.toString(), z, z2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onSuccess$55(MtopResponse mtopResponse, oe8 oe8Var, String str, m mVar, JSONObject jSONObject, boolean z, boolean z2) {
            String str2;
            JSONObject jSONObject2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("31b5a41c", new Object[]{mtopResponse, oe8Var, str, mVar, jSONObject, new Boolean(z), new Boolean(z2)});
                return;
            }
            if (mtopResponse != null && mtopResponse.isApiSuccess()) {
                try {
                    byte[] bytedata = mtopResponse.getBytedata();
                    if (bytedata != null) {
                        str2 = new String(bytedata, "UTF-8");
                    } else {
                        str2 = "";
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        jSONObject2 = JSON.parseObject(str2).getJSONObject("data");
                    } else {
                        jSONObject2 = null;
                    }
                    if (jSONObject2 != null && !jSONObject2.isEmpty()) {
                        oe8Var.z(str, jSONObject2);
                    }
                    if (PopAction.n(mVar, jSONObject)) {
                        PopAction.m(mVar, jSONObject, true, "", z, z2);
                        return;
                    }
                } catch (Throwable th) {
                    wdm.h("dealPreFetchMTOP.parseObject.responseContent.error.", th);
                }
            }
            PopAction.m(mVar, jSONObject, false, "MtopOnSuccess.ResponseIsNullOrFail", z, z2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onSystemError$54(m mVar, JSONObject jSONObject, MtopResponse mtopResponse, boolean z, boolean z2) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c1e6fc1", new Object[]{mVar, jSONObject, mtopResponse, new Boolean(z), new Boolean(z2)});
                return;
            }
            StringBuilder sb = new StringBuilder("MtopOnSystemError.retCode=");
            if (mtopResponse != null) {
                str = mtopResponse.getRetCode();
            } else {
                str = "";
            }
            sb.append(str);
            PopAction.m(mVar, jSONObject, false, sb.toString(), z, z2);
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, final MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            try {
                if (this.val$needLogin) {
                    this.val$configFromRequest.embed = this.val$originEmbed;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            oe8 oe8Var = this.val$engineCore;
            final m mVar = this.val$actionContext;
            final JSONObject jSONObject = this.val$actionContent;
            final boolean z = this.val$needHandleResponse;
            final boolean z2 = this.val$needCallBack;
            oe8Var.w(new Runnable() { // from class: tb.oam
                @Override // java.lang.Runnable
                public final void run() {
                    PopAction.AnonymousClass8.lambda$onError$56(PopAction.m.this, jSONObject, mtopResponse, z, z2);
                }
            });
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, final MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                return;
            }
            try {
                if (this.val$needLogin) {
                    this.val$configFromRequest.embed = this.val$originEmbed;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            final oe8 oe8Var = this.val$engineCore;
            final String str = this.val$dataId;
            final m mVar = this.val$actionContext;
            final JSONObject jSONObject = this.val$actionContent;
            final boolean z = this.val$needHandleResponse;
            final boolean z2 = this.val$needCallBack;
            oe8Var.w(new Runnable() { // from class: tb.pam
                @Override // java.lang.Runnable
                public final void run() {
                    PopAction.AnonymousClass8.lambda$onSuccess$55(MtopResponse.this, oe8Var, str, mVar, jSONObject, z, z2);
                }
            });
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, final MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            try {
                if (this.val$needLogin) {
                    this.val$configFromRequest.embed = this.val$originEmbed;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            oe8 oe8Var = this.val$engineCore;
            final m mVar = this.val$actionContext;
            final JSONObject jSONObject = this.val$actionContent;
            final boolean z = this.val$needHandleResponse;
            final boolean z2 = this.val$needCallBack;
            oe8Var.w(new Runnable() { // from class: tb.qam
                @Override // java.lang.Runnable
                public final void run() {
                    PopAction.AnonymousClass8.lambda$onSystemError$54(PopAction.m.this, jSONObject, mtopResponse, z, z2);
                }
            });
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a extends TypeReference<ArrayList<String>> {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b extends TypeReference<ArrayList<String>> {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class c extends TypeReference<ArrayList<String>> {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class d extends TypeReference<ArrayList<String>> {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class e implements n {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f13401a;
        public final /* synthetic */ jlj b;
        public final /* synthetic */ ActionModel c;

        public e(JSONObject jSONObject, jlj jljVar, ActionModel actionModel) {
            this.f13401a = jSONObject;
            this.b = jljVar;
            this.c = actionModel;
        }

        @Override // com.taobao.tbpoplayer.nativerender.PopAction.n
        public void a(m mVar, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ed3c38df", new Object[]{this, mVar, str, str2});
                return;
            }
            PopAction.i(mVar, this.f13401a, str);
            PopAction.j(this.b, false, this.c);
        }

        @Override // com.taobao.tbpoplayer.nativerender.PopAction.n
        public void b(m mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("98f2c4d2", new Object[]{this, mVar});
                return;
            }
            PopAction.i(mVar, this.f13401a, "");
            PopAction.j(this.b, true, this.c);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class f implements n {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ActionModel f13402a;
        public final /* synthetic */ JSONArray b;
        public final /* synthetic */ ActionLineModule c;
        public final /* synthetic */ AtomicInteger d;
        public final /* synthetic */ o e;
        public final /* synthetic */ jlj f;
        public final /* synthetic */ ComponentBaseModel g;
        public final /* synthetic */ String h;
        public final /* synthetic */ Map i;

        public f(ActionModel actionModel, JSONArray jSONArray, ActionLineModule actionLineModule, AtomicInteger atomicInteger, o oVar, jlj jljVar, ComponentBaseModel componentBaseModel, String str, Map map) {
            this.f13402a = actionModel;
            this.b = jSONArray;
            this.c = actionLineModule;
            this.d = atomicInteger;
            this.e = oVar;
            this.f = jljVar;
            this.g = componentBaseModel;
            this.h = str;
            this.i = map;
        }

        public static /* synthetic */ void e(AtomicInteger atomicInteger, o oVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("22e9e7d8", new Object[]{atomicInteger, oVar});
            } else {
                PopAction.k(atomicInteger, oVar);
            }
        }

        public static /* synthetic */ void f(AtomicInteger atomicInteger, o oVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0b4b44a", new Object[]{atomicInteger, oVar});
            } else {
                PopAction.k(atomicInteger, oVar);
            }
        }

        @Override // com.taobao.tbpoplayer.nativerender.PopAction.n
        public void a(m mVar, String str, String str2) {
            List<String> list;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ed3c38df", new Object[]{this, mVar, str, str2});
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("actionBehavior", (Object) this.f13402a.behavior);
                jSONObject.put("actionExceptionMessage", (Object) str);
                this.b.add(jSONObject);
                ActionLineModule.ActionExecuteItem actionExecuteItem = new ActionLineModule.ActionExecuteItem();
                actionExecuteItem.act = this.f13402a.behavior;
                actionExecuteItem.exp = str;
                this.c.actions.get(0).executes.add(actionExecuteItem);
                List<String> list2 = this.f13402a.fallbackActions;
                if (list2 == null || list2.isEmpty()) {
                    list = this.f13402a.fallbackNextActions;
                } else {
                    list = this.f13402a.fallbackActions;
                }
                if (list != null && !list.isEmpty()) {
                    jlj jljVar = this.f;
                    ComponentBaseModel componentBaseModel = this.g;
                    String str3 = this.h;
                    Map map = this.i;
                    JSONArray jSONArray = this.b;
                    ActionLineModule actionLineModule = this.c;
                    final AtomicInteger atomicInteger = this.d;
                    final o oVar = this.e;
                    PopAction.l(jljVar, componentBaseModel, str3, list, map, jSONArray, actionLineModule, new o() { // from class: tb.nam
                        @Override // com.taobao.tbpoplayer.nativerender.PopAction.o
                        public final void a() {
                            PopAction.f.e(atomicInteger, oVar);
                        }
                    });
                    return;
                }
                PopAction.k(this.d, this.e);
            } catch (Throwable th) {
                wdm.h("PopAction.iterateActionTree.onFail.error.", th);
            }
        }

        @Override // com.taobao.tbpoplayer.nativerender.PopAction.n
        public void b(m mVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("98f2c4d2", new Object[]{this, mVar});
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("actionBehavior", (Object) this.f13402a.behavior);
                jSONObject.put("actionExceptionMessage", (Object) "");
                this.b.add(jSONObject);
                ActionLineModule.ActionExecuteItem actionExecuteItem = new ActionLineModule.ActionExecuteItem();
                actionExecuteItem.act = this.f13402a.behavior;
                actionExecuteItem.exp = "";
                this.c.actions.get(0).executes.add(actionExecuteItem);
                List<String> list = this.f13402a.nextActions;
                if (list != null && !list.isEmpty()) {
                    jlj jljVar = this.f;
                    ComponentBaseModel componentBaseModel = this.g;
                    String str = this.h;
                    List<String> list2 = this.f13402a.nextActions;
                    Map map = this.i;
                    JSONArray jSONArray = this.b;
                    ActionLineModule actionLineModule = this.c;
                    final AtomicInteger atomicInteger = this.d;
                    final o oVar = this.e;
                    PopAction.l(jljVar, componentBaseModel, str, list2, map, jSONArray, actionLineModule, new o() { // from class: tb.mam
                        @Override // com.taobao.tbpoplayer.nativerender.PopAction.o
                        public final void a() {
                            PopAction.f.f(atomicInteger, oVar);
                        }
                    });
                    return;
                }
                PopAction.k(this.d, this.e);
            } catch (Throwable th) {
                wdm.h("PopAction.iterateActionTree.onSuccess.error.", th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class g extends TypeReference<List<String>> {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class h extends TypeReference<List<String>> {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class i extends TypeReference<List<String>> {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class j extends TypeReference<List<String>> {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class k implements msc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.jdb
        public void O(ErrorResult errorResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14182866", new Object[]{this, errorResult});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class l implements kmj.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ oe8 f13403a;
        public final /* synthetic */ String b;
        public final /* synthetic */ m c;
        public final /* synthetic */ JSONObject d;
        public final /* synthetic */ boolean e;
        public final /* synthetic */ boolean f;

        public l(oe8 oe8Var, String str, m mVar, JSONObject jSONObject, boolean z, boolean z2) {
            this.f13403a = oe8Var;
            this.b = str;
            this.c = mVar;
            this.d = jSONObject;
            this.e = z;
            this.f = z2;
        }

        public static /* synthetic */ void c(m mVar, JSONObject jSONObject, String str, boolean z, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c215e9e", new Object[]{mVar, jSONObject, str, new Boolean(z), new Boolean(z2)});
                return;
            }
            PopAction.m(mVar, jSONObject, false, "WindvaneOnFailed.result=" + str, z, z2);
        }

        public static /* synthetic */ void d(String str, oe8 oe8Var, String str2, m mVar, JSONObject jSONObject, boolean z, boolean z2) {
            JSONObject parseObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ca7c80a3", new Object[]{str, oe8Var, str2, mVar, jSONObject, new Boolean(z), new Boolean(z2)});
                return;
            }
            try {
                if (!TextUtils.isEmpty(str) && (parseObject = JSON.parseObject(str)) != null && !parseObject.isEmpty()) {
                    oe8Var.z(str2, parseObject);
                }
                if (PopAction.n(mVar, jSONObject)) {
                    PopAction.m(mVar, jSONObject, true, "", z, z2);
                } else {
                    PopAction.m(mVar, jSONObject, false, "WindvaneOnSuccessCheckFail", z, z2);
                }
            } catch (Throwable th) {
                wdm.h("dealPreFetchMTOP.parseObject.responseContent.error.", th);
                PopAction.m(mVar, jSONObject, false, "WindvaneOnSuccessCatchError", z, z2);
            }
        }

        @Override // tb.kmj.b
        public void onFailed(final String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("616e008d", new Object[]{this, str});
                return;
            }
            oe8 oe8Var = this.f13403a;
            final m mVar = this.c;
            final JSONObject jSONObject = this.d;
            final boolean z = this.e;
            final boolean z2 = this.f;
            oe8Var.w(new Runnable() { // from class: tb.ram
                @Override // java.lang.Runnable
                public final void run() {
                    PopAction.l.c(PopAction.m.this, jSONObject, str, z, z2);
                }
            });
        }

        @Override // tb.kmj.b
        public void onSuccess(final String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("37d948b5", new Object[]{this, str});
                return;
            }
            final oe8 oe8Var = this.f13403a;
            final String str2 = this.b;
            final m mVar = this.c;
            final JSONObject jSONObject = this.d;
            final boolean z = this.e;
            final boolean z2 = this.f;
            oe8Var.w(new Runnable() { // from class: tb.sam
                @Override // java.lang.Runnable
                public final void run() {
                    PopAction.l.d(str, oe8Var, str2, mVar, jSONObject, z, z2);
                }
            });
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class m {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final oe8 f13404a;
        public final PopRequest b;
        public final ComponentBaseModel c;
        public final String d;
        public final ActionModel e;
        public final n f;
        public final boolean g;
        public boolean h;
        public String i;
        public String j;
        public int k;
        public final PopLayerJsBridgeAction l;

        static {
            t2o.a(790626409);
        }

        public m(jlj jljVar, ComponentBaseModel componentBaseModel, String str, ActionModel actionModel, boolean z, n nVar) {
            this.f13404a = jljVar.J();
            this.b = jljVar.M();
            this.c = componentBaseModel;
            this.d = str;
            this.e = actionModel;
            this.g = z;
            this.f = nVar;
            this.l = new PopLayerJsBridgeAction(jljVar.L());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface n {
        void a(m mVar, String str, String str2);

        void b(m mVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface o {
        void a();
    }

    static {
        t2o.a(790626395);
    }

    public static void A(final jlj jljVar, final ComponentBaseModel componentBaseModel, final String str, final ActionModel actionModel, final List<ActionsItemModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fdbd771", new Object[]{jljVar, componentBaseModel, str, actionModel, list});
        } else if (jljVar != null && componentBaseModel != null && !TextUtils.isEmpty(str)) {
            jljVar.J().w(new Runnable() { // from class: tb.eam
                @Override // java.lang.Runnable
                public final void run() {
                    PopAction.I(ActionModel.this, jljVar, componentBaseModel, str, list);
                }
            });
        }
    }

    public static void C(m mVar, JSONObject jSONObject, boolean z, String str, boolean z2, boolean z3) {
        n nVar;
        n nVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("409a5a3c", new Object[]{mVar, jSONObject, new Boolean(z), str, new Boolean(z2), new Boolean(z3)});
        } else if (z) {
            if (z2) {
                P(mVar, jSONObject);
            }
            if (z3 && (nVar2 = mVar.f) != null) {
                nVar2.b(mVar);
            }
        } else {
            if (z2) {
                O(mVar, jSONObject);
            }
            if (z3 && (nVar = mVar.f) != null) {
                nVar.a(mVar, str, "");
            }
        }
    }

    public static boolean D(m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a5870f4", new Object[]{mVar})).booleanValue();
        }
        mVar.f13404a.m();
        n nVar = mVar.f;
        if (nVar != null) {
            nVar.b(mVar);
        }
        return true;
    }

    public static boolean E(m mVar) {
        ActionModel actionModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d4c6ca2", new Object[]{mVar})).booleanValue();
        }
        if (mVar == null || (actionModel = mVar.e) == null || !"close".equals(actionModel.behavior) || !"click".equals(mVar.d)) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ void G(final oe8 oe8Var, final m mVar, final String str, final JSONObject jSONObject, final boolean z, final boolean z2, final ExecuteResult executeResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5de26af6", new Object[]{oe8Var, mVar, str, jSONObject, new Boolean(z), new Boolean(z2), executeResult});
        } else {
            oe8Var.w(new Runnable() { // from class: tb.jam
                @Override // java.lang.Runnable
                public final void run() {
                    PopAction.L(PopAction.m.this, executeResult, oe8Var, str, jSONObject, z, z2);
                }
            });
        }
    }

    public static /* synthetic */ void H(jlj jljVar, ComponentBaseModel componentBaseModel, JSONObject jSONObject, String str, ActionsItemModel actionsItemModel, ActionLineModule actionLineModule, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df77aa17", new Object[]{jljVar, componentBaseModel, jSONObject, str, actionsItemModel, actionLineModule, jSONArray});
        } else {
            Y(jljVar.J(), jljVar.M(), componentBaseModel, jSONObject, str, actionsItemModel, actionLineModule, jSONArray);
        }
    }

    public static /* synthetic */ void I(ActionModel actionModel, jlj jljVar, ComponentBaseModel componentBaseModel, String str, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6479e49d", new Object[]{actionModel, jljVar, componentBaseModel, str, list});
            return;
        }
        if (actionModel != null) {
            try {
                if (actionModel.isValid()) {
                    w(jljVar, componentBaseModel, str, actionModel);
                }
            } catch (Throwable th) {
                wdm.h("PopAction.handleAction.error", th);
                return;
            }
        }
        if (list != null && !list.isEmpty()) {
            u(jljVar, componentBaseModel, str, list);
        }
    }

    public static /* synthetic */ void J(m mVar, JSONObject jSONObject, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7333957e", new Object[]{mVar, jSONObject, new Boolean(z), new Boolean(z2)});
        } else {
            C(mVar, jSONObject, false, "MegaOnFailed", z, z2);
        }
    }

    public static /* synthetic */ void K(m mVar, JSONObject jSONObject, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f4c1da8", new Object[]{mVar, jSONObject, new Boolean(z), new Boolean(z2)});
        } else {
            C(mVar, jSONObject, false, "MegaCatchError", z, z2);
        }
    }

    public static /* synthetic */ void L(final m mVar, ExecuteResult executeResult, oe8 oe8Var, String str, final JSONObject jSONObject, final boolean z, final boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c7ac36c", new Object[]{mVar, executeResult, oe8Var, str, jSONObject, new Boolean(z), new Boolean(z2)});
            return;
        }
        try {
            if (mVar.h) {
                wdm.d("Mega.alreadyRequestGetCallBack.cancel.", new Object[0]);
                return;
            }
            wdm.d("Mega.callMega.receiveResult", new Object[0]);
            if (executeResult.isSuccess() && executeResult.getStatusCode() != 2) {
                mVar.h = true;
                Map<String, Object> data = executeResult.getData();
                if (data == null) {
                    wdm.d("Mega.callMega.data=null.return", new Object[0]);
                    return;
                }
                oe8Var.z(str, (JSONObject) JSON.toJSON(data));
                if (r(mVar, jSONObject)) {
                    C(mVar, jSONObject, true, "", z, z2);
                } else {
                    C(mVar, jSONObject, false, "MegaOnSuccessCheckFail", z, z2);
                }
            } else if (executeResult.isFailure()) {
                mVar.h = true;
                oe8Var.w(new Runnable() { // from class: tb.kam
                    @Override // java.lang.Runnable
                    public final void run() {
                        PopAction.J(PopAction.m.this, jSONObject, z, z2);
                    }
                });
            }
        } catch (Throwable th) {
            wdm.h("Mega.callMega.error", th);
            oe8Var.w(new Runnable() { // from class: tb.lam
                @Override // java.lang.Runnable
                public final void run() {
                    PopAction.K(PopAction.m.this, jSONObject, z, z2);
                }
            });
        }
    }

    public static /* synthetic */ void M(NetworkEvent.FinishEvent finishEvent, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36e0ef1e", new Object[]{finishEvent, obj});
        }
    }

    public static /* synthetic */ void N(String str, boolean z, String str2, m mVar) {
        double d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("885741c", new Object[]{str, new Boolean(z), str2, mVar});
            return;
        }
        try {
            hji a2 = hji.a();
            g0u a3 = g0u.a(str);
            if (a3 != null) {
                if (z) {
                    d2 = 3500.0d;
                } else {
                    d2 = 2000.0d;
                }
                a3.b = d2;
                a3.e = str2;
                a2.c(a3, new k());
            } else {
                Toast.makeText(mVar.f13404a.j().e(), str, z ? 1 : 0).show();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void O(m mVar, JSONObject jSONObject) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a42277f", new Object[]{mVar, jSONObject});
            return;
        }
        try {
            oe8 oe8Var = mVar.f13404a;
            String string = jSONObject.getString("afterRequestFail");
            if ("errToastText".equals(string)) {
                if (!TextUtils.isEmpty(mVar.e.fallbackToast)) {
                    wdm.d("PopAction.onRequestActionFailed.shouldUseFallbackToast.return", new Object[0]);
                    return;
                }
                String g2 = a1n.g(oe8Var, jSONObject.getString("errToastText"));
                if (!TextUtils.isEmpty(g2)) {
                    plj.g(oe8Var, g2);
                    oe8Var.b("ToastAndCloseAfterRequestFailed", "", false, y(mVar));
                }
            } else if ("close".equals(string)) {
                oe8Var.b("CloseAfterRequestFailed", "", false, y(mVar));
            } else {
                List<String> list2 = null;
                if ("errJumpUrl".equals(string)) {
                    String g3 = a1n.g(oe8Var, jSONObject.getString("errJumpUrl"));
                    if (!TextUtils.isEmpty(g3)) {
                        oe8Var.E(y(mVar));
                        mVar.l.s(g3, null);
                    }
                } else if ("errSwitchState".equals(string)) {
                    String string2 = jSONObject.getString("errSwitchStateGroup");
                    String string3 = jSONObject.getString("errSwitchState");
                    if (!TextUtils.isEmpty(string2)) {
                        list = (List) JSON.parseObject(string2, new c().getType(), new Feature[0]);
                    } else {
                        list = null;
                    }
                    if (!TextUtils.isEmpty(string3)) {
                        list2 = (List) JSON.parseObject(string3, new d().getType(), new Feature[0]);
                    }
                    mVar.f13404a.E(y(mVar));
                    if (!oe8Var.D(list, list2, false, false)) {
                        oe8Var.t("CloseAfterRequestFailSwitchStateError", "", mVar.e.fallbackToast);
                    }
                }
            }
        } catch (Throwable th) {
            wdm.h("PopAction.onRequestActionFailed.error.", th);
        }
    }

    public static boolean R(m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c2e59e41", new Object[]{mVar})).booleanValue();
        }
        if (!mVar.g) {
            return v(mVar, true);
        }
        n nVar = mVar.f;
        if (nVar != null) {
            nVar.a(mVar, "RequestTypeOnActions", "");
        }
        return false;
    }

    public static boolean S(m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b446b35", new Object[]{mVar})).booleanValue();
        }
        if (mVar.g) {
            return v(mVar, false);
        }
        n nVar = mVar.f;
        if (nVar != null) {
            nVar.a(mVar, "Request2TypeOnAction", "");
        }
        return false;
    }

    public static void T(m mVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6820331f", new Object[]{mVar, jSONObject});
            return;
        }
        try {
            String string = jSONObject.getString(WXAddressModule2.PLUGIN_NAME);
            String string2 = jSONObject.getString("method");
            String string3 = jSONObject.getString("params");
            String g2 = a1n.g(mVar.f13404a, string);
            String g3 = a1n.g(mVar.f13404a, string3);
            if (!TextUtils.isEmpty(g2) && g2.startsWith("https")) {
                DegradableNetwork degradableNetwork = new DegradableNetwork(PopLayer.getReference().internalGetCurrentActivity());
                Request requestImpl = new RequestImpl(g2);
                if (!TextUtils.isEmpty(g3)) {
                    JSONObject parseObject = JSON.parseObject(g3);
                    ArrayList arrayList = new ArrayList();
                    for (String str : parseObject.keySet()) {
                        arrayList.add(new StringParam(str, parseObject.getString(str)));
                    }
                    requestImpl.setParams(arrayList);
                }
                if ("GET".equals(string2)) {
                    requestImpl.setMethod("GET");
                } else if ("POST".equals(string2)) {
                    requestImpl.setMethod("POST");
                }
                degradableNetwork.asyncSend(requestImpl, null, null, new NetworkCallBack.FinishListener() { // from class: tb.ham
                    @Override // anetwork.channel.NetworkCallBack.FinishListener
                    public final void onFinished(NetworkEvent.FinishEvent finishEvent, Object obj) {
                        PopAction.M(finishEvent, obj);
                    }
                });
            }
        } catch (Throwable th) {
            wdm.h("PopAction.sendHttps.error.", th);
        }
    }

    public static boolean V(m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ed216af", new Object[]{mVar})).booleanValue();
        }
        mVar.f13404a.C();
        n nVar = mVar.f;
        if (nVar != null) {
            nVar.b(mVar);
        }
        return true;
    }

    public static void a0(AtomicInteger atomicInteger, o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff387860", new Object[]{atomicInteger, oVar});
        } else if (atomicInteger.decrementAndGet() == 0) {
            oVar.a();
        }
    }

    public static /* synthetic */ void i(m mVar, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d0715c", new Object[]{mVar, jSONObject, str});
        } else {
            Z(mVar, jSONObject, str);
        }
    }

    public static /* synthetic */ void j(jlj jljVar, boolean z, ActionModel actionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b1e59b7", new Object[]{jljVar, new Boolean(z), actionModel});
        } else {
            x(jljVar, z, actionModel);
        }
    }

    public static /* synthetic */ void k(AtomicInteger atomicInteger, o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c49bc863", new Object[]{atomicInteger, oVar});
        } else {
            a0(atomicInteger, oVar);
        }
    }

    public static /* synthetic */ void l(jlj jljVar, ComponentBaseModel componentBaseModel, String str, Collection collection, Map map, JSONArray jSONArray, ActionLineModule actionLineModule, o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a231f09", new Object[]{jljVar, componentBaseModel, str, collection, map, jSONArray, actionLineModule, oVar});
        } else {
            F(jljVar, componentBaseModel, str, collection, map, jSONArray, actionLineModule, oVar);
        }
    }

    public static /* synthetic */ void m(m mVar, JSONObject jSONObject, boolean z, String str, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a762f5d0", new Object[]{mVar, jSONObject, new Boolean(z), str, new Boolean(z2), new Boolean(z3)});
        } else {
            C(mVar, jSONObject, z, str, z2, z3);
        }
    }

    public static /* synthetic */ boolean n(m mVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f29a29f1", new Object[]{mVar, jSONObject})).booleanValue();
        }
        return r(mVar, jSONObject);
    }

    public static boolean o(m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bdce0473", new Object[]{mVar})).booleanValue();
        }
        oe8 oe8Var = mVar.f13404a;
        ActionModel actionModel = mVar.e;
        boolean c2 = oe8Var.c(actionModel.target, actionModel.content);
        n nVar = mVar.f;
        if (nVar != null) {
            nVar.b(mVar);
        }
        return c2;
    }

    public static boolean s(m mVar) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7decc1aa", new Object[]{mVar})).booleanValue();
        }
        JSONObject parseObject = JSON.parseObject(mVar.e.content);
        if (parseObject != null) {
            z = parseObject.getBooleanValue("interruptable");
        }
        oe8 oe8Var = mVar.f13404a;
        oe8Var.b("handleClose." + mVar.e.type, "", z, y(mVar));
        n nVar = mVar.f;
        if (nVar != null) {
            nVar.b(mVar);
        }
        return true;
    }

    public static void w(jlj jljVar, ComponentBaseModel componentBaseModel, String str, ActionModel actionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b259a95", new Object[]{jljVar, componentBaseModel, str, actionModel});
            return;
        }
        try {
            if (str.equals(actionModel.type)) {
                wdm.d("PopAction.doSingleAction.actionType=%s.componentModel=%s.actionBehavior=%s", str, componentBaseModel.id, actionModel.behavior);
                com.alibaba.poplayer.trigger.a M = jljVar.M();
                if (actionModel.neverShow) {
                    M.b();
                } else {
                    Boolean bool = actionModel.countTire;
                    if (bool == null || Boolean.TRUE.equals(bool)) {
                        M.r();
                    }
                }
                m mVar = new m(jljVar, componentBaseModel, str, actionModel, false, new e(jljVar.I(), jljVar, actionModel));
                me8 j2 = jljVar.J().j();
                mVar.i = j2.i();
                mVar.j = j2.m();
                mVar.k = j2.j();
                if (t(mVar) && actionModel.autoClose) {
                    jljVar.J().b("AutoCloseAfterAction", "", false, new ell(jljVar.J(), componentBaseModel.id, str, actionModel.behavior, ""));
                }
            }
        } catch (Throwable th) {
            wdm.h("PopAction.doSingleAction.error.", th);
        }
    }

    public static void x(jlj jljVar, boolean z, ActionModel actionModel) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("825f03d2", new Object[]{jljVar, new Boolean(z), actionModel});
            return;
        }
        try {
            if (z) {
                if (!TextUtils.isEmpty(actionModel.withToast)) {
                    str = a1n.g(jljVar.J(), actionModel.withToast);
                    plj.g(jljVar.J(), str);
                    return;
                }
                str = null;
                plj.g(jljVar.J(), str);
                return;
            }
            if (!TextUtils.isEmpty(actionModel.fallbackToast)) {
                str = a1n.g(jljVar.J(), actionModel.fallbackToast);
                plj.g(jljVar.J(), str);
                return;
            }
            str = null;
            plj.g(jljVar.J(), str);
            return;
        } catch (Throwable th) {
            wdm.h("PopAction.doWithToast.error.", th);
        }
        wdm.h("PopAction.doWithToast.error.", th);
    }

    public static ell y(m mVar) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ell) ipChange.ipc$dispatch("836b5641", new Object[]{mVar});
        }
        if (mVar == null || mVar.f13404a == null) {
            return null;
        }
        oe8 oe8Var = mVar.f13404a;
        ComponentBaseModel componentBaseModel = mVar.c;
        if (componentBaseModel != null) {
            str = componentBaseModel.id;
        } else {
            str = "";
        }
        String str3 = mVar.d;
        ActionModel actionModel = mVar.e;
        if (actionModel != null) {
            str2 = actionModel.behavior;
        } else {
            str2 = "";
        }
        return new ell(oe8Var, str, str3, str2, "");
    }

    public static void P(m mVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45d07985", new Object[]{mVar, jSONObject});
            return;
        }
        try {
            oe8 oe8Var = mVar.f13404a;
            String string = jSONObject.getString("afterRequestSuccess");
            if ("toastText".equals(string)) {
                if (!TextUtils.isEmpty(mVar.e.withToast)) {
                    wdm.d("PopAction.onRequestActionSuccess.shouldUseWithToast.return", new Object[0]);
                    return;
                }
                String g2 = a1n.g(oe8Var, jSONObject.getString("toastText"));
                if (!TextUtils.isEmpty(g2)) {
                    plj.g(oe8Var, g2);
                    oe8Var.b("ToastAndCloseAfterRequestSuccess", "", false, y(mVar));
                }
            } else if ("close".equals(string)) {
                oe8Var.b("CloseAfterRequestSuccess", "", false, y(mVar));
            } else {
                List<String> list = null;
                if (rg0.JUMP_URL.equals(string)) {
                    String g3 = a1n.g(oe8Var, jSONObject.getString(rg0.JUMP_URL));
                    if (!TextUtils.isEmpty(g3)) {
                        oe8Var.E(y(mVar));
                        mVar.l.s(g3, null);
                    }
                } else if ("switchState".equals(string)) {
                    String string2 = jSONObject.getString("switchStateGroup");
                    String string3 = jSONObject.getString("switchState");
                    List<String> list2 = !TextUtils.isEmpty(string2) ? (List) JSON.parseObject(string2, new a().getType(), new Feature[0]) : null;
                    if (!TextUtils.isEmpty(string3)) {
                        list = (List) JSON.parseObject(string3, new b().getType(), new Feature[0]);
                    }
                    if (oe8Var.D(list2, list, false, false)) {
                        mVar.f13404a.E(y(mVar));
                    } else {
                        oe8Var.t("CloseAfterRequestSuccessSwitchStateError", "", mVar.e.fallbackToast);
                    }
                }
            }
        } catch (Throwable th) {
            wdm.h("PopAction.onRequestActionSuccess.error.", th);
        }
    }

    public static void Y(oe8 oe8Var, PopRequest popRequest, ComponentBaseModel componentBaseModel, JSONObject jSONObject, String str, ActionsItemModel actionsItemModel, ActionLineModule actionLineModule, JSONArray jSONArray) {
        String str2;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f235aeb", new Object[]{oe8Var, popRequest, componentBaseModel, jSONObject, str, actionsItemModel, actionLineModule, jSONArray});
            return;
        }
        Boolean bool = actionsItemModel.countTire;
        if (bool != null) {
            z = bool.booleanValue();
        }
        jSONObject.put("countTire", (Object) Boolean.valueOf(z));
        if (componentBaseModel != null) {
            str2 = componentBaseModel.id;
        } else {
            str2 = "";
        }
        jSONObject.put("componentId", (Object) str2);
        jSONObject.put("actions", (Object) jSONArray);
        String str3 = actionsItemModel.userResult;
        if (!TextUtils.isEmpty(str3)) {
            if ("click".equals(str3)) {
                UserResultTrack.a(popRequest, UserResultTrack.USER_RESULT_CLICK_ACTION, z, jSONObject);
                return;
            } else if ("cancel".equals(str3)) {
                UserResultTrack.a(popRequest, UserResultTrack.USER_RESULT_CANCEL_ACTION, z, jSONObject);
                return;
            }
        }
        if ("click".equals(str)) {
            UserResultTrack.a(popRequest, UserResultTrack.USER_RESULT_CLICK_ACTION, z, jSONObject);
        } else if ("scene".equals(str)) {
            UserResultTrack.a(popRequest, UserResultTrack.USER_RESULT_SCENE_ACTION, z, jSONObject);
        }
        qtv.k(oe8Var.j().w(), actionLineModule);
    }

    public static void Z(m mVar, JSONObject jSONObject, String str) {
        ActionModel actionModel;
        String str2;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d22f223", new Object[]{mVar, jSONObject, str});
        } else if (mVar != null && (actionModel = mVar.e) != null) {
            Boolean bool = actionModel.countTire;
            if (bool != null) {
                z = bool.booleanValue();
            }
            jSONObject.put("countTire", (Object) Boolean.valueOf(z));
            ComponentBaseModel componentBaseModel = mVar.c;
            if (componentBaseModel != null) {
                str2 = componentBaseModel.id;
            } else {
                str2 = "";
            }
            jSONObject.put("componentId", (Object) str2);
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("actionBehavior", (Object) actionModel.behavior);
            jSONObject2.put("actionExceptionMessage", (Object) str);
            arrayList.add(jSONObject2);
            jSONObject.put("actions", (Object) arrayList);
            String str3 = mVar.e.userResult;
            if (!TextUtils.isEmpty(str3)) {
                if ("click".equals(str3)) {
                    UserResultTrack.a(mVar.b, UserResultTrack.USER_RESULT_CLICK_ACTION, z, jSONObject);
                    return;
                } else if ("cancel".equals(str3)) {
                    UserResultTrack.a(mVar.b, UserResultTrack.USER_RESULT_CANCEL_ACTION, z, jSONObject);
                    return;
                }
            }
            if (E(mVar)) {
                UserResultTrack.a(mVar.b, UserResultTrack.USER_RESULT_CANCEL_ACTION, z, jSONObject);
            } else if ("click".equals(mVar.d)) {
                UserResultTrack.a(mVar.b, UserResultTrack.USER_RESULT_CLICK_ACTION, z, jSONObject);
            } else if ("scene".equals(mVar.d)) {
                UserResultTrack.a(mVar.b, UserResultTrack.USER_RESULT_SCENE_ACTION, z, jSONObject);
            }
            me8 j2 = mVar.f13404a.j();
            ActionLineModule actionLineModule = new ActionLineModule(mVar.i, mVar.j, mVar.k);
            actionLineModule.countTire = z;
            actionLineModule.triggerType = mVar.d;
            ActionLineModule.ActionItem actionItem = new ActionLineModule.ActionItem();
            actionItem.id = actionModel.id;
            actionItem.exception = str;
            actionItem.componentId = str2;
            ActionLineModule.ActionExecuteItem actionExecuteItem = new ActionLineModule.ActionExecuteItem();
            actionExecuteItem.act = actionModel.behavior;
            actionExecuteItem.exp = str;
            ArrayList arrayList2 = new ArrayList();
            actionItem.executes = arrayList2;
            arrayList2.add(actionExecuteItem);
            ArrayList arrayList3 = new ArrayList();
            actionLineModule.actions = arrayList3;
            arrayList3.add(actionItem);
            qtv.k(j2.w(), actionLineModule);
        }
    }

    public static void B(m mVar) {
        ActionModel actionModel;
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54528e5a", new Object[]{mVar});
        } else if (mVar != null && (actionModel = mVar.e) != null && (jSONArray = actionModel.extraRequests) != null && !jSONArray.isEmpty()) {
            try {
                JSONArray jSONArray2 = mVar.e.extraRequests;
                for (int i2 = 0; i2 < jSONArray2.size(); i2++) {
                    JSONObject jSONObject = jSONArray2.getJSONObject(i2);
                    if (jSONObject != null) {
                        String string = jSONObject.getString("type");
                        JSONObject jSONObject2 = jSONObject.getJSONObject("content");
                        if ("mtop".equals(string)) {
                            U(mVar, jSONObject2, false, false);
                        } else if ("windvane".equals(string)) {
                            q(mVar, jSONObject2, false, false);
                        } else if ("https".equals(string)) {
                            T(mVar, jSONObject2);
                        }
                    }
                }
            } catch (Throwable th) {
                wdm.h("PopAction.handleActionAppend.error.", th);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    public static boolean Q(m mVar) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea20de8d", new Object[]{mVar})).booleanValue();
        }
        ActionModel actionModel = mVar.e;
        if ("startStates".equals(actionModel.target)) {
            z = mVar.f13404a.q(true, null);
        } else if ("groupStates".equals(actionModel.target)) {
            ArrayList arrayList = new ArrayList();
            try {
                arrayList = (List) JSON.parseObject(actionModel.content, new j(), new Feature[0]);
            } catch (Throwable unused) {
                arrayList.add(actionModel.content);
            }
            z = mVar.f13404a.q(false, arrayList);
        } else {
            z = false;
        }
        if (!z) {
            n nVar = mVar.f;
            if (nVar != null) {
                nVar.a(mVar, "targetInvalid", "");
            }
            return false;
        }
        n nVar2 = mVar.f;
        if (nVar2 != null) {
            nVar2.b(mVar);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.List] */
    public static boolean W(m mVar) {
        String str;
        Boolean bool;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d668b96f", new Object[]{mVar})).booleanValue();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ActionModel actionModel = mVar.e;
        try {
            arrayList2 = (List) JSON.parseObject(actionModel.target, new g(), new Feature[0]);
        } catch (Throwable unused) {
            arrayList2.add(actionModel.target);
        }
        JSONObject parseObject = JSON.parseObject(actionModel.content);
        if (parseObject != null) {
            String string = parseObject.getString("targetGroupStates");
            if (!TextUtils.isEmpty(string)) {
                try {
                    arrayList = (List) JSON.parseObject(string, new h(), new Feature[0]);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            if (arrayList2 == null || arrayList2.isEmpty()) {
                String string2 = parseObject.getString("targetStates");
                if (!TextUtils.isEmpty(string2)) {
                    try {
                        arrayList2 = (List) JSON.parseObject(string2, new i(), new Feature[0]);
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                }
            }
        }
        if (parseObject != null) {
            str = parseObject.getString(c4o.KEY_SWITCH_MODE);
        } else {
            str = "";
        }
        if (parseObject != null) {
            bool = parseObject.getBoolean("excludeSelf");
        } else {
            bool = Boolean.FALSE;
        }
        mVar.f13404a.E(y(mVar));
        if (mVar.f13404a.D(arrayList, arrayList2, pg1.ATOM_EXT_random.equals(str), Boolean.TRUE.equals(bool))) {
            n nVar = mVar.f;
            if (nVar != null) {
                nVar.b(mVar);
            }
            return true;
        }
        oe8 oe8Var = mVar.f13404a;
        if (!mVar.g) {
            str2 = mVar.e.fallbackToast;
        } else {
            str2 = "";
        }
        oe8Var.t("SwitchStateError", "", str2);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean X(final com.taobao.tbpoplayer.nativerender.PopAction.m r7) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.tbpoplayer.nativerender.PopAction.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0019
            java.lang.String r3 = "e34481d9"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r7
            java.lang.Object r7 = r2.ipc$dispatch(r3, r1)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L_0x0019:
            tb.oe8 r2 = r7.f13404a
            tb.me8 r2 = r2.j()
            boolean r2 = r2.A()
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x0033
            tb.oe8 r2 = r7.f13404a
            tb.me8 r2 = r2.j()
            boolean r2 = r2.D()
            if (r2 == 0) goto L_0x003e
        L_0x0033:
            com.taobao.tbpoplayer.nativerender.PopAction$n r2 = r7.f
            if (r2 == 0) goto L_0x003e
            java.lang.String r1 = "notShowing"
            r2.a(r7, r1, r3)
            return r0
        L_0x003e:
            com.taobao.tbpoplayer.nativerender.dsl.ActionModel r2 = r7.e     // Catch: all -> 0x0067
            java.lang.String r2 = r2.content     // Catch: all -> 0x0067
            com.alibaba.fastjson.JSONObject r2 = com.alibaba.fastjson.JSON.parseObject(r2)     // Catch: all -> 0x0067
            tb.oe8 r4 = r7.f13404a     // Catch: all -> 0x0067
            java.lang.String r5 = "text"
            java.lang.String r5 = r2.getString(r5)     // Catch: all -> 0x0067
            java.lang.String r4 = tb.a1n.g(r4, r5)     // Catch: all -> 0x0067
            java.lang.String r5 = "long"
            java.lang.String r6 = "duration"
            java.lang.String r6 = r2.getString(r6)     // Catch: all -> 0x0067
            boolean r5 = r5.equals(r6)     // Catch: all -> 0x0067
            java.lang.String r6 = "iconUrl"
            java.lang.String r3 = r2.getString(r6)     // Catch: all -> 0x0068
            goto L_0x0072
        L_0x0067:
            r5 = 0
        L_0x0068:
            tb.oe8 r2 = r7.f13404a
            com.taobao.tbpoplayer.nativerender.dsl.ActionModel r4 = r7.e
            java.lang.String r4 = r4.content
            java.lang.String r4 = tb.a1n.g(r2, r4)
        L_0x0072:
            boolean r0 = tb.plj.c(r4, r0)
            if (r0 == 0) goto L_0x0084
            tb.oe8 r0 = r7.f13404a
            if (r0 == 0) goto L_0x0084
            tb.fam r2 = new tb.fam
            r2.<init>()
            r0.x(r2)
        L_0x0084:
            com.taobao.tbpoplayer.nativerender.PopAction$n r0 = r7.f
            if (r0 == 0) goto L_0x008b
            r0.b(r7)
        L_0x008b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tbpoplayer.nativerender.PopAction.X(com.taobao.tbpoplayer.nativerender.PopAction$m):boolean");
    }

    public static boolean r(m mVar, JSONObject jSONObject) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95f31594", new Object[]{mVar, jSONObject})).booleanValue();
        }
        try {
            if (jSONObject.containsKey("requestSuccessJudge")) {
                z = af4.a((ConditionModel) jSONObject.getObject("requestSuccessJudge", ConditionModel.class), mVar.f13404a, false);
            }
            return z;
        } catch (Throwable th) {
            wdm.h("PopAction.onRequestActionSuccess.parseConditionModel.error.", th);
            return false;
        }
    }

    public static boolean v(m mVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2c2b9e6", new Object[]{mVar, new Boolean(z)})).booleanValue();
        }
        ActionModel actionModel = mVar.e;
        JSONObject parseObject = JSON.parseObject(actionModel.content);
        if ("mtop".equals(actionModel.target)) {
            return U(mVar, parseObject, z, true);
        }
        if ("windvane".equals(actionModel.target)) {
            return q(mVar, parseObject, z, true);
        }
        if ("mega".equals(actionModel.target)) {
            return p(mVar, parseObject, z, true);
        }
        n nVar = mVar.f;
        if (nVar != null) {
            nVar.a(mVar, "requestTargetTypeInvalid", "");
        }
        return false;
    }

    public static boolean z(m mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cde670be", new Object[]{mVar})).booleanValue();
        }
        ActionModel actionModel = mVar.e;
        String str = actionModel.target;
        oe8 oe8Var = mVar.f13404a;
        String g2 = a1n.g(oe8Var, actionModel.content);
        if ("app".equals(str)) {
            if (TextUtils.isEmpty(g2)) {
                return false;
            }
            String n2 = oe8Var.n(g2);
            oe8Var.E(y(mVar));
            mVar.l.s(n2, null);
        } else if ("url".equals(str)) {
            if (TextUtils.isEmpty(g2)) {
                return false;
            }
            oe8Var.E(y(mVar));
            mVar.l.r(g2, "allowJumpOut", null);
        } else if ("market".equals(str)) {
            oe8Var.E(y(mVar));
            mVar.l.r(g2, "market", null);
        } else {
            n nVar = mVar.f;
            if (nVar != null) {
                nVar.a(mVar, "gotoTargetTypeInvalid", "");
            }
            return false;
        }
        n nVar2 = mVar.f;
        if (nVar2 != null) {
            nVar2.b(mVar);
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ab, code lost:
        if (r4.equals("request2") == false) goto L_0x004d;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean t(com.taobao.tbpoplayer.nativerender.PopAction.m r8) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tbpoplayer.nativerender.PopAction.t(com.taobao.tbpoplayer.nativerender.PopAction$m):boolean");
    }

    public static boolean q(m mVar, JSONObject jSONObject, boolean z, boolean z2) {
        n nVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3230bde", new Object[]{mVar, jSONObject, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        String string = jSONObject.getString("dataId");
        String string2 = jSONObject.getString("requestWindvaneFuncName");
        String string3 = jSONObject.getString("requestParams");
        oe8 oe8Var = mVar.f13404a;
        String g2 = a1n.g(oe8Var, string3);
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || TextUtils.isEmpty(g2)) {
            if (z2 && (nVar = mVar.f) != null) {
                nVar.a(mVar, "paramInvalid", "");
            }
            return false;
        }
        oe8Var.k().e(string2, g2, "", new l(oe8Var, string, mVar, jSONObject, z, z2));
        return true;
    }

    public static boolean p(final m mVar, final JSONObject jSONObject, final boolean z, final boolean z2) {
        n nVar;
        n nVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0b3d16", new Object[]{mVar, jSONObject, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        final String string = jSONObject.getString("dataId");
        String string2 = jSONObject.getString("requestMegaName");
        String string3 = jSONObject.getString("requestMegaApi");
        String string4 = jSONObject.getString("requestParams");
        final oe8 oe8Var = mVar.f13404a;
        String g2 = a1n.g(oe8Var, string4);
        try {
            JSONObject parseObject = JSON.parseObject(g2);
            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || TextUtils.isEmpty(string3) || TextUtils.isEmpty(g2)) {
                if (z2 && (nVar2 = mVar.f) != null) {
                    nVar2.a(mVar, "paramInvalid", "");
                }
                return false;
            }
            new AbilityHubAdapter(new zq("PopHub", "poplayer").a(PopLayer.getReference().internalGetCurrentActivity())).j(string2, string3, new xq(), parseObject, new s2d() { // from class: tb.gam
                @Override // tb.s2d
                public final void onCallback(ExecuteResult executeResult) {
                    PopAction.G(oe8.this, mVar, string, jSONObject, z, z2, executeResult);
                }
            });
            return true;
        } catch (Throwable th) {
            if (z2 && (nVar = mVar.f) != null) {
                nVar.a(mVar, "paramParseJsonFailed", th.getMessage());
            }
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0085 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:6:0x001f, B:7:0x0023, B:9:0x0029, B:11:0x0031, B:13:0x0037, B:21:0x0048, B:23:0x0053, B:24:0x005b, B:26:0x005f, B:30:0x006a, B:31:0x0072, B:32:0x007f, B:34:0x0085, B:36:0x008d, B:38:0x0093, B:40:0x009b, B:41:0x00a1), top: B:44:0x001f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void u(final tb.jlj r15, final com.taobao.tbpoplayer.nativerender.dsl.ComponentBaseModel r16, final java.lang.String r17, java.util.List<com.taobao.tbpoplayer.nativerender.dsl.ActionsItemModel> r18) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tbpoplayer.nativerender.PopAction.u(tb.jlj, com.taobao.tbpoplayer.nativerender.dsl.ComponentBaseModel, java.lang.String, java.util.List):void");
    }

    public static boolean U(m mVar, JSONObject jSONObject, boolean z, boolean z2) {
        n nVar;
        MethodEnum methodEnum;
        boolean z3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d85de396", new Object[]{mVar, jSONObject, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        String string = jSONObject.getString("dataId");
        String string2 = jSONObject.getString("requestMethod");
        String string3 = jSONObject.getString("requestAddress");
        String string4 = jSONObject.getString("requestVer");
        String string5 = jSONObject.getString("version");
        String string6 = jSONObject.getString("requestParams");
        boolean booleanValue = jSONObject.getBooleanValue("needWua");
        boolean booleanValue2 = jSONObject.getBooleanValue(ICallService.KEY_NEED_LOGIN);
        String string7 = jSONObject.getString("safeToken");
        oe8 oe8Var = mVar.f13404a;
        String g2 = a1n.g(oe8Var, string6);
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string3) || TextUtils.isEmpty(g2)) {
            if (z2 && (nVar = mVar.f) != null) {
                nVar.a(mVar, "paramInvalid", "");
            }
            return false;
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(string3);
        if (TextUtils.isEmpty(string4)) {
            string4 = !TextUtils.isEmpty(string5) ? string5 : "1.0";
        }
        mtopRequest.setVersion(string4);
        mtopRequest.setNeedEcode(booleanValue2);
        mtopRequest.setData(g2);
        BaseConfigItem J = com.alibaba.poplayer.trigger.a.J(mVar.b);
        MtopBusiness showLoginUI = MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, PopLayer.getReference().getApp()), mtopRequest, TaoPackageInfo.getTTID()).registerListener((IRemoteListener) new AnonymousClass8(booleanValue2, J, J.embed, oe8Var, mVar, jSONObject, z, z2, string)).showLoginUI(booleanValue2);
        if ("GET".equals(string2)) {
            methodEnum = MethodEnum.GET;
        } else {
            methodEnum = MethodEnum.POST;
        }
        MtopBusiness reqMethod = showLoginUI.reqMethod(methodEnum);
        if (booleanValue) {
            reqMethod.useWua();
        }
        if (!TextUtils.isEmpty(string7)) {
            reqMethod.addHttpQueryParameter("asac", string7);
        }
        if (booleanValue2) {
            z3 = true;
            J.embed = true;
        } else {
            z3 = true;
        }
        reqMethod.startRequest();
        return z3;
    }

    public static void F(jlj jljVar, ComponentBaseModel componentBaseModel, String str, Collection<String> collection, Map<String, ActionModel> map, JSONArray jSONArray, ActionLineModule actionLineModule, o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("948a7c4e", new Object[]{jljVar, componentBaseModel, str, collection, map, jSONArray, actionLineModule, oVar});
        } else if (collection == null || collection.isEmpty()) {
            oVar.a();
        } else {
            AtomicInteger atomicInteger = new AtomicInteger(collection.size());
            for (String str2 : collection) {
                ActionModel actionModel = map.get(str2);
                f fVar = new f(actionModel, jSONArray, actionLineModule, atomicInteger, oVar, jljVar, componentBaseModel, str, map);
                if (actionModel == null) {
                    a0(atomicInteger, oVar);
                } else {
                    boolean a2 = af4.a(actionModel.preCondition, jljVar.J(), false);
                    wdm.d("PopAction.doMultiActions.iterateActionTree.action=%s.shouldDoAction=%s.", actionModel.id, Boolean.valueOf(a2));
                    if (!a2) {
                        ActionLineModule.ActionExecuteItem actionExecuteItem = new ActionLineModule.ActionExecuteItem();
                        actionExecuteItem.act = actionModel.behavior;
                        actionExecuteItem.exp = "preConditionRestrict";
                        actionLineModule.actions.get(0).executes.add(actionExecuteItem);
                        a0(atomicInteger, oVar);
                    } else if (!t(new m(jljVar, componentBaseModel, str, actionModel, true, fVar))) {
                        a0(atomicInteger, oVar);
                    }
                }
                atomicInteger = atomicInteger;
            }
        }
    }
}
