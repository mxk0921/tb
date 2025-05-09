package tb;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai2.material.base.MaterialRequestPolicy;
import com.taobao.taopai2.material.request.Response;
import java.io.File;
import tb.drc;
import tb.hrc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ls2<T extends hrc> implements drc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public erc f23539a;

    static {
        t2o.a(782237921);
        t2o.a(782237922);
    }

    @Override // tb.drc
    public Response<T> a(drc.a aVar) {
        Response<T> response;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Response) ipChange.ipc$dispatch("6b79651b", new Object[]{this, aVar});
        }
        wjn wjnVar = (wjn) aVar;
        erc a2 = wjnVar.a();
        this.f23539a = a2;
        if (a2.getRequestPolicy() == MaterialRequestPolicy.NET || this.f23539a.getRequestPolicy() == MaterialRequestPolicy.NET_CACHE) {
            response = wjnVar.c(wjnVar.a());
            if (response != null) {
                d(response.data);
            }
        } else {
            response = c(wjnVar.b());
            if (response == null || response.data == null || !response.getData().isValid()) {
                if (this.f23539a.getRequestPolicy() == MaterialRequestPolicy.CACHE) {
                    return new Response<>(-100, "");
                }
                response = wjnVar.c(wjnVar.a());
                if (response != null) {
                    d(response.data);
                }
            }
        }
        return response;
    }

    public final boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50434fb4", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        File file = new File(str);
        if (!file.exists() || System.currentTimeMillis() - file.lastModified() > this.f23539a.getCacheTimeS()) {
            return true;
        }
        return false;
    }

    public final Response c(Class<T> cls) {
        hrc hrcVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Response) ipChange.ipc$dispatch("caabae2e", new Object[]{this, cls});
        }
        String cachePath = this.f23539a.getCachePath();
        if (b(cachePath)) {
            return null;
        }
        try {
            String i = uf9.i(cachePath);
            if (!TextUtils.isEmpty(i) && (hrcVar = (hrc) JSON.parseObject(i, cls)) != null) {
                return new Response(hrcVar);
            }
        } catch (Exception e) {
            Log.e("CacheInterceptor", "parseCacheData fail " + e.toString());
        }
        return null;
    }

    public void cancel() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
        }
    }

    public final void d(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a556b69", new Object[]{this, t});
        } else if (t != null) {
            String cachePath = this.f23539a.getCachePath();
            if (!TextUtils.isEmpty(cachePath)) {
                try {
                    uf9.j(cachePath, JSON.toJSONString(t));
                } catch (Exception e) {
                    Log.e("CacheInterceptor", "save cache fail " + e.toString());
                }
            }
        }
    }
}
