package tb;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.tao.tbmainfragment.ISupportFragment;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ol5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_GETVIEWCONTAINERSTORAGE = 9175482801831875946L;

    static {
        t2o.a(713031779);
    }

    public static /* synthetic */ Object ipc$super(ol5 ol5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/dinamicX/parser/DXDataParserGetViewContainerStorage");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        Object obj2 = null;
        if (!(objArr == null || objArr.length == 0)) {
            Object obj3 = objArr[0];
            if (!(obj3 instanceof String)) {
                return null;
            }
            Context h = dXRuntimeContext.h();
            if (h instanceof h4d) {
                obj = ((h4d) h).x2((String) obj3);
            } else if (h instanceof FragmentActivity) {
                ISupportFragment h2 = qxq.h(((FragmentActivity) h).getSupportFragmentManager());
                if (h2 instanceof h4d) {
                    obj2 = ((h4d) h2).x2((String) obj3);
                }
                obj = obj2;
            }
            if (obj == null) {
                return "";
            }
            return obj;
        }
        return null;
    }
}
