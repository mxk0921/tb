package tb;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.taolive.room.TaoLiveVideoActivity;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class j7t implements View.OnLayoutChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f21823a;
    public final /* synthetic */ TaoLiveVideoActivity b;

    public j7t(TaoLiveVideoActivity taoLiveVideoActivity, RecyclerView recyclerView) {
        this.b = taoLiveVideoActivity;
        this.f21823a = recyclerView;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
            return;
        }
        if (TaoLiveVideoActivity.p3(this.b) != null) {
            TLog.loge("tblive", TaoLiveVideoActivity.G3(), "上下滑容器onLayoutChange，预播播放器引用计数-1");
            TaoLiveVideoActivity.p3(this.b).a(false);
        }
        this.f21823a.removeOnLayoutChangeListener(this);
    }
}
