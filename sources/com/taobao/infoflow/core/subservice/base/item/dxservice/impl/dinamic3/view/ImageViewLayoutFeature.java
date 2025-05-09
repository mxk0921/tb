package com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.render.InfoFlowDxUserContext;
import com.taobao.infoflow.protocol.subservice.biz.IPrefetchImageService;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.uikit.feature.callback.LayoutCallback;
import com.taobao.uikit.feature.features.AbsFeature;
import tb.cfc;
import tb.fl6;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ImageViewLayoutFeature extends AbsFeature<ImageView> implements LayoutCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private DXWidgetNode mImageWidgetNode;

    static {
        t2o.a(486539415);
    }

    public static /* synthetic */ Object ipc$super(ImageViewLayoutFeature imageViewLayoutFeature, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/view/ImageViewLayoutFeature");
    }

    private void onLayout(int i, int i2) {
        cfc infoFlowContext;
        IPrefetchImageService iPrefetchImageService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a24fde50", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (this.mImageWidgetNode != null && (getHost() instanceof TUrlImageView) && this.mImageWidgetNode.getDXRuntimeContext() != null && this.mImageWidgetNode.getDXRuntimeContext().i() != null && this.mImageWidgetNode.getDataParsersExprNode() != null && this.mImageWidgetNode.getDXRuntimeContext().p() != null) {
            fl6 S = this.mImageWidgetNode.getDXRuntimeContext().S();
            if ((S instanceof InfoFlowDxUserContext) && (infoFlowContext = ((InfoFlowDxUserContext) S).getInfoFlowContext()) != null && (iPrefetchImageService = (IPrefetchImageService) infoFlowContext.a(IPrefetchImageService.class)) != null) {
                String string = this.mImageWidgetNode.getDXRuntimeContext().i().getString("sectionBizCode");
                DXTemplateItem p = this.mImageWidgetNode.getDXRuntimeContext().p();
                iPrefetchImageService.saveImageWidth(string, p.e(), String.valueOf(p.h()), this.mImageWidgetNode.getDataParsersExprNode().get(3520785955321526846L), i, i2, ((TUrlImageView) getHost()).getImageUrl());
            }
        }
    }

    @Override // com.taobao.uikit.feature.callback.LayoutCallback
    public void afterOnLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c4dfb28", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        int width = getHost().getWidth();
        int height = getHost().getHeight();
        if (width > 0 && height > 0) {
            onLayout(width, height);
        }
    }

    @Override // com.taobao.uikit.feature.callback.LayoutCallback
    public void beforeOnLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed76dbe5", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
    }

    @Override // com.taobao.uikit.feature.features.AbsFeature
    public void constructor(Context context, AttributeSet attributeSet, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8928939c", new Object[]{this, context, attributeSet, new Integer(i)});
        }
    }

    public void setImageNode(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("529800ad", new Object[]{this, dXWidgetNode});
        } else {
            this.mImageWidgetNode = dXWidgetNode;
        }
    }
}
