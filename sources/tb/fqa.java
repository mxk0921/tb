package tb;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class fqa extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_HSAVEDATA = 8511541151937722234L;

    static {
        t2o.a(473956355);
    }

    public static /* synthetic */ Object ipc$super(fqa fqaVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/home/component/event/HSaveDataEventHandler");
    }

    public final void b(Context context, Object[] objArr) {
        String str;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eba1a841", new Object[]{this, context, objArr});
            return;
        }
        while (true) {
            int i2 = i + 1;
            if (i2 < objArr.length) {
                Object obj = objArr[i];
                Object obj2 = objArr[i2];
                if (!(obj instanceof String)) {
                    bqa.d("HSaveDataEventHandler", "args error. UnExcepted type of key.");
                } else if (obj2 == null) {
                    bqa.d("HSaveDataEventHandler", "args error. UnExcepted value is null.");
                } else {
                    String str2 = (String) obj;
                    if (obj2 instanceof JSON) {
                        str = ((JSON) obj2).toJSONString();
                    } else {
                        str = obj2.toString();
                    }
                    a28.c(context, str2, str);
                }
                i += 2;
            } else {
                return;
            }
        }
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (a(objArr, dXRuntimeContext)) {
            b(dXRuntimeContext.h(), objArr);
        }
    }

    public final boolean a(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5409bc9f", new Object[]{this, objArr, dXRuntimeContext})).booleanValue();
        }
        if (objArr == null || objArr.length == 0) {
            bqa.d("HSaveDataEventHandler", "args == null || args.length == 0");
            return false;
        } else if (objArr.length % 2 != 0) {
            bqa.d("HSaveDataEventHandler", "args error. UnExcepted length.");
            return false;
        } else if (dXRuntimeContext != null) {
            return dXRuntimeContext.h() != null;
        } else {
            bqa.d("HSaveDataEventHandler", "runtimeContext == null");
            return false;
        }
    }
}
