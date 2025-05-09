package com.taobao.unit.center.mdc.dinamicx.dataParse;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import com.ali.user.mobile.app.constant.UTConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.layoutmanager.setup.WindvanePluginRegister;
import com.taobao.message.kit.util.SharedPreferencesUtil;
import com.taobao.message.lab.comfrm.ComponentFrmModule;
import com.taobao.message.lab.comfrm.render.WidgetRenderImpl;
import com.taobao.message.lab.comfrm.support.dinamic.DXWidgetInstance;
import com.taobao.message.lab.comfrm.util.KeyboardStateHelper;
import com.taobao.message.lab.comfrm.util.Logger;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.message.uikit.util.DisplayUtil;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.tao.log.TLog;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.a;
import kotlin.jvm.internal.PropertyReference1Impl;
import tb.a0g;
import tb.ckf;
import tb.dun;
import tb.evb;
import tb.fl6;
import tb.ic1;
import tb.njg;
import tb.t2o;
import tb.tsq;
import tb.x3w;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ-\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u0010\u0010\u0013\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0012\u0018\u00010\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001c\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010$¨\u0006&"}, d2 = {"Lcom/taobao/unit/center/mdc/dinamicx/dataParse/DXDataParserMpKeyboardHeightAp;", "Ltb/evb;", "<init>", "()V", "Lcom/taobao/android/dinamicx/DXRuntimeContext;", "runtimeParam", "", "biz", "", "isKeyboardShow", "(Lcom/taobao/android/dinamicx/DXRuntimeContext;Ljava/lang/String;)Z", "Landroid/app/Activity;", "aty", "", WindvanePluginRegister.WVWindowInfoPlugin.ACTION_GET_STATUS_BAR_HEIGHT, "(Landroid/app/Activity;)I", "getScreenHeight", "", "", "operationList", "evalWithArgs", "([Ljava/lang/Object;Lcom/taobao/android/dinamicx/DXRuntimeContext;)Ljava/lang/Object;", "NAME", "Ljava/lang/String;", "screenWidth$delegate", "Ltb/njg;", "getScreenWidth", "()I", x3w.KEY_NEW_DETAIL_VISIBLE_BLOCK_WIDTH, "Lcom/taobao/message/lab/comfrm/util/KeyboardStateHelper;", "keyboardHelper", "Lcom/taobao/message/lab/comfrm/util/KeyboardStateHelper;", "", "DEFAULT_HEIGHT_AP", UTConstant.Args.UT_SUCCESS_F, "statusBarHeight", TLogTracker.LEVEL_INFO, "screenHeight", "message_sp_framework_debug"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class DXDataParserMpKeyboardHeightAp implements evb {
    public static final /* synthetic */ a0g[] $$delegatedProperties;
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final float DEFAULT_HEIGHT_AP = 315.0f;
    public static final String NAME = "mpKeyboardHeightAp";
    public static final DXDataParserMpKeyboardHeightAp INSTANCE = new DXDataParserMpKeyboardHeightAp();
    private static final njg screenWidth$delegate = a.b(DXDataParserMpKeyboardHeightAp$screenWidth$2.INSTANCE);
    private static final KeyboardStateHelper keyboardHelper = new KeyboardStateHelper();
    private static int statusBarHeight = -1;
    private static int screenHeight = -1;

    private DXDataParserMpKeyboardHeightAp() {
    }

    private final int getScreenHeight(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("47208a75", new Object[]{this, activity})).intValue();
        }
        Window window = activity.getWindow();
        ckf.c(window, "aty.window");
        View decorView = window.getDecorView();
        ckf.c(decorView, "aty.window.decorView");
        View rootView = decorView.getRootView();
        ckf.c(rootView, "aty.window.decorView.rootView");
        int height = rootView.getHeight();
        screenHeight = height;
        return height;
    }

    private final int getScreenWidth() {
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            value = ipChange.ipc$dispatch("43d49fe", new Object[]{this});
        } else {
            njg njgVar = screenWidth$delegate;
            a0g a0gVar = $$delegatedProperties[0];
            value = njgVar.getValue();
        }
        return ((Number) value).intValue();
    }

    private final int getStatusBarHeight(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9070b1e", new Object[]{this, activity})).intValue();
        }
        if (statusBarHeight < 0) {
            statusBarHeight = DisplayUtil.getStatusBarHeight(activity);
        }
        return statusBarHeight;
    }

    private final boolean isKeyboardShow(DXRuntimeContext dXRuntimeContext, String str) {
        WidgetRenderImpl.RenderConfig renderConfig;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6ab9e54", new Object[]{this, dXRuntimeContext, str})).booleanValue();
        }
        Context context = null;
        if (ComponentFrmModule.sFixInputAndroid13) {
            KeyboardStateHelper keyboardStateHelper = keyboardHelper;
            if (dXRuntimeContext != null) {
                context = dXRuntimeContext.h();
            }
            return keyboardStateHelper.isKeyboardShow((Activity) context);
        } else if (ckf.b(str, "msgInput") || ckf.b(str, "bizDetailInput")) {
            KeyboardStateHelper keyboardStateHelper2 = keyboardHelper;
            if (dXRuntimeContext != null) {
                context = dXRuntimeContext.h();
            }
            return keyboardStateHelper2.isKeyboardShow((Activity) context);
        } else {
            Context h = dXRuntimeContext != null ? dXRuntimeContext.h() : null;
            if (!(h instanceof Activity)) {
                h = null;
            }
            Activity activity = (Activity) h;
            if (activity == null) {
                return false;
            }
            fl6 S = dXRuntimeContext.S();
            if (S instanceof DXWidgetInstance.MPUserContext) {
                context = S;
            }
            DXWidgetInstance.MPUserContext mPUserContext = (DXWidgetInstance.MPUserContext) context;
            int i = (mPUserContext == null || (renderConfig = mPUserContext.getRenderConfig()) == null) ? 0 : renderConfig.matchParentPaddingTop;
            DXRootView L = dXRuntimeContext.L();
            ckf.c(L, "runtimeParam.rootView");
            ViewParent parent = L.getParent();
            if (parent != null) {
                int height = ((View) parent).getHeight() + i;
                int screenHeight2 = getScreenHeight(activity);
                int statusBarHeight2 = getStatusBarHeight(activity);
                int i2 = (screenHeight2 - statusBarHeight2) - height;
                int dip2px = DisplayUtil.dip2px(ApplicationUtil.getApplication(), 62.75f);
                if (TBDeviceUtils.p(activity) && tsq.x(Build.BRAND, "samsung", true)) {
                    dip2px = DisplayUtil.dip2px(ApplicationUtil.getApplication(), 70.0f);
                }
                if (i2 > dip2px) {
                    Logger.e(NAME, "HEIGHT_THRESHOLD|screenHeight|" + screenHeight2 + "|statusBarHeight|" + statusBarHeight2 + "|displayHeight|" + height + "|heightThreshold|" + dip2px);
                }
                return i2 > dip2px;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.View");
        }
    }

    static {
        t2o.a(552599744);
        t2o.a(444596865);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(dun.b(DXDataParserMpKeyboardHeightAp.class), x3w.KEY_NEW_DETAIL_VISIBLE_BLOCK_WIDTH, "getScreenWidth()I");
        dun.i(propertyReference1Impl);
        $$delegatedProperties = new a0g[]{propertyReference1Impl};
    }

    @Override // tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        float f;
        Object L;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        Context context = null;
        String obj = (objArr == null || (L = ic1.L(objArr, 0)) == null) ? null : L.toString();
        int i = 40;
        if (ckf.b(obj, "inputRowSpacing")) {
            if (dXRuntimeContext != null) {
                context = dXRuntimeContext.h();
            }
            if (!DisplayUtil.isLargeScreen((Activity) context)) {
                i = 26;
            }
            return Integer.valueOf(i);
        } else if (ckf.b(obj, "inputColumnSpacing")) {
            if (!DisplayUtil.isLargeScreen((Activity) (dXRuntimeContext != null ? dXRuntimeContext.h() : null))) {
                return 23;
            }
            Context h = dXRuntimeContext != null ? dXRuntimeContext.h() : null;
            if (h instanceof Activity) {
                context = h;
            }
            Activity activity = (Activity) context;
            if (activity == null) {
                return 40;
            }
            int designWindowWidth = DisplayUtil.getDesignWindowWidth(activity);
            int ap2DesignScalePx = DisplayUtil.ap2DesignScalePx(activity, 70.0f);
            int ap2DesignScalePx2 = designWindowWidth - (DisplayUtil.ap2DesignScalePx(activity, 20.0f) * 2);
            int i2 = (ap2DesignScalePx2 - (ap2DesignScalePx * 4)) / 3;
            int px2DesignScaleAp = DisplayUtil.px2DesignScaleAp(activity, i2);
            new StringBuilder("screenWidth:").append(designWindowWidth);
            new StringBuilder("itemWidth:").append(ap2DesignScalePx);
            new StringBuilder("displayWidth:").append(ap2DesignScalePx2);
            new StringBuilder("columnWidth:").append(i2);
            new StringBuilder("columnWidthAp:").append(px2DesignScaleAp);
            if (px2DesignScaleAp <= 0 || px2DesignScaleAp > 200) {
                px2DesignScaleAp = 80;
            }
            return Integer.valueOf(px2DesignScaleAp);
        } else if (isKeyboardShow(dXRuntimeContext, obj)) {
            Logger.e(NAME, "isKeyboardShow");
            return 0;
        } else {
            Logger.e(NAME, "isKeyboardHide");
            int intSharedPreference = SharedPreferencesUtil.getIntSharedPreference("Preference_KeyBoardHeight", 0);
            float f2 = DEFAULT_HEIGHT_AP;
            if (intSharedPreference > 0) {
                if (DisplayUtil.isLargeScreen((Activity) (dXRuntimeContext != null ? dXRuntimeContext.h() : null))) {
                    if (dXRuntimeContext != null) {
                        context = dXRuntimeContext.h();
                    }
                    f = DisplayUtil.px2DesignScaleAp((Activity) context, intSharedPreference);
                } else {
                    f = (intSharedPreference * 375.0f) / getScreenWidth();
                }
            } else {
                f = DEFAULT_HEIGHT_AP;
            }
            TLog.loge(NAME, "keyboardHeight:" + f + "|DEFAULT_HEIGHT_AP:315.0");
            if (f >= DEFAULT_HEIGHT_AP) {
                f2 = f;
            }
            return Float.valueOf(f2);
        }
    }
}
