package com.taobao.trtc.rtcroom;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Surface;
import android.view.View;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import anet.channel.util.ErrorConstant;
import com.alibaba.ariver.app.api.PageContext;
import com.alibaba.ariver.engine.api.EngineUtils;
import com.alibaba.ariver.engine.api.Render;
import com.alibaba.ariver.engine.api.Worker;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.ariver.engine.api.embedview.IEmbedCallback;
import com.alibaba.ariver.integration.embedview.BaseEmbedView;
import com.alibaba.ariver.kernel.RVEvents;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVAccountService;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.adapter.internal.CommonCode;
import com.taobao.trtc.api.TrtcConstants;
import com.taobao.trtc.impl.PermissionActivity;
import com.taobao.trtc.rtcroom.TriverRtcRoomView;
import com.taobao.trtc.rtcroom.a;
import com.taobao.trtc.utils.TrtcLog;
import com.uc.webview.base.cyclone.BSError;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.aio;
import tb.bio;
import tb.t2o;
import tb.t4p;
import tb.tmu;
import tb.vrf;
import tb.wmu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TriverRtcRoomView extends BaseEmbedView implements Serializable, aio {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int PERMISSION_REQUEST_CODE_FOR_RTC_ROOM = 125;
    private static final String TAG = TriverRtcRoomView.class.getName();
    private int activityCount;
    private Stack<Activity> activityStack;
    private com.taobao.trtc.rtcroom.a floatWindowController;
    private String mCachedChannelId;
    private String mCachedExtension;
    private String mCachedUrl;
    private BroadcastReceiver mNetworkReceiver;
    private com.taobao.trtc.rtcroom.b mRoomParams;
    private FrameLayout mRootView;
    private bio mRtcRoom;
    private int mViewHeight;
    private int mViewWidth;
    public PowerManager.WakeLock mWakeLock;
    private boolean needRenewFloatingWindow;
    private wmu wakeLock;
    private WeakReference<Context> mContextRef = new WeakReference<>(null);
    private final AtomicBoolean mRtcRoomRunning = new AtomicBoolean(false);
    private boolean needRequestOverlayPermission = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Application.ActivityLifecycleCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            } else {
                TriverRtcRoomView.access$000(TriverRtcRoomView.this).add(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            } else {
                TriverRtcRoomView.access$000(TriverRtcRoomView.this).remove(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
                return;
            }
            TriverRtcRoomView.access$210(TriverRtcRoomView.this);
            if (TriverRtcRoomView.access$200(TriverRtcRoomView.this) == 0) {
                TriverRtcRoomView triverRtcRoomView = TriverRtcRoomView.this;
                TriverRtcRoomView.access$302(triverRtcRoomView, TriverRtcRoomView.access$500(triverRtcRoomView, "background"));
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
                return;
            }
            String access$100 = TriverRtcRoomView.access$100();
            TrtcLog.j(access$100, "onActivityStarted: activity: " + activity.getLocalClassName());
            if (TriverRtcRoomView.access$200(TriverRtcRoomView.this) == 0 && TriverRtcRoomView.access$300(TriverRtcRoomView.this)) {
                TriverRtcRoomView.access$302(TriverRtcRoomView.this, false);
                TriverRtcRoomView.access$400(TriverRtcRoomView.this, "renew");
            }
            TriverRtcRoomView.access$208(TriverRtcRoomView.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements SendToRenderCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IEmbedCallback f13951a;

        public b(TriverRtcRoomView triverRtcRoomView, IEmbedCallback iEmbedCallback) {
            this.f13951a = iEmbedCallback;
        }

        @Override // com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback
        public void onCallBack(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99ed7a65", new Object[]{this, jSONObject});
                return;
            }
            IEmbedCallback iEmbedCallback = this.f13951a;
            if (iEmbedCallback != null) {
                iEmbedCallback.onResponse(jSONObject);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements PermissionActivity.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.taobao.trtc.impl.PermissionActivity.b
        public void a(boolean z, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b6de50ff", new Object[]{this, new Boolean(z), intent});
            } else if (!z) {
                TriverRtcRoomView.access$602(TriverRtcRoomView.this, false);
                TriverRtcRoomView.this.sendError(ErrorConstant.ERROR_OKHTTP_RESPONSE_ERROR, "Overlay Permission invalid");
            } else {
                TriverRtcRoomView.this.sendAudioMode(8);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13953a;
        public final /* synthetic */ JSONObject b;

        public d(String str, JSONObject jSONObject) {
            this.f13953a = str;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TriverRtcRoomView.this.sendEvent(this.f13953a, this.b, null);
            }
        }
    }

    static {
        t2o.a(395313609);
        t2o.a(395313603);
    }

    public static /* synthetic */ Stack access$000(TriverRtcRoomView triverRtcRoomView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Stack) ipChange.ipc$dispatch("bb031fcc", new Object[]{triverRtcRoomView});
        }
        return triverRtcRoomView.activityStack;
    }

    public static /* synthetic */ String access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]);
        }
        return TAG;
    }

    public static /* synthetic */ int access$200(TriverRtcRoomView triverRtcRoomView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ad4954f4", new Object[]{triverRtcRoomView})).intValue();
        }
        return triverRtcRoomView.activityCount;
    }

    public static /* synthetic */ int access$208(TriverRtcRoomView triverRtcRoomView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7b9e63ec", new Object[]{triverRtcRoomView})).intValue();
        }
        int i = triverRtcRoomView.activityCount;
        triverRtcRoomView.activityCount = 1 + i;
        return i;
    }

    public static /* synthetic */ int access$210(TriverRtcRoomView triverRtcRoomView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("acd2eef5", new Object[]{triverRtcRoomView})).intValue();
        }
        int i = triverRtcRoomView.activityCount;
        triverRtcRoomView.activityCount = i - 1;
        return i;
    }

    public static /* synthetic */ boolean access$300(TriverRtcRoomView triverRtcRoomView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ef2fb24", new Object[]{triverRtcRoomView})).booleanValue();
        }
        return triverRtcRoomView.needRenewFloatingWindow;
    }

    public static /* synthetic */ boolean access$302(TriverRtcRoomView triverRtcRoomView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e804fba", new Object[]{triverRtcRoomView, new Boolean(z)})).booleanValue();
        }
        triverRtcRoomView.needRenewFloatingWindow = z;
        return z;
    }

    public static /* synthetic */ void access$400(TriverRtcRoomView triverRtcRoomView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68c99949", new Object[]{triverRtcRoomView, str});
        } else {
            triverRtcRoomView.startFloatingWindow(str);
        }
    }

    public static /* synthetic */ boolean access$500(TriverRtcRoomView triverRtcRoomView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("53795ac", new Object[]{triverRtcRoomView, str})).booleanValue();
        }
        return triverRtcRoomView.stopFloatingWindow(str);
    }

    public static /* synthetic */ boolean access$602(TriverRtcRoomView triverRtcRoomView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("921a8fd", new Object[]{triverRtcRoomView, new Boolean(z)})).booleanValue();
        }
        triverRtcRoomView.needRequestOverlayPermission = z;
        return z;
    }

    private void checkOverlayPermission() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e776f1e", new Object[]{this});
        } else if (!PermissionActivity.e(this.mContextRef.get())) {
            requestOverlayPermission(new c());
        } else {
            sendAudioMode(8);
        }
    }

    private boolean checkRtcRoomParams(com.taobao.trtc.rtcroom.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bfb13c64", new Object[]{this, bVar})).booleanValue();
        }
        if (TextUtils.isEmpty(bVar.f13962a) || TextUtils.isEmpty(bVar.d) || TextUtils.isEmpty(bVar.b)) {
            return false;
        }
        return true;
    }

    public static int dip2px(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8536afc1", new Object[]{context, new Float(f)})).intValue();
        }
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static /* synthetic */ Object ipc$super(TriverRtcRoomView triverRtcRoomView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1599984620:
                super.onSurfaceAvailable((Surface) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), (ValueCallback) objArr[3]);
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1419343038:
                return new Boolean(super.onSurfaceDestroyed((Surface) objArr[0]));
            case -470667784:
                super.onSurfaceSizeChanged((Surface) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                return null;
            case 1664325763:
                super.onCreate((Map) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/trtc/rtcroom/TriverRtcRoomView");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startFloatingWindow$0(String str, boolean z, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46b12439", new Object[]{this, str, new Boolean(z), intent});
            return;
        }
        String str2 = TAG;
        tmu.f(str2, "OverlayPermission result: " + z);
        if (z) {
            this.floatWindowController.v(str);
        } else {
            this.needRequestOverlayPermission = false;
        }
    }

    private void regNetworkReceiver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9a4b710", new Object[]{this});
            return;
        }
        if (this.mNetworkReceiver != null) {
            unRegNetworkReceiver();
        }
        this.mNetworkReceiver = new BroadcastReceiver() { // from class: com.taobao.trtc.rtcroom.TriverRtcRoomView.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/trtc/rtcroom/TriverRtcRoomView$3");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                int i;
                int i2 = 2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                } else if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                    NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                    if (activeNetworkInfo != null) {
                        i = activeNetworkInfo.getType();
                    } else {
                        i = -1;
                    }
                    if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                        i2 = 0;
                    } else if (i != 0 && i == 1) {
                        i2 = 1;
                    }
                    TriverRtcRoomView.this.sendNetType(i2);
                }
            }
        };
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            this.mContextRef.get().registerReceiver(this.mNetworkReceiver, intentFilter);
            TrtcLog.j(TAG, "reg network receiver");
        } catch (Exception e) {
            String str = TAG;
            TrtcLog.i(str, "exceiton when reg receiver: " + e.getMessage());
        }
    }

    private void sendEventOnUiThread(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d5c7f50", new Object[]{this, str, jSONObject});
            return;
        }
        String str2 = TAG;
        tmu.f(str2, "SendEvent >>> " + str + " | data: " + jSONObject.toJSONString());
        if (this.mContextRef.get() != null) {
            ((Activity) this.mContextRef.get()).runOnUiThread(new d(str, jSONObject));
        }
    }

    private void start(JSONObject jSONObject) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb595427", new Object[]{this, jSONObject});
            return;
        }
        String str3 = null;
        if (jSONObject != null) {
            str2 = jSONObject.containsKey("roomId") ? vrf.d(jSONObject, "roomId") : null;
            str = jSONObject.containsKey(TrtcConstants.TRTC_PARAMS_EXTENSION) ? vrf.d(jSONObject, TrtcConstants.TRTC_PARAMS_EXTENSION) : null;
            if (jSONObject.containsKey("url")) {
                str3 = vrf.d(jSONObject, "url");
            }
        } else {
            str2 = null;
            str = null;
        }
        this.mCachedUrl = str3;
        String str4 = TAG;
        TrtcLog.j(str4, "Start with url: " + str3);
        if (!checkPermission()) {
            TrtcLog.j(str4, "Cached start params for permission request, roomId: " + str2 + ", extension: " + str);
            this.mCachedChannelId = str2;
            this.mCachedExtension = str;
            return;
        }
        bio bioVar = this.mRtcRoom;
        if (bioVar != null) {
            bioVar.F(str2, str);
        }
    }

    private void startFloatingWindow(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcc3a929", new Object[]{this, str});
            return;
        }
        if (this.floatWindowController == null) {
            com.taobao.trtc.rtcroom.a aVar = new com.taobao.trtc.rtcroom.a((Activity) this.mContextRef.get(), this.mRtcRoom, this);
            this.floatWindowController = aVar;
            aVar.s(this.mRoomParams.j);
        }
        if (PermissionActivity.e(this.mContextRef.get())) {
            this.floatWindowController.v(str);
        } else if (!this.needRequestOverlayPermission) {
            sendError(ErrorConstant.ERROR_OKHTTP_RESPONSE_ERROR, "Overlay Permission invalid");
        } else {
            requestOverlayPermission(new PermissionActivity.b() { // from class: tb.giu
                @Override // com.taobao.trtc.impl.PermissionActivity.b
                public final void a(boolean z, Intent intent) {
                    TriverRtcRoomView.this.lambda$startFloatingWindow$0(str, z, intent);
                }
            });
        }
    }

    private void stop(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("832dd487", new Object[]{this, jSONObject});
            return;
        }
        bio bioVar = this.mRtcRoom;
        if (bioVar != null) {
            bioVar.I();
        }
    }

    private boolean stopFloatingWindow(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f22d9ccd", new Object[]{this, str})).booleanValue();
        }
        com.taobao.trtc.rtcroom.a aVar = this.floatWindowController;
        if (aVar != null) {
            return aVar.q(str);
        }
        return false;
    }

    private void unRegNetworkReceiver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f38909", new Object[]{this});
        } else if (this.mNetworkReceiver != null) {
            try {
                this.mContextRef.get().unregisterReceiver(this.mNetworkReceiver);
                this.mNetworkReceiver = null;
                TrtcLog.j(TAG, "unreg network receiver");
            } catch (Exception e) {
                String str = TAG;
                TrtcLog.i(str, "exception when unreg receiver: " + e.getMessage());
            }
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public Bitmap getSnapshot() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("a92c69f", new Object[]{this});
        }
        return null;
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public String getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return "rtc-room";
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public View getView(int i, int i2, String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcdbb931", new Object[]{this, new Integer(i), new Integer(i2), str, str2, map});
        }
        this.mViewWidth = i;
        this.mViewHeight = i2;
        String str3 = TAG;
        tmu.f(str3, "getView, size: " + i + "x" + i2 + ", viewId:" + str);
        if (this.mContextRef.get() != null) {
            this.mRootView = new FrameLayout(this.mContextRef.get());
        }
        if (this.mRtcRoom != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
            layoutParams.width = this.mViewWidth;
            layoutParams.height = this.mViewHeight;
            layoutParams.gravity = 17;
            this.mRootView.addView(this.mRtcRoom.A(), layoutParams);
            TrtcLog.j(str3, "Add remote view to root views");
        }
        return this.mRootView;
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onAttachedToWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1bdbec2", new Object[]{this});
        } else {
            TrtcLog.j(TAG, "onAttachedToWebView");
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onDetachedToWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("850d0fb4", new Object[]{this});
        } else {
            TrtcLog.j(TAG, "onDetachedToWebView");
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onEmbedViewVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48c81239", new Object[]{this, new Integer(i)});
            return;
        }
        String str = TAG;
        TrtcLog.j(str, "onEmbedViewVisibilityChanged, i: " + i);
    }

    @Override // tb.aio
    public void onMiniWindowClicked() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("586a06e8", new Object[]{this});
        } else if (this.mOuterPage.getPageContext() != null) {
            Activity activity = this.mOuterPage.getPageContext().getActivity();
            Iterator<Activity> it = this.activityStack.iterator();
            while (it.hasNext()) {
                Activity next = it.next();
                String str = TAG;
                TrtcLog.j(str, "activity stack: " + next.getLocalClassName());
                if (!next.getLocalClassName().equals(activity.getLocalClassName()) || !next.equals(activity) || next.hashCode() != activity.hashCode()) {
                    TrtcLog.j(str, "finish activity: " + next.getLocalClassName());
                    next.finish();
                }
            }
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onReceivedRender(JSONObject jSONObject, BridgeCallback bridgeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb20669", new Object[]{this, jSONObject, bridgeCallback});
            return;
        }
        TrtcLog.j(TAG, "onReceivedRender");
        if (jSONObject != null && jSONObject.size() != 0) {
            parseRtcRoomParams(jSONObject);
            if (!checkRtcRoomParams(this.mRoomParams)) {
                sendError(-103, "rtc room params invalid");
            } else {
                initRtcRoom();
            }
        }
    }

    @Override // com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onSurfaceAvailable(Surface surface, int i, int i2, ValueCallback<Integer> valueCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0a22c14", new Object[]{this, surface, new Integer(i), new Integer(i2), valueCallback});
            return;
        }
        TrtcLog.j(TAG, "onSurfaceAvailable");
        super.onSurfaceAvailable(surface, i, i2, valueCallback);
    }

    @Override // com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public boolean onSurfaceDestroyed(Surface surface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab668b42", new Object[]{this, surface})).booleanValue();
        }
        TrtcLog.j(TAG, "onSurfaceDestroyed");
        return super.onSurfaceDestroyed(surface);
    }

    @Override // com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onSurfaceSizeChanged(Surface surface, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3f22df8", new Object[]{this, surface, new Integer(i), new Integer(i2)});
            return;
        }
        TrtcLog.j(TAG, "onSurfaceSizeChanged");
        super.onSurfaceSizeChanged(surface, i, i2);
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onWebViewPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b457ef63", new Object[]{this});
            return;
        }
        TrtcLog.j(TAG, "onWebViewPause");
        wmu wmuVar = this.wakeLock;
        if (wmuVar != null) {
            wmuVar.b();
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onWebViewResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb053b0e", new Object[]{this});
            return;
        }
        TrtcLog.j(TAG, "onWebViewResume");
        wmu wmuVar = this.wakeLock;
        if (wmuVar != null) {
            wmuVar.a();
        }
        stopFloatingWindow("resumeWebView");
    }

    @Override // tb.aio
    public void sendAudioMode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d48160b", new Object[]{this, new Integer(i)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mode", (Object) Integer.valueOf(i));
        sendEventOnUiThread("audioPlayoutMode", jSONObject);
    }

    @Override // tb.aio
    public void sendEnterRoom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81f31032", new Object[]{this});
        } else {
            sendEventOnUiThread("enterRoom", new JSONObject());
        }
    }

    @Override // tb.aio
    public void sendError(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a1f36c6", new Object[]{this, new Integer(i), str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("error", (Object) Integer.valueOf(i));
        jSONObject.put("errorMessage", (Object) str);
        sendEventOnUiThread("error", jSONObject);
    }

    @Override // com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void sendEvent(String str, JSONObject jSONObject, IEmbedCallback iEmbedCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2b74017", new Object[]{this, str, jSONObject, iEmbedCallback});
        } else if (this.mOuterPage == null) {
            TrtcLog.i(TAG, "You should call super.onCreate first!!!");
        } else {
            JSONObject jSONObject2 = new JSONObject();
            if (!str.equals(RVEvents.ON_TO_WEBVIEW_MESSAGE)) {
                str = "nbcomponent." + getType() + "." + str;
            }
            if (jSONObject != null) {
                jSONObject.put("element", (Object) this.mViewId);
                jSONObject2.put("data", (Object) jSONObject);
            }
            Render render = this.mOuterPage.getRender();
            Worker workerById = render.getEngine().getEngineRouter().getWorkerById(EngineUtils.getWorkerId(render));
            TrtcLog.h(TAG, " event: " + str + " " + jSONObject2.toJSONString());
            EngineUtils.sendToRender(render, workerById, str, jSONObject2, new b(this, iEmbedCallback));
        }
    }

    @Override // tb.aio
    public void sendFirstRender(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8d447cf", new Object[]{this, str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("userId", (Object) str);
        sendEventOnUiThread("firstRender", jSONObject);
    }

    @Override // tb.aio
    public void sendLeaveRoom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66b70911", new Object[]{this});
        } else {
            sendEventOnUiThread("leaveRoom", new JSONObject());
        }
    }

    @Override // tb.aio
    public void sendNetStat(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0379be4", new Object[]{this, new Boolean(z)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (z) {
            str = "normal";
        } else {
            str = "low";
        }
        jSONObject.put("quality", (Object) str);
        jSONObject.put("isLocal", (Object) Boolean.TRUE);
        sendEventOnUiThread("networkQuality", jSONObject);
    }

    public void sendNetType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bc672ed", new Object[]{this, new Integer(i)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("network", (Object) Integer.valueOf(i));
        sendEventOnUiThread("networkType", jSONObject);
    }

    @Override // tb.aio
    public void sendRemoteJoin(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f48f58c9", new Object[]{this, str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("users", (Object) str);
        sendEventOnUiThread("participantEnter", jSONObject);
    }

    @Override // tb.aio
    public void sendRemoteLeave(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d52dda84", new Object[]{this, str, str2});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("users", (Object) str);
        sendEventOnUiThread("participantLeave", jSONObject);
    }

    private void initRtcRoom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eafac633", new Object[]{this});
        } else if (!this.mRtcRoom.B(this.mRoomParams)) {
            sendError(BSError.BSDIFF_OLD_FILE_SIZE_MISMATCA, "rtc room init error");
        } else {
            this.mRtcRoomRunning.set(true);
            TrtcLog.j(TAG, "rtc room init success");
        }
    }

    private void mute(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d02dcd0", new Object[]{this, jSONObject});
        } else if (this.mRtcRoom != null && jSONObject.containsKey("muted")) {
            this.mRtcRoom.K(vrf.a(jSONObject, "muted", false));
        }
    }

    private void requestOverlayPermission(PermissionActivity.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebc9998e", new Object[]{this, bVar});
            return;
        }
        try {
            TrtcLog.j(TAG, "start permission activity");
            PermissionActivity.l(bVar);
            Intent intent = new Intent(this.mContextRef.get(), PermissionActivity.class);
            intent.addFlags(268435456);
            intent.putExtra(PermissionActivity.PERMISSION_TYPE_OVERLAY, true);
            this.mContextRef.get().startActivity(intent);
        } catch (Exception e) {
            String str = TAG;
            TrtcLog.i(str, "start permission activity e: " + e.getMessage());
        }
    }

    private void setFloatingWindow(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f7939b1", new Object[]{this, jSONObject});
        } else if (jSONObject != null && jSONObject.containsKey("isShow")) {
            if (vrf.a(jSONObject, "isShow", false)) {
                startFloatingWindow("api");
            } else {
                stopFloatingWindow("api");
            }
        }
    }

    @Override // com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        TrtcLog.j(TAG, "onDestroy");
        wmu wmuVar = this.wakeLock;
        if (wmuVar != null) {
            wmuVar.b();
        }
        unRegNetworkReceiver();
        Stack<Activity> stack = this.activityStack;
        if (stack != null) {
            stack.clear();
            this.activityStack = null;
        }
        com.taobao.trtc.rtcroom.a aVar = this.floatWindowController;
        if (aVar != null) {
            aVar.q("destory");
            this.floatWindowController.r();
            this.floatWindowController = null;
        }
        if (this.mRootView != null) {
            try {
                if (this.mRtcRoom.A() != null) {
                    this.mRootView.removeView(this.mRtcRoom.A());
                }
            } catch (Exception unused) {
            }
            TrtcLog.j(TAG, "destory root view");
            this.mRootView = null;
        }
        if (this.mRtcRoom != null) {
            this.mRtcRoomRunning.set(false);
            this.mRtcRoom.v();
            this.mRtcRoom = null;
            TrtcLog.j(TAG, "destory mRtcRoom");
        }
        super.onDestroy();
    }

    private boolean checkPermission() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6fc70e02", new Object[]{this})).booleanValue();
        }
        if (this.mContextRef.get() != null) {
            ArrayList arrayList = new ArrayList();
            if (ContextCompat.checkSelfPermission(this.mContextRef.get(), "android.permission.RECORD_AUDIO") != 0) {
                arrayList.add("android.permission.RECORD_AUDIO");
            }
            if (!arrayList.isEmpty()) {
                String str = TAG;
                TrtcLog.j(str, "request permission: " + arrayList.toString());
                ActivityCompat.requestPermissions((Activity) this.mContextRef.get(), (String[]) arrayList.toArray(new String[0]), 125);
                return false;
            }
        }
        return true;
    }

    private void parseRtcRoomParams(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("411b491a", new Object[]{this, jSONObject});
            return;
        }
        com.taobao.trtc.rtcroom.b bVar = new com.taobao.trtc.rtcroom.b();
        this.mRoomParams = bVar;
        bVar.j = new a.f();
        try {
            this.mRoomParams.b = vrf.e(jSONObject, "appId", "21646297");
            this.mRoomParams.d = vrf.d(jSONObject, "userId");
            this.mRoomParams.c = vrf.d(jSONObject, "roomId");
            this.mRoomParams.h = vrf.a(jSONObject, "enableCamera", false);
            this.mRoomParams.f = vrf.c(jSONObject, "fps", 20);
            this.mRoomParams.g = vrf.c(jSONObject, CommonCode.MapKey.HAS_RESOLUTION, 2);
            this.mRoomParams.i = vrf.a(jSONObject, "mute", false);
            JSONObject jSONObject3 = jSONObject.getJSONObject("extraInfo");
            if (jSONObject3 != null) {
                this.mRoomParams.f13962a = vrf.e(jSONObject3, "bizName", "tmsp_chat");
                this.mRoomParams.e = vrf.e(jSONObject3, "bizId", "");
                jSONObject2 = jSONObject3.getJSONObject("floatViewFormat");
            } else {
                this.mRoomParams.f13962a = "tmsp_chat";
                String str = TAG;
                TrtcLog.j(str, "use default service name: " + this.mRoomParams.f13962a);
                jSONObject2 = null;
            }
            this.mRoomParams.j.f13961a = vrf.c(jSONObject2, "width", dip2px(this.mContextRef.get(), 96.0f));
            this.mRoomParams.j.b = vrf.c(jSONObject2, "height", dip2px(this.mContextRef.get(), 173.0f));
            this.mRoomParams.j.c = dip2px(this.mContextRef.get(), 12.0f);
            this.mRoomParams.j.d = dip2px(this.mContextRef.get(), this.mRoomParams.j.b / 2.0f);
            this.mRoomParams.j.e = vrf.c(jSONObject2, "margin", dip2px(this.mContextRef.get(), 12.0f));
            this.mRoomParams.j.h = dip2px(this.mContextRef.get(), vrf.c(jSONObject2, "radius", 0));
            this.mRoomParams.j.f = vrf.c(jSONObject2, "borderColor", com.taobao.trtc.rtcroom.a.DEFAULT_FLOATING_WINDOW_BORDER_COLOR);
            this.mRoomParams.j.g = vrf.c(jSONObject2, "borderWidth", 0);
            this.mRoomParams.j.i = vrf.c(jSONObject2, "closeDiameter", dip2px(this.mContextRef.get(), 18.0f));
            this.mRoomParams.j.j = vrf.c(jSONObject2, "closeMargin", dip2px(this.mContextRef.get(), 6.0f));
            if (TextUtils.isEmpty(this.mRoomParams.d)) {
                this.mRoomParams.d = ((RVAccountService) RVProxy.get(RVAccountService.class)).getUserId(null);
                String str2 = TAG;
                TrtcLog.j(str2, "get user id by RVProxy: " + this.mRoomParams.d);
            }
        } catch (Exception e) {
            String str3 = TAG;
            TrtcLog.i(str3, "Exception when parseRtcRoomParams: " + e.getMessage());
        }
        String str4 = TAG;
        tmu.f(str4, "rtc room params: " + this.mRoomParams.a());
    }

    private void setAudioMode(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("153b3d52", new Object[]{this, jSONObject});
        } else if (jSONObject != null && jSONObject.containsKey("mode")) {
            int c2 = vrf.c(jSONObject, "mode", 2);
            bio bioVar = this.mRtcRoom;
            if (bioVar == null) {
                return;
            }
            if (c2 >= 1 && c2 <= 4) {
                bioVar.L(c2);
            } else if (c2 == 5) {
                startFloatingWindow("api");
            } else if (c2 == 6) {
                stopFloatingWindow("api");
            } else if (c2 == 7) {
                checkOverlayPermission();
            }
        }
    }

    @Override // com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onCreate(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63339883", new Object[]{this, map});
            return;
        }
        String str = TAG;
        TrtcLog.j(str, "onCreate");
        super.onCreate(map);
        PageContext pageContext = this.mOuterPage.getPageContext();
        if (pageContext == null || pageContext.getActivity() == null) {
            TrtcLog.i(str, "onCreate error for no activity");
            return;
        }
        this.needRenewFloatingWindow = false;
        this.activityCount = 1;
        Stack<Activity> stack = new Stack<>();
        this.activityStack = stack;
        stack.add(pageContext.getActivity());
        this.mOuterPage.getPageContext().getActivity().getApplication().registerActivityLifecycleCallbacks(new a());
        this.mContextRef = new WeakReference<>(pageContext.getActivity());
        bio bioVar = this.mRtcRoom;
        if (bioVar != null) {
            bioVar.v();
            this.mRtcRoom = null;
        }
        this.mRtcRoom = new bio(this.mContextRef.get(), this);
        wmu wmuVar = new wmu(this.mContextRef.get());
        this.wakeLock = wmuVar;
        wmuVar.a();
        regNetworkReceiver();
        this.needRequestOverlayPermission = true;
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onRequestPermissionResult(int i, String[] strArr, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43aa2a2d", new Object[]{this, new Integer(i), strArr, iArr});
        } else if (i == 125) {
            for (int i2 : iArr) {
                if (i2 != 0) {
                    if (strArr[0].equals("android.permission.RECORD_AUDIO")) {
                        Toast.makeText(this.mContextRef.get(), "权限不足, 请打开录音权限", 0).show();
                        sendError(-105, "audio permission error");
                        return;
                    } else if (strArr[0].equals(t4p.CAMERA)) {
                        Toast.makeText(this.mContextRef.get(), "权限不足, 请打开摄像头权限", 0).show();
                        sendError(-104, "video permission error");
                        return;
                    }
                }
            }
            TrtcLog.j(TAG, "permission granted, init rtc room");
            bio bioVar = this.mRtcRoom;
            if (bioVar != null) {
                bioVar.F(this.mCachedChannelId, this.mCachedExtension);
            }
        }
    }

    @Override // com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onReceivedMessage(String str, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        char c2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("231420a4", new Object[]{this, str, jSONObject, bridgeCallback});
            return;
        }
        String str2 = TAG;
        TrtcLog.h(str2, "RecvMsg <<< " + str + " | data: " + jSONObject.toJSONString());
        if (!this.mRtcRoomRunning.get() || TextUtils.isEmpty(str)) {
            TrtcLog.i(str2, "ignore this msg");
            return;
        }
        try {
            switch (str.hashCode()) {
                case -812688397:
                    if (str.equals("showFloatingWindow")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3363353:
                    if (str.equals("mute")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3540994:
                    if (str.equals("stop")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 109757538:
                    if (str.equals("start")) {
                        break;
                    }
                    c2 = 65535;
                    break;
                case 187985561:
                    if (str.equals("audioMode")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            if (c2 == 0) {
                start(jSONObject);
            } else if (c2 == 1) {
                stop(jSONObject);
            } else if (c2 == 2) {
                mute(jSONObject);
            } else if (c2 == 3) {
                setAudioMode(jSONObject);
            } else if (c2 != 4) {
                TrtcLog.j(str2, "action: " + str + " not implemented");
            } else {
                setFloatingWindow(jSONObject);
            }
        } catch (Throwable th) {
            String str3 = TAG;
            TrtcLog.i(str3, "exception when process msg: " + th.getMessage());
            th.printStackTrace();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("fail", "true");
            bridgeCallback.sendJSONResponse(jSONObject2);
        }
    }
}
