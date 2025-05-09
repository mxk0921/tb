package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.zoloz.android.phone.zdoc.R;
import com.zoloz.android.phone.zdoc.ui.BaseMaskView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class w5i extends yz1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final BaseMaskView b;

    static {
        t2o.a(245366962);
    }

    public w5i(View view) {
        super(view);
        this.b = (BaseMaskView) view;
    }

    public static /* synthetic */ Object ipc$super(w5i w5iVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/zoloz/android/phone/zdoc/render/MaskViewRender");
    }

    @Override // tb.yz1
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5e0b82", new Object[]{this});
        }
    }

    @Override // tb.yz1
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12489174", new Object[]{this});
        } else if (this.f32425a.getResources() != null) {
            BaseMaskView baseMaskView = this.b;
            baseMaskView.setLineColor(baseMaskView.getResources().getColor(R.color.zdoc_line_color));
            BaseMaskView baseMaskView2 = this.b;
            baseMaskView2.setMaskColor(baseMaskView2.getResources().getColor(R.color.zdoc_frame_bg_color));
        }
    }

    @Override // tb.yz1
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77fcb085", new Object[]{this});
        }
    }
}
