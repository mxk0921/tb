package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.musie.component.tbscroll.BounceScrollView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class pyo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, List<WeakReference<BounceScrollView>>> f26403a = new HashMap();
    public static final Map<String, Integer> b = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815792711);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(815792710);
    }

    public final void b(String str, BounceScrollView bounceScrollView) {
        int intValue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a32b2d0d", new Object[]{this, str, bounceScrollView});
            return;
        }
        ckf.g(str, "key");
        ckf.g(bounceScrollView, "view");
        Map<String, List<WeakReference<BounceScrollView>>> map = f26403a;
        List list = (List) ((HashMap) map).get(str);
        if (list == null) {
            list = new ArrayList();
            ((HashMap) map).put(str, list);
        }
        list.add(new WeakReference(bounceScrollView));
        Integer num = (Integer) ((HashMap) b).get(str);
        if (num != null && (intValue = num.intValue()) >= 0) {
            bounceScrollView.setInitScrollX(intValue);
        }
    }

    public final void a(String str, BounceScrollView bounceScrollView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be167c1e", new Object[]{this, str, bounceScrollView, new Integer(i)});
            return;
        }
        ckf.g(str, "key");
        ckf.g(bounceScrollView, "view");
        List<WeakReference> list = (List) ((HashMap) f26403a).get(str);
        if (list != null) {
            for (WeakReference weakReference : list) {
                BounceScrollView bounceScrollView2 = (BounceScrollView) weakReference.get();
                if (bounceScrollView2 != null && !ckf.b(bounceScrollView, bounceScrollView2)) {
                    bounceScrollView2.scrollTo(i, 0);
                }
            }
        }
        ((HashMap) b).put(str, Integer.valueOf(i));
    }

    public final void c(String str, BounceScrollView bounceScrollView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d0e0ed4", new Object[]{this, str, bounceScrollView});
            return;
        }
        ckf.g(str, "key");
        ckf.g(bounceScrollView, "view");
        List list = (List) ((HashMap) f26403a).get(str);
        if (list != null) {
            int size = list.size();
            int i = -1;
            for (int i2 = 0; i2 < size; i2++) {
                if (ckf.b(((WeakReference) list.get(i2)).get(), bounceScrollView)) {
                    i = i2;
                }
                if (i >= 0) {
                    break;
                }
            }
            if (i >= 0) {
                list.remove(i);
            }
            if (list.isEmpty()) {
                ((HashMap) b).put(str, -1);
            }
        }
    }
}
