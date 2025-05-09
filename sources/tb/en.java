package tb;

import com.alibaba.android.ultron.ext.vlayout.b;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class en extends bj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int HIDE_ON_ENTER = 3;
    public static final int SHOW_ALWAYS = 0;
    public static final int SHOW_ON_ENTER = 1;
    public static final int SHOW_ON_LEAVE = 2;
    public int A = 0;

    static {
        t2o.a(80740617);
    }

    public en(int i, int i2, int i3) {
        super(i, i2, i3);
    }

    public static /* synthetic */ Object ipc$super(en enVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/service/render/layout/vlayouthelper/AURAScrollFixLayoutHelper");
    }

    @Override // tb.bj
    public boolean v0(b bVar, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4be78251", new Object[]{this, bVar, new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue();
        }
        int i4 = this.A;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3 && i2 > n().d().intValue() - 1) {
                    return false;
                }
                return true;
            } else if (i >= n().d().intValue() + 1) {
                return true;
            } else {
                return false;
            }
        } else if (i2 >= n().d().intValue() - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void x0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("461bd8a3", new Object[]{this, new Integer(i)});
        } else {
            this.A = i;
        }
    }
}
