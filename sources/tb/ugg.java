package tb;

import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.g;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ugg extends v80 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String c;
    public String d;
    public long e;

    static {
        t2o.a(349175903);
    }

    public ugg(String str, int i) {
        super(str, i);
    }

    public static /* synthetic */ Object ipc$super(ugg uggVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/adaemon/chains/LaunchTbAction");
    }

    @Override // tb.v80
    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f571fd04", new Object[]{this, str});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.c = jSONObject.optString(MspGlobalDefine.UA);
            this.d = jSONObject.optString(yj4.PARAM_INTENT_URL);
            long optLong = jSONObject.optLong("clientTimestamp");
            this.e = optLong;
            s55.i("LauncherTbAction", "parse succ", MspGlobalDefine.UA, this.c, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, this.d, "reqTimeInMill", Long.valueOf(optLong));
        } catch (Exception e) {
            s55.h("LauncherTbAction", "parse err", e, new Object[0]);
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // tb.v80
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
            return;
        }
        Long l = null;
        try {
            if (!g.P()) {
                b();
            } else if (TextUtils.isEmpty(this.d)) {
                s55.i("LauncherTbAction", "empty uri", new Object[0]);
                b();
            } else {
                if (!TextUtils.isEmpty(this.c)) {
                    String str = this.c;
                    String str2 = Build.MODEL;
                    if (!str.contains(str2)) {
                        s55.i("LauncherTbAction", "model err", "model", str2);
                        b();
                        return;
                    }
                }
                if (this.e > 0) {
                    long currentTimeMillis = System.currentTimeMillis() - this.e;
                    l = Long.valueOf(currentTimeMillis);
                    if (currentTimeMillis > 10000) {
                        s55.i("LauncherTbAction", "wait too long", "timeDiff", l);
                        b();
                        s55.i("LauncherTbAction", "timeDiff: " + l, new Object[0]);
                        return;
                    }
                }
                Intent parseUri = Intent.parseUri(this.d, 0);
                parseUri.addFlags(268435456);
                g.l().startActivity(parseUri);
                b();
                if (l != null) {
                    s55.i("LauncherTbAction", "timeDiff: " + l, new Object[0]);
                }
            }
        } catch (Throwable th) {
            try {
                s55.h("LauncherTbAction", "execute err", th, new Object[0]);
                b();
                if (0 != 0) {
                    s55.i("LauncherTbAction", "timeDiff: " + ((Object) null), new Object[0]);
                }
            } catch (Throwable th2) {
                b();
                if (0 != 0) {
                    s55.i("LauncherTbAction", "timeDiff: " + ((Object) null), new Object[0]);
                }
                throw th2;
            }
        }
    }
}
