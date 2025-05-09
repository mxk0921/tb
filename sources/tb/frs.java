package tb;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.TBMainHost;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class frs implements hvd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final tam f19490a;

    public frs(tam tamVar) {
        this.f19490a = tamVar;
    }

    @Override // tb.hvd
    public void onTabChanged(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91f35fc8", new Object[]{this, new Integer(i), str});
            return;
        }
        Context context = TBMainHost.b().getContext();
        if (context instanceof Activity) {
            TLog.loge("TBAutoSize.Tab", "onTabChanged: i=" + i + " s=" + str);
            this.f19490a.e((Activity) context);
        }
    }
}
