package tb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.business.official.heartbeat.OfficialHeartbeatResponse;
import com.taobao.taolive.sdk.business.official.subscribe.OfficialSubscribeResponse;
import com.taobao.taolive.sdk.model.official.OfficialHeartbeatDO;
import tb.hgb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class hnk extends HandlerThread implements b0d, hgb.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int g = 1;
    private static volatile hnk h;

    /* renamed from: a  reason: collision with root package name */
    private long f20765a = 15000;
    private final a b = new a(getLooper());
    private String c;
    private String d;
    private String e;
    private String f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a extends Handler implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(806356032);
            t2o.a(806355932);
        }

        public a(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/business/official/OfficialLiveSubscriber$OfficialLiveHearbeatHandler");
        }

        public final void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f46425a2", new Object[]{this});
            } else if (!hnk.c(hnk.this)) {
                new umk(this).K(hnk.d(hnk.this), hnk.e(hnk.this), hnk.f(hnk.this), hnk.g(hnk.this));
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            super.handleMessage(message);
            if (message.what == 1) {
                a();
                sendEmptyMessageDelayed(1, hnk.a(hnk.this));
            }
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            }
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            OfficialHeartbeatDO data;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            } else if ((netBaseOutDo instanceof OfficialHeartbeatResponse) && (data = ((OfficialHeartbeatResponse) netBaseOutDo).getData()) != null && data.getHeartBeatConfig() != null) {
                hnk.b(hnk.this, data.getHeartBeatConfig().getInterval());
            }
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            }
        }
    }

    static {
        t2o.a(806356031);
        t2o.a(806355932);
        t2o.a(806356088);
    }

    private hnk() {
        super("com.taobao.taolive.official.subscriber");
        start();
    }

    public static /* synthetic */ long a(hnk hnkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("67310881", new Object[]{hnkVar})).longValue();
        }
        return hnkVar.f20765a;
    }

    public static /* synthetic */ long b(hnk hnkVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4547e64d", new Object[]{hnkVar, new Long(j)})).longValue();
        }
        hnkVar.f20765a = j;
        return j;
    }

    public static /* synthetic */ boolean c(hnk hnkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e97bbd70", new Object[]{hnkVar})).booleanValue();
        }
        return hnkVar.i();
    }

    public static /* synthetic */ String d(hnk hnkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("afa301b5", new Object[]{hnkVar});
        }
        return hnkVar.c;
    }

    public static /* synthetic */ String e(hnk hnkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("98aac6b6", new Object[]{hnkVar});
        }
        return hnkVar.d;
    }

    public static /* synthetic */ String f(hnk hnkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81b28bb7", new Object[]{hnkVar});
        }
        return hnkVar.e;
    }

    public static /* synthetic */ String g(hnk hnkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6aba50b8", new Object[]{hnkVar});
        }
        return hnkVar.f;
    }

    public static hnk h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hnk) ipChange.ipc$dispatch("ea80eb66", new Object[0]);
        }
        if (h == null) {
            synchronized (hnk.class) {
                try {
                    if (h == null) {
                        h = new hnk();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return h;
    }

    private boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73123f78", new Object[]{this})).booleanValue();
        }
        if (TextUtils.isEmpty(this.c) || TextUtils.isEmpty(this.d) || TextUtils.isEmpty(this.e) || TextUtils.isEmpty(this.f)) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ Object ipc$super(hnk hnkVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/business/official/OfficialLiveSubscriber");
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a23169a7", new Object[]{this});
        } else {
            v2s.o().f().a(this);
        }
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e503241", new Object[]{this});
            return;
        }
        a aVar = this.b;
        if (aVar != null) {
            aVar.removeCallbacksAndMessages(null);
            this.b.sendEmptyMessage(1);
        }
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e7d2a1", new Object[]{this});
            return;
        }
        a aVar = this.b;
        if (aVar != null) {
            aVar.removeCallbacksAndMessages(null);
        }
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6e7522e", new Object[]{this});
        } else {
            v2s.o().f().b(this);
        }
    }

    public void m(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7b9b3f9", new Object[]{this, str, str2, str3, str4});
            return;
        }
        j();
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        if (!i()) {
            new xnk(this).K(str, str2, str3, str4);
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c35ded8", new Object[]{this});
            return;
        }
        n();
        l();
        if (!i()) {
            new ynk(this).K(this.c, this.d, this.e, this.f);
        }
    }

    @Override // tb.hgb.a
    public void onAppInBackgroud() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c87472c", new Object[]{this});
        } else {
            l();
        }
    }

    @Override // tb.hgb.a
    public void onAppInForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("111bbcb1", new Object[]{this});
        } else {
            k();
        }
    }

    @Override // tb.b0d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
        }
    }

    @Override // tb.b0d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
        } else if (netBaseOutDo instanceof OfficialSubscribeResponse) {
            OfficialSubscribeResponse officialSubscribeResponse = (OfficialSubscribeResponse) netBaseOutDo;
            if (!(officialSubscribeResponse.getData() == null || officialSubscribeResponse.getData().getHeartBeatConfig() == null)) {
                this.f20765a = officialSubscribeResponse.getData().getHeartBeatConfig().getInterval();
            }
            k();
        }
    }

    @Override // tb.b0d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
        }
    }
}
