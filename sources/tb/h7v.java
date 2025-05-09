package tb;

import android.text.TextUtils;
import com.alibaba.android.ultron.vfw.core.ViewEngine;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class h7v implements iwb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ViewEngine f20460a;
    public xit b;
    public final ly<List<DXTemplateItem>> c;
    public final ly<List<DXTemplateItem>> d;
    public final wz<Boolean, List<zh6>> e;

    static {
        t2o.a(157286723);
        t2o.a(444596939);
    }

    public h7v(ViewEngine viewEngine, ly<List<DXTemplateItem>> lyVar, ly<List<DXTemplateItem>> lyVar2, wz<Boolean, List<zh6>> wzVar) {
        this.f20460a = viewEngine;
        this.c = lyVar;
        this.d = lyVar2;
        this.e = wzVar;
    }

    public final void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1308820b", new Object[]{this, str, str2, str3});
            return;
        }
        rfw rfwVar = (rfw) this.f20460a.a0(rfw.class);
        if (rfwVar != null) {
            rfwVar.onError(str, str2, str3);
        }
    }

    public final IDMComponent c(List<IDMComponent> list, String str) {
        JSONObject containerInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("c21f8829", new Object[]{this, list, str});
        }
        if (list != null && !TextUtils.isEmpty(str)) {
            for (IDMComponent iDMComponent : list) {
                if (!(iDMComponent == null || (containerInfo = iDMComponent.getContainerInfo()) == null)) {
                    String string = containerInfo.getString("name");
                    if (str != null && str.equals(string)) {
                        return iDMComponent;
                    }
                }
            }
        }
        return null;
    }

    public void d(xit xitVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c629c4b", new Object[]{this, xitVar});
        } else {
            this.b = xitVar;
        }
    }

    @Override // tb.iwb
    public void onNotificationListener(k66 k66Var) {
        Boolean a2;
        int i;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f1f5baf", new Object[]{this, k66Var});
            return;
        }
        String I = this.f20460a.I();
        if (k66Var == null) {
            hav.a(I, "DX下载失败，返回了空");
            return;
        }
        try {
            List<zh6> list = k66Var.c;
            if (list != null) {
                for (zh6 zh6Var : list) {
                    if (zh6Var != null && (i = zh6Var.c) == 1000) {
                        DXTemplateItem dXTemplateItem = zh6Var.f32770a;
                        if (dXTemplateItem != null) {
                            str = dXTemplateItem.f7343a;
                        } else {
                            str = "";
                        }
                        a(str, "componentRenderError", String.valueOf(i));
                    }
                }
            }
        } catch (Throwable unused) {
            hav.d(I, "onNotificationListener异常，之前的注册");
        }
        List<DXTemplateItem> list2 = k66Var.f22428a;
        List<DXTemplateItem> list3 = k66Var.b;
        List<zh6> list4 = k66Var.c;
        this.c.a(list2);
        if (this.b != null) {
            yit yitVar = new yit();
            ajt.c(list2);
            yitVar.f32119a = ajt.c(list3);
            ((i7v) this.b).a(yitVar);
        }
        if (list2 != null && list2.size() > 0 && this.f20460a.J() == 2) {
            this.d.a(list2);
            if (b(I, list2)) {
                hav.d(I, "下载DX后差量刷新，模板个数：" + list2.size());
                return;
            }
            this.f20460a.z0(127);
        }
        if (sh4.c(this.f20460a.K()) && list4 != null && list4.size() > 0 && (a2 = this.e.a(list4)) != null && a2.booleanValue()) {
            this.f20460a.z0(127);
        }
    }

    public final boolean b(String str, List<DXTemplateItem> list) {
        et6 N;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("44eeeee6", new Object[]{this, str, list})).booleanValue();
        }
        if (!vav.a(str, "diffRefreshWhenDownloadDXFinished", false) || (N = this.f20460a.N()) == null) {
            return false;
        }
        List<IDMComponent> a2 = N.a();
        List<IDMComponent> h = N.h();
        List<IDMComponent> f = N.f();
        ArrayList arrayList = new ArrayList();
        for (DXTemplateItem dXTemplateItem : list) {
            IDMComponent c = c(a2, dXTemplateItem.f7343a);
            if (c != null) {
                if (h.contains(c) || f.contains(c)) {
                    return false;
                }
                arrayList.add(c);
                hav.d(str, "差量刷新：" + c.getKey());
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        this.f20460a.K0(arrayList);
        return true;
    }
}
