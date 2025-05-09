package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class cyo extends aj8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int b;

    static {
        t2o.a(766510313);
    }

    public cyo(int i) {
        super(null);
        this.b = i;
    }

    public static /* synthetic */ Object ipc$super(cyo cyoVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/shop2023/data/ScrollEvent");
    }

    public final int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("25f8a065", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public final void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bf24745", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }
}
