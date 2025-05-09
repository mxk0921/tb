package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.utils.VideoStatus;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class l2h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public VideoStatus f23067a;
    public String b;

    static {
        t2o.a(806356078);
    }

    public l2h(txb txbVar) {
    }

    public VideoStatus a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoStatus) ipChange.ipc$dispatch("d294741", new Object[]{this});
        }
        return this.f23067a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7ecc658c", new Object[]{this});
        }
        return this.b;
    }

    public void c(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85373db3", new Object[]{this, ux9Var});
        }
    }

    public void d(VideoStatus videoStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7035b1b", new Object[]{this, videoStatus});
        } else {
            this.f23067a = videoStatus;
        }
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90c80962", new Object[]{this, str});
        }
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e59da66a", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }
}
