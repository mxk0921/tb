package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.resourceguardian.data.model.RGCategoryInfo;
import com.taobao.android.resourceguardian.data.model.RGTypeInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class eyl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f18894a;
    public final int b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;
    public final String g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f18895a;
        public int b;
        public String d;
        public String c = "CRITICAL";
        public final String e = "common";
        public String f = "main";

        public static /* synthetic */ int a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4af23c9e", new Object[]{bVar})).intValue();
            }
            return bVar.f18895a;
        }

        public static /* synthetic */ int b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("90937f3d", new Object[]{bVar})).intValue();
            }
            return bVar.b;
        }

        public static /* synthetic */ String c(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5c621d7", new Object[]{bVar});
            }
            return bVar.c;
        }

        public static /* synthetic */ String d(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("492c9118", new Object[]{bVar});
            }
            return bVar.d;
        }

        public static /* synthetic */ int e(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6177471a", new Object[]{bVar})).intValue();
            }
            bVar.getClass();
            return 0;
        }

        public static /* synthetic */ String f(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("cff96f9a", new Object[]{bVar});
            }
            return bVar.e;
        }

        public static /* synthetic */ String g(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("135fdedb", new Object[]{bVar});
            }
            return bVar.f;
        }

        public eyl h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (eyl) ipChange.ipc$dispatch("cea90d1e", new Object[]{this});
            }
            return new eyl(this);
        }

        public b i(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("91e5e2ea", new Object[]{this, new Integer(i)});
            }
            this.f18895a = i;
            return this;
        }

        public b j(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("ceb8f321", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public b k(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("5a23b60c", new Object[]{this, str});
            }
            this.f = str;
            return this;
        }

        public b l(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("85ceac2e", new Object[]{this, new Integer(i)});
            }
            this.b = i;
            return this;
        }

        public b m(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("c0fa4e8e", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "PerformanceWarningInfo = {\"category\":\"" + RGCategoryInfo.a(this.f18894a) + "\", \"type\":\"" + RGTypeInfo.a(this.b) + "\", \"level\":\"" + this.c + "\", \"value\":\"" + this.d + "\", \"score:\"" + this.e + "\", \"profileType\":\"" + this.f + "\", \"process\":\"" + this.g + "\"}";
    }

    public eyl(b bVar) {
        this.f18894a = b.a(bVar);
        this.b = b.b(bVar);
        this.c = b.c(bVar);
        this.d = b.d(bVar);
        this.e = b.e(bVar);
        this.f = b.f(bVar);
        this.g = b.g(bVar);
    }
}
