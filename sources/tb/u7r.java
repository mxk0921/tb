package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.ability.hub.AbilityHubAdapter;
import com.alibaba.ability.impl.stdpop.StdPopAbility;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.purchase.aura.ability.AbilityParams;
import java.util.HashMap;
import java.util.Map;
import tb.ck;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class u7r {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static u7r b;

    /* renamed from: a  reason: collision with root package name */
    public final Map<Integer, c> f29211a = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements s2d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f29212a;

        public a(u7r u7rVar, Context context) {
            this.f29212a = context;
        }

        @Override // tb.s2d
        public void onCallback(ExecuteResult executeResult) {
            String str;
            String str2;
            String str3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
            } else if (!(executeResult instanceof FinishResult)) {
                if (executeResult instanceof ErrorResult) {
                    ErrorResult errorResult = (ErrorResult) executeResult;
                    str3 = errorResult.getCode();
                    str2 = errorResult.getMsg();
                    str = errorResult.getType();
                } else {
                    str3 = "";
                    str = str3;
                    str2 = str;
                }
                ck.g().f("以浮层模式打开下单", ck.b.b().g("code", str3).g("info", str2).g("type", str).a());
            } else if ("onClose".equalsIgnoreCase(executeResult.getType())) {
                hh.d(this.f29212a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements s2d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(u7r u7rVar) {
        }

        @Override // tb.s2d
        public void onCallback(ExecuteResult executeResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final String f29213a;
        public final String b;

        static {
            t2o.a(708837533);
        }

        public c(String str, String str2) {
            this.f29213a = str;
            this.b = str2;
        }
    }

    static {
        t2o.a(708837529);
    }

    public static u7r b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u7r) ipChange.ipc$dispatch("3392816c", new Object[0]);
        }
        if (b == null) {
            b = new u7r();
        }
        return b;
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbf227c9", new Object[]{this, context});
            return;
        }
        c cVar = (c) ((HashMap) this.f29211a).remove(Integer.valueOf(System.identityHashCode(context)));
        if (cVar == null) {
            hh.d(context);
            return;
        }
        AbilityHubAdapter abilityHubAdapter = new AbilityHubAdapter(new zq(cVar.b, "nativeFragment").a(context));
        AbilityParams abilityParams = new AbilityParams();
        abilityParams.popId = cVar.f29213a;
        if (abilityHubAdapter.z("stdPop", "close", new xq(), (JSONObject) JSON.toJSON(abilityParams), new b(this)) instanceof ErrorResult) {
            hh.d(context);
        }
    }

    public final String c(JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa7be5e", new Object[]{this, jSONObject, str, str2});
        }
        if (jSONObject == null) {
            return str2;
        }
        String string = jSONObject.getString(str);
        if (TextUtils.isEmpty(string)) {
            return str2;
        }
        return string;
    }

    public void d(Context context, AbilityParams abilityParams, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3cc9983", new Object[]{this, context, abilityParams, str});
        } else {
            e(context, abilityParams, str, null);
        }
    }

    public void e(Context context, AbilityParams abilityParams, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae2d888d", new Object[]{this, context, abilityParams, str, str2});
            return;
        }
        int identityHashCode = System.identityHashCode(context);
        if (TextUtils.isEmpty(str2)) {
            str2 = "TBBuyHalfScreenFragment" + identityHashCode;
        }
        ((HashMap) this.f29211a).put(Integer.valueOf(identityHashCode), new c(str2, str));
        AbilityHubAdapter abilityHubAdapter = new AbilityHubAdapter(new zq(str, "nativeFragment").a(context));
        AbilityParams abilityParams2 = new AbilityParams();
        abilityParams2.popId = str2;
        abilityParams2.bizId = str;
        abilityParams2.extConfig = abilityParams.extConfig;
        JSONObject c2 = f8r.c(hh.h(context));
        AbilityParams.b bVar = new AbilityParams.b();
        bVar.shouldBlockClose = c(c2, "shouldBlockClose", "true");
        bVar.droidFullScreen = c(c2, "droidFullScreen", "true");
        bVar.droidShouldHandleBack = c(c2, nbf.STDPOP_CONFIG_BACK, "false");
        bVar.animation = c(c2, "animation", nbf.STDPOP_ANIMATION_BOTTOM);
        bVar.panEnable = c(c2, "panEnable", "false");
        bVar.contentBackColor = c(c2, "contentBackColor", "#00000000");
        bVar.maxHeight = Float.parseFloat(c(c2, "maxHeight", "0.75"));
        bVar.attachMode = c(c2, "attachMode", "");
        bVar.backgroundMode = c(c2, "backgroundMode", "");
        bVar.backgroundStyle = c(c2, "backgroundStyle", "");
        bVar.cornerRadius = Float.parseFloat(c(c2, hij.KEY_CORNER_RADIUS, "16"));
        HashMap hashMap = new HashMap();
        hashMap.put("popId", str2);
        abilityParams2.content = hashMap;
        abilityParams2.popConfig = bVar;
        abilityHubAdapter.j("stdPop", StdPopAbility.API_NATIVE, new xq().p(null), (JSONObject) JSON.toJSON(abilityParams2), new a(this, context));
    }
}
