package tb;

import anetwork.channel.NetworkCallBack;
import anetwork.channel.NetworkEvent;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import tb.o9o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class xfq implements NetworkCallBack.ResponseCodeListener, NetworkCallBack.FinishListener, NetworkCallBack.ProgressListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f31361a;
    public Map<String, List<String>> b;
    public final zu2 c;
    public final htj d;

    public xfq(zu2 zu2Var, htj htjVar, String str) {
        this.c = zu2Var;
        this.d = htjVar;
    }

    @Override // anetwork.channel.NetworkCallBack.ProgressListener
    public void onDataReceived(NetworkEvent.ProgressEvent progressEvent, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e27ec0e9", new Object[]{this, progressEvent, obj});
        } else if (progressEvent != null && progressEvent.getBytedata() != null && (this.d instanceof ufq)) {
            ((ufq) this.d).g(Arrays.copyOf(progressEvent.getBytedata(), progressEvent.getSize()));
        }
    }

    @Override // anetwork.channel.NetworkCallBack.FinishListener
    public void onFinished(NetworkEvent.FinishEvent finishEvent, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a00910e8", new Object[]{this, finishEvent, obj});
        } else {
            this.d.onResponse(this.c, new o9o.b().l(this.c.request()).g(this.f31361a).i(finishEvent.getDesc()).h(this.b).m(xb.a(finishEvent.getStatisticData())).e());
        }
    }

    @Override // anetwork.channel.NetworkCallBack.ResponseCodeListener
    public boolean onResponseCode(int i, Map<String, List<String>> map, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("45b007d6", new Object[]{this, new Integer(i), map, obj})).booleanValue();
        }
        this.f31361a = i;
        this.b = map;
        htj htjVar = this.d;
        if (htjVar instanceof ufq) {
            ((ufq) htjVar).h(i, map);
        }
        return true;
    }
}
