package com.taobao.message.sp.category.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.message.chatv2.viewcenter.ViewCenterUIEventManager;
import com.taobao.message.lab.comfrm.core.Event;
import com.taobao.message.lab.comfrm.core.ViewObject;
import com.taobao.message.lab.comfrm.core.WrapperEvent;
import com.taobao.statistic.CT;
import com.taobao.statistic.TBS;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.t2o;
import tb.upx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class StickFrameLayout extends FrameLayout implements ViewCenterUIEventManager.IUIEvent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean isStick;

    static {
        t2o.a(550502437);
        t2o.a(552599624);
    }

    public StickFrameLayout(Context context) {
        super(context);
        init();
    }

    private void addParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d2e0a8e", new Object[]{this});
            return;
        }
        DXRootView dxRootView = getDxRootView(this);
        if (dxRootView instanceof DXRootView) {
            dxRootView.getData();
            dxRootView.getChildAt(0);
        }
    }

    private DXRootView getDxRootView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("1c179e1d", new Object[]{this, view});
        }
        if (view instanceof DXRootView) {
            return (DXRootView) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.getChildCount() == 0) {
            return null;
        }
        return getDxRootView(viewGroup.getChildAt(0));
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            ViewCenterUIEventManager.getInstance().addEventListener(this);
        }
    }

    public static /* synthetic */ Object ipc$super(StickFrameLayout stickFrameLayout, String str, Object... objArr) {
        if (str.hashCode() == -407533570) {
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/message/sp/category/widget/StickFrameLayout");
    }

    public static String[] toArgs(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("f9395d75", new Object[]{map});
        }
        ArrayList arrayList = new ArrayList();
        if (map != null && map.size() > 0) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    arrayList.add(entry.getKey().concat("=").concat(entry.getValue()));
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public void onDispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3efb0bc7", new Object[]{this});
        } else {
            ViewCenterUIEventManager.getInstance().removeEventListener(this);
        }
    }

    @Override // com.taobao.message.chatv2.viewcenter.ViewCenterUIEventManager.IUIEvent
    public void onEvent(Event event, int i) {
        ViewObject viewObject;
        JSONArray jSONArray;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("906ddcce", new Object[]{this, event, new Integer(i)});
        } else if (this.isStick && event.getName().equals(upx.CLICK_ITEM) && (viewObject = ((WrapperEvent) event).getViewObject()) != null) {
            JSONObject jSONObject2 = (JSONObject) viewObject.data;
            String string = jSONObject2.getString("templateId");
            if (TextUtils.equals(jSONObject2.getJSONObject("props").getString("tag"), "v3_stickyHeader") && (jSONArray = jSONObject2.getJSONArray("list")) != null && (jSONObject = jSONArray.getJSONObject(i)) != null) {
                String string2 = jSONObject.getString("code");
                String string3 = jSONObject.getString("tipNumber");
                String string4 = jSONObject.getString("tipType");
                HashMap hashMap = new HashMap();
                hashMap.put("code", string2);
                hashMap.put("templateId", string);
                hashMap.put("tipNumber", string3);
                hashMap.put("tipType", string4);
                TBS.Adv.ctrlClicked("Page_MsgCenter", CT.Button, "TBMSGPlatform_StickHead_Click", toArgs(hashMap));
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setStick(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1fbbe9f", new Object[]{this, new Boolean(z)});
        } else {
            this.isStick = z;
        }
    }

    public void setStickData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6d4c6a9", new Object[]{this, str});
        } else {
            setTag(R.id.msg_tab_stick_head, str);
        }
    }

    public StickFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public StickFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
