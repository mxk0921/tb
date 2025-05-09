package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.TBLiveDataModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class cdt implements hzd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093331);
        t2o.a(806355673);
    }

    @Override // tb.hzd
    public void a(int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea963b7e", new Object[]{this, new Integer(i), view});
        }
    }

    @Override // tb.hzd
    public void b(int i, TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed37d40b", new Object[]{this, new Integer(i), tBLiveDataModel});
        }
    }

    @Override // tb.hzd
    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252043e", new Object[]{this, new Integer(i)});
        }
    }
}
