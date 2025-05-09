package tb;

import android.taobao.windvane.thread.WVThreadPool;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.zcache.model.ZCacheResourceResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class wrw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "PackageApp-Runtime";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ b val$resBack;
        public final /* synthetic */ String val$url;

        public a(String str, b bVar) {
            this.val$url = str;
            this.val$resBack = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.val$resBack.callback(wrw.getZCacheResourceResponse(this.val$url));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface b {
        void callback(kpx kpxVar);
    }

    static {
        t2o.a(989856351);
    }

    public static void getZCacheResourceResponse(String str, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("787feaf2", new Object[]{str, bVar});
        } else {
            WVThreadPool.getInstance().execute(new a(str, bVar));
        }
    }

    public static boolean isLocalVisit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d277547f", new Object[]{str})).booleanValue();
        }
        return gpx.d().e(str);
    }

    public static kpx getZCacheResourceResponse(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kpx) ipChange.ipc$dispatch("88f18bd1", new Object[]{str});
        }
        String i = gtw.i(str);
        fpx.a().b();
        ZCacheResourceResponse b2 = gpx.d().b(i);
        kpx kpxVar = new kpx();
        if (b2 != null) {
            v7t.i("ZCache", "weex use ZCache 3.0, url=[" + i + "], with response:[" + b2.isSuccess + "]");
            kpxVar.encoding = b2.encoding;
            kpxVar.headers = b2.headers;
            kpxVar.inputStream = b2.inputStream;
            kpxVar.isSuccess = b2.isSuccess;
            kpxVar.mimeType = b2.mimeType;
        } else {
            v7t.i("ZCache", "weex use ZCache 3.0, url=[" + i + "], with response=[null]");
        }
        return kpxVar;
    }
}
