package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.channel.ShareToChannelHandler;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ikp {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SHARE_HANDLER_CLASS_NAME = "com.taobao.tao.channel.ShareToChannelHandler";

    /* renamed from: a  reason: collision with root package name */
    public b f21369a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface b {
        void shareToChannel(JSONObject jSONObject);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final ikp f21370a = new ikp();

        static {
            t2o.a(667942923);
        }

        public static /* synthetic */ ikp a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ikp) ipChange.ipc$dispatch("7ee7654a", new Object[0]);
            }
            return f21370a;
        }
    }

    static {
        t2o.a(667942920);
    }

    public static ikp a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ikp) ipChange.ipc$dispatch("80923030", new Object[0]);
        }
        return c.a();
    }

    public void b(JSONObject jSONObject) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        if (this.f21369a == null) {
            IpChange ipChange = ShareToChannelHandler.$ipChange;
            this.f21369a = (b) ShareToChannelHandler.class.newInstance();
        }
        b bVar = this.f21369a;
        if (bVar != null) {
            bVar.shareToChannel(jSONObject);
        }
    }

    public ikp() {
    }
}
