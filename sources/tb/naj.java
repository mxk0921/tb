package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.service.IPlayPublicService;
import com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy;
import java.lang.ref.WeakReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class naj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<IPlayPublicService> f24607a = null;
    public ISmallWindowStrategy b;

    static {
        t2o.a(779093465);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        WeakReference<IPlayPublicService> weakReference = this.f24607a;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.b = null;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("446c97ec", new Object[]{this});
            return;
        }
        WeakReference<IPlayPublicService> weakReference = this.f24607a;
        if (weakReference != null && weakReference.get() != null) {
            this.f24607a.get().H();
        }
    }

    public void c(IPlayPublicService iPlayPublicService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccceac8b", new Object[]{this, iPlayPublicService});
        } else if (iPlayPublicService != null) {
            iPlayPublicService.setSmallWindowClickListener(this.b);
            this.f24607a = new WeakReference<>(iPlayPublicService);
        }
    }

    public void d(ISmallWindowStrategy iSmallWindowStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707f1784", new Object[]{this, iSmallWindowStrategy});
        } else {
            this.b = iSmallWindowStrategy;
        }
    }
}
