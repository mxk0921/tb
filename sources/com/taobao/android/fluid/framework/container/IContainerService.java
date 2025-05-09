package com.taobao.android.fluid.framework.container;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.RotateAnimation;
import com.taobao.android.fluid.core.FluidService;
import com.taobao.android.fluid.framework.card.cards.video.layer.seekbar.view.SeekBarScrollInterceptView;
import com.taobao.android.fluid.framework.container.render.DefaultPageType;
import com.taobao.android.fluid.framework.container.render.view.MultiTabLayout;
import com.taobao.tbmobilesmartapi.collector.DefaultGestureCollectorDelegateLayout;
import java.util.List;
import java.util.Map;
import tb.ar9;
import tb.c7c;
import tb.cl4;
import tb.d5n;
import tb.hn4;
import tb.j0q;
import tb.o6d;
import tb.p5d;
import tb.uq9;
import tb.x5b;
import tb.yid;
import tb.ylb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface IContainerService extends FluidService, o6d, c7c, ylb {
    public static final ar9 ERROR_CARD_FIRST_CARD_RENDER_FAILED = new ar9("CONTAINER-1", "首卡渲染失败");
    public static final ar9 ERROR_CARD_LARGE_BITMAP = new ar9("CONTAINER-2", "卡片加载图片过大异常");

    /* synthetic */ void addCardRenderListener(ylb ylbVar);

    /* synthetic */ void addFirstCardRenderListener(c7c c7cVar);

    /* synthetic */ void addHorizontalSlideListener(x5b x5bVar);

    /* synthetic */ void addPageBackListener(p5d p5dVar);

    /* synthetic */ void addRenderLifecycleListener(yid yidVar);

    /* synthetic */ void addSizedChangeListener(j0q j0qVar);

    /* synthetic */ void attachSeekBarScrollInterceptView();

    /* synthetic */ MultiTabLayout buildSimplyContentView(Context context);

    /* synthetic */ void changeVisibility(List list, List list2);

    /* synthetic */ void detachSeekBarScrollInterceptView();

    /* synthetic */ ViewStub getAlbumDetailStub();

    /* synthetic */ int getAndSetTopLayoutVisibility(int i);

    /* synthetic */ ViewGroup getAnimLayout();

    hn4 getConfig();

    /* synthetic */ cl4 getContainer();

    /* synthetic */ ViewGroup getContentView();

    /* synthetic */ ViewStub getGoodListStub();

    /* synthetic */ View getLoading();

    /* synthetic */ DefaultGestureCollectorDelegateLayout getMainContentView();

    /* synthetic */ View getMoreButton();

    /* synthetic */ int getOldActionBarHeight();

    /* synthetic */ String getRawId();

    /* synthetic */ SeekBarScrollInterceptView getScrollInterceptView();

    /* synthetic */ int getWeexActionBarHeight();

    /* synthetic */ int getWindowHeight();

    /* synthetic */ int getWindowWidth();

    /* synthetic */ void hideErrorView();

    /* synthetic */ void hideLoading();

    /* synthetic */ void initErrorAndRefresh(DefaultPageType defaultPageType, String str, Object obj);

    /* synthetic */ void initSeekBarInterceptView();

    /* synthetic */ boolean isFirstCardFromRefresh();

    boolean isFirstCardRenderSuccess();

    /* synthetic */ boolean isHasPreRender();

    /* synthetic */ boolean isHighActionbar();

    /* synthetic */ boolean isLoading();

    /* synthetic */ boolean isTab3GuideShoppingVersion();

    /* synthetic */ void onCardRenderFailed(uq9 uq9Var);

    /* synthetic */ void onCardRenderSuccess(uq9 uq9Var);

    /* synthetic */ void onCreate();

    /* synthetic */ void onDestroy();

    /* synthetic */ void onFirstCardRenderFailed(uq9 uq9Var);

    /* synthetic */ void onFirstCardRenderSuccess(uq9 uq9Var);

    /* synthetic */ void onPause();

    /* synthetic */ void onRealStart();

    /* synthetic */ void onRealStop();

    /* synthetic */ void onResume();

    /* synthetic */ void onStart();

    /* synthetic */ void onStop();

    /* synthetic */ void preRender();

    /* synthetic */ void refresh();

    /* synthetic */ void refresh(Map map, boolean z);

    /* synthetic */ void refresh(Map map, boolean z, boolean z2, boolean z3);

    /* synthetic */ void refreshWithCallback(d5n d5nVar);

    /* synthetic */ void removeCardRenderListener(ylb ylbVar);

    /* synthetic */ void removeFirstCardRenderListener(c7c c7cVar);

    /* synthetic */ void removeHorizontalSlideListener(x5b x5bVar);

    /* synthetic */ void removePageBackListener(p5d p5dVar);

    /* synthetic */ void removeRenderLifecycleListener(yid yidVar);

    /* synthetic */ void removeSizedChangeListener(j0q j0qVar);

    /* synthetic */ void renderContainer(Context context);

    /* synthetic */ void renderContainer(Context context, MultiTabLayout multiTabLayout);

    void renderContainerOnCreate(Context context);

    /* synthetic */ void setContainerSize(int i, int i2);

    /* synthetic */ void setFirstCardFromRefresh(boolean z);

    /* synthetic */ void setLockedTouchEvent(boolean z);

    /* synthetic */ void setPendingRunnable(Runnable runnable);

    /* synthetic */ void setRotateAnimation(RotateAnimation rotateAnimation);

    void toggleCacheLoading(boolean z);

    /* synthetic */ void updateView(boolean z, List list);
}
