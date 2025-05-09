package tb;

import com.alibaba.android.aura.util.AURATraceUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXImageWidgetNode;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class lj extends ob5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_ID = -489609274268614298L;

    static {
        t2o.a(81789174);
    }

    public static /* synthetic */ Object ipc$super(lj ljVar, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/performance/AURAImageViewLoadCompleteEventHandler");
    }

    public final void a(qh qhVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3170db2c", new Object[]{this, qhVar, new Long(j)});
            return;
        }
        try {
            qhVar.j().update("imageLoaderEndTime", Long.valueOf(j));
        } catch (Throwable unused) {
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

    @Override // tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        qh qhVar = (qh) dXRuntimeContext.q();
        if (qhVar != null) {
            hl.b("图片加载完成， " + ((DXImageWidgetNode.ImageLoadCompleteEvent) dXEvent).getImageUrl(), null);
            AURATraceUtil.g(1, "aura-image-complete");
            List<gcb> f = qhVar.i().f(gcb.class);
            HashMap hashMap = new HashMap();
            hashMap.put("imageLoaderEndTime", "" + currentTimeMillis);
            for (gcb gcbVar : f) {
                gcbVar.P(hashMap);
            }
            a(qhVar, currentTimeMillis);
        }
    }
}
