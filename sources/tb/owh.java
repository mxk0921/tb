package tb;

import android.view.MenuItem;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.event.SuccPhenixEvent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class owh implements s8d<SuccPhenixEvent> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MenuItem f25711a;

    public owh(jwh jwhVar, MenuItem menuItem) {
        this.f25711a = menuItem;
    }

    /* renamed from: a */
    public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
        }
        this.f25711a.setIcon(succPhenixEvent.getDrawable());
        return false;
    }
}
