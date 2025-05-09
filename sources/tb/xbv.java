package tb;

import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import com.alibaba.android.ultron.vfw.weex2.a;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class xbv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<Pair<mbv, Object>> f31289a = new CopyOnWriteArrayList();
    public final List<Pair<mbv, Object>> b = new CopyOnWriteArrayList();

    static {
        t2o.a(157286884);
    }

    public final void c(mbv mbvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74c88383", new Object[]{this, mbvVar});
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            if (pair != null && mbv.b((mbv) pair.first, mbvVar)) {
                arrayList.add(pair);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Pair pair2 = (Pair) it2.next();
            ((CopyOnWriteArrayList) this.b).remove(pair2);
            Object obj = pair2.second;
            if (obj instanceof String) {
                MUSDKInstance h = a.g().h((String) pair2.second, true);
                if (h != null) {
                    h.destroy();
                }
            } else if (obj instanceof MUSDKInstance) {
                ((MUSDKInstance) obj).destroy();
            }
        }
    }

    public final void d(mbv mbvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ccef4db", new Object[]{this, mbvVar});
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((CopyOnWriteArrayList) this.f31289a).iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            if (pair != null && mbv.b((mbv) pair.first, mbvVar)) {
                arrayList.add(pair);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Pair pair2 = (Pair) it2.next();
            ((CopyOnWriteArrayList) this.f31289a).remove(pair2);
            Object obj = pair2.second;
            if (obj instanceof String) {
                MUSDKInstance h = a.g().h((String) pair2.second, true);
                if (h != null) {
                    h.destroy();
                }
            } else if (obj instanceof MUSDKInstance) {
                ((MUSDKInstance) obj).destroy();
            }
        }
    }

    public void e(mbv mbvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a292220", new Object[]{this, mbvVar});
        } else if (mbvVar.d) {
            c(mbvVar);
        } else {
            d(mbvVar);
        }
    }

    public final void f(Context context, mbv mbvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8b3c8dc", new Object[]{this, context, mbvVar});
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f31289a).iterator();
        int i = 0;
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            if (pair != null && mbv.b((mbv) pair.first, mbvVar)) {
                i++;
            }
        }
        if (i >= mbvVar.c) {
            hav.d("UltronTradeHybridPreRenderPool.generateInstance", "currentCount beyond maxCount");
            return;
        }
        for (int i2 = 0; i2 < mbvVar.c - i; i2++) {
            String d = lbv.d(context, mbvVar);
            if (TextUtils.isEmpty(d)) {
                hav.d("UltronTradeHybridPreRenderPool.generateInstance", "generatePreRenderInstance failed,count:" + i2);
            } else {
                MUSDKInstance h = a.g().h(d, true);
                if (h == null) {
                    hav.d("UltronTradeHybridPreRenderPool.generateInstance", "getInstanceByPreRenderId failed,count:" + i2);
                } else {
                    vbv vbvVar = new vbv(h);
                    h.registerRenderListener(vbvVar);
                    h.setTag("bizLifecycleListener", vbvVar);
                    ((CopyOnWriteArrayList) this.f31289a).add(new Pair(mbvVar, h));
                }
            }
        }
    }

    public void g(Context context, mbv mbvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("622beb0d", new Object[]{this, context, mbvVar});
        } else if (mbvVar.d) {
            b(context, mbvVar);
        } else {
            f(context, mbvVar);
        }
    }

    public final Object h(mbv mbvVar) {
        Pair pair;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("99c88c5d", new Object[]{this, mbvVar});
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (true) {
            if (!it.hasNext()) {
                pair = null;
                break;
            }
            pair = (Pair) it.next();
            if (pair != null && mbv.b((mbv) pair.first, mbvVar)) {
                break;
            }
        }
        if (pair == null) {
            hav.d("UltronTradeHybridPreRenderPool.getAsyncBackgroundInstance", "invalid currentPair");
            return null;
        }
        Object obj = pair.second;
        if ((obj instanceof String) || (obj instanceof com.taobao.android.weex_framework.a)) {
            return obj;
        }
        hav.d("UltronTradeHybridPreRenderPool.getAsyncBackgroundInstance", "invalid instance");
        return null;
    }

    public final Object i(mbv mbvVar) {
        Pair pair;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a885e46b", new Object[]{this, mbvVar});
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (true) {
            if (!it.hasNext()) {
                pair = null;
                break;
            }
            pair = (Pair) it.next();
            if (pair != null && mbv.b((mbv) pair.first, mbvVar)) {
                break;
            }
        }
        if (pair == null) {
            hav.d("UltronTradeHybridPreRenderPool.getAsyncInstance", "invalid currentPair");
            return null;
        }
        ((CopyOnWriteArrayList) this.b).remove(pair);
        Object obj = pair.second;
        if ((obj instanceof String) || (obj instanceof com.taobao.android.weex_framework.a)) {
            return obj;
        }
        hav.d("UltronTradeHybridPreRenderPool.getAsyncInstance", "invalid instance");
        return null;
    }

    public final Object j(mbv mbvVar) {
        Pair pair;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("394bebcd", new Object[]{this, mbvVar});
        }
        Iterator it = ((CopyOnWriteArrayList) this.f31289a).iterator();
        while (true) {
            if (!it.hasNext()) {
                pair = null;
                break;
            }
            pair = (Pair) it.next();
            if (pair != null && mbv.b((mbv) pair.first, mbvVar)) {
                break;
            }
        }
        if (pair == null) {
            return null;
        }
        Object obj = pair.second;
        if ((obj instanceof String) || (obj instanceof MUSDKInstance)) {
            return obj;
        }
        hav.d("UltronTradeHybridPreRenderPool.getBackgroundInstance", "invalid instance");
        return null;
    }

    public Object k(mbv mbvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c7e459bc", new Object[]{this, mbvVar});
        }
        if (mbvVar.d) {
            return h(mbvVar);
        }
        return j(mbvVar);
    }

    public final Object l(mbv mbvVar) {
        Pair pair;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3164cfdb", new Object[]{this, mbvVar});
        }
        Iterator it = ((CopyOnWriteArrayList) this.f31289a).iterator();
        while (true) {
            if (!it.hasNext()) {
                pair = null;
                break;
            }
            pair = (Pair) it.next();
            if (pair != null && mbv.b((mbv) pair.first, mbvVar)) {
                break;
            }
        }
        if (pair == null) {
            return null;
        }
        ((CopyOnWriteArrayList) this.f31289a).remove(pair);
        Object obj = pair.second;
        if ((obj instanceof String) || (obj instanceof MUSDKInstance)) {
            return obj;
        }
        hav.d("UltronTradeHybridPreRenderPool.getInstance", "invalid instance");
        return null;
    }

    public Object m(mbv mbvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("2f90256e", new Object[]{this, mbvVar});
        }
        if (mbvVar.d) {
            return i(mbvVar);
        }
        return l(mbvVar);
    }

    public void n(mbv mbvVar) {
        Pair pair;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3a5c9eb", new Object[]{this, mbvVar});
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f31289a).iterator();
        while (true) {
            if (!it.hasNext()) {
                pair = null;
                break;
            }
            pair = (Pair) it.next();
            if (pair != null && mbv.b((mbv) pair.first, mbvVar)) {
                break;
            }
        }
        if (pair != null) {
            ((CopyOnWriteArrayList) this.f31289a).remove(pair);
        }
    }

    public void a(mbv mbvVar, com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad894ae4", new Object[]{this, mbvVar, aVar});
        } else if (aVar == null) {
            hav.d("UltronTradeHybridPreRenderPool.addPreRenderInstanceToPool:", "preRenderInstance is null");
        } else {
            Iterator it = ((CopyOnWriteArrayList) this.f31289a).iterator();
            int i = 0;
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                if (pair != null && mbv.b((mbv) pair.first, mbvVar)) {
                    i++;
                }
            }
            if (i >= mbvVar.c) {
                hav.d("UltronTradeHybridPreRenderPool.addPreRenderInstanceToPool:", "currentCount beyond maxCount");
                return;
            }
            for (int i2 = 0; i2 < mbvVar.c - i; i2++) {
                ((CopyOnWriteArrayList) this.f31289a).add(new Pair(mbvVar, aVar));
            }
        }
    }

    public final void b(Context context, mbv mbvVar) {
        int f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5c68dc0", new Object[]{this, context, mbvVar});
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        int i = 0;
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            if (pair != null && mbv.b((mbv) pair.first, mbvVar)) {
                i++;
            }
        }
        if (i >= mbvVar.c) {
            hav.d("UltronTradeHybridPreRenderPool.asyncGenerateInstance", "currentCount beyond maxCount");
            return;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i2 = displayMetrics.widthPixels;
        int i3 = displayMetrics.heightPixels;
        if (v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_HYBRID_CONTAINER, "useRealDisplayHeight", true) && (f = lbv.f(context)) > 0) {
            i3 = f;
        }
        for (int i4 = 0; i4 < mbvVar.c - i; i4++) {
            a.g().a(context, i2, i3, mbvVar, (CopyOnWriteArrayList) this.b);
        }
    }
}
