package com.taobao.message.chat.component.chatinput.utils;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.EditText;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.message.lab.comfrm.inner2.Disposable;
import com.taobao.message.uikit.util.ApplicationUtil;
import com.taobao.message.uikit.util.DisplayUtil;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.tao.log.TLog;
import kotlin.Metadata;
import kotlin.a;
import kotlin.jvm.internal.PropertyReference1Impl;
import tb.a07;
import tb.a0g;
import tb.ckf;
import tb.dun;
import tb.g1a;
import tb.njg;
import tb.t2o;
import tb.tsq;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 32\u00020\u00012\u00020\u0002:\u00013B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001b\u0010!\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R?\u0010&\u001a\u001f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020\u000b\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001b\u00100\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u001e\u001a\u0004\b.\u0010/R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00101R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00102¨\u00064"}, d2 = {"Lcom/taobao/message/chat/component/chatinput/utils/ChatKeyboardHelper;", "Lcom/taobao/message/lab/comfrm/inner2/Disposable;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Landroid/app/Activity;", "aty", "Landroid/widget/EditText;", "inputView", "<init>", "(Landroid/app/Activity;Landroid/widget/EditText;)V", "", "height", "Ltb/xhv;", "changeKeyboardHeight", "(I)V", "value", "addIntSharedpreferences", "", "isClose", "hide", "(Z)V", "onGlobalLayout", "()V", ErrorCode.DEFAULT_WINDOW_FRAME_DISPOSE_EX, "preDiff", TLogTracker.LEVEL_INFO, "mKeyboardHeight", "shouldPanelOn", "Z", "lastHeightDiff", "minHeight$delegate", "Ltb/njg;", "getMinHeight", "()I", "minHeight", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "show", "keyboardWillShowOrHide", "Ltb/g1a;", "getKeyboardWillShowOrHide", "()Ltb/g1a;", "setKeyboardWillShowOrHide", "(Ltb/g1a;)V", "Landroid/view/View;", "decorView$delegate", "getDecorView", "()Landroid/view/View;", "decorView", "Landroid/app/Activity;", "Landroid/widget/EditText;", "Companion", "message_sp_framework_debug"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class ChatKeyboardHelper implements Disposable, ViewTreeObserver.OnGlobalLayoutListener {
    public static final /* synthetic */ a0g[] $$delegatedProperties;
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static int SOFT_KEYBOARD_HEIGHT = 0;
    public static final String TAG = "ChatKeyboardHelper";
    private final Activity aty;
    private final EditText inputView;
    private g1a<? super Boolean, xhv> keyboardWillShowOrHide;
    private int mKeyboardHeight;
    private int preDiff;
    private boolean shouldPanelOn;
    public static final Companion Companion = new Companion(null);
    private static int heightThreshold = DisplayUtil.dip2px(ApplicationUtil.getApplication(), 62.75f);
    private int lastHeightDiff = -1;
    private final njg minHeight$delegate = a.b(new ChatKeyboardHelper$minHeight$2(this));
    private final njg decorView$delegate = a.b(new ChatKeyboardHelper$decorView$2(this));

    /* compiled from: Taobao */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0006\"\u0004\b\r\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/taobao/message/chat/component/chatinput/utils/ChatKeyboardHelper$Companion;", "", "()V", "SOFT_KEYBOARD_HEIGHT", "", "getSOFT_KEYBOARD_HEIGHT", "()I", "setSOFT_KEYBOARD_HEIGHT", "(I)V", RPCDataItems.SWITCH_TAG_LOG, "", "heightThreshold", "getHeightThreshold", "setHeightThreshold", "message_sp_framework_debug"}, k = 1, mv = {1, 1, 15})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class Companion {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(552599574);
        }

        private Companion() {
        }

        public final int getHeightThreshold() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b1dd0e48", new Object[]{this})).intValue();
            }
            return ChatKeyboardHelper.access$getHeightThreshold$cp();
        }

        public final int getSOFT_KEYBOARD_HEIGHT() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d48c973a", new Object[]{this})).intValue();
            }
            return ChatKeyboardHelper.access$getSOFT_KEYBOARD_HEIGHT$cp();
        }

        public final void setHeightThreshold(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4185e5a", new Object[]{this, new Integer(i)});
            } else {
                ChatKeyboardHelper.access$setHeightThreshold$cp(i);
            }
        }

        public final void setSOFT_KEYBOARD_HEIGHT(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6d31d10", new Object[]{this, new Integer(i)});
            } else {
                ChatKeyboardHelper.access$setSOFT_KEYBOARD_HEIGHT$cp(i);
            }
        }

        public /* synthetic */ Companion(a07 a07Var) {
            this();
        }
    }

    public ChatKeyboardHelper(Activity activity, EditText editText) {
        ckf.h(activity, "aty");
        ckf.h(editText, "inputView");
        this.aty = activity;
        this.inputView = editText;
        Window window = activity.getWindow();
        ckf.c(window, "aty.window");
        View decorView = window.getDecorView();
        ckf.c(decorView, "aty.window.decorView");
        decorView.getViewTreeObserver().addOnGlobalLayoutListener(this);
        if (TBDeviceUtils.p(activity) && tsq.x(Build.BRAND, "samsung", true)) {
            heightThreshold = DisplayUtil.dip2px(ApplicationUtil.getApplication(), 70.0f);
        }
    }

    public static final /* synthetic */ Activity access$getAty$p(ChatKeyboardHelper chatKeyboardHelper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("6318a1ac", new Object[]{chatKeyboardHelper});
        }
        return chatKeyboardHelper.aty;
    }

    public static final /* synthetic */ int access$getHeightThreshold$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f28713bd", new Object[0])).intValue();
        }
        return heightThreshold;
    }

    public static final /* synthetic */ int access$getSOFT_KEYBOARD_HEIGHT$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dcf5a40b", new Object[0])).intValue();
        }
        return SOFT_KEYBOARD_HEIGHT;
    }

    public static final /* synthetic */ void access$setHeightThreshold$cp(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("748bbded", new Object[]{new Integer(i)});
        } else {
            heightThreshold = i;
        }
    }

    public static final /* synthetic */ void access$setSOFT_KEYBOARD_HEIGHT$cp(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bca8b4f7", new Object[]{new Integer(i)});
        } else {
            SOFT_KEYBOARD_HEIGHT = i;
        }
    }

    private final void addIntSharedpreferences(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3194c2f7", new Object[]{this, new Integer(i)});
            return;
        }
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(this.aty.getApplication()).edit();
        edit.putInt("Preference_KeyBoardHeight", i);
        edit.apply();
    }

    private final void changeKeyboardHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c85525e", new Object[]{this, new Integer(i)});
            return;
        }
        int max = Math.max(i, getMinHeight());
        if (this.mKeyboardHeight != max) {
            this.mKeyboardHeight = max;
            SOFT_KEYBOARD_HEIGHT = max;
            addIntSharedpreferences(max);
            if (ApplicationUtil.isDebug()) {
                TLog.logd(TAG, "changeKeyboardHeight mKeyboardHeight=" + this.mKeyboardHeight);
            }
        }
    }

    private final View getDecorView() {
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            value = ipChange.ipc$dispatch("6d69b8fd", new Object[]{this});
        } else {
            njg njgVar = this.decorView$delegate;
            a0g a0gVar = $$delegatedProperties[1];
            value = njgVar.getValue();
        }
        return (View) value;
    }

    private final int getMinHeight() {
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            value = ipChange.ipc$dispatch("3ce02a5d", new Object[]{this});
        } else {
            njg njgVar = this.minHeight$delegate;
            a0g a0gVar = $$delegatedProperties[0];
            value = njgVar.getValue();
        }
        return ((Number) value).intValue();
    }

    private final void hide(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("300cdb2b", new Object[]{this, new Boolean(z)});
        } else if (!z) {
            Window window = this.aty.getWindow();
            ckf.c(window, "aty.window");
            View decorView = window.getDecorView();
            ckf.c(decorView, "aty.window.decorView");
            if (decorView.getSystemUiVisibility() == 0) {
                this.inputView.requestFocus();
            }
        }
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Disposable
    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
            return;
        }
        Window window = this.aty.getWindow();
        ckf.c(window, "aty.window");
        View decorView = window.getDecorView();
        ckf.c(decorView, "aty.window.decorView");
        decorView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    public final g1a<Boolean, xhv> getKeyboardWillShowOrHide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("1f67004", new Object[]{this});
        }
        return this.keyboardWillShowOrHide;
    }

    public final void setKeyboardWillShowOrHide(g1a<? super Boolean, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("afc4b72a", new Object[]{this, g1aVar});
        } else {
            this.keyboardWillShowOrHide = g1aVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009e  */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onGlobalLayout() {
        /*
            r7 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.message.chat.component.chatinput.utils.ChatKeyboardHelper.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0012
            java.lang.String r3 = "df7e7eb3"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r7
            r2.ipc$dispatch(r3, r1)
            return
        L_0x0012:
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            android.view.View r3 = r7.getDecorView()
            r3.getWindowVisibleDisplayFrame(r2)
            android.view.View r3 = r7.getDecorView()
            java.lang.String r4 = "decorView"
            tb.ckf.c(r3, r4)
            android.view.View r3 = r3.getRootView()
            java.lang.String r4 = "decorView.rootView"
            tb.ckf.c(r3, r4)
            int r3 = r3.getHeight()
            int r4 = r2.bottom
            int r4 = r3 - r4
            boolean r5 = com.taobao.message.uikit.util.ApplicationUtil.isDebug()
            if (r5 == 0) goto L_0x0064
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "screenHeight:"
            r5.<init>(r6)
            r5.append(r3)
            java.lang.String r3 = " r.bottom:"
            r5.append(r3)
            int r2 = r2.bottom
            r5.append(r2)
            java.lang.String r2 = " heightDifference:"
            r5.append(r2)
            r5.append(r4)
            java.lang.String r2 = r5.toString()
            java.lang.String r3 = "ChatKeyboardHelper"
            com.taobao.tao.log.TLog.logd(r3, r2)
        L_0x0064:
            int r2 = r7.lastHeightDiff
            if (r2 != r4) goto L_0x0069
            return
        L_0x0069:
            r7.lastHeightDiff = r4
            int r2 = com.taobao.message.chat.component.chatinput.utils.ChatKeyboardHelper.heightThreshold
            if (r4 <= r2) goto L_0x00a9
            int r1 = r7.preDiff
            int r1 = r1 - r4
            int r1 = java.lang.Math.abs(r1)
            int r2 = com.taobao.message.chat.component.chatinput.utils.ChatKeyboardHelper.heightThreshold
            if (r1 <= r2) goto L_0x00a6
            int r1 = r7.preDiff
            if (r1 > r2) goto L_0x0081
        L_0x007e:
            int r1 = r4 - r1
            goto L_0x0087
        L_0x0081:
            if (r4 <= r1) goto L_0x0086
            int r1 = r4 - r1
            goto L_0x007e
        L_0x0086:
            r1 = r4
        L_0x0087:
            r7.changeKeyboardHeight(r1)
            r7.shouldPanelOn = r0
            r7.hide(r0)
            android.app.Activity r0 = r7.aty
            android.view.Window r0 = r0.getWindow()
            r1 = 18
            r0.setSoftInputMode(r1)
            tb.g1a<? super java.lang.Boolean, tb.xhv> r0 = r7.keyboardWillShowOrHide
            if (r0 == 0) goto L_0x00a6
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Object r0 = r0.invoke(r1)
            tb.xhv r0 = (tb.xhv) r0
        L_0x00a6:
            r7.preDiff = r4
            goto L_0x00c0
        L_0x00a9:
            if (r4 > r2) goto L_0x00c0
            int r0 = r7.preDiff
            if (r0 == r4) goto L_0x00b2
            r7.hide(r1)
        L_0x00b2:
            r7.preDiff = r4
            tb.g1a<? super java.lang.Boolean, tb.xhv> r0 = r7.keyboardWillShowOrHide
            if (r0 == 0) goto L_0x00c0
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.lang.Object r0 = r0.invoke(r1)
            tb.xhv r0 = (tb.xhv) r0
        L_0x00c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.message.chat.component.chatinput.utils.ChatKeyboardHelper.onGlobalLayout():void");
    }

    static {
        t2o.a(552599573);
        t2o.a(537919598);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(dun.b(ChatKeyboardHelper.class), "minHeight", "getMinHeight()I");
        dun.i(propertyReference1Impl);
        PropertyReference1Impl propertyReference1Impl2 = new PropertyReference1Impl(dun.b(ChatKeyboardHelper.class), "decorView", "getDecorView()Landroid/view/View;");
        dun.i(propertyReference1Impl2);
        $$delegatedProperties = new a0g[]{propertyReference1Impl, propertyReference1Impl2};
    }
}
