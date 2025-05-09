package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.player.prefetchdownload.MediaInfoBean;
import com.taobao.tao.flexbox.layoutmanager.player.prefetchdownload.PrefetchDownloadConfigBean;
import com.taobao.tao.flexbox.layoutmanager.player.videodecide.VideoControllerManager;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class fw8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f19571a;
    public List<MediaInfoBean> b;
    public String d;
    public String e;
    public JSONObject f;
    public boolean h;
    public int c = 1048576;
    public final d<String> g = new d<>(70);
    public final List<String> i = new ArrayList(3);
    public final Handler j = new a(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/player/prefetchdownload/FSVideoPreDownloader$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (fw8.a(fw8.this)) {
                tfs.e("TNodePlayerPrefetchManager_FSVideoPreDownloader", "handleMessage isStopped, not preload！");
            } else {
                igs.a("VideoPreDownloader");
                MediaInfoBean b = fw8.b(fw8.this);
                if (b != null) {
                    fw8.f(fw8.this, b);
                }
                igs.c();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f19573a;
        public final /* synthetic */ MediaInfoBean b;

        public b(String str, MediaInfoBean mediaInfoBean) {
            this.f19573a = str;
            this.b = mediaInfoBean;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            tfs.e("TNodePlayerPrefetchManager_FSVideoPreDownloader", "预下载超时了。取消当前视频，下载一下个");
            igs.a("VideoPreDownloaderTimeOut");
            if (TextUtils.equals(fw8.g(fw8.this), this.f19573a)) {
                fw8 fw8Var = fw8.this;
                fw8.j(fw8Var, fw8.i(fw8Var));
                fw8.h(fw8.this, null);
                fw8.k(fw8.this, null);
                fw8.l(fw8.this, null);
                if (fw8.m(fw8.this) != null) {
                    if (fw8.m(fw8.this).size() <= 0 || !TextUtils.equals((CharSequence) fw8.m(fw8.this).get(0), this.f19573a)) {
                        fw8.m(fw8.this).add(this.f19573a);
                    } else {
                        fw8.n(fw8.this).remove(this.b);
                        fw8.m(fw8.this).clear();
                    }
                }
            }
            fw8.c(fw8.this, 500L);
            igs.c();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements wbd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f19574a;
        public final /* synthetic */ Runnable b;
        public final /* synthetic */ MediaInfoBean c;

        public c(String str, Runnable runnable, MediaInfoBean mediaInfoBean) {
            this.f19574a = str;
            this.b = runnable;
            this.c = mediaInfoBean;
        }

        @Override // tb.wbd
        public void onFinish(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a105f4a", new Object[]{this, new Integer(i)});
                return;
            }
            igs.a("VideoPreDownloaderFinish");
            tfs.e("TNodePlayerPrefetchManager_FSVideoPreDownloader", "预下载完成 =====>" + this.f19574a + "; size=" + i);
            fw8.d(fw8.this).removeCallbacks(this.b);
            if (i > 0) {
                fw8.e(fw8.this).a(this.f19574a);
                fw8.n(fw8.this).remove(this.c);
            }
            if (TextUtils.equals(fw8.g(fw8.this), this.f19574a)) {
                fw8.h(fw8.this, null);
                fw8.k(fw8.this, null);
                fw8.l(fw8.this, null);
            }
            fw8.c(fw8.this, 500L);
            igs.c();
        }

        @Override // tb.wbd
        public void onProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ec8f5b0", new Object[]{this, new Integer(i)});
            }
        }

        @Override // tb.wbd
        public void onStart(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("938ad014", new Object[]{this, str});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class d<E> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f19575a;
        public final ArrayList<E> b = new ArrayList<>();

        static {
            t2o.a(502268300);
        }

        public d(int i) {
            this.f19575a = i;
        }

        public boolean b(E e) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b06c8586", new Object[]{this, e})).booleanValue();
            }
            return this.b.contains(e);
        }

        public void a(E e) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba2da84", new Object[]{this, e});
            } else if (this.b.remove(e)) {
                this.b.add(e);
            } else {
                if (this.b.size() >= this.f19575a) {
                    E remove = this.b.remove(0);
                    tfs.e("TNodePlayerPrefetchManager_FSVideoPreDownloader", "预下载达到缓存最大:" + this.f19575a + "。移除最老:" + remove);
                }
                this.b.add(e);
            }
        }
    }

    static {
        t2o.a(502268296);
    }

    public fw8(Context context) {
        this.f19571a = context;
    }

    public static /* synthetic */ boolean a(fw8 fw8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c2a81db9", new Object[]{fw8Var})).booleanValue();
        }
        return fw8Var.h;
    }

    public static /* synthetic */ MediaInfoBean b(fw8 fw8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaInfoBean) ipChange.ipc$dispatch("da5a33fa", new Object[]{fw8Var});
        }
        return fw8Var.q();
    }

    public static /* synthetic */ void c(fw8 fw8Var, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf38975e", new Object[]{fw8Var, new Long(j)});
        } else {
            fw8Var.t(j);
        }
    }

    public static /* synthetic */ Handler d(fw8 fw8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("5bced761", new Object[]{fw8Var});
        }
        return fw8Var.j;
    }

    public static /* synthetic */ d e(fw8 fw8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("ec9ef839", new Object[]{fw8Var});
        }
        return fw8Var.g;
    }

    public static /* synthetic */ void f(fw8 fw8Var, MediaInfoBean mediaInfoBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef37c42b", new Object[]{fw8Var, mediaInfoBean});
        } else {
            fw8Var.r(mediaInfoBean);
        }
    }

    public static /* synthetic */ String g(fw8 fw8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6dd50bce", new Object[]{fw8Var});
        }
        return fw8Var.e;
    }

    public static /* synthetic */ String h(fw8 fw8Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4c07c946", new Object[]{fw8Var, str});
        }
        fw8Var.e = str;
        return str;
    }

    public static /* synthetic */ Context i(fw8 fw8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("838a629", new Object[]{fw8Var});
        }
        return fw8Var.f19571a;
    }

    public static /* synthetic */ void j(fw8 fw8Var, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1987c078", new Object[]{fw8Var, context});
        } else {
            fw8Var.p(context);
        }
    }

    public static /* synthetic */ String k(fw8 fw8Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8cdb12c9", new Object[]{fw8Var, str});
        }
        fw8Var.d = str;
        return str;
    }

    public static /* synthetic */ JSONObject l(fw8 fw8Var, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6a14f3e0", new Object[]{fw8Var, jSONObject});
        }
        fw8Var.f = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ List m(fw8 fw8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f75f0bfa", new Object[]{fw8Var});
        }
        return fw8Var.i;
    }

    public static /* synthetic */ List n(fw8 fw8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("fae6aefb", new Object[]{fw8Var});
        }
        return fw8Var.b;
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
        } else if (akt.H()) {
            this.h = true;
            p(this.f19571a);
        }
    }

    public final void t(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eddf27", new Object[]{this, new Long(j)});
        } else if (this.h) {
            tfs.e("TNodePlayerPrefetchManager_FSVideoPreDownloader", "toLoadNext isStopped, not proceed！");
        } else {
            String str = this.d;
            if (str == null || str.length() <= 0) {
                this.j.removeMessages(100);
                Message obtain = Message.obtain();
                obtain.what = 100;
                this.j.sendMessageDelayed(obtain, j);
                return;
            }
            tfs.e("TNodePlayerPrefetchManager_FSVideoPreDownloader", "preloadstatus toLoadNext is reloading, not proceed！mPreloadingUrl=" + this.d);
        }
    }

    public final MediaInfoBean q() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaInfoBean) ipChange.ipc$dispatch("2e47146f", new Object[]{this});
        }
        List<MediaInfoBean> list = this.b;
        if (list == null || ((ArrayList) list).size() == 0) {
            return null;
        }
        MediaInfoBean mediaInfoBean = (MediaInfoBean) ((ArrayList) this.b).get(0);
        if (mediaInfoBean != null && !this.g.b(mediaInfoBean.videoId)) {
            return mediaInfoBean;
        }
        StringBuilder sb = new StringBuilder("预下载命中缓存: id=");
        if (mediaInfoBean != null) {
            str = mediaInfoBean.videoId;
        } else {
            str = "null";
        }
        sb.append(str);
        tfs.e("TNodePlayerPrefetchManager_FSVideoPreDownloader", sb.toString());
        ((ArrayList) this.b).remove(0);
        return q();
    }

    public final void r(MediaInfoBean mediaInfoBean) {
        Exception e;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a358796d", new Object[]{this, mediaInfoBean});
        } else if (mediaInfoBean != null) {
            String str = mediaInfoBean.videoId;
            String str2 = mediaInfoBean.videoResourceStr;
            tfs.e("TNodePlayerPrefetchManager_FSVideoPreDownloader", "播控: " + str2);
            JSONObject jSONObject2 = null;
            if (!TextUtils.isEmpty(str2)) {
                try {
                    jSONObject = new JSONObject(str2);
                } catch (Exception e2) {
                    e = e2;
                }
                try {
                    if (mediaInfoBean.enableBitOpti) {
                        VideoControllerManager.e(jSONObject, false);
                    }
                    jSONObject2 = jSONObject;
                } catch (Exception e3) {
                    e = e3;
                    jSONObject2 = jSONObject;
                    tfs.e("TNodePlayerPrefetchManager_FSVideoPreDownloader", "" + e);
                    if (jSONObject2 != null) {
                        return;
                    }
                }
            }
            if (jSONObject2 != null && this.f19571a != null) {
                List<String> list = this.i;
                if (list != null && ((ArrayList) list).size() > 0 && !TextUtils.equals((String) ((ArrayList) this.i).get(0), str)) {
                    ((ArrayList) this.i).clear();
                }
                b bVar = new b(str, mediaInfoBean);
                String j = qmm.j(this.f19571a, jSONObject2, this.c, new c(str, bVar, mediaInfoBean));
                this.d = j;
                this.e = str;
                this.f = jSONObject2;
                tfs.e("TNodePlayerPrefetchManager_FSVideoPreDownloader", "开始预下载 " + str + "; downloadSize=" + this.c + ";url=" + j);
                if (j == null || j.length() <= 0) {
                    tfs.e("TNodePlayerPrefetchManager_FSVideoPreDownloader", "url为空，创建下载失败了，直接取消，下载下一个 ");
                    bVar.run();
                    return;
                }
                this.j.postDelayed(bVar, 7000L);
            }
        }
    }

    public void s(List<MediaInfoBean> list, PrefetchDownloadConfigBean prefetchDownloadConfigBean) {
        Integer num;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae97d163", new Object[]{this, list, prefetchDownloadConfigBean});
        } else if (akt.H()) {
            if (list != null) {
                StringBuilder sb = new StringBuilder();
                for (MediaInfoBean mediaInfoBean : list) {
                    if (mediaInfoBean != null) {
                        str = mediaInfoBean.videoId;
                    } else {
                        str = "null";
                    }
                    sb.append(str);
                    sb.append(",");
                }
                tfs.e("TNodePlayerPrefetchManager_FSVideoPreDownloader", "调用批量预下载，listsize=" + list.size() + " ; [" + ((Object) sb) + "]");
            }
            if (list != null) {
                this.b = new ArrayList(list);
            } else {
                this.b = null;
            }
            if (!(prefetchDownloadConfigBean == null || (num = prefetchDownloadConfigBean.size) == null || num.intValue() <= 0)) {
                this.c = prefetchDownloadConfigBean.size.intValue();
            }
            this.h = false;
            t(0L);
        }
    }

    public final void p(Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed8ba552", new Object[]{this, context});
            return;
        }
        igs.a("VideoPreDownloaderCancel");
        this.j.removeMessages(100);
        if (!(context == null || (str = this.d) == null || str.length() <= 0)) {
            tfs.e("TNodePlayerPrefetchManager_FSVideoPreDownloader", "主动取消预下载..." + this.e + ". url=" + this.d);
            if (this.f == null || !akt.m1()) {
                tfs.e("TNodePlayerPrefetchManager_FSVideoPreDownloader", "正在取消（老版）...");
                qmm.a(context, this.d);
            } else {
                try {
                    JSONArray jSONArray = this.f.getJSONArray(VideoControllerManager.ARRAY_KEY_RESOURCES);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        String string = jSONArray.getJSONObject(i).getString(VideoControllerManager.KEY_CACHEKEY);
                        tfs.e("TNodePlayerPrefetchManager_FSVideoPreDownloader", "正在取消（新版）..." + this.e + ". cacheKey=" + string);
                        qmm.a(context, string);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    tfs.e("TNodePlayerPrefetchManager_FSVideoPreDownloader", "取消异常..." + e.getMessage());
                }
            }
            this.d = null;
            this.f = null;
        }
        igs.c();
    }
}
