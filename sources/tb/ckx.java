package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.mytaobao.pagev2.dataservice.MtbDataServiceFacade;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ckx extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_NAVISWITCH = 8678754278928656170L;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f17122a;

    static {
        t2o.a(745538095);
    }

    public ckx(boolean z) {
        this.f17122a = z;
    }

    public static /* synthetic */ Object ipc$super(ckx ckxVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/ultron/dinamicX/dataParser/XDinamicSkinParser");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (this.f17122a) {
            z = !MtbDataServiceFacade.m();
        } else {
            z = TextUtils.equals(ish.g().b, "normal");
        }
        if (!z || j1q.b()) {
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }
}
