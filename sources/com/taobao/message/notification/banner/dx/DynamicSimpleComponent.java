package com.taobao.message.notification.banner.dx;

import android.view.View;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.tao.log.TLog;
import com.taobao.unit.center.mdc.MsgDinamicxEngine;
import java.util.ArrayList;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.k06;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u000fR\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/taobao/message/notification/banner/dx/DynamicSimpleComponent;", "", "Lcom/taobao/message/notification/banner/dx/DynamicSimpleProps;", "props", "<init>", "(Lcom/taobao/message/notification/banner/dx/DynamicSimpleProps;)V", "Lcom/taobao/android/dinamicx/template/download/DXTemplateItem;", AdvanceSetting.NETWORK_TYPE, "Ltb/xhv;", "downloadTemplate", "(Lcom/taobao/android/dinamicx/template/download/DXTemplateItem;)V", "Landroid/view/View;", "getUIView", "()Landroid/view/View;", "mount", "()V", "", "render", "()Z", "unmount", "Lcom/taobao/android/dinamicx/DinamicXEngine;", "mEngine", "Lcom/taobao/android/dinamicx/DinamicXEngine;", "mResultDXTemplateItem", "Lcom/taobao/android/dinamicx/template/download/DXTemplateItem;", "Lcom/taobao/android/dinamicx/DXRootView;", "mView", "Lcom/taobao/android/dinamicx/DXRootView;", "Lcom/taobao/message/notification/banner/dx/DynamicSimpleProps;", "getProps", "()Lcom/taobao/message/notification/banner/dx/DynamicSimpleProps;", "Companion", "notification_sdk_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class DynamicSimpleComponent {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final Companion Companion = new Companion(null);
    public static final String TAG = "cbq@inAppPush";
    private DinamicXEngine mEngine;
    private DXTemplateItem mResultDXTemplateItem;
    private DXRootView mView;
    private final DynamicSimpleProps props;

    /* compiled from: Taobao */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/message/notification/banner/dx/DynamicSimpleComponent$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "notification_sdk_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class Companion {
        static {
            t2o.a(610271252);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(610271251);
    }

    public DynamicSimpleComponent(DynamicSimpleProps dynamicSimpleProps) {
        ckf.h(dynamicSimpleProps, "props");
        this.props = dynamicSimpleProps;
    }

    public final DynamicSimpleProps getProps() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DynamicSimpleProps) ipChange.ipc$dispatch("28b2dba4", new Object[]{this});
        }
        return this.props;
    }

    public final View getUIView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7092d1f8", new Object[]{this});
        }
        return this.mView;
    }

    public final void unmount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f4059a7", new Object[]{this});
        }
    }

    private final void downloadTemplate(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fda96292", new Object[]{this, dXTemplateItem});
            return;
        }
        TLog.loge(TAG, "fetchTemplate fail: " + this.props.getMTemplateId() + ", start download template: " + dXTemplateItem.toString());
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(dXTemplateItem);
        DinamicXEngine dinamicXEngine = this.mEngine;
        if (dinamicXEngine != null) {
            dinamicXEngine.p(arrayList);
        } else {
            ckf.y("mEngine");
            throw null;
        }
    }

    public final void mount() {
        xhv xhvVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b2c0c20", new Object[]{this});
            return;
        }
        DXEngineConfig.b bVar = new DXEngineConfig.b("alimp_message");
        bVar.f0(MsgDinamicxEngine.DX_SUB_BIZTYPE_MESSAGE_CHAT_COMPAT);
        try {
            bVar.T(true);
        } catch (Throwable unused) {
        }
        DinamicXEngine dinamicXEngine = new DinamicXEngine(bVar.F());
        this.mEngine = dinamicXEngine;
        dinamicXEngine.W0(k06.a("mpTapV2"), TapEventHandlerProxy.INSTANCE);
        DXTemplateItem mDXTemplateItem = this.props.getMDXTemplateVO().getMDXTemplateItem();
        if (mDXTemplateItem != null) {
            DinamicXEngine dinamicXEngine2 = this.mEngine;
            xhv xhvVar2 = null;
            if (dinamicXEngine2 != null) {
                DXTemplateItem u = dinamicXEngine2.u(mDXTemplateItem);
                this.mResultDXTemplateItem = u;
                if (u == null) {
                    downloadTemplate(mDXTemplateItem);
                    xhvVar2 = xhv.INSTANCE;
                } else if (u != null) {
                    if (u.b != mDXTemplateItem.b) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.props.getMTemplateId());
                        sb.append(" version diff is: ");
                        DXTemplateItem dXTemplateItem = this.mResultDXTemplateItem;
                        if (dXTemplateItem != null) {
                            sb.append(dXTemplateItem.b);
                            sb.append(" != ");
                            sb.append(mDXTemplateItem.b);
                            TLog.loge(TAG, sb.toString());
                            downloadTemplate(mDXTemplateItem);
                        } else {
                            ckf.s();
                            throw null;
                        }
                    }
                    TLog.loge(TAG, "fetchTemplate success: " + this.props.getMTemplateId());
                    if (this.mResultDXTemplateItem != null) {
                        DynamicSimpleOpenPoint mOpenPoint = this.props.getMOpenPoint();
                        if (mOpenPoint != null) {
                            mOpenPoint.onBeforeCreateView();
                        }
                        DinamicXEngine dinamicXEngine3 = this.mEngine;
                        if (dinamicXEngine3 != null) {
                            this.mView = dinamicXEngine3.o(this.props.getMCtx(), this.mResultDXTemplateItem).f7291a;
                            DynamicSimpleOpenPoint mOpenPoint2 = this.props.getMOpenPoint();
                            if (mOpenPoint2 != null) {
                                mOpenPoint2.onAfterCreateView(this.mView);
                                xhvVar = xhv.INSTANCE;
                            } else {
                                xhvVar = null;
                            }
                            if (xhvVar != null) {
                                TLog.loge(TAG, "dinamicX render failed because mResultDXTemplateItem is null: " + this.props.getMTemplateId() + ' ');
                                xhvVar2 = xhv.INSTANCE;
                            }
                        } else {
                            ckf.y("mEngine");
                            throw null;
                        }
                    }
                } else {
                    ckf.s();
                    throw null;
                }
                if (xhvVar2 != null) {
                    TLog.loge(TAG, "mDXTemplateItem is null!: " + this.props.getMTemplateId());
                    return;
                }
                return;
            }
            ckf.y("mEngine");
            throw null;
        }
    }

    public final boolean render() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("471a0b21", new Object[]{this})).booleanValue();
        }
        DynamicSimpleOpenPoint mOpenPoint = this.props.getMOpenPoint();
        if (mOpenPoint != null) {
            mOpenPoint.onBeforeRender();
        }
        DXRootView dXRootView = this.mView;
        if (dXRootView != null) {
            DinamicXEngine dinamicXEngine = this.mEngine;
            if (dinamicXEngine != null) {
                DXResult<DXRootView> j1 = dinamicXEngine.j1(dXRootView, this.props.getMDXTemplateVO().getMData());
                if (j1.f7291a == null || this.mView == null) {
                    StringBuilder sb = new StringBuilder("dinamicX render failed: ");
                    sb.append(this.props.getMTemplateId());
                    sb.append(": ");
                    if (j1.d()) {
                        str = j1.a().toString();
                    } else {
                        str = "";
                    }
                    sb.append(str);
                    TLog.loge(TAG, sb.toString());
                    xhv xhvVar = xhv.INSTANCE;
                    TLog.loge(TAG, "dinamicX render failed because mView is null: " + this.props.getMTemplateId() + ' ');
                } else {
                    TLog.loge(TAG, "dinamicX render success: " + this.props.getMTemplateId());
                    DynamicSimpleOpenPoint mOpenPoint2 = this.props.getMOpenPoint();
                    if (mOpenPoint2 != null) {
                        mOpenPoint2.onAfterRender(0);
                    }
                    return true;
                }
            } else {
                ckf.y("mEngine");
                throw null;
            }
        }
        DynamicSimpleOpenPoint mOpenPoint3 = this.props.getMOpenPoint();
        if (mOpenPoint3 != null) {
            mOpenPoint3.onAfterRender(1);
        }
        return false;
    }
}
