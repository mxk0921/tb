package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class jeg implements Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final jeg INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    public static final Handler f21956a;

    static {
        t2o.a(507510805);
        jeg jegVar = new jeg();
        INSTANCE = jegVar;
        f21956a = new Handler(Looper.getMainLooper(), jegVar);
    }

    public final void a(wdg wdgVar) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fb54888", new Object[]{this, wdgVar});
            return;
        }
        ckf.g(wdgVar, "callmethod");
        ajc g = wdgVar.g();
        if (g != null) {
            obj = g.getJsObject(wdgVar.d());
        } else {
            obj = null;
        }
        if (obj == null) {
            b(5, wdgVar);
        } else if (obj instanceof tdg) {
            wdgVar.h(obj);
            b(0, wdgVar);
        } else {
            b(5, wdgVar);
        }
    }

    public final void b(int i, wdg wdgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("198e0f32", new Object[]{this, new Integer(i), wdgVar});
            return;
        }
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.obj = wdgVar;
        f21956a.sendMessage(obtain);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        ckf.g(message, "msg");
        Object obj = message.obj;
        String str2 = null;
        if (!(obj instanceof wdg)) {
            obj = null;
        }
        wdg wdgVar = (wdg) obj;
        if (wdgVar == null) {
            keg.d(6, "CallMethod is null, and do nothing", null);
            return false;
        }
        vdg vdgVar = new vdg(wdgVar.g(), wdgVar.d(), wdgVar.c(), wdgVar.f(), wdgVar.b());
        int i = message.what;
        if (i == 0) {
            Object a2 = wdgVar.a();
            if (a2 instanceof tdg) {
                str2 = a2;
            }
            tdg tdgVar = (tdg) str2;
            if (TextUtils.isEmpty(wdgVar.e())) {
                str = "{}";
            } else {
                str = wdgVar.e();
            }
            if (tdgVar == null) {
                b(5, wdgVar);
            } else if (!tdgVar.executeSafe(wdgVar.c(), str, vdgVar)) {
                b(6, wdgVar);
            }
        } else if (i == 5) {
            afg afgVar = new afg();
            afgVar.b("HY_NO_CLASS");
            StringBuilder sb = new StringBuilder("No Class Error: method=[");
            sb.append(String.valueOf(wdgVar.d()));
            sb.append(".");
            sb.append(String.valueOf(wdgVar.c()));
            sb.append("],url=[");
            if (vdgVar.c() == null) {
                str2 = "";
            } else {
                ajc c = vdgVar.c();
                if (c != null) {
                    str2 = c.getUrl();
                }
            }
            sb.append(String.valueOf(str2));
            sb.append("]");
            afgVar.a("msg", sb.toString());
            vdgVar.b(afgVar);
            return true;
        } else if (i == 6) {
            afg afgVar2 = new afg();
            afgVar2.b("HY_ERROR_EXECUTE");
            StringBuilder sb2 = new StringBuilder("Execute Error: method=[");
            sb2.append(String.valueOf(wdgVar.d()));
            sb2.append(".");
            sb2.append(String.valueOf(wdgVar.c()));
            sb2.append("],url=[");
            if (vdgVar.c() == null) {
                str2 = "";
            } else {
                ajc c2 = vdgVar.c();
                if (c2 != null) {
                    str2 = c2.getUrl();
                }
            }
            sb2.append(String.valueOf(str2));
            sb2.append("]");
            afgVar2.a("msg", sb2.toString());
            vdgVar.b(afgVar2);
            return true;
        }
        return false;
    }
}
