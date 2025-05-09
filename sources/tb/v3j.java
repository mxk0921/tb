package tb;

import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class v3j implements wvc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(745537547);
        t2o.a(745537542);
    }

    @Override // tb.wvc
    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eecd0a24", new Object[]{this, str, obj});
            return;
        }
        ckf.h(str, "action");
        Intent intent = new Intent();
        intent.setAction(str);
        LocalBroadcastManager.getInstance(Globals.getApplication()).sendBroadcast(intent);
    }
}
