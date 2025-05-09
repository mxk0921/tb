package com.taobao.android.diagnose.scene;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.idh;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SceneObserver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f7246a;
    public a c = null;
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final BroadcastReceiver b = new BroadcastReceiver() { // from class: com.taobao.android.diagnose.scene.SceneObserver.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/diagnose/scene/SceneObserver$1");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (SceneObserver.a(SceneObserver.this) != null && intent != null && "com.taobao.pink.feedback.action.screenshot".equals(intent.getAction())) {
                SceneObserver.b(SceneObserver.this, intent);
            }
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
        void a(Uri uri, String str);
    }

    static {
        t2o.a(615514180);
    }

    public SceneObserver(Context context) {
        this.f7246a = context;
    }

    public static /* synthetic */ a a(SceneObserver sceneObserver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("f37164c2", new Object[]{sceneObserver});
        }
        return sceneObserver.c;
    }

    public static /* synthetic */ void b(SceneObserver sceneObserver, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e1f6485", new Object[]{sceneObserver, intent});
        } else {
            sceneObserver.c(intent);
        }
    }

    public final void c(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae00d689", new Object[]{this, intent});
            return;
        }
        idh.a("SceneObserver", "onScreenShot");
        String stringExtra = intent.getStringExtra("filePath");
        Uri uri = (Uri) intent.getParcelableExtra(NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        if (uri != null && !TextUtils.isEmpty(stringExtra)) {
            this.c.a(uri, stringExtra);
        }
    }

    public void d(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("284b951f", new Object[]{this, aVar});
            return;
        }
        this.c = aVar;
        if (!this.d.getAndSet(true)) {
            idh.a("SceneObserver", "register screenshot");
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.taobao.pink.feedback.action.screenshot");
            LocalBroadcastManager.getInstance(this.f7246a).registerReceiver(this.b, intentFilter);
        }
    }
}
