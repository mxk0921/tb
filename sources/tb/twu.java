package tb;

import android.text.Editable;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXTextInputEvent;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class twu implements t3e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f29009a;

    static {
        t2o.a(80740746);
        t2o.a(80740742);
    }

    public twu(String str) {
        this.f29009a = str;
    }

    @Override // tb.t3e
    public void a(AURARenderComponent aURARenderComponent, DXEvent dXEvent, Object[] objArr, Map<String, Object> map) {
        Editable text;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f14a738", new Object[]{this, aURARenderComponent, dXEvent, objArr, map});
        } else if ((dXEvent instanceof DXTextInputEvent) && (text = ((DXTextInputEvent) dXEvent).getText()) != null) {
            map.put("text", text.toString());
        }
    }

    @Override // tb.t3e
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b15bf757", new Object[]{this});
        }
        return this.f29009a;
    }

    public Class<? extends DXEvent> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("f6fea672", new Object[]{this});
        }
        return DXTextInputEvent.class;
    }
}
