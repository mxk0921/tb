package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.IAURAInputField;
import com.alibaba.android.aura.IAURAPluginCenter;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class nj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f24766a;
    public final String b;
    public final Map<String, Object> c;
    public final IAURAPluginCenter[] d;
    public final IAURAInputField<Object> e;
    public final Collection<String> f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f24767a;
        public String b;
        public Map<String, Object> c;
        public IAURAPluginCenter[] d;
        public Collection<String> e;

        static {
            t2o.a(79691804);
        }

        public static /* synthetic */ Map a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("2a588c3", new Object[]{aVar});
            }
            return aVar.c;
        }

        public static /* synthetic */ IAURAPluginCenter[] b(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IAURAPluginCenter[]) ipChange.ipc$dispatch("a60c5cf8", new Object[]{aVar});
            }
            return aVar.d;
        }

        public static /* synthetic */ IAURAInputField c(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IAURAInputField) ipChange.ipc$dispatch("c046c8a8", new Object[]{aVar});
            }
            aVar.getClass();
            return null;
        }

        public static /* synthetic */ String d(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ebb6c6d5", new Object[]{aVar});
            }
            return aVar.b;
        }

        public static /* synthetic */ Collection e(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Collection) ipChange.ipc$dispatch("9672427d", new Object[]{aVar});
            }
            return aVar.e;
        }

        public a f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a9a1f3e4", new Object[]{this, str});
            }
            this.f24767a = str;
            return this;
        }

        public nj g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (nj) ipChange.ipc$dispatch("81361081", new Object[]{this});
            }
            h();
            return new nj(this);
        }

        public final void h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b6d1a5b", new Object[]{this});
            } else if (TextUtils.isEmpty(this.f24767a)) {
                throw new IllegalArgumentException("bizName not null");
            } else if (TextUtils.isEmpty(this.b)) {
                throw new IllegalArgumentException("configAssetFileName not null");
            }
        }

        public a i(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e1d75dfb", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public a j(IAURAPluginCenter[] iAURAPluginCenterArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("71da3e21", new Object[]{this, iAURAPluginCenterArr});
            }
            this.d = iAURAPluginCenterArr;
            return this;
        }

        public a k(Collection<String> collection) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("db1ff871", new Object[]{this, collection});
            }
            this.e = collection;
            return this;
        }

        public a l(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("247e004f", new Object[]{this, map});
            }
            this.c = map;
            return this;
        }
    }

    static {
        t2o.a(79691803);
    }

    public nj(a aVar) {
        this.f24766a = aVar.f24767a;
        this.c = a.a(aVar);
        this.d = a.b(aVar);
        this.e = a.c(aVar);
        this.b = a.d(aVar);
        this.f = a.e(aVar);
    }

    public IAURAInputField<Object> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IAURAInputField) ipChange.ipc$dispatch("fbe39d04", new Object[]{this});
        }
        return this.e;
    }

    public IAURAPluginCenter[] b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IAURAPluginCenter[]) ipChange.ipc$dispatch("61aa0fd3", new Object[]{this});
        }
        return this.d;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42bddf1", new Object[]{this});
        }
        return this.f24766a;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7252d67a", new Object[]{this});
        }
        return this.b;
    }

    public Collection<String> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("91cda33b", new Object[]{this});
        }
        return this.f;
    }

    public Map<String, Object> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d1d70d2a", new Object[]{this});
        }
        return this.c;
    }

    public void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("906463c", new Object[]{this, new Boolean(z)});
        }
    }
}
