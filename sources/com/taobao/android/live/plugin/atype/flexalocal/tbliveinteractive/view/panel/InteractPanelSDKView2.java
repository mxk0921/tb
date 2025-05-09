package com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.view.panel;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.agf;
import tb.cwd;
import tb.iw0;
import tb.jbu;
import tb.owo;
import tb.s3c;
import tb.s60;
import tb.sgf;
import tb.sjr;
import tb.t2o;
import tb.ukr;
import tb.v2s;
import tb.vu3;
import tb.zff;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class InteractPanelSDKView2 extends BasePopupView implements zff, s3c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private View mCover;
    private AliUrlImageView mEmptyView;
    private Runnable mHideRunnable;
    private agf mInteractPanelNativeOnClickListener;
    private sgf mInteractiveComponentManager;
    private List<IInteractiveProxy.e> mInteractiveNativeComponents = new ArrayList();
    private InteractPanelNormalAdapter mListNativeAdapter;
    private InteractPanelNormalAdapter mListNormalAdapter;
    private RecyclerView mNativeRecyclerView;
    private RecyclerView mNormalRecyclerView;
    private ukr mTBLiveInteractiveManager;
    private String mToken;
    private VideoInfo mVideoInfo;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class LinearSpacingItemDecoration extends RecyclerView.ItemDecoration {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final InteractPanelNormalAdapter f8693a;
        public final String b;

        static {
            t2o.a(295699968);
        }

        public LinearSpacingItemDecoration(InteractPanelNormalAdapter interactPanelNormalAdapter, String str) {
            this.f8693a = interactPanelNormalAdapter;
            this.b = str;
        }

        public static /* synthetic */ Object ipc$super(LinearSpacingItemDecoration linearSpacingItemDecoration, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/tbliveinteractive/view/panel/InteractPanelSDKView2$LinearSpacingItemDecoration");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84db4eca", new Object[]{this, rect, view, recyclerView, state});
                return;
            }
            int max = Math.max(InteractPanelSDKView2.access$100(InteractPanelSDKView2.this).getItemCount(), InteractPanelSDKView2.access$200(InteractPanelSDKView2.this).getItemCount());
            int itemCount = this.f8693a.getItemCount();
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            int e = owo.e(recyclerView.getContext(), this.b, iw0.a(recyclerView.getContext(), 58.0f));
            int min = Math.min(iw0.h(recyclerView.getContext()), iw0.e(recyclerView.getContext()));
            if (max > 5) {
                int a2 = iw0.a(recyclerView.getContext(), 2.0f);
                int max2 = (int) Math.max((double) vu3.b.GEO_NOT_SUPPORT, (((min - a2) / 5.3d) - e) / 2.0d);
                rect.right = max2;
                rect.left = max2;
                if (childAdapterPosition == 0) {
                    rect.left = max2 + a2;
                }
            } else {
                int a3 = iw0.a(recyclerView.getContext(), 9.0f);
                int max3 = Math.max(0, (((min - (a3 * 2)) / 5) - e) / 2);
                rect.right = max3;
                rect.left = max3;
                if (childAdapterPosition == 0) {
                    rect.left = max3 + a3;
                }
                if (itemCount == childAdapterPosition + 1 && itemCount == 5) {
                    rect.right = max3 + a3;
                }
            }
            rect.bottom = 0;
            rect.top = 0;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                InteractPanelSDKView2.access$000(InteractPanelSDKView2.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(InteractPanelSDKView2 interactPanelSDKView2) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            }
        }
    }

    static {
        t2o.a(295699965);
        t2o.a(806356594);
        t2o.a(806355016);
    }

    public InteractPanelSDKView2(Context context, ViewGroup viewGroup, View view, String str, ukr ukrVar, sgf sgfVar, boolean z, VideoInfo videoInfo) {
        super(context, viewGroup, z);
        this.mToken = str;
        this.mTBLiveInteractiveManager = ukrVar;
        this.mInteractiveComponentManager = sgfVar;
        this.mVideoInfo = videoInfo;
        init(view);
    }

    public static /* synthetic */ void access$000(InteractPanelSDKView2 interactPanelSDKView2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc9aee7", new Object[]{interactPanelSDKView2});
        } else {
            interactPanelSDKView2.needHide();
        }
    }

    public static /* synthetic */ InteractPanelNormalAdapter access$100(InteractPanelSDKView2 interactPanelSDKView2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InteractPanelNormalAdapter) ipChange.ipc$dispatch("c52da93d", new Object[]{interactPanelSDKView2});
        }
        return interactPanelSDKView2.mListNormalAdapter;
    }

    public static /* synthetic */ InteractPanelNormalAdapter access$200(InteractPanelSDKView2 interactPanelSDKView2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (InteractPanelNormalAdapter) ipChange.ipc$dispatch("490c72fe", new Object[]{interactPanelSDKView2});
        }
        return interactPanelSDKView2.mListNativeAdapter;
    }

    private void init(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce90a9db", new Object[]{this, view});
            return;
        }
        this.mCover = view;
        if (view != null) {
            view.setContentDescription("返回直播间");
            s60.a(this.mCover);
        }
        View view2 = this.mCover;
        if (view2 != null) {
            ViewProxy.setOnClickListener(view2, new a());
        }
    }

    public static /* synthetic */ Object ipc$super(InteractPanelSDKView2 interactPanelSDKView2, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1775111991) {
            super.hide();
            return null;
        } else if (hashCode == -340027132) {
            super.show();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/live/plugin/atype/flexalocal/tbliveinteractive/view/panel/InteractPanelSDKView2");
        }
    }

    private void needHide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f250e77f", new Object[]{this});
            return;
        }
        hide();
        Runnable runnable = this.mHideRunnable;
        if (runnable != null) {
            runnable.run();
        }
    }

    private void notifyMsgEntranceChanged(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee419a67", new Object[]{this, new Boolean(z)});
        } else if (this.mListNormalAdapter != null && this.mTBLiveInteractiveManager != null) {
            HashMap hashMap = new HashMap();
            if (z) {
                str = "open";
            } else {
                str = "close";
            }
            hashMap.put("action", str);
            hashMap.put("snapshot", this.mListNormalAdapter.O());
            this.mTBLiveInteractiveManager.v("TBLiveWVPlugin.Event.PanelChanged", hashMap);
        }
    }

    private void update() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee4a30d0", new Object[]{this});
            return;
        }
        InteractPanelNormalAdapter interactPanelNormalAdapter = this.mListNormalAdapter;
        if (interactPanelNormalAdapter != null && this.mListNativeAdapter != null && this.mNormalRecyclerView != null && this.mNativeRecyclerView != null && this.mEmptyView != null) {
            if (interactPanelNormalAdapter.getItemCount() > 0 || this.mListNativeAdapter.getItemCount() > 0) {
                this.mNormalRecyclerView.setVisibility(0);
                this.mNativeRecyclerView.setVisibility(0);
                this.mEmptyView.setVisibility(8);
                return;
            }
            this.mNormalRecyclerView.setVisibility(8);
            this.mNativeRecyclerView.setVisibility(8);
            this.mEmptyView.setVisibility(0);
            this.mEmptyView.setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN01VnWM891K3xtcYvUJP_!!6000000001109-2-tps-930-540.png");
        }
    }

    @Override // tb.zff
    public void addInteractComponent(IInteractiveProxy.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfa8b9bb", new Object[]{this, eVar});
        } else {
            addNormalPanelViewItem(eVar);
        }
    }

    @Override // tb.zff
    public void addNativeComponent(IInteractiveProxy.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35d98d3a", new Object[]{this, eVar});
        } else {
            addNativePanelViewItem(eVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void addNativePanelViewItem(com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.e r5) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.view.panel.InteractPanelSDKView2.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "6c56ba39"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r3 = 1
            r2[r3] = r5
            r0.ipc$dispatch(r1, r2)
            return
        L_0x0015:
            com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.view.panel.InteractPanelNormalAdapter r0 = r4.mListNativeAdapter
            if (r0 == 0) goto L_0x001d
            r0.M(r5)
            goto L_0x0067
        L_0x001d:
            java.util.List<com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy$e> r0 = r4.mInteractiveNativeComponents
            java.util.Iterator r0 = r0.iterator()
        L_0x0023:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005c
            java.lang.Object r1 = r0.next()
            com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy$e r1 = (com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy.e) r1
            java.lang.String r2 = r5.getName()
            java.lang.String r3 = r1.getName()
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 != 0) goto L_0x004b
            java.lang.String r2 = r5.getFedName()
            java.lang.String r3 = r1.getFedName()
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L_0x0023
        L_0x004b:
            java.util.List<com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy$e> r0 = r4.mInteractiveNativeComponents
            r0.remove(r1)
            boolean r0 = r5.isNeedShowEntrance()
            if (r0 == 0) goto L_0x0067
            java.util.List<com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy$e> r0 = r4.mInteractiveNativeComponents
            r0.add(r5)
            goto L_0x0067
        L_0x005c:
            boolean r0 = r5.isNeedShowEntrance()
            if (r0 == 0) goto L_0x0067
            java.util.List<com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy$e> r0 = r4.mInteractiveNativeComponents
            r0.add(r5)
        L_0x0067:
            r4.update()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.view.panel.InteractPanelSDKView2.addNativePanelViewItem(com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy$e):void");
    }

    public void addNormalPanelViewItem(IInteractiveProxy.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94fd4769", new Object[]{this, eVar});
            return;
        }
        InteractPanelNormalAdapter interactPanelNormalAdapter = this.mListNormalAdapter;
        if (interactPanelNormalAdapter != null) {
            interactPanelNormalAdapter.M(eVar);
        } else {
            sgf sgfVar = this.mInteractiveComponentManager;
            if (sgfVar != null) {
                sgfVar.q(eVar);
            }
        }
        update();
    }

    @Override // tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return ukr.EVENTCENTER_BIZCODE;
    }

    @Override // tb.zff
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.mInteractiveNativeComponents.clear();
        sjr.g().b(this);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.view.panel.BasePopupView, tb.zff
    public void hide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        super.hide();
        notifyMsgEntranceChanged(false);
        v2s.o().A().c(cwd.LOG_TAG, "InteractPanel---hide");
        View view = this.mCover;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.view.panel.BasePopupView
    public boolean isLazyLoad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d5a9c4f", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{"com.taobao.taolive.room.dxmanager.event", "com.taobao.taolive.room.interactive_component_update_entrance_info"};
    }

    @Override // tb.s3c
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        return this.mToken;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.view.panel.BasePopupView
    public ViewGroup.LayoutParams onCreateLayoutParams(View view, DisplayMetrics displayMetrics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup.LayoutParams) ipChange.ipc$dispatch("24d7a7e0", new Object[]{this, view, displayMetrics});
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1);
        }
        ukr ukrVar = this.mTBLiveInteractiveManager;
        if (ukrVar == null || (!ukrVar.getActionAdapter().b(getContext()) && !this.mTBLiveInteractiveManager.getActionAdapter().a(getContext()))) {
            int min = Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
            if (this.mbPopFromRight) {
                if (layoutParams instanceof FrameLayout.LayoutParams) {
                    ((FrameLayout.LayoutParams) layoutParams).gravity = 53;
                }
                layoutParams.width = min;
                layoutParams.height = min;
            } else {
                if (layoutParams instanceof FrameLayout.LayoutParams) {
                    ((FrameLayout.LayoutParams) layoutParams).gravity = 83;
                }
                layoutParams.width = min;
                layoutParams.height = -2;
            }
        } else {
            int u = this.mTBLiveInteractiveManager.getActionAdapter().u(getContext());
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) layoutParams).gravity = 85;
            }
            layoutParams.width = u;
            layoutParams.height = -2;
        }
        return layoutParams;
    }

    @Override // tb.zff
    public void removeInteractComponent(IInteractiveProxy.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36b379b8", new Object[]{this, eVar});
        } else {
            removeNormalPanelViewItem(eVar);
        }
    }

    public void removeNormalPanelViewItem(IInteractiveProxy.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5457fc26", new Object[]{this, eVar});
            return;
        }
        InteractPanelNormalAdapter interactPanelNormalAdapter = this.mListNormalAdapter;
        if (interactPanelNormalAdapter != null) {
            interactPanelNormalAdapter.P(eVar);
        } else {
            sgf sgfVar = this.mInteractiveComponentManager;
            if (sgfVar != null) {
                sgfVar.G(eVar);
            }
        }
        update();
    }

    public void setHideRunnable(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44e27286", new Object[]{this, runnable});
        } else {
            this.mHideRunnable = runnable;
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.view.panel.BasePopupView
    public View onCreateContentView(ViewGroup viewGroup) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a25b4d4b", new Object[]{this, viewGroup});
        }
        if (viewGroup == null) {
            return null;
        }
        setVisibility(8);
        this.mContentView = viewGroup;
        if (this.mbPopFromRight) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.taolive_interact_panel_layout2_flexalocal, this.mContentView, false);
        } else {
            view = LayoutInflater.from(getContext()).inflate(R.layout.taolive_interact_panel_layout2_flexalocal, this.mContentView, false);
        }
        this.mEmptyView = (AliUrlImageView) view.findViewById(R.id.empty_view);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.taolive_intercat_recycler_normal);
        this.mNormalRecyclerView = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this.mContext, 0, false));
        this.mNormalRecyclerView.setHasFixedSize(true);
        this.mListNormalAdapter = new InteractPanelNormalAdapter(this.mToken, this.mContext, this.mTBLiveInteractiveManager, "taolive_interact_panel_normal");
        ArrayList arrayList = new ArrayList();
        sgf sgfVar = this.mInteractiveComponentManager;
        if (sgfVar != null) {
            arrayList.addAll(sgfVar.w());
        }
        this.mListNormalAdapter.Q(arrayList);
        this.mNormalRecyclerView.setAdapter(this.mListNormalAdapter);
        this.mNormalRecyclerView.addItemDecoration(new LinearSpacingItemDecoration(this.mListNormalAdapter, "58ap"));
        ((DefaultItemAnimator) this.mNormalRecyclerView.getItemAnimator()).setSupportsChangeAnimations(false);
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.taolive_intercat_recycler_native);
        this.mNativeRecyclerView = recyclerView2;
        recyclerView2.setLayoutManager(new LinearLayoutManager(this.mContext, 0, false));
        this.mNativeRecyclerView.setHasFixedSize(true);
        InteractPanelNormalAdapter interactPanelNormalAdapter = new InteractPanelNormalAdapter(this.mToken, this.mContext, this.mTBLiveInteractiveManager, "taolive_interact_panel_native");
        this.mListNativeAdapter = interactPanelNormalAdapter;
        interactPanelNormalAdapter.Q(this.mInteractiveNativeComponents);
        this.mNativeRecyclerView.setAdapter(this.mListNativeAdapter);
        this.mNativeRecyclerView.addItemDecoration(new LinearSpacingItemDecoration(this.mListNativeAdapter, "65ap"));
        ((DefaultItemAnimator) this.mNativeRecyclerView.getItemAnimator()).setSupportsChangeAnimations(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 85;
        this.mContentView.addView(view, layoutParams);
        this.mContentView.setVisibility(8);
        ViewProxy.setOnClickListener(view, new b(this));
        v2s.o().A().c(cwd.LOG_TAG, "InteractPanel---init");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Context context = this.mContext;
        if (context instanceof Activity) {
            ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        } else {
            displayMetrics = context.getResources().getDisplayMetrics();
        }
        view.setLayoutParams(onCreateLayoutParams(view, displayMetrics));
        return this.mContentView;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.view.panel.BasePopupView, tb.zff
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        super.show();
        v2s.o().A().c(cwd.LOG_TAG, "InteractPanel---show");
        jbu.g(this.mTBLiveInteractiveManager, "show-tab_morefunction", new HashMap());
        ViewGroup viewGroup = this.mContentView;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        View view = this.mCover;
        if (view != null) {
            view.setVisibility(0);
        }
        update();
        InteractPanelNormalAdapter interactPanelNormalAdapter = this.mListNormalAdapter;
        if (interactPanelNormalAdapter != null) {
            interactPanelNormalAdapter.notifyDataSetChanged();
        }
        InteractPanelNormalAdapter interactPanelNormalAdapter2 = this.mListNativeAdapter;
        if (interactPanelNormalAdapter2 != null) {
            interactPanelNormalAdapter2.notifyDataSetChanged();
        }
        notifyMsgEntranceChanged(true);
        ViewGroup viewGroup2 = this.mContentView;
        if (viewGroup2 != null) {
            int i = R.id.tv_interact;
            if (viewGroup2.findViewById(i) != null) {
                this.mContentView.findViewById(i).sendAccessibilityEvent(8);
            }
        }
    }

    @Override // tb.zff
    public void init(agf agfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a82e3573", new Object[]{this, agfVar});
            return;
        }
        this.mInteractPanelNativeOnClickListener = agfVar;
        sjr.g().a(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d2, code lost:
        if (r2.equals(r6.type) != false) goto L_0x00d7;
     */
    @Override // tb.s3c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onEvent(java.lang.String r18, java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.view.panel.InteractPanelSDKView2.onEvent(java.lang.String, java.lang.Object):void");
    }
}
