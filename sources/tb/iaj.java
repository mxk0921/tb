package tb;

import android.os.Bundle;
import com.alibaba.evo.EVOExperiment;
import com.alibaba.ut.abtest.VariationSet;
import com.alibaba.ut.abtest.internal.debug.Debug;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface iaj {
    VariationSet a(String str, String str2, Map<String, Object> map, boolean z, Object obj);

    VariationSet b(String str);

    List<EVOExperiment> c(String str, Map<String, Object> map);

    String d();

    boolean e(String str, Map<String, Object> map, Object obj);

    boolean f(String str, Object obj);

    VariationSet g(String str, String str2, Map<String, Object> map, Object obj);

    void h(Debug debug);

    void i(String str, String str2, String str3, String str4);

    void j(int i, Bundle bundle);

    boolean k(boolean z);

    boolean l(boolean z);
}
