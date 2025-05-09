package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridInstanceRenderMode;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class mbv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f23930a;
    public final String b;
    public final int c;
    public final boolean d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final List<String> k;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String h;
        public String j;
        public List<String> k;

        /* renamed from: a  reason: collision with root package name */
        public String f23931a = "";
        public String b = "";
        public int c = 1;
        public boolean d = false;
        public String e = UltronTradeHybridStage.ON_NAV;
        public String f = "none";
        public String g = "none";
        public String i = UltronTradeHybridInstanceRenderMode.TEXTURE;

        static {
            t2o.a(157286863);
        }

        public mbv a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (mbv) ipChange.ipc$dispatch("7d45c6e6", new Object[]{this});
            }
            return new mbv(this.f23931a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
        }

        public b b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("6af00a8d", new Object[]{this, new Boolean(z)});
            }
            this.d = z;
            return this;
        }

        public b c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("70286bd7", new Object[]{this, str});
            }
            this.f23931a = str;
            return this;
        }

        public b d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("656e3089", new Object[]{this, str});
            }
            this.g = str;
            return this;
        }

        public b e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("2893b7ed", new Object[]{this, str});
            }
            this.h = str;
            return this;
        }

        public b f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("abd25f1d", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }

        public b g(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("c0c014b5", new Object[]{this, new Integer(i)});
            }
            if (i <= 0) {
                i = 1;
            }
            this.c = i;
            return this;
        }

        public b h(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("20049cf9", new Object[]{this, str});
            }
            this.i = str;
            return this;
        }

        public b i(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("54b7d4bb", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public b j(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("f13e7fd0", new Object[]{this, str});
            }
            this.f = str;
            return this;
        }

        public b k(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("fba59785", new Object[]{this, str});
            }
            this.j = str;
            return this;
        }

        public b l(List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("c13b8c8c", new Object[]{this, list});
            }
            this.k = list;
            return this;
        }
    }

    static {
        t2o.a(157286861);
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("afd76449", new Object[]{str, str2})).booleanValue();
        }
        if (str == null || str2 == null) {
            return false;
        }
        Uri parse = Uri.parse(str);
        Uri parse2 = Uri.parse(str2);
        if (TextUtils.equals(parse.getHost(), parse2.getHost()) && TextUtils.equals(parse.getPath(), parse2.getPath())) {
            return true;
        }
        return false;
    }

    public static boolean b(mbv mbvVar, mbv mbvVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88786c7f", new Object[]{mbvVar, mbvVar2})).booleanValue();
        }
        if (mbvVar == null || mbvVar2 == null) {
            return false;
        }
        return a(mbvVar.b, mbvVar2.b);
    }

    public mbv(String str, String str2, int i, boolean z, String str3, String str4, String str5, String str6, String str7, String str8, List<String> list) {
        this.f23930a = str;
        this.b = str2;
        this.c = i;
        this.d = z;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = list;
    }
}
