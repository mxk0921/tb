package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.nexus.arch.openArch.observe.OpenArchObservableStateCompareResult;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.collections.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class u2l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f29089a;
    public final OpenArchObservableStateCompareResult b;
    public final Set<String> c;
    public final Map<String, ? extends Object> d;

    static {
        t2o.a(1004535836);
    }

    public u2l() {
        this(0, null, null, null, 15, null);
    }

    public final Set<String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("49170ad9", new Object[]{this});
        }
        return this.c;
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a728c09b", new Object[]{this})).intValue();
        }
        return this.f29089a;
    }

    public final OpenArchObservableStateCompareResult c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OpenArchObservableStateCompareResult) ipChange.ipc$dispatch("171f15f5", new Object[]{this});
        }
        return this.b;
    }

    public final Map<String, Object> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9a8bb073", new Object[]{this});
        }
        return this.d;
    }

    public u2l(int i, OpenArchObservableStateCompareResult openArchObservableStateCompareResult, Set<String> set, Map<String, ? extends Object> map) {
        ckf.g(openArchObservableStateCompareResult, "predicateResult");
        ckf.g(set, "meetStateNameSet");
        ckf.g(map, "specifiedState");
        this.f29089a = i;
        this.b = openArchObservableStateCompareResult;
        this.c = set;
        this.d = map;
    }

    public /* synthetic */ u2l(int i, OpenArchObservableStateCompareResult openArchObservableStateCompareResult, Set set, Map map, int i2, a07 a07Var) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? OpenArchObservableStateCompareResult.Equal : openArchObservableStateCompareResult, (i2 & 4) != 0 ? new LinkedHashSet() : set, (i2 & 8) != 0 ? a.h() : map);
    }
}
