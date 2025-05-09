package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.mainpic.viewholder.MainPicDinamicXViewHolder;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class so7 extends u0i {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final DXTemplateItem e;
    public final String f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements mqc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.mqc
        public u0i a(JSONObject jSONObject, com.taobao.android.detail2.core.framework.data.global.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (u0i) ipChange.ipc$dispatch("e47d67cf", new Object[]{this, jSONObject, aVar});
            }
            return new so7(jSONObject);
        }
    }

    static {
        t2o.a(352322147);
    }

    public so7(JSONObject jSONObject) {
        super(jSONObject);
        DXTemplateItem dXTemplateItem = new DXTemplateItem();
        this.e = dXTemplateItem;
        if (jSONObject != null) {
            JSONObject jSONObject2 = this.b;
            if (jSONObject2 != null) {
                this.f = jSONObject2.getString("blurImage");
            }
            JSONObject jSONObject3 = jSONObject.getJSONObject("template");
            if (jSONObject3 != null) {
                dXTemplateItem.f7343a = jSONObject3.getString("name");
                dXTemplateItem.b = url.a(jSONObject3.getString("version"), 1L);
                dXTemplateItem.c = jSONObject3.getString("url");
            }
        }
    }

    public static mqc h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mqc) ipChange.ipc$dispatch("953ef438", new Object[0]);
        }
        return new a();
    }

    public static /* synthetic */ Object ipc$super(so7 so7Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/mainpic/model/DinamicXModel");
    }

    @Override // tb.u0i
    public boolean a(u0i u0iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ddeb525c", new Object[]{this, u0iVar})).booleanValue();
        }
        return g(u0iVar);
    }

    @Override // tb.u0i
    public boolean b(u0i u0iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba9d6ade", new Object[]{this, u0iVar})).booleanValue();
        }
        return g(u0iVar);
    }

    @Override // tb.u0i
    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a92c3f5e", new Object[]{this});
        }
        return "";
    }

    @Override // tb.u0i
    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return MainPicDinamicXViewHolder.h + this.e.d();
    }

    @Override // tb.u0i
    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3f26fb1", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public boolean g(u0i u0iVar) {
        DXTemplateItem dXTemplateItem;
        DXTemplateItem dXTemplateItem2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f7da415d", new Object[]{this, u0iVar})).booleanValue();
        }
        if (!(u0iVar instanceof so7) || (dXTemplateItem = ((so7) u0iVar).e) == null || (dXTemplateItem2 = this.e) == null || dXTemplateItem.e() == null || dXTemplateItem2.e() == null || !dXTemplateItem.e().equals(dXTemplateItem2.e()) || dXTemplateItem.c() != dXTemplateItem2.c()) {
            return false;
        }
        return true;
    }
}
