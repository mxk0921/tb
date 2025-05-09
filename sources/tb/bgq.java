package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class bgq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f16375a;
    public final String b;
    public final Map<String, String> c;
    public final Map<String, String> d;
    public final int e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f16376a;
        public String b = "GET";
        public final Map<String, String> c = new HashMap();
        public final Map<String, String> d = new HashMap();
        public final int e = 60000;

        public bgq a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (bgq) ipChange.ipc$dispatch("7652c33f", new Object[]{this});
            }
            if (this.f16376a != null) {
                return new bgq(this);
            }
            throw new IllegalStateException("url == null");
        }

        public b b(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("b06585", new Object[]{this, map});
            }
            ((HashMap) this.c).clear();
            if (map != null) {
                ((HashMap) this.c).putAll(map);
            }
            return this;
        }

        public b c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("e7a2c96b", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public b d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("2154289d", new Object[]{this, str});
            }
            if (str != null) {
                this.f16376a = str;
                return this;
            }
            throw new IllegalArgumentException("url == null");
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "SsrRequest{url='" + this.f16375a + "', method='" + this.b + "', headers=" + this.c + ", extProperties=" + this.d + ", timeoutMills=" + this.e + ", seqNo='null'}";
    }

    public bgq(b bVar) {
        this.f16375a = bVar.f16376a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
    }
}
