package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.push.model.ClientCtlInfo;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class o3h extends ty1 implements s3c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "LiveRoomOpenPushHandler";
    public boolean c = false;

    static {
        t2o.a(295699635);
        t2o.a(806355016);
    }

    public o3h(Context context) {
        super(context);
        sjr.g().a(this);
    }

    public static /* synthetic */ Object ipc$super(o3h o3hVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/push/handlers/LiveRoomOpenPushHandler");
    }

    @Override // tb.ty1
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            sjr.g().b(this);
        }
    }

    @Override // tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return m4l.OPEN_PUSH_TAG;
    }

    public final ux9 d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ux9) ipChange.ipc$dispatch("59d375df", new Object[]{this});
        }
        ux9 d = vx9.d();
        if (d == null) {
            o3s.b(TAG, "frameContext is null");
        }
        return d;
    }

    public final void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("119ad4c4", new Object[]{this, new Boolean(z)});
            return;
        }
        o3s.b(TAG, "setObstructed: " + z);
        this.c = z;
    }

    public final boolean f(ClientCtlInfo clientCtlInfo) {
        ux9 d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ec2115", new Object[]{this, clientCtlInfo})).booleanValue();
        }
        if (!this.f29028a || this.c || (d = d()) == null || d.k() == null || d9m.n().isListShow((yac) d.k())) {
            return false;
        }
        return lu3.b(b(), d(), clientCtlInfo);
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{uyg.EVENT_LIVE_IMMERSIVE_EXPERIENCE};
    }

    @Override // tb.s3c
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        if (d() == null) {
            return "";
        }
        return d().C();
    }

    @Override // tb.s3c
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if (TextUtils.equals(str, uyg.EVENT_LIVE_IMMERSIVE_EXPERIENCE) && (obj instanceof HashMap)) {
            Object obj2 = ((HashMap) obj).get("isMoveUp");
            if (obj2 instanceof String) {
                e(zqq.d((String) obj2, false));
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007b, code lost:
        if (r4.equals("click") == false) goto L_0x0069;
     */
    @Override // com.taobao.message.notification.openPushAbility.OpenPushProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean openPushHandler(com.alibaba.fastjson.JSONObject r10) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.o3h.openPushHandler(com.alibaba.fastjson.JSONObject):boolean");
    }
}
