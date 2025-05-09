package com.taobao.message.activity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStateManager;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.message.kit.util.RemoteMonitorUtil;
import java.util.HashMap;
import kotlin.Metadata;
import tb.a07;
import tb.acq;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\n\u0010\u0003J\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/taobao/message/activity/LoadingChatActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", FragmentStateManager.SAVED_INSTANCE_STATE_KEY, "Ltb/xhv;", "onCreate", "(Landroid/os/Bundle;)V", "navChat", "onDestroy", "", "targetId", "navH5Chat", "(Ljava/lang/String;)V", "", "enterH5", "Z", "isLoading", "Companion", "message_base_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class LoadingChatActivity extends AppCompatActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final Companion Companion = new Companion(null);
    public static final String H5_CHAT_URL = "https://market.m.taobao.com/app/tb-chatting/chat-universal-page/pages/index/index.html?targetId=";
    public static final String LOAD_CHAT_KEY = "originalUrl";
    public static final String LOAD_CHAT_URL = "http://tb.cn/n/im/dynamic/loading.html";
    public static final String SOURCE = "chat";
    public static final String TAG = "LoadingChatActivity";
    private HashMap _$_findViewCache;
    private boolean enterH5;
    private boolean isLoading;

    /* compiled from: Taobao */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/taobao/message/activity/LoadingChatActivity$Companion;", "", "()V", "H5_CHAT_URL", "", "LOAD_CHAT_KEY", "LOAD_CHAT_URL", "SOURCE", RPCDataItems.SWITCH_TAG_LOG, "message_base_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class Companion {
        static {
            t2o.a(529530882);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(529530881);
    }

    public static final /* synthetic */ boolean access$getEnterH5$p(LoadingChatActivity loadingChatActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56e82be5", new Object[]{loadingChatActivity})).booleanValue();
        }
        return loadingChatActivity.enterH5;
    }

    public static final /* synthetic */ boolean access$isLoading$p(LoadingChatActivity loadingChatActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("548af3e2", new Object[]{loadingChatActivity})).booleanValue();
        }
        return loadingChatActivity.isLoading;
    }

    public static final /* synthetic */ void access$setEnterH5$p(LoadingChatActivity loadingChatActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80586487", new Object[]{loadingChatActivity, new Boolean(z)});
        } else {
            loadingChatActivity.enterH5 = z;
        }
    }

    public static final /* synthetic */ void access$setLoading$p(LoadingChatActivity loadingChatActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c7bbafe", new Object[]{loadingChatActivity, new Boolean(z)});
        } else {
            loadingChatActivity.isLoading = z;
        }
    }

    public static /* synthetic */ Object ipc$super(LoadingChatActivity loadingChatActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/message/activity/LoadingChatActivity");
        }
    }

    public void _$_clearFindViewByIdCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("677c9886", new Object[]{this});
            return;
        }
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("399f7ed2", new Object[]{this, new Integer(i)});
        }
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    public final void navChat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b18e622", new Object[]{this});
            return;
        }
        Nav.from(this).toUri(getIntent().getStringExtra("originalUrl"));
        finish();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        if (this.isLoading) {
            RemoteMonitorUtil.INSTANCE.remoteLoadBackCount("chat");
        }
    }

    public final void navH5Chat(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("244c959", new Object[]{this, str});
            return;
        }
        ckf.h(str, "targetId");
        this.enterH5 = true;
        Nav.from(this).toUri(H5_CHAT_URL.concat(str));
        finish();
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v17, types: [T, java.lang.String] */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r13) {
        /*
            r12 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.message.activity.LoadingChatActivity.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "d9c272d2"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r12
            r4[r0] = r13
            r2.ipc$dispatch(r3, r4)
            return
        L_0x0015:
            super.onCreate(r13)
            com.taobao.message.kit.util.BundleSplitUtil r5 = com.taobao.message.kit.util.BundleSplitUtil.INSTANCE
            boolean r13 = r5.isMsgBundleReady()
            com.taobao.message.kit.util.RemoteMonitorUtil r2 = com.taobao.message.kit.util.RemoteMonitorUtil.INSTANCE
            java.lang.String r3 = "chat"
            r2.directLoadAlarm4Source(r12, r3, r13)
            if (r13 == 0) goto L_0x002c
            r12.navChat()
            goto L_0x00e3
        L_0x002c:
            long r6 = java.lang.System.currentTimeMillis()
            r12.isLoading = r0
            r2.remoteLoadCount(r3)
            android.view.LayoutInflater r13 = android.view.LayoutInflater.from(r12)
            int r0 = com.taobao.taobao.R.layout.chat_loading_layout
            r2 = 0
            android.view.View r13 = r13.inflate(r0, r2)
            int r0 = com.taobao.taobao.R.id.rootFL
            android.view.View r0 = r13.findViewById(r0)
            if (r0 == 0) goto L_0x00ed
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r2 = com.taobao.taobao.R.id.enter
            android.view.View r2 = r13.findViewById(r2)
            if (r2 == 0) goto L_0x00e4
            android.widget.TextView r2 = (android.widget.TextView) r2
            com.taobao.appbundle.remote.LoadConfig$b r3 = new com.taobao.appbundle.remote.LoadConfig$b
            r3.<init>()
            java.lang.String r4 = "message"
            com.taobao.appbundle.remote.LoadConfig$b r3 = r3.m(r4)
            com.taobao.appbundle.remote.LoadConfig r3 = r3.l()
            com.taobao.appbundle.remote.view.RemoteLoadingView r4 = new com.taobao.appbundle.remote.view.RemoteLoadingView
            r4.<init>(r12, r3)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r8 = -1
            r3.<init>(r8, r8)
            r8 = 17
            r3.gravity = r8
            r0.addView(r4, r1, r3)
            android.content.Intent r0 = r12.getIntent()
            java.lang.String r3 = "originalUrl"
            java.lang.String r0 = r0.getStringExtra(r3)
            android.net.Uri r3 = android.net.Uri.parse(r0)
            java.lang.String r8 = "bizType"
            java.lang.String r3 = r3.getQueryParameter(r8)
            if (r3 != 0) goto L_0x0095
            android.content.Intent r3 = r12.getIntent()
            java.lang.String r3 = r3.getStringExtra(r8)
        L_0x0095:
            kotlin.jvm.internal.Ref$ObjectRef r8 = new kotlin.jvm.internal.Ref$ObjectRef
            r8.<init>()
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r9 = "targetId"
            java.lang.String r0 = r0.getQueryParameter(r9)
            r8.element = r0
            if (r0 != 0) goto L_0x00b3
            android.content.Intent r0 = r12.getIntent()
            java.lang.String r0 = r0.getStringExtra(r9)
            r8.element = r0
        L_0x00b3:
            java.lang.String r0 = "11001"
            boolean r0 = tb.ckf.b(r0, r3)
            if (r0 == 0) goto L_0x00cc
            T r0 = r8.element
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x00cc
            r2.setVisibility(r1)
            com.taobao.message.activity.LoadingChatActivity$onCreate$1 r0 = new com.taobao.message.activity.LoadingChatActivity$onCreate$1
            r0.<init>()
            r2.setOnClickListener(r0)
        L_0x00cc:
            r12.setContentView(r13)
            com.taobao.message.activity.LoadingChatActivity$onCreate$2 r8 = new com.taobao.message.activity.LoadingChatActivity$onCreate$2
            r8.<init>(r12, r6)
            com.taobao.message.activity.LoadingChatActivity$onCreate$3 r9 = com.taobao.message.activity.LoadingChatActivity$onCreate$3.INSTANCE
            com.taobao.message.activity.LoadingChatActivity$onCreate$4 r11 = new com.taobao.message.activity.LoadingChatActivity$onCreate$4
            r11.<init>(r4)
            java.lang.String r6 = "chat"
            r7 = 20
            r10 = 1
            r5.checkMsgBundleReady(r6, r7, r8, r9, r10, r11)
        L_0x00e3:
            return
        L_0x00e4:
            kotlin.TypeCastException r13 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.TextView"
            r13.<init>(r0)
            throw r13
        L_0x00ed:
            kotlin.TypeCastException r13 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.message.activity.LoadingChatActivity.onCreate(android.os.Bundle):void");
    }
}
