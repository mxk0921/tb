package tb;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.DWLifecycleType;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class u75 implements ctb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final DWContext f29205a;
    public FrameLayout b;

    static {
        t2o.a(452984849);
        t2o.a(452985037);
    }

    public u75(DWContext dWContext, String str) {
        this.f29205a = dWContext;
        b(str);
    }

    public View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.b;
    }

    public final void b(String str) {
        zsb zsbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba4c8a54", new Object[]{this, str});
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f29205a.getActivity().getLayoutInflater().inflate(R.layout.dw_gif_frontcover, (ViewGroup) null);
        this.b = frameLayout;
        ImageView imageView = (ImageView) frameLayout.findViewById(R.id.dw_gif_frontcover_cover);
        DWContext dWContext = this.f29205a;
        if (dWContext != null && (zsbVar = dWContext.mDWImageAdapter) != null) {
            ((z75) zsbVar).f(str, imageView);
        }
    }

    @Override // tb.ctb
    public void onLifecycleChanged(DWLifecycleType dWLifecycleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e41106", new Object[]{this, dWLifecycleType});
        } else if (dWLifecycleType != DWLifecycleType.BEFORE) {
            this.b.setVisibility(8);
        } else if (this.f29205a.isNeedFrontCover()) {
            this.b.setVisibility(0);
        }
    }
}
