package tb;

import android.os.Handler;
import android.os.Message;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemlistV2Business2;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemlistV2Request2;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import java.util.ArrayDeque;
import tb.z4o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class gfa implements ccc, b0d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f19945a = new jyw(this);
    public final ArrayDeque<b> b = new ArrayDeque<>();
    public ItemlistV2Business2 c;
    public final a d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface a {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public ItemlistV2Request2 f19946a;
        public long b;
        public long c;

        static {
            t2o.a(295699333);
        }
    }

    static {
        t2o.a(295699331);
        t2o.a(806356161);
        t2o.a(806355932);
    }

    public gfa(a aVar) {
        this.d = aVar;
        if (aVar == null) {
            throw new RuntimeException("IGoodDataObserver can not be null.");
        }
    }

    @Override // tb.ccc
    public void handleMessage(Message message) {
        b pop;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
        } else if (1 == message.what && !this.b.isEmpty() && (pop = this.b.pop()) != null && pop.f19946a != null) {
            hha.b("GoodRequestController", "handleMessage. pop request=" + pop);
            pop.b = System.currentTimeMillis();
            ItemlistV2Business2 itemlistV2Business2 = new ItemlistV2Business2(this, pop);
            this.c = itemlistV2Business2;
            itemlistV2Business2.N(pop.f19946a);
        }
    }

    @Override // tb.b0d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        ((z4o.a) this.d).a(netResponse, ((ItemlistV2Business2) obj).l);
        this.f19945a.sendEmptyMessage(1);
    }

    @Override // tb.b0d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            return;
        }
        ItemlistV2Business2 itemlistV2Business2 = this.c;
        if (itemlistV2Business2 != null && (obj instanceof ItemlistV2Business2)) {
            ItemlistV2Business2 itemlistV2Business22 = (ItemlistV2Business2) obj;
            itemlistV2Business22.l.c = itemlistV2Business2.M();
            ((z4o.a) this.d).c(netResponse, netBaseOutDo, itemlistV2Business22.l);
            this.f19945a.sendEmptyMessage(1);
        }
    }

    @Override // tb.b0d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        ((z4o.a) this.d).d(netResponse, ((ItemlistV2Business2) obj).l);
        this.f19945a.sendEmptyMessage(1);
    }

    public void a(ItemlistV2Request2 itemlistV2Request2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5704f002", new Object[]{this, itemlistV2Request2, new Boolean(z)});
            return;
        }
        b bVar = new b();
        bVar.f19946a = itemlistV2Request2;
        System.currentTimeMillis();
        this.b.push(bVar);
        if (this.b.size() > 3) {
            b removeLast = this.b.removeLast();
            hha.b("GoodRequestController", "pushRequest. remove=" + removeLast);
            ((z4o.a) this.d).b(removeLast);
        }
        hha.b("GoodRequestController", "pushRequest. request=" + bVar);
        this.f19945a.sendEmptyMessage(1);
    }
}
