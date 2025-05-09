package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class lcu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f23263a;
    public String b;
    public String c;
    public IDMComponent d;
    public fdd e;
    public Object f;
    public final Map<String, Object> g = new HashMap();
    public ifo h;

    static {
        t2o.a(155189331);
    }

    public IDMComponent a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("80a38852", new Object[]{this});
        }
        return this.d;
    }

    public Context b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.f23263a;
    }

    public <T> T c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("c0780841", new Object[]{this});
        }
        try {
            return (T) this.f;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("45cb977b", new Object[]{this});
        }
        return this.b;
    }

    public <T> T e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("37f60f1d", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        return (T) ((HashMap) this.g).get(str);
    }

    public fdd f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fdd) ipChange.ipc$dispatch("55a6ea7f", new Object[]{this});
        }
        return this.e;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c4e4d2a", new Object[]{this});
        }
        return this.c;
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1678716b", new Object[]{this});
            return;
        }
        ifo ifoVar = this.h;
        if (ifoVar != null) {
            ifoVar.a();
        }
    }

    public lcu i(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lcu) ipChange.ipc$dispatch("c4e94df9", new Object[]{this, iDMComponent});
        }
        this.d = iDMComponent;
        return this;
    }

    public lcu j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lcu) ipChange.ipc$dispatch("112d5d37", new Object[]{this, context});
        }
        this.f23263a = context;
        return this;
    }

    public lcu k(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lcu) ipChange.ipc$dispatch("fcb4d6ca", new Object[]{this, obj});
        }
        this.f = obj;
        return this;
    }

    public lcu l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lcu) ipChange.ipc$dispatch("9c2839e8", new Object[]{this, str});
        }
        this.b = str;
        return this;
    }

    public lcu m(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lcu) ipChange.ipc$dispatch("5da501a6", new Object[]{this, str, obj});
        }
        if (str != null) {
            ((HashMap) this.g).put(str, obj);
        }
        return this;
    }

    public lcu n(Map<? extends String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lcu) ipChange.ipc$dispatch("7b8d2ec5", new Object[]{this, map});
        }
        if (map != null) {
            ((HashMap) this.g).putAll(map);
        }
        return this;
    }

    public lcu o(fdd fddVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lcu) ipChange.ipc$dispatch("a940f1a2", new Object[]{this, fddVar});
        }
        this.e = fddVar;
        return this;
    }

    public void p(ifo ifoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aae6ecb", new Object[]{this, ifoVar});
        } else {
            this.h = ifoVar;
        }
    }

    public lcu q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lcu) ipChange.ipc$dispatch("1cdb4397", new Object[]{this, str});
        }
        this.c = str;
        return this;
    }
}
