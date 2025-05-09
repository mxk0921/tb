package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kirinvideoengine.feature.predownload.model.PreDownloadConfig;
import com.taobao.kirinvideoengine.feature.predownload.model.PreLoadHealthy;
import com.taobao.kirinvideoengine.model.MediaModel;
import com.taobao.kirinvideoengine.states.model.KirinVideoStateModel;
import com.taobao.tao.flexbox.layoutmanager.player.videodecide.VideoControllerManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class m5g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f23790a;
    public List<MediaModel> b;
    public JSONObject d;
    public boolean e;
    public PreLoadHealthy g;
    public int h;
    public MediaModel i;
    public String j;
    public String k;
    public Runnable l;
    public long m;
    public final m2c n;
    public String o;
    public float c = 1.0f;
    public final List<String> f = new ArrayList(3);
    public final boolean p = true;
    public final Handler q = new a(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements wbd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f23793a;
        public final /* synthetic */ MediaModel b;

        public c(String str, MediaModel mediaModel) {
            this.f23793a = str;
            this.b = mediaModel;
        }

        @Override // tb.wbd
        public void onStart(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("938ad014", new Object[]{this, str});
            }
        }

        @Override // tb.wbd
        public void onProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ec8f5b0", new Object[]{this, new Integer(i)});
                return;
            }
            azf.b("KirinVideoPreDownloadTask", "preDownloadCurrent ------" + this.f23793a + " onProgress。 i = " + i, new Object[0]);
        }

        @Override // tb.wbd
        public void onFinish(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a105f4a", new Object[]{this, new Integer(i)});
                return;
            }
            azf.d(this, "toDownloadNext", "KirinVideoPreDownloadTask", "预下载完成 =====>" + this.f23793a + "; size=" + i);
            m5g.h(m5g.this).removeCallbacks(m5g.g(m5g.this));
            if (i > 0) {
                m5g.d(m5g.this).a(this.f23793a);
                if (qz3.b(m5g.e(m5g.this))) {
                    m5g.e(m5g.this).remove(this.b);
                }
            }
            if (TextUtils.equals(m5g.l(m5g.this), this.f23793a)) {
                m5g.m(m5g.this, null);
                m5g.p(m5g.this, null);
                m5g.q(m5g.this, null);
            }
            m5g.f(m5g.this, 500L);
        }
    }

    static {
        t2o.a(500170777);
    }

    public m5g(Context context, m2c m2cVar) {
        this.f23790a = context;
        this.n = m2cVar;
    }

    public static /* synthetic */ boolean a(m5g m5gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a17cfa55", new Object[]{m5gVar})).booleanValue();
        }
        return m5gVar.e;
    }

    public static /* synthetic */ List b(m5g m5gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("83da9445", new Object[]{m5gVar});
        }
        return m5gVar.f;
    }

    public static /* synthetic */ String c(m5g m5gVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d3214928", new Object[]{m5gVar, str});
        }
        m5gVar.o = str;
        return str;
    }

    public static /* synthetic */ KirinVideoStateModel.a d(m5g m5gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KirinVideoStateModel.a) ipChange.ipc$dispatch("85ecc6bc", new Object[]{m5gVar});
        }
        return m5gVar.v();
    }

    public static /* synthetic */ List e(m5g m5gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e348fc47", new Object[]{m5gVar});
        }
        return m5gVar.b;
    }

    public static /* synthetic */ void f(m5g m5gVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0b0fa85", new Object[]{m5gVar, new Long(j)});
        } else {
            m5gVar.E(j);
        }
    }

    public static /* synthetic */ Runnable g(m5g m5gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("75976696", new Object[]{m5gVar});
        }
        return m5gVar.l;
    }

    public static /* synthetic */ Handler h(m5g m5gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("e913bb49", new Object[]{m5gVar});
        }
        return m5gVar.q;
    }

    public static /* synthetic */ PreLoadHealthy i(m5g m5gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreLoadHealthy) ipChange.ipc$dispatch("84d91b67", new Object[]{m5gVar});
        }
        return m5gVar.g;
    }

    public static /* synthetic */ MediaModel j(m5g m5gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaModel) ipChange.ipc$dispatch("3ccc8914", new Object[]{m5gVar});
        }
        return m5gVar.t();
    }

    public static /* synthetic */ void k(m5g m5gVar, MediaModel mediaModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ba2a39", new Object[]{m5gVar, mediaModel});
        } else {
            m5gVar.z(mediaModel);
        }
    }

    public static /* synthetic */ String l(m5g m5gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91dbdd34", new Object[]{m5gVar});
        }
        return m5gVar.k;
    }

    public static /* synthetic */ String m(m5g m5gVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d9ef2c", new Object[]{m5gVar, str});
        }
        m5gVar.k = str;
        return str;
    }

    public static /* synthetic */ Context n(m5g m5gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("5c902503", new Object[]{m5gVar});
        }
        return m5gVar.f23790a;
    }

    public static /* synthetic */ void o(m5g m5gVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6ce6dde", new Object[]{m5gVar, context});
        } else {
            m5gVar.s(context);
        }
    }

    public static /* synthetic */ String p(m5g m5gVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ebe46baf", new Object[]{m5gVar, str});
        }
        m5gVar.j = str;
        return str;
    }

    public static /* synthetic */ JSONObject q(m5g m5gVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7381d946", new Object[]{m5gVar, jSONObject});
        }
        m5gVar.d = jSONObject;
        return jSONObject;
    }

    public static String y(MediaModel mediaModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d20f93cd", new Object[]{mediaModel});
        }
        if (mediaModel != null) {
            return mediaModel.videoId;
        }
        return "";
    }

    public final int u(List<MediaModel> list, MediaModel mediaModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ea8c185", new Object[]{this, list, mediaModel})).intValue();
        }
        if (qz3.a(list) || mediaModel == null) {
            return -1;
        }
        for (int i = 0; i < list.size(); i++) {
            MediaModel mediaModel2 = list.get(i);
            if (mediaModel2 != null && TextUtils.equals(mediaModel2.uniqueIdentifier, mediaModel.uniqueIdentifier)) {
                return i;
            }
        }
        return -1;
    }

    public final KirinVideoStateModel.a<String> v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KirinVideoStateModel.a) ipChange.ipc$dispatch("624a93e0", new Object[]{this});
        }
        KirinVideoStateModel.a<String> b2 = o5g.b(this.n);
        if (b2 == null) {
            return new KirinVideoStateModel.a<>(70);
        }
        return b2;
    }

    public final PreLoadHealthy w(PreDownloadConfig preDownloadConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreLoadHealthy) ipChange.ipc$dispatch("dbf7d8", new Object[]{this, preDownloadConfig});
        }
        PreLoadHealthy preLoadHealthy = preDownloadConfig.mPreLoadHealthy;
        if (preLoadHealthy == null) {
            return new PreLoadHealthy();
        }
        return preLoadHealthy;
    }

    public final HashMap<String, String> x(MediaModel mediaModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("be5ecdcf", new Object[]{this, mediaModel});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (mediaModel != null) {
            hashMap.put("from", mediaModel.source);
            hashMap.put(a7m.VIDEO_PLAY_SCENES, mediaModel.videoPlayScenes);
        }
        return hashMap;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f23792a;
        public final /* synthetic */ MediaModel b;

        public b(String str, MediaModel mediaModel) {
            this.f23792a = str;
            this.b = mediaModel;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            azf.d(this, "toDownloadNext", "KirinVideoPreDownloadTask", "预下载超时了。取消当前视频，下载一下个");
            if (TextUtils.equals(m5g.l(m5g.this), this.f23792a)) {
                m5g m5gVar = m5g.this;
                m5g.o(m5gVar, m5g.n(m5gVar));
                m5g.m(m5g.this, null);
                m5g.p(m5g.this, null);
                m5g.q(m5g.this, null);
                if (m5g.b(m5g.this) != null) {
                    if (m5g.b(m5g.this).size() <= 0 || !TextUtils.equals((CharSequence) m5g.b(m5g.this).get(0), this.f23792a)) {
                        m5g.b(m5g.this).add(this.f23792a);
                    } else {
                        m5g.d(m5g.this).a(this.f23792a);
                        if (qz3.b(m5g.e(m5g.this))) {
                            m5g.e(m5g.this).remove(this.b);
                        }
                        m5g.b(m5g.this).clear();
                    }
                }
            }
            m5g.f(m5g.this, 500L);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kirinvideoengine/feature/predownload/KirinVideoPreDownloadTask$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (m5g.a(m5g.this)) {
                azf.d(this, "toDownloadNext", "KirinVideoPreDownloadTask", "handleMessage isStopped, not preload！");
                m5g.c(m5g.this, "idle");
            } else if (m5g.i(m5g.this) == null || !m5g.i(m5g.this).isPoor()) {
                azf.b("KirinVideoPreDownloadTask", "handleMessage---", new Object[0]);
                MediaModel j = m5g.j(m5g.this);
                if (j != null) {
                    m5g.k(m5g.this, j);
                }
            } else {
                azf.d("KirinVideoPreDownloadTask", "handleMessage isPoor not preload！", new Object[0]);
            }
        }
    }

    public void B(List<MediaModel> list, PreDownloadConfig preDownloadConfig) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0f09ccd", new Object[]{this, list, preDownloadConfig});
        } else if (qz3.a(list)) {
            this.b = null;
            this.o = "complete";
        } else {
            StringBuilder sb = new StringBuilder();
            for (MediaModel mediaModel : list) {
                if (mediaModel != null) {
                    str = mediaModel.videoId;
                } else {
                    str = "null";
                }
                sb.append(str);
                sb.append(",");
            }
            azf.d(this, "startDownload", "调用批量预下载，listsize=" + list.size() + " ; [" + ((Object) sb) + "]");
            this.b = new ArrayList(list);
            if (preDownloadConfig != null) {
                float f = preDownloadConfig.preDownloadSize;
                if (f > 0.0f) {
                    this.c = f;
                }
            }
            this.e = false;
            this.o = "downloading";
            E(0L);
        }
    }

    public void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        azf.d("KirinVideoPreDownloadTask", "stop ---- ", new Object[0]);
        if (!this.e) {
            this.e = true;
            s(this.f23790a);
        }
    }

    public final List<MediaModel> r(List<MediaModel> list, int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("12af4130", new Object[]{this, list, new Integer(i)});
        }
        ArrayList arrayList = new ArrayList();
        if (qz3.a(list)) {
            azf.b(this, "buildDownloadList", "mediaModelList为null");
            return arrayList;
        }
        int i2 = this.h;
        while (true) {
            i2++;
            if (i2 - this.h > i || i2 >= list.size()) {
                break;
            }
            MediaModel mediaModel = list.get(i2);
            if (!(mediaModel == null || (str = mediaModel.videoId) == null || v().b(str))) {
                arrayList.add(mediaModel);
            }
        }
        return arrayList;
    }

    public final void C(List<MediaModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31e49a52", new Object[]{this, list});
            return;
        }
        String str = "";
        if (this.p) {
            if (v().d() > 0) {
                StringBuilder sb = new StringBuilder();
                for (String str2 : v().c()) {
                    sb.append(str2);
                    sb.append(",");
                }
                azf.b(this, "startDownload", "已经下载的视频 ; [" + ((Object) sb) + "]");
            }
            StringBuilder sb2 = new StringBuilder();
            Iterator<MediaModel> it = list.iterator();
            while (it.hasNext()) {
                MediaModel next = it.next();
                sb2.append(next != null ? next.videoId : str);
                sb2.append(",");
            }
            azf.b(this, "startDownload", "mediaList队列中的id ; [" + ((Object) sb2) + "]");
        }
        MediaModel mediaModel = list.get(this.h);
        if (mediaModel != null) {
            str = mediaModel.videoId;
        }
        azf.d(this, "startDownload", "KirinVideoPreDownloadTask", "preloadstatus playing mPlayingIndex=" + this.h + " ; contentid=" + str + " hasdownload:" + v().b(str) + " ");
    }

    public final void E(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eddf27", new Object[]{this, new Long(j)});
        } else if (this.e) {
            azf.d(this, "toDownloadNext", "KirinVideoPreDownloadTask", "toLoadNext isStopped, not proceed！");
            this.o = "idle";
        } else {
            String str = this.j;
            if (str == null || str.length() <= 0) {
                azf.b(this, "toDownloadNext", "KirinVideoPreDownloadTask", "toLoadNext preloadstatus ---> healthy --> delayMillis=" + j);
                this.q.removeMessages(100);
                Message obtain = Message.obtain();
                obtain.what = 100;
                this.q.sendMessageDelayed(obtain, j);
                return;
            }
            azf.d(this, "toDownloadNext", "KirinVideoPreDownloadTask", "preloadstatus toLoadNext is reloading, not proceed！mPreloadingUrl=" + this.j);
        }
    }

    public final void s(Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed8ba552", new Object[]{this, context});
            return;
        }
        this.q.removeMessages(100);
        this.q.removeCallbacks(this.l);
        if (!(context == null || (str = this.j) == null || str.length() <= 0)) {
            azf.d(this, "toDownloadNext", "KirinVideoPreDownloadTask", "主动取消预下载..." + this.k + ". url=" + this.j);
            JSONObject jSONObject = this.d;
            if (jSONObject != null) {
                try {
                    JSONArray jSONArray = jSONObject.getJSONArray(VideoControllerManager.ARRAY_KEY_RESOURCES);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        String string = jSONArray.getJSONObject(i).getString(VideoControllerManager.KEY_CACHEKEY);
                        azf.d(this, "toDownloadNext", "KirinVideoPreDownloadTask", "正在取消（新版）..." + this.k + ". cacheKey=" + string);
                        qmm.a(context, string);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    azf.d(this, "toDownloadNext", "KirinVideoPreDownloadTask", "取消异常..." + e.getMessage());
                }
            } else {
                azf.d(this, "toDownloadNext", "KirinVideoPreDownloadTask", "正在取消（老版）...");
                qmm.a(context, this.j);
            }
            this.j = null;
            this.d = null;
        }
        this.o = "idle";
    }

    public final MediaModel t() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaModel) ipChange.ipc$dispatch("651479e3", new Object[]{this});
        }
        List<MediaModel> list = this.b;
        if (list == null || ((ArrayList) list).size() == 0) {
            this.o = "complete";
            azf.d(this, "toDownloadNext", "KirinVideoPreDownloadTask", "当前下载队列下载完成");
            return null;
        }
        MediaModel mediaModel = (MediaModel) ((ArrayList) this.b).get(0);
        if (mediaModel != null && !"DWVideo".equals(mediaModel.mediaType)) {
            azf.d(this, "findNextMedia", "当前的媒体不是视频类型，return");
            ((ArrayList) this.b).remove(0);
            return t();
        } else if (mediaModel != null && !v().b(mediaModel.videoId)) {
            return mediaModel;
        } else {
            StringBuilder sb = new StringBuilder("预下载命中缓存: id=");
            if (mediaModel != null) {
                str = mediaModel.videoId;
            } else {
                str = "null";
            }
            sb.append(str);
            azf.d(this, "toDownloadNext", "KirinVideoPreDownloadTask", sb.toString());
            ((ArrayList) this.b).remove(0);
            return t();
        }
    }

    public final void z(MediaModel mediaModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29513da1", new Object[]{this, mediaModel});
        } else if (mediaModel != null) {
            String str = mediaModel.videoId;
            JSONObject jSONObject = mediaModel.videoResourceObj;
            if (jSONObject != null && this.f23790a != null) {
                List<String> list = this.f;
                if (list != null && ((ArrayList) list).size() > 0 && !TextUtils.equals((String) ((ArrayList) this.f).get(0), str)) {
                    ((ArrayList) this.f).clear();
                }
                this.l = new b(str, mediaModel);
                String k = qmm.k(this.f23790a, jSONObject, (int) (this.c * 1024.0f * 1024.0f), new c(str, mediaModel), x(mediaModel));
                this.j = k;
                this.k = str;
                this.d = jSONObject;
                azf.d(this, "toDownloadNext", "KirinVideoPreDownloadTask", "开始预下载 " + str + "; downloadSize=" + this.c + ";url=" + k);
                if (k == null || k.length() <= 0) {
                    azf.d(this, "toDownloadNext", "KirinVideoPreDownloadTask", "url为空，创建下载失败了，直接取消，下载下一个 ");
                    ((b) this.l).run();
                    return;
                }
                this.q.postDelayed(this.l, 5000L);
            }
        }
    }

    public void A(long j, MediaModel mediaModel, List<MediaModel> list, PreDownloadConfig preDownloadConfig, int i, int i2, int i3) {
        int i4;
        String str;
        String str2;
        int i5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68ae9310", new Object[]{this, new Long(j), mediaModel, list, preDownloadConfig, new Integer(i), new Integer(i2), new Integer(i3)});
        } else if (preDownloadConfig != null) {
            if (this.i != mediaModel) {
                this.i = mediaModel;
                if (("更新当前播放视频的ID：" + this.i) != null) {
                    str = this.i.videoId;
                    str2 = "";
                } else {
                    str = "";
                    str2 = str;
                }
                azf.b(this, "progressPreDownload", str);
                this.o = "idle";
                if (preDownloadConfig.stopDownloadPlayingVideo && TextUtils.equals(this.k, y(mediaModel))) {
                    s(this.f23790a);
                }
                if (!qz3.a(list)) {
                    this.h = 0;
                    if (mediaModel != null) {
                        int i6 = mediaModel.index;
                        this.h = i6;
                        if (i6 >= list.size() || (i5 = this.h) < 0) {
                            this.h = u(list, mediaModel);
                        } else {
                            MediaModel mediaModel2 = list.get(i5);
                            if (mediaModel2 == null || !TextUtils.equals(mediaModel2.uniqueIdentifier, mediaModel.uniqueIdentifier)) {
                                azf.d(this, "startDownload", "KirinVideoPreDownloadTask", "比对index，当前播放的媒体不在list里");
                                this.h = u(list, mediaModel);
                            }
                        }
                    }
                    int i7 = this.h;
                    if (i7 < 0) {
                        MediaModel mediaModel3 = list.get(0);
                        StringBuilder sb = new StringBuilder("progressPreDownload mPlayingIndex=-1. return,第0个视频的id：");
                        if (mediaModel3 != null) {
                            str2 = mediaModel3.videoId;
                        }
                        sb.append(str2);
                        azf.d(this, "startDownload", "KirinVideoPreDownloadTask", sb.toString());
                        this.o = "idle";
                        return;
                    } else if (i7 + 1 >= list.size()) {
                        azf.d(this, "startDownload", "到达列表结尾");
                        return;
                    } else {
                        C(list);
                    }
                } else {
                    return;
                }
            }
            PreLoadHealthy w = w(preDownloadConfig);
            this.g = w;
            w.progressPreDownload(i, i2, i3);
            if (this.g.isHealthyWithGap()) {
                if ((this.m != j || "idle".equals(this.o)) && (i4 = preDownloadConfig.queueDepth) > 0) {
                    this.m = j;
                    List<MediaModel> r = r(list, i4);
                    azf.b(this, "progressPreDownload", "index：" + (this.h + 1) + "，当前list的长度：" + list.size());
                    B(r, preDownloadConfig);
                }
            } else if (this.g.isPoor()) {
                azf.d(this, "progressPreDownload", "KirinVideoPreDownloadTask", "toLoadNext preloadstatus ---> isPoor --> 尝试取消cancelPreload ");
                s(this.f23790a);
            }
        }
    }
}
