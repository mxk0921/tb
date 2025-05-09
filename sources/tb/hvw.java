package tb;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.alibaba.aliweex.AliWXSDKInstance;
import com.alibaba.aliweex.bundle.WeexPageFragment;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.common.WXRenderStrategy;
import com.taobao.weex.utils.WXLogUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class hvw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, WXSDKInstance> f20918a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final hvw f20919a = new hvw();

        static {
            t2o.a(85983292);
        }

        public static /* synthetic */ hvw a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (hvw) ipChange.ipc$dispatch("451aef91", new Object[0]);
            }
            return f20919a;
        }
    }

    static {
        t2o.a(85983290);
    }

    public static hvw a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hvw) ipChange.ipc$dispatch("b3a26377", new Object[0]);
        }
        return b.a();
    }

    public WXSDKInstance b(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXSDKInstance) ipChange.ipc$dispatch("13816269", new Object[]{this, str, context});
        }
        WXSDKInstance wXSDKInstance = (WXSDKInstance) ((ConcurrentHashMap) this.f20918a).remove(str);
        if (wXSDKInstance != null) {
            wXSDKInstance.init(context);
        }
        return wXSDKInstance;
    }

    public void c(Uri uri, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1555a7b7", new Object[]{this, uri, str});
        } else {
            d(true, uri.toString(), null, null);
        }
    }

    public hvw() {
        this.f20918a = new ConcurrentHashMap();
    }

    public void d(boolean z, String str, Map<String, Object> map, String str2) {
        WXSDKInstance wXSDKInstance;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb9a368b", new Object[]{this, new Boolean(z), str, map, str2});
            return;
        }
        Uri parse = Uri.parse(str);
        if (parse != null && WXSDKEngine.isInitialized()) {
            String uri = parse.toString();
            if (bpv.d(uri) && kr0.e().c() != null) {
                qsw a2 = psw.a();
                if (a2 != null) {
                    uri = a2.dealUrlScheme(uri);
                    parse = Uri.parse(uri);
                }
                String queryParameter = parse.getQueryParameter("preInitInstance");
                boolean booleanQueryParameter = parse.getBooleanQueryParameter("preDownLoad", false);
                if ("vue".equalsIgnoreCase(queryParameter) || "rax".equalsIgnoreCase(queryParameter) || booleanQueryParameter) {
                    if (z) {
                        wXSDKInstance = new AliWXSDKInstance(uri);
                    } else {
                        wXSDKInstance = new WXSDKInstance();
                    }
                    wXSDKInstance.setContext(kr0.e().c());
                    if (map == null) {
                        map = new HashMap<>();
                    }
                    WXRenderStrategy wXRenderStrategy = WXRenderStrategy.APPEND_ASYNC;
                    map.put(WeexPageFragment.WX_RENDER_STRATEGY, wXRenderStrategy.toString());
                    if (booleanQueryParameter) {
                        Boolean bool = Boolean.TRUE;
                        map.put("wxPreDownLoad", bool);
                        wXSDKInstance.E().e("wxPreDownLoad", bool);
                    }
                    if ("vue".equalsIgnoreCase(queryParameter)) {
                        str3 = "// { \"framework\": \"Vue\" }\n";
                    } else if ("rax".equalsIgnoreCase(queryParameter)) {
                        str3 = "// { \"framework\": \"Rax\" }\n";
                    } else {
                        WXLogUtils.e("WXPreLoadManager", "unsupport init bundle type :" + queryParameter);
                        str3 = null;
                    }
                    if (str3 != null) {
                        Log.e("test->", "start preInit :");
                        ((ConcurrentHashMap) this.f20918a).put(uri, wXSDKInstance);
                        Boolean bool2 = Boolean.TRUE;
                        map.put("wxPreInit", bool2);
                        wXSDKInstance.E().e("wxPreInit", bool2);
                        wXSDKInstance.F0(uri, str3, map, str2, wXRenderStrategy);
                    }
                    if (booleanQueryParameter) {
                        if (!((ConcurrentHashMap) this.f20918a).containsKey(uri)) {
                            ((ConcurrentHashMap) this.f20918a).put(uri, wXSDKInstance);
                        }
                        Log.e("test->", "start preDownLoad :");
                        wXSDKInstance.E0(uri, map, str2, wXRenderStrategy);
                    }
                }
            }
        }
    }
}
