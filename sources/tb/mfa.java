package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.common.LiveItem;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class mfa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f24010a;
    public final String b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LiveItem f24011a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ xea c;
        public final /* synthetic */ Context d;

        public a(LiveItem liveItem, boolean z, xea xeaVar, Context context) {
            this.f24011a = liveItem;
            this.b = z;
            this.c = xeaVar;
            this.d = context;
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            } else {
                a1u.a(this.d, "活动太火爆了，再试一次");
            }
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            } else {
                a1u.a(this.d, "活动太火爆了，再试一次");
            }
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            } else if (netResponse != null && netResponse.getDataJsonObject() != null) {
                try {
                    if (netResponse.getDataJsonObject().optBoolean("result", false)) {
                        LiveItem liveItem = this.f24011a;
                        if (liveItem.personalityData == null) {
                            liveItem.personalityData = new JSONObject();
                        }
                        if (this.b) {
                            this.f24011a.personalityData.put("subscribeStatus", (Object) "1");
                        } else {
                            this.f24011a.personalityData.put("subscribeStatus", (Object) "0");
                        }
                        pfa.Z(this.f24011a, this.c);
                        Context context = this.d;
                        if (this.b) {
                            str = mfa.a(mfa.this);
                        } else {
                            str = mfa.b(mfa.this);
                        }
                        a1u.a(context, str);
                        return;
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                a1u.a(this.d, "活动太火爆了，再试一次");
            }
        }
    }

    static {
        t2o.a(295698968);
    }

    public mfa() {
        JSONObject d;
        this.f24010a = "预约成功，将在主播开卖时提醒你";
        this.b = "已取消预约";
        String i = vvs.i("goodlist", "preheatToast", "");
        if (!TextUtils.isEmpty(i) && (d = fkx.d(i)) != null) {
            String string = d.getString("add");
            String string2 = d.getString("cancel");
            if (!TextUtils.isEmpty(string)) {
                this.f24010a = string;
            }
            if (!TextUtils.isEmpty(string2)) {
                this.b = string2;
            }
        }
    }

    public static /* synthetic */ String a(mfa mfaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c853e51c", new Object[]{mfaVar});
        }
        return mfaVar.f24010a;
    }

    public static /* synthetic */ String b(mfa mfaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("215f309d", new Object[]{mfaVar});
        }
        return mfaVar.b;
    }

    public final void c(xea xeaVar, LiveItem liveItem, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3e8498b", new Object[]{this, xeaVar, liveItem, new Boolean(z)});
        } else if (kkr.i().o() != null) {
            HashMap<String, String> e = zha.e(xeaVar, liveItem);
            if (z) {
                str = "0";
            } else {
                str = "1";
            }
            e.put("subscribe", "1_".concat(str));
            kkr.i().o().c("ItemSubscribe", e);
        }
    }

    public void d(xea xeaVar, Context context, LiveItem liveItem, String str) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f5f498", new Object[]{this, xeaVar, context, liveItem, str});
        } else if (liveItem != null) {
            JSONObject jSONObject = liveItem.personalityData;
            if (jSONObject != null && TextUtils.equals("1", jSONObject.getString("subscribeStatus"))) {
                z = false;
            }
            c(xeaVar, liveItem, z);
            new kfa(new a(liveItem, z, xeaVar, context)).K(zqq.h(liveItem.liveId), liveItem.itemId, z, str);
        }
    }
}
