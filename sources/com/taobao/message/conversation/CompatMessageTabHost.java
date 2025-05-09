package com.taobao.message.conversation;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentStateManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.appbundle.remote.LoadConfig;
import com.taobao.appbundle.remote.view.RemoteLoadingView;
import com.taobao.message.kit.util.BizTagUtil;
import com.taobao.message.kit.util.BundleSplitUtil;
import com.taobao.message.kit.util.RemoteMonitorUtil;
import com.taobao.message.kit.util.TraceUtil;
import com.taobao.message.launcher.init.FeatureInitHelper;
import com.taobao.message.uikit.util.DisplayUtil;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import kotlin.Metadata;
import tb.a07;
import tb.acq;
import tb.ckf;
import tb.g1a;
import tb.pb6;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u0000 L2\u00020\u0001:\u0001LB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u000b\u001a\u00020\t2#\u0010\n\u001a\u001f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u0016J\u0019\u0010\u001c\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\"\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\"\u0010#J\u0019\u0010&\u001a\u00020\t2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'J+\u0010(\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b(\u0010#J!\u0010)\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\tH\u0016¢\u0006\u0004\b+\u0010\u0003J\u000f\u0010,\u001a\u00020\tH\u0016¢\u0006\u0004\b,\u0010\u0003J\u000f\u0010-\u001a\u00020\tH\u0016¢\u0006\u0004\b-\u0010\u0003J\u0019\u0010/\u001a\u00020\t2\b\u0010.\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b/\u0010\u001dJ\u0011\u00100\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b0\u00101J\u0015\u00103\u001a\u00020\t2\u0006\u00102\u001a\u00020\u0005¢\u0006\u0004\b3\u00104R\u0018\u00105\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00107\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u00109\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010>\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010:R\u0018\u0010?\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010D\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010F\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010ER\u0016\u0010G\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010ER\u0016\u0010H\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010ER\u0016\u0010J\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010K¨\u0006M"}, d2 = {"Lcom/taobao/message/conversation/CompatMessageTabHost;", "Lcom/taobao/message/conversation/IMessageTabHost;", "<init>", "()V", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "errorMsg", "Ltb/xhv;", "onError", "downloadBundle", "(Ltb/g1a;)V", "", "needMakeUp", "createHost", "(Z)V", "Landroid/view/View;", "view", "replaceContentView", "(Landroid/view/View;)V", "renderNativeHeaderView", "()Landroid/view/View;", "renderHeaderView", "renderLoadingView", "renderLoadingLayout", "Landroid/os/Bundle;", FragmentStateManager.SAVED_INSTANCE_STATE_KEY, "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateViewTabHost", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "onCreateView", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "onPause", "onDestroy", "bundle", "onArguments", "getInner", "()Lcom/taobao/message/conversation/IMessageTabHost;", "key", "addTimeLine", "(Ljava/lang/String;)V", "mTargetHost", "Lcom/taobao/message/conversation/IMessageTabHost;", "mContainerView", "Landroid/view/ViewGroup;", "mSavedState", "Landroid/os/Bundle;", "Landroidx/fragment/app/FragmentActivity;", "mActivity", "Landroidx/fragment/app/FragmentActivity;", "mArgs", "mInflate", "Landroid/view/LayoutInflater;", "Lcom/taobao/appbundle/remote/view/RemoteLoadingView;", "mLoadingView", "Lcom/taobao/appbundle/remote/view/RemoteLoadingView;", "needCreateView", "Z", "needViewCreated", "needResume", "isLoading", "", "loadingStartTime", "J", "Companion", "message_base_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class CompatMessageTabHost implements IMessageTabHost {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SOURCE = "category";
    private boolean isLoading;
    private long loadingStartTime;
    private FragmentActivity mActivity;
    private Bundle mArgs;
    private ViewGroup mContainerView;
    private LayoutInflater mInflate;
    private RemoteLoadingView mLoadingView;
    private Bundle mSavedState;
    private IMessageTabHost mTargetHost;
    private boolean needCreateView;
    private boolean needResume;
    private boolean needViewCreated;
    public static final Companion Companion = new Companion(null);
    private static String targetHostClass = "com.taobao.message.conversation.DefaultMessageTabHost";

    /* compiled from: Taobao */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/taobao/message/conversation/CompatMessageTabHost$Companion;", "", "()V", "SOURCE", "", "targetHostClass", "getTargetHostClass", "()Ljava/lang/String;", "setTargetHostClass", "(Ljava/lang/String;)V", "message_base_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class Companion {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(529530898);
        }

        private Companion() {
        }

        public final String getTargetHostClass() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("cfb0aab0", new Object[]{this});
            }
            return CompatMessageTabHost.access$getTargetHostClass$cp();
        }

        public final void setTargetHostClass(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e08c802e", new Object[]{this, str});
                return;
            }
            ckf.h(str, "<set-?>");
            CompatMessageTabHost.access$setTargetHostClass$cp(str);
        }

        public /* synthetic */ Companion(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(529530897);
        t2o.a(529530907);
    }

    public static final /* synthetic */ void access$createHost(CompatMessageTabHost compatMessageTabHost, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99a11423", new Object[]{compatMessageTabHost, new Boolean(z)});
        } else {
            compatMessageTabHost.createHost(z);
        }
    }

    public static final /* synthetic */ void access$downloadBundle(CompatMessageTabHost compatMessageTabHost, g1a g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6c8917d", new Object[]{compatMessageTabHost, g1aVar});
        } else {
            compatMessageTabHost.downloadBundle(g1aVar);
        }
    }

    public static final /* synthetic */ FragmentActivity access$getMActivity$p(CompatMessageTabHost compatMessageTabHost) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentActivity) ipChange.ipc$dispatch("90e2f20", new Object[]{compatMessageTabHost});
        }
        return compatMessageTabHost.mActivity;
    }

    public static final /* synthetic */ RemoteLoadingView access$getMLoadingView$p(CompatMessageTabHost compatMessageTabHost) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteLoadingView) ipChange.ipc$dispatch("bc3f7e7", new Object[]{compatMessageTabHost});
        }
        return compatMessageTabHost.mLoadingView;
    }

    public static final /* synthetic */ String access$getTargetHostClass$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c770ec31", new Object[0]);
        }
        return targetHostClass;
    }

    public static final /* synthetic */ boolean access$isLoading$p(CompatMessageTabHost compatMessageTabHost) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f10bf20f", new Object[]{compatMessageTabHost})).booleanValue();
        }
        return compatMessageTabHost.isLoading;
    }

    public static final /* synthetic */ View access$renderLoadingLayout(CompatMessageTabHost compatMessageTabHost) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("2996771f", new Object[]{compatMessageTabHost});
        }
        return compatMessageTabHost.renderLoadingLayout();
    }

    public static final /* synthetic */ void access$replaceContentView(CompatMessageTabHost compatMessageTabHost, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d0237b", new Object[]{compatMessageTabHost, view});
        } else {
            compatMessageTabHost.replaceContentView(view);
        }
    }

    public static final /* synthetic */ void access$setLoading$p(CompatMessageTabHost compatMessageTabHost, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78586ee1", new Object[]{compatMessageTabHost, new Boolean(z)});
        } else {
            compatMessageTabHost.isLoading = z;
        }
    }

    public static final /* synthetic */ void access$setMActivity$p(CompatMessageTabHost compatMessageTabHost, FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("830fc49c", new Object[]{compatMessageTabHost, fragmentActivity});
        } else {
            compatMessageTabHost.mActivity = fragmentActivity;
        }
    }

    public static final /* synthetic */ void access$setMLoadingView$p(CompatMessageTabHost compatMessageTabHost, RemoteLoadingView remoteLoadingView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("309e03", new Object[]{compatMessageTabHost, remoteLoadingView});
        } else {
            compatMessageTabHost.mLoadingView = remoteLoadingView;
        }
    }

    public static final /* synthetic */ void access$setTargetHostClass$cp(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a7e5565", new Object[]{str});
        } else {
            targetHostClass = str;
        }
    }

    private final void createHost(boolean z) {
        IMessageTabHost iMessageTabHost;
        IMessageTabHost iMessageTabHost2;
        TLog.loge(BundleSplitUtil.TAG, "createHost");
        if (this.mTargetHost == null) {
            ckf.b("1", OrangeConfig.getInstance().getConfig("mpm_data_switch", "enableMessageTab", "1"));
            Object newInstance = Class.forName(targetHostClass).newInstance();
            if (newInstance instanceof IMessageTabHost) {
                IMessageTabHost iMessageTabHost3 = (IMessageTabHost) newInstance;
                this.mTargetHost = iMessageTabHost3;
                if (iMessageTabHost3 != null) {
                    iMessageTabHost3.onAttach(this.mActivity);
                }
                IMessageTabHost iMessageTabHost4 = this.mTargetHost;
                if (iMessageTabHost4 != null) {
                    iMessageTabHost4.onArguments(this.mArgs);
                }
                IMessageTabHost iMessageTabHost5 = this.mTargetHost;
                if (iMessageTabHost5 != null) {
                    iMessageTabHost5.onCreate(this.mSavedState);
                }
            }
            if (z) {
                if (this.needCreateView) {
                    LayoutInflater layoutInflater = this.mInflate;
                    if (layoutInflater != null) {
                        replaceContentView(onCreateViewTabHost(layoutInflater, this.mContainerView, this.mSavedState));
                        if (this.loadingStartTime > 0) {
                            RemoteMonitorUtil.INSTANCE.loadingDurationStat(System.currentTimeMillis() - this.loadingStartTime, "category");
                        }
                    } else {
                        ckf.s();
                        throw null;
                    }
                }
                if (this.needViewCreated && (iMessageTabHost2 = this.mTargetHost) != null) {
                    iMessageTabHost2.onViewCreated(this.mContainerView, this.mSavedState);
                }
                if (this.needResume && (iMessageTabHost = this.mTargetHost) != null) {
                    iMessageTabHost.onResume();
                }
            }
        }
    }

    private final void downloadBundle(g1a<? super String, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ccd0877", new Object[]{this, g1aVar});
        } else {
            BundleSplitUtil.INSTANCE.checkMsgBundleReady("category", 20, new CompatMessageTabHost$downloadBundle$1(this), new CompatMessageTabHost$downloadBundle$2(g1aVar), true, new CompatMessageTabHost$downloadBundle$3(this));
        }
    }

    private final View renderLoadingLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7beaba99", new Object[]{this});
        }
        addTimeLine("onShowLoading");
        this.loadingStartTime = System.currentTimeMillis();
        FragmentActivity fragmentActivity = this.mActivity;
        if (fragmentActivity != null) {
            FrameLayout frameLayout = new FrameLayout(fragmentActivity);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, DisplayUtil.ap2DesignScalePx(this.mActivity, 48.0f));
            FragmentActivity fragmentActivity2 = this.mActivity;
            if (fragmentActivity2 != null) {
                layoutParams.topMargin = DisplayUtil.getStatusBarHeight(fragmentActivity2);
                frameLayout.addView(renderNativeHeaderView(), layoutParams);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams2.gravity = 17;
                frameLayout.addView(renderLoadingView(), layoutParams2);
                return frameLayout;
            }
            ckf.s();
            throw null;
        }
        ckf.s();
        throw null;
    }

    private final View renderNativeHeaderView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("3d2267c8", new Object[]{this});
        }
        TextView textView = new TextView(this.mActivity);
        textView.setText(DisplayUtil.localizedString(R.string.mp_loading_2));
        FragmentActivity fragmentActivity = this.mActivity;
        textView.setTextSize(pb6.D(fragmentActivity, DisplayUtil.ap2DesignScalePx(fragmentActivity, 21.0f)));
        textView.setGravity(16);
        textView.setTextColor(Color.parseColor("#111111"));
        textView.setPadding(DisplayUtil.ap2DesignScalePx(this.mActivity, 12.0f), 0, 0, 0);
        textView.setTypeface(null, 1);
        return textView;
    }

    private final void replaceContentView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10c48e41", new Object[]{this, view});
            return;
        }
        ViewGroup viewGroup = this.mContainerView;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        ViewGroup viewGroup2 = this.mContainerView;
        if (viewGroup2 != null) {
            viewGroup2.addView(view, -1, -1);
        }
    }

    public final void addTimeLine(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("865a8933", new Object[]{this, str});
            return;
        }
        ckf.h(str, "key");
        Bundle bundle = this.mArgs;
        if (bundle != null) {
            bundle.putLong("mptl_".concat(str), SystemClock.uptimeMillis());
        }
    }

    @Override // com.taobao.message.conversation.IMessageTabHost
    public IMessageTabHost getInner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMessageTabHost) ipChange.ipc$dispatch("d4cf436a", new Object[]{this});
        }
        return this.mTargetHost;
    }

    @Override // com.taobao.message.conversation.IMessageTabHost
    public void onArguments(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7921a8d6", new Object[]{this, bundle});
            return;
        }
        this.mArgs = bundle;
        if (bundle == null) {
            this.mArgs = new Bundle();
        }
    }

    @Override // com.taobao.message.conversation.IMessageTabHost
    public void onAttach(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a141669d", new Object[]{this, context});
        } else if (context instanceof FragmentActivity) {
            this.mActivity = (FragmentActivity) context;
        }
    }

    public final View onCreateViewTabHost(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b2c3bf19", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        ckf.h(layoutInflater, "inflater");
        IMessageTabHost iMessageTabHost = this.mTargetHost;
        if (iMessageTabHost != null) {
            view = iMessageTabHost.onCreateView(layoutInflater, viewGroup, bundle);
        } else {
            view = null;
        }
        if (view != null) {
            return view;
        }
        ckf.s();
        throw null;
    }

    @Override // com.taobao.message.conversation.IMessageTabHost
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        IMessageTabHost iMessageTabHost = this.mTargetHost;
        if (iMessageTabHost != null) {
            iMessageTabHost.onDestroy();
        }
    }

    @Override // com.taobao.message.conversation.IMessageTabHost
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        if (this.isLoading) {
            RemoteMonitorUtil.INSTANCE.remoteLoadBackCount("category");
        }
        IMessageTabHost iMessageTabHost = this.mTargetHost;
        if (iMessageTabHost != null) {
            iMessageTabHost.onPause();
        }
    }

    @Override // com.taobao.message.conversation.IMessageTabHost
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        IMessageTabHost iMessageTabHost = this.mTargetHost;
        if (iMessageTabHost == null) {
            this.needResume = true;
        } else if (iMessageTabHost != null) {
            iMessageTabHost.onResume();
        }
    }

    private final View renderHeaderView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("971dd011", new Object[]{this});
        }
        DXEngineConfig.b bVar = new DXEngineConfig.b("alimp_message");
        BizTagUtil.BizTag bizTag = BizTagUtil.getBizTag(this.mActivity);
        if (bizTag != null) {
            bVar.X(bizTag.bizId());
            bVar.Y(bizTag.bizName());
        }
        try {
            bVar.T(true);
        } catch (Throwable unused) {
        }
        FragmentActivity fragmentActivity = this.mActivity;
        Context context = null;
        if (DisplayUtil.isLargeScreen(fragmentActivity != null ? fragmentActivity.getApplicationContext() : null)) {
            bVar.H(true, true);
        }
        DinamicXEngine dinamicXEngine = new DinamicXEngine(bVar.F());
        FragmentActivity fragmentActivity2 = this.mActivity;
        if (fragmentActivity2 != null) {
            context = fragmentActivity2.getApplicationContext();
        }
        if (DisplayUtil.isLargeScreen(context)) {
            dinamicXEngine.l1(this.mActivity);
        }
        DXTemplateItem dXTemplateItem = new DXTemplateItem();
        dXTemplateItem.f7343a = "alimp_category_main_titlebar";
        dXTemplateItem.c = "https://dinamicx.alibabausercontent.com/pub/alimp_category_main_titlebar/1651131218083/alimp_category_main_titlebar.zip";
        dXTemplateItem.b = 1651131218083L;
        DXRootView dXRootView = dinamicXEngine.o(this.mActivity, dinamicXEngine.u(dXTemplateItem)).f7291a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "title", DisplayUtil.localizedString(R.string.mp_loading_2));
        jSONObject.put((JSONObject) "disableFunc", "1");
        jSONObject.put((JSONObject) "disableClearAll", "1");
        dinamicXEngine.j1(dXRootView, jSONObject);
        ckf.c(dXRootView, "view");
        return dXRootView;
    }

    private final View renderLoadingView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("5f619d54", new Object[]{this});
        }
        RemoteLoadingView remoteLoadingView = new RemoteLoadingView(this.mActivity, new LoadConfig.b().m("message").l());
        this.mLoadingView = remoteLoadingView;
        remoteLoadingView.setBackgroundColor(0);
        RemoteLoadingView remoteLoadingView2 = this.mLoadingView;
        if (remoteLoadingView2 != null) {
            return remoteLoadingView2;
        }
        ckf.s();
        throw null;
    }

    @Override // com.taobao.message.conversation.IMessageTabHost
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        TLog.loge(BundleSplitUtil.TAG, "onCreate");
        addTimeLine("onCreate");
        this.mSavedState = bundle;
        boolean isMsgBundleReady = BundleSplitUtil.INSTANCE.isMsgBundleReady();
        addTimeLine("onAfterLoad");
        RemoteMonitorUtil remoteMonitorUtil = RemoteMonitorUtil.INSTANCE;
        remoteMonitorUtil.directLoadAlarm4Source(this.mActivity, "category", isMsgBundleReady);
        if (isMsgBundleReady) {
            TLog.loge(BundleSplitUtil.TAG, "feature ready");
            FeatureInitHelper.directInit(new CompatMessageTabHost$onCreate$1(this));
            return;
        }
        this.isLoading = true;
        remoteMonitorUtil.remoteLoadCount("category");
        TLog.loge(BundleSplitUtil.TAG, "feature not ready");
        downloadBundle(new CompatMessageTabHost$onCreate$2(this));
    }

    @Override // com.taobao.message.conversation.IMessageTabHost
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        ckf.h(view, "view");
        TLog.loge(BundleSplitUtil.TAG, "onViewCreated");
        IMessageTabHost iMessageTabHost = this.mTargetHost;
        if (iMessageTabHost == null) {
            this.needViewCreated = true;
        } else if (iMessageTabHost != null) {
            iMessageTabHost.onViewCreated(view, bundle);
        }
    }

    @Override // com.taobao.message.conversation.IMessageTabHost
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        ckf.h(layoutInflater, "inflater");
        TLog.loge(BundleSplitUtil.TAG, "onCreateView");
        addTimeLine("onCreateView");
        TraceUtil.beginSection("installActivity");
        FragmentActivity fragmentActivity = this.mActivity;
        if (fragmentActivity != null) {
            acq.B(fragmentActivity);
            TraceUtil.endTrace();
            addTimeLine("onAfterResInject");
            this.mInflate = layoutInflater;
            this.mSavedState = bundle;
            this.mContainerView = viewGroup;
            if (this.mTargetHost != null) {
                TLog.loge(BundleSplitUtil.TAG, "render tabHost");
                return onCreateViewTabHost(layoutInflater, viewGroup, bundle);
            } else if (BundleSplitUtil.INSTANCE.isMsgBundleReady()) {
                TLog.loge(BundleSplitUtil.TAG, "make up tabHost");
                this.isLoading = false;
                RemoteMonitorUtil.INSTANCE.remoteLoadTimeoutCount("category");
                createHost(false);
                LayoutInflater layoutInflater2 = this.mInflate;
                if (layoutInflater2 != null) {
                    return onCreateViewTabHost(layoutInflater2, viewGroup, this.mSavedState);
                }
                ckf.s();
                throw null;
            } else {
                TLog.loge(BundleSplitUtil.TAG, "render loading");
                this.needCreateView = true;
                return renderLoadingLayout();
            }
        } else {
            ckf.s();
            throw null;
        }
    }
}
