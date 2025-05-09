package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.selected.HomeSelectedFragment;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class b4b implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f16173a;
    public final /* synthetic */ TUrlImageView b;
    public final /* synthetic */ HomeSelectedFragment c;

    public b4b(HomeSelectedFragment homeSelectedFragment, boolean z, TUrlImageView tUrlImageView) {
        this.c = homeSelectedFragment;
        this.f16173a = z;
        this.b = tUrlImageView;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (!this.f16173a) {
            this.b.setImageUrl("");
        }
    }
}
