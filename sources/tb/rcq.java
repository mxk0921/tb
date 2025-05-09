package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class rcq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final wnc f27281a = (wnc) d62.b(wnc.class, "SplitInstallInfoProvider");

    static {
        t2o.a(677380252);
    }

    public rcq(Context context, String str) {
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f952f6ee", new Object[]{str})).booleanValue();
        }
        if (str.startsWith("config.") || str.contains(".config.")) {
            return true;
        }
        return false;
    }

    public final Set a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("6f4ac47d", new Object[]{this});
        }
        HashSet hashSet = new HashSet();
        lcq a2 = mcq.a();
        if (a2 != null) {
            synchronized (a2.a()) {
                hashSet.addAll(a2.a());
            }
        }
        return hashSet;
    }

    public final Set b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("6bedb799", new Object[]{this});
        }
        HashSet hashSet = new HashSet();
        for (String str : a()) {
            if (!c(str)) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }
}
