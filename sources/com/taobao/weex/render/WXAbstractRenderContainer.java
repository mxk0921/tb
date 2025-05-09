package com.taobao.weex.render;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;
import java.lang.ref.WeakReference;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class WXAbstractRenderContainer extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean mHasConsumeEvent = false;
    public WeakReference<WXSDKInstance> mSDKInstance;

    static {
        t2o.a(985661641);
    }

    public WXAbstractRenderContainer(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(WXAbstractRenderContainer wXAbstractRenderContainer, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 1389530587) {
            super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        } else if (hashCode == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/weex/render/WXAbstractRenderContainer");
        }
    }

    public void createInstanceRenderView(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f825077d", new Object[]{this, str});
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        this.mHasConsumeEvent = true;
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean hasConsumeEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a0f5c43", new Object[]{this})).booleanValue();
        }
        return this.mHasConsumeEvent;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        WXSDKInstance wXSDKInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        WeakReference<WXSDKInstance> weakReference = this.mSDKInstance;
        if (weakReference != null && (wXSDKInstance = weakReference.get()) != null) {
            wXSDKInstance.setSize(i, i2);
        }
    }

    public void setSDKInstance(WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd5aec3a", new Object[]{this, wXSDKInstance});
        } else {
            this.mSDKInstance = new WeakReference<>(wXSDKInstance);
        }
    }

    public WXAbstractRenderContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WXAbstractRenderContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public WXAbstractRenderContainer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
