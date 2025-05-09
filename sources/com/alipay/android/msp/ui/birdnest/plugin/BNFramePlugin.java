package com.alipay.android.msp.ui.birdnest.plugin;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import com.alipay.android.app.birdnest.api.OnFrameTplEventListener;
import com.alipay.android.app.template.AbsFBPlugin;
import com.alipay.android.app.template.FBContext;
import com.alipay.android.app.template.FBPluginCtx;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.core.clients.MspWindowClient;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.frame.MspWindowFrame;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.framework.drm.DrmManager;
import com.alipay.android.msp.plugin.manager.PluginManager;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.Utils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBDocument;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class BNFramePlugin extends AbsFBPlugin {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String MQPBNFRAME_RENDER_SUCCESS = "MQPBNFRAME_RENDER_SUCCESS";
    private static final String MQP_PAGE_CLICK_CLOSE = "MQP_PAGE_CLICK_CLOSE";
    private static final FBContext.JsExecOptions sendEventOpt = FBContext.JsExecOptions.create().setAsyncMode(1).setCallbackMode(0).setBlockTimeoutMs(60000);
    private boolean alignToTop;
    private boolean hasAddView = false;
    private View mBirdNestView;
    private int mBizId;
    private RelativeLayout mContainerView;
    private Context mContext;
    private FBPluginCtx mFBPluginCtx;
    private int mPluginFramebizId;

    public BNFramePlugin(Context context, FBPluginCtx fBPluginCtx, int i) {
        this.alignToTop = true;
        LogUtil.record(1, "BNFramePlugin", "BNFramePlugin_onCreate");
        this.mContext = context;
        this.mBizId = i;
        this.mFBPluginCtx = fBPluginCtx;
        try {
            this.alignToTop = DrmManager.getInstance(context).isGray("degrade_bnframe_update_rect10596", false, context);
        } catch (Throwable th) {
            LogUtil.record(2, "BNFramePlugin:init", "error on alignToTop");
            LogUtil.printExceptionStackTrace(th);
        }
    }

    public static /* synthetic */ int access$000(BNFramePlugin bNFramePlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2bc69666", new Object[]{bNFramePlugin})).intValue();
        }
        return bNFramePlugin.mPluginFramebizId;
    }

    public static /* synthetic */ void access$100(BNFramePlugin bNFramePlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa279a52", new Object[]{bNFramePlugin});
        } else {
            bNFramePlugin.onBeforeLoad();
        }
    }

    public static /* synthetic */ boolean access$200(BNFramePlugin bNFramePlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28889e35", new Object[]{bNFramePlugin})).booleanValue();
        }
        return bNFramePlugin.hasAddView;
    }

    public static /* synthetic */ boolean access$202(BNFramePlugin bNFramePlugin, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cfaae349", new Object[]{bNFramePlugin, new Boolean(z)})).booleanValue();
        }
        bNFramePlugin.hasAddView = z;
        return z;
    }

    public static /* synthetic */ View access$300(BNFramePlugin bNFramePlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("73a9d652", new Object[]{bNFramePlugin});
        }
        return bNFramePlugin.mBirdNestView;
    }

    public static /* synthetic */ View access$302(BNFramePlugin bNFramePlugin, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("4b355806", new Object[]{bNFramePlugin, view});
        }
        bNFramePlugin.mBirdNestView = view;
        return view;
    }

    public static /* synthetic */ boolean access$400(BNFramePlugin bNFramePlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("254aa5f3", new Object[]{bNFramePlugin})).booleanValue();
        }
        return bNFramePlugin.alignToTop;
    }

    public static /* synthetic */ RelativeLayout access$500(BNFramePlugin bNFramePlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RelativeLayout) ipChange.ipc$dispatch("c152aa5e", new Object[]{bNFramePlugin});
        }
        return bNFramePlugin.mContainerView;
    }

    public static /* synthetic */ FBPluginCtx access$600(BNFramePlugin bNFramePlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FBPluginCtx) ipChange.ipc$dispatch("859bdc76", new Object[]{bNFramePlugin});
        }
        return bNFramePlugin.mFBPluginCtx;
    }

    private FBContext getFBContextFromMspContext(MspContext mspContext) {
        MspWindowClient mspWindowClient;
        MspWindowFrame currentWindowFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FBContext) ipChange.ipc$dispatch("b335cb57", new Object[]{this, mspContext});
        }
        if (mspContext == null || (mspWindowClient = (MspWindowClient) mspContext.getMspUIClient()) == null || (currentWindowFrame = mspWindowClient.getCurrentWindowFrame()) == null) {
            return null;
        }
        FBDocument fBDocument = currentWindowFrame.getFBDocument();
        if (fBDocument == null) {
            return PluginManager.getRender().getFbContextFromView(currentWindowFrame.getContentView());
        }
        return fBDocument;
    }

    public static /* synthetic */ Object ipc$super(BNFramePlugin bNFramePlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/ui/birdnest/plugin/BNFramePlugin");
    }

    private void onBeforeLoad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18d5c2cb", new Object[]{this});
            return;
        }
        MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(this.mPluginFramebizId);
        if (mspContextByBizId != null) {
            MspWindowClient mspWindowClient = (MspWindowClient) mspContextByBizId.getMspUIClient();
            if (mspWindowClient != null) {
                mspWindowClient.setOnFrameTplEventListener(new OnFrameTplEventListener() { // from class: com.alipay.android.msp.ui.birdnest.plugin.BNFramePlugin.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alipay.android.app.birdnest.api.OnFrameTplEventListener
                    public boolean onInterceptTplEvent(Object obj, String str, EventAction.MspEvent mspEvent) {
                        MspWindowClient mspWindowClient2;
                        MspWindowFrame currentWindowFrame;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("a565d675", new Object[]{this, obj, str, mspEvent})).booleanValue();
                        }
                        if (mspEvent == null) {
                            LogUtil.record(8, "BNFramePlugin:onInterceptTplEvent", "mspEvent null");
                            return false;
                        }
                        MspContext mspContextByBizId2 = MspContextManager.getInstance().getMspContextByBizId(BNFramePlugin.access$000(BNFramePlugin.this));
                        if (!(mspContextByBizId2 == null || !(obj instanceof FBDocument) || (mspWindowClient2 = (MspWindowClient) mspContextByBizId2.getMspUIClient()) == null || (currentWindowFrame = mspWindowClient2.getCurrentWindowFrame()) == null || currentWindowFrame.getFBDocument() != null)) {
                            currentWindowFrame.setFBDocument((FBDocument) obj);
                        }
                        if (!TextUtils.equals(mspEvent.getActionName(), MspFlybirdDefine.FLYBIRD_FRAME_EVENT)) {
                            return false;
                        }
                        try {
                            String str2 = "onFramePluginEvent&&onFramePluginEvent('" + Utils.toJsJsonString(mspEvent.getActionParamsJson().toJSONString()) + "')";
                            LogUtil.record(2, "BNFramePlugin", "event:jsInstruction = ".concat(String.valueOf(str2)));
                            if (mspContextByBizId2 == null || !mspContextByBizId2.isUseSafeJsExecute()) {
                                LogUtil.record(2, "BNFramePlugin", "event:result = ".concat(String.valueOf(BNFramePlugin.access$600(BNFramePlugin.this).nativeExecuteJs(str2))));
                            } else {
                                BNFramePlugin.access$600(BNFramePlugin.this).safeExecuteJs(str2);
                            }
                        } catch (Throwable th) {
                            LogUtil.printExceptionStackTrace(th);
                        }
                        return true;
                    }
                });
            } else {
                LogUtil.record(8, "BNFramePlugin:onBeforeLoad", "mspWindowClient null");
            }
        } else {
            LogUtil.record(8, "BNFramePlugin:onBeforeLoad", "mspContext null");
        }
    }

    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    public View createView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("79a2c742", new Object[]{this, context});
        }
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.mContainerView = relativeLayout;
        return relativeLayout;
    }

    public void finalize() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
        } else {
            super.finalize();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    @Override // com.alipay.android.app.template.AbsFBPlugin, com.alipay.android.app.template.FBPlugin
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean updateAttr(java.lang.String r11, final java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.ui.birdnest.plugin.BNFramePlugin.updateAttr(java.lang.String, java.lang.String):boolean");
    }
}
