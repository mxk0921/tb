package com.taobao.search.musie.img;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSProps;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.widget.img.Image;
import com.taobao.media.MediaConstant;
import tb.ci9;
import tb.cxh;
import tb.dwh;
import tb.ny1;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class FilterImage extends Image {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ATTR_COLOR_FILTER = "colorFilter";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a extends ny1<FilterImage> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815792720);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/img/FilterImage$NodeHolder");
        }

        /* renamed from: e */
        public FilterImage d(MUSDKInstance mUSDKInstance, int i, MUSProps mUSProps, MUSProps mUSProps2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FilterImage) ipChange.ipc$dispatch("be4af2c2", new Object[]{this, mUSDKInstance, new Integer(i), mUSProps, mUSProps2});
            }
            FilterImage filterImage = new FilterImage(i);
            filterImage.setInstance(mUSDKInstance);
            if (mUSProps != null) {
                filterImage.updateStyles(mUSProps);
            }
            if (mUSProps2 != null) {
                filterImage.updateAttrs(mUSProps2);
            }
            return filterImage;
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
        t2o.a(815792719);
    }

    public FilterImage(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(FilterImage filterImage, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -285278287) {
            super.onMount((MUSDKInstance) objArr[0], objArr[1]);
            return null;
        } else if (hashCode == -46368733) {
            super.onRefreshAttribute((UINode) objArr[0], objArr[1], (String) objArr[2], objArr[3]);
            return null;
        } else if (hashCode == 2146603619) {
            return new Boolean(super.onUpdateAttr((UINode) objArr[0], (String) objArr[1], (MUSValue) objArr[2]));
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/musie/img/FilterImage");
        }
    }

    private void refreshColorFilter(ci9 ci9Var, Object obj) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c9eab7d", new Object[]{this, ci9Var, obj});
        } else if (ci9Var != null) {
            if (obj instanceof Integer) {
                i = ((Integer) obj).intValue();
            }
            ci9Var.G(i);
        }
    }

    @Override // com.taobao.android.weex_uikit.widget.img.Image, tb.hvu
    public Object onCreateMountContent(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c9369e6c", new Object[]{this, context});
        }
        return new ci9();
    }

    @Override // com.taobao.android.weex_uikit.widget.img.Image, tb.hvu
    public void onMount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefeffb1", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        refreshColorFilter((ci9) obj, getAttribute(ATTR_COLOR_FILTER));
        super.onMount(mUSDKInstance, obj);
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
            refreshColorFilter((ci9) obj, obj2);
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
}
