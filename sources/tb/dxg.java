package tb;

import android.os.CountDownTimer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class dxg extends CountDownTimer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public a f18132a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
        void onFinish();
    }

    static {
        t2o.a(779092152);
    }

    public dxg(long j) {
        super(j, j / 60);
    }

    public static /* synthetic */ Object ipc$super(dxg dxgVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tab2liveroom/liveroom/preload/LiveCountDownTimer");
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0ea9e36", new Object[]{this, aVar});
        } else {
            this.f18132a = aVar;
        }
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("badeed9", new Object[]{this});
            return;
        }
        a aVar = this.f18132a;
        if (aVar != null) {
            aVar.onFinish();
        }
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6c2e881", new Object[]{this, new Long(j)});
        }
    }
}
