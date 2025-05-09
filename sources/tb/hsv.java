package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class hsv extends pz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f20881a = 0;

    static {
        t2o.a(81789230);
    }

    public static hsv a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hsv) ipChange.ipc$dispatch("f6d0ed29", new Object[]{new Integer(i), new Integer(i2)});
        }
        hsv hsvVar = new hsv();
        hsvVar.f20881a = i;
        return hsvVar;
    }

    public static /* synthetic */ Object ipc$super(hsv hsvVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/userMotion/model/UserMotionScrollEventNode");
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc210f76", new Object[]{this})).intValue();
        }
        return this.f20881a;
    }
}
