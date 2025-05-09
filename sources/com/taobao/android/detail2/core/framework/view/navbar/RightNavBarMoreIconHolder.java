package com.taobao.android.detail2.core.framework.view.navbar;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.ITBPublicMenu;
import com.taobao.uikit.actionbar.ShareContentCallBack;
import com.taobao.uikit.actionbar.TBActionView;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenuItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.cxj;
import tb.dh7;
import tb.g1j;
import tb.qkp;
import tb.seo;
import tb.t2o;
import tb.ueo;
import tb.x3w;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class RightNavBarMoreIconHolder extends RightNavBarIconHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final TBPublicMenu d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements TBPublicMenu.TBOnOverflowButtonClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.uikit.actionbar.TBPublicMenu.TBOnOverflowButtonClickListener
        public void onOverflowButtonClicked() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ddc419b", new Object[]{this});
                return;
            }
            RightNavBarMoreIconHolder rightNavBarMoreIconHolder = RightNavBarMoreIconHolder.this;
            seo seoVar = rightNavBarMoreIconHolder.c;
            if (seoVar != null) {
                rightNavBarMoreIconHolder.e0(seoVar);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements TBPublicMenu.TBOnPublicMenuClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.uikit.actionbar.TBPublicMenu.TBOnPublicMenuClickListener
        public void onPublicMenuItemClicked(TBPublicMenuItem tBPublicMenuItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("478e7772", new Object[]{this, tBPublicMenuItem});
            } else if (tBPublicMenuItem != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ndType", (Object) tBPublicMenuItem.getName());
                RightNavBarMoreIconHolder.this.b.M0("cusNaviClicked", jSONObject);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements ITBPublicMenu {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(352322099);
            t2o.a(927989771);
        }

        public c() {
        }

        @Override // com.taobao.uikit.actionbar.ITBPublicMenu
        public TBPublicMenu getPublicMenu() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TBPublicMenu) ipChange.ipc$dispatch("1f3d234e", new Object[]{this});
            }
            return null;
        }

        @Override // com.taobao.uikit.actionbar.ITBPublicMenu
        public Bundle pageUserInfo() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bundle) ipChange.ipc$dispatch("65615653", new Object[]{this});
            }
            return g1j.a(RightNavBarMoreIconHolder.this.c.b().L);
        }

        public /* synthetic */ c(RightNavBarMoreIconHolder rightNavBarMoreIconHolder, a aVar) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements ShareContentCallBack {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(352322100);
            t2o.a(927989801);
        }

        public d() {
        }

        @Override // com.taobao.uikit.actionbar.ShareContentCallBack
        public Object getQueryShareParameters() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("febe4434", new Object[]{this});
            }
            seo seoVar = RightNavBarMoreIconHolder.this.c;
            if (seoVar == null || seoVar.b() == null) {
                return null;
            }
            return qkp.a(RightNavBarMoreIconHolder.this.c.b().L);
        }

        public /* synthetic */ d(RightNavBarMoreIconHolder rightNavBarMoreIconHolder, a aVar) {
            this();
        }
    }

    static {
        t2o.a(352322096);
    }

    public RightNavBarMoreIconHolder(TBActionView tBActionView, dh7 dh7Var, cxj cxjVar) {
        super(tBActionView, dh7Var, cxjVar);
        Activity activity;
        if (cxjVar.i() != null) {
            activity = cxjVar.i();
        } else {
            activity = (Activity) tBActionView.getContext();
        }
        TBPublicMenu tBPublicMenu = new TBPublicMenu(activity, new c(this, null));
        this.d = tBPublicMenu;
        tBPublicMenu.setCustomOverflow(tBActionView);
        tBPublicMenu.setShareContentCallBack(new d(this, null));
        tBPublicMenu.setOnOverflowButtonClickListener(new a());
    }

    public static RightNavBarIconHolder f0(ViewGroup viewGroup, dh7 dh7Var, cxj cxjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RightNavBarIconHolder) ipChange.ipc$dispatch("edfab863", new Object[]{viewGroup, dh7Var, cxjVar});
        }
        TBActionView tBActionView = (TBActionView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.detail_nav_more_layout, (ViewGroup) null, false);
        tBActionView.setTitle(viewGroup.getContext().getString(R.string.new_detail_menu_more_text));
        return new RightNavBarMoreIconHolder(tBActionView, dh7Var, cxjVar);
    }

    public static /* synthetic */ Object ipc$super(RightNavBarMoreIconHolder rightNavBarMoreIconHolder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/view/navbar/RightNavBarMoreIconHolder");
    }

    @Override // com.taobao.android.detail2.core.framework.view.navbar.RightNavBarIconHolder
    public void c0(seo seoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45b1c4ea", new Object[]{this, seoVar});
            return;
        }
        View view = this.itemView;
        if (view instanceof TBActionView) {
            ((TBActionView) view).setIconColor(seoVar.g());
        }
        g0();
    }

    public void g0() {
        x3w b2;
        List<ueo> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41eeed7", new Object[]{this});
            return;
        }
        seo seoVar = this.c;
        if (seoVar != null && (b2 = seoVar.b()) != null && (list = b2.V) != null) {
            ArrayList<TBPublicMenuItem> arrayList = new ArrayList<>();
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                ueo ueoVar = (ueo) it.next();
                if (ueoVar != null && !TextUtils.isEmpty(ueoVar.c()) && !TextUtils.isEmpty(ueoVar.a()) && !TextUtils.isEmpty(ueoVar.b())) {
                    TBPublicMenuItem.Builder builder = new TBPublicMenuItem.Builder();
                    builder.setName(ueoVar.c());
                    builder.setTitle(ueoVar.a() + ":" + ueoVar.b());
                    TBPublicMenuItem build = builder.build();
                    if (build != null) {
                        arrayList.add(build);
                    }
                }
            }
            if (this.d != null && !arrayList.isEmpty()) {
                this.d.clearExternalMenus();
                this.d.addExternalMenus(arrayList, new b());
            }
        }
    }
}
