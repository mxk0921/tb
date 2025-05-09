package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.network.MtopConnection;
import com.taobao.tao.messagekit.core.model.BaseMessage;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.ts1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class eap implements ts1.f<List<ikl>, Map<String, Object>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public volatile awc f18426a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements lzx<List<ikl>, l5y<ikl>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(eap eapVar) {
        }

        /* renamed from: a */
        public l5y<ikl> apply(List<ikl> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (l5y) ipChange.ipc$dispatch("1378d50f", new Object[]{this, list});
            }
            return l5y.l(list);
        }
    }

    static {
        t2o.a(628097256);
        t2o.a(628097080);
    }

    public static /* synthetic */ void c(eap eapVar, Map map, ikl iklVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c17fdc7", new Object[]{eapVar, map, iklVar});
        } else {
            eapVar.e(map, iklVar);
        }
    }

    /* renamed from: d */
    public l5y<Map<String, Object>> b(l5y<List<ikl>> l5yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l5y) ipChange.ipc$dispatch("720c918d", new Object[]{this, l5yVar});
        }
        return l5yVar.s(new b(this)).G(new a());
    }

    public final void e(Map<String, Object> map, ikl<BaseMessage> iklVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bab9cd9", new Object[]{this, map, iklVar});
            return;
        }
        if (this.f18426a == null) {
            synchronized (eap.class) {
                try {
                    if (this.f18426a == null) {
                        this.f18426a = g4j.a(p2j.k);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f18426a.a(map, iklVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements lzx<ikl, Map<String, Object>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        /* renamed from: a */
        public Map<String, Object> apply(ikl iklVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("af477e9", new Object[]{this, iklVar});
            }
            HashMap hashMap = new HashMap();
            try {
                hashMap.put("mqtt_type", Integer.valueOf(((BaseMessage) iklVar.f21366a).msgType));
                hashMap.put("msg_type", Integer.valueOf(((BaseMessage) iklVar.f21366a).type));
                hashMap.put("sub_type", Integer.valueOf(((BaseMessage) iklVar.f21366a).header.g));
                M m = iklVar.f21366a;
                if (((BaseMessage) m).bizCode > 0) {
                    hashMap.put("namespace", Integer.valueOf(((BaseMessage) m).bizCode));
                }
                hashMap.put("context", iklVar.n);
                hashMap.put("id", ((BaseMessage) iklVar.f21366a).getID());
                hashMap.put(MtopConnection.KEY_DID, p2j.e);
                hashMap.put("version", "1.0");
                eap.c(eap.this, hashMap, iklVar);
                hashMap.put("data", new JSONObject(((BaseMessage) iklVar.f21366a).toMap()).toString());
                MsgLog.i("SendConverter4MTOP", "con 1", "convert msg to map", hashMap.get("api"));
            } catch (Throwable th) {
                MsgLog.f("SendConverter4MTOP", th, "mtop send apply err");
            }
            return hashMap;
        }
    }
}
