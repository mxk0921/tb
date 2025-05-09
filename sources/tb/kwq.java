package tb;

import android.graphics.drawable.BitmapDrawable;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.event.SuccPhenixEvent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class kwq implements aq0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final SuccPhenixEvent f22974a;

    public kwq(SuccPhenixEvent succPhenixEvent) {
        this.f22974a = succPhenixEvent;
    }

    @Override // tb.aq0
    public BitmapDrawable getDrawable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitmapDrawable) ipChange.ipc$dispatch("b9e85550", new Object[]{this});
        }
        return this.f22974a.getDrawable();
    }
}
