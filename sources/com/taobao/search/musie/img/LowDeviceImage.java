package com.taobao.search.musie.img;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.MUSProps;
import com.taobao.android.weex_uikit.widget.img.Image;
import com.taobao.media.MediaConstant;
import com.taobao.search.sf.MainSearchResultActivity;
import tb.bwh;
import tb.ckf;
import tb.ny1;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class LowDeviceImage extends Image {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a extends ny1<LowDeviceImage> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815792724);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/img/LowDeviceImage$NodeHolder");
        }

        /* renamed from: e */
        public LowDeviceImage d(MUSDKInstance mUSDKInstance, int i, MUSProps mUSProps, MUSProps mUSProps2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LowDeviceImage) ipChange.ipc$dispatch("b44c7a80", new Object[]{this, mUSDKInstance, new Integer(i), mUSProps, mUSProps2});
            }
            ckf.g(mUSDKInstance, "instance");
            LowDeviceImage lowDeviceImage = new LowDeviceImage(i);
            lowDeviceImage.setInstance(mUSDKInstance);
            if (mUSProps != null) {
                lowDeviceImage.updateStyles(mUSProps);
            }
            if (mUSProps2 != null) {
                lowDeviceImage.updateAttrs(mUSProps2);
            }
            return lowDeviceImage;
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
        t2o.a(815792723);
    }

    public LowDeviceImage(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(LowDeviceImage lowDeviceImage, String str, Object... objArr) {
        if (str.hashCode() == -285278287) {
            super.onMount((MUSDKInstance) objArr[0], objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/img/LowDeviceImage");
    }

    @Override // com.taobao.android.weex_uikit.widget.img.Image, tb.hvu
    public Object onCreateMountContent(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c9369e6c", new Object[]{this, context});
        }
        return new bwh();
    }

    @Override // com.taobao.android.weex_uikit.widget.img.Image, tb.hvu
    public void onMount(MUSDKInstance mUSDKInstance, Object obj) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefeffb1", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        bwh bwhVar = null;
        if (mUSDKInstance != null) {
            context = mUSDKInstance.getUIContext();
        } else {
            context = null;
        }
        if (!(context instanceof MainSearchResultActivity)) {
            if (obj instanceof bwh) {
                bwhVar = (bwh) obj;
            }
            if (bwhVar != null) {
                bwhVar.G();
            }
        }
        super.onMount(mUSDKInstance, obj);
    }
}
