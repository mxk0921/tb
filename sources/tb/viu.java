package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.signal.TrtcSignalChannel;
import com.taobao.trtc.utils.TrtcLog;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class viu implements pmu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f30037a;
        public final /* synthetic */ String b;
        public final /* synthetic */ byte[] c;

        public a(Map map, String str, byte[] bArr) {
            this.f30037a = map;
            this.b = str;
            this.c = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Map map = this.f30037a;
            HashMap hashMap = map;
            if (map == null) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("dataId", this.b);
                hashMap = hashMap2;
            }
            TrtcLog.i("TrtcAccsSignalRecvImpl", "<<<<<< onData begin, dataId: " + this.b + ", arg: " + hashMap);
            tmu.d("onData begin| dataId: " + this.b + " arg: " + hashMap);
            TrtcSignalChannel.c(bnu.a(this.c), JSON.toJSONString(hashMap));
            TrtcLog.j("TrtcAccsSignalRecvImpl", "onData end");
        }
    }

    static {
        t2o.a(395313342);
        t2o.a(395313635);
    }

    public void a(String str, byte[] bArr, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3b96324", new Object[]{this, str, bArr, map});
        } else {
            nf.l(new a(map, str, bArr));
        }
    }

    public void b(String str, int i, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("327e61f3", new Object[]{this, str, new Integer(i), map});
        }
    }

    public void c(String str, int i, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f3ea844", new Object[]{this, str, new Integer(i), map});
        }
    }
}
