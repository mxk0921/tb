package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class svn extends ra2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(961544288);
    }

    public static /* synthetic */ Object ipc$super(svn svnVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ut/abtest/bucketing/expression/RegularExpressionOperator");
    }

    @Override // tb.ra2
    public boolean a(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90f92b31", new Object[]{this, obj, obj2})).booleanValue();
        }
        if (obj == null || obj2 == null || !(obj instanceof String)) {
            return false;
        }
        return xr8.f(obj).matches(xr8.f(obj2));
    }

    @Override // tb.ra2
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("970829e7", new Object[]{this});
        }
        return "$re";
    }
}
