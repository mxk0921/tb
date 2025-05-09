package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class wt5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_WALLETGETSCROLLED = -1017335047642913806L;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Integer> f30910a;

    static {
        t2o.a(153092099);
    }

    public wt5(Map<String, Integer> map) {
        this.f30910a = map;
    }

    public static /* synthetic */ Object ipc$super(wt5 wt5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/common/dinamicx/parser/DXDataParserWalletGetScrolled");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        Integer num;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        Map<String, Integer> map = this.f30910a;
        if (map == null || objArr == null || objArr.length <= 0 || (num = map.get(objArr[0].toString())) == null) {
            return -1;
        }
        return num;
    }
}
