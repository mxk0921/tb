package tb;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.Globals;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData;
import com.taobao.tao.topmultitab.service.searchbar.HomeSearchBarServiceImpl;
import com.taobao.tao.topmultitab.service.searchbar.impl.bgview.HomeSearchBarBgView;
import com.taobao.tao.topmultitab.service.searchbar.impl.searchview.SearchBarView;
import com.taobao.taobao.R;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class bzh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f16733a;
    public boolean b = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f16734a;
        public final /* synthetic */ RelativeLayout b;

        public a(boolean z, RelativeLayout relativeLayout) {
            this.f16734a = z;
            this.b = relativeLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            bzh.b(bzh.this, this.f16734a);
            bzh.this.j(this.b);
            d9j.c("MainContainerLayoutController", "下一帧refreshLayout :" + bzh.a(bzh.this));
        }
    }

    static {
        t2o.a(729810323);
    }

    public bzh() {
        imn c = yyj.e().c();
        String f = yyj.e().f();
        this.f16733a = c(c.u(f), f);
        d9j.c("MainContainerLayoutController", "init isTabLocateTop:" + this.f16733a);
    }

    public static /* synthetic */ boolean a(bzh bzhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58182ed3", new Object[]{bzhVar})).booleanValue();
        }
        return bzhVar.f16733a;
    }

    public static /* synthetic */ boolean b(bzh bzhVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("87fc806b", new Object[]{bzhVar, new Boolean(z)})).booleanValue();
        }
        bzhVar.f16733a = z;
        return z;
    }

    public final void d(RelativeLayout.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62665364", new Object[]{this, layoutParams});
            return;
        }
        layoutParams.removeRule(10);
        layoutParams.removeRule(3);
        layoutParams.removeRule(8);
    }

    public final void e(RelativeLayout relativeLayout, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57e0a50", new Object[]{this, relativeLayout, new Boolean(z)});
            return;
        }
        int i = R.id.heightPlaceHolder;
        View findViewById = relativeLayout.findViewById(i);
        if (z) {
            if (findViewById == null) {
                findViewById = new View(relativeLayout.getContext());
                findViewById.setId(i);
                relativeLayout.addView(findViewById);
            }
            findViewById.setVisibility(0);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) findViewById.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new RelativeLayout.LayoutParams(-1, HomeSearchBarServiceImpl.STATUS_HEIGHT_PX);
            }
            layoutParams.width = -1;
            layoutParams.height = HomeSearchBarServiceImpl.STATUS_HEIGHT_PX;
            layoutParams.addRule(10);
            findViewById.setLayoutParams(layoutParams);
        } else if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }

    public final View f(RelativeLayout relativeLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("24ad6260", new Object[]{this, relativeLayout});
        }
        int i = R.id.multi_tab_container_wrapper;
        FrameLayout frameLayout = (FrameLayout) relativeLayout.findViewById(i);
        if (frameLayout == null) {
            frameLayout = new FrameLayout(relativeLayout.getContext());
            frameLayout.setId(i);
            relativeLayout.addView(frameLayout);
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) frameLayout.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        }
        frameLayout.setLayoutParams(layoutParams);
        int i2 = R.id.multi_tab_container;
        FrameLayout frameLayout2 = (FrameLayout) relativeLayout.findViewById(i2);
        if (frameLayout2 == null) {
            frameLayout2 = new FrameLayout(relativeLayout.getContext());
            frameLayout2.setId(i2);
            frameLayout.addView(frameLayout2);
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout2.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        }
        if (!this.b) {
            frameLayout2.setVisibility(8);
        }
        this.b = true;
        frameLayout2.setLayoutParams(layoutParams2);
        return frameLayout;
    }

    public final View g(RelativeLayout relativeLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f3cbb5c7", new Object[]{this, relativeLayout});
        }
        int i = R.id.search_view;
        SearchBarView searchBarView = (SearchBarView) relativeLayout.findViewById(i);
        if (searchBarView == null) {
            searchBarView = new SearchBarView(relativeLayout.getContext());
            searchBarView.setBackgroundColor(0);
            searchBarView.setId(i);
            relativeLayout.addView(searchBarView);
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) searchBarView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        }
        searchBarView.setLayoutParams(layoutParams);
        return searchBarView;
    }

    public void i(IContainerDataModel<?> iContainerDataModel, String str, RelativeLayout relativeLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1814d8a7", new Object[]{this, iContainerDataModel, str, relativeLayout});
            return;
        }
        boolean c = c(iContainerDataModel, str);
        d9j.c("MainContainerLayoutController", "refreshLayout remoteTabLocateTop:" + c + ",localTabBarLocateTop:" + this.f16733a);
        if (c != this.f16733a) {
            m5a.a().i(new a(c, relativeLayout));
        }
    }

    public final void h(FrameLayout frameLayout, SearchBarView searchBarView, HomeSearchBarBgView homeSearchBarBgView, boolean z) {
        int i;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4151cf3", new Object[]{this, frameLayout, searchBarView, homeSearchBarBgView, new Boolean(z)});
            return;
        }
        d9j.c("MainContainerLayoutController", "layoutAlignmentRules 刷新视图 isTabLocateTop：" + z);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) frameLayout.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) searchBarView.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) homeSearchBarBgView.getLayoutParams();
        d(layoutParams);
        d(layoutParams2);
        d(layoutParams3);
        if (z) {
            bqa.d("MainContainerLayoutController", "设置分类在上方");
            layoutParams.addRule(3, R.id.heightPlaceHolder);
            layoutParams2.addRule(3, R.id.multi_tab_container_wrapper);
        } else {
            bqa.d("MainContainerLayoutController", "设置搜索栏在上方");
            layoutParams2.addRule(3, R.id.heightPlaceHolder);
            layoutParams.addRule(3, R.id.search_view);
        }
        searchBarView.setLayoutParams(layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        if (z) {
            i = R.id.search_view;
        } else {
            i = R.id.multi_tab_container_wrapper;
        }
        if (z) {
            str = "R.id.search_view";
        } else {
            str = "R.id.multi_tab_container_wrapper";
        }
        d9j.c("MainContainerLayoutController", "refreshMainContainerLayout alignBottomId:".concat(str));
        layoutParams3.addRule(8, i);
        layoutParams3.addRule(10);
        homeSearchBarBgView.setLayoutParams(layoutParams3);
    }

    public void j(RelativeLayout relativeLayout) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("381d8ba2", new Object[]{this, relativeLayout});
            return;
        }
        boolean z2 = kbq.h(Globals.getApplication()) && TextUtils.equals(yyj.e().f(), z4a.NEW_FACE_PARENT.f32522a);
        if (!this.f16733a || !z2) {
            z = false;
        }
        d9j.c("MainContainerLayoutController", "refreshMainContainerLayout isMainLand:" + z2 + ",mIsTabLocateTop:" + this.f16733a + ",isLocateTop:" + z);
        e(relativeLayout, z);
        h((FrameLayout) f(relativeLayout), (SearchBarView) g(relativeLayout), (HomeSearchBarBgView) relativeLayout.findViewById(R.id.search_bg_view), z);
    }

    public final boolean c(IContainerDataModel<?> iContainerDataModel, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("941a566f", new Object[]{this, iContainerDataModel, str})).booleanValue();
        }
        if (iContainerDataModel == null) {
            d9j.c("MainContainerLayoutController", "containerDataModel is null.");
            return false;
        } else if (!TextUtils.equals(str, yyj.e().f())) {
            d9j.c("MainContainerLayoutController", "containerId not main.");
            return false;
        } else {
            AwesomeGetContainerInnerData awesomeGetContainerInnerData = (AwesomeGetContainerInnerData) iContainerDataModel.getBase();
            if (awesomeGetContainerInnerData == null) {
                d9j.c("MainContainerLayoutController", "Base model is null.");
                return false;
            }
            List<SectionModel> sections = awesomeGetContainerInnerData.getSections();
            if (sections.size() < 2) {
                d9j.c("MainContainerLayoutController", "sections size < 2.");
                return false;
            }
            SectionModel sectionModel = sections.get(0);
            if (sectionModel == null) {
                d9j.c("MainContainerLayoutController", "first section null.");
                return false;
            }
            d9j.c("MainContainerLayoutController", "sectionModel = " + sectionModel.getSectionBizCode());
            boolean equals = TextUtils.equals(sectionModel.getSectionBizCode(), "DXSearchBar") ^ true;
            d9j.c("MainContainerLayoutController", "isTabBarLocateTop = " + equals);
            return equals;
        }
    }
}
