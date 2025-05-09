package tb;

import android.content.Context;
import android.view.View;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstance;
import com.taobao.tao.adapter.biz.weex.module.ShareGiftWeexModule;
import com.taobao.tao.adapter.biz.weex.module.TaopasswordLayerModule;
import com.taobao.weex.TBWXSDKEngine;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.common.WXException;
import com.taobao.weex.common.WXRenderStrategy;
import java.util.Map;
import tb.upd;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class mwr implements upd, upd.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean c = false;

    /* renamed from: a  reason: collision with root package name */
    public WXSDKInstance f24351a;
    public long b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements gbe {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ upd.a f24352a;

        public a(mwr mwrVar, upd.a aVar) {
            this.f24352a = aVar;
        }

        @Override // tb.gbe
        public void onException(WXSDKInstance wXSDKInstance, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88f82eeb", new Object[]{this, wXSDKInstance, str, str2});
                return;
            }
            upd.a aVar = this.f24352a;
            aVar.weexError(str + "，" + str2);
        }

        @Override // tb.gbe
        public void onRefreshSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d57f8320", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
            }
        }

        @Override // tb.gbe
        public void onRenderSuccess(WXSDKInstance wXSDKInstance, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c414a5f9", new Object[]{this, wXSDKInstance, new Integer(i), new Integer(i2)});
            } else {
                this.f24352a.viewReady();
            }
        }

        @Override // tb.gbe
        public void onViewCreated(WXSDKInstance wXSDKInstance, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9eab5f0f", new Object[]{this, wXSDKInstance, view});
            } else {
                this.f24352a.viewCreated(view);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements WXSDKManager.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f24353a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Map c;
        public final /* synthetic */ String d;
        public final /* synthetic */ int e;
        public final /* synthetic */ int f;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                if (mwr.g(mwr.this) != null) {
                    fwr.d("invoke WXSDKInstance#renderByUrl");
                    WXSDKInstance g = mwr.g(mwr.this);
                    b bVar = b.this;
                    g.W0(bVar.f24353a, bVar.b, bVar.c, bVar.d, bVar.e, bVar.f, WXRenderStrategy.APPEND_ONCE);
                }
                AppMonitor.Counter.commit(fwr.SHARE_TAG, "waitWeexMillis", System.currentTimeMillis() - mwr.h(mwr.this));
            }
        }

        public b(String str, String str2, Map map, String str3, int i, int i2) {
            this.f24353a = str;
            this.b = str2;
            this.c = map;
            this.d = str3;
            this.e = i;
            this.f = i2;
        }

        @Override // com.taobao.weex.WXSDKManager.a
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c4e0fc68", new Object[]{this, str, str2});
            }
        }

        @Override // com.taobao.weex.WXSDKManager.a
        public void onInitSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb2dd3fb", new Object[]{this});
                return;
            }
            fwr.a("TBShareWeex", "weex初始化成功");
            tuu.a(new a());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final mwr f24355a = new mwr(null);

        static {
            t2o.a(793772131);
        }

        public static /* synthetic */ mwr a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (mwr) ipChange.ipc$dispatch("69c76789", new Object[0]);
            }
            return f24355a;
        }
    }

    static {
        t2o.a(793772127);
        t2o.a(665845811);
        t2o.a(665845813);
    }

    public /* synthetic */ mwr(a aVar) {
        this();
    }

    public static /* synthetic */ WXSDKInstance g(mwr mwrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXSDKInstance) ipChange.ipc$dispatch("be988566", new Object[]{mwrVar});
        }
        return mwrVar.f24351a;
    }

    public static /* synthetic */ long h(mwr mwrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("635c90db", new Object[]{mwrVar})).longValue();
        }
        return mwrVar.b;
    }

    public static mwr i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mwr) ipChange.ipc$dispatch("c82edee3", new Object[0]);
        }
        return c.a();
    }

    @Override // tb.upd
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fb6d833", new Object[]{this});
            return;
        }
        try {
            WXSDKEngine.registerModule("ShareGiftWeexModule", ShareGiftWeexModule.class);
        } catch (WXException e) {
            e.printStackTrace();
        }
    }

    @Override // tb.upd
    public upd.b c(Context context, upd.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (upd.b) ipChange.ipc$dispatch("e8de5779", new Object[]{this, context, aVar});
        }
        mwr i = i();
        WXSDKInstance wXSDKInstance = new WXSDKInstance(context);
        this.f24351a = wXSDKInstance;
        wXSDKInstance.registerRenderListener(new a(this, aVar));
        return i;
    }

    @Override // tb.upd
    public WeexInstance d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstance) ipChange.ipc$dispatch("236f20fd", new Object[]{this});
        }
        return null;
    }

    @Override // tb.upd.b
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        WXSDKInstance wXSDKInstance = this.f24351a;
        if (wXSDKInstance != null) {
            wXSDKInstance.destroy();
            this.f24351a = null;
        }
    }

    @Override // tb.upd
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adadae57", new Object[]{this});
        } else if (!WXSDKEngine.isInitialized()) {
            TBWXSDKEngine.initSDKEngine(false);
        }
    }

    @Override // tb.upd
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56aec057", new Object[]{this});
        } else if (!c) {
            try {
                WXSDKEngine.registerModule("TaopasswordLayerModule", TaopasswordLayerModule.class);
            } catch (WXException e) {
                e.printStackTrace();
            }
            c = true;
        }
    }

    public mwr() {
    }

    @Override // tb.upd.b
    public void a(String str, String str2, Map<String, Object> map, String str3, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("614303d2", new Object[]{this, str, str2, map, str3, new Integer(i), new Integer(i2)});
        } else if (this.f24351a != null) {
            if (!mip.t()) {
                fwr.a("TBShareWeex", "不等待weex初始化");
                fwr.d("invoke WXSDKInstance#renderByUrl");
                this.f24351a.W0(str, str2, map, str3, i, i2, WXRenderStrategy.APPEND_ONCE);
            } else if (WXSDKEngine.isInitialized()) {
                fwr.a("TBShareWeex", "weex已初始化");
                fwr.d("invoke WXSDKInstance#renderByUrl");
                this.f24351a.W0(str, str2, map, str3, i, i2, WXRenderStrategy.APPEND_ONCE);
                AppMonitor.Counter.commit(fwr.SHARE_TAG, "waitWeexMillis", vu3.b.GEO_NOT_SUPPORT);
            } else {
                fwr.a("TBShareWeex", "等待weex初始化");
                this.b = System.currentTimeMillis();
                this.f24351a.r1(str2);
                this.f24351a.i1(new b(str, str2, map, str3, i, i2));
            }
        }
    }
}
