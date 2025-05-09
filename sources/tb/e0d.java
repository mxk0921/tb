package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface e0d {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Map<String, String> f18192a;
        public String b;
        public String c;
        public byte[] d;

        static {
            t2o.a(839909567);
        }

        public final Map<String, String> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("cf4415cc", new Object[]{this});
            }
            return this.f18192a;
        }

        public final String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5e63d782", new Object[]{this});
            }
            return this.c;
        }

        public final byte[] c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("5fb04f56", new Object[]{this});
            }
            return this.d;
        }

        public final String d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
            }
            return this.b;
        }

        public final void e(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bf00da", new Object[]{this, map});
            } else {
                this.f18192a = map;
            }
        }

        public final void f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc10634", new Object[]{this, str});
            } else {
                this.c = str;
            }
        }

        public final void g(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e665d7a", new Object[]{this, bArr});
            } else {
                this.d = bArr;
            }
        }

        public final void h(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e1dea87e", new Object[]{this, str});
            } else {
                this.b = str;
            }
        }
    }

    void a(a aVar);

    void b();

    void c(String str);

    void d(byte[] bArr);

    void e(String str, int i, boolean z, Map<String, String> map);

    void f(String str, int i, boolean z, Map<String, ? extends List<String>> map);
}
