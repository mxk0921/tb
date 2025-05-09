package com.taobao.search.sf;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.business.common.list.BaseListView;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.search.sf.context.CommonSearchContext;
import com.taobao.search.sf.datasource.CommonBaseDatasource;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.taobao.R;
import java.util.Arrays;
import java.util.List;
import tb.o02;
import tb.o1p;
import tb.o4p;
import tb.oxb;
import tb.r4p;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class DecorationProvider implements BaseListView.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public StyleDecoration f11683a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class DefaultDecoration extends TableDecoration {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final int DIP4U5 = o1p.a(4.5f);

        /* renamed from: a  reason: collision with root package name */
        public ListStyle f11684a;

        static {
            t2o.a(815793340);
        }

        public static int d(ListStyle listStyle, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7089b7ab", new Object[]{listStyle, new Integer(i)})).intValue();
            }
            if (listStyle == ListStyle.LIST) {
                return 0;
            }
            return (i * 5) / 3;
        }

        public static /* synthetic */ Object ipc$super(DefaultDecoration defaultDecoration, String str, Object... objArr) {
            if (str.hashCode() == 1948990982) {
                return new Boolean(defaultDecoration.c((View) objArr[0], (Rect) objArr[1]));
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/DecorationProvider$DefaultDecoration");
        }

        @Override // com.taobao.search.sf.DecorationProvider.TableDecoration
        public void a(Rect rect) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6f5ab225", new Object[]{this, rect});
            } else if (this.f11684a == ListStyle.WATERFALL) {
                int i = DIP4U5;
                rect.left = ((-i) * 5) / 3;
                rect.right = ((-i) * 5) / 3;
            }
        }

        @Override // com.taobao.search.sf.DecorationProvider.TableDecoration
        public void b(String str, ListStyle listStyle, RecyclerView recyclerView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a77d834a", new Object[]{this, str, listStyle, recyclerView});
                return;
            }
            this.f11684a = listStyle;
            if (listStyle == ListStyle.LIST) {
                recyclerView.setPadding(d(listStyle, 0), 0, d(listStyle, 0), 0);
                return;
            }
            int i = DIP4U5;
            recyclerView.setPadding(d(listStyle, i), 0, d(listStyle, i), 0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84db4eca", new Object[]{this, rect, view, recyclerView, state});
            } else if (!c(view, rect)) {
                if ((view.getLayoutParams() instanceof StaggeredGridLayoutManager.LayoutParams) && ((StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams()).isFullSpan()) {
                    a(rect);
                } else if (this.f11684a == ListStyle.WATERFALL) {
                    int i = DIP4U5;
                    rect.top = i;
                    rect.bottom = i;
                    rect.left = i;
                    rect.right = i;
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class ShopDecoration extends TableDecoration {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815793341);
        }

        public static /* synthetic */ Object ipc$super(ShopDecoration shopDecoration, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/DecorationProvider$ShopDecoration");
        }

        @Override // com.taobao.search.sf.DecorationProvider.TableDecoration
        public void b(String str, ListStyle listStyle, RecyclerView recyclerView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a77d834a", new Object[]{this, str, listStyle, recyclerView});
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84db4eca", new Object[]{this, rect, view, recyclerView, state});
            } else {
                rect.set(0, 0, 0, 0);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class StyleDecoration extends RecyclerView.ItemDecoration {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public TableDecoration b;
        public final TableDecoration d;
        public final TableDecoration e;
        public final List<String> f = Arrays.asList(o4p.B());

        /* renamed from: a  reason: collision with root package name */
        public final TableDecoration f11685a = new ShopDecoration();
        public final TableDecoration c = new DefaultDecoration();

        static {
            t2o.a(815793342);
        }

        public StyleDecoration() {
            Tb2021Decoration tb2021Decoration = new Tb2021Decoration();
            this.d = tb2021Decoration;
            int round = Math.round(o1p.h(15)) / 2;
            this.e = new Tb2021Decoration(round, round);
            this.b = tb2021Decoration;
        }

        public static /* synthetic */ Object ipc$super(StyleDecoration styleDecoration, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/DecorationProvider$StyleDecoration");
        }

        public void a(ListStyle listStyle, String str, String str2, String str3, RecyclerView recyclerView, o02 o02Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a4163ee", new Object[]{this, listStyle, str, str2, str3, recyclerView, o02Var});
                return;
            }
            int d = DecorationProvider.d(recyclerView.getContext());
            if (r4p.VALUE_MODULE_INSHOP.equalsIgnoreCase(str)) {
                this.b = this.d;
                recyclerView.setBackgroundColor(d);
            } else if ("shop".equalsIgnoreCase(str2) || r4p.VALUE_SHOWTYPE_SIMILAR_SHOP.equalsIgnoreCase(str)) {
                this.b = this.f11685a;
                ViewCompat.setBackground(recyclerView, null);
            } else if (r4p.SHOW_NEW_SIMILAR_PAGE.equals(str)) {
                this.b = this.d;
                recyclerView.setBackgroundColor(d);
            } else if (TextUtils.isEmpty(str2) || "all".equalsIgnoreCase(str2)) {
                this.b = this.e;
                recyclerView.setBackgroundColor(d);
            } else if (this.f.contains(str2)) {
                this.b = this.d;
                recyclerView.setBackgroundColor(d);
            } else {
                this.b = this.c;
                recyclerView.setBackgroundColor(d);
            }
            this.b.b(str2, listStyle, recyclerView);
            if (CommonSearchContext.isGallerySrp(o02Var.getParamStr("m"))) {
                ViewCompat.setBackground(recyclerView, null);
                return;
            }
            CommonSearchResult commonSearchResult = (CommonSearchResult) o02Var.getTotalSearchResult();
            if (commonSearchResult != null && commonSearchResult.newSearch) {
                ViewCompat.setBackground(recyclerView, null);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84db4eca", new Object[]{this, rect, view, recyclerView, state});
            } else {
                this.b.getItemOffsets(rect, view, recyclerView, state);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static abstract class TableDecoration extends RecyclerView.ItemDecoration {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815793343);
        }

        public static /* synthetic */ Object ipc$super(TableDecoration tableDecoration, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/DecorationProvider$TableDecoration");
        }

        public void a(Rect rect) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6f5ab225", new Object[]{this, rect});
            }
        }

        public abstract void b(String str, ListStyle listStyle, RecyclerView recyclerView);

        public boolean c(View view, Rect rect) {
            View childAt;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("742b3e06", new Object[]{this, view, rect})).booleanValue();
            }
            if (view instanceof FrameLayout) {
                FrameLayout frameLayout = (FrameLayout) view;
                if (frameLayout.getChildCount() <= 0 || (childAt = frameLayout.getChildAt(0)) == null) {
                    return false;
                }
                int id = childAt.getId();
                if (id == R.id.libsf_srp_list_blank || id == R.id.libsf_srp_list_header_container || id == R.id.libsf_srp_list_footer_container) {
                    a(rect);
                    return true;
                }
            }
            return false;
        }
    }

    static {
        t2o.a(815793339);
        t2o.a(993001640);
    }

    public static int d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("492637fc", new Object[]{context})).intValue();
        }
        if (!(context instanceof oxb) || !((oxb) context).E1()) {
            return -1;
        }
        return context.getResources().getColor(R.color.tbsearch_main_card_bg_night);
    }

    @Override // com.taobao.android.searchbaseframe.business.common.list.BaseListView.a
    public void a(ListStyle listStyle, int i, o02 o02Var, RecyclerView recyclerView, RecyclerView.ItemDecoration itemDecoration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("533af8a6", new Object[]{this, listStyle, new Integer(i), o02Var, recyclerView, itemDecoration});
            return;
        }
        CommonBaseDatasource commonBaseDatasource = (CommonBaseDatasource) o02Var;
        this.f11683a.a(listStyle, commonBaseDatasource.p(), commonBaseDatasource.getTab(), commonBaseDatasource.w(), recyclerView, o02Var);
    }

    @Override // com.taobao.android.searchbaseframe.business.common.list.BaseListView.a
    public RecyclerView.ItemDecoration b(int i, o02 o02Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ItemDecoration) ipChange.ipc$dispatch("c5552a6e", new Object[]{this, new Integer(i), o02Var});
        }
        if (this.f11683a == null) {
            this.f11683a = new StyleDecoration();
        }
        return this.f11683a;
    }

    @Override // com.taobao.android.searchbaseframe.business.common.list.BaseListView.a
    public void c(RecyclerView.ItemDecoration itemDecoration, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("619681c8", new Object[]{this, itemDecoration, new Integer(i), new Integer(i2)});
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class Tb2021Decoration extends TableDecoration {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final int REM12 = Math.round(o1p.i(12));

        /* renamed from: a  reason: collision with root package name */
        public ListStyle f11686a;
        public final int b;
        public final int c;

        static {
            t2o.a(815793344);
        }

        public Tb2021Decoration() {
            int i = REM12;
            this.b = i / 2;
            this.c = i / 2;
        }

        public static int d(ListStyle listStyle, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("89d4868b", new Object[]{listStyle, new Integer(i)})).intValue();
            }
            if (listStyle == ListStyle.LIST) {
                return i;
            }
            return (i - (((REM12 * 3) / 6) * 6)) / 2;
        }

        public static /* synthetic */ Object ipc$super(Tb2021Decoration tb2021Decoration, String str, Object... objArr) {
            if (str.hashCode() == 1948990982) {
                return new Boolean(tb2021Decoration.c((View) objArr[0], (Rect) objArr[1]));
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/DecorationProvider$Tb2021Decoration");
        }

        @Override // com.taobao.search.sf.DecorationProvider.TableDecoration
        public void a(Rect rect) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6f5ab225", new Object[]{this, rect});
            } else if (this.f11686a == ListStyle.WATERFALL) {
                int i = -((REM12 * 3) / 6);
                rect.left = i;
                rect.right = i;
            }
        }

        @Override // com.taobao.search.sf.DecorationProvider.TableDecoration
        public void b(String str, ListStyle listStyle, RecyclerView recyclerView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a77d834a", new Object[]{this, str, listStyle, recyclerView});
                return;
            }
            this.f11686a = listStyle;
            if (listStyle == ListStyle.LIST) {
                recyclerView.setPadding(0, 0, 0, 0);
                return;
            }
            int i = (REM12 * 3) / 6;
            recyclerView.setPadding(i, 0, i, 0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84db4eca", new Object[]{this, rect, view, recyclerView, state});
            } else if (!c(view, rect)) {
                if ((view.getLayoutParams() instanceof StaggeredGridLayoutManager.LayoutParams) && ((StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams()).isFullSpan()) {
                    a(rect);
                } else if (this.f11686a == ListStyle.WATERFALL) {
                    if (view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() > 0) {
                        rect.top = this.b;
                        rect.bottom = this.c;
                    } else {
                        rect.top = 0;
                        rect.bottom = 0;
                    }
                    int i = (REM12 * 3) / 6;
                    rect.left = i;
                    rect.right = i;
                }
            }
        }

        public Tb2021Decoration(int i, int i2) {
            this.b = i;
            this.c = i2;
        }
    }
}
