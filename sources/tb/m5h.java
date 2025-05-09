package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.player.warm.LiveRoomWarmManager;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class m5h {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG = m5h.class.getSimpleName();
    public static m5h b;

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<LiveRoomWarmManager> f23794a;

    static {
        t2o.a(779093218);
    }

    public static m5h c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m5h) ipChange.ipc$dispatch("2d8b18ec", new Object[0]);
        }
        if (b == null) {
            b = new m5h();
        }
        return b;
    }

    public void a(LiveRoomWarmManager liveRoomWarmManager) {
        LiveRoomWarmManager liveRoomWarmManager2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c4a2a8", new Object[]{this, liveRoomWarmManager});
            return;
        }
        d(pg1.ATOM_EXT_clear);
        WeakReference<LiveRoomWarmManager> weakReference = this.f23794a;
        if (weakReference != null && (liveRoomWarmManager2 = weakReference.get()) != null && liveRoomWarmManager2 == liveRoomWarmManager) {
            this.f23794a.clear();
            this.f23794a = null;
        }
    }

    public LiveRoomWarmManager b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveRoomWarmManager) ipChange.ipc$dispatch("70ddef4a", new Object[]{this});
        }
        WeakReference<LiveRoomWarmManager> weakReference = this.f23794a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public final void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{this, str});
        } else {
            cir.a(TAG, str);
        }
    }

    public void e(LiveRoomWarmManager liveRoomWarmManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("335ecfc8", new Object[]{this, liveRoomWarmManager});
            return;
        }
        d("markWarmUp liveRoomWarmManager = " + liveRoomWarmManager);
        this.f23794a = new WeakReference<>(liveRoomWarmManager);
    }
}
