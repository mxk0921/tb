package tb;

import android.content.Context;
import com.alibaba.ability.hub.AbilityHubAdapter;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class cji {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final AbilityHubAdapter f17098a;
    public final xq b = new xq();
    public final Map<String, String> c = new HashMap();
    public final s2d d = new a(this);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements s2d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(cji cjiVar) {
        }

        @Override // tb.s2d
        public void onCallback(ExecuteResult executeResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                return;
            }
            fve.e("MegaPreloadFirstChunk", "preloadFirstChunk onCallback : " + JSON.toJSONString(executeResult));
        }
    }

    static {
        t2o.a(729810253);
    }

    public cji(Context context, String str) {
        zq zqVar = new zq(str, "homepage");
        zqVar.a(context);
        this.f17098a = new AbilityHubAdapter(zqVar);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14631297", new Object[]{this, str});
            return;
        }
        fve.e("MegaPreloadFirstChunk", "preloadFirstChunk : " + str);
        ((HashMap) this.c).put("url", str);
        ((HashMap) this.c).put("preloadFirstChunk", "true");
        try {
            this.f17098a.j("ssr", "preloadFirstChunk", this.b, this.c, this.d);
        } catch (Exception e) {
            fve.c("MegaPreloadFirstChunk", "preloadFirstChunk error:" + e.getMessage(), e);
        }
    }
}
