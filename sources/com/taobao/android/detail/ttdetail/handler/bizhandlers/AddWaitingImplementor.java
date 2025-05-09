package com.taobao.android.detail.ttdetail.handler.bizhandlers;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Item;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.request.params.MtopRequestParams;
import com.taobao.android.detail.ttdetail.utils.DataUtils;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopResponse;
import tb.ag0;
import tb.f6j;
import tb.ir;
import tb.t2o;
import tb.u5o;
import tb.yc4;
import tb.ze7;
import tb.zre;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AddWaitingImplementor implements zre {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "addJhsWaiting";
    public static final String EVENT_TYPE_ALTERNATIVE = "add_jhs_waiting";

    /* renamed from: a  reason: collision with root package name */
    public final Context f6795a;
    public final ze7 b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends f6j<MtopRequestParams> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(AddWaitingImplementor addWaitingImplementor, MtopRequestParams mtopRequestParams) {
            super(mtopRequestParams);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/handler/bizhandlers/AddWaitingImplementor$4");
        }

        @Override // tb.f6j
        public String d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8523c6ca", new Object[]{this});
            }
            return "mtop.ju.user.collection.add";
        }

        @Override // tb.f6j
        public String e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("44c0ca25", new Object[]{this});
            }
            return "2.0";
        }

        @Override // tb.f6j
        public MethodEnum h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MethodEnum) ipChange.ipc$dispatch("2fddf0c4", new Object[]{this});
            }
            return MethodEnum.GET;
        }

        @Override // tb.f6j
        public boolean k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3050dbb1", new Object[]{this})).booleanValue();
            }
            return true;
        }

        @Override // tb.f6j
        public boolean l() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1a40a375", new Object[]{this})).booleanValue();
            }
            return true;
        }

        @Override // tb.f6j
        public String m() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("7072a98c", new Object[]{this});
            }
            return "UNIT_TRADE";
        }
    }

    static {
        t2o.a(912261833);
        t2o.a(912261826);
    }

    public AddWaitingImplementor(Context context, ze7 ze7Var) {
        this.f6795a = context;
        this.b = ze7Var;
    }

    public static /* synthetic */ void b(AddWaitingImplementor addWaitingImplementor, JSONObject jSONObject, boolean z, RuntimeAbilityParam[] runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bcf961b", new Object[]{addWaitingImplementor, jSONObject, new Boolean(z), runtimeAbilityParamArr});
        } else {
            addWaitingImplementor.e(jSONObject, z, runtimeAbilityParamArr);
        }
    }

    public static /* synthetic */ Context c(AddWaitingImplementor addWaitingImplementor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("f62cb930", new Object[]{addWaitingImplementor});
        }
        return addWaitingImplementor.f6795a;
    }

    public static /* synthetic */ ze7 d(AddWaitingImplementor addWaitingImplementor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ze7) ipChange.ipc$dispatch("b82adf61", new Object[]{addWaitingImplementor});
        }
        return addWaitingImplementor.b;
    }

    public final void e(JSONObject jSONObject, boolean z, final RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("677fc0f4", new Object[]{this, jSONObject, new Boolean(z), runtimeAbilityParamArr});
            return;
        }
        final JSONObject jSONObject2 = new JSONObject();
        jSONObject2.putAll(jSONObject);
        jSONObject2.put("subType", "jhsRemind");
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(ag0.KEY_BE_REPLACED, (Object) "bottomBarVO");
        jSONObject3.put(ag0.KEY_TO_REPLACE, (Object) "fields");
        jSONObject2.put(ag0.KEY_TARGET_REPLACEMENT, (Object) jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.putAll(jSONObject2);
        jSONObject4.put("status", Boolean.valueOf(z));
        jSONObject4.put("btnTitle", jSONObject.getString("disabledTitle"));
        jSONObject2.put("payload", (Object) jSONObject4);
        this.b.h().g(new Runnable() { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.AddWaitingImplementor.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    AddWaitingImplementor.d(AddWaitingImplementor.this).b().h(new ir(new JSONObject() { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.AddWaitingImplementor.2.1
                        {
                            put("type", ag0.EVENT_TYPE);
                            put("fields", (Object) jSONObject2);
                        }
                    }), runtimeAbilityParamArr);
                }
            }
        });
    }

    public final void f(final String str, final String str2, IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("695bf62b", new Object[]{this, str, str2, iRemoteBaseListener});
        } else {
            new a(this, new MtopRequestParams() { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.AddWaitingImplementor.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail.ttdetail.request.params.MtopRequestParams
                public String toData() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (String) ipChange2.ipc$dispatch("add28f54", new Object[]{this});
                    }
                    return new JSONObject() { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.AddWaitingImplementor.3.1
                        {
                            put("detail_v", "3.3.2");
                            put("itemNumId", (Object) str);
                            put("salesSite", (Object) str2);
                        }
                    }.toJSONString();
                }
            }).n(u5o.c()).q(iRemoteBaseListener).c();
        }
    }

    @Override // tb.zre
    public boolean a(ir irVar, final RuntimeAbilityParam... runtimeAbilityParamArr) {
        final JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5228eae5", new Object[]{this, irVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (irVar == null || (a2 = irVar.a()) == null || yc4.i(runtimeAbilityParamArr) == null) {
            return false;
        }
        f(DataUtils.w((Item) this.b.e().f(Item.class), ""), a2.getString("salesSite"), new IRemoteBaseListener() { // from class: com.taobao.android.detail.ttdetail.handler.bizhandlers.AddWaitingImplementor.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    onError(i, mtopResponse, obj);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    Toast.makeText(AddWaitingImplementor.c(AddWaitingImplementor.this), "系统异常，请重试", 0).show();
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                try {
                    JSONObject jSONObject = JSON.parseObject(new String(mtopResponse.getBytedata())).getJSONObject("data");
                    AddWaitingImplementor.b(AddWaitingImplementor.this, a2, jSONObject.getBooleanValue("btnDisable"), runtimeAbilityParamArr);
                    String string = jSONObject.getString("errorMessage");
                    if (!TextUtils.isEmpty(string)) {
                        Toast.makeText(AddWaitingImplementor.c(AddWaitingImplementor.this), string, 0).show();
                    }
                } catch (Throwable unused) {
                    Toast.makeText(AddWaitingImplementor.c(AddWaitingImplementor.this), "系统异常，请重试", 0).show();
                }
            }
        });
        return true;
    }
}
