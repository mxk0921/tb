package tb;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class qwl extends cy1<qwl> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public a g;
    public Map<String, String> h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Map<String, Long> f26972a;
        @JSONField(name = "name")
        private String name;

        static {
            t2o.a(794820631);
        }

        public a(String str) {
            this.name = str;
        }

        public a a(String str, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c41c71a6", new Object[]{this, str, new Long(j)});
            }
            if (this.f26972a == null) {
                this.f26972a = new HashMap();
            }
            this.f26972a.put(str, Long.valueOf(j));
            return this;
        }

        public String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
            }
            return this.name;
        }

        public Map<String, Long> c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("8658c9e7", new Object[]{this});
            }
            return this.f26972a;
        }
    }

    static {
        t2o.a(794820630);
    }

    public qwl(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    public static /* synthetic */ Object ipc$super(qwl qwlVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/trade/common/kit/tracker/model/PerfModel");
    }

    public a j(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("c41c71a6", new Object[]{this, str, new Long(j)});
        }
        a aVar = this.g;
        if (aVar != null) {
            aVar.a(str, j);
            return this.g;
        }
        throw new IllegalStateException("请先调用name来创建Msg");
    }

    public qwl k(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qwl) ipChange.ipc$dispatch("1010bdee", new Object[]{this, str, str2});
        }
        if (!(str == null || str2 == null)) {
            if (this.h == null) {
                this.h = new HashMap();
            }
            this.h.put(str, str2);
        }
        return this;
    }

    public qwl l(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qwl) ipChange.ipc$dispatch("57a9579e", new Object[]{this, map});
        }
        this.h = map;
        return this;
    }

    public Map<String, String> m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ae114b7f", new Object[]{this});
        }
        return this.h;
    }

    public a n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("3804fe22", new Object[]{this});
        }
        return this.g;
    }

    public qwl o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qwl) ipChange.ipc$dispatch("a365efc9", new Object[]{this, str});
        }
        this.g = new a(str);
        return this;
    }
}
