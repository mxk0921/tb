package com.taobao.android.layoutmanager.container;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.MenuItemCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.ariver.kernel.RVStartParams;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.procedure.IPage;
import com.taobao.tao.flexbox.layoutmanager.core.TNodeView;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.tao.flexbox.layoutmanager.module.NavigationBarModule;
import com.taobao.tao.flexbox.layoutmanager.view.PullDownCloseLayout;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import tb.bod;
import tb.f21;
import tb.gl4;
import tb.lgs;
import tb.nwv;
import tb.nxb;
import tb.od0;
import tb.s6o;
import tb.t2o;
import tb.uhi;
import tb.uml;
import tb.ye;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class BaseContainerFragment extends Fragment implements PullDownCloseLayout.c, TNodeView.k, o.r {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_INTENT_URI = "INTENT_URI";

    /* renamed from: a  reason: collision with root package name */
    public FrameLayout f8171a;
    public TNodeView c;
    public boolean d;
    public IPage e;
    public ViewGroup f;
    public Uri g;
    public com.taobao.android.layoutmanager.container.a h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements MenuItem.OnMenuItemClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ NavigationBarModule.d f8172a;

        public a(BaseContainerFragment baseContainerFragment, NavigationBarModule.d dVar) {
            this.f8172a = dVar;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f2df3d0b", new Object[]{this, menuItem})).booleanValue();
            }
            this.f8172a.d.a(null, null);
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface b {
        void onFinish();
    }

    static {
        t2o.a(502267983);
        t2o.a(503317475);
        t2o.a(503317197);
        t2o.a(503317152);
    }

    public static /* synthetic */ Object ipc$super(BaseContainerFragment baseContainerFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 382958558:
                super.onCreateOptionsMenu((Menu) objArr[0], (MenuInflater) objArr[1]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/layoutmanager/container/BaseContainerFragment");
        }
    }

    public boolean B2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1c72dfd", new Object[]{this})).booleanValue();
        }
        if (getContext() instanceof bod) {
            return ye.h((bod) getContext());
        }
        return false;
    }

    public void C2(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc804f42", new Object[]{this, bVar});
            return;
        }
        com.taobao.android.layoutmanager.container.a aVar = this.h;
        if (aVar != null) {
            aVar.b(getActivity(), bVar);
        } else if (bVar != null) {
            bVar.onFinish();
        }
    }

    public void D2(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40e22a14", new Object[]{this, nVar});
            return;
        }
        if (getActivity() instanceof CommonContainerActivity) {
            ((CommonContainerActivity) getActivity()).q3(nVar);
        }
        this.h.c(nVar);
    }

    public void E2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cf4dc64", new Object[]{this});
            return;
        }
        TNodeView tNodeView = this.c;
        if (tNodeView != null) {
            tNodeView.onPause();
        }
        IPage iPage = this.e;
        if (iPage != null) {
            iPage.e().onPageDisappear();
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.TNodeView.k
    public void F2(lgs.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1535162a", new Object[]{this, bVar});
            return;
        }
        String I = nwv.I(bVar.b.getQueryParameter("type"), "");
        CommonContainerActivity commonContainerActivity = getContext() instanceof CommonContainerActivity ? (CommonContainerActivity) getContext() : null;
        I.hashCode();
        if (I.equals(gl4.TYPE_MEDIABROWSER)) {
            this.h = new uhi(commonContainerActivity, this, bVar);
        } else if (!I.equals("poplayer")) {
            this.h = new com.taobao.android.layoutmanager.container.b(commonContainerActivity, this, bVar);
        } else {
            this.h = new PoplayerContainerLifecycle(commonContainerActivity, this, bVar);
        }
        this.h.d(commonContainerActivity);
        if (getContext() instanceof CommonContainerActivity) {
            ((CommonContainerActivity) getContext()).F2(bVar);
        }
    }

    public void J2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f605ee2d", new Object[]{this});
            return;
        }
        TNodeView tNodeView = this.c;
        if (tNodeView != null) {
            tNodeView.onResume();
        }
        IPage iPage = this.e;
        if (iPage != null) {
            iPage.e().onPageAppear();
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.o.r
    public boolean isAlive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c89930ce", new Object[]{this})).booleanValue();
        }
        return true ^ isDestroy();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.o.r
    public boolean isDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("35b933fb", new Object[]{this})).booleanValue();
        }
        if (isDetached() || isRemoving() || (getActivity() != null && getActivity().isFinishing())) {
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        System.nanoTime();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        o oVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16d37bde", new Object[]{this, menu, menuInflater});
            return;
        }
        super.onCreateOptionsMenu(menu, menuInflater);
        TNodeView tNodeView = this.c;
        if (tNodeView != null) {
            oVar = tNodeView.getEngine();
        } else {
            oVar = null;
        }
        ArrayList<NavigationBarModule.d> menus = NavigationBarModule.getMenus(oVar);
        if (menus != null) {
            for (int i = 0; i < menus.size(); i++) {
                p2(menu, menus.get(i));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        setHasOptionsMenu(true);
        this.f = s2();
        this.f8171a = (FrameLayout) layoutInflater.inflate(R.layout.tnode_common_fragment_layout, viewGroup, false);
        this.f8171a.addView(this.f, new ViewGroup.LayoutParams(-1, -1));
        nxb h = od0.D().h();
        if (h != null && h.c(getContext())) {
            h.disableForceDark(this.f8171a);
        }
        z2();
        return this.f8171a;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        IPage iPage = this.e;
        if (iPage != null) {
            iPage.e().onPageDestroy();
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.TNodeView.l
    public void onLayoutCompleted(n nVar) {
        FragmentActivity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e800489", new Object[]{this, nVar});
        } else if (nVar != null && (activity = getActivity()) != null) {
            activity.invalidateOptionsMenu();
            D2(nVar);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.TNodeView.l
    public void onLayoutError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("834776a6", new Object[]{this});
        } else if (getActivity() instanceof CommonContainerActivity) {
            ((CommonContainerActivity) getActivity()).p3();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        if (!B2()) {
            E2();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        if (!B2()) {
            J2();
        }
    }

    public final void r2() {
        TNodeView tNodeView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8d65a90", new Object[]{this});
        } else if (v2() != null && (tNodeView = this.c) != null && tNodeView.getParent() == null) {
            v2().addView(this.c, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public ViewGroup s2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("7ec9e844", new Object[]{this});
        }
        PullDownCloseLayout pullDownCloseLayout = new PullDownCloseLayout(getContext());
        pullDownCloseLayout.setOnSwipeFinishListener(this);
        return pullDownCloseLayout;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.view.PullDownCloseLayout.c
    public void t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a3ba95", new Object[]{this});
            return;
        }
        com.taobao.android.layoutmanager.container.a aVar = this.h;
        if (aVar != null) {
            aVar.d = true;
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public FrameLayout u2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("2fdef16a", new Object[]{this});
        }
        return this.f8171a;
    }

    public ViewGroup v2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("7319cb8d", new Object[]{this});
        }
        return this.f;
    }

    public final void z2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1ae4861", new Object[]{this});
            return;
        }
        this.g = (Uri) getArguments().getParcelable(KEY_INTENT_URI);
        if (!this.d) {
            A2(getContext(), this.g.toString(), 0, 0);
        } else {
            r2();
        }
    }

    public final void A2(Context context, String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("166a2080", new Object[]{this, context, str, new Integer(i), new Integer(i2)});
        } else if (!this.d) {
            if (!TextUtils.isEmpty(str)) {
                Uri parse = Uri.parse(str);
                if (TextUtils.isEmpty(parse.getQueryParameter("tnodeTime"))) {
                    str = parse.buildUpon().appendQueryParameter("tnodeTime", String.valueOf(System.nanoTime())).build().toString();
                }
            }
            TNodeView create = TNodeView.create(context, this, null, str, null, null, this);
            this.c = create;
            if (i > 0 && i2 > 0) {
                create.prelayout(i, i2);
            }
            r2();
            this.d = true;
            IPage a2 = uml.c().a(this.c, true);
            this.e = a2;
            a2.e().a(f21.f(str), str, new HashMap());
        }
    }

    public final void p2(Menu menu, NavigationBarModule.d dVar) {
        MenuItem menuItem;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df4b560", new Object[]{this, menu, dVar});
        } else if (menu != null) {
            int i = 0;
            while (true) {
                if (i >= menu.size()) {
                    i = -1;
                    break;
                } else if (menu.getItem(i).getTitle().equals(dVar.b)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                menuItem = menu.getItem(i);
            } else {
                String str2 = dVar.b;
                String str3 = dVar.c;
                if (TextUtils.isEmpty(str2) || !str2.contains("分享")) {
                    StringBuilder sb = new StringBuilder();
                    if (!TextUtils.isEmpty(dVar.f12331a) && dVar.f12331a.startsWith("@icon-")) {
                        int o = s6o.o(getContext(), dVar.f12331a);
                        if (o != 0) {
                            str = getString(o);
                        } else {
                            str = "";
                        }
                        if (!TextUtils.isEmpty(str)) {
                            sb.append((CharSequence) str);
                            sb.append(":");
                        }
                    }
                    if (!TextUtils.isEmpty(dVar.b)) {
                        sb.append(dVar.b);
                    }
                    menuItem = menu.add(sb.toString());
                    if (!TextUtils.isEmpty(str3) && RVStartParams.TRANSPARENT_TITLE_ALWAYS.equals(str3)) {
                        MenuItemCompat.setShowAsAction(menuItem, 2);
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    try {
                        sb2.append(getString(R.string.uik_icon_share_light));
                        sb2.append(":");
                        sb2.append(str2);
                    } catch (Resources.NotFoundException unused) {
                        sb2.append(str2);
                    }
                    menuItem = menu.add(sb2.toString());
                    if (TextUtils.isEmpty(str3)) {
                        MenuItemCompat.setShowAsAction(menuItem, 0);
                    } else if (RVStartParams.TRANSPARENT_TITLE_ALWAYS.equals(str3)) {
                        MenuItemCompat.setShowAsAction(menuItem, 2);
                    }
                }
            }
            menuItem.setOnMenuItemClickListener(new a(this, dVar));
        }
    }
}
