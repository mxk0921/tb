package android.taobao.windvane.export.cache.memory;

import android.taobao.windvane.export.cache.memory.model.ResourceItemModel;
import android.taobao.windvane.extra.core.WVCore;
import android.taobao.windvane.util.MimeTypeEnum;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import com.taobao.zcache.ResourceResponse;
import com.uc.webview.export.WebResourceResponse;
import com.uc.webview.export.extension.StorageUtils;
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.Map;
import tb.h1p;
import tb.mrt;
import tb.t2o;
import tb.v7t;
import tb.vpw;
import tb.y8o;
import tb.yox;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class MemoryResWarmupManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class a implements d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f1758a;
        public final /* synthetic */ ResourceItemModel b;

        public a(d dVar, ResourceItemModel resourceItemModel) {
            this.f1758a = dVar;
            this.b = resourceItemModel;
        }

        @Override // android.taobao.windvane.export.cache.memory.MemoryResWarmupManager.d
        public void a(boolean z, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c845825", new Object[]{this, new Boolean(z), str});
                return;
            }
            MemoryResWarmupManager.a(this.f1758a, z, str);
            v7t.i("MemoryResWarmupManager", "warmup " + this.b.src + " " + this.b.mode + " " + this.b.type + " " + z + " " + str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ResourceItemModel f1759a;
        public final /* synthetic */ d b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public class a implements d {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // android.taobao.windvane.export.cache.memory.MemoryResWarmupManager.d
            public void a(boolean z, String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c845825", new Object[]{this, new Boolean(z), str});
                } else if (z) {
                    MemoryResWarmupManager.a(b.this.b, true, str);
                } else {
                    b bVar = b.this;
                    MemoryResWarmupManager.b(bVar.f1759a, bVar.b);
                }
            }
        }

        public b(ResourceItemModel resourceItemModel, d dVar) {
            this.f1759a = resourceItemModel;
            this.b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                MemoryResWarmupManager.c(this.f1759a, new a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f1761a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ String c;

        public c(d dVar, boolean z, String str) {
            this.f1761a = dVar;
            this.b = z;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f1761a.a(this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface d {
        void a(boolean z, String str);
    }

    static {
        t2o.a(989855846);
    }

    public static /* synthetic */ void a(d dVar, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8398c965", new Object[]{dVar, new Boolean(z), str});
        } else {
            g(dVar, z, str);
        }
    }

    public static /* synthetic */ void b(ResourceItemModel resourceItemModel, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bd09c7f", new Object[]{resourceItemModel, dVar});
        } else {
            l(resourceItemModel, dVar);
        }
    }

    public static /* synthetic */ void c(ResourceItemModel resourceItemModel, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfb454c0", new Object[]{resourceItemModel, dVar});
        } else {
            k(resourceItemModel, dVar);
        }
    }

    public static /* synthetic */ void d(ResourceItemModel resourceItemModel, WebResourceResponse webResourceResponse, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("887e422f", new Object[]{resourceItemModel, webResourceResponse, dVar});
        } else {
            h(resourceItemModel, webResourceResponse, dVar);
        }
    }

    public static Map<String, String> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5d873088", new Object[0]);
        }
        HashMap hashMap = new HashMap();
        hashMap.put(TBImageFlowMonitor.TTL_ERROR_MAX_AGE, "3600");
        hashMap.put("ignoreQuery", "0");
        hashMap.put("isMainRes", "0");
        hashMap.put("useOnce", "1");
        return hashMap;
    }

    public static void g(d dVar, boolean z, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b7293a3", new Object[]{dVar, new Boolean(z), str});
        } else if (dVar != null) {
            i(new c(dVar, z, str));
        }
    }

    public static void h(ResourceItemModel resourceItemModel, WebResourceResponse webResourceResponse, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2215df8c", new Object[]{resourceItemModel, webResourceResponse, dVar});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(resourceItemModel.src, webResourceResponse);
        StorageUtils.precacheResources(hashMap, e());
    }

    public static void i(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a842a1f", new Object[]{runnable});
        } else {
            mrt.a().execute(runnable);
        }
    }

    public static void j(ResourceItemModel resourceItemModel, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3c5b52e", new Object[]{resourceItemModel, dVar});
        } else {
            m(resourceItemModel, new a(dVar, resourceItemModel));
        }
    }

    public static void k(final ResourceItemModel resourceItemModel, final d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8238d7c7", new Object[]{resourceItemModel, dVar});
        } else {
            StorageUtils.getResourceFromHttpCache(resourceItemModel.src, new ValueCallback<WebResourceResponse>() { // from class: android.taobao.windvane.export.cache.memory.MemoryResWarmupManager.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public void onReceiveValue(WebResourceResponse webResourceResponse) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d58c00bc", new Object[]{this, webResourceResponse});
                    } else if (webResourceResponse == null) {
                        MemoryResWarmupManager.a(d.this, false, "response is null");
                    } else if (webResourceResponse.getStatusCode() != 200) {
                        MemoryResWarmupManager.a(d.this, false, webResourceResponse.getReasonPhrase());
                    } else {
                        MemoryResWarmupManager.d(resourceItemModel, webResourceResponse, d.this);
                        MemoryResWarmupManager.a(d.this, true, "from http cache");
                    }
                }
            });
        }
    }

    public static void n(ResourceItemModel resourceItemModel, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71e8e339", new Object[]{resourceItemModel, dVar});
        } else {
            i(new b(resourceItemModel, dVar));
        }
    }

    public static void m(ResourceItemModel resourceItemModel, d dVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2150728b", new Object[]{resourceItemModel, dVar});
            return;
        }
        if (TextUtils.isEmpty(resourceItemModel.mode)) {
            resourceItemModel.mode = "only_if_cached";
        }
        if (!vpw.commonConfig.K2) {
            g(dVar, false, "resource prewarm is disabled");
        } else if (resourceItemModel.mode == null || (str = resourceItemModel.src) == null || resourceItemModel.type == null) {
            g(dVar, false, "required field is null");
        } else if (!str.startsWith(h1p.HTTPS_PREFIX)) {
            g(dVar, false, "src is not https");
        } else if (!WVCore.getInstance().isUCSupport()) {
            g(dVar, false, "uc not support");
        } else if (!f(resourceItemModel)) {
            g(dVar, false, "type and src is not matched");
        } else if ("only_if_cached".equals(resourceItemModel.mode)) {
            n(resourceItemModel, dVar);
        } else if ("normal".equals(resourceItemModel.mode)) {
            g(dVar, false, "unsupported mode");
        } else {
            g(dVar, false, "invalid mode");
        }
    }

    public static boolean f(ResourceItemModel resourceItemModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e02f493", new Object[]{resourceItemModel})).booleanValue();
        }
        if ("css".equals(resourceItemModel.type)) {
            return resourceItemModel.src.endsWith(".css");
        }
        if ("js".equals(resourceItemModel.type)) {
            return resourceItemModel.src.endsWith(".js");
        }
        if ("image".equals(resourceItemModel.type)) {
            String str = resourceItemModel.src;
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            if (str.endsWith(".jpg") || str.endsWith(".png") || str.endsWith(".heic") || str.endsWith(".gif") || str.endsWith(".webp")) {
                return true;
            }
        }
        return false;
    }

    public static void l(ResourceItemModel resourceItemModel, d dVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e29492f", new Object[]{resourceItemModel, dVar});
            return;
        }
        ResourceResponse h = yox.h(new y8o(resourceItemModel.src));
        if (h == null || h.getError() != null || h.getData() == null) {
            g(dVar, false, "not in ZCache");
            return;
        }
        if ("js".equals(resourceItemModel.type)) {
            str = MimeTypeEnum.JS.getMimeType();
        } else if ("css".equals(resourceItemModel.type)) {
            str = MimeTypeEnum.CSS.getMimeType();
        } else {
            if ("image".equals(resourceItemModel.type)) {
                String str2 = resourceItemModel.src;
                if (TextUtils.isEmpty(str2)) {
                    g(dVar, false, "url is empty");
                    return;
                } else if (str2.endsWith(".jpg")) {
                    str = MimeTypeEnum.JPG.getMimeType();
                } else if (str2.endsWith(".png")) {
                    str = MimeTypeEnum.PNG.getMimeType();
                } else if (str2.endsWith(".heic")) {
                    str = MimeTypeEnum.HEIC.getMimeType();
                } else if (str2.endsWith(".gif")) {
                    str = MimeTypeEnum.GIF.getMimeType();
                } else if (str2.endsWith(".webp")) {
                    str = MimeTypeEnum.WEBP.getMimeType();
                }
            }
            str = null;
        }
        h(resourceItemModel, new WebResourceResponse(str, "UTF-8", new ByteArrayInputStream(h.getData())), dVar);
        g(dVar, true, "from zcache");
    }
}
