package com.taobao.android.turbo.service.redpoint.tabicon;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ViewAnimator;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.airbnb.lottie.LottieAnimationView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.android.external.UCPManager;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import com.taobao.android.turbo.model.RedpointModel;
import com.taobao.android.turbo.model.UserModel;
import com.taobao.android.turbo.service.redpoint.tabicon.LTVTabIconManager;
import com.taobao.android.turbo.service.redpoint.tabicon.TabIconDisplayManager;
import com.taobao.android.turbo.utils.DeviceUtil;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.flexbox.layoutmanager.view.TNodeImageView;
import com.taobao.tao.navigation.NavigationTabIndicatorView;
import com.taobao.tao.navigation.NavigationTabMsgMode;
import com.taobao.tao.navigation.TBFragmentTabHost;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.uikit.feature.features.RoundRectFeature;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import tb.a07;
import tb.akt;
import tb.at4;
import tb.b1m;
import tb.bud;
import tb.ckf;
import tb.f82;
import tb.h8x;
import tb.hfn;
import tb.ir2;
import tb.jfe;
import tb.jfw;
import tb.mx7;
import tb.nwv;
import tb.pg1;
import tb.qpu;
import tb.reu;
import tb.s6o;
import tb.s8d;
import tb.spu;
import tb.sz3;
import tb.t2c;
import tb.t2o;
import tb.tjb;
import tb.tpu;
import tb.vaj;
import tb.vkg;
import tb.wsq;
import tb.zk4;
import tb.zrt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class TabIconDisplayManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public BroadcastReceiver b;
    public boolean d;
    public BroadcastReceiver e;
    public final qpu f;

    /* renamed from: a  reason: collision with root package name */
    public boolean f9775a = !h8x.a();
    public final List<Runnable> c = new ArrayList();

    /* compiled from: Taobao */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017R\u001c\u0010!\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001a\u0010$\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0015\"\u0004\b&\u0010\u0017R\u001a\u0010'\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0015\"\u0004\b)\u0010\u0017R\u001a\u0010*\u001a\u00020+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001c\u00100\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\bR\u001a\u00103\u001a\u00020+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010-\"\u0004\b5\u0010/R\u001c\u00106\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0006\"\u0004\b8\u0010\bR\u001c\u00109\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0006\"\u0004\b;\u0010\bR$\u0010<\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010=X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001c\u0010B\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0006\"\u0004\bD\u0010\b¨\u0006E"}, d2 = {"Lcom/taobao/android/turbo/service/redpoint/tabicon/TabIconDisplayManager$IconParams;", "Ljava/io/Serializable;", "()V", "animation", "", "getAnimation", "()Ljava/lang/String;", "setAnimation", "(Ljava/lang/String;)V", vaj.KEY_BG_COLOR, "getBgColor", "setBgColor", "bottomImage", "getBottomImage", "setBottomImage", "contentMode", "getContentMode", "setContentMode", "duration", "", "getDuration", "()I", "setDuration", "(I)V", "image", "getImage", "setImage", "imageHeight", "getImageHeight", "setImageHeight", "imageWidth", "getImageWidth", "setImageWidth", "leftImage", "getLeftImage", "setLeftImage", "loopCount", "getLoopCount", "setLoopCount", "loopDuration", "getLoopDuration", "setLoopDuration", UserModel.AvatarIcon.LIGHT_TYPE_RED_POINT, "", "getRedPoint", "()Z", "setRedPoint", "(Z)V", "rightImage", "getRightImage", "setRightImage", "rightImageLeftGap", "getRightImageLeftGap", "setRightImageLeftGap", "text", "getText", "setText", "textColor", "getTextColor", "setTextColor", "textList", "", "getTextList", "()Ljava/util/List;", "setTextList", "(Ljava/util/List;)V", "topType", "getTopType", "setTopType", "turboflow_biz_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class IconParams implements Serializable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String animation;
        private String bgColor;
        private String bottomImage;
        private String contentMode;
        private int duration;
        private String image;
        private int imageHeight;
        private int imageWidth;
        private String leftImage;
        private int loopCount;
        private int loopDuration;
        private boolean redPoint;
        private String rightImage;
        private boolean rightImageLeftGap;
        private String text;
        private String textColor;
        private List<String> textList;
        private String topType;

        static {
            t2o.a(916455641);
        }

        public final String getAnimation() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("95de4eeb", new Object[]{this});
            }
            return this.animation;
        }

        public final String getBgColor() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("73519e11", new Object[]{this});
            }
            return this.bgColor;
        }

        public final String getBottomImage() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("7a98be7f", new Object[]{this});
            }
            return this.bottomImage;
        }

        public final String getContentMode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("82dc1a33", new Object[]{this});
            }
            return this.contentMode;
        }

        public final int getDuration() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ed837a84", new Object[]{this})).intValue();
            }
            return this.duration;
        }

        public final String getImage() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8a7b8874", new Object[]{this});
            }
            return this.image;
        }

        public final int getImageHeight() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f0bdcba6", new Object[]{this})).intValue();
            }
            return this.imageHeight;
        }

        public final int getImageWidth() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c7f3f91b", new Object[]{this})).intValue();
            }
            return this.imageWidth;
        }

        public final String getLeftImage() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("32404edb", new Object[]{this});
            }
            return this.leftImage;
        }

        public final int getLoopCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e9ea040f", new Object[]{this})).intValue();
            }
            return this.loopCount;
        }

        public final int getLoopDuration() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a65e9448", new Object[]{this})).intValue();
            }
            return this.loopDuration;
        }

        public final boolean getRedPoint() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("cd999f00", new Object[]{this})).booleanValue();
            }
            return this.redPoint;
        }

        public final String getRightImage() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("4a132d84", new Object[]{this});
            }
            return this.rightImage;
        }

        public final boolean getRightImageLeftGap() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c9b3285", new Object[]{this})).booleanValue();
            }
            return this.rightImageLeftGap;
        }

        public final String getText() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("97297536", new Object[]{this});
            }
            return this.text;
        }

        public final String getTextColor() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1e093f79", new Object[]{this});
            }
            return this.textColor;
        }

        public final List<String> getTextList() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("d127f05f", new Object[]{this});
            }
            return this.textList;
        }

        public final String getTopType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d02386a0", new Object[]{this});
            }
            return this.topType;
        }

        public final void setAnimation(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a8294a53", new Object[]{this, str});
            } else {
                this.animation = str;
            }
        }

        public final void setBgColor(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fde5aced", new Object[]{this, str});
            } else {
                this.bgColor = str;
            }
        }

        public final void setBottomImage(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f036403f", new Object[]{this, str});
            } else {
                this.bottomImage = str;
            }
        }

        public final void setContentMode(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f05e5b0b", new Object[]{this, str});
            } else {
                this.contentMode = str;
            }
        }

        public final void setDuration(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("55c2b106", new Object[]{this, new Integer(i)});
            } else {
                this.duration = i;
            }
        }

        public final void setImage(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("71ce1bea", new Object[]{this, str});
            } else {
                this.image = str;
            }
        }

        public final void setImageHeight(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("caf8b2bc", new Object[]{this, new Integer(i)});
            } else {
                this.imageHeight = i;
            }
        }

        public final void setImageWidth(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6d62384f", new Object[]{this, new Integer(i)});
            } else {
                this.imageWidth = i;
            }
        }

        public final void setLeftImage(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("98074863", new Object[]{this, str});
            } else {
                this.leftImage = str;
            }
        }

        public final void setLoopCount(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1b4d5a73", new Object[]{this, new Integer(i)});
            } else {
                this.loopCount = i;
            }
        }

        public final void setLoopDuration(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("10a75c2", new Object[]{this, new Integer(i)});
            } else {
                this.loopDuration = i;
            }
        }

        public final void setRedPoint(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("787159cc", new Object[]{this, new Boolean(z)});
            } else {
                this.redPoint = z;
            }
        }

        public final void setRightImage(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6f3c0a72", new Object[]{this, str});
            } else {
                this.rightImage = str;
            }
        }

        public final void setRightImageLeftGap(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b90f6c7f", new Object[]{this, new Boolean(z)});
            } else {
                this.rightImageLeftGap = z;
            }
        }

        public final void setText(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e2847200", new Object[]{this, str});
            } else {
                this.text = str;
            }
        }

        public final void setTextColor(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("255c6b85", new Object[]{this, str});
            } else {
                this.textColor = str;
            }
        }

        public final void setTextList(List<String> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("297994e5", new Object[]{this, list});
            } else {
                this.textList = list;
            }
        }

        public final void setTopType(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3b50d63e", new Object[]{this, str});
            } else {
                this.topType = str;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(916455634);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/taobao/android/turbo/service/redpoint/tabicon/TabIconDisplayManager$b;", "", "Landroid/content/Context;", "viewContext", "<init>", "(Landroid/content/Context;)V", "turboflow_biz_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f9776a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;

        static {
            t2o.a(916455635);
        }

        public b(Context context) {
            ckf.g(context, "viewContext");
            at4.a aVar = at4.Companion;
            int e = at4.a.e(aVar, context, 48, false, 4, null);
            int c = at4.a.c(aVar, context, 80, false, 4, null);
            NavigationTabIndicatorView tabViewAtIndex = com.taobao.tao.navigation.a.o().getTabViewAtIndex(1);
            ckf.f(tabViewAtIndex, "Navigation.getFragmentTa…st().getTabViewAtIndex(1)");
            int width = tabViewAtIndex.getWidth();
            if (width <= 0) {
                TBFragmentTabHost o = com.taobao.tao.navigation.a.o();
                ckf.f(o, "Navigation.getFragmentTabHost()");
                width = o.getWidth() / 5;
                if (width <= 0) {
                    width = s6o.B(context) / 5;
                }
            }
            int c2 = at4.a.c(aVar, context, 324, false, 4, null);
            at4.a.c(aVar, context, 22, false, 4, null);
            at4.a.e(aVar, context, 52, false, 4, null);
            this.f9776a = c;
            this.b = width;
            this.c = e;
            this.d = c2;
            this.e = c + e;
            at4.a.c(aVar, context, 4, false, 4, null);
            at4.a.c(aVar, context, 22, false, 4, null);
            at4.a.c(aVar, context, 70, false, 4, null);
            at4.a.c(aVar, context, 60, false, 4, null);
        }

        public final int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4e55424c", new Object[]{this})).intValue();
            }
            return this.e;
        }

        public final int b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("67e015b5", new Object[]{this})).intValue();
            }
            return this.d;
        }

        public final int c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("8a2fcbe0", new Object[]{this})).intValue();
            }
            return this.c;
        }

        public final int d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("408409a1", new Object[]{this})).intValue();
            }
            return this.b;
        }

        public final int e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d8c66192", new Object[]{this})).intValue();
            }
            return this.f9776a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class c extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final a Companion = new a(null);
        public static final int MSG_MAIN_ICON_FAIL = 2;
        public static final int MSG_MAIN_ICON_READY = 1;
        public static final int MSG_TAB_ICON_ANIMATION = 262144;
        public static final int MSG_TAB_ICON_DISMISS = 4096;
        public static final int MSG_TOP_ICON_DISMISS = 8192;
        public static final int MSG_TOP_ICON_FAIL = 8;
        public static final int MSG_TOP_ICON_READY = 4;
        public static final int MSG_TOP_RIGHT_ICON_DISMISS = 16384;
        public static final int MSG_TOP_RIGHT_ICON_FAIL = 32;
        public static final int MSG_TOP_RIGHT_ICON_READY = 16;
        public static final int MSG_TOP_RIGHT_TEXT_ANIMATION = 131072;

        /* renamed from: a  reason: collision with root package name */
        public final TabIconDisplayManager f9777a;
        public final RedpointModel b;
        public final jfe c;
        public String d;
        public boolean e;
        public int f;
        public View g;
        public View h;
        public IconParams i;
        public View j;
        public IconParams k;
        public boolean l;
        public int m;
        public int n;
        public final Runnable o;
        public final FrameLayout p;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static final class a {
            static {
                t2o.a(916455637);
            }

            public a() {
            }

            public /* synthetic */ a(a07 a07Var) {
                this();
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static final class b {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            static {
                t2o.a(916455638);
            }

            public b(String str, long j, boolean z) {
            }
        }

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.turbo.service.redpoint.tabicon.TabIconDisplayManager$c$c  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static final class C0505c implements Animator.AnimatorListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f9778a;

            public C0505c(View view) {
                this.f9778a = view;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
                } else {
                    ckf.g(animator, "animation");
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                ckf.g(animator, "animation");
                View view = this.f9778a;
                ckf.d(view);
                view.setVisibility(8);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
                } else {
                    ckf.g(animator, "animation");
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
                } else {
                    ckf.g(animator, "animation");
                }
            }
        }

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static final class d implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public d() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                c cVar = c.this;
                ViewAnimator viewAnimator = (ViewAnimator) cVar.k();
                ckf.d(viewAnimator);
                c.a(cVar, cVar, "show", viewAnimator.getDisplayedChild(), c.b(c.this));
            }
        }

        static {
            t2o.a(916455636);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(TabIconDisplayManager tabIconDisplayManager, RedpointModel redpointModel, FrameLayout frameLayout, jfe jfeVar) {
            super(Looper.getMainLooper());
            ckf.g(tabIconDisplayManager, "displayManager");
            ckf.g(redpointModel, "redpoint");
            ckf.g(jfeVar, "callback");
            this.p = frameLayout;
            new d();
            ckf.d(frameLayout);
            frameLayout.setTag(R.id.turbo_engine_icon_display_manager, this);
            this.b = redpointModel;
            this.c = jfeVar;
            this.f9777a = tabIconDisplayManager;
        }

        public static final /* synthetic */ void a(c cVar, c cVar2, String str, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("251e6c1a", new Object[]{cVar, cVar2, str, new Integer(i), new Integer(i2)});
            } else {
                cVar.e(cVar2, str, i, i2);
            }
        }

        public static final /* synthetic */ int b(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("778c47b3", new Object[]{cVar})).intValue();
            }
            cVar.getClass();
            return 0;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/service/redpoint/tabicon/TabIconDisplayManager$IconDisplayManager");
        }

        public final void A(View view, IconParams iconParams) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("52238efa", new Object[]{this, view, iconParams});
                return;
            }
            ViewAnimator f = f(view);
            if (f != null && f.getChildCount() > 1) {
                f.setDisplayedChild(0);
                ckf.d(iconParams);
                sendEmptyMessageDelayed(131072, g(iconParams.getLoopDuration()));
            }
        }

        public final void e(c cVar, String str, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b1e104cd", new Object[]{this, cVar, str, new Integer(i), new Integer(i2)});
            } else {
                cVar.c.a(cVar.b, str, i, i2);
            }
        }

        public final int g(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c8572f7c", new Object[]{this, new Integer(i)})).intValue();
            }
            if (i <= 0) {
                return 2000;
            }
            int i2 = i - 350;
            if (i2 > 0) {
                return i2;
            }
            return 0;
        }

        public final FrameLayout h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FrameLayout) ipChange.ipc$dispatch("50730c7", new Object[]{this});
            }
            return this.p;
        }

        public final boolean i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5b539973", new Object[]{this})).booleanValue();
            }
            return this.l;
        }

        public final int j(IconParams iconParams) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("44b7844f", new Object[]{this, iconParams})).intValue();
            }
            if (iconParams != null) {
                return iconParams.getDuration();
            }
            return 0;
        }

        public final View k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("e04ef251", new Object[]{this});
            }
            return this.g;
        }

        public final RedpointModel l() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RedpointModel) ipChange.ipc$dispatch("20f27d09", new Object[]{this});
            }
            return this.b;
        }

        public final boolean m() {
            View view;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c80ed644", new Object[]{this})).booleanValue();
            }
            if (this.l || (view = this.g) == null) {
                return false;
            }
            ckf.d(view);
            if (view.getVisibility() == 0) {
                return true;
            }
            return false;
        }

        public final void n() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("768d63d4", new Object[]{this});
                return;
            }
            boolean z = this.g instanceof ViewAnimator;
            if (!TextUtils.isEmpty(this.d)) {
                e(this, "finish", 0, 0);
            }
        }

        public final void p(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a1f6adb9", new Object[]{this, new Boolean(z)});
            } else {
                this.l = z;
            }
        }

        public final void q(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e3de0d4", new Object[]{this, new Integer(i)});
            } else {
                this.f = i;
            }
        }

        public final void r(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3acdeb5d", new Object[]{this, new Boolean(z)});
            } else {
                this.e = z;
            }
        }

        public final void s(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8976d217", new Object[]{this, view});
            } else {
                this.g = view;
            }
        }

        public final void t(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c0599d8", new Object[]{this, str});
            } else {
                this.d = str;
            }
        }

        public final void u(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cbdf1122", new Object[]{this, view});
            } else {
                this.h = view;
            }
        }

        public final void v(IconParams iconParams) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4044d48", new Object[]{this, iconParams});
            } else {
                this.i = iconParams;
            }
        }

        public final void w(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9503d249", new Object[]{this, view});
            } else {
                this.j = view;
            }
        }

        public final void x(IconParams iconParams) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("961dfa41", new Object[]{this, iconParams});
            } else {
                this.k = iconParams;
            }
        }

        public final void y(View view, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c080b610", new Object[]{this, view, new Integer(i), new Integer(i2)});
            } else if (view != null) {
                view.setVisibility(0);
                if (i > 0) {
                    sendEmptyMessageDelayed(i2, i);
                }
            }
        }

        public final void c(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9726581a", new Object[]{this, view});
                return;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
            ckf.f(ofFloat, "mAlphaAnim");
            ofFloat.setInterpolator(new AccelerateInterpolator());
            ofFloat.addListener(new C0505c(view));
            ofFloat.setDuration(350L);
            ofFloat.start();
        }

        public final void d(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("758b3495", new Object[]{this, view});
                return;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
            ckf.f(ofFloat, "mAlphaAnim");
            ofFloat.setInterpolator(new AccelerateInterpolator());
            ofFloat.setDuration(350L);
            ofFloat.start();
        }

        public final void z(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c83e8a8b", new Object[]{this, new Boolean(z)});
                return;
            }
            boolean z2 = this.g instanceof ViewAnimator;
            if (!TextUtils.isEmpty(this.d)) {
                e(this, "show", 0, 0);
            }
        }

        public final ViewAnimator f(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewAnimator) ipChange.ipc$dispatch("733a3840", new Object[]{this, view});
            }
            if (!(view instanceof ViewGroup)) {
                return null;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (viewGroup.getChildAt(i) instanceof ViewAnimator) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt != null) {
                        return (ViewAnimator) childAt;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.ViewAnimator");
                }
            }
            return null;
        }

        public final void o(View view, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("edbf996d", new Object[]{this, view, str});
            } else if (view instanceof TextView) {
                ((TextView) view).setText(str);
            } else if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    if (viewGroup.getChildAt(i) instanceof TextView) {
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt != null) {
                            ((TextView) childAt).setText(str);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                        }
                    }
                }
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IconParams iconParams;
            IconParams iconParams2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            ckf.g(message, "msg");
            if (!this.l) {
                int i = this.n;
                int i2 = message.what;
                int i3 = i | i2;
                this.n = i3;
                if (i2 == 1) {
                    y(this.g, this.f, 4096);
                    z(true);
                    TabIconDisplayManager tabIconDisplayManager = this.f9777a;
                    FrameLayout frameLayout = this.p;
                    ckf.d(frameLayout);
                    Context context = frameLayout.getContext();
                    ckf.f(context, "container!!.context");
                    TabIconDisplayManager.f(tabIconDisplayManager, context, message.arg2);
                    View view = this.h;
                    if (!(view == null || (this.n & 4) == 0)) {
                        y(view, j(this.i), 8192);
                    }
                    if ((this.n & 16) != 0 && !this.e) {
                        y(this.j, j(this.k), 16384);
                        A(this.j, this.k);
                    }
                } else if (i2 == 2) {
                    e(this, "fail", 0, 0);
                } else if (i2 != 4) {
                    if (i2 != 16) {
                        if (i2 == 4096) {
                            this.f9777a.I();
                        } else if (i2 == 8192) {
                            c(this.h);
                            if (this.e && (this.n & 16) != 0) {
                                y(this.j, j(this.k), 16384);
                                A(this.j, this.k);
                                d(this.j);
                            }
                        } else if (i2 == 16384) {
                            View view2 = this.j;
                            ckf.d(view2);
                            view2.setVisibility(4);
                        } else if (i2 == 131072) {
                            ViewAnimator f = f(this.j);
                            if (f != null) {
                                int displayedChild = f.getDisplayedChild();
                                int childCount = f.getChildCount();
                                int i4 = childCount - 2;
                                if (displayedChild < i4) {
                                    f.setDisplayedChild(displayedChild + 1);
                                    ckf.d(this.k);
                                    sendEmptyMessageDelayed(131072, g(iconParams2.getLoopDuration()));
                                } else if (displayedChild == i4) {
                                    int i5 = this.m + 1;
                                    this.m = i5;
                                    IconParams iconParams3 = this.k;
                                    ckf.d(iconParams3);
                                    if (i5 < iconParams3.getLoopCount()) {
                                        f.setDisplayedChild(0);
                                        ckf.d(this.k);
                                        sendEmptyMessageDelayed(131072, g(iconParams.getLoopDuration()));
                                        return;
                                    }
                                    IconParams iconParams4 = this.k;
                                    ckf.d(iconParams4);
                                    if (iconParams4.getTextList() != null) {
                                        IconParams iconParams5 = this.k;
                                        ckf.d(iconParams5);
                                        List<String> textList = iconParams5.getTextList();
                                        ckf.d(textList);
                                        if (!textList.isEmpty()) {
                                            IconParams iconParams6 = this.k;
                                            ckf.d(iconParams6);
                                            if (!TextUtils.isEmpty(iconParams6.getText())) {
                                                IconParams iconParams7 = this.k;
                                                ckf.d(iconParams7);
                                                if (!TextUtils.equals(iconParams7.getAnimation(), reu.TRANSITION_TYPE_FADE)) {
                                                    try {
                                                        Animation[] c = TabIconDisplayManager.c(this.f9777a, true);
                                                        f.setInAnimation(c[0]);
                                                        f.setOutAnimation(c[1]);
                                                        f.removeViews(0, childCount - 1);
                                                        View childAt = f.getChildAt(0);
                                                        ckf.f(childAt, "lastView");
                                                        IconParams iconParams8 = this.k;
                                                        ckf.d(iconParams8);
                                                        o(childAt, iconParams8.getText());
                                                        f.setDisplayedChild(0);
                                                        return;
                                                    } catch (Throwable unused) {
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    f.setDisplayedChild(childCount - 1);
                                }
                            }
                        } else if (i2 == 262144) {
                            z(false);
                        }
                    } else if ((this.g == null || (i3 & 1) != 0) && !this.e) {
                        y(this.j, j(this.k), 16384);
                        A(this.j, this.k);
                    }
                } else if (this.g == null || (i3 & 1) != 0) {
                    y(this.h, j(this.i), 8192);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class d extends DecelerateInterpolator {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a Companion = new a(null);

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static final class a {
            static {
                t2o.a(916455643);
            }

            public a() {
            }

            public /* synthetic */ a(a07 a07Var) {
                this();
            }
        }

        static {
            t2o.a(916455642);
        }

        public d(float f) {
            super(f);
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            if (str.hashCode() == 583500507) {
                return new Float(super.getInterpolation(((Number) objArr[0]).floatValue()));
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/service/redpoint/tabicon/TabIconDisplayManager$TabIconInInterpolator");
        }

        @Override // android.view.animation.DecelerateInterpolator, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("22c782db", new Object[]{this, new Float(f)})).floatValue();
            }
            if (f <= 0.46666667f) {
                f2 = 0.0f;
            } else {
                f2 = (f - 0.46666667f) / 0.5333333f;
            }
            return super.getInterpolation(f2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class e extends DecelerateInterpolator {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a Companion = new a(null);

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static final class a {
            static {
                t2o.a(916455645);
            }

            public a() {
            }

            public /* synthetic */ a(a07 a07Var) {
                this();
            }
        }

        static {
            t2o.a(916455644);
        }

        public e(float f) {
            super(f);
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            if (str.hashCode() == 583500507) {
                return new Float(super.getInterpolation(((Number) objArr[0]).floatValue()));
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/service/redpoint/tabicon/TabIconDisplayManager$TabIconOutInterpolator");
        }

        @Override // android.view.animation.DecelerateInterpolator, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("22c782db", new Object[]{this, new Float(f)})).floatValue();
            }
            if (f <= 0.53333336f) {
                f2 = f / 0.53333336f;
            } else {
                f2 = 1.0f;
            }
            return super.getInterpolation(f2);
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (TabIconDisplayManager.d(TabIconDisplayManager.this) != null) {
                LocalBroadcastManager instance = LocalBroadcastManager.getInstance(spu.Companion.d());
                BroadcastReceiver d = TabIconDisplayManager.d(TabIconDisplayManager.this);
                ckf.d(d);
                instance.unregisterReceiver(d);
                TabIconDisplayManager.i(TabIconDisplayManager.this, null);
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                TabIconDisplayManager.b(TabIconDisplayManager.this);
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ RedpointModel b;
        public final /* synthetic */ jfe c;

        public h(RedpointModel redpointModel, jfe jfeVar) {
            this.b = redpointModel;
            this.c = jfeVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (TabIconDisplayManager.g(TabIconDisplayManager.this)) {
                TabIconDisplayManager.e(TabIconDisplayManager.this, this.b, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class i<T extends b1m> implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f9783a;
        public final /* synthetic */ long b;
        public final /* synthetic */ c c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;
        public final /* synthetic */ int f;

        public i(String str, long j, c cVar, int i, int i2, int i3) {
            this.f9783a = str;
            this.b = j;
            this.c = cVar;
            this.d = i;
            this.e = i2;
            this.f = i3;
        }

        /* renamed from: a */
        public final boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            this.c.sendMessage(Message.obtain(this.c, this.d, this.e, this.f, new c.b(this.f9783a, (System.nanoTime() - this.b) / 1000000, true)));
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class j<T extends b1m> implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f9784a;
        public final /* synthetic */ long b;
        public final /* synthetic */ c c;
        public final /* synthetic */ int d;

        public j(String str, long j, c cVar, int i) {
            this.f9784a = str;
            this.b = j;
            this.c = cVar;
            this.d = i;
        }

        /* renamed from: a */
        public final boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            this.c.sendMessage(Message.obtain(this.c, this.d, new c.b(this.f9784a, (System.nanoTime() - this.b) / 1000000, false)));
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class k extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ViewAnimator b;

        public k(ViewAnimator viewAnimator) {
            this.b = viewAnimator;
        }

        public static /* synthetic */ Object ipc$super(k kVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/service/redpoint/tabicon/TabIconDisplayManager$startBreathAnimation$1");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            TabIconDisplayManager.j(TabIconDisplayManager.this, this.b);
        }
    }

    static {
        t2o.a(916455633);
    }

    public TabIconDisplayManager(qpu qpuVar) {
        ckf.g(qpuVar, "context");
        this.f = qpuVar;
    }

    public static final /* synthetic */ c a(TabIconDisplayManager tabIconDisplayManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("688a75d3", new Object[]{tabIconDisplayManager});
        }
        return tabIconDisplayManager.s();
    }

    public static final /* synthetic */ void b(TabIconDisplayManager tabIconDisplayManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cd8247c", new Object[]{tabIconDisplayManager});
        } else {
            tabIconDisplayManager.u();
        }
    }

    public static final /* synthetic */ Animation[] c(TabIconDisplayManager tabIconDisplayManager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation[]) ipChange.ipc$dispatch("455ca8ea", new Object[]{tabIconDisplayManager, new Boolean(z)});
        }
        return tabIconDisplayManager.v(z);
    }

    public static final /* synthetic */ BroadcastReceiver d(TabIconDisplayManager tabIconDisplayManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BroadcastReceiver) ipChange.ipc$dispatch("77682b24", new Object[]{tabIconDisplayManager});
        }
        return tabIconDisplayManager.b;
    }

    public static final /* synthetic */ void e(TabIconDisplayManager tabIconDisplayManager, RedpointModel redpointModel, jfe jfeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e768e315", new Object[]{tabIconDisplayManager, redpointModel, jfeVar});
        } else {
            tabIconDisplayManager.A(redpointModel, jfeVar);
        }
    }

    public static final /* synthetic */ void f(TabIconDisplayManager tabIconDisplayManager, Context context, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72691a97", new Object[]{tabIconDisplayManager, context, new Integer(i2)});
        } else {
            tabIconDisplayManager.B(context, i2);
        }
    }

    public static final /* synthetic */ boolean g(TabIconDisplayManager tabIconDisplayManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d26c2601", new Object[]{tabIconDisplayManager})).booleanValue();
        }
        return tabIconDisplayManager.E();
    }

    public static final /* synthetic */ void h(TabIconDisplayManager tabIconDisplayManager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fe486ad", new Object[]{tabIconDisplayManager, new Boolean(z)});
        } else {
            tabIconDisplayManager.f9775a = z;
        }
    }

    public static final /* synthetic */ void i(TabIconDisplayManager tabIconDisplayManager, BroadcastReceiver broadcastReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("827f522e", new Object[]{tabIconDisplayManager, broadcastReceiver});
        } else {
            tabIconDisplayManager.b = broadcastReceiver;
        }
    }

    public static final /* synthetic */ void j(TabIconDisplayManager tabIconDisplayManager, ViewAnimator viewAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0e2678", new Object[]{tabIconDisplayManager, viewAnimator});
        } else {
            tabIconDisplayManager.V(viewAnimator);
        }
    }

    public final void A(RedpointModel redpointModel, jfe jfeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99cfb51e", new Object[]{this, redpointModel, jfeVar});
            return;
        }
        Pair<Boolean, Map<String, Object>> l = l();
        Object obj = l.first;
        ckf.f(obj, "result.first");
        boolean booleanValue = ((Boolean) obj).booleanValue();
        Object obj2 = l.second;
        ckf.f(obj2, "result.second");
        jfeVar.b(redpointModel, booleanValue, (Map) obj2);
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "GuangGuang_Tab_Icon", "NavigationTab setCustomIcon , display:" + ((Boolean) l.first), null, 4, null);
        Object obj3 = l.first;
        ckf.f(obj3, "result.first");
        if (((Boolean) obj3).booleanValue()) {
            try {
                N(redpointModel, this.f.getContext(), jfeVar);
            } catch (Exception e2) {
                tpu.a aVar2 = tpu.Companion;
                tpu.a.b(aVar2, "GuangGuang_Tab_Icon", "setCustomIconInNormalMode error: " + e2, null, 4, null);
            }
        }
    }

    public final void C() {
        TBFragmentTabHost o;
        NavigationTabIndicatorView tabViewAtIndex;
        TextView t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2355992e", new Object[]{this});
        } else if (((t2c) this.f.getService(t2c.class)).t().b() != 0 && (o = com.taobao.tao.navigation.a.o()) != null && (tabViewAtIndex = o.getTabViewAtIndex(1)) != null && (t = t(tabViewAtIndex, false)) != null) {
            t.setVisibility(4);
            t.setTag(R.id.turbo_engine_guangguang_text_need_resume, Boolean.TRUE);
        }
    }

    public final void D(ViewAnimator viewAnimator, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35ca9f05", new Object[]{this, viewAnimator, new Integer(i2), new Integer(i3)});
            return;
        }
        Animation[] z = z(i2, i3);
        viewAnimator.setInAnimation(z[0]);
        viewAnimator.setOutAnimation(z[1]);
        viewAnimator.setAnimateFirstView(false);
    }

    public final boolean E() {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3bc3cc02", new Object[]{this})).booleanValue();
        }
        if (com.taobao.tao.navigation.a.o() != null) {
            TBFragmentTabHost o = com.taobao.tao.navigation.a.o();
            ckf.f(o, "Navigation.getFragmentTabHost()");
            context = o.getContext();
        } else {
            context = null;
        }
        if (context != null && !((tjb) this.f.getService(tjb.class)).B0()) {
            return F();
        }
        return false;
    }

    public final boolean F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39c59a45", new Object[]{this})).booleanValue();
        }
        return TBRevisionSwitchManager.c().d(bud.KEY_NEW_CONTENT_ENABLE);
    }

    public final void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73afe151", new Object[]{this});
        } else if (this.e == null) {
            this.e = new BroadcastReceiver() { // from class: com.taobao.android.turbo.service.redpoint.tabicon.TabIconDisplayManager$registerTabIconDisplayBroadcast$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(TabIconDisplayManager$registerTabIconDisplayBroadcast$1 tabIconDisplayManager$registerTabIconDisplayBroadcast$1, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/service/redpoint/tabicon/TabIconDisplayManager$registerTabIconDisplayBroadcast$1");
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    int i2 = 0;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                        return;
                    }
                    ckf.g(context, "context");
                    ckf.g(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
                    if (ckf.b(vkg.KEY_UPDATE_GUANG_GUANG_TABICON, intent.getAction())) {
                        boolean booleanExtra = intent.getBooleanExtra("show", true);
                        TabIconDisplayManager.h(TabIconDisplayManager.this, booleanExtra);
                        TabIconDisplayManager.c a2 = TabIconDisplayManager.a(TabIconDisplayManager.this);
                        if ((a2 != null ? a2.h() : null) != null) {
                            FrameLayout h2 = a2.h();
                            ckf.d(h2);
                            if (!booleanExtra) {
                                i2 = 4;
                            }
                            h2.setVisibility(i2);
                        }
                    }
                }
            };
            IntentFilter intentFilter = new IntentFilter(vkg.KEY_UPDATE_GUANG_GUANG_TABICON);
            LocalBroadcastManager instance = LocalBroadcastManager.getInstance(spu.Companion.d());
            BroadcastReceiver broadcastReceiver = this.e;
            if (broadcastReceiver != null) {
                instance.registerReceiver(broadcastReceiver, intentFilter);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.content.BroadcastReceiver");
        }
    }

    public final boolean I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fe82551", new Object[]{this})).booleanValue();
        }
        c s = s();
        if (s == null || s.i()) {
            return false;
        }
        LTVTabIconManager.a aVar = LTVTabIconManager.Companion;
        aVar.c(true);
        J();
        aVar.c(false);
        return true;
    }

    public final void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac474db2", new Object[]{this});
            return;
        }
        ((tjb) this.f.getService(tjb.class)).u0(1);
        c s = s();
        if (s != null && s.m()) {
            s.n();
        }
        H();
    }

    public final void K() {
        NavigationTabIndicatorView tabViewAtIndex;
        TextView t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a583363", new Object[]{this});
            return;
        }
        TBFragmentTabHost o = com.taobao.tao.navigation.a.o();
        if (o != null && (tabViewAtIndex = o.getTabViewAtIndex(1)) != null && (t = t(tabViewAtIndex, true)) != null) {
            t.setVisibility(0);
            t.setTag(R.id.turbo_engine_guangguang_text_need_resume, null);
        }
    }

    public final boolean L(RedpointModel redpointModel, RedpointModel redpointModel2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a3304765", new Object[]{this, redpointModel, redpointModel2})).booleanValue();
        }
        if (!nwv.i(redpointModel.getPicUrl(), redpointModel2.getPicUrl()) || !nwv.i(redpointModel.getTop(), redpointModel2.getTop()) || !nwv.i(redpointModel.getTopRight(), redpointModel2.getTopRight())) {
            return false;
        }
        return true;
    }

    public final void N(RedpointModel redpointModel, Context context, jfe jfeVar) {
        IconParams iconParams;
        IconParams iconParams2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e6ddc6f", new Object[]{this, redpointModel, context, jfeVar});
            return;
        }
        c s = s();
        if (s == null || !s.m() || DeviceUtil.Companion.g() || !L(s.l(), redpointModel)) {
            J();
            b bVar = new b(context);
            FrameLayout frameLayout = new FrameLayout(context);
            c cVar = new c(this, redpointModel, frameLayout, jfeVar);
            R(cVar, redpointModel, context, frameLayout);
            Map<String, String> top = redpointModel.getTop();
            if (top != null) {
                iconParams = x(top);
            } else {
                iconParams = null;
            }
            if (iconParams != null) {
                S(cVar, context, iconParams, frameLayout, bVar);
            }
            Map<String, String> topRight = redpointModel.getTopRight();
            if (topRight != null) {
                iconParams2 = x(topRight);
            } else {
                iconParams2 = null;
            }
            if (iconParams2 != null) {
                P(cVar, context, iconParams2, frameLayout, bVar);
            }
            k(context, frameLayout, p(bVar.b(), bVar.a(), 80, bVar.d() - ((bVar.b() - bVar.d()) / 2), 0, 0, 0));
        }
    }

    public final void O(TUrlImageView tUrlImageView, c cVar, String str, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef70bb08", new Object[]{this, tUrlImageView, cVar, str, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
            return;
        }
        long nanoTime = System.nanoTime();
        tUrlImageView.succListener(new i(str, nanoTime, cVar, i4, i2, i3));
        tUrlImageView.failListener(new j(str, nanoTime, cVar, i5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [android.view.ViewGroup] */
    public final View P(c cVar, Context context, IconParams iconParams, ViewGroup viewGroup, b bVar) {
        FrameLayout frameLayout;
        int i2;
        int i3;
        int i4;
        FrameLayout frameLayout2;
        int i5;
        FrameLayout frameLayout3;
        TextView textView;
        int i6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("3f55376", new Object[]{this, cVar, context, iconParams, viewGroup, bVar});
        }
        FrameLayout frameLayout4 = null;
        if (iconParams != null) {
            ckf.d(context);
            FrameLayout frameLayout5 = new FrameLayout(context);
            frameLayout5.setVisibility(4);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            at4.a aVar = at4.Companion;
            layoutParams.leftMargin = (bVar.b() / 2) + at4.a.e(aVar, context, 5, false, 4, null);
            layoutParams.rightMargin = at4.a.e(aVar, context, 20, false, 4, null);
            layoutParams.topMargin = bVar.e();
            int e2 = at4.a.e(aVar, context, 20, false, 4, null);
            viewGroup.addView(frameLayout5, layoutParams);
            boolean d2 = sz3.d(iconParams.getTextList());
            if (!TextUtils.isEmpty(iconParams.getText()) || d2) {
                boolean b2 = ckf.b(reu.TRANSITION_TYPE_FADE, iconParams.getAnimation());
                ViewAnimator viewAnimator = new ViewAnimator(context);
                Animation[] v = v(b2);
                viewAnimator.setInAnimation(v[0]);
                viewAnimator.setOutAnimation(v[1]);
                if (b2) {
                    viewAnimator.setAnimateFirstView(false);
                }
                int c2 = at4.a.c(aVar, context, 8, false, 4, null);
                int c3 = at4.a.c(aVar, context, 6, false, 4, null);
                int e3 = at4.a.e(aVar, context, 10, false, 4, null);
                int c4 = at4.a.c(aVar, context, 2, false, 4, null);
                int k2 = ir2.k("#FF5001");
                if (iconParams.getTextList() != null) {
                    List<String> textList = iconParams.getTextList();
                    ckf.d(textList);
                    int size = textList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        List<String> textList2 = iconParams.getTextList();
                        ckf.d(textList2);
                        TextView o = o(context, textList2.get(i7));
                        if (b2) {
                            o.setBackgroundDrawable(n(e3, c4, k2));
                            o.setPadding(c2, c3, c2, c3);
                        }
                        if (b2) {
                            size = size;
                            c4 = c4;
                            viewAnimator.addView(o, new FrameLayout.LayoutParams(-2, -2, 3));
                            i6 = 1;
                        } else {
                            size = size;
                            c4 = c4;
                            viewAnimator.addView(o, new FrameLayout.LayoutParams(-2, -2, 17));
                            i6 = 1;
                        }
                        i7 += i6;
                    }
                }
                if (!TextUtils.isEmpty(iconParams.getText())) {
                    TextView o2 = o(context, iconParams.getText());
                    if (!TextUtils.isEmpty(iconParams.getLeftImage())) {
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(0);
                        linearLayout.setGravity(16);
                        TNodeImageView tNodeImageView = new TNodeImageView(context);
                        tNodeImageView.setImageUrl(iconParams.getLeftImage());
                        at4.a aVar2 = at4.Companion;
                        i5 = k2;
                        frameLayout3 = frameLayout5;
                        i2 = c4;
                        int c5 = at4.a.c(aVar2, context, 16, false, 4, null);
                        int c6 = at4.a.c(aVar2, context, 2, false, 4, null);
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(c5, c5);
                        layoutParams2.rightMargin = c6;
                        LinearLayout linearLayout2 = linearLayout;
                        linearLayout2.addView(tNodeImageView, layoutParams2);
                        o2 = o2;
                        linearLayout2.addView(o2);
                        textView = linearLayout2;
                    } else {
                        i5 = k2;
                        frameLayout3 = frameLayout5;
                        i2 = c4;
                        textView = o2;
                    }
                    if (!b2 || !d2) {
                        i3 = i5;
                        if (d2) {
                            o2.setText("");
                        }
                        viewAnimator.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
                        frameLayout2 = frameLayout3;
                    } else {
                        i3 = i5;
                        textView.setBackgroundDrawable(n(e3, i2, i3));
                        textView.setPadding(c2, c3, c2, c3);
                        viewAnimator.addView(textView, new FrameLayout.LayoutParams(-2, -2, 3));
                        frameLayout2 = frameLayout3;
                    }
                } else {
                    i3 = k2;
                    frameLayout2 = frameLayout5;
                    i2 = c4;
                }
                if (!b2 || !d2) {
                    viewAnimator.setBackgroundDrawable(n(e3, i2, i3));
                    viewAnimator.setPadding(c2, c3, c2, c3);
                    i4 = e2;
                    viewAnimator.setMinimumWidth(i4);
                } else {
                    i4 = e2;
                }
                cVar.sendMessage(Message.obtain(cVar, 16, new c.b(null, 0L, true)));
                frameLayout2.addView(viewAnimator, new FrameLayout.LayoutParams(-2, i4));
                frameLayout = frameLayout2;
            } else {
                if (!TextUtils.isEmpty(iconParams.getImage()) && iconParams.getImageWidth() > 0 && iconParams.getImageHeight() > 0) {
                    TUrlImageView tUrlImageView = new TUrlImageView(context);
                    int[] y = y(s6o.c(context, 60), e2, iconParams.getImageWidth(), iconParams.getImageHeight(), true);
                    tUrlImageView.setScaleType(ckf.b(nwv.I(iconParams.getContentMode(), "contain"), "contain") ? ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.CENTER_CROP);
                    O(tUrlImageView, cVar, iconParams.getImage(), y[0], y[1], 16, 32);
                    tUrlImageView.setImageUrl(iconParams.getImage());
                    frameLayout5.addView(tUrlImageView, new FrameLayout.LayoutParams(y[0], y[1]));
                }
                frameLayout = frameLayout5;
            }
            frameLayout4 = frameLayout;
        }
        cVar.w(frameLayout4);
        cVar.x(iconParams);
        if (iconParams != null) {
            Q(context, viewGroup, bVar, iconParams.getRedPoint());
        }
        return frameLayout4;
    }

    public final void Q(Context context, ViewGroup viewGroup, b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8923d925", new Object[]{this, context, viewGroup, bVar, new Boolean(z)});
        } else if (z) {
            TextView textView = new TextView(context);
            textView.setBackgroundResource(R.drawable.redpoint_dot);
            int d2 = s6o.d(context, 10);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(d2, d2);
            layoutParams.leftMargin = s6o.d(context, 11);
            layoutParams.topMargin = bVar.e() + s6o.c(context, 1);
            layoutParams.gravity = 1;
            textView.setGravity(17);
            textView.setTextColor(-1);
            textView.setTextSize(1, 12.0f);
            viewGroup.addView(textView, layoutParams);
        }
    }

    public final void T(c cVar, Context context, IconParams iconParams, FrameLayout frameLayout) {
        int i2;
        int i3;
        int i4;
        int i5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d68a2b", new Object[]{this, cVar, context, iconParams, frameLayout});
            return;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        at4.a aVar = at4.Companion;
        linearLayout.setLayoutParams(p(-2, -2, 1, 0, 0, 0, at4.a.c(aVar, context, 8, false, 4, null)));
        boolean isEmpty = TextUtils.isEmpty(iconParams.getLeftImage());
        boolean isEmpty2 = TextUtils.isEmpty(iconParams.getRightImage());
        if (!isEmpty) {
            TUrlImageView tUrlImageView = new TUrlImageView(context);
            tUrlImageView.setImageUrl(iconParams.getLeftImage());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(at4.a.c(aVar, context, 24, false, 4, null), at4.a.c(aVar, context, 24, false, 4, null));
            layoutParams.leftMargin = at4.a.c(aVar, context, 15, false, 4, null);
            layoutParams.topMargin = at4.a.c(aVar, context, 11, false, 4, null);
            linearLayout.addView(tUrlImageView, 0, layoutParams);
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (!TextUtils.isEmpty(iconParams.getText())) {
            TextView r = r(context, iconParams.getText(), Color.parseColor(iconParams.getTextColor()), at4.a.c(aVar, context, 22, false, 4, null));
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.bottomMargin = at4.a.c(aVar, context, 8, false, 4, null);
            layoutParams2.topMargin = at4.a.c(aVar, context, 8, false, 4, null);
            if (!isEmpty) {
                i3 = 9;
            } else {
                i3 = 15;
            }
            layoutParams2.leftMargin = at4.a.c(aVar, context, Integer.valueOf(i3), false, 4, null);
            int i6 = 12;
            if (isEmpty2) {
                i4 = 15;
            } else if (iconParams.getRightImageLeftGap()) {
                i4 = 12;
            } else {
                i4 = 7;
            }
            layoutParams2.rightMargin = at4.a.c(aVar, context, Integer.valueOf(i4), false, 4, null);
            if (!isEmpty) {
                i5 = 50;
            } else {
                i5 = 15;
            }
            if (!isEmpty2) {
                i6 = 31;
            }
            r.setEllipsize(TextUtils.TruncateAt.END);
            r.setMaxWidth(at4.a.c(aVar, context, Integer.valueOf((320 - i5) - i6), false, 4, null));
            r.setSingleLine();
            linearLayout.addView(r, i2, layoutParams2);
            i2 = 1 + i2;
        }
        if (!isEmpty2) {
            TNodeImageView tNodeImageView = new TNodeImageView(context);
            tNodeImageView.setImageUrl(iconParams.getRightImage());
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(at4.a.c(aVar, context, 10, false, 4, null), at4.a.c(aVar, context, 16, false, 4, null));
            layoutParams3.rightMargin = at4.a.c(aVar, context, 18, false, 4, null);
            layoutParams3.topMargin = at4.a.c(aVar, context, 17, false, 4, null);
            linearLayout.addView(tNodeImageView, i2, layoutParams3);
        }
        Drawable b2 = mx7.b(Color.parseColor(iconParams.getBgColor()), at4.a.c(aVar, context, 24, false, 4, null));
        ckf.f(b2, zk4.CONTACTS_INFO_NOT_EMPTY_STATUS);
        b2.setAlpha(179);
        linearLayout.setBackground(b2);
        frameLayout.addView(linearLayout);
        TUrlImageView tUrlImageView2 = new TUrlImageView(context);
        tUrlImageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        tUrlImageView2.setAlpha(179);
        int c2 = at4.a.c(aVar, context, 10, false, 4, null);
        O(tUrlImageView2, cVar, iconParams.getBottomImage(), c2, c2, 4, 8);
        tUrlImageView2.setImageUrl(iconParams.getBottomImage());
        frameLayout.addView(tUrlImageView2, p(c2, c2, 81, 0, 0, 0, at4.a.c(aVar, context, 2, false, 4, null)));
    }

    public final void U(Context context, FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef35589", new Object[]{this, context, frameLayout});
            return;
        }
        LottieAnimationView lottieAnimationView = new LottieAnimationView(context);
        lottieAnimationView.setAnimation("TBWeiTao.bundle/liveanimation2.json");
        lottieAnimationView.setLayoutParams(p(s6o.c(context, 53), s6o.c(context, 53), 81, 0, 0, 0, s6o.c(context, -3)));
        lottieAnimationView.playAnimation();
        lottieAnimationView.loop(true);
        frameLayout.addView(lottieAnimationView);
    }

    public final void W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("628dc418", new Object[]{this});
        } else if (this.e != null) {
            LocalBroadcastManager instance = LocalBroadcastManager.getInstance(spu.Companion.d());
            BroadcastReceiver broadcastReceiver = this.e;
            if (broadcastReceiver != null) {
                instance.unregisterReceiver(broadcastReceiver);
                this.e = null;
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.content.BroadcastReceiver");
        }
    }

    public final void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbaed911", new Object[]{this, str});
            return;
        }
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("augeTrackInfo", str);
        }
        UTOriginalCustomHitBuilder uTOriginalCustomHitBuilder = new UTOriginalCustomHitBuilder("Page_Home", 2201, "Page_Home_Show-bottomBar", "tab2_commonMark_content", null, hashMap);
        UTAnalytics instance = UTAnalytics.getInstance();
        ckf.f(instance, "UTAnalytics.getInstance()");
        instance.getDefaultTracker().send(uTOriginalCustomHitBuilder.build());
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "GuangGuang_Tab_Icon", "commonMarkAndAlienEffectExposuretab2 tab2_commonMark_content " + str, null, 4, null);
    }

    public final Drawable n(int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("94cfe104", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4)});
        }
        jfw jfwVar = new jfw();
        jfwVar.J = i2;
        jfwVar.O = i3;
        jfwVar.P = -1;
        jfwVar.E = i4;
        Drawable d2 = mx7.d(null, jfwVar);
        ckf.f(d2, "DrawableFactory.getOrUpd…rawable(null, viewParams)");
        return d2;
    }

    public final TextView o(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("66766bbc", new Object[]{this, context, str});
        }
        TextView r = r(context, str, -1, at4.a.c(at4.Companion, context, 16, false, 4, null));
        r.setGravity(17);
        r.setEllipsize(TextUtils.TruncateAt.END);
        return r;
    }

    public final FrameLayout.LayoutParams p(int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("4bb366d9", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i3);
        layoutParams.gravity = i4;
        layoutParams.leftMargin = i5;
        layoutParams.topMargin = i6;
        layoutParams.rightMargin = i7;
        layoutParams.bottomMargin = i8;
        return layoutParams;
    }

    public final TextView r(Context context, String str, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("84390af1", new Object[]{this, context, str, new Integer(i2), new Integer(i3)});
        }
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextColor(i2);
        textView.setSingleLine();
        textView.setTextSize(0, i3);
        textView.setTypeface(Typeface.defaultFromStyle(1));
        return textView;
    }

    public final c s() {
        ViewGroup viewGroup;
        View view;
        View findViewById;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("8cfabcf8", new Object[]{this});
        }
        TBFragmentTabHost o = com.taobao.tao.navigation.a.o();
        if (o != null) {
            Context context = o.getContext();
            if (context instanceof Activity) {
                try {
                    findViewById = ((Activity) context).findViewById(R.id.tb_main_fragment);
                } catch (Throwable unused) {
                    viewGroup = null;
                }
                if (findViewById != null) {
                    viewGroup = (ViewGroup) findViewById;
                    if (viewGroup != null) {
                        view = viewGroup.findViewWithTag("GuangGuang_Tab_Icon");
                    } else {
                        View findViewById2 = ((Activity) context).findViewById(16908290);
                        view = findViewById2 != null ? findViewById2.findViewWithTag("GuangGuang_Tab_Icon") : null;
                    }
                    if (view != null) {
                        Object tag = view.getTag(R.id.turbo_engine_icon_display_manager);
                        if (tag instanceof c) {
                            return (c) tag;
                        }
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                }
            }
        }
        return null;
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f976a9f", new Object[]{this});
            return;
        }
        Iterator it = ((ArrayList) this.c).iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        ((ArrayList) this.c).clear();
        this.d = true;
        zrt.Companion.b(new f());
    }

    public final Animation[] v(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation[]) ipChange.ipc$dispatch("c19cf12d", new Object[]{this, new Boolean(z)});
        }
        Animation[] animationArr = new Animation[2];
        if (z) {
            animationArr[0] = new AlphaAnimation(0.0f, 1.0f);
            animationArr[1] = new AlphaAnimation(1.0f, 0.0f);
        } else {
            animationArr[0] = new TranslateAnimation(2, 0.0f, 2, 0.0f, 2, 1.0f, 2, 0.0f);
            animationArr[1] = new TranslateAnimation(2, 0.0f, 2, 0.0f, 2, 0.0f, 2, -1.0f);
        }
        Animation animation = animationArr[0];
        ckf.d(animation);
        animation.setDuration(350L);
        Animation animation2 = animationArr[1];
        ckf.d(animation2);
        animation2.setDuration(350L);
        Animation animation3 = animationArr[0];
        ckf.d(animation3);
        animation3.setInterpolator(new DecelerateInterpolator(1.2f));
        Animation animation4 = animationArr[1];
        ckf.d(animation4);
        animation4.setInterpolator(new DecelerateInterpolator(1.2f));
        return animationArr;
    }

    public final int w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("735108b1", new Object[]{this, str})).intValue();
        }
        int hashCode = str.hashCode();
        if (hashCode != 969785) {
            if (hashCode != 1132427) {
                if (hashCode == 23780314 && str.equals("小视频")) {
                    return R.drawable.nav_minivideo_bk;
                }
            } else if (str.equals("视频")) {
                return R.drawable.nav_video_bk;
            }
        } else if (str.equals("直播")) {
            return R.drawable.nav_live_bk;
        }
        return R.drawable.nav_guang_bk;
    }

    public final IconParams x(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IconParams) ipChange.ipc$dispatch("c2453d7f", new Object[]{this, map});
        }
        try {
            return (IconParams) JSON.parseObject(JSON.toJSONString(map), IconParams.class);
        } catch (Exception unused) {
            tpu.a aVar = tpu.Companion;
            tpu.a.b(aVar, "GuangGuang_Tab_Icon", "getIconParams error: " + map, null, 4, null);
            return null;
        }
    }

    public final int[] y(int i2, int i3, int i4, int i5, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("9c9efac8", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Boolean(z)});
        }
        int[] iArr = new int[2];
        if (z) {
            iArr[1] = i3;
            iArr[0] = hfn.f((int) (((i3 * 1.0f) / i5) * i4), i2);
        } else if (i4 > i2 || i5 > i3) {
            float f2 = i4;
            float f3 = (f2 * 1.0f) / i2;
            float f4 = i5;
            float f5 = (1.0f * f4) / i3;
            if (i4 > i2) {
                if (i5 <= i3) {
                    iArr[0] = i2;
                    iArr[1] = (int) (f4 / f3);
                } else {
                    float b2 = hfn.b(f3, f5);
                    iArr[0] = hfn.f((int) (f2 / b2), i2);
                    iArr[1] = (int) (f4 / b2);
                }
            } else if (i5 > i3) {
                if (i4 <= i2) {
                    iArr[0] = hfn.f((int) (f2 / f5), i2);
                    iArr[1] = i3;
                } else {
                    float b3 = hfn.b(f3, f5);
                    iArr[0] = hfn.f((int) (f2 / b3), i2);
                    iArr[1] = (int) (f4 / b3);
                }
            }
        } else {
            iArr[0] = hfn.f(i4, i2);
            iArr[1] = i5;
        }
        return iArr;
    }

    public final Animation[] z(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation[]) ipChange.ipc$dispatch("221ff9b3", new Object[]{this, new Integer(i2), new Integer(i3)});
        }
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
        float f2 = i2 / 2;
        float f3 = i3 / 2;
        animationSet.addAnimation(new ScaleAnimation(0.5f, 1.0f, 0.5f, 1.0f, f2, f3));
        AnimationSet animationSet2 = new AnimationSet(true);
        animationSet2.addAnimation(new AlphaAnimation(1.0f, 0.0f));
        animationSet2.addAnimation(new ScaleAnimation(1.0f, 0.5f, 1.0f, 0.5f, f2, f3));
        Animation[] animationArr = {animationSet, animationSet2};
        Animation animation = animationArr[0];
        if (animation != null) {
            animation.setDuration(600L);
        }
        Animation animation2 = animationArr[1];
        if (animation2 != null) {
            animation2.setDuration(600L);
        }
        Animation animation3 = animationArr[0];
        if (animation3 != null) {
            animation3.setInterpolator(new d(1.2f));
        }
        Animation animation4 = animationArr[1];
        if (animation4 != null) {
            animation4.setInterpolator(new e(1.2f));
        }
        return animationArr;
    }

    public final void B(Context context, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e82f33ba", new Object[]{this, context, new Integer(i2)});
            return;
        }
        TUrlImageView tUrlImageView = new TUrlImageView(context);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i2, i2);
        layoutParams.setMargins(0, 0, 0, 0);
        relativeLayout.addView(tUrlImageView, layoutParams);
        com.taobao.tao.navigation.a.g0("tab2", "placeholder", relativeLayout, false);
        com.taobao.tao.navigation.a.i0("tab2", NavigationTabMsgMode.NONE, null);
        C();
    }

    public final void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52ff58b5", new Object[]{this});
            return;
        }
        c s = s();
        if (s != null) {
            FrameLayout h2 = s.h();
            if (!(h2 == null || h2.getParent() == null)) {
                ViewParent parent = h2.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeView(h2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                }
            }
            s.removeCallbacksAndMessages(null);
            s.p(true);
        }
        K();
    }

    public final void V(ViewAnimator viewAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f954e8a1", new Object[]{this, viewAnimator});
            return;
        }
        View currentView = viewAnimator.getCurrentView();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(currentView, "scaleX", 1.0f, 0.9f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(currentView, "scaleY", 1.0f, 0.9f);
        ofFloat.setDuration(1000L);
        ofFloat2.setDuration(1000L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(currentView, "scaleX", 0.9f, 1.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(currentView, "scaleY", 0.9f, 1.0f);
        ofFloat3.setDuration(1000L);
        ofFloat4.setDuration(1000L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.play(ofFloat3).with(ofFloat4).after(ofFloat);
        animatorSet.addListener(new k(viewAnimator));
        animatorSet.start();
    }

    public final Pair<Boolean, Map<String, Object>> l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("3c88462b", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (!UCPManager.e("bottomBar", "tab2", "alienEffect", "content", jSONObject, jSONObject2)) {
            return new Pair<>(Boolean.valueOf(akt.p2("weitao_switch.disable_redpoint_ltv_control_1", false)), jSONObject2);
        }
        m(jSONObject2.getString("track"));
        return new Pair<>(Boolean.TRUE, jSONObject2);
    }

    public final void M(RedpointModel redpointModel, jfe jfeVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8201a4a4", new Object[]{this, redpointModel, jfeVar});
            return;
        }
        ckf.g(redpointModel, "redpoint");
        ckf.g(jfeVar, "callback");
        boolean k2 = f82.k();
        h hVar = new h(redpointModel, jfeVar);
        if (k2 || this.d || akt.p2("executeCustomIconImmediate", false)) {
            hVar.run();
            return;
        }
        BroadcastReceiver broadcastReceiver = this.b;
        if (broadcastReceiver != null) {
            z = false;
        }
        if (broadcastReceiver == null) {
            this.b = new BroadcastReceiver() { // from class: com.taobao.android.turbo.service.redpoint.tabicon.TabIconDisplayManager$setCustomIcon$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(TabIconDisplayManager$setCustomIcon$1 tabIconDisplayManager$setCustomIcon$1, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/service/redpoint/tabicon/TabIconDisplayManager$setCustomIcon$1");
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                        return;
                    }
                    ckf.g(context, "context");
                    ckf.g(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
                    TabIconDisplayManager.b(TabIconDisplayManager.this);
                }
            };
            LocalBroadcastManager instance = LocalBroadcastManager.getInstance(this.f.getContext());
            BroadcastReceiver broadcastReceiver2 = this.b;
            if (broadcastReceiver2 != null) {
                instance.registerReceiver(broadcastReceiver2, new IntentFilter("bhx_launch_end_event"));
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.content.BroadcastReceiver");
            }
        }
        ((ArrayList) this.c).add(hVar);
        if (z) {
            zrt.Companion.d(new g(), akt.w2("executeCustomIconDelay", 300));
        }
    }

    public final void k(Context context, FrameLayout frameLayout, FrameLayout.LayoutParams layoutParams) {
        ViewGroup viewGroup;
        View findViewById;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9451a444", new Object[]{this, context, frameLayout, layoutParams});
            return;
        }
        try {
            Activity activity = (Activity) context;
            ckf.d(activity);
            findViewById = activity.findViewById(R.id.tb_main_fragment);
        } catch (Throwable unused) {
            viewGroup = null;
        }
        if (findViewById != null) {
            viewGroup = (ViewGroup) findViewById;
            if (viewGroup != null) {
                viewGroup.addView(frameLayout, layoutParams);
            } else {
                Activity activity2 = (Activity) context;
                ckf.d(activity2);
                activity2.addContentView(frameLayout, layoutParams);
            }
            frameLayout.setTag("GuangGuang_Tab_Icon");
            if (this.f9775a) {
                frameLayout.setVisibility(0);
            } else {
                frameLayout.setVisibility(4);
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
    }

    public final TextView t(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("cb280548", new Object[]{this, view, new Boolean(z)});
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                ckf.f(childAt, "view.getChildAt(i)");
                TextView t = t(childAt, z);
                if (t != null) {
                    return t;
                }
            }
        } else if (view instanceof TextView) {
            TextView textView = (TextView) view;
            CharSequence text = textView.getText();
            if (TextUtils.equals("逛逛", text) || (text != null && wsq.O(text.toString(), "视频", false, 2, null))) {
                if (z) {
                    Object tag = view.getTag(R.id.turbo_engine_guangguang_text_need_resume);
                    if (tag != null && ckf.b(tag, Boolean.TRUE)) {
                        return textView;
                    }
                } else if (view.getVisibility() == 0) {
                    return textView;
                }
            }
        }
        return null;
    }

    public final void R(c cVar, RedpointModel redpointModel, Context context, FrameLayout frameLayout) {
        ViewAnimator viewAnimator;
        int i2;
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21e7b977", new Object[]{this, cVar, redpointModel, context, frameLayout});
            return;
        }
        String picUrl = redpointModel.getPicUrl();
        String I = nwv.I(redpointModel.getFrameType(), "default");
        String I2 = nwv.I(redpointModel.getContentMode(), "contain");
        boolean b2 = ckf.b(nwv.I(redpointModel.getPicMode(), "normal"), "badge");
        boolean liveAnimation = redpointModel.getLiveAnimation();
        ViewAnimator viewAnimator2 = new ViewAnimator(context);
        if (b2) {
            int c2 = s6o.c(context, 52);
            TUrlImageView tUrlImageView = new TUrlImageView(context);
            tUrlImageView.setMinimumHeight(c2);
            tUrlImageView.setMinimumWidth(c2);
            tUrlImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            String I3 = nwv.I(redpointModel.getTabbarItemTitle(), "逛逛");
            ckf.f(I3, "title");
            tUrlImageView.setBackgroundDrawable(context.getDrawable(w(I3)));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(c2, c2);
            layoutParams.gravity = 81;
            frameLayout.addView(tUrlImageView, layoutParams);
        }
        frameLayout.addView(viewAnimator2);
        if (!TextUtils.isEmpty(picUrl)) {
            if (picUrl != null) {
                ckf.f(I2, "contentMode");
                ckf.f(I, "frameType");
                viewAnimator = viewAnimator2;
                view = q(context, picUrl, I2, I, cVar, b2);
            } else {
                viewAnimator = viewAnimator2;
                view = null;
            }
            viewAnimator.addView(view);
        } else {
            viewAnimator = viewAnimator2;
        }
        if (liveAnimation && ckf.b(I, pg1.ATOM_EXT_round) && !b2) {
            V(viewAnimator);
            U(context, frameLayout);
        }
        int i3 = 0;
        if (viewAnimator.getChildAt(0) != null) {
            View childAt = viewAnimator.getChildAt(0);
            ckf.f(childAt, "iconContainer.getChildAt(0)");
            ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
            int i4 = layoutParams2.width;
            i2 = layoutParams2.height;
            i3 = i4;
        } else {
            i2 = 0;
        }
        D(viewAnimator, i3, i2);
        cVar.t(picUrl);
        cVar.s(viewAnimator.getChildCount() > 0 ? viewAnimator : null);
        cVar.r(redpointModel.getLinkSwitch());
        cVar.q(nwv.t(Integer.valueOf(redpointModel.getLightDuration()), -1));
    }

    public final View S(c cVar, Context context, IconParams iconParams, ViewGroup viewGroup, b bVar) {
        FrameLayout frameLayout;
        ImageView.ScaleType scaleType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("806d94dc", new Object[]{this, cVar, context, iconParams, viewGroup, bVar});
        }
        if (iconParams != null) {
            ckf.d(context);
            frameLayout = new FrameLayout(context);
            frameLayout.setVisibility(4);
            int c2 = bVar.c();
            at4.a aVar = at4.Companion;
            viewGroup.addView(frameLayout, p(-2, -2, 81, 0, 0, 0, c2 - at4.a.e(aVar, context, 4, false, 4, null)));
            if (ckf.b("newtext", iconParams.getTopType())) {
                T(cVar, context, iconParams, frameLayout);
            } else if (!TextUtils.isEmpty(iconParams.getImage()) && iconParams.getImageWidth() > 0 && iconParams.getImageHeight() > 0) {
                int[] y = y(at4.a.c(aVar, context, 280, false, 4, null), at4.a.c(aVar, context, 80, false, 4, null), iconParams.getImageWidth(), iconParams.getImageHeight(), false);
                TUrlImageView tUrlImageView = new TUrlImageView(context);
                if (ckf.b(nwv.I(iconParams.getContentMode(), "contain"), "contain")) {
                    scaleType = ImageView.ScaleType.FIT_CENTER;
                } else {
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                tUrlImageView.setScaleType(scaleType);
                O(tUrlImageView, cVar, iconParams.getImage(), y[0], y[1], 4, 8);
                tUrlImageView.setImageUrl(iconParams.getImage());
                frameLayout.addView(tUrlImageView, new FrameLayout.LayoutParams(y[0], y[1]));
            }
        } else {
            frameLayout = null;
        }
        cVar.u(frameLayout);
        cVar.v(iconParams);
        return frameLayout;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final View q(Context context, String str, String str2, String str3, c cVar, boolean z) {
        ImageView.ScaleType scaleType;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("18996a79", new Object[]{this, context, str, str2, str3, cVar, new Boolean(z)});
        }
        TUrlImageView tUrlImageView = new TUrlImageView(context);
        if (ckf.b(str2, "contain")) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        } else {
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        tUrlImageView.setScaleType(scaleType);
        tUrlImageView.setVisibility(4);
        RoundRectFeature roundRectFeature = new RoundRectFeature();
        float c2 = at4.a.c(at4.Companion, context, 14, false, 4, null);
        roundRectFeature.setRadiusX(c2);
        roundRectFeature.setRadiusY(c2);
        int c3 = s6o.c(context, 52);
        int c4 = s6o.c(context, 40);
        int c5 = s6o.c(context, 4);
        switch (str3.hashCode()) {
            case -1526662271:
                if (str3.equals("roundRectangle")) {
                    tUrlImageView.addFeature(roundRectFeature);
                    i2 = c5;
                    c4 = c3;
                    c3 = c4;
                    break;
                }
                c4 = c3;
                break;
            case -575138741:
                if (str3.equals("roundSquare")) {
                    tUrlImageView.addFeature(roundRectFeature);
                    c3 = c4;
                    i2 = c5;
                    break;
                }
                c4 = c3;
                break;
            case 108704142:
                if (str3.equals(pg1.ATOM_EXT_round)) {
                    float f2 = c4 / 2;
                    roundRectFeature.setRadiusX(f2);
                    roundRectFeature.setRadiusY(f2);
                    roundRectFeature.setStrokeWidth(1.0f);
                    roundRectFeature.setStrokeColor(Color.parseColor("#33909090"));
                    roundRectFeature.setStrokeEnable(true);
                    tUrlImageView.addFeature(roundRectFeature);
                    c3 = c4;
                    i2 = c5;
                    break;
                }
                c4 = c3;
                break;
            case 1544803905:
                str3.equals("default");
                c4 = c3;
                break;
            default:
                c4 = c3;
                break;
        }
        if (z) {
            int c6 = s6o.c(context, 27);
            i2 = s6o.c(context, 19);
            c3 = c6;
            c4 = c3;
        }
        O(tUrlImageView, cVar, str, c4, c3, 1, 2);
        tUrlImageView.setImageUrl(str);
        tUrlImageView.setLayoutParams(p(c4, c3, 81, 0, 0, 0, i2));
        return tUrlImageView;
    }
}
