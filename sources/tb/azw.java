package tb;

import android.taobao.windvane.extra.uc.WVUCWebView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class azw extends vx1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean g;
    public final WVUCWebView h;
    public final xyw i;

    static {
        t2o.a(468713913);
    }

    public azw(WVUCWebView wVUCWebView, xyw xywVar) {
        this.h = wVUCWebView;
        this.i = xywVar;
    }

    public static /* synthetic */ Object ipc$super(azw azwVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/card/cards/base/layer/interactive/eventhandler/WebCardH5MessageHandler");
    }

    public final void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9b3882", new Object[]{this});
        } else if (this.g && !((HashSet) this.f).isEmpty()) {
            this.e = 2;
        }
    }

    public final void v(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c83a25e", new Object[]{this, list});
        } else if (((HashSet) this.f).isEmpty()) {
            this.f.addAll(list);
            t();
            u();
        }
    }

    public void w(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77f7861e", new Object[]{this, new Boolean(z)});
            return;
        }
        this.g = z;
        t();
    }

    @Override // tb.vx1, tb.lr9
    public void k(vrp vrpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff433aad", new Object[]{this, vrpVar});
        } else if (vrpVar.c.equals("registerfilter")) {
            List o = o(vrpVar);
            if (o != null) {
                v(o);
            }
        } else if (this.h != null) {
            int i = this.e;
            if (i == 2) {
                try {
                    this.i.z1("videomsg", (JSONObject) vrpVar.a());
                } catch (Exception e) {
                    ir9.c("WebCardH5MessageHandler", "", e);
                }
            } else if (i != 3 && i != 4) {
                if (((ArrayList) this.f30309a).size() < 200) {
                    ((ArrayList) this.f30309a).add(vrpVar);
                } else {
                    ir9.b("WebCardH5MessageHandler", "pendingMsg reach 200");
                }
            }
        }
    }

    @Override // tb.vx1, tb.lr9
    public boolean j(vrp vrpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36367361", new Object[]{this, vrpVar})).booleanValue();
        }
        return (!vrpVar.c.equals("registerfilter") || l(vrpVar.d)) && ((HashSet) this.f).contains(vrpVar.c) && (vrpVar.d.equals(this.b) || "VSMSG_syncPageMap".equals(vrpVar.c) || "VSMSG_syncProcessMap".equals(vrpVar.c));
    }

    public final boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c22b2343", new Object[]{this})).booleanValue();
        }
        if (this.e != 2 || ((ArrayList) this.f30309a).isEmpty()) {
            return false;
        }
        Iterator it = ((ArrayList) this.f30309a).iterator();
        while (it.hasNext()) {
            vrp vrpVar = (vrp) it.next();
            if (((HashSet) this.f).contains(vrpVar.c) && l(vrpVar.d)) {
                try {
                    this.i.z1("videomsg", (JSONObject) vrpVar.a());
                } catch (Exception e) {
                    ir9.c("WebCardH5MessageHandler", "", e);
                }
            }
        }
        ((ArrayList) this.f30309a).clear();
        return true;
    }
}
