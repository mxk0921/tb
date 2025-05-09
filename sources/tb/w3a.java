package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.container.GalleryCore;
import com.taobao.android.detail.ttdetail.feature.DevFeature;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class w3a implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ GalleryCore f30432a;

    public w3a(GalleryCore galleryCore) {
        this.f30432a = galleryCore;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (GalleryCore.p(this.f30432a).getCurrentItem() != 3 && !bw6.a(GalleryCore.g(this.f30432a))) {
        } else {
            if (GalleryCore.k(this.f30432a) <= 0 || GalleryCore.k(this.f30432a) >= 7) {
                GalleryCore.l(this.f30432a, 1);
                GalleryCore.o(this.f30432a, System.currentTimeMillis());
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - GalleryCore.n(this.f30432a) > 468) {
                GalleryCore.l(this.f30432a, 0);
                return;
            }
            GalleryCore.o(this.f30432a, currentTimeMillis);
            if (GalleryCore.m(this.f30432a) >= 7) {
                DevFeature.b(GalleryCore.g(this.f30432a));
                tgh.b("GalleryCore", "user showDevFeature Manually");
            }
        }
    }
}
