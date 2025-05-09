package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.factory.view.base.PopLayerBaseView;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class rgm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PAGE_EVENT_EDITION_SWITCHED = "editionSwitched";
    public static final String PAGE_EVENT_LOGIN_STATUS_SWITCHED = "loginStatusSwitched";
    public static final String PAGE_EVENT_NAME = "PopLayer.OnPopPageEvent";
    public static final String PAGE_EVENT_SCROLLED = "scrolled";
    public static final String PAGE_EVENT_SCROLL_STATE_CHANGED = "scrollStateChanged";
    public static final String SCROLL_STATE_DRAGGING = "1";
    public static final String SCROLL_STATE_IDLE = "0";
    public static final String SCROLL_STATE_SETTLING = "2";
    public static final String SOURCE_NAME_POPLAYER = "PopLayer";

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, b> f27362a = new ConcurrentHashMap();
    public final AtomicBoolean b = new AtomicBoolean(false);
    public boolean c = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
        void a(String str, JSONObject jSONObject);

        void b(String str, JSONObject jSONObject);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {
        public a b;

        /* renamed from: a  reason: collision with root package name */
        public final AtomicBoolean f27363a = new AtomicBoolean(false);
        public Map<String, Map<String, WeakReference<PopLayerBaseView>>> c = new ConcurrentHashMap();

        static {
            t2o.a(790626531);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final rgm f27364a = new rgm();

        static {
            t2o.a(790626532);
        }

        public static /* synthetic */ rgm a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (rgm) ipChange.ipc$dispatch("8053c31d", new Object[0]);
            }
            return f27364a;
        }
    }

    static {
        t2o.a(790626529);
    }

    public static rgm h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rgm) ipChange.ipc$dispatch("1664c982", new Object[0]);
        }
        return c.a();
    }

    public boolean g(final String str, final Collection<String> collection, final String str2, final PopLayerBaseView popLayerBaseView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("608d767e", new Object[]{this, str, collection, str2, popLayerBaseView})).booleanValue();
        }
        if (!i()) {
            wdm.d("PopPageEventCenter.addPageEventListener.isEnable.False.sourceName=%s.", str);
            return false;
        }
        hst.b(new Runnable() { // from class: tb.mgm
            @Override // java.lang.Runnable
            public final void run() {
                rgm.this.j(str, collection, popLayerBaseView, str2);
            }
        });
        return true;
    }

    public final boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2312d58", new Object[]{this})).booleanValue();
        }
        try {
            if (!this.b.getAndSet(true)) {
                this.c = a9l.w().J();
            }
            return this.c;
        } catch (Throwable th) {
            wdm.h("PopPageEventCenter.isEnable.error.", th);
            return false;
        }
    }

    public final /* synthetic */ void j(String str, Collection collection, PopLayerBaseView popLayerBaseView, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("858e0606", new Object[]{this, str, collection, popLayerBaseView, str2});
            return;
        }
        try {
            if (!TextUtils.isEmpty(str) && collection != null && !collection.isEmpty() && popLayerBaseView != null && !popLayerBaseView.isClosed()) {
                b bVar = (b) ((ConcurrentHashMap) this.f27362a).get(str);
                if (bVar == null) {
                    bVar = new b();
                    ((ConcurrentHashMap) this.f27362a).put(str, bVar);
                }
                if (bVar.c == null) {
                    bVar.c = new ConcurrentHashMap();
                }
                for (Object obj : collection) {
                    if (obj instanceof String) {
                        Map<String, WeakReference<PopLayerBaseView>> map = bVar.c.get(obj);
                        if (map == null) {
                            map = new ConcurrentHashMap<>();
                            bVar.c.put((String) obj, map);
                        }
                        map.put(str2, new WeakReference<>(popLayerBaseView));
                    }
                }
                t(str, bVar);
                return;
            }
            wdm.d("PopPageEventCenter.addPageEventListener.paramInvalid.", new Object[0]);
        } catch (Throwable th) {
            wdm.h("PopPageEventCenter.addPageEventListener.error.", th);
        }
    }

    public final /* synthetic */ void l(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4ebe4f", new Object[]{this, str, aVar});
            return;
        }
        try {
            if (!TextUtils.isEmpty(str) && aVar != null) {
                b bVar = (b) ((ConcurrentHashMap) this.f27362a).get(str);
                if (bVar == null) {
                    bVar = new b();
                    ((ConcurrentHashMap) this.f27362a).put(str, bVar);
                }
                bVar.b = aVar;
                wdm.d("PopPageEventCenter.registerPageEventLifecycle.Success.sourceName=%s.", str);
                return;
            }
            wdm.d("PopPageEventCenter.registerPageEventLifecycle.Failed.sourceNameIsNull.", new Object[0]);
        } catch (Throwable th) {
            wdm.h("PopPageEventCenter.registerPageEventLifecycle.error.", th);
        }
    }

    public final /* synthetic */ void m(String str) {
        Map<String, Map<String, WeakReference<PopLayerBaseView>>> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed7116bd", new Object[]{this, str});
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                wdm.d("PopPageEventCenter.removeAllPageEventListener.paramInvalid.", new Object[0]);
                return;
            }
            for (String str2 : ((ConcurrentHashMap) this.f27362a).keySet()) {
                b bVar = (b) ((ConcurrentHashMap) this.f27362a).get(str2);
                if (!(bVar == null || (map = bVar.c) == null)) {
                    for (String str3 : map.keySet()) {
                        Map<String, WeakReference<PopLayerBaseView>> map2 = bVar.c.get(str3);
                        if (map2 != null) {
                            map2.remove(str);
                        }
                    }
                }
                t(str2, bVar);
            }
        } catch (Throwable th) {
            wdm.h("PopPageEventCenter.removeAllPageEventListener.error.", th);
        }
    }

    public final /* synthetic */ void n(String str, Collection collection, String str2) {
        Map<String, WeakReference<PopLayerBaseView>> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0c686f6", new Object[]{this, str, collection, str2});
            return;
        }
        try {
            if (!TextUtils.isEmpty(str) && collection != null && !collection.isEmpty() && !TextUtils.isEmpty(str2)) {
                b bVar = (b) ((ConcurrentHashMap) this.f27362a).get(str);
                if (!(bVar == null || bVar.c == null)) {
                    for (Object obj : collection) {
                        if ((obj instanceof String) && (map = bVar.c.get(obj)) != null) {
                            map.remove(str2);
                        }
                    }
                }
                t(str, bVar);
                return;
            }
            wdm.d("PopPageEventCenter.removePageEventListener.paramInvalid.", new Object[0]);
        } catch (Throwable th) {
            wdm.h("PopPageEventCenter.removePageEventListener.error.", th);
        }
    }

    public final /* synthetic */ void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbb4909d", new Object[]{this, str});
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                wdm.d("PopPageEventCenter.unRegisterPageEventLifecycle.Failed.sourceNameIsNull.", new Object[0]);
                return;
            }
            b bVar = (b) ((ConcurrentHashMap) this.f27362a).get(str);
            if (bVar == null) {
                wdm.d("PopPageEventCenter.unRegisterPageEventLifecycle.Failed.sourceName=%s.", str);
                return;
            }
            bVar.b = null;
            wdm.d("PopPageEventCenter.unRegisterPageEventLifecycle.Success.sourceName=%s.", str);
        } catch (Throwable th) {
            wdm.h("PopPageEventCenter.unRegisterPageEventLifecycle.error.", th);
        }
    }

    public void p(final String str, final String str2, final JSONObject jSONObject, final JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b37ab5", new Object[]{this, str, str2, jSONObject, jSONObject2});
        } else if (!i()) {
            wdm.d("PopPageEventCenter.postEvent.isEnable.False.sourceName=%s.", str);
        } else {
            hst.b(new Runnable() { // from class: tb.qgm
                @Override // java.lang.Runnable
                public final void run() {
                    rgm.this.k(str, str2, jSONObject, jSONObject2);
                }
            });
        }
    }

    public boolean q(final String str, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cfc3c743", new Object[]{this, str, aVar})).booleanValue();
        }
        wdm.d("PopPageEventCenter.registerPageEventLifecycle.sourceName=%s.", str);
        if (!i()) {
            wdm.d("PopPageEventCenter.registerPageEventLifecycle.isEnable.False.sourceName=%s.", str);
            return false;
        }
        hst.b(new Runnable() { // from class: tb.lgm
            @Override // java.lang.Runnable
            public final void run() {
                rgm.this.l(str, aVar);
            }
        });
        return true;
    }

    public boolean r(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79e50337", new Object[]{this, str})).booleanValue();
        }
        if (!i()) {
            wdm.d("PopPageEventCenter.removeAllPageEventListener.isEnable.False.indexId=%s.", str);
            return false;
        }
        hst.b(new Runnable() { // from class: tb.ogm
            @Override // java.lang.Runnable
            public final void run() {
                rgm.this.m(str);
            }
        });
        return true;
    }

    public boolean s(final String str, final Collection<String> collection, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7714fc8b", new Object[]{this, str, collection, str2})).booleanValue();
        }
        if (!i()) {
            wdm.d("PopPageEventCenter.removePageEventListener.isEnable.False.sourceName=%s.", str);
            return false;
        }
        hst.b(new Runnable() { // from class: tb.ngm
            @Override // java.lang.Runnable
            public final void run() {
                rgm.this.n(str, collection, str2);
            }
        });
        return true;
    }

    public final void t(String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c00bc4f", new Object[]{this, str, bVar});
            return;
        }
        try {
            if (bVar.b != null) {
                Map<String, Map<String, WeakReference<PopLayerBaseView>>> map = bVar.c;
                if (map != null && !map.isEmpty()) {
                    for (String str2 : bVar.c.keySet()) {
                        Map<String, WeakReference<PopLayerBaseView>> map2 = bVar.c.get(str2);
                        if (!(map2 == null || map2.isEmpty())) {
                            if (bVar.f27363a.compareAndSet(false, true)) {
                                wdm.d("PopPageEventCenter.syncLifeCycle.onStart.sourceName=%s", str);
                                bVar.b.b(str, new JSONObject());
                                return;
                            }
                            return;
                        }
                    }
                }
                if (bVar.f27363a.compareAndSet(true, false)) {
                    wdm.d("PopPageEventCenter.syncLifeCycle.onFinish.sourceName=%s", str);
                    bVar.b.a(str, new JSONObject());
                }
            }
        } catch (Throwable th) {
            wdm.h("PopPageEventCenter.syncLifeCycle.error.", th);
        }
    }

    public boolean u(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c2cd430", new Object[]{this, str})).booleanValue();
        }
        wdm.d("PopPageEventCenter.unRegisterPageEventLifecycle.sourceName=%s.", str);
        if (!i()) {
            wdm.d("PopPageEventCenter.unRegisterPageEventLifecycle.isEnable.False.sourceName=%s.", str);
            return false;
        }
        hst.b(new Runnable() { // from class: tb.pgm
            @Override // java.lang.Runnable
            public final void run() {
                rgm.this.o(str);
            }
        });
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0183 A[Catch: all -> 0x005b, TryCatch #0 {all -> 0x005b, blocks: (B:6:0x0039, B:8:0x003f, B:11:0x0047, B:13:0x0053, B:17:0x005e, B:19:0x0068, B:21:0x0070, B:23:0x0076, B:25:0x007e, B:28:0x00a4, B:30:0x00aa, B:33:0x00b1, B:36:0x00be, B:37:0x00c3, B:39:0x00c9, B:40:0x00ce, B:42:0x00d6, B:43:0x00db, B:45:0x00e3, B:48:0x00ee, B:51:0x00f5, B:56:0x0157, B:57:0x017d, B:59:0x0183, B:61:0x0191, B:63:0x0199, B:65:0x019f, B:66:0x01a5, B:67:0x01a9), top: B:71:0x0039 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void k(java.lang.String r18, java.lang.String r19, com.alibaba.fastjson.JSONObject r20, com.alibaba.fastjson.JSONObject r21) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.rgm.k(java.lang.String, java.lang.String, com.alibaba.fastjson.JSONObject, com.alibaba.fastjson.JSONObject):void");
    }
}
