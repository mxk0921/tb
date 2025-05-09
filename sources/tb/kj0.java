package tb;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import java.util.Calendar;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class kj0 extends gva {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public PendingIntent c;
    public AlarmManager d;

    static {
        t2o.a(343933151);
    }

    public kj0(Context context) {
        super(context);
        try {
            this.d = (AlarmManager) this.f20255a.getSystemService("alarm");
        } catch (Throwable th) {
            ALog.e("AlarmHeartBeatMgr", "AlarmHeartBeatMgr", th, new Object[0]);
        }
    }

    public static /* synthetic */ Object ipc$super(kj0 kj0Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/accs/net/AlarmHeartBeatMgr");
    }

    @Override // tb.gva
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return "alarm";
    }

    @Override // tb.gva
    public void g(int i) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aa6bcc8", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.d == null) {
            this.d = (AlarmManager) this.f20255a.getSystemService("alarm");
        }
        if (this.d == null) {
            ALog.e("AlarmHeartBeatMgr", "setInner null", new Object[0]);
            return;
        }
        if (Build.VERSION.SDK_INT < 31) {
            z = false;
        }
        if (this.c == null) {
            Intent intent = new Intent();
            intent.setPackage(this.f20255a.getPackageName());
            intent.addFlags(32);
            intent.setAction(Constants.ACTION_COMMAND);
            intent.putExtra("command", -1);
            this.c = ya.e(this.f20255a, 0, intent, z ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 0);
        }
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(System.currentTimeMillis());
        instance.add(13, i);
        this.d.set(0, instance.getTimeInMillis(), this.c);
    }
}
