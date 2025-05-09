package tb;

import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class x68 extends hjx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262987);
    }

    public x68(MotionEvent motionEvent) {
        super(motionEvent);
    }

    public static /* synthetic */ Object ipc$super(x68 x68Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/desc/picgallery/EclairMotionEvent");
    }

    @Override // tb.hjx
    public float c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("34782cca", new Object[]{this, new Integer(i)})).floatValue();
        }
        return this.f20696a.getX(i);
    }

    @Override // tb.hjx
    public float e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("362d0569", new Object[]{this, new Integer(i)})).floatValue();
        }
        return this.f20696a.getY(i);
    }
}
