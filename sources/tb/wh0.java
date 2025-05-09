package tb;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.msgnotification.mode.MsgNotficationDTO;
import com.taobao.tao.log.TLog;
import tb.yoe;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class wh0 extends fi0 implements yoe.i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f30688a;

    static {
        t2o.a(588251154);
        t2o.a(588251195);
    }

    public wh0(Context context, MsgNotficationDTO msgNotficationDTO, Bundle bundle, Intent intent) {
        super(context, msgNotficationDTO, bundle, intent);
    }

    public static /* synthetic */ Object ipc$super(wh0 wh0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/msgnotification/base/AgExpandNotification");
    }

    @Override // tb.yoe.i
    public void a(Bitmap bitmap, NotificationCompat.Builder builder, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fbd3ec1", new Object[]{this, bitmap, builder, str});
            return;
        }
        try {
            e(bitmap, builder, str);
        } catch (Exception e) {
            y7t.a("AgExpandNotification", e.toString());
        }
    }

    @Override // tb.yoe.i
    public void b(NotificationCompat.Builder builder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("379754f6", new Object[]{this, builder});
            return;
        }
        try {
            d(builder);
        } catch (Exception e) {
            y7t.a("AgExpandNotification", e.toString());
        }
    }

    public abstract NotificationCompat.Builder c(MsgNotficationDTO msgNotficationDTO, NotificationCompat.Builder builder);

    public abstract void d(NotificationCompat.Builder builder);

    public abstract void e(Bitmap bitmap, NotificationCompat.Builder builder, String str);

    public abstract int f();

    @Override // com.taobao.message.notification.system.base.IOldAgooNotification
    public void performNotify() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b98d0d91", new Object[]{this});
        } else if (this.mMsgData == null) {
            y7t.a("AgExpandNotification", "showPersonalMsg is error,msgData==null");
        } else {
            try {
                int nextInt = fi0.notificationRandom.nextInt();
                NotificationCompat.Builder c = c(this.mMsgData, this.mBuilder);
                this.mBuilder = c;
                setVibrateSound(c, this.mParam);
                Intent intent = this.mParam;
                if (intent != null) {
                    nextInt = intent.getIntExtra("notifyContentIntentRequestCode", nextInt);
                }
                ji0.a(this.mBuilder, fi0.mContext, this.mExtras, nextInt, this.mParam);
                String packageName = fi0.mContext.getPackageName();
                this.f30688a = nextInt;
                Intent intent2 = this.mParam;
                if (intent2 != null) {
                    this.f30688a = intent2.getIntExtra("notifyId", nextInt);
                }
                yoe.a(fi0.mContext, this.mMsgData, f(), this.mBuilder, packageName, this);
            } catch (Throwable th) {
                y7t.a("AgExpandNotification", "showCustomViewNotification error,e=" + th.toString());
                TLog.loge("AgExpandNotification", Log.getStackTraceString(th));
            }
        }
    }
}
