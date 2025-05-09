package com.taobao.themis.open.resource;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class PackageInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f13681a;
    public final String b;
    public final String c;
    public final String d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/taobao/themis/open/resource/PackageInfo$TYPE;", "", "(Ljava/lang/String;I)V", "FRAMEWORK", "MAIN", "PLUGIN", "SUBPACKAGE", "RESOURCE", "OTHER", "themis_open_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class TYPE extends Enum<TYPE> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final TYPE FRAMEWORK = new TYPE("FRAMEWORK", 0);
        public static final TYPE MAIN = new TYPE("MAIN", 1);
        public static final TYPE PLUGIN = new TYPE("PLUGIN", 2);
        public static final TYPE SUBPACKAGE = new TYPE("SUBPACKAGE", 3);
        public static final TYPE RESOURCE = new TYPE("RESOURCE", 4);
        public static final TYPE OTHER = new TYPE("OTHER", 5);
        private static final /* synthetic */ TYPE[] $VALUES = $values();

        private static final /* synthetic */ TYPE[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (TYPE[]) ipChange.ipc$dispatch("2ac57765", new Object[0]) : new TYPE[]{FRAMEWORK, MAIN, PLUGIN, SUBPACKAGE, RESOURCE, OTHER};
        }

        private TYPE(String str, int i) {
        }

        public static /* synthetic */ Object ipc$super(TYPE type, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/open/resource/PackageInfo$TYPE");
        }

        public static TYPE valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("51d71b10", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(TYPE.class, str);
            }
            return (TYPE) valueOf;
        }

        public static TYPE[] values() {
            Object clone;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                clone = ipChange.ipc$dispatch("f23ae541", new Object[0]);
            } else {
                clone = $VALUES.clone();
            }
            return (TYPE[]) clone;
        }
    }

    static {
        t2o.a(843055391);
    }

    public PackageInfo(String str, String str2, String str3, TYPE type, String str4) {
        ckf.g(str, "name");
        ckf.g(str2, "id");
        ckf.g(str3, "version");
        ckf.g(type, "type");
        this.f13681a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1bcb7a22", new Object[]{this});
        }
        return this.d;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
        }
        return this.b;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this});
        }
        return this.c;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "PackageInfo(name='" + this.f13681a + "', id='" + this.b + "', version='" + this.c + "', filePath=" + ((Object) this.d) + ')';
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!ckf.b(PackageInfo.class, obj == null ? null : obj.getClass())) {
            return false;
        }
        if (obj != null) {
            PackageInfo packageInfo = (PackageInfo) obj;
            return ckf.b(this.b, packageInfo.b) && ckf.b(this.c, packageInfo.c);
        }
        throw new NullPointerException("null cannot be cast to non-null type com.taobao.themis.open.resource.PackageInfo");
    }
}
