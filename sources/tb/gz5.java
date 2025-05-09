package tb;

import android.content.Context;
import android.net.Uri;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.nav.Nav;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class gz5 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_HOPENURL = 3191997408029463605L;

    static {
        t2o.a(729809012);
    }

    public static /* synthetic */ Object ipc$super(gz5 gz5Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/homepage/dinamic3/eventhandler/DXHOpenUrlEventHandler");
    }

    public final boolean a(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("269bf84f", new Object[]{this, context, uri})).booleanValue();
        }
        try {
            if (Nav.from(context).toUri(uri)) {
                return true;
            }
            bqa.d("DXHOpenUrlEventHandler", " openUrl jump failed !");
            return Nav.from(context).skipPreprocess().withCategory("com.taobao.intent.category.HYBRID_UI").toUri(uri);
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(context, R.string.homepage_parse_data_error, 0).show();
            return false;
        }
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        Object obj = objArr[0];
        if (!(obj instanceof String)) {
            bqa.d("DXHOpenUrlEventHandler", " 传进来的值不是String类型");
            return;
        }
        Context f = s38.f(dXRuntimeContext.L());
        String str = (String) obj;
        s2b.c().j(str);
        boolean a2 = a(f, Uri.parse(mqq.c(str)));
        if (a2) {
            p2b.n(true);
        }
        s2b.c().k(a2);
    }

    @Override // tb.ob5, tb.mvb
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else {
            super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        }
    }
}
