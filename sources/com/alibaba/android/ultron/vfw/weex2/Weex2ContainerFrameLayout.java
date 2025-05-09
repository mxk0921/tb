package com.alibaba.android.ultron.vfw.weex2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.common.MUSEventTarget;
import java.util.ArrayList;
import java.util.Map;
import tb.fce;
import tb.pce;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class Weex2ContainerFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String EVENT_VIEW_APPEAR = "viewAppear";
    private static final String EVENT_VIEW_DISAPPEAR = "viewDisappear";
    private static final String KEY_GESTURE_STATE = "state";
    private static final ArrayList<MotionEvent> mEvents = new ArrayList<>();
    private com.taobao.android.weex_framework.a mMUSInstance;
    private fce mWeex2EventDispatch;
    private boolean mDispatchEventState = false;
    private String mGestureState = "default";
    private boolean enableNestedScroll = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements pce {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.pce
        public void a(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("267b7fce", new Object[]{this, map});
            } else if (map != null && map.get("state") != null) {
                if (((Boolean) map.get("state")).booleanValue()) {
                    Weex2ContainerFrameLayout.access$002(Weex2ContainerFrameLayout.this, "receive");
                    return;
                }
                Weex2ContainerFrameLayout.access$002(Weex2ContainerFrameLayout.this, "reject");
                if (Weex2ContainerFrameLayout.access$100(Weex2ContainerFrameLayout.this) != null) {
                    Weex2ContainerFrameLayout.access$100(Weex2ContainerFrameLayout.this).a(Weex2ContainerFrameLayout.access$200());
                    Weex2ContainerFrameLayout.access$200().clear();
                }
            }
        }
    }

    static {
        t2o.a(157286799);
    }

    public Weex2ContainerFrameLayout(Context context) {
        super(context);
    }

    public static /* synthetic */ String access$002(Weex2ContainerFrameLayout weex2ContainerFrameLayout, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("abbd5995", new Object[]{weex2ContainerFrameLayout, str});
        }
        weex2ContainerFrameLayout.mGestureState = str;
        return str;
    }

    public static /* synthetic */ fce access$100(Weex2ContainerFrameLayout weex2ContainerFrameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fce) ipChange.ipc$dispatch("d9136379", new Object[]{weex2ContainerFrameLayout});
        }
        return weex2ContainerFrameLayout.mWeex2EventDispatch;
    }

    public static /* synthetic */ ArrayList access$200() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("6033ab53", new Object[0]);
        }
        return mEvents;
    }

    public static /* synthetic */ Object ipc$super(Weex2ContainerFrameLayout weex2ContainerFrameLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -461309207) {
            super.onWindowVisibilityChanged(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/ultron/vfw/weex2/Weex2ContainerFrameLayout");
        }
    }

    public MUSDKInstance getMUSInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSDKInstance) ipChange.ipc$dispatch("4b649f77", new Object[]{this});
        }
        com.taobao.android.weex_framework.a aVar = this.mMUSInstance;
        if (aVar instanceof MUSDKInstance) {
            return (MUSDKInstance) aVar;
        }
        return null;
    }

    public void initWeex2Instance(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f30ebb60", new Object[]{this, aVar});
            return;
        }
        this.mMUSInstance = aVar;
        aVar.setGestureEventListener(new a());
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e480fae9", new Object[]{this, new Integer(i)});
            return;
        }
        super.onWindowVisibilityChanged(i);
        com.taobao.android.weex_framework.a aVar = this.mMUSInstance;
        if (aVar != null) {
            if (i == 8 || i == 4) {
                aVar.dispatchEvent(MUSEventTarget.MUS_DOCUMENT_TARGET, EVENT_VIEW_DISAPPEAR, null);
            } else {
                aVar.dispatchEvent(MUSEventTarget.MUS_DOCUMENT_TARGET, EVENT_VIEW_APPEAR, null);
            }
        }
    }

    public void setDispatchEventState(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b6bda5a", new Object[]{this, iDMComponent});
            return;
        }
        JSONObject fields = iDMComponent.getFields();
        if (fields != null && fields.containsKey("config")) {
            this.mDispatchEventState = Boolean.parseBoolean(fields.getJSONObject("config").getString("android_dispatchEvent"));
        }
    }

    public void setEnableNestedScroll(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbb5a504", new Object[]{this, new Boolean(z)});
        } else {
            this.enableNestedScroll = z;
        }
    }

    public void setWeex2EventDispatch(fce fceVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97b343ef", new Object[]{this, fceVar});
        } else {
            this.mWeex2EventDispatch = fceVar;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.enableNestedScroll) {
            return false;
        }
        if (!this.mDispatchEventState || this.mWeex2EventDispatch == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            mEvents.clear();
            this.mGestureState = "default";
        }
        ArrayList<MotionEvent> arrayList = mEvents;
        arrayList.add(MotionEvent.obtain(motionEvent));
        if (this.mGestureState.equals("receive")) {
            arrayList.clear();
            return super.dispatchTouchEvent(motionEvent);
        } else if (!this.mGestureState.equals("reject")) {
            return super.dispatchTouchEvent(motionEvent);
        } else {
            this.mWeex2EventDispatch.a(arrayList);
            arrayList.clear();
            return false;
        }
    }

    public Weex2ContainerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Weex2ContainerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
