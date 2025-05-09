package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemlistV2Business2;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemlistV2Response;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.ItemCategory;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import java.util.Random;
import tb.xea;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class qha {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final xea f26754a;
    public ItemlistV2Business2 d;
    public final Random e = new Random();
    public final xea.c b = new xea.c();
    public final jyw c = new jyw(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.qha$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class C1040a implements b0d {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C1040a() {
            }

            @Override // tb.b0d
            public void onError(int i, NetResponse netResponse, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                } else {
                    o3s.b("GoodsPreRequestManager", "onError");
                }
            }

            @Override // tb.b0d
            public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                    return;
                }
                o3s.b("GoodsPreRequestManager", "onSuccess");
                qha.b(qha.this).f31334a = ((ItemlistV2Response) netBaseOutDo).getData();
                qha.b(qha.this).c = qha.c(qha.this).M();
                if (qha.a(qha.this) != null) {
                    qha.a(qha.this).S = qha.b(qha.this);
                }
            }

            @Override // tb.b0d
            public void onSystemError(int i, NetResponse netResponse, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                } else {
                    o3s.b("GoodsPreRequestManager", "onSystemError");
                }
            }
        }

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (qha.a(qha.this) == null || !qha.a(qha.this).m.h) {
                qha.b(qha.this).b = System.currentTimeMillis();
                qha.d(qha.this, new ItemlistV2Business2(new C1040a()));
                qha.c(qha.this).P(null, null, ItemCategory.constructDefaultCategory(), qha.a(qha.this), "prefetch", true, 5L);
            } else {
                qha.this.e("show");
            }
        }
    }

    static {
        t2o.a(295698926);
    }

    public qha(xea xeaVar) {
        this.f26754a = xeaVar;
    }

    public static /* synthetic */ xea a(qha qhaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xea) ipChange.ipc$dispatch("7ea411a3", new Object[]{qhaVar});
        }
        return qhaVar.f26754a;
    }

    public static /* synthetic */ xea.c b(qha qhaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xea.c) ipChange.ipc$dispatch("698c64e4", new Object[]{qhaVar});
        }
        return qhaVar.b;
    }

    public static /* synthetic */ ItemlistV2Business2 c(qha qhaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ItemlistV2Business2) ipChange.ipc$dispatch("aa7b5f0a", new Object[]{qhaVar});
        }
        return qhaVar.d;
    }

    public static /* synthetic */ ItemlistV2Business2 d(qha qhaVar, ItemlistV2Business2 itemlistV2Business2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ItemlistV2Business2) ipChange.ipc$dispatch("92888467", new Object[]{qhaVar, itemlistV2Business2});
        }
        qhaVar.d = itemlistV2Business2;
        return itemlistV2Business2;
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69271386", new Object[]{this, str});
            return;
        }
        o3s.b("GoodsPreRequestManager", "cancelRequest | scene=" + str);
        this.c.removeCallbacksAndMessages(null);
        ItemlistV2Business2 itemlistV2Business2 = this.d;
        if (itemlistV2Business2 != null) {
            itemlistV2Business2.destroy();
        }
    }

    public final long f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e8aa7cc5", new Object[]{this})).longValue();
        }
        return (yga.e0() * 1000) + this.e.nextInt(2000);
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("886802d6", new Object[]{this});
            return;
        }
        o3s.b("GoodsPreRequestManager", "postRequest");
        this.c.postDelayed(new a(), f());
    }
}
