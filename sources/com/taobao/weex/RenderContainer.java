package com.taobao.weex;

import android.content.Context;
import android.util.AttributeSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.e;
import com.taobao.weex.render.WXAbstractRenderContainer;
import java.lang.ref.WeakReference;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class RenderContainer extends WXAbstractRenderContainer implements e.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private e mFrameRateControl = new e(this);

    static {
        t2o.a(985661448);
        t2o.a(985661495);
    }

    public RenderContainer(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(RenderContainer renderContainer, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 327977732) {
            super.dispatchWindowVisibilityChanged(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/weex/RenderContainer");
        }
    }

    @Override // com.taobao.weex.e.c
    public void OnVSync() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29304cf9", new Object[]{this});
            return;
        }
        WeakReference<WXSDKInstance> weakReference = this.mSDKInstance;
        if (weakReference != null && weakReference.get() != null) {
            this.mSDKInstance.get().OnVSync();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchWindowVisibilityChanged(int i) {
        e eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("138c8b04", new Object[]{this, new Integer(i)});
            return;
        }
        super.dispatchWindowVisibilityChanged(i);
        if (i == 8) {
            e eVar2 = this.mFrameRateControl;
            if (eVar2 != null) {
                eVar2.f();
            }
        } else if (i == 0 && (eVar = this.mFrameRateControl) != null) {
            eVar.e();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        e eVar = this.mFrameRateControl;
        if (eVar != null) {
            eVar.e();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        e eVar = this.mFrameRateControl;
        if (eVar != null) {
            eVar.f();
        }
    }

    public RenderContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RenderContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public RenderContainer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
