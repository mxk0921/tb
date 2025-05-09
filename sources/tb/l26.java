package tb;

import android.content.res.AssetManager;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.logging.util.LoggingSPCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.g;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class l26 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<DXWidgetNode> f23063a;
    private final int b = 5;
    private final int c = 10;

    static {
        t2o.a(444597020);
    }

    public l26(DXWidgetNode dXWidgetNode) {
        this.f23063a = new WeakReference<>(dXWidgetNode);
    }

    public static void a(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c51b20bc", new Object[]{dXWidgetNode});
        } else {
            n26.a(new l26(dXWidgetNode));
        }
    }

    private boolean b(DXWidgetNode dXWidgetNode, Map<String, String> map, String str) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2a6eae6", new Object[]{this, dXWidgetNode, map, str})).booleanValue();
        }
        if (zg5.D3()) {
            return d(dXWidgetNode, map, str);
        }
        if (zg5.y3()) {
            return c(dXWidgetNode, map, str);
        }
        if (zg5.z3()) {
            return e(dXWidgetNode, map, str);
        }
        m26.a("DXLanguageLoaderOpt extractLanguageConfig ");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            if (!TextUtils.isEmpty(key) && key.contains(str)) {
                JSONObject parseObject = JSON.parseObject(new String(dx5.d().g(entry.getValue(), dXWidgetNode.getDXRuntimeContext())));
                String replace = new String(key.getBytes()).replace(str, "");
                if (!TextUtils.isEmpty(replace)) {
                    dXWidgetNode.addLanguageConfigSync(replace.replace(q2s.JSON, ""), parseObject);
                }
                z = true;
            }
        }
        return z;
    }

    private boolean c(DXWidgetNode dXWidgetNode, Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b194d127", new Object[]{this, dXWidgetNode, map, str})).booleanValue();
        }
        m26.a("DXLanguageLoaderOpt extractLanguageConfigBugfix ");
        boolean z = false;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            if (!TextUtils.isEmpty(key) && key.indexOf(str) == 0) {
                JSONObject parseObject = JSON.parseObject(new String(dx5.d().g(entry.getValue(), dXWidgetNode.getDXRuntimeContext())));
                int length = key.length();
                char[] cArr = new char[5];
                if (length > 10) {
                    key.getChars(length - 10, length - 5, cArr, 0);
                    dXWidgetNode.addLanguageConfigSync(new String(cArr), parseObject);
                }
                z = true;
            }
        }
        return z;
    }

    private boolean d(DXWidgetNode dXWidgetNode, Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff4e7f3a", new Object[]{this, dXWidgetNode, map, str})).booleanValue();
        }
        if (map == null) {
            return false;
        }
        m26.a("DXLanguageLoaderOpt extractLanguageConfigPerfOpt ");
        String b = g.o().b();
        String str2 = map.get(str + b + q2s.JSON);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        dXWidgetNode.addLanguageConfigSync(b, JSON.parseObject(new String(dx5.d().g(str2, dXWidgetNode.getDXRuntimeContext()))));
        return true;
    }

    private boolean e(DXWidgetNode dXWidgetNode, Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e29c03d7", new Object[]{this, dXWidgetNode, map, str})).booleanValue();
        }
        m26.a("DXLanguageLoaderOpt extractLanguageConfigSubStr ");
        boolean z = false;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            if (!TextUtils.isEmpty(key) && key.indexOf(str) == 0) {
                JSONObject parseObject = JSON.parseObject(new String(dx5.d().g(entry.getValue(), dXWidgetNode.getDXRuntimeContext())));
                String substring = key.substring(str.length());
                if (!TextUtils.isEmpty(substring) && substring.length() > 5) {
                    dXWidgetNode.addLanguageConfigSync(substring.substring(0, substring.length() - 5), parseObject);
                }
                z = true;
            }
        }
        return z;
    }

    public static void f(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89188cfd", new Object[]{dXWidgetNode});
        } else {
            new l26(dXWidgetNode).run();
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
        m26.a(Thread.currentThread().getName() + " language loader");
        DXWidgetNode dXWidgetNode = this.f23063a.get();
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
