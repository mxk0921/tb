package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemActionQueryData;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemActionQueryResponse;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.MtopTbliveSeckillLimitCheckResponse;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.common.LiveItem;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class g7p {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MSG_TOAST_DEFAULT = "挤爆了，稍后重试哦!";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ xea f19776a;
        public final /* synthetic */ LiveItem b;
        public final /* synthetic */ JSONObject c;
        public final /* synthetic */ deb d;

        public a(xea xeaVar, LiveItem liveItem, JSONObject jSONObject, deb debVar) {
            this.f19776a = xeaVar;
            this.b = liveItem;
            this.c = jSONObject;
            this.d = debVar;
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            } else {
                this.d.onError("1", g7p.MSG_TOAST_DEFAULT);
            }
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            } else if (((MtopTbliveSeckillLimitCheckResponse) netBaseOutDo).getData().result) {
                g7p.a(this.f19776a, this.b, this.c, this.d);
            } else {
                this.d.onError("2", g7p.MSG_TOAST_DEFAULT);
            }
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            } else {
                onError(i, netResponse, obj);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LiveItem f19777a;
        public final /* synthetic */ deb b;

        public b(LiveItem liveItem, deb debVar) {
            this.f19777a = liveItem;
            this.b = debVar;
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            } else {
                this.b.onError("3", g7p.MSG_TOAST_DEFAULT);
            }
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                return;
            }
            ItemActionQueryData data = ((ItemActionQueryResponse) netBaseOutDo).getData();
            LiveItem.Ext ext = this.f19777a.extendVal;
            ext.business = data.business;
            String str = data.secKillInfo;
            ext.secKillInfo = str;
            JSONObject d = fkx.d(str);
            JSONObject jSONObject = d != null ? d.getJSONObject("threshold") : null;
            if (jSONObject != null && jSONObject.containsKey(yj4.PARAM_VRPASS) && jSONObject.getBoolean(yj4.PARAM_VRPASS).booleanValue()) {
                this.b.onResult("success");
            } else if (jSONObject != null) {
                this.b.onError("thresh_hold", jSONObject.getString("denyMsg"));
            } else {
                this.b.onError("thresh_hold", g7p.MSG_TOAST_DEFAULT);
            }
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            } else {
                onError(i, netResponse, obj);
            }
        }
    }

    static {
        t2o.a(295698989);
    }

    public static /* synthetic */ void a(xea xeaVar, LiveItem liveItem, JSONObject jSONObject, deb debVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef465152", new Object[]{xeaVar, liveItem, jSONObject, debVar});
        } else {
            c(xeaVar, liveItem, jSONObject, debVar);
        }
    }

    public static void b(xea xeaVar, LiveItem liveItem, JSONObject jSONObject, deb<String> debVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("586e70f5", new Object[]{xeaVar, liveItem, jSONObject, debVar});
        } else if (xeaVar == null || liveItem == null || debVar == null) {
            hha.b("SeckillLimitChecker", "checkLimit | params empty.");
        } else if (jSONObject == null) {
            hha.b("SeckillLimitChecker", "checkLimit | secKillInfo empty.");
        } else if (jga.i(xeaVar)) {
            new q7j(new a(xeaVar, liveItem, jSONObject, debVar)).K(liveItem.extendVal.anchorId, liveItem.liveId, String.valueOf(liveItem.itemId), jSONObject.getString("activityId"));
        } else {
            c(xeaVar, liveItem, jSONObject, debVar);
        }
    }

    public static void c(xea xeaVar, LiveItem liveItem, JSONObject jSONObject, deb<String> debVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e99c9887", new Object[]{xeaVar, liveItem, jSONObject, debVar});
            return;
        }
        JSONObject jSONObject2 = jSONObject != null ? jSONObject.getJSONObject("threshold") : null;
        if (jSONObject2 == null || !jSONObject2.containsKey(yj4.PARAM_VRPASS) || !jSONObject2.getBoolean(yj4.PARAM_VRPASS).booleanValue() || yga.y0()) {
            new qnf(new b(liveItem, debVar)).K(xeaVar, liveItem);
        } else {
            debVar.onResult("success");
        }
    }
}
