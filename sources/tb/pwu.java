package tb;

import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.umf.node.service.data.rule.RuleType;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class pwu implements t3e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Class<? extends DXEvent> EventType = DXEvent.class;

    /* renamed from: a  reason: collision with root package name */
    public final String f26366a;

    static {
        t2o.a(80740743);
        t2o.a(80740742);
    }

    public pwu(String str) {
        this.f26366a = str;
    }

    @Override // tb.t3e
    public void a(AURARenderComponent aURARenderComponent, DXEvent dXEvent, Object[] objArr, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f14a738", new Object[]{this, aURARenderComponent, dXEvent, objArr, map});
            return;
        }
        List<String> b = gio.b();
        int c = c(objArr, RuleType.PROPS_WRITE_BACK);
        if (c != -1) {
            f(objArr, c, map);
        } else {
            e(objArr, b, map);
        }
    }

    @Override // tb.t3e
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b15bf757", new Object[]{this});
        }
        return this.f26366a;
    }

    public final int c(Object[] objArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1b7fa5aa", new Object[]{this, objArr, str})).intValue();
        }
        for (int i = 0; i < objArr.length; i++) {
            if (str.equals(objArr[i])) {
                return i;
            }
        }
        return -1;
    }

    public Class<? extends DXEvent> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("f6fea672", new Object[]{this});
        }
        return EventType;
    }

    public final void e(Object[] objArr, List<String> list, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("618e2500", new Object[]{this, objArr, list, map});
            return;
        }
        for (int i = 0; i < objArr.length; i++) {
            if (list.contains(objArr[i])) {
                int i2 = i + 1;
                if (objArr.length > i2) {
                    map.put("clickId", objArr[i2]);
                    return;
                }
                return;
            }
        }
    }

    public final void f(Object[] objArr, int i, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46a00fc7", new Object[]{this, objArr, new Integer(i), map});
            return;
        }
        int i2 = 2 + i;
        if (objArr.length > i2) {
            Object obj = objArr[i + 1];
            Object obj2 = objArr[i2];
            if ((obj instanceof String) && (obj2 instanceof String)) {
                map.put((String) obj, (String) obj2);
            }
        }
    }
}
