package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.toolchain.ErrorViewActivity;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ii8 implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public ii8(ErrorViewActivity errorViewActivity) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        }
    }
}
