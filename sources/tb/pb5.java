package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import tb.f46;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class pb5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596851);
    }

    public static /* synthetic */ Object ipc$super(pb5 pb5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/expression/parser/DXAbsFastReturnDinamicDataParser");
    }

    public Object a(Object[] objArr, DXRuntimeContext dXRuntimeContext, f46.a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5ef83ee9", new Object[]{this, objArr, dXRuntimeContext, aVar, new Integer(i)});
        }
        return null;
    }
}
