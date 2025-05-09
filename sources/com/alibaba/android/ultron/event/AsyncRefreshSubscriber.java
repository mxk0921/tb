package com.alibaba.android.ultron.event;

import android.text.TextUtils;
import com.alibaba.android.ultron.event.base.CustomLoadRenderParser;
import com.alibaba.android.ultron.vfw.instance.UltronInstanceConfig;
import com.alibaba.android.ultron.vfw.viewholder.RecyclerViewHolder;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.b8v;
import tb.f8v;
import tb.fsb;
import tb.l6v;
import tb.lbq;
import tb.o5e;
import tb.pqq;
import tb.t2o;
import tb.w15;
import tb.x15;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AsyncRefreshSubscriber extends l6v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_ASYNC_STATUS = "asyncStatus";
    public static final String KEY_COMPONENT = "triggerComponent";
    public static final String KEY_IS_ERROR = "isError";
    public static final String KEY_MTOP_RESPONSE = "mtopResponse";
    public static final String KEY_NEED_REFRESH_COMPONENTS = "needRefreshComponents";
    public static final String KEY_TARGET_COMPONENTS = "targetComponents";
    public static final int STATUS_FAIL = 3;
    public static final int STATUS_LOADING = 1;
    public static final int STATUS_NONE = 0;
    public static final int STATUS_SUCCESS = 2;
    public static final String TAG = "AsyncRefreshSubscriber";
    public final Map<String, b> j = new HashMap();
    public String k = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements w15 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(157286507);
            t2o.a(157286532);
        }

        public a() {
        }

        @Override // tb.w15
        public void a(x15 x15Var) {
            JSONObject jSONObject;
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("95ef05a9", new Object[]{this, x15Var});
            } else if (x15Var != null) {
                o5e c = x15Var.c();
                IDMComponent iDMComponent = (IDMComponent) x15Var.b(AsyncRefreshSubscriber.KEY_COMPONENT);
                MtopResponse mtopResponse = (MtopResponse) x15Var.b("mtopResponse");
                ((Boolean) x15Var.b(AsyncRefreshSubscriber.KEY_IS_ERROR)).booleanValue();
                JSONArray jSONArray = (JSONArray) x15Var.b(AsyncRefreshSubscriber.KEY_TARGET_COMPONENTS);
                if (c != null && mtopResponse != null) {
                    try {
                        jSONObject = JSON.parseObject(mtopResponse.getDataJsonObject().toString());
                    } catch (Exception e) {
                        fsb fsbVar = AsyncRefreshSubscriber.this.d;
                        if (fsbVar == null) {
                            str = "Ultron";
                        } else {
                            str = fsbVar.getBizName();
                        }
                        lbq.c(str, "AsyncRefreshSubscriber.onCustomParser", e);
                        jSONObject = null;
                    }
                    if (jSONObject != null && !jSONObject.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        if (jSONArray != null) {
                            Iterator<Object> it = jSONArray.iterator();
                            while (it.hasNext()) {
                                Object next = it.next();
                                if (next instanceof String) {
                                    String str2 = (String) next;
                                    IDMComponent componentByName = c.b().getComponentByName(str2);
                                    if (b(componentByName, jSONObject.getJSONObject(str2))) {
                                        arrayList.add(componentByName);
                                    }
                                }
                            }
                            x15Var.a(AsyncRefreshSubscriber.KEY_NEED_REFRESH_COMPONENTS, arrayList);
                        } else if (b(iDMComponent, jSONObject.getJSONObject(iDMComponent.getKey()))) {
                            arrayList.add(iDMComponent);
                            x15Var.a(AsyncRefreshSubscriber.KEY_NEED_REFRESH_COMPONENTS, arrayList);
                        }
                    }
                }
            }
        }

        public final boolean b(IDMComponent iDMComponent, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("86e5fddc", new Object[]{this, iDMComponent, jSONObject})).booleanValue();
            }
            if (iDMComponent == null || iDMComponent.getData() == null || jSONObject == null) {
                return false;
            }
            JSONObject data = iDMComponent.getData();
            if (jSONObject.containsKey("fields")) {
                data.put("fields", (Object) jSONObject.getJSONObject("fields"));
            }
            if (jSONObject.containsKey("events")) {
                data.put("events", (Object) jSONObject.getJSONObject("events"));
            }
            iDMComponent.writeBackDataAndReloadEvent(data, true);
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f2267a;
        public int b;

        static {
            t2o.a(157286508);
        }

        public b() {
            this.f2267a = 0;
            this.b = 0;
        }
    }

    static {
        t2o.a(157286505);
    }

    public AsyncRefreshSubscriber() {
        this.g = 300;
        e();
    }

    public static /* synthetic */ Object ipc$super(AsyncRefreshSubscriber asyncRefreshSubscriber, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/event/AsyncRefreshSubscriber");
    }

    public static /* synthetic */ void x(AsyncRefreshSubscriber asyncRefreshSubscriber, String str, CustomLoadRenderParser.LoadState loadState, RecyclerViewHolder recyclerViewHolder, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e680029", new Object[]{asyncRefreshSubscriber, str, loadState, recyclerViewHolder, obj});
        } else {
            asyncRefreshSubscriber.B(str, loadState, recyclerViewHolder, obj);
        }
    }

    public static /* synthetic */ void y(AsyncRefreshSubscriber asyncRefreshSubscriber, MtopResponse mtopResponse, JSONArray jSONArray, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57e58eb", new Object[]{asyncRefreshSubscriber, mtopResponse, jSONArray, str, new Boolean(z)});
        } else {
            asyncRefreshSubscriber.A(mtopResponse, jSONArray, str, z);
        }
    }

    public static /* synthetic */ void z(AsyncRefreshSubscriber asyncRefreshSubscriber, IDMComponent iDMComponent, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a213368f", new Object[]{asyncRefreshSubscriber, iDMComponent, bVar});
        } else {
            asyncRefreshSubscriber.C(iDMComponent, bVar);
        }
    }

    public final void A(MtopResponse mtopResponse, JSONArray jSONArray, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85408416", new Object[]{this, mtopResponse, jSONArray, str, new Boolean(z)});
            return;
        }
        o5e o5eVar = this.c;
        if (o5eVar instanceof com.alibaba.android.ultron.vfw.instance.a) {
            com.alibaba.android.ultron.vfw.instance.a aVar = (com.alibaba.android.ultron.vfw.instance.a) o5eVar;
            w15 v = str != null ? aVar.v(str) : null;
            if (v == null) {
                v = new a();
            }
            x15 x15Var = new x15(this.c);
            x15Var.a(KEY_COMPONENT, this.e);
            x15Var.a("mtopResponse", mtopResponse);
            x15Var.a(KEY_IS_ERROR, Boolean.valueOf(z));
            x15Var.a(KEY_TARGET_COMPONENTS, jSONArray);
            v.a(x15Var);
            List<IDMComponent> list = (List) x15Var.b(KEY_NEED_REFRESH_COMPONENTS);
            if (!(list == null || list.isEmpty())) {
                ArrayList arrayList = new ArrayList();
                for (IDMComponent iDMComponent : list) {
                    if (iDMComponent != null) {
                        arrayList.add(iDMComponent.getKey());
                    }
                }
                String bizName = this.d.getBizName();
                UnifyLog.m(bizName, TAG, "CustomSubscriberParser finish", " refresh: " + pqq.a(arrayList, ","));
                UltronInstanceConfig F = aVar.F();
                if (F == null || !F.q()) {
                    aVar.X(127);
                } else {
                    aVar.e(list);
                }
                if (aVar.t() != null) {
                    aVar.t().a(list);
                }
                this.h = System.currentTimeMillis();
            }
        }
    }

    public final void B(String str, CustomLoadRenderParser.LoadState loadState, RecyclerViewHolder recyclerViewHolder, Object obj) {
        CustomLoadRenderParser customLoadRenderParser;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2a56f11", new Object[]{this, str, loadState, recyclerViewHolder, obj});
            return;
        }
        if (str != null) {
            customLoadRenderParser = ((com.alibaba.android.ultron.vfw.instance.a) this.c).u(str);
        } else {
            customLoadRenderParser = null;
        }
        if (customLoadRenderParser != null && recyclerViewHolder != null) {
            customLoadRenderParser.a(loadState, recyclerViewHolder.getRootView(), this.e, this.c);
        }
    }

    public final void C(IDMComponent iDMComponent, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4d781b8", new Object[]{this, iDMComponent, bVar});
        } else if (iDMComponent != null && bVar != null) {
            iDMComponent.getExtMap().put("asyncStatus", Integer.valueOf(bVar.b));
        }
    }

    @Override // tb.l6v
    public void s(List<IDMComponent> list, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef2e7890", new Object[]{this, list, obj});
        } else {
            ((HashMap) this.j).clear();
        }
    }

    @Override // tb.l6v
    public void t(b8v b8vVar) {
        MethodEnum methodEnum;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("827a7510", new Object[]{this, b8vVar});
            return;
        }
        JSONObject fields = j().getFields();
        if (fields == null) {
            UnifyLog.m(this.d.getBizName(), TAG, "error: eventFields is null", new String[0]);
            return;
        }
        final JSONArray jSONArray = fields.getJSONArray(KEY_TARGET_COMPONENTS);
        final String string = fields.getString("parseKey");
        String string2 = fields.getString("repeatRequest");
        if (TextUtils.isEmpty(string2)) {
            string2 = "none";
        }
        final b bVar = (b) ((HashMap) this.j).get(this.e.getKey());
        if (bVar == null) {
            bVar = new b();
            ((HashMap) this.j).put(this.e.getKey(), bVar);
        }
        string2.hashCode();
        char c = 65535;
        switch (string2.hashCode()) {
            case -1414557169:
                if (string2.equals(RVStartParams.TRANSPARENT_TITLE_ALWAYS)) {
                    c = 0;
                    break;
                }
                break;
            case -1281977283:
                if (string2.equals("failed")) {
                    c = 1;
                    break;
                }
                break;
            case 3387192:
                if (string2.equals("none")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                if (bVar.b == 1) {
                    return;
                }
                break;
            case 1:
                int i = bVar.b;
                if (i == 1 || i == 2) {
                    return;
                }
                break;
            case 2:
                if (bVar.f2267a >= 1) {
                    return;
                }
                break;
        }
        JSONObject jSONObject = fields.getJSONObject("mtopConfig");
        if (jSONObject == null) {
            UnifyLog.m(this.d.getBizName(), TAG, "error: mtopConfig is null", new String[0]);
            return;
        }
        String string3 = jSONObject.getString("apiMethod");
        String string4 = jSONObject.getString("apiVersion");
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        boolean booleanValue = jSONObject.getBooleanValue("isNeedWua");
        boolean booleanValue2 = jSONObject.getBooleanValue("usePost");
        this.k = jSONObject.getString("unitStrategy");
        if (TextUtils.isEmpty(string3) || TextUtils.isEmpty(string4)) {
            UnifyLog.m(this.d.getBizName(), TAG, "error: apiMethod or apiVersion is null", new String[0]);
            return;
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(string3);
        mtopRequest.setVersion(string4);
        if (jSONObject2 != null) {
            mtopRequest.setData(jSONObject2.toJSONString());
        }
        MtopBusiness build = MtopBusiness.build(mtopRequest);
        if (booleanValue2) {
            methodEnum = MethodEnum.POST;
        } else {
            methodEnum = MethodEnum.GET;
        }
        build.reqMethod(methodEnum);
        if (booleanValue) {
            build.useWua();
        }
        if ("UNIT_GUIDE".equals(this.k) || "UNIT_TRADE".equals(this.k)) {
            build.setUnitStrategy(this.k);
        }
        final String string5 = fields.getString("loadRenderKey");
        final RecyclerViewHolder recyclerViewHolder = (RecyclerViewHolder) g(f8v.KEY_TRIGGER_VIEW_HOLDER);
        build.addListener((MtopListener) new IRemoteBaseListener() { // from class: com.alibaba.android.ultron.event.AsyncRefreshSubscriber.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i2, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i2), mtopResponse, obj});
                    return;
                }
                String bizName = AsyncRefreshSubscriber.this.d.getBizName();
                UnifyLog.m(bizName, AsyncRefreshSubscriber.TAG, "AsyncRefresh onError: " + mtopResponse.getRetMsg(), new String[0]);
                AsyncRefreshSubscriber.x(AsyncRefreshSubscriber.this, string5, CustomLoadRenderParser.LoadState.SATAE_FAILED, recyclerViewHolder, mtopResponse);
                AsyncRefreshSubscriber.y(AsyncRefreshSubscriber.this, mtopResponse, jSONArray, string, true);
                b bVar2 = bVar;
                bVar2.b = 3;
                AsyncRefreshSubscriber asyncRefreshSubscriber = AsyncRefreshSubscriber.this;
                AsyncRefreshSubscriber.z(asyncRefreshSubscriber, asyncRefreshSubscriber.e, bVar2);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i2, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i2), mtopResponse, baseOutDo, obj});
                    return;
                }
                UnifyLog.m(AsyncRefreshSubscriber.this.d.getBizName(), AsyncRefreshSubscriber.TAG, "AsyncRefresh onSuccess", mtopResponse.getRetMsg());
                AsyncRefreshSubscriber.x(AsyncRefreshSubscriber.this, string5, CustomLoadRenderParser.LoadState.STATE_SUCCESS, recyclerViewHolder, mtopResponse);
                AsyncRefreshSubscriber.y(AsyncRefreshSubscriber.this, mtopResponse, jSONArray, string, false);
                b bVar2 = bVar;
                bVar2.b = 2;
                AsyncRefreshSubscriber asyncRefreshSubscriber = AsyncRefreshSubscriber.this;
                AsyncRefreshSubscriber.z(asyncRefreshSubscriber, asyncRefreshSubscriber.e, bVar2);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i2, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i2), mtopResponse, obj});
                    return;
                }
                String bizName = AsyncRefreshSubscriber.this.d.getBizName();
                UnifyLog.m(bizName, AsyncRefreshSubscriber.TAG, "AsyncRefresh onSystemError: " + mtopResponse.getRetMsg(), new String[0]);
                AsyncRefreshSubscriber.x(AsyncRefreshSubscriber.this, string5, CustomLoadRenderParser.LoadState.SATAE_FAILED, recyclerViewHolder, mtopResponse);
                AsyncRefreshSubscriber.y(AsyncRefreshSubscriber.this, mtopResponse, jSONArray, string, true);
                b bVar2 = bVar;
                bVar2.b = 3;
                AsyncRefreshSubscriber asyncRefreshSubscriber = AsyncRefreshSubscriber.this;
                AsyncRefreshSubscriber.z(asyncRefreshSubscriber, asyncRefreshSubscriber.e, bVar2);
            }
        });
        String bizName = this.d.getBizName();
        UnifyLog.m(bizName, TAG, "start execute: " + string3, new String[0]);
        build.startRequest();
        bVar.f2267a = bVar.f2267a + 1;
        bVar.b = 1;
        C(this.e, bVar);
        B(string5, CustomLoadRenderParser.LoadState.STATE_LOADING, recyclerViewHolder, null);
    }
}
