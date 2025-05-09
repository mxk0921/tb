package tb;

import android.app.Dialog;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.performance.BTags;
import com.taobao.android.detail.core.standard.widget.lightoff.LightOffDialog;
import com.taobao.android.detail.core.standard.widget.lightoff.model.LightOffFloatModel;
import com.taobao.android.detail.core.standard.widget.lightoff.model.LightOffItemModel;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class oog extends fl6 implements gkc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public mog f25528a;
    public LightOffDialog b;
    public List<gkc> c;

    static {
        t2o.a(438304822);
        t2o.a(438304813);
    }

    public static /* synthetic */ Object ipc$super(oog oogVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/core/standard/widget/lightoff/LightOffPresenter");
    }

    @Override // tb.gkc
    public void b(JSONObject jSONObject, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4350dfe3", new Object[]{this, jSONObject, new Integer(i)});
            return;
        }
        String a2 = pfh.a("LightOffPresenter", BTags.XLightOff);
        tgh.b(a2, "onPageSelected:" + jSONObject.toString());
        for (int i2 = 0; i2 < ((ArrayList) this.c).size(); i2++) {
            if (((ArrayList) this.c).get(i2) != null) {
                ((gkc) ((ArrayList) this.c).get(i2)).b(jSONObject, i);
            }
        }
    }

    @Override // tb.gkc
    public void c(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1b144db", new Object[]{this, objArr});
        } else if (objArr != null && objArr.length != 0) {
            String a2 = pfh.a("LightOffPresenter", BTags.XLightOff);
            tgh.b(a2, "onFloatClickEvent:" + objArr[0]);
            for (int i = 0; i < ((ArrayList) this.c).size(); i++) {
                if (((ArrayList) this.c).get(i) != null) {
                    ((gkc) ((ArrayList) this.c).get(i)).c(objArr);
                }
            }
        }
    }

    @Override // tb.gkc
    public void d(JSONObject jSONObject, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8442a7ff", new Object[]{this, jSONObject, view});
            return;
        }
        tgh.b(pfh.a("LightOffPresenter", BTags.XLightOff), "onItemClick");
        for (int i = 0; i < ((ArrayList) this.c).size(); i++) {
            if (((ArrayList) this.c).get(i) != null) {
                ((gkc) ((ArrayList) this.c).get(i)).d(jSONObject, view);
            }
        }
    }

    @Override // tb.gkc
    public void e(JSONObject jSONObject, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c310536", new Object[]{this, jSONObject, view});
            return;
        }
        tgh.b(pfh.a("LightOffPresenter", BTags.XLightOff), "onLongClick");
        for (int i = 0; i < ((ArrayList) this.c).size(); i++) {
            if (((ArrayList) this.c).get(i) != null) {
                ((gkc) ((ArrayList) this.c).get(i)).e(jSONObject, view);
            }
        }
    }

    public void f(gkc gkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b343db0f", new Object[]{this, gkcVar});
        } else if (gkcVar != null) {
            if (this.c == null) {
                this.c = new ArrayList();
            }
            this.c.remove(gkcVar);
            this.c.add(gkcVar);
        }
    }

    public boolean g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8249dc39", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        LightOffDialog lightOffDialog = this.b;
        if (lightOffDialog == null || !lightOffDialog.isShowing()) {
            return false;
        }
        this.b.q(z);
        return true;
    }

    public Dialog h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("739594b1", new Object[]{this});
        }
        return this.b;
    }

    public void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d416f32", new Object[]{this, new Integer(i)});
            return;
        }
        LightOffDialog lightOffDialog = this.b;
        if (lightOffDialog != null) {
            lightOffDialog.setCurrentItem(i);
        }
    }

    @Override // tb.gkc
    public void onDismiss(DialogInterface dialogInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
            return;
        }
        for (int i = 0; i < ((ArrayList) this.c).size(); i++) {
            if (((ArrayList) this.c).get(i) != null) {
                ((gkc) ((ArrayList) this.c).get(i)).onDismiss(dialogInterface);
            }
        }
    }

    @Override // tb.gkc
    public void onPageScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
            return;
        }
        for (int i2 = 0; i2 < ((ArrayList) this.c).size(); i2++) {
            if (((ArrayList) this.c).get(i2) != null) {
                ((gkc) ((ArrayList) this.c).get(i2)).onPageScrollStateChanged(i);
            }
        }
    }

    @Override // tb.gkc
    public void onPageScrolled(int i, float f, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
            return;
        }
        for (int i3 = 0; i3 < ((ArrayList) this.c).size(); i3++) {
            if (((ArrayList) this.c).get(i3) != null) {
                ((gkc) ((ArrayList) this.c).get(i3)).onPageScrolled(i, f, i2);
            }
        }
    }

    @Override // tb.gkc
    public void onShow(DialogInterface dialogInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d64de6c3", new Object[]{this, dialogInterface});
            return;
        }
        for (int i = 0; i < ((ArrayList) this.c).size(); i++) {
            if (((ArrayList) this.c).get(i) != null) {
                ((gkc) ((ArrayList) this.c).get(i)).onShow(dialogInterface);
            }
        }
    }

    public boolean j(mog mogVar) {
        String str;
        List<LightOffItemModel> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ffedd269", new Object[]{this, mogVar})).booleanValue();
        }
        String a2 = pfh.a("LightOffPresenter", BTags.XLightOff);
        StringBuilder sb = new StringBuilder("show:");
        if (mogVar != null) {
            str = mogVar.toString();
        } else {
            str = "entryModel is null";
        }
        sb.append(str);
        tgh.b(a2, sb.toString());
        if (mogVar == null || mogVar.f24181a == null || TextUtils.isEmpty(mogVar.b) || (list = mogVar.e) == null || ((ArrayList) list).isEmpty()) {
            return false;
        }
        this.f25528a = mogVar;
        LightOffDialog lightOffDialog = this.b;
        if (lightOffDialog != null && lightOffDialog.isShowing()) {
            return false;
        }
        mog mogVar2 = this.f25528a;
        LightOffDialog lightOffDialog2 = new LightOffDialog(mogVar2.f24181a, mogVar2, this);
        this.b = lightOffDialog2;
        lightOffDialog2.show();
        return true;
    }

    public void k(LightOffFloatModel lightOffFloatModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a86fa4b4", new Object[]{this, lightOffFloatModel});
        } else if (lightOffFloatModel == null) {
            tgh.b(pfh.a("LightOffPresenter", BTags.XLightOff), "updateBottomInfo params null");
        } else {
            String a2 = pfh.a("LightOffPresenter", BTags.XLightOff);
            tgh.b(a2, "updateBottomInfo params:" + lightOffFloatModel.toString());
            this.b.x(lightOffFloatModel);
        }
    }
}
