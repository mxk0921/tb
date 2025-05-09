package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class h2k extends i4b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699678);
    }

    public h2k(Context context, amr amrVar, String str) {
        super(context, amrVar, str);
    }

    public static /* synthetic */ Object ipc$super(h2k h2kVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/recommendpop/NewUserItemZonePopView");
    }

    @Override // tb.i4b, tb.jw1
    public boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ce9b29a2", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.jw1
    public boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ecd0c8", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.jw1
    public boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bfb73475", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.jw1
    public boolean x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf90f322", new Object[]{this})).booleanValue();
        }
        return false;
    }
}
