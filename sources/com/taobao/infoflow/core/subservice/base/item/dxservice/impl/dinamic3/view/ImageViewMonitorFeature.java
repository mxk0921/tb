package com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.render.InfoFlowDxUserContext;
import com.taobao.infoflow.protocol.subservice.biz.ImageMonitorService;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.uikit.feature.callback.CanvasCallback;
import com.taobao.uikit.feature.features.AbsFeature;
import tb.cfc;
import tb.fl6;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ImageViewMonitorFeature extends AbsFeature<ImageView> implements CanvasCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private DXWidgetNode mImageWidgetNode;

    static {
        t2o.a(486539416);
    }

    private ImageMonitorService getImageMonitorService() {
        cfc infoFlowContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageMonitorService) ipChange.ipc$dispatch("fc251441", new Object[]{this});
        }
        if (this.mImageWidgetNode == null || !(getHost() instanceof TUrlImageView) || this.mImageWidgetNode.getDXRuntimeContext() == null || this.mImageWidgetNode.getDXRuntimeContext().i() == null || this.mImageWidgetNode.getDataParsersExprNode() == null || this.mImageWidgetNode.getDXRuntimeContext().p() == null || this.mImageWidgetNode.getDXRuntimeContext().p() == null) {
            return null;
        }
        fl6 S = this.mImageWidgetNode.getDXRuntimeContext().S();
        if ((S instanceof InfoFlowDxUserContext) && (infoFlowContext = ((InfoFlowDxUserContext) S).getInfoFlowContext()) != null) {
            return (ImageMonitorService) infoFlowContext.a(ImageMonitorService.class);
        }
        return null;
    }

    public static /* synthetic */ Object ipc$super(ImageViewMonitorFeature imageViewMonitorFeature, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/core/subservice/base/item/dxservice/impl/dinamic3/view/ImageViewMonitorFeature");
    }

    public static boolean isEnabled(DXWidgetNode dXWidgetNode, String str) {
        cfc infoFlowContext;
        ImageMonitorService imageMonitorService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25740abf", new Object[]{dXWidgetNode, str})).booleanValue();
        }
        fl6 S = dXWidgetNode.getDXRuntimeContext().S();
        if ((S instanceof InfoFlowDxUserContext) && (infoFlowContext = ((InfoFlowDxUserContext) S).getInfoFlowContext()) != null && (imageMonitorService = (ImageMonitorService) infoFlowContext.a(ImageMonitorService.class)) != null && imageMonitorService.isStarted() && imageMonitorService.isNeedMonitor(str)) {
            return true;
        }
        return false;
    }

    private void onViewDraw() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("323a250f", new Object[]{this});
            return;
        }
        ImageMonitorService imageMonitorService = getImageMonitorService();
        if (imageMonitorService != null) {
            imageMonitorService.onImageViewDraw(((TUrlImageView) getHost()).getImageUrl());
        }
    }

    @Override // com.taobao.uikit.feature.callback.CanvasCallback
    public void afterDispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84822824", new Object[]{this, canvas});
        }
    }

    @Override // com.taobao.uikit.feature.callback.CanvasCallback
    public void afterDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f42b97e", new Object[]{this, canvas});
        }
    }

    @Override // com.taobao.uikit.feature.callback.CanvasCallback
    public void afterOnDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99d9525f", new Object[]{this, canvas});
        } else {
            onViewDraw();
        }
    }

    @Override // com.taobao.uikit.feature.callback.CanvasCallback
    public void beforeDispatchDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8b3e1e1", new Object[]{this, canvas});
        }
    }

    @Override // com.taobao.uikit.feature.callback.CanvasCallback
    public void beforeDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6014803b", new Object[]{this, canvas});
        }
    }

    @Override // com.taobao.uikit.feature.callback.CanvasCallback
    public void beforeOnDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd545ddc", new Object[]{this, canvas});
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
