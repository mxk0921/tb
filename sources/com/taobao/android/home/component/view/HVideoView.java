package com.taobao.android.home.component.view;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import anetwork.channel.Response;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.alibaba.android.umbrella.trace.UmbrellaTracker;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.AbsLocalBroadcastReceiver;
import com.taobao.android.trade.template.db.FileCache;
import com.taobao.login4android.api.Login;
import com.taobao.media.MediaConstant;
import com.taobao.statistic.TBS;
import com.taobao.tao.Globals;
import com.taobao.tao.TBMainHost;
import com.taobao.taobao.R;
import com.taobao.taobaoavsdk.cache.library.StorageUtils;
import com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.ut.device.UTDevice;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import tb.b3b;
import tb.bqa;
import tb.cra;
import tb.dhb;
import tb.f4b;
import tb.fdv;
import tb.gov;
import tb.i2b;
import tb.j9t;
import tb.lf9;
import tb.owo;
import tb.r7t;
import tb.s9m;
import tb.t2o;
import tb.xd9;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.MonitorMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class HVideoView extends FrameLayout implements Application.ActivityLifecycleCallbacks {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE_PAUSE_VIDEO = "pause";
    public static final String EVENT_TYPE_PLAY_VIDEO = "play";
    public static final String EVENT_TYPE_RELEASE_VIDEO = "release";
    public static final String HAS_ENQUEUE_KEY = "enqueued";
    private static final String TAG = "HVideoView";
    private HImageView coverImageView;
    public JSONObject currentData;
    private boolean isAttachedToWindow;
    private TUrlImageView ivPlayButton;
    private ImageView ivVideoVideoFakeBackground;
    private Context mContext;
    private j mDownLoadVideoLoadListener;
    private String sectionBizCode;
    public i statusListener;
    private TextView tvDurationTime;
    private String videoUrl;
    private TaoLiveVideoView videoView;
    private ImageView videoViewForeGroundImageView;
    private int iconOffsetY = 0;
    private int iconSize = 0;
    private boolean mNeedAutoPlay = false;
    private boolean mCanPlay = true;
    private String mVideoId = "";
    private String mUttId = UTDevice.getUtdid(Globals.getApplication());
    private String mPlayId = "";
    private String mUserId = Login.getOldUserId();
    private long mStartTime = 0;
    private String mScm = "";
    private String mItemID = "";
    private RecyclerViewStateReceiver mRecyclerViewStateReceiver = new RecyclerViewStateReceiver(this);
    private boolean enableQueue = false;
    public IMediaPlayer.OnCompletionListener onCompletionListener = new a();
    private final BroadcastReceiver mReceiver = new BroadcastReceiver() { // from class: com.taobao.android.home.component.view.HVideoView.5
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass5 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/home/component/view/HVideoView$5");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            String action = intent.getAction();
            if ("android.intent.action.SCREEN_OFF".equals(action)) {
                HVideoView.this.pauseVideo();
            } else if ("android.intent.action.USER_PRESENT".equals(action) && HVideoView.this.isShown()) {
                bqa.d(HVideoView.TAG, "BroadcastReceiver onReceive intent action:" + action);
                HVideoView.this.playVideo();
            }
        }
    };
    private final BroadcastReceiver mReceiver2 = new BroadcastReceiver() { // from class: com.taobao.android.home.component.view.HVideoView.6
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass6 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/home/component/view/HVideoView$6");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            HVideoView.this.pauseVideo();
            try {
                HVideoView.this.getContext().unregisterReceiver(HVideoView.access$600(HVideoView.this));
            } catch (Throwable unused) {
            }
            try {
                context.unregisterReceiver(HVideoView.access$700(HVideoView.this));
            } catch (Throwable unused2) {
            }
        }
    };
    private TaoLiveVideoView.n mOnStartListener = new e();
    private TaoLiveVideoView.m mOnPauseListener = new f();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class RecyclerViewStateReceiver extends AbsLocalBroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f7926a = 0;
        public final IntentFilter b = new IntentFilter("recyclerViewState");
        public final WeakReference<HVideoView> c;

        static {
            t2o.a(473956422);
        }

        public RecyclerViewStateReceiver(HVideoView hVideoView) {
            super(hVideoView);
            this.c = new WeakReference<>(hVideoView);
        }

        public static /* synthetic */ Object ipc$super(RecyclerViewStateReceiver recyclerViewStateReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/home/component/view/HVideoView$RecyclerViewStateReceiver");
        }

        @Override // com.taobao.android.home.component.utils.AbsLocalBroadcastReceiver
        public IntentFilter a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IntentFilter) ipChange.ipc$dispatch("c8ecf4ea", new Object[]{this});
            }
            return this.b;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (f4b.n()) {
                this.f7926a = intent.getIntExtra("recyclerViewState", 0);
                bqa.d(HVideoView.TAG, "RecyclerViewStateReceiver  onReceive: mCurrentRecyclerViewState" + this.f7926a);
                if (this.f7926a == 0) {
                    HVideoView hVideoView = this.c.get();
                    if (hVideoView == null) {
                        bqa.d(HVideoView.TAG, "RecyclerViewStateReceiver  onReceive: hVideo == null");
                        c();
                    } else if (!TextUtils.isEmpty(HVideoView.access$300(hVideoView)) && HVideoView.access$500(hVideoView).getCurrentState() == 0) {
                        hVideoView.playVideo();
                    }
                    if (hVideoView != null) {
                        bqa.d(HVideoView.TAG, "RecyclerViewStateReceiver  onReceive: videoUrl:" + HVideoView.access$300(hVideoView) + " videoView.getCurrentState:" + HVideoView.access$500(hVideoView).getCurrentState());
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements IMediaPlayer.OnCompletionListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
        public void onCompletion(IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15cd9204", new Object[]{this, iMediaPlayer});
            } else if (HVideoView.access$000(HVideoView.this)) {
                HVideoView.this.release();
                HVideoView.access$100(HVideoView.this, 1);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements j {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final JSONObject f7931a;

        public d() {
            this.f7931a = HVideoView.this.currentData;
        }

        @Override // com.taobao.android.home.component.view.HVideoView.j
        public void onFail() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd42bfa4", new Object[]{this});
                return;
            }
            bqa.d(HVideoView.TAG, "HVideoView video download 失败");
            HVideoView.access$100(HVideoView.this, 4);
        }

        @Override // com.taobao.android.home.component.view.HVideoView.j
        public void onFinish(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99807463", new Object[]{this, str});
                return;
            }
            bqa.d(HVideoView.TAG, "downLoadFinish playVideo  localPath = null; downloadVideo selfId:" + hashCode() + " videoUrl:" + HVideoView.access$300(HVideoView.this) + " downLoadUrl:" + str);
            JSONObject jSONObject = this.f7931a;
            HVideoView hVideoView = HVideoView.this;
            if (jSONObject == hVideoView.currentData && TextUtils.equals(HVideoView.access$300(hVideoView), str)) {
                bqa.d(HVideoView.TAG, "downLoadFinish playVideo  data == currentData;");
                HVideoView.this.playVideo();
                HVideoView.access$100(HVideoView.this, 3);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements TaoLiveVideoView.n {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.n
        public void I(IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb8582ac", new Object[]{this, iMediaPlayer});
            } else if (!TextUtils.isEmpty(HVideoView.access$900(HVideoView.this))) {
                HVideoView.access$1002(HVideoView.this, System.currentTimeMillis());
                HVideoView hVideoView = HVideoView.this;
                HVideoView.access$1102(hVideoView, HVideoView.access$1200(HVideoView.this) + HVideoView.access$1000(HVideoView.this));
                TBS.Ext.commitEvent("cnxh_special", 12002, HVideoView.access$900(HVideoView.this), null, null, HVideoView.access$1300(HVideoView.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f implements TaoLiveVideoView.m {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView.m
        public void v(IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8faf4140", new Object[]{this, iMediaPlayer});
            } else if (!TextUtils.isEmpty(HVideoView.access$900(HVideoView.this))) {
                TBS.Ext.commitEvent("cnxh_special", IMediaPlayer.MEDIA_INFO_LIVE_DEFINIITON_AUTO_SWITCH_START, HVideoView.access$900(HVideoView.this), null, null, HVideoView.access$1400(HVideoView.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class g extends AsyncTask<String, Void, Boolean> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<j> f7934a;
        public final String b;

        static {
            t2o.a(473956421);
        }

        public g(j jVar, String str) {
            this.f7934a = new WeakReference<>(jVar);
            this.b = str;
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            if (str.hashCode() == -1325021319) {
                super.onPostExecute(objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/home/component/view/HVideoView$DownloadVideoTask");
        }

        /* renamed from: a */
        public Boolean doInBackground(String... strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Boolean) ipChange.ipc$dispatch("523c617", new Object[]{this, strArr});
            }
            Response syncSend = new DegradableNetwork(null).syncSend(new RequestImpl(this.b), null);
            if (syncSend.getStatusCode() == 200 && syncSend.getBytedata() != null && syncSend.getBytedata().length > 0) {
                try {
                    String access$400 = HVideoView.access$400(this.b);
                    boolean f = xd9.f(access$400, syncSend.getBytedata());
                    bqa.d(HVideoView.TAG, "DownloadVideoTask downLoadVideo saveResult:" + f + " isEnableHVideoViewOptimise:" + f4b.n() + " filePath:" + access$400 + " success; url:" + this.b);
                    if (!f4b.n()) {
                        FileCache fileCache = new FileCache(Globals.getApplication(), new File(HVideoView.access$800()), "video", 20971520L);
                        if (f) {
                            fileCache.f(access$400, new File(access$400));
                        }
                    } else if (!f) {
                        File file = new File(access$400);
                        if (file.exists()) {
                            bqa.d(HVideoView.TAG, "DownloadVideoTask", "ErrorDownloadFile");
                            TBS.Ext.commitEvent("Page_Home", 19999, "ErrorDownloadFile", "");
                            file.delete();
                        }
                    }
                    return Boolean.valueOf(f);
                } catch (Throwable th) {
                    bqa.b(HVideoView.TAG, "DownloadVideoTask", th);
                }
            }
            return Boolean.FALSE;
        }

        /* renamed from: b */
        public void onPostExecute(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b98eb50", new Object[]{this, bool});
                return;
            }
            super.onPostExecute(bool);
            bqa.d(HVideoView.TAG, "DownloadVideoTask onPostExecute ret:" + bool + "  url:" + this.b);
            j jVar = this.f7934a.get();
            if (jVar == null) {
                bqa.d(HVideoView.TAG, "DownloadVideoTask listener is null");
            } else if (bool.booleanValue()) {
                jVar.onFinish(this.b);
            } else {
                jVar.onFail();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class h {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static h c;

        /* renamed from: a  reason: collision with root package name */
        public final Set<String> f7935a = new HashSet();
        public g b;

        static {
            t2o.a(473956423);
        }

        public static h b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (h) ipChange.ipc$dispatch("8ebba410", new Object[0]);
            }
            if (c == null) {
                c = new h();
            }
            return c;
        }

        public void a(String str, j jVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1633de76", new Object[]{this, str, jVar});
            } else if (((HashSet) this.f7935a).add(str)) {
                g gVar = new g(jVar, str);
                this.b = gVar;
                gVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
            } else {
                g gVar2 = this.b;
                if (gVar2 != null && gVar2.getStatus() == AsyncTask.Status.FINISHED && jVar != null) {
                    jVar.onFail();
                }
            }
        }

        public String c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("a039eee4", new Object[]{this, str});
            }
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            String access$400 = HVideoView.access$400(str);
            if (!new File(access$400).exists()) {
                return null;
            }
            ((HashSet) this.f7935a).remove(str);
            return access$400;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface i {
        public static final int STATUS_DOWNLOAD_ERROR = 4;
        public static final int STATUS_DOWNLOAD_SUCCESS = 3;
        public static final int STATUS_PLAY_COMPLETE = 1;
        public static final int STATUS_PLAY_ERROR = 2;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface j {
        void onFail();

        void onFinish(String str);
    }

    static {
        t2o.a(473956411);
    }

    public HVideoView(Context context) {
        super(context);
        init(context);
    }

    public static /* synthetic */ boolean access$000(HVideoView hVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df6a347b", new Object[]{hVideoView})).booleanValue();
        }
        return hVideoView.enableQueue;
    }

    public static /* synthetic */ void access$100(HVideoView hVideoView, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e929a2d", new Object[]{hVideoView, new Integer(i2)});
        } else {
            hVideoView.callbackStatus(i2);
        }
    }

    public static /* synthetic */ long access$1000(HVideoView hVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7847edc", new Object[]{hVideoView})).longValue();
        }
        return hVideoView.mStartTime;
    }

    public static /* synthetic */ long access$1002(HVideoView hVideoView, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8433e6d2", new Object[]{hVideoView, new Long(j2)})).longValue();
        }
        hVideoView.mStartTime = j2;
        return j2;
    }

    public static /* synthetic */ String access$1102(HVideoView hVideoView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("646e9e31", new Object[]{hVideoView, str});
        }
        hVideoView.mPlayId = str;
        return str;
    }

    public static /* synthetic */ String access$1200(HVideoView hVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6312783a", new Object[]{hVideoView});
        }
        return hVideoView.mUttId;
    }

    public static /* synthetic */ String access$1300(HVideoView hVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("96c0a2fb", new Object[]{hVideoView});
        }
        return hVideoView.getStartUtArgs();
    }

    public static /* synthetic */ String access$1400(HVideoView hVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca6ecdbc", new Object[]{hVideoView});
        }
        return hVideoView.getEndUtArgs();
    }

    public static /* synthetic */ void access$200(HVideoView hVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f94462b5", new Object[]{hVideoView});
        } else {
            hVideoView.hideCoverImageView();
        }
    }

    public static /* synthetic */ String access$300(HVideoView hVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("87d8dd4c", new Object[]{hVideoView});
        }
        return hVideoView.videoUrl;
    }

    public static /* synthetic */ String access$400(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4654f9bb", new Object[]{str});
        }
        return getVideoFilePath(str);
    }

    public static /* synthetic */ TaoLiveVideoView access$500(HVideoView hVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveVideoView) ipChange.ipc$dispatch("bea10576", new Object[]{hVideoView});
        }
        return hVideoView.videoView;
    }

    public static /* synthetic */ BroadcastReceiver access$600(HVideoView hVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BroadcastReceiver) ipChange.ipc$dispatch("111ba6e8", new Object[]{hVideoView});
        }
        return hVideoView.mReceiver;
    }

    public static /* synthetic */ BroadcastReceiver access$700(HVideoView hVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BroadcastReceiver) ipChange.ipc$dispatch("10423647", new Object[]{hVideoView});
        }
        return hVideoView.mReceiver2;
    }

    public static /* synthetic */ String access$800() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("502f6101", new Object[0]);
        }
        return getVideoFileRootPath();
    }

    public static /* synthetic */ String access$900(HVideoView hVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bdedddd2", new Object[]{hVideoView});
        }
        return hVideoView.mVideoId;
    }

    private void callbackStatus(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfc6f125", new Object[]{this, new Integer(i2)});
        }
    }

    private boolean checkNeedPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27e0399d", new Object[]{this})).booleanValue();
        }
        if (getVisibility() == 0 && this.mRecyclerViewStateReceiver.f7926a == 0) {
            return true;
        }
        return false;
    }

    private String getCurrentData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cb9dd58c", new Object[]{this});
        }
        JSONObject jSONObject = this.currentData;
        if (jSONObject == null) {
            return "";
        }
        return jSONObject.toString();
    }

    private String getEndUtArgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7d81fb78", new Object[]{this});
        }
        long currentTimeMillis = System.currentTimeMillis() - this.mStartTime;
        return "userId=" + this.mUserId + ",video_id=" + this.mVideoId + ",page=cnxh_special,play_sid=" + this.mPlayId + ",type=end,duration_time=" + currentTimeMillis + ",item_id=" + getItemID();
    }

    private String getItemID() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("edfaa715", new Object[]{this});
        }
        if (!(!TextUtils.isEmpty(this.mItemID) || (jSONObject = this.currentData) == null || jSONObject.getJSONObject("item") == null || this.currentData.getJSONObject("item").getJSONObject("0") == null || this.currentData.getJSONObject("item").getJSONObject("0").getJSONObject("clickParam") == null)) {
            this.mItemID = this.currentData.getJSONObject("item").getJSONObject("0").getJSONObject("clickParam").getString("itemId");
        }
        return this.mItemID;
    }

    private String getScm() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1429a872", new Object[]{this});
        }
        if (!(!TextUtils.isEmpty(this.mScm) || (jSONObject = this.currentData) == null || (jSONObject2 = jSONObject.getJSONObject("args")) == null)) {
            this.mScm = jSONObject2.getString("scm");
        }
        return this.mScm;
    }

    private String getStartUtArgs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("92025e11", new Object[]{this});
        }
        return "userId=" + this.mUserId + ",video_id=" + this.mVideoId + ",page=cnxh_special,play_sid=" + this.mPlayId + ",scm=" + getScm() + ",item_id=" + getItemID();
    }

    private static String getVideoFilePath(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3848e5c9", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String str2 = getVideoFileRootPath() + b3b.e(str);
        if (TextUtils.isEmpty(str2)) {
            bqa.d(TAG, "getVideoFilePath empty");
        }
        return str2;
    }

    private static String getVideoFileRootPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c00032d1", new Object[0]);
        }
        if (f4b.n()) {
            return StorageUtils.getIndividualCacheDirectory(Globals.getApplication()).getAbsolutePath() + File.separator;
        }
        try {
            String absolutePath = Globals.getApplication().getExternalCacheDir().getAbsolutePath();
            if (!TextUtils.isEmpty(absolutePath)) {
                return absolutePath + "/recommend/";
            }
        } catch (Throwable unused) {
        }
        String b2 = xd9.b(Globals.getApplication());
        return b2 + "/recommendVideo/";
    }

    private String getVideoId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ec0c039", new Object[]{this});
        }
        this.mVideoId = "";
        JSONObject jSONObject = this.currentData;
        if (!(jSONObject == null || jSONObject.getJSONObject("item") == null || this.currentData.getJSONObject("item").getJSONObject("0") == null || this.currentData.getJSONObject("item").getJSONObject("0").getJSONObject("content") == null)) {
            this.mVideoId = this.currentData.getJSONObject("item").getJSONObject("0").getJSONObject("content").getString(lf9.KEY_VIDEO_ID);
        }
        return this.mVideoId;
    }

    private void hideCoverImageView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a62ad192", new Object[]{this});
            return;
        }
        this.videoView.setVisibility(0);
        TUrlImageView tUrlImageView = this.ivPlayButton;
        if (tUrlImageView != null) {
            tUrlImageView.setVisibility(8);
        }
        ImageView imageView = this.videoViewForeGroundImageView;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        ImageView imageView2 = this.ivVideoVideoFakeBackground;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        HImageView hImageView = this.coverImageView;
        if (hImageView != null) {
            hImageView.setVisibility(8);
        }
        bqa.d(TAG, "hide CoverImage:", this.sectionBizCode);
    }

    private void init(Context context) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        this.mContext = context;
        try {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new cra(this.mContext, this.videoView));
        } catch (Throwable unused) {
        }
        this.videoView = new TaoLiveVideoView(getContext());
        this.coverImageView = new HImageView(getContext());
        this.videoViewForeGroundImageView = new ImageView(getContext());
        this.ivVideoVideoFakeBackground = new ImageView(getContext());
        if (f4b.n()) {
            this.coverImageView.setWhenNullClearImg(true);
        }
        if (this.videoView instanceof ViewGroup) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.homepage_video_view_extend, (ViewGroup) this.videoView, false);
        } else {
            view = null;
        }
        this.coverImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.videoViewForeGroundImageView.setImageResource(R.color.video_view_white_overlay);
        this.ivVideoVideoFakeBackground.setImageResource(17170443);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        addView(this.videoView, 0, layoutParams);
        addView(this.ivVideoVideoFakeBackground, 1, layoutParams);
        addView(this.videoViewForeGroundImageView, 2, layoutParams);
        addView(this.coverImageView, 3, layoutParams);
        addView(view, 4, layoutParams);
        this.videoView.setMuted(true);
        r7t r7tVar = new r7t(s9m.LPM_BIZ_CODE);
        r7tVar.d = 2;
        r7tVar.e = 2;
        r7tVar.f = 0;
        this.videoView.initConfig(r7tVar);
        this.videoView.setLooping(true);
        this.videoView.disableAutoPlayForBackground();
        setControlParams(this.videoView);
        this.videoView.registerOnErrorListener(new b());
        this.videoView.registerOnInfoListener(new c());
    }

    public static /* synthetic */ Object ipc$super(HVideoView hVideoView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -461309207) {
            super.onWindowVisibilityChanged(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/home/component/view/HVideoView");
        }
    }

    private boolean isForcePause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b2ff4a0", new Object[]{this})).booleanValue();
        }
        return Boolean.parseBoolean(f4b.h("hVideoViewForcePause", "true"));
    }

    private static boolean newCanPlayVideo(Context context) {
        j9t e2;
        dhb b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("708b530e", new Object[]{context})).booleanValue();
        }
        if (!f4b.m(context) || (e2 = j9t.e(context, "homepage")) == null || (b2 = e2.b()) == null) {
            return false;
        }
        return b2.isAutoPlayVideoUnderCurrentNetwork(context);
    }

    public void canPlay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609d7e89", new Object[]{this, new Boolean(z)});
        } else {
            this.mCanPlay = z;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            return;
        }
        if (this.mContext != activity) {
            if (TextUtils.equals(TBMainHost.b().getSimpleName(), activity.getLocalClassName())) {
                Context context = this.mContext;
                if (context != context.getApplicationContext()) {
                    return;
                }
            } else {
                return;
            }
        }
        this.videoView.release();
        try {
            ((Application) this.mContext.getApplicationContext()).unregisterActivityLifecycleCallbacks(this);
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e480fae9", new Object[]{this, new Integer(i2)});
            return;
        }
        super.onWindowVisibilityChanged(i2);
        if (!this.enableQueue) {
            if (f4b.n() && !this.mNeedAutoPlay) {
                return;
            }
            if (i2 == 0) {
                bqa.d(TAG, "onWindowVisibilityChanged visible playVideo selfId:" + hashCode() + " localPath:" + this.videoUrl);
                playVideo();
                return;
            }
            pauseVideo();
        }
    }

    public void pauseVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf67322c", new Object[]{this});
            return;
        }
        if (this.enableQueue) {
            showCoverImageView();
        }
        if (this.videoView.isPlaying()) {
            bqa.d(TAG, "pause video:", this.sectionBizCode);
            this.videoView.pause();
        }
    }

    public void playVideo() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4075d2ae", new Object[]{this});
            return;
        }
        if (this.enableQueue && (jSONObject = this.currentData) != null) {
            String string = jSONObject.getString("enqueued");
            if (this.enableQueue && TextUtils.isEmpty(string)) {
                callbackStatus(2);
                return;
            }
        }
        boolean newCanPlayVideo = newCanPlayVideo(getContext());
        bqa.d(TAG, "playVideo  selfId:" + hashCode() + " 是否走新播控逻辑" + newCanPlayVideo + " videoUrl:" + this.videoUrl);
        if (!this.mCanPlay || TextUtils.isEmpty(this.videoUrl) || !newCanPlayVideo) {
            showCoverImageView();
            this.videoView.release();
            this.videoView.setTag("");
            bqa.d(TAG, "playVideo  selfId:" + hashCode() + " 是否走新播控逻辑" + newCanPlayVideo + " status_play_error videoUrl:" + this.videoUrl);
            callbackStatus(2);
        } else if (!this.isAttachedToWindow) {
            callbackStatus(2);
            bqa.d(TAG, "playVideo  selfId:" + hashCode() + " isAttachedToWindow: false status_play_error videoUrl:" + this.videoUrl);
        } else {
            boolean n = f4b.n();
            String c2 = h.b().c(this.videoUrl);
            String mediaPlayUrl = this.videoView.getMediaPlayUrl();
            if (this.videoView.isPlaying()) {
                if (!isForcePause() || TextUtils.equals(c2, mediaPlayUrl)) {
                    bqa.d(TAG, "playVideo  selfId:" + hashCode() + " 当前videoView isPlaying videoUrl:" + this.videoUrl);
                    return;
                }
                this.videoView.pause();
            }
            if (c2 != null) {
                bqa.d(TAG, "playVideo  selfId:" + hashCode() + " localPath:" + c2 + " lastPath:" + mediaPlayUrl + " videoUrl:" + this.videoUrl);
                if (!TextUtils.equals(mediaPlayUrl, c2)) {
                    this.videoView.release();
                    this.videoView.setVideoPath(c2);
                    if (n && !checkNeedPlay()) {
                        showCoverImageView();
                        bqa.d(TAG, "playVideo selfId:" + hashCode() + " enableVideoScrollControl: false; checkNeedPlay: false; lastPath:" + mediaPlayUrl + " localPath: " + c2 + " videoUrl:" + this.videoUrl);
                        return;
                    }
                }
                bqa.d(TAG, "playVideo  selfId:" + hashCode() + " localPath:" + c2 + " lastPath:" + mediaPlayUrl + " videoUrl:" + this.videoUrl);
                if (isForcePause()) {
                    if (TextUtils.equals(c2, this.videoView.getMediaPlayUrl())) {
                        innerPlayVideo();
                    }
                } else if (!this.videoView.isPlaying() && TextUtils.equals(c2, this.videoView.getMediaPlayUrl())) {
                    innerPlayVideo();
                }
            } else {
                showCoverImageView();
                bqa.d(TAG, "playVideo  localPath = null; downloadVideo selfId:" + hashCode() + " videoUrl:" + this.videoUrl + "video isPlaying:" + this.videoView.isPlaying());
                this.mDownLoadVideoLoadListener = new d();
                h.b().a(this.videoUrl, this.mDownLoadVideoLoadListener);
            }
        }
    }

    public void registerVideoStatusListener(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bd4462c", new Object[]{this, iVar});
        }
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        if (this.enableQueue) {
            showCoverImageView();
        }
        this.videoView.release();
    }

    public void setCoverBGColor(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4cc94f3", new Object[]{this, new Integer(i2)});
        } else {
            this.coverImageView.setBackgroundColor(i2);
        }
    }

    public void setCoverImage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e694ff7", new Object[]{this, str});
            return;
        }
        if (this.enableQueue && !TextUtils.isEmpty(str)) {
            showCoverImageView();
        }
        this.coverImageView.setImageUrl(str);
    }

    public void setCoverImageDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cd080cf", new Object[]{this, drawable});
        } else {
            this.coverImageView.setImageDrawable(drawable);
        }
    }

    public void setCoverScaleType(ImageView.ScaleType scaleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d533a210", new Object[]{this, scaleType});
        } else {
            this.coverImageView.setScaleType(scaleType);
        }
    }

    public void setDurationTime(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f5469ae", new Object[]{this, charSequence});
            return;
        }
        TextView textView = (TextView) findViewById(R.id.tv_duration);
        this.tvDurationTime = textView;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void setEnableQueue(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad8fdf21", new Object[]{this, new Boolean(z)});
            return;
        }
        this.enableQueue = z;
        if (z) {
            this.videoView.setLooping(false);
            this.videoView.setOnCompletionListener(this.onCompletionListener);
            return;
        }
        this.videoView.setLooping(true);
        this.videoView.setOnCompletionListener(null);
    }

    public void setIconOffsetY(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be56d1fc", new Object[]{this, str});
            return;
        }
        if (this.ivPlayButton == null) {
            this.ivPlayButton = (TUrlImageView) findViewById(R.id.iv_play_btn);
        }
        if (!TextUtils.isEmpty(str)) {
            this.iconOffsetY = owo.e(getContext(), str, 0);
        } else {
            this.iconOffsetY = 0;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.ivPlayButton.getLayoutParams();
        layoutParams.topMargin = this.iconOffsetY;
        this.ivPlayButton.setLayoutParams(layoutParams);
    }

    public void setIconSize(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f977682d", new Object[]{this, str});
            return;
        }
        if (this.ivPlayButton == null) {
            this.ivPlayButton = (TUrlImageView) findViewById(R.id.iv_play_btn);
        }
        if (this.ivPlayButton != null && !TextUtils.isEmpty(str)) {
            this.iconSize = owo.e(getContext(), str, 0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.ivPlayButton.getLayoutParams();
            int i2 = this.iconSize;
            layoutParams.width = i2;
            layoutParams.height = i2;
            this.ivPlayButton.setLayoutParams(layoutParams);
        }
    }

    public void setIvVideoVideoFakeBGColor(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6e01542", new Object[]{this, new Integer(i2)});
        } else {
            this.ivVideoVideoFakeBackground.setImageResource(i2);
        }
    }

    public void setNeedAutoPlay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aaa52", new Object[]{this, new Boolean(z)});
        } else {
            this.mNeedAutoPlay = z;
        }
    }

    public void setPlayButtonImage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("285fe304", new Object[]{this, str});
            return;
        }
        TUrlImageView tUrlImageView = (TUrlImageView) findViewById(R.id.iv_play_btn);
        this.ivPlayButton = tUrlImageView;
        if (tUrlImageView != null) {
            tUrlImageView.setImageUrl(str);
        }
    }

    public void setScaleType(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1931833a", new Object[]{this, new Integer(i2)});
        } else {
            this.videoView.setAspectRatio(i2);
        }
    }

    public void setVideoUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4945f87", new Object[]{this, str});
            return;
        }
        String str2 = "";
        if (str == null || !str.endsWith(gov.SUFFIX_MP4)) {
            this.videoUrl = str2;
        } else {
            this.videoUrl = str;
        }
        if (TextUtils.isEmpty(this.videoUrl)) {
            str2 = " , original Url = " + str;
        }
        bqa.d(TAG, "setVideoUrl. selfId:" + hashCode() + ", videoUrl=" + this.videoUrl + str2);
    }

    public void setVideoViewForeGroundBGColor(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7f4f9ff", new Object[]{this, new Integer(i2)});
        } else {
            this.videoViewForeGroundImageView.setImageResource(i2);
        }
    }

    public void updateData(JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57d03316", new Object[]{this, jSONObject});
            return;
        }
        this.currentData = jSONObject;
        if (jSONObject == null) {
            str = "";
        } else {
            str = jSONObject.getString("sectionBizCode");
        }
        this.sectionBizCode = str;
        this.mVideoId = getVideoId();
        bqa.d(TAG, "updateData. currentData = " + getCurrentData());
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements IMediaPlayer.OnErrorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
        public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c383d1b6", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
            }
            HVideoView.this.showCoverImageView();
            HVideoView.this.pauseVideo();
            bqa.d(HVideoView.TAG, "videoView OnErrorListener", "" + i);
            HVideoView.access$100(HVideoView.this, 2);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements IMediaPlayer.OnInfoListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    HVideoView.access$200(HVideoView.this);
                }
            }
        }

        public c() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
        public boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("db02504e", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
            }
            if (((int) j) == 3) {
                if (HVideoView.access$000(HVideoView.this)) {
                    HVideoView.access$200(HVideoView.this);
                } else {
                    boolean z = iMediaPlayer instanceof MonitorMediaPlayer;
                    if (z) {
                        str = ((MonitorMediaPlayer) iMediaPlayer).getPlayUrl();
                    } else {
                        str = "";
                    }
                    String access$400 = HVideoView.access$400(HVideoView.access$300(HVideoView.this));
                    bqa.d(HVideoView.TAG, "HVideoView start play. selfId:" + hashCode() + ", playUrl=" + str + ", localPathUrl=" + access$400 + ", videoUrl=" + HVideoView.access$300(HVideoView.this));
                    if (f4b.n() && z && !TextUtils.equals(str, access$400)) {
                        TBS.Ext.commitEvent("Page_Home", 19999, "HVideoView path error", "");
                        try {
                            HVideoView.access$500(HVideoView.this).pause();
                            bqa.d(HVideoView.TAG, "selfId:" + hashCode() + ",path error: expect:url:" + HVideoView.access$300(HVideoView.this) + "，actualUrl:" + HVideoView.access$500(HVideoView.this).getMediaPlayUrl() + ",data:" + JSON.toJSONString(iMediaPlayer));
                        } catch (Throwable th) {
                            bqa.b(HVideoView.TAG, "HVideoView pause error", th);
                        }
                    } else if (f4b.b("immediatelyHideCoverViewEnable", true)) {
                        HVideoView.access$200(HVideoView.this);
                    } else {
                        HVideoView.this.postDelayed(new a(), 1200L);
                    }
                }
            }
            return true;
        }
    }

    private void innerPlayVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adea2ff8", new Object[]{this});
        } else if (this.videoView.getCurrentState() < 0) {
            UmbrellaTracker.commitFailureStability(fdv.F_DATA_PROCESS, TAG, "1.0", "Page_Home", TAG, null, "url not correct", "");
            TBS.Ext.commitEvent("Page_Home", 19999, "HVideoView url error", "");
            bqa.d(TAG, "url not correct: cur url：" + this.videoView.getMediaPlayUrl() + ", target url:" + this.videoUrl + ", cur play state:" + this.videoView.getCurrentState() + " selfId:" + hashCode());
        } else {
            this.videoView.setVisibility(0);
            this.videoView.start();
            bqa.d(TAG, "playVideo  selfId:" + hashCode() + " videoUrl:" + this.videoUrl + "video isPlaying:" + this.videoView.isPlaying() + "sectionBizCode:" + this.sectionBizCode);
            if (!TextUtils.isEmpty(this.mVideoId)) {
                this.videoView.registerOnStartListener(this.mOnStartListener);
                this.videoView.registerOnPauseListener(this.mOnPauseListener);
            }
        }
    }

    private void setControlParams(TaoLiveVideoView taoLiveVideoView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e275c0fa", new Object[]{this, taoLiveVideoView});
        } else if (f4b.b("enableVideoScreenSleep", true)) {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put(MediaConstant.KEEP_SCREENON_BY_CONTROL_PARAM, "true");
            taoLiveVideoView.setControlParams(hashMap);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        this.isAttachedToWindow = true;
        if (!this.enableQueue) {
            this.videoView.setRenderType(2);
            try {
                getContext().unregisterReceiver(this.mReceiver);
            } catch (Throwable unused) {
            }
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                intentFilter.addAction("android.intent.action.USER_PRESENT");
                getContext().registerReceiver(this.mReceiver, intentFilter);
            } catch (Throwable unused2) {
            }
            try {
                getContext().unregisterReceiver(this.mReceiver2);
            } catch (Throwable unused3) {
            }
            try {
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction(i2b.ACTION_ACTIVITY_STOP);
                LocalBroadcastManager.getInstance(Globals.getApplication()).registerReceiver(this.mReceiver2, intentFilter2);
            } catch (Throwable unused4) {
            }
            bqa.d(TAG, "onAttachedToWindow playVideo  selfId:" + hashCode() + " localPath:" + this.videoUrl);
            playVideo();
        }
    }

    public void showCoverImageView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb3ff68d", new Object[]{this});
            return;
        }
        this.videoView.setVisibility(8);
        TUrlImageView tUrlImageView = this.ivPlayButton;
        if (tUrlImageView != null) {
            tUrlImageView.setVisibility(0);
        }
        ImageView imageView = this.videoViewForeGroundImageView;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = this.ivVideoVideoFakeBackground;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        HImageView hImageView = this.coverImageView;
        if (hImageView != null) {
            hImageView.setVisibility(0);
        }
        bqa.d(TAG, "show CoverImage:", this.sectionBizCode);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        this.isAttachedToWindow = false;
        if (!this.enableQueue) {
            try {
                getContext().unregisterReceiver(this.mReceiver);
            } catch (Throwable unused) {
            }
            try {
                LocalBroadcastManager.getInstance(Globals.getApplication()).unregisterReceiver(this.mReceiver2);
            } catch (Throwable unused2) {
            }
            if (f4b.b("showCoverImageViewDetachWindow", true)) {
                showCoverImageView();
            }
            this.videoView.release();
            this.mVideoId = "";
        }
    }

    public HVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public HVideoView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        init(context);
    }

    public HVideoView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        init(context);
    }
}
