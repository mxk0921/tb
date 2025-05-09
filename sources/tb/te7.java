package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.data.model.CardInnerCommonNode;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class te7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<String, Class<? extends CardInnerCommonNode>> f28657a = new HashMap<>();

    static {
        t2o.a(352321546);
    }

    public static Class<? extends CardInnerCommonNode> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("d8af5060", new Object[]{str});
        }
        Class<? extends CardInnerCommonNode> cls = f28657a.get(str);
        if (cls == null) {
            return CardInnerCommonNode.class;
        }
        return cls;
    }
}
