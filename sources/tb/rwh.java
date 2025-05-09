package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.ui.UINode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.rwh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class rwh<T extends rwh> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f27647a = new HashMap();
    public Map<String, Object> b;
    public final UINode c;
    public b d;
    public boolean e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f27648a;

        public a(Map map) {
            this.f27648a = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (rwh.a(rwh.this) != null) {
                rwh.a(rwh.this).a(this.f27648a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface b {
        void a(Map<String, Object> map);
    }

    static {
        t2o.a(986710047);
    }

    public rwh(UINode uINode) {
        this.c = uINode;
    }

    public static /* synthetic */ b a(rwh rwhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("d07cbc29", new Object[]{rwhVar});
        }
        return rwhVar.d;
    }

    public void b(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ec191f0", new Object[]{this, map});
        } else {
            ((HashMap) this.f27647a).putAll(map);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("155d431d", new Object[]{this});
        }
    }

    public void d(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d65f534", new Object[]{this, t});
            return;
        }
        ((HashMap) t.f27647a).clear();
        ((HashMap) t.f27647a).putAll(this.f27647a);
    }

    public void e(List<Runnable> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cefd8b2f", new Object[]{this, list});
            return;
        }
        c();
        Map<String, Object> map = this.b;
        if (map != null && !((HashMap) map).isEmpty()) {
            Map<String, Object> map2 = this.b;
            this.b = null;
            list.add(new a(map2));
        }
    }

    public final <T> T f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("352acab", new Object[]{this, str});
        }
        return (T) ((HashMap) this.f27647a).get(str);
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbaf1a83", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d6efae2", new Object[]{this});
        } else {
            this.e = true;
        }
    }

    public void i(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a97b403c", new Object[]{this, str, obj});
        } else if (!TextUtils.isEmpty(str)) {
            ((HashMap) this.f27647a).put(str, obj);
            if (this.e) {
                if (this.b == null) {
                    this.b = new HashMap();
                }
                this.b.put(str, obj);
            }
        } else if (dwh.r()) {
            dwh.g("MUSNodeProperty", "[" + getClass().getSimpleName() + "]-put:key is empty", new Exception());
        }
    }

    public void j(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49c2bcac", new Object[]{this, str, obj});
        } else {
            ((HashMap) this.f27647a).put(str, obj);
        }
    }

    public void k(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9662533f", new Object[]{this, bVar});
        } else {
            this.d = bVar;
        }
    }
}
