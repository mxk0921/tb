package tb;

import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class igm implements j3c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729808985);
        t2o.a(729808979);
    }

    @Override // tb.j3c
    public boolean a(ucm ucmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fb15cfb", new Object[]{this, ucmVar})).booleanValue();
        }
        if (ucmVar == null || !"com.alibaba.poplayer.PopLayer.action.POP".equals(ucmVar.f29294a)) {
            return false;
        }
        bqa.a("poplayerevent dispatch ", ucmVar.toString());
        Intent intent = new Intent("com.alibaba.poplayer.PopLayer.action.POP");
        intent.putExtra("event", ucmVar.b);
        if (ucmVar.g() != null) {
            intent.putExtra("param", ucmVar.g().toString());
        }
        LocalBroadcastManager.getInstance(Globals.getApplication()).sendBroadcast(intent);
        return true;
    }
}
