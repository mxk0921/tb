package com.taobao.search.musie.lazyscroll;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.widget.scroller.Scroller;
import tb.a07;
import tb.ckf;
import tb.o4p;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class TbLazyScroller extends Scroller {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ATTR_LAZY_LOAD = "lazyLoad";
    public static final a Companion = new a(null);
    private final boolean lazyScroll = o4p.c1();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(815792733);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(815792732);
    }

    public TbLazyScroller(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(TbLazyScroller tbLazyScroller, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -285278287) {
            super.onMount((MUSDKInstance) objArr[0], objArr[1]);
            return null;
        } else if (hashCode == 2146603619) {
            return new Boolean(super.onUpdateAttr((UINode) objArr[0], (String) objArr[1], (MUSValue) objArr[2]));
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/musie/lazyscroll/TbLazyScroller");
        }
    }

    @Override // com.taobao.android.weex_uikit.widget.scroller.BaseScroller, com.taobao.android.weex_uikit.ui.UINode
    public boolean onUpdateAttr(UINode uINode, String str, MUSValue mUSValue) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ff29263", new Object[]{this, uINode, str, mUSValue})).booleanValue();
        }
        if (!ckf.b(str, ATTR_LAZY_LOAD)) {
            return super.onUpdateAttr(uINode, str, mUSValue);
        }
        if (MUSValue.isNill(mUSValue)) {
            obj = "false";
        } else if (mUSValue != null) {
            obj = mUSValue.getValue();
        } else {
            obj = null;
        }
        setAttribute(ATTR_LAZY_LOAD, obj);
        return true;
    }

    @Override // com.taobao.android.weex_uikit.widget.scroller.BaseScroller, tb.hvu
    public void onMount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefeffb1", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        if (mUSDKInstance != null) {
            Object attribute = getAttribute(ATTR_LAZY_LOAD);
            if (!ckf.b(getAttribute("scrollDirection"), "horizontal") || !this.lazyScroll || !ckf.b(attribute, Boolean.TRUE)) {
                this.nodeTree.j(mUSDKInstance.isIncremental());
                this.nodeTree.d(mUSDKInstance.isPreciseExpose());
            } else {
                this.nodeTree.j(true);
                this.nodeTree.d(true);
            }
        }
        super.onMount(mUSDKInstance, obj);
    }
}
