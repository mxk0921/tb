package tb;

import android.os.Handler;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.context.MetricContext;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class m3l extends ol8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean g = false;
    public final int[] h;
    public final Class<?> i;

    public m3l(int[] iArr, Class<?> cls, Handler handler) {
        super(iArr, handler);
        this.h = iArr;
        this.i = cls;
    }

    public static /* synthetic */ Object ipc$super(m3l m3lVar, String str, Object... objArr) {
        if (str.hashCode() == -1330343191) {
            super.k(((Number) objArr[0]).intValue(), (Map) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/metrickit/event/OpenEventSource");
    }

    @Override // tb.ol8
    public void k(int i, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0b492e9", new Object[]{this, new Integer(i), map});
        } else if (this.g) {
            super.k(i, map);
        }
    }

    @Override // tb.ol8
    public int[] l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("f6d4687e", new Object[]{this});
        }
        return this.h;
    }

    @Override // tb.ol8
    public void q(MetricContext metricContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce7c6c76", new Object[]{this, metricContext});
        } else {
            this.g = true;
        }
    }

    public Class<?> u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("438e63c9", new Object[]{this});
        }
        return this.i;
    }

    public m3l(int[] iArr, String str, Handler handler) {
        super(iArr, handler);
        this.h = iArr;
        try {
            this.i = Class.forName(str);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
