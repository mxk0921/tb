package com.taobao.weex.ui.component;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.adapter.IWXImgLoaderAdapter;
import com.taobao.weex.annotation.Component;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.Constants;
import com.taobao.weex.common.WXImageSharpen;
import com.taobao.weex.common.WXImageStrategy;
import com.taobao.weex.common.WXRuntimeException;
import com.taobao.weex.dom.WXImageQuality;
import com.taobao.weex.ui.ComponentCreator;
import com.taobao.weex.ui.action.BasicComponentData;
import com.taobao.weex.ui.view.IRenderStatus;
import com.taobao.weex.ui.view.border.BorderDrawable;
import com.taobao.weex.utils.ImageDrawable;
import com.taobao.weex.utils.ImgURIUtil;
import com.taobao.weex.utils.SingleFunctionParser;
import com.taobao.weex.utils.WXDomUtils;
import com.taobao.weex.utils.WXLogUtils;
import com.taobao.weex.utils.WXUtils;
import com.taobao.weex.utils.WXViewInnerUtils;
import com.taobao.weex.utils.WXViewToImageUtil;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.qtw;
import tb.quw;
import tb.t2o;

/* compiled from: Taobao */
@Component(lazyload = false)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class WXImage extends WXComponent<ImageView> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static SingleFunctionParser.FlatMapper<Integer> BLUR_RADIUS_MAPPER = new SingleFunctionParser.FlatMapper<Integer>() { // from class: com.taobao.weex.ui.component.WXImage.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.taobao.weex.utils.SingleFunctionParser.FlatMapper
        public Integer map(String str) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("930bd0d4", new Object[]{this, str}) : WXUtils.getInteger(str, 0);
        }
    };
    public static final String ERRORDESC = "errorDesc";
    public static final String SUCCEED = "success";
    private static final int WRITE_EXTERNAL_STORAGE_PERMISSION_REQUEST_CODE = 2;
    private boolean enablePinch;
    private boolean mAutoRecycle;
    private int mBlurRadius;
    private String mSrc;
    private String preImgUrlStr;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class Creator implements ComponentCreator {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(985661705);
            t2o.a(985661647);
        }

        @Override // com.taobao.weex.ui.ComponentCreator
        public WXComponent createInstance(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, BasicComponentData basicComponentData) throws IllegalAccessException, InvocationTargetException, InstantiationException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WXComponent) ipChange.ipc$dispatch("a264c511", new Object[]{this, wXSDKInstance, wXVContainer, basicComponentData});
            }
            return new WXImage(wXSDKInstance, wXVContainer, basicComponentData);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface Measurable {
        int getNaturalHeight();

        int getNaturalWidth();
    }

    static {
        t2o.a(985661702);
    }

    @Deprecated
    public WXImage(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, String str, boolean z, BasicComponentData basicComponentData) {
        this(wXSDKInstance, wXVContainer, basicComponentData);
    }

    public static /* synthetic */ void access$000(WXImage wXImage, ImageView imageView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16924d02", new Object[]{wXImage, imageView, str});
        } else {
            wXImage.monitorImgSize(imageView, str);
        }
    }

    public static /* synthetic */ Object ipc$super(WXImage wXImage, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1983604863:
                super.destroy();
                return null;
            case -889414749:
                super.onFinishLayout();
                return null;
            case -713828414:
                super.updateProperties((Map) objArr[0]);
                return null;
            case -631469807:
                super.refreshData((WXComponent) objArr[0]);
                return null;
            case -415570888:
                super.recycled();
                return null;
            case -39247480:
                return new Boolean(super.setProperty((String) objArr[0], objArr[1]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/ui/component/WXImage");
        }
    }

    private void monitorImgSize(ImageView imageView, String str) {
        WXSDKInstance instance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b77a8b5", new Object[]{this, imageView, str});
        } else if (imageView != null && (instance = getInstance()) != null) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            Drawable drawable = imageView.getDrawable();
            if (layoutParams != null && drawable != null) {
                int intrinsicHeight = drawable.getIntrinsicHeight();
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (!this.preImgUrlStr.equals(str)) {
                    this.preImgUrlStr = str;
                    if (intrinsicHeight > 1081 && intrinsicWidth > 721) {
                        instance.E().B(quw.KEY_PAGE_STATS_LARGE_IMG_COUNT, 1.0d);
                        IpChange ipChange2 = qtw.$ipChange;
                    }
                    long j = intrinsicHeight * intrinsicWidth;
                    long measuredHeight = imageView.getMeasuredHeight() * imageView.getMeasuredWidth();
                    if (measuredHeight != 0 && j / measuredHeight > 1.2d && j - measuredHeight > 1600) {
                        instance.c0().wrongImgSizeCount += 1.0d;
                        instance.E().B(quw.KEY_PAGE_STATS_WRONG_IMG_SIZE_COUNT, 1.0d);
                        IpChange ipChange3 = qtw.$ipChange;
                    }
                }
            }
        }
    }

    private int parseBlurRadius(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a4d470", new Object[]{this, str})).intValue();
        }
        if (str == null) {
            return 0;
        }
        try {
            List parse = new SingleFunctionParser(str, BLUR_RADIUS_MAPPER).parse(Constants.Event.BLUR);
            if (parse != null && !parse.isEmpty()) {
                return ((Integer) parse.get(0)).intValue();
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    private void setBlurRadius(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("837bbe57", new Object[]{this, str, new Integer(i)});
        } else if (getInstance() != null && i != this.mBlurRadius) {
            Uri Y0 = getInstance().Y0(Uri.parse(str), "image");
            if (!"local".equals(Y0.getScheme())) {
                setRemoteSrc(Y0, i);
            }
        }
    }

    private void setLocalSrc(Uri uri) {
        ImageView hostView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89738185", new Object[]{this, uri});
            return;
        }
        Drawable drawableFromLoaclSrc = ImgURIUtil.getDrawableFromLoaclSrc(getContext(), uri);
        if (drawableFromLoaclSrc != null && (hostView = getHostView()) != null) {
            hostView.setImageDrawable(drawableFromLoaclSrc);
        }
    }

    private void setPinch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9875fcb5", new Object[]{this, new Boolean(z)});
            return;
        }
        this.enablePinch = z;
        if (getHostView() instanceof IWXImageView) {
            ((IWXImageView) getHostView()).setPinch(z);
        }
    }

    private void updateBorderRadius() {
        float[] fArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2772c4e", new Object[]{this});
        } else if (getHostView() instanceof IWXImageView) {
            IWXImageView iWXImageView = (IWXImageView) getHostView();
            BorderDrawable borderDrawable = WXViewInnerUtils.getBorderDrawable(getHostView());
            if (borderDrawable != null) {
                fArr = borderDrawable.getBorderInnerRadius(new RectF(0.0f, 0.0f, WXDomUtils.getContentWidth(this), WXDomUtils.getContentHeight(this)));
            } else {
                fArr = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
            }
            iWXImageView.setBorderRadius(fArr);
            ImageView imageView = (ImageView) iWXImageView;
            if (imageView.getDrawable() instanceof ImageDrawable) {
                ImageDrawable imageDrawable = (ImageDrawable) imageView.getDrawable();
                if (!Arrays.equals(imageDrawable.getCornerRadii(), fArr)) {
                    imageDrawable.setCornerRadii(fArr);
                }
            }
        }
    }

    public void autoRecoverImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9caaaf2d", new Object[]{this});
        } else if (this.mAutoRecycle) {
            setSrc(this.mSrc);
        }
    }

    public void autoReleaseImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("578cfbea", new Object[]{this});
        } else if (this.mAutoRecycle && getHostView() != null && getInstance().L() != null) {
            getInstance().L().setImage(null, (ImageView) this.mHost, null, null);
        }
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        if ((getHostView() instanceof IWXImageView) && getInstance().L() != null) {
            getInstance().L().setImage(null, (ImageView) this.mHost, null, null);
        }
        super.destroy();
    }

    public WXImageQuality getImageQuality() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WXImageQuality) ipChange.ipc$dispatch("87c9c717", new Object[]{this});
        }
        return getAttrs().getImageQuality();
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void onFinishLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cafc9ba3", new Object[]{this});
            return;
        }
        super.onFinishLayout();
        updateBorderRadius();
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void recycled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e73ae438", new Object[]{this});
            return;
        }
        super.recycled();
        if (getInstance().L() != null) {
            getInstance().L().setImage(null, (ImageView) this.mHost, null, null);
        } else if (!WXEnvironment.isApkDebugable()) {
            WXLogUtils.e("Error getImgLoaderAdapter() == null");
        } else {
            throw new WXRuntimeException("getImgLoaderAdapter() == null");
        }
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void refreshData(WXComponent wXComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da5c8911", new Object[]{this, wXComponent});
            return;
        }
        super.refreshData(wXComponent);
        if (wXComponent instanceof WXImage) {
            setSrc(wXComponent.getAttrs().getImageSrc());
        }
    }

    @WXComponentProp(name = Constants.Name.RESIZE)
    public void setResize(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("626fe1c7", new Object[]{this, str});
        } else {
            setResizeMode(str);
        }
    }

    @WXComponentProp(name = Constants.Name.RESIZE_MODE)
    public void setResizeMode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("423a004a", new Object[]{this, str});
            return;
        }
        getHostView().setScaleType(getResizeMode(str));
        getHostView().setImageDrawable(getHostView().getDrawable());
    }

    @WXComponentProp(name = "src")
    public void setSrc(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dbfab33", new Object[]{this, str});
        } else if (str != null) {
            ImageView hostView = getHostView();
            if (!"".equals(str) || hostView == null) {
                if (!(hostView == null || hostView.getDrawable() == null || TextUtils.equals(this.mSrc, str))) {
                    hostView.setImageDrawable(null);
                }
                this.mSrc = str;
                Uri Y0 = getInstance().Y0(Uri.parse(str), "image");
                if ("local".equals(Y0.getScheme())) {
                    setLocalSrc(Y0);
                } else {
                    setRemoteSrc(Y0, parseBlurRadius(getStyles().getBlur()));
                }
            } else {
                hostView.setImageDrawable(null);
            }
        }
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void updateProperties(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d573d7c2", new Object[]{this, map});
            return;
        }
        super.updateProperties(map);
        updateBorderRadius();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class MyImageListener implements WXImageStrategy.ImageListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private String rewritedStr;
        private WeakReference<WXImage> wxImageWeakReference;

        static {
            t2o.a(985661707);
            t2o.a(985661573);
        }

        public MyImageListener(WXImage wXImage, String str) {
            this.wxImageWeakReference = new WeakReference<>(wXImage);
            this.rewritedStr = str;
        }

        @Override // com.taobao.weex.common.WXImageStrategy.ImageListener
        public void onImageFinish(String str, ImageView imageView, boolean z, Map map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("26c6f5ab", new Object[]{this, str, imageView, new Boolean(z), map});
                return;
            }
            WXImage wXImage = this.wxImageWeakReference.get();
            if (wXImage != null) {
                if (wXImage.getEvents().contains("load")) {
                    HashMap hashMap = new HashMap();
                    HashMap hashMap2 = new HashMap(2);
                    if (imageView == null || !(imageView instanceof Measurable)) {
                        hashMap2.put("naturalWidth", 0);
                        hashMap2.put("naturalHeight", 0);
                    } else {
                        Measurable measurable = (Measurable) imageView;
                        hashMap2.put("naturalWidth", Integer.valueOf(measurable.getNaturalWidth()));
                        hashMap2.put("naturalHeight", Integer.valueOf(measurable.getNaturalHeight()));
                    }
                    if (wXImage.containsEvent("load")) {
                        hashMap.put("success", Boolean.valueOf(z));
                        hashMap.put("size", hashMap2);
                        wXImage.fireEvent("load", hashMap);
                    }
                }
                WXImage.access$000(wXImage, imageView, this.rewritedStr);
            }
        }
    }

    public WXImage(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, BasicComponentData basicComponentData) {
        super(wXSDKInstance, wXVContainer, basicComponentData);
        this.mAutoRecycle = true;
        this.enablePinch = false;
        this.preImgUrlStr = "";
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public ImageView initComponentHostView(Context context) {
        try {
            ImageView imageView = (ImageView) Class.forName("com.taobao.weex.ui.view.WXImageView").getConstructor(Context.class).newInstance(context);
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setCropToPadding(true);
            ((IRenderStatus) imageView).holdComponent(this);
            return imageView;
        } catch (Throwable th) {
            WXLogUtils.e("weex1", th);
            return null;
        }
    }

    private void setRemoteSrc(Uri uri, int i) {
        String str;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a87b63df", new Object[]{this, uri, new Integer(i)});
            return;
        }
        WXImageStrategy wXImageStrategy = new WXImageStrategy(getInstanceId());
        wXImageStrategy.isClipping = true;
        if (getAttrs().getImageSharpen() != WXImageSharpen.SHARPEN) {
            z = false;
        }
        wXImageStrategy.isSharpen = z;
        wXImageStrategy.blurRadius = Math.max(0, i);
        this.mBlurRadius = i;
        String uri2 = uri.toString();
        wXImageStrategy.setImageListener(new MyImageListener(this, uri2));
        if (getAttrs().containsKey("placeholder")) {
            str = (String) getAttrs().get("placeholder");
        } else {
            str = getAttrs().containsKey(Constants.Name.PLACE_HOLDER) ? (String) getAttrs().get(Constants.Name.PLACE_HOLDER) : null;
        }
        if (str != null) {
            wXImageStrategy.placeHolder = getInstance().Y0(Uri.parse(str), "image").toString();
        }
        wXImageStrategy.instanceId = getInstanceId();
        IWXImgLoaderAdapter L = getInstance().L();
        if (L != null) {
            L.setImage(uri2, getHostView(), getImageQuality(), wXImageStrategy);
        }
    }

    @JSMethod(uiThread = false)
    public void save(final JSCallback jSCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6552284", new Object[]{this, jSCallback});
            return;
        }
        if (Build.VERSION.SDK_INT < 33) {
            if (ContextCompat.checkSelfPermission(getContext(), "android.permission.WRITE_EXTERNAL_STORAGE") != 0 && (getContext() instanceof Activity)) {
                ActivityCompat.requestPermissions((Activity) getContext(), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 2);
            }
            if (ContextCompat.checkSelfPermission(getContext(), "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                if (jSCallback != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("success", Boolean.FALSE);
                    hashMap.put(ERRORDESC, "Permission denied: android.permission.WRITE_EXTERNAL_STORAGE");
                    jSCallback.invoke(hashMap);
                    return;
                }
                return;
            }
        }
        if (this.mHost != 0) {
            String str = this.mSrc;
            if (str != null && !str.equals("")) {
                WXViewToImageUtil.generateImage(this.mHost, 0, -460552, new WXViewToImageUtil.OnImageSavedCallback() { // from class: com.taobao.weex.ui.component.WXImage.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.weex.utils.WXViewToImageUtil.OnImageSavedCallback
                    public void onSaveFailed(String str2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("99a9112a", new Object[]{this, str2});
                        } else if (jSCallback != null) {
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("success", Boolean.FALSE);
                            hashMap2.put(WXImage.ERRORDESC, str2);
                            jSCallback.invoke(hashMap2);
                        }
                    }

                    @Override // com.taobao.weex.utils.WXViewToImageUtil.OnImageSavedCallback
                    public void onSaveSucceed(String str2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("e60280b7", new Object[]{this, str2});
                        } else if (jSCallback != null) {
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("success", Boolean.TRUE);
                            jSCallback.invoke(hashMap2);
                        }
                    }
                });
            } else if (jSCallback != null) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("success", Boolean.FALSE);
                hashMap2.put(ERRORDESC, "Image does not have the correct src");
                jSCallback.invoke(hashMap2);
            }
        } else if (jSCallback != null) {
            HashMap hashMap3 = new HashMap();
            hashMap3.put("success", Boolean.FALSE);
            hashMap3.put(ERRORDESC, "Image component not initialized");
            jSCallback.invoke(hashMap3);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
        if (r7.equals("cover") == false) goto L_0x002c;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.widget.ImageView.ScaleType getResizeMode(java.lang.String r7) {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.weex.ui.component.WXImage.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0018
            java.lang.String r4 = "43237972"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r6
            r2[r0] = r7
            java.lang.Object r7 = r3.ipc$dispatch(r4, r2)
            android.widget.ImageView$ScaleType r7 = (android.widget.ImageView.ScaleType) r7
            return r7
        L_0x0018:
            android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.FIT_XY
            boolean r4 = android.text.TextUtils.isEmpty(r7)
            if (r4 == 0) goto L_0x0021
            return r3
        L_0x0021:
            r7.hashCode()
            r4 = -1
            int r5 = r7.hashCode()
            switch(r5) {
                case -1881872635: goto L_0x0042;
                case 94852023: goto L_0x0039;
                case 951526612: goto L_0x002e;
                default: goto L_0x002c;
            }
        L_0x002c:
            r0 = -1
            goto L_0x004d
        L_0x002e:
            java.lang.String r0 = "contain"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x0037
            goto L_0x002c
        L_0x0037:
            r0 = 2
            goto L_0x004d
        L_0x0039:
            java.lang.String r1 = "cover"
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L_0x004d
            goto L_0x002c
        L_0x0042:
            java.lang.String r0 = "stretch"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x004c
            goto L_0x002c
        L_0x004c:
            r0 = 0
        L_0x004d:
            switch(r0) {
                case 0: goto L_0x0056;
                case 1: goto L_0x0054;
                case 2: goto L_0x0051;
                default: goto L_0x0050;
            }
        L_0x0050:
            goto L_0x0056
        L_0x0051:
            android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.FIT_CENTER
            goto L_0x0056
        L_0x0054:
            android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.CENTER_CROP
        L_0x0056:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.weex.ui.component.WXImage.getResizeMode(java.lang.String):android.widget.ImageView$ScaleType");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
        if (r8.equals("filter") == false) goto L_0x002b;
     */
    @Override // com.taobao.weex.ui.component.WXComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean setProperty(java.lang.String r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.weex.ui.component.WXImage.setProperty(java.lang.String, java.lang.Object):boolean");
    }
}
