package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.comments.goodrecommend.GoodRecommendDO;
import com.taobao.android.live.plugin.atype.flexalocal.comments.goodrecommend.GoodRecommendResponse;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.ImportantEventItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ffa implements b0d, s3c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final t54 f19250a;
    public long b;
    public long c;
    public long d;
    public ImportantEventItem e;
    public dfa g;
    public String l;
    public final LinkedBlockingQueue<ImportantEventItem> h = new LinkedBlockingQueue<>();
    public final AtomicBoolean i = new AtomicBoolean();
    public final AtomicBoolean j = new AtomicBoolean(false);
    public final AtomicInteger k = new AtomicInteger();
    public Handler f = new a(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/comments/goodrecommend/GoodRecommendManager$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            int i = message.what;
            if (i == 1) {
                ffa.a(ffa.this);
            } else if (i == 2) {
                ffa.b(ffa.this, (ImportantEventItem) message.obj);
            }
        }
    }

    static {
        t2o.a(295698706);
        t2o.a(806355932);
        t2o.a(806355016);
    }

    public ffa(t54 t54Var) {
        this.f19250a = t54Var;
    }

    public static /* synthetic */ void a(ffa ffaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cb68d7d", new Object[]{ffaVar});
        } else {
            ffaVar.e();
        }
    }

    public static /* synthetic */ void b(ffa ffaVar, ImportantEventItem importantEventItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a37954b", new Object[]{ffaVar, importantEventItem});
        } else {
            ffaVar.g(importantEventItem);
        }
    }

    @Override // tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return "GoodRecommendManager";
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b68fdc3", new Object[]{this});
        } else {
            this.i.set(true);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        sjr.g().b(this);
        Handler handler = this.f;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f = null;
        }
        this.g = null;
        this.h.clear();
        this.i.set(false);
        this.e = null;
        this.j.set(false);
        this.k.set(0);
        this.l = null;
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c69f4f4", new Object[]{this});
            return;
        }
        dfa dfaVar = this.g;
        if (dfaVar != null) {
            dfaVar.K(this.l);
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c802be6c", new Object[]{this});
            return;
        }
        this.i.set(false);
        ImportantEventItem importantEventItem = this.e;
        if (importantEventItem != null) {
            g(importantEventItem);
        }
    }

    public final void g(ImportantEventItem importantEventItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20dfd2e0", new Object[]{this, importantEventItem});
        } else if (importantEventItem != null) {
            if (this.i.get()) {
                this.e = importantEventItem;
            } else if (this.k.incrementAndGet() <= this.d || this.j.get()) {
                this.e = null;
                if (importantEventItem.dataMessage != null && !TextUtils.isEmpty(this.l)) {
                    importantEventItem.dataMessage.put("liveId", (Object) this.l);
                }
                sjr.g().e("com.taobao.taolive.room.important_event_goods_recommend", importantEventItem);
                j(this.c);
            } else {
                d();
            }
        }
    }

    public void h(TBLiveDataModel tBLiveDataModel) {
        VideoInfo videoInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13f45ea2", new Object[]{this, tBLiveDataModel});
        } else if (tBLiveDataModel != null && (videoInfo = tBLiveDataModel.mVideoInfo) != null && !TextUtils.isEmpty(videoInfo.liveId) && !nh4.S(tBLiveDataModel.mVideoInfo)) {
            this.l = tBLiveDataModel.mVideoInfo.liveId;
            this.b = nh4.z1();
            this.c = nh4.A1();
            this.d = nh4.y1();
            sjr.g().a(this);
            this.g = new dfa(this);
            i(nh4.x1());
        }
    }

    public final void i(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48a5853e", new Object[]{this, new Long(j)});
            return;
        }
        Handler handler = this.f;
        if (handler != null) {
            handler.sendEmptyMessageDelayed(1, j * 1000);
        }
    }

    public final void j(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c94f1ca", new Object[]{this, new Long(j)});
        } else if (!this.h.isEmpty() && this.f != null) {
            Message obtain = Message.obtain();
            obtain.obj = this.h.poll();
            obtain.what = 2;
            this.f.sendMessageDelayed(obtain, j * 1000);
        }
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{"com.taobao.taolive.room.goods_list_showing", "com.taobao.taolive.room.important_event_goods_recommend_click"};
    }

    @Override // tb.s3c
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        t54 t54Var = this.f19250a;
        if (t54Var == null) {
            return null;
        }
        return t54Var.C();
    }

    @Override // tb.b0d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            i(this.b);
        }
    }

    @Override // tb.s3c
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if (!"com.taobao.taolive.room.goods_list_showing".equals(str) || !(obj instanceof Boolean)) {
            if ("com.taobao.taolive.room.important_event_goods_recommend_click".equals(str)) {
                this.j.set(true);
            }
        } else if (((Boolean) obj).booleanValue()) {
            c();
        } else {
            f();
        }
    }

    @Override // tb.b0d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            return;
        }
        if ((netBaseOutDo instanceof GoodRecommendResponse) && netBaseOutDo.getData() != null) {
            GoodRecommendDO goodRecommendDO = (GoodRecommendDO) netBaseOutDo.getData();
            long j = goodRecommendDO.pullInterval;
            if (j <= 0) {
                j = this.b;
            }
            this.b = j;
            long j2 = goodRecommendDO.showItemDelay;
            if (j2 <= 0) {
                j2 = this.c;
            }
            this.c = j2;
            long j3 = goodRecommendDO.showGroupCount;
            if (j3 <= 0) {
                j3 = this.d;
            }
            this.d = j3;
            List<ImportantEventItem> list = goodRecommendDO.items;
            if (list != null && !list.isEmpty()) {
                this.h.addAll(list);
                j(0L);
            }
        }
        i(this.b);
    }

    @Override // tb.b0d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            i(this.b);
        }
    }
}
