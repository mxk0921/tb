package com.taobao.message.sp.category.widget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbelder.TBElder;
import com.taobao.android.tbtheme.kit.ThemeData;
import com.taobao.android.tbtheme.kit.ThemeFrameLayout;
import com.taobao.message.kit.util.SharedPreferencesUtil;
import com.taobao.message.kit.util.UIHandler;
import com.taobao.message.kit.util.ValueUtil;
import com.taobao.message.lab.comfrm.core.Event;
import com.taobao.message.lab.comfrm.core.EventDispatcher;
import com.taobao.message.lab.comfrm.render.RenderTemplate;
import com.taobao.message.lab.comfrm.render.WidgetInstance;
import com.taobao.message.lab.comfrm.support.list.BaseAbsListWidgetInstance;
import com.taobao.message.lab.comfrm.support.list.ICustomNestedScrollView;
import com.taobao.message.lab.comfrm.util.Logger;
import com.taobao.message.lab.comfrm.util.TraceUtil;
import com.taobao.message.sp.category.widget.NewCategoryPageInstance;
import com.taobao.message.sp.category.widget.nestedscroll.NestedScrollListener;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.message.uikit.util.DisplayUtil;
import com.taobao.schedule.ViewProxy;
import com.taobao.tao.log.TLog;
import com.taobao.uikit.extend.component.refresh.TBLoadMoreFooter;
import com.taobao.uikit.extend.component.refresh.TBOldRefreshHeader;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;
import com.taobao.uikit.extend.component.unify.Dialog.TBMaterialDialog;
import com.taobao.uikit.extend.component.unify.Dialog.TBSimpleListItem;
import com.taobao.uikit.extend.component.unify.Dialog.TBSimpleListItemType;
import com.taobao.uikit.feature.features.internal.pullrefresh.RefreshHeadView;
import com.taobao.uikit.feature.view.TRecyclerView;
import java.io.Serializable;
import tb.cpt;
import tb.t2o;
import tb.tot;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class NewCategoryPageInstance extends WidgetInstance<JSONObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "NewCategoryPageInstance";
    private BroadcastReceiver broadcastReceiver;
    private BaseAbsListWidgetInstance contentWidgetInstance;
    private BroadcastReceiver elderFontChangeReceiver;
    private FrameLayout frameLayout;
    private WidgetInstance headWidgetInstance;
    private ThemeFrameLayout navigatorBackground;
    private FrameLayout navigatorLayout;
    private WidgetInstance navigatorWidgetInstance;
    private TRecyclerView recyclerView;
    private TBRefreshHeader refreshHeader;
    private ThemeFrameLayout skin;
    private FrameLayout swipeRefreshFrameLayout;
    private TBSwipeRefreshLayout swipeRefreshLayout;
    private int systemBarAndNavigatorHeight;
    private int systemBarHeight;
    private BroadcastReceiver themeBroadcastReceiver;
    private int useTheme = 1;
    private int enablePullToRefresh = 1;

    static {
        t2o.a(550502423);
    }

    public static /* synthetic */ BaseAbsListWidgetInstance access$000(NewCategoryPageInstance newCategoryPageInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseAbsListWidgetInstance) ipChange.ipc$dispatch("ea33d3f3", new Object[]{newCategoryPageInstance});
        }
        return newCategoryPageInstance.contentWidgetInstance;
    }

    public static /* synthetic */ TRecyclerView access$100(NewCategoryPageInstance newCategoryPageInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TRecyclerView) ipChange.ipc$dispatch("5f0c3f22", new Object[]{newCategoryPageInstance});
        }
        return newCategoryPageInstance.recyclerView;
    }

    public static /* synthetic */ TBSwipeRefreshLayout access$200(NewCategoryPageInstance newCategoryPageInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBSwipeRefreshLayout) ipChange.ipc$dispatch("82d3aba", new Object[]{newCategoryPageInstance});
        }
        return newCategoryPageInstance.swipeRefreshLayout;
    }

    public static /* synthetic */ ThemeFrameLayout access$300(NewCategoryPageInstance newCategoryPageInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThemeFrameLayout) ipChange.ipc$dispatch("256cb939", new Object[]{newCategoryPageInstance});
        }
        return newCategoryPageInstance.navigatorBackground;
    }

    public static /* synthetic */ int access$400(NewCategoryPageInstance newCategoryPageInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cd10f948", new Object[]{newCategoryPageInstance})).intValue();
        }
        return newCategoryPageInstance.systemBarHeight;
    }

    private void considerRefreshBgDrawable(TRecyclerView tRecyclerView, PaddingSupportDrawable paddingSupportDrawable) {
        RecyclerView.ViewHolder findViewHolderForAdapterPosition;
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a903f0", new Object[]{this, tRecyclerView, paddingSupportDrawable});
        } else if ((tRecyclerView.getLayoutManager() instanceof LinearLayoutManager) && (findViewHolderForAdapterPosition = tRecyclerView.findViewHolderForAdapterPosition(((LinearLayoutManager) tRecyclerView.getLayoutManager()).findLastVisibleItemPosition())) != null && (view = findViewHolderForAdapterPosition.itemView) != null) {
            paddingSupportDrawable.setPaddingTop(view.getBottom());
        }
    }

    private void considerSubscribeElderFontChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("123e0b3f", new Object[]{this});
            return;
        }
        this.elderFontChangeReceiver = new BroadcastReceiver() { // from class: com.taobao.message.sp.category.widget.NewCategoryPageInstance.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass7 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/sp/category/widget/NewCategoryPageInstance$7");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                } else if (NewCategoryPageInstance.access$000(NewCategoryPageInstance.this) != null) {
                    NewCategoryPageInstance.access$000(NewCategoryPageInstance.this).refreshView();
                }
            }
        };
        LocalBroadcastManager.getInstance(ApplicationUtil.getApplication()).registerReceiver(this.elderFontChangeReceiver, new IntentFilter(TBElder.ACTION_TBELDER_VALUE_CHANGED));
    }

    public static /* synthetic */ Object ipc$super(NewCategoryPageInstance newCategoryPageInstance, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1468187837) {
            super.onRefresh((NewCategoryPageInstance) ((Serializable) objArr[0]), (EventDispatcher) objArr[1]);
            return null;
        } else if (hashCode == 577536806) {
            super.dispose();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/message/sp/category/widget/NewCategoryPageInstance");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$bindData$0(PaddingSupportDrawable paddingSupportDrawable, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d00f219", new Object[]{this, paddingSupportDrawable, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
        } else {
            considerRefreshBgDrawable(this.recyclerView, paddingSupportDrawable);
        }
    }

    @Override // com.taobao.message.lab.comfrm.render.WidgetInstance, com.taobao.message.lab.comfrm.inner2.Disposable
    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
            return;
        }
        super.dispose();
        if (this.broadcastReceiver != null) {
            LocalBroadcastManager.getInstance(this.frameLayout.getContext()).unregisterReceiver(this.broadcastReceiver);
            this.broadcastReceiver = null;
        }
        if (this.themeBroadcastReceiver != null) {
            ApplicationUtil.getApplication().unregisterReceiver(this.themeBroadcastReceiver);
            LocalBroadcastManager.getInstance(ApplicationUtil.getApplication()).unregisterReceiver(this.themeBroadcastReceiver);
            this.themeBroadcastReceiver = null;
        }
        if (this.elderFontChangeReceiver != null) {
            LocalBroadcastManager.getInstance(ApplicationUtil.getApplication()).unregisterReceiver(this.elderFontChangeReceiver);
            this.elderFontChangeReceiver = null;
        }
    }

    public BaseAbsListWidgetInstance getContentWidgetInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseAbsListWidgetInstance) ipChange.ipc$dispatch("99583869", new Object[]{this});
        }
        return this.contentWidgetInstance;
    }

    private void setupTheme() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71e24fd3", new Object[]{this});
        } else if (this.useTheme == 1) {
            int parseColor = Color.parseColor("#EEEEEE");
            ThemeData e = cpt.c().e("mytaobao");
            if (e != null && "1".equals(e.naviStyle)) {
                parseColor = Color.parseColor("#111111");
            }
            this.refreshHeader.setRefreshTipColor(parseColor);
            ((RefreshHeadView) this.refreshHeader.getRefreshView()).setRefreshViewColor(parseColor);
        } else {
            ThemeFrameLayout themeFrameLayout = this.skin;
            if (themeFrameLayout != null) {
                themeFrameLayout.setVisibility(8);
            }
            ThemeFrameLayout themeFrameLayout2 = this.navigatorBackground;
            if (themeFrameLayout2 != null) {
                themeFrameLayout2.setVisibility(8);
            }
            if (ApplicationUtil.isDebug()) {
                Logger.e(TAG, "setupTheme bgImageView.setVisibility(View.GONE);");
            }
            this.frameLayout.setBackgroundColor(-1);
            int parseColor2 = Color.parseColor("#111111");
            this.refreshHeader.setRefreshTipColor(parseColor2);
            ((RefreshHeadView) this.refreshHeader.getRefreshView()).setRefreshViewColor(parseColor2);
        }
    }

    public void bindData(JSONObject jSONObject, final EventDispatcher eventDispatcher) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b185178e", new Object[]{this, jSONObject, eventDispatcher});
            return;
        }
        int i = this.useTheme;
        int integer = ValueUtil.getInteger(jSONObject, "useTheme", i);
        this.useTheme = integer;
        if (i != integer) {
            if (ApplicationUtil.isDebug()) {
                Logger.e(TAG, "bindData setupTheme");
            }
            setupTheme();
        }
        int integer2 = ValueUtil.getInteger(jSONObject, "enablePullToRefresh", this.enablePullToRefresh);
        this.enablePullToRefresh = integer2;
        TBSwipeRefreshLayout tBSwipeRefreshLayout = this.swipeRefreshLayout;
        if (integer2 != 1) {
            z = false;
        }
        tBSwipeRefreshLayout.enablePullRefresh(z);
        this.swipeRefreshLayout.setOnPullRefreshListener(new TBSwipeRefreshLayout.OnPullRefreshListener() { // from class: com.taobao.message.sp.category.widget.NewCategoryPageInstance.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
            public void onPullDistance(int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2dcc8a23", new Object[]{this, new Integer(i2)});
                }
            }

            @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
            public void onRefreshStateChanged(TBRefreshHeader.RefreshState refreshState, TBRefreshHeader.RefreshState refreshState2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1f1ba5ae", new Object[]{this, refreshState, refreshState2});
                }
            }

            @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPullRefreshListener
            public void onRefresh() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c9cbba83", new Object[]{this});
                    return;
                }
                NewCategoryPageInstance.access$200(NewCategoryPageInstance.this).setRefreshing(true);
                UIHandler.postDelayed(new Runnable() { // from class: com.taobao.message.sp.category.widget.NewCategoryPageInstance.3.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            NewCategoryPageInstance.access$200(NewCategoryPageInstance.this).setRefreshing(false);
                        }
                    }
                }, 1500L);
                eventDispatcher.dispatch(new Event.Build("refresh").build());
                if (ApplicationUtil.isDebug()) {
                    UIHandler.post(new Runnable() { // from class: com.taobao.message.sp.category.widget.NewCategoryPageInstance.3.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            String str;
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            int intSharedPreference = SharedPreferencesUtil.getIntSharedPreference("messageAuraGroup", -1);
                            TBSimpleListItem[] tBSimpleListItemArr = new TBSimpleListItem[6];
                            int intSharedPreference2 = SharedPreferencesUtil.getIntSharedPreference("messageCenterTabDebugConfig", -1);
                            if (intSharedPreference2 == 0) {
                                str = "-Tree";
                            } else if (intSharedPreference2 == 1) {
                                str = "-NoTree";
                            } else if (intSharedPreference2 == 2) {
                                str = "-NoTreeTab";
                            } else {
                                str = "";
                            }
                            String concat = "全部重置默认".concat(str);
                            TBSimpleListItemType tBSimpleListItemType = TBSimpleListItemType.NORMAL;
                            tBSimpleListItemArr[0] = new TBSimpleListItem(concat, tBSimpleListItemType);
                            if (intSharedPreference == -1) {
                                tBSimpleListItemArr[2] = new TBSimpleListItem("群聊/新/当前: 默认", tBSimpleListItemType);
                                tBSimpleListItemArr[1] = new TBSimpleListItem("群聊/老/当前: 默认", tBSimpleListItemType);
                            } else if (intSharedPreference == 0) {
                                tBSimpleListItemArr[1] = new TBSimpleListItem("群聊/新/当前: 老", tBSimpleListItemType);
                            } else if (intSharedPreference == 1) {
                                tBSimpleListItemArr[2] = new TBSimpleListItem("群聊/新/当前: 新", tBSimpleListItemType);
                            }
                            tBSimpleListItemArr[3] = new TBSimpleListItem("Tab切到Tree", tBSimpleListItemType);
                            tBSimpleListItemArr[4] = new TBSimpleListItem("Tab切到NoTree", tBSimpleListItemType);
                            tBSimpleListItemArr[5] = new TBSimpleListItem("Tab切到NoTree多Tab", tBSimpleListItemType);
                            new TBMaterialDialog.Builder(NewCategoryPageInstance.access$200(NewCategoryPageInstance.this).getContext()).items(tBSimpleListItemArr).itemsCallback(new TBMaterialDialog.ListCallback() { // from class: com.taobao.message.sp.category.widget.NewCategoryPageInstance.3.2.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // com.taobao.uikit.extend.component.unify.Dialog.TBMaterialDialog.ListCallback
                                public void onSelection(TBMaterialDialog tBMaterialDialog, View view, int i2, TBSimpleListItem tBSimpleListItem) {
                                    IpChange ipChange4 = $ipChange;
                                    if (ipChange4 instanceof IpChange) {
                                        ipChange4.ipc$dispatch("72c1a54f", new Object[]{this, tBMaterialDialog, view, new Integer(i2), tBSimpleListItem});
                                        return;
                                    }
                                    if (i2 == 1) {
                                        SharedPreferencesUtil.addIntSharedPreference("messageAuraGroup", 1);
                                    } else if (i2 == 0) {
                                        SharedPreferencesUtil.addIntSharedPreference("messageAuraGroup", 0);
                                        SharedPreferencesUtil.addIntSharedPreference("messageCenterTabDebugConfig", -1);
                                    } else if (i2 == 3) {
                                        SharedPreferencesUtil.addIntSharedPreference("messageCenterTabDebugConfig", 0);
                                    } else if (i2 == 4) {
                                        SharedPreferencesUtil.addIntSharedPreference("messageCenterTabDebugConfig", 1);
                                    } else if (i2 == 5) {
                                        SharedPreferencesUtil.addIntSharedPreference("messageCenterTabDebugConfig", 2);
                                    }
                                    tBMaterialDialog.dismiss();
                                }
                            }).show();
                        }
                    });
                }
            }
        });
        this.swipeRefreshLayout.setOnPushLoadMoreListener(new TBSwipeRefreshLayout.OnPushLoadMoreListener() { // from class: com.taobao.message.sp.category.widget.NewCategoryPageInstance.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPushLoadMoreListener
            public void onLoadMore() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b4a87be1", new Object[]{this});
                } else {
                    NewCategoryPageInstance.access$200(NewCategoryPageInstance.this).setLoadMore(true);
                }
            }

            @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPushLoadMoreListener
            public void onLoadMoreStateChanged(TBLoadMoreFooter.LoadMoreState loadMoreState, TBLoadMoreFooter.LoadMoreState loadMoreState2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("78cecfe0", new Object[]{this, loadMoreState, loadMoreState2});
                }
            }

            @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout.OnPushLoadMoreListener
            public void onPushDistance(int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1b554b6e", new Object[]{this, new Integer(i2)});
                }
            }
        });
        WidgetInstance widgetInstance = this.navigatorWidgetInstance;
        if (widgetInstance == null) {
            WidgetInstance createSlotWidgetIfNotExist = createSlotWidgetIfNotExist("navigator");
            this.navigatorWidgetInstance = createSlotWidgetIfNotExist;
            if (createSlotWidgetIfNotExist != null) {
                bindSubViewData(createSlotWidgetIfNotExist, "navigator");
                if (this.navigatorWidgetInstance.getView() != null) {
                    ViewProxy.setOnClickListener(this.navigatorWidgetInstance.getView(), new View.OnClickListener() { // from class: com.taobao.message.sp.category.widget.NewCategoryPageInstance.5
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            }
                        }
                    });
                    this.navigatorLayout.addView(this.navigatorWidgetInstance.getView(), -1, -2);
                }
            }
        } else {
            bindSubViewData(widgetInstance, "navigator");
        }
        BaseAbsListWidgetInstance baseAbsListWidgetInstance = this.contentWidgetInstance;
        if (baseAbsListWidgetInstance == null) {
            BaseAbsListWidgetInstance baseAbsListWidgetInstance2 = (BaseAbsListWidgetInstance) createSlotWidgetIfNotExist("content");
            this.contentWidgetInstance = baseAbsListWidgetInstance2;
            if (baseAbsListWidgetInstance2 != null) {
                bindSubViewData(baseAbsListWidgetInstance2, "content");
                if (this.contentWidgetInstance.getView() != null) {
                    this.headWidgetInstance = this.contentWidgetInstance.getHeader();
                    View view = this.contentWidgetInstance.getView();
                    this.swipeRefreshFrameLayout.addView(view, -1, -1);
                    if (view instanceof TRecyclerView) {
                        this.recyclerView = (TRecyclerView) view;
                        final PaddingSupportDrawable paddingSupportDrawable = new PaddingSupportDrawable();
                        this.recyclerView.setBackgroundDrawable(paddingSupportDrawable);
                        this.recyclerView.setOverScrollMode(2);
                        this.recyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: tb.nwj
                            @Override // android.view.View.OnLayoutChangeListener
                            public final void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                                NewCategoryPageInstance.this.lambda$bindData$0(paddingSupportDrawable, view2, i2, i3, i4, i5, i6, i7, i8, i9);
                            }
                        });
                        this.recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.message.sp.category.widget.NewCategoryPageInstance.6
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            public static /* synthetic */ Object ipc$super(AnonymousClass6 r2, String str, Object... objArr) {
                                str.hashCode();
                                int hashCode = str.hashCode();
                                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/sp/category/widget/NewCategoryPageInstance$6");
                            }

                            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                            public void onScrollStateChanged(RecyclerView recyclerView, int i2) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i2)});
                                }
                            }

                            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                            public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i2), new Integer(i3)});
                                } else if (NewCategoryPageInstance.access$300(NewCategoryPageInstance.this) != null) {
                                    float computeVerticalScrollOffset = (recyclerView.computeVerticalScrollOffset() / NewCategoryPageInstance.access$400(NewCategoryPageInstance.this)) + 0.7f;
                                    if (computeVerticalScrollOffset > 1.0f) {
                                        computeVerticalScrollOffset = 1.0f;
                                    }
                                    NewCategoryPageInstance.access$300(NewCategoryPageInstance.this).setAlpha(computeVerticalScrollOffset);
                                    if (recyclerView.computeVerticalScrollOffset() > 0) {
                                        NewCategoryPageInstance.access$300(NewCategoryPageInstance.this).setVisibility(0);
                                    }
                                }
                            }
                        });
                    } else if ((view instanceof ICustomNestedScrollView) && (this.contentWidgetInstance instanceof NestedScrollListener)) {
                        ((ICustomNestedScrollView) view).setContentViews(view, this.headWidgetInstance.getView());
                    }
                }
            }
        } else {
            bindSubViewData(baseAbsListWidgetInstance, "content");
        }
    }

    public void onRefresh(JSONObject jSONObject, EventDispatcher eventDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57cd0ab9", new Object[]{this, jSONObject, eventDispatcher});
            return;
        }
        super.onRefresh((NewCategoryPageInstance) jSONObject, eventDispatcher);
        setupTheme();
    }

    @Override // com.taobao.message.lab.comfrm.render.WidgetInstance
    public View createView(Context context, RenderTemplate renderTemplate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1049360c", new Object[]{this, context, renderTemplate});
        }
        TraceUtil.beginSection("NewCategoryPageView");
        this.systemBarHeight = DisplayUtil.getStatusBarHeight(context);
        this.systemBarAndNavigatorHeight = this.systemBarHeight + DisplayUtil.ap2DesignScalePx(context, ValueUtil.getInteger(renderTemplate.renderData, "navigatorHeight", 48));
        this.frameLayout = new FrameLayout(context);
        this.swipeRefreshFrameLayout = new FrameLayout(context);
        TraceUtil.beginSection("setBg");
        tot totVar = new tot("message", DisplayUtil.getScreenHeight());
        totVar.d = DisplayUtil.ap2DesignScalePx(context, 210.0f);
        totVar.j = true;
        totVar.k = DisplayUtil.ap2DesignScalePx(context, 20.0f);
        ThemeFrameLayout b = cpt.c().b(context, totVar);
        this.skin = b;
        if (b != null) {
            this.frameLayout.addView(b, -1, -1);
        }
        if (ApplicationUtil.isDebug()) {
            Logger.e(TAG, "use FestivalMgr");
        }
        int i = this.systemBarAndNavigatorHeight;
        new tot("message", 1, i).e = i;
        ThemeFrameLayout b2 = cpt.c().b(context, totVar);
        this.navigatorBackground = b2;
        if (b2 != null) {
            this.frameLayout.addView(b2, -1, -1);
        }
        TraceUtil.endTrace();
        considerSubscribeElderFontChange();
        this.swipeRefreshLayout = new TBSwipeRefreshLayout(context) { // from class: com.taobao.message.sp.category.widget.NewCategoryPageInstance.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/sp/category/widget/NewCategoryPageInstance$1");
            }

            @Override // com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout
            public boolean isChildScrollToTop() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("7da7eba6", new Object[]{this})).booleanValue();
                }
                View view = NewCategoryPageInstance.access$000(NewCategoryPageInstance.this).getView();
                if (view instanceof TRecyclerView) {
                    try {
                        if (!(NewCategoryPageInstance.access$100(NewCategoryPageInstance.this) == null || NewCategoryPageInstance.access$100(NewCategoryPageInstance.this).getChildAt(0) == null || NewCategoryPageInstance.access$100(NewCategoryPageInstance.this).getChildLayoutPosition(NewCategoryPageInstance.access$100(NewCategoryPageInstance.this).getChildAt(0)) != 0)) {
                            if (NewCategoryPageInstance.access$100(NewCategoryPageInstance.this).getChildAt(0).getMeasuredHeight() == 0) {
                                return true;
                            }
                        }
                    } catch (Throwable th) {
                        TLog.loge("MPMSGS.NewCategoryPageInstance", th.getMessage());
                    }
                    try {
                        if (!(NewCategoryPageInstance.access$100(NewCategoryPageInstance.this) == null || NewCategoryPageInstance.access$100(NewCategoryPageInstance.this).getChildAt(0) == null || NewCategoryPageInstance.access$100(NewCategoryPageInstance.this).getChildLayoutPosition(NewCategoryPageInstance.access$100(NewCategoryPageInstance.this).getChildAt(0)) != 0)) {
                            if (NewCategoryPageInstance.access$100(NewCategoryPageInstance.this).getChildAt(0).getTop() == 0) {
                                return true;
                            }
                        }
                    } catch (Throwable th2) {
                        TLog.loge("MPMSGS.NewCategoryPageInstance", th2.getMessage());
                    }
                } else if (view instanceof ICustomNestedScrollView) {
                    View view2 = NewCategoryPageInstance.access$000(NewCategoryPageInstance.this).getHeader().getView();
                    if (((ICustomNestedScrollView) view).getTotalScrollY() == 0) {
                        return true;
                    }
                    if (view2 == null && NewCategoryPageInstance.access$100(NewCategoryPageInstance.this) != null && NewCategoryPageInstance.access$100(NewCategoryPageInstance.this).getChildAt(0) != null && NewCategoryPageInstance.access$100(NewCategoryPageInstance.this).getChildLayoutPosition(NewCategoryPageInstance.access$100(NewCategoryPageInstance.this).getChildAt(0)) == 0 && (NewCategoryPageInstance.access$100(NewCategoryPageInstance.this).getChildAt(0).getMeasuredHeight() == 0 || NewCategoryPageInstance.access$100(NewCategoryPageInstance.this).getChildAt(0).getTop() == 0)) {
                        return true;
                    }
                }
                return false;
            }
        };
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = this.systemBarAndNavigatorHeight;
        this.frameLayout.addView(this.swipeRefreshLayout, layoutParams);
        this.swipeRefreshLayout.addView(this.swipeRefreshFrameLayout, -1, -2);
        this.navigatorLayout = new FrameLayout(context);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        this.navigatorLayout.setPadding(0, this.systemBarHeight, 0, 0);
        this.frameLayout.addView(this.navigatorLayout, marginLayoutParams);
        this.swipeRefreshLayout.setSoundEffectsEnabled(true);
        TBOldRefreshHeader tBOldRefreshHeader = new TBOldRefreshHeader(context);
        this.refreshHeader = tBOldRefreshHeader;
        tBOldRefreshHeader.setBackgroundColor(0);
        this.swipeRefreshLayout.setHeaderView(this.refreshHeader);
        this.swipeRefreshLayout.enablePullRefresh(true);
        this.swipeRefreshLayout.setDragRate(0.75f);
        setupTheme();
        IntentFilter intentFilter = new IntentFilter(cpt.ACTION_THEME_CHANGE);
        this.broadcastReceiver = new BroadcastReceiver() { // from class: com.taobao.message.sp.category.widget.NewCategoryPageInstance.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/sp/category/widget/NewCategoryPageInstance$2");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                } else {
                    NewCategoryPageInstance.this.refreshView();
                }
            }
        };
        LocalBroadcastManager.getInstance(context).registerReceiver(this.broadcastReceiver, intentFilter);
        TraceUtil.endTrace();
        return this.frameLayout;
    }
}
