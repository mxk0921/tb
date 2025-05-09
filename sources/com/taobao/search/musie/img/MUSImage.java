package com.taobao.search.musie.img;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSProps;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeType;
import com.taobao.android.weex_uikit.widget.img.Image;
import com.taobao.android.weex_uikit.widget.img.UIImageDrawable;
import com.taobao.media.MediaConstant;
import com.taobao.search.sf.MainSearchResultActivity;
import tb.bwh;
import tb.cxh;
import tb.dwh;
import tb.ny1;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class MUSImage extends Image {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ATTR_COLOR_FILTER = "colorFilter";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a extends ny1<MUSImage> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815792726);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/img/MUSImage$NodeHolder");
        }

        /* renamed from: e */
        public MUSImage d(MUSDKInstance mUSDKInstance, int i, MUSProps mUSProps, MUSProps mUSProps2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MUSImage) ipChange.ipc$dispatch("12c59341", new Object[]{this, mUSDKInstance, new Integer(i), mUSProps, mUSProps2});
            }
            MUSImage mUSImage = new MUSImage(i);
            mUSImage.setInstance(mUSDKInstance);
            if (mUSProps != null) {
                mUSImage.updateStyles(mUSProps);
            }
            if (mUSProps2 != null) {
                mUSImage.updateAttrs(mUSProps2);
            }
            return mUSImage;
        }

        @Override // tb.vtf
        public String getMethods() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("615a6cfd", new Object[]{this});
            }
            return MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264;
        }
    }

    static {
        t2o.a(815792725);
    }

    public MUSImage(int i) {
        super(i);
    }

    private UIImageDrawable getImageDrawable(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UIImageDrawable) ipChange.ipc$dispatch("b93ca279", new Object[]{this, obj});
        }
        return ((MUSImageView) obj).getInnerDrawable();
    }

    public static /* synthetic */ Object ipc$super(MUSImage mUSImage, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -931021983:
                super.refreshPlaceHolder((UINode) objArr[0], objArr[1], objArr[2]);
                return null;
            case -842234123:
                super.refreshQuality((UINode) objArr[0], objArr[1], objArr[2]);
                return null;
            case -285278287:
                super.onMount((MUSDKInstance) objArr[0], objArr[1]);
                return null;
            case -136526582:
                super.onUnmount((MUSDKInstance) objArr[0], objArr[1]);
                return null;
            case -46368733:
                super.onRefreshAttribute((UINode) objArr[0], objArr[1], (String) objArr[2], objArr[3]);
                return null;
            case 1039347248:
                super.refreshSrc((UINode) objArr[0], objArr[1], objArr[2]);
                return null;
            case 1524595979:
                super.refreshAlt((UINode) objArr[0], objArr[1], objArr[2]);
                return null;
            case 1801537858:
                super.refreshObjectFit((UINode) objArr[0], objArr[1], objArr[2]);
                return null;
            case 2146603619:
                return new Boolean(super.onUpdateAttr((UINode) objArr[0], (String) objArr[1], (MUSValue) objArr[2]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/img/MUSImage");
        }
    }

    private void refreshColorFilter(MUSImageView mUSImageView, Object obj) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4c6df35", new Object[]{this, mUSImageView, obj});
        } else if (mUSImageView != null) {
            if (obj instanceof Integer) {
                i = ((Integer) obj).intValue();
            }
            mUSImageView.setFilterColor(i);
        }
    }

    @Override // com.taobao.android.weex_uikit.widget.img.Image, tb.hvu
    public UINodeType getNodeType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UINodeType) ipChange.ipc$dispatch("a8f3a2f7", new Object[]{this});
        }
        return UINodeType.VIEW;
    }

    @Override // com.taobao.android.weex_uikit.widget.img.Image, tb.hvu
    public Object onCreateMountContent(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c9369e6c", new Object[]{this, context});
        }
        return new MUSImageView(context);
    }

    @Override // com.taobao.android.weex_uikit.widget.img.Image, tb.hvu
    public void onMount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefeffb1", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        refreshColorFilter((MUSImageView) obj, getAttribute(ATTR_COLOR_FILTER));
        bwh bwhVar = (bwh) getImageDrawable(obj);
        if (!(mUSDKInstance.getUIContext() instanceof MainSearchResultActivity)) {
            bwhVar.G();
        }
        super.onMount(mUSDKInstance, bwhVar);
    }

    @Override // com.taobao.android.weex_uikit.widget.img.Image, com.taobao.android.weex_uikit.ui.UINode
    public void onRefreshAttribute(UINode uINode, Object obj, String str, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd3c7823", new Object[]{this, uINode, obj, str, obj2});
            return;
        }
        super.onRefreshAttribute(uINode, obj, str, obj2);
        if (TextUtils.equals(str, ATTR_COLOR_FILTER)) {
            refreshColorFilter((MUSImageView) obj, obj2);
        }
    }

    @Override // com.taobao.android.weex_uikit.widget.img.Image, tb.hvu
    public void onUnmount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7dcc50a", new Object[]{this, mUSDKInstance, obj});
        } else {
            super.onUnmount(mUSDKInstance, getImageDrawable(obj));
        }
    }

    @Override // com.taobao.android.weex_uikit.widget.img.Image, com.taobao.android.weex_uikit.ui.UINode
    public boolean onUpdateAttr(UINode uINode, String str, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ff29263", new Object[]{this, uINode, str, mUSValue})).booleanValue();
        }
        if (super.onUpdateAttr(uINode, str, mUSValue)) {
            return true;
        }
        if (!TextUtils.equals(str, ATTR_COLOR_FILTER)) {
            return false;
        }
        String stringValue = mUSValue.getStringValue();
        if (TextUtils.isEmpty(stringValue)) {
            setAttribute(ATTR_COLOR_FILTER, null);
            return true;
        }
        try {
            uINode.setAttribute(ATTR_COLOR_FILTER, Integer.valueOf(cxh.c(stringValue)));
        } catch (Exception unused) {
            dwh.e("colorFilter value is invalid " + stringValue);
            uINode.setAttribute(ATTR_COLOR_FILTER, null);
        }
        return true;
    }

    @Override // com.taobao.android.weex_uikit.widget.img.Image
    public void refreshAlt(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5adf7d0b", new Object[]{this, uINode, obj, obj2});
        } else {
            super.refreshAlt(uINode, getImageDrawable(obj), obj2);
        }
    }

    @Override // com.taobao.android.weex_uikit.widget.img.Image
    public void refreshObjectFit(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b614942", new Object[]{this, uINode, obj, obj2});
        } else {
            super.refreshObjectFit(uINode, getImageDrawable(obj), obj2);
        }
    }

    @Override // com.taobao.android.weex_uikit.widget.img.Image
    public void refreshPlaceHolder(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c881bb61", new Object[]{this, uINode, obj, obj2});
        } else {
            super.refreshPlaceHolder(uINode, getImageDrawable(obj), obj2);
        }
    }

    @Override // com.taobao.android.weex_uikit.widget.img.Image
    public void refreshQuality(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdcc86f5", new Object[]{this, uINode, obj, obj2});
        } else {
            super.refreshQuality(uINode, getImageDrawable(obj), obj2);
        }
    }

    @Override // com.taobao.android.weex_uikit.widget.img.Image
    public void refreshSrc(UINode uINode, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3df32e30", new Object[]{this, uINode, obj, obj2});
        } else {
            super.refreshSrc(uINode, getImageDrawable(obj), obj2);
        }
    }
}
