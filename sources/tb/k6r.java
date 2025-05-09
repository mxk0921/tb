package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.IApmEventListener;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class k6r extends yt implements IApmEventListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String b = "TBAppLifecycleObserver";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6r(bkc bkcVar) {
        super(bkcVar);
        ckf.g(bkcVar, "eventListener");
    }

    public static /* synthetic */ Object ipc$super(k6r k6rVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/inject/TBAppLifecycleObserver");
    }

    @Override // tb.yt
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else {
            c21.c(this);
        }
    }

    @Override // tb.yt
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
        } else {
            c21.k(this);
        }
    }

    @Override // com.taobao.application.common.IApmEventListener
    public void onEvent(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
        } else if (i == 1) {
            iih.INSTANCE.b(this.b, "手淘切到后台，通知监听者");
            a().onBackground();
        } else if (i == 2) {
            iih.INSTANCE.b(this.b, "手淘切到前台，通知监听者");
            a().onForeground();
        }
    }
}
