package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.container.GalleryCore;
import com.taobao.ptr.PtrBase;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class v3a implements PtrBase.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ GalleryCore f29766a;

    public v3a(GalleryCore galleryCore) {
        this.f29766a = galleryCore;
    }

    @Override // com.taobao.ptr.PtrBase.e
    public void a(PtrBase ptrBase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc9b6974", new Object[]{this, ptrBase});
            return;
        }
        ptrBase.refreshComplete("加载更多内容");
        GalleryCore.j(this.f29766a);
    }

    @Override // com.taobao.ptr.PtrBase.e
    public void b(PtrBase ptrBase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da00fd4d", new Object[]{this, ptrBase});
        }
    }
}
