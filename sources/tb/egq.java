package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class egq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f18565a;
    public final String b;
    public final String c;
    public final Map<String, List<String>> d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f18566a = -1;
        public String b;
        public String c;
        public Map<String, List<String>> d;

        public egq a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (egq) ipChange.ipc$dispatch("b5d486c7", new Object[]{this});
            }
            return new egq(this);
        }

        public b b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("a13d136a", new Object[]{this, new Integer(i)});
            }
            this.f18566a = i;
            return this;
        }

        public b c(Map<String, List<String>> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("6060a433", new Object[]{this, map});
            }
            this.d = map;
            return this;
        }

        public b d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("43390b3", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public b e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("d12ee41a", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "SsrResponse{code=" + this.f18565a + ", retCode='" + this.b + "', message='" + this.c + "', headers=" + this.d + ", extProperties=null}";
    }

    public egq(b bVar) {
        this.f18565a = bVar.f18566a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
    }
}
