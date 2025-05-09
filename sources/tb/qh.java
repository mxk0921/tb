package tb;

import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class qh extends fl6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final lo f26744a;
    public final AURARenderComponent b;
    public final yi c;
    public final AURAGlobalData d;
    public DXEvent e;
    public Object[] f;
    public Map<String, Object> g;

    static {
        t2o.a(80740432);
    }

    public qh(lo loVar, AURARenderComponent aURARenderComponent, yi yiVar, AURAGlobalData aURAGlobalData) {
        this.f26744a = loVar;
        this.b = aURARenderComponent;
        this.c = yiVar;
        this.d = aURAGlobalData;
    }

    public static /* synthetic */ Object ipc$super(qh qhVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/service/event/dx/AURADXUserContext");
    }

    public Object[] f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Object[]) ipChange.ipc$dispatch("60d4303b", new Object[]{this});
        }
        return this.f;
    }

    public DXEvent g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXEvent) ipChange.ipc$dispatch("96f8da1", new Object[]{this});
        }
        return this.e;
    }

    public Map<String, Object> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2812908d", new Object[]{this});
        }
        return this.g;
    }

    public yi i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yi) ipChange.ipc$dispatch("369fbe0", new Object[]{this});
        }
        return this.c;
    }

    public AURAGlobalData j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAGlobalData) ipChange.ipc$dispatch("3078f400", new Object[]{this});
        }
        return this.d;
    }

    public AURARenderComponent k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponent) ipChange.ipc$dispatch("659b1b43", new Object[]{this});
        }
        return this.b;
    }

    public lo l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lo) ipChange.ipc$dispatch("fc4bf91a", new Object[]{this});
        }
        return this.f26744a;
    }

    public void m(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6e6180b", new Object[]{this, objArr});
        } else {
            this.f = objArr;
        }
    }

    public void n(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79eb1ccd", new Object[]{this, dXEvent});
        } else {
            this.e = dXEvent;
        }
    }

    public void o(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccea8b39", new Object[]{this, map});
        } else {
            this.g = map;
        }
    }
}
