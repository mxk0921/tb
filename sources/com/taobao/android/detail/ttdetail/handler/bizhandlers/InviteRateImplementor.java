package com.taobao.android.detail.ttdetail.handler.bizhandlers;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.hjh;
import tb.ir;
import tb.t2o;
import tb.ze7;
import tb.zre;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class InviteRateImplementor implements zre {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "invateRate";

    /* renamed from: a  reason: collision with root package name */
    public final Context f6814a;
    public final ze7 b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class InviteRateRequestCallback implements IRemoteBaseListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private Context mContext;
        private ze7 mDetailContext;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f6815a;

            public a(String str) {
                this.f6815a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    Toast.makeText(InviteRateRequestCallback.access$000(InviteRateRequestCallback.this), this.f6815a, 0).show();
                }
            }
        }

        static {
            t2o.a(912261883);
            t2o.a(589299719);
        }

        public InviteRateRequestCallback(Context context, ze7 ze7Var) {
            this.mContext = context;
            this.mDetailContext = ze7Var;
        }

        public static /* synthetic */ Context access$000(InviteRateRequestCallback inviteRateRequestCallback) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Context) ipChange.ipc$dispatch("baf30d45", new Object[]{inviteRateRequestCallback});
            }
            return inviteRateRequestCallback.mContext;
        }

        private void showToast(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e1afc03b", new Object[]{this, str});
            } else {
                this.mDetailContext.h().g(new a(str));
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            } else {
                showToast("服务器开小差了，请稍后再试一下吧～");
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            } else if (mtopResponse == null || mtopResponse.getBytedata() == null) {
                showToast("服务器开小差了，请稍后再试一下吧～");
            } else {
                JSONObject parseObject = JSON.parseObject(new String(mtopResponse.getBytedata()));
                if (parseObject == null) {
                    showToast("服务器开小差了，请稍后再试一下吧～");
                    return;
                }
                JSONObject jSONObject = parseObject.getJSONObject("data");
                if (jSONObject == null || !jSONObject.getBooleanValue("result")) {
                    showToast("服务器开小差了，请稍后再试一下吧～");
                } else {
                    showToast("邀请成功！新评价会给亲发消息哦～");
                }
            }
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            } else {
                showToast("服务器开小差了，请稍后再试一下吧～");
            }
        }
    }

    static {
        t2o.a(912261882);
        t2o.a(912261826);
    }

    public InviteRateImplementor(Context context, ze7 ze7Var) {
        this.f6814a = context;
        this.b = ze7Var;
    }

    @Override // tb.zre
    public boolean a(ir irVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5228eae5", new Object[]{this, irVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (irVar == null) {
            return false;
        }
        if (!hjh.c()) {
            hjh.d(true);
            return true;
        }
        JSONObject a2 = irVar.a();
        if (a2 == null) {
            return false;
        }
        String string = a2.getString("itemId");
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        b(this.f6814a, this.b, string);
        return true;
    }

    public final void b(Context context, ze7 ze7Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9111a0b1", new Object[]{this, context, ze7Var, str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("scene", (Object) "taobao_item_rate_invite");
        jSONObject.put("source", (Object) "ali.china.taobao");
        jSONObject.put("targetId", (Object) str);
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setData(jSONObject.toJSONString());
        mtopRequest.setApiName("mtop.taobao.rate.invite");
        mtopRequest.setVersion("1.0");
        MtopBusiness build = MtopBusiness.build(mtopRequest);
        build.reqMethod(MethodEnum.POST).useWua().registerListener((IRemoteListener) new InviteRateRequestCallback(context, ze7Var));
        build.startRequest();
    }
}
