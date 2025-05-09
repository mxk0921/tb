package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.ubee.core.UserBehaviorStorage;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class h5v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public UserBehaviorStorage f20427a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final h5v f20428a = new h5v();

        static {
            t2o.a(779092250);
        }

        public static /* synthetic */ h5v a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (h5v) ipChange.ipc$dispatch("87390cc9", new Object[0]);
            }
            return f20428a;
        }
    }

    static {
        t2o.a(779092248);
    }

    public static h5v b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h5v) ipChange.ipc$dispatch("a9cf77ae", new Object[0]);
        }
        return b.a();
    }

    public UserBehaviorStorage a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UserBehaviorStorage) ipChange.ipc$dispatch("ede6bb6b", new Object[]{this});
        }
        if (this.f20427a == null) {
            this.f20427a = new UserBehaviorStorage();
        }
        return this.f20427a;
    }

    public h5v() {
    }
}
