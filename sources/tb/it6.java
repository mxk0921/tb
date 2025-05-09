package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class it6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f21563a;
    public final int b;
    public final Map<String, String> c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f21564a;
        public int b;
        public final Map<String, String> c = new HashMap();

        public static /* synthetic */ int a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a95a8065", new Object[]{bVar})).intValue();
            }
            return bVar.f21564a;
        }

        public static /* synthetic */ int b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c25bd204", new Object[]{bVar})).intValue();
            }
            return bVar.b;
        }

        public static /* synthetic */ Map c(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("70af01e5", new Object[]{bVar});
            }
            return bVar.c;
        }

        public it6 d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (it6) ipChange.ipc$dispatch("a23c66a5", new Object[]{this});
            }
            return new it6(this);
        }

        public b e(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("72fbadbb", new Object[]{this, new Integer(i)});
            }
            this.f21564a = i;
            return this;
        }

        public b f(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("7466dfe4", new Object[]{this, str, str2});
            }
            ((HashMap) this.c).put(str, str2);
            return this;
        }

        public b g(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("142585b5", new Object[]{this, new Integer(i)});
            }
            this.b = i;
            return this;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "type: " + this.b + "; data: " + this.c;
    }

    public it6(b bVar) {
        this.f21563a = b.a(bVar);
        this.b = b.b(bVar);
        this.c = b.c(bVar);
    }
}
