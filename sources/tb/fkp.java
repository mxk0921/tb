package tb;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.ITBPublicMenu;
import com.taobao.uikit.actionbar.ShareContentCallBack;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenuItem;
import com.ut.share.business.ShareContent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class fkp implements tpd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public qpu f19366a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a<T> implements ShareContentCallBack<Object> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ShareContent f19367a;

        public a(ShareContent shareContent) {
            this.f19367a = shareContent;
        }

        @Override // com.taobao.uikit.actionbar.ShareContentCallBack
        public final Object getQueryShareParameters() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("febe4434", new Object[]{this});
            }
            return this.f19367a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b implements ITBPublicMenu {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ JSONObject b;
        public final /* synthetic */ TBPublicMenu c;

        public b(JSONObject jSONObject, TBPublicMenu tBPublicMenu) {
            this.b = jSONObject;
            this.c = tBPublicMenu;
        }

        @Override // com.taobao.uikit.actionbar.ITBPublicMenu
        public TBPublicMenu getPublicMenu() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TBPublicMenu) ipChange.ipc$dispatch("1f3d234e", new Object[]{this});
            }
            return this.c;
        }

        @Override // com.taobao.uikit.actionbar.ITBPublicMenu
        public Bundle pageUserInfo() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bundle) ipChange.ipc$dispatch("65615653", new Object[]{this});
            }
            return fkp.r(fkp.this, this.b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class c implements TBPublicMenu.TBOnPublicMenuClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(gli gliVar) {
        }

        @Override // com.taobao.uikit.actionbar.TBPublicMenu.TBOnPublicMenuClickListener
        public final void onPublicMenuItemClicked(TBPublicMenuItem tBPublicMenuItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("478e7772", new Object[]{this, tBPublicMenuItem});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class d implements TBPublicMenu.TBOnMenuHidedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TBPublicMenu f19369a;

        public d(TBPublicMenu tBPublicMenu) {
            this.f19369a = tBPublicMenu;
        }

        @Override // com.taobao.uikit.actionbar.TBPublicMenu.TBOnMenuHidedListener
        public final void onMenuHided() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("143e58ab", new Object[]{this});
            } else {
                this.f19369a.clearExternalMenus();
            }
        }
    }

    static {
        t2o.a(919601338);
        t2o.a(919601335);
    }

    public static final /* synthetic */ Bundle r(fkp fkpVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("f61d05bf", new Object[]{fkpVar, jSONObject});
        }
        return fkpVar.x(jSONObject);
    }

    public final TBPublicMenu B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPublicMenu) ipChange.ipc$dispatch("1f3d234e", new Object[]{this});
        }
        qpu qpuVar = this.f19366a;
        if (qpuVar != null) {
            Context context = qpuVar.getContext();
            TBPublicMenu publicMenu = context instanceof ITBPublicMenu ? ((ITBPublicMenu) context).getPublicMenu() : null;
            if (publicMenu != null) {
                return publicMenu;
            }
            qpu qpuVar2 = this.f19366a;
            if (qpuVar2 != null) {
                View L = L(qpuVar2);
                int i = R.id.turbo_share_more_menu_tag;
                Object tag = L.getTag(i);
                if (tag instanceof TBPublicMenu) {
                    return (TBPublicMenu) tag;
                }
                if (context != null) {
                    TBPublicMenu tBPublicMenu = new TBPublicMenu((Activity) context);
                    L.setTag(i, tBPublicMenu);
                    return tBPublicMenu;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
            }
            ckf.y("context");
            throw null;
        }
        ckf.y("context");
        throw null;
    }

    public final View L(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b0c61b3a", new Object[]{this, qpuVar});
        }
        return ((b7d) qpuVar.getService(b7d.class)).getView();
    }

    public final ShareContent M(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareContent) ipChange.ipc$dispatch("5aa0d335", new Object[]{this, jSONObject});
        }
        String string = jSONObject.getString("title");
        String string2 = jSONObject.getString("businessId");
        String string3 = jSONObject.getString("contentType");
        String string4 = jSONObject.getString("desc");
        if (TextUtils.isEmpty(string4)) {
            string4 = jSONObject.getString("description");
        }
        if (TextUtils.isEmpty(string4)) {
            string4 = jSONObject.getString("text");
        }
        String string5 = jSONObject.getString("url");
        String string6 = jSONObject.getString("templateId");
        String string7 = jSONObject.getString("image");
        String string8 = jSONObject.getString("shareScene");
        JSONObject jSONObject2 = jSONObject.getJSONObject("templateParams");
        ckf.f(jSONObject2, "share.getJSONObject(\"templateParams\")");
        JSONObject jSONObject3 = jSONObject.getJSONObject("extendParams");
        ShareContent shareContent = new ShareContent();
        shareContent.shareScene = string8;
        shareContent.title = string;
        shareContent.imageUrl = string7;
        shareContent.businessId = string2;
        shareContent.description = string4;
        shareContent.contentType = string3;
        shareContent.url = string5;
        shareContent.extendParams = mqu.Companion.a(jSONObject3);
        shareContent.templateId = string6;
        shareContent.templateParams = jSONObject2;
        return shareContent;
    }

    @Override // tb.sod
    public void onCreateService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9b2eb95", new Object[]{this, qpuVar});
            return;
        }
        ckf.g(qpuVar, "context");
        this.f19366a = qpuVar;
    }

    @Override // tb.sod
    public void onDestroyService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673e3e35", new Object[]{this, qpuVar});
        } else {
            ckf.g(qpuVar, "context");
        }
    }

    public final Bundle x(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("bbef1682", new Object[]{this, jSONObject});
        }
        Bundle bundle = new Bundle();
        Set<String> keySet = jSONObject.keySet();
        ckf.f(keySet, "report.keys");
        for (String str : keySet) {
            Object obj = jSONObject.get(str);
            if (obj instanceof JSONObject) {
                bundle.putBundle(str, x((JSONObject) obj));
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else {
                bundle.putString(str, String.valueOf(obj));
            }
        }
        return bundle;
    }

    @Override // tb.tpd
    public void p1(JSONObject jSONObject, gli gliVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74d22b10", new Object[]{this, jSONObject, gliVar});
            return;
        }
        ckf.g(jSONObject, "params");
        TBPublicMenu B = B();
        JSONObject jSONObject2 = jSONObject.getJSONObject(oj8.SHARE_CONTENT_KEY);
        ckf.f(jSONObject2, "share");
        ShareContent M = M(jSONObject2);
        if (M.businessId != null) {
            B.setShareContentCallBack(new a(M));
        } else {
            B.setShareContentCallBack(null);
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("reportArgs");
        if (jSONObject3 != null) {
            B.setReportArguments(new b(jSONObject3, B));
        } else {
            B.setReportArguments(null);
        }
        B.clearExternalMenus();
        ArrayList<TBPublicMenuItem> arrayList = new ArrayList<>();
        JSONArray jSONArray = jSONObject.getJSONArray("menuList");
        for (int i = 0; jSONArray != null && i < jSONArray.size(); i++) {
            JSONObject jSONObject4 = jSONArray.getJSONObject(i);
            int intValue = jSONObject4.getIntValue("id");
            String string = jSONObject4.getString("iconFontName");
            String string2 = jSONObject4.getString("title");
            Boolean bool = jSONObject4.getBoolean("closeAfterClick");
            TBPublicMenuItem.Builder builder = new TBPublicMenuItem.Builder();
            TBPublicMenuItem.Builder id = builder.setId(intValue);
            id.setTitle(string + f7l.CONDITION_IF_MIDDLE + string2);
            if (bool == null || bool.booleanValue()) {
                builder.setMenuNeedtoBeClosedAfterItemClicked(true);
            } else {
                builder.setMenuNeedtoBeClosedAfterItemClicked(false);
            }
            arrayList.add(builder.build());
        }
        B.addExternalMenus(arrayList, new c(gliVar));
        B.setOnMenuHidedListener(new d(B));
        B.show();
    }
}
