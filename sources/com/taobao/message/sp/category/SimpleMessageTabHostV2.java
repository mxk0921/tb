package com.taobao.message.sp.category;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentStateManager;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.android.ucp.util.LoginBroadcastReceiver;
import com.taobao.artc.api.ArtcStats;
import com.taobao.login4android.api.Login;
import com.taobao.message.SimpleFrameworkModule;
import com.taobao.message.conversation.IMessageTabHost;
import com.taobao.message.kit.util.BundleSplitUtil;
import com.taobao.message.kit.util.IdentifierUtil;
import com.taobao.message.kit.util.RemoteMonitorUtil;
import com.taobao.message.lab.comfrm.inner.Schedules;
import com.taobao.message.lab.comfrm.inner2.Container;
import com.taobao.message.lab.comfrm.inner2.ExecuteService;
import com.taobao.message.lab.comfrm.render.WidgetRenderImpl;
import com.taobao.message.launcher.init.FeatureInitHelper;
import com.taobao.message.message_open_api_adapter.OpenApiService;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.message.uikit.util.DisplayUtil;
import com.taobao.orange.OrangeConfig;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.g1a;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 X2\u00020\u0001:\u0001XB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J4\u0010\r\u001a\u00020\u00042#\u0010\f\u001a\u001f\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u0019\u0010\u001c\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\"\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\"\u0010#J\u0019\u0010&\u001a\u00020\u00042\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'J+\u0010(\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b(\u0010#J!\u0010)\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0004H\u0016¢\u0006\u0004\b+\u0010\u0003J\u000f\u0010,\u001a\u00020\u0004H\u0016¢\u0006\u0004\b,\u0010\u0003J\u0019\u0010.\u001a\u00020\u00042\b\u0010-\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b.\u0010\u001dJ\u0011\u0010/\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b/\u00100J\u0015\u00102\u001a\u00020\u00042\u0006\u00101\u001a\u00020\b¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0004H\u0016¢\u0006\u0004\b4\u0010\u0003R\u001a\u00106\u001a\u0002058\u0006X\u0086D¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0018\u0010:\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010<\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010>\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010A\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010C\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010?R\u0018\u0010D\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010G\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010I\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010K\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010JR\u0016\u0010L\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010JR\u0016\u0010M\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010JR\u0016\u0010N\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010JR\u0016\u0010P\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010S\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010U\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u00107R\u0016\u0010V\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010QR\u0016\u0010W\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010Q¨\u0006Y"}, d2 = {"Lcom/taobao/message/sp/category/SimpleMessageTabHostV2;", "Lcom/taobao/message/conversation/IMessageTabHost;", "<init>", "()V", "Ltb/xhv;", "registerLogin", "unRegisterLogin", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "errorMsg", "onError", "downloadBundle", "(Ltb/g1a;)V", "", "needMakeUp", "createHost", "(Z)V", "Landroid/view/View;", "view", "replaceContentView", "(Landroid/view/View;)V", "renderLoadingLayout", "()Landroid/view/View;", "renderEmptyLayout", "Landroid/os/Bundle;", FragmentStateManager.SAVED_INSTANCE_STATE_KEY, "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateViewTabHost", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "onCreateView", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "onPause", "bundle", "onArguments", "getInner", "()Lcom/taobao/message/conversation/IMessageTabHost;", "key", "addTimeLine", "(Ljava/lang/String;)V", "onDestroy", "", "MAX_COUNT", TLogTracker.LEVEL_INFO, "getMAX_COUNT", "()I", "mTargetHost", "Lcom/taobao/message/conversation/IMessageTabHost;", "mContainerView", "Landroid/view/ViewGroup;", "mSavedState", "Landroid/os/Bundle;", "Landroidx/fragment/app/FragmentActivity;", "mActivity", "Landroidx/fragment/app/FragmentActivity;", "mArgs", "mInflate", "Landroid/view/LayoutInflater;", "Lcom/taobao/message/lab/comfrm/inner2/Container;", "mContainer", "Lcom/taobao/message/lab/comfrm/inner2/Container;", "needCreateView", "Z", "needViewCreated", "needResume", "isLoading", "isRealHost", "", "loadingStartTime", "J", "Landroid/content/BroadcastReceiver;", "broadcastReceiver", "Landroid/content/BroadcastReceiver;", ArtcStats.STAT_RETRYCOUNT, "pageStartTime", "hostOnCreateTime", "Companion", "message_sp_category_debug"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class SimpleMessageTabHostV2 implements IMessageTabHost {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SOURCE = "category";
    public static final String TAG = "SimpleMessageTabHost";
    private BroadcastReceiver broadcastReceiver;
    private boolean isLoading;
    private boolean isRealHost;
    private long loadingStartTime;
    private FragmentActivity mActivity;
    private Bundle mArgs;
    private Container mContainer;
    private ViewGroup mContainerView;
    private LayoutInflater mInflate;
    private Bundle mSavedState;
    private IMessageTabHost mTargetHost;
    private boolean needCreateView;
    private boolean needResume;
    private boolean needViewCreated;
    private int retryCount;
    public static final Companion Companion = new Companion(null);
    private static String targetHostClass = "com.taobao.message.conversation.DefaultMessageTabHost";
    private final int MAX_COUNT = 3;
    private long pageStartTime = -1;
    private long hostOnCreateTime = -1;

    /* compiled from: Taobao */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/taobao/message/sp/category/SimpleMessageTabHostV2$Companion;", "", "()V", "SOURCE", "", RPCDataItems.SWITCH_TAG_LOG, "targetHostClass", "getTargetHostClass", "()Ljava/lang/String;", "setTargetHostClass", "(Ljava/lang/String;)V", "message_sp_category_debug"}, k = 1, mv = {1, 1, 15})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class Companion {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(550502404);
        }

        private Companion() {
        }

        public final String getTargetHostClass() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("cfb0aab0", new Object[]{this});
            }
            return SimpleMessageTabHostV2.access$getTargetHostClass$cp();
        }

        public final void setTargetHostClass(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e08c802e", new Object[]{this, str});
                return;
            }
            ckf.h(str, "<set-?>");
            SimpleMessageTabHostV2.access$setTargetHostClass$cp(str);
        }

        public /* synthetic */ Companion(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(550502403);
        t2o.a(529530907);
    }

    public static final /* synthetic */ void access$downloadBundle(SimpleMessageTabHostV2 simpleMessageTabHostV2, g1a g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f0f6518", new Object[]{simpleMessageTabHostV2, g1aVar});
        } else {
            simpleMessageTabHostV2.downloadBundle(g1aVar);
        }
    }

    public static final /* synthetic */ Container access$getMContainer$p(SimpleMessageTabHostV2 simpleMessageTabHostV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Container) ipChange.ipc$dispatch("c0b556df", new Object[]{simpleMessageTabHostV2});
        }
        return simpleMessageTabHostV2.mContainer;
    }

    public static final /* synthetic */ int access$getRetryCount$p(SimpleMessageTabHostV2 simpleMessageTabHostV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eb759cc6", new Object[]{simpleMessageTabHostV2})).intValue();
        }
        return simpleMessageTabHostV2.retryCount;
    }

    public static final /* synthetic */ String access$getTargetHostClass$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c770ec31", new Object[0]);
        }
        return targetHostClass;
    }

    public static final /* synthetic */ boolean access$isLoading$p(SimpleMessageTabHostV2 simpleMessageTabHostV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12791782", new Object[]{simpleMessageTabHostV2})).booleanValue();
        }
        return simpleMessageTabHostV2.isLoading;
    }

    public static final /* synthetic */ void access$setLoading$p(SimpleMessageTabHostV2 simpleMessageTabHostV2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f172b55e", new Object[]{simpleMessageTabHostV2, new Boolean(z)});
        } else {
            simpleMessageTabHostV2.isLoading = z;
        }
    }

    public static final /* synthetic */ void access$setMContainer$p(SimpleMessageTabHostV2 simpleMessageTabHostV2, Container container) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b687189", new Object[]{simpleMessageTabHostV2, container});
        } else {
            simpleMessageTabHostV2.mContainer = container;
        }
    }

    public static final /* synthetic */ void access$setRetryCount$p(SimpleMessageTabHostV2 simpleMessageTabHostV2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef68719c", new Object[]{simpleMessageTabHostV2, new Integer(i)});
        } else {
            simpleMessageTabHostV2.retryCount = i;
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
        this.isLoading = false;
        if (this.mTargetHost == null) {
            Container container = this.mContainer;
            if (container != null) {
                container.dispose();
            }
            this.mContainer = null;
            Object newInstance = Class.forName(targetHostClass).newInstance();
            if (newInstance instanceof IMessageTabHost) {
                this.isRealHost = true;
                unRegisterLogin();
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
            return;
        }
        this.isLoading = true;
        BundleSplitUtil.INSTANCE.checkMsgBundleReady("category", 20, new SimpleMessageTabHostV2$downloadBundle$1(this), new SimpleMessageTabHostV2$downloadBundle$2(this, g1aVar), true, new SimpleMessageTabHostV2$downloadBundle$3(this));
    }

    private final void registerLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eea0500d", new Object[]{this});
        } else if (this.broadcastReceiver == null && !this.isRealHost) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(LoginBroadcastReceiver.NOTIFY_LOGIN_SUCCESS);
            this.broadcastReceiver = new BroadcastReceiver() { // from class: com.taobao.message.sp.category.SimpleMessageTabHostV2$registerLogin$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(SimpleMessageTabHostV2$registerLogin$1 simpleMessageTabHostV2$registerLogin$1, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/sp/category/SimpleMessageTabHostV2$registerLogin$1");
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                        return;
                    }
                    ckf.h(context, "context");
                    ckf.h(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
                    if (SimpleMessageTabHostV2.access$getMContainer$p(SimpleMessageTabHostV2.this) != null) {
                        SimpleMessageTabHostV2.access$setMContainer$p(SimpleMessageTabHostV2.this, null);
                    }
                }
            };
            ApplicationUtil.getApplication().registerReceiver(this.broadcastReceiver, intentFilter);
        }
    }

    private final View renderEmptyLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9f3aa5aa", new Object[]{this});
        }
        registerLogin();
        FragmentActivity fragmentActivity = this.mActivity;
        if (fragmentActivity != null) {
            LinearLayout linearLayout = new LinearLayout(fragmentActivity);
            linearLayout.setOrientation(1);
            FragmentActivity fragmentActivity2 = this.mActivity;
            if (fragmentActivity2 != null) {
                TextView textView = new TextView(fragmentActivity2);
                textView.setText(DisplayUtil.localizedString(R.string.mp_loading_2));
                textView.setTextSize(1, 16.0f);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                layoutParams.topMargin = 200;
                linearLayout.addView(textView, layoutParams);
                return linearLayout;
            }
            ckf.s();
            throw null;
        }
        ckf.s();
        throw null;
    }

    private final View renderLoadingLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7beaba99", new Object[]{this});
        }
        addTimeLine("onShowLoading");
        AppMonitor.Counter.commit(RemoteMonitorUtil.MODULE, "spCategoryCount", 1.0d);
        registerLogin();
        if (this.mContainer == null) {
            SimpleCategoryModule.injectDependencies(IdentifierUtil.getCurrentIdentifier());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String userId = Login.getUserId();
            ckf.c(userId, "Login.getUserId()");
            linkedHashMap.put("accountId", userId);
            linkedHashMap.put("mpm_pageTag", "mpm_home");
            Container container = new Container(this.mActivity, "conversationTabSimple", null, IdentifierUtil.getCurrentIdentifier(), linkedHashMap, SimpleFrameworkModule.SIMPLE_CLASS_NAMESPACE);
            this.mContainer = container;
            container.registerService(ExecuteService.class, new OpenApiService(this.mActivity));
            Container container2 = this.mContainer;
            if (container2 != null) {
                container2.addPlugin(new SimpleMessageTabLoadMonitorPlugin(this.mArgs));
                WidgetRenderImpl.RenderConfig renderConfig = new WidgetRenderImpl.RenderConfig();
                renderConfig.dxEngineBizType = "alimp_message_simple";
                renderConfig.reUseKey = "alimp_message_simple";
                Container container3 = this.mContainer;
                if (container3 != null) {
                    container3.setRenderConfig(renderConfig);
                    Container container4 = this.mContainer;
                    if (container4 != null) {
                        container4.enableSnapshot();
                        Container container5 = this.mContainer;
                        if (container5 != null) {
                            container5.start();
                        } else {
                            ckf.s();
                            throw null;
                        }
                    } else {
                        ckf.s();
                        throw null;
                    }
                } else {
                    ckf.s();
                    throw null;
                }
            } else {
                ckf.s();
                throw null;
            }
        }
        Container container6 = this.mContainer;
        if (container6 != null) {
            Object view = container6.getView(View.class);
            ckf.c(view, "mContainer!!.getView(View::class.java)");
            return (View) view;
        }
        ckf.s();
        throw null;
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

    private final void unRegisterLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ef26674", new Object[]{this});
        } else if (this.broadcastReceiver != null) {
            try {
                ApplicationUtil.getApplication().unregisterReceiver(this.broadcastReceiver);
            } catch (Throwable th) {
                TLog.loge(TAG, Log.getStackTraceString(th));
            }
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

    public final int getMAX_COUNT() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc9b918", new Object[]{this})).intValue();
        }
        return this.MAX_COUNT;
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
            return;
        }
        this.pageStartTime = SystemClock.uptimeMillis();
        if (context instanceof FragmentActivity) {
            this.mActivity = (FragmentActivity) context;
        }
    }

    public final View onCreateViewTabHost(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b2c3bf19", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        ckf.h(layoutInflater, "inflater");
        addTimeLine("onCreateView");
        IMessageTabHost iMessageTabHost = this.mTargetHost;
        View onCreateView = iMessageTabHost != null ? iMessageTabHost.onCreateView(layoutInflater, viewGroup, bundle) : null;
        if (onCreateView != null) {
            return onCreateView;
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
        Container container = this.mContainer;
        if (container != null) {
            container.dispose();
        }
        this.mContainer = null;
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
        int i;
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
        BundleSplitUtil bundleSplitUtil = BundleSplitUtil.INSTANCE;
        if (!bundleSplitUtil.isMsgBundleReady() && !this.isLoading && (i = this.retryCount) < this.MAX_COUNT) {
            this.retryCount = i + 1;
            downloadBundle(new SimpleMessageTabHostV2$onResume$1(this));
        }
        if (this.mTargetHost == null && bundleSplitUtil.isMsgBundleReady()) {
            TLog.loge(BundleSplitUtil.TAG, "make up tabHost when resume");
            createHost(true);
        }
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
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        this.hostOnCreateTime = System.currentTimeMillis();
        this.mSavedState = bundle;
        String str = null;
        if (BundleSplitUtil.INSTANCE.isMsgBundleReady()) {
            TLog.loge(BundleSplitUtil.TAG, "feature ready");
            createHost(false);
            try {
                str = Login.getUserId();
            } catch (Throwable th) {
                TLog.loge(BundleSplitUtil.TAG, Log.getStackTraceString(th));
            }
            if (TextUtils.isEmpty(str) && ckf.b("0", OrangeConfig.getInstance().getConfig("mpm_data_switch", "messageTab", "0"))) {
                TLog.loge(BundleSplitUtil.TAG, "show login");
                Login.login(true);
            } else if (!FeatureInitHelper.isInit(str)) {
                try {
                    Schedules.lowBackground(SimpleMessageTabHostV2$onCreate$1.INSTANCE);
                } catch (Throwable th2) {
                    TLog.loge(BundleSplitUtil.TAG, Log.getStackTraceString(th2));
                }
            }
        } else {
            Bundle bundle2 = this.mArgs;
            if (bundle2 != null) {
                bundle2.remove("click_tab_time");
            }
            AppMonitor.Alarm.commitFail(RemoteMonitorUtil.MODULE, "spCategoryAlarm", null, null);
            TLog.loge(BundleSplitUtil.TAG, "feature not ready");
            downloadBundle(new SimpleMessageTabHostV2$onCreate$2(this));
        }
    }

    @Override // com.taobao.message.conversation.IMessageTabHost
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        ckf.h(layoutInflater, "inflater");
        addTimeLine("onCreateView");
        this.mInflate = layoutInflater;
        this.mSavedState = bundle;
        this.mContainerView = viewGroup;
        if (this.mTargetHost != null) {
            TLog.loge(BundleSplitUtil.TAG, "render tabHost");
            return onCreateViewTabHost(layoutInflater, viewGroup, bundle);
        } else if (BundleSplitUtil.INSTANCE.isMsgBundleReady()) {
            TLog.loge(BundleSplitUtil.TAG, "make up tabHost");
            if (FeatureInitHelper.isInit(Login.getUserId())) {
                RemoteMonitorUtil.INSTANCE.remoteLoadTimeoutCount("category");
                createHost(false);
                LayoutInflater layoutInflater2 = this.mInflate;
                if (layoutInflater2 != null) {
                    return onCreateViewTabHost(layoutInflater2, viewGroup, this.mSavedState);
                }
                ckf.s();
                throw null;
            }
            TLog.loge(BundleSplitUtil.TAG, "render empty");
            this.needCreateView = true;
            return renderEmptyLayout();
        } else {
            TLog.loge(BundleSplitUtil.TAG, "render loading");
            this.needCreateView = true;
            return renderLoadingLayout();
        }
    }
}
