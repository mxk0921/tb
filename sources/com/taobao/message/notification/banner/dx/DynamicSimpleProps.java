package com.taobao.message.notification.banner.dx;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.ckf;
import tb.f7l;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J3\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/taobao/message/notification/banner/dx/DynamicSimpleProps;", "", "mTemplateId", "", "mDXTemplateVO", "Lcom/taobao/message/notification/banner/dx/DXTemplateVO;", "mCtx", "Landroid/content/Context;", "mOpenPoint", "Lcom/taobao/message/notification/banner/dx/DynamicSimpleOpenPoint;", "(ILcom/taobao/message/notification/banner/dx/DXTemplateVO;Landroid/content/Context;Lcom/taobao/message/notification/banner/dx/DynamicSimpleOpenPoint;)V", "getMCtx", "()Landroid/content/Context;", "getMDXTemplateVO", "()Lcom/taobao/message/notification/banner/dx/DXTemplateVO;", "getMOpenPoint", "()Lcom/taobao/message/notification/banner/dx/DynamicSimpleOpenPoint;", "getMTemplateId", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "notification_sdk_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class DynamicSimpleProps {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Context mCtx;
    private final DXTemplateVO mDXTemplateVO;
    private final DynamicSimpleOpenPoint mOpenPoint;
    private final int mTemplateId;

    static {
        t2o.a(610271255);
    }

    public DynamicSimpleProps(int i, DXTemplateVO dXTemplateVO, Context context, DynamicSimpleOpenPoint dynamicSimpleOpenPoint) {
        ckf.h(dXTemplateVO, "mDXTemplateVO");
        ckf.h(context, "mCtx");
        this.mTemplateId = i;
        this.mDXTemplateVO = dXTemplateVO;
        this.mCtx = context;
        this.mOpenPoint = dynamicSimpleOpenPoint;
    }

    public static /* synthetic */ DynamicSimpleProps copy$default(DynamicSimpleProps dynamicSimpleProps, int i, DXTemplateVO dXTemplateVO, Context context, DynamicSimpleOpenPoint dynamicSimpleOpenPoint, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DynamicSimpleProps) ipChange.ipc$dispatch("4a9ead05", new Object[]{dynamicSimpleProps, new Integer(i), dXTemplateVO, context, dynamicSimpleOpenPoint, new Integer(i2), obj});
        }
        if ((i2 & 1) != 0) {
            i = dynamicSimpleProps.mTemplateId;
        }
        if ((i2 & 2) != 0) {
            dXTemplateVO = dynamicSimpleProps.mDXTemplateVO;
        }
        if ((i2 & 4) != 0) {
            context = dynamicSimpleProps.mCtx;
        }
        if ((i2 & 8) != 0) {
            dynamicSimpleOpenPoint = dynamicSimpleProps.mOpenPoint;
        }
        return dynamicSimpleProps.copy(i, dXTemplateVO, context, dynamicSimpleOpenPoint);
    }

    public final int component1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4f047d4e", new Object[]{this})).intValue();
        }
        return this.mTemplateId;
    }

    public final DXTemplateVO component2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateVO) ipChange.ipc$dispatch("8b453781", new Object[]{this});
        }
        return this.mDXTemplateVO;
    }

    public final Context component3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("48750455", new Object[]{this});
        }
        return this.mCtx;
    }

    public final DynamicSimpleOpenPoint component4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DynamicSimpleOpenPoint) ipChange.ipc$dispatch("475e30f1", new Object[]{this});
        }
        return this.mOpenPoint;
    }

    public final DynamicSimpleProps copy(int i, DXTemplateVO dXTemplateVO, Context context, DynamicSimpleOpenPoint dynamicSimpleOpenPoint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DynamicSimpleProps) ipChange.ipc$dispatch("7954deb2", new Object[]{this, new Integer(i), dXTemplateVO, context, dynamicSimpleOpenPoint});
        }
        ckf.h(dXTemplateVO, "mDXTemplateVO");
        ckf.h(context, "mCtx");
        return new DynamicSimpleProps(i, dXTemplateVO, context, dynamicSimpleOpenPoint);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof DynamicSimpleProps) {
                DynamicSimpleProps dynamicSimpleProps = (DynamicSimpleProps) obj;
                if (this.mTemplateId != dynamicSimpleProps.mTemplateId || !ckf.b(this.mDXTemplateVO, dynamicSimpleProps.mDXTemplateVO) || !ckf.b(this.mCtx, dynamicSimpleProps.mCtx) || !ckf.b(this.mOpenPoint, dynamicSimpleProps.mOpenPoint)) {
                }
            }
            return false;
        }
        return true;
    }

    public final Context getMCtx() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("6dedb56f", new Object[]{this});
        }
        return this.mCtx;
    }

    public final DXTemplateVO getMDXTemplateVO() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateVO) ipChange.ipc$dispatch("5b21cb18", new Object[]{this});
        }
        return this.mDXTemplateVO;
    }

    public final DynamicSimpleOpenPoint getMOpenPoint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DynamicSimpleOpenPoint) ipChange.ipc$dispatch("73cff359", new Object[]{this});
        }
        return this.mOpenPoint;
    }

    public final int getMTemplateId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("77e75cc6", new Object[]{this})).intValue();
        }
        return this.mTemplateId;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int i4 = this.mTemplateId * 31;
        DXTemplateVO dXTemplateVO = this.mDXTemplateVO;
        if (dXTemplateVO != null) {
            i = dXTemplateVO.hashCode();
        } else {
            i = 0;
        }
        int i5 = (i4 + i) * 31;
        Context context = this.mCtx;
        if (context != null) {
            i2 = context.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        DynamicSimpleOpenPoint dynamicSimpleOpenPoint = this.mOpenPoint;
        if (dynamicSimpleOpenPoint != null) {
            i3 = dynamicSimpleOpenPoint.hashCode();
        }
        return i6 + i3;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "DynamicSimpleProps(mTemplateId=" + this.mTemplateId + ", mDXTemplateVO=" + this.mDXTemplateVO + ", mCtx=" + this.mCtx + ", mOpenPoint=" + this.mOpenPoint + f7l.BRACKET_END_STR;
    }
}
