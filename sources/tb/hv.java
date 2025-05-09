package tb;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class hv<T extends View> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public T mHost;

    static {
        t2o.a(724566079);
    }

    public hv() {
        constructor(null, null, 0);
    }

    public abstract void constructor(Context context, AttributeSet attributeSet, int i);

    public T getHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((View) ipChange.ipc$dispatch("402a7ca7", new Object[]{this}));
        }
        return this.mHost;
    }

    public void setHost(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fa76c81", new Object[]{this, t});
        } else {
            this.mHost = t;
        }
    }
}
