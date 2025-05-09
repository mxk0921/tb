package com.taobao.search.musie.img;

import android.content.Context;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.ui.MUSNodeProp;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeType;
import com.taobao.uikit.extend.feature.features.PhenixOptions;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.ckf;
import tb.o4p;
import tb.pg1;
import tb.t2o;
import tb.yf2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class BlurImage extends UINode {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792717);
    }

    public BlurImage(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(BlurImage blurImage, String str, Object... objArr) {
        if (str.hashCode() == -285278287) {
            super.onMount((MUSDKInstance) objArr[0], objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/img/BlurImage");
    }

    private final void updateObjectFit() {
        ImageView.ScaleType scaleType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa728590", new Object[]{this});
            return;
        }
        String str = (String) getAttribute("objectFit");
        TUrlImageView tUrlImageView = (TUrlImageView) getMountContent();
        if (str == null) {
            scaleType = ImageView.ScaleType.FIT_XY;
        } else {
            int hashCode = str.hashCode();
            if (hashCode == 3143043) {
                if (str.equals(pg1.ATOM_EXT_fill)) {
                    scaleType = ImageView.ScaleType.FIT_XY;
                }
                scaleType = ImageView.ScaleType.FIT_XY;
            } else if (hashCode != 94852023) {
                if (hashCode == 951526612 && str.equals("contain")) {
                    scaleType = ImageView.ScaleType.FIT_CENTER;
                }
                scaleType = ImageView.ScaleType.FIT_XY;
            } else {
                if (str.equals("cover")) {
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                scaleType = ImageView.ScaleType.FIT_XY;
            }
        }
        tUrlImageView.setScaleType(scaleType);
    }

    @Override // tb.hvu
    public UINodeType getNodeType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UINodeType) ipChange.ipc$dispatch("a8f3a2f7", new Object[]{this});
        }
        return UINodeType.VIEW;
    }

    @Override // tb.hvu
    public Object onCreateMountContent(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c9369e6c", new Object[]{this, context});
        }
        return new TUrlImageView(context);
    }

    @Override // tb.hvu
    public void onMount(MUSDKInstance mUSDKInstance, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefeffb1", new Object[]{this, mUSDKInstance, obj});
            return;
        }
        super.onMount(mUSDKInstance, obj);
        updateSrc();
        updateObjectFit();
    }

    @MUSNodeProp(name = "objectFit", refresh = true)
    public final void refreshObjectFit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa3e4f08", new Object[]{this, str});
        } else {
            updateObjectFit();
        }
    }

    @MUSNodeProp(name = "src", refresh = true)
    public final void refreshSrc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae43deda", new Object[]{this, str});
        } else {
            updateSrc();
        }
    }

    @MUSNodeProp(name = "objectFit")
    public final void setObjectFit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cbbb4a1", new Object[]{this, str});
        } else {
            setAttribute("objectFit", str);
        }
    }

    @MUSNodeProp(name = "src")
    public final void setSrc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dbfab33", new Object[]{this, str});
        } else {
            setAttribute("src", str);
        }
    }

    private final void updateSrc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32534b62", new Object[]{this});
            return;
        }
        PhenixOptions phenixOptions = new PhenixOptions();
        MUSDKInstance instance = getInstance();
        ckf.d(instance);
        ((TUrlImageView) getMountContent()).setImageUrl((String) getAttribute("src"), phenixOptions.bitmapProcessors(new yf2(instance.getUIContext(), o4p.k())));
    }
}
