package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class g8j implements bpc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.bpc
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40800967", new Object[]{this, view});
        } else if (view != null) {
            view.setTag(dgw.APM_VIEW_TOKEN, dgw.APM_VIEW_VALID);
        }
    }

    @Override // tb.bpc
    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("369c32f8", new Object[]{this, view});
        } else if (view != null) {
            view.setTag(dgw.APM_VIEW_TOKEN, dgw.APM_VIEW_INVALID);
        }
    }
}
