package tb;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class pwl extends dy1<pwl> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public a f26360a;
    public Map<String, String> b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Map<String, Long> f26361a;
        @JSONField(name = "name")
        private String name;

        static {
            t2o.a(83886308);
        }

        public a(String str) {
            this.name = str;
        }

        public a a(String str, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d8d5c1ef", new Object[]{this, str, new Long(j)});
            }
            if (this.f26361a == null) {
                this.f26361a = new HashMap();
            }
            this.f26361a.put(str, Long.valueOf(j));
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
            return this.f26361a;
        }
    }

    static {
        t2o.a(83886307);
    }

    public pwl(String str) {
        this(str, "27659-tracker", "http://taobao.com/jstracker/android/ultron.html");
    }

    public static /* synthetic */ Object ipc$super(pwl pwlVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/ultron/tracker/model/PerfModel");
    }

    public a a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("d8d5c1ef", new Object[]{this, str, new Long(j)});
        }
        a aVar = this.f26360a;
        if (aVar != null) {
            aVar.a(str, j);
            return this.f26360a;
        }
        throw new IllegalStateException("请先调用name来创建Msg");
    }

    public pwl b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pwl) ipChange.ipc$dispatch("e1286977", new Object[]{this, str, str2});
        }
        if (!(str == null || str2 == null)) {
            if (this.b == null) {
                this.b = new HashMap();
            }
            this.b.put(str, str2);
        }
        return this;
    }

    public pwl c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pwl) ipChange.ipc$dispatch("b07baf27", new Object[]{this, map});
        }
        this.b = map;
        return this;
    }

    public a d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("fd2f3d6b", new Object[]{this});
        }
        return this.f26360a;
    }

    public pwl e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pwl) ipChange.ipc$dispatch("c4465612", new Object[]{this, str});
        }
        this.f26360a = new a(str);
        return this;
    }

    public Map<String, String> getDimensions() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ae114b7f", new Object[]{this});
        }
        return this.b;
    }

    public pwl(String str, String str2, String str3) {
        super(str, str2, str3);
    }
}
