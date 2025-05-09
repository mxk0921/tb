package com.taobao.android.weex_framework.module.builtin.stream;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class Options {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f9980a;
    public final String b;
    public final Map<String, String> c;
    public final String d;
    public final Type e;
    public final int f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum Type {
        json,
        text,
        jsonp;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(Type type, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/module/builtin/stream/Options$Type");
        }

        public static Type valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Type) ipChange.ipc$dispatch("97373bd0", new Object[]{str});
            }
            return (Type) Enum.valueOf(Type.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f9981a;
        public String b;
        public final Map<String, String> c = new HashMap();
        public String d;
        public Type e;
        public int f;

        static {
            t2o.a(982516180);
        }

        public Options a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Options) ipChange.ipc$dispatch("de5848d8", new Object[]{this});
            }
            return new Options(this.f9981a, this.b, this.c, this.d, this.e, this.f);
        }

        public b b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("88e74ef", new Object[]{this, str, str2});
            }
            ((HashMap) this.c).put(str, str2);
            return this;
        }

        public b c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("5b2b270d", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public b d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("df4e558c", new Object[]{this, str});
            }
            this.f9981a = str;
            return this;
        }

        public b e(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("54738275", new Object[]{this, new Integer(i)});
            }
            this.f = i;
            return this;
        }

        public b f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("9a3ee2a5", new Object[]{this, str});
            }
            Type type = Type.json;
            if (type.name().equals(str)) {
                this.e = type;
            } else {
                Type type2 = Type.jsonp;
                if (type2.name().equals(str)) {
                    this.e = type2;
                } else {
                    this.e = Type.text;
                }
            }
            return this;
        }

        public b g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("f00abdd6", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }
    }

    static {
        t2o.a(982516178);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f8904be1", new Object[]{this});
        }
        return this.d;
    }

    public Map<String, String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("cf4415cc", new Object[]{this});
        }
        return this.c;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5e63d782", new Object[]{this});
        }
        return this.f9980a;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5e838025", new Object[]{this})).intValue();
        }
        return this.f;
    }

    public Type e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Type) ipChange.ipc$dispatch("12641612", new Object[]{this});
        }
        return this.e;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.b;
    }

    public Options(String str, String str2, Map<String, String> map, String str3, Type type, int i) {
        IpChange ipChange = Type.$ipChange;
        this.f = 3000;
        this.f9980a = str;
        this.b = str2;
        this.c = map;
        this.d = str3;
        this.e = type;
        this.f = i == 0 ? 3000 : i;
    }
}
