package tb;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Callable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class zz6<T> implements Callable<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f33118a;

    static {
        t2o.a(395313325);
    }

    public zz6(Context context, Class<? extends T> cls, String str) {
        this.f33118a = context;
    }

    @Override // java.util.concurrent.Callable
    public T call() throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("6d249ded", new Object[]{this});
        }
        InputStream proxy_open = AssetsDelegate.proxy_open(this.f33118a.getAssets(), rr3.LOCAL_CATALOG_PATH);
        try {
            T t = (T) JSON.parseObject(blt.g(proxy_open, StandardCharsets.UTF_8), pr3[].class);
            if (proxy_open != null) {
                proxy_open.close();
            }
            return t;
        } catch (Throwable th) {
            if (proxy_open != null) {
                try {
                    proxy_open.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
