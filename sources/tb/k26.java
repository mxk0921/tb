package tb;

import android.content.res.AssetManager;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.logging.util.LoggingSPCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import java.lang.ref.WeakReference;
import java.util.Comparator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class k26 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Comparator d;
    private static final r86 e;

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<DXWidgetNode> f22361a;
    private final int b = 5;
    private final int c = 10;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements Comparator {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, obj, obj2})).intValue();
            }
            if (!(obj instanceof t86) || !(obj2 instanceof t86)) {
                return 0;
            }
            t86 t86Var = (t86) obj;
            t86 t86Var2 = (t86) obj2;
            int i = t86Var.f28564a - t86Var2.f28564a;
            if (i == 0) {
                return (int) (t86Var.c - t86Var2.c);
            }
            return i;
        }
    }

    static {
        t2o.a(444597018);
        a aVar = new a();
        d = aVar;
        e = new r86(3, 3, 3L, TimeUnit.SECONDS, new PriorityBlockingQueue(2048, aVar), new hi6("DXLanguageOptN", true));
    }

    private k26(DXWidgetNode dXWidgetNode) {
        this.f22361a = new WeakReference<>(dXWidgetNode);
    }

    public static void a(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c51b20bc", new Object[]{dXWidgetNode});
        } else {
            d(new k26(dXWidgetNode));
        }
    }

    private boolean b(DXWidgetNode dXWidgetNode, Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2a6eae6", new Object[]{this, dXWidgetNode, map, str})).booleanValue();
        }
        return c(dXWidgetNode, map, str);
    }

    private boolean c(DXWidgetNode dXWidgetNode, Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b194d127", new Object[]{this, dXWidgetNode, map, str})).booleanValue();
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        boolean z = false;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            if (!TextUtils.isEmpty(key) && key.indexOf(str) == 0) {
                JSONObject parseObject = JSON.parseObject(new String(dx5.d().g(entry.getValue(), dXWidgetNode.getDXRuntimeContext())));
                int length = key.length();
                char[] cArr = new char[5];
                if (length > 10) {
                    key.getChars(length - 10, length - 5, cArr, 0);
                    concurrentHashMap.put(new String(cArr), parseObject);
                }
                z = true;
            }
        }
        if (z) {
            dXWidgetNode.setLanguageConfig(concurrentHashMap);
        }
        return z;
    }

    public static void d(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cda3c73b", new Object[]{runnable});
        } else if (runnable != null) {
            e.execute(runnable);
        }
    }

    public static void e(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89188cfd", new Object[]{dXWidgetNode});
        } else {
            new k26(dXWidgetNode).run();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        xh6 xh6Var;
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        DXWidgetNode dXWidgetNode = this.f22361a.get();
        if (dXWidgetNode != null && dXWidgetNode.getDXRuntimeContext() != null) {
            try {
                DXTemplateItem p = dXWidgetNode.getDXRuntimeContext().p();
                if (!(p == null || (xh6Var = p.k) == null || (map = xh6Var.b) == null || map.isEmpty())) {
                    if (p.f && map.containsKey(LoggingSPCache.STORAGE_LANGUAGE)) {
                        AssetManager assets = dXWidgetNode.getDXRuntimeContext().h().getAssets();
                        String str = map.get(LoggingSPCache.STORAGE_LANGUAGE);
                        String[] proxy_list = AssetsDelegate.proxy_list(assets, str);
                        if (proxy_list != null && proxy_list.length > 0) {
                            for (String str2 : proxy_list) {
                                map.put("language/" + str2, str + "/" + str2);
                            }
                        }
                    }
                    if (!b(dXWidgetNode, map, "language/" + p.f7343a + "_" + p.b + "_language_")) {
                        b(dXWidgetNode, map, "language/language_");
                    }
                }
            } catch (Exception unused) {
                la6.b("templateItem:" + dXWidgetNode.getDXRuntimeContext().p() + " 多语言文件读取失败～");
            }
        }
    }
}
