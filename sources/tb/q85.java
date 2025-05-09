package tb;

import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.media.DWViewUtil;
import com.taobao.taobaoavsdk.CodeUsageCounter;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class q85 implements ytb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ImageView f26573a;
    public final DWContext b;

    static {
        t2o.a(452985148);
        t2o.a(452985011);
    }

    public q85(DWContext dWContext, ImageView imageView) {
        this.b = dWContext;
        this.f26573a = imageView;
        CodeUsageCounter.c().a(CodeUsageCounter.componentName.dw_sdk_DWMuteController);
    }

    @Override // tb.ytb
    public void onVideoClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24db3403", new Object[]{this});
        }
    }

    @Override // tb.ytb
    public void onVideoComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
        }
    }

    @Override // tb.ytb
    public void onVideoError(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
        }
    }

    @Override // tb.ytb
    public void onVideoInfo(Object obj, long j, long j2, long j3, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59f3ed73", new Object[]{this, obj, new Long(j), new Long(j2), new Long(j3), obj2});
        }
    }

    @Override // tb.ytb
    public void onVideoPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.ytb
    public void onVideoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931007b7", new Object[]{this});
        }
    }

    @Override // tb.ytb
    public void onVideoPrepared(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
        }
    }

    @Override // tb.ytb
    public void onVideoProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        }
    }

    @Override // tb.ytb
    public void onVideoScreenChanged(DWVideoScreenType dWVideoScreenType) {
        FrameLayout.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84bd1066", new Object[]{this, dWVideoScreenType});
            return;
        }
        ImageView imageView = this.f26573a;
        if (imageView != null && (layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams()) != null) {
            if (DWVideoScreenType.LANDSCAPE_FULL_SCREEN == dWVideoScreenType) {
                layoutParams.rightMargin = DWViewUtil.dip2px(this.b.getActivity(), 9.0f);
                layoutParams.topMargin = DWViewUtil.dip2px(this.b.getActivity(), 76.0f);
            } else {
                layoutParams.rightMargin = DWViewUtil.dip2px(this.b.getActivity(), 6.0f);
                layoutParams.topMargin = DWViewUtil.dip2px(this.b.getActivity(), 12.0f);
            }
            this.f26573a.setLayoutParams(layoutParams);
        }
    }

    @Override // tb.ytb
    public void onVideoSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.ytb
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
        }
    }
}
