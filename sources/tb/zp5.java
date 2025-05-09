package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.Arrays;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class zp5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_REVISIONSWITCH = -1245704009979908881L;

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f32926a = Arrays.asList(bud.KEY_NEW_FACE_ENABLE, bud.KEY_NEW_CONTENT_ENABLE, "new2021UIEnable");

    static {
        t2o.a(729809055);
    }

    public static /* synthetic */ Object ipc$super(zp5 zp5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/dinamic3/parser/DXDataParserRevisionSwitch");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        Object obj = objArr[0];
        if ((obj instanceof String) && this.f32926a.contains((String) obj)) {
            return String.valueOf(true);
        }
        return null;
    }
}
