package tb;

import anetwork.channel.NetworkCallBack;
import anetwork.channel.NetworkEvent;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import tb.j07;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ww0 implements NetworkCallBack.ResponseCodeListener, NetworkCallBack.ProgressListener, NetworkCallBack.FinishListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final p55 f30961a;

    public ww0(p55 p55Var) {
        this.f30961a = p55Var;
    }

    @Override // anetwork.channel.NetworkCallBack.ProgressListener
    public void onDataReceived(NetworkEvent.ProgressEvent progressEvent, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e27ec0e9", new Object[]{this, progressEvent, obj});
        } else if (progressEvent != null) {
            i0n i0nVar = new i0n();
            i0nVar.b = progressEvent.getBytedata();
            progressEvent.getIndex();
            i0nVar.c = progressEvent.getFragmentIndex();
            i0nVar.f21018a = progressEvent.getSize();
            progressEvent.getTotal();
            ((j07.a) this.f30961a).a(i0nVar, obj);
        }
    }

    @Override // anetwork.channel.NetworkCallBack.FinishListener
    public void onFinished(NetworkEvent.FinishEvent finishEvent, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a00910e8", new Object[]{this, finishEvent, obj});
        } else if (finishEvent != null) {
            ((j07.a) this.f30961a).b(finishEvent.getHttpCode(), finishEvent.getDesc());
        }
    }

    @Override // anetwork.channel.NetworkCallBack.ResponseCodeListener
    public boolean onResponseCode(int i, Map<String, List<String>> map, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("45b007d6", new Object[]{this, new Integer(i), map, obj})).booleanValue();
        }
        return ((j07.a) this.f30961a).c(i, map, obj);
    }
}
