package com.taobao.zcache.core;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.zcache.core.ZCacheCoreProxy;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import tb.obk;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f14188a;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.zcache.core.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class C0824a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f14189a;
        public final /* synthetic */ b b;

        public C0824a(String str, b bVar) {
            this.f14189a = str;
            this.b = bVar;
        }

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            } else if (this.f14189a.equals(str)) {
                Map<String, String> configs = OrangeConfig.getInstance().getConfigs(this.f14189a);
                JSONObject jSONObject = new JSONObject();
                try {
                    for (Map.Entry<String, String> entry : configs.entrySet()) {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    }
                } catch (JSONException unused) {
                }
                ((ZCacheCoreProxy.b) this.b).a(this.f14189a, jSONObject);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface b {
    }

    static {
        t2o.a(996147244);
        f14188a = false;
        try {
            f14188a = true;
        } catch (NoClassDefFoundError unused) {
        }
    }

    public static void a(String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39ca7bd1", new Object[]{str, bVar});
            return;
        }
        if (!(str == null || bVar == null)) {
            try {
                OrangeConfig.getInstance().registerListener(new String[]{str}, new C0824a(str, bVar), true);
            } catch (NoClassDefFoundError unused) {
            }
        }
    }
}
