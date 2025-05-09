package tb;

import android.content.Intent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class nlq extends n9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public WeakReference<Object> h;
    public Intent i;
    public Integer j;

    static {
        t2o.a(336592939);
    }

    public static /* synthetic */ Object ipc$super(nlq nlqVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilitykit/StdPopContext");
    }

    public final WeakReference<Object> n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("b5793d16", new Object[]{this});
        }
        return this.h;
    }

    public final Intent o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("56cdf9d4", new Object[]{this});
        }
        return this.i;
    }

    public final Integer p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("7e649b54", new Object[]{this});
        }
        return this.j;
    }

    public final void q(WeakReference<Object> weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a47362", new Object[]{this, weakReference});
        } else {
            this.h = weakReference;
        }
    }

    public final void r(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60a31428", new Object[]{this, intent});
        } else {
            this.i = intent;
        }
    }

    public final void s(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0760df6", new Object[]{this, num});
        } else {
            this.j = num;
        }
    }
}
