package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class l3g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final l3g c = new l3g();

    /* renamed from: a  reason: collision with root package name */
    public final c f23088a = new c();
    public final b b = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements Comparator<String> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(962592991);
        }

        public b(l3g l3gVar) {
        }

        /* renamed from: a */
        public int compare(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2b88f5f3", new Object[]{this, str, str2})).intValue();
            }
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return 0;
            }
            return str.compareTo(str2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c implements Comparator<String> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(962592992);
        }

        public c(l3g l3gVar) {
        }

        /* renamed from: a */
        public int compare(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2b88f5f3", new Object[]{this, str, str2})).intValue();
            }
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return 0;
            }
            return str.compareTo(str2) * (-1);
        }
    }

    static {
        t2o.a(962592989);
    }

    public static l3g a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l3g) ipChange.ipc$dispatch("c90e7ba6", new Object[0]);
        }
        return c;
    }

    public String[] b(String[] strArr, boolean z) {
        Comparator comparator;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("bd1d7690", new Object[]{this, strArr, new Boolean(z)});
        }
        if (z) {
            comparator = this.b;
        } else {
            comparator = this.f23088a;
        }
        if (comparator == null || strArr == null || strArr.length <= 0) {
            return null;
        }
        Arrays.sort(strArr, comparator);
        return strArr;
    }
}
