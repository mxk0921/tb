package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.h;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class fx5 extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444597299);
        t2o.a(444597452);
    }

    public static /* synthetic */ Object ipc$super(fx5 fx5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/DXFlattenRootWidget");
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    @Deprecated
    public DXWidgetNode queryWTByUserId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("45e63272", new Object[]{this, str});
        }
        if (getFlattenNode() == null) {
            return null;
        }
        return getFlattenNode().G(str);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public DXWidgetNode queryWidgetNodeByUserId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("ffaa925b", new Object[]{this, str});
        }
        if (getFlattenNode() == null) {
            return null;
        }
        return getFlattenNode().F(str);
    }
}
