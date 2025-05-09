package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import tb.at4;
import tb.r6o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class jq5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final long DX_PARSER_STATUSBARHEIGHT = -2517623531547489759L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        static {
            t2o.a(918552737);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(918552736);
    }

    public static /* synthetic */ Object ipc$super(jq5 jq5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dressup/common/service/dx/DXDataParserStatusBarHeight");
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        ckf.g(objArr, "operationList");
        ckf.g(dXRuntimeContext, "dinamicParams");
        at4.a aVar = at4.Companion;
        Context h = dXRuntimeContext.h();
        ckf.f(h, "dinamicParams.context");
        r6o.a aVar2 = r6o.Companion;
        Context h2 = dXRuntimeContext.h();
        ckf.f(h2, "dinamicParams.context");
        return Integer.valueOf(aVar.a(h, Integer.valueOf(aVar2.g(h2))));
    }
}
