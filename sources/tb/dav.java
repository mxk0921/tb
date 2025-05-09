package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class dav {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public cav f17695a;
    public List<a> b;
    public Map<String, x7v> c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f17696a;
        public final String b;

        static {
            t2o.a(83886279);
        }

        public a(String str, String str2) {
            this.f17696a = str;
            this.b = str2;
        }

        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
            }
            return this.f17696a;
        }

        public String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5308aa1e", new Object[]{this});
            }
            return this.b;
        }
    }

    static {
        t2o.a(83886278);
    }

    public dav a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dav) ipChange.ipc$dispatch("729f6cd6", new Object[]{this, str, str2, str3});
        }
        if (this.b == null) {
            this.b = new ArrayList();
        }
        for (a aVar : this.b) {
            if (aVar.a().equals(str2)) {
                return this;
            }
        }
        if (TextUtils.isEmpty(str2)) {
            this.b.add(new a(str, str3));
        } else {
            List<a> list = this.b;
            list.add(new a(str, str2 + ":" + str3));
        }
        return this;
    }

    public dav b(x7v x7vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dav) ipChange.ipc$dispatch("e5b22de1", new Object[]{this, x7vVar});
        }
        if (this.c == null) {
            this.c = new HashMap();
        }
        if (this.c.containsKey(x7vVar.c())) {
            return this;
        }
        this.c.put(x7vVar.c(), x7vVar);
        return this;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dd61839e", new Object[]{this});
        }
        cav cavVar = this.f17695a;
        if (cavVar == null) {
            return null;
        }
        return cavVar.a();
    }

    public Map<String, x7v> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("18ea53f", new Object[]{this});
        }
        return this.c;
    }

    public List<a> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("140dc23d", new Object[]{this});
        }
        return this.b;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return null;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("229b03c4", new Object[]{this});
        }
        cav cavVar = this.f17695a;
        if (cavVar == null) {
            return null;
        }
        return cavVar.b();
    }

    public float h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("68809b54", new Object[]{this})).floatValue();
        }
        cav cavVar = this.f17695a;
        if (cavVar == null) {
            return 0.0f;
        }
        return cavVar.c();
    }

    public void i(cav cavVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae7d54f4", new Object[]{this, cavVar});
        } else {
            this.f17695a = cavVar;
        }
    }
}
