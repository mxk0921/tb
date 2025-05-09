package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.ultron.config.ConfigSource;
import com.taobao.android.live.plugin.atype.flexalocal.good.ultron.config.UltronConfigRequest;
import com.taobao.android.live.plugin.atype.flexalocal.good.ultron.config.UltronServerConfigResponse;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.UltronInstanceViewModel;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class uav extends c7v {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final e7v c = new e7v();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a7v f29266a;

        public a(a7v a7vVar) {
            this.f29266a = a7vVar;
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            nha.o("mtop.tblive.live.item.ultron.render", -1);
            uav.this.f16905a.countDown();
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            nha.o("mtop.tblive.live.item.ultron.render", -1);
            uav.this.f16905a.countDown();
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                return;
            }
            nha.o("mtop.tblive.live.item.ultron.render", 1);
            Map<String, String> a2 = uav.a(uav.this).a(netBaseOutDo);
            if (a2 != null && !a2.isEmpty()) {
                uav.this.getClass();
                if (a2.containsKey(q2s.FILE_NAME2)) {
                    hha.c("UltronServerMoodel", "onSuccess, has result.");
                    a7v a7vVar = this.f29266a;
                    uav.this.getClass();
                    ((UltronInstanceViewModel.c) a7vVar).c(String.valueOf(a2.get(q2s.FILE_NAME2)), ConfigSource.NETWORK);
                    uav.this.f16905a.countDown();
                }
            }
            hha.c("UltronServerMoodel", "onSuccess, result is empty.");
            uav.this.f16905a.countDown();
        }
    }

    static {
        t2o.a(295699188);
    }

    public uav(CountDownLatch countDownLatch, ExecutorService executorService) {
        super(countDownLatch, executorService);
    }

    public static /* synthetic */ e7v a(uav uavVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e7v) ipChange.ipc$dispatch("db12f9b2", new Object[]{uavVar});
        }
        return uavVar.c;
    }

    public static /* synthetic */ Object ipc$super(uav uavVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/ultron/config/UltronServerConfigModel");
    }

    public void b(a7v a7vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1edd66e0", new Object[]{this, a7vVar});
            return;
        }
        UltronConfigRequest ultronConfigRequest = new UltronConfigRequest();
        ArrayList arrayList = new ArrayList();
        ultronConfigRequest.pageCodes = arrayList;
        arrayList.add(q2s.FILE_NAME2);
        if (pfa.D()) {
            ultronConfigRequest.domainCode = "taolivegoodsDT";
        }
        nha.o("mtop.tblive.live.item.ultron.render", 0);
        new c74(new a(a7vVar)).K(ultronConfigRequest, UltronServerConfigResponse.class);
    }
}
