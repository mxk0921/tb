package tb;

import android.taobao.windvane.webview.IWVWebView;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.oversea.baobao.BaobaoManager;
import com.taobao.oversea.baobao.TMGBaobaoBridge;
import com.taobao.oversea.baobao.view.BaobaoProgress;
import com.taobao.oversea.baobao.view.DXProgress;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class e0n {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static e0n b;
    public static long c;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, WeakReference<BaobaoProgress>> f18195a = new HashMap();

    public static e0n b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e0n) ipChange.ipc$dispatch("2907a6f5", new Object[0]);
        }
        if (b == null) {
            b = new e0n();
        }
        return b;
    }

    public final /* synthetic */ void c(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c12931eb", new Object[]{this, map});
            return;
        }
        Iterator it = ((HashMap) this.f18195a).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            try {
                if (((WeakReference) entry.getValue()).get() == null) {
                    it.remove();
                } else if (DXProgress.class.getName().equals(entry.getKey())) {
                    ((BaobaoProgress) ((WeakReference) entry.getValue()).get()).update(map);
                }
            } catch (Exception e) {
                new StringBuilder("update BaobaoProgress exception: ").append(e.toString());
            }
        }
    }

    public void d(String str, BaobaoProgress baobaoProgress) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d16e69e", new Object[]{this, str, baobaoProgress});
        } else {
            ((HashMap) this.f18195a).put(str, new WeakReference(baobaoProgress));
        }
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58a0abe7", new Object[]{this})).booleanValue();
        }
        if (BaobaoManager.getInstance().refreshSwitch() && !((HashMap) this.f18195a).isEmpty()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - c <= BaobaoManager.getInstance().requestInterval()) {
                return false;
            }
            c = currentTimeMillis;
            for (WeakReference weakReference : ((HashMap) this.f18195a).values()) {
                if (weakReference.get() != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c5345ed", new Object[]{this, str});
        } else {
            ((HashMap) this.f18195a).remove(str);
        }
    }

    public void g(final Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ce5f0b5", new Object[]{this, map});
        } else if (map != null) {
            lsa.a().b(new Runnable() { // from class: tb.d0n
                @Override // java.lang.Runnable
                public final void run() {
                    e0n.this.c(map);
                }
            });
            Iterator<Map.Entry<String, WeakReference<IWVWebView>>> it = TMGBaobaoBridge.mWebViewMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, WeakReference<IWVWebView>> next = it.next();
                try {
                    if (next.getValue().get() != null) {
                        next.getValue().get().fireEvent("TMGBAOBAO", JSON.toJSONString(map));
                    } else {
                        it.remove();
                    }
                } catch (Exception e) {
                    e.toString();
                    it.remove();
                }
            }
        }
    }
}
