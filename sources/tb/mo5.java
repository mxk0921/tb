package tb;

import android.graphics.Color;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class mo5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f24178a;

    static {
        t2o.a(745538090);
    }

    public mo5(String str) {
        ckf.h(str, "biz");
        this.f24178a = str;
    }

    public static /* synthetic */ Object ipc$super(mo5 mo5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/ultron/dinamicX/dataParser/DXDataParserMtbHeaderColor");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        Object obj;
        Object obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        String str = null;
        if (objArr != null) {
            obj = ic1.L(objArr, 0);
        } else {
            obj = null;
        }
        if (!(obj instanceof String)) {
            obj = null;
        }
        String str2 = (String) obj;
        if (str2 != null) {
            if (objArr != null) {
                obj2 = ic1.L(objArr, 1);
            } else {
                obj2 = null;
            }
            if (!(obj2 instanceof String)) {
                obj2 = null;
            }
            String str3 = (String) obj2;
            if (str3 != null) {
                String str4 = cpt.c().e(this.f24178a).actionBarBackgroundColor;
                if (str4 != null) {
                    if (str4.length() > 0) {
                        str = str4;
                    }
                    if (str != null) {
                        if (y14.c(Color.parseColor(str))) {
                            return str3;
                        }
                        return str2;
                    }
                }
                return str3;
            }
        }
        return "#000000";
    }
}
