package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.ListMenuPresenter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate;
import com.taobao.taobao.R;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class NavigationMenuPresenter implements MenuPresenter {

    /* renamed from: a  reason: collision with root package name */
    public NavigationMenuView f5101a;
    public LinearLayout b;
    public MenuPresenter.Callback c;
    public MenuBuilder d;
    public int e;
    public c f;
    public LayoutInflater g;
    public int h;
    public boolean i;
    public ColorStateList j;
    public ColorStateList k;
    public Drawable l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public int r;
    public int s;
    public int t;
    public boolean q = true;
    public int u = -1;
    public final View.OnClickListener v = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            boolean z = true;
            navigationMenuPresenter.A(true);
            MenuItemImpl itemData = ((NavigationMenuItemView) view).getItemData();
            boolean performItemAction = navigationMenuPresenter.d.performItemAction(itemData, navigationMenuPresenter, 0);
            if (itemData == null || !itemData.isCheckable() || !performItemAction) {
                z = false;
            } else {
                navigationMenuPresenter.f.W(itemData);
            }
            navigationMenuPresenter.A(false);
            if (z) {
                navigationMenuPresenter.updateMenuView(false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class b extends l {
        public b(View view) {
            super(view);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class c extends RecyclerView.Adapter<l> {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList<e> f5103a = new ArrayList<>();
        public MenuItemImpl b;
        public boolean c;

        public c() {
            U();
        }

        public final void M(int i, int i2) {
            while (i < i2) {
                ((g) this.f5103a.get(i)).b = true;
                i++;
            }
        }

        public Bundle N() {
            View view;
            Bundle bundle = new Bundle();
            MenuItemImpl menuItemImpl = this.b;
            if (menuItemImpl != null) {
                bundle.putInt("android:menu:checked", menuItemImpl.getItemId());
            }
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            ArrayList<e> arrayList = this.f5103a;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                e eVar = arrayList.get(i);
                if (eVar instanceof g) {
                    MenuItemImpl a2 = ((g) eVar).a();
                    if (a2 != null) {
                        view = a2.getActionView();
                    } else {
                        view = null;
                    }
                    if (view != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        view.saveHierarchyState(parcelableSparseArray);
                        sparseArray.put(a2.getItemId(), parcelableSparseArray);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:action_views", sparseArray);
            return bundle;
        }

        public MenuItemImpl O() {
            return this.b;
        }

        public int P() {
            int i;
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            if (navigationMenuPresenter.b.getChildCount() == 0) {
                i = 0;
            } else {
                i = 1;
            }
            for (int i2 = 0; i2 < navigationMenuPresenter.f.getItemCount(); i2++) {
                if (navigationMenuPresenter.f.getItemViewType(i2) == 0) {
                    i++;
                }
            }
            return i;
        }

        /* renamed from: Q */
        public void onBindViewHolder(l lVar, int i) {
            Drawable drawable;
            int itemViewType = getItemViewType(i);
            ArrayList<e> arrayList = this.f5103a;
            if (itemViewType == 0) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar.itemView;
                NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
                navigationMenuItemView.setIconTintList(navigationMenuPresenter.k);
                if (navigationMenuPresenter.i) {
                    navigationMenuItemView.setTextAppearance(navigationMenuPresenter.h);
                }
                ColorStateList colorStateList = navigationMenuPresenter.j;
                if (colorStateList != null) {
                    navigationMenuItemView.setTextColor(colorStateList);
                }
                Drawable drawable2 = navigationMenuPresenter.l;
                if (drawable2 != null) {
                    drawable = drawable2.getConstantState().newDrawable();
                } else {
                    drawable = null;
                }
                ViewCompat.setBackground(navigationMenuItemView, drawable);
                g gVar = (g) arrayList.get(i);
                navigationMenuItemView.setNeedsEmptyIcon(gVar.b);
                navigationMenuItemView.setHorizontalPadding(navigationMenuPresenter.m);
                navigationMenuItemView.setIconPadding(navigationMenuPresenter.n);
                if (navigationMenuPresenter.p) {
                    navigationMenuItemView.setIconSize(navigationMenuPresenter.o);
                }
                navigationMenuItemView.setMaxLines(navigationMenuPresenter.r);
                navigationMenuItemView.initialize(gVar.a(), 0);
            } else if (itemViewType == 1) {
                ((TextView) lVar.itemView).setText(((g) arrayList.get(i)).a().getTitle());
            } else if (itemViewType == 2) {
                f fVar = (f) arrayList.get(i);
                lVar.itemView.setPadding(0, fVar.b(), 0, fVar.a());
            }
        }

        /* renamed from: S */
        public l onCreateViewHolder(ViewGroup viewGroup, int i) {
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            if (i == 0) {
                return new i(navigationMenuPresenter.g, viewGroup, navigationMenuPresenter.v);
            }
            if (i == 1) {
                return new k(navigationMenuPresenter.g, viewGroup);
            }
            if (i == 2) {
                return new j(navigationMenuPresenter.g, viewGroup);
            }
            if (i != 3) {
                return null;
            }
            return new b(navigationMenuPresenter.b);
        }

        /* renamed from: T */
        public void onViewRecycled(l lVar) {
            if (lVar instanceof i) {
                ((NavigationMenuItemView) lVar.itemView).recycle();
            }
        }

        public final void U() {
            if (!this.c) {
                this.c = true;
                ArrayList<e> arrayList = this.f5103a;
                arrayList.clear();
                arrayList.add(new d());
                NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
                int size = navigationMenuPresenter.d.getVisibleItems().size();
                boolean z = false;
                int i = -1;
                int i2 = 0;
                boolean z2 = false;
                int i3 = 0;
                while (i2 < size) {
                    MenuItemImpl menuItemImpl = navigationMenuPresenter.d.getVisibleItems().get(i2);
                    if (menuItemImpl.isChecked()) {
                        W(menuItemImpl);
                    }
                    if (menuItemImpl.isCheckable()) {
                        menuItemImpl.setExclusiveCheckable(z);
                    }
                    if (menuItemImpl.hasSubMenu()) {
                        SubMenu subMenu = menuItemImpl.getSubMenu();
                        if (subMenu.hasVisibleItems()) {
                            if (i2 != 0) {
                                int i4 = navigationMenuPresenter.t;
                                int i5 = z ? 1 : 0;
                                int i6 = z ? 1 : 0;
                                int i7 = z ? 1 : 0;
                                int i8 = z ? 1 : 0;
                                arrayList.add(new f(i4, i5));
                            }
                            arrayList.add(new g(menuItemImpl));
                            int size2 = arrayList.size();
                            int size3 = subMenu.size();
                            int i9 = 0;
                            boolean z3 = false;
                            while (i9 < size3) {
                                MenuItemImpl menuItemImpl2 = (MenuItemImpl) subMenu.getItem(i9);
                                if (menuItemImpl2.isVisible()) {
                                    if (!z3 && menuItemImpl2.getIcon() != null) {
                                        z3 = true;
                                    }
                                    if (menuItemImpl2.isCheckable()) {
                                        menuItemImpl2.setExclusiveCheckable(z);
                                    }
                                    if (menuItemImpl.isChecked()) {
                                        W(menuItemImpl);
                                    }
                                    arrayList.add(new g(menuItemImpl2));
                                }
                                i9++;
                                z = false;
                            }
                            if (z3) {
                                M(size2, arrayList.size());
                            }
                        }
                    } else {
                        int groupId = menuItemImpl.getGroupId();
                        if (groupId != i) {
                            i3 = arrayList.size();
                            if (menuItemImpl.getIcon() != null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (i2 != 0) {
                                i3++;
                                int i10 = navigationMenuPresenter.t;
                                arrayList.add(new f(i10, i10));
                            }
                        } else if (!z2 && menuItemImpl.getIcon() != null) {
                            M(i3, arrayList.size());
                            z2 = true;
                        }
                        g gVar = new g(menuItemImpl);
                        gVar.b = z2;
                        arrayList.add(gVar);
                        i = groupId;
                    }
                    i2++;
                    z = false;
                }
                this.c = false;
            }
        }

        public void V(Bundle bundle) {
            MenuItemImpl a2;
            View actionView;
            ParcelableSparseArray parcelableSparseArray;
            MenuItemImpl a3;
            int i = bundle.getInt("android:menu:checked", 0);
            ArrayList<e> arrayList = this.f5103a;
            if (i != 0) {
                this.c = true;
                int size = arrayList.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    e eVar = arrayList.get(i2);
                    if ((eVar instanceof g) && (a3 = ((g) eVar).a()) != null && a3.getItemId() == i) {
                        W(a3);
                        break;
                    }
                    i2++;
                }
                this.c = false;
                U();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:action_views");
            if (sparseParcelableArray != null) {
                int size2 = arrayList.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    e eVar2 = arrayList.get(i3);
                    if (!(!(eVar2 instanceof g) || (a2 = ((g) eVar2).a()) == null || (actionView = a2.getActionView()) == null || (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray.get(a2.getItemId())) == null)) {
                        actionView.restoreHierarchyState(parcelableSparseArray);
                    }
                }
            }
        }

        public void W(MenuItemImpl menuItemImpl) {
            if (this.b != menuItemImpl && menuItemImpl.isCheckable()) {
                MenuItemImpl menuItemImpl2 = this.b;
                if (menuItemImpl2 != null) {
                    menuItemImpl2.setChecked(false);
                }
                this.b = menuItemImpl;
                menuItemImpl.setChecked(true);
            }
        }

        public void X(boolean z) {
            this.c = z;
        }

        public void Y() {
            U();
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f5103a.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            e eVar = this.f5103a.get(i);
            if (eVar instanceof f) {
                return 2;
            }
            if (eVar instanceof d) {
                return 3;
            }
            if (!(eVar instanceof g)) {
                throw new RuntimeException("Unknown item type.");
            } else if (((g) eVar).a().hasSubMenu()) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class d implements e {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface e {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class f implements e {

        /* renamed from: a  reason: collision with root package name */
        public final int f5104a;
        public final int b;

        public f(int i, int i2) {
            this.f5104a = i;
            this.b = i2;
        }

        public int a() {
            return this.b;
        }

        public int b() {
            return this.f5104a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class g implements e {

        /* renamed from: a  reason: collision with root package name */
        public final MenuItemImpl f5105a;
        public boolean b;

        public g(MenuItemImpl menuItemImpl) {
            this.f5105a = menuItemImpl;
        }

        public MenuItemImpl a() {
            return this.f5105a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class h extends RecyclerViewAccessibilityDelegate {
        public h(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate, androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(NavigationMenuPresenter.this.f.P(), 0, false));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class i extends l {
        public i(LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(R.layout.design_navigation_item, viewGroup, false));
            this.itemView.setOnClickListener(onClickListener);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class j extends l {
        public j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.design_navigation_item_separator, viewGroup, false));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class k extends l {
        public k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.design_navigation_item_subheader, viewGroup, false));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static abstract class l extends RecyclerView.ViewHolder {
        public l(View view) {
            super(view);
        }
    }

    public void A(boolean z) {
        c cVar = this.f;
        if (cVar != null) {
            cVar.X(z);
        }
    }

    public final void B() {
        int i2;
        if (this.b.getChildCount() != 0 || !this.q) {
            i2 = 0;
        } else {
            i2 = this.s;
        }
        NavigationMenuView navigationMenuView = this.f5101a;
        navigationMenuView.setPadding(0, i2, 0, navigationMenuView.getPaddingBottom());
    }

    public void b(View view) {
        this.b.addView(view);
        NavigationMenuView navigationMenuView = this.f5101a;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    public void c(WindowInsetsCompat windowInsetsCompat) {
        int systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
        if (this.s != systemWindowInsetTop) {
            this.s = systemWindowInsetTop;
            B();
        }
        NavigationMenuView navigationMenuView = this.f5101a;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, windowInsetsCompat.getSystemWindowInsetBottom());
        ViewCompat.dispatchApplyWindowInsets(this.b, windowInsetsCompat);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean collapseItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    public MenuItemImpl d() {
        return this.f.O();
    }

    public int e() {
        return this.b.getChildCount();
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean expandItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    public View f(int i2) {
        return this.b.getChildAt(i2);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean flagActionItems() {
        return false;
    }

    public Drawable g() {
        return this.l;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public int getId() {
        return this.e;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public MenuView getMenuView(ViewGroup viewGroup) {
        if (this.f5101a == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.g.inflate(R.layout.design_navigation_menu, viewGroup, false);
            this.f5101a = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new h(this.f5101a));
            if (this.f == null) {
                this.f = new c();
            }
            int i2 = this.u;
            if (i2 != -1) {
                this.f5101a.setOverScrollMode(i2);
            }
            this.b = (LinearLayout) this.g.inflate(R.layout.design_navigation_item_header, (ViewGroup) this.f5101a, false);
            this.f5101a.setAdapter(this.f);
        }
        return this.f5101a;
    }

    public int h() {
        return this.m;
    }

    public int i() {
        return this.n;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void initForMenu(Context context, MenuBuilder menuBuilder) {
        this.g = LayoutInflater.from(context);
        this.d = menuBuilder;
        this.t = context.getResources().getDimensionPixelOffset(R.dimen.design_navigation_separator_vertical_padding);
    }

    public int j() {
        return this.r;
    }

    public ColorStateList k() {
        return this.j;
    }

    public ColorStateList l() {
        return this.k;
    }

    public View m(int i2) {
        View inflate = this.g.inflate(i2, (ViewGroup) this.b, false);
        b(inflate);
        return inflate;
    }

    public void n(View view) {
        this.b.removeView(view);
        if (this.b.getChildCount() == 0) {
            NavigationMenuView navigationMenuView = this.f5101a;
            navigationMenuView.setPadding(0, this.s, 0, navigationMenuView.getPaddingBottom());
        }
    }

    public void o(boolean z) {
        if (this.q != z) {
            this.q = z;
            B();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        MenuPresenter.Callback callback = this.c;
        if (callback != null) {
            callback.onCloseMenu(menuBuilder, z);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(ListMenuPresenter.VIEWS_TAG);
            if (sparseParcelableArray != null) {
                this.f5101a.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                this.f.V(bundle2);
            }
            SparseArray<Parcelable> sparseParcelableArray2 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray2 != null) {
                this.b.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        if (this.f5101a != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f5101a.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray(ListMenuPresenter.VIEWS_TAG, sparseArray);
        }
        c cVar = this.f;
        if (cVar != null) {
            bundle.putBundle("android:menu:adapter", cVar.N());
        }
        if (this.b != null) {
            SparseArray<Parcelable> sparseArray2 = new SparseArray<>();
            this.b.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray2);
        }
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
        return false;
    }

    public void p(MenuItemImpl menuItemImpl) {
        this.f.W(menuItemImpl);
    }

    public void q(int i2) {
        this.e = i2;
    }

    public void r(Drawable drawable) {
        this.l = drawable;
        updateMenuView(false);
    }

    public void s(int i2) {
        this.m = i2;
        updateMenuView(false);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void setCallback(MenuPresenter.Callback callback) {
        this.c = callback;
    }

    public void t(int i2) {
        this.n = i2;
        updateMenuView(false);
    }

    public void u(int i2) {
        if (this.o != i2) {
            this.o = i2;
            this.p = true;
            updateMenuView(false);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void updateMenuView(boolean z) {
        c cVar = this.f;
        if (cVar != null) {
            cVar.Y();
        }
    }

    public void v(ColorStateList colorStateList) {
        this.k = colorStateList;
        updateMenuView(false);
    }

    public void w(int i2) {
        this.r = i2;
        updateMenuView(false);
    }

    public void x(int i2) {
        this.h = i2;
        this.i = true;
        updateMenuView(false);
    }

    public void y(ColorStateList colorStateList) {
        this.j = colorStateList;
        updateMenuView(false);
    }

    public void z(int i2) {
        this.u = i2;
        NavigationMenuView navigationMenuView = this.f5101a;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i2);
        }
    }
}
