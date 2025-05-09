package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.comments.notify.ImportantEventFrame;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.message.TopAtmosphereMessage;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class iuq extends g12 implements w3c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final r3c d;
    public ArrayList<VideoInfo.AccountTag> e;
    public final t54 f;
    public final boolean g;

    static {
        t2o.a(295698740);
        t2o.a(295698713);
    }

    public iuq(r3c r3cVar, t54 t54Var, boolean z) {
        this.d = r3cVar;
        this.f = t54Var;
        this.g = z;
    }

    public static /* synthetic */ Object ipc$super(iuq iuqVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/comments/notify/controller/SubPersonalPeopleEventController");
    }

    @Override // tb.w3c
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a5d7491", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.w3c
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("484c1aa1", new Object[]{this});
            return;
        }
        ArrayList<VideoInfo.AccountTag> arrayList = this.e;
        if (arrayList == null || arrayList.isEmpty()) {
            this.d.c();
            return;
        }
        VideoInfo.AccountTag accountTag = this.e.get(0);
        g(TopAtmosphereMessage.buildFromAccountTag(accountTag.title, accountTag.tagName, accountTag.tagIcon, accountTag.backgroundUrl));
        if (!this.e.isEmpty()) {
            this.e.remove(0);
        }
    }

    @Override // tb.w3c
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("998f87af", new Object[]{this})).booleanValue();
        }
        ArrayList<VideoInfo.AccountTag> arrayList = this.e;
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // tb.w3c
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        ArrayList<VideoInfo.AccountTag> arrayList = this.e;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    @Override // tb.g12
    public void f(TopAtmosphereMessage.TopAtmosphereMessageType topAtmosphereMessageType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cadea0b9", new Object[]{this, topAtmosphereMessageType});
            return;
        }
        d();
        this.d.c();
    }

    @Override // tb.w3c
    public int getPriority() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("49b31e94", new Object[]{this})).intValue();
        }
        return 10;
    }

    public void h(VideoInfo.AccountTag accountTag) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("241ed5af", new Object[]{this, accountTag});
            return;
        }
        this.e.add(accountTag);
        if (!this.g) {
            this.d.b();
            o3s.b(ImportantEventFrame.TAG, "SubPersonalPeopleEventController updateAccountTag startConsumeMessage");
        }
    }

    @Override // tb.w3c
    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.e = new ArrayList<>();
        this.c = new y2u(new q2u(this.d.getRootView().getContext(), this.d.getRootView(), this.f19671a, this.b, this.f));
    }
}
