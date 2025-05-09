package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ek4 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ALL = 29;
    public static final int CANCELLATION = 8;
    public static final int FAILURE = 16;
    public static final int LAST_RESULT = 2;
    public static final int NEW_RESULT = 1;
    public static final int PROGRESS_UPDATE = 4;
    public static final int SKIP = 0;

    /* renamed from: a  reason: collision with root package name */
    public final int f18636a;

    public ek4(int i) {
        this.f18636a = i;
    }

    public boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("67d78afb", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if ((i & this.f18636a) > 0) {
            return true;
        }
        return false;
    }
}
