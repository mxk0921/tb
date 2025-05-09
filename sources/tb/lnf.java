package tb;

import android.graphics.Bitmap;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.widget.kernal.TMSWidgetEngine;
import tb.rde;
import tb.wde;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class lnf extends d9s implements wde {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final ITMSPage e;

    static {
        t2o.a(852492333);
        t2o.a(852492348);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lnf(ITMSPage iTMSPage, ocs ocsVar) {
        super(iTMSPage, ocsVar);
        ckf.g(iTMSPage, "page");
        ckf.g(ocsVar, "renderListener");
        this.e = iTMSPage;
        iTMSPage.x(this);
    }

    public static /* synthetic */ Object ipc$super(lnf lnfVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1983604863) {
            super.destroy();
            return null;
        } else if (hashCode == 1192889117) {
            super.s();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/themis/widget/group/IsomorphicWidgetRender");
        }
    }

    @Override // tb.z5d
    public void G(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fea6c5d4", new Object[]{this, iTMSPage});
        } else {
            wde.a.b(this, iTMSPage);
        }
    }

    @Override // tb.qcs
    public void P(String str, JSON json) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb823f9b", new Object[]{this, str, json});
            return;
        }
        ckf.g(str, "event");
        TMSWidgetEngine.WidgetRenderInstance widgetRenderInstance = (TMSWidgetEngine.WidgetRenderInstance) this.d.g(TMSWidgetEngine.WidgetRenderInstance.class);
        if (widgetRenderInstance != null) {
            widgetRenderInstance.D(str, json);
        }
    }

    @Override // tb.rde
    public void T0(rde.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7491661c", new Object[]{this, aVar});
        } else {
            ckf.g(aVar, "callback");
        }
    }

    @Override // tb.d9s, tb.qcs
    public void X0(String str, JSON json) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1761c13a", new Object[]{this, str, json});
            return;
        }
        ckf.g(str, "event");
        TMSWidgetEngine.WidgetRenderInstance widgetRenderInstance = (TMSWidgetEngine.WidgetRenderInstance) this.d.g(TMSWidgetEngine.WidgetRenderInstance.class);
        if (widgetRenderInstance != null) {
            widgetRenderInstance.D(str, json);
        }
    }

    @Override // tb.wde
    public void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("313409ce", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, "errorCode");
        ckf.g(str2, "errorMsg");
        this.b.b(str, str2);
    }

    @Override // tb.z5d
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896696a2", new Object[]{this});
        } else {
            wde.a.c(this);
        }
    }

    @Override // tb.d9s, tb.qcs
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        TMSWidgetEngine.WidgetRenderInstance widgetRenderInstance = (TMSWidgetEngine.WidgetRenderInstance) this.d.g(TMSWidgetEngine.WidgetRenderInstance.class);
        if (widgetRenderInstance != null) {
            widgetRenderInstance.A();
        }
        super.destroy();
    }

    @Override // tb.qcs
    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e88638d3", new Object[]{this});
        }
        return "IsomorphicWidget";
    }

    @Override // tb.qcs
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return null;
    }

    @Override // tb.qcs
    public Bitmap l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("ea6f4fbb", new Object[]{this});
        }
        return null;
    }

    @Override // tb.qcs
    public void n(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("245d3ac6", new Object[]{this, str, str2});
        } else {
            ckf.g(str, "script");
        }
    }

    @Override // tb.qcs
    public void r(byte[] bArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15684483", new Object[]{this, bArr, str});
        } else {
            ckf.g(bArr, "script");
        }
    }

    @Override // tb.d9s, tb.qcs
    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("471a0b1d", new Object[]{this});
            return;
        }
        super.s();
        TMSWidgetEngine.WidgetRenderInstance widgetRenderInstance = (TMSWidgetEngine.WidgetRenderInstance) this.d.g(TMSWidgetEngine.WidgetRenderInstance.class);
        if (widgetRenderInstance != null) {
            TMSWidgetEngine.WidgetRenderInstance.N(widgetRenderInstance, null, 1, null);
        }
    }

    @Override // tb.z5d
    public void w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc5065a", new Object[]{this});
        } else {
            wde.a.a(this);
        }
    }
}
