package tb;

import android.app.Activity;
import android.content.Context;
import androidx.core.util.Pools;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.component.TBVideoComponent;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class y4w {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<Context, Pools.SimplePool<TBVideoComponent.PlayerCoverView>> f31853a = new HashMap<>();

    static {
        t2o.a(502268183);
    }

    public static TBVideoComponent.PlayerCoverView a(Context context) {
        TBVideoComponent.PlayerCoverView playerCoverView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBVideoComponent.PlayerCoverView) ipChange.ipc$dispatch("4681fdde", new Object[]{context});
        }
        Pools.SimplePool<TBVideoComponent.PlayerCoverView> simplePool = f31853a.get(context);
        if (simplePool != null) {
            playerCoverView = simplePool.acquire();
        } else {
            playerCoverView = null;
        }
        if (playerCoverView == null) {
            playerCoverView = new TBVideoComponent.PlayerCoverView(context);
        }
        playerCoverView.setInCachePool(false);
        return playerCoverView;
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86b5778", new Object[]{context});
        } else {
            f31853a.remove(context);
        }
    }

    public static void c(TBVideoComponent.PlayerCoverView playerCoverView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ef98017", new Object[]{playerCoverView});
        } else if (playerCoverView != null) {
            playerCoverView.setPlayIcon(null, null, 0, 0);
            ut2.s(playerCoverView);
            playerCoverView.setElevation(0.0f);
            Context context = playerCoverView.getContext();
            if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
                HashMap<Context, Pools.SimplePool<TBVideoComponent.PlayerCoverView>> hashMap = f31853a;
                Pools.SimplePool<TBVideoComponent.PlayerCoverView> simplePool = hashMap.get(context);
                if (simplePool == null) {
                    simplePool = new Pools.SynchronizedPool<>(32);
                    hashMap.put(playerCoverView.getContext(), simplePool);
                }
                simplePool.release(playerCoverView);
                playerCoverView.setInCachePool(true);
            }
        }
    }
}
