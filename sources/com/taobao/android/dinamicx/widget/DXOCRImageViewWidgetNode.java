package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.qub;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXOCRImageViewWidgetNode extends DXImageWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXOCRIMAGEVIEW_OCRIMAGEVIEW = -2187661613928500626L;

    /* renamed from: a  reason: collision with root package name */
    public String f7375a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements qub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.qub
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
            }
            return new DXOCRImageViewWidgetNode();
        }
    }

    public DXOCRImageViewWidgetNode() {
        setAccessibility(1);
    }

    public static /* synthetic */ Object ipc$super(DXOCRImageViewWidgetNode dXOCRImageViewWidgetNode, String str, Object... objArr) {
        if (str.hashCode() == -303753557) {
            super.onRenderView((Context) objArr[0], (View) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/DXOCRImageViewWidgetNode");
    }

    public static /* synthetic */ String t(DXOCRImageViewWidgetNode dXOCRImageViewWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f3b253ca", new Object[]{dXOCRImageViewWidgetNode});
        }
        return dXOCRImageViewWidgetNode.f7375a;
    }

    public static /* synthetic */ String u(DXOCRImageViewWidgetNode dXOCRImageViewWidgetNode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("283197c2", new Object[]{dXOCRImageViewWidgetNode, str});
        }
        dXOCRImageViewWidgetNode.f7375a = str;
        return str;
    }

    public static /* synthetic */ String v(DXOCRImageViewWidgetNode dXOCRImageViewWidgetNode, MtopResponse mtopResponse, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("74d3bb5c", new Object[]{dXOCRImageViewWidgetNode, mtopResponse, str});
        }
        return dXOCRImageViewWidgetNode.w(mtopResponse, str);
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode, tb.qub
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj});
        }
        return new DXOCRImageViewWidgetNode();
    }

    @Override // com.taobao.android.dinamicx.widget.DXImageWidgetNode, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (view != null && x(context)) {
            y(view);
        }
    }

    public final String w(MtopResponse mtopResponse, String str) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5853de64", new Object[]{this, mtopResponse, str});
        }
        JSONObject parseObject = JSON.parseObject(new String(mtopResponse.getBytedata()));
        if (parseObject == null || (jSONObject = parseObject.getJSONObject("data")) == null || (jSONObject2 = jSONObject.getJSONObject("data")) == null || (jSONObject3 = jSONObject2.getJSONObject(str)) == null) {
            return "图片识别失败";
        }
        String string = jSONObject3.getString("content");
        return TextUtils.isEmpty(string) ? "图片识别失败" : string;
    }

    public final boolean x(Context context) throws RuntimeException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbdd879e", new Object[]{this, context})).booleanValue();
        }
        if (context == null) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        boolean isEnabled = accessibilityManager.isEnabled();
        boolean isTouchExplorationEnabled = accessibilityManager.isTouchExplorationEnabled();
        if (!isEnabled || !isTouchExplorationEnabled) {
            return false;
        }
        return true;
    }

    public final void y(final View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("902e8e84", new Object[]{this, view});
        } else if (!TextUtils.isEmpty(this.f7375a)) {
            view.setContentDescription(this.f7375a);
        } else {
            JSONObject jSONObject = new JSONObject();
            final String imageUrl = getImageUrl();
            if (TextUtils.isEmpty(imageUrl)) {
                view.setContentDescription("图片识别失败");
                return;
            }
            jSONObject.put("imgList", (Object) ("[\"" + imageUrl + "\"]"));
            MtopRequest mtopRequest = new MtopRequest();
            mtopRequest.setApiName("mtop.taobao.ocr.image.check");
            mtopRequest.setVersion("1.2");
            mtopRequest.setData(jSONObject.toJSONString());
            MtopBusiness build = MtopBusiness.build(mtopRequest);
            build.useWua().reqMethod(MethodEnum.POST).addListener((MtopListener) new IRemoteBaseListener() { // from class: com.taobao.android.dinamicx.widget.DXOCRImageViewWidgetNode.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    view.setContentDescription("图片识别失败");
                    DXOCRImageViewWidgetNode.u(DXOCRImageViewWidgetNode.this, "图片识别失败");
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    } else if (mtopResponse == null || mtopResponse.getBytedata() == null) {
                        view.setContentDescription("图片识别失败");
                        DXOCRImageViewWidgetNode.u(DXOCRImageViewWidgetNode.this, "图片识别失败");
                    } else {
                        DXOCRImageViewWidgetNode dXOCRImageViewWidgetNode = DXOCRImageViewWidgetNode.this;
                        DXOCRImageViewWidgetNode.u(dXOCRImageViewWidgetNode, DXOCRImageViewWidgetNode.v(dXOCRImageViewWidgetNode, mtopResponse, imageUrl));
                        view.setContentDescription(DXOCRImageViewWidgetNode.t(DXOCRImageViewWidgetNode.this));
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    view.setContentDescription("图片识别失败");
                    DXOCRImageViewWidgetNode.u(DXOCRImageViewWidgetNode.this, "图片识别失败");
                }
            });
            build.startRequest();
        }
    }
}
