package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.exception.GatewayException;
import com.taobao.android.gateway.msgcenter.Message;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class q4a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GATEWAY_MSG_CHANNEL = "gateway";
    public static final String GATEWAY_PARAM_EVENTS = "events";
    public static Context b;
    public static String c;

    /* renamed from: a  reason: collision with root package name */
    public final i5a f26503a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements etc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.etc
        public void a(Message message) {
            JSONObject params;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ff5ee06e", new Object[]{this, message});
            } else if (TextUtils.equals(message.getChannelId(), b()) && (params = message.getParams()) != null) {
                try {
                    List<b5a> list = (List) params.get("events");
                    if (list != null && !list.isEmpty()) {
                        q4a.this.e(list);
                    }
                } catch (Throwable th) {
                    s3a.h(th, "msgCenter trigerEvent failed");
                }
            }
        }

        public String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5ac47931", new Object[]{this});
            }
            return "gateway";
        }
    }

    static {
        t2o.a(475004930);
    }

    public q4a(String str, JSONObject jSONObject) throws GatewayException {
        if (b != null) {
            this.f26503a = new i5a(str, jSONObject);
            return;
        }
        throw new GatewayException("gateway must init");
    }

    public static void a(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b56bf47", new Object[]{str, context});
            return;
        }
        b = context;
        c = str;
    }

    public void b(s4a s4aVar, String str) throws GatewayException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d121bec", new Object[]{this, s4aVar, str});
        } else {
            this.f26503a.c().c(str, s4aVar);
        }
    }

    public void c(es6 es6Var, String str) throws GatewayException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eef8efad", new Object[]{this, es6Var, str});
        } else {
            this.f26503a.c().d(str, es6Var);
        }
    }

    public void d(imi imiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e048f86a", new Object[]{this, imiVar});
        } else if (imiVar != null) {
            imiVar.d("gateway", new a());
        }
    }

    public void e(List<b5a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60a39e9", new Object[]{this, list});
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (b5a b5aVar : list) {
                if (b5aVar != null) {
                    arrayList.add(b5aVar.b());
                }
            }
            TLog.logd("gateway2-gateway.triggerEvents", TextUtils.join(",", arrayList));
        }
        d5a.e(list, this.f26503a);
    }

    public q4a(String str, String str2, String str3) throws GatewayException {
        if (b != null) {
            this.f26503a = new i5a(str, str2, str3, false);
            return;
        }
        throw new GatewayException("gateway must init");
    }
}
