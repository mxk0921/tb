package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliLogInterface;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class kgt implements jfc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final AliLogInterface f22656a = jq0.c();

    static {
        t2o.a(491782157);
        t2o.a(486539311);
    }

    @Override // tb.jfc
    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23a68dc", new Object[]{this, str, str2, str3});
            return;
        }
        AliLogInterface aliLogInterface = this.f22656a;
        if (aliLogInterface != null) {
            aliLogInterface.d(str, str2, str3);
        }
    }

    @Override // tb.jfc
    public void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d572034a", new Object[]{this, str, str2, str3});
            return;
        }
        AliLogInterface aliLogInterface = this.f22656a;
        if (aliLogInterface != null) {
            aliLogInterface.a(str, str2, str3);
        }
    }

    @Override // tb.jfc
    public void c(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4bc3689", new Object[]{this, str, str2, str3});
            return;
        }
        AliLogInterface aliLogInterface = this.f22656a;
        if (aliLogInterface != null) {
            aliLogInterface.e(str, str2, str3);
        }
    }

    @Override // tb.jfc
    public void d(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1849364e", new Object[]{this, str, str2, str3});
            return;
        }
        AliLogInterface aliLogInterface = this.f22656a;
        if (aliLogInterface != null) {
            aliLogInterface.b(str, str2, str3);
        }
    }

    @Override // tb.jfc
    public void e(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1849c1b", new Object[]{this, str, str2, str3});
            return;
        }
        AliLogInterface aliLogInterface = this.f22656a;
        if (aliLogInterface != null) {
            aliLogInterface.c(str, str2, str3);
        }
    }

    @Override // tb.jfc
    public void w(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("818e83a3", new Object[]{this, str, str2, th});
            return;
        }
        AliLogInterface aliLogInterface = this.f22656a;
        if (aliLogInterface != null) {
            aliLogInterface.logw(str, str2, th);
        }
    }

    @Override // tb.jfc
    public void e(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("152aaa75", new Object[]{this, str, str2, th});
            return;
        }
        AliLogInterface aliLogInterface = this.f22656a;
        if (aliLogInterface != null) {
            aliLogInterface.loge(str, str2, th);
        }
    }
}
