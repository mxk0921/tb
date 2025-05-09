package com.taobao.search.musie.videoscroll;

import android.text.TextUtils;
import android.view.View;
import android.widget.HorizontalScrollView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSProps;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.widget.scroller.Scroller;
import com.taobao.android.weex_uikit.widget.scroller.ScrollerRootNode;
import tb.dwh;
import tb.kxh;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MUSVideoScroll extends Scroller {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ATTR_AUTO_PLAY = "autoplay";
    private int lastScrollX;
    private VideoScrollNode scrollNode;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a extends Scroller.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815792797);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/videoscroll/MUSVideoScroll$Holder");
        }

        /* renamed from: f */
        public MUSVideoScroll e(MUSDKInstance mUSDKInstance, int i, MUSProps mUSProps, MUSProps mUSProps2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MUSVideoScroll) ipChange.ipc$dispatch("47866199", new Object[]{this, mUSDKInstance, new Integer(i), mUSProps, mUSProps2});
            }
            MUSVideoScroll mUSVideoScroll = new MUSVideoScroll(i);
            mUSVideoScroll.setInstance(mUSDKInstance);
            if (mUSProps != null) {
                mUSVideoScroll.updateStyles(mUSProps);
            }
            if (mUSProps2 != null) {
                mUSVideoScroll.updateAttrs(mUSProps2);
            }
            return mUSVideoScroll;
        }
    }

    static {
        t2o.a(815792796);
    }

    public MUSVideoScroll(int i) {
        super(i);
        this.scrollListener = new kxh(this);
    }

    public static /* synthetic */ Object ipc$super(MUSVideoScroll mUSVideoScroll, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1916285496:
                super.fireNativeEvent((String) objArr[0], (String) objArr[1]);
                return null;
            case -687415253:
                return super.getNativeState((String) objArr[0]);
            case -285278287:
                super.onMount((MUSDKInstance) objArr[0], objArr[1]);
                return null;
            case -136526582:
                super.onUnmount((MUSDKInstance) objArr[0], objArr[1]);
                return null;
            case 2146603619:
                return new Boolean(super.onUpdateAttr((UINode) objArr[0], (String) objArr[1], (MUSValue) objArr[2]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/videoscroll/MUSVideoScroll");
        }
    }

    private boolean isAutoplay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("345106b8", new Object[]{this})).booleanValue();
        }
        Object attribute = getAttribute("autoplay");
        if (attribute == null || !((Boolean) attribute).booleanValue()) {
            return false;
        }
        return true;
    }

    public int getLastScrollX() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e1597779", new Object[]{this})).intValue();
        }
        return this.lastScrollX;
    }

    @Override // com.taobao.android.weex_uikit.ui.UINode
    public String getNativeState(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d706e02b", new Object[]{this, str});
        }
        if (!TextUtils.equals(str, "videostatus") || !isAutoplay()) {
            return super.getNativeState(str);
        }
        return "play";
    }

    @Override // com.taobao.android.weex_uikit.widget.scroller.Scroller
    public ScrollerRootNode getScrollerRootNode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ScrollerRootNode) ipChange.ipc$dispatch("229d20dd", new Object[]{this, new Integer(i)});
        }
        VideoScrollNode videoScrollNode = new VideoScrollNode(i);
        this.scrollNode = videoScrollNode;
        return videoScrollNode;
    }

    public void onRealTimeScroll(View view, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931d4", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        if (!TextUtils.equals("play", super.getNativeState("videostatus"))) {
            super.fireNativeEvent("videocallback", "start");
            if (dwh.r()) {
                dwh.a("fireNativeEvent(Video.VIDEO_CALLBACK, Video.STATUS_START) to require playable status");
            }
        }
        this.lastScrollX = i;
        if (view instanceof HorizontalScrollView) {
            this.scrollNode.onHorizontalScroll(i);
        }
    }

    @Override // com.taobao.android.weex_uikit.widget.scroller.BaseScroller, tb.hvu
    public void onUnmount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7dcc50a", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        super.onUnmount(mUSDKInstance, obj);
        this.lastScrollX = 0;
    }

    @Override // com.taobao.android.weex_uikit.widget.scroller.BaseScroller, com.taobao.android.weex_uikit.ui.UINode
    public boolean onUpdateAttr(UINode uINode, String str, MUSValue mUSValue) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ff29263", new Object[]{this, uINode, str, mUSValue})).booleanValue();
        }
        if (!TextUtils.equals(str, "autoplay")) {
            return super.onUpdateAttr(uINode, str, mUSValue);
        }
        if (mUSValue != null) {
            try {
                if (mUSValue.getBoolValue()) {
                    z = true;
                }
            } catch (IllegalStateException unused) {
                setAttribute("autoplay", Boolean.FALSE);
            }
        }
        setAttribute("autoplay", Boolean.valueOf(z));
        return true;
    }

    @Override // com.taobao.android.weex_uikit.widget.scroller.BaseScroller, tb.hvu
    public void onMount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefeffb1", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        super.onMount(mUSDKInstance, obj);
        if (com.taobao.android.weex_uikit.widget.scroller.a.a(this) != 2) {
            dwh.e("only support scrollDirection:horizontal");
        }
        if (isAutoplay()) {
            mUSDKInstance.updateNativeState("videostatus", "play");
        }
    }
}
