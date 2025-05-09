package com.taobao.android.interactive_common.component;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.interactive_common.model.CXImgModel;
import com.taobao.android.interactive_common.view.PageViewItemLayout;
import com.taobao.android.interactive_common.view.photoview.PhotoView;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.common.Constants;
import com.taobao.weex.dom.WXAttr;
import com.taobao.weex.ui.action.BasicComponentData;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.component.WXVContainer;
import java.util.Map;
import tb.kq9;
import tb.ztk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class CXPhotoViewComponent extends WXComponent<FrameLayout> implements PageViewItemLayout.d, ztk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String RESIZE_CONTAIN = "contain";
    private static final String RESIZE_COVER = "cover";
    private static final String RESIZE_STRETCH = "stretch";
    private static final float SCALE_MAX = 1.05f;
    private static final float SCALE_MIN = 0.95f;
    private boolean isScaleChange = false;
    private CXImgModel mImgModel;
    private PhotoView mPhotoView;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                CXPhotoViewComponent.this.fireEvent("singleTap");
            }
        }
    }

    public CXPhotoViewComponent(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, BasicComponentData basicComponentData) {
        super(wXSDKInstance, wXVContainer, basicComponentData);
        constructorFlowStatisticsTrack();
        initComponentData(basicComponentData);
    }

    private void constructorFlowStatisticsTrack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f713107", new Object[]{this});
        } else {
            kq9.b("CXPhotoViewComponent_constructor", null);
        }
    }

    private void initComponentData(BasicComponentData basicComponentData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd331bbb", new Object[]{this, basicComponentData});
        } else if (basicComponentData != null) {
            WXAttr attrs = basicComponentData.getAttrs();
            CXImgModel cXImgModel = new CXImgModel();
            this.mImgModel = cXImgModel;
            cXImgModel.imgUrl = (String) attrs.get("src");
            this.mImgModel.resize = (String) attrs.get(Constants.Name.RESIZE);
            this.mImgModel.waterMarkText = (String) attrs.get("waterMarkText");
            this.mImgModel.waterMarkIconUrl = (String) attrs.get("waterMarkIconUrl");
        }
    }

    public static /* synthetic */ Object ipc$super(CXPhotoViewComponent cXPhotoViewComponent, String str, Object... objArr) {
        if (str.hashCode() == -134451675) {
            super.updateAttrs((Map) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/interactive_common/component/CXPhotoViewComponent");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void setScrollEnabled(java.lang.Object r5) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.interactive_common.component.CXPhotoViewComponent.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "128c4d95"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r3 = 1
            r2[r3] = r5
            r0.ipc$dispatch(r1, r2)
            return
        L_0x0015:
            java.lang.String r0 = "true"
            boolean r0 = r0.equals(r5)     // Catch: Exception -> 0x0027
            if (r0 != 0) goto L_0x0029
            java.lang.String r0 = "false"
            boolean r0 = r0.equals(r5)     // Catch: Exception -> 0x0027
            if (r0 == 0) goto L_0x0037
            goto L_0x0029
        L_0x0027:
            r5 = move-exception
            goto L_0x0034
        L_0x0029:
            com.taobao.android.interactive_common.model.CXImgModel r0 = r4.mImgModel     // Catch: Exception -> 0x0027
            java.lang.String r5 = (java.lang.String) r5     // Catch: Exception -> 0x0027
            boolean r5 = java.lang.Boolean.parseBoolean(r5)     // Catch: Exception -> 0x0027
            r0.scrollEnabled = r5     // Catch: Exception -> 0x0027
            goto L_0x0037
        L_0x0034:
            r5.printStackTrace()
        L_0x0037:
            com.taobao.android.interactive_common.view.photoview.PhotoView r5 = r4.mPhotoView
            if (r5 == 0) goto L_0x0042
            com.taobao.android.interactive_common.model.CXImgModel r0 = r4.mImgModel
            boolean r0 = r0.scrollEnabled
            r5.setZoomable(r0)
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.interactive_common.component.CXPhotoViewComponent.setScrollEnabled(java.lang.Object):void");
    }

    @Override // com.taobao.android.interactive_common.view.PageViewItemLayout.d
    public void onLoad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1309896c", new Object[]{this});
        } else {
            fireEvent("load");
        }
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void updateAttrs(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7fc6e25", new Object[]{this, map});
            return;
        }
        super.updateAttrs(map);
        setScrollEnabled(map.get("scrollEnabled"));
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public FrameLayout initComponentHostView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("2b290a72", new Object[]{this, context});
        }
        if (context instanceof Activity) {
            kq9.a((Activity) context, "CXPhotoViewComponent_initComponentHostView", null);
        }
        PageViewItemLayout pageViewItemLayout = new PageViewItemLayout(context);
        CXImgModel cXImgModel = this.mImgModel;
        String str = cXImgModel.imgUrl;
        ImageView.ScaleType scaleTypeByResize = getScaleTypeByResize(cXImgModel.resize);
        CXImgModel cXImgModel2 = this.mImgModel;
        PhotoView initPhotoView = pageViewItemLayout.initPhotoView(str, scaleTypeByResize, cXImgModel2.waterMarkText, cXImgModel2.waterMarkIconUrl, this, this);
        this.mPhotoView = initPhotoView;
        initPhotoView.setOnClickListener(new a());
        return pageViewItemLayout;
    }

    @Override // tb.ztk
    public void onScaleChange(float f, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("945cef3e", new Object[]{this, new Float(f), new Float(f2), new Float(f3)});
        } else if (f <= SCALE_MIN || f >= SCALE_MAX) {
            if (!this.isScaleChange) {
                this.isScaleChange = true;
                fireEvent("scalechange");
            }
        } else if (this.isScaleChange) {
            this.isScaleChange = false;
            fireEvent("scalerecover");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
        if (r6.equals("cover") == false) goto L_0x002c;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.widget.ImageView.ScaleType getScaleTypeByResize(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.interactive_common.component.CXPhotoViewComponent.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0018
            java.lang.String r4 = "1ae55066"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r5
            r2[r0] = r6
            java.lang.Object r6 = r3.ipc$dispatch(r4, r2)
            android.widget.ImageView$ScaleType r6 = (android.widget.ImageView.ScaleType) r6
            return r6
        L_0x0018:
            boolean r3 = android.text.TextUtils.isEmpty(r6)
            if (r3 == 0) goto L_0x0021
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.FIT_XY
            return r6
        L_0x0021:
            r6.hashCode()
            r3 = -1
            int r4 = r6.hashCode()
            switch(r4) {
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
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0037
            goto L_0x002c
        L_0x0037:
            r0 = 2
            goto L_0x004d
        L_0x0039:
            java.lang.String r1 = "cover"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x004d
            goto L_0x002c
        L_0x0042:
            java.lang.String r0 = "stretch"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x004c
            goto L_0x002c
        L_0x004c:
            r0 = 0
        L_0x004d:
            switch(r0) {
                case 0: goto L_0x0059;
                case 1: goto L_0x0056;
                case 2: goto L_0x0053;
                default: goto L_0x0050;
            }
        L_0x0050:
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.FIT_XY
            return r6
        L_0x0053:
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.CENTER_INSIDE
            return r6
        L_0x0056:
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.FIT_CENTER
            return r6
        L_0x0059:
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.FIT_XY
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.interactive_common.component.CXPhotoViewComponent.getScaleTypeByResize(java.lang.String):android.widget.ImageView$ScaleType");
    }

    public CXPhotoViewComponent(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, int i, BasicComponentData basicComponentData) {
        super(wXSDKInstance, wXVContainer, i, basicComponentData);
        constructorFlowStatisticsTrack();
        initComponentData(basicComponentData);
    }
}
