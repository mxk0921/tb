package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.NewDetailActivity;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class cyj implements w11 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String b = NewDetailActivity.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public final iti f17437a;

    static {
        t2o.a(352321870);
    }

    public cyj(String str) {
        this.f17437a = nyj.z().y(str);
    }

    @Override // com.taobao.application.common.IPageListener
    public void onPageChanged(String str, int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcf1be38", new Object[]{this, str, new Integer(i), new Long(j)});
        } else if (b.equals(str)) {
            if (this.f17437a == null) {
                guh.a(nyj.TAG, "Error: onPageChanged , holder is null . ");
                return;
            }
            long g = cvh.g();
            long j2 = this.f17437a.c;
            long j3 = g - j2;
            long a2 = cvh.a(j);
            guh.a(nyj.TAG, "onPageChanged pageName=" + str + ", status=" + i + ", time=" + j + " , pageStart=" + j2 + " , cost=" + j3);
            if (i == 2) {
                guh.a(nyj.TAG, "目标页面可见 cost:" + j3);
                nyj.z().M(this.f17437a.d, "pageVisibleTs", Long.valueOf(a2));
            } else if (i == 3) {
                guh.a(nyj.TAG, "目标页面可交互 cost:" + j3);
                nyj.z().M(this.f17437a.d, "pageInteractiveTs", Long.valueOf(a2));
                nyj.z().E(this.f17437a, a2);
            }
        }
    }
}
