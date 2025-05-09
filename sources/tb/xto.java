package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class xto {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final xto IMMEDIATE_NON_TERMINATING = new xto().a();

    /* renamed from: a  reason: collision with root package name */
    public int f31600a;

    public final xto a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xto) ipChange.ipc$dispatch("e7cdac48", new Object[]{this});
        }
        this.f31600a = 1;
        return this;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9bb55fe3", new Object[]{this})).booleanValue();
        }
        if (1 == this.f31600a) {
            return true;
        }
        return false;
    }
}
