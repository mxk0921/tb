package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class wcr implements p7c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092276);
        t2o.a(806354957);
    }

    @Override // tb.p7c
    public o7c a(b0d b0dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o7c) ipChange.ipc$dispatch("12fa75ca", new Object[]{this, b0dVar});
        }
        if (1 == c()) {
            if (b()) {
                return d9m.e().createTBFollowGuangBusiness(b0dVar);
            }
            return null;
        } else if (b()) {
            return d9m.e().createTBFollowBusiness(b0dVar);
        } else {
            return null;
        }
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b29a5d01", new Object[]{this})).booleanValue();
        }
        if (!bl9.g().b() || d9m.e() == null) {
            return false;
        }
        return true;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("37af6d8e", new Object[]{this})).intValue();
        }
        if (!TBRevisionSwitchManager.c().d(bud.KEY_NEW_CONTENT_ENABLE) || !sbt.z()) {
            return 0;
        }
        return 1;
    }
}
