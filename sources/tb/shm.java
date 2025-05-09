package tb;

import android.graphics.Color;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.protocol.model.section.BasePopItemModel;
import com.taobao.homepage.pop.protocol.model.section.BasePopSectionModel;
import com.taobao.homepage.pop.protocol.model.section.BasePopSubItemModel;
import com.taobao.homepage.pop.view.popview.BasePopView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class shm implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String e = "PopTimerRunnable ";

    /* renamed from: a  reason: collision with root package name */
    private BasePopView f28056a;
    private IPopData b;
    private TextView c;
    private long d = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BasePopView f28057a;

        public a(BasePopView basePopView) {
            this.f28057a = basePopView;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            shm.b(shm.this, new TextView(this.f28057a.getContext()));
            shm.a(shm.this).setTextColor(Color.parseColor("#ff0000"));
            shm.a(shm.this).setTextSize(12.0f);
            this.f28057a.addView(shm.a(shm.this), new FrameLayout.LayoutParams(-2, -2));
        }
    }

    public shm(BasePopView basePopView, IPopData iPopData) {
        this.f28056a = basePopView;
        this.b = iPopData;
        if (cw6.b() && basePopView != null && basePopView.getContext() != null) {
            fet.a().g(new a(basePopView));
        }
    }

    public static /* synthetic */ TextView a(shm shmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("bc8a5656", new Object[]{shmVar});
        }
        return shmVar.c;
    }

    public static /* synthetic */ TextView b(shm shmVar, TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("49084c18", new Object[]{shmVar, textView});
        }
        shmVar.c = textView;
        return textView;
    }

    private void c(IPopData iPopData) {
        BasePopItemModel item;
        BasePopSubItemModel baseItemModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6177db0", new Object[]{this, iPopData});
            return;
        }
        BasePopSectionModel fetchPopSection = iPopData.fetchPopSection();
        if (fetchPopSection != null && (item = fetchPopSection.getItem()) != null && (baseItemModel = item.getBaseItemModel(2)) != null) {
            vhm.d(fetchPopSection, baseItemModel, null);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (this.f28056a.isFinished() || !this.f28056a.isCurrentVisible()) {
            this.f28056a.triggerInvalidPopRemove();
        } else {
            long refreshInterval = this.d + this.b.getPopConfig().getRefreshInterval();
            this.d = refreshInterval;
            TextView textView = this.c;
            if (textView != null) {
                textView.setText(String.valueOf(refreshInterval));
            }
            vfm.c(e, "update time=" + this.d + ", businessId=" + this.b.getBusinessID() + ", " + hashCode());
            this.f28056a.updatePopViewByTimer(this.d);
            if (this.d >= this.b.getPopConfig().getShowTimeMills()) {
                c(this.b);
                if (this.b.getPopConfig().isPopMessage()) {
                    this.f28056a.triggerPopMessage("endTime", this.b.getBusinessID(), null);
                } else {
                    this.f28056a.triggerPopViewEvent(2, this.b.getBusinessID());
                }
            }
        }
    }
}
