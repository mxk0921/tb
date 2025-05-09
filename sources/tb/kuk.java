package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXScrollEvent;
import com.taobao.android.sku.utils.SkuLogUtils;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class kuk extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final long DX_WIDGET_ID = k06.a("xskuOnScrolled");

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Integer> f22932a;

    public kuk(Map<String, Integer> map) {
        this.f22932a = map;
        if (cjz.a()) {
            SkuLogUtils.x("OnScrollEvent_init");
        }
    }

    public static /* synthetic */ Object ipc$super(kuk kukVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/sku/dinamicx/event/OnScrollEvent");
    }

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (this.f22932a != null && dXRuntimeContext != null) {
            Context h = dXRuntimeContext.h();
            if (dXEvent instanceof DXScrollEvent) {
                int offsetX = ((DXScrollEvent) dXEvent).getOffsetX();
                if (objArr != null && objArr.length > 0 && (obj = objArr[0]) != null) {
                    this.f22932a.put(obj.toString(), Integer.valueOf(pb6.z(h, offsetX)));
                }
            }
        }
    }

    static {
        t2o.a(442499172);
    }
}
