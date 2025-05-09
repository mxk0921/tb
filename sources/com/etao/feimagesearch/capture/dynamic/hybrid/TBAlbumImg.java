package com.etao.feimagesearch.capture.dynamic.hybrid;

import android.content.Context;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.ui.MUSNodeProp;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.ui.UINodeType;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.a07;
import tb.ckf;
import tb.lg4;
import tb.pg1;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class TBAlbumImg extends UINode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ATTR_IMG_KEY = "imgKey";
    public static final String ATTR_IMG_ROTATION = "imgRotation";
    public static final String ATTR_OBJECT_FIT = "objectFit";
    public static final String BACK_SCHEMA = "asset://back";
    public static final String CAPTURE_SCHEMA = "asset://capture";
    public static final a Companion = new a(null);
    public static final String NODE_NAME = "tb-album-img";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        static {
            t2o.a(481296646);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(481296645);
    }

    public TBAlbumImg(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(TBAlbumImg tBAlbumImg, String str, Object... objArr) {
        if (str.hashCode() == -285278287) {
            super.onMount((MUSDKInstance) objArr[0], objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/hybrid/TBAlbumImg");
    }

    private final void updateImgKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e397cc", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = (TUrlImageView) getMountContent();
        String str = (String) getAttribute(ATTR_IMG_KEY);
        if (ckf.b(str, BACK_SCHEMA)) {
            if (lg4.S()) {
                tUrlImageView.setImageResource(R.drawable.feis_ic_close);
            } else {
                tUrlImageView.setImageResource(R.drawable.feis_ic_back);
            }
        } else if (ckf.b(str, CAPTURE_SCHEMA)) {
            tUrlImageView.setImageResource(R.drawable.feis_ic_take);
        } else {
            tUrlImageView.setImageUrl(str);
        }
    }

    private final void updateImgRotation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a511b85f", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = (TUrlImageView) getMountContent();
        Float f = (Float) getAttribute(ATTR_IMG_ROTATION);
        tUrlImageView.setRotation(f == null ? 0.0f : f.floatValue());
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
        updateImgKey();
        updateImgRotation();
        updateObjectFit();
    }

    @MUSNodeProp(name = ATTR_IMG_ROTATION, refresh = true)
    public final void refreshImgKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9fc51a8", new Object[]{this, str});
        } else {
            updateImgKey();
        }
    }

    @MUSNodeProp(name = ATTR_IMG_ROTATION, refresh = true)
    public final void refreshImgRotation(Float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b075476c", new Object[]{this, f});
        } else {
            updateImgRotation();
        }
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

    @MUSNodeProp(name = ATTR_IMG_KEY)
    public final void setImgKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41857aaf", new Object[]{this, str});
        } else {
            setAttribute(ATTR_IMG_KEY, str);
        }
    }

    @MUSNodeProp(name = ATTR_IMG_ROTATION)
    public final void setImgRotation(Float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5da494f3", new Object[]{this, f});
        } else {
            setAttribute(ATTR_IMG_ROTATION, f);
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
}
