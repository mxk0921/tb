package tb;

import android.net.Uri;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weaver.prefetch.PrefetchType;
import com.taobao.weaver.prefetch.a;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class gsw implements mqm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f20203a = "Prefetch.getData";
    public static final String b = "Prefetch.requestData";
    public static final String c = "test";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class a extends h7b<b8b> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ hqm f20204a;

        public a(gsw gswVar, hqm hqmVar) {
            this.f20204a = hqmVar;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/prefetch/WVPrefetchHandler$1");
        }

        /* renamed from: e */
        public void b(b8b b8bVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("696fd54d", new Object[]{this, b8bVar, new Integer(i)});
            } else if (b8bVar == null || b8bVar.b().length == 0) {
                ((a.C0799a) this.f20204a).c("-4", "getData Error");
            } else {
                try {
                    String str = new String(b8bVar.b(), "utf-8");
                    iqm iqmVar = new iqm();
                    iqmVar.e = JSON.parseObject(str);
                    iqmVar.b = 500;
                    iqmVar.c = 10;
                    ((a.C0799a) this.f20204a).b(iqmVar);
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override // tb.mqm
    public String a(String str, Map<String, Object> map, hqm hqmVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("419a27a4", new Object[]{this, str, map, hqmVar});
        }
        JSONObject jSONObject = new JSONObject(map);
        if (jSONObject.getBoolean("isLocal") != null) {
            z = jSONObject.getBoolean("isLocal").booleanValue();
        }
        if (z) {
            HashMap hashMap = new HashMap();
            hashMap.put("client", "TBClient");
            hashMap.put("apiName", "Prefetch");
            hashMap.put("type", "Local");
            iqm iqmVar = new iqm();
            iqmVar.e = hashMap;
            iqmVar.c = 10;
            iqmVar.b = 500;
            ((a.C0799a) hqmVar).b(iqmVar);
            return null;
        }
        hi4.c().a(str, new a(this, hqmVar));
        return null;
    }

    @Override // tb.mqm
    public wow b(String str, Map<String, Object> map) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wow) ipChange.ipc$dispatch("6effa818", new Object[]{this, str, map});
        }
        JSONObject jSONObject = new JSONObject(map);
        if (jSONObject.getBoolean(txq.IS_SUPPORT_KEY) != null) {
            z = jSONObject.getBoolean(txq.IS_SUPPORT_KEY).booleanValue();
        }
        String queryParameter = Uri.parse(str).getQueryParameter("apiName");
        wow wowVar = new wow();
        if (f20203a.equals(queryParameter) || b.equals(queryParameter) || z) {
            wowVar.b = c;
            if (map.containsKey("externalKey")) {
                wowVar.b = jSONObject.getString("externalKey");
            }
            wowVar.f30829a = PrefetchType.SUPPORTED;
        }
        return wowVar;
    }

    static {
        t2o.a(989856362);
    }
}
