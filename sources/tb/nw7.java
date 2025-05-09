package tb;

import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.widget.touch.DragFloatLayer;
import com.taobao.android.icart.widget.touch.TipsLineFollower;
import com.taobao.android.icart.widget.touch.tips.DragTips;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class nw7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(478151162);
        t2o.a(478151169);
    }

    public q0c a(kmb kmbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q0c) ipChange.ipc$dispatch("9fb7fa2f", new Object[]{this, kmbVar});
        }
        return new ewi();
    }

    public t0c b(kmb kmbVar, RecyclerView recyclerView, TipsLineFollower tipsLineFollower, DragFloatLayer dragFloatLayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (t0c) ipChange.ipc$dispatch("6c3a3f75", new Object[]{this, kmbVar, recyclerView, tipsLineFollower, dragFloatLayer});
        }
        return new DragTips(recyclerView, tipsLineFollower, dragFloatLayer);
    }

    public v0c c(kmb kmbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v0c) ipChange.ipc$dispatch("4de70133", new Object[]{this, kmbVar});
        }
        return new fwi(kmbVar);
    }

    public s0c d(kmb kmbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s0c) ipChange.ipc$dispatch("d611b8bf", new Object[]{this, kmbVar});
        }
        return new iwi(kmbVar);
    }
}
