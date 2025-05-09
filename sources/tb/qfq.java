package tb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import anet.channel.Config;
import anet.channel.SessionCenter;
import anet.channel.entity.ENV;
import anet.channel.entity.SessionType;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpUrl;
import anet.channel.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.global.MtopConfig;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.util.MtopSDKThreadPoolExecutorFactory;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class qfq implements xnj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f26727a;
        public final /* synthetic */ Uri b;

        public a(String str, Uri uri) {
            this.f26727a = str;
            this.b = uri;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                TBSdkLog.e("ssr.SsrNavProcessor", "process ssr pre request" + this.f26727a);
                MtopConfig mtopConfig = Mtop.instance(Mtop.Id.SSR, (Context) null).getMtopConfig();
                if (mtopConfig != null) {
                    SessionCenter.getInstance(new Config.Builder().setAppkey(mtopConfig.appKey).setEnv(ENV.ONLINE).build()).get(HttpUrl.parse(StringUtils.concatString("https", HttpConstant.SCHEME_SPLIT, this.b.getHost())), SessionType.LONG_LINK, 0L);
                }
            } catch (Throwable th) {
                TBSdkLog.e("ssr.SsrNavProcessor", "process session error." + th);
            }
        }
    }

    @Override // tb.xnj
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return "SsrNavProcessor";
    }

    @Override // tb.xnj
    public boolean process(Intent intent, zmj zmjVar) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3ebca67", new Object[]{this, intent, zmjVar})).booleanValue();
        }
        if (intent == null || (data = intent.getData()) == null) {
            return true;
        }
        String uri = data.toString();
        if (jfq.a(uri)) {
            MtopSDKThreadPoolExecutorFactory.getRequestThreadPoolExecutor().submit(new a(uri, data));
        }
        return true;
    }

    @Override // tb.xnj
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }
}
