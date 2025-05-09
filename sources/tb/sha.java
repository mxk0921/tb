package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.TypeDX;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Random;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class sha {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Context c;
    public final xea d;

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap<TypeDX, b> f28052a = new LinkedHashMap<>();
    public int e = new Random().nextInt();
    public final Handler b = new a(Looper.getMainLooper());

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
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/view/liveGoodsList/liveStateView/impl/adapter/GoodsRenderDispatch$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (message.what == 1000) {
                sha.a(sha.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public TypeDX f28054a;
        public JSONObject b;
        public int c;

        static {
            t2o.a(295699365);
        }
    }

    static {
        t2o.a(295699363);
    }

    public sha(Context context, xea xeaVar) {
        this.c = context;
        this.d = xeaVar;
    }

    public static /* synthetic */ void a(sha shaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a547a85f", new Object[]{shaVar});
        } else {
            shaVar.d();
        }
    }

    public void b(TypeDX typeDX, JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5209f68", new Object[]{this, typeDX, jSONObject, new Integer(i)});
            return;
        }
        b bVar = new b();
        bVar.f28054a = typeDX;
        bVar.b = jSONObject;
        bVar.c = i;
        hha.b("GoodsRenderDispatch", "addRenderTask | oldTask=" + this.f28052a.put(typeDX, bVar) + "    index=" + bVar.c);
        this.b.sendEmptyMessage(1000);
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        hha.b("GoodsRenderDispatch", "destroy | tasks size=" + this.f28052a.size());
        this.b.removeMessages(1000);
        this.f28052a.clear();
    }

    public final void d() {
        b next;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f0e8621", new Object[]{this});
        } else if (!this.f28052a.isEmpty() && (next = this.f28052a.values().iterator().next()) != null && next.f28054a != null && next.b != null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (next.f28054a.b0() != null) {
                next.f28054a.b0().a(next.f28054a, next.b, next.c);
                this.d.T.e(this.c);
                mug.e();
            }
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            hha.b("GoodsRenderDispatch", "executeTask | tasks size=" + this.f28052a.size() + " time=" + currentTimeMillis2);
            this.f28052a.remove(next.f28054a);
            if (kkr.i().o() != null && 4 == next.f28054a.getItemViewType() && this.e % 30 == 0) {
                HashMap<String, String> hashMap = new HashMap<>();
                hashMap.put("time", "" + currentTimeMillis2);
                hashMap.put(q0j.BIZ_CONTEXT_KEY_CARD_TYPE, next.f28054a.b0().c());
                hashMap.put("lv", "" + wda.e());
                hashMap.put("tVersion", "1");
                kkr.i().o().c("GLBindDataTime", hashMap);
            }
            this.e++;
        }
    }
}
