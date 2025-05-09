package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.wireless.link.pop.PopMessageData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class j0a extends acm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f21685a;
        public final /* synthetic */ PopMessageData b;

        public a(j0a j0aVar, Context context, PopMessageData popMessageData) {
            this.f21685a = context;
            this.b = popMessageData;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            mr4.b().i = succPhenixEvent.getDrawable();
            if (mr4.b().i != null && jsg.o(this.f21685a)) {
                irg.a("link_tag", "PopMessageReceiver === onData == 下载图片成功，在桌面，开始绘制弹窗pop");
                xfm.e(this.f21685a, this.b);
                cno.b(this.f21685a).d("msg_last_show_time", Long.valueOf(jsg.f()));
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final j0a f21686a = new j0a(null);

        static {
            t2o.a(1030750325);
        }

        public static /* synthetic */ j0a a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (j0a) ipChange.ipc$dispatch("eab5c72a", new Object[0]);
            }
            return f21686a;
        }
    }

    static {
        t2o.a(1030750323);
    }

    public /* synthetic */ j0a(a aVar) {
        this();
    }

    public static j0a c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j0a) ipChange.ipc$dispatch("6a63130f", new Object[0]);
        }
        return b.a();
    }

    public static /* synthetic */ Object ipc$super(j0a j0aVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/wireless/link/pop/client/FullPopClient");
    }

    @Override // tb.acm
    public void b(Context context, PopMessageData popMessageData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa8cd800", new Object[]{this, context, popMessageData});
        } else {
            s0m.B().N0(context).T(popMessageData.picUrl).succListener(new a(this, context, popMessageData)).addLoaderExtra(nd2.BUNDLE_BIZ_CODE, "1111").fetch();
        }
    }

    public j0a() {
    }
}
