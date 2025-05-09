package tb;

import com.alibaba.triver.triver_shop.extension.accs.ShopAccsUpStreamData;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Result;
import tb.npp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class tnp {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final tnp INSTANCE = new tnp();

    /* renamed from: a  reason: collision with root package name */
    public static final CopyOnWriteArrayList<b> f28830a = new CopyOnWriteArrayList<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a extends AccsAbstractDataListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/extension/accs/ShopAccsClient$1");
        }

        @Override // com.taobao.accs.base.AccsDataListener
        public void onBind(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3fa398db", new Object[]{this, str, new Integer(i), extraInfo});
            } else {
                npp.Companion.a("ShopAccsClient onBind.");
            }
        }

        @Override // com.taobao.accs.base.AccsDataListener
        public void onData(String str, String str2, String str3, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
            Object obj;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("694255fc", new Object[]{this, str, str2, str3, bArr, extraInfo});
            } else if (ckf.b("shop_taobao_accs", str) && bArr != null) {
                npp.Companion.a(ckf.p("ShopAccsClient onData : ", new String(bArr, uj3.UTF_8)));
                Iterator it = tnp.a().iterator();
                while (it.hasNext()) {
                    try {
                        ((b) it.next()).a(new String(bArr, uj3.UTF_8));
                        obj = Result.m1108constructorimpl(xhv.INSTANCE);
                    } catch (Throwable th) {
                        obj = Result.m1108constructorimpl(kotlin.b.a(th));
                    }
                    Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
                    if (th2 != null) {
                        npp.Companion.c("catching block has error", th2);
                    }
                }
            }
        }

        @Override // com.taobao.accs.base.AccsDataListener
        public void onResponse(String str, String str2, int i, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d5239c42", new Object[]{this, str, str2, new Integer(i), bArr, extraInfo});
            }
        }

        @Override // com.taobao.accs.base.AccsDataListener
        public void onSendData(String str, String str2, int i, TaoBaseService.ExtraInfo extraInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f29e89fa", new Object[]{this, str, str2, new Integer(i), extraInfo});
                return;
            }
            npp.a aVar = npp.Companion;
            aVar.a("ShopAccsClient onSendData. dataId:" + ((Object) str2) + ", errorCode:" + i);
        }

        @Override // com.taobao.accs.base.AccsDataListener
        public void onUnbind(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7b4e074", new Object[]{this, str, new Integer(i), extraInfo});
            } else {
                npp.Companion.a("ShopAccsClient onUnbind.");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface b {
        void a(String str);
    }

    public static final /* synthetic */ CopyOnWriteArrayList a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CopyOnWriteArrayList) ipChange.ipc$dispatch("be98cf32", new Object[0]);
        }
        return f28830a;
    }

    public final void b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee8132ba", new Object[]{this, bVar});
            return;
        }
        ckf.g(bVar, DataReceiveMonitor.CB_LISTENER);
        f28830a.add(bVar);
    }

    public final void c(ShopAccsUpStreamData shopAccsUpStreamData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14b20b76", new Object[]{this, shopAccsUpStreamData});
            return;
        }
        ckf.g(shopAccsUpStreamData, "upStreamData");
        d(shopAccsUpStreamData.a(), shopAccsUpStreamData.toString());
    }

    public final void d(String str, String str2) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f0d376d", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, "userId");
        ckf.g(str2, "data");
        npp.Companion.a(ckf.p("ShopAccsClient sendData : ", str2));
        try {
            ACCSClient accsClient = ACCSClient.getAccsClient();
            byte[] bytes = str2.getBytes(uj3.UTF_8);
            ckf.f(bytes, "(this as java.lang.String).getBytes(charset)");
            accsClient.sendData(new ACCSManager.AccsRequest(str, "shop_taobao_accs", bytes, null));
            obj = Result.m1108constructorimpl(xhv.INSTANCE);
        } catch (Throwable th) {
            obj = Result.m1108constructorimpl(kotlin.b.a(th));
        }
        Throwable th2 = Result.m1111exceptionOrNullimpl(obj);
        if (th2 != null) {
            npp.Companion.c("catching block has error", th2);
        }
    }

    public final void e(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9908e321", new Object[]{this, bVar});
            return;
        }
        ckf.g(bVar, DataReceiveMonitor.CB_LISTENER);
        f28830a.remove(bVar);
    }

    static {
        t2o.a(766509307);
        ACCSClient.getAccsClient().registerDataListener("shop_taobao_accs", new a());
    }
}
