package tb;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.preload.IPreloadService;
import com.taobao.android.fluid.framework.preload.task.BasePreloadTaskImpl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class e9b extends BasePreloadTaskImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String k;

    static {
        t2o.a(468714698);
    }

    public e9b(FluidContext fluidContext, Context context, JSONObject jSONObject, grm grmVar) {
        super(fluidContext, context, jSONObject, grmVar);
        this.k = nwv.I(jSONObject.get("url"), null);
    }

    public static /* synthetic */ Object ipc$super(e9b e9bVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2128160755:
                return e9bVar.toString();
            case -798600422:
                return e9bVar.getPreloadVideoData();
            case -512593800:
                return e9bVar.getContext();
            case 299334352:
                e9bVar.a((ntm) objArr[0], (sv2) objArr[1]);
                return null;
            case 462157602:
                return new Boolean(e9bVar.b((JSONObject) objArr[0]));
            case 1777338802:
                e9bVar.n((String) objArr[0], objArr[1]);
                return null;
            case 2019319885:
                return e9bVar.i();
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/preload/task/HuituiPreloadTask");
        }
    }

    @Override // com.taobao.android.fluid.framework.preload.task.IPreloadTask
    public void c(sv2<ntm> sv2Var) {
        ntm buildPreloadVideoIfCacheData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83d7286e", new Object[]{this, sv2Var});
        } else if (!TextUtils.isEmpty(this.k) && (buildPreloadVideoIfCacheData = ((IPreloadService) this.c.getService(IPreloadService.class)).getPreRenderDWInstance().buildPreloadVideoIfCacheData(this.b, null, true, Uri.parse(this.k))) != null) {
            k(buildPreloadVideoIfCacheData, null, null, null, sv2Var);
        }
    }
}
