package tb;

import com.alibaba.android.aura.IAURAInputField;
import com.alibaba.android.aura.nodemodel.branch.AURANodeBranchModel;
import java.io.Serializable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface nbb {
    boolean a(AURANodeBranchModel aURANodeBranchModel);

    <DATA> nbb b(IAURAInputField<DATA> iAURAInputField);

    <DATA extends Serializable> void c(String str, DATA data, pt ptVar);

    void destroy();

    lo getUserContext();
}
