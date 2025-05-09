package com.taobao.avplayer.music;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.taobao.R;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.util.HashMap;
import tb.aig;
import tb.t2o;
import tb.ya;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class BackgroundAudioService extends Service implements AudioManager.OnAudioFocusChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_NOTIFICATION = "intent_action_notification";
    public static final int NOTIFICATION_ID = 3070160;
    public static final int VIEW_ID_NOTIFICATION_CLOSE = 5;
    public static final int VIEW_ID_NOTIFICATION_NEXT = 3;
    public static final int VIEW_ID_NOTIFICATION_OPEN = 4;
    public static final int VIEW_ID_NOTIFICATION_PLAY_STOP = 2;
    public static final int VIEW_ID_NOTIFICATION_PREVIOUS = 1;

    /* renamed from: a  reason: collision with root package name */
    public a f10191a;
    public Notification b;
    public RemoteViews c;
    public NotificationBroadcastReceiver d;
    public MusicBinder e;
    public int f = R.id.iv_image;
    public int g = R.id.tv_song_name;
    public int h = R.id.tv_singer;
    public int i = R.id.iv_music_play_stop;
    public int j = R.id.iv_music_close;
    public final int k = R.id.iv_music_previous_new;
    public final int l = R.id.iv_music_next_new;
    public final BroadcastReceiver m = new BroadcastReceiver() { // from class: com.taobao.avplayer.music.BackgroundAudioService.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/music/BackgroundAudioService$1");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (BackgroundAudioService.a(BackgroundAudioService.this) != null) {
                BackgroundAudioService.a(BackgroundAudioService.this).onPause();
            }
        }
    };
    public boolean n = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class MusicBinder extends Binder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(452985117);
        }

        public MusicBinder() {
        }

        public static /* synthetic */ Object ipc$super(MusicBinder musicBinder, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/music/BackgroundAudioService$MusicBinder");
        }

        public void onClose() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e155e360", new Object[]{this});
                return;
            }
            BackgroundAudioService.f(BackgroundAudioService.this).f();
            BackgroundAudioService.i(BackgroundAudioService.this);
            BackgroundAudioService.h(BackgroundAudioService.this, false);
        }

        public void onSkipToNext() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c91fc33", new Object[]{this});
                return;
            }
            BackgroundAudioService.f(BackgroundAudioService.this).v();
            HashMap<String, String> k = BackgroundAudioService.f(BackgroundAudioService.this).k();
            if (k != null) {
                if (k.containsKey("title")) {
                    BackgroundAudioService.k(BackgroundAudioService.this).setTextViewText(BackgroundAudioService.j(BackgroundAudioService.this), k.get("title"));
                } else {
                    BackgroundAudioService.k(BackgroundAudioService.this).setTextViewText(BackgroundAudioService.j(BackgroundAudioService.this), "taobao tv_song_name");
                }
                BackgroundAudioService backgroundAudioService = BackgroundAudioService.this;
                backgroundAudioService.startForeground(BackgroundAudioService.NOTIFICATION_ID, BackgroundAudioService.l(backgroundAudioService));
            }
        }

        public void onSkipToPrevious() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6436c5b7", new Object[]{this});
                return;
            }
            BackgroundAudioService.f(BackgroundAudioService.this).w();
            HashMap<String, String> k = BackgroundAudioService.f(BackgroundAudioService.this).k();
            if (k != null) {
                if (k.containsKey("title")) {
                    BackgroundAudioService.k(BackgroundAudioService.this).setTextViewText(BackgroundAudioService.j(BackgroundAudioService.this), k.get("title"));
                } else {
                    BackgroundAudioService.k(BackgroundAudioService.this).setTextViewText(BackgroundAudioService.j(BackgroundAudioService.this), "taobao tv_song_name");
                }
                BackgroundAudioService backgroundAudioService = BackgroundAudioService.this;
                backgroundAudioService.startForeground(BackgroundAudioService.NOTIFICATION_ID, BackgroundAudioService.l(backgroundAudioService));
            }
        }

        public void onStop() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3dde88", new Object[]{this});
                return;
            }
            BackgroundAudioService.this.stopForeground(true);
            BackgroundAudioService.h(BackgroundAudioService.this, false);
        }

        public void onCustomAction(String str, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("be99bcdd", new Object[]{this, str, bundle});
                return;
            }
            AVSDKLog.e("AVSDK-tb-Music", "onCustomAction " + str);
            if ("updateAlbumArtBitmap".equals(str)) {
                if (BackgroundAudioService.f(BackgroundAudioService.this).k() != null) {
                    BackgroundAudioService.m(BackgroundAudioService.this);
                    BackgroundAudioService backgroundAudioService = BackgroundAudioService.this;
                    backgroundAudioService.startForeground(BackgroundAudioService.NOTIFICATION_ID, BackgroundAudioService.l(backgroundAudioService));
                }
            } else if ("closeVideo".equals(str)) {
                BackgroundAudioService.this.stopForeground(true);
                BackgroundAudioService.f(BackgroundAudioService.this).o();
                BackgroundAudioService.f(BackgroundAudioService.this).f();
            }
        }

        public void onPause() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
                return;
            }
            AVSDKLog.e("AVSDK-tb-Music", "onPause " + BackgroundAudioService.g(BackgroundAudioService.this));
            if (BackgroundAudioService.g(BackgroundAudioService.this)) {
                if (BackgroundAudioService.f(BackgroundAudioService.this) != null) {
                    BackgroundAudioService.f(BackgroundAudioService.this).q();
                }
                BackgroundAudioService.i(BackgroundAudioService.this);
                BackgroundAudioService.h(BackgroundAudioService.this, false);
            }
        }

        public void onPlay() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("150378ba", new Object[]{this});
                return;
            }
            AVSDKLog.e("AVSDK-tb-Music", "onPlay");
            if (BackgroundAudioService.b(BackgroundAudioService.this)) {
                BackgroundAudioService.e(BackgroundAudioService.this);
                BackgroundAudioService.f(BackgroundAudioService.this).t();
                BackgroundAudioService.h(BackgroundAudioService.this, true);
            }
        }

        public void onPlayFromMediaId(String str, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eca32b81", new Object[]{this, str, bundle});
                return;
            }
            AVSDKLog.e("AVSDK-tb-Music", "onPlayFromMediaId " + str);
            BackgroundAudioService.b(BackgroundAudioService.this);
            BackgroundAudioService.e(BackgroundAudioService.this);
            BackgroundAudioService.f(BackgroundAudioService.this).y();
            BackgroundAudioService.h(BackgroundAudioService.this, true);
            AVSDKLog.e("AVSDK-tb-Music", "onPlayFromMediaId finish");
        }

        public void onSeekTo(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("65f2e48b", new Object[]{this, new Long(j)});
                return;
            }
            AVSDKLog.e("AVSDK-tb-Music", "onSeekTo " + j);
            BackgroundAudioService.f(BackgroundAudioService.this).u((int) j, false, false);
        }
    }

    static {
        t2o.a(452985115);
    }

    public static /* synthetic */ MusicBinder a(BackgroundAudioService backgroundAudioService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MusicBinder) ipChange.ipc$dispatch("cb4d2634", new Object[]{backgroundAudioService});
        }
        return backgroundAudioService.e;
    }

    public static /* synthetic */ boolean b(BackgroundAudioService backgroundAudioService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c866572e", new Object[]{backgroundAudioService})).booleanValue();
        }
        return backgroundAudioService.t();
    }

    public static /* synthetic */ boolean c(BackgroundAudioService backgroundAudioService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ffc719c", new Object[]{backgroundAudioService})).booleanValue();
        }
        return backgroundAudioService.q();
    }

    public static /* synthetic */ int d(BackgroundAudioService backgroundAudioService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("95907a8c", new Object[]{backgroundAudioService})).intValue();
        }
        return backgroundAudioService.i;
    }

    public static /* synthetic */ void e(BackgroundAudioService backgroundAudioService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edfa602b", new Object[]{backgroundAudioService});
        } else {
            backgroundAudioService.s();
        }
    }

    public static /* synthetic */ a f(BackgroundAudioService backgroundAudioService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("ee817325", new Object[]{backgroundAudioService});
        }
        return backgroundAudioService.f10191a;
    }

    public static /* synthetic */ boolean g(BackgroundAudioService backgroundAudioService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39227231", new Object[]{backgroundAudioService})).booleanValue();
        }
        return backgroundAudioService.n;
    }

    public static /* synthetic */ boolean h(BackgroundAudioService backgroundAudioService, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ed992c09", new Object[]{backgroundAudioService, new Boolean(z)})).booleanValue();
        }
        backgroundAudioService.n = z;
        return z;
    }

    public static /* synthetic */ void i(BackgroundAudioService backgroundAudioService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb67b2e", new Object[]{backgroundAudioService});
        } else {
            backgroundAudioService.r();
        }
    }

    public static /* synthetic */ Object ipc$super(BackgroundAudioService backgroundAudioService, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == 413640386) {
            super.onCreate();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/avplayer/music/BackgroundAudioService");
        }
    }

    public static /* synthetic */ int j(BackgroundAudioService backgroundAudioService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("844a8422", new Object[]{backgroundAudioService})).intValue();
        }
        return backgroundAudioService.g;
    }

    public static /* synthetic */ RemoteViews k(BackgroundAudioService backgroundAudioService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteViews) ipChange.ipc$dispatch("44cdb4f8", new Object[]{backgroundAudioService});
        }
        return backgroundAudioService.c;
    }

    public static /* synthetic */ Notification l(BackgroundAudioService backgroundAudioService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Notification) ipChange.ipc$dispatch("5de7e53b", new Object[]{backgroundAudioService});
        }
        return backgroundAudioService.b;
    }

    public static /* synthetic */ void m(BackgroundAudioService backgroundAudioService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5069f32", new Object[]{backgroundAudioService});
        } else {
            backgroundAudioService.p();
        }
    }

    public final String n(String str, int i) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("416809db", new Object[]{this, str, new Integer(i)});
        }
        if (str.length() > i) {
            str2 = str.substring(0, i) + "...";
        } else {
            str2 = str;
        }
        AVSDKLog.e("AVSDK-tb-Music", str + " ellipsize " + str2);
        return str2;
    }

    public final void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b8aa214", new Object[]{this});
        } else {
            registerReceiver(this.m, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a40fd0b", new Object[]{this, new Integer(i)});
            return;
        }
        AVSDKLog.e("AVSDK-tb-Music", "onAudioFocusChange focusChange ");
        if (i == -2 || i == -1) {
            this.e.onPause();
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        if (this.e == null) {
            this.e = new MusicBinder();
        }
        return this.e;
    }

    @Override // android.app.Service
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        AVSDKLog.e("AVSDK-tb-Music", " service onCreate start");
        this.f10191a = a.j(this);
        p();
        o();
        this.d = new NotificationBroadcastReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ACTION_NOTIFICATION);
        registerReceiver(this.d, intentFilter);
        AVSDKLog.e("AVSDK-tb-Music", " service onCreate finish");
    }

    @Override // android.app.Service
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        ((AudioManager) getSystemService("audio")).abandonAudioFocus(this);
        unregisterReceiver(this.m);
        NotificationManagerCompat.from(this).cancel(NOTIFICATION_ID);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76c5749f", new Object[]{this, intent, new Integer(i), new Integer(i2)})).intValue();
        }
        return 2;
    }

    public final boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a3f2a2f", new Object[]{this})).booleanValue();
        }
        return this.n;
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97e3dc9d", new Object[]{this});
            return;
        }
        AVSDKLog.e("AVSDK-tb-Music", this + " showPausedNotification ");
        RemoteViews remoteViews = this.c;
        if (remoteViews != null) {
            remoteViews.setImageViewResource(this.i, R.drawable.music_play_gray_dark);
            startForeground(NOTIFICATION_ID, this.b);
        }
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a668883", new Object[]{this});
            return;
        }
        AVSDKLog.e("AVSDK-tb-Music", this + " showPlayingNotification ");
        RemoteViews remoteViews = this.c;
        if (remoteViews != null) {
            remoteViews.setImageViewResource(this.i, R.drawable.music_stop_gray_dark);
            startForeground(NOTIFICATION_ID, this.b);
        }
    }

    public final boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("761aa24e", new Object[]{this})).booleanValue();
        }
        if (((AudioManager) getSystemService("audio")).requestAudioFocus(this, 3, 1) == 1) {
            return true;
        }
        return false;
    }

    public final void p() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f63527e7", new Object[]{this});
            return;
        }
        HashMap<String, String> k = this.f10191a.k();
        if (k == null) {
            AVSDKLog.e("AVSDK-tb-Music", "initNotificationView return null");
        }
        AVSDKLog.e("AVSDK-tb-Music", "initNotificationView ");
        NotificationManager notificationManager = (NotificationManager) getSystemService(RemoteMessageConst.NOTIFICATION);
        boolean l = this.f10191a.l();
        if (l) {
            this.f = R.id.iv_image_new;
            this.g = R.id.tv_song_name_new;
            this.h = R.id.tv_singer_new;
            this.i = R.id.iv_music_play_stop_new;
            this.j = R.id.iv_music_close_new;
        }
        String packageName = getPackageName();
        if (l) {
            i = R.layout.layout_notification_music_play_new;
        } else {
            i = R.layout.layout_notification_music_play;
        }
        this.c = new RemoteViews(packageName, i);
        Bitmap i2 = this.f10191a.i();
        if (i2 != null) {
            this.c.setImageViewBitmap(this.f, i2);
        } else {
            AVSDKLog.e("AVSDK-tb-Music", "initNotificationView no image");
        }
        Intent intent = new Intent(ACTION_NOTIFICATION);
        if (l) {
            intent.putExtra("view_id", 1);
            this.c.setOnClickPendingIntent(this.k, ya.e(this, 1, intent, 134217728));
        }
        intent.putExtra("view_id", 2);
        this.c.setOnClickPendingIntent(this.i, ya.e(this, 2, intent, 134217728));
        if (this.n) {
            this.c.setImageViewResource(this.i, R.drawable.music_stop_gray_dark);
        } else {
            this.c.setImageViewResource(this.i, R.drawable.music_play_gray_dark);
        }
        if (l) {
            intent.putExtra("view_id", 3);
            this.c.setOnClickPendingIntent(this.l, ya.e(this, 3, intent, 134217728));
        }
        intent.putExtra("view_id", 4);
        PendingIntent e = ya.e(this, 4, intent, 134217728);
        intent.putExtra("view_id", 5);
        this.c.setOnClickPendingIntent(this.j, ya.e(this, 5, intent, 134217728));
        if (k == null || !k.containsKey("title")) {
            AVSDKLog.e("AVSDK-tb-Music", "initNotificationView no title");
        } else {
            this.c.setTextViewText(this.g, n(k.get("title"), 7));
        }
        if (k == null || !k.containsKey("subtitle")) {
            AVSDKLog.e("AVSDK-tb-Music", "initNotificationView no subtitle");
        } else {
            this.c.setTextViewText(this.h, n(k.get("subtitle"), 10));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            AVSDKLog.e("AVSDK-tb-Music", "initNotificationView createNotificationChannel if");
            NotificationChannel a2 = aig.a("tb_music_player", "淘宝音频", 3);
            a2.enableLights(false);
            a2.enableVibration(false);
            a2.setLockscreenVisibility(1);
            a2.setSound(null, null);
            a2.setVibrationPattern(new long[]{0});
            notificationManager.createNotificationChannel(a2);
            this.b = new NotificationCompat.Builder(getApplicationContext()).setContentTitle("淘宝音频").setSmallIcon(R.drawable.defalut_tao).setCustomContentView(this.c).setChannelId("tb_music_player").setContentIntent(e).setVibrate(new long[]{0}).setSound(null).build();
        } else {
            AVSDKLog.e("AVSDK-tb-Music", "initNotificationView createNotificationChannel else");
            this.b = new NotificationCompat.Builder(getApplicationContext()).setContentTitle("淘宝音频").setSmallIcon(R.drawable.defalut_tao).setContent(this.c).setVibrate(new long[]{0}).setSound(null).build();
        }
        NotificationManagerCompat.from(this).notify(NOTIFICATION_ID, this.b);
        startForeground(NOTIFICATION_ID, this.b);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class NotificationBroadcastReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(452985118);
        }

        public NotificationBroadcastReceiver() {
        }

        public static /* synthetic */ Object ipc$super(NotificationBroadcastReceiver notificationBroadcastReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/music/BackgroundAudioService$NotificationBroadcastReceiver");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            String action = intent.getAction();
            AVSDKLog.e("AVSDK-tb-Music", "NotificationBroadcastReceiver onReceive " + action);
            if (action.equals(BackgroundAudioService.ACTION_NOTIFICATION)) {
                int intExtra = intent.getIntExtra("view_id", 0);
                AVSDKLog.e("AVSDK-tb-Music", "NotificationBroadcastReceiver onReceive " + action + ", " + intExtra);
                if (intExtra == 1) {
                    BackgroundAudioService.a(BackgroundAudioService.this).onSkipToPrevious();
                } else if (intExtra != 2) {
                    if (intExtra == 3) {
                        BackgroundAudioService.a(BackgroundAudioService.this).onSkipToNext();
                    } else if (intExtra == 4) {
                        BackgroundAudioService.f(BackgroundAudioService.this).n();
                    } else if (intExtra == 5) {
                        BackgroundAudioService.a(BackgroundAudioService.this).onCustomAction("closeVideo", null);
                    }
                } else if (BackgroundAudioService.c(BackgroundAudioService.this)) {
                    BackgroundAudioService.a(BackgroundAudioService.this).onPause();
                    BackgroundAudioService.k(BackgroundAudioService.this).setImageViewResource(BackgroundAudioService.d(BackgroundAudioService.this), R.drawable.music_play_gray_dark);
                    BackgroundAudioService backgroundAudioService = BackgroundAudioService.this;
                    backgroundAudioService.startForeground(BackgroundAudioService.NOTIFICATION_ID, BackgroundAudioService.l(backgroundAudioService));
                } else {
                    BackgroundAudioService.a(BackgroundAudioService.this).onPlay();
                    BackgroundAudioService.k(BackgroundAudioService.this).setImageViewResource(BackgroundAudioService.d(BackgroundAudioService.this), R.drawable.music_stop_gray_dark);
                    BackgroundAudioService backgroundAudioService2 = BackgroundAudioService.this;
                    backgroundAudioService2.startForeground(BackgroundAudioService.NOTIFICATION_ID, BackgroundAudioService.l(backgroundAudioService2));
                }
            }
        }
    }
}
