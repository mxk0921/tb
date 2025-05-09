package tb;

import com.alibaba.evo.EVOExperiment;
import com.alibaba.evo.internal.bucketing.model.ExperimentV5;
import com.alibaba.ut.abtest.VariationSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface dw6 {
    VariationSet a(String str, String str2, Map<String, Object> map, boolean z, Object obj);

    VariationSet b(String str);

    List<EVOExperiment> c(String str, Map<String, Object> map);

    VariationSet g(String str, String str2, Map<String, Object> map, Object obj);

    String h();

    long i();

    void initialize();

    void j(String str);

    void k();

    void l(List<ExperimentV5> list, Set<Long> set, long j, String str);

    do8 m(ExperimentV5 experimentV5, Map<String, Object> map, pv6 pv6Var, boolean z);

    long n();

    void o(String str, String str2, bzu bzuVar);

    String p();

    void q(String str, String str2, bzu bzuVar);

    void r(String str);

    String s();

    void syncExperiments(boolean z, String str);

    int t();

    void u(String str);
}
