package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface rpc {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
        void a(String str, String str2);

        void b(c cVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f27530a;
        public final String b;
        public final String c;

        static {
            t2o.a(982516081);
        }

        public b(String str, String str2, String str3) {
            this.f27530a = str;
            this.b = str2;
            this.c = str3;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f27531a;
        public final String b;
        public final boolean c;
        public final boolean d;
        public final String e;
        public final String f;

        static {
            t2o.a(982516082);
        }

        public c(byte[] bArr, String str, boolean z, boolean z2, String str2, String str3, String str4) {
            this.f27531a = bArr;
            this.b = str;
            this.c = z;
            this.d = z2;
            this.e = str3;
            this.f = str4;
        }

        public static c a(byte[] bArr, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("98c3598e", new Object[]{bArr, str, str2});
            }
            return new c(bArr, str, false, true, null, str2, null);
        }

        public static c b(byte[] bArr, String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("8e1628d8", new Object[]{bArr, str, str2, str3});
            }
            return new c(bArr, str, false, true, null, str2, str3);
        }

        public static c c(byte[] bArr, String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("5c42d25e", new Object[]{bArr, str, str2, str3});
            }
            return new c(bArr, str, false, false, null, str2, str3);
        }

        public byte[] d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("7cd7a09f", new Object[]{this});
            }
            return this.f27531a;
        }

        public String e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("e6381fa6", new Object[]{this});
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

        public String g() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f1a2566d", new Object[]{this});
            }
            return this.f;
        }

        public boolean h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("252be503", new Object[]{this})).booleanValue();
            }
            return this.d;
        }

        public boolean i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3070ae0", new Object[]{this})).booleanValue();
            }
            return this.c;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final Map<String, c> f27532a = new HashMap();
        public int b;
        public int c;
        public long d;

        static {
            t2o.a(982516083);
        }
    }

    d a(List<b> list, long j, com.taobao.android.weex_framework.c cVar);

    void b(String str, String str2, String str3, boolean z, com.taobao.android.weex_framework.c cVar, a aVar);

    c c(String str);

    boolean d(String str);

    c e(String str);

    d f(List<b> list, long j, com.taobao.android.weex_framework.c cVar);

    void g(String str, String str2, String str3, boolean z, com.taobao.android.weex_framework.c cVar, a aVar);
}
