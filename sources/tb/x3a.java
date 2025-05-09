package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.container.GalleryCore;
import com.taobao.android.detail.ttdetail.widget.TTViewPager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class x3a implements TTViewPager.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ GalleryCore f31113a;

    public x3a(GalleryCore galleryCore) {
        this.f31113a = galleryCore;
    }

    @Override // com.taobao.android.detail.ttdetail.widget.TTViewPager.d
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a45c414", new Object[]{this, new Integer(i)});
            return;
        }
        yc4.c(i, GalleryCore.K(this.f31113a).m());
        if (!GalleryCore.I(this.f31113a).e().o()) {
            oa4 g = yc4.g(i, GalleryCore.K(this.f31113a).m());
            if (g instanceof sx9) {
                ((sx9) g).K(1, i);
            }
        }
    }

    @Override // com.taobao.android.detail.ttdetail.widget.TTViewPager.d
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2126f39", new Object[]{this, new Integer(i)});
            return;
        }
        yc4.d(i, GalleryCore.K(this.f31113a).m());
        if (!GalleryCore.I(this.f31113a).e().o()) {
            oa4 g = yc4.g(i, GalleryCore.K(this.f31113a).m());
            if (g instanceof sx9) {
                ((sx9) g).K(2, i);
            }
        }
    }
}
