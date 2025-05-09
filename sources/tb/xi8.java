package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class xi8 extends iw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(479199492);
    }

    public xi8(kmb kmbVar, int i) {
        super(kmbVar, i);
    }

    public static /* synthetic */ Object ipc$super(xi8 xi8Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/multiplecolumn/EtGroupColumn");
    }

    @Override // tb.iw
    public List<Object> d(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b6e07992", new Object[]{this, list});
        }
        IDMComponent iDMComponent = null;
        for (IDMComponent iDMComponent2 : list) {
            if (TextUtils.equals(na3.sKeyTagGroupExtendBody, iDMComponent2.getTag())) {
                iDMComponent = iDMComponent2;
            }
        }
        if (iDMComponent == null) {
            return null;
        }
        return iDMComponent.getFields().getJSONArray("items");
    }

    @Override // tb.iw
    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f417a32b", new Object[]{this});
        }
        return "groupRecommendItems";
    }
}
