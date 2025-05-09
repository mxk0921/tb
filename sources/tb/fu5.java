package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXScrollEvent;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class fu5 extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final long DX_EVENT_DETAILSKUSCROLLED;
    public static final long DX_EVENT_ID;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Integer> f19534a;

    static {
        t2o.a(912262663);
        long a2 = k06.a("detailSKUScrolled");
        DX_EVENT_ID = a2;
        DX_EVENT_DETAILSKUSCROLLED = a2;
    }

    public fu5(Map<String, Integer> map) {
        this.f19534a = map;
    }

    public static /* synthetic */ Object ipc$super(fu5 fu5Var, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/transfer/handler/DXDetailSKUScrolledEventHandler");
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (this.f19534a != null && dXRuntimeContext != null && dXRuntimeContext.h() != null && objArr != null && objArr.length >= 1 && (obj = objArr[0]) != null) {
            String obj2 = obj.toString();
            if (!TextUtils.isEmpty(obj2) && (dXEvent instanceof DXScrollEvent)) {
                this.f19534a.put(obj2, Integer.valueOf(pb6.z(dXRuntimeContext.h(), ((DXScrollEvent) dXEvent).getOffsetX())));
            }
        }
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
