package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXScrollEvent;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class rwu implements t3e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f27655a;

    static {
        t2o.a(80740744);
        t2o.a(80740742);
    }

    public rwu(Context context, String str) {
        this.f27655a = context;
    }

    @Override // tb.t3e
    public void a(AURARenderComponent aURARenderComponent, DXEvent dXEvent, Object[] objArr, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f14a738", new Object[]{this, aURARenderComponent, dXEvent, objArr, map});
        } else if ((dXEvent instanceof DXScrollEvent) && objArr.length >= 2 && objArr[0] != null) {
            String obj = objArr[1].toString();
            if (!TextUtils.isEmpty(obj)) {
                map.put(obj, Integer.valueOf(pb6.z(this.f27655a, ((DXScrollEvent) dXEvent).getOffsetX())));
            }
        }
    }

    @Override // tb.t3e
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b15bf757", new Object[]{this});
        }
        return "aura.workflow.syncState";
    }

    public Class<? extends DXEvent> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("f6fea672", new Object[]{this});
        }
        return DXScrollEvent.class;
    }
}
