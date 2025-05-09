package tb;

import android.content.Context;
import com.ali.user.open.ucc.UccResultCode;
import com.alibaba.ability.impl.speechrecognition.utils.RequestHelper;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.MethodEnum;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class zf4 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String APP_KEY = "qu0zVhvgLWHcFdnT";
    public static final zf4 INSTANCE = new zf4();
    public static final String URL = "wss://nls-gateway.cn-shanghai.aliyuncs.com/ws/v1";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a implements RequestHelper.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f32722a;
        public final /* synthetic */ g1a b;
        public final /* synthetic */ g1a c;

        public a(Context context, g1a g1aVar, g1a g1aVar2) {
            this.f32722a = context;
            this.b = g1aVar;
            this.c = g1aVar2;
        }

        @Override // com.alibaba.ability.impl.speechrecognition.utils.RequestHelper.a
        public void onFail(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2f5f2b8", new Object[]{this, str, str2});
                return;
            }
            iih iihVar = iih.INSTANCE;
            iihVar.a("SpeechRecognizer_ConfigHelper", "get token fail, errorCode: " + str + ", errorMsg: " + str2);
            g1a g1aVar = this.c;
            if (g1aVar != null) {
                g1aVar.invoke("get token fail, errorCode: " + str + ", errorMsg: " + str2);
            }
        }

        @Override // com.alibaba.ability.impl.speechrecognition.utils.RequestHelper.a
        public void onSuccess(JSONObject jSONObject) {
            JSONObject jSONObject2;
            JSONObject jSONObject3;
            JSONObject jSONObject4;
            JSONObject jSONObject5;
            JSONObject jSONObject6;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("980108a5", new Object[]{this, jSONObject});
                return;
            }
            if (!(jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("data")) == null || (jSONObject3 = jSONObject2.getJSONObject("content")) == null || (jSONObject4 = jSONObject3.getJSONObject("SpeechRecognition")) == null || (jSONObject5 = jSONObject4.getJSONObject("voiceToken")) == null)) {
                if (!ckf.b(jSONObject5.getBoolean("success"), Boolean.TRUE)) {
                    jSONObject5 = null;
                }
                if (!(jSONObject5 == null || (jSONObject6 = jSONObject5.getJSONObject("content")) == null)) {
                    String string = jSONObject6.getString("token");
                    Long l = jSONObject6.getLong("expireTime");
                    if (zf4.a(zf4.INSTANCE, string, l)) {
                        lno lnoVar = lno.INSTANCE;
                        Context context = this.f32722a;
                        ckf.f(string, "token");
                        lnoVar.e(context, string);
                        Context context2 = this.f32722a;
                        ckf.f(l, "expireTimeStamp");
                        lnoVar.d(context2, l.longValue());
                        g1a g1aVar = this.b;
                        if (g1aVar != null) {
                            g1aVar.invoke(string);
                            return;
                        }
                        return;
                    }
                }
            }
            iih iihVar = iih.INSTANCE;
            iihVar.a("SpeechRecognizer_ConfigHelper", "get token fail, data: " + jSONObject);
            g1a g1aVar2 = this.c;
            if (g1aVar2 != null) {
                g1aVar2.invoke("get token fail, data: " + jSONObject);
            }
        }
    }

    static {
        t2o.a(133169162);
    }

    public static final /* synthetic */ boolean a(zf4 zf4Var, String str, Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c6eb87a", new Object[]{zf4Var, str, l})).booleanValue();
        }
        return zf4Var.e(str, l);
    }

    public static /* synthetic */ void d(zf4 zf4Var, Context context, String str, g1a g1aVar, g1a g1aVar2, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4165d97b", new Object[]{zf4Var, context, str, g1aVar, g1aVar2, new Integer(i), obj});
            return;
        }
        if ((i & 4) != 0) {
            g1aVar = null;
        }
        if ((i & 8) != 0) {
            g1aVar2 = null;
        }
        zf4Var.c(context, str, g1aVar, g1aVar2);
    }

    public final void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ff77015", new Object[]{this, context});
            return;
        }
        ckf.g(context, "context");
        lno.INSTANCE.a(context);
    }

    public final boolean e(String str, Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac804561", new Object[]{this, str, l})).booleanValue();
        }
        if (str == null || str.length() == 0 || l == null || l.longValue() <= (System.currentTimeMillis() / 1000) - ((long) UccResultCode.NO_ACTION_BIND_FAILED)) {
            return false;
        }
        return true;
    }

    public final void c(Context context, String str, g1a<? super String, xhv> g1aVar, g1a<? super String, xhv> g1aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8075a194", new Object[]{this, context, str, g1aVar, g1aVar2});
            return;
        }
        ckf.g(context, "context");
        ckf.g(str, "bizId");
        lno lnoVar = lno.INSTANCE;
        String c = lnoVar.c(context);
        if (c == null || !INSTANCE.e(c, lnoVar.b(context))) {
            RequestHelper.b(RequestHelper.INSTANCE, "mtop.alibaba.mobile.bridge.connect", "1.0", MethodEnum.GET, v3i.f(jpu.a("bizInfoList", JSON.toJSONString(xz3.e(kotlin.collections.a.j(jpu.a("type", "SpeechRecognition"), jpu.a("id", "voiceToken"), jpu.a("content", v3i.f(jpu.a("bizId", str)))))))), null, new a(context, g1aVar, g1aVar2), 16, null);
        } else if (g1aVar != null) {
            g1aVar.invoke(c);
        }
    }
}
