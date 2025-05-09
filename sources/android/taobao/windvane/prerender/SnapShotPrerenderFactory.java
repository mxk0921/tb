package android.taobao.windvane.prerender;

import android.taobao.windvane.extra.core.WVCore;
import android.taobao.windvane.extra.storage.FirstChunkStorage;
import android.taobao.windvane.extra.storage.ResponseContext;
import android.taobao.windvane.thread.WVThreadPool;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import kotlin.Metadata;
import tb.ckf;
import tb.g1a;
import tb.lcn;
import tb.t2o;
import tb.wum;
import tb.xhv;
import tb.xum;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class SnapShotPrerenderFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f1819a;
        public final /* synthetic */ g1a b;

        public a(String str, g1a g1aVar) {
            this.f1819a = str;
            this.b = g1aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ResponseContext read = new FirstChunkStorage(this.f1819a).read();
            if (read == null || !read.isEnable() || read.isExpired()) {
                this.b.invoke(null);
            } else {
                this.b.invoke(read.getHtml());
            }
        }
    }

    static {
        t2o.a(989856372);
        t2o.a(989856368);
    }

    public final void b(String str, g1a<? super String, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45ae9789", new Object[]{this, str, g1aVar});
        } else {
            WVThreadPool.getInstance().execute(new a(str, g1aVar));
        }
    }

    public void a(xum xumVar, g1a<? super wum, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64360b07", new Object[]{this, xumVar, g1aVar});
            return;
        }
        ckf.g(xumVar, "params");
        ckf.g(g1aVar, "callback");
        if (TextUtils.isEmpty(xumVar.e()) || xumVar.b() != 2) {
            g1aVar.invoke(null);
            return;
        }
        WVCore instance = WVCore.getInstance();
        ckf.f(instance, "WVCore.getInstance()");
        if (!instance.isUCSupport()) {
            lcn.f(RVLLevel.Error, "Themis/Performance/Prerender", "preRendering webview is not support");
            g1aVar.invoke(null);
            return;
        }
        b(xumVar.e(), new SnapShotPrerenderFactory$createPrerenderItem$1(g1aVar, xumVar));
    }
}
