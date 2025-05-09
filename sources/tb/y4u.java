package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.message.WVSubscribePlugin;
import com.taobao.message.kit.core.IObserver;
import com.taobao.message.message_open_api.api.data.topicsubscribe.rpc.SubScribeCenterResultDTO;
import com.taobao.message.subscribe.SubscribeUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class y4u extends m8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MEGA_NAME = "abilityHub";
    public u8 b;
    public final IObserver<SubScribeCenterResultDTO> c = new a();
    public static final String NAME = "topicSubscribe";
    public static final long DX_ABILITY_ID = k06.a(NAME);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements IObserver<SubScribeCenterResultDTO> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        /* renamed from: a */
        public void onNext(SubScribeCenterResultDTO subScribeCenterResultDTO) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8cf1c020", new Object[]{this, subScribeCenterResultDTO});
                return;
            }
            String jSONString = JSON.toJSONString(subScribeCenterResultDTO);
            tgh.b("TopicSubscribeAbility", "onNext : " + jSONString);
            if (y4u.i(y4u.this) != null) {
                y4u.i(y4u.this).callback("dataCallback", new f8(JSON.parseObject(jSONString)));
            }
        }

        @Override // com.taobao.message.kit.core.IObserver
        public void onComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
            } else if (y4u.i(y4u.this) != null) {
                y4u.i(y4u.this).callback("onComplete", new f8());
            }
        }

        @Override // com.taobao.message.kit.core.IObserver
        public void onError(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
                return;
            }
            tgh.c("TopicSubscribeAbility", "onError : ", th);
            if (y4u.i(y4u.this) != null) {
                y4u.i(y4u.this).callback("onError", new f8());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements w8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(354418786);
            t2o.a(336592930);
        }

        /* renamed from: a */
        public y4u build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (y4u) ipChange.ipc$dispatch("eff1303", new Object[]{this, obj});
            }
            return new y4u();
        }
    }

    public static /* synthetic */ u8 i(y4u y4uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u8) ipChange.ipc$dispatch("a8b019ba", new Object[]{y4uVar});
        }
        return y4uVar.b;
    }

    public static /* synthetic */ Object ipc$super(y4u y4uVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/alittdetail/subscribe/TopicSubscribeAbility");
    }

    @Override // tb.m8
    public c8 f(n8 n8Var, k8 k8Var, u8 u8Var) {
        String string;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("40f5a125", new Object[]{this, n8Var, k8Var, u8Var});
        }
        if (n8Var == null || n8Var.h() == null) {
            return new b8(new a8(90030, "params is null"), true);
        }
        try {
            JSONObject h = n8Var.h();
            string = h.getString("dataAPI");
            jSONObject = h.getJSONObject("data");
        } catch (Throwable th) {
            tgh.c("TopicSubscribeAbility", "onError : ", th);
            u8Var.callback("onError", new f8());
        }
        if (!TextUtils.isEmpty(string) && jSONObject != null) {
            tgh.b("TopicSubscribeAbility", "dataAPI : " + string + " data : " + jSONObject.toString());
            this.b = u8Var;
            String string2 = jSONObject.getString("activityType");
            String string3 = jSONObject.getString("subFrom");
            if (string.contains(WVSubscribePlugin.ACTION_QUERY_SUBSCRIBE)) {
                SubscribeUtils.INSTANCE.querySubscribe(jSONObject.getString("topicIds"), string2, null, string3, this.c);
            } else if (string.contains(WVSubscribePlugin.ACTION_DO_SUBSCRIBE)) {
                SubscribeUtils.INSTANCE.doSubscribe(jSONObject.getString("topicId"), string2, null, string3, this.c);
            } else if (string.contains(WVSubscribePlugin.ACTION_CANCEL_SUBSCRIBE)) {
                SubscribeUtils.INSTANCE.cancelSubscribe(jSONObject.getString("topicId"), string2, null, string3, this.c);
            }
            return new f8();
        }
        return new b8(new a8(90030, "api name is null"), true);
    }

    static {
        t2o.a(354418784);
    }
}
