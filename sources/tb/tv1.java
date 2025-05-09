package tb;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.dve;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class tv1 extends nv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public xue f28978a;
    public n2c b;
    public e6d c;
    public xxd d;
    public ejb e;
    public hed f;
    public vkd g;
    public e8e h;
    public dzc i;
    public oqb j;
    public m4d k;
    public sad l;

    public tv1(fdc fdcVar, String str) {
        super(fdcVar);
        a(fdcVar, str);
    }

    public static /* synthetic */ Object ipc$super(tv1 tv1Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/oversea/homepage/common/controller/BaseInfoFlowController");
    }

    public final void a(fdc fdcVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("657b41b6", new Object[]{this, fdcVar, str});
            return;
        }
        l9t.a(new dve.b(new yft()));
        xue b = b(fdcVar, str);
        this.f28978a = b;
        if (b != null) {
            n2c b2 = b.b();
            this.b = b2;
            this.c = b2.e();
            this.d = this.b.d();
            ejb b3 = this.b.b();
            this.e = b3;
            this.f = b3.getPullDownRefreshInvoker();
            this.g = this.e.getRocketInvoker();
            this.h = this.e.getUtInvoker();
            this.g = this.e.getRocketInvoker();
            this.j = this.e.getContainerInvoker();
            this.i = this.e.getNaviBarInvoker();
            this.k = this.e.getOutLinkInvoker();
            this.l = this.e.getPopInvoker();
        }
    }

    public abstract xue b(fdc fdcVar, String str);

    @Override // com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public View createView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("79a2c742", new Object[]{this, context});
        }
        n2c n2cVar = this.b;
        if (n2cVar == null) {
            return new View(context);
        }
        return n2cVar.c(context);
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public int getSubContainerScrollY() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("745ec8f", new Object[]{this})).intValue();
        }
        oqb oqbVar = this.j;
        if (oqbVar != null) {
            return oqbVar.e();
        }
        return 0;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public JSONObject getSubTabSearchBarData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bab9b3d1", new Object[]{this});
        }
        dzc dzcVar = this.i;
        if (dzcVar != null) {
            return dzcVar.getSubTabSearchBarData();
        }
        return null;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public String getUpdatePageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("111ff600", new Object[]{this});
        }
        e8e e8eVar = this.h;
        if (e8eVar != null) {
            return e8eVar.getUpdatePageName();
        }
        return null;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public Map<String, String> getUpdatePageProperties() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("30e122fd", new Object[]{this});
        }
        e8e e8eVar = this.h;
        if (e8eVar != null) {
            return e8eVar.getUpdatePageProperties();
        }
        return null;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public String getUpdatePageUtParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a4393099", new Object[]{this});
        }
        e8e e8eVar = this.h;
        if (e8eVar != null) {
            return e8eVar.getUpdatePageUtParam();
        }
        return null;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean isEnablePullReFresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b20c9b34", new Object[]{this})).booleanValue();
        }
        hed hedVar = this.f;
        if (hedVar != null) {
            return hedVar.isEnablePullReFresh();
        }
        return true;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean isEnableToSecondFloor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c45f0bb", new Object[]{this})).booleanValue();
        }
        hed hedVar = this.f;
        if (hedVar != null) {
            return hedVar.isEnableToSecondFloor();
        }
        return false;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean isHandleUpAndDownScrollingEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f36d8fc", new Object[]{this})).booleanValue();
        }
        oqb oqbVar = this.j;
        if (oqbVar != null) {
            return oqbVar.a();
        }
        return false;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean isOnRocketState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6f1c3f", new Object[]{this})).booleanValue();
        }
        vkd vkdVar = this.g;
        if (vkdVar != null) {
            return vkdVar.isOnRocketState();
        }
        return false;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean isReachTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36ef4cb7", new Object[]{this})).booleanValue();
        }
        oqb oqbVar = this.j;
        if (oqbVar != null) {
            return oqbVar.isReachTop();
        }
        return true;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void notifyOutLinkParams(Intent intent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac20293", new Object[]{this, intent, str});
            return;
        }
        m4d m4dVar = this.k;
        if (m4dVar != null) {
            m4dVar.notifyOutLinkParams(intent, str);
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onClickRocket() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41ace924", new Object[]{this});
            return;
        }
        vkd vkdVar = this.g;
        if (vkdVar != null) {
            vkdVar.onClickRocket();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        e6d e6dVar = this.c;
        if (e6dVar != null && this.f28978a != null) {
            e6dVar.onDestroy();
            this.f28978a.a();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onPageSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90abdd0", new Object[]{this});
            return;
        }
        xxd xxdVar = this.d;
        if (xxdVar != null) {
            xxdVar.onPageSelected();
        }
        sad sadVar = this.l;
        if (sadVar != null) {
            sadVar.onPopTabSelected();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onPageUnSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dadaf89", new Object[]{this});
            return;
        }
        xxd xxdVar = this.d;
        if (xxdVar != null) {
            xxdVar.onPageUnSelected();
        }
        sad sadVar = this.l;
        if (sadVar != null) {
            sadVar.onPopTabUnSelected();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        e6d e6dVar = this.c;
        if (e6dVar != null) {
            e6dVar.onPause();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onPullRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24224e7e", new Object[]{this});
            return;
        }
        hed hedVar = this.f;
        if (hedVar != null) {
            hedVar.onPullRefresh();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        e6d e6dVar = this.c;
        if (e6dVar != null) {
            e6dVar.onResume();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onWillExit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bc02c16", new Object[]{this});
            return;
        }
        e6d e6dVar = this.c;
        if (e6dVar != null) {
            e6dVar.onWillExit();
        }
    }
}
