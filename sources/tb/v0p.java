package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class v0p extends qz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793524);
    }

    public static /* synthetic */ Object ipc$super(v0p v0pVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/video/SearchBaseVideoManager");
    }

    public final int c(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e65ab85", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)})).intValue();
        }
        if (i3 <= i && i4 >= i2) {
            return i2 - i;
        }
        if (i3 >= i && i4 <= i2) {
            return i4 - i3;
        }
        if (i3 >= i) {
            return i2 - i3;
        }
        if (i4 <= i2) {
            return i4 - i;
        }
        return 0;
    }

    @Override // tb.qz
    public float k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e31009f", new Object[]{this})).floatValue();
        }
        return 0.75f;
    }
}
